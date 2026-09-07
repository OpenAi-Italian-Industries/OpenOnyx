/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.EventSupport_611;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.FeatureSupport_418;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.features.player.internal.group_m.FeatureMode_434;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.InteractionSupport_010;
import openonyx.interaction.internal.InteractionSupport_012;
import openonyx.interaction.internal.InteractionSupport_013;
import openonyx.interaction.internal.InteractionSupport_017;
import openonyx.interaction.internal.InteractionSupport_019;
import openonyx.interaction.internal.PlacementResult;
import openonyx.interaction.internal.InteractionMode_025;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.ProtocolSupport_208;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.internal.ProtocolListener_214;
import openonyx.ui.UiSupport_551;
import openonyx.ui.internal.UiSupport_593;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.RayTraceUtils;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_425
extends FeatureSupport_431 {
    private final static float b = 99.0f;
    private transient boolean E;
    private transient boolean F;
    private transient int G;
    public BooleanSetting A;
    public NumberSetting K;
    final public static FeatureSupport_425 B = new FeatureSupport_425();
    private final transient ProtocolListener_214 C;
    private final static float J = 84.0f;
    private transient int D;
    private transient int c;
    public NumberSetting a;
    public BooleanSetting k;
    private transient boolean g;
    public BooleanSetting M;
    private final static long L = 500L;
    private transient long j;
    private final static float m = 39.0f;
    public NumberSetting h;
    public NumberSetting l;
    private transient float I;
    public NumberSetting d;
    private transient boolean i;
    public NumberSetting f;
    private final static double H = 4.0;
    public EnumSetting<FeatureMode_434> e;

    @EventHandler
    private void L(EventSupport_611 class_611) {
        EventSupport_611 a = class_611;
        FeatureSupport_425 a2 = this;
a2.i = 0;
    }

    private ProtocolSupport_212 L() {
        FeatureSupport_425 class_425 = this;
BlockPos a = new BlockPos(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posX, ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posY - 1.0, ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posZ);
        ProtocolSupport_212 class_212 = ProtocolSupport_212.L(new Vec3((double)a.getX() + 0.5, (double)a.getY() + 1.0, (double)a.getZ() + 0.5), ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.getPositionEyes(1.0f));
        return class_425.L(a, EnumFacing.UP, class_212, 1 != 0);
    }

    private int D() {
        FeatureSupport_425 a;
FeatureSupport_425 class_425 = a;
        if (a.L(5 >> 3)) {
            return class_425.K.d();
        }
        return class_425.h.d();
    }

    /*
     * WARNING - void declaration
     */
    private ProtocolSupport_212 L(BlockPos blockPos, EnumFacing enumFacing, ProtocolSupport_212 class_212, boolean bl) {
        float f2;
        void a;
        void a2;
        void a3;
        void a4;
        FeatureSupport_425 class_425 = this;
float f3 = a4.i();
        float a5 = class_425.L();
        switch (class_425.L().ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: {
                float f4 = a4.L();
                if (class_425.L((BlockPos)a3, (EnumFacing)a2, -180.0f, f3)) {
                    f4 = -180.0f;
                } else if (class_425.L((BlockPos)a3, (EnumFacing)a2, -135.0f, f3)) {
                    f4 = -135.0f;
                } else if (class_425.L((BlockPos)a3, (EnumFacing)a2, 135.0f, f3)) {
                    f4 = 135.0f;
                }
                return new ProtocolSupport_212(f4, f3);
            }
            case 1: {
                float f5;
                float f6;
                boolean bl2;
                if (a != false) {
                    return new ProtocolSupport_212(-180.0f, f3);
                }
                boolean bl3 = class_425.L((BlockPos)a3, (EnumFacing)a2, -135.0f, f3) || class_425.L((BlockPos)a3, (EnumFacing)a2, 135.0f, f3);
                boolean bl4 = bl2 = !class_425.L((BlockPos)a3, (EnumFacing)a2, -180.0f, f3) && ((Boolean)class_425.M.L() != false || !bl3);
                if (bl2) {
                    f6 = a4.L();
                    f5 = f3;
                } else {
                    f6 = -180.0f;
                    f5 = f3;
                }
                return new ProtocolSupport_212(f6, f5);
            }
            case 3: {
                FeatureSupport_425 class_4252 = class_425;
                Vec3 vec3 = class_4252.L((BlockPos)a3, (EnumFacing)a2);
                ProtocolSupport_212 class_2122 = ProtocolSupport_212.L(vec3, ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.getPositionEyes(1.0f));
                if (((Boolean)class_4252.M.L()).booleanValue() && !class_425.L((BlockPos)a3, (EnumFacing)a2, class_2122.L(), class_2122.i())) {
                    return new ProtocolSupport_212(a4.L(), class_2122.i());
                }
                return class_2122;
            }
            case 0: 
        }
        while (false) {
        }
        boolean bl5 = class_425.L((BlockPos)a3, (EnumFacing)a2, -135.0f, f3) || class_425.L((BlockPos)a3, (EnumFacing)a2, 135.0f, f3);
        boolean bl6 = class_425.L((BlockPos)a3, (EnumFacing)a2, -180.0f, f3);
        if (a == false && !bl5 && !bl6) {
            f2 = a4.L();
        } else if (a == false && class_425.L(3 >> 1)) {
            f2 = bl6 ? -180.0f : a4.L();
        } else if (a == false && !bl5) {
            f2 = -180.0f;
        } else {
            BlockPos blockPos2 = new BlockPos(Math.floor(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posX), Math.floor(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posY) - 1.0, Math.floor(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posZ));
            double d = (double)blockPos2.getX() + 0.5 - ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posX;
            if (MathHelper.wrapAngleTo180_float((float)(Math.toDegrees(Math.atan2((double)blockPos2.getZ() + 0.5 - ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posZ, d)) - 90.0) - 0) > 0.0f) {
                f2 = 135.0f;
                if (((Boolean)class_425.M.L()).booleanValue() && !class_425.L((BlockPos)a3, (EnumFacing)a2, f2, f3)) {
                    f2 = -135.0f;
                }
            } else {
                f2 = -135.0f;
                if (((Boolean)class_425.M.L()).booleanValue() && !class_425.L((BlockPos)a3, (EnumFacing)a2, f2, f3)) {
                    f2 = 135.0f;
                }
            }
        }
        return new ProtocolSupport_212(f2, f3);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl) {
        float f2;
        void a;
        float f3;
        FeatureSupport_425 class_425 = this;
float a2 = class_425.L() % 360.0f;
        if (f3 < 0.0f) {
            a2 += 360.0f;
        }
        a2 %= 90.0f;
        float f4 = a != false ? 10.0f : 20.0f;
        if (f2 > f4) {
            float f5 = a != false ? 80.0f : 70.0f;
            if (0 < f5) {
                return --1 != 0;
            }
        }
        return false;
    }

    private long L() {
        FeatureSupport_425 class_425 = this;
if (((Minecraft)((Object)e)).getNetHandler() == null) {
            return 0L;
        }
        NetworkPlayerInfo a = ((Minecraft)((Object)e)).getNetHandler().getPlayerInfo(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.getUniqueID());
        if (a == null) {
            return 0L;
        }
        return Math.max(0, a.getResponseTime());
    }

    private FeatureSupport_425() {
        super("HypixelKeepY");
        FeatureSupport_425 a;
        FeatureSupport_425 class_425 = a;
        a.e = ((EnumSetting)new EnumSetting<FeatureMode_434>("Rotation style", FeatureMode_434.d).L("Where the aim sits on the block face; falls back to Normal while moving diagonally")).L(Setting.H);
        class_425.f = ((NumberSetting)new NumberSetting("Rotation offset", 0.15, 0.0, 1.0, 0.01).L("Shifts the aim point from the face centre towards the player")).L(() -> {
            FeatureSupport_425 a;
return a.e.L(FeatureMode_434.H);
        });
        FeatureSupport_425 class_4252 = a;
        FeatureSupport_425 class_4253 = a;
        class_4253.A = ((BooleanSetting)new BooleanSetting("Aim check", 1 != 0).L("Only place once the crosshair raytrace actually lands on the target block")).L(Setting.H);
        class_4253.M = ((BooleanSetting)new BooleanSetting("Strict aim check", 5 >> 2).L("Require the raytrace to hit the exact face, not just the block")).L(Setting.H);
        class_4253.h = ((NumberSetting)new NumberSetting("Straight jump blocks", 0.0, 0.0, 3.0, 1.0).L("Blocks laid on the ground before jumping while bridging straight")).L(Setting.H);
        class_4253.K = ((NumberSetting)new NumberSetting("Diagonal jump blocks", 0.0, 0.0, 3.0, 1.0).L("Blocks laid on the ground before jumping while bridging diagonally")).L(Setting.H);
        class_4253.d = ((NumberSetting)new NumberSetting("Straight air delay", 1.0, 0.0, 4.0, 1.0).d(" ticks").L("Ticks to wait after the target appears in the arc before placing (straight)")).L(Setting.H);
        class_4253.a = ((NumberSetting)new NumberSetting("Diagonal air delay", 1.0, 0.0, 4.0, 1.0).d(" ticks").L("Ticks to wait after the target appears in the arc before placing (diagonal)")).L(Setting.H);
        class_4253.k = ((BooleanSetting)new BooleanSetting("Keep Y on right click", 3 >> 2).L("Only pin the Y level while the use key is held")).L(Setting.H);
        a.l = new NumberSetting("Idle aim speed", 100.0, 1.0, 180.0, 1.0).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/t").L("How fast the aim turns back under your feet once you stop placing");
        class_4252.I = 99.0f;
        class_4252.C = (class_209, class_212, class_2122) -> {
            void a;
            ProtocolSupport_212 a2 = class_2122;
            FeatureSupport_425 a3 = this;
return a.L(a2, a3.I, 39.0f);
        };
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ProtocolSupport_209 L(ProtocolSupport_212 class_212, FeatureSupport_418 class_418, boolean bl) {
        void a;
        void a2;
        OnyxListener_001 a3 = class_418;
        FeatureSupport_425 a4 = this;
a3 = ((ProtocolSupport_208)a3).L((ProtocolSupport_212)a2, (boolean)a);
        return new ProtocolSupport_209((ProtocolSupport_212)a2, null, List.of(a4.C), ((ProtocolSupport_209)a3).L(), ((ProtocolSupport_209)a3).L(), (boolean)a, ((ProtocolSupport_209)a3).L(), null);
    }

    public void h() {
        FeatureSupport_425 a;
if (!a.h() || ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer == null) {
            return;
        }
        if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.onGround) {
            a.G += 1;
            return;
        }
        a.G = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public PlacementResult L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513, ItemStack itemStack) {
        void a;
        void a2;
        void a3;
        BlockPos blockPos;
        Object a4 = vec3;
        FeatureSupport_425 a5 = this;
BlockPos blockPos2 = UtilitySupport_495.L((Vec3)a4);
        if (a5.l()) {
            if ((double)a5.c > ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posY - 1.0) {
                return null;
            }
            blockPos = new BlockPos(blockPos2.getX(), a5.c, blockPos2.getZ());
        } else {
            blockPos = Scaffold.E.L(blockPos2);
        }
        a4 = new BlockPlacementContext(new InteractionSupport_010(InteractionMode_025.d.L(), a5.L((Vec3)a4, (UtilitySupport_513)a3)), new InteractionSupport_013(InteractionSupport_012.e), (ItemStack)a2, new InteractionSupport_017((Vec3)a4, (boolean)a));
        a4 = InteractionSupport_019.L(blockPos, (BlockPlacementContext)a4);
        if (a4 != null && !a5.i) {
            FeatureSupport_425 class_425 = a5;
            class_425.F = a5.i = 1;
            class_425.D = 0;
        }
        return a4;
    }

    @EventHandler(priority=1000)
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        FeatureSupport_425 a2 = this;
if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer == null) {
            return;
        }
        FeatureSupport_425 class_425 = a2;
        class_425.I();
        if (class_425.F) {
            a2.D += 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public MovingObjectPosition L(PlacementResult class_027, ProtocolSupport_212 class_212) {
        void a;
        Object a2 = class_212;
        FeatureSupport_425 a3 = this;
if (a == null) {
            return null;
        }
        if (a3.l() && a3.D < a3.d() && a3.G >= a3.D()) {
            return null;
        }
        FeatureSupport_425 class_425 = a3;
        class_425.F = 0;
        class_425.j = System.currentTimeMillis();
        if ((a2 = super.L((PlacementResult)a, (ProtocolSupport_212)a2)) != null && a.L((MovingObjectPosition)a2)) {
            return a2;
        }
        if (!((Boolean)a3.A.L()).booleanValue()) {
            return a.L();
        }
        if (!((Boolean)a3.M.L()).booleanValue() && a2 != null && ((MovingObjectPosition)a2).typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && ((MovingObjectPosition)a2).getBlockPos().equals(a.L())) {
            return a.L();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private Vec3 L(BlockPos blockPos, EnumFacing enumFacing) {
        void a;
        void a2;
        FeatureSupport_425 class_425 = this;
Vec3 a3 = new Vec3((double)a2.getX() + 0.5 + (double)a.getFrontOffsetX() * 0.5, (double)a2.getY() + 0.5 + (double)a.getFrontOffsetY() * 0.5, (double)a2.getZ() + 0.5 + (double)a.getFrontOffsetZ() * 0.5);
        Vec3 vec3 = ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.getPositionEyes(1.0f);
        double d = a.getFrontOffsetX() != 0 ? a3.xCoord : MathHelper.clamp_double(vec3.xCoord, a2.getX(), (double)a2.getX() + 1.0);
        double d2 = a.getFrontOffsetY() != 0 ? a3.yCoord : MathHelper.clamp_double(vec3.yCoord, a2.getY(), (double)a2.getY() + 1.0);
        double d3 = a.getFrontOffsetZ() != 0 ? a3.zCoord : MathHelper.clamp_double(vec3.zCoord, a2.getZ(), (double)a2.getZ() + 1.0);
        double d4 = (Double)class_425.f.L();
        return new Vec3(a3.xCoord + (d - a3.xCoord) * d4, a3.yCoord + (d2 - a3.yCoord) * d4, a3.zCoord + (d3 - a3.zCoord) * d4);
    }

    @Override
    protected void D() {
        FeatureSupport_425 a;
if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer == null) {
            return;
        }
        FeatureSupport_425 class_425 = a;
        a.c = MathHelper.floor_double(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posY) - 1;
        a.g = 0;
        class_425.G = a.g;
        class_425.i = 0;
        a.F = !((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.onGround ? 1 : 0;
        a.D = a.F ? -1 : 0;
        FeatureSupport_425 class_4252 = a;
        class_4252.E = 0;
        class_4252.j = System.currentTimeMillis() - 600L;
    }

    @EventHandler
    private void L(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        FeatureSupport_425 a2 = this;
if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer == null || ((Minecraft)((Object)FeatureSupport_425.e)).currentScreen != null) {
            return;
        }
        if (!a2.l()) {
            return;
        }
        if (!a.L().i()) {
            return;
        }
        if (!((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.onGround) {
            return;
        }
        if (Scaffold.E.L() <= 0) {
            return;
        }
        if (a2.G < a2.D()) {
            return;
        }
        a.L(1 != 0);
    }

    private boolean l() {
        FeatureSupport_425 a;
if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.isPotionActive(Potion.jump)) {
            return 5 >> 3;
        }
        return (Boolean)a.k.L() == false || ((Minecraft)((Object)FeatureSupport_425.e)).gameSettings.keyBindUseItem.isKeyDown();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(BlockPos blockPos, EnumFacing enumFacing, float f2, float f3) {
        void a;
        void a2;
        void a3;
        float a222 = f2;
        FeatureSupport_425 a4 = this;
MovingObjectPosition a222 = RayTraceUtils.L(new ProtocolSupport_212(0, (float)a3), 4.0);
        if (a222 == null || a222.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
            return false;
        }
        if (!a222.getBlockPos().equals(a2)) {
            return 0 != 0;
        }
        return (Boolean)a4.M.L() == false || a222.sideHit == a;
    }

    private FeatureMode_434 L() {
        FeatureSupport_425 a;
if (a.L(0 != 0)) {
            return FeatureMode_434.I;
        }
        return (FeatureMode_434)a.e.L();
    }

    private int d() {
        FeatureSupport_425 a;
FeatureSupport_425 class_425 = a;
        if (a.L(3 >> 2)) {
            return class_425.a.d();
        }
        return class_425.d.d();
    }

    private float L() {
        FeatureSupport_425 class_425 = this;
MovementInputState a = Scaffold.E.L();
        if (a == null || !a.i()) {
            return ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.rotationYaw;
        }
        return UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer, a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ProtocolSupport_212 L(PlacementResult class_027) {
        boolean bl;
        void a;
        FeatureSupport_425 class_425 = this;
if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer == null) {
            return null;
        }
        if (((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.onGround) {
            class_425.E = 0;
        }
        if (System.currentTimeMillis() - class_425.j > class_425.L() + 500L && Scaffold.E.L() > 0) {
            FeatureSupport_425 class_4252 = class_425;
            class_4252.I = class_4252.l.L();
            return class_4252.L();
        }
        if (a == null) {
            return ProtocolSupport_207.I.D();
        }
        FeatureSupport_425 class_4253 = class_425;
        boolean a2 = class_4253.l();
        if (class_4253.E) {
            bl = a2;
            class_425.I = 39.0f;
        } else {
            FeatureSupport_425 class_4254 = class_425;
            if (a2) {
                class_4254.I = (float)ThreadLocalRandom.current().nextDouble(84.0, 99.0);
                bl = a2;
            } else {
                class_4254.I = class_425.l.L();
                bl = a2;
            }
        }
        if (bl && !((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.onGround) {
            class_425.E = 1;
        }
        return class_425.L(a.L(), a.L(), a.L(), 3 >> 2);
    }

    private void I() {
        FeatureSupport_425 class_425 = this;
int a = MathHelper.floor_double(((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.posY) - 1;
        if (!class_425.l()) {
            FeatureSupport_425 class_4252 = class_425;
            class_4252.c = 9;
            class_4252.g = 0;
            return;
        }
        if (((Minecraft)((Object)FeatureSupport_425.e)).gameSettings.keyBindJump.isKeyDown()) {
            class_425.c = 9;
            class_425.g = 1;
            return;
        }
        if (class_425.g || ((Minecraft)((Object)FeatureSupport_425.e)).thePlayer.onGround) {
            class_425.c = 9;
            class_425.g = 0;
        }
    }
}

