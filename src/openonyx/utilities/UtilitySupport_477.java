/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.utilities;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.core.OnyxListener_001;
import openonyx.movement.MovementSupport_084;
import openonyx.movement.MovementSupport_086;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_483;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.UtilitySupport_496;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UtilitySupport_477
implements OnyxListener_001 {
    private static int d;
    final public static UtilitySupport_477 i;
    private static int f;
    final public static float H = 0.6f;
    final public static float e = 1.8f;

    public static Vec3 L(Vec3 a, double a2) {
return UtilitySupport_477.L(a, a2, 1.0, UtilitySupport_477.L(UtilitySupport_477.e.thePlayer));
    }

    public static MovementInputState L(EntityPlayerSP a) {
if (a == null || a.movementInput == null) {
            return MovementInputState.i;
        }
        return new MovementInputState(a.movementInput.untransformedForward, a.movementInput.untransformedStrafe);
    }

    public static float L(float f2, MovementInputState class_478) {
        MovementInputState class_4782;
        float f3;
        MovementInputState a = class_478;
        float a2 = f2;
float f4 = a2;
        if (a.I() && !a.d()) {
            f4 += 180.0f;
            f3 = -0.5f;
            class_4782 = a;
        } else if (a.d() && !a.I()) {
            f3 = 0.5f;
            class_4782 = a;
        } else {
            f3 = 1.0f;
            class_4782 = a;
        }
        if (class_4782.L() && !a.D()) {
            f4 -= 90.0f * f3;
        }
        if (a.D() && !a.L()) {
            f4 += 90.0f * f3;
        }
        return f4;
    }

    public static ProtocolSupport_212 d(Entity a) {
Entity entity = a;
        return new ProtocolSupport_212(entity.prevRotationYaw, entity.prevRotationPitch, 3 >> 1);
    }

    public static float L(EntityPlayerSP entityPlayerSP, MovementInputState class_478) {
        MovementInputState a = class_478;
        EntityPlayerSP a2 = entityPlayerSP;
return UtilitySupport_477.L(a2.rotationYaw, a);
    }

    public static AxisAlignedBB L(Vec3 a) {
double d = 0.3f;
        return new AxisAlignedBB(a.xCoord - d, a.yCoord, a.zCoord - d, a.xCoord + d, a.yCoord + (double)1.8f, a.zCoord + d);
    }

    public static double d(Entity entity, Entity entity2) {
        Entity a = entity2;
        Entity a2 = entity;
return Math.sqrt(UtilitySupport_477.L(a2, a));
    }

    public static boolean d(EntityPlayerSP a) {
EntityPlayerSP entityPlayerSP = a;
        return UtilitySupport_477.L(entityPlayerSP, UtilitySupport_477.L(entityPlayerSP), 0.1, UtilitySupport_477.D((Entity)a));
    }

    public static double L(AxisAlignedBB axisAlignedBB, Vec3 vec3) {
        Vec3 a = vec3;
        AxisAlignedBB a2 = axisAlignedBB;
AxisAlignedBB axisAlignedBB2 = a2;
        double d = Math.max(Math.max(axisAlignedBB2.minX - a.xCoord, a.xCoord - a2.maxX), 0.0);
        double d2 = Math.max(Math.max(axisAlignedBB2.minY - a.yCoord, a.yCoord - a2.maxY), 0.0);
        double d3 = Math.max(Math.max(axisAlignedBB2.minZ - a.zCoord, a.zCoord - a2.maxZ), 0.0);
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public static boolean L(EntityPlayer entityPlayer, Vec3 vec3) {
        Object a = vec3;
        EntityPlayer a2 = entityPlayer;
EntityPlayer entityPlayer2 = a2;
        a = UtilitySupport_477.L((Vec3)a).expand(-0.05, 0.0, -0.05).offset(0.0, entityPlayer2.fallDistance - entityPlayer2.stepHeight, 0.0);
        return UtilitySupport_477.e.theWorld.getCollidingBoundingBoxes(a2, (AxisAlignedBB)a).isEmpty();
    }

    public static Vec3 L(Vec3 a) {
Vec3 vec3 = a;
        return UtilitySupport_477.L(vec3, Math.sqrt(a.xCoord * vec3.xCoord + a.zCoord * a.zCoord), 1.0, UtilitySupport_477.L(UtilitySupport_477.e.thePlayer));
    }

    static {
        i = new UtilitySupport_477();
    }

    public static int d(EntityPlayerSP a) {
return f;
    }

    public UtilitySupport_477() {
        UtilitySupport_477 a;
    }

    public static boolean L(EntityPlayerSP a) {
return UtilitySupport_477.d(a) != 0.0f || UtilitySupport_477.D(a) != 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    public static Vec3 L(Vec3 object, double d, double d2, MovementInputState class_478, float f2) {
        double a;
        void a2;
        double a3;
        Vec3 a4;
        Vec3 vec3 = object;
        object = class_478;
        Vec3 a5 = vec3;
if (a4 != null && !((MovementInputState)((Object)a4)).i()) {
            return new Vec3(0.0, a5.yCoord, 0.0);
        }
        double d3 = 1.0 - a3;
        Vec3 vec32 = a5;
        double d4 = vec32.xCoord * d3;
        d3 = vec32.zCoord * d3;
        a *= a3;
        a3 = Math.toRadians((double)a2);
        d4 -= Math.sin(a3) * a;
        a = d3 + Math.cos(a3) * a;
        return new Vec3(d4, a5.yCoord, a);
    }

    public static double L(Entity entity, Entity entity2) {
        Entity a = entity2;
        Entity a2 = entity;
return UtilitySupport_477.L(a2, a.getPositionEyes(1.0f));
    }

    public static Vec3 D(Entity a) {
return new Vec3(a.posX, a.posY, a.posZ);
    }

    public static Vec3 L(Vec3 vec3, float f2, float f3) {
        float a;
        float f4;
        double d;
        float a22 = f2;
        Vec3 a3 = vec3;
double d2 = a3.lengthSqr();
        if (d < 1.0E-7) {
            return Vec3.ZERO;
        }
        Vec3 vec32 = a3;
        if (d2 > 1.0) {
            vec32 = vec32.normalize();
            f4 = 0;
        } else {
            f4 = 0;
        }
        Vec3 a22 = vec32.scale(f4);
        float f5 = MathHelper.sin((float)(a * (float)Math.PI / 180.0f));
        a = MathHelper.cos((float)(a * (float)Math.PI / 180.0f));
        return new Vec3(a22.xCoord * (double)a - a22.zCoord * (double)f5, a22.yCoord, a22.zCoord * (double)a + a22.xCoord * (double)f5);
    }

    public static float D(EntityPlayerSP a) {
if (a.movementInput == null) {
            return 0.0f;
        }
        return a.movementInput.moveStrafe;
    }

    public static float d(EntityPlayerSP a) {
if (a.movementInput == null) {
            return 0.0f;
        }
        return a.movementInput.moveForward;
    }

    public static Vec3 d(Entity a) {
return new Vec3(a.prevPosX, a.prevPosY, a.prevPosZ);
    }

    public static Vec3 L(Entity a) {
return new Vec3(a.motionX, a.motionY, a.motionZ);
    }

    public static double L(Entity entity, Vec3 vec3) {
        Vec3 a = vec3;
        Entity a2 = entity;
return UtilitySupport_477.L(UtilitySupport_477.L(a2), a);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(EntityPlayerSP entityPlayerSP, MovementInputState class_478, double d) {
        void a;
        MovementInputState a2 = class_478;
        EntityPlayerSP a3 = entityPlayerSP;
return UtilitySupport_477.L(a3, a2, (double)a, UtilitySupport_477.D((Entity)a3));
    }

    @EventHandler
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        UtilitySupport_477 a2 = this;
if (UtilitySupport_477.e.thePlayer == null) {
            d = 0;
            f = 0;
            return;
        }
        int n = 0;
        if (UtilitySupport_477.e.thePlayer.onGround) {
            d = n;
            f += 1;
            return;
        }
        f = n;
        d += 1;
    }

    public static void L(Entity entity, Vec3 vec3) {
        Vec3 a = vec3;
        Entity a2 = entity;
Entity entity2 = a2;
        Object object = a;
        a2.motionX = ((Vec3)object).xCoord;
        entity2.motionY = ((Vec3)object).yCoord;
        entity2.motionZ = a.zCoord;
    }

    public static int L(EntityPlayerSP a) {
return d;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(EntityPlayerSP entityPlayerSP, MovementInputState class_478, double d, Vec3 vec3) {
        void a;
        void v3;
        Vec3 vec32;
        Vec3 vec33;
        void a2;
        Vec3 a3;
        Object a4;
        EntityPlayerSP entityPlayerSP2 = entityPlayerSP;
Object object = a4 = MovementSupport_084.L((MovementInputState)((Object)a3));
        boolean bl = 0;
        ((MovementSupport_084)a4).e = UtilitySupport_496.L(((MovementSupport_084)a4).e, ((MovementSupport_084)object).e.l(), ((MovementSupport_084)a4).e.h(), ((MovementSupport_084)a4).e.I(), ((MovementSupport_084)a4).e.D(), bl, bl, ((MovementSupport_084)a4).e.d());
        a4 = MovementSupport_086.L((MovementSupport_084)object);
        ((MovementSupport_086)a4).i((Vec3)a2);
        ((MovementSupport_086)a4).L();
        Vec3 vec34 = ((MovementSupport_086)a4).D();
        if (vec33.horizontalDistanceSqr() > 9.0E-6) {
            vec32 = UtilitySupport_495.i(vec34, 0.0).normalize();
            v3 = a2;
        } else {
            float f2 = UtilitySupport_477.L(entityPlayerSP2, (MovementInputState)((Object)a3));
            vec32 = Vec3.directionFromRotation(0.0f, f2);
            v3 = a2;
        }
        Vec3 vec35 = v3.add(0.0, -0.1, 0.0);
        if (UtilitySupport_483.L(vec35, UtilitySupport_495.L(vec35, (double)a, vec32)) != null) {
            return 1 != 0;
        }
        a3 = ((MovementSupport_086)a4).d().add(UtilitySupport_495.i(vec34, 0.0));
        return UtilitySupport_477.L((EntityPlayer)entityPlayerSP2, (Vec3)a2) || UtilitySupport_477.L((EntityPlayer)entityPlayerSP2, a3);
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        UtilitySupport_477 a2 = this;
d = 0;
        f = 0;
    }

    public static ProtocolSupport_212 L(Entity a) {
Entity entity = a;
        return new ProtocolSupport_212(entity.rotationYaw, entity.rotationPitch, 5 >> 2);
    }

    public static boolean L(EntityPlayerSP a, double a2) {
EntityPlayerSP entityPlayerSP = a;
        return UtilitySupport_477.L(entityPlayerSP, UtilitySupport_477.L(entityPlayerSP), a2, UtilitySupport_477.D((Entity)a));
    }

    public static AxisAlignedBB L(Entity entity) {
        Entity entity2 = entity;
Entity entity3 = entity2;
        float a = entity3.getCollisionBorderSize();
        return entity3.getEntityBoundingBox().expand(0, 0, 0);
    }

    public static float L(EntityPlayerSP a) {
return UtilitySupport_477.L(a.rotationYaw, UtilitySupport_477.L(a));
    }

    /*
     * WARNING - void declaration
     */
    public static Vec3 L(Vec3 vec3, double d, double d2, MovementInputState class_478) {
        void a;
        void a2;
        void a3;
        Vec3 a4;
        Vec3 vec32 = vec3;
Vec3 vec33 = a4 = a3 == null ? UtilitySupport_477.L(UtilitySupport_477.e.thePlayer) : a3;
        return UtilitySupport_477.L(vec32, (double)a2, (double)a, (MovementInputState)((Object)vec33), UtilitySupport_477.L(UtilitySupport_477.e.thePlayer, (MovementInputState)((Object)vec33)));
    }

    public static double L(Entity a) {
return Math.sqrt(a.motionX * a.motionX + a.motionZ * a.motionZ);
    }
}

