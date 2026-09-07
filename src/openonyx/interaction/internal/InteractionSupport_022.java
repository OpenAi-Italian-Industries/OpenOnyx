/*
 * Decompiled with CFR.
 */
package openonyx.interaction.internal;

import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.utilities.internal.UtilitySupport_516;

public abstract class InteractionSupport_022
implements OnyxListener_001 {
    public InteractionSupport_022() {
        InteractionSupport_022 a;
    }

    protected UtilitySupport_516 L(UtilitySupport_516 class_516) {
        Object a = class_516;
        InteractionSupport_022 a2 = this;
Object object = a;
        a = ((UtilitySupport_516)object).L().scale(0.15);
        Vec3 vec3 = ((UtilitySupport_516)object).D();
        Vec3 vec32 = ((UtilitySupport_516)object).i();
        Vec3 vec33 = ((UtilitySupport_516)object).d();
        Vec3 vec34 = vec32;
        Vec3 vec35 = vec3;
        double d = vec35.xCoord + ((Vec3)a).xCoord;
        double d2 = vec32.xCoord - ((Vec3)a).xCoord;
        double d3 = vec35.yCoord + ((Vec3)a).yCoord;
        double d4 = vec34.yCoord - ((Vec3)a).yCoord;
        double d5 = vec3.zCoord + ((Vec3)a).zCoord;
        double d6 = vec34.zCoord - ((Vec3)a).zCoord;
        if (d > d2) {
            Vec3 vec36 = vec33;
            d = vec36.xCoord;
            d2 = vec36.xCoord;
        }
        if (d3 > d4) {
            Vec3 vec37 = vec33;
            d3 = vec37.yCoord;
            d4 = vec37.yCoord;
        }
        if (d5 > d6) {
            Vec3 vec38 = vec33;
            d5 = vec38.zCoord;
            d6 = vec38.zCoord;
        }
        return new UtilitySupport_516(new Vec3(InteractionSupport_022.L(vec3.xCoord, d, d2), InteractionSupport_022.L(vec3.yCoord, d3, d4), InteractionSupport_022.L(vec3.zCoord, d5, d6)), new Vec3(InteractionSupport_022.L(vec32.xCoord, d, d2), InteractionSupport_022.L(vec32.yCoord, d3, d4), InteractionSupport_022.L(vec32.zCoord, d5, d6)));
    }

    private static double L(double a, double a2, double a3) {
if (a < a2) {
            return a2;
        }
        if (a > a3) {
            return a3;
        }
        return a;
    }

    public abstract Vec3 L(UtilitySupport_516 var1, BlockPos var2);
}

