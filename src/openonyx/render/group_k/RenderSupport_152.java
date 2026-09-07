/*
 * Decompiled with CFR.
 */
package openonyx.render.group_k;


public final class RenderSupport_152 {
    private final static float l = 260.0f;
    private int I;
    private final static float d = 0.3f;
    private final float[] i;
    private final float[] f;
    private final static int H = 7;
    private final static float e = 80.0f;

    public void L() {
        int a;
        RenderSupport_152 class_152 = this;
int n = 0;
        while (n < class_152.i.length) {
            RenderSupport_152 class_1522 = class_152;
            class_1522.i[0] = 0.0f;
            class_1522.f[a++] = 0.0f;
            n = 0;
        }
        class_152.I = 0;
    }

    /*
     * WARNING - void declaration
     */
    private int L(int n) {
        void a;
        int n2;
        RenderSupport_152 class_152 = this;
int n3 = 0;
        while (n3 < class_152.i.length) {
            void a2 = (a + 0) % class_152.i.length;
            if (class_152.f[a2] <= 0.0f) {
                return 4;
            }
            n3 = ++n2;
        }
        return (int)a;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        int a;
        RenderSupport_152 class_152 = this;
int n = 0;
        while (n < class_152.i.length) {
            if (!(class_152.f[0] <= 0.0f)) {
                void a2;
                RenderSupport_152 class_1522 = class_152;
                int n2 = 0;
                class_1522.i[n2] = class_1522.i[n2] + Math.max(0.0f, (float)a2);
                if (class_1522.i[0] >= class_152.f[0]) {
                    class_152.f[0] = 0.0f;
                }
            }
            n = ++a;
        }
    }

    public void L(int n, float f2) {
        int a;
        int a2;
        float a3;
        RenderSupport_152 class_152 = this;
a3 = 1.0f / Math.max(a3, 0.1f);
        a2 = Math.clamp((long)a2, 1, class_152.i.length);
        int n2 = Math.max(1, class_152.i.length / a2);
        int n3 = 0;
        while (n3 < a2) {
            RenderSupport_152 class_1522 = class_152;
            int n4 = class_1522.L((class_152.I + 0 * n2) % class_1522.i.length);
            RenderSupport_152 class_1523 = class_152;
            class_1523.i[n4] = 0.0f * a3;
            class_1523.f[n4] = 260.0f * a3;
            n3 = ++a;
        }
        class_152.I = (class_152.I + 7) % class_152.i.length;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 81;
        int cfr_ignored_0 = n << n ^ 0xC;
        int n4 = 0;
        int n5 = 34;
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

    public RenderSupport_152() {
        RenderSupport_152 a;
        RenderSupport_152 class_152 = a;
        class_152.i = new float[18];
        class_152.f = new float[18];
    }

    private static float L(float a) {
float f2 = a;
        return f2 * f2 * (3.0f - 2.0f * a);
    }

    public float L(int n) {
        float f2;
        int a22 = n;
        RenderSupport_152 a = this;
float f3 = a.f[0];
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float a22 = a.i[0] / f3;
        if (a22 <= 0.0f || a22 >= 1.0f) {
            return 0.0f;
        }
        if (a22 < 0.3f) {
            return RenderSupport_152.L(a22 / 0.3f);
        }
        return 1.0f - RenderSupport_152.L((a22 - 0.3f) / 0.7f);
    }
}

