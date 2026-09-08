#!/usr/bin/env bash

set -euo pipefail

script_dir="$(CDPATH='' cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
cd "$script_dir"

if [[ -n "${XDG_DATA_HOME:-}" ]]; then
    data_home="$XDG_DATA_HOME"
elif [[ -n "${HOME:-}" ]]; then
    data_home="$HOME/.local/share"
else
    printf 'Neither XDG_DATA_HOME nor HOME is set, so PrismLauncher cannot be located.\n' >&2
    exit 1
fi

prism_root="${PRISM_ROOT:-$data_home/PrismLauncher}"
prism_java_root="$prism_root/java"
assets_dir="${ASSETS_DIR:-$prism_root/assets}"
assets_link="$script_dir/assets"
native_dir="$script_dir/rt/natives-linux"

java_is_compatible() {
    local candidate="$1"
    local version
    local major

    [[ -x "$candidate" ]] || return 1
    version="$("$candidate" -version 2>&1 | sed -n '1s/.*version "\([^"]*\)".*/\1/p')"
    major="${version%%.*}"
    if [[ "$major" == "1" ]]; then
        version="${version#*.}"
        major="${version%%.*}"
    fi
    [[ "$major" == "21" ]]
}

java_bin="${JAVA_BIN:-}"
if [[ -z "$java_bin" && -d "$prism_java_root" ]]; then
    for search_pattern in '*/eclipse_temurin_jre21*/bin/java' '*/bin/java'; do
        while IFS= read -r candidate; do
            if java_is_compatible "$candidate"; then
                java_bin="$candidate"
                break
            fi
        done < <(find "$prism_java_root" -mindepth 3 -maxdepth 3 -type f -path "$search_pattern" -print 2>/dev/null | sort -Vr)
        [[ -n "$java_bin" ]] && break
    done
fi

if [[ -z "$java_bin" ]] && command -v java >/dev/null 2>&1; then
    candidate="$(command -v java)"
    if java_is_compatible "$candidate"; then
        java_bin="$candidate"
    fi
fi

if [[ -z "$java_bin" ]] || ! java_is_compatible "$java_bin"; then
    printf 'A compatible Java installation was not found. OpenOnyx requires Java 21.\n' >&2
    printf 'Set JAVA_BIN to the full path of a compatible java executable and try again.\n' >&2
    exit 1
fi

if [[ ! -e "$assets_link" && ! -L "$assets_link" ]]; then
    ln -s "$assets_dir" "$assets_link"
fi

if [[ ! -f "$assets_link/indexes/1.8.json" ]]; then
    printf 'Minecraft 1.8 assets were not found at:\n  %s\n' "$assets_dir" >&2
    printf 'Set ASSETS_DIR to your PrismLauncher assets folder and try again.\n' >&2
    exit 1
fi

required_natives=(
    libjinput-linux64.so
    liblwjgl-linux-amd64.so
    libopenal-amd64.so
)

required_libraries=(
    "$script_dir/rt/libs-linux/lwjgl-2.9.4+legacyfabric.8.jar"
    "$script_dir/rt/libs-linux/lwjgl_util-2.9.4+legacyfabric.8.jar"
    "$script_dir/rt/libs-linux/mc-linux.jar"
)

for native in "${required_natives[@]}"; do
    if [[ ! -f "$native_dir/$native" ]]; then
        printf 'A required Linux library is missing:\n  %s\n' "$native_dir/$native" >&2
        exit 1
    fi
done

for library in "${required_libraries[@]}"; do
    if [[ ! -f "$library" ]]; then
        printf 'A required Linux library is missing:\n  %s\n' "$library" >&2
        exit 1
    fi
done

exec "$java_bin" \
    -Xmx4G \
    -Dfile.encoding=UTF-8 \
    -Donyx.user=admin \
    -Djava.library.path="$native_dir" \
    -cp "onyx.jar:rt/libs-linux/*:rt/libs/*" \
    Start \
    --username i_use_pastes \
    --gameDir . \
    --width 925 \
    --height 530
