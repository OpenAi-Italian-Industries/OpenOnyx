/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.RayTraceMode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RayTraceUtils
implements OnyxListener_001 {
    public static ProtocolSupport_212 L() {
ProtocolSupport_212 class_212 = ProtocolSupport_207.I.D();
        if (class_212 != null) {
            return class_212;
        }
        return UtilitySupport_477.L((Entity)RayTraceUtils.e.thePlayer);
    }

    /*
     * WARNING - void declaration
     */
    public static MovingObjectPosition L(ProtocolSupport_212 class_212, double d, RayTraceMode enum_490, boolean bl, float f2) {
        void a;
        void a2;
        void a3;
        void a4;
        float f3 = f2;
        ProtocolSupport_212 a5 = class_212;
return RayTraceUtils.L((double)a4, (RayTraceMode)a3, (boolean)a2, RayTraceUtils.e.thePlayer.getPositionEyes(0.0f), a5.L(), e.getRenderViewEntity());
    }

    public static MovingObjectPosition L(ProtocolSupport_212 a, double a2) {
return RayTraceUtils.L(a, a2, RayTraceMode.e, 3 >> 2, 1.0f);
    }

    /*
     * WARNING - void declaration
     */
    public static MovingObjectPosition L(double d, RayTraceMode object, boolean bl, Vec3 vec3, Vec3 vec32, Entity entity) {
        void a;
        double a2;
        Vec3 a3;
        void a4;
        RayTraceMode enum_490 = object;
        object = vec32;
        RayTraceMode a5 = enum_490;
a3 = a4.addVector(a3.xCoord * a2, a3.yCoord * a2, a3.zCoord * a2);
        return RayTraceUtils.e.theWorld.rayTraceBlocks((Vec3)a4, a3, (boolean)a, a5.L(), 0 != 0);
    }

    public static MovingObjectPosition L(ProtocolSupport_212 a) {
return RayTraceUtils.L(a, RayTraceUtils.L(), RayTraceMode.e, 0 != 0, 1.0f);
    }

    public static MovingObjectPosition L() {
return RayTraceUtils.L(RayTraceUtils.L(), RayTraceUtils.L(), RayTraceMode.e, 3 >> 2, 1.0f);
    }

    private RayTraceUtils() {
        RayTraceUtils a;
    }

    /*
     * WARNING - void declaration
     */
    public static MovingObjectPosition L(double d, RayTraceMode object, boolean bl, Vec3 vec3, Vec3 vec32) {
        void a;
        void a2;
        void a3;
        double a4;
        RayTraceMode enum_490 = object;
        object = vec32;
        RayTraceMode a5 = enum_490;
return RayTraceUtils.L(a4, a5, (boolean)a3, (Vec3)a2, (Vec3)a, e.getRenderViewEntity());
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(Vec3 vec3, Vec3 vec32, Entity entity) {
        void a;
        Entity a2 = entity;
        Vec3 a3 = vec3;
boolean bl = 0;
        if (a2.worldObj.rayTraceBlocks(a3, (Vec3)a, bl, --1 != 0, bl) == null) {
            return 1 != 0;
        }
        return false;
    }

    public static double L() {
return RayTraceUtils.e.playerController.getBlockReachDistance();
    }

    public static boolean L(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
return RayTraceUtils.L(a2, a, RayTraceUtils.e.thePlayer);
    }
}

