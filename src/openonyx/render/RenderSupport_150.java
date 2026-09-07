/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import openonyx.features.render.FeatureSupport_311;
import openonyx.render.RenderSupport_097;
import openonyx.render.RenderSupport_099;
import openonyx.render.RenderSupport_108;
import openonyx.render.RenderSupport_139;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;

public final class RenderSupport_150 {
    private final static RenderSupport_108 B;
    private static RenderSupport_166 C;
    private final static RenderSupport_108 J;
    private final static long D = 3600000000000L;
    private final static float c = 0.9f;
    private final static float a = 2.0f;
    private final static float k = 16.0f;
    private final static RenderSupport_108 g;
    private final static RenderSupport_108 M;
    private final static float L = 0.05f;
    private final static float j = 2.2f;
    private static RenderSupport_166 m;
    private static RenderSupport_166 h;
    private final static RenderSupport_108 l;
    private final static long I;
    private final static float d = 4.0f;
    private static RenderSupport_166 i;
    private final static float f = 24.0f;
    private final static float H = 8.0f;
    private static boolean e;

    /*
     * WARNING - void declaration
     */
    static float d(FeatureSupport_311 class_311, float f2) {
        void a;
        FeatureSupport_311 class_3112 = class_311;
FeatureSupport_311 class_3113 = class_3112;
        float f3 = class_3113.f.L() * a;
        float a2 = class_3113.h.L() * a;
        return RenderSupport_150.L(f3, 4) + RenderSupport_150.L(f3, 4, RenderSupport_150.L(class_3112, (float)a));
    }

    static {
        I = System.nanoTime();
        l = new RenderSupport_108(5 >> 3);
        J = new RenderSupport_108(0 != 0);
        B = new RenderSupport_108(3 >> 2);
        M = new RenderSupport_108(3 >> 2);
        g = new RenderSupport_108(3 >> 2);
    }

    private static float L(FeatureSupport_311 class_311, float f2) {
        float a = f2;
        FeatureSupport_311 a2 = class_311;
return Math.min(8.0f, a2.d.L() * 0);
    }

    private static float d(float a) {
if (a < 0.05f) {
            return 0.0f;
        }
        return 2.0f * Math.clamp((float)Math.ceil(a * 0.5f), 1.0f, 16.0f);
    }

    static void L() {
l.L();
        J.L();
        B.L();
        M.L();
        g.L();
    }

    /*
     * WARNING - void declaration
     */
    private static void d(RenderSupport_108 class_108, RenderSupport_108 class_1082, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        float f5 = f4;
        RenderSupport_108 a5 = class_108;
a4.d();
        RenderSupport_097.L(0, a5.d());
        i.d();
        i.L("Sampler0", 0);
        i.L("uSourceSize", a5.L(), a5.D());
        i.L("uDirection", (float)a3, (float)a2);
        i.L("uPadding", 0.0f);
        RenderSupport_097.L();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_108 class_108, RenderSupport_108 class_1082, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        float f5 = f4;
        RenderSupport_108 a5 = class_108;
a4.d();
        RenderSupport_097.L(0, a5.d());
        C.d();
        C.L("Sampler0", 0);
        C.L("uSourceSize", a5.L(), a5.D());
        C.L("uDirection", (float)a3, (float)a2);
        C.L("uRadius", 0.0f);
        RenderSupport_097.L();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_108 class_108, RenderSupport_108 class_1082, FeatureSupport_311 class_311, float f2, int n, int n2) {
        void a;
        void a2;
        void a3;
        void a222;
        FeatureSupport_311 a4 = class_311;
        RenderSupport_108 a5 = class_108;
a222.d();
        RenderSupport_097.L(0, a5.d());
        Object object = a4;
        int a222 = ((FeatureSupport_311)object).i.h();
        int n3 = ((FeatureSupport_311)object).I.h();
        float f3 = ((FeatureSupport_311)object).H.L() / 100.0f;
        h.d();
        h.L("Sampler0", 0);
        h.L("uMaskSize", a5.L(), a5.D());
        h.L("uOutSize", (float)a3, (float)a2);
        h.L("uColorPrimary", (float)ThemeSupport_064.i(a222) / 255.0f, (float)ThemeSupport_064.D(a222) / 255.0f, (float)ThemeSupport_064.L(a222) / 255.0f, f3);
        h.L("uColorSecondary", (float)ThemeSupport_064.i(n3) / 255.0f, (float)ThemeSupport_064.D(n3) / 255.0f, (float)ThemeSupport_064.L(n3) / 255.0f, a4.j.L() / 100.0f);
        h.L("uMotion", RenderSupport_150.L(), a4.e.L(), 2.0f, RenderSupport_150.L(a4, (float)a));
        h.L("uOptions", a4.l.L() / 100.0f, a4.m.d() ? 1.0f : 0.0f, 0.0f, 0.0f);
        RenderSupport_097.L();
    }

