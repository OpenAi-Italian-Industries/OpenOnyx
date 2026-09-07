/*
 * Decompiled with CFR.
 */
package openonyx.connection;

import com.google.gson.JsonObject;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import net.minecraft.util.Session;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.NetworkMode_462;
import openonyx.connection.internal.NetworkSupport_468;
import openonyx.connection.internal.NetworkSupport_473;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.input.InputSupport_002;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkSupport_464
extends NetworkSupport_458 {
    private String e;

    @Override
    protected void L(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_464 a2 = this;
a2.e = NetworkSupport_464.L(a, "accessToken");
    }

    @Override
    public Session L() throws NetworkSupport_474 {
        NetworkSupport_464 a;
if (a.e == null || a.e.isBlank()) {
            throw new NetworkSupport_474("No access token stored for this account");
        }
        if (a.e == null) {
            a.L();
        }
        NetworkSupport_464 class_464 = a;
        return new Session(class_464.i, UUIDTypeAdapter.fromUUID((UUID)((Object)class_464.e)), a.e, "mojang");
    }

    @Override
    protected void d(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_464 a2 = this;
if (a2.e != null) {
            a.addProperty("accessToken", a2.e);
        }
    }

    public NetworkSupport_464(String string) {
        String a = string;
        NetworkSupport_464 a2 = this;
        super(NetworkMode_462.l, a);
    }

    public static NetworkSupport_464 L(String string) throws NetworkSupport_474 {
        String string2 = string;
NetworkSupport_468 a = NetworkSupport_473.L(string2);
        NetworkSupport_464 class_464 = new NetworkSupport_464(a.L());
        class_464.e = a.L();
        class_464.e = string2.trim();
        return class_464;
    }

    @Override
    public void L() throws NetworkSupport_474 {
        NetworkSupport_464 class_464 = this;
NetworkSupport_468 a = NetworkSupport_473.L(class_464.e);
        class_464.i = a.L();
        class_464.e = a.L();
    }

    @Override
    public String d() {
        NetworkSupport_464 a;
return a.e;
    }
}

