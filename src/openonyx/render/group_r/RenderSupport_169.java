/*
 * Decompiled with CFR.
 */
package openonyx.render.group_r;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.render.group_r.RenderSupport_168;

public final class RenderSupport_169 {
    private final static double i = 10.5;
    private final static double f = 12.0;
    private final static double H = 0.05859375;
    private final static double e = 4.0;

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_168 L(EntityLivingBase entityLivingBase, float f2) {
        void a22;
        EntityLivingBase entityLivingBase2 = entityLivingBase;
EntityLivingBase entityLivingBase3 = entityLivingBase2;
        EntityLivingBase entityLivingBase4 = entityLivingBase2;
        float a32 = entityLivingBase3.prevLimbSwingAmount + (entityLivingBase3.limbSwingAmount - entityLivingBase4.prevLimbSwingAmount) * a22;
        float f3 = entityLivingBase4.limbSwing - entityLivingBase2.limbSwingAmount * (1.0f - a22);
        if (a32 > 1.0f) {
            a32 = 1.0f;
        }
        EntityLivingBase entityLivingBase5 = entityLivingBase2;
        EntityLivingBase entityLivingBase6 = entityLivingBase2;
        float f4 = RenderSupport_169.L(entityLivingBase5.prevRenderYawOffset, entityLivingBase6.renderYawOffset, (float)a22);
        float f5 = RenderSupport_169.L(entityLivingBase5.prevRotationYawHead, entityLivingBase2.rotationYawHead, (float)a22);
        float f6 = RenderSupport_169.L(entityLivingBase6.prevRotationPitch, entityLivingBase2.rotationPitch, (float)a22);
        f5 = RenderSupport_169.L(f5 - f4) * ((float)Math.PI / 180);
        f6 *= (float)Math.PI / 180;
        boolean bl = entityLivingBase5.isSneaking();
        float f7 = MathHelper.cos(f3 * 0.6662f + (float)Math.PI) * 2.0f * a32 * 0.5f;
        float f8 = MathHelper.cos(f3 * 0.6662f) * 2.0f * a32 * 0.5f;
        float f9 = MathHelper.cos(f3 * 0.6662f) * 1.4f * a32;
        a32 = MathHelper.cos(f3 * 0.6662f + (float)Math.PI) * 1.4f * a32;
        f3 = 0.0f;
        double d = 0.0;
        double d2 = 12.0;
        double d3 = 0.1;
        if (bl) {
            f3 = 0.5f;
            f7 += 0.4f;
            f8 += 0.4f;
            d = 1.0;
            d2 = 9.0;
            d3 = 4.0;
        }
        EntityLivingBase entityLivingBase7 = entityLivingBase2;
        EntityLivingBase entityLivingBase8 = entityLivingBase2;
        double d4 = entityLivingBase7.prevPosX + (entityLivingBase8.posX - entityLivingBase2.prevPosX) * (double)a22;
        double d5 = entityLivingBase8.prevPosY + (entityLivingBase2.posY - entityLivingBase2.prevPosY) * (double)a22;
        double d6 = entityLivingBase7.prevPosZ + (entityLivingBase2.posZ - entityLivingBase2.prevPosZ) * (double)a22;
        double d7 = (double)f4 * (Math.PI / 180);
        double d8 = Math.sin(d7);
        d7 = Math.cos(d7);
        double[] dArray = new double[3];
        dArray[0] = 0.0;
        dArray[1] = d;
        dArray[2] = 0.0;
        double[] a22 = dArray;
        double[] dArray2 = new double[3];
        dArray2[0] = 0.0;
        dArray2[1] = -4.0;
        dArray2[2] = 0.0;
        double[] dArray3 = RenderSupport_169.L(dArray, RenderSupport_169.L(dArray2, (double)f6, (double)f5));
        double[] dArray4 = new double[3];
        dArray4[0] = 0.0;
        dArray4[1] = 12.0;
        dArray4[2] = 0.0;
        double[] dArray5 = RenderSupport_169.L(dArray4, (double)f3, 0.0);
        double[] dArray6 = new double[3];
        dArray6[0] = -5.0;
        dArray6[1] = 2.0;
        dArray6[2] = 0.0;
        double[] dArray7 = dArray6;
        double[] dArray8 = new double[3];
        dArray8[0] = 5.0;
        dArray8[1] = 2.0;
        dArray8[2] = 0.0;
        double[] dArray9 = dArray8;
        double[] dArray10 = new double[3];
        dArray10[0] = 0.0;
        dArray10[1] = 12.0;
        dArray10[2] = 0.0;
        double[] dArray11 = RenderSupport_169.L(dArray7, RenderSupport_169.L(dArray10, (double)f7, 0.0));
        double[] dArray12 = new double[3];
        dArray12[0] = 0.0;
        dArray12[1] = 12.0;
        dArray12[2] = 0.0;
        double[] dArray13 = RenderSupport_169.L(dArray9, RenderSupport_169.L(dArray12, (double)f8, 0.0));
        double[] dArray14 = new double[3];
        dArray14[0] = -1.9;
        dArray14[1] = d2;
        dArray14[2] = d3;
        double[] dArray15 = dArray14;
        double[] dArray16 = new double[3];
        dArray16[0] = 1.9;
        dArray16[1] = d2;
        dArray16[2] = d3;
        double[] dArray17 = dArray16;
        double[] dArray18 = new double[3];
        dArray18[0] = 0.0;
        dArray18[1] = 10.5;
        dArray18[2] = 0.0;
        double[] dArray19 = RenderSupport_169.L(dArray15, RenderSupport_169.L(dArray18, (double)f9, 0.0));
        double[] dArray20 = new double[3];
        dArray20[0] = 0.0;
        dArray20[1] = 10.5;
        dArray20[2] = 0.0;
        double[] a32 = RenderSupport_169.L(dArray17, RenderSupport_169.L(dArray20, (double)a32, 0.0));
        return new RenderSupport_168(RenderSupport_169.L(dArray3, d4, d5, d6, d8, d7), RenderSupport_169.L(a22, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray5, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray7, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray11, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray9, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray13, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray15, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray19, d4, d5, d6, d8, d7), RenderSupport_169.L(dArray17, d4, d5, d6, d8, d7), RenderSupport_169.L(a32, d4, d5, d6, d8, d7));
    }

