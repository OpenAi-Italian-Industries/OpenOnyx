/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import java.util.function.DoubleConsumer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.input.InputSupport_003;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.UtilitySupport_507;
import openonyx.utilities.internal.UtilitySupport_509;
import openonyx.utilities.internal.UtilitySupport_510;
import openonyx.utilities.internal.UtilitySupport_512;
import openonyx.utilities.internal.UtilityMode_515;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface UtilityListener_511 {
    final public static double e = 1.0E-9;

    public static void L(Vec3 a) {
if (UtilitySupport_495.d(a)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Direction should be not zero, actual: ").append(a).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    default public UtilitySupport_509 L(AxisAlignedBB axisAlignedBB) {
        double d;
        int n;
        int n2;
        int n3;
        void a;
        UtilityListener_511 interface_511 = this;
UtilityListener_511 interface_5112 = interface_511;
        Vec3 vec3 = interface_5112.d();
        Vec3 vec32 = interface_5112.L();
        Vec3 vec33 = vec3;
        double d2 = vec33.xCoord;
        double d3 = vec33.yCoord;
        double d4 = vec33.zCoord;
        Vec3 vec34 = vec32;
        double d5 = vec34.xCoord;
        double d6 = vec34.yCoord;
        double d7 = vec34.zCoord;
        UtilitySupport_510 a2 = new UtilitySupport_510(6);
        if (!UtilityListener_511.L(d5, 0.0)) {
            Object object = a2;
            ((UtilitySupport_510)object).d((a.minX - d2) / d5);
            ((UtilitySupport_510)object).d((a.maxX - d2) / d5);
        }
        if (!UtilityListener_511.L(d6, 0.0)) {
            Object object = a2;
            ((UtilitySupport_510)object).d((a.minY - d3) / d6);
            ((UtilitySupport_510)object).d((a.maxY - d3) / d6);
        }
        if (!UtilityListener_511.L(d7, 0.0)) {
            Object object = a2;
            ((UtilitySupport_510)object).d((a.minZ - d4) / d7);
            ((UtilitySupport_510)object).d((a.maxZ - d4) / d7);
        }
        a2.L();
        UtilityMode_515 enum_515 = interface_511.L();
        double[] dArray = new double[2];
        dArray[0] = Double.NaN;
        dArray[1] = Double.POSITIVE_INFINITY;
        double[] dArray2 = dArray;
        DoubleConsumer doubleConsumer = arg_0 -> UtilityListener_511.L(enum_515, d2, d5, d3, d6, d4, d7, (AxisAlignedBB)a, dArray2, arg_0);
        double[] dArray3 = enum_515.L();
        int n4 = dArray3.length;
        int n5 = 0;
        while (n5 < n4) {
            double d8 = dArray3[0];
            d3 = d8;
            doubleConsumer.accept(d8);
            n5 = ++n3;
        }
        int n6 = 0;
        while (n6 < a2.L()) {
            doubleConsumer.accept(a2.L(n2++));
            n6 = 0;
        }
        UtilitySupport_510 class_510 = new UtilitySupport_510(8);
        int n7 = 0;
        while (n7 < a2.L()) {
            UtilityListener_511.L(class_510, enum_515, a2.L(n4++));
            n7 = 0;
        }
        double[] dArray4 = enum_515.L();
        n3 = dArray4.length;
        int n8 = 0;
        while (n8 < 0) {
            d = dArray4[0];
            UtilityListener_511.L(class_510, enum_515, d);
            n8 = ++n;
        }
        class_510.L();
        double d9 = enum_515.L();
        int n9 = 0;
        while (n9 < class_510.L()) {
            d = class_510.L(0);
            UtilityListener_511.L((AxisAlignedBB)a, enum_515, d9, d, vec3, vec32, doubleConsumer);
            d9 = d;
            n9 = ++n;
        }
        UtilityMode_515 enum_5152 = enum_515;
        UtilityListener_511.L((AxisAlignedBB)a, enum_5152, d9, enum_5152.d(), vec3, vec32, doubleConsumer);
        if (Double.isNaN(dArray2[0])) {
            doubleConsumer.accept(0.0);
        }
        if (Double.isNaN(dArray2[0])) {
            throw new IllegalStateException(new StringBuilder().insert(0, "Unable to find nearest point on geometry ").append(interface_511).toString());
        }
        return new UtilitySupport_509(interface_511.d(dArray2[0]), dArray2[1]);
    }

    /*
     * WARNING - void declaration
     */
    private double L(double[] dArray) {
        void a;
        UtilityListener_511 interface_511 = this;
UtilityMode_515 a2 = interface_511.L();
        void v0 = a;
        void var3_4 = v0[0];
        void var5_5 = v0[1];
        UtilityMode_515 enum_515 = a2;
        double d = Math.max((double)var3_4, enum_515.L());
        int n = a = Double.isFinite(enum_515.L()) && a2.L() > var3_4 + 1.0E-9 && a2.L() < var5_5 - 1.0E-9 ? 1 : 0;
        if (0 != 0) {
            return a2.D((double)var5_5);
        }
        return a2.D(d);
    }

    public Vec3 d();

    default public Vec3 d(double a) {
        UtilityListener_511 a2;
return UtilitySupport_495.L(a2.d(), a, a2.L());
    }

    public UtilityMode_515 L();

    /*
     * WARNING - void declaration
     */
    private static void L(UtilitySupport_510 class_510, UtilityMode_515 enum_515, double d) {
        void a;
        UtilityMode_515 a2 = enum_515;
        UtilitySupport_510 a3 = class_510;
if (a < a2.L() - 1.0E-9 || a > a2.d() + 1.0E-9) {
            return;
        }
        a3.L((double)a);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(UtilityMode_515 object, double d, double d2, double d3, double d4, double d5, double d6, AxisAlignedBB axisAlignedBB, double[] dArray, double d7) {
        UtilityMode_515 a;
        double a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        double a9;
        UtilityMode_515 enum_515 = object;
        object = dArray;
        UtilityMode_515 a10 = enum_515;
a9 = a10.D(a9);
        if (Double.isNaN(a9)) {
            return;
        }
        a2 += a8 * a9;
        a8 = a7 + a6 * a9;
        a7 = a5 + a4 * a9;
        a2 = UtilitySupport_507.L((AxisAlignedBB)a3, a2, (double)a8, (double)a7);
        if (Double.isNaN((double)a[0]) || a2 < a[1] - 1.0E-9) {
            a[0] = (UtilityMode_515)a9;
            a[1] = (UtilityMode_515)a2;
        }
    }

    default public Vec3 L(AxisAlignedBB axisAlignedBB) {
        Object a = axisAlignedBB;
        UtilityListener_511 a2 = this;
double[] dArray = a2.L((AxisAlignedBB)a);
        a = dArray;
        if (dArray == null) {
            return null;
        }
        double d = a2.L((double[])a);
        if (Double.isNaN(0.0)) {
            return null;
        }
        return a2.L(0.0);
    }

    /*
     * WARNING - void declaration
     */
    private double[] L(AxisAlignedBB axisAlignedBB) {
        int n;
        EnumFacing.Axis[] axisArray = this;
Vec3 vec3 = axisArray.d();
        Vec3 vec32 = axisArray.L();
        double d = Double.NEGATIVE_INFINITY;
        double d2 = Double.POSITIVE_INFINITY;
        Object a = EnumFacing.Axis.values();
        int n2 = ((EnumFacing.Axis[])a).length;
        int n3 = 0;
        while (n3 < n2) {
            void a2;
            EnumFacing.Axis axis = a[0];
            double d3 = vec3.get(axis);
            double d4 = vec32.get(axis);
            void v1 = a2;
            double d5 = v1.min(axis);
            double d6 = v1.max(axis);
            if (UtilityListener_511.L(d4, 0.0) ? d3 < d5 || d3 > d6 : (d = Math.max(d, Math.min(d5 = (d5 - d3) / d4, d3 = (d6 - d3) / d4))) > (d2 = Math.min(d2, Math.max(d5, d3))) + 1.0E-9) {
                return null;
            }
            n3 = ++n;
        }
        a = axisArray.L();
        if (d2 < a.L() - 1.0E-9 || d > a.d() + 1.0E-9) {
            return null;
        }
        double[] dArray = new double[2];
        dArray[0] = d;
        dArray[1] = d2;
        return dArray;
    }

    default public double d(Vec3 vec3) {
        Vec3 a = vec3;
        UtilityListener_511 a2 = this;
return a2.L(a).distanceToSqr(a);
    }

    default public Vec3 L(Vec3 vec3) {
        Vec3 a = vec3;
        UtilityListener_511 a2 = this;
double d = a2.L().d(a2.L(a));
        if (Double.isNaN(0.0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, "Unable to project point ").append(a).append(" on geometry ").append(a2).toString());
        }
        return a2.d(0.0);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(double[] object, UtilityMode_515 enum_515, UtilityMode_515 enum_5152, Vec3 vec3, Vec3 vec32, double d, double d2, double d3, double d4, double d5) {
        void a;
        void a2;
        double[] a3;
        void a4;
        void a5;
        double a6;
        void a7;
        double a8;
        void a9;
        double[] dArray = object;
        object = vec32;
        double[] a10 = dArray;
a8 = a9.D(a8);
        a6 = a7.D(a6);
        if (Double.isNaN(a8) || Double.isNaN(a6)) {
            return;
        }
        a5 = a5 + a4.xCoord * a8 - a3.xCoord * a6;
        a2 = a2 + a4.yCoord * a8 - a3.yCoord * a6;
        a = a + a4.zCoord * a8 - a3.zCoord * a6;
        void v1 = a5;
        void v2 = a2;
        void v3 = a;
        a5 = v1 * v1 + v2 * v2 + v3 * v3;
        if (Double.isNaN(a10[0]) || a5 < a10[2] - 1.0E-9) {
            a10[0] = a8;
            a10[1] = a6;
            a10[2] = a5;
        }
    }

    public Vec3 L();

    default public Vec3 L(double a) {
        UtilityListener_511 a2;
a = a2.L().D(a);
        if (Double.isNaN(a)) {
            return null;
        }
        return a2.d(a);
    }

    private static boolean L(double a, double a2, double a3) {
if (!Double.isFinite(0)) {
            return 5 >> 3;
        }
        boolean bl = !Double.isFinite(a2) || 0 > a2 + 1.0E-9;
        boolean bl2 = a2 = !Double.isFinite(a3) || 0 < a3 - 1.0E-9;
        if (bl && a2) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    default public double L(double d, double d2, double d3) {
        void a;
        void a2;
        void a3;
        UtilityListener_511 interface_511 = this;
UtilityListener_511 interface_5112 = interface_511;
        Vec3 a4 = interface_5112.d();
        Vec3 vec3 = interface_5112.L();
        return UtilitySupport_495.L(vec3, (double)(a3 - a4.xCoord), (double)(a2 - a4.yCoord), (double)(a - a4.zCoord)) / vec3.lengthSqr();
    }

    default public boolean L(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB a = axisAlignedBB;
        UtilityListener_511 a2 = this;
if (a2.L(a) != null) {
            return 1 != 0;
        }
        return false;
    }

    private static double L(double a, double a2) {
if (Double.isFinite(0) && Double.isFinite(a2)) {
            if (0 < a2 - 1.0E-9) {
                return (0 + a2) * 0.5;
            }
            return Double.NaN;
        }
        if (Double.isFinite(0)) {
            return 1.0;
        }
        if (Double.isFinite(a2)) {
            return a2 - 1.0;
        }
        return 0.0;
    }

    /*
     * WARNING - void declaration
     */
    default public UtilitySupport_512 L(UtilityListener_511 interface_511) {
        int n;
        void a;
        UtilityListener_511 interface_5112 = this;
UtilityListener_511 interface_5113 = interface_5112;
        Vec3 vec3 = interface_5113.L();
        Vec3 vec32 = a.L();
        UtilityMode_515 a2 = interface_5113.L();
        UtilityMode_515 enum_515 = a.L();
        double d = interface_5113.d().xCoord - a.d().xCoord;
        double d2 = interface_5113.d().yCoord - a.d().yCoord;
        double d3 = interface_5113.d().zCoord - a.d().zCoord;
        Vec3 vec33 = vec3;
        Vec3 vec34 = vec32;
        Vec3 vec35 = vec3;
        double d4 = vec35.dotProduct(vec35);
        double d5 = vec33.dotProduct(vec34);
        Vec3 vec36 = vec32;
        double d6 = vec34.dotProduct(vec36);
        double d7 = UtilitySupport_495.L(vec33, d, d2, d3);
        double d8 = UtilitySupport_495.L(vec36, d, d2, d3);
        double d9 = d5;
        double d10 = d4 * d6 - d9 * d9;
        double[] dArray = new double[3];
        dArray[0] = Double.NaN;
        dArray[1] = Double.NaN;
        dArray[2] = Double.POSITIVE_INFINITY;
        double[] dArray2 = dArray;
        if (Math.abs(d10) > 1.0E-9) {
            UtilityListener_511.L(dArray2, a2, enum_515, vec3, vec32, d, d2, d3, (d5 * d8 - d6 * d7) / d10, (d4 * d8 - d5 * d7) / d10);
        }
        double[] dArray3 = a2.L();
        int n2 = dArray3.length;
        int n3 = 0;
        while (n3 < n2) {
            d10 = dArray3[0];
            UtilityListener_511.L(dArray2, a2, enum_515, vec3, vec32, d, d2, d3, d10, enum_515.d((d5 * d10 + d8) / d6));
            n3 = ++n;
        }
        dArray3 = enum_515.L();
        n2 = dArray3.length;
        int n4 = 0;
        while (n4 < n2) {
            d10 = dArray3[0];
            UtilityListener_511.L(dArray2, a2, enum_515, vec3, vec32, d, d2, d3, a2.d((d5 * d10 - d7) / d4), d10);
            n4 = ++n;
        }
        UtilityListener_511.L(dArray2, a2, enum_515, vec3, vec32, d, d2, d3, a2.d(-d7 / d4), 0.0);
        UtilityListener_511.L(dArray2, a2, enum_515, vec3, vec32, d, d2, d3, 0.0, enum_515.d(d8 / d6));
        if (Double.isNaN(dArray2[0])) {
            return null;
        }
        return new UtilitySupport_512(interface_5112.d(dArray2[0]), a.d(dArray2[1]));
    }

    public static boolean L(double a, double a2) {
if (Math.abs(a2 - 0) < 1.0E-5) {
            return 1 != 0;
        }
        return false;
    }

    default public double L(Vec3 vec3) {
        Vec3 a = vec3;
        UtilityListener_511 a2 = this;
return a2.L(a.xCoord, a.yCoord, a.zCoord);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(AxisAlignedBB axisAlignedBB, UtilityMode_515 enum_515, double d, double d2, Vec3 vec3, Vec3 vec32, DoubleConsumer doubleConsumer) {
        void a;
        int n;
        void a2;
        void a3;
        double a4;
        Vec3 a5;
        double a6;
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
a6 = Math.max(a6, ((UtilityMode_515)((Object)a5)).L());
        a4 = Math.min(a4, ((UtilityMode_515)((Object)a5)).d());
        double d3 = UtilityListener_511.L(a6, a4);
        if (Double.isNaN(d3)) {
            return;
        }
        a5 = UtilitySupport_495.L((Vec3)a3, d3, (Vec3)a2);
        double d4 = 0.0;
        double d5 = 0.0;
        EnumFacing.Axis[] axisArray = EnumFacing.Axis.values();
        int n2 = axisArray.length;
        int n3 = 0;
        while (n3 < n2) {
            EnumFacing.Axis a7 = axisArray[0];
            double d6 = a5.get(a7);
            double d7 = a2.get(a7);
            double d8 = a3.get(a7);
            if (d6 < axisAlignedBB2.min(a7)) {
                double d9 = d7;
                d4 += d9 * d9;
                d5 += d7 * (d8 - axisAlignedBB2.min(a7));
            } else if (d6 > axisAlignedBB2.max(a7)) {
                double d10 = d7;
                d4 += d10 * d10;
                d5 += d7 * (d8 - axisAlignedBB2.max(a7));
            }
            n3 = ++n;
        }
        if (Math.abs(d4) <= 1.0E-9) {
            a.accept(d3);
            return;
        }
        double d11 = -d5 / d4;
        if (UtilityListener_511.L(d11, a6, a4)) {
            a.accept(d11);
        }
    }
}

