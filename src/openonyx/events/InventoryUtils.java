/*
 * Decompiled with CFR.
 */
package openonyx.events;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import openonyx.core.OnyxListener_001;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class InventoryUtils {
    final public static int h = 9;
    final public static int l = 45;
    final public static int I = 1;
    final public static int d = 2;
    final public static int i = 36;
    final public static int f = 4;
    final public static int H = 5;
    final public static int e = 9;

    /*
     * WARNING - void declaration
     */
    private static void L(int n, int n2, int n3) {
        void a;
        void a2;
        int n4 = 0;
Container a3 = InventoryUtils.L();
        if (a3 == null) {
            return;
        }
        OnyxListener_001.e.playerController.windowClick(a3.windowId, n4, (int)a2, (int)a, OnyxListener_001.e.thePlayer);
    }

    public static double i(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || itemStack2.getItem() == null) {
            return Double.NEGATIVE_INFINITY;
        }
        Item a = itemStack2.getItem();
        double d = a instanceof ItemSword ? (double)((ItemSword)a).getDamageVsEntity() : 1.0;
        d += (double)InventoryUtils.L(itemStack2, Enchantment.sharpness) * 1.25;
        d += (double)InventoryUtils.L(itemStack2, Enchantment.fireAspect) * 0.3;
        d += (double)InventoryUtils.L(itemStack2, Enchantment.knockback) * 0.15;
        return d += (double)InventoryUtils.L(itemStack2, Enchantment.unbreaking) * 0.1;
    }

    public static ItemStack L(int n) {
        int n2 = 0;
Container a = InventoryUtils.L();
        if (a == null || n2 < 0 || n2 >= a.inventorySlots.size()) {
            return null;
        }
        return a.getSlot(n2).getStack();
    }

    public static Container L() {
return OnyxListener_001.e.thePlayer.inventoryContainer;
    }

    private static int L(ItemStack itemStack, Enchantment enchantment) {
        Enchantment a = enchantment;
        ItemStack a2 = itemStack;
return EnchantmentHelper.getEnchantmentLevel(a.effectId, a2);
    }

    public static void d(int a) {
InventoryUtils.L(0, 0, 1);
    }

    public static double D(ItemStack itemStack) {
        Object a;
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || !((a = itemStack2.getItem()) instanceof ItemArmor)) {
            return Double.NEGATIVE_INFINITY;
        }
        ItemArmor itemArmor = (ItemArmor)a;
        return InventoryUtils.L(itemStack2, itemArmor);
    }

    public static int L(ItemStack itemStack) {
        Object a;
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || !((a = itemStack2.getItem()) instanceof ItemArmor)) {
            return -1;
        }
        ItemArmor itemArmor = (ItemArmor)a;
        return itemArmor.armorType;
    }

    private InventoryUtils() {
        InventoryUtils a;
    }

    public static void L(int a) {
InventoryUtils.L(0, 1, 4);
    }

    private static double L(ItemStack itemStack, ItemArmor itemArmor) {
        ItemArmor a = itemArmor;
        ItemStack a2 = itemStack;
return (double)a.damageReduceAmount + (double)InventoryUtils.L(a2, Enchantment.protection) * 1.25 + (double)InventoryUtils.L(a2, Enchantment.blastProtection) * 0.15 + (double)InventoryUtils.L(a2, Enchantment.fireProtection) * 0.15 + (double)InventoryUtils.L(a2, Enchantment.projectileProtection) * 0.15 + (double)InventoryUtils.L(a2, Enchantment.thorns) * 0.1 + (double)InventoryUtils.L(a2, Enchantment.unbreaking) * 0.1;
    }

    public static void L(int n, int n2) {
        int a = n2;
        int a2 = 0;
InventoryUtils.L(a2, 0, 2);
    }

    public static double d(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || itemStack2.getItem() == null) {
            return Double.NEGATIVE_INFINITY;
        }
        Item a = itemStack2.getItem();
        if (a instanceof ItemArmor) {
            ItemArmor itemArmor = (ItemArmor)a;
            return InventoryUtils.L(itemStack2, itemArmor);
        }
        if (a instanceof ItemSword) {
            return InventoryUtils.i(itemStack2);
        }
        if (a instanceof ItemTool) {
            return InventoryUtils.L(itemStack2);
        }
        if (a instanceof ItemBlock) {
            return itemStack2.stackSize;
        }
        return itemStack2.stackSize;
    }

    public static int L(int a) {
return 5;
    }

    public static double L(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || itemStack2.getItem() == null) {
            return Double.NEGATIVE_INFINITY;
        }
        Item a = itemStack2.getItem();
        double d = a instanceof ItemTool ? (double)((ItemTool)a).getToolMaterial().getEfficiencyOnProperMaterial() : 1.0;
        d += (double)InventoryUtils.L(itemStack2, Enchantment.fortune) * 1.25;
        d += (double)InventoryUtils.L(itemStack2, Enchantment.efficiency) * 0.5;
        return d += (double)InventoryUtils.L(itemStack2, Enchantment.unbreaking) * 0.3;
    }
}

