/*
 * Decompiled with CFR.
 */
package openonyx.interaction;

import java.util.function.BooleanSupplier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import openonyx.core.OnyxListener_001;
import openonyx.interaction.SwingMode;
import openonyx.utilities.UtilitySupport_497;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockUtils
implements OnyxListener_001 {
    final public static AxisAlignedBB e = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);

    public static boolean L(MovingObjectPosition movingObjectPosition) {
        MovingObjectPosition movingObjectPosition2 = movingObjectPosition;
ItemStack a = ((Minecraft)((Object)BlockUtils.e)).thePlayer.inventory.getStackInSlot(UtilitySupport_497.e.L());
        int n = a == null ? 0 : a.stackSize;
        MovingObjectPosition movingObjectPosition3 = movingObjectPosition2;
        if (!((Minecraft)((Object)BlockUtils.e)).playerController.onPlayerRightClick(((Minecraft)((Object)BlockUtils.e)).thePlayer, ((Minecraft)((Object)BlockUtils.e)).theWorld, a, movingObjectPosition2.getBlockPos(), movingObjectPosition3.sideHit, movingObjectPosition3.hitVec)) {
            return 3 >> 2;
        }
        if (a != null && a.stackSize == 0) {
            ((Minecraft)((Object)BlockUtils.e)).thePlayer.inventory.mainInventory[UtilitySupport_497.e.L()] = null;
        } else if (a != null && (a.stackSize != n || ((Minecraft)((Object)BlockUtils.e)).playerController.isInCreativeMode())) {
            ((Minecraft)((Object)BlockUtils.e)).entityRenderer.itemRenderer.resetEquippedProgress();
        }
        return true;
    }

    public static AxisAlignedBB L(IBlockState iBlockState, BlockPos blockPos) {
        AxisAlignedBB a;
        IBlockState iBlockState2 = iBlockState;
Block a2 = iBlockState2.getBlock();
        a2.setBlockBoundsBasedOnState(((Minecraft)((Object)BlockUtils.e)).theWorld, (BlockPos)((Object)a));
        a = new AxisAlignedBB(a2.getBlockBoundsMinX(), a2.getBlockBoundsMinY(), a2.getBlockBoundsMinZ(), a2.getBlockBoundsMaxX(), a2.getBlockBoundsMaxY(), a2.getBlockBoundsMaxZ());
        boolean bl = a2 = a.getXsize() <= 0.0 || a.getYsize() <= 0.0 || a.getZsize() <= 0.0;
        if (a2) {
            return e;
        }
        return a;
    }

    public static BlockPos L(MovingObjectPosition a) {
return a.getBlockPos().offset(a.sideHit);
    }

    public static Block L(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
IBlockState a = BlockUtils.L(blockPos2);
        if (a == null) {
            return null;
        }
        return a.getBlock();
    }

    public static boolean d(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
Block a = BlockUtils.L(blockPos2);
        return a == null || a.getMaterial() == Material.air;
    }

    public static IBlockState d(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
IBlockState a = BlockUtils.L(blockPos2);
        if (a != null) {
            return a;
        }
        return Blocks.air.getDefaultState();
    }

    public BlockUtils() {
        BlockUtils a;
    }

    public static void L(MovingObjectPosition a) {
BlockUtils.L(a, () -> {
return 5 >> 2;
        }, () -> {
return 1 != 0;
        }, SwingMode.H);
    }

    public static boolean L(IBlockState iBlockState, BlockPos blockPos, ItemStack itemStack) {
        BlockPos a = blockPos;
        IBlockState a2 = iBlockState;
return a2.getBlock().isReplaceable(((Minecraft)((Object)BlockUtils.e)).theWorld, a);
    }

    public static IBlockState L(BlockPos a) {
if (((Minecraft)((Object)BlockUtils.e)).theWorld == null) {
            return null;
        }
        return ((Minecraft)((Object)BlockUtils.e)).theWorld.getBlockState(a);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(MovingObjectPosition movingObjectPosition, BooleanSupplier booleanSupplier, BooleanSupplier booleanSupplier2, SwingMode enum_007) {
        void a;
        MovingObjectPosition movingObjectPosition2 = movingObjectPosition;
ItemStack a2 = ((Minecraft)((Object)BlockUtils.e)).thePlayer.inventory.getStackInSlot(UtilitySupport_497.e.L());
        int n = a2 == null ? 0 : a2.stackSize;
        MovingObjectPosition movingObjectPosition3 = movingObjectPosition2;
        if (((Minecraft)((Object)BlockUtils.e)).playerController.onPlayerRightClick(((Minecraft)((Object)BlockUtils.e)).thePlayer, ((Minecraft)((Object)BlockUtils.e)).theWorld, a2, movingObjectPosition2.getBlockPos(), movingObjectPosition3.sideHit, movingObjectPosition3.hitVec)) {
            void a3;
            if (a3.getAsBoolean()) {
                a.L();
            }
            if (a2 != null && a2.stackSize == 0) {
                ((Minecraft)((Object)BlockUtils.e)).thePlayer.inventory.mainInventory[UtilitySupport_497.e.L()] = null;
                return;
            }
            if (a2 != null && (a2.stackSize != n || ((Minecraft)((Object)BlockUtils.e)).playerController.isInCreativeMode())) {
                ((Minecraft)((Object)BlockUtils.e)).entityRenderer.itemRenderer.resetEquippedProgress();
            }
            return;
        }
        if (a2 == null) {
            return;
        }
        if (((Minecraft)((Object)BlockUtils.e)).playerController.sendUseItem(((Minecraft)((Object)BlockUtils.e)).thePlayer, ((Minecraft)((Object)BlockUtils.e)).theWorld, a2)) {
            void a4;
            if (a4.getAsBoolean()) {
                a.L();
            }
            ((Minecraft)((Object)BlockUtils.e)).entityRenderer.itemRenderer.resetEquippedProgress2();
        }
    }

    public static AxisAlignedBB L(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
IBlockState a = BlockUtils.L(blockPos2);
        if (a == null || a.getBlock().getMaterial() == Material.air) {
            return e;
        }
        return BlockUtils.L(a, blockPos2);
    }

    public static boolean L(Block a) {
return a instanceof BlockSlab || a instanceof BlockStairs;
    }

    public static boolean L(BlockPos a) {
if (BlockUtils.L(a) != null && World.doesBlockHaveSolidTopSurface(((Minecraft)((Object)BlockUtils.e)).theWorld, a)) {
            return 5 >> 2;
        }
        return false;
    }
}

