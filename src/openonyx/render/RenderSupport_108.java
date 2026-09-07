/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import openonyx.theme.ThemeSupport_056;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_108 {
    private int I;
    private int d;
    private int i;
    private int f;
    private final boolean H;
    private int e;

    public int D() {
        RenderSupport_108 a;
return a.d;
    }

    public void D() {
        RenderSupport_108 a;
RenderSupport_108 class_108 = a;
        class_108.d();
        GlStateManager.clearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GlStateManager.clearDepth(1.0);
        GlStateManager.clear(class_108.H ? 16640 : 16384);
    }

    public int d() {
        RenderSupport_108 a;
return a.f;
    }

    public void d() {
        RenderSupport_108 a;
OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, a.I);
        int n = 0;
        RenderSupport_108 class_108 = a;
        GlStateManager.viewport(n, n, class_108.e, class_108.d);
    }

    public RenderSupport_108(boolean bl) {
        RenderSupport_108 a;
        boolean a2 = bl;
        RenderSupport_108 class_108 = a = this;
        RenderSupport_108 class_1082 = a;
        class_1082.f = -1;
        class_108.i = class_1082.I = -1;
        class_108.H = a2;
    }

    public int L() {
        RenderSupport_108 a;
return a.e;
    }

    public boolean L(int n, int n2) {
        int a;
        int a2 = n2;
        RenderSupport_108 a3 = this;
a = Math.max(1, a);
        a2 = Math.max(1, 4);
        if (a3.f != -1 && a3.e == a && a3.d == 4) {
            return 0 != 0;
        }
        RenderSupport_108 class_108 = a3;
        class_108.L();
        class_108.f = TextureUtil.glGenTextures();
        GlStateManager.bindTexture(class_108.f);
        GL11.glTexImage2D(3553, 0, 32856, a, 4, 0, 6408, 5121, (ByteBuffer)null);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
        a3.I = OpenGlHelper.glGenFramebuffers();
        RenderSupport_108 class_1082 = a3;
        OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, class_1082.I);
        OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, 3553, a3.f, 0);
        if (class_1082.H) {
            a3.i = OpenGlHelper.glGenRenderbuffers();
            OpenGlHelper.glBindRenderbuffer(OpenGlHelper.GL_RENDERBUFFER, a3.i);
            OpenGlHelper.glRenderbufferStorage(OpenGlHelper.GL_RENDERBUFFER, 33190, a, 4);
            OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, OpenGlHelper.GL_RENDERBUFFER, a3.i);
        }
        int n3 = OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);
        OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        if (n3 != OpenGlHelper.GL_FRAMEBUFFER_COMPLETE) {
            a3.L();
            throw new IllegalStateException(new StringBuilder().insert(0, "Could not create a hand effect target, status ").append(n3).toString());
        }
        a3.e = a;
        a3.d = 4;
        return --1 != 0;
    }

    public void L() {
        RenderSupport_108 a;
if (a.I != -1) {
            OpenGlHelper.glDeleteFramebuffers(a.I);
            a.I = -1;
        }
        if (a.i != -1) {
            OpenGlHelper.glDeleteRenderbuffers(a.i);
            a.i = -1;
        }
        if (a.f != -1) {
            TextureUtil.deleteTexture(a.f);
            a.f = -1;
        }
        a.d = a.e = 0;
    }
}

