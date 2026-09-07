/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_119
implements OnyxListener_001 {
    private static Vec3 f = new Vec3(0.0, 0.0, 0.0);
    private static boolean H;
    private static boolean e;

    /*
     * WARNING - void declaration
     */
    public static void d(Vec3 vec3, Vec3 vec32, int n, int n2) {
        void a;
        void a2;
        void a3;
        Object a4;
        Vec3 vec33 = vec3;
if (!H) {
            return;
        }
        Object object = a4 = Tessellator.getInstance().getWorldRenderer();
        RenderSupport_119.L((WorldRenderer)object, vec33, (int)a3);
        RenderSupport_119.L((WorldRenderer)object, (Vec3)a2, (int)a);
    }

    public static void D() {
if (!H) {
            return;
        }
        H = false;
        Tessellator.getInstance().draw();
    }

    /*
     * WARNING - void declaration
     */
    public static void L(List<Vec3> list, int n, int n2) {
        int a;
        List<Vec3> list2 = list;
if (!e || list2.size() < 2) {
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        int n3 = list2.size() - 1;
        int n4 = 0;
        while (n4 <= n3) {
            void a2;
            void a3;
            RenderSupport_119.L(worldRenderer, list2.get(++a), RenderSupport_119.L((int)a3, (int)a2, 0.0f / (float)n3));
            n4 = 0;
        }
        tessellator.draw();
    }

    /*
     * WARNING - void declaration
     */
    private static int d(int n, int n2, float f2) {
        void a;
        float a2 = f2;
        int a3 = 0;
return Math.round((float)a3 + (float)(a - a3) * 4);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(Vec3 vec3, float f2, int n) {
        void a;
        void a2;
        Vec3 vec32 = vec3;
if (!e) {
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer a3 = tessellator.getWorldRenderer();
        GL11.glPointSize((float)a2);
        GL11.glEnable(2832);
        Object object = a3;
        ((WorldRenderer)object).begin(0, DefaultVertexFormats.POSITION_COLOR);
        RenderSupport_119.L((WorldRenderer)object, vec32, (int)a);
        tessellator.draw();
        GL11.glDisable(2832);
        GL11.glPointSize(1.0f);
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        int a2 = n2;
        int a3 = 0;
if (a3 == a2) {
            return a3;
        }
        return ThemeSupport_064.L(RenderSupport_119.d(ThemeSupport_064.d(a3), ThemeSupport_064.d(a2), (float)a), RenderSupport_119.d(ThemeSupport_064.i(a3), ThemeSupport_064.i(a2), (float)a), RenderSupport_119.d(ThemeSupport_064.D(a3), ThemeSupport_064.D(a2), (float)a), RenderSupport_119.d(ThemeSupport_064.L(a3), ThemeSupport_064.L(a2), (float)a));
    }

    private RenderSupport_119() {
        RenderSupport_119 a;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(Vec3 vec3, Vec3 vec32, int n, int n2) {
        void a;
        void a2;
        int a3 = n2;
        Vec3 a4 = vec3;
if (!e) {
            return;
        }
        RenderSupport_119.L();
        RenderSupport_119.d(a4, (Vec3)a2, (int)a, a3);
        RenderSupport_119.D();
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(float f2, boolean bl, float f3) {
        void a;
        void a2;
        float f4 = f2;
Entity a3 = e.getRenderViewEntity();
        if (a3 == null) {
            return 0 != 0;
        }
        f = new Vec3(a3.prevPosX + (a3.posX - a3.prevPosX) * (double)f4, a3.prevPosY + (a3.posY - a3.prevPosY) * (double)f4, a3.prevPosZ + (a3.posZ - a3.prevPosZ) * (double)f4);
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.disableCull();
        GlStateManager.depthMask(5 >> 3);
        GlStateManager.shadeModel(7425);
        if (a2 != false) {
            GlStateManager.disableDepth();
        }
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth((float)a);
        e = 1;
        return --1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, Vec3 vec3, int n) {
        void a;
        int a2 = 0;
        WorldRenderer a3 = worldRenderer;
a3.pos(a.xCoord - RenderSupport_119.f.xCoord, a.yCoord - RenderSupport_119.f.yCoord, a.zCoord - RenderSupport_119.f.zCoord).color(ThemeSupport_064.i(4), ThemeSupport_064.D(4), ThemeSupport_064.L(4), ThemeSupport_064.d(4)).endVertex();
    }

    public static void d() {
if (!e) {
            return;
        }
        RenderSupport_119.D();
        e = 0;
        GL11.glDisable(2848);
        GL11.glLineWidth(1.0f);
        GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(--1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    public static void L() {
if (!e || H) {
            return;
        }
        Tessellator.getInstance().getWorldRenderer().begin(1, DefaultVertexFormats.POSITION_COLOR);
        H = 1;
    }
}

