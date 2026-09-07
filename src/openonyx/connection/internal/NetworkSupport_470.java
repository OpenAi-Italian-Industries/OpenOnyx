/*
 * Decompiled with CFR.
 */
package openonyx.connection.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import openonyx.connection.internal.NetworkSupport_467;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.core.OnyxClient;
import openonyx.render.RenderSupport_099;
import openonyx.ui.UiSupport_546;

public final class NetworkSupport_470 {
    private final static int H = 20000;
    private final static String e = "okhttp/4.12.0";

    public static NetworkSupport_467 L(String string, int n) throws NetworkSupport_474 {
        int a = -35;
        String a2 = string;
return NetworkSupport_470.L(a2, "GET", null, 0, OnyxClient.f.L().L(), new String[0]);
    }

    public static String L(String a) {
return URLEncoder.encode(a, StandardCharsets.UTF_8);
    }

    public static NetworkSupport_467 L(String string, String ... stringArray) throws NetworkSupport_474 {
        String[] a = stringArray;
        String a2 = string;
return NetworkSupport_470.L(a2, 20000, a);
    }

    /*
     * Unable to fully structure code
     */
    private static NetworkSupport_467 L(String var0, String var1_2, String var2_3, int var3_5, Proxy var4_9, String ... var5_10) throws NetworkSupport_474 {
        a = var1_2;
        a = var0;
try {
            var6_11 = (HttpURLConnection)new URL(a).openConnection((Proxy)a);
        }
        catch (IOException | ClassCastException var7_12) {
            throw new NetworkSupport_474("Invalid request URL", var7_12);
        }
        try {
            block23: {
                block20: {
                    var6_11.setConnectTimeout((int)a);
                    v0 = var6_11;
                    v1 = var6_11;
                    v1.setReadTimeout((int)a);
                    v1.setInstanceFollowRedirects((boolean)(3 ^ 3));
                    v0.setRequestMethod((String)a);
                    v0.setRequestProperty("User-Agent", "okhttp/4.12.0");
                    v2 = var7_13 = 2 & 5;
                    while (v2 + 1 < ((void)a).length) {
                        v3 = a[var7_13];
                        v4 = var7_13 + (2 ^ 3);
                        var6_11.setRequestProperty((String)v3, (String)a[v4]);
                        v2 = var7_13 += 2;
                    }
                    if (a == null) break block20;
                    var7_14 = a.getBytes(StandardCharsets.UTF_8);
                    v5 = var6_11;
                    v5.setDoOutput((boolean)(3 & 5));
                    v5.setFixedLengthStreamingMode(var7_14.length);
                    a = var6_11.getOutputStream();
                    try {
                        a.write(var7_14);
                        if (a == null) break block20;
                        v6 = var6_11;
                    }
                    catch (Throwable var8_17) {
                        block21: {
                            if (a != null) {
                                try {
                                    a.close();
                                    v7 = var8_17;
                                    break block21;
                                }
                                catch (Throwable a) {
                                    var8_17.addSuppressed(a);
                                }
                            }
                            v7 = var8_17;
                        }
                        throw v7;
                    }
                    a.close();
                    break block23;
                }
                v6 = var6_11;
            }
            var7_15 = v6.getResponseCode();
            a = var7_15 >= (13722 & 19445) ? var6_11.getErrorStream() : var6_11.getInputStream();
            var8_18 = "";
            if (a != null) {
                a = a;
                try {
                    var8_18 = new String(a.readAllBytes(), StandardCharsets.UTF_8);
                    ** if (a == null) goto lbl-1000
                }
                catch (Throwable var9_20) {
                    block22: {
                        if (a != null) {
                            try {
                                a.close();
                                v8 = var9_20;
                                break block22;
                            }
                            catch (Throwable a) {
                                var9_20.addSuppressed(a);
                            }
                        }
                        v8 = var9_20;
                    }
                    throw v8;
                }
lbl-1000:
                // 1 sources

                {
                    a.close();
                }
lbl-1000:
                // 2 sources

                {
                }
            }
            a = new NetworkSupport_467(var7_15, var8_18);
            return a;
        }
        catch (IOException var7_16) {
            a = a.type() == Proxy.Type.DIRECT ? null : OnyxClient.f.L().d();
            var8_19 = a == null || a.isBlank() != false ? var7_16.getMessage() : a;
            throw new NetworkSupport_474(new StringBuilder().insert(2 & 5, "Network error: ").append(var8_19).toString(), var7_16);
        }
        finally {
            var6_11.disconnect();
        }
    }

    public static String L(JsonObject jsonObject, String string) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isString()) {
            return null;
        }
        return ((JsonElement)a).getAsString();
    }

    public static NetworkSupport_467 L(String string, String string2) throws NetworkSupport_474 {
        String a = string2;
        String a2 = string;
String[] stringArray = new String[2];
        stringArray[0] = "Content-Type";
        stringArray[1] = "application/x-www-form-urlencoded";
        return NetworkSupport_470.L(a2, "POST", a, 20000, NetworkSupport_470.L(), stringArray);
    }

    public static JsonObject L(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
JsonElement a = jsonObject2.get("DisplayClaims");
        if (a == null || !a.isJsonObject()) {
            return null;
        }
        if ((a = a.getAsJsonObject().get("xui")) == null || !a.isJsonArray()) {
            return null;
        }
        if (((JsonArray)(a = a.getAsJsonArray())).size() == 0 || !((JsonArray)a).get(0).isJsonObject()) {
            return null;
        }
        return ((JsonArray)a).get(0).getAsJsonObject();
    }

    /*
     * WARNING - void declaration
     */
    public static NetworkSupport_467 L(String string, String string2, String ... stringArray) throws NetworkSupport_474 {
        void a;
        void a2;
        String string3 = string;
String[] a3 = new String[((void)a2).length + 4];
        a3[0] = "Content-Type";
        a3[1] = "application/json";
        a3[2] = "Accept";
        a3[3] = "application/json";
        System.arraycopy(a2, 0, a3, 4, ((void)a2).length);
        return NetworkSupport_470.L(string3, "POST", (String)a, 20000, NetworkSupport_470.L(), a3);
    }

    /*
     * WARNING - void declaration
     */
    public static NetworkSupport_467 L(String string, int n, String ... stringArray) throws NetworkSupport_474 {
        void a;
        String[] a2 = stringArray;
        String a3 = string;
return NetworkSupport_470.L(a3, "GET", null, (int)a, NetworkSupport_470.L(), a2);
    }

    private NetworkSupport_470() {
        NetworkSupport_470 a;
    }

    private static Proxy L() {
return OnyxClient.f.d();
    }

    /*
     * WARNING - void declaration
     */
    public static long L(JsonObject jsonObject, String string, long l) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isNumber()) {
            void a3;
            return (long)a3;
        }
        return ((JsonElement)a).getAsLong();
    }
}

