/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.connection.internal;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import openonyx.configuration.Event;
import openonyx.connection.internal.NetworkSupport_471;
import openonyx.connection.internal.NetworkSupport_473;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.movement.MovementSupport_088;
import openonyx.utilities.FileUtils;
import openonyx.utilities.UtilitySupport_492;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NetworkSupport_469
implements OnyxListener_001 {
    private final static int M = 1337;
    private final String L;
    private final static String j = "<!doctype html><meta charset=\"utf-8\"><title>%s</title>\n<body style=\"background:#141218;color:#e6e0e9;font-family:system-ui,sans-serif;\ndisplay:flex;align-items:center;justify-content:center;height:100vh;margin:0\">\n<div style=\"text-align:center\"><h1 style=\"font-weight:500\">%s</h1>\n<p style=\"opacity:.7\">You can close this tab and return to Minecraft.</p></div>";
    private final Consumer<NetworkSupport_471> m;
    private final static String h = "127.0.0.1";
    private final static String l = "/";
    private static NetworkSupport_469 I;
    private final HttpServer d;
    private final String i;
    private final Consumer<String> f;
    private final static int H = 300;
    private final AtomicBoolean e;

    /*
     * WARNING - void declaration
     */
    public static synchronized NetworkSupport_469 L(Consumer<NetworkSupport_471> consumer, Consumer<String> consumer2) throws NetworkSupport_474 {
        void a;
        HttpServer httpServer;
        Consumer<NetworkSupport_471> consumer3 = consumer;
if (!NetworkSupport_473.L()) {
            throw new NetworkSupport_474("No Azure client id configured ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ set MicrosoftAuth.CLIENT_ID");
        }
        NetworkSupport_469.i();
        try {
            httpServer = HttpServer.create(new InetSocketAddress(h, 1337), 0);
        }
        catch (BindException a2) {
            throw new NetworkSupport_474("Microsoft sign-in requires local port 1337 to be available", a2);
        }
        catch (IOException a2) {
            throw new NetworkSupport_474("Could not open the local login server", a2);
        }
        NetworkSupport_469 a2 = new NetworkSupport_469(httpServer, 1337, consumer3, (Consumer<String>)a);
        httpServer.createContext(l, httpExchange -> {
            void a;
            NetworkSupport_469 class_469 = this;
Object a2 = NetworkSupport_469.L(a.getRequestURI().getRawQuery());
            String string = a2.get("code");
            Object object = a2;
            Object object2 = a2 = a2.get("error_description") != null ? (String)object.get("error_description") : (String)object.get("error");
            if (string == null) {
                NetworkSupport_469 class_4692 = class_469;
                class_4692.L((HttpExchange)a, "Sign-in failed");
                class_4692.L((String)(a2 != null ? a2 : "Microsoft did not return an authorization code"));
                return;
            }
            if (!class_469.e.compareAndSet(5 >> 3, 3 >> 1)) {
                return;
            }
            try {
                a2 = NetworkSupport_473.L(string, class_469.L);
            }
            catch (NetworkSupport_474 class_474) {
                OnyxClient.H.warn("Microsoft sign-in failed", (Throwable)class_474);
                NetworkSupport_469 class_4693 = class_469;
                class_4693.L((HttpExchange)a, "Sign-in failed");
                class_4693.L();
                ((Minecraft)((Object)e)).addScheduledTask(() -> {
                    NetworkSupport_474 a = class_474;
                    NetworkSupport_469 a2 = this;
a2.f.accept(a.getMessage());
                });
                return;
            }
            class_469.L((HttpExchange)a, "Signed in");
            class_469.L();
            ((Minecraft)((Object)e)).addScheduledTask(() -> class_469.L((NetworkSupport_471)a2));
        });
        HttpServer httpServer2 = httpServer;
        httpServer2.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
        httpServer2.start();
        I = a2;
        UtilitySupport_492.L(() -> {
try {
                Thread.sleep(300000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                return;
            }
            a2.L("Sign-in timed out");
        });
        return a2;
    }

    @Generated
    public String d() {
        NetworkSupport_469 a;
return a.i;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void L(HttpExchange httpExchange, String string) {
        byte[] a;
        NetworkSupport_469 class_469 = this;
Object[] objectArray = new Object[2];
        objectArray[0] = a;
        objectArray[1] = a;
        a = j.formatted(objectArray).getBytes(StandardCharsets.UTF_8);
        try {
            void a22;
            OutputStream a3 = a22.getResponseBody();
            try {
                a22.getResponseHeaders().add("Content-Type", "text/html; charset=utf-8");
                a22.sendResponseHeaders(200, a.length);
                a3.write(a);
                if (a3 == null) return;
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                if (a3 != null) {
                    try {
                        a3.close();
                        throwable2 = throwable;
                        throw throwable2;
                    }
                    catch (Throwable a22) {
                        throwable.addSuppressed(a22);
                    }
                }
                throwable2 = throwable;
                throw throwable2;
            }
            a3.close();
            return;
        }
        catch (IOException a3) {
            OnyxClient.H.warn("Failed to answer the OAuth callback", (Throwable)a3);
        }
    }

    public static synchronized void i() {
if (I != null) {
            I.D();
        }
    }

    private void L(NetworkSupport_471 class_471) {
        NetworkSupport_471 a = class_471;
        NetworkSupport_469 a2 = this;
a2.m.accept(a);
    }

    @Generated
    public String L() {
        NetworkSupport_469 a;
return a.L;
    }

    public void D() {
        NetworkSupport_469 a;
if (a.e.compareAndSet(0 != 0, --1 != 0)) {
            a.L();
        }
    }

    public void d() {
        NetworkSupport_469 a;
FileUtils.L(a.i);
    }

    /*
     * WARNING - void declaration
     */
    private NetworkSupport_469(HttpServer httpServer, int n, Consumer<NetworkSupport_471> consumer, Consumer<String> consumer2) {
        void a;
        Consumer<String> a2;
        void a3;
        void a4;
        NetworkSupport_469 a5;
        NetworkSupport_469 class_469 = consumer3;
        Consumer<String> consumer3 = consumer2;
        NetworkSupport_469 class_4692 = a5 = class_469;
        NetworkSupport_469 class_4693 = a5;
        a5.e = new AtomicBoolean();
        a5.d = a4;
        class_4692.m = a3;
        a5.f = a2;
        class_4692.L = new StringBuilder().insert(0, "http://127.0.0.1:").append((int)a).append(l).toString();
        a5.i = NetworkSupport_473.L(a5.L);
    }

    private static Map<String, String> L(String string) {
        int n;
        String string2 = string;
HashMap a = new HashMap();
        if (string2 == null || string2.isEmpty()) {
            return a;
        }
        String[] stringArray = string2.split("&");
        int n2 = stringArray.length;
        int n3 = 0;
        while (n3 < n2) {
            String string3 = stringArray[0];
            int n4 = string3.indexOf(61);
            if (n4 > 0) {
                a.put(URLDecoder.decode(string3.substring(0, n4), StandardCharsets.UTF_8), URLDecoder.decode(string3.substring(n4 + 1), StandardCharsets.UTF_8));
            }
            n3 = ++n;
        }
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void L() {
        NetworkSupport_469 class_469 = this;
class_469.d.stop(0);
        Class<NetworkSupport_469> a = NetworkSupport_469.class;
        synchronized (NetworkSupport_469.class) {
            if (I == class_469) {
                I = null;
            }
            // ** MonitorExit[a] (shouldn't be in output)
            return;
        }
    }

    private void L(String string) {
        String a = string;
        NetworkSupport_469 a2 = this;
if (!a2.e.compareAndSet(5 >> 3, 1 != 0)) {
            return;
        }
        a2.L();
        ((Minecraft)((Object)e)).addScheduledTask(() -> {
            String a = a;
            NetworkSupport_469 a2 = this;
a2.f.accept(a);
        });
    }
}

