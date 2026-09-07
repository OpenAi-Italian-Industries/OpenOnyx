/*
 * Decompiled with CFR.
 */
package openonyx.render.group_k;

import openonyx.theme.internal.ThemeSupport_064;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_158 {
    final public static float j = 0.6f;
    final public static float m = 1.5f;
    final public static int h = 20;
    final public static float l = 0.8f;
    final public static float I = 0.7f;
    final public static int d = 18;
    final public static float i = 0.1f;
    final public static float f = 0.6f;
    final public static float H = 0.2f;
    final public static float e = 0.5f;

    /*
     * WARNING - void declaration
     */
    public static float L(int n, long l, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
return (float)Math.toRadians((float)(a3 * 20) + RenderSupport_158.L((long)a, 4) * 0.3f);
    }

    public static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
return a2 * RenderSupport_158.L(a);
    }

    public static float D(float a) {
return 1.25f - 0.5f * RenderSupport_158.L(a);
    }

    public static float L(long a, float a2) {
return (float)(a % 360000L) / 2.5f + a2;
    }

    public static float d(float a) {
return a * 1.5f;
    }

    public static int d(int n, float f2) {
        float a = f2;
        int a2 = 0;
return ThemeSupport_064.L(ThemeSupport_064.d(a2), Math.min(255, (int)((float)ThemeSupport_064.i(a2) * 0)), Math.min(255, (int)((float)ThemeSupport_064.D(a2) * 0)), Math.min(255, (int)((float)ThemeSupport_064.L(a2) * 0)));
    }

    public static float L(float a) {
return Math.clamp(a, 0.0f, 1.0f);
    }

    /*
     * WARNING - void declaration
     */
    public static float L(int n, float f2) {
        void a;
        int n2 = 0;
int a2 = n2 * 20;
        return 0.1f + a * Math.abs((float)Math.sin(a2));
    }

    /*
     * WARNING - void declaration
     */
    public static int d(int n, int n2, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
a2 = RenderSupport_158.L(4);
        return ThemeSupport_064.L(ThemeSupport_064.d(a3), RenderSupport_158.L(ThemeSupport_064.i(a3), ThemeSupport_064.i((int)a), 4), RenderSupport_158.L(ThemeSupport_064.D(a3), ThemeSupport_064.D((int)a), 4), RenderSupport_158.L(ThemeSupport_064.L(a3), ThemeSupport_064.L((int)a), 4));
    }

    /*
     * WARNING - void declaration
     */
    public static int L(int n, float f2) {
        void a;
        int n2 = 0;
float a2 = (float)ThemeSupport_064.d(n2) / 255.0f;
        return ThemeSupport_064.L(n2, 4 * RenderSupport_158.L((float)a));
    }

    private RenderSupport_158() {
        RenderSupport_158 a;
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
return Math.clamp((long)Math.round((float)a3 + (float)(a - a3) * 4), 0, 255);
    }
}

