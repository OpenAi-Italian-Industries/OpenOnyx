/*
 * Decompiled with CFR.
 */
package openonyx.connection.internal;

import com.google.gson.JsonObject;
import java.util.UUID;
import openonyx.connection.internal.NetworkSupport_467;
import openonyx.connection.internal.NetworkSupport_468;
import openonyx.connection.internal.NetworkSupport_470;
import openonyx.connection.internal.NetworkSupport_471;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.connection.internal.NetworkMode_472;
import openonyx.core.OnyxClient;
import openonyx.events.HypixelUtils;
import openonyx.input.InputSupport_002;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NetworkSupport_473 {
    private final static long c = 2148916238L;
    private final static int a = 401;
    private final static String k = "{\"Properties\":{\"SandboxId\":\"RETAIL\",\"UserTokens\":[\"%s\"]},\"RelyingParty\":\"rp://api.minecraftservices.com/\",\"TokenType\":\"JWT\"}";
    private final static String g = "{\"Properties\":{\"AuthMethod\":\"RPS\",\"SiteName\":\"user.auth.xboxlive.com\",\"RpsTicket\":\"%s\"},\"RelyingParty\":\"http://auth.xboxlive.com\",\"TokenType\":\"JWT\"}";
    private final static String M = "https://user.auth.xboxlive.com/user/authenticate";
    private final static long L = 2148916235L;
    private final static int j = 403;
    private final static String m = "https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize";
    final public static String h = "c36a9fb6-4f2a-41ff-90bd-ae7cc92031eb";
    private final static long l = 2148916233L;
    private final static String I = "{\"identityToken\":\"XBL3.0 x=%s;%s\"}";
    private final static int d = 500;
    private final static String i = "https://api.minecraftservices.com/minecraft/profile";
    private final static int f = 429;
    private final static String H = "https://xsts.auth.xboxlive.com/xsts/authorize";
    private final static String e = "https://api.minecraftservices.com/authentication/login_with_xbox";

    private NetworkSupport_473() {
        NetworkSupport_473 a;
    }

    private static NetworkSupport_474 d(NetworkSupport_467 a) {
        long l;
        long l2;
try {
            l = l2 = NetworkSupport_470.L(a.L(), "XErr", 0L);
        }
        catch (NetworkSupport_474 class_474) {
            l = 0L;
        }
        if (l == 2148916233L) {
            return new NetworkSupport_474("This Microsoft account has no Xbox profile");
        }
        if (0L == 2148916235L) {
            return new NetworkSupport_474("Xbox Live is unavailable in this region");
        }
        if (0L == 2148916238L) {
            return new NetworkSupport_474("Child account ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ must be added to a Microsoft family");
        }
        return new NetworkSupport_474(new StringBuilder().insert(0, "Xbox Live security check failed (").append(a.L()).append(")").toString());
    }

    public static boolean L() {
return NetworkMode_472.I.L();
    }

    public static NetworkSupport_471 L(String string, String string2) throws NetworkSupport_474 {
        String a = string2;
        String a2 = string;
NetworkSupport_473.L(NetworkMode_472.I);
        return NetworkSupport_473.L(new StringBuilder().insert(0, "client_id=").append(NetworkSupport_470.L(NetworkMode_472.I.I())).append("&redirect_uri=").append(NetworkSupport_470.L(a)).append("&scope=").append(NetworkSupport_470.L(NetworkMode_472.I.h())).append("&grant_type=authorization_code&code=").append(NetworkSupport_470.L(a2)).toString(), NetworkMode_472.I);
    }

    public static NetworkSupport_471 d(String string, NetworkMode_472 enum_472) throws NetworkSupport_474 {
        NetworkMode_472 a = enum_472;
        String a2 = string;
NetworkSupport_473.L(a);
        if (a2 == null || a2.isBlank()) {
            throw new NetworkSupport_474("No refresh token stored for this account");
        }
        String string2 = a2.replaceAll("\\s", "");
        String string3 = new StringBuilder().insert(0, "client_id=").append(NetworkSupport_470.L(a.I())).append("&grant_type=refresh_token").toString();
        if (a.d() != null) {
            string3 = new StringBuilder().insert(0, string3).append("&redirect_uri=").append(NetworkSupport_470.L(a.d())).toString();
        }
        string3 = new StringBuilder().insert(0, string3).append("&refresh_token=").append(NetworkSupport_470.L(string2)).append("&scope=").append(NetworkSupport_470.L(a.h())).toString();
        return NetworkSupport_473.L(string3, a);
    }

    private static NetworkSupport_474 L(NetworkSupport_467 class_467) {
        Object object;
        Object a;
        NetworkSupport_467 class_4672 = class_467;
Object[] objectArray = new Object[2];
        objectArray[0] = class_4672.L();
        objectArray[1] = class_4672.L();
        OnyxClient.H.error("Microsoft token endpoint returned {}: {}", objectArray);
        if (class_4672.L() == 429) {
            return new NetworkSupport_474("You are rate limited, try again in a moment");
        }
        if (class_4672.L() >= 500) {
            return new NetworkSupport_474("Microsoft services are unavailable");
        }
        try {
            JsonObject jsonObject = class_4672.L();
            String string = NetworkSupport_470.L(jsonObject, "error_description");
            String string2 = NetworkSupport_470.L(jsonObject, "error");
            object = a = string != null ? string : string2;
        }
        catch (NetworkSupport_474 class_474) {
            object = a = null;
        }
        if (object == null) {
            return new NetworkSupport_474(new StringBuilder().insert(0, "Microsoft rejected the login (").append(class_4672.L()).append(")").toString());
        }
        return new NetworkSupport_474(((String)a).replaceAll("\\s+", " ").trim());
    }

    /*
     * WARNING - void declaration
     */
    private static NetworkSupport_471 L(String string, String string2, NetworkMode_472 enum_472) throws NetworkSupport_474 {
        void a;
        void a2;
        String string3 = string;
Object[] objectArray = new Object[1];
        objectArray[0] = a2.D() + string3;
        Object a3 = NetworkSupport_470.L(M, g.formatted(objectArray), new String[0]);
        if (!((NetworkSupport_467)a3).L()) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, "Xbox Live rejected the login (").append(((NetworkSupport_467)a3).L()).append(")").toString());
        }
        JsonObject jsonObject = ((NetworkSupport_467)a3).L();
        a3 = NetworkSupport_470.L(jsonObject, "Token");
        Object object = NetworkSupport_470.L(jsonObject);
        if (a3 == null || object == null) {
            throw new NetworkSupport_474("Xbox Live returned no token");
        }
        if ((object = NetworkSupport_470.L((JsonObject)object, "uhs")) == null) {
            throw new NetworkSupport_474("Xbox Live returned no user hash");
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = a3;
        a3 = NetworkSupport_470.L(H, k.formatted(objectArray2), new String[0]);
        if (!((NetworkSupport_467)a3).L()) {
            throw NetworkSupport_473.d((NetworkSupport_467)a3);
        }
        String string4 = NetworkSupport_470.L((JsonObject)(a3 = ((NetworkSupport_467)a3).L()), "Token");
        if (string4 == null) {
            throw new NetworkSupport_474("Xbox Live returned no security token");
        }
        String string5 = (a3 = NetworkSupport_470.L((JsonObject)a3)) == null ? null : NetworkSupport_470.L((JsonObject)a3, "xid");
        Object[] objectArray3 = new Object[2];
        objectArray3[0] = object;
        objectArray3[1] = string4;
        a3 = NetworkSupport_470.L(e, I.formatted(objectArray3), new String[0]);
        if (((NetworkSupport_467)a3).L() == 403) {
            throw new NetworkSupport_474("This build's Azure app is not approved for the Minecraft API");
        }
        if (!((NetworkSupport_467)a3).L()) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, "Minecraft services rejected the login (").append(((NetworkSupport_467)a3).L()).append(")").toString());
        }
        object = NetworkSupport_470.L((JsonObject)(a3 = ((NetworkSupport_467)a3).L()), "access_token");
        if (object == null) {
            throw new NetworkSupport_474("Minecraft services returned no access token");
        }
        long l = System.currentTimeMillis() + NetworkSupport_470.L((JsonObject)a3, "expires_in", 86400L) * 1000L;
        String[] stringArray = new String[4];
        stringArray[0] = "Authorization";
        stringArray[1] = new StringBuilder().insert(0, "Bearer ").append((String)object).toString();
        stringArray[2] = "Accept";
        stringArray[3] = "application/json";
        a3 = NetworkSupport_470.L(i, stringArray);
        if (!((NetworkSupport_467)a3).L()) {
            throw new NetworkSupport_474("This account does not own Minecraft");
        }
        JsonObject jsonObject2 = ((NetworkSupport_467)a3).L();
        a3 = NetworkSupport_470.L(jsonObject2, "name");
        string4 = NetworkSupport_470.L(jsonObject2, "id");
        if (a3 == null || string4 == null) {
            throw new NetworkSupport_474("Minecraft returned an incomplete profile");
        }
        return new NetworkSupport_471((NetworkMode_472)a2, (String)a, (String)object, l, NetworkSupport_473.L(string4), (String)a3, string5);
    }

    /*
     * WARNING - void declaration
     */
    private static NetworkSupport_471 L(String string, NetworkMode_472 enum_472) throws NetworkSupport_474 {
        void a;
        String string2 = string;
Object a2 = NetworkSupport_470.L(a.L(), string2);
        if (!((NetworkSupport_467)a2).L()) {
            throw NetworkSupport_473.L((NetworkSupport_467)a2);
        }
        JsonObject jsonObject = ((NetworkSupport_467)a2).L();
        a2 = NetworkSupport_470.L(jsonObject, "access_token");
        String string3 = NetworkSupport_470.L(jsonObject, "refresh_token");
        if (a2 == null) {
            throw new NetworkSupport_474("Microsoft did not return an access token");
        }
        if (string3 == null) {
            throw new NetworkSupport_474("Microsoft did not return a refresh token");
        }
        return NetworkSupport_473.L((String)a2, string3, (NetworkMode_472)a);
    }

    private static void L(NetworkMode_472 a) throws NetworkSupport_474 {
if (!a.L()) {
            throw new NetworkSupport_474("No Azure client id configured ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ set MicrosoftAuth.CLIENT_ID");
        }
    }

    public static NetworkSupport_468 L(String string) throws NetworkSupport_474 {
        String string2 = string;
if (string2 == null || string2.isBlank()) {
            throw new NetworkSupport_474("No access token provided");
        }
        String[] stringArray = new String[4];
        stringArray[0] = "Authorization";
        stringArray[1] = "Bearer " + string2.trim();
        stringArray[2] = "Accept";
        stringArray[3] = "application/json";
        Object a = NetworkSupport_470.L(i, stringArray);
        if (((NetworkSupport_467)a).L() == 401) {
            throw new NetworkSupport_474("Access token is invalid or expired");
        }
        if (!((NetworkSupport_467)a).L()) {
            throw new NetworkSupport_474(new StringBuilder().insert(0, "Minecraft services rejected the token (").append(((NetworkSupport_467)a).L()).append(")").toString());
        }
        JsonObject jsonObject = ((NetworkSupport_467)a).L();
        a = NetworkSupport_470.L(jsonObject, "name");
        String string3 = NetworkSupport_470.L(jsonObject, "id");
        if (a == null || string3 == null) {
            throw new NetworkSupport_474("Minecraft returned an incomplete profile");
        }
        return new NetworkSupport_468(NetworkSupport_473.L(string3), (String)a);
    }

    public static UUID L(String string) throws NetworkSupport_474 {
        String string2 = string;
String a22 = string2.replace("-", "").trim();
        if (a22.length() != 32) {
            throw new NetworkSupport_474("Malformed profile id");
        }
        try {
            int n = 0;
            return UUID.fromString(new StringBuilder().insert(n, a22.substring(n, 8)).append("-").append(a22.substring(8, 12)).append("-").append(a22.substring(12, 16)).append("-").append(a22.substring(16, 20)).append("-").append(a22.substring(20)).toString());
        }
        catch (IllegalArgumentException a22) {
            throw new NetworkSupport_474("Malformed profile id", a22);
        }
    }

    public static String L(String a) {
return new StringBuilder().insert(0, "https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize?client_id=").append(NetworkSupport_470.L(NetworkMode_472.I.I())).append("&redirect_uri=").append(NetworkSupport_470.L(a)).append("&response_type=code&display=touch&scope=").append(NetworkSupport_470.L(NetworkMode_472.I.h())).append("&prompt=select_account").toString();
    }
}

