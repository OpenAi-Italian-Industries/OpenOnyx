/*
 * Decompiled with CFR.
 */
package openonyx.render.group_k;

import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.events.Rotation;
import openonyx.render.group_k.RenderSupport_152;
import openonyx.render.group_k.CrystalEffectSettings;
import openonyx.render.group_k.RenderSupport_158;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_154
implements OnyxListener_001 {
    private final static float[] i;
    private final static float[][] f;
    private final static ResourceLocation H;
    private final static int[][] e;

    /*
     * WARNING - void declaration
     */
    private void d(Vec3 vec3, EntityLivingBase entityLivingBase, float f2, long l, float f3, CrystalEffectSettings class_155, RenderSupport_152 class_152) {
        int n;
        void a;
        void a2;
        void a222;
        void a3;
        RenderSupport_154 class_154 = this;
GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        e.getTextureManager().bindTexture(H);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GlStateManager.blendFunc(770, 1);
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        void v0 = a3;
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        Vec3 a222 = RenderSupport_154.L((Entity)v0, (float)a222);
        float f4 = RenderSupport_158.d(v0.width);
        float f5 = RenderSupport_158.D((float)a2);
        void var13_15 = a2 * 0.2f * a.d();
        int n2 = RenderSupport_158.L(a.D(), (float)var13_15);
        float f6 = RenderSupport_158.L(1.5f * a.D(), (float)a2);
        float f7 = RenderSupport_158.L(0.6f * a.D(), (float)a2);
        Vec3 vec32 = a222.addVector(0.0, a3.height / 2.0f, 0.0);
        int n3 = 0;
        while (n3 < 18) {
            void a4;
            void a5;
            void a6;
            float a7 = a6.L(0);
            Vec3 vec33 = RenderSupport_154.L(RenderSupport_154.L(a222, a3.height, 0, f4, f5, (long)a5, (float)a2), vec32, a7, a.L());
            double d = vec33.xCoord - a4.xCoord;
            double d2 = vec33.yCoord - a4.yCoord;
            double d3 = vec33.zCoord - a4.zCoord;
            int n4 = a7 <= 0.0f ? n2 : RenderSupport_158.L(RenderSupport_158.d(a.D(), a.L(), a7), (float)(var13_15 * (1.0f + a7 * 0.7f)));
            a7 = 1.0f + a7 * 0.8f;
            WorldRenderer worldRenderer2 = worldRenderer;
            RenderSupport_154.L(worldRenderer2, d, d2, d3, f6 * a7, n4);
            RenderSupport_154.L(worldRenderer2, d, d2, d3, f7 * a7, n4);
            n3 = ++n;
        }
        tessellator.draw();
    }

    static Vec3 L(Entity entity, float f2) {
        float a = f2;
        Entity a2 = entity;
return new Vec3(a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * 0.0, a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * 0.0, a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * 0.0);
    }

    /*
     * WARNING - void declaration
     */
    private static Vec3 L(Vec3 vec3, Vec3 vec32, float f2, float f3) {
        void a;
        void a2;
        float a3 = f2;
        Vec3 a4 = vec3;
if (a3 <= 0.0f) {
            return a4;
        }
        return a4.add(a2.subtract(a4).scale(a3 * a));
    }

    /*
     * WARNING - void declaration
     */
    public void L(EntityLivingBase entityLivingBase, float f2, long l, float f3, CrystalEffectSettings class_155, RenderSupport_152 class_152) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        RenderSupport_154 class_154 = this;
Object a7 = e.getRenderViewEntity();
        if (a7 == null) {
            return;
        }
        a7 = new Vec3(((Entity)a7).prevPosX + (((Entity)a7).posX - ((Entity)a7).prevPosX) * (double)a6, ((Entity)a7).prevPosY + (((Entity)a7).posY - ((Entity)a7).prevPosY) * (double)a6, ((Entity)a7).prevPosZ + (((Entity)a7).posZ - ((Entity)a7).prevPosZ) * (double)a6);
        GlStateManager.pushMatrix();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.depthMask(0 != 0);
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        RenderSupport_154 class_1542 = class_154;
        class_1542.L((Vec3)a7, (EntityLivingBase)a5, (float)a4, (long)a3, (float)a6, (CrystalEffectSettings)a2, (RenderSupport_152)a);
        class_1542.d((Vec3)a7, (EntityLivingBase)a5, (float)a4, (long)a3, (float)a6, (CrystalEffectSettings)a2, (RenderSupport_152)a);
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.enableAlpha();
        GlStateManager.enableCull();
        GlStateManager.depthMask(5 >> 2);
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    static {
        H = new ResourceLocation("onyx", "textures/effect/target_bloom.png");
        float[][] fArrayArray = new float[6][];
        float[] fArray = new float[3];
        int n = 0;
        fArray[n] = 0.0f;
        fArray[1] = 1.5f;
        fArray[2] = 0.0f;
        fArrayArray[n] = fArray;
        float[] fArray2 = new float[3];
        fArray2[0] = 0.0f;
        int n2 = 1;
        fArray2[n2] = -1.5f;
        fArray2[2] = 0.0f;
        fArrayArray[n2] = fArray2;
        float[] fArray3 = new float[3];
        fArray3[0] = 1.0f;
        fArray3[1] = 0.0f;
        int n3 = 2;
        fArray3[n3] = 0.0f;
        fArrayArray[n3] = fArray3;
        int n4 = 3;
        float[] fArray4 = new float[n4];
        fArray4[0] = -1.0f;
        fArray4[1] = 0.0f;
        fArray4[2] = 0.0f;
        fArrayArray[n4] = fArray4;
        float[] fArray5 = new float[3];
        fArray5[0] = 0.0f;
        fArray5[1] = 0.0f;
        fArray5[2] = 1.0f;
        fArrayArray[4] = fArray5;
        float[] fArray6 = new float[3];
        fArray6[0] = 0.0f;
        fArray6[1] = 0.0f;
        fArray6[2] = -1.0f;
        fArrayArray[5] = fArray6;
        f = fArrayArray;
        int[][] nArrayArray = new int[8][];
        int[] nArray = new int[3];
        int n5 = 0;
        nArray[n5] = 0;
        nArray[1] = 4;
        nArray[2] = 2;
        nArrayArray[n5] = nArray;
        int[] nArray2 = new int[3];
        int n6 = 0;
        nArray2[n6] = n6;
        int n7 = 1;
        nArray2[n7] = 3;
        nArray2[2] = 4;
        nArrayArray[n7] = nArray2;
        int[] nArray3 = new int[3];
        int n8 = 0;
        nArray3[n8] = n8;
        nArray3[1] = 5;
        nArray3[2] = 3;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[3];
        int n9 = 0;
        nArray4[n9] = n9;
        nArray4[1] = 2;
        nArray4[2] = 5;
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[3];
        nArray5[0] = 1;
        nArray5[1] = 2;
        nArray5[2] = 4;
        nArrayArray[4] = nArray5;
        int[] nArray6 = new int[3];
        nArray6[0] = 1;
        nArray6[1] = 4;
        nArray6[2] = 3;
        nArrayArray[5] = nArray6;
        int[] nArray7 = new int[3];
        nArray7[0] = 1;
        nArray7[1] = 3;
        nArray7[2] = 5;
        nArrayArray[6] = nArray7;
        int[] nArray8 = new int[3];
        nArray8[0] = 1;
        nArray8[1] = 5;
        nArray8[2] = 2;
        nArrayArray[7] = nArray8;
        e = nArrayArray;
        float[] fArray7 = new float[8];
        fArray7[0] = 1.0f;
        fArray7[1] = 0.8f;
        fArray7[2] = 0.6f;
        fArray7[3] = 0.9f;
        fArray7[4] = 0.7f;
        fArray7[5] = 0.5f;
        fArray7[6] = 0.4f;
        fArray7[7] = 0.6f;
        i = fArray7;
    }

    /*
     * WARNING - void declaration
     */
    static void L(WorldRenderer worldRenderer, double d, double d2, double d3, float f2, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int a5;
        float f3 = f2;
        WorldRenderer a6 = worldRenderer;
a3 /= 2.0f;
        float f4 = ActiveRenderInfo.getRotationX();
        float f5 = ActiveRenderInfo.getRotationXZ();
        float f6 = ActiveRenderInfo.getRotationZ();
        float f7 = ActiveRenderInfo.getRotationYZ();
        float f8 = ActiveRenderInfo.getRotationXY();
        int n2 = ThemeSupport_064.i(a5);
        int n3 = ThemeSupport_064.D(a5);
        int n4 = ThemeSupport_064.L(a5);
        a5 = ThemeSupport_064.d(a5);
        WorldRenderer worldRenderer2 = a6;
        void v1 = a4;
        a6.pos((double)(a4 - (double)(f4 * a3) - (double)(f7 * a3)), (double)(a2 - (double)(f5 * a3)), (double)(a - (double)(f6 * a3) - (double)(f8 * a3))).tex(0.0, 0.0).color(n2, n3, n4, a5).endVertex();
        a6.pos((double)(v1 - (double)(f4 * a3) + (double)(f7 * a3)), (double)(a2 + (double)(f5 * a3)), (double)(a - (double)(f6 * a3) + (double)(f8 * a3))).tex(0.0, 1.0).color(n2, n3, n4, a5).endVertex();
        worldRenderer2.pos((double)(v1 + (double)(f4 * a3) + (double)(f7 * a3)), (double)(a2 + (double)(f5 * a3)), (double)(a + (double)(f6 * a3) + (double)(f8 * a3))).tex(1.0, 1.0).color(n2, n3, n4, a5).endVertex();
        worldRenderer2.pos((double)(a4 + (double)(f4 * a3) - (double)(f7 * a3)), (double)(a2 - (double)(f5 * a3)), (double)(a + (double)(f6 * a3) - (double)(f8 * a3))).tex(1.0, 0.0).color(n2, n3, n4, a5).endVertex();
    }

    public RenderSupport_154() {
        RenderSupport_154 a;
    }

    private static float[] L(float[] fArray, Vec3 vec3) {
        float f2;
        Object a22 = vec3;
        float[] a = fArray;
float a22 = (float)a22.xCoord;
        float f3 = (float)a22.yCoord;
        float f4 = (float)a22.zCoord;
        a22 = -0.0f;
        float f5 = f4;
        float f6 = 0;
        float f7 = f5 * f5 + f6 * f6;
        if (f2 < 1.0E-12f) {
            int n = 3;
            if (f3 >= 0.0f) {
                float[] fArray2 = new float[n];
                int n2 = 0;
                fArray2[n2] = a[n2];
                int n3 = 1;
                fArray2[n3] = a[n3];
                int n4 = 2;
                fArray2[n4] = a[n4];
                return fArray2;
            }
            float[] fArray3 = new float[n];
            int n5 = 0;
            fArray3[n5] = a[n5];
            int n6 = 1;
            fArray3[n6] = -a[n6];
            int n7 = 2;
            fArray3[n7] = -a[n7];
            return fArray3;
        }
        f7 = (float)Math.sqrt(f7);
        float f8 = a[0];
        float f9 = a[1];
        float f10 = a[2];
        float f11 = -(a22 /= f7) * f9;
        float f12 = 0 * f8 - (f4 /= f7) * f10;
        float f13 = f4 * f9;
        float f14 = f4 * f8 + 0 * f10;
        float f15 = 1.0f - f3;
        float[] fArray4 = new float[3];
        fArray4[0] = f8 * f3 + f11 * f7 + f4 * f14 * f15;
        fArray4[1] = f9 * f3 + f12 * f7;
        fArray4[2] = f10 * f3 + f13 * f7 + 0 * f14 * f15;
        return fArray4;
    }

    /*
     * WARNING - void declaration
     */
    private void L(Vec3 vec3, EntityLivingBase entityLivingBase, float f2, long l, float f3, CrystalEffectSettings class_155, RenderSupport_152 class_152) {
        int n;
        void a;
        void a2;
        void a222;
        void a3;
        RenderSupport_154 class_154 = this;
GlStateManager.disableTexture2D();
        GlStateManager.blendFunc(770, 1);
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        void v0 = a3;
        worldRenderer.begin(4, DefaultVertexFormats.POSITION_COLOR);
        Vec3 a222 = RenderSupport_154.L((Entity)v0, (float)a222);
        float f4 = RenderSupport_158.d(v0.width);
        float f5 = RenderSupport_158.D((float)a2);
        int n2 = RenderSupport_158.L(a.d(), (float)(a2 * a.i()));
        Vec3 vec32 = a222.addVector(0.0, a3.height / 2.0f, 0.0);
        int n3 = 0;
        while (n3 < 18) {
            void a4;
            void a5;
            void a6;
            Vec3 vec33 = RenderSupport_154.L(a222, a3.height, 0, f4, f5, (long)a6, (float)a2);
            float a7 = a5.L(0);
            Vec3 vec34 = RenderSupport_154.L(vec33, vec32, a7, a.L());
            double d = vec34.xCoord - a4.xCoord;
            double d2 = vec34.yCoord - a4.yCoord;
            double d3 = vec34.zCoord - a4.zCoord;
            vec33 = new Vec3(vec32.xCoord - vec33.xCoord, vec32.yCoord - vec33.yCoord, vec32.zCoord - vec33.zCoord).normalize();
            int n4 = a7 <= 0.0f ? n2 : RenderSupport_158.d(n2, a.L(), a7);
            float f6 = 0.1f * (1.0f + a7 * 0.5f);
            a7 = 1.0f + a7 * 0.6f;
            int n5 = 0;
            while (n5 < e.length) {
                int n6;
                int n7 = RenderSupport_158.d(n4, i[n6] * a7);
                int[] nArray = e[n6];
                int n8 = nArray.length;
                int n9 = 0;
                while (n9 < n8) {
                    int n10;
                    int n11 = nArray[n10];
                    float[] fArray = RenderSupport_154.L(f[n11], vec33);
                    worldRenderer.pos(d + (double)(fArray[0] * f6), d2 + (double)(fArray[1] * f6), d3 + (double)(fArray[2] * f6)).color(ThemeSupport_064.i(n7), ThemeSupport_064.D(n7), ThemeSupport_064.L(n7), ThemeSupport_064.d(n7)).endVertex();
                    n9 = ++n10;
                }
                n5 = ++n6;
            }
            n3 = ++n;
        }
        tessellator.draw();
    }

    /*
     * WARNING - void declaration
     */
    private static Vec3 L(Vec3 vec3, float f2, int n, float f3, float f4, long l, float f5) {
        float a;
        void a2;
        float a3;
        void a222;
        void a4;
        float a5 = f3;
        Vec3 a6 = vec3;
a3 = RenderSupport_158.L((int)a4, (long)a222, a3);
        float a222 = (float)Math.sin(a3) * a5 * a2;
        a5 = (float)Math.cos(a3) * a5 * a2;
        a = RenderSupport_158.L((int)a4, a);
        return new Vec3(a6.xCoord + (double)a222, a6.yCoord + (double)a, a6.zCoord + (double)a5);
    }
}

