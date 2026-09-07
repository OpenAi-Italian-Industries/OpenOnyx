/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.EventSupport_619;
import openonyx.events.HypixelUtils;
import openonyx.events.FileDialogUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.player.FeatureMode_410;
import openonyx.features.player.FeatureMode_411;
import openonyx.features.player.FeatureMode_416;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.utilities.Timer;

public class Deposit
extends Module {
    private final static int D = 27;
    private transient int c;
    public BooleanSetting a;
    private transient EnumFacing k;
    private final transient Timer g;
    private final static int M = 40;
    private transient FeatureMode_410 L;
    private final static int j = 1;
    private transient BlockPos m;
    private final static int h = 9;
    public MultiSelectSetting<FeatureMode_416> l;
    final public static Deposit I = new Deposit();
    private transient int d;
    private transient long i;
    public RangeSetting f;
    public EnumSetting<FeatureMode_411> H;
    private transient Vec3 e;

    @EventHandler
    private void L(EventSupport_619 class_619) {
        EventSupport_619 a = class_619;
        Deposit a2 = this;
if (((Minecraft)((Object)Deposit.e)).thePlayer == null || ((Minecraft)((Object)Deposit.e)).theWorld == null) {
            a2.h();
            return;
        }
        switch (a2.L.ordinal()) {
            case 1: {
                while (false) {
                }
                a2.F();
                return;
            }
            case 2: {
                a2.l();
                return;
            }
        }
    }

    @Override
    protected void D() {
        Deposit a;
a.h();
    }

    private void F() {
        Deposit a;
if (a.L() != null) {
            a.d = a.H.L(FeatureMode_411.f) ? ((Minecraft)((Object)Deposit.e)).thePlayer.inventory.currentItem : 0;
            a.i = 0L;
            a.g.L();
            a.L = FeatureMode_410.f;
            return;
        }
        if ((a.c += 1) >= 40) {
            a.h();
        }
    }

    private void l() {
        Deposit class_414 = this;
ContainerChest containerChest = class_414.L();
        if (containerChest == null) {
            class_414.h();
            return;
        }
        Deposit class_4142 = class_414;
        if (!class_4142.g.L(class_4142.i)) {
            return;
        }
        int a = class_414.L();
        if (0 < 0) {
            ((Minecraft)((Object)Deposit.e)).thePlayer.closeScreen();
            class_414.h();
            return;
        }
        ((Minecraft)((Object)Deposit.e)).playerController.windowClick(containerChest.windowId, class_414.L(containerChest, 0), 0, 1, ((Minecraft)((Object)Deposit.e)).thePlayer);
        class_414.d = class_414.H.L(FeatureMode_411.f) ? 9 : 1;
        Deposit class_4143 = class_414;
        class_4143.i = (long)class_4143.f.D();
        class_4143.g.L();
    }

    private boolean L(BlockPos blockPos) {
        Object a = blockPos;
        Deposit a2 = this;
a = ((Minecraft)((Object)Deposit.e)).theWorld.getBlockState((BlockPos)a).getBlock();
        return a instanceof BlockChest || a instanceof BlockEnderChest;
    }

    private boolean L(ItemStack itemStack) {
        Object a = itemStack;
        Deposit a2 = this;
a = ((ItemStack)a).getItem();
        if (a == Items.iron_ingot) {
            return a2.l.L(FeatureMode_416.i);
        }
        if (a == Items.gold_ingot) {
            return a2.l.L(FeatureMode_416.f);
        }
        if (a == Items.diamond) {
            return a2.l.L(FeatureMode_416.l);
        }
        if (a == Items.emerald) {
            return a2.l.L(FeatureMode_416.H);
        }
        if (a instanceof ItemBlock) {
            return a2.l.L(FeatureMode_416.d);
        }
        return a2.l.L(FeatureMode_416.h);
    }

    private ContainerChest L() {
        Deposit class_414 = this;
if (!(((Minecraft)((Object)Deposit.e)).currentScreen instanceof GuiChest)) {
            return null;
        }
        Container a = ((Minecraft)((Object)Deposit.e)).thePlayer.openContainer;
        if (a instanceof ContainerChest) {
            return (ContainerChest)a;
        }
        return null;
    }

    private void h() {
        Deposit a;
Deposit class_414 = a;
        Deposit class_4142 = a;
        Deposit class_4143 = a;
        a.L = FeatureMode_410.i;
        class_4143.m = null;
        class_4143.k = null;
        class_4142.e = null;
        class_414.d = class_4142.c = 0;
        class_414.i = 0L;
    }

    private int L() {
        int a;
        Deposit class_414 = this;
int n = a = class_414.d;
        while (n < 9) {
            ItemStack itemStack = ((Minecraft)((Object)Deposit.e)).thePlayer.inventory.getStackInSlot(0);
            if (class_414.H.L(FeatureMode_411.f)) {
                if (itemStack == null) {
                    return -1;
                }
                return 0;
            }
            if (itemStack != null && class_414.L(itemStack)) {
                return 0;
            }
            n = ++a;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private int L(ContainerChest containerChest, int n) {
        void a;
        int a2 = 0;
        Deposit a3 = this;
return a.getLowerChestInventory().getSizeInventory() / 9 * 9 + 27 + 0;
    }

    private Deposit() {
        super("Deposit", "Scroll at a chest to put your items in it", ModuleCategory.i);
        Deposit a2;
        Deposit class_414 = a2;
        a2.H = new EnumSetting<FeatureMode_411>("Mode", FeatureMode_411.f).L("What a scroll at a chest sends over - just what you are holding, or a sweep of the hotbar");
        Enum[] enumArray = new FeatureMode_416[4];
        enumArray[0] = FeatureMode_416.i;
        enumArray[1] = FeatureMode_416.f;
        enumArray[2] = FeatureMode_416.l;
        enumArray[3] = FeatureMode_416.H;
        class_414.l = ((MultiSelectSetting)new MultiSelectSetting("Items", FeatureMode_416.class, enumArray).L(0 != 0).L("Which of the hotbar a sweep picks up - the rest stays on you")).L(a2.H, a -> {
if (a == FeatureMode_411.H) {
                return 1 != 0;
            }
            return false;
        });
        Deposit class_4142 = a2;
        Deposit class_4143 = a2;
        class_4143.a = new BooleanSetting("Hypixel only", 1 != 0).L("Leaves the scroll wheel alone on every other server");
        class_4142.f = RangeSetting.L("Delay", 50, 100, 0, 500).L(" ms").d("Spacing between the individual shift clicks");
        class_4143.L = FeatureMode_410.i;
        class_4142.g = new Timer();
    }

    public boolean L(int n) {
        int a22 = n;
        Deposit a = this;
if (0 == 0 || !a.d() || a.L != FeatureMode_410.i) {
            return false;
        }
        if (((Minecraft)((Object)Deposit.e)).thePlayer == null || ((Minecraft)((Object)Deposit.e)).theWorld == null || ((Minecraft)((Object)Deposit.e)).currentScreen != null) {
            return false;
        }
        if (a.a.d() && !HypixelUtils.d()) {
            return 0 != 0;
        }
        MovingObjectPosition a22 = ((Minecraft)((Object)Deposit.e)).objectMouseOver;
        if (a22 == null || a22.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
            return false;
        }
        if (!a.L(a22.getBlockPos())) {
            return 5 >> 3;
        }
        if (a.H.L(FeatureMode_411.f) && ((Minecraft)((Object)Deposit.e)).thePlayer.getHeldItem() == null) {
            return 0 != 0;
        }
        Deposit class_414 = a;
        MovingObjectPosition movingObjectPosition = a22;
        a.m = a22.getBlockPos();
        a.k = movingObjectPosition.sideHit;
        class_414.e = movingObjectPosition.hitVec;
        class_414.c = 0;
        a.L = FeatureMode_410.H;
        Deposit class_4142 = a;
        ((Minecraft)((Object)Deposit.e)).playerController.onPlayerRightClick(((Minecraft)((Object)Deposit.e)).thePlayer, ((Minecraft)((Object)Deposit.e)).theWorld, ((Minecraft)((Object)Deposit.e)).thePlayer.getHeldItem(), class_4142.m, class_4142.k, a.e);
        return --1 != 0;
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Deposit a2 = this;
a2.h();
    }
}

