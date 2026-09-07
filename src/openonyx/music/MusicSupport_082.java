/*
 * Decompiled with CFR.
 */
package openonyx.music;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.TimeUnit;
import openonyx.core.OnyxClient;
import openonyx.music.MusicSupport_078;
import openonyx.music.MusicListener_077;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.internal.ThemeSupport_063;

final class MusicSupport_082
implements MusicListener_077 {
    private final static String d = "on readSpotify()\n    if application \"Spotify\" is running then\n        tell application \"Spotify\"\n            if player state is playing or player state is paused then\n                set trackName to name of current track\n                set trackArtist to artist of current track\n                set isPlaying to (player state is playing)\n                set pos to player position\n                set dur to duration of current track\n                set artUrl to artwork url of current track\n                return trackName & \"@@@\" & trackArtist & \"@@@\" & isPlaying & \"@@@\" & pos & \"@@@\" & dur & \"@@@\" & artUrl\n            end if\n        end tell\n    end if\n    return \"\"\nend readSpotify\n\non readMusic()\n    if application \"Music\" is running then\n        tell application \"Music\"\n            if player state is playing or player state is paused then\n                set trackName to name of current track\n                set trackArtist to artist of current track\n                set isPlaying to (player state is playing)\n                set pos to player position\n                set dur to duration of current track\n                -- Music.app's artwork is embedded binary data, not a URL \u2014 no cover here.\n                return trackName & \"@@@\" & trackArtist & \"@@@\" & isPlaying & \"@@@\" & pos & \"@@@\" & dur & \"@@@\"\n            end if\n        end tell\n    end if\n    return \"\"\nend readMusic\n\nset nowPlayingResult to readSpotify()\nif nowPlayingResult is \"\" then set nowPlayingResult to readMusic()\nreturn nowPlayingResult\n";
    private boolean i;
    private final static String f = "@@@";
    private final static long H = 6L;
    private Path e;

    private void L(String string) {
        String a = string;
        MusicSupport_082 a2 = this;
if (a2.i) {
            return;
        }
        a2.i = 1;
        Object[] objectArray = new Object[1];
        objectArray[0] = a;
        OnyxClient.H.warn("Now-playing (macOS): {}", objectArray);
    }

    private void L() throws IOException {
        MusicSupport_082 a;
if (a.e != null) {
            if (Files.isRegularFile(a.e, new LinkOption[0])) {
                return;
            }
        }
        a.e = Files.createTempFile("onyx-nowplaying", ".applescript", new FileAttribute[0]);
        MusicSupport_082 class_082 = a;
        class_082.e.toFile().deleteOnExit();
        Files.writeString(class_082.e, (CharSequence)d, StandardCharsets.UTF_8, new OpenOption[0]);
    }

    private static MusicSupport_078 L(String string) {
        String a;
        String string2 = string;
if (string2.isEmpty()) {
            return null;
        }
        String[] stringArray = string2.split(f, -1);
        if (stringArray.length < 5) {
            return null;
        }
        String string3 = stringArray[0].trim();
        if (string3.isEmpty()) {
            return null;
        }
        String string4 = stringArray[1].trim();
        boolean bl = Boolean.parseBoolean(stringArray[2].trim());
        String string5 = a = stringArray.length > 5 ? stringArray[5].trim() : "";
        if (a.isEmpty()) {
            a = null;
        }
        try {
            double d;
            double d2 = Double.parseDouble(MusicSupport_082.L(stringArray[3]));
            double d3 = Double.parseDouble(MusicSupport_082.L(stringArray[4]));
            double d4 = d > 1000.0 ? d3 / 1000.0 : d3;
            return new MusicSupport_078(string3, string4, bl, (int)Math.round(d2 * 1000.0), (int)Math.round(d4 * 1000.0), a, null);
        }
        catch (NumberFormatException numberFormatException) {
            int n = 0;
            return new MusicSupport_078(string3, string4, bl, n, n, a, null);
        }
    }

    private static String L(String a) {
return a.trim().replace((char)44, (char)46);
    }

    MusicSupport_082() {
        MusicSupport_082 a;
    }

    @Override
    public MusicSupport_078 L() {
        MusicSupport_082 class_082 = this;
try {
            class_082.L();
            String[] stringArray = new String[2];
            stringArray[0] = "osascript";
            stringArray[1] = class_082.e.toString();
            ProcessBuilder processBuilder = new ProcessBuilder(stringArray);
            Process a = processBuilder.start();
            String string = new String(a.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
            String string2 = new String(a.getErrorStream().readAllBytes(), StandardCharsets.UTF_8).strip();
            if (!a.waitFor(6L, TimeUnit.SECONDS)) {
                a.destroyForcibly();
                class_082.L("osascript timed out after 6s");
                return null;
            }
            if (a.exitValue() != 0) {
                class_082.L("osascript exited " + a.exitValue() + ": " + (string2.isEmpty() ? "(no stderr)" : string2) + ". Script left at: " + class_082.e);
                return null;
            }
            class_082.i = 0;
            return MusicSupport_082.L(string);
        }
        catch (IOException | InterruptedException exception) {
            class_082.L(new StringBuilder().insert(0, "Failed to run osascript: ").append(exception.getMessage()).toString());
            return null;
        }
    }
}

