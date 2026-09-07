/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.group_m;

import java.util.Comparator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.internal.FeatureSupport_418;
import openonyx.history.ModeOption;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.PlacementResult;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.RayTraceUtils;
import openonyx.utilities.internal.UtilitySupport_513;

public abstract class FeatureSupport_431
extends ModeOption
implements OnyxListener_001 {
    public abstract PlacementResult L(Vec3 var1, boolean var2, UtilitySupport_513 var3, ItemStack var4);

    /*
     * WARNING - void declaration
     */
    protected Comparator<BlockPos> L(Vec3 vec3, UtilitySupport_513 class_513) {
        void a;
        UtilitySupport_513 a2 = class_513;
        FeatureSupport_431 a3 = this;
if (a2 != null) {
            return BlockPlacementContext.L(a2);
        }
        return BlockPlacementContext.L((Vec3)a);
    }

    public ProtocolSupport_212 L(PlacementResult class_027) {
        PlacementResult a = class_027;
        FeatureSupport_431 a2 = this;
if (a == null) {
            return null;
        }
        return a.L();
    }

    public MovingObjectPosition L(PlacementResult class_027, ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        FeatureSupport_431 a2 = this;
return RayTraceUtils.L(a);
    }

    protected FeatureSupport_431(String string) {
        String a = string;
        FeatureSupport_431 a2 = this;
        super(a);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_209 L(ProtocolSupport_212 class_212, FeatureSupport_418 class_418, boolean bl) {
        void a;
        void a2;
        boolean a3 = bl;
        FeatureSupport_431 a4 = this;
return a2.L((ProtocolSupport_212)a, a3);
    }
}