    private static double[] L(double[] dArray, double[] dArray2) {
        double[] a = dArray2;
        double[] a2 = dArray;
double[] dArray3 = new double[3];
        int n = 0;
        dArray3[n] = a2[n] + a[0];
        int n2 = 1;
        dArray3[n2] = a2[n2] + a[1];
        int n3 = 2;
        dArray3[n3] = a2[n3] + a[2];
        return dArray3;
    }

    private RenderSupport_169() {
        RenderSupport_169 a;
    }

    private static double[] L(double[] a, double a2, double a3) {
double d = Math.cos(a2);
        a2 = Math.sin(a2);
        double d2 = a[1] * d - a[2] * a2;
        a2 = a[1] * a2 + a[2] * d;
        d = a[0];
        if (a3 != 0.0) {
            double d3 = Math.cos(a3);
            a3 = Math.sin(a3);
            double d4 = d * d3 + a2 * a3;
            a2 = -d * a3 + a2 * d3;
            d = d4;
        }
        double[] dArray = new double[3];
        dArray[0] = d;
        dArray[1] = d2;
        dArray[2] = a2;
        return dArray;
    }

    /*
     * WARNING - void declaration
     */
    private static float L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
float f5 = a3;
        return f5 + RenderSupport_169.L((float)(a - f5)) * a2;
    }

    private static Vec3 L(double[] a, double a2, double a3, double a4, double a5, double a6) {
return new Vec3(a2 + (a[0] * a6 + a[2] * a5) * 0.05859375, a3 + (24.0 - a[1]) * 0.05859375, a4 + (a[0] * a5 - a[2] * a6) * 0.05859375);
    }

    private static float L(float f2) {
        float f3;
        float f4 = f2;
float a = f4 % 360.0f;
        if (f3 >= 180.0f) {
            a -= 360.0f;
        }
        if (a < -180.0f) {
            a += 360.0f;
        }
        return a;
    }
}

