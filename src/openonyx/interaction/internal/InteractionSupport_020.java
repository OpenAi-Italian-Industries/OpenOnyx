/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import lombok.Generated;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.interaction.internal.InteractionSupport_022;
import openonyx.interaction.internal.InteractionSupport_026;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.internal.UtilitySupport_513;
import openonyx.utilities.internal.UtilitySupport_516;
import openonyx.utilities.internal.UtilityListener_511;

public class InteractionSupport_020
extends InteractionSupport_022 {
    private final InteractionSupport_026 e;

    public InteractionSupport_020(InteractionSupport_026 class_026) {
        InteractionSupport_026 a = class_026;
        InteractionSupport_020 a2 = this;
        a2.e = a;
    }

    @Generated
    public InteractionSupport_026 L() {
        InteractionSupport_020 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public Vec3 L(BlockPos blockPos, UtilitySupport_516 class_516) {
        void a;
        Object a2 = blockPos;
        InteractionSupport_020 a3 = this;
if (UtilityListener_511.L(a.L(), 0.0)) {
            return a.D();
        }
        ProtocolSupport_212 class_212 = ProtocolSupport_207.I.i();
        a2 = new UtilitySupport_513(a3.e.L().subtract(((Vec3i)a2).getX(), ((Vec3i)a2).getY(), ((Vec3i)a2).getZ()), class_212.L());
        return a.L((UtilityListener_511)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Vec3 L(UtilitySupport_516 class_516, BlockPos blockPos) {
        void a;
        BlockPos a2 = blockPos;
        InteractionSupport_020 a3 = this;
InteractionSupport_020 class_020 = a3;
        return class_020.L(a2, class_020.L((UtilitySupport_516)a));
    }
}

