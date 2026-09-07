/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.group_m;

import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.connection.NetworkSupport_453;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.history.internal.NumberSetting;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.InteractionSupport_010;
import openonyx.interaction.internal.InteractionSupport_012;
import openonyx.interaction.internal.InteractionSupport_013;
import openonyx.interaction.internal.InteractionSupport_017;
import openonyx.interaction.internal.InteractionSupport_019;
import openonyx.interaction.internal.PlacementResult;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.theme.internal.ThemeSupport_061;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_430
extends FeatureSupport_431 {
    public NumberSetting f;
    final public static FeatureSupport_430 H = new FeatureSupport_430();
    private final static float e = (float)Math.PI / 180;

    /*
     * WARNING - void declaration
     */
    @Override
    public MovingObjectPosition L(PlacementResult class_027, ProtocolSupport_212 class_212) {
        void a;
        Object a2 = class_212;
        FeatureSupport_430 a3 = this;
if (a == null) {
            return null;
        }
        if ((a2 = super.L((PlacementResult)a, (ProtocolSupport_212)a2)) != null && a.L((MovingObjectPosition)a2)) {
            return a2;
        }
        return a.L();
    }

    private FeatureSupport_430() {
        super("Expand");
        FeatureSupport_430 a;
        FeatureSupport_430 class_430 = a;
        class_430.f = new NumberSetting("Length", 4.0, 1.0, 10.0, 1.0).d(" blocks");
    }

    @Override
    public ProtocolSupport_212 L(PlacementResult class_027) {
        PlacementResult a = class_027;
        FeatureSupport_430 a2 = this;
if (a == null) {
            return null;
        }
        return ProtocolSupport_212.L(UtilitySupport_495.L(a.d()), FeatureSupport_430.e.thePlayer.getPositionEyes(1.0f));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public PlacementResult L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513, ItemStack itemStack) {
        int a;
        void a22;
        void a3;
        ItemStack a4;
        FeatureSupport_430 class_430 = itemStack2;
        ItemStack itemStack2 = itemStack;
        FeatureSupport_430 a5 = class_430;
BlockPlacementContext a22 = new BlockPlacementContext(InteractionSupport_010.L(), new InteractionSupport_013(InteractionSupport_012.e, --1 != 0), a4, new InteractionSupport_017((Vec3)a3, (boolean)a22));
        int n = 0;
        while (n <= a5.f.d()) {
            a4 = InteractionSupport_019.L(Scaffold.E.L(a5.L((Vec3)a3, 0)), a22);
            if (a4 != null) {
                return a4;
            }
            n = ++a;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private BlockPos L(Vec3 vec3, int n) {
        void a;
        void a2;
        FeatureSupport_430 class_430 = this;
float a3 = FeatureSupport_430.e.thePlayer.rotationYaw;
        return UtilitySupport_495.L((Vec3)a2).add((int)(-((float)Math.sin(a3 * ((float)Math.PI / 180))) * (float)a), 0, (int)((float)Math.cos(a3 * ((float)Math.PI / 180)) * (float)a));
    }
}

