/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.connection;

import com.google.gson.JsonObject;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.util.Session;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.NetworkMode_462;
import openonyx.connection.internal.NetworkSupport_471;
import openonyx.connection.internal.NetworkSupport_473;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.connection.internal.NetworkMode_472;
import openonyx.movement.MovementSupport_088;
import openonyx.render.group_i.RenderSupport_145;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkSupport_459
extends NetworkSupport_458 {
    private long l;
    private String I;
    private String d;
    private String f;
    private NetworkMode_472 H;
    private final static long e = 60000L;

    public static NetworkSupport_459 L(String string) throws NetworkSupport_474 {
        String string2 = string;
try {
            return NetworkSupport_459.L(string2, NetworkMode_472.h);
        }
        catch (NetworkSupport_474 a) {
            if (!NetworkMode_472.I.L()) {
                throw a;
            }
            try {
                return NetworkSupport_459.L(string2, NetworkMode_472.I);
            }
            catch (NetworkSupport_474 class_474) {
                throw new NetworkSupport_474(new StringBuilder().insert(0, "No client id accepted this token. Live: ").append(a.getMessage()).append(" | Azure: ").append(class_474.getMessage()).toString());
            }
        }
    }

    @Override
    protected void d(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_459 a2 = this;
Object object = a;
        ((JsonObject)object).addProperty("refreshToken", a2.I);
        NetworkSupport_459 class_459 = a2;
        ((JsonObject)object).addProperty("flavour", class_459.H.i());
        if (class_459.d == null) {
            return;
        }
        a.addProperty("accessToken", a2.d);
        a.addProperty("expiresAt", a2.l);
        if (a2.f != null) {
            a.addProperty("xuid", a2.f);
        }
    }

    @Override
    public void L() throws NetworkSupport_474 {
        NetworkSupport_459 a;
NetworkSupport_459 class_459 = a;
        class_459.L(NetworkSupport_473.d(a.I, class_459.H));
    }

    @Override
    public Session L() throws NetworkSupport_474 {
        NetworkSupport_459 a;
if (a.d == null || System.currentTimeMillis() > a.l - 60000L) {
            a.L();
        }
        NetworkSupport_459 class_459 = a;
        return new Session(class_459.i, UUIDTypeAdapter.fromUUID((UUID)class_459.e), a.d, "mojang");
    }

    @Override
    public String d() {
        NetworkSupport_459 a;
return a.d;
    }

    public static NetworkSupport_459 L(NetworkSupport_471 a) {
NetworkSupport_459 class_459 = new NetworkSupport_459(a.L());
        class_459.L(a);
        return class_459;
    }

    @Override
    public String L() {
        NetworkSupport_459 a;
return a.I;
    }

    public static NetworkSupport_459 L(String string, NetworkMode_472 enum_472) throws NetworkSupport_474 {
        Object a = enum_472;
        String a2 = string;
return NetworkSupport_459.L(NetworkSupport_473.d(a2, (NetworkMode_472)((Object)a)));
    }

    @Generated
    public NetworkMode_472 L() {
        NetworkSupport_459 a;
return a.H;
    }

    @Override
    protected void L(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_459 a2 = this;
NetworkSupport_459 class_459 = a2;
        Object object = a;
        NetworkSupport_459 class_4592 = a2;
        class_4592.I = NetworkSupport_459.L(a, "refreshToken");
        class_4592.H = NetworkMode_472.L(NetworkSupport_459.L(a, "flavour"));
        a2.d = NetworkSupport_459.L((JsonObject)object, "accessToken");
        class_459.l = NetworkSupport_459.L((JsonObject)object, "expiresAt", 0L);
        class_459.f = NetworkSupport_459.L(a, "xuid");
    }

    @Override
    public long d() {
        NetworkSupport_459 a;
return a.l;
    }

    private void L(NetworkSupport_471 class_471) {
        NetworkSupport_471 a = class_471;
        NetworkSupport_459 a2 = this;
NetworkSupport_459 class_459 = a2;
        Object object = a;
        NetworkSupport_459 class_4592 = a2;
        Object object2 = a;
        a2.i = a.L();
        a2.e = (long)((NetworkSupport_471)object2).L();
        class_4592.H = ((NetworkSupport_471)object2).L();
        class_4592.I = a.i();
        a2.d = ((NetworkSupport_471)object).d();
        class_459.l = ((NetworkSupport_471)object).L();
        class_459.f = a.D();
    }

    @Generated
    public String i() {
        NetworkSupport_459 a;
return a.I;
    }

    public NetworkSupport_459(String string) {
        String a = string;
        NetworkSupport_459 a2 = this;
        super(NetworkMode_462.I, a);
        a2.H = NetworkMode_472.h;
    }
}

