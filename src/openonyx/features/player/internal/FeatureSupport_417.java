/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.internal.FeatureSupport_423;
import openonyx.features.player.internal.FeatureSupport_424;
import openonyx.interaction.BlockUtils;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_483;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilitySupport_513;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureSupport_417
implements OnyxListener_001 {
    private static FeatureSupport_423 m;
    private final static int h = 4;
    private final static double l = 0.001;
    private static BlockPos I;
    private final static Deque<BlockPos> d;
    private final static double i = 0.02;
    private final static double[] f;
    private static float H;
    private final static float e = 30.0f;

    private FeatureSupport_417() {
        FeatureSupport_417 a;
    }

    /*
     * WARNING - void declaration
     */
    private static FeatureSupport_424 L(Map<BlockPos, FeatureSupport_424> map, FeatureSupport_424 class_424) {
        void a;
        Map<BlockPos, FeatureSupport_424> map2 = map;
Object a2 = d.peekLast();
        FeatureSupport_424 class_4242 = a2 == null ? null : map2.get(a2);
        Object object = a2 = I == null ? null : map2.get(I);
        if (class_4242 != null && class_4242.L((FeatureSupport_424)a)) {
            return class_4242;
        }
        if (a2 != null && ((FeatureSupport_424)a2).L((FeatureSupport_424)a)) {
            return a2;
        }
        return a;
    }

    private static boolean L(UtilitySupport_513 class_513, Vec3 vec3) {
        Vec3 a = vec3;
        UtilitySupport_513 a2 = class_513;
if (a2.L().dotProduct(a) < 0.5) {
            return 1 != 0;
        }
        return false;
    }

    public static FeatureSupport_423 d() {
return m;
    }

    private static Vec3 L(float f2) {
        float a;
        float f3 = f2;
if (!Float.isNaN(H) && FeatureSupport_417.L(f3, H) <= 30.0f) {
            return Vec3.directionFromRotation(0.0f, H);
        }
        H = a = MathHelper.wrapAngleTo180_float(((float)Math.rint(f3 / 180.0f * 4.0f + 4.0f) - 4.0f) / 4.0f * 180.0f);
        return Vec3.directionFromRotation(0.0f, 0);
    }

    public static void L() {
I = null;
        m = null;
        H = Float.NaN;
        d.clear();
    }

    private static Map<BlockPos, FeatureSupport_424> L() {
        int n;
LinkedHashMap<BlockPos, FeatureSupport_424> linkedHashMap = new LinkedHashMap<BlockPos, FeatureSupport_424>();
        Vec3 vec3 = UtilitySupport_477.D((Entity)FeatureSupport_417.e.thePlayer);
        double[] dArray = f;
        int n2 = f.length;
        int n3 = 0;
        while (n3 < n2) {
            double d = dArray[0];
            double[] dArray2 = f;
            int n4 = f.length;
            int n5 = 0;
            while (n5 < n4) {
                IBlockState iBlockState;
                int n6;
                double d2 = dArray2[n6];
                BlockPos blockPos = UtilitySupport_495.L(vec3, d, -1.0, d2);
                if (!linkedHashMap.containsKey(blockPos) && (iBlockState = BlockUtils.L(blockPos)) != null && !FeatureSupport_417.L(iBlockState, blockPos).isEmpty()) {
                    BlockPos blockPos2 = blockPos;
                    linkedHashMap.put(blockPos2, FeatureSupport_417.L(blockPos2));
                }
                n5 = ++n6;
            }
            n3 = ++n;
        }
        return linkedHashMap;
    }

    public static void L(BlockPos a) {
if (a.equals(d.peekLast())) {
            return;
        }
        while (d.size() >= 4) {
            d.removeFirst();
        }
        d.addLast(a);
    }

    private static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
return Math.abs(MathHelper.wrapAngleTo180_float(0 - a2));
    }

    /*
     * WARNING - void declaration
     */
    private static List<AxisAlignedBB> L(IBlockState iBlockState, BlockPos blockPos) {
        IBlockState iBlockState2 = iBlockState;
ArrayList a = new ArrayList(1);
        if (iBlockState2 != null) {
            void a2;
            UtilitySupport_483.L(iBlockState2, (BlockPos)a2, a);
        }
        return a;
    }

    private static FeatureSupport_423 L() {
Map<BlockPos, FeatureSupport_424> map = FeatureSupport_417.L();
        if (map.isEmpty()) {
            m = null;
            I = null;
            return null;
        }
        FeatureSupport_424 class_424 = null;
        for (FeatureSupport_424 object2 : map.values()) {
            if (class_424 != null && object2.L(class_424) >= 0) continue;
            class_424 = object2;
        }
        if (class_424 == null) {
            return null;
        }
        FeatureSupport_424 class_4242 = FeatureSupport_417.L(map, class_424);
        I = class_4242.L();
        Vec3 vec3 = UtilitySupport_477.D((Entity)FeatureSupport_417.e.thePlayer);
        return new FeatureSupport_423(class_4242.L(), vec3.xCoord - ((double)class_4242.L().getX() + 0.5), vec3.zCoord - ((double)class_4242.L().getZ() + 0.5));
    }

    static {
        double[] dArray = new double[3];
        dArray[0] = 0.301;
        dArray[1] = 0.0;
        dArray[2] = -0.301;
        f = dArray;
        d = new ArrayDeque<BlockPos>(4);
        H = Float.NaN;
    }

    private static FeatureSupport_424 L(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
AxisAlignedBB axisAlignedBB = FeatureSupport_417.e.thePlayer.getEntityBoundingBox();
        Iterator<AxisAlignedBB> a = BlockUtils.L(blockPos2);
        double d = Double.POSITIVE_INFINITY;
        double d2 = 0.0;
        a = FeatureSupport_417.L((IBlockState)((Object)a), blockPos2).iterator();
        block0: while (true) {
            Iterator<AxisAlignedBB> iterator = a;
            while (iterator.hasNext()) {
                AxisAlignedBB axisAlignedBB2 = a.next();
                AxisAlignedBB axisAlignedBB3 = axisAlignedBB;
                double d3 = Math.min(axisAlignedBB.maxX, axisAlignedBB2.maxX) - Math.max(axisAlignedBB3.minX, axisAlignedBB2.minX);
                double d4 = Math.min(axisAlignedBB3.maxZ, axisAlignedBB2.maxZ) - Math.max(axisAlignedBB.minZ, axisAlignedBB2.minZ);
                if (d3 <= 0.0) continue block0;
                if (d4 <= 0.0) {
                    iterator = a;
                    continue;
                }
                double d5 = Math.abs(axisAlignedBB.minY - axisAlignedBB2.maxY);
                d3 *= d4;
                if (d5 + 0.001 < d) {
                    d = d5;
                    d2 = d3;
                    continue block0;
                }
                if (!(Math.abs(d5 - d) <= 0.001)) continue block0;
                d2 += d3;
                continue block0;
            }
            break;
        }
        return new FeatureSupport_424(blockPos2, d2, d, UtilitySupport_495.L(UtilitySupport_477.D((Entity)FeatureSupport_417.e.thePlayer), (double)blockPos2.getX() + 0.5, (double)blockPos2.getZ() + 0.5));
    }

    public static BlockPos L() {
return d.peekLast();
    }

    public static UtilitySupport_513 L(MovementInputState class_478) {
        MovementInputState class_4782 = class_478;
Vec3 vec3 = FeatureSupport_417.L(UtilitySupport_477.L(FeatureSupport_417.e.thePlayer, class_4782));
        Record a = FeatureSupport_417.L();
        if (a == null) {
            return null;
        }
        m = a;
        UtilitySupport_513 class_513 = FeatureSupport_417.L();
        Vec3 vec32 = UtilitySupport_477.D((Entity)FeatureSupport_417.e.thePlayer);
        Vec3 vec33 = class_513 != null && !FeatureSupport_417.L(class_513, vec3) ? class_513.L(vec32) : new Vec3((double)((FeatureSupport_423)a).L().getX() + 0.5 + ((FeatureSupport_423)a).d(), vec32.yCoord, (double)((FeatureSupport_423)a).L().getZ() + 0.5 + ((FeatureSupport_423)a).L());
        return new UtilitySupport_513(UtilitySupport_495.i(vec33, vec32.yCoord), vec3);
    }

    private static UtilitySupport_513 L() {
if (d.size() < 2) {
            return null;
        }
        BlockPos[] blockPosArray = d.toArray(new BlockPos[0]);
        Object object = blockPosArray[blockPosArray.length - 1];
        Vec3 vec3 = UtilitySupport_495.d(blockPosArray[blockPosArray.length - 2]);
        object = UtilitySupport_495.d((Vec3i)object);
        Vec3 vec32 = vec3.add((Vec3)object).scale(0.5);
        object = ((Vec3)object).subtract(vec3).normalize();
        return new UtilitySupport_513(vec32, (Vec3)object);
    }
}

