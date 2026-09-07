/*
 * Decompiled with CFR.
 */
package openonyx.music;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import openonyx.core.OnyxClient;
import openonyx.events.Rotation;
import openonyx.music.MusicSupport_078;
import openonyx.music.MusicListener_077;
import openonyx.utilities.UtilitySupport_476;

final class MusicSupport_079
implements MusicListener_077 {
    private boolean I;
    private final static String d = "$ErrorActionPreference = 'Stop'\n$outPath = '__OUTPUT__'\n\nfunction Write-Result($obj) {\n    [System.IO.File]::WriteAllText($outPath, ($obj | ConvertTo-Json -Compress), [System.Text.Encoding]::UTF8)\n}\n\ntry {\n    Add-Type -AssemblyName System.Runtime.WindowsRuntime\n\n    $asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object {\n        $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1'\n    })[0]\n\n    function Await($WinRtTask, $ResultType) {\n        $asTask = $asTaskGeneric.MakeGenericMethod($ResultType)\n        $netTask = $asTask.Invoke($null, @($WinRtTask))\n        $netTask.Wait(-1) | Out-Null\n        $netTask.Result\n    }\n\n    [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager,Windows.Media.Control,ContentType=WindowsRuntime] | Out-Null\n\n    $manager = Await ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager]::RequestAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager])\n    $session = $manager.GetCurrentSession()\n\n    if ($null -eq $session) {\n        Write-Result ([PSCustomObject]@{ empty = $true })\n        exit 0\n    }\n\n    $props = Await ($session.TryGetMediaPropertiesAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties])\n    $playback = $session.GetPlaybackInfo()\n    $timeline = $session.GetTimelineProperties()\n\n    # SMTC hands the cover over as a stream reference rather than a URL, so it has to be\n    # read out whole and carried back as base64. Its own try/catch: a player that\n    # publishes no thumbnail, or hands back a stream that will not open, must still\n    # leave the title and the progress bar working.\n    #\n    # The stream comes back from the reflection-driven await as a bare COM object with no\n    # usable WinRT projection: its .Size reads as empty (so the old size-gated read never\n    # ran) and DataReader refuses to wrap it. AsStreamForRead projects it to an ordinary\n    # .NET stream, which drains cleanly regardless \u2014 that is the only path that works here.\n    $art = $null\n\n    try {\n        $reference = $props.Thumbnail\n\n        if ($null -ne $reference) {\n            $stream = Await ($reference.OpenReadAsync()) ([Windows.Storage.Streams.IRandomAccessStreamWithContentType])\n\n            $asStreamForRead = [System.IO.WindowsRuntimeStreamExtensions].GetMethods() | Where-Object {\n                $_.Name -eq 'AsStreamForRead' -and $_.GetParameters().Count -eq 1\n            } | Select-Object -First 1\n\n            $netStream = $asStreamForRead.Invoke($null, @($stream))\n\n            try {\n                $buffer = New-Object System.IO.MemoryStream\n                $netStream.CopyTo($buffer)\n                $bytes = $buffer.ToArray()\n\n                if ($bytes.Length -gt 0) {\n                    $art = [Convert]::ToBase64String($bytes)\n                }\n\n                $buffer.Dispose()\n            } finally {\n                $netStream.Dispose()\n            }\n        }\n    } catch {\n        $art = $null\n    }\n\n    Write-Result ([PSCustomObject]@{\n        title = $props.Title\n        artist = $props.Artist\n        playing = ($playback.PlaybackStatus.ToString() -eq 'Playing')\n        positionMs = [math]::Round($timeline.Position.TotalMilliseconds)\n        durationMs = [math]::Round(($timeline.EndTime - $timeline.StartTime).TotalMilliseconds)\n        art = $art\n    })\n} catch {\n    Write-Result ([PSCustomObject]@{ error = $_.Exception.Message })\n}\n";
    private final static long i = 6L;
    private Path f;
    private boolean H;
    private Path e;

    /*
     * WARNING - void declaration
     */
    private byte[] L(String string) {
        void a;
        MusicSupport_079 class_079 = this;
if (a == null || a.isBlank()) {
            if (!class_079.I) {
                class_079.I = 1;
                OnyxClient.H.info("Now-playing (Windows): session published no cover art");
            }
            return null;
        }
        try {
            Object a2 = Base64.getDecoder().decode((String)a);
            if (!class_079.I) {
                class_079.I = 1;
                Object[] objectArray = new Object[1];
                objectArray[0] = ((Object)a2).length;
                OnyxClient.H.info("Now-playing (Windows): cover art is {} bytes", objectArray);
            }
            return a2;
        }
        catch (IllegalArgumentException a2) {
            class_079.L("Malformed thumbnail from PowerShell (" + a.length() + " chars)");
            return null;
        }
    }

    private MusicSupport_078 L(String string) {
        boolean bl;
        Object object;
        Object object2;
        String a;
        MusicSupport_079 class_079 = this;
try {
            object2 = new JsonParser().parse(a);
        }
        catch (RuntimeException a2) {
            class_079.L("Malformed JSON from PowerShell: " + a);
            return null;
        }
        if (object2 == null || !((JsonElement)object2).isJsonObject()) {
            class_079.L(new StringBuilder().insert(0, "Unexpected output from PowerShell: ").append(a).toString());
            return null;
        }
        JsonObject a2 = ((JsonElement)object2).getAsJsonObject();
        if (a2.has("error")) {
            class_079.L(new StringBuilder().insert(0, "PowerShell script error: ").append(MusicSupport_079.L(a2, "error")).toString());
            return null;
        }
        a = MusicSupport_079.L(a2, "title");
        if (a == null || a.isBlank()) {
            return null;
        }
        Object object3 = a2;
        object2 = MusicSupport_079.L((JsonObject)object3, "artist");
        boolean bl2 = ((JsonObject)object3).has("playing") && a2.get("playing").isJsonPrimitive() && a2.get("playing").getAsBoolean() ? 5 >> 2 : false;
        Object object4 = a2;
        int n = MusicSupport_079.L((JsonObject)object4, "positionMs");
        int n2 = MusicSupport_079.L((JsonObject)object4, "durationMs");
        if (object2 == null) {
            object = "";
            bl = bl2;
        } else {
            object = object2;
            bl = bl2;
        }
        return new MusicSupport_078(a, (String)object, bl, -1, n2, null, class_079.L(MusicSupport_079.L(a2, "art")));
    }

    MusicSupport_079() {
        MusicSupport_079 a;
    }

    private static String L(JsonObject jsonObject, String string) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isString()) {
            return null;
        }
        return ((JsonElement)a).getAsString();
    }

    private void L(String string) {
        String a = string;
        MusicSupport_079 a2 = this;
if (a2.H) {
            return;
        }
        a2.H = 1;
        Object[] objectArray = new Object[1];
        objectArray[0] = a;
        OnyxClient.H.warn("Now-playing (Windows): {}", objectArray);
    }

    @Override
    public MusicSupport_078 L() {
        MusicSupport_079 class_079 = this;
try {
            MusicSupport_079 class_0792 = class_079;
            class_0792.L();
            Files.deleteIfExists(class_0792.e);
            String[] stringArray = new String[7];
            stringArray[0] = "powershell.exe";
            stringArray[1] = "-NoProfile";
            stringArray[2] = "-NonInteractive";
            stringArray[3] = "-ExecutionPolicy";
            stringArray[4] = "Bypass";
            stringArray[5] = "-File";
            stringArray[6] = class_079.f.toString();
            ProcessBuilder processBuilder = new ProcessBuilder(stringArray);
            Object a = processBuilder.start();
            String string = new String(((Process)a).getErrorStream().readAllBytes(), StandardCharsets.UTF_8);
            if (!((Process)a).waitFor(6L, TimeUnit.SECONDS)) {
                ((Process)a).destroyForcibly();
                class_079.L("powershell.exe timed out after 6s");
                return null;
            }
            if (!Files.isRegularFile(class_079.e, new LinkOption[0])) {
                class_079.L("powershell.exe produced no output (exit " + ((Process)a).exitValue() + "). stderr: " + (string.isBlank() ? "(none)" : string.strip()) + ". Script left at: " + class_079.f);
                return null;
            }
            MusicSupport_079 class_0793 = class_079;
            a = class_0793.L(Files.readString(class_0793.e, StandardCharsets.UTF_8));
            class_0793.H = 0;
            return a;
        }
        catch (IOException | InterruptedException exception) {
            class_079.L(new StringBuilder().insert(0, "Failed to run powershell.exe: ").append(exception.getMessage()).toString());
            return null;
        }
    }

    private void L() throws IOException {
        MusicSupport_079 class_079 = this;
if (class_079.f != null) {
            if (Files.isRegularFile(class_079.f, new LinkOption[0])) {
                return;
            }
        }
        class_079.f = Files.createTempFile("onyx-nowplaying", ".ps1", new FileAttribute[0]);
        class_079.e = Files.createTempFile("onyx-nowplaying-out", ".json", new FileAttribute[0]);
        MusicSupport_079 class_0792 = class_079;
        class_0792.f.toFile().deleteOnExit();
        class_0792.e.toFile().deleteOnExit();
        String a = class_0792.e.toString().replace("\\", "\\\\").replace("'", "''");
        Files.writeString(class_0792.f, (CharSequence)d.replace("__OUTPUT__", a), StandardCharsets.UTF_8, new OpenOption[0]);
    }

    private static int L(JsonObject jsonObject, String string) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isNumber()) {
            return 0;
        }
        return ((JsonElement)a).getAsInt();
    }
}

