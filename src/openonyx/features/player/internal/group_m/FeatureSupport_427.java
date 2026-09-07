/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_611;
import openonyx.events.EntityRelationUtils;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_436;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_438;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_439;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_440;
import openonyx.features.player.internal.group_m.internal.FeatureMode_437;
import openonyx.history.internal.EnumSetting;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.InteractionSupport_010;
import openonyx.interaction.internal.InteractionSupport_011;
import openonyx.interaction.internal.InteractionSupport_012;
import openonyx.interaction.internal.InteractionSupport_013;
import openonyx.interaction.internal.InteractionSupport_016;
import openonyx.interaction.internal.InteractionSupport_017;
import openonyx.interaction.internal.InteractionSupport_019;
import openonyx.interaction.internal.InteractionSupport_020;
import openonyx.interaction.internal.InteractionSupport_022;
import openonyx.interaction.internal.InteractionSupport_024;
import openonyx.interaction.internal.InteractionSupport_026;
import openonyx.interaction.internal.PlacementResult;
import openonyx.interaction.internal.InteractionMode_021;
import openonyx.interaction.internal.InteractionMode_025;
import openonyx.movement.MovementSupport_088;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_427
extends FeatureSupport_431 {
    public FeatureSupport_436 l;
    public FeatureSupport_439 I;
    public FeatureSupport_438 d;
    public EnumSetting<InteractionMode_021> i;
    final public static FeatureSupport_427 f = new FeatureSupport_427();
    private transient double H;
    public FeatureSupport_440 e;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public ProtocolSupport_212 L(PlacementResult class_027) {
        PlacementResult a = class_027;
        FeatureSupport_427 a2 = this;
if (!FeatureSupport_438.f.D()) return super.L(a);
        if (!FeatureSupport_438.f.l()) return super.L(a);
        switch ((FeatureMode_437)FeatureSupport_438.f.e.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case i: {
                float f2;
                float f3 = (float)(Math.rint(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_427.e)).thePlayer).L() / 45.0f) * 45.0);
                if (((Minecraft)((Object)FeatureSupport_427.e)).thePlayer.rotationPitch < 45.0f) {
                    f2 = 45.0f;
                    return new ProtocolSupport_212(f3, f2);
                }
                f2 = ((Minecraft)((Object)FeatureSupport_427.e)).thePlayer.rotationPitch;
                return new ProtocolSupport_212(f3, f2);
            }
            case e: 
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private InteractionSupport_022 L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513) {
        void a;
        Object a2 = vec3;
        FeatureSupport_427 a3 = this;
a2 = new InteractionSupport_026(((Vec3)a2).add(0.0, InteractionSupport_017.L((boolean)a), 0.0), a3.H);
        switch ((InteractionMode_021)a3.i.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case I: {
                return InteractionSupport_012.e;
            }
            case l: {
                return InteractionSupport_016.e;
            }
            case d: {
                void a4;
                return new InteractionSupport_011((InteractionSupport_026)a2, (UtilitySupport_513)a4);
            }
            case H: {
                return new InteractionSupport_020((InteractionSupport_026)a2);
            }
            case i: 
        }
        return new InteractionSupport_024((InteractionSupport_026)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public MovingObjectPosition L(PlacementResult class_027, ProtocolSupport_212 class_212) {
        void a;
        Object a2 = class_212;
        FeatureSupport_427 a3 = this;
if (a == null) {
            return null;
        }
        if ((a2 = super.L((PlacementResult)a, (ProtocolSupport_212)a2)) != null && a.L((MovingObjectPosition)a2)) {
            return a2;
        }
        if (FeatureSupport_440.h()) {
            return a.L();
        }
        return null;
    }

    @EventHandler(priority=-50)
    private void L(EventSupport_611 class_611) {
        EventSupport_611 a = class_611;
        FeatureSupport_427 a2 = this;
a2.H = ThreadLocalRandom.current().nextDouble(-0.01, 0.01);
    }

    private FeatureSupport_427() {
        super("Normal");
        FeatureSupport_427 a;
        FeatureSupport_427 class_427 = a;
        a.i = new EnumSetting<InteractionMode_021>("Rotation mode", InteractionMode_021.d);
        class_427.I = FeatureSupport_439.e;
        a.d = FeatureSupport_438.f;
        a.e = FeatureSupport_440.e;
        a.l = FeatureSupport_436.H;
        a.H = ThreadLocalRandom.current().nextDouble(-0.02, 0.02);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public PlacementResult L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513, ItemStack itemStack) {
        void a;
        void a22;
        FeatureSupport_427 class_427;
        List<BlockPos> list;
        void a3;
        Object a4 = class_513;
        FeatureSupport_427 a5 = this;
Comparator<BlockPos> comparator = a5.L((Vec3)a3, (UtilitySupport_513)a4);
        if (FeatureSupport_440.h()) {
            list = InteractionMode_025.H.L();
            class_427 = a5;
        } else {
            list = InteractionMode_025.d.L();
            class_427 = a5;
        }
        a4 = class_427.L((Vec3)a3, (boolean)a22, (UtilitySupport_513)a4);
        BlockPlacementContext a22 = new BlockPlacementContext(new InteractionSupport_010(list, comparator), new InteractionSupport_013((InteractionSupport_022)a4, FeatureSupport_440.h()), (ItemStack)a, new InteractionSupport_017((Vec3)a3, (boolean)a22));
        return InteractionSupport_019.L(Scaffold.E.L(UtilitySupport_495.L((Vec3)a3)), a22);
    }
}

