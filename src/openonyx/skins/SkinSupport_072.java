/*
 * Decompiled with CFR.
 */
package openonyx.skins;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.imageio.ImageIO;
import openonyx.connection.internal.NetworkSupport_467;
import openonyx.connection.internal.NetworkSupport_470;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.skins.SkinSupport_074;
import openonyx.utilities.FileUtils;
import openonyx.utilities.Timer;

/*
 * Exception performing whole class analysis ignored.
 */
public final class SkinSupport_072 {
    private final static int H = 15000;
    private final static ExecutorService e = Executors.newSingleThreadExecutor(a -> {
Thread thread = new Thread(a, FileUtils.L("#15'a,'6\"r 0#49/"));
        thread.setDaemon(--1 != 0);
        return thread;
    });

    private SkinSupport_072() {
        SkinSupport_072 a;
    }

    private static String L(String string) throws NetworkSupport_474 {
        String string2 = string;
Object a = NetworkSupport_470.L(new StringBuilder().insert(0, "https://api.mojang.com/users/profiles/minecraft/").append(NetworkSupport_470.L(string2)).toString(), new String[0]);
        if (((NetworkSupport_467)a).L() == 204 || ((NetworkSupport_467)a).L() == 404) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, "No account named ").append(string2).toString());
        }
        if (!((NetworkSupport_467)a).L()) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, FileUtils.L("\u00010&>\"8l3#0'*<\u007f*>%3);lw")).append(((NetworkSupport_467)a).L()).append(")").toString());
        }
        if ((a = NetworkSupport_470.L(((NetworkSupport_467)a).L(), FileUtils.L("%;"))) == null || ((String)a).length() != 32) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, "Malformed profile for ").append(string2).toString());
        }
        return a;
    }

    private static JsonObject L(String string) throws NetworkSupport_474 {
NetworkSupport_467 response = NetworkSupport_470.L(new StringBuilder().insert(0, FileUtils.L("78+<,vpc,),?6#1?:>))-b2#5-1+q/0!p?:?,%0\"p!6\":/--98p<-#9%3)p")).append(string).toString(), new String[0]);
        if (!response.L()) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, FileUtils.L(">\u0018\u0001\f\u0007\u0006\u000bJ\b\u000f\u001a\t\u0006J\b\u000b\u0007\u0006\u000b\u000eNB")).append(response.L()).append(FileUtils.L("v")).toString());
        }
        JsonElement entries = response.L().get(FileUtils.L("\u001e\u0018\u0001\u001a\u000b\u0018\u001a\u0003\u000b\u0019"));
        if (entries == null || !entries.isJsonArray()) {
            throw new NetworkSupport_474(FileUtils.L("\u000f>0*6 :l7-,l1#\u007f8:4+9-),"));
        }
        for (JsonElement entry : entries.getAsJsonArray()) {
            if (!entry.isJsonObject()) {
                continue;
            }
            JsonObject profile = entry.getAsJsonObject();
            if (!FileUtils.L("\u001a\u000f\u0016\u001e\u001b\u0018\u000b\u0019").equals(NetworkSupport_470.L(profile, FileUtils.L("\">!:")))) {
                continue;
            }
            String encoded = NetworkSupport_470.L(profile, FileUtils.L("\u001c\u000f\u0006\u001b\u000f"));
            if (encoded == null) {
                break;
            }
            try {
                String json = new String(java.util.Base64.getDecoder().decode(encoded), java.nio.charset.StandardCharsets.UTF_8);
                JsonElement decoded = new com.google.gson.JsonParser().parse(json);
                JsonElement textures = decoded.isJsonObject() ? decoded.getAsJsonObject().get(FileUtils.L("8:4+9-),")) : null;
                if (textures != null && textures.isJsonObject()) {
                    return textures.getAsJsonObject();
                }
            } catch (RuntimeException exception) {
                throw new NetworkSupport_474(FileUtils.L("#\u000b\u0002\f\u0001\u0018\u0003\u000f\nJ\u001a\u000f\u0016\u001e\u001b\u0018\u000bJ\u001e\u0018\u0001\u001a\u000b\u0018\u001a\u0013"), exception);
            }
        }
        throw new NetworkSupport_474(FileUtils.L("\u000f>0*6 :l7-,l1#\u007f8:4+9-),"));
    }

    /*
     * WARNING - void declaration
     */
    public static void L(String string, Consumer<SkinSupport_074> consumer, Consumer<String> consumer2) {
        void a;
        Consumer<String> a2 = consumer2;
        String a3 = string;
e.submit(() -> SkinSupport_072.L((Consumer)a, a3, a2));
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Consumer consumer, String string, Consumer consumer2) {
        String a22 = string;
        Consumer a = consumer;
try {
            a.accept(SkinSupport_072.L(a22));
            return;
        }
        catch (NetworkSupport_474 a22) {
            void a3;
            a3.accept(a22.getMessage());
            return;
        }
    }

    private static SkinSupport_074 L(String string) throws NetworkSupport_474 {
        String string2 = string;
JsonElement a = SkinSupport_072.L(SkinSupport_072.L(string2)).get("SKIN");
        if (a == null || !a.isJsonObject()) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, string2).append(FileUtils.L("\u007f$>?\u007f\"0l<9,80!\u007f?4%1")).toString());
        }
        String string3 = NetworkSupport_470.L(a.getAsJsonObject(), "url");
        if (string3 == null) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, string2).append(FileUtils.L("\u007f$>?\u007f\"0l<9,80!\u007f?4%1")).toString());
        }
        return new SkinSupport_074(SkinSupport_072.L(string3), SkinSupport_072.L(a.getAsJsonObject()));
    }

    private static BufferedImage L(String string) throws NetworkSupport_474 {
        String string2 = string;
HttpURLConnection httpURLConnection = null;
        try {
            BufferedImage bufferedImage;
            block13: {
                HttpURLConnection httpURLConnection2 = httpURLConnection = (HttpURLConnection)new URL(string2).openConnection();
                int n = 15000;
                httpURLConnection.setConnectTimeout(n);
                httpURLConnection2.setReadTimeout(n);
                httpURLConnection2.setRequestProperty("User-Agent", "onyx");
                InputStream a2 = httpURLConnection2.getInputStream();
                try {
                    BufferedImage bufferedImage2 = ImageIO.read(a2);
                    if (bufferedImage2 == null) {
                        throw new NetworkSupport_474(FileUtils.L("\u001f4%1l;#(\"3#>(\u007f;>?\u007f\"08\u007f-1l6!>+:"));
                    }
                    bufferedImage = bufferedImage2;
                    if (a2 == null) break block13;
                }
                catch (Throwable throwable) {
                    try {
                        Throwable throwable2;
                        block14: {
                            if (a2 != null) {
                                try {
                                    a2.close();
                                    throwable2 = throwable;
                                    break block14;
                                }
                                catch (Throwable throwable3) {
                                    throwable.addSuppressed(throwable3);
                                }
                            }
                            throwable2 = throwable;
                        }
                        throw throwable2;
                    }
                    catch (IOException a2) {
                        throw new NetworkSupport_474("Couldn't download the skin", a2);
                    }
                }
                a2.close();
            }
            return bufferedImage;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private static String L(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
Object a = jsonObject2.get("metadata");
        if (a != null && ((JsonElement)a).isJsonObject()) {
            a = NetworkSupport_470.L(((JsonElement)a).getAsJsonObject(), FileUtils.L("2#;)3"));
            if ("slim".equals(a)) {
                return FileUtils.L("?3%2");
            }
        }
        return "default";
    }
}

