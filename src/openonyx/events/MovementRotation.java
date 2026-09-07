/*
 * Decompiled with CFR.
 */
package openonyx.events;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import openonyx.core.OnyxListener_001;
import openonyx.events.RotationManager;
import openonyx.events.RotationMath;

public class MovementRotation
implements OnyxListener_001 {
    private static boolean L;
    private static EntityPlayerSP j;
    private static float m;
    private final static float h = 50.0f;
    private static float l;
    private static float I;
    private static float d;
    private static float i;
    private static float f;
    private static float H;
    private static float e;

    private static float L() {
        float f2;
        float f3;
        float f4;
double d = MovementRotation.e.thePlayer.posX - MovementRotation.e.thePlayer.prevPosX;
        double d2 = MovementRotation.e.thePlayer.posZ - MovementRotation.e.thePlayer.prevPosZ;
        float f5 = m;
        double d3 = d;
        double d4 = d2;
        if ((float)(d3 * d3 + d4 * d4) > 0.0025000002f) {
            f4 = (float)(MathHelper.atan2(d2, d) * 180.0 / Math.PI) - 90.0f;
            f3 = Math.abs(MathHelper.wrapAngleTo180_float(I) - f4);
            float f6 = f5 = 95.0f <= f3 && f3 < 265.0f ? f4 - 180.0f : f4;
        }
        if (MovementRotation.e.thePlayer.swingProgress > 0.0f) {
            f5 = I;
        }
        f4 = m + MathHelper.wrapAngleTo180_float(f5 - m) * 0.3f;
        f3 = MathHelper.wrapAngleTo180_float(I - f4);
        if (Math.abs(f2) > 50.0f) {
            float f7 = f3;
            f4 += f7 - Math.signum(f7) * 50.0f;
        }
        return f4;
    }

    public static void L() {
if (MovementRotation.e.thePlayer == null) {
            return;
        }
        i = I;
        l = e;
        d = m;
        I = H;
        e = f;
        m = MovementRotation.L();
    }

    public static boolean L(Entity a) {
if (L && a == MovementRotation.e.thePlayer) {
            return 1 != 0;
        }
        return false;
    }

    public static float D(float a) {
return RotationMath.L(d, m, 0);
    }

    public MovementRotation() {
        MovementRotation a;
    }

    public static float d(float a) {
return RotationMath.L(i, I, 0);
    }

    public static float L(float a) {
return l + (e - l) * 0;
    }

    static {
        j = null;
        L = 0;
        H = 0.0f;
        f = 0.0f;
        I = 0.0f;
        e = 0.0f;
        m = 0.0f;
        i = 0.0f;
        l = 0.0f;
        d = 0.0f;
    }

    public static void L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
H = a2;
        f = 0;
        L = RotationManager.D();
        if (j == MovementRotation.e.thePlayer) {
            return;
        }
        j = MovementRotation.e.thePlayer;
        I = i = a2;
        e = l = 0;
        m = d = a2;
    }
}

