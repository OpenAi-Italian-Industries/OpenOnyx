/*
 * Decompiled with CFR.
 */
package openonyx.render.group_d;

import openonyx.render.group_d.RenderListener_122;

public final class RenderSupport_123 {
    final public static RenderListener_122 h;
    final public static RenderListener_122 l;
    final public static RenderListener_122 I;
    final public static RenderListener_122 d;
    final public static RenderListener_122 i;
    final public static RenderListener_122 f;
    final public static RenderListener_122 H;
    final public static RenderListener_122 e;

    private static double D(double a, double a2, double a3) {
        int n;
double d = a;
        int n2 = 0;
        while (n2 < 8) {
            double d2;
            double d3;
            double d4 = RenderSupport_123.L(d, a2, a3) - a;
            if (Math.abs(d3) < 1.0E-6) {
                return d;
            }
            double d5 = RenderSupport_123.d(d, a2, a3);
            if (Math.abs(d2) < 1.0E-6) break;
            d -= d4 / d5;
            n2 = ++n;
        }
        double d6 = 0.0;
        double d7 = 1.0;
        d = a;
        double d8 = d6;
        while (d8 < d7) {
            double d9;
            double d10;
            double d11;
            double d12 = RenderSupport_123.L(d, a2, a3);
            if (Math.abs(d11 - a) < 1.0E-6) {
                return d;
            }
            if (d12 < a) {
                d10 = d;
            } else {
                d7 = d;
                d10 = d6;
            }
            double d13 = (d10 + d7) / 2.0;
            if (Math.abs(d9 - d) < 1.0E-9) {
                return d;
            }
            d = d13;
            d8 = d6;
        }
        return d;
    }

    private static double d(double a, double a2, double a3) {
double d = 1.0 - a;
        return 3.0 * d * d * a2 + 6.0 * d * a * (a3 - a2) + 3.0 * a * a * (1.0 - a3);
    }

    private static double L(double a, double a2, double a3) {
double d = 1.0 - a;
        double d2 = a;
        return 3.0 * d * d * a * a2 + 3.0 * d * a * a * a3 + d2 * d2 * a;
    }

    static {
        e = a -> {
return a;
        };
        l = RenderSupport_123.L(0.2, 0.0, 0.0, 1.0);
        H = RenderSupport_123.L(0.05, 0.7, 0.1, 1.0);
        h = RenderSupport_123.L(0.3, 0.0, 0.8, 0.15);
        f = RenderSupport_123.L(0.2, 0.0, 0.0, 1.0);
        i = RenderSupport_123.L(0.0, 0.0, 0.0, 1.0);
        d = RenderSupport_123.L(0.3, 0.0, 1.0, 1.0);
        I = RenderSupport_123.L(0.4, 0.0, 0.2, 1.0);
    }

    private RenderSupport_123() {
        RenderSupport_123 a;
    }

    public static RenderListener_122 L(double a, double a2, double a3, double a4) {
return a5 -> {
if (a5 <= 0.0) {
                return 0.0;
            }
            if (a5 >= 1.0) {
                return 1.0;
            }
            return RenderSupport_123.L(RenderSupport_123.D(a5, a, a3), a2, a4);
        };
    }
}

