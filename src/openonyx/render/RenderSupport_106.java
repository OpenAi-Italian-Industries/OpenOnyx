/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_106
implements OnyxListener_001 {
    private static boolean f;
    private final static int[][] H;
    private static Vec3 e;

    /*
     * WARNING - void declaration
     */
    public static void L(AxisAlignedBB axisAlignedBB, int n, float f2, int n2) {
        void a;
        int a2 = n2;
        AxisAlignedBB a3 = axisAlignedBB;
if (!f) {
            return;
        }
        AxisAlignedBB axisAlignedBB2 = a3;
        double d = axisAlignedBB2.minX - RenderSupport_106.e.xCoord;
        double d2 = axisAlignedBB2.minY - RenderSupport_106.e.yCoord;
        double d3 = axisAlignedBB2.minZ - RenderSupport_106.e.zCoord;
        double d4 = axisAlignedBB2.maxX - RenderSupport_106.e.xCoord;
        double d5 = axisAlignedBB2.maxY - RenderSupport_106.e.yCoord;
        double d6 = axisAlignedBB2.maxZ - RenderSupport_106.e.zCoord;
        double[][] dArrayArray = new double[8][];
        double[] dArray = new double[3];
        int n3 = 0;
        dArray[n3] = d;
        dArray[1] = d2;
        dArray[2] = d3;
        dArrayArray[n3] = dArray;
        double[] dArray2 = new double[3];
        dArray2[0] = d4;
        int n4 = 1;
        dArray2[n4] = d2;
        dArray2[2] = d3;
        dArrayArray[n4] = dArray2;
        double[] dArray3 = new double[3];
        dArray3[0] = d;
        dArray3[1] = d2;
        int n5 = 2;
        dArray3[n5] = d6;
        dArrayArray[n5] = dArray3;
        int n6 = 3;
        double[] dArray4 = new double[n6];
        dArray4[0] = d4;
        dArray4[1] = d2;
        dArray4[2] = d6;
        dArrayArray[n6] = dArray4;
        double[] dArray5 = new double[3];
        dArray5[0] = d;
        dArray5[1] = d5;
        dArray5[2] = d3;
        dArrayArray[4] = dArray5;
        double[] dArray6 = new double[3];
        dArray6[0] = d4;
        dArray6[1] = d5;
        dArray6[2] = d3;
        dArrayArray[5] = dArray6;
        double[] dArray7 = new double[3];
        dArray7[0] = d;
        dArray7[1] = d5;
        dArray7[2] = d6;
        dArrayArray[6] = dArray7;
        double[] dArray8 = new double[3];
        dArray8[0] = d4;
        dArray8[1] = d5;
        dArray8[2] = d6;
        dArrayArray[7] = dArray8;
        double[][] dArrayArray2 = dArrayArray;
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        if (ThemeSupport_064.d(4) > 0) {
            WorldRenderer worldRenderer2 = worldRenderer;
            int n7 = 4;
            WorldRenderer worldRenderer3 = worldRenderer;
            worldRenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
            RenderSupport_106.L(worldRenderer3, dArrayArray2, 4, 0, 1, 3, 2);
            RenderSupport_106.L(worldRenderer3, dArrayArray2, 4, 4, 5, 7, 6);
            RenderSupport_106.L(worldRenderer, dArrayArray2, n7, 0, 1, 5, 4);
            RenderSupport_106.L(worldRenderer, dArrayArray2, n7, 2, 3, 7, 6);
            RenderSupport_106.L(worldRenderer2, dArrayArray2, 4, 0, 2, 6, 4);
            RenderSupport_106.L(worldRenderer2, dArrayArray2, 4, 1, 3, 7, 5);
            tessellator.draw();
        }
        if (ThemeSupport_064.d((int)a) > 0) {
            int n8;
            void a222;
            GL11.glLineWidth((float)a222);
            worldRenderer.begin(1, DefaultVertexFormats.POSITION_COLOR);
            int[][] a222 = H;
            a2 = H.length;
            int n9 = 0;
            while (n9 < 4) {
                int[] nArray = a222[0];
                WorldRenderer worldRenderer4 = worldRenderer;
                RenderSupport_106.L(worldRenderer4, dArrayArray2[nArray[0]], (int)a);
                RenderSupport_106.L(worldRenderer4, dArrayArray2[nArray[1]], (int)a);
                n9 = ++n8;
            }
            tessellator.draw();
        }
    }

    static {
        int[][] nArrayArray = new int[12][];
        int[] nArray = new int[2];
        int n = 0;
        nArray[n] = 0;
        int n2 = 1;
        nArray[n2] = n2;
        nArrayArray[n] = nArray;
        int[] nArray2 = new int[2];
        nArray2[0] = 1;
        int n3 = 1;
        nArray2[n3] = 3;
        nArrayArray[n3] = nArray2;
        int n4 = 2;
        int[] nArray3 = new int[n4];
        nArray3[0] = 3;
        nArray3[1] = 2;
        nArrayArray[n4] = nArray3;
        int[] nArray4 = new int[2];
        nArray4[0] = 2;
        nArray4[1] = 0;
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[2];
        nArray5[0] = 4;
        nArray5[1] = 5;
        nArrayArray[4] = nArray5;
        int[] nArray6 = new int[2];
        nArray6[0] = 5;
        nArray6[1] = 7;
        nArrayArray[5] = nArray6;
        int[] nArray7 = new int[2];
        nArray7[0] = 7;
        nArray7[1] = 6;
        nArrayArray[6] = nArray7;
        int[] nArray8 = new int[2];
        nArray8[0] = 6;
        nArray8[1] = 4;
        nArrayArray[7] = nArray8;
        int[] nArray9 = new int[2];
        int n5 = 0;
        nArray9[n5] = n5;
        nArray9[1] = 4;
        nArrayArray[8] = nArray9;
        int[] nArray10 = new int[2];
        nArray10[0] = 1;
        nArray10[1] = 5;
        nArrayArray[9] = nArray10;
        int[] nArray11 = new int[2];
        nArray11[0] = 2;
        nArray11[1] = 6;
        nArrayArray[10] = nArray11;
        int[] nArray12 = new int[2];
        nArray12[0] = 3;
        nArray12[1] = 7;
        nArrayArray[11] = nArray12;
        H = nArrayArray;
        e = new Vec3(0.0, 0.0, 0.0);
    }

    private RenderSupport_106() {
        RenderSupport_106 a;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(float f2, boolean bl) {
        void a;
        float f3 = f2;
Entity a2 = ((Minecraft)((Object)e)).getRenderViewEntity();
        if (a2 == null) {
            return 0 != 0;
        }
        e = new Vec3(a2.prevPosX + (a2.posX - a2.prevPosX) * (double)f3, a2.prevPosY + (a2.posY - a2.prevPosY) * (double)f3, a2.prevPosZ + (a2.posZ - a2.prevPosZ) * (double)f3);
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.disableCull();
        GlStateManager.depthMask(0 != 0);
        if (a != false) {
            GlStateManager.disableDepth();
        }
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        f = 1;
        return 3 >> 1;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, double[][] dArray, int n, int n2, int n3, int n4, int n5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int a6 = 0;
        WorldRenderer a7 = worldRenderer;
WorldRenderer worldRenderer2 = a7;
        void v1 = a5;
        RenderSupport_106.L(a7, (double[])a5[a4], a6);
        RenderSupport_106.L(a7, (double[])v1[a3], a6);
        RenderSupport_106.L(worldRenderer2, (double[])v1[a2], a6);
        RenderSupport_106.L(worldRenderer2, (double[])a5[a], a6);
    }

    public static void L() {
if (!f) {
            return;
        }
        f = false;
        GL11.glDisable(2848);
        GL11.glLineWidth(1.0f);
        GlStateManager.depthMask(--1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, double[] dArray, int n) {
        void a;
        int a2 = 0;
        WorldRenderer a3 = worldRenderer;
a3.pos((double)a[0], (double)a[1], (double)a[2]).color(ThemeSupport_064.i(4), ThemeSupport_064.D(4), ThemeSupport_064.L(4), ThemeSupport_064.d(4)).endVertex();
    }
}

