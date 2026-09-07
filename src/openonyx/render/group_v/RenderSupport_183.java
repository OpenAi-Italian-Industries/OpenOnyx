/*
 * Decompiled with CFR.
 */
package openonyx.render.group_v;

import java.util.List;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_v.RenderSupport_180;
import openonyx.render.group_v.RenderSupport_182;

public final class RenderSupport_183 {
    private final static int h = -1885559891;
    private final static float[] l;
    private final static float I = 4.0f;
    private final static int d = 1468764569;
    private final static float i = 7.0f;
    final public static RenderSupport_182 f;
    private final static float H = 1.0f;
    private final static float e = 5.0f;

    static {
        float[] fArray = new float[3];
        fArray[0] = 0.25f;
        fArray[1] = 0.5f;
        fArray[2] = 0.75f;
        l = fArray;
        f = new RenderSupport_182(0.0f, 0.0f, Float.NaN, Float.NaN);
    }

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_182 L(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        float f9 = f2;
        f2 = f8;
        float a7 = f9;
return RenderSupport_183.L(a7, (float)a6, (float)a5, (float)a4, (float)a3, (float)a2, a, List.of());
    }

    private RenderSupport_183() {
        RenderSupport_183 a;
    }

    /*
     * WARNING - void declaration
     */
    private static RenderSupport_180 L(float f2, float f3, float f4, float f5, List<float[]> list, boolean bl) {
        float[] a;
        int n;
        float f6;
        void a2;
        void a32322;
        float a42422 = f4;
        float a5 = f2;
void var6_11 = a32322;
        float f7 = Math.max((float)var6_11, a42422 - a32322 - a2);
        float f8 = f6 = Math.clamp(a5, (float)var6_11, f7);
        float f9 = Float.NaN;
        float f10 = 8.0f;
        float[] fArray = new float[5];
        fArray[0] = a32322;
        fArray[1] = a42422 * 0.25f;
        fArray[2] = a42422 * 0.5f;
        fArray[3] = a42422 * 0.75f;
        fArray[4] = a42422 - a32322;
        float[] a42422 = fArray;
        float[] fArray2 = new float[5];
        fArray2[0] = var6_11;
        int n2 = 1;
        fArray2[n2] = Math.clamp(a42422[n2] - a2 / 2.0f, (float)var6_11, f7);
        int n3 = 2;
        fArray2[n3] = Math.clamp(a42422[n3] - a2 / 2.0f, (float)var6_11, f7);
        int n4 = 3;
        fArray2[n4] = Math.clamp(a42422[n4] - a2 / 2.0f, (float)var6_11, f7);
        fArray2[4] = f7;
        float[] a32322 = fArray2;
        int n5 = 0;
        while (n5 < a32322.length) {
            float f11 = Math.abs(f6 - a32322[0]);
            if (!(f11 >= f10) && !(f11 > 7.0f)) {
                f8 = a32322[0];
                f9 = a42422[0];
                f10 = f11;
            }
            n5 = ++n;
        }
        for (float[] fArray3 : a) {
            void a6;
            float a42422 = a6 != false ? fArray3[0] : fArray3[1];
            float a32322 = a6 != false ? fArray3[2] : fArray3[3];
            float[] fArray4 = new float[5];
            fArray4[0] = a42422;
            fArray4[1] = a42422 + a32322 - a2;
            fArray4[2] = a42422 + a32322 / 2.0f - a2 / 2.0f;
            fArray4[3] = a42422 + a32322;
            fArray4[4] = a42422 - a2;
            a = fArray4;
            float[] fArray5 = new float[5];
            fArray5[0] = a42422;
            fArray5[1] = a42422 + a32322;
            fArray5[2] = a42422 + a32322 / 2.0f;
            fArray5[3] = a42422 + a32322;
            fArray5[4] = a42422;
            a42422 = fArray5;
            int n6 = 0;
            while (n6 < a.length) {
                float f12;
                if (!(a[a32322] < var6_11 || a[a32322] > f7 || (f12 = Math.abs(f6 - a[a32322])) >= f10 || f12 > 7.0f)) {
                    f8 = a[a32322];
                    f9 = a42422[a32322];
                    f10 = f12;
                }
                n6 = ++a32322;
            }
        }
        return new RenderSupport_180(f8, f9);
    }

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_182 L(float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<float[]> list) {
        void a;
        void a2;
        void a32;
        void a4;
        void a5;
        void a6;
        float a222 = f4;
        float a7 = f2;
RenderSupport_180 a222 = RenderSupport_183.L(a7, a222, (float)a6, (float)a5, (List<float[]>)a4, 1 != 0);
        RenderSupport_180 a32 = RenderSupport_183.L((float)a32, (float)a2, (float)a, (float)a5, (List<float[]>)a4, 3 >> 2);
        return new RenderSupport_182(a222.L(), a32.L(), a222.d(), a32.d());
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, float f2, float f3, RenderSupport_182 class_182) {
        void a;
        void a2;
        int n;
        RenderSupport_182 a3 = class_182;
        RenderSupport_103 a4 = class_103;
float[] fArray = l;
        int n2 = l.length;
        int n3 = 0;
        while (n3 < n2) {
            float f4 = fArray[0];
            RenderSupport_103 class_1032 = a4;
            RenderSupport_183.d(class_1032, (float)(a2 * f4), (float)a, 1468764569);
            RenderSupport_183.L(class_1032, (float)(a * f4), (float)a2, 1468764569);
            n3 = ++n;
        }
        if (Float.isFinite(a3.i())) {
            RenderSupport_183.d(a4, a3.i(), (float)a, -1885559891);
        }
        if (Float.isFinite(a3.d())) {
            RenderSupport_183.L(a4, a3.d(), (float)a2, -1885559891);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void d(RenderSupport_103 class_103, float f2, float f3, int n) {
        void a;
        float a2;
        RenderSupport_103 class_1032 = class_103;
float f4 = 4.0f;
        while (f4 < a - 4.0f) {
            void a3;
            void a4;
            float f5 = 4.0f;
            class_1032.I((float)a4, f5, (float)a4, Math.min(9.0f, (float)(a - 4.0f)), 1.0f, (int)a3);
            f4 = f5 + 9.0f;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_103 class_103, float f2, float f3, int n) {
        void a;
        float a2;
        RenderSupport_103 class_1032 = class_103;
float f4 = 4.0f;
        while (f4 < a - 4.0f) {
            void a3;
            void a4;
            float f5 = 4.0f;
            void v2 = a4;
            class_1032.I(f5, (float)v2, Math.min(9.0f, (float)(a - 4.0f)), (float)v2, 1.0f, (int)a3);
            f4 = f5 + 9.0f;
        }
    }
}

