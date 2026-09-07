/*
 * Decompiled with CFR.
 */
package openonyx.render.group_j;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import openonyx.features.render.Particles;
import openonyx.render.group_j.RenderSupport_148;
import openonyx.render.group_j.RenderMode_149;
import openonyx.theme.internal.ThemeSupport_064;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_147 {
    private final static float c = 0.1f;
    private double a;
    private boolean k;
    private final int g;
    private final int M;
    private final Particles L;
    private final RenderMode_149 j;
    private double m;
    private final World h;
    private double l;
    private double I;
    private float d;
    private final static double i = 1.0E-7;
    private final long f;
    private double H;
    private double e;

    public void d() {
        RenderSupport_147 a;
if (!a.k) {
            return;
        }
        if (!a.d()) {
            a.L();
            return;
        }
        long l = a.L();
        if (l >= a.j.f) {
            a.L();
            return;
        }
        RenderSupport_147 class_147 = a;
        if (a.L.I.d()) {
            class_147.L((Double)a.L.i.L());
            v1 = a;
        } else {
            class_147.l += a.H;
            RenderSupport_147 class_1472 = a;
            v1 = class_1472;
            class_1472.I += a.a;
            class_1472.e += a.m;
        }
        v1.d = RenderSupport_148.L(l, a.j.H);
    }

    public void L() {
a.k = 0;
    }

    private boolean L(double a5, double a2, double a3) {
        RenderSupport_147 a4;
BlockPos a5 = new BlockPos(a5, a2, a3);
        if (!a4.h.isBlockLoaded(a5)) {
            return 0 != 0;
        }
        RenderSupport_147 class_147 = a4;
        return class_147.L(class_147.h.getBlockState(a5).getBlock());
    }

    private boolean L(Block block) {
        Block a = block;
        RenderSupport_147 a2 = this;
if (!(a instanceof BlockAir || a instanceof BlockBush || a instanceof BlockButton || a instanceof BlockTorch || a instanceof BlockLever || a instanceof BlockBasePressurePlate || a instanceof BlockCarpet || a instanceof BlockLiquid)) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_147(Particles class_236, World world, RenderMode_149 enum_149, int n, int n2, Vec3 vec3, Vec3 vec32) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        Vec3 a7;
        RenderSupport_147 a8;
        RenderSupport_147 class_147 = vec33;
        Vec3 vec33 = vec32;
        RenderSupport_147 class_1472 = a8 = class_147;
        Object object = a7;
        RenderSupport_147 class_1473 = a8;
        void v4 = a6;
        RenderSupport_147 class_1474 = a8;
        RenderSupport_147 class_1475 = a8;
        RenderSupport_147 class_1476 = a8;
        int n3 = 1;
        a8.f = System.currentTimeMillis();
        class_1476.k = n3;
        class_1476.L = a5;
        class_1475.h = a4;
        class_1475.j = a3;
        class_1474.g = a2;
        class_1474.M = a;
        a8.l = v4.xCoord;
        class_1473.I = v4.yCoord;
        class_1473.e = a6.zCoord;
        a8.H = RenderSupport_148.L(((Vec3)object).xCoord);
        class_1472.a = RenderSupport_148.L(((Vec3)object).yCoord);
        class_1472.m = RenderSupport_148.L(a7.zCoord);
    }

    private long d() {
        RenderSupport_147 a;
return Math.max(0L, System.currentTimeMillis() - a.f);
    }

    private boolean d() {
        RenderSupport_147 a;
if (a.L != null && a.L.d()) {
            Particles cfr_ignored_0 = a.L;
            if (Particles.e.theWorld == a.h) {
                return 5 >> 2;
            }
        }
        return false;
    }

    public boolean L() {
        RenderSupport_147 a;
return a.k;
    }

    /*
     * WARNING - void declaration
     */
    private double L(double d, double d2, double d3) {
        void a;
        void a2;
        void a3;
        RenderSupport_147 class_147 = this;
Object a4 = new BlockPos((double)a3, (double)(a2 - 1.0E-7), (double)a);
        if (!class_147.h.isBlockLoaded((BlockPos)a4)) {
            return Double.NaN;
        }
        RenderSupport_147 class_1472 = class_147;
        IBlockState iBlockState = class_1472.h.getBlockState((BlockPos)a4);
        if (!class_1472.L(iBlockState.getBlock())) {
            return Double.NaN;
        }
        a4 = iBlockState.getBlock().getCollisionBoundingBox(class_147.h, (BlockPos)a4, iBlockState);
        if (a4 == null) {
            return Double.NaN;
        }
        if (a3 + 1.0E-7 < ((AxisAlignedBB)a4).minX || a3 - 1.0E-7 > ((AxisAlignedBB)a4).maxX || a + 1.0E-7 < ((AxisAlignedBB)a4).minZ || a - 1.0E-7 > ((AxisAlignedBB)a4).maxZ) {
            return Double.NaN;
        }
        if (a2 <= ((AxisAlignedBB)a4).maxY + 1.0E-7) {
            return ((AxisAlignedBB)a4).maxY;
        }
        return Double.NaN;
    }

    private long L() {
        RenderSupport_147 a;
return RenderSupport_148.L(a.d(), (Double)a.L.f.L());
    }

    /*
     * WARNING - void declaration
     */
    public void L(WorldRenderer worldRenderer, Vec3 vec3, float f2, float f3, float f4, float f5, float f6) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        RenderSupport_147 class_147 = this;
if (!class_147.k || class_147.d <= 0.0f) {
            return;
        }
        RenderSupport_147 class_1472 = class_147;
        RenderSupport_147 class_1473 = class_147;
        int a8 = class_1472.L.L(class_1473.g, class_147.M);
        int n = Math.round((float)Math.pow(Math.clamp(class_1472.d, 0.0f, 1.0f), 0.72) * 255.0f);
        float f7 = 0.1f * class_147.L.j.L();
        double d = class_1473.l - a7.xCoord;
        double d2 = class_1472.I - a7.yCoord;
        double d3 = class_1472.e - a7.zCoord;
        void v2 = a6;
        RenderSupport_147.L((WorldRenderer)v2, d, d2, d3, f7, ThemeSupport_064.i(a8), ThemeSupport_064.D(a8), ThemeSupport_064.L(a8), n, (float)a5, (float)a4, (float)a3, (float)a2, (float)a);
        int n2 = 255;
        RenderSupport_147.L((WorldRenderer)v2, d, d2, d3, f7 * 0.5f, n2, n2, n2, n, (float)a5, (float)a4, (float)a3, (float)a2, (float)a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(double d) {
        boolean a;
        double d2;
        void a2;
        RenderSupport_147 class_147 = this;
RenderSupport_147 class_1472 = class_147;
        if (class_1472.L(class_147.l, class_1472.I, class_147.e + class_147.m * a2)) {
            class_147.m *= -0.8;
        }
        double d3 = (double)0.1f * (Double)class_147.L.j.L() + 1.0E-7;
        if (class_147.a <= 0.0) {
            RenderSupport_147 class_1473 = class_147;
            v2 = class_1473.L(class_147.l, class_1473.I + class_147.a * a2 - d3, class_147.e);
        } else {
            v2 = Double.NaN;
        }
        if (class_147.a <= 0.0) {
            v3 = Double.isFinite(Double.NaN);
        } else {
            RenderSupport_147 class_1474 = class_147;
            v3 = a = class_1474.L(class_1474.l, class_147.I + class_147.a * a2, class_147.e);
        }
        if (a) {
            RenderSupport_147 class_1475 = class_147;
            class_1475.H *= 0.999;
            class_1475.m *= 0.999;
            class_1475.a *= -0.7;
        }
        RenderSupport_147 class_1476 = class_147;
        if (class_1476.L(class_1476.l + class_147.H * a2, class_147.I, class_147.e)) {
            class_147.H *= -0.8;
        }
        double d4 = class_147.I + class_147.a * a2;
        if (Double.isFinite(Double.NaN)) {
            d4 = Math.max(d4, Double.NaN + d3);
        }
        RenderSupport_147 class_1477 = class_147;
        RenderSupport_147 class_1478 = class_147;
        class_147.l += class_147.H * a2;
        class_147.I = d4;
        class_1478.e += class_147.m * a2;
        d3 = Math.pow(0.999999, (double)a2);
        class_1478.H /= d3;
        class_1477.a -= 5.0E-5 * a2;
        class_1477.m /= d3;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, double d, double d2, double d3, float f2, int n, int n2, int n3, int n4, float f3, float f4, float f5, float f6, float f7) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        void a12;
        void a13;
        float f8 = f2;
        WorldRenderer a14 = worldRenderer;
WorldRenderer worldRenderer2 = a14;
        void v1 = a13;
        a14.pos((double)(a13 - (double)(a12 * a11) - (double)(a10 * a11)), (double)(a9 - (double)(a8 * a11)), (double)(a7 - (double)(a6 * a11) - (double)(a5 * a11))).tex(0.0, 0.0).color((int)a4, (int)a3, (int)a2, (int)a).endVertex();
        a14.pos((double)(v1 - (double)(a12 * a11) + (double)(a10 * a11)), (double)(a9 + (double)(a8 * a11)), (double)(a7 - (double)(a6 * a11) + (double)(a5 * a11))).tex(0.0, 1.0).color((int)a4, (int)a3, (int)a2, (int)a).endVertex();
        worldRenderer2.pos((double)(v1 + (double)(a12 * a11) + (double)(a10 * a11)), (double)(a9 + (double)(a8 * a11)), (double)(a7 + (double)(a6 * a11) + (double)(a5 * a11))).tex(1.0, 1.0).color((int)a4, (int)a3, (int)a2, (int)a).endVertex();
        worldRenderer2.pos((double)(a13 + (double)(a12 * a11) - (double)(a10 * a11)), (double)(a9 - (double)(a8 * a11)), (double)(a7 + (double)(a6 * a11) - (double)(a5 * a11))).tex(1.0, 0.0).color((int)a4, (int)a3, (int)a2, (int)a).endVertex();
    }
}

