/*
 * Decompiled with CFR.
 */
package openonyx.events;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.events.GeometryUtils;
import openonyx.events.Rotation;

public class RotationMath
implements OnyxListener_001 {
    /*
     * WARNING - void declaration
     */
    public static float L(float f2, float f3, float f4, float f5, float f6) {
        void a;
        void a2;
        float f7;
        void a3;
        float a4 = f3;
        float a5 = f2;
a4 = RotationMath.d(a5, a4, (float)a3);
        if (f7 >= a2 && a4 <= a) {
            return a4;
        }
        if (a3 <= 0.0f) {
            return MathHelper.clamp_float(a4, (float)a2, (float)a);
        }
        a4 = a4 > a ? a : a2;
        double d = (a4 - a5) / a3;
        return (float)((double)a5 + (double)((long)d) * (double)a3);
    }

    /*
     * WARNING - void declaration
     */
    public static float d(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
if (a2 <= 0.0f) {
            return (float)a;
        }
        double d = (double)(a - a3);
        return (float)((double)a3 + (double)Math.round(d / (double)a2) * (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static Rotation L(Vec3 vec3, Rotation class_535) {
        void a;
        Vec3 vec32 = vec3;
Vec3 a22 = GeometryUtils.L();
        Vec3 vec33 = vec32;
        double d = vec33.xCoord - a22.xCoord;
        double d2 = vec33.yCoord - a22.yCoord;
        double d3 = vec33.zCoord - a22.zCoord;
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        if (d4 * d4 + d5 * d5 + d6 * d6 < 1.0E-8) {
            return a;
        }
        float a22 = (float)(MathHelper.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
        double d7 = d;
        double d8 = d3;
        float f2 = (float)(-(MathHelper.atan2(d2, Math.sqrt(d7 * d7 + d8 * d8)) * 180.0 / Math.PI));
        return new Rotation(a.d() + MathHelper.wrapAngleTo180_float(0 - a.d()), MathHelper.clamp_float(f2, -90.0f, 90.0f));
    }

    public static float L() {
double d = RotationMath.e.gameSettings.mouseSensitivity * 0.6f + 0.2f;
        return (float)(d * d * d * 8.0) * 0.15f;
    }

    public static Rotation L(Vec3 a) {
return RotationMath.L(a, new Rotation(RotationMath.e.thePlayer.rotationYaw, RotationMath.e.thePlayer.rotationPitch));
    }

    /*
     * WARNING - void declaration
     */
    public static float L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
float f5 = a3;
        return f5 + MathHelper.wrapAngleTo180_float((float)(a - f5)) * a2;
    }

    public RotationMath() {
        RotationMath a;
    }
}

