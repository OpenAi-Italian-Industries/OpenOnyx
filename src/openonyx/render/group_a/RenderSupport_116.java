/*
 * Decompiled with CFR.
 */
package openonyx.render.group_a;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FeatureMode_257;
import openonyx.features.render.FeatureMode_278;
import openonyx.render.RenderSupport_106;
import openonyx.render.group_a.RenderSupport_115;
import openonyx.render.group_a.RenderSupport_117;
import openonyx.theme.internal.ThemeSupport_064;

public final class RenderSupport_116
implements OnyxListener_001 {
    private final static double e = 0.0015;

    public static AxisAlignedBB L(BlockPos a) {
return AxisAlignedBB.fromBounds(a.getX(), a.getY(), a.getZ(), a.getX() + 1, a.getY() + 1, a.getZ() + 1);
    }

    /*
     * WARNING - void declaration
     */
    private static AxisAlignedBB L(AxisAlignedBB axisAlignedBB, float f2, RenderSupport_115 class_115) {
        void a;
        RenderSupport_115 a2 = class_115;
        AxisAlignedBB a3 = axisAlignedBB;
if (a2.L() == FeatureMode_257.f) {
            return RenderSupport_116.L(a3, (float)a);
        }
        double d = (a3.maxY - a3.minY) * (double)a;
        AxisAlignedBB axisAlignedBB2 = a3;
        if (a2.L()) {
            return RenderSupport_116.L(axisAlignedBB2.minX, a3.minY, a3.minZ, a3.maxX, a3.minY + d, a3.maxZ);
        }
        return RenderSupport_116.L(axisAlignedBB2.minX, a3.maxY - d, a3.minZ, a3.maxX, a3.maxY, a3.maxZ);
    }

    private static AxisAlignedBB L(double a, double a2, double a3, double a4, double a5, double a6) {
double d = Math.min(0.0015, (a4 - a) / 2.0);
        double d2 = Math.min(0.0015, (a5 - a2) / 2.0);
        double d3 = Math.min(0.0015, (a6 - a3) / 2.0);
        return AxisAlignedBB.fromBounds(a + d, a2 + d2, a3 + d3, a4 - d, a5 - d2, a6 - d3);
    }

    public void L() {
RenderSupport_117.L();
    }

    /*
     * Unable to fully structure code
     */
    public void L(float var1_1, BlockPos var2_2, AxisAlignedBB var3_3, float var4_4, float var5_5, RenderSupport_115 var6_7) {
        block11: {
            block10: {
                block9: {
                    v0 = this;
                    this = var6_7;
                    a = v0;
if (a <= 0.0f) {
                        return;
                    }
                    var7_8 = a.D() != false && a > 0.001f ? --1 : 0;
                    var8_9 = var7_8 != 0 ? RenderSupport_116.L((AxisAlignedBB)a, (float)a, a) : a;
                    v1 = a = var7_8 != 0 && a.L() == FeatureMode_257.e ? --1 : 0;
                    if (a.L() != FeatureMode_278.e || a == null) ** GOTO lbl-1000
                    if (a != 0) {
                        v2 = a;
                        v3 = a;
                    } else {
                        v2 = var8_9;
                        v3 = a;
                    }
                    if (v3 != 0) {
                        v4 = var8_9;
                        v5 = a;
                    } else {
                        v4 = null;
                        v5 = a;
                    }
                    if (RenderSupport_117.L((float)a, (BlockPos)a, (AxisAlignedBB)v2, v4, (float)v5, a)) {
                        v6 = 3 & 5;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v6 = var9_10 = 0;
                    }
                    if (!RenderSupport_106.L((float)a, a.d())) {
                        return;
                    }
                    if (var7_8 == 0) break block9;
                    if (var9_10 != 0) break block10;
                    v7 = a;
                    RenderSupport_106.L((AxisAlignedBB)var8_9, 2 & 5, 0.0f, ThemeSupport_064.L(a.L(), (float)(a * a.h())));
                    break block11;
                }
                if (a.L() == FeatureMode_278.d && var9_10 == 0) {
                    RenderSupport_106.L((AxisAlignedBB)a, 3 >> 2, 0.0f, ThemeSupport_064.L(a.L(), (float)(a * a.d())));
                }
            }
            v7 = a;
        }
        RenderSupport_106.L((AxisAlignedBB)v7, ThemeSupport_064.L(a.L(), (float)(a * a.i())), a.F(), 3 ^ 3);
        RenderSupport_106.L();
    }

    private static AxisAlignedBB L(AxisAlignedBB axisAlignedBB, float f2) {
        float a = f2;
        AxisAlignedBB a2 = axisAlignedBB;
AxisAlignedBB axisAlignedBB2 = a2;
        double d = (axisAlignedBB2.minX + a2.maxX) / 2.0;
        AxisAlignedBB axisAlignedBB3 = a2;
        double d2 = (axisAlignedBB2.minY + axisAlignedBB3.maxY) / 2.0;
        double d3 = (axisAlignedBB3.minZ + a2.maxZ) / 2.0;
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        double d7 = d;
        double d8 = d2;
        double d9 = d3;
        return AxisAlignedBB.fromBounds(d4 + (a2.minX - d4) * 0.0, d5 + (a2.minY - d5) * 0.0, d6 + (a2.minZ - d6) * 0.0, d7 + (a2.maxX - d7) * 0.0, d8 + (a2.maxY - d8) * 0.0, d9 + (a2.maxZ - d9) * 0.0);
    }

    public RenderSupport_116() {
        RenderSupport_116 a;
    }
}

