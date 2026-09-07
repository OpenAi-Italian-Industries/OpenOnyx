/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.group_m;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.features.player.internal.group_m.FeatureMode_429;
import openonyx.features.player.internal.internal.FeatureSupport_451;
import openonyx.features.player.internal.internal.FeatureListener_444;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.InteractionSupport_010;
import openonyx.interaction.internal.InteractionSupport_012;
import openonyx.interaction.internal.InteractionSupport_013;
import openonyx.interaction.internal.InteractionSupport_017;
import openonyx.interaction.internal.InteractionSupport_019;
import openonyx.interaction.internal.PlacementResult;
import openonyx.interaction.internal.InteractionMode_025;
import openonyx.movement.MovementSupport_088;
import openonyx.movement.MovementSupport_092;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_489;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.RayTraceUtils;
import openonyx.utilities.RayTraceMode;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_435
extends FeatureSupport_431
implements FeatureListener_444 {
    public MultiSelectSetting<FeatureMode_429> m;
    private final static float h = (float)Math.PI / 180;
    private final static double l = 0.08;
    private final static double I = (double)0.42f;
    private final static double d = 0.98;
    final public static FeatureSupport_435 i = new FeatureSupport_435();
    private transient boolean f;
    public NumberSetting H;
    public RangeSetting e;

    private FeatureSupport_451 L(FeatureMode_429 enum_429) {
        FeatureMode_429 a = enum_429;
        FeatureSupport_435 a2 = this;
switch (a.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                boolean bl = 0;
                return new FeatureSupport_451(1 != 0, bl ? 1 : 0, bl, bl);
            }
            case 1: {
                boolean bl = 0;
                return new FeatureSupport_451(bl, a2.e.i(), bl, bl);
            }
            case 2: {
                boolean bl = 3 >> 2;
                return new FeatureSupport_451(bl, bl ? 1 : 0, --1 != 0, bl);
            }
            case 3: 
        }
        boolean bl = 0;
        return new FeatureSupport_451(bl, bl ? 1 : 0, bl, --1 != 0);
    }

    private FeatureSupport_435() {
        super("GodBridge");
        FeatureSupport_435 a;
        FeatureSupport_435 class_435 = a;
        Enum[] enumArray = new FeatureMode_429[1];
        enumArray[0] = FeatureMode_429.I;
        class_435.m = new MultiSelectSetting("Modes", FeatureMode_429.class, enumArray).L(0 != 0);
        FeatureSupport_435 class_4352 = a;
        class_4352.H = new NumberSetting("Force sneak below count", 3.0, 0.0, 10.0, 1.0);
        int n = 1;
        class_4352.e = RangeSetting.L("Sneak time", n, n, n, 10).L(" ticks");
    }

    private ProtocolSupport_212 d(PlacementResult class_027) {
        PlacementResult a22 = class_027;
        FeatureSupport_435 a = this;
float a22 = (float)(Math.floor(a22.L().L() / 90.0f) * 90.0);
        return new ProtocolSupport_212(45.0f, 75.0f);
    }

    private double L() {
double d = 0.42f;
        if (((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.isPotionActive(Potion.jump)) {
            d += (double)((float)(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1f);
        }
        return d;
    }

    @Override
    public ProtocolSupport_212 L(PlacementResult class_027) {
        PlacementResult a22 = class_027;
        FeatureSupport_435 a = this;
if (Scaffold.E.L().equals(MovementInputState.i)) {
            if (a22 == null) {
                return null;
            }
            return a.d(a22);
        }
        float a22 = (float)(Math.rint((UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer, Scaffold.E.L()) + 180.0f) / 45.0f) * 45.0);
        int n = 0.0f == 0.0f ? 1 : 0;
        FeatureSupport_435 class_435 = a;
        if (0 != 0) {
            return class_435.L(0);
        }
        return class_435.d(0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public PlacementResult L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513, ItemStack itemStack) {
        void a;
        void a2;
        boolean a222 = bl;
        FeatureSupport_435 a3 = this;
BlockPlacementContext a222 = new BlockPlacementContext(new InteractionSupport_010(InteractionMode_025.d.L(), BlockPlacementContext.L((Vec3)a2)), new InteractionSupport_013(InteractionSupport_012.e), (ItemStack)a, new InteractionSupport_017((Vec3)a2, a222));
        return InteractionSupport_019.L(Scaffold.E.L(UtilitySupport_495.L((Vec3)a2)), a222);
    }

    private boolean l() {
        FeatureSupport_435 a;
double d = a.L();
        double d2 = 0.0;
        double d3 = d;
        while (d3 > 0.0) {
            d2 += d;
            d3 = (d - 0.08) * 0.98;
        }
        if (d2 >= 2.0) {
            return 5 >> 2;
        }
        return false;
    }

    private ProtocolSupport_212 d(float f2) {
        float a = f2;
        FeatureSupport_435 a2 = this;
return new ProtocolSupport_212(9, 75.6f);
    }

    /*
     * WARNING - void declaration
     */
    private ProtocolSupport_212 L(float f2) {
        void a;
        FeatureSupport_435 class_435 = this;
if (((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.onGround) {
            class_435.f = Math.floor(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.posX + (double)((float)Math.cos((double)(a * ((float)Math.PI / 180)))) * 0.5) != Math.floor(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.posX) || Math.floor(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.posZ + (double)((float)Math.sin((double)(a * ((float)Math.PI / 180)))) * 0.5) != Math.floor(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.posZ);
            Object a22 = EnumFacing.fromAngle(0.0);
            a22 = UtilitySupport_495.L(UtilitySupport_477.D((Entity)((Minecraft)((Object)FeatureSupport_435.e)).thePlayer).addVector((double)((EnumFacing)a22).getFrontOffsetX() * 0.6, (double)((EnumFacing)a22).getFrontOffsetY() * 0.6, (double)((EnumFacing)a22).getFrontOffsetZ() * 0.6));
            int n = 0;
            boolean bl = FeatureSupport_435.L(new BlockPos(((Minecraft)((Object)FeatureSupport_435.e)).thePlayer).add(n, -1, n));
            int n2 = 0;
            boolean a22 = FeatureSupport_435.L(((BlockPos)a22).add(n2, -1, n2));
            if (bl && a22) {
                class_435.f = !class_435.f ? 1 : 0;
            }
        }
        return new ProtocolSupport_212((float)(a + (float)(class_435.f ? 45 : -45)), 75.7f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FeatureSupport_451 L(PlacementResult class_027, ProtocolSupport_212 class_212) {
        FeatureSupport_435 class_435;
        Object a322;
        void a22;
        MovingObjectPosition a322;
        FeatureSupport_435 class_4352 = this;
if (!class_4352.h()) {
            return FeatureSupport_451.e;
        }
        Object a = MovementSupport_092.H.L().L(1);
        if (!((MovementSupport_088)a).L()) {
            return FeatureSupport_451.e;
        }
        a = ((MovementSupport_088)a).d().add(0.0, ((Minecraft)((Object)FeatureSupport_435.e)).thePlayer.getEyeHeight(), 0.0);
        a322 = RayTraceUtils.L(RayTraceUtils.L(), RayTraceMode.e, 0 != 0, (Vec3)a, ((ProtocolSupport_212)((Object)a322)).L());
        if (a22 == null) {
            return FeatureSupport_451.e;
        }
        boolean a22 = a22.L(a322);
        boolean a322 = Scaffold.E.L(a322);
        if (a22 && a322) {
            return FeatureSupport_451.e;
        }
        FeatureMode_429 enum_429 = a22 = Scaffold.E.L() < class_4352.H.d() ? FeatureMode_429.d : FeatureSupport_435.L((EnumSet)class_4352.m.L());
        if (a22 == FeatureMode_429.I && class_4352.l()) {
            a = EnumSet.copyOf((EnumSet)class_4352.m.L());
            ((AbstractCollection)a).remove(FeatureMode_429.I);
            a = FeatureSupport_435.L(a);
            a322 = a != null ? a : FeatureMode_429.d;
            class_435 = class_4352;
        } else {
            a322 = a22;
            class_435 = class_4352;
        }
        return class_435.L((FeatureMode_429)a322);
    }

    private static boolean L(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
IBlockState a = BlockUtils.L(blockPos2);
        return a == null || a.getBlock().getMaterial() == Material.air;
    }

    private static FeatureMode_429 L(EnumSet<FeatureMode_429> enumSet) {
        AbstractCollection a;
        EnumSet<FeatureMode_429> enumSet2 = enumSet;
if (enumSet2.isEmpty()) {
            return null;
        }
        AbstractCollection abstractCollection = a = new ArrayList<FeatureMode_429>(enumSet2);
        return (FeatureMode_429)abstractCollection.get(ThreadLocalRandom.current().nextInt(abstractCollection.size()));
    }
}

