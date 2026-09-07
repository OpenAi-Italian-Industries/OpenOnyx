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
import openonyx.events.FileDialogUtils;
import openonyx.movement.MovementSupport_088;
import openonyx.render.group_p.RenderSupport_166;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_101 {
    private final static int E = 5888;
    private final static int F = 32;
    private final static float G = 8.0f;
    private static int A;
    private static boolean K;
    private static boolean B;
    private static int C;
    private static int J;
    private static int D;
    private final static int c = 64;
    private static RenderSupport_166 a;
    private static int k;
    private static int g;
    private static int M;
    private final static int L = 5889;
    private static int j;
    private static int m;
    private static int h;
    private static boolean l;
    private static int I;
    private static boolean d;
    private static int i;
    private static boolean f;
    private static int H;
    private final static int e = 2;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void l() {
if (!B || !RenderSupport_101.L()) {
            return;
        }
        B = false;
        try {
            int n;
            Minecraft minecraft = Minecraft.getMinecraft();
            Framebuffer framebuffer = minecraft.getFramebuffer();
            boolean bl = OpenGlHelper.isFramebufferEnabled() && framebuffer != null ? 3 >> 1 : false;
            int n2 = bl ? framebuffer.framebufferWidth : minecraft.displayWidth;
            int n3 = n = bl ? framebuffer.framebufferHeight : minecraft.displayHeight;
            if (n2 <= 0 || 0 <= 0) {
                return;
            }
            if (a == null) {
                a = RenderSupport_166.L("box_blur");
            }
            if (!a.L()) {
                RenderSupport_101.L(null);
                return;
            }
            int n4 = Math.max(1, n2 / 2);
            int n5 = Math.max(1, 0);
            RenderSupport_101.L(n4, n5);
            int n6 = bl ? framebuffer.framebufferTexture : RenderSupport_101.d(n2, 0);
            RenderSupport_101.d(n4, n5);
            RenderSupport_101.L(n4, n5, n2, 0);
            GlStateManager.bindTexture(n6);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            RenderSupport_101.L(n6, I, n4, n5, 0.0f, 0.0f);
            RenderSupport_101.L(m, H, n4, n5, 1.0f, 0.0f);
            RenderSupport_101.L(A, I, n4, n5, 0.0f, 1.0f);
            RenderSupport_101.L(m, H, n4, n5, 1.0f, 0.0f);
            RenderSupport_101.L(A, I, n4, n5, 0.0f, 1.0f);
            if (bl) {
                GlStateManager.bindTexture(n6);
                GL11.glTexParameteri(3553, 10241, 9728);
                GL11.glTexParameteri(3553, 10240, 9728);
            }
            RenderSupport_101.I();
            RenderSupport_101.L(minecraft, framebuffer, bl, n2, 0);
            return;
        }
        catch (Throwable throwable) {
            RenderSupport_101.L(throwable);
            RenderSupport_101.L();
            return;
        }
        finally {
            RenderSupport_101.i();
        }
    }

    private static void h() {
if (I != -1) {
            OpenGlHelper.glDeleteFramebuffers(I);
            I = -1;
        }
        if (H != -1) {
            OpenGlHelper.glDeleteFramebuffers(H);
            H = -1;
        }
        if (m != -1) {
            TextureUtil.deleteTexture(m);
            m = -1;
        }
        if (A != -1) {
            TextureUtil.deleteTexture(A);
            A = -1;
        }
        if (h != -1) {
            TextureUtil.deleteTexture(h);
            h = -1;
        }
        M = 0;
        k = 0;
        J = 0;
        j = 0;
    }

    private static int d(int n, int n2) {
        int a = n2;
        int a2 = n;
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        if (h == -1 || J != a2 || j != a) {
            if (h == -1) {
                h = TextureUtil.glGenTextures();
            }
            GlStateManager.bindTexture(h);
            RenderSupport_101.D(a2, a);
            J = a2;
            j = a;
        } else {
            GlStateManager.bindTexture(h);
        }
        int n3 = 0;
        GL11.glCopyTexSubImage2D(3553, n3, n3, n3, n3, 0, a2, a);
        return h;
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

    private RenderSupport_101() {
        RenderSupport_101 a;
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2) {
        void a;
        int n3 = n;
int a2 = TextureUtil.glGenTextures();
        GlStateManager.bindTexture(a2);
        RenderSupport_101.D(n3, (int)a);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Minecraft minecraft, Framebuffer framebuffer, boolean bl, int n, int n2) {
        void a;
        void a2;
        void a3;
        int n3 = n2;
        Minecraft a4 = minecraft;
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        if (a3 != false) {
            void a5;
            a5.bindFramebuffer(1 != 0);
            return;
        }
        GlStateManager.viewport(0, 0, (int)a2, 0);
    }

    private static void I() {
RenderSupport_166.L();
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    private static void D(int n, int n2) {
        int a = n2;
        int a2 = n;
GL11.glTexImage2D(3553, 0, 32856, a2, a, 0, 6408, 5121, (ByteBuffer)null);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
    }

    private static void i() {
if (!f) {
            return;
        }
        f = false;
        GL11.glDisable(3089);
    }

    public static void D() {
if (RenderSupport_101.L()) {
            B = 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void d(int n, int n2, int n3, int n4) {
        void a;
        void a2;
        int a3 = n2;
        int a4 = n;
if (a2 <= 0 || a <= 0) {
            return;
        }
        if (d) {
            D = Math.min(D, a4);
            i = Math.min(i, a3);
            C = Math.max(C, a4 + a2);
            g = Math.max(g, a3 + a);
            return;
        }
        D = a4;
        i = a3;
        C = a4 + a2;
        g = a3 + a;
        d = 1;
    }

    private static void L(int a) {
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, a);
        GlStateManager.clearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.clear(16384);
        OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
    }

    private static void L(Throwable a) {
l = 0;
        try {
            RenderSupport_101.h();
        }
        catch (Throwable throwable) {}
        OnyxClient.H.warn("Frosted glass unavailable, falling back to an opaque panel", a);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(int n, int n2, int n3, int n4, float f2, float f3) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f4 = f3;
        int a6 = n;
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, (int)a5);
        GlStateManager.bindTexture(a6);
        RenderSupport_101.a.d();
        RenderSupport_101.a.L("Sampler0", 0);
        RenderSupport_101.a.L("uResolution", (float)a4, (float)a3);
        RenderSupport_101.a.L("uBlurDir", (float)a2, 0.0f);
        RenderSupport_101.a.L("uRadius", a2 == 0.0f && a == 0.0f ? 0.0f : 8.0f);
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

    public static boolean L() {
if (l && OpenGlHelper.framebufferSupported) {
            return 1 != 0;
        }
        return false;
    }

    private static void d(int n, int n2) {
        int a = n2;
        int a2 = n;
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
        GlStateManager.enableTexture2D();
        int n3 = 0;
        GlStateManager.viewport(n3, n3, a2, a);
    }

    public static void d() {
if (!RenderSupport_101.L()) {
            return;
        }
        B = true;
        K = 1;
    }

    public static int L() {
if (RenderSupport_101.L()) {
            return m;
        }
        return -1;
    }

    private static void L() {
try {
            Minecraft minecraft;
            int n;
            Minecraft minecraft2 = Minecraft.getMinecraft();
            Framebuffer framebuffer = minecraft2.getFramebuffer();
            if (OpenGlHelper.isFramebufferEnabled() && minecraft2.getFramebuffer() != null) {
                n = 1;
                minecraft = minecraft2;
            } else {
                n = 0;
                minecraft = minecraft2;
            }
            RenderSupport_101.L(minecraft2, framebuffer, n != 0, minecraft.displayWidth, minecraft2.displayHeight);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void L(int n, int n2, int n3, int n4) {
        void a32;
        int a;
        int a422 = n3;
        int a2 = n;
int n5 = d && !K ? 1 : 0;
        int n6 = D;
        int n7 = i;
        int n8 = C;
        int n9 = g;
        d = 0;
        K = 0;
        if (n5 == 0) {
            return;
        }
        float a422 = (float)a2 / (float)a422;
        float a32 = (float)a / (float)a32;
        n5 = 32 + Math.round(64.0f * Math.max(a422, a32));
        n6 = Math.clamp((long)((int)Math.floor((float)n6 * a422) - n5), 0, a2);
        n7 = Math.clamp((long)((int)Math.floor((float)n7 * a32) - n5), 0, a);
        int a422 = Math.clamp((long)((int)Math.ceil((float)n8 * a422) + n5), n6, a2);
        a = Math.clamp((long)((int)Math.ceil((float)n9 * a32) + n5), n7, a);
        if (a422 <= n6 || a <= n7) {
            return;
        }
        GL11.glEnable(3089);
        int n10 = n6;
        GL11.glScissor(n10, n7, a422 - n10, a - n7);
        f = 1;
    }

    private static void L(int n, int n2) {
        int a = n2;
        int a2 = n;
if (I != -1 && M == a2 && k == a) {
            return;
        }
        RenderSupport_101.h();
        m = RenderSupport_101.L(a2, a);
        A = RenderSupport_101.L(a2, a);
        I = RenderSupport_101.L(m);
        H = RenderSupport_101.L(A);
        if (I == -1 || H == -1) {
            throw new IllegalStateException("could not create blur render targets");
        }
        M = a2;
        k = a;
        RenderSupport_101.L(I);
        RenderSupport_101.L(H);
    }

    static {
        m = -1;
        I = -1;
        A = -1;
        H = -1;
        h = -1;
        l = 1;
    }
}

