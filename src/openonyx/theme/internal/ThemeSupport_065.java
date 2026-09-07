/*
 * Decompiled with CFR.
 */
package openonyx.theme.internal;

import openonyx.theme.internal.ThemeSupport_062;
import openonyx.theme.internal.ThemeSupport_064;

public final class ThemeSupport_065 {
    final public double I;
    final public double d;
    final public double i;
    final public double f;
    final public double H;
    final public double e;

    public static ThemeSupport_065 L(int a) {
return ThemeSupport_065.L(ThemeSupport_064.L(a), ThemeSupport_062.e);
    }

    private static double d(double a, double a2) {
a2 = Math.pow(a2 * Math.abs(a) / 100.0, 0.42);
        return Math.signum(a) * 400.0 * a2 / (a2 + 27.13);
    }

    public int L(ThemeSupport_062 class_062) {
        ThemeSupport_062 a = class_062;
        ThemeSupport_065 a2 = this;
double d = a2.d == 0.0 || a2.e == 0.0 ? 0.0 : a2.d / Math.sqrt(a2.e / 100.0);
        d = Math.pow(d / Math.pow(1.64 - Math.pow(0.29, a.i), 0.73), 1.1111111111111112);
        double d2 = Math.toRadians(a2.I);
        double d3 = 0.25 * (Math.cos(d2 + 2.0) + 3.8);
        double d4 = a.j * Math.pow(a2.e / 100.0, 1.0 / a.h / a.I);
        d3 = d3 * 3846.153846153846 * a.d * a.f;
        double d5 = Math.sin(d2);
        d2 = Math.cos(d2);
        d = 23.0 * ((d4 /= a.L) + 0.305) * d / (23.0 * d3 + 11.0 * d * d2 + 108.0 * d * d5);
        d2 = d * d2;
        d3 = (460.0 * d4 + 451.0 * d2 + 288.0 * (d *= d5)) / 1403.0;
        d5 = (460.0 * d4 - 891.0 * d2 - 261.0 * d) / 1403.0;
        d = (460.0 * d4 - 220.0 * d2 - 6300.0 * d) / 1403.0;
        d2 = ThemeSupport_065.L(d3, a.H) / a.m[0];
        d3 = ThemeSupport_065.L(d5, a.H) / a.m[1];
        d = ThemeSupport_065.L(d, a.H) / a.m[2];
        d4 = 1.86206786 * d2 - 1.01125463 * d3 + 0.14918677 * d;
        d5 = 0.38752654 * d2 + 0.62144744 * d3 - 0.00897398 * d;
        d = -0.0158415 * d2 - 0.03412294 * d3 + 1.04996444 * d;
        return ThemeSupport_064.L(d4, d5, d);
    }

    public static ThemeSupport_065 L(double[] dArray, ThemeSupport_062 class_062) {
        Object a = class_062;
        double[] a2 = dArray;
double d = a2[0];
        double d2 = a2[1];
        double d3 = a2[2];
        double d4 = 0.401288 * d + 0.650173 * d2 - 0.051461 * d3;
        double d5 = -0.250268 * d + 1.204414 * d2 + 0.045854 * d3;
        d = -0.002079 * d + 0.048952 * d2 + 0.953127 * d3;
        d2 = ThemeSupport_065.d(a.m[0] * d4, a.H);
        d3 = ThemeSupport_065.d(a.m[1] * d5, a.H);
        d = ThemeSupport_065.d(a.m[2] * d, a.H);
        d4 = (11.0 * d2 - 12.0 * d3 + d) / 11.0;
        d5 = (d2 + d3 - 2.0 * d) / 9.0;
        double d6 = (20.0 * d2 + 20.0 * d3 + 21.0 * d) / 20.0;
        d = (40.0 * d2 + 20.0 * d3 + d) / 20.0;
        d2 = ThemeSupport_064.D(Math.toDegrees(Math.atan2(d5, d4)));
        d3 = Math.toRadians(d2);
        d *= a.L;
        d = 100.0 * Math.pow(d / a.j, a.h * a.I);
        double d7 = d2 < 20.14 ? d2 + 360.0 : d2;
        d7 = 0.25 * (Math.cos(Math.toRadians(d7) + 2.0) + 3.8);
        d4 = Math.pow(3846.153846153846 * d7 * a.d * a.f * Math.hypot(d4, d5) / (d6 + 0.305), 0.9) * Math.pow(1.64 - Math.pow(0.29, a.i), 0.73) * Math.sqrt(d / 100.0);
        d5 = d4 * a.l;
        d6 = 1.7 * d / (1.0 + 0.007 * d);
        d5 = 43.859649122807014 * Math.log1p(0.0228 * d5);
        return new ThemeSupport_065(d2, d4, d, d6, d5 * Math.cos(d3), d5 * Math.sin(d3));
    }

    public double L(ThemeSupport_065 class_065) {
        ThemeSupport_065 a = class_065;
        ThemeSupport_065 a2 = this;
ThemeSupport_065 class_0652 = a2;
        double d = class_0652.f - a.f;
        double d2 = class_0652.i - a.i;
        double d3 = class_0652.H - a.H;
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return 1.41 * Math.pow(Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6), 0.63);
    }

    private ThemeSupport_065(double a, double a2, double a3, double a4, double a5, double a6) {
        ThemeSupport_065 a7;
        ThemeSupport_065 class_065 = a7;
        ThemeSupport_065 class_0652 = a7;
        ThemeSupport_065 class_0653 = a7;
        class_0653.I = a;
        class_0653.d = a2;
        class_0652.e = a3;
        class_0652.f = a4;
        class_065.i = a5;
        class_065.H = a6;
    }

    private static double L(double a, double a2) {
double d = Math.max(0.0, 27.13 * Math.abs(a) / (400.0 - Math.abs(a)));
        return Math.signum(a) * (100.0 / a2) * Math.pow(d, 2.380952380952381);
    }

    public static ThemeSupport_065 L(double a, double a2, double a3) {
ThemeSupport_062 class_062 = ThemeSupport_062.e;
        double d = a2 * class_062.l;
        double d2 = 1.7 * a / (1.0 + 0.007 * a);
        d = 43.859649122807014 * Math.log1p(0.0228 * d);
        double d3 = Math.toRadians(a3);
        return new ThemeSupport_065(a3, a2, a, d2, d * Math.cos(d3), d * Math.sin(d3));
    }

    public int L() {
        ThemeSupport_065 a;
return a.L(ThemeSupport_062.e);
    }
}

