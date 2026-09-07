/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.connection.NetworkSupport_453;
import openonyx.core.OnyxListener_001;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_495;

public class UtilitySupport_483
implements OnyxListener_001 {
    /*
     * WARNING - void declaration
     */
    public static Vec3 L(Vec3 vec3, Vec3 vec32, float f2) {
        HashSet<AxisAlignedBB> hashSet;
        void a232;
        Vec3 vec33;
        void a;
        Vec3 vec34 = vec3;
Vec3 vec35 = a.subtract(vec34);
        if (vec33.lengthSqr() <= 1.0E-12) {
            return null;
        }
        Vec3 vec36 = vec34;
        List<AxisAlignedBB> a232 = UtilitySupport_483.L(vec36, (Vec3)a, (float)a232);
        Object object = vec36;
        Vec3 vec37 = vec36.add(vec35.scale(-1000.0));
        vec35 = a.add(vec35.scale(1000.0));
        HashSet<AxisAlignedBB> hashSet2 = hashSet = new HashSet<AxisAlignedBB>();
        while (true) {
            hashSet2.clear();
            for (AxisAlignedBB axisAlignedBB : a232) {
                if (!axisAlignedBB.isVecInside((Vec3)object)) continue;
                hashSet.add(axisAlignedBB);
            }
            if (hashSet.isEmpty()) {
                return object;
            }
            for (AxisAlignedBB axisAlignedBB : hashSet) {
                if (!axisAlignedBB.isVecInside((Vec3)a)) continue;
                return null;
            }
            Object a3 = null;
            double d = Double.POSITIVE_INFINITY;
            for (AxisAlignedBB axisAlignedBB : hashSet) {
                double d2;
                MovingObjectPosition movingObjectPosition = axisAlignedBB.calculateIntercept(vec35, vec37);
                if (movingObjectPosition == null) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, "Raycast failed. This should be impossible. AABB=").append(axisAlignedBB).append(" from=").append(vec34).append(" to=").append(a).toString());
                }
                Vec3 object2 = movingObjectPosition.hitVec;
                double d3 = object2.distanceToSqr((Vec3)a);
                if (!(d2 < d)) continue;
                d = d3;
                a3 = object2;
            }
            if (a3 == null) {
                throw new IllegalStateException("Unable to resolve an edge collision");
            }
            object = a3;
            HashSet<AxisAlignedBB> hashSet3 = hashSet;
            hashSet2 = hashSet3;
            a232.removeAll(hashSet3);
        }
    }

    public static void L() {
UtilitySupport_483.e.thePlayer.motionX = 0.0;
        UtilitySupport_483.e.thePlayer.motionZ = 0.0;
    }

    /*
     * WARNING - void declaration
     */
    private static List<AxisAlignedBB> L(Vec3 vec3, Vec3 vec32, float f2) {
        void a;
        Vec3 a2;
        Vec3 vec33 = vec3;
Iterator<BlockPos> a3 = UtilitySupport_477.L(vec33);
        void v0 = a2;
        AxisAlignedBB iterator2 = UtilitySupport_477.L((Vec3)v0);
        a3 = ((AxisAlignedBB)((Object)a3)).union(iterator2);
        BlockPos blockPos = UtilitySupport_495.L(new Vec3(((AxisAlignedBB)((Object)a3)).minX - 0.3 - 1.0E-7, ((AxisAlignedBB)((Object)a3)).minY - (double)a - 1.0E-7, ((AxisAlignedBB)((Object)a3)).minZ - 0.3 - 1.0E-7));
        a3 = UtilitySupport_495.L(new Vec3(((AxisAlignedBB)((Object)a3)).maxX + 0.3 + 1.0E-7, ((AxisAlignedBB)((Object)a3)).minY + 1.0E-7, ((AxisAlignedBB)((Object)a3)).maxZ + 0.3 + 1.0E-7));
        Vec3 vec34 = vec33;
        Object object = v0.subtract(vec34);
        Vec3 vec35 = vec34.add(((Vec3)object).scale(-1000.0));
        a2 = a2.add(((Vec3)object).scale(1000.0));
        object = new ArrayList();
        ArrayList<AxisAlignedBB> arrayList = new ArrayList<AxisAlignedBB>();
        for (BlockPos blockPos2 : BlockPos.getAllInBox(blockPos, (BlockPos)((Object)a3))) {
            ArrayList<AxisAlignedBB> arrayList2 = arrayList;
            arrayList2.clear();
            UtilitySupport_483.L(UtilitySupport_483.e.theWorld.getBlockState(blockPos2), blockPos2, arrayList);
            Iterator iterator = arrayList2.iterator();
            while (iterator.hasNext()) {
                Iterator iterator3;
                AxisAlignedBB axisAlignedBB = (AxisAlignedBB)iterator3.next();
                axisAlignedBB = new AxisAlignedBB(axisAlignedBB.minX - 0.3, axisAlignedBB.minY - 1.0, axisAlignedBB.minZ - 0.3, axisAlignedBB.maxX + 0.3, axisAlignedBB.maxY + (double)a + 0.05, axisAlignedBB.maxZ + 0.3);
                if (axisAlignedBB.calculateIntercept(vec35, a2) == null) {
                    iterator = iterator3;
                    continue;
                }
                object.add(axisAlignedBB);
                iterator = iterator3;
            }
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static MovementInputState L(MovementInputState class_478, float f2, float f3) {
        boolean bl;
        float f4;
        boolean bl2;
        void a;
        float a2 = f2;
        MovementInputState a3 = class_478;
MovementInputState class_4782 = a3;
        boolean bl3 = class_4782.d();
        boolean bl4 = class_4782.I();
        int n = class_4782.L();
        boolean bl5 = class_4782.D();
        if (0 > -90.0f + a && 0 < 90.0f - a) {
            bl2 = 1;
            f4 = 0;
        } else {
            if (0 < -90.0f - a || 0 > 90.0f + a) {
                bl4 = true;
            }
            f4 = 0;
        }
        if (f4 > a && 0 < 180.0f - a) {
            bl = 1;
        } else if (0 > -180.0f + a && 0 < -a) {
            n = 1;
        }
        return new MovementInputState(bl2, bl4, n != 0, bl);
    }

    public UtilitySupport_483() {
        UtilitySupport_483 a;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(IBlockState iBlockState, BlockPos blockPos, List<AxisAlignedBB> list) {
        void a;
        BlockPos a2 = blockPos;
        IBlockState a3 = iBlockState;
if (a3.getBlock().getMaterial() == Material.air) {
            return;
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)a2.getX() - 1.0, (double)a2.getY() - 1.0, (double)a2.getZ() - 1.0, (double)a2.getX() + 2.0, (double)a2.getY() + 2.0, (double)a2.getZ() + 2.0);
        a3.getBlock().addCollisionBoxesToList(UtilitySupport_483.e.theWorld, a2, a3, axisAlignedBB, (List<AxisAlignedBB>)a, null);
    }

    public static Vec3 L(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
return UtilitySupport_483.L(a2, a, 0.5f);
    }

    public static float L(Vec3 vec3, float f2) {
        float a = f2;
        Vec3 a2 = vec3;
double d = UtilitySupport_495.L(a2);
        a = MathHelper.wrapAngleTo180_float(0);
        return MathHelper.wrapAngleTo180_float((float)d - 0);
    }

    public static MovementInputState L(MovementInputState class_478, float f2) {
        float a = f2;
        MovementInputState a2 = class_478;
return UtilitySupport_483.L(a2, 0, 20.0f);
    }
}

