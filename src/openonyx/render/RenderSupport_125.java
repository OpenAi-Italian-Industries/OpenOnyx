/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.theme.internal.ThemeSupport_064;

public final class RenderSupport_125
implements OnyxListener_001 {
    private static Vec3 H = new Vec3(0.0, 0.0, 0.0);
    private static boolean e;

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

    public static void L() {
if (!e) {
            return;
        }
        e = false;
        GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    private RenderSupport_125() {
        RenderSupport_125 a;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        int n3 = n2;
        WorldRenderer a9 = worldRenderer;
WorldRenderer worldRenderer2 = a9;
        void v1 = a8;
        RenderSupport_125.L(a9, (double)a7, (double)a6, (double)a5, (int)a4);
        RenderSupport_125.L(a9, (double)v1, (double)a6, (double)a3, (int)a4);
        RenderSupport_125.L(worldRenderer2, (double)v1, (double)a2, (double)a3, 0);
        RenderSupport_125.L(worldRenderer2, (double)a7, (double)a2, (double)a5, 0);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(float f2, boolean bl) {
        void a;
        float f3 = f2;
Entity a2 = e.getRenderViewEntity();
        if (a2 == null) {
            return 3 >> 2;
        }
        H = new Vec3(a2.prevPosX + (a2.posX - a2.prevPosX) * (double)f3, a2.prevPosY + (a2.posY - a2.prevPosY) * (double)f3, a2.prevPosZ + (a2.posZ - a2.prevPosZ) * (double)f3);
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.disableCull();
        GlStateManager.shadeModel(7425);
        GlStateManager.depthMask(0 != 0);
        if (a != false) {
            GlStateManager.disableDepth();
        }
        e = true;
        return --1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        void a;
        void a2;
        void a3;
        WorldRenderer a4;
        void a5;
        void a6;
        double a7;
        int n3 = n;
if (!e) {
            return;
        }
        double d6 = a7 - (a6 /= 2.0) - RenderSupport_125.H.xCoord;
        double d7 = a7 + a6 - RenderSupport_125.H.xCoord;
        void var16_11 = a5 - a6 - RenderSupport_125.H.zCoord;
        a5 = a5 + a6 - RenderSupport_125.H.zCoord;
        a3 -= RenderSupport_125.H.yCoord;
        a2 -= RenderSupport_125.H.yCoord;
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = a4 = tessellator.getWorldRenderer();
        double d8 = d7;
        WorldRenderer worldRenderer2 = a4;
        worldRenderer2.begin(7, DefaultVertexFormats.POSITION_COLOR);
        void v4 = var16_11;
        RenderSupport_125.L(worldRenderer2, d6, (double)v4, d7, (double)v4, (double)a3, (double)a2, n3, (int)a);
        RenderSupport_125.L(a4, d8, (double)var16_11, d7, (double)a5, (double)a3, (double)a2, n3, (int)a);
        void v5 = a5;
        RenderSupport_125.L(worldRenderer, d8, (double)v5, d6, (double)v5, (double)a3, (double)a2, n3, (int)a);
        RenderSupport_125.L(worldRenderer, d6, (double)a5, d6, (double)var16_11, (double)a3, (double)a2, n3, (int)a);
        tessellator.draw();
    }
}

