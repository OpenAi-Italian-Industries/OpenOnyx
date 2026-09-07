/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.ByteBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FogBlur;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.render.internal.RenderSupport_175;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_063;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_098
implements OnyxListener_001 {
    private static int J;
    private final static int D = 5889;
    private static RenderSupport_166 c;
    private static int a;
    private static RenderSupport_166 k;
    private final static int g = 5888;
    private static int M;
    private static int L;
    private static boolean j;
    private static int m;
    private static RenderSupport_166 h;
    private final static int l = 2;
    private static int I;
    private final static int d = 10496;
    private static int i;
    private final static float f = 0.05f;
    private static boolean H;
    private static int e;

    private static void D(int n, int n2) {
        int a = n2;
        int a2 = n;
GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit + a2);
        GlStateManager.bindTexture(a);
    }

    private static void h() {
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

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_166 class_166, int n, int n2, int n3, int n4, int n5, int n6) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        int n7 = n6;
        RenderSupport_166 a7 = class_166;
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, (int)a6);
        int n8 = 0;
        GlStateManager.viewport(n8, n8, (int)a5, (int)a4);
        RenderSupport_098.D(0, (int)a3);
        RenderSupport_166 class_1662 = a7;
        a7.d();
        class_1662.L("Sampler0", 0);
        class_1662.L("uSourceSize", (float)a2, 0.0f);
        RenderSupport_098.h();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(FogBlur class_319, float f2, Framebuffer framebuffer, int n, int n2) {
        void a32;
        void a;
        void a2;
        Framebuffer a422 = framebuffer;
        FogBlur a5 = class_319;
if (a422 != null) {
            a422.bindFramebuffer(5 >> 3);
        } else {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        }
        GlStateManager.viewport(0, 0, (int)a2, (int)a);
        float a422 = Math.max(1.05f, (float)RenderSupport_098.e.gameSettings.renderDistanceChunks * 16.0f * 4.0f);
        h.d();
        h.L("BlurSampler", 1);
        h.L("DepthSampler", 2);
        h.L("uCamera", 0.05f, a422, (float)a32, 0.0f);
        h.L("uFog", a5.f.L(), a5.e.L(), a5.d.L(), a5.H.d() ? 1.0f : 0.0f);
        int a32 = ThemeSupport_059.L().E();
        int a422 = ThemeSupport_059.L().B();
        h.d("uColor1", a32);
        h.d("uColor2", a32);
        h.d("uColor3", a422);
        h.d("uColor4", a422);
        RenderSupport_098.D(1, RenderSupport_098.a);
        RenderSupport_098.D(2, m);
        GlStateManager.enableBlend();
        int n3 = 771;
        GlStateManager.tryBlendFuncSeparate(770, n3, 1, n3);
        RenderSupport_098.h();
        GlStateManager.disableBlend();
        RenderSupport_098.D(2, 0);
        RenderSupport_098.D(1, 0);
        int n4 = 0;
        RenderSupport_098.D(n4, n4);
    }

    private static void L(int n) {
        int n2 = n;
int n3 = Math.max(1, e / 2);
        int a = Math.max(1, L / 2);
        int n4 = Math.max(1, n3 / 2);
        int n5 = Math.max(1, a / 2);
        RenderSupport_098.L(c, n2, i, n3, a, e, L);
        RenderSupport_098.L(c, RenderSupport_098.a, M, n4, n5, n3, a);
        RenderSupport_098.L(k, J, i, n3, a, n4, n5);
    }

    private static void I() {
RenderSupport_166.L();
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.depthMask(--1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.enableFog();
        GlStateManager.enableLighting();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    private static void i() {
GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
    }

    private static int L(int n) {
        int n2 = n;
int a = OpenGlHelper.glGenFramebuffers();
        if (a == -1) {
            return -1;
        }
        OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, a);
        OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, 3553, n2, 0);
        int n3 = OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);
        OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        if (n3 == OpenGlHelper.GL_FRAMEBUFFER_COMPLETE) {
            return a;
        }
        return -1;
    }

    private static void d(int n, int n2) {
        int a = n2;
        int a2 = n;
RenderSupport_098.D(0, m);
        int n3 = 0;
        GL11.glCopyTexSubImage2D(3553, n3, n3, n3, n3, 0, a2, a);
    }

    private RenderSupport_098() {
        RenderSupport_098 a;
    }

    private static void L(Framebuffer framebuffer, boolean bl) {
        boolean a = bl;
        Framebuffer a2 = framebuffer;
if (!a) {
            return;
        }
        RenderSupport_098.D(0, a2.framebufferTexture);
        RenderSupport_098.L(a2.framebufferFilter, 10496);
        RenderSupport_098.D(0, 0);
    }

    static {
        H = 1;
        I = -1;
        m = -1;
        a = -1;
        J = -1;
        i = -1;
        M = -1;
    }

    public static void D() {
        int n;
        float f2;
if (!H || OnyxClient.l == null) {
            return;
        }
        if (!OpenGlHelper.shadersSupported) {
            return;
        }
        FogBlur class_319 = OnyxClient.l.Da;
        Minecraft minecraft = OnyxListener_001.e;
        if (!class_319.d() || minecraft.theWorld == null) {
            return;
        }
        float f3 = f2 = class_319.i.d() ? 1.0f - Math.clamp(OnyxClient.l.W.L(), 0.0f, 1.0f) : 1.0f;
        if (f2 <= 0.01f) {
            return;
        }
        Framebuffer framebuffer = minecraft.getFramebuffer();
        boolean bl = OpenGlHelper.isFramebufferEnabled() && framebuffer != null ? 3 >> 1 : false;
        int n2 = bl ? framebuffer.framebufferWidth : minecraft.displayWidth;
        int n3 = n = bl ? framebuffer.framebufferHeight : minecraft.displayHeight;
        if (n2 <= 0 || n <= 0) {
            return;
        }
        if (!j) {
            j = 1;
            c = RenderSupport_166.L("onyx_fog_down");
            k = RenderSupport_166.L("onyx_fog_up");
            h = RenderSupport_166.L("onyx_fog_composite");
        }
        if (!(c != null && k != null && h != null && c.L() && k.L() && h.L())) {
            H = false;
            return;
        }
        try {
            int n4;
            Framebuffer framebuffer2;
            RenderSupport_098.L(n2, n, bl);
            Framebuffer framebuffer3 = framebuffer;
            int n5 = RenderSupport_098.L(framebuffer3, bl, n2, n);
            RenderSupport_098.d(n2, n);
            RenderSupport_098.d();
            RenderSupport_098.L(n5);
            RenderSupport_098.L(framebuffer3, bl);
            if (bl) {
                framebuffer2 = framebuffer;
                n4 = n2;
            } else {
                framebuffer2 = null;
                n4 = n2;
            }
            RenderSupport_098.L(class_319, f2, framebuffer2, n4, n);
            RenderSupport_098.I();
            return;
        }
        catch (Throwable throwable) {
            RenderSupport_098.L(throwable);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int d(int n, int n2) {
        void a;
        int n3 = n;
int a2 = TextureUtil.glGenTextures();
        GlStateManager.bindTexture(a2);
        GL11.glTexImage2D(3553, 0, 33190, n3, (int)a, 0, 6402, 5126, (ByteBuffer)null);
        RenderSupport_098.i();
        return a2;
    }

    private static void L(Throwable a) {
H = 0;
        try {
            RenderSupport_098.L();
        }
        catch (Throwable throwable) {}
        OnyxClient.H.warn("Fog Blur failed, disabled for this session", a);
    }

    private static void d() {
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

    /*
     * WARNING - void declaration
     */
    private static int L(Framebuffer framebuffer, boolean bl, int n, int n2) {
        void a;
        void a2;
        int a3 = n2;
        Framebuffer a4 = framebuffer;
if (a2 != false) {
            RenderSupport_098.D(0, a4.framebufferTexture);
            RenderSupport_098.L(9729, 33071);
            return a4.framebufferTexture;
        }
        RenderSupport_098.D(0, I);
        int n3 = 0;
        GL11.glCopyTexSubImage2D(3553, n3, n3, n3, n3, 0, (int)a, a3);
        return I;
    }

    private static void L() {
        int n;
if (i != -1) {
            OpenGlHelper.glDeleteFramebuffers(i);
            i = -1;
        }
        if (M != -1) {
            OpenGlHelper.glDeleteFramebuffers(M);
            M = -1;
        }
        int[] nArray = new int[4];
        nArray[0] = I;
        nArray[1] = m;
        nArray[2] = a;
        nArray[3] = J;
        int[] nArray2 = nArray;
        int n2 = nArray.length;
        int n3 = 0;
        while (n3 < n2) {
            int n4 = nArray2[0];
            if (n4 != -1) {
                TextureUtil.deleteTexture(n4);
            }
            n3 = ++n;
        }
        I = -1;
        m = -1;
        a = -1;
        J = -1;
        e = 0;
        L = 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(int n, int n2, boolean bl) {
        void a;
        int a2 = n2;
        int a3 = n;
if (RenderSupport_098.a != -1 && e == a3 && L == a2 && (a != false || I != -1)) {
            return;
        }
        RenderSupport_098.L();
        int n3 = Math.max(1, a3 / 2);
        int n4 = Math.max(1, a2 / 2);
        int n5 = Math.max(1, n3 / 2);
        int n6 = Math.max(1, n4 / 2);
        if (a == false) {
            I = RenderSupport_098.L(a3, a2);
        }
        RenderSupport_098.a = RenderSupport_098.L(n3, n4);
        J = RenderSupport_098.L(n5, n6);
        m = RenderSupport_098.d(a3, a2);
        i = RenderSupport_098.L(RenderSupport_098.a);
        M = RenderSupport_098.L(J);
        if (i == -1 || M == -1) {
            throw new IllegalStateException("could not create fog blur render targets");
        }
        e = a3;
        L = a2;
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2) {
        void a;
        int n3 = n;
int a2 = TextureUtil.glGenTextures();
        GlStateManager.bindTexture(a2);
        GL11.glTexImage2D(3553, 0, 32856, n3, (int)a, 0, 6408, 5121, (ByteBuffer)null);
        RenderSupport_098.i();
        return a2;
    }

    private static void L(int n, int n2) {
        int a = n2;
        int a2 = n;
GL11.glTexParameteri(3553, 10241, a2);
        GL11.glTexParameteri(3553, 10240, a2);
        GL11.glTexParameteri(3553, 10242, a);
        GL11.glTexParameteri(3553, 10243, a);
    }
}

