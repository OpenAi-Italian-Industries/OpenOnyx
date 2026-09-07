/*
 * Decompiled with CFR.
 */
package openonyx.render.group_k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.render.group_k.RenderSupport_154;
import openonyx.render.group_k.RenderSupport_156;
import openonyx.render.group_k.RenderSupport_157;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_151
implements OnyxListener_001 {
    private float c;
    private final static int a = 400;
    private final static float[] k;
    private final static int g = 24;
    private float M;
    private final static float[] L;
    private boolean j;
    private final List<RenderSupport_157> m;
    private final static int h = 160;
    private final Random l;
    private float I;
    private final static float d = 130.0f;
    private final static int i = 96;
    private float f;
    private final static ResourceLocation H;
    private int e;

    /*
     * WARNING - void declaration
     */
    private static int d(int n, int n2, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
a2 = Math.clamp(4, 0.0f, 1.0f);
        a2 = -80.0f;
        return ThemeSupport_064.L(RenderSupport_151.L(ThemeSupport_064.d(a3), ThemeSupport_064.d((int)a), 4), RenderSupport_151.L(ThemeSupport_064.i(a3), ThemeSupport_064.i((int)a), 4), RenderSupport_151.L(ThemeSupport_064.D(a3), ThemeSupport_064.D((int)a), 4), RenderSupport_151.L(ThemeSupport_064.L(a3), ThemeSupport_064.L((int)a), 4));
    }

    /*
     * WARNING - void declaration
     */
    private void L(float[] fArray, Vec3 vec3, float f2, float f3) {
        Iterator<RenderSupport_157> iterator;
        RenderSupport_151 class_151 = this;
if (class_151.m.isEmpty()) {
            return;
        }
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        e.getTextureManager().bindTexture(H);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GlStateManager.blendFunc(770, 1);
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        Iterator<RenderSupport_157> iterator2 = iterator = class_151.m.iterator();
        while (iterator2.hasNext()) {
            void a;
            void a2;
            void a3;
            void a4;
            float f4;
            RenderSupport_157 a5 = iterator.next();
            float f5 = 1.0f - (float)a5.g / (float)Math.max(1, a5.j);
            if (f4 <= 0.0f) {
                iterator2 = iterator;
                continue;
            }
            Object object = a5;
            double d = ((RenderSupport_157)object).k + (a5.M - a5.k) * (double)a4 - a3.xCoord;
            Object object2 = a5;
            double d2 = ((RenderSupport_157)object).e + (((RenderSupport_157)object2).i - a5.e) * (double)a4 - a3.yCoord;
            double d3 = ((RenderSupport_157)object2).d + (a5.l - a5.d) * (double)a4 - a3.zCoord;
            Object object3 = a5;
            float f6 = 0.72f + 0.28f * (float)Math.sin((float)(((RenderSupport_157)object3).g + ((RenderSupport_157)object3).h) * 0.7f);
            f6 = a2 * f5 * f6 * 0.82f;
            f5 = ((RenderSupport_157)object).I * (0.75f + f5 * 0.45f);
            iterator2 = iterator;
            WorldRenderer worldRenderer2 = worldRenderer;
            RenderSupport_154.L(worldRenderer2, d, d2, d3, f5 * 5.4f * 2.0f, class_151.L((float[])a, a5.h, f6 * 0.24f));
            RenderSupport_154.L(worldRenderer2, d, d2, d3, f5 * 2.0f, class_151.L((float[])a, a5.h, f6));
        }
        tessellator.draw();
    }

    public RenderSupport_151() {
        RenderSupport_151 a;
        RenderSupport_151 class_151 = a;
        a.m = new ArrayList<RenderSupport_157>();
        class_151.l = new Random();
    }

    private float d(float f2) {
        float a = f2;
        RenderSupport_151 a2 = this;
return (float)((Math.sin(Math.toRadians(0 + a2.c)) + 1.0) * 0.5);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float[] fArray, double d, double d2, double d3, float f2, float f3, float f4) {
        int a;
        RenderSupport_151 class_151 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        int n = 0;
        while (n <= 160) {
            void a2;
            void a3;
            void a4;
            void a5;
            void a6;
            void a7;
            void a8;
            float f5 = 0.0f;
            double d4 = Math.toRadians(f5);
            RenderSupport_151.L(worldRenderer, (double)(a8 + Math.cos(d4) * (double)a7), (double)a6, (double)(a5 + Math.sin(d4) * (double)a7), class_151.L((float[])a4, (int)(f5 + a3), (float)a2));
            n = ++a;
        }
        tessellator.draw();
    }

    /*
     * WARNING - void declaration
     */
    private void L(float[] fArray, double d, double d2, double d3, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        RenderSupport_151 class_151 = this;
GlStateManager.disableTexture2D();
        GlStateManager.blendFunc(770, 1);
        GlStateManager.shadeModel(7425);
        if (a8 > 0.0f) {
            int a9;
            int n = 0;
            while (n < k.length) {
                float f6;
                float f7 = L[0] * a8;
                if (!(f6 <= 0.0f)) {
                    void v2 = a7;
                    class_151.L((float[])a6, (double)a5, (double)a4, (double)a3, (float)v2, (float)a2, (float)(a * Math.min(1.0f, f7)), (double)(v2 * k[0]));
                }
                n = ++a9;
            }
        }
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(1.4f);
        class_151.L((float[])a6, (double)a5, (double)a4, (double)a3, (float)a7, (float)a2, (float)a);
        GL11.glLineWidth(1.0f);
        GL11.glDisable(2848);
        GlStateManager.shadeModel(7424);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, double d, double d2, double d3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = n;
        WorldRenderer a5 = worldRenderer;
a5.pos((double)a4, (double)a3, (double)a2).color(ThemeSupport_064.i(0), ThemeSupport_064.D(0), ThemeSupport_064.L(0), ThemeSupport_064.d(0)).endVertex();
    }

    /*
     * WARNING - void declaration
     */
    private int L(float[] fArray, int n, float f2) {
        boolean a;
        void a22;
        Object a32 = fArray;
        RenderSupport_151 a4 = this;
int a22 = Math.clamp((long)((int)(255.0f * a22)), 0, 255);
        int a32 = ThemeSupport_064.L((float)(a32[0] + (float)(a4.j ? a : false)), (float)a32[1], (float)a32[2], a22);
        if (a4.I <= 0.0f) {
            return a32;
        }
        int n2 = 32;
        return RenderSupport_151.d(a32, ThemeSupport_064.L(a22, 255, n2, n2), a4.I);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float[] fArray, double d, double d2, double d3, float f2, float f3, float f4, float f5, float f6) {
        int n;
        float a;
        void a2;
        RenderSupport_151 class_151 = this;
if (a2 <= 0.0f) {
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        a = 130.0f * a;
        GlStateManager.disableTexture2D();
        GlStateManager.blendFunc(770, 1);
        GlStateManager.shadeModel(7425);
        int n2 = 0;
        while (n2 < 24) {
            void a3;
            void a4;
            void a5;
            void var16_16 = a5 + (double)(a4 * class_151.d((float)(a3 - a * 0.0f / 24.0f)));
            void var18_17 = a5 + (double)(a4 * class_151.d((float)(a3 - a * 1.0f / 24.0f)));
            float f7 = RenderSupport_151.L(0.0f);
            float f8 = RenderSupport_151.L(0.041666668f);
            worldRenderer.begin(5, DefaultVertexFormats.POSITION_COLOR);
            int n3 = 0;
            while (n3 <= 96) {
                void a6;
                void a7;
                void a8;
                void a9;
                int n4;
                float a222 = (float)n4 / 96.0f * 360.0f;
                double d4 = Math.toRadians(0);
                void var26_22 = a9 + Math.cos(d4) * (double)a8;
                d4 = a7 + Math.sin(d4) * (double)a8;
                float f9 = RenderSupport_151.L(0, (float)a3);
                int a222 = (int)(0 + a3);
                WorldRenderer worldRenderer2 = worldRenderer;
                RenderSupport_151.L(worldRenderer2, (double)var26_22, (double)var16_16, d4, class_151.L((float[])a6, 0, (float)(a2 * f7 * f9)));
                RenderSupport_151.L(worldRenderer2, (double)var26_22, (double)var18_17, d4, class_151.L((float[])a6, 0, (float)(a2 * f8 * f9)));
                n3 = ++n4;
            }
            tessellator.draw();
            n2 = ++n;
        }
        GlStateManager.shadeModel(7424);
    }

    static {
        H = new ResourceLocation("onyx", "textures/effect/target_bloom.png");
        float[] fArray = new float[3];
        fArray[0] = 0.3f;
        fArray[1] = 0.13f;
        fArray[2] = 0.05f;
        k = fArray;
        float[] fArray2 = new float[3];
        fArray2[0] = 0.16f;
        fArray2[1] = 0.26f;
        fArray2[2] = 0.42f;
        L = fArray2;
    }

    public void d() {
        RenderSupport_151 a;
RenderSupport_151 class_151 = a;
        RenderSupport_151 class_1512 = a;
        a.m.clear();
        class_1512.I = 0.0f;
        class_1512.e = 0;
        class_151.M = 0.0f;
        class_151.f = 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    public void d(EntityLivingBase entityLivingBase, float f2, RenderSupport_156 class_156) {
        int n;
        void a;
        void a2;
        RenderSupport_156 a3 = class_156;
        RenderSupport_151 a4 = this;
a4.c = a3.d();
        if (a2 == null) {
            a4.d();
            return;
        }
        RenderSupport_151 class_151 = a4;
        class_151.L((EntityLivingBase)a2, a3);
        class_151.f = class_151.M;
        class_151.M += a3.F() * 6.0f;
        class_151.L();
        if (!a3.i() || a4.m.size() >= 400) {
            return;
        }
        int n2 = (int)((float)(3 + a4.l.nextInt(4)) * Math.max(0.15f, (float)a));
        int n3 = 0;
        while (n3 < n2 && a4.m.size() < 400) {
            a4.L((EntityLivingBase)a2, (float)a, a3);
            n3 = ++n;
        }
    }

    private static float L(float f2) {
        float f3 = f2;
float a = 1.0f - f3;
        return a * a * a * 0.55f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(EntityLivingBase entityLivingBase, RenderSupport_156 class_156) {
        void a22;
        RenderSupport_156 a = class_156;
        RenderSupport_151 a3 = this;
if (!a.L() || a22 == null) {
            a3.I = 0.0f;
            a3.e = 0;
            return;
        }
        int a22 = a22.hurtTime;
        if (a22 > a3.e || a22 > 0 && a3.e == 0) {
            v0 = a3;
            a3.I = Math.min(a.l(), a3.I + a.h());
        } else {
            RenderSupport_151 class_151 = a3;
            if (a22 > 0) {
                class_151.I = Math.min(a.l(), a3.I + a.h() * 0.5f);
                v0 = a3;
            } else {
                class_151.I = Math.max(0.0f, a3.I - a.L());
                v0 = a3;
            }
        }
        v0.e = a22;
    }

    /*
     * WARNING - void declaration
     */
    public void L(EntityLivingBase entityLivingBase, float f2, float f3, RenderSupport_156 class_156) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_151 class_151 = this;
Object a5 = e.getRenderViewEntity();
        if (a5 == null) {
            return;
        }
        a5 = new Vec3(((Entity)a5).prevPosX + (((Entity)a5).posX - ((Entity)a5).prevPosX) * (double)a4, ((Entity)a5).prevPosY + (((Entity)a5).posY - ((Entity)a5).prevPosY) * (double)a4, ((Entity)a5).prevPosZ + (((Entity)a5).posZ - ((Entity)a5).prevPosZ) * (double)a4);
        void v0 = a3;
        RenderSupport_151 class_1512 = class_151;
        class_1512.j = a2.D();
        class_1512.c = a2.d();
        float f4 = 0.72f + 0.28f * a;
        f4 = (v0.width * 0.86f + 0.18f) * a2.k() * f4;
        RenderSupport_151 class_1513 = class_151;
        float f5 = class_151.f + (class_1513.M - class_1513.f) * a4;
        void v3 = a;
        a = v3 * v3;
        Object object = RenderSupport_154.L((Entity)v0, (float)a4);
        Vec3 vec3 = object;
        double d = vec3.xCoord - ((Vec3)a5).xCoord;
        double d2 = vec3.yCoord - ((Vec3)a5).yCoord;
        double d3 = d2 + (double)(a3.height * class_151.d(f5));
        double d4 = vec3.zCoord - ((Vec3)a5).zCoord;
        object = ThemeSupport_064.L(a2.L());
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.disableLighting();
        GlStateManager.disableAlpha();
        GlStateManager.enableDepth();
        GlStateManager.depthMask(0 != 0);
        if (a2.d()) {
            class_151.L((float[])object, d, d2, d4, a3.height, f4, f5, (float)(a * a2.i()), a2.D());
        }
        class_151.L((float[])object, d, d3, d4, f4, f5, (float)(a * 0.92f), a2.H());
        if (a2.i()) {
            class_151.L((float[])object, (Vec3)a5, (float)a4, (float)a);
        }
        GlStateManager.depthMask(true);
        GlStateManager.enableAlpha();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.blendFunc(770, 771);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    private void L() {
        RenderSupport_151 class_151 = this;
Iterator<RenderSupport_157> iterator = class_151.m.iterator();
        while (iterator.hasNext()) {
            RenderSupport_157 a = iterator.next();
            a.k = a.M;
            a.e = a.i;
            a.d = a.l;
            a.M += a.L;
            a.i += a.H;
            a.l += a.f;
            a.L *= 0.96;
            a.H -= 0.0022;
            a.f *= 0.96;
            a.g += 1;
            if (a.g < a.j && !(a.i < a.m)) continue;
            iterator.remove();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
return (int)((float)a3 + (float)(a - a3) * 4);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float[] fArray, double d, double d2, double d3, float f2, float f3, float f4, double d4) {
        int n;
        RenderSupport_151 class_151 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        int n2 = -1;
        while (n2 <= 1) {
            worldRenderer.begin(5, DefaultVertexFormats.POSITION_COLOR);
            int n3 = 0;
            while (n3 <= 160) {
                void a;
                void a2;
                void a3;
                void a4;
                double d5;
                void a5;
                void a6;
                void a7;
                void a8;
                int n4;
                float a222 = (float)n4 / 160.0f * 360.0f;
                double d6 = Math.toRadians(0);
                double d7 = Math.cos(d6);
                d6 = Math.sin(d6);
                void var23_19 = a8 + d7 * (double)a7;
                void var25_20 = a6 + d6 * (double)a7;
                double d8 = -d7 * a5;
                d7 = d7 * var23_19 + d6 * var25_20;
                d6 = -d6 * a5;
                double d9 = d8;
                double d10 = d7;
                double d11 = d6;
                double d12 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
                if (d5 < 1.0E-6) {
                    d8 = 0.0;
                    d7 = 1.0;
                    d6 = 0.0;
                    d12 = 1.0;
                }
                d8 = d8 / d12 * a4 * -1.0;
                d7 = d7 / d12 * a4 * -1.0;
                d6 = d6 / d12 * a4 * -1.0;
                RenderSupport_151 class_1512 = class_151;
                void v7 = a3;
                int n5 = class_1512.L((float[])v7, (int)(0 + a2), (float)a);
                int a222 = class_1512.L((float[])v7, (int)(0 + a2), 0.0f);
                WorldRenderer worldRenderer2 = worldRenderer;
                RenderSupport_151.L(worldRenderer2, (double)var23_19, (double)a5, (double)var25_20, n5);
                RenderSupport_151.L(worldRenderer2, (double)(var23_19 + d8), (double)(a5 + d7), (double)(var25_20 + d6), 0);
                n3 = ++n4;
            }
            tessellator.draw();
            n2 = n += 2;
        }
    }

    private static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
double d = Math.sin(Math.toRadians(a2 * 3.0f + a * 1.3f));
        double d2 = Math.sin(Math.toRadians(a2 * 7.0f - a * 0.6f));
        return 0.595f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(EntityLivingBase entityLivingBase, float f2, RenderSupport_156 class_156) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        void a;
        void a2;
        Object a3 = entityLivingBase;
        RenderSupport_151 a4 = this;
Object object = a3;
        Object object2 = a3;
        float f3 = (((EntityLivingBase)object2).width * 0.86f + 0.18f) * a2.k() * a;
        float f4 = a4.d(a4.M);
        double d6 = ((EntityLivingBase)object).posX;
        double d7 = ((EntityLivingBase)object2).posY + 0.03;
        double d8 = ((EntityLivingBase)object).posY + (double)((EntityLivingBase)a3).height - 0.03;
        double d9 = d7;
        double d10 = d9 + (d8 - d9) * (double)f4;
        double d11 = ((EntityLivingBase)object).posZ;
        double d12 = a4.l.nextDouble() * Math.PI * 2.0;
        double d13 = (double)f3 * (0.88 + a4.l.nextDouble() * 0.22);
        void v3 = a2;
        double d14 = ((EntityLivingBase)object).height * v3.I();
        if (v3.I() >= 0.98f) {
            d4 = d5 = d7 + a4.l.nextDouble() * (d8 - d7);
        } else {
            double d15;
            d3 = d14 * 0.5;
            d5 = d10 + (a4.l.nextDouble() - 0.5) * d14;
            d2 = Math.max(d7, d10 - d3);
            d = Math.min(d8, d10 + d3);
            if (d15 > d2) {
                d5 = Math.max(d2, Math.min(d, d5));
            }
            d4 = d5;
        }
        d5 = d4 + (a4.l.nextDouble() - 0.5) * 0.025;
        d5 = Math.max(d7, Math.min(d8, d5));
        d3 = Math.cos(d12);
        d2 = Math.sin(d12);
        RenderSupport_151 class_151 = a4;
        d = (class_151.l.nextDouble() - 0.5) * 0.01;
        a3 = new RenderSupport_157(d6 + d3 * d13, d5, d11 + d2 * d13, d3 * d, -8.0E-4 - a4.l.nextDouble() * 0.006, d2 * d, d7 - 0.08, Math.max(1, (int)((float)(34 + a4.l.nextInt(28)) * a2.e())), (0.0065f + a4.l.nextFloat() * 0.014f) * a2.k() * a, a4.l.nextInt(360));
        class_151.m.add((RenderSupport_157)a3);
    }
}

