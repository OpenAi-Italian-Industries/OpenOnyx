/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.events.Rotation;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.history.internal.RangeSetting;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.InteractionSupport_010;
import openonyx.interaction.internal.InteractionSupport_012;
import openonyx.interaction.internal.InteractionSupport_013;
import openonyx.interaction.internal.InteractionSupport_017;
import openonyx.interaction.internal.InteractionSupport_019;
import openonyx.interaction.internal.PlacementResult;
import openonyx.interaction.internal.InteractionMode_025;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.theme.ThemeSupport_056;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_426
extends FeatureSupport_431 {
    private transient double d;
    public RangeSetting i;
    private transient long f;
    private transient float H;
    final public static FeatureSupport_426 e = new FeatureSupport_426();

    private FeatureSupport_426() {
        FeatureSupport_426 a;
        FeatureSupport_426 class_426 = a;
        super("Breezily");
        class_426.i = RangeSetting.L("Edge distance", 0.45, 0.5, 0.25, 0.5).L(" blocks");
        class_426.d = 0.45;
    }

    private ProtocolSupport_212 d(float f2) {
        float a = f2;
        FeatureSupport_426 a2 = this;
return new ProtocolSupport_212(9, 80.0f);
    }

    private static boolean L(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
IBlockState a = BlockUtils.L(blockPos2);
        return a == null || a.getBlock().getMaterial() == Material.air;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=-50)
    private void L(EventSupport_625 class_625) {
        FeatureSupport_426 class_426;
        boolean bl;
        FeatureSupport_426 class_4262;
        float a;
        void a2;
        FeatureSupport_426 class_4263;
        block18: {
            class_4263 = this;
if (((Minecraft)((Object)FeatureSupport_426.e)).thePlayer == null) {
                return;
            }
            if (!a2.L().d() || ((Minecraft)((Object)FeatureSupport_426.e)).thePlayer.isSneaking()) {
                return;
            }
            int n = 0;
            if (FeatureSupport_426.L(new BlockPos(((Minecraft)((Object)FeatureSupport_426.e)).thePlayer).add(n, -1, n))) {
                class_4263.f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - class_4263.f > 500L) {
                return;
            }
            double d = ((Minecraft)((Object)FeatureSupport_426.e)).thePlayer.posX - Math.floor(((Minecraft)((Object)FeatureSupport_426.e)).thePlayer.posX);
            double d2 = ((Minecraft)((Object)FeatureSupport_426.e)).thePlayer.posZ - Math.floor(((Minecraft)((Object)FeatureSupport_426.e)).thePlayer.posZ);
            double d3 = 1.0 - class_4263.d;
            a = 0.0f;
            switch (EnumFacing.fromAngle(((Minecraft)((Object)FeatureSupport_426.e)).thePlayer.rotationYaw)) {
                case SOUTH: {
                    if (d > d3) {
                        a = 1.0f;
                    }
                    if (!(d < class_4263.d)) break;
                    a = -1.0f;
                    class_4262 = class_4263;
                    break block18;
                }
                case NORTH: {
                    if (d > d3) {
                        a = -1.0f;
                    }
                    if (!(d < class_4263.d)) break;
                    a = 1.0f;
                    class_4262 = class_4263;
                    break block18;
                }
                case EAST: {
                    if (d2 > d3) {
                        a = -1.0f;
                    }
                    if (!(d2 < class_4263.d)) break;
                    a = 1.0f;
                    class_4262 = class_4263;
                    break block18;
                }
                case WEST: {
                    if (d2 > d3) {
                        a = 1.0f;
                    }
                    if (!(d2 < class_4263.d)) break;
                    a = -1.0f;
                    class_4262 = class_4263;
                    break block18;
                }
            }
            class_4262 = class_4263;
        }
        if (class_4262.H != 9 && 9 != 0.0f) {
            class_4263.H = 9;
            class_4263.d = class_4263.i.D();
        }
        boolean bl3 = a2.L().d();
        bl3 = a2.L().I();
        if (class_4263.H == -1.0f) {
            bl = 5 >> 2;
            class_426 = class_4263;
        } else {
            bl = false;
            class_426 = class_4263;
        }
        a2.L(new MovementInputState(bl2, bl3, bl, class_426.H == 1.0f ? --1 != 0 : false));
    }

    private ProtocolSupport_212 L(float f2) {
        float a = f2;
        FeatureSupport_426 a2 = this;
return new ProtocolSupport_212(9, 75.6f);
    }

    private ProtocolSupport_212 d(PlacementResult class_027) {
        PlacementResult a22 = class_027;
        FeatureSupport_426 a = this;
float a22 = (float)(Math.floor(a22.L().L() / 90.0f) * 90.0);
        return new ProtocolSupport_212(45.0f, 75.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public PlacementResult L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513, ItemStack itemStack) {
        void a;
        void a2;
        boolean a222 = bl;
        FeatureSupport_426 a3 = this;
BlockPlacementContext a222 = new BlockPlacementContext(new InteractionSupport_010(InteractionMode_025.d.L(), BlockPlacementContext.L((Vec3)a2)), new InteractionSupport_013(InteractionSupport_012.e), (ItemStack)a, new InteractionSupport_017((Vec3)a2, a222));
        return InteractionSupport_019.L(Scaffold.E.L(UtilitySupport_495.L((Vec3)a2)), a222);
    }

    @Override
    public ProtocolSupport_212 L(PlacementResult class_027) {
        PlacementResult a22 = class_027;
        FeatureSupport_426 a = this;
if (Scaffold.E.L().equals(MovementInputState.i)) {
            if (a22 == null) {
                return null;
            }
            return a.d(a22);
        }
        float a22 = (float)(Math.rint((UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_426.e)).thePlayer, Scaffold.E.L()) + 180.0f) / 45.0f) * 45.0);
        int n = 0.0f == 0.0f ? 1 : 0;
        FeatureSupport_426 class_426 = a;
        if (0 != 0) {
            return class_426.d(0);
        }
        return class_426.L(0);
    }
}

