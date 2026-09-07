/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import openonyx.core.OnyxClient;
import openonyx.events.FileDialogUtils;
import openonyx.features.hud.CustomGui;
import openonyx.render.RenderSupport_108;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_w.RenderSupport_198;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_185 {
    private final static RenderSupport_121 h = new RenderSupport_121(1.0f);
    private final static float l = 100.0f;
    private static boolean I;
    private static boolean d;
    private final static RenderSupport_108 i;
    private static boolean f;
    private final static float H = 16.0f;
    private static long e;

    public static void L(GuiScreen guiScreen) {
        GuiScreen guiScreen2 = guiScreen;
if (!RenderSupport_185.L(guiScreen2)) {
            return;
        }
        CustomGui a = RenderSupport_198.L();
        if (a == null) {
            return;
        }
        e = 0L;
        h.L(0.0f).L(1.0f, a.d.i.L(), RenderSupport_123.H);
    }

    public static void i() {
if (f) {
            GlStateManager.popMatrix();
            f = 0;
            return;
        }
        if (!d) {
            return;
        }
        d = false;
        Minecraft minecraft = Minecraft.getMinecraft();
        RenderSupport_185.D(minecraft);
        RenderSupport_185.d(minecraft);
    }

    private static float d() {
        float f2;
CustomGui class_344 = RenderSupport_198.L();
        float f3 = f2 = class_344 == null ? 0.92f : class_344.d.f.L();
        return f3 + (1.0f - f3) * h.L();
    }

    public static boolean d() {
return d;
    }

    public static void D() {
h.L(1.0f);
        d = 0;
        f = 0;
    }

    private RenderSupport_185() {
        RenderSupport_185 a;
    }

    private static void D(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        Framebuffer a = minecraft2.getFramebuffer();
        if (OpenGlHelper.isFramebufferEnabled() && a != null) {
            a.bindFramebuffer(--1 != 0);
            return;
        }
        Minecraft minecraft3 = minecraft2;
        GlStateManager.viewport(0, 0, minecraft3.displayWidth, minecraft3.displayHeight);
    }

    public static void d() {
d = 0;
        f = 0;
        Minecraft minecraft = Minecraft.getMinecraft();
        if (!RenderSupport_185.L() || !RenderSupport_185.L(minecraft.currentScreen) || h.L()) {
            return;
        }
        RenderSupport_185.L();
        if (!(RenderSupport_198.L().d.H.d() && I && OpenGlHelper.framebufferSupported)) {
            f = true;
            RenderSupport_185.L(minecraft);
            return;
        }
        try {
            Minecraft minecraft2 = minecraft;
            i.L(minecraft2.displayWidth, minecraft2.displayHeight);
            i.D();
            d = 1;
            return;
        }
        catch (Throwable throwable) {
            I = 0;
            i.L();
            OnyxClient.H.warn("GUI open animation fell back to scaling after a target failure", throwable);
            f = 1;
            RenderSupport_185.L(minecraft);
            return;
        }
    }

    private static void d(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
ScaledResolution scaledResolution = new ScaledResolution(minecraft2);
        float f2 = scaledResolution.getScaledWidth();
        float f3 = scaledResolution.getScaledHeight();
        float a = RenderSupport_185.d();
        float f4 = h.L();
        float f5 = f2 * 1.0f / 2.0f;
        a = f3 * 1.0f / 2.0f;
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.disableLighting();
        GlStateManager.bindTexture(i.d());
        int n = 1;
        GlStateManager.tryBlendFuncSeparate(n, 771, n, 771);
        float f6 = f4;
        GlStateManager.color(f6, f6, f6, f6);
        GL11.glBegin(7);
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex2f(f5, 0);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex2f(f5, f3 - 0);
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex2f(f2 - f5, f3 - 0);
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex2f(f2 - f5, 0);
        GL11.glEnd();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.enableAlpha();
        GlStateManager.enableDepth();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    private static boolean L() {
CustomGui class_344 = RenderSupport_198.L();
        if (class_344 != null && class_344.d() && class_344.d.D()) {
            return 1 != 0;
        }
        return false;
    }

    private static boolean L(GuiScreen a) {
if (a == null || a instanceof GuiChat) {
            return false;
        }
        if (!RenderSupport_185.L()) {
            return 5 >> 3;
        }
        return a instanceof GuiContainer || a instanceof GuiIngameMenu;
    }

    private static void L() {
long l = System.nanoTime();
        float f2 = e == 0L ? 16.0f : Math.min((float)(l - e) / 1000000.0f, 100.0f);
        e = l;
        h.L(f2);
    }

    static {
        i = new RenderSupport_108(3 >> 2);
        I = 1;
    }

    private static void L(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
ScaledResolution scaledResolution = new ScaledResolution(minecraft2);
        float f2 = scaledResolution.getScaledWidth();
        float a = scaledResolution.getScaledHeight();
        float f3 = RenderSupport_185.d();
        GlStateManager.pushMatrix();
        GlStateManager.translate(f2 / 2.0f, 0.0f, 0.0f);
        float f4 = f3;
        GlStateManager.scale(f4, f4, 1.0f);
        GlStateManager.translate(-f2 / 2.0f, -0.0f, 0.0f);
    }

    public static float L() {
if (RenderSupport_185.L()) {
            return h.L();
        }
        return 1.0f;
    }
}

