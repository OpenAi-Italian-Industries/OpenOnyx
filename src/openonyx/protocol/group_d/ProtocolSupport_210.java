/*
 * Decompiled with CFR.
 */
package openonyx.protocol.group_d;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import openonyx.core.OnyxListener_001;
import openonyx.protocol.group_m.ProtocolSupport_211;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_477;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ProtocolSupport_210
implements OnyxListener_001 {
    private final static double e = 0.15;

    public static double d() {
return (float)(ProtocolSupport_210.L() * 0.15);
    }

    public static ProtocolSupport_212 L(ProtocolSupport_212 a, double a22, double a3) {
ProtocolSupport_211 a22 = ProtocolSupport_210.L(a22, a3);
        return new ProtocolSupport_212(a.L() + a22.d(), MathHelper.clamp_float(a.i() + a22.D(), -90.0f, 90.0f));
    }

    /*
     * WARNING - void declaration
     */
    public static float L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
if (a3 < a) {
            return (float)a;
        }
        if (a3 > a2) {
            return a2;
        }
        return a3;
    }

    public static void L(EntityPlayerSP entityPlayerSP, ProtocolSupport_212 class_212) {
        Object a = class_212;
        EntityPlayerSP a2 = entityPlayerSP;
a = ((ProtocolSupport_212)a).L();
        EntityPlayerSP entityPlayerSP2 = a2;
        EntityPlayerSP entityPlayerSP3 = a2;
        entityPlayerSP3.prevRotationPitch = entityPlayerSP3.rotationPitch;
        entityPlayerSP3.prevRotationYaw = entityPlayerSP3.rotationYaw;
        entityPlayerSP3.renderYawOffset = entityPlayerSP3.rotationYaw;
        entityPlayerSP3.prevRenderYawOffset = entityPlayerSP3.rotationYaw;
        entityPlayerSP2.rotationYaw = ((ProtocolSupport_212)a).L();
        entityPlayerSP2.rotationPitch = ((ProtocolSupport_212)a).i();
    }

    public static float L(Entity entity) {
        Entity entity2 = entity;
if (ProtocolSupport_210.e.thePlayer == null) {
            return 0.0f;
        }
        ProtocolSupport_212 a = ProtocolSupport_212.L(entity2.getEntityBoundingBox().getCenter(), ProtocolSupport_210.e.thePlayer.getPositionEyes(1.0f));
        return UtilitySupport_477.L((Entity)ProtocolSupport_210.e.thePlayer).L(a);
    }

    public static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
return MathHelper.wrapAngleTo180_float(a2 - a);
    }

    private static double L() {
float f2 = (float)((double)ProtocolSupport_210.e.gameSettings.mouseSensitivity) * 0.6f + 0.2f;
        return f2 * f2 * f2 * 8.0f;
    }

    public static float L(EntityPlayerSP entityPlayerSP, ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        EntityPlayerSP a2 = entityPlayerSP;
return a.L() + ProtocolSupport_210.L(a2.rotationYaw, a.L());
    }

    public static ProtocolSupport_211 L(double a, double a2) {
return new ProtocolSupport_211((float)(a * 0.15), (float)(a2 * 0.15));
    }

    private ProtocolSupport_210() {
        ProtocolSupport_210 a;
    }
}

