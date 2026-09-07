/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player;

import java.util.Locale;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.BlockChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import openonyx.configuration.internal.TickEvent;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.input.InputSupport_002;
import openonyx.ui.UiSupport_546;

public class ChestStealer
extends Module {
    public BooleanSetting I;
    private final static int d = 5;
    public NumberSetting i;
    public BooleanSetting f;
    private transient int H;
    public BooleanSetting e;

    @Override
    protected void D() {
a.H = 0;
    }

    private static String i() {
String string = "container.chest";
        String string2 = I18n.format(string, new Object[0]);
        return (string.equals(string2) ? "chest" : string2).toLowerCase(Locale.ROOT);
    }

    private boolean d(ContainerChest containerChest) {
        ContainerChest a = containerChest;
        ChestStealer a2 = this;
if (!a2.I.d()) {
            return 1 != 0;
        }
        if (ChestStealer.L(a) && a2.I()) {
            return --1 != 0;
        }
        return false;
    }

    @EventHandler
    private void L(TickEvent class_618) {
        Object a = class_618;
        ChestStealer a2 = this;
a = a2.L();
        if (a == null || !a2.d((ContainerChest)a)) {
            a2.H = 0;
            return;
        }
        int n = a2.L((ContainerChest)a);
        if (0 < 0) {
            a2.H = 0;
            if (a2.f.d()) {
                ((Minecraft)((Object)ChestStealer.e)).thePlayer.closeScreen();
            }
            return;
        }
        int n2 = a2.H;
        a2.H = n2 + 1;
        if (n2 < a2.i.d()) {
            return;
        }
        ((Minecraft)((Object)ChestStealer.e)).playerController.windowClick(((ContainerChest)a).windowId, 0, 0, 1, ((Minecraft)((Object)ChestStealer.e)).thePlayer);
        a2.H = 0;
    }

    public ChestStealer() {
        super("ChestStealer", "Takes the useful items out of a chest", ModuleCategory.i);
        ChestStealer a;
        ChestStealer class_407 = a;
        a.i = new NumberSetting("Delay", 1.0, 0.0, 10.0, 1.0).d("t").L("Ticks between clicks");
        class_407.e = new BooleanSetting("Filter", 1 != 0).L("Leaves behind anything InventoryManager calls junk");
        a.f = new BooleanSetting("Close", 1 != 0).L("Closes the chest once there is nothing left worth taking");
        a.I = new BooleanSetting("Anti GUI", 1 != 0).L("Only steal from a real chest. A shop, kit or menu is a chest window like any other, and clicking through one buys it out.");
    }

    private ContainerChest L() {
        ChestStealer class_407 = this;
if (((Minecraft)((Object)ChestStealer.e)).thePlayer == null || !(((Minecraft)((Object)ChestStealer.e)).currentScreen instanceof GuiChest)) {
            return null;
        }
        Container a = ((Minecraft)((Object)ChestStealer.e)).thePlayer.openContainer;
        if (a instanceof ContainerChest) {
            return (ContainerChest)a;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private int L(ContainerChest containerChest) {
        int a;
        void a2;
        ChestStealer class_407 = this;
int n = a2.getLowerChestInventory().getSizeInventory();
        int n2 = 0;
        while (n2 < 0) {
            ItemStack itemStack = a2.getSlot(0).getStack();
            if (itemStack != null && itemStack.getItem() != null && !class_407.L(itemStack)) {
                return 0;
            }
            n2 = ++a;
        }
        return -1;
    }

    private static boolean L(ContainerChest containerChest) {
        ContainerChest containerChest2 = containerChest;
Object a = containerChest2.getLowerChestInventory().getDisplayName();
        if (a == null) {
            return 3 >> 2;
        }
        if ((a = EnumChatFormatting.getTextWithoutFormattingCodes(a.getUnformattedText())) == null) {
            return 0 != 0;
        }
        return ((String)a).toLowerCase(Locale.ROOT).contains(ChestStealer.i());
    }

    private boolean L(ItemStack itemStack) {
        ItemStack a = itemStack;
        ChestStealer a2 = this;
if (a2.e.d() && OnyxClient.l.la.L(a)) {
            return --1 != 0;
        }
        return false;
    }

    private boolean I() {
        int n;
        ChestStealer class_407 = this;
if (((Minecraft)((Object)ChestStealer.e)).theWorld == null) {
            return 0 != 0;
        }
        BlockPos blockPos = new BlockPos(((Minecraft)((Object)ChestStealer.e)).thePlayer);
        int n2 = -5;
        while (n2 <= 5) {
            int n3 = -5;
            while (n3 <= 5) {
                int a;
                int n4 = -5;
                while (n4 <= 5) {
                    int n5;
                    if (((Minecraft)((Object)ChestStealer.e)).theWorld.getBlockState(blockPos.add(-5, 0, n5)).getBlock() instanceof BlockChest) {
                        return 1 != 0;
                    }
                    n4 = ++n5;
                }
                n3 = ++a;
            }
            n2 = ++n;
        }
        return false;
    }
}

