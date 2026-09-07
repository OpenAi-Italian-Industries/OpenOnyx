/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FeatureSupport_273;
import openonyx.render.RenderSupport_097;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_108;
import openonyx.render.group_k.CrystalEffectSettings;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.UtilitySupport_476;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_104
implements OnyxListener_001 {
    private static RenderSupport_166 x;
    private static RenderSupport_166 u;
    private static float y;
    private static long n;
    private static float Y;
    private final static int r = 36;
    private static RenderSupport_166 W;
    private static RenderSupport_166 P;
    private static boolean V;
    private final static float R = 3.0f;
    private static float p;
    private final static float t = 0.25f;
    private static float b;
    private final static RenderSupport_108 E;
    private static float F;
    private static boolean G;
    private static float A;
    private static float K;
    private final static RenderSupport_108 B;
    private final static RenderSupport_108 C;
    private final static long J;
    private static RenderSupport_166 D;
    private final static float c = 2.0f;
    private static boolean a;
    private final static double k = 3600.0;
    private static RenderSupport_166 g;
    private static float M;
    private static RenderSupport_166 L;
    private static float j;
    private final static RenderSupport_108 m;
    private static float h;
    private final static RenderSupport_108 l;
    private static long I;
    private final static RenderSupport_108 d;
    private final static RenderSupport_108 i;
    private final static int f = 64;
    private final static long H = 250L;
    private static Vec3 e;

    private static void L(RenderSupport_108 class_108, RenderSupport_108 class_1082) {
        RenderSupport_108 a = class_1082;
        RenderSupport_108 a2 = class_108;
a.d();
        RenderSupport_097.L(0, a2.d());
        u.d();
        u.L("Sampler0", 0);
        u.L("uSourceSize", a2.L(), a2.D());
        u.L("uOutSize", a.L(), a.D());
        RenderSupport_097.L();
    }

    static void L() {
n = 0L;
        I = 0L;
        V = 0;
        e = new Vec3(0.0, 0.0, 0.0);
        p = 0.0f;
        F = 0.0f;
        j = 0.0f;
        d.L();
        B.L();
        i.L();
        m.L();
        l.L();
        C.L();
        E.L();
    }

    private static boolean d() {
if (!G) {
            G = 1;
            W = RenderSupport_166.L("onyx_trail_mask", "onyx_post", "onyx_trail_mask");
            u = RenderSupport_166.L("onyx_trail_near", "onyx_post", "onyx_trail_near");
            P = RenderSupport_166.L("onyx_trail_step", "onyx_post", "onyx_trail_step");
            L = RenderSupport_166.L("onyx_trail_down", "onyx_post", "onyx_trail_down");
            x = RenderSupport_166.L("onyx_trail_up", "onyx_post", "onyx_trail_up");
            g = RenderSupport_166.L("onyx_trail_smoke", "onyx_post", "onyx_trail_smoke");
            D = RenderSupport_166.L("onyx_hand_blit", "onyx_post", "onyx_hand_blit");
        }
        if (RenderSupport_104.L(W) && RenderSupport_104.L(u) && RenderSupport_104.L(P) && RenderSupport_104.L(L) && RenderSupport_104.L(x) && RenderSupport_104.L(g) && RenderSupport_104.L(D)) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_166 class_166, RenderSupport_108 class_108, RenderSupport_108 class_1082) {
        void a;
        RenderSupport_108 a2 = class_1082;
        RenderSupport_166 a3 = class_166;
a2.d();
        RenderSupport_097.L(0, a.d());
        RenderSupport_166 class_1662 = a3;
        class_1662.d();
        class_1662.L("Sampler0", 0);
        RenderSupport_097.L();
    }

    private static void d(Minecraft minecraft, float f2) {
        float a = f2;
        Minecraft a2 = minecraft;
y = 0.0f;
        Y = 0.0f;
        if (a2.getRenderViewEntity() == null || !RenderSupport_107.L()) {
            V = false;
            return;
        }
        Minecraft minecraft2 = a2;
        float f3 = minecraft2.getRenderViewEntity().prevRotationYaw + (a2.getRenderViewEntity().rotationYaw - a2.getRenderViewEntity().prevRotationYaw) * 0;
        a = minecraft2.getRenderViewEntity().prevRotationPitch + (a2.getRenderViewEntity().rotationPitch - a2.getRenderViewEntity().prevRotationPitch) * 0;
        Vec3 vec3 = RenderSupport_107.D();
        if (V) {
            float f4 = RenderSupport_107.d();
            float f5 = RenderSupport_107.L();
            y = (float)Math.toRadians(MathHelper.wrapAngleTo180_float(f3 - M)) * f4 * 0.5f;
            Y = -((float)Math.toRadians(0 - b)) * f5 * 0.5f;
            Vec3 vec32 = vec3.subtract(e);
            Vec3 vec33 = RenderSupport_104.L(f3, 0);
            Vec3 vec34 = RenderSupport_104.L(f3);
            y += (float)vec32.dotProduct(vec34) * f4 * 0.5f / 2.0f;
            Y += (float)vec32.dotProduct(vec34.crossProduct(vec33)) * f5 * 0.5f / 2.0f;
            y = Math.clamp(y, -0.25f, 0.25f);
            Y = Math.clamp(Y, -0.25f, 0.25f);
        }
        M = f3;
        b = 0;
        e = vec3;
        V = 1;
    }

    private static boolean L(RenderSupport_166 a) {
if (a != null && a.L()) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_166 class_166, RenderSupport_108 class_108, RenderSupport_108 class_1082, float f2) {
        void a;
        void a2;
        RenderSupport_108 a3 = class_108;
        RenderSupport_166 a4 = class_166;
a2.d();
        RenderSupport_097.L(0, a3.d());
        RenderSupport_166 class_1662 = a4;
        RenderSupport_166 class_1663 = a4;
        class_1663.d();
        class_1663.L("Sampler0", 0);
        class_1662.L("uSourceSize", a3.L(), a3.D());
        class_1662.L("uBlur", (float)a);
        RenderSupport_097.L();
    }

    /*
     * WARNING - void declaration
     */
    static void L(RenderSupport_108 class_108, Framebuffer framebuffer, FeatureSupport_273 class_273, int n, float f2, int n2, int n3, float f3) {
        void a;
        void a2;
        void a3;
        void a3232;
        void a4;
        void a5;
        void a2232;
        RenderSupport_108 class_1082 = class_108;
if (!RenderSupport_104.d()) {
            return;
        }
        Minecraft minecraft = OnyxListener_001.e;
        long l = System.currentTimeMillis();
        int a72 = l - RenderSupport_104.n > 250L ? 1 : 0;
        RenderSupport_104.n = l;
        RenderSupport_108 class_1083 = class_1082;
        RenderSupport_104.L(minecraft, (float)a2232);
        int a2232 = class_1083.L();
        int n4 = class_1083.D();
        int a72 = a72 | d.L((int)a5, (int)a4);
        a72 = a72 | B.L(a2232, n4);
        a72 = a72 | i.L(64, 36);
        a72 = a72 | m.L(a2232, n4);
        a72 = a72 | RenderSupport_104.l.L(a2232, n4);
        a72 = a72 | C.L(a2232, n4);
        boolean a72 = a72 | E.L(a2232, n4);
        RenderSupport_097.L(0, d.d());
        int n5 = 0;
        GL11.glCopyTexSubImage2D(3553, n5, n5, n5, n5, 0, (int)a5, (int)a4);
        RenderSupport_097.d();
        RenderSupport_104.L(W, class_1082, B);
        RenderSupport_104.L(B, i);
        void v2 = a3232;
        RenderSupport_104.L((FeatureSupport_273)a3, (int)a2, (float)a, a72, (int)a5, (int)a4);
        RenderSupport_104.L(D, RenderSupport_104.l, m);
        float a3232 = Math.max(1.0f, 1.0f + a3.L.L()) * a3.L();
        RenderSupport_104.L(L, RenderSupport_104.l, C, a3232);
        RenderSupport_104.L(L, C, E, a3232 * 2.0f);
        RenderSupport_104.L(x, E, C, a3232 * 2.0f);
        RenderSupport_104.L(x, C, E, a3232);
        RenderSupport_104.L((FeatureSupport_273)a3, (Framebuffer)v2, (int)a5, (int)a4);
        RenderSupport_097.L((Framebuffer)v2);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(FeatureSupport_273 class_273, Framebuffer framebuffer, int n, int n2) {
        void a;
        void a2;
        Framebuffer a222 = framebuffer;
        FeatureSupport_273 a3 = class_273;
int n3 = 0;
        a222.bindFramebuffer(n3 != 0);
        GlStateManager.viewport(n3, 0, (int)a2, (int)a);
        RenderSupport_097.L(0, d.d());
        RenderSupport_097.L(1, E.d());
        RenderSupport_097.L(2, B.d());
        g.d();
        g.L("SceneSampler", 0);
        g.L("SmokeSampler", 1);
        g.L("MaskSampler", 2);
        float a222 = a3.f.L();
        if (RenderSupport_104.L()) {
            a222 *= 0.4f;
        } else if (RenderSupport_104.a) {
            a222 *= 0.55f;
        }
        g.L("uMaskSize", B.L(), B.D());
        g.L("uSmokeParams", a3.d.L(), a3.I.L(), a3.j.L(), a222);
        g.L("uSmokeExtra", p, 0.0f, 0.0f, 0.0f);
        RenderSupport_097.L();
    }

    private static Vec3 L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
double d = Math.toRadians(a2);
        double d2 = Math.toRadians(a);
        double d3 = Math.cos(0.0);
        return new Vec3(-Math.sin(0.0) * d3, -Math.sin(0.0), Math.cos(0.0) * d3);
    }

    private RenderSupport_104() {
        RenderSupport_104 a;
    }

    private static float L() {
return (float)((double)(System.nanoTime() - J) / 1.0E9 % 3600.0);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(FeatureSupport_273 class_273, int n, float f2, boolean bl, int n2, int n3) {
        void a;
        void v3;
        float f3;
        void a2;
        FeatureSupport_273 class_2732 = class_273;
l.d();
        RenderSupport_097.L(0, m.d());
        RenderSupport_097.L(1, d.d());
        RenderSupport_097.L(2, B.d());
        RenderSupport_097.L(3, i.d());
        P.d();
        P.L("PrevSampler", 0);
        P.L("SceneSampler", 1);
        P.L("MaskSampler", 2);
        P.L("NearSampler", 3);
        P.L("uOutSize", l.L(), l.D());
        boolean a3 = RenderSupport_104.L();
        FeatureSupport_273 class_2733 = class_2732;
        float a4 = class_2733.m.L();
        float f4 = class_2733.f.L();
        float a5 = class_2733.l.L();
        if (a3) {
            a4 = Math.min(a4, 0.72f);
            f4 *= 0.4f;
            a5 *= 0.4f;
        } else if (RenderSupport_104.a) {
            a4 = Math.min(a4, 0.8f);
            f4 *= 0.55f;
            a5 *= 0.55f;
        }
        P.L("uTrailMotion", RenderSupport_104.L(), class_2732.d.L(), class_2732.H.L(), a5);
        P.L("uTrailShape", class_2732.i.L(), class_2732.L.L(), f4, p);
        P.L("uTrailSwing", a4, F, A, K);
        String string = "uTrailCamera";
        if (a2 != false) {
            f3 = 1.0f;
            v3 = a;
        } else {
            f3 = 0.0f;
            v3 = a;
        }
        P.L(string, y, Y, f3, (float)v3);
        P.L("uTrailTiming", h, class_2732.L(), j, 0.0f);
        P.L("uGlowColor", (float)ThemeSupport_064.i((int)a) / 255.0f, (float)ThemeSupport_064.D((int)a) / 255.0f, (float)ThemeSupport_064.L((int)a) / 255.0f, 1.0f);
        RenderSupport_097.L();
        RenderSupport_097.L(3, 0);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Minecraft minecraft, float f2) {
        Minecraft minecraft2;
        void a;
        int n;
        Minecraft minecraft3 = minecraft;
long l = System.currentTimeMillis();
        float a2 = I > 0L ? (float)(l - I) / 1000.0f : 0.016666668f;
        I = l;
        if (4 <= 0.0f || 4 > 0.05f) {
            a2 = h;
        }
        a2 = Math.clamp(4, 0.0069444445f, 0.033333335f);
        h += (4 - h) * 0.1f;
        a2 = h;
        EntityPlayerSP entityPlayerSP = minecraft3.thePlayer;
        int n2 = entityPlayerSP != null && entityPlayerSP.isBlocking() && entityPlayerSP.getHeldItem() != null && entityPlayerSP.getHeldItem().getItem() instanceof ItemSword ? 1 : 0;
        RenderSupport_104.a = n = entityPlayerSP != null && entityPlayerSP.isSwingInProgress && n2 == 0 ? 1 : 0;
        float f3 = entityPlayerSP != null ? Math.clamp(entityPlayerSP.getSwingProgress((float)a), 0.0f, 1.0f) : 0.0f;
        float f4 = RenderSupport_104.L() ? 0.3f : 0.5f;
        float f5 = entityPlayerSP == null ? 0.0f : (float)Math.min(1.0, Math.sqrt(entityPlayerSP.motionX * entityPlayerSP.motionX + entityPlayerSP.motionY * entityPlayerSP.motionY + entityPlayerSP.motionZ * entityPlayerSP.motionZ) * 2.2);
        float f6 = n != 0 ? (1.0f - Math.min(1.0f, f3)) * f4 : 0.0f;
        float f7 = entityPlayerSP != null && entityPlayerSP.isUsingItem() && n2 == 0 ? 0.55f + Math.min(0.45f, (float)entityPlayerSP.getItemInUseDuration() * 0.06f) : 0.0f;
        float f8 = Math.max(Math.max(f6, f7), f5);
        p += (f8 - p) * (1.0f - (float)Math.exp(-24.0));
        float f9 = K = entityPlayerSP == null ? 0.0f : 1.0f;
        if (n != 0) {
            j = f3;
            F = (float)Math.sin(Math.PI * (double)f3) * f4;
            A = 1.0f;
            minecraft2 = minecraft3;
        } else {
            F = Math.max(0.0f, F - 12.0f);
            minecraft2 = minecraft3;
        }
        RenderSupport_104.d(minecraft2, (float)a);
    }

    private static boolean L() {
if (OnyxClient.l != null && OnyxClient.l.u.d() && OnyxClient.l.u.D() != null) {
            return 3 >> 1;
        }
        return false;
    }

    static {
        J = System.nanoTime();
        d = new RenderSupport_108(3 >> 2);
        B = new RenderSupport_108(0 != 0);
        i = new RenderSupport_108(0 != 0);
        m = new RenderSupport_108(5 >> 3);
        l = new RenderSupport_108(0 != 0);
        C = new RenderSupport_108(5 >> 3);
        E = new RenderSupport_108(0 != 0);
        h = 0.016666668f;
        A = 1.0f;
        e = new Vec3(0.0, 0.0, 0.0);
    }

    private static Vec3 L(float a) {
double d = Math.toRadians(a);
        return new Vec3(-Math.cos(d), 0.0, -Math.sin(d));
    }
}

