/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.theme.internal;

import lombok.Generated;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.theme.internal.ThemeSupport_065;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ThemeSupport_061 {
    private final double i;
    private final double f;
    private final int H;
    private final double e;

    public ThemeSupport_061 D(double a) {
        ThemeSupport_061 a2;
return ThemeSupport_061.L(a2.i, a2.f, a);
    }

    public ThemeSupport_061 d(double a) {
        ThemeSupport_061 a2;
return ThemeSupport_061.L(a2.i, a, a2.e);
    }

    /*
     * WARNING - void declaration
     */
    private ThemeSupport_061(double d, double d2, double d3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        ThemeSupport_061 a5;
        int n2 = n;
        ThemeSupport_061 class_061 = a5 = this;
        ThemeSupport_061 class_0612 = a5;
        class_0612.i = a4;
        class_0612.f = a3;
        class_061.e = a2;
        class_061.H = a;
    }

    public static ThemeSupport_061 L(double a, double a2, double a3) {
return ThemeSupport_061.L(ThemeSupport_061.L(a, a2, a3));
    }

    @Generated
    public double D() {
        ThemeSupport_061 a;
return a.i;
    }

    @Generated
    public double d() {
        ThemeSupport_061 a;
return a.e;
    }

    private static ThemeSupport_065 L(double a, double a2, double a3) {
double d = 0.0;
        double d2 = 100.0;
        double d3 = 1000.0;
        ThemeSupport_065 class_065 = null;
        while (Math.abs(d - d2) > 0.01) {
            double d4 = d;
            double d5 = d4 + (d2 - d4) / 2.0;
            int n = ThemeSupport_065.L(d5, a2, a).L();
            double d6 = ThemeSupport_064.d(n);
            if (Math.abs(a3 - d6) < 0.2) {
                double d7;
                ThemeSupport_065 class_0652 = ThemeSupport_065.L(n);
                double d8 = class_0652.L(ThemeSupport_065.L(class_0652.e, a2, a));
                if (d7 <= 1.0 && d8 <= d3) {
                    d3 = d8;
                    class_065 = class_0652;
                }
            }
            if (d6 < a3) {
                d = d5;
                continue;
            }
            d2 = d5;
        }
        return class_065;
    }

    @Generated
    public double L() {
        ThemeSupport_061 a;
return a.f;
    }

    private static int L(double a, double a2, double a3) {
if (a2 < 1.0 || Math.round(a3) <= 0L || Math.round(a3) >= 100L) {
            return ThemeSupport_064.L(a3);
        }
        a = ThemeSupport_064.D(a);
        double d = 0.0;
        double d2 = a2;
        int n = 1;
        ThemeSupport_065 class_065 = null;
        double d3 = d;
        while (Math.abs(d3 - d2) >= 0.4) {
            double d4;
            ThemeSupport_065 class_0652 = ThemeSupport_061.L(a, a2, a3);
            if (n != 0) {
                if (class_0652 != null) {
                    return class_0652.L();
                }
                n = 0;
                double d5 = d;
                a2 = d5 + (d2 - d5) / 2.0;
                d3 = d;
                continue;
            }
            if (class_0652 == null) {
                d2 = a2;
                d4 = d;
            } else {
                class_065 = class_0652;
                d4 = a2;
            }
            a2 = d4 + (d2 - d) / 2.0;
            d3 = d;
        }
        if (class_065 == null) {
            return ThemeSupport_064.L(a3);
        }
        return class_065.L();
    }

    @Generated
    public int L() {
        ThemeSupport_061 a;
return a.H;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 8;
        int n3 = 0;
        int n4 = 95;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (0 < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = 0;
        }
        return new String(cArray);
    }

    public static ThemeSupport_061 L(int n) {
        int n2 = n;
ThemeSupport_065 a = ThemeSupport_065.L(n2);
        return new ThemeSupport_061(a.I, a.d, ThemeSupport_064.d(n2), n2 | 0xFF000000);
    }

    public ThemeSupport_061 L(double a) {
        ThemeSupport_061 a2;
return ThemeSupport_061.L(a, a2.f, a2.e);
    }
}

