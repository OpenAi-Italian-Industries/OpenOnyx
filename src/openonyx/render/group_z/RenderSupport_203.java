/*
 * Decompiled with CFR.
 */
package openonyx.render.group_z;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FeatureMode_305;
import openonyx.input.InputSupport_002;
import openonyx.render.group_e.RenderSupport_126;
import openonyx.render.group_e.RenderSupport_127;
import openonyx.render.group_e.RenderSupport_129;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;
import openonyx.render.group_z.RenderSupport_204;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.render.group_z.RenderSupport_206;
import openonyx.render.internal.RenderSupport_176;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_203
implements OnyxListener_001 {
    private final static String h = "  ";
    private boolean l;
    private final static float I = 0.49f;
    private final static ResourceLocation d = new ResourceLocation("onyx", "textures/effect/jump_circle.png");
    private final RenderSupport_204 i;
    private final static float f = 0.35f;
    private final static float H = (float)Math.PI * 2;
    private final static float e = 0.015f;

    private static int L(RenderSupport_205 class_205, float f2) {
        float a = f2;
        RenderSupport_205 a2 = class_205;
return Math.clamp((long)((int)(255.0f * a2.L() * Math.max(0.0f, 0))), 0, 255) << 24 | a2.L() & 0xFFFFFF;
    }

    private static void L(boolean a) {
GlStateManager.pushMatrix();
        GlStateManager.enableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.disableAlpha();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 1);
        GlStateManager.disableCull();
        GlStateManager.depthMask(0 != 0);
        GlStateManager.shadeModel(7425);
        if (a) {
            GlStateManager.disableDepth();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, List<RenderSupport_206> list, RenderSupport_205 class_205) {
        void a322;
        void a;
        RenderSupport_203 class_203 = this;
if (!class_203.l || a.isEmpty()) {
            return;
        }
        Entity a2 = e.getRenderViewEntity();
        if (a2 == null) {
            return;
        }
        Vec3 a322 = new Vec3(a2.prevPosX + (a2.posX - a2.prevPosX) * (double)a322, a2.prevPosY + (a2.posY - a2.prevPosY) * (double)a322, a2.prevPosZ + (a2.posZ - a2.prevPosZ) * (double)a322);
        long l = System.currentTimeMillis();
        try {
            void a4;
            void v0 = a;
            void v1 = a4;
            class_203.i.L((List<RenderSupport_206>)v0, (RenderSupport_205)v1, l);
            RenderSupport_203.L(v1.L());
            class_203.d((List<RenderSupport_206>)v0, (RenderSupport_205)a4, a322, l);
            if (a4.L() == FeatureMode_305.f) {
                class_203.L((List<RenderSupport_206>)a, (RenderSupport_205)a4, a322, l);
            }
            RenderSupport_203.d();
            return;
        }
        catch (Throwable a322) {
            class_203.l = 0;
            OnyxClient.H.warn("JumpCircles renderer has been disabled after a render failure", a322);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void d(List<RenderSupport_206> list, RenderSupport_205 class_205, Vec3 vec3, long l) {
        Iterator a;
        RenderSupport_203 class_203 = this;
e.getTextureManager().bindTexture(d);
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        Iterator iterator = a = a.iterator();
        while (iterator.hasNext()) {
            void a2;
            float f2;
            void a3;
            void a4;
            Object object = (RenderSupport_206)a.next();
            void v1 = a4;
            float f3 = RenderSupport_203.L((RenderSupport_206)object, (RenderSupport_205)v1, (long)a3);
            float a5 = RenderSupport_203.L((RenderSupport_205)v1, f3) / 0.49f;
            if (f2 <= 0.0f) {
                iterator = a;
                continue;
            }
            int n = RenderSupport_203.L((RenderSupport_205)a4, RenderSupport_203.L(f3));
            object = ((RenderSupport_206)object).L().subtract((Vec3)a2);
            iterator = a;
            WorldRenderer worldRenderer2 = worldRenderer;
            Object object2 = object;
            float f4 = a5;
            RenderSupport_203.L(worldRenderer, (Vec3)object, -f4, -a5, 0.0f, 0.0f, n);
            RenderSupport_203.L(worldRenderer, (Vec3)object2, -f4, a5, 0.0f, 1.0f, n);
            RenderSupport_203.L(worldRenderer2, (Vec3)object2, a5, a5, 1.0f, 1.0f, n);
            RenderSupport_203.L(worldRenderer2, (Vec3)object, a5, -a5, 1.0f, 0.0f, n);
        }
        tessellator.draw();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, Vec3 vec3, float f2, float f3, float f4, float f5, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        int n2 = n;
        WorldRenderer a7 = worldRenderer;
a7.pos(a6.xCoord + (double)a5, a6.yCoord + (double)0.015f, a6.zCoord + (double)a4).tex((double)a3, (double)a2).color(RenderSupport_203.L(0, 16), RenderSupport_203.L(0, 8), RenderSupport_203.L(0, 0), RenderSupport_203.L(0, 24)).endVertex();
    }

    private static float L(float a) {
return 1.0f - a;
    }

    private static int L(int n, int n2) {
        int a = n2;
        int a2 = 0;
return a2 >> a & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<RenderSupport_206> list, RenderSupport_205 class_205, Vec3 vec3, long l) {
        Iterator a;
        float f2;
        float f3;
        int n;
        void a2;
        RenderSupport_203 class_203 = this;
String string = a2.L().trim();
        if (string.isEmpty() || a2.h() <= 0.0f) {
            return;
        }
        RenderSupport_127 class_127 = RenderSupport_126.L(RenderMode_131.i, RenderMode_130.e);
        string = new StringBuilder().insert(0, string).append(h).toString();
        int n2 = 0;
        while (n2 < string.length()) {
            class_127.d(string.charAt(n++));
            n2 = 0;
        }
        n = class_127.L();
        if (0 == -1) {
            return;
        }
        GlStateManager.bindTexture(0);
        void v1 = a2;
        float f4 = v1.i() / class_127.d();
        float f5 = v1.h() - a2.i() * 1.35f;
        if (f3 <= 0.0f) {
            return;
        }
        float f6 = class_127.L(string) * f4;
        if (f2 <= 0.0f) {
            return;
        }
        float f7 = (float)Math.PI * 2 * f5;
        int n3 = Math.max(1, Math.round(f7 / f6));
        f6 = f7 / ((float)n3 * f6);
        Iterator iterator = a = a.iterator();
        while (iterator.hasNext()) {
            void a3;
            float f8;
            float f9;
            void a4;
            RenderSupport_206 class_206 = (RenderSupport_206)a.next();
            float f10 = RenderSupport_203.L(class_206, (RenderSupport_205)a2, (long)a4);
            float a3222 = RenderSupport_203.L(f10);
            if (f9 <= 0.0f) {
                iterator = a;
                continue;
            }
            f10 = RenderSupport_203.L((RenderSupport_205)a2, f10) / a2.h();
            if (f8 <= 0.0f) {
                iterator = a;
                continue;
            }
            float f11 = f4 * f10;
            f10 = f5 * f10;
            void v7 = a2;
            int a3222 = RenderSupport_203.L((RenderSupport_205)v7, a3222);
            GL11.glColor4f((float)RenderSupport_203.L(a3222, 16) / 255.0f, (float)RenderSupport_203.L(a3222, 8) / 255.0f, (float)RenderSupport_203.L(a3222, 0) / 255.0f, (float)RenderSupport_203.L(a3222, 24) / 255.0f);
            GL11.glBegin(7);
            Vec3 a3222 = class_206.L().subtract((Vec3)a3);
            float f12 = (float)Math.toRadians(v7.D() * RenderSupport_203.L(class_206, (long)a4));
            float f13 = 0.0f;
            int n4 = 0;
            while (n4 < n3) {
                int n5;
                int n6 = 0;
                while (n6 < string.length()) {
                    int n7;
                    RenderSupport_129 class_129 = class_127.d(string.charAt(n7));
                    if (!class_129.L()) {
                        float f14 = class_129.i() * f11;
                        float f15 = f13 + (class_129.D() * f11 + f14 / 2.0f) * f6;
                        RenderSupport_203.L(a3222, class_129, f12 + f15 / f10, f10, f14 / 2.0f, class_129.k() * f11, class_129.h() * f11);
                    }
                    f13 += class_129.L() * f11 * f6;
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            GL11.glEnd();
            iterator = a;
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    private static void d() {
GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.blendFunc(770, 771);
        GlStateManager.disableFog();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Vec3 vec3, double d, double d2, double d3, double d4, float f2, float f3) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        float f4 = f3;
        Vec3 a7 = vec3;
GL11.glTexCoord2f((float)a6, (float)a5);
        GL11.glVertex3d(a7.xCoord + a4 * a3 - a2 * a, a7.yCoord + (double)0.015f, a7.zCoord + a4 * a + a2 * a3);
    }

    private static float L(RenderSupport_205 class_205, float f2) {
        float a = f2;
        RenderSupport_205 a2 = class_205;
return a2.h() * (1.0f - (float)Math.pow(1.0f, 4.0));
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Vec3 vec3, RenderSupport_129 class_129, float f2, float f3, float f4, float f5, float f6) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        RenderSupport_129 a6 = class_129;
        Vec3 a7 = vec3;
double d = Math.cos((double)a5);
        double d2 = Math.sin((double)a5);
        double d3 = (double)(a4 - a3);
        double d4 = d3 - (double)a2;
        Vec3 vec32 = a7;
        double d5 = d;
        RenderSupport_203.L(a7, d, d2, d3, (double)(-a), a6.l(), a6.F());
        RenderSupport_203.L(a7, d5, d2, d4, (double)(-a), a6.l(), a6.d());
        RenderSupport_203.L(vec32, d5, d2, d4, (double)a, a6.I(), a6.d());
        RenderSupport_203.L(vec32, d, d2, d3, (double)a, a6.I(), a6.F());
    }

    /*
     * WARNING - void declaration
     */
    private static float L(RenderSupport_206 class_206, RenderSupport_205 class_205, long l) {
        void a;
        Record a2 = class_205;
        RenderSupport_206 a3 = class_206;
return Math.clamp((float)(a - a3.L()) / (float)((RenderSupport_205)a2).L(), 0.0f, 1.0f);
    }

    public RenderSupport_203() {
        RenderSupport_203 a;
        RenderSupport_203 class_203 = a;
        a.i = new RenderSupport_204();
        a.l = 1;
    }

    private static float L(RenderSupport_206 a, long a2) {
return (float)(a2 - a.L()) / 1000.0f;
    }

    public void L() {
a.l = 1;
    }
}

