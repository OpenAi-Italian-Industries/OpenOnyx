/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.Skybox;
import openonyx.render.RenderSupport_108;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.UtilitySupport_486;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_105
implements OnyxListener_001 {
    private final static int g = 5889;
    private static boolean M;
    private static int L;
    private static boolean j;
    private final static int m = 5888;
    private final static int h = 24;
    private final static int l = 48;
    private static boolean I;
    private final static float d = 16.0f;
    private static boolean i;
    private static RenderSupport_166 f;
    private static RenderSupport_166 H;
    private final static RenderSupport_108 e;

    private static void D() {
if (L == 0) {
            L = GLAllocation.generateDisplayLists(1);
            GL11.glNewList(L, 4864);
            GL11.glBegin(4);
            RenderSupport_105.d();
            GL11.glEnd();
            GL11.glEndList();
        }
        GL11.glCallList(L);
    }

    private static void d() {
        int n;
int n2 = 0;
        while (n2 < 24) {
            float f2 = -1.5707964f;
            float f3 = -1.4398966f;
            float f4 = (float)Math.sin(f2);
            f2 = (float)Math.cos(f2);
            float f5 = (float)Math.sin(f3);
            f3 = (float)Math.cos(f3);
            int n3 = 0;
            while (n3 < 48) {
                int n4;
                float f6 = (float)(Math.PI * 2 * (double)n4 / 48.0);
                float f7 = (float)(Math.PI * 2 * (double)(n4 + 1) / 48.0);
                float f8 = (float)Math.cos(f6);
                f6 = (float)Math.sin(f6);
                float f9 = (float)Math.cos(f7);
                f7 = (float)Math.sin(f7);
                float f10 = f2 * f8;
                float f11 = f2 * f6;
                float f12 = f2 * f9;
                float f13 = f2 * f7;
                f8 = f3 * f8;
                f6 = f3 * f6;
                f9 = f3 * f9;
                f7 = f3 * f7;
                RenderSupport_105.L(f10, f4, f11);
                RenderSupport_105.L(f8, f5, f6);
                RenderSupport_105.L(f9, f5, f7);
                RenderSupport_105.L(f10, f4, f11);
                RenderSupport_105.L(f9, f5, f7);
                RenderSupport_105.L(f12, f4, f13);
                n3 = ++n4;
            }
            n2 = ++n;
        }
    }

    static {
        e = new RenderSupport_108(5 >> 3);
        I = 1;
        j = 1;
    }

    private static void L(Skybox class_291) {
        Skybox class_2912 = class_291;
int a = class_2912.D();
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableFog();
        GlStateManager.depthMask(5 >> 3);
        GlStateManager.disableCull();
        f.d();
        f.L("uColorModulator", (float)ThemeSupport_064.i(0) / 255.0f, (float)ThemeSupport_064.D(0) / 255.0f, (float)ThemeSupport_064.L(0) / 255.0f, class_2912.h());
        f.L("uParams", class_2912.L(), class_2912.d(), class_2912.F());
        f.L("uKnobs", class_2912.L(), class_2912.I(), class_2912.k(), class_2912.i());
        f.L("uStrikeGlow", class_2912.D());
        f.L("uFogColor", 0.0f, 0.0f, 0.0f, 0.0f);
        RenderSupport_105.D();
        RenderSupport_166.L();
        GlStateManager.enableCull();
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableFog();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
GL11.glVertex3f(a3 * 16.0f, (float)(a * 16.0f), a2 * 16.0f);
    }

    private static boolean L(Skybox class_291) {
        Skybox class_2912 = class_291;
float f2 = class_2912.d();
        if (!j || f2 >= 0.999f) {
            return false;
        }
        if (!OpenGlHelper.isFramebufferEnabled() || !OpenGlHelper.shadersSupported) {
            return false;
        }
        Framebuffer a = ((Minecraft)((Object)e)).getFramebuffer();
        if (a == null || a.framebufferWidth <= 0 || a.framebufferHeight <= 0) {
            return false;
        }
        if (!M) {
            M = 1;
            H = RenderSupport_166.L("onyx_sky_blit", "onyx_post", "onyx_hand_blit");
        }
        if (H == null || !H.L()) {
            j = false;
            return 5 >> 3;
        }
        try {
            e.L(Math.round((float)a.framebufferWidth * f2), Math.round((float)a.framebufferHeight * f2));
        }
        catch (Throwable throwable) {
            j = 0;
            e.L();
            OnyxClient.H.warn("Skybox is falling back to full resolution", throwable);
            return 0 != 0;
        }
        e.D();
        int n = 0;
        RenderSupport_105.L(class_2912);
        a.bindFramebuffer(n != 0);
        Object object = a;
        GlStateManager.viewport(n, 0, ((Framebuffer)object).framebufferWidth, ((Framebuffer)object).framebufferHeight);
        RenderSupport_105.L();
        return 3 >> 1;
    }

    private RenderSupport_105() {
        RenderSupport_105 a;
    }

    public static boolean L() {
if (!I || OnyxClient.l == null) {
            return false;
        }
        Skybox class_291 = OnyxClient.l.r;
        if (!class_291.F()) {
            return 3 >> 2;
        }
        if (!i) {
            i = 1;
            f = RenderSupport_166.L("onyx_sky");
        }
        if (f == null || !f.L()) {
            return false;
        }
        try {
            if (!RenderSupport_105.L(class_291)) {
                RenderSupport_105.L(class_291);
            }
            return true;
        }
        catch (Throwable throwable) {
            I = 0;
            e.L();
            OnyxClient.H.warn("Custom skybox unavailable", throwable);
            return 5 >> 3;
        }
    }

    private static void L() {
GlStateManager.matrixMode(5889);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GL11.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.depthMask(3 >> 2);
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        int n = 771;
        GlStateManager.tryBlendFuncSeparate(770, n, 1, n);
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.bindTexture(e.d());
        H.d();
        H.L("Sampler0", 0);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glBegin(7);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex2f(0.0f, 0.0f);
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex2f(1.0f, 0.0f);
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex2f(1.0f, 1.0f);
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex2f(0.0f, 1.0f);
        GL11.glEnd();
        RenderSupport_166.L();
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.disableBlend();
        GlStateManager.depthMask(3 >> 1);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.enableFog();
        GlStateManager.resetColor();
    }
}

