/*
 * Decompiled with CFR.
 */
package openonyx.interaction.internal;

import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import openonyx.interaction.internal.InteractionSupport_022;
import openonyx.utilities.internal.UtilitySupport_516;

public final class InteractionSupport_016
extends InteractionSupport_022 {
    final public static InteractionSupport_016 e = new InteractionSupport_016();

    private InteractionSupport_016() {
        InteractionSupport_016 a;
    }

    @Override
    public Vec3 L(UtilitySupport_516 class_516, BlockPos blockPos) {
        UtilitySupport_516 a = class_516;
        InteractionSupport_016 a2 = this;
return a2.L(a).I();
    }
}

