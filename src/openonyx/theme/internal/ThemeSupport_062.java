/*
 * Decompiled with CFR.
 */
package openonyx.theme.internal;

import openonyx.theme.internal.ThemeSupport_064;

public final class ThemeSupport_062 {
    final public double L;
    final public double j;
    final public double[] m;
    final public double h;
    final public double l;
    final public double I;
    final public double d;
    final public double i;
    final public double f;
    final public double H;
    final public static ThemeSupport_062 e = ThemeSupport_062.L(ThemeSupport_064.H, 63.66197723675813 * ThemeSupport_064.I(50.0) / 100.0, 50.0, 2.0, 5 >> 3);

    private static double L(double a, double a2, double a3) {
return (1.0 - a3) * a + a3 * a2;
    }

    /*
     * WARNING - void declaration
     */
    public static ThemeSupport_062 L(double[] dArray, double d, double d2, double d3, boolean bl) {
        double a;
        double a2;
        void a222;
        double d4;
        double a3;
        boolean bl2 = bl;
        double[] a4 = dArray;
double d5 = a4[0] * 0.401288 + a4[1] * 0.650173 + a4[2] * -0.051461;
        double d6 = a4[0] * -0.250268 + a4[1] * 1.204414 + a4[2] * 0.045854;
        double d7 = a4[0] * -0.002079 + a4[1] * 0.048952 + a4[2] * 0.953127;
        a3 = 0.8 + a3 / 10.0;
        double d8 = d4 >= 0.9 ? ThemeSupport_062.L(0.59, 0.69, (a3 - 0.9) * 10.0) : ThemeSupport_062.L(0.525, 0.59, (a3 - 0.8) * 10.0);
        double d9 = a222 != false ? 1.0 : a3 * (1.0 - 0.2777777777777778 * Math.exp((double)((-a2 - 42.0) / 92.0)));
        d9 = Math.clamp(d9, 0.0, 1.0);
        double[] dArray2 = new double[3];
        dArray2[0] = d9 * (100.0 / d5) + 1.0 - d9;
        dArray2[1] = d9 * (100.0 / d6) + 1.0 - d9;
        dArray2[2] = d9 * (100.0 / d7) + 1.0 - d9;
        double[] a222 = dArray2;
        d9 = 1.0 / (5.0 * a2 + 1.0);
        d9 = d9 * d9 * d9 * d9;
        double d10 = 1.0 - d9;
        a2 = d9 * a2 + 0.1 * d10 * d10 * Math.cbrt(5.0 * a2);
        a = ThemeSupport_064.I(a) / a4[1];
        d9 = 1.48 + Math.sqrt(a);
        d10 = 0.725 / Math.pow(a, 0.2);
        double[] dArray3 = new double[3];
        dArray3[0] = Math.pow(a2 * a222[0] * d5 / 100.0, 0.42);
        dArray3[1] = Math.pow(a2 * a222[1] * d6 / 100.0, 0.42);
        dArray3[2] = Math.pow(a2 * a222[2] * d7 / 100.0, 0.42);
        double[] dArray4 = dArray3;
        double[] dArray5 = new double[3];
        dArray5[0] = 400.0 * dArray4[0] / (dArray4[0] + 27.13);
        dArray5[1] = 400.0 * dArray4[1] / (dArray4[1] + 27.13);
        dArray5[2] = 400.0 * dArray4[2] / (dArray4[2] + 27.13);
        double[] dArray6 = dArray5;
        d5 = (2.0 * dArray6[0] + dArray6[1] + 0.05 * dArray6[2]) * d10;
        double d11 = d10;
        double d12 = a2;
        return new ThemeSupport_062(a, d5, d11, d11, d8, a3, d12, Math.pow(d12, 0.25), d9, a222);
    }

    /*
     * WARNING - void declaration
     */
    private ThemeSupport_062(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double[] dArray) {
        Object a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        ThemeSupport_062 a11;
        ThemeSupport_062 class_062 = object;
        Object object = dArray;
        ThemeSupport_062 class_0622 = a11 = class_062;
        ThemeSupport_062 class_0623 = a11;
        ThemeSupport_062 class_0624 = a11;
        ThemeSupport_062 class_0625 = a11;
        ThemeSupport_062 class_0626 = a11;
        class_0626.i = a10;
        class_0626.j = a9;
        class_0625.L = a8;
        class_0625.f = a7;
        class_0624.h = a6;
        class_0624.d = a5;
        class_0623.H = a4;
        class_0623.l = a3;
        class_0622.I = a2;
        class_0622.m = (double[])a;
    }
}

