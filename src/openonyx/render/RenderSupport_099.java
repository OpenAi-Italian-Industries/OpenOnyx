/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.util.Arrays;

public final class RenderSupport_099 {
    private int H;
    private float[] e = new float[16];

    public float L() {
        RenderSupport_099 a;
if (a.H == 0) {
            return 1.0f;
        }
        return a.e[a.H -= 1];
    }

    public RenderSupport_099() {
        RenderSupport_099 a;
    }

    public void L(float f2) {
        float a = f2;
        RenderSupport_099 a2 = this;
RenderSupport_099 class_099 = a2;
        if (class_099.H == class_099.e.length) {
            a2.e = Arrays.copyOf(a2.e, a2.H * 2);
        }
        int n = a2.H;
        a2.H = n + 1;
        a2.e[n] = 0;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 46;
        int n3 = 0;
        int n4 = 41;
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
}

