/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.item.ItemStack;
import openonyx.configuration.internal.TickEvent;
import openonyx.events.InventoryUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.history.internal.ActionSetting;
import openonyx.history.internal.ItemListSetting;
import openonyx.history.internal.ItemMappingSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.ui.UiSupport_547;
import openonyx.utilities.UtilitySupport_489;

public class InventoryManager
extends Module {
    private transient int m;
    public BooleanSetting h;
    public ItemListSetting l;
    public ItemMappingSetting I;
    public ItemListSetting d;
    private final static int i = 4;
    public NumberSetting f;
    public ActionSetting H;
    public BooleanSetting e;

    @EventHandler
    private void L(TickEvent class_618) {
        TickEvent a = class_618;
        InventoryManager a2 = this;
if (((Minecraft)((Object)InventoryManager.e)).thePlayer == null || !(((Minecraft)((Object)InventoryManager.e)).currentScreen instanceof GuiInventory) || ((Minecraft)((Object)InventoryManager.e)).thePlayer.openContainer != ((Minecraft)((Object)InventoryManager.e)).thePlayer.inventoryContainer) {
            a2.m = 0;
            return;
        }
        int n = a2.m;
        a2.m = n + 1;
        if (n < a2.f.d()) {
            return;
        }
        if (a2.I() || a2.l() || a2.h()) {
            a2.m = 0;
        }
    }

    public InventoryManager() {
        super("InventoryManager", "Sorts your inventory the way you laid it out", ModuleCategory.i);
        InventoryManager a;
        InventoryManager class_415 = a;
        class_415.H = new ActionSetting("Edit rules", () -> {
((Minecraft)((Object)e)).displayGuiScreen(new UiSupport_547(((Minecraft)((Object)InventoryManager.e)).currentScreen));
        }).L("Drag items onto the slots they belong in");
        InventoryManager class_4152 = a;
        class_4152.f = new NumberSetting("Delay", 1.0, 0.0, 10.0, 1.0).d("t").L("Ticks between clicks");
        class_4152.h = new BooleanSetting("Manage armor", 1 != 0).L("Wears the best piece you are carrying in each armour slot");
        class_4152.e = new BooleanSetting("Drop junk", 1 != 0).L("Throws away anything on the Drop list that the Keep list does not rescue");
        Object[] objectArray = new Object[18];
        int n = 0;
        objectArray[n] = n;
        objectArray[1] = "@SWORD";
        objectArray[2] = 1;
        objectArray[3] = "minecraft:golden_apple";
        objectArray[4] = 2;
        objectArray[5] = "@AXE";
        objectArray[6] = 3;
        objectArray[7] = "@PICKAXE";
        objectArray[8] = 4;
        objectArray[9] = "@BLOCK";
        objectArray[10] = 5;
        objectArray[11] = "@BLOCK";
        objectArray[12] = 6;
        objectArray[13] = "@BLOCK";
        objectArray[14] = 7;
        objectArray[15] = "@BLOCK";
        objectArray[16] = 8;
        objectArray[17] = "@BLOCK";
        class_4152.I = new ItemMappingSetting("Slots", ItemMappingSetting.L(objectArray));
        a.l = new ItemListSetting("Keep", new String[0]);
        String[] stringArray = new String[20];
        stringArray[0] = "minecraft:snowball";
        stringArray[1] = "minecraft:egg";
        stringArray[2] = "minecraft:experience_bottle";
        stringArray[3] = "minecraft:flint";
        stringArray[4] = "minecraft:flint_and_steel";
        stringArray[5] = "minecraft:lava_bucket";
        stringArray[6] = "minecraft:string";
        stringArray[7] = "minecraft:chest";
        stringArray[8] = "minecraft:trapped_chest";
        stringArray[9] = "minecraft:ender_chest";
        stringArray[10] = "@HOE";
        stringArray[11] = "@BAD_POTION";
        stringArray[12] = "~anvil";
        stringArray[13] = "~tnt";
        stringArray[14] = "~seed";
        stringArray[15] = "~table";
        stringArray[16] = "~eye";
        stringArray[17] = "~mushroom";
        stringArray[18] = "~skull";
        stringArray[19] = "~pressure_plate";
        a.d = new ItemListSetting("Drop", stringArray);
    }

    private boolean d(ItemStack itemStack) {
        ItemStack a = itemStack;
        InventoryManager a2 = this;
if (a2.d.L(a) && !a2.l.L(a) && a2.I.L(a) < 0) {
            return 3 >> 1;
        }
        return false;
    }

    @Override
    protected void D() {
a.m = 0;
    }

    private boolean l() {
        int a;
        InventoryManager class_415 = this;
boolean[] blArray = new boolean[45];
        int n = 0;
        while (n < 9) {
            if (!class_415.I.L(0).isEmpty()) {
                int n2 = 36;
                int n3 = -1;
                double d = Double.NEGATIVE_INFINITY;
                int n4 = 9;
                while (n4 < 45) {
                    ItemStack itemStack;
                    int n5;
                    if (!blArray[n5] && (itemStack = InventoryUtils.L(n5)) != null && class_415.I.L(0, itemStack)) {
                        double d2;
                        double d3 = InventoryUtils.d(itemStack);
                        if (!(d2 <= d)) {
                            d = 0.0;
                            n3 = n5;
                        }
                    }
                    n4 = ++n5;
                }
                if (n3 >= 0) {
                    blArray[n3] = 1;
                    if (n3 != n2) {
                        InventoryUtils.L(n3, 0);
                        return 1 != 0;
                    }
                }
            }
            n = ++a;
        }
        return false;
    }

    private boolean h() {
        int a;
        InventoryManager class_415 = this;
if (!class_415.e.d()) {
            return 0 != 0;
        }
        int n = 9;
        while (n < 45) {
            ItemStack itemStack = InventoryUtils.L(9);
            if (itemStack != null && class_415.d(itemStack)) {
                InventoryUtils.L(9);
                return --1 != 0;
            }
            n = ++a;
        }
        return false;
    }

    public boolean L(ItemStack itemStack) {
        int n;
        ItemStack a = itemStack;
        InventoryManager a2 = this;
if (a == null || a.getItem() == null) {
            return false;
        }
        if (a2.l.L(a)) {
            return 3 >> 2;
        }
        if (a2.d.L(a)) {
            return 1 != 0;
        }
        if (!a2.d() || ((Minecraft)((Object)InventoryManager.e)).thePlayer == null) {
            return false;
        }
        int n2 = InventoryUtils.L(a);
        if (n2 >= 0) {
            if (!a2.h.d()) {
                return 5 >> 3;
            }
            ItemStack itemStack2 = InventoryUtils.L(InventoryUtils.L(n2));
            if (itemStack2 != null && InventoryUtils.D(a) <= InventoryUtils.D(itemStack2)) {
                return 1 != 0;
            }
            return false;
        }
        if (a2.I.L(a) < 0) {
            return 5 >> 3;
        }
        int n3 = 0;
        while (n3 < 9) {
            ItemStack itemStack3;
            if (a2.I.L(0, a) && ((itemStack3 = InventoryUtils.L(36)) == null || !a2.I.L(0, itemStack3) || InventoryUtils.d(a) > InventoryUtils.d(itemStack3))) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    private boolean I() {
        int n;
        InventoryManager class_415 = this;
if (!class_415.h.d()) {
            return 3 >> 2;
        }
        int n2 = 0;
        while (n2 < 4) {
            int n3 = InventoryUtils.L(0);
            ItemStack itemStack = InventoryUtils.L(n3);
            double d = itemStack == null ? Double.NEGATIVE_INFINITY : InventoryUtils.D(itemStack);
            int a = -1;
            int n4 = 9;
            while (n4 < 45) {
                int n5;
                ItemStack itemStack2 = InventoryUtils.L(n5);
                if (InventoryUtils.L(itemStack2) == 0 && !class_415.d(itemStack2)) {
                    double d2;
                    double d3 = InventoryUtils.D(itemStack2);
                    if (!(d2 <= d)) {
                        d = 0.0;
                        a = n5;
                    }
                }
                n4 = ++n5;
            }
            if (9 >= 0) {
                if (itemStack == null) {
                    InventoryUtils.d(9);
                } else {
                    InventoryUtils.L(n3);
                }
                return true;
            }
            n2 = ++n;
        }
        return false;
    }
}

