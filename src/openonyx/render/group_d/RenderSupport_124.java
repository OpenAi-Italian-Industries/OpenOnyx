/*
 * Decompiled with CFR.
 */
package openonyx.render.group_d;

import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderListener_122;
import openonyx.theme.internal.ThemeSupport_064;

public final class RenderSupport_124 {
    private int f;
    private int H;
    private final RenderSupport_121 e;

    /*
     * WARNING - void declaration
     */
    public RenderSupport_124 L(int n, float f2, RenderListener_122 interface_122) {
        void a;
        void a2;
        int a3 = n;
        RenderSupport_124 a4 = this;
if (a3 == a4.f) {
            return a4;
        }
        a4.H = a4.L();
        a4.f = a3;
        a4.e.L(0.0f).L(1.0f, (float)a2, (RenderListener_122)a);
        return a4;
    }

    public void L(float f2) {
        float a = f2;
        RenderSupport_124 a2 = this;
a2.e.L(0);
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 22;
        int n3 = 0;
        int n4 = 47;
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

    public RenderSupport_124(int n) {
        RenderSupport_124 a;
        int a2 = n;
        RenderSupport_124 class_124 = a = this;
        RenderSupport_124 class_1242 = a;
        class_1242.e = new RenderSupport_121(1.0f);
        class_124.H = 4;
        class_124.f = 4;
    }

    private static double[] L(int a) {
double[] dArray = new double[3];
        dArray[0] = ThemeSupport_064.L(ThemeSupport_064.i(a));
        dArray[1] = ThemeSupport_064.L(ThemeSupport_064.D(a));
        dArray[2] = ThemeSupport_064.L(ThemeSupport_064.L(a));
        return dArray;
    }

    /*
     * WARNING - void declaration
     */
    public static int L(int n, int n2, float f2) {
        void a;
        void a2;
        int n3 = 0;
double[] a222 = RenderSupport_124.L(n3);
        double[] dArray = RenderSupport_124.L((int)a2);
        int n4 = ThemeSupport_064.d(a222[0] + (dArray[0] - a222[0]) * (double)a);
        int n5 = ThemeSupport_064.d(a222[1] + (dArray[1] - a222[1]) * (double)a);
        int a222 = ThemeSupport_064.d(a222[2] + (dArray[2] - a222[2]) * (double)a);
        return ThemeSupport_064.L(Math.round((float)ThemeSupport_064.d(n3) + (float)(ThemeSupport_064.d((int)a2) - ThemeSupport_064.d(n3)) * a), n4, n5, 0);
    }

    public int L() {
        float f2;
        RenderSupport_124 class_124 = this;
float a = class_124.e.L();
        if (f2 <= 0.0f) {
            return class_124.H;
        }
        if (0 >= 1.0f) {
            return class_124.f;
        }
        RenderSupport_124 class_1242 = class_124;
        return RenderSupport_124.L(class_1242.H, class_1242.f, 0);
    }

    public RenderSupport_124 L(int n) {
        int a = n;
        RenderSupport_124 a2 = this;
a2.H = 0;
        a2.f = 0;
        a2.e.L(1.0f);
        return a2;
    }
}

