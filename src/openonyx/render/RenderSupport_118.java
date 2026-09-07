/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import openonyx.features.render.GlowESP;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.render.RenderSupport_133;
import openonyx.render.group_g.RenderSupport_137;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_118 {
    private final static float M = 24.0f;
    private final static FloatBuffer L;
    private final static int j = 9729;
    private final static float m = 10000.0f;
    private final static float h = 4.0f;
    private final static float l = 2.0f;
    private final static float I = 0.1f;
    private final static float d = 6.0f;
    private final static long i;
    private final static float f = 1.0f;
    private static boolean H;
    private final static float e = 1.6f;

    /*
     * WARNING - void declaration
     */
    private static void L(ShaderManager shaderManager, String string, float f2, float f3, float f4) {
        Object a = string;
        ShaderManager a2 = shaderManager;
a = a2.getShaderUniform((String)a);
        if (a != null) {
            void a3;
            void a4;
            void a5;
            ((ShaderUniform)a).set((float)a5, (float)a4, (float)a3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void L(ShaderManager shaderManager, String string, float f2, float f3, float f4, float f5) {
        Object a = string;
        ShaderManager a2 = shaderManager;
a = a2.getShaderUniform((String)a);
        if (a != null) {
            void a3;
            void a4;
            void a5;
            void a6;
            ((ShaderUniform)a).set((float)a6, (float)a5, (float)a4, (float)a3);
        }
    }

    private RenderSupport_118() {
        RenderSupport_118 a;
    }

    private static float D() {
GlowESP class_309 = GlowESP.L();
        float f2 = class_309 == null ? 24.0f : Math.clamp(class_309.H.L(), 2.0f, 24.0f);
        return f2 * 1.6f + 6.0f;
    }

    static {
        i = System.nanoTime();
        L = BufferUtils.createFloatBuffer(4);
    }

    public static boolean L() {
return H;
    }

    public static float d() {
GlowESP class_309 = GlowESP.L();
        if (class_309 != null && class_309.h()) {
            return 4.0f;
        }
        return RenderSupport_118.D();
    }

    public static void L() {
H = 0;
        GL11.glTexEnvi(8960, 8704, 8448);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(ShaderGroup shaderGroup, float f2, float f3) {
        int a;
        void a2;
        ShaderGroup shaderGroup2 = shaderGroup;
float f4 = Math.max(1, Minecraft.getMinecraft().displayWidth);
        void var4_6 = a2 * 1.6f + 6.0f;
        List<Shader> list = shaderGroup2.getListShaders();
        int n = 0;
        while (n < list.size()) {
            void a3;
            Shader shader = list.get(0);
            ShaderManager shaderManager = shader.getShaderManager();
            float f5 = (float)shader.framebufferIn.framebufferTextureWidth / f4;
            ShaderManager shaderManager2 = shaderManager;
            RenderSupport_118.L(shaderManager2, "Radius", Math.max(1.0f, (float)(a2 * f5)));
            RenderSupport_118.L(shaderManager2, "Intensity", (float)a3);
            RenderSupport_133.L(shader, (float)(0 == 0 ? var4_6 * 2.0f : var4_6));
            n = ++a;
        }
        ShaderGroup shaderGroup3 = shaderGroup2;
        RenderSupport_118.L(shaderGroup3, "final");
        RenderSupport_118.L(shaderGroup3, "blurx");
        RenderSupport_118.L(shaderGroup2, "halo");
    }

    public static float L() {
GlowESP class_309 = GlowESP.L();
        if (class_309 != null && class_309.h()) {
            return 8.0f;
        }
        return 3.0f * RenderSupport_118.D();
    }

    public static void L(int a) {
H = 1;
        L.clear();
        L.put((float)(a >> 16 & 0xFF) / 255.0f).put((float)(a >> 8 & 0xFF) / 255.0f).put((float)(a & 0xFF) / 255.0f).put(1.0f);
        L.flip();
        GL11.glTexEnv(8960, 8705, L);
        GL11.glTexEnvi(8960, 8704, 34160);
        GL11.glTexEnvi(8960, 34161, 7681);
        GL11.glTexEnvi(8960, 34176, 34166);
        GL11.glTexEnvi(8960, 34192, 768);
        GL11.glTexEnvi(8960, 34162, 8448);
        GL11.glTexEnvi(8960, 34184, 5890);
        GL11.glTexEnvi(8960, 34200, 770);
        GL11.glTexEnvi(8960, 34185, 34167);
        GL11.glTexEnvi(8960, 34201, 770);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(ShaderGroup shaderGroup, float f2) {
        Object a;
        ShaderGroup shaderGroup2 = shaderGroup;
float f3 = (float)(System.nanoTime() - i) / 1.0E9f % 10000.0f;
        Object object = a = shaderGroup2.getListShaders().iterator();
        while (object.hasNext()) {
            void a2;
            ShaderManager shaderManager;
            Shader shader = (Shader)a.next();
            ShaderManager shaderManager2 = shaderManager = shader.getShaderManager();
            RenderSupport_118.L(shaderManager2, "BaseColor", 0.0f, 0.0f, 0.0f, (float)a2);
            RenderSupport_118.L(shaderManager2, "EffectData", f3, 0.0f, 0.0f, 0.0f);
            RenderSupport_133.L(shader, 4.0f);
            object = a;
        }
    }

    private static void L(ShaderGroup shaderGroup, String string) {
        Object a = string;
        ShaderGroup a2 = shaderGroup;
a = a2.getFramebufferRaw((String)a);
        if (a == null || ((Framebuffer)a).framebufferFilter == 9729) {
            return;
        }
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        ((Framebuffer)a).setFramebufferFilter(9729);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(ShaderManager shaderManager, String string, float f2) {
        Object a = string;
        ShaderManager a2 = shaderManager;
a = a2.getShaderUniform((String)a);
        if (a != null) {
            void a3;
            ((ShaderUniform)a).set((float)a3);
        }
    }

    public static void L(ShaderGroup shaderGroup) {
        ShaderGroup shaderGroup2 = shaderGroup;
GlowESP a = GlowESP.L();
        if (shaderGroup2 == null || a == null || !a.d()) {
            return;
        }
        Object object = a;
        float f2 = Math.clamp(((GlowESP)object).d.L() / 100.0f, 0.1f, 1.0f);
        if (((GlowESP)object).h()) {
            RenderSupport_118.L(shaderGroup2, f2);
            return;
        }
        RenderSupport_118.L(shaderGroup2, Math.clamp(a.H.L(), 2.0f, 24.0f), f2);
    }
}

