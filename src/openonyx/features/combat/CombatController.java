/*
 * Decompiled with CFR.
 */
package openonyx.features.combat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import openonyx.configuration.internal.PacketEvent;
import openonyx.core.OnyxListener_001;
import openonyx.utilities.Timer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CombatController
implements OnyxListener_001 {
    private volatile boolean C = 1;
    private final Timer J;
    private boolean D;
    private boolean c;
    private boolean a;
    private EntityLivingBase k;
    private boolean g;
    private boolean M;
    private boolean L;
    private boolean j;
    private boolean m;
    private boolean h;
    private final static long l = 329L;
    private volatile int I;
    private boolean d;
    private int i;
    private final static int f = 2;
    private boolean H;
    private final List<Packet> e;

    /*
     * Enabled aggressive block sorting
     */
    public void e() {
        CombatController a;
if (!a.h) {
            return;
        }
        switch (a.i) {
            case 7: {
                a.L();
                a.i = 10;
                return;
            }
            case 8: {
                CombatController class_393 = a;
                class_393.L();
                class_393.d();
                class_393.I();
                a.i = 9;
                return;
            }
            case 11: {
                CombatController class_393 = a;
                class_393.d();
                class_393.I();
                a.i = 0;
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(PacketEvent class_623) {
        void a;
        CombatController class_393 = this;
if (class_393.D) {
            return;
        }
        if (a.L()) {
            return;
        }
        Packet<?> a2 = a.L();
        if (!((Minecraft)((Object)e)).isCallingFromMinecraftThread()) {
            return;
        }
        CombatController class_3932 = class_393;
        class_3932.d(a2);
        if (!class_3932.c) {
            return;
        }
        class_393.e.add(a2);
        a.L();
    }

    public void L(boolean bl) {
        boolean a = bl;
        CombatController a2 = this;
if (a) {
            a2.I = 0;
        }
        if (a2.a) {
            CombatController class_393 = a2;
            a2.d();
            class_393.c = 0;
            class_393.a = 0;
        }
        if (((Minecraft)((Object)CombatController.e)).thePlayer == null) {
            a2.l();
            return;
        }
        if (!CombatController.I()) {
            CombatController class_393 = a2;
            a2.k();
            class_393.L = a2.h = 0;
            class_393.k = null;
            return;
        }
        if (a2.m) {
            a2.D();
        }
        if (a2.h && a2.D() && !a2.h()) {
            return;
        }
        if (a2.I <= 0) {
            a2.k();
        }
        CombatController class_393 = a2;
        class_393.h = 0;
        class_393.L = 0;
        a2.k = null;
    }

    private boolean h() {
        CombatController a;
if (!a.D()) {
            return 3 >> 1;
        }
        if (!CombatController.I() || a.d || a.H || a.j) {
            return false;
        }
        a.L(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
        a.L = 0;
        return 3 >> 1;
    }

    private void k() {
        CombatController a;
if (!a.g) {
            return;
        }
        a.g = 0;
        if (((Minecraft)((Object)CombatController.e)).thePlayer != null) {
            ((Minecraft)((Object)CombatController.e)).thePlayer.stopUsingItem();
        }
    }

    public CombatController() {
        CombatController a;
        CombatController class_393 = a;
        a.e = new CopyOnWriteArrayList<Packet>();
        class_393.J = new Timer(System.currentTimeMillis());
    }

    public void F() {
a.I = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(EntityLivingBase entityLivingBase, Runnable runnable) {
        CombatController class_393;
        CombatController a;
        block17: {
            block16: {
                block14: {
                    block15: {
                        EntityLivingBase a2 = entityLivingBase;
                        a = this;
if (a.m) {
                            boolean bl = --1 != 0;
                            CombatController class_3932 = a;
                            class_3932.D();
                            class_3932.L(bl);
                            return bl;
                        }
                        if (a.g && !((Minecraft)((Object)CombatController.e)).thePlayer.isUsingItem()) {
                            a.g = 0;
                        }
                        if (a.I > 0) {
                            CombatController class_3933 = a;
                            class_3933.I -= 1;
                            if (class_3933.I > 0) {
                                boolean bl = 0;
                                a.L(bl);
                                return bl;
                            }
                        }
                        a.k = a2;
                        if (!a.h) {
                            a.L = !a.g && ((Minecraft)((Object)CombatController.e)).thePlayer.isUsingItem() ? 1 : 0;
                            a.i = a.L ? 0 : 1;
                            a.h = 1;
                            a.h();
                        }
                        if (a.i != 0 && a.i != 3 && a.i != 5) break block14;
                        CombatController class_3934 = a;
                        class_3934.I();
                        if (class_3934.i != 0) break block15;
                        if (!a.h()) break block16;
                        class_393 = a;
                        a.i = 3;
                        break block17;
                    }
                    if (a.i == 3) {
                        class_393 = a;
                        a.i = 6;
                    } else {
                        class_393 = a;
                        a.i = 1;
                    }
                    break block17;
                }
                if (a.i == 1 || a.i == 6) {
                    a.i = 2;
                }
            }
            class_393 = a;
        }
        if (class_393.i == 10) {
            a.i = 11;
        } else if (a.i == 9) {
            a.i = 0;
        } else {
            int a2;
            int n = a2 = a.J.L() >= 329L ? 1 : 0;
            if (a.i == 2 || a.i == 5 || a.i == 6 || 4.0f != 0) {
                void a2232;
                CombatController class_3935 = a;
                boolean a2232 = class_3935.L((Runnable)a2232);
                if (class_3935.i != 5 && a.i != 6 && (a2232 || 4.0f != 0)) {
                    a.i = 7;
                }
            }
        }
        return true;
    }

    public void l() {
        CombatController a;
int n = 1;
        CombatController class_393 = a;
        CombatController class_3932 = a;
        CombatController class_3933 = a;
        a.e.clear();
        class_3933.a = a.c = 0;
        a.h = class_3933.D = 0;
        a.L = 0;
        class_3932.i = a.L;
        class_3932.I = 0;
        class_393.k = null;
        class_393.g = 0;
        a.C = n;
        a.m = 0;
        a.D();
        a.J.L();
    }

    private void d(Packet<?> packet) {
        Packet<INetHandlerPlayServer> packet2;
        Packet<?> a = packet;
        CombatController a2 = this;
if (a instanceof C02PacketUseEntity) {
            packet2 = (C02PacketUseEntity)a;
            a2.j = 1;
            if (((C02PacketUseEntity)packet2).getAction() != C02PacketUseEntity.Action.ATTACK || ((C02PacketUseEntity)packet2).getHitVec() != null) {
                a2.d = 1;
            }
        }
        if (a instanceof C07PacketPlayerDigging) {
            a2.H = 1;
        }
        if (a instanceof C08PacketPlayerBlockPlacement) {
            a2.d = 1;
        }
        if (a instanceof C09PacketHeldItemChange) {
            packet2 = (C09PacketHeldItemChange)a;
            if (((Minecraft)((Object)CombatController.e)).thePlayer != null && ((C09PacketHeldItemChange)packet2).getSlotId() != ((Minecraft)((Object)CombatController.e)).thePlayer.inventory.currentItem) {
                a2.H = 1;
            }
        }
        if (a instanceof C0APacketAnimation) {
            a2.M = 1;
        }
        if (a instanceof C03PacketPlayer) {
            CombatController class_393 = a2;
            CombatController class_3932 = a2;
            a2.C = 1;
            class_3932.j = 0;
            class_393.H = class_3932.d = 0;
            class_393.M = 0;
        }
    }

    private boolean L(Runnable runnable) {
        Runnable a = runnable;
        CombatController a2 = this;
if (a2.D() || a2.M || a2.H || a2.d) {
            return false;
        }
        a.run();
        return --1 != 0;
    }

    private void h() {
        CombatController class_393 = this;
ItemStack a = ((Minecraft)((Object)CombatController.e)).thePlayer.getHeldItem();
        if (a == null) {
            return;
        }
        Object object = a;
        ((Minecraft)((Object)CombatController.e)).thePlayer.setItemInUse((ItemStack)object, ((ItemStack)object).getMaxItemUseDuration());
        class_393.g = 1;
    }

    private void I() {
        CombatController a;
CombatController class_393 = a;
        class_393.c = 1;
        class_393.a = 1;
    }

    public static boolean I() {
if (((Minecraft)((Object)CombatController.e)).thePlayer == null) {
            return 0 != 0;
        }
        ItemStack itemStack = ((Minecraft)((Object)CombatController.e)).thePlayer.getHeldItem();
        if (itemStack != null && itemStack.getItem() instanceof ItemSword) {
            return 1 != 0;
        }
        return false;
    }

    public void i() {
        CombatController a;
a.m = !a.C ? 1 : 0;
        a.C = 0;
    }

    public boolean i() {
        CombatController a;
return a.h || a.g;
    }

    private void L(Packet<?> packet) {
        Packet<?> a = packet;
        CombatController a2 = this;
if (((Minecraft)((Object)e)).getNetHandler() == null) {
            return;
        }
        ((Minecraft)((Object)e)).getNetHandler().addToSendQueue(a);
    }

    private boolean D() {
        CombatController a;
if (a.h) {
            return a.L;
        }
        return ((Minecraft)((Object)CombatController.e)).thePlayer.isUsingItem();
    }

    private void D() {
        CombatController a;
CombatController class_393 = a;
        CombatController class_3932 = a;
        class_3932.j = 0;
        class_393.H = class_3932.d = 0;
        class_393.M = 0;
    }

    private void d() {
        CombatController class_393 = this;
CombatController class_3932 = class_393;
        class_3932.J.L();
        class_3932.D();
        if (class_3932.e.isEmpty()) {
            return;
        }
        ArrayList<Packet> a22 = new ArrayList<Packet>(class_393.e);
        class_393.e.clear();
        if (((Minecraft)((Object)e)).getNetHandler() == null) {
            return;
        }
        class_393.D = 1;
        try {
            ((Minecraft)((Object)e)).getNetHandler().getNetworkManager().sendGrouped((List<Packet>)a22);
            class_393.D = 0;
            return;
        }
        catch (Throwable a22) {
            class_393.D = 0;
            throw a22;
        }
    }

    public boolean d() {
        CombatController a;
if ((a.h || a.g) && !a.L) {
            return 5 >> 2;
        }
        return false;
    }

    public boolean L() {
        CombatController a;
if (((Minecraft)((Object)CombatController.e)).thePlayer == null) {
            return 0 != 0;
        }
        if (!(a.D() || a.M || a.H || a.d)) {
            return --1 != 0;
        }
        return false;
    }

    private void L() {
        CombatController class_393 = this;
if (class_393.D()) {
            return;
        }
        if (!CombatController.I()) {
            return;
        }
        ItemStack a = ((Minecraft)((Object)CombatController.e)).thePlayer.getHeldItem();
        CombatController class_3932 = class_393;
        CombatController class_3933 = class_393;
        class_3932.L(new C08PacketPlayerBlockPlacement(a));
        class_3932.h();
        class_3932.L = 1;
    }
}

