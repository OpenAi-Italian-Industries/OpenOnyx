/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.theme;

import lombok.Generated;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.internal.ThemeSupport_064;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ThemeSupport_059 {
    private static int M = -10006364;
    final public static float L = 0.12f;
    final public static float j = 0.25f;
    final public static float m = 0.1f;
    private static ThemeSupport_055 h;
    final public static float l = 0.08f;
    final public static float I = 0.38f;
    private static float d;
    final public static float i = 0.16f;
    final public static int f = -10006364;
    private static float H;
    final public static float e = 0.1f;

    @Generated
    public static float d() {
return d;
    }

    @Generated
    public static ThemeSupport_055 L() {
return h;
    }

    static {
        H = 0.25f;
        h = ThemeSupport_055.L(-10006364, 0.25f);
        d = 1.0f;
    }

    public static void d(float a) {
H = Math.clamp(a, 0.0f, 1.0f);
        h = ThemeSupport_055.L(M, H);
    }

    @Generated
    public static float L() {
return H;
    }

    @Generated
    public static int L() {
return M;
    }

    public static void L(float a) {
d = Math.clamp(a, 0.3f, 1.5f);
    }

    public static int L(float a) {
return ThemeSupport_059.L(h.i(), a);
    }

    public static int L(int a) {
return ThemeSupport_059.L(a, 0.38f);
    }

    private ThemeSupport_059() {
        ThemeSupport_059 a;
    }

    public static void L(int a) {
M = a | 0xFF000000;
        h = ThemeSupport_055.L(M, H);
    }

    /*
     * WARNING - void declaration
     */
    public static int L(int n, boolean bl, boolean bl2) {
        void a;
        int a2 = bl2 ? 1 : 0;
        int a3 = n;
if (a2 != 0) {
            return ThemeSupport_059.L(a3, 0.1f);
        }
        if (a != false) {
            return ThemeSupport_059.L(a3, 0.08f);
        }
        return 0;
    }

    public static int L(int n, float f) {
        float a = f;
        int a2 = n;
return ThemeSupport_064.L(a2, 0);
    }
}

