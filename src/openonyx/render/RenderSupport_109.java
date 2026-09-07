/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.history.Range;
import openonyx.render.RenderSupport_159;
import openonyx.render.group_k.RenderSupport_152;
import openonyx.render.group_p.RenderSupport_166;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_109
implements OnyxListener_001 {
    private static int I = -1;
    private static int d;
    private static boolean i;
    private final static int f = 5889;
    private static int H;
    private final static int e = 5888;

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_166 class_166, Consumer<RenderSupport_166> consumer, RenderSupport_159 class_159) {
        RenderSupport_159 class_1592;
        int n;
        Object a = class_159;
        RenderSupport_166 a2 = class_166;
if (!RenderSupport_109.L() || a2 == null || !a2.L()) {
            return;
        }
        Minecraft minecraft = OnyxListener_001.e;
        Framebuffer framebuffer = minecraft.getFramebuffer();
        int n2 = OpenGlHelper.isFramebufferEnabled() && framebuffer != null ? 1 : 0;
        int n3 = n2 != 0 ? framebuffer.framebufferWidth : minecraft.displayWidth;
        int n4 = n = n2 != 0 ? framebuffer.framebufferHeight : minecraft.displayHeight;
        if (n3 <= 0 || n <= 0) {
            return;
        }
        Minecraft minecraft2 = minecraft = a == null ? null : ((RenderSupport_159)a).L(n3, n);
        if (a != null && minecraft == null) {
            return;
        }
        if (minecraft == null) {
            class_1592 = null;
        } else {
            Minecraft minecraft3 = minecraft;
            class_1592 = ((RenderSupport_159)((Object)minecraft3)).L(((RenderSupport_159)((Object)minecraft3)).i()).L(n3, n);
        }
        a = class_1592;
        try {
            void a3;
            int n5;
            GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
            RenderSupport_109.d(n3, n);
            GlStateManager.bindTexture(I);
            int n6 = 3553;
            if (a == null) {
                int n7 = 0;
                GL11.glCopyTexSubImage2D(n6, n7, n7, n7, n7, 0, n3, n);
                n5 = n3;
            } else {
                GL11.glCopyTexSubImage2D(n6, 0, ((RenderSupport_159)a).D(), ((RenderSupport_159)a).I(), ((RenderSupport_159)a).D(), ((RenderSupport_159)a).I(), ((RenderSupport_159)a).L(), ((RenderSupport_159)a).d());
                n5 = n3;
            }
            RenderSupport_109.L(n5, n);
            if (n2 != 0) {
                framebuffer.bindFramebuffer(5 >> 3);
            }
            GlStateManager.bindTexture(I);
            RenderSupport_166 class_1662 = a2;
            a2.d();
            class_1662.L("Sampler0", 0);
            class_1662.L("uResolution", n3, n);
            a3.accept(class_1662);
            RenderSupport_109.L((RenderSupport_159)((Object)minecraft), n3, n);
            RenderSupport_109.d();
            return;
        }
        catch (Throwable a3) {
            RenderSupport_109.L(a3);
            return;
        }
    }

    public static int d() {
Framebuffer framebuffer = OnyxListener_001.e.getFramebuffer();
        if (OpenGlHelper.isFramebufferEnabled() && framebuffer != null) {
            return framebuffer.framebufferWidth;
        }
        return OnyxListener_001.e.displayWidth;
    }

    public static void L(RenderSupport_166 class_166, Consumer<RenderSupport_166> consumer) {
        Consumer<RenderSupport_166> a = consumer;
        RenderSupport_166 a2 = class_166;
RenderSupport_109.L(a2, a, null);
    }

    private RenderSupport_109() {
        RenderSupport_109 a;
    }

    public static int L() {
Framebuffer framebuffer = OnyxListener_001.e.getFramebuffer();
        if (OpenGlHelper.isFramebufferEnabled() && framebuffer != null) {
            return framebuffer.framebufferHeight;
        }
        return OnyxListener_001.e.displayHeight;
    }

    static {
        i = 1;
    }

    private static void L(Throwable a) {
i = 0;
        try {
            RenderSupport_109.L();
        }
        catch (Throwable throwable) {}
        OnyxClient.H.warn("Post-processing unavailable, effects disabled for this session", a);
    }

    public static boolean L() {
if (i && OpenGlHelper.shadersSupported) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_159 class_159, int n, int n2) {
        RenderSupport_159 class_1592 = class_159;
float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        float a = 1.0f;
        if (class_1592 != null) {
            void a2;
            void a3;
            RenderSupport_159 class_1593 = class_1592;
            f2 = (float)class_1593.D() / (float)a3;
            f3 = (float)class_1593.I() / (float)a2;
            f4 = (float)(class_1593.D() + class_1592.L()) / (float)a3;
            a = (float)(class_1593.I() + class_1592.d()) / (float)a2;
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glBegin(7);
        GL11.glTexCoord2f(f2, f3);
        GL11.glVertex2f(f2, f3);
        GL11.glTexCoord2f(f4, f3);
        GL11.glVertex2f(f4, f3);
        GL11.glTexCoord2f(f4, 0);
        GL11.glVertex2f(f4, 0);
        GL11.glTexCoord2f(f2, 0);
        GL11.glVertex2f(f2, 0);
        GL11.glEnd();
    }

    private static void d(int n, int n2) {
        int a = n2;
        int a2 = 0;
if (I != -1 && H == a2 && d == a) {
            return;
        }
        RenderSupport_109.L();
        I = TextureUtil.glGenTextures();
        GlStateManager.bindTexture(I);
        GL11.glTexImage2D(3553, 0, 32856, a2, a, 0, 6408, 5121, (ByteBuffer)null);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
        int n3 = GL11.glGetError();
        if (n3 != 0) {
            throw new IllegalStateException(new StringBuilder().insert(0, "post target allocation failed, GL error ").append(n3).toString());
        }
        H = a2;
        d = a;
    }

    private static void L(int n, int n2) {
        int a = n2;
        int a2 = 0;
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
        GlStateManager.depthMask(5 >> 3);
        GlStateManager.disableLighting();
        GlStateManager.enableTexture2D();
        int n3 = 0;
        GlStateManager.viewport(n3, n3, a2, a);
    }

    private static void d() {
RenderSupport_166.L();
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.enableLighting();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    private static void L() {
if (I != -1) {
            TextureUtil.deleteTexture(I);
            I = -1;
        }
        H = 0;
        d = 0;
    }
}

