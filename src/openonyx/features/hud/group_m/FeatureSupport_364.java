/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_m;

import openonyx.render.group_d.RenderSupport_121;

public final class FeatureSupport_364 {
    public String I;
    public boolean d;
    final public RenderSupport_121 i;
    public int f;
    public float H;
    final public RenderSupport_121 e;

    public FeatureSupport_364(float f2) {
        float a = f2;
        FeatureSupport_364 a2 = this;
        FeatureSupport_364 class_364 = a2;
        a2.i = new RenderSupport_121(0.0f);
        class_364.e = new RenderSupport_121(0);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 16;
        int n4 = 0;
        int n5 = n << n ^ 5;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (0 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 0;
        }
        return new String(cArray);
    }
}