    private static boolean L() {
if (!e) {
            e = 1;
            i = RenderSupport_166.L("onyx_hand_expand", "onyx_post", "onyx_hand_expand");
            C = RenderSupport_166.L("onyx_hand_smooth", "onyx_post", "onyx_hand_smooth");
            h = RenderSupport_166.L("onyx_hand_aurora", "onyx_post", "onyx_hand_aurora");
            m = RenderSupport_166.L("onyx_hand_blit", "onyx_post", "onyx_hand_blit");
        }
        if (i != null && i.L() && C != null && C.L() && h != null && h.L() && m != null && m.L()) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    static void L(RenderSupport_108 class_108, Framebuffer framebuffer, FeatureSupport_311 class_311, int n, int n2) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_108 class_1082 = class_108;
if (!RenderSupport_150.L()) {
            return;
        }
        RenderSupport_108 class_1083 = class_1082;
        int a5 = class_1083.L();
        int n3 = class_1083.D();
        float f2 = (float)a5 / Math.max(1.0f, (float)a4);
        l.L(a5, n3);
        J.L(a5, n3);
        B.L(a5, n3);
        M.L(a5, n3);
        g.L(a5, n3);
        RenderSupport_097.d();
        void v1 = a3;
        float f3 = v1.f.L() * f2;
        float f4 = v1.h.L() * f2;
        float f5 = RenderSupport_150.L(f3, f4);
        RenderSupport_139.L(f5 + RenderSupport_150.L(f3, f4, RenderSupport_150.L((FeatureSupport_311)a3, f2)), a5, n3);
        l.D();
        J.D();
        B.D();
        M.D();
        g.D();
        RenderSupport_139.L(f5, a5, n3);
        RenderSupport_150.d(class_1082, l, 1.0f, 0.0f, f3);
        RenderSupport_150.d(l, J, 0.0f, 1.0f, f3);
        RenderSupport_150.L(J, B, 1.0f, 0.0f, f4);
        RenderSupport_150.L(B, M, 0.0f, 1.0f, f4);
        RenderSupport_150.L(M, g, (FeatureSupport_311)a3, f2, (int)a4, 0);
        RenderSupport_139.L(f5 / Math.max(f2, 1.0E-4f), (int)a4, 0);
        void v2 = a;
        RenderSupport_150.L(g, (Framebuffer)v2, (int)a4, 0);
        RenderSupport_139.d();
        RenderSupport_097.L((Framebuffer)v2);
    }

    private static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
return 2.0f * (RenderSupport_150.L(a2) + RenderSupport_150.d(a)) + 4.0f;
    }

    private static float L() {
return (float)((System.nanoTime() - I) % 3600000000000L) / 1.0E9f;
    }

    private static float L(float a) {
return Math.clamp((float)Math.ceil(a), 0.0f, 24.0f);
    }

    private RenderSupport_150() {
        RenderSupport_150 a;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_108 class_108, Framebuffer framebuffer, int n, int n2) {
        void a;
        void a2;
        int a3 = n2;
        RenderSupport_108 a4 = class_108;
int n3 = 0;
        a2.bindFramebuffer(n3 != 0);
        GlStateManager.viewport(n3, 0, (int)a, a3);
        RenderSupport_097.L(0, a4.d());
        m.d();
        m.L("Sampler0", 0);
        GlStateManager.enableBlend();
        int n4 = 771;
        GlStateManager.tryBlendFuncSeparate(770, n4, 1, n4);
        RenderSupport_097.L();
        GlStateManager.disableBlend();
    }

    /*
     * WARNING - void declaration
     */
    private static float L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
a2 = (float)Math.ceil(a2 * 2.2f + 0.9f);
        return Math.max(Math.max(RenderSupport_150.L(a3), RenderSupport_150.d((float)a)), a2) + 4.0f;
    }
}

