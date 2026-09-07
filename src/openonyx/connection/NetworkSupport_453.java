/*
 * Decompiled with CFR.
 */
package openonyx.connection;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.UnknownHostException;
import openonyx.connection.NetworkSupport_461;
import openonyx.connection.NetworkSupport_463;
import openonyx.connection.NetworkMode_456;
import openonyx.core.OnyxClient;
import openonyx.events.EntityRelationUtils;
import openonyx.input.InputSupport_005;
import openonyx.network.NetworkSupport_071;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NetworkSupport_453 {
    private final Object i;
    private volatile NetworkSupport_463 f = NetworkSupport_463.L();
    private NetworkSupport_071 H;
    private volatile String e;

    public NetworkSupport_453() {
        NetworkSupport_453 a;
        NetworkSupport_453 class_453 = a;
        class_453.i = new Object();
    }

    private static String d(String a) {
if (a == null) {
            return "";
        }
        return a.trim();
    }

    private Proxy i() {
        NetworkSupport_453 class_453 = this;
try {
            return class_453.L();
        }
        catch (RuntimeException a) {
            class_453.e = a.getMessage();
            OnyxClient.H.warn("Falling back to a direct connection", (Throwable)a);
            return Proxy.NO_PROXY;
        }
    }

    public String i() {
        NetworkSupport_453 a;
return a.f.D();
    }

    public String D() {
        NetworkSupport_453 a;
return a.f.L();
    }

    public Proxy D() {
        NetworkSupport_453 a;
return a.i();
    }

    public Proxy d() {
        NetworkSupport_453 a;
if (a.f.L()) {
            return a.i();
        }
        return Proxy.NO_PROXY;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void L(NetworkMode_456 enum_456, boolean bl, boolean bl2, String string, String string2, String string3) {
        Object object;
        Object a;
        NetworkSupport_463 class_463;
        void a2;
        String string4;
        String a3;
        String a4;
        boolean a222 = bl;
        NetworkSupport_453 a5 = this;
a4 = NetworkSupport_453.d(a4);
        a3 = NetworkSupport_453.d(a3);
        Object object2 = string4 = a2 == null ? "" : a2;
        if (a222) {
            class_463 = v2;
            String string5 = a4;
            v2 = new NetworkSupport_463((NetworkMode_456)((Object)a), 5 >> 2, (boolean)a, string5, a3, string4, NetworkSupport_453.L(string5));
        } else {
            NetworkSupport_463 v2 = v2;
            v2 = new NetworkSupport_463((NetworkMode_456)((Object)a), 3 >> 2, (boolean)a, a4, a3, string4, null);
        }
        NetworkSupport_463 a222 = class_463;
        a = a5.i;
        // MONITORENTER : a
        NetworkSupport_453 class_453 = a5;
        class_453.f = a222;
        class_453.e = null;
        if (a5.H != null) {
            NetworkSupport_453 class_4532 = a5;
            if (a222.d()) {
                class_4532.H.L(a222.L(), a222.L(), a222.L(), a222.D());
                object = a;
                return;
            }
            class_4532.L();
        }
        object = a;
        // MONITOREXIT : object
    }

    private static NetworkSupport_461 L(String string) {
        String string2 = string;
int a = string2.lastIndexOf(58);
        if (9 <= 0 || 9 == string2.length() - 1) {
            throw new IllegalArgumentException("Enter proxy address as host:port");
        }
        String string3 = string2.substring(0, 9).trim();
        if (string3.startsWith("[") && string3.endsWith("]")) {
            String string4 = string3;
            string3 = string4.substring(1, string4.length() - 1);
        }
        if (string3.isBlank()) {
            throw new IllegalArgumentException("Enter a proxy host");
        }
        try {
            a = Integer.parseInt(string2.substring(10));
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException("Enter a valid proxy port");
        }
        if (9 < 1 || 9 > 65535) {
            throw new IllegalArgumentException("Enter a valid proxy port");
        }
        try {
            return new NetworkSupport_461(string3, 9, new InetSocketAddress(InetAddress.getByName(string3), 9));
        }
        catch (UnknownHostException unknownHostException) {
            throw new IllegalArgumentException("Could not resolve the proxy host");
        }
    }

    public boolean d() {
        NetworkSupport_453 a;
return a.f.d();
    }

    public Proxy L() {
        NetworkSupport_453 class_453 = this;
NetworkSupport_463 a22 = class_453.f;
        if (!a22.d()) {
            return Proxy.NO_PROXY;
        }
        class_453.e = null;
        try {
            return new Proxy(Proxy.Type.HTTP, class_453.L(a22).L());
        }
        catch (IOException a22) {
            throw new IllegalStateException("Could not start the local proxy bridge", a22);
        }
    }

    public NetworkMode_456 L() {
        NetworkSupport_453 a;
return a.f.L();
    }

    public String d() {
        NetworkSupport_453 a;
return a.e;
    }

    public InetSocketAddress L() {
        NetworkSupport_453 a;
return a.f.L();
    }

    public void L(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_453 a2 = this;
Object object = a;
        NetworkMode_456 enum_456 = NetworkMode_456.L(NetworkSupport_453.L(((JsonObject)object).get("protocol")));
        boolean bl = NetworkSupport_453.L(((JsonObject)object).get("enabled"));
        try {
            a2.L(enum_456, bl, NetworkSupport_453.L(a.get("auth")), NetworkSupport_453.L(a.get("address")), NetworkSupport_453.L(a.get("username")), NetworkSupport_453.L(a.get("password")));
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a2.f = NetworkSupport_463.L();
            return;
        }
    }

    private static boolean L(JsonElement a) {
if (a != null && a.isJsonPrimitive() && a.getAsJsonPrimitive().isBoolean() && a.getAsBoolean()) {
            return 5 >> 2;
        }
        return false;
    }

    public JsonObject L() {
        JsonObject jsonObject;
        NetworkSupport_453 class_453 = this;
NetworkSupport_463 a = class_453.f;
        JsonObject jsonObject2 = jsonObject = new JsonObject();
        JsonObject jsonObject3 = jsonObject;
        JsonObject jsonObject4 = jsonObject;
        jsonObject4.addProperty("protocol", a.L().i);
        jsonObject4.addProperty("enabled", a.d());
        jsonObject3.addProperty("auth", a.L());
        jsonObject3.addProperty("address", a.i());
        jsonObject2.addProperty("username", a.L());
        jsonObject2.addProperty("password", a.D());
        return jsonObject2;
    }

    public String L() {
        NetworkSupport_453 a;
return a.f.i();
    }

    public boolean L() {
        NetworkSupport_453 a;
return a.f.L();
    }

    public static String L(String string) {
        String string2 = string;
        int n = 1;
        int n2 = 1;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = 88;
        int cfr_ignored_0 = 0x60 ^ n2 << n2;
        int n5 = 9;
        int n6 = 0x60 ^ n << n;
        while (n5 >= 0) {
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n6);
            if (9 < 0) break;
            int n8 = a--;
            cArray[n8] = (char)(string2.charAt(n8) ^ n4);
            n5 = 9;
        }
        return new String(cArray);
    }

    private static String L(JsonElement a) {
if (a != null && a.isJsonPrimitive() && a.getAsJsonPrimitive().isString()) {
            return a.getAsString();
        }
        return "";
    }

    private void L() {
        NetworkSupport_453 a;
if (a.H != null) {
            a.H.close();
        }
        a.H = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private NetworkSupport_071 L(NetworkSupport_463 class_463) throws IOException {
        NetworkSupport_463 a = class_463;
        NetworkSupport_453 a2 = this;
Object object = a2.i;
        synchronized (object) {
            if (a2.H != null) {
                NetworkSupport_453 class_453 = a2;
                class_453.H.L(a.L(), a.L(), a.L(), a.D());
                return class_453.H;
            }
            a2.H = new NetworkSupport_071(a.L(), a.L(), a.L(), a.D(), string -> {
                String a = string;
                NetworkSupport_453 a2 = this;
a2.e = a;
                Object[] objectArray = new Object[1];
                objectArray[0] = a;
                OnyxClient.H.warn("Proxy tunnel failed: {}", objectArray);
            });
            Object[] objectArray = new Object[2];
            objectArray[0] = a.L().L();
            objectArray[1] = a2.H.L();
            OnyxClient.H.info("Started local proxy bridge for {} at {}", objectArray);
            return a2.H;
        }
    }
}

