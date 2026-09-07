/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.connection;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.util.Session;
import openonyx.connection.NetworkSupport_454;
import openonyx.connection.NetworkSupport_459;
import openonyx.connection.NetworkSupport_464;
import openonyx.connection.NetworkSupport_466;
import openonyx.connection.NetworkMode_462;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.input.InputSupport_005;
import openonyx.ui.UiSupport_551;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class NetworkSupport_458 {
    protected String i;
    private final NetworkMode_462 f;
    protected long H;
    protected UUID e;

    /*
     * WARNING - void declaration
     */
    protected static long L(JsonObject jsonObject, String string, long l) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isNumber()) {
            void a3;
            return (long)a3;
        }
        return ((JsonElement)a).getAsLong();
    }

    /*
     * WARNING - void declaration
     */
    protected NetworkSupport_458(NetworkMode_462 enum_462, String string) {
        void a;
        NetworkSupport_458 a2;
        String a3 = string;
        NetworkSupport_458 class_458 = a2 = this;
        class_458.f = a;
        class_458.i = a3;
        class_458.H = System.currentTimeMillis();
    }

    @Generated
    public String D() {
        NetworkSupport_458 a;
return a.i;
    }

    public abstract void L() throws NetworkSupport_474;

    @Generated
    public UUID L() {
        NetworkSupport_458 a;
return a.e;
    }

    public String d() {
return null;
    }

    public String L() {
return null;
    }

    protected static String L(JsonObject jsonObject, String string) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isString()) {
            return null;
        }
        return ((JsonElement)a).getAsString();
    }

    public long d() {
return 0L;
    }

    public abstract Session L() throws NetworkSupport_474;

    public final JsonObject L() {
        Object a;
        NetworkSupport_458 class_458 = this;
Object object = a = new JsonObject();
        ((JsonObject)object).addProperty("type", class_458.f.d());
        ((JsonObject)object).addProperty("name", class_458.i);
        NetworkSupport_458 class_4582 = class_458;
        ((JsonObject)object).addProperty("addedAt", class_4582.H);
        if (class_4582.e != null) {
            ((JsonObject)a).addProperty("uuid", class_458.e.toString());
        }
        class_458.d((JsonObject)a);
        return a;
    }

    protected abstract void d(JsonObject var1);

    /*
     * WARNING - void declaration
     */
    protected static boolean L(JsonObject jsonObject, String string, boolean bl) {
        Object a = string;
        JsonObject a2 = jsonObject;
a = a2.get((String)a);
        if (a == null || !((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isBoolean()) {
            void a3;
            return (boolean)a3;
        }
        return ((JsonElement)a).getAsBoolean();
    }

    @Generated
    public long L() {
        NetworkSupport_458 a;
return a.H;
    }

    public static NetworkSupport_458 L(JsonObject jsonObject) {
        JsonObject jsonObject2;
        Object object;
        JsonObject jsonObject3;
        block11: {
            jsonObject3 = jsonObject;
object = NetworkMode_462.L(NetworkSupport_458.L(jsonObject3, "type"));
            if (object == null) {
                return null;
            }
            Object a = NetworkSupport_458.L(jsonObject3, "name");
            if (a == null || ((String)a).isBlank()) {
                return null;
            }
            object = switch (NetworkSupport_454.e[((Enum)object).ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> new NetworkSupport_466((String)a);
                case 2 -> new NetworkSupport_464((String)a);
                case 3 -> new NetworkSupport_459((String)a);
            };
            a = NetworkSupport_458.L(jsonObject3, "uuid");
            if (a != null) {
                try {
                    ((NetworkSupport_458)object).e = UUID.fromString((String)a);
                    jsonObject2 = jsonObject3;
                    break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
            jsonObject2 = jsonObject3;
        }
        JsonElement jsonElement = jsonObject2.get("addedAt");
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            ((NetworkSupport_458)object).H = jsonElement.getAsLong();
        }
        Object object2 = object;
        ((NetworkSupport_458)object2).L(jsonObject3);
        return object2;
    }

    protected abstract void L(JsonObject var1);

    @Generated
    public NetworkMode_462 L() {
        NetworkSupport_458 a;
return a.f;
    }
}

