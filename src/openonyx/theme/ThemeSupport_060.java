/*
 * Decompiled with CFR.
 */
package openonyx.theme;

import openonyx.theme.ThemeSupport_055;

public final class ThemeSupport_060 {
    final public static float[] e;

    private ThemeSupport_060() {
        ThemeSupport_060 a;
    }

    public static float L(int a) {
return e[Math.clamp((long)a, 0, e.length - 1)];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int L(int n, ThemeSupport_055 class_055) {
        ThemeSupport_055 a = class_055;
        int a2 = n;
switch (Math.clamp((long)a2, 0, 5)) {
            case 0: {
                return a.L();
            }
            case 1: {
                return a.N();
            }
            case 2: {
                return a.f();
            }
            case 3: {
                return a.O();
            }
        }
        return a.n();
    }

    static {
        float[] fArray = new float[6];
        fArray[0] = 0.0f;
        fArray[1] = 1.0f;
        fArray[2] = 3.0f;
        fArray[3] = 6.0f;
        fArray[4] = 8.0f;
        fArray[5] = 12.0f;
        e = fArray;
    }
}

