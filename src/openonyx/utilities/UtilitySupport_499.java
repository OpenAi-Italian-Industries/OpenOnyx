/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.Comparator;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.internal.FeatureSupport_420;
import openonyx.utilities.UtilitySupport_480;

public final class UtilitySupport_499
implements OnyxListener_001 {
    final public static Comparator<ItemStack> m;
    private final static double h = 0.8;
    private final static double l = 1.7;
    final public static Comparator<ItemStack> I;
    final public static Comparator<ItemStack> d;
    final public static Comparator<ItemStack> i;
    final public static Comparator<ItemStack> f;
    final public static Comparator<ItemStack> H;
    private final static double e = 2.0;

    static {
        i = (itemStack, itemStack2) -> {
            ItemStack itemStack3;
            boolean bl;
            ItemStack a = itemStack2;
            ItemStack a2 = itemStack;
if (!FeatureSupport_420.L(a2)) {
                bl = 5 >> 2;
                itemStack3 = a;
            } else {
                bl = false;
                itemStack3 = a;
            }
            return Boolean.compare(bl, (!FeatureSupport_420.L(itemStack3) ? 1 : 0) != 0);
        };
        d = (itemStack, itemStack2) -> {
            ItemStack a = itemStack2;
            ItemStack a2 = itemStack;
return Boolean.compare(UtilitySupport_499.L(a2).isNormalCube(), UtilitySupport_499.L(a).isNormalCube());
        };
        f = (itemStack, itemStack2) -> {
            ItemStack a = itemStack2;
            ItemStack a2 = itemStack;
return Boolean.compare(UtilitySupport_499.L(a2).isFullCube(), UtilitySupport_499.L(a).isFullCube());
        };
        m = new UtilitySupport_480();
        H = Comparator.comparingInt(a -> {
return a.stackSize;
        });
        I = H.reversed();
    }

    private static Block L(ItemStack a) {
return ((ItemBlock)a.getItem()).getBlock();
    }

    private UtilitySupport_499() {
        UtilitySupport_499 a;
    }

    /*
     * WARNING - void declaration
     */
    private static double L(ItemStack itemStack, boolean bl) {
        void a;
        ItemStack itemStack2 = itemStack;
float a2 = UtilitySupport_499.L(itemStack2).getBlockHardness(UtilitySupport_499.e.theWorld, BlockPos.ORIGIN);
        if (a != false && 0.0 >= 0.8 && 0.0 <= 2.0) {
            return 0.0;
        }
        return Math.abs(1.7);
    }

    public static Comparator<ItemStack> L(boolean a) {
return (itemStack, itemStack2) -> {
            void a;
            ItemStack a2 = itemStack2;
            boolean a3 = a;
return Double.compare(UtilitySupport_499.L(a2, a3), UtilitySupport_499.L((ItemStack)a, a3));
        };
    }
}

