/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import openonyx.core.OnyxListener_001;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockItemUtils
implements OnyxListener_001 {
    public static Block L(ItemStack itemStack) {
        Object a;
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || !((a = itemStack2.getItem()) instanceof ItemBlock)) {
            return null;
        }
        ItemBlock itemBlock = (ItemBlock)a;
        return itemBlock.getBlock();
    }

    public BlockItemUtils() {
        BlockItemUtils a;
    }

    public static boolean L(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
Block a = BlockItemUtils.L(itemStack2);
        if (a == null) {
            return 5 >> 3;
        }
        return a.isFullCube();
    }
}

