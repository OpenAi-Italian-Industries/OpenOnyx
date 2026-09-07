/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.Iterator;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UtilitySupport_495 {
    public static double L(Vec3 a, double a2, double a3, double a4) {
return a.xCoord * a2 + a.yCoord * a3 + a.zCoord * a4;
    }

    public UtilitySupport_495() {
        UtilitySupport_495 a;
    }

    public static double d(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
return UtilitySupport_495.d(a2, a.xCoord, a.zCoord);
    }

    public static Vec3 d(Vec3 a, double a2, double a3, double a4) {
return a.multiply(a2, a3, a4);
    }

    public static Vec3 i(Vec3 a, double a2) {
return new Vec3(a.xCoord, a2, a.zCoord);
    }

    public static boolean L(Vec3 a, double a2) {
if (Math.abs(a.lengthSqr() - 1.0) < a2) {
            return 1 != 0;
        }
        return false;
    }

    public static Vec3 D(Vec3i a) {
return Vec3.upFromBottomCenterOf(a, 1.0);
    }

    public static BlockPos L(Vec3 a, double a2, double a3, double a4) {
return new BlockPos(Math.floor(a.xCoord + a2), Math.floor(a.yCoord + a3), Math.floor(a.zCoord + a4));
    }

    public static double d(Vec3 a, double a2, double a3) {
return Math.sqrt(UtilitySupport_495.L(a, a2, a3));
    }

    private static boolean L(double a) {
if (Math.abs(0) < 1.0E-5) {
            return 1 != 0;
        }
        return false;
    }

    public static double L(Vec3 a) {
return Math.atan2(-a.xCoord, a.zCoord) * 57.29577951308232;
    }

    public static Vec3 L(Iterable<Vec3> iterable) {
        Iterator<Vec3> iterator;
        Iterable<Vec3> iterable2 = iterable;
double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        int n = 0;
        Iterator<Vec3> iterator2 = iterator = iterable2.iterator();
        while (iterator2.hasNext()) {
            Vec3 a = iterator.next();
            d += a.xCoord;
            d2 += a.yCoord;
            ++n;
            d3 += a.zCoord;
            iterator2 = iterator;
        }
        return new Vec3(d / (double)n, d2 / (double)n, d3 / (double)n);
    }

    public static Vec3 D(Vec3 a, double a2) {
double d = a.lengthSqr();
        if (UtilitySupport_495.L(d)) {
            return Vec3.ZERO;
        }
        return a.scale(a2 / Math.sqrt(d));
    }

    /*
     * WARNING - void declaration
     */
    public static Vec3 L(Vec3 vec3, double d, Vec3 vec32) {
        void a;
        Vec3 a2 = vec32;
        Vec3 a3 = vec3;
return new Vec3(Math.fma((double)a, a2.xCoord, a3.xCoord), Math.fma((double)a, a2.yCoord, a3.yCoord), Math.fma((double)a, a2.zCoord, a3.zCoord));
    }

    public static double L(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
return UtilitySupport_495.L(a2, a.xCoord, a.zCoord);
    }

    public static Vec3 d(Vec3i a) {
return Vec3.atBottomCenterOf(a);
    }

    public static Vec3 L(Vec3i a) {
return Vec3.atCenterOf(a);
    }

    public static long L(Vec3i a) {
Vec3i vec3i = a;
        long l = vec3i.getX();
        long l2 = vec3i.getY();
        long l3 = vec3i.getZ();
        long l4 = l;
        long l5 = l2;
        long l6 = l3;
        return l4 * l4 + l5 * l5 + l6 * l6;
    }

    public static BlockPos L(Vec3 a) {
return new BlockPos(Math.floor(a.xCoord), Math.floor(a.yCoord), Math.floor(a.zCoord));
    }

    public static Vec3 d(Vec3 a, double a2) {
return new Vec3(a.xCoord, a.yCoord, a2);
    }

    public static Vec3 L(Vec3 a, double a2) {
return new Vec3(a2, a.yCoord, a.zCoord);
    }

    public static boolean d(Vec3 a) {
return UtilitySupport_495.L(a.lengthSqr());
    }

    public static Vec3 L(Vec3i a, double a2) {
return Vec3.upFromBottomCenterOf(a, a2);
    }

    public static AxisAlignedBB L(Vec3 a, double a2) {
return new AxisAlignedBB(a.xCoord - a2, a.yCoord - a2, a.zCoord - a2, a.xCoord + a2, a.yCoord + a2, a.zCoord + a2);
    }

    public static Vec3 L(Vec3 a, double a2, double a3, double a4) {
return new Vec3(a2, a3, a4);
    }

    public static double L(Vec3 a, double a2, double a3) {
Vec3 vec3 = a;
        a2 = vec3.xCoord - a2;
        a3 = vec3.zCoord - a3;
        double d = a2;
        double d2 = a3;
        return d * d + d2 * d2;
    }

    public static boolean L(Vec3 a) {
return UtilitySupport_495.L(a, 1.0E-4);
    }

    public static double L(Vec3 vec3, Vec3i vec3i) {
        Vec3i a = vec3i;
        Vec3 a2 = vec3;
return UtilitySupport_495.L(a2, (double)a.getX(), a.getZ());
    }

    public static Vec3 L(Vec3 a) {
if (UtilitySupport_495.L(a)) {
            return a;
        }
        return a.normalize();
    }
}

