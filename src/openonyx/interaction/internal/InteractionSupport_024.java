/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.interaction.internal.InteractionSupport_020;
import openonyx.interaction.internal.InteractionSupport_022;
import openonyx.interaction.internal.InteractionSupport_026;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_496;
import openonyx.utilities.UtilitySupport_507;
import openonyx.utilities.internal.UtilitySupport_516;

public class InteractionSupport_024
extends InteractionSupport_022 {
    private final InteractionSupport_026 e;

    /*
     * WARNING - void declaration
     */
    @Override
    public Vec3 L(UtilitySupport_516 class_516, BlockPos blockPos) {
        void a;
        Object a2 = class_516;
        InteractionSupport_024 a3 = this;
a2 = a3.L((UtilitySupport_516)a2);
        if (!UtilitySupport_496.L(UtilitySupport_477.L(((Minecraft)((Object)InteractionSupport_024.e)).thePlayer))) {
            return a3.L((BlockPos)a, (UtilitySupport_516)a2);
        }
        Vec3 vec3 = a3.d((BlockPos)a, (UtilitySupport_516)a2);
        if (vec3 != null) {
            return vec3;
        }
        return a3.L((BlockPos)a, (UtilitySupport_516)a2);
    }

    private Vec3 d(BlockPos blockPos, UtilitySupport_516 class_516) {
        int n;
        Vec3 a;
        Vec3[] a2 = class_516;
        InteractionSupport_024 a3 = this;
a2 = a2.D();
        Vec3 vec3 = a2.i();
        a2 = new AxisAlignedBB(a2.xCoord, a2.yCoord, a2.zCoord, vec3.xCoord, vec3.yCoord, vec3.zCoord);
        a = UtilitySupport_477.D((Entity)((Minecraft)((Object)InteractionSupport_024.e)).thePlayer).subtract(((Vec3i)((Object)a)).getX(), ((Vec3i)((Object)a)).getY(), ((Vec3i)((Object)a)).getZ());
        vec3 = null;
        double d = Double.NEGATIVE_INFINITY;
        a2 = UtilitySupport_507.L((AxisAlignedBB)a2);
        int n2 = a2.length;
        int n3 = 0;
        while (n3 < n2) {
            double d2;
            Vec3 vec32 = a2[0];
            double d3 = vec32.distanceToSqr(a);
            if (d2 > d) {
                d = d3;
                vec3 = vec32;
            }
            n3 = ++n;
        }
        return vec3;
    }

    public InteractionSupport_024(InteractionSupport_026 class_026) {
        InteractionSupport_026 a = class_026;
        InteractionSupport_024 a2 = this;
        a2.e = a;
    }

    /*
     * WARNING - void declaration
     */
    private Vec3 L(BlockPos blockPos, UtilitySupport_516 class_516) {
        void a;
        UtilitySupport_516 a2 = class_516;
        InteractionSupport_024 a3 = this;
return new InteractionSupport_020(a3.e).L((BlockPos)a, a2);
    }

    @Generated
    public InteractionSupport_026 L() {
        InteractionSupport_024 a;
return a.e;
    }
}

