/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FeatureSupport_273;
import openonyx.features.render.FeatureSupport_311;
import openonyx.features.render.Hand;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.render.RenderSupport_104;
import openonyx.render.RenderSupport_108;
import openonyx.render.RenderSupport_111;
import openonyx.render.RenderSupport_139;
import openonyx.render.RenderSupport_150;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_097
implements OnyxListener_001 {
    private final static int j = 5889;
    private static boolean m;
    private static boolean h;
    private static int l;
    private static RenderSupport_166 I;
    private final static int d = 5888;
    private final static RenderSupport_108 i;
    private static boolean f;
    private static int H;
    private static boolean e;

    private RenderSupport_097() {
        RenderSupport_097 a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static void L(ItemRenderer itemRenderer, float f2, Framebuffer framebuffer, float f3, int n, FeatureSupport_311 class_311) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        ItemRenderer a5 = itemRenderer;
i.L(Math.round((float)H * a4), Math.round((float)l * a4));
        if (a3 != null) {
            RenderSupport_139.L(RenderSupport_150.d((FeatureSupport_311)a3, (float)i.L() / (float)H), i.L(), i.D());
        }
        i.D();
        I.d();
        I.L("Sampler0", 0);
        I.L("uColor", (float)ThemeSupport_064.i(4) / 255.0f, (float)ThemeSupport_064.D(4) / 255.0f, (float)ThemeSupport_064.L(4) / 255.0f, 1.0f);
        GlStateManager.disableBlend();
        GlStateManager.enableDepth();
        GlStateManager.depthMask(3 >> 1);
        GlStateManager.pushMatrix();
        h = 1;
        try {
            void a6;
            a5.renderItemInFirstPerson((float)a6);
            h = 0;
        }
        catch (Throwable throwable) {
            h = 0;
            throw throwable;
        }
        GlStateManager.popMatrix();
        RenderSupport_166.L();
        RenderSupport_139.d();
        int n3 = 0;
        a.bindFramebuffer(n3 != 0);
        GlStateManager.viewport(n3, 0, H, l);
    }

    public static boolean L() {
return h;
    }

    public static void L(Framebuffer a) {
RenderSupport_166.L();
        RenderSupport_097.L(2, 0);
        RenderSupport_097.L(1, 0);
        int n = 0;
        RenderSupport_097.L(n, n);
        int n2 = 0;
        a.bindFramebuffer(n2 != 0);
        GlStateManager.viewport(n2, 0, H, l);
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.disableLighting();
        GlStateManager.disableBlend();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    public static void L(int n, int n2) {
        int a = n2;
        int a2 = n;
GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit + a2);
        GlStateManager.bindTexture(a);
    }

    public static void d() {
GlStateManager.matrixMode(5889);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GL11.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GlStateManager.disableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.depthMask(0 != 0);
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.enableTexture2D();
    }

    static void L(Throwable a) {
e = 0;
        RenderSupport_139.d();
        i.L();
        RenderSupport_150.L();
        RenderSupport_104.L();
        if (f) {
            return;
        }
        f = true;
        OnyxClient.H.warn("Hand effects have been disabled after a render failure", a);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(ItemRenderer itemRenderer, float f2) {
        FeatureSupport_273 class_273;
        ItemRenderer itemRenderer2 = itemRenderer;
if (!e || OnyxClient.l == null) {
            return;
        }
        if (!OpenGlHelper.shadersSupported) {
            return;
        }
        Hand class_320 = OnyxClient.l.d;
        FeatureSupport_311 a = class_320.L();
        FeatureSupport_273 class_2732 = class_273 = a == null ? class_320.L() : null;
        if (a == null && class_273 == null) {
            RenderSupport_104.L();
            return;
        }
        Framebuffer framebuffer = OnyxListener_001.e.getFramebuffer();
        if (!OpenGlHelper.isFramebufferEnabled() || framebuffer == null) {
            return;
        }
        Framebuffer framebuffer2 = framebuffer;
        H = framebuffer2.framebufferWidth;
        l = framebuffer2.framebufferHeight;
        if (H <= 0 || l <= 0) {
            return;
        }
        try {
            void a2;
            FeatureSupport_311 class_311;
            int n;
            float f3;
            if (!m) {
                m = 1;
                I = RenderSupport_166.L("onyx_hand_mask");
            }
            if (I == null || !I.L()) {
                e = false;
                return;
            }
            float f4 = f3 = a != null ? class_320.L() : class_273.L();
            if (a != null) {
                n = a.i.h();
                class_311 = a;
            } else {
                n = -1;
                class_311 = a;
            }
            RenderSupport_097.L(itemRenderer2, (float)a2, framebuffer, f3, n, class_311);
            if (a != null) {
                RenderSupport_150.L(i, framebuffer, a, H, l);
                return;
            }
            RenderSupport_104.L(i, framebuffer, class_273, class_320.L(), class_320.d(), H, l, (float)a2);
            return;
        }
        catch (Throwable throwable) {
            RenderSupport_097.L(throwable);
            return;
        }
    }

    static {
        i = new RenderSupport_108(1 != 0);
        e = 1;
    }

    public static void L() {
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
    }
}

