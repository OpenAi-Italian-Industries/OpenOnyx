/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.connection;

import com.google.gson.JsonObject;
import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.util.Session;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.NetworkMode_462;
import openonyx.connection.internal.NetworkSupport_467;
import openonyx.connection.internal.NetworkSupport_470;
import openonyx.connection.internal.NetworkSupport_473;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.render.RenderSupport_099;
import openonyx.render.RenderSupport_111;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkSupport_466
extends NetworkSupport_458 {
    private final static String f = "https://api.mojang.com/users/profiles/minecraft/";
    private boolean H;
    private final static String e = "-";

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        NetworkSupport_466 a2 = this;
a2.H = a;
    }

    @Override
    public Session L() throws NetworkSupport_474 {
        NetworkSupport_466 a;
if (a.e == null) {
            a.L();
        }
        NetworkSupport_466 class_466 = a;
        return new Session(class_466.i, UUIDTypeAdapter.fromUUID((UUID)((Object)class_466.e)), e, "legacy");
    }

    @Override
    protected void L(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_466 a2 = this;
a2.H = NetworkSupport_466.L(a, "premiumUuid", 0 != 0);
    }

    @Override
    public void L() throws NetworkSupport_474 {
        NetworkSupport_466 class_466 = this;
if (!class_466.H) {
            class_466.e = NetworkSupport_466.L(class_466.i);
            return;
        }
        Object a = NetworkSupport_470.L(new StringBuilder().insert(0, f).append(NetworkSupport_470.L(class_466.i)).toString(), new String[0]);
        if (!((NetworkSupport_467)a).L()) {
            class_466.e = NetworkSupport_466.L(class_466.i);
            return;
        }
        JsonObject jsonObject = ((NetworkSupport_467)a).L();
        a = NetworkSupport_470.L(jsonObject, "id");
        String string = NetworkSupport_470.L(jsonObject, "name");
        if (a == null) {
            class_466.e = NetworkSupport_466.L(class_466.i);
            return;
        }
        if (string != null) {
            class_466.i = string;
        }
        class_466.e = NetworkSupport_473.L((String)a);
    }

    @Generated
    public boolean L() {
        NetworkSupport_466 a;
return a.H;
    }

    public static UUID L(String a) {
return UUID.nameUUIDFromBytes(new StringBuilder().insert(0, "OfflinePlayer:").append(a).toString().getBytes(StandardCharsets.UTF_8));
    }

    public NetworkSupport_466(String string) {
        String a = string;
        NetworkSupport_466 a2 = this;
        super(NetworkMode_462.e, a);
        a2.e = NetworkSupport_466.L(a);
    }

    @Override
    protected void d(JsonObject jsonObject) {
        JsonObject a = jsonObject;
        NetworkSupport_466 a2 = this;
a.addProperty("premiumUuid", a2.H);
    }
}

