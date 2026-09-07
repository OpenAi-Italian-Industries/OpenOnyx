/*
 * Decompiled with CFR.
 */
package openonyx.render.group_j;

import openonyx.theme.internal.ThemeSupport_064;

public final class RenderSupport_148 {
    final public static float H = 0.5019608f;
    private final static long e = 500L;

    public static double L(double a) {
return a * 0.01;
    }

    public static float L(long a, long a2) {
float f2 = a < 500L ? (float)a / 500.0f : (a < a2 ? 1.0f : (a < a2 + 500L ? 1.0f - (float)(a - a2) / 500.0f : 0.0f));
        return 0.5019608f * Math.clamp(f2, 0.0f, 1.0f);
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
return Math.round((float)a3 + (float)(a - a3) * 4);
    }

    public static long L(long a, double a2) {
return Math.round((double)a / Math.max(0.01, a2));
    }

    /*
     * WARNING - void declaration
     */
    public static int L(int n, int n2, int n3, long l) {
        void a;
        void a2;
        int a222 = n3;
        int a3 = 0;
a222 = (int)Math.floorMod((long)(a2 / 10L + (long)a222 * 50L), 360L);
        a222 = (a222 >= 180 ? 360 - a222 : a222) * 2;
        float a222 = (float)a222 / 360.0f;
        return ThemeSupport_064.L(255, RenderSupport_148.L(ThemeSupport_064.i(a3), ThemeSupport_064.i((int)a), 0), RenderSupport_148.L(ThemeSupport_064.D(a3), ThemeSupport_064.D((int)a), 0), RenderSupport_148.L(ThemeSupport_064.L(a3), ThemeSupport_064.L((int)a), 0));
    }

    private RenderSupport_148() {
        RenderSupport_148 a;
    }
}

