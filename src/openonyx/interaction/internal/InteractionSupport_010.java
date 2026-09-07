/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.core.OnyxListener_001;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.InteractionMode_025;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_507;

public class InteractionSupport_010
implements OnyxListener_001 {
    private final List<? extends Vec3i> H;
    private final Comparator<BlockPos> e;

    public static InteractionSupport_010 L() {
return new InteractionSupport_010(InteractionMode_025.f.L(), Comparator.comparingDouble(blockPos -> {
            BlockPos blockPos2 = blockPos;
Vec3 a = UtilitySupport_477.D((Entity)((Minecraft)((Object)InteractionSupport_010.e)).thePlayer);
            return -UtilitySupport_507.L(BlockUtils.L(blockPos2).offset(blockPos2.getX(), blockPos2.getY(), blockPos2.getZ()), a);
        }));
    }

    @Generated
    public List<? extends Vec3i> L() {
        InteractionSupport_010 a;
return a.H;
    }

    @Generated
    public Comparator<BlockPos> L() {
        InteractionSupport_010 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public InteractionSupport_010(List<? extends Vec3i> list, Comparator<BlockPos> comparator) {
        void a;
        InteractionSupport_010 a2;
        Comparator<BlockPos> a3 = comparator;
        InteractionSupport_010 class_010 = a2 = this;
        class_010.H = a;
        class_010.e = a3;
    }
}

