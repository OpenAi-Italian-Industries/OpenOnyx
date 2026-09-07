/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal;

import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFalling;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import openonyx.core.OnyxListener_001;
import openonyx.utilities.BlockItemUtils;

public final class FeatureSupport_420
implements OnyxListener_001 {
    private final static Set<Block> H = Set.of(Blocks.tnt, Blocks.web, Blocks.portal);
    private final static Set<Block> e = Set.of(Blocks.crafting_table, Blocks.enchanting_table, Blocks.cauldron);

    public static boolean d(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null) {
            return 0 != 0;
        }
        Block a = BlockItemUtils.L(itemStack2);
        if (a == null) {
            return 0 != 0;
        }
        if (!a.getMaterial().isSolid() || !a.isFullCube()) {
            return false;
        }
        if (a instanceof BlockFalling) {
            return 3 >> 2;
        }
        if (!H.contains(a)) {
            return 1 != 0;
        }
        return false;
    }

    private FeatureSupport_420() {
        FeatureSupport_420 a;
    }

    public static boolean L(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
Block a = BlockItemUtils.L(itemStack2);
        if (a == null) {
            return 1 != 0;
        }
        if (a.slipperiness > 0.6f) {
            return --1 != 0;
        }
        if (a instanceof BlockContainer) {
            return 1 != 0;
        }
        if (!a.isFullCube()) {
            return 1 != 0;
        }
        return e.contains(a);
    }
}

