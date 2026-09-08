# Onyx but... Open Source

<p align="center">
  <img src="./img/onyx-banner.png" alt="Onyx reversed by the community" width="25%">
</p>

<p align="center">
  <img src="./img/deobf.jpg" alt="Deobfuscation" width="42%">
  <img src="./img/onyxclient.png" alt="Onyx logo" width="31%">
</p>

- JDK 21 (the supplied runtime is Temurin 21.0.4)
- Java decompiler / bytecode tooling for regeneration
- highiq

## build status

The runnable OpenOnyx version is inside the `run/` folder in both published
repositories:

- [Codeberg](https://codeberg.org/Claude-French-Industries/OpenOnyx)
- [GitHub](https://github.com/OpenAi-Italian-Industries/OpenOnyx)

Run `run/run.bat` from that folder to launch the supplied runtime. The folder
contains the runnable `onyx.jar`, bundled JRE, native libraries, and Minecraft
runtime libraries. Install Git LFS before cloning so the large JRE files under
`run/jre/` are downloaded instead of remaining pointer files. The source
launcher is built separately with `gradle clean jar --no-daemon` into
`build/libs/onyx-source.jar`; the recovered `src` tree is retained as
decompiler output and is not currently a standalone compile target.

### Linux (x86-64)

The Linux launcher requires Bash, Java 21, and a PrismLauncher
installation containing the Minecraft 1.8 assets. From the repository root:

```bash
cd run
./run.sh
```

The script automatically searches PrismLauncher's Java installations before
checking the system Java. It uses `$XDG_DATA_HOME/PrismLauncher`, or
`$HOME/.local/share/PrismLauncher` when `XDG_DATA_HOME` is not set. Custom
locations can be supplied without editing the script:

```bash
JAVA_BIN=/path/to/java ASSETS_DIR=/path/to/assets ./run.sh
```

The Linux runtime uses the Legacy Fabric LWJGL 2 compatibility build. It also
loads `rt/libs-linux/mc-linux.jar`, a Linux-only copy of `mc.jar` that limits
Onyx packet events to the client connection and selects Java NIO instead of the
old Netty epoll transport. The original Windows runtime files are unchanged.

## static security review

The supplied `onyx.jar` and renamed archive were reviewed without executing
them or making network requests:

- No persistence, startup registration, native loading, arbitrary class loading,
  RAT command channel, webhook, Discord bot token, or credential-file harvesting
  was identified.
- Network code targets Microsoft/Xbox/Minecraft authentication, Mojang skin
  lookup, configured Minecraft proxies, and Discord's local IPC socket.
- The only local HTTP listener is the loopback OAuth callback on
  `127.0.0.1:1337`.
- `ProcessBuilder` is used by the optional Windows Spotify/media integration to
  invoke a fixed temporary PowerShell script, and by the macOS integration to
  invoke a fixed AppleScript. These paths read now-playing metadata and cover
  art; they are not remote command execution.
- File access is limited to client configuration, temporary media integration
  files, and user-selected UI/configuration files. Clipboard reads/writes are
  used by the UI.

This is a static review, not a guarantee against behavior that only appears
under an unobserved runtime condition.

## what is included

This repository contains the recovered OpenOnyx source tree from the supplied
JAR. The source is organized by responsibility instead of the original
obfuscated package layout:

- `openonyx.features.combat`
- `openonyx.features.movement`
- `openonyx.features.player`
- `openonyx.features.render`
- `openonyx.features.hud`
- `openonyx.history`
- `openonyx.configuration`
- `openonyx.events`
- `openonyx.utilities`

Feature and support classes have purpose-based names, including:

```text
KillAura, AntiBot, Velocity, BedBreaker, BedDefender
Scaffold, ChestStealer, InventoryManager, NameChanger
ESP, BedESP, Fullbright, NoRender, Chams, Camera
Module, ModuleManager, ModuleCategory
PacketEvent, TickEvent, WorldChangeEvent
RotationManager, Rotation, AimController, CombatController
BooleanSetting, NumberSetting, EnumSetting, MultiSelectSetting
```

The recovered `KillAura` implementation now exposes readable members such as
`combatController`, `aimController`, `targetFilters`, `autoBlockMode`,
`targetDistance`, `findTarget`, `shouldAttack`, `attackIfReady`, and
`onPacket`.

## recovery notes

- 630 original JVM classes were parsed.
- Source recovery produced 432 Java files.
- The supplied ZKM tool found no ZKM DES or long-key protection in the archive.
- Local XOR string decoder calls were resolved where their inputs and runtime
  dependencies allowed static recovery.
- The no-op obfuscation marker and its bytecode call sites were removed from the
  renamed output.

This is decompiled source, not a clean-room rewrite. Compiler metadata,
original comments, exact local names, and some control-flow structure were not
present in the input. Review the recovered code before using it as a build.

## decompilation

The original archive is kept separately from the recovered source. The source
recovery process uses CFR 0.152 with the libraries shipped under `rt/libs/`.
`tools/RenameClasses.java` performs the offline ASM class/package remap and
writes the original-to-recovered map to `mappings/classes.tsv`.

## contributing

Contributions, cleanup patches, semantic renames, and bug reports are welcome.
Open an issue or submit a pull request on Codeberg.

## legal

OpenOnyx is an independent community project and is not an official Minecraft
product. Minecraft is a trademark of Mojang Studios and Microsoft Corporation.
Third-party files and libraries retain their respective licenses.
