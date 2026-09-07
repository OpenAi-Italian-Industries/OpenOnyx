/*
 * Decompiled with CFR.
 */
package openonyx.render.group_a;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.src.Config;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3i;
import openonyx.connection.NetworkSupport_453;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.events.ChatTransformer;
import openonyx.render.group_a.RenderSupport_115;
import openonyx.render.group_a.RenderSupport_116;
import openonyx.render.group_p.RenderSupport_166;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_117
implements OnyxListener_001 {
    private final static long I;
    private final static int d = 256;
    private static RenderSupport_166 i;
    private static boolean f;
    private static boolean H;
    private final static double e = 0.001;

    /*
     * WARNING - void declaration
     */
    private static void L(float f2, BlockPos blockPos, IBlockState iBlockState, Block block, Entity entity, AxisAlignedBB axisAlignedBB, AxisAlignedBB axisAlignedBB2, float f3, RenderSupport_115 class_115) {
        WorldRenderer a;
        void a2;
        void a3;
        void a4;
        void a5;
        Tessellator a6;
        void a72;
        Object a8 = iBlockState;
        float a9 = f2;
void v0 = a72;
        double d = v0.prevPosX + (a72.posX - a72.prevPosX) * (double)a9;
        void v1 = a72;
        double d2 = v0.prevPosY + (v1.posY - a72.prevPosY) * (double)a9;
        double d3 = v1.prevPosZ + (a72.posZ - a72.prevPosZ) * (double)a9;
        a8 = RenderSupport_116.L((BlockPos)((Object)a6));
        void v2 = a5;
        double d4 = RenderSupport_117.L(a5.maxX - a5.minX, ((AxisAlignedBB)a8).maxX - ((AxisAlignedBB)a8).minX);
        double d5 = RenderSupport_117.L(v2.maxY - a5.minY, ((AxisAlignedBB)a8).maxY - ((AxisAlignedBB)a8).minY);
        double d6 = RenderSupport_117.L(v2.maxZ - a5.minZ, ((AxisAlignedBB)a8).maxZ - ((AxisAlignedBB)a8).minZ);
        Object object = a8;
        double d7 = (((AxisAlignedBB)a8).minX + ((AxisAlignedBB)object).maxX) / 2.0 - d;
        double d8 = (((AxisAlignedBB)object).minY + ((AxisAlignedBB)a8).maxY) / 2.0 - d2;
        double d9 = (((AxisAlignedBB)a8).minZ + ((AxisAlignedBB)a8).maxZ) / 2.0 - d3;
        double d10 = (v2.minX + a5.maxX - ((AxisAlignedBB)a8).minX - ((AxisAlignedBB)a8).maxX) / 2.0;
        void v4 = a5;
        double d11 = (v2.minY + v4.maxY - ((AxisAlignedBB)a8).minY - ((AxisAlignedBB)a8).maxY) / 2.0;
        double d12 = (v4.minZ + a5.maxZ - ((AxisAlignedBB)a8).minZ - ((AxisAlignedBB)a8).maxZ) / 2.0;
        RenderSupport_117.L(a4.d());
        GlStateManager.translate(d10, d11, d12);
        GlStateManager.translate(d7, d8, d9);
        GlStateManager.scale(d4, d5, d6);
        GlStateManager.translate(-d7, -d8, -d9);
        i.d();
        i.L("Sampler0", 0);
        i.L("uColorPrimary", RenderSupport_117.d(a4.L()), RenderSupport_117.D(a4.L()), RenderSupport_117.L(a4.L()), (float)a3);
        i.L("uColorSecondary", RenderSupport_117.d(a4.d()), RenderSupport_117.D(a4.d()), RenderSupport_117.L(a4.d()), a4.I());
        i.L("uMotion", RenderSupport_117.L(), a4.l(), a4.L(), a4.D());
        i.L("uOrigin", (float)(((AxisAlignedBB)a8).minX - d), (float)(((AxisAlignedBB)a8).minY - d2), (float)(((AxisAlignedBB)a8).minZ - d3), 0.0f);
        if (a2 == null) {
            i.L("uCrop", 0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            i.L("uCrop", (float)RenderSupport_117.L(a2.minY - d2, d8, d5, d11), (float)RenderSupport_117.L(a2.maxY - d2, d8, d5, d11), 1.0f, 0.0f);
        }
        i.L("uWorld", Math.floorMod(((Vec3i)((Object)a6)).getX(), 256), Math.floorMod(((Vec3i)((Object)a6)).getY(), 256), Math.floorMod(((Vec3i)((Object)a6)).getZ(), 256), 0.0f);
        i.L("uFogEnabled", GL11.glIsEnabled(2912) ? 1.0f : 0.0f);
        a6 = Tessellator.getInstance();
        WorldRenderer worldRenderer = a = a6.getWorldRenderer();
        a.begin(7, DefaultVertexFormats.BLOCK);
        worldRenderer.setTranslation(-d, -d2, -d3);
        RenderSupport_117.L(worldRenderer, (AxisAlignedBB)a8);
        if (a2 != null) {
            boolean a72 = a4.L();
            void v6 = a2;
            d = a72 ? v6.maxY : v6.minY;
            RenderSupport_117.L(a, (AxisAlignedBB)a8, RenderSupport_117.L(d - d2, d8, d5, d11) + d2, a72);
        }
        a6.draw();
        a.setTranslation(0.0, 0.0, 0.0);
        RenderSupport_166.L();
        RenderSupport_117.d();
    }

    private static float D(int a) {
return (float)(a >> 8 & 0xFF) / 255.0f;
    }

    private static void L(WorldRenderer a, double a2, double a3, double a4) {
int n = 255;
        int n2 = 240;
        a.pos(a2, a3, a4).color(n, n, n, n).tex(0.0, 0.0).lightmap(n2, n2).endVertex();
    }

    private RenderSupport_117() {
        RenderSupport_117 a;
    }

    private static float d(int a) {
return (float)(a >> 16 & 0xFF) / 255.0f;
    }

    private static void L(WorldRenderer worldRenderer, AxisAlignedBB axisAlignedBB) {
        int n;
        AxisAlignedBB a = axisAlignedBB;
        WorldRenderer a2 = worldRenderer;
EnumFacing[] enumFacingArray = EnumFacing.values();
        int n2 = enumFacingArray.length;
        int n3 = 0;
        while (n3 < n2) {
            EnumFacing enumFacing = enumFacingArray[0];
            switch (enumFacing) {
                case DOWN: {
                    WorldRenderer worldRenderer2 = a2;
                    while (false) {
                    }
                    Object object = a;
                    WorldRenderer worldRenderer3 = a2;
                    RenderSupport_117.L(worldRenderer3, a.minX, a.minY, a.minZ);
                    RenderSupport_117.L(worldRenderer3, a.maxX, a.minY, a.minZ);
                    RenderSupport_117.L(worldRenderer2, ((AxisAlignedBB)object).maxX, a.minY, a.maxZ);
                    RenderSupport_117.L(worldRenderer2, ((AxisAlignedBB)object).minX, a.minY, a.maxZ);
                    break;
                }
                case UP: {
                    WorldRenderer worldRenderer4 = a2;
                    Object object = a;
                    WorldRenderer worldRenderer5 = a2;
                    RenderSupport_117.L(worldRenderer5, a.minX, a.maxY, a.maxZ);
                    RenderSupport_117.L(worldRenderer5, a.maxX, a.maxY, a.maxZ);
                    RenderSupport_117.L(worldRenderer4, ((AxisAlignedBB)object).maxX, a.maxY, a.minZ);
                    RenderSupport_117.L(worldRenderer4, ((AxisAlignedBB)object).minX, a.maxY, a.minZ);
                    break;
                }
                case NORTH: {
                    WorldRenderer worldRenderer6 = a2;
                    AxisAlignedBB axisAlignedBB2 = a;
                    WorldRenderer worldRenderer7 = a2;
                    RenderSupport_117.L(worldRenderer7, a.minX, a.minY, a.minZ);
                    RenderSupport_117.L(worldRenderer7, a.minX, a.maxY, a.minZ);
                    RenderSupport_117.L(worldRenderer6, axisAlignedBB2.maxX, a.maxY, a.minZ);
                    RenderSupport_117.L(worldRenderer6, axisAlignedBB2.maxX, a.minY, a.minZ);
                    break;
                }
                case SOUTH: {
                    WorldRenderer worldRenderer8 = a2;
                    AxisAlignedBB axisAlignedBB3 = a;
                    WorldRenderer worldRenderer9 = a2;
                    RenderSupport_117.L(worldRenderer9, a.minX, a.minY, a.maxZ);
                    RenderSupport_117.L(worldRenderer9, a.maxX, a.minY, a.maxZ);
                    RenderSupport_117.L(worldRenderer8, axisAlignedBB3.maxX, a.maxY, a.maxZ);
                    RenderSupport_117.L(worldRenderer8, axisAlignedBB3.minX, a.maxY, a.maxZ);
                    break;
                }
                case WEST: {
                    WorldRenderer worldRenderer10 = a2;
                    Object object = a;
                    WorldRenderer worldRenderer11 = a2;
                    RenderSupport_117.L(worldRenderer11, a.minX, a.minY, a.minZ);
                    RenderSupport_117.L(worldRenderer11, a.minX, a.minY, a.maxZ);
                    RenderSupport_117.L(worldRenderer10, ((AxisAlignedBB)object).minX, a.maxY, a.maxZ);
                    RenderSupport_117.L(worldRenderer10, ((AxisAlignedBB)object).minX, a.maxY, a.minZ);
                    break;
                }
                case EAST: {
                    WorldRenderer worldRenderer12 = a2;
                    Object object = a;
                    WorldRenderer worldRenderer13 = a2;
                    RenderSupport_117.L(worldRenderer13, a.maxX, a.minY, a.minZ);
                    RenderSupport_117.L(worldRenderer13, a.maxX, a.maxY, a.minZ);
                    RenderSupport_117.L(worldRenderer12, ((AxisAlignedBB)object).maxX, a.maxY, a.maxZ);
                    RenderSupport_117.L(worldRenderer12, ((AxisAlignedBB)object).maxX, a.minY, a.maxZ);
                }
            }
            n3 = ++n;
        }
    }

    static {
        H = 1;
        I = System.nanoTime();
    }

    /*
     * WARNING - void declaration
     */
    public static boolean L(float f2, BlockPos blockPos, AxisAlignedBB axisAlignedBB, AxisAlignedBB axisAlignedBB2, float f3, RenderSupport_115 class_115) {
        BlockPos a22 = blockPos;
        float a = f2;
if (!H || RenderSupport_117.e.theWorld == null) {
            return false;
        }
        if (!OpenGlHelper.shadersSupported) {
            return 0 != 0;
        }
        if (Config.isShaders()) {
            return 0 != 0;
        }
        Entity entity = e.getRenderViewEntity();
        if (entity == null) {
            return 0 != 0;
        }
        IBlockState iBlockState = RenderSupport_117.e.theWorld.getBlockState(a22);
        Block block = iBlockState.getBlock();
        if (block.getRenderType() != 3) {
            return 0 != 0;
        }
        if (!f) {
            f = 1;
            i = RenderSupport_166.L("onyx_block_glint");
        }
        if (i == null || !i.L()) {
            H = false;
            return 5 >> 3;
        }
        try {
            void a3;
            void a4;
            void a5;
            void a6;
            RenderSupport_117.L(a, a22, iBlockState, block, entity, (AxisAlignedBB)a6, (AxisAlignedBB)a5, (float)a4, (RenderSupport_115)a3);
            return true;
        }
        catch (Throwable a22) {
            H = 0;
            OnyxClient.H.warn("Block overlay glint has been disabled after a render failure", a22);
            return 3 >> 2;
        }
    }

    private static void d() {
GlStateManager.doPolygonOffset(0.0f, 0.0f);
        GlStateManager.disablePolygonOffset();
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

    private static void L(boolean a) {
GlStateManager.pushMatrix();
        e.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        GlStateManager.enableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.depthMask(0 != 0);
        GlStateManager.doPolygonOffset(-1.0f, -10.0f);
        GlStateManager.enablePolygonOffset();
        if (a) {
            GlStateManager.disableDepth();
        }
    }

    private static float L() {
return (float)((System.nanoTime() - I) % 3600000000000L) / 1.0E9f;
    }

    static void L() {
H = 1;
    }

    private static double L(double a, double a2) {
return a / Math.max(a2, 1.0E-4);
    }

    private static float L(int a) {
return (float)(a & 0xFF) / 255.0f;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, AxisAlignedBB axisAlignedBB, double d, boolean bl) {
        void a;
        void a2;
        AxisAlignedBB a3 = axisAlignedBB;
        WorldRenderer a4 = worldRenderer;
void var5_4 = a2 != false ? a - 0.001 : a + 0.001;
        WorldRenderer worldRenderer2 = a4;
        Object object = a3;
        WorldRenderer worldRenderer3 = a4;
        Object object2 = a3;
        WorldRenderer worldRenderer4 = a4;
        RenderSupport_117.L(worldRenderer4, a3.minX, (double)var5_4, a3.maxZ);
        RenderSupport_117.L(worldRenderer4, a3.maxX, (double)var5_4, a3.maxZ);
        RenderSupport_117.L(a4, ((AxisAlignedBB)object2).maxX, (double)var5_4, a3.minZ);
        RenderSupport_117.L(worldRenderer3, ((AxisAlignedBB)object2).minX, (double)var5_4, a3.minZ);
        RenderSupport_117.L(worldRenderer3, a3.minX, (double)var5_4, a3.minZ);
        RenderSupport_117.L(a4, ((AxisAlignedBB)object).maxX, (double)var5_4, a3.minZ);
        RenderSupport_117.L(worldRenderer2, ((AxisAlignedBB)object).maxX, (double)var5_4, a3.maxZ);
        RenderSupport_117.L(worldRenderer2, a3.minX, (double)var5_4, a3.maxZ);
    }

    private static double L(double a, double a2, double a3, double a4) {
return (a - a2 - a4) / Math.max(a3, 1.0E-4) + a2;
    }
}

