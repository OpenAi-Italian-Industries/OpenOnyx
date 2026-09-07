/*
 * Decompiled with CFR.
 */
package openonyx.render.group_z;

import java.util.List;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_109;
import openonyx.render.RenderSupport_159;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.render.group_z.RenderSupport_206;
import openonyx.render.internal.RenderSupport_176;
import openonyx.ui.internal.TextEditor;

final class RenderSupport_204
implements OnyxListener_001 {
    private final static float K = 4.0f;
    private final double[] B;
    private final static float C = 0.05f;
    private final static int J = 2;
    private float D;
    private final static int c = 8;
    private final float[] a;
    private final static float k = 1.03f;
    private final static float g = 0.12f;
    private final static int M = 16;
    private final static double L = 0.06;
    private float j;
    private boolean m;
    private float h;
    private final Vec3[] l;
    private final static float I = 0.3f;
    private RenderSupport_166 d;
    private boolean i;
    private final float[] f;
    private float H;
    private final static float e = 0.16f;

    /*
     * WARNING - void declaration
     */
    private int L(List<RenderSupport_206> list, RenderSupport_205 class_205, long l) {
        void var7_8;
        void a;
        int n;
        RenderSupport_204 class_204 = this;
Vec3 vec3 = RenderSupport_107.D();
        float f2 = RenderSupport_107.L() * 0.5f;
        RenderSupport_204 class_2042 = class_204;
        class_204.j = Float.MAX_VALUE;
        class_2042.h = Float.MAX_VALUE;
        class_2042.D = -3.4028235E38f;
        class_204.H = -3.4028235E38f;
        class_204.i = 0;
        int n2 = class_204.i;
        int n3 = n = a.size() - 1;
        while (n3 >= 0 && var7_8 < 8) {
            float f3;
            void a2;
            void a3;
            Object a4 = (RenderSupport_206)a.get(n);
            float f4 = Math.clamp((float)(a3 - ((RenderSupport_206)a4).L()) / (float)a2.L(), 0.0f, 1.0f);
            float f5 = 1.0f - f4;
            if (!(f3 <= 0.0f)) {
                float f6;
                f4 = a2.h() * (1.0f - (float)Math.pow(1.0f - f4, 4.0));
                if (!(f6 < 0.05f) && class_204.L(((RenderSupport_206)a4).L(), f4)) {
                    float f7;
                    a4 = ((RenderSupport_206)a4).L().subtract(vec3);
                    double d = Math.max(((Vec3)a4).lengthVector(), 0.1);
                    float d2 = Math.min((float)((double)(f4 * f2) / d), 0.3f);
                    if (!(f7 <= 0.0f)) {
                        void var13_14 = var7_8 * 4;
                        RenderSupport_204 class_2043 = class_204;
                        class_2043.f[var13_14] = (float)((Vec3)a4).xCoord;
                        class_2043.f[var13_14 + 1] = (float)((Vec3)a4).yCoord;
                        class_2043.f[var13_14 + 2] = (float)((Vec3)a4).zCoord;
                        class_2043.f[var13_14 + 3] = f4;
                        class_2043.a[var13_14] = f5;
                        class_2043.a[var13_14 + 1] = d2;
                        class_2043.a[var13_14 + 2] = 0.0f;
                        ++var7_8;
                        class_2043.a[var13_14 + 3] = 0.0f;
                    }
                }
            }
            n3 = --n;
        }
        return (int)var7_8;
    }

    /*
     * WARNING - void declaration
     */
    private RenderSupport_159 L(int n, RenderSupport_205 class_205) {
        void a22;
        void a322;
        int n2;
        RenderSupport_204 class_204 = this;
if (class_204.i) {
            return null;
        }
        RenderSupport_204 class_2042 = class_204;
        if (class_2042.j > class_2042.D) {
            return null;
        }
        int n3 = RenderSupport_109.d();
        int n4 = RenderSupport_109.L();
        if (n3 <= 0 || n4 <= 0) {
            return null;
        }
        float a42 = 0.0f;
        int n5 = 0;
        while (n5 < a322) {
            int n6 = 1;
            a42 = Math.max(a42, class_204.a[n6]);
            n5 = ++n2;
        }
        void v3 = a22;
        float f2 = v3.I() * 0.16f * a42 * 1.3f;
        float a322 = v3.d() * 0.12f * a42;
        int a322 = (int)Math.ceil(Math.max(f2 * (float)n3, a322 * (float)n4)) + 1;
        RenderSupport_204 class_2043 = class_204;
        int a22 = (int)Math.floor(class_2043.j * (float)n3) - 2;
        int a42 = (int)Math.floor(class_2043.h * (float)n4) - 2;
        int n7 = (int)Math.ceil(class_2043.D * (float)n3) + 2;
        int n8 = (int)Math.ceil(class_2043.H * (float)n4) + 2;
        int n9 = a22;
        return new RenderSupport_159(n9, a42, n7 - n9, n8 - a42, a322).L(n3, n4);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(Vec3 vec3, float f2) {
        int a4;
        int a22;
        RenderSupport_204 class_204 = this;
if (class_204.i) {
            return --1 != 0;
        }
        Vec3 vec32 = RenderSupport_107.D();
        Vec3 vec33 = RenderSupport_107.d();
        a32 *= 1.03f;
        int n = 0;
        int n2 = 0;
        while (n2 < 16) {
            void a32;
            void a4;
            double d = 0.0;
            Vec3 vec34 = a4.addVector(Math.cos(d) * (double)a32, 0.0, Math.sin(d) * (double)a32);
            RenderSupport_204 class_2042 = class_204;
            class_2042.l[0] = vec34;
            class_2042.B[0] = vec34.subtract(vec32).dotProduct(vec33);
            if (class_2042.B[0] >= 0.06) {
                ++n;
            }
            n2 = ++a22;
        }
        if (n == 0) {
            return 0 != 0;
        }
        float a22 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = -3.4028235E38f;
        float f5 = -3.4028235E38f;
        int n3 = 0;
        while (n3 < 16) {
            int n4;
            int a32 = 1;
            int n5 = class_204.B[0] >= 0.06 ? 1 : 0;
            int n6 = n4 = class_204.B[a32] >= 0.06 ? 1 : 0;
            if (n5 != 0) {
                RenderSupport_204 class_2043 = class_204;
                float[] fArray = class_2043.L(class_2043.l[0]);
                if (fArray == null) {
                    return 1 != 0;
                }
                a22 = Math.min(a22, fArray[0]);
                f4 = Math.max(f4, fArray[0]);
                f3 = Math.min(f3, fArray[1]);
                f5 = Math.max(f5, fArray[1]);
            }
            if (n5 != n4) {
                RenderSupport_204 class_2044 = class_204;
                RenderSupport_204 class_2045 = class_204;
                double d = (class_2044.B[0] - 0.06) / (class_2045.B[0] - class_204.B[a32]);
                float[] a32 = class_2044.L(class_2045.l[0].add(class_204.l[a32].subtract(class_204.l[0]).scale(d)));
                if (a32 == null) {
                    return --1 != 0;
                }
                a22 = Math.min(a22, a32[0]);
                f4 = Math.max(f4, a32[0]);
                f3 = Math.min(f3, a32[1]);
                f5 = Math.max(f5, a32[1]);
            }
            n3 = ++a4;
        }
        if (f4 < 0.0f || a22 > 1.0f || f5 < 0.0f || f3 > 1.0f) {
            return false;
        }
        RenderSupport_204 class_2046 = class_204;
        class_2046.j = Math.min(class_2046.j, a22);
        class_2046.D = Math.max(class_2046.D, f4);
        class_2046.h = Math.min(class_2046.h, f3);
        class_2046.H = Math.max(class_2046.H, f5);
        return 1 != 0;
    }

    private float[] L(Vec3 vec3) {
        Object a = vec3;
        RenderSupport_204 a2 = this;
float[] fArray = RenderSupport_107.L((Vec3)a, 1.0f, 1.0f);
        a = fArray;
        if (fArray == null) {
            a2.i = 1;
            return null;
        }
        float[] fArray2 = new float[2];
        int n = 0;
        fArray2[n] = Math.clamp((float)a[n], -4.0f, 4.0f);
        int n2 = 1;
        fArray2[n2] = Math.clamp(1.0f - a[n2], -4.0f, 4.0f);
        return fArray2;
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, RenderSupport_205 class_205, Vec3 vec3, Vec3 vec32, Vec3 vec33, RenderSupport_166 class_166) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        Vec3 a62 = vec3;
        RenderSupport_204 a7 = this;
void v0 = a5;
        void v1 = a5;
        void v2 = a5;
        a5.L("uCount", (int)a4);
        v2.L("uBlur", a3.d() * 0.12f);
        v2.L("uWarp", a3.I() * 0.16f);
        v1.L("uForward", (float)a62.xCoord, (float)a62.yCoord, (float)a62.zCoord);
        v1.L("uRight", (float)a2.xCoord, (float)a2.yCoord, (float)a2.zCoord);
        v0.L("uUp", (float)a.xCoord, (float)a.yCoord, (float)a.zCoord);
        v0.L("uTanHalf", 1.0f / RenderSupport_107.d(), 1.0f / RenderSupport_107.L());
        int n2 = 0;
        while (n2 < a4) {
            int a62 = 0;
            void v4 = a5;
            v4.L("uLensA[" + 0 + "]", a7.f[a62], a7.f[a62 + 1], a7.f[a62 + 2], a7.f[a62 + 3]);
            String string = new StringBuilder().insert(0, "uLensB[").append(0).append("]").toString();
            v4.L(string, a7.a[a62], a7.a[a62 + 1], a7.a[a62 + 2], a7.a[a62 + 3]);
            n2 = ++a3;
        }
    }

    /*
     * WARNING - void declaration
     */
    void L(List<RenderSupport_206> list, RenderSupport_205 class_205, long l) {
        void a32;
        void a22;
        void a;
        RenderSupport_204 class_204 = this;
if (!a.d() || a22.isEmpty()) {
            return;
        }
        if (a.d() <= 0.0f && a.I() <= 0.0f) {
            return;
        }
        if (!RenderSupport_109.L() || !RenderSupport_107.L()) {
            return;
        }
        int a22 = class_204.L((List<RenderSupport_206>)a22, (RenderSupport_205)a, (long)a32);
        if (a22 == 0) {
            return;
        }
        RenderSupport_159 a32 = class_204.L(a22, (RenderSupport_205)a);
        if (a32 == null && !class_204.i) {
            return;
        }
        if (!class_204.m) {
            RenderSupport_204 class_2042 = class_204;
            class_2042.m = 1;
            class_2042.d = RenderSupport_166.L("onyx_jump_glass", "onyx_post", "onyx_jump_glass");
        }
        if (class_204.d == null || !class_204.d.L()) {
            return;
        }
        Vec3 vec3 = RenderSupport_107.d();
        Object a4 = RenderSupport_107.L();
        a4 = new Vec3(-((Vec3)a4).xCoord, -((Vec3)a4).yCoord, -((Vec3)a4).zCoord);
        Vec3 vec32 = ((Vec3)a4).crossProduct(vec3);
        RenderSupport_109.L(class_204.d, arg_0 -> class_204.L(a22, (RenderSupport_205)a, vec3, (Vec3)a4, vec32, arg_0), a32);
    }

    RenderSupport_204() {
        RenderSupport_204 a;
        RenderSupport_204 class_204 = a;
        int n = 32;
        a.f = new float[n];
        class_204.a = new float[n];
        class_204.l = new Vec3[16];
        a.B = new double[16];
    }
}

