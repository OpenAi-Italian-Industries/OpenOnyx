/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.protocol;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.EventSupport_615;
import openonyx.configuration.internal.EventSupport_616;
import openonyx.configuration.internal.PacketEvent;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.events.RotationManager;
import openonyx.protocol.ProtocolSupport_208;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_d.ProtocolSupport_210;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.ProtocolMode_213;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_481;
import openonyx.utilities.UtilitySupport_486;
import openonyx.utilities.UtilitySupport_494;
import openonyx.utilities.UtilitySupport_500;
import openonyx.utilities.UtilityMode_487;
import openonyx.utilities.UtilityListener_485;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ProtocolSupport_207
implements OnyxListener_001 {
    private ProtocolSupport_212 h;
    private final UtilitySupport_486<ProtocolSupport_209> l;
    final public static ProtocolSupport_207 I = new ProtocolSupport_207();
    private ProtocolSupport_212 d;
    private ProtocolSupport_212 i;
    private ProtocolSupport_212 f;
    private ProtocolSupport_209 H;
    private ProtocolSupport_212 e;

    public void L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        ProtocolSupport_207 a2 = this;
if (a == null) {
            a2.d = null;
            v0 = a2;
        } else {
            ProtocolSupport_207 class_207 = a2;
            if (a2.i != null) {
                class_207.d = a2.i;
                v0 = a2;
            } else {
                class_207.d = ((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer != null ? UtilitySupport_477.L((Entity)((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer) : ProtocolSupport_212.H;
                v0 = a2;
            }
        }
        v0.i = a;
    }

    @Generated
    public ProtocolSupport_212 I() {
        ProtocolSupport_207 a;
return a.h;
    }

    public boolean L(ProtocolSupport_209 class_209) {
        OnyxListener_001 a = class_209;
        ProtocolSupport_207 a2 = this;
if (!a2.d()) {
            return 3 >> 2;
        }
        if (!((ProtocolSupport_209)a).L()) {
            return 3 >> 1;
        }
        if (!UtilitySupport_494.e.L() && !(((Minecraft)((Object)ProtocolSupport_207.e)).currentScreen instanceof GuiContainer)) {
            return 5 >> 2;
        }
        return false;
    }

    @Generated
    public ProtocolSupport_209 D() {
        ProtocolSupport_207 a;
return a.H;
    }

    public ProtocolSupport_209 d() {
        ProtocolSupport_207 class_207 = this;
OnyxListener_001 a = class_207.L();
        if (a != null) {
            return a;
        }
        return class_207.H;
    }

    private boolean D() {
if (((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer != null && ((Minecraft)((Object)ProtocolSupport_207.e)).theWorld != null) {
            return 3 >> 1;
        }
        return false;
    }

    private ProtocolSupport_209 L() {
        ProtocolSupport_207 a;
return a.l.L();
    }

    public ProtocolSupport_212 i() {
        ProtocolSupport_207 a;
return a.h;
    }

    public ProtocolSupport_212 D() {
        ProtocolSupport_207 a;
return a.i;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-10)
    private void L(EventSupport_616 class_616) {
        void a;
        ProtocolSupport_207 class_207 = this;
if (!class_207.D()) {
            return;
        }
        if (RotationManager.d()) {
            return;
        }
        OnyxListener_001 a2 = class_207.d();
        if (a2 != null && ((ProtocolSupport_209)a2).L() == ProtocolMode_213.H) {
            return;
        }
        if (class_207.i == null) {
            return;
        }
        void v0 = a;
        v0.L(UtilitySupport_477.L(v0.d(), a.L(), class_207.i.L()));
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        ProtocolSupport_207 class_207 = this;
if (!class_207.D()) {
            return;
        }
        OnyxListener_001 a2 = class_207.d();
        if (a2 == null) {
            return;
        }
        if (!class_207.L((ProtocolSupport_209)a2) || ((ProtocolSupport_209)a2).L() != ProtocolMode_213.I) {
            return;
        }
        if (class_207.f == null || class_207.i == null) {
            return;
        }
        ProtocolSupport_207 class_2072 = class_207;
        ProtocolSupport_210.L(((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer, class_2072.f.L(class_2072.i, (float)a));
    }

    /*
     * WARNING - void declaration
     */
    public void L(double d, double d2) {
        void a;
        void a2;
        ProtocolSupport_207 class_207 = this;
if (!class_207.D()) {
            return;
        }
        OnyxListener_001 a3 = class_207.d();
        if (a3 == null) {
            return;
        }
        if (!class_207.L((ProtocolSupport_209)a3) || ((ProtocolSupport_209)a3).L() != ProtocolMode_213.I) {
            return;
        }
        if (class_207.f != null) {
            class_207.f = ProtocolSupport_210.L(class_207.f, (double)a2, (double)a);
        }
        if (class_207.i != null) {
            ProtocolSupport_207 class_2072 = class_207;
            class_2072.L(ProtocolSupport_210.L(class_2072.i, (double)a2, (double)a));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void L() {
        var2_1 = this;
var2_1.f = var1_2 = UtilitySupport_477.L((Entity)ProtocolSupport_207.e.thePlayer);
        a = var2_1.d();
        if (a == null) {
            return;
        }
        v0 = var2_1;
        var3_4 = v0.L();
        if (!v0.L((ProtocolSupport_209)a)) ** GOTO lbl25
        var4_5 = var2_1.i != null ? var2_1.i : var1_2;
        var4_5 = a.L(var4_5, (boolean)(var3_4 == null ? 5 >> 2 : 0)).L();
        var1_3 = var4_5.L(var1_2);
        if (var3_4 == null && (a.L() == ProtocolMode_213.I || a.L().isEmpty() || var1_3 <= a.L())) {
            if (var2_1.i != null) {
                ProtocolSupport_207.e.thePlayer.renderArmYaw = ProtocolSupport_207.e.thePlayer.rotationYaw = ProtocolSupport_210.L(ProtocolSupport_207.e.thePlayer, var2_1.i);
                ProtocolSupport_207.e.thePlayer.prevRenderArmYaw = ProtocolSupport_207.e.thePlayer.rotationYaw;
            }
            v1 = var2_1;
            var2_1.L((ProtocolSupport_212)null);
            var2_1.H = null;
        } else {
            var2_1.L(var4_5);
            var2_1.H = a;
            if (var3_4 != null && var3_4.L() != null) {
                var3_4.L().L();
            }
lbl25:
            // 4 sources

            v1 = var2_1;
        }
        v1.l.L();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-1000)
    private void L(PacketEvent class_623) {
        void v1;
        ProtocolSupport_212 class_212;
        void a;
        ProtocolSupport_207 class_207 = this;
Packet<?> packet = a.L();
        Objects.requireNonNull(packet);
        Object a2 = packet;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{C03PacketPlayer.class, S08PacketPlayerPosLook.class}, (Object)a2, 0)) {
            case 0: {
                while (false) {
                }
                C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)a2;
                if (!c03PacketPlayer.getRotating()) {
                    return;
                }
                class_212 = new ProtocolSupport_212(c03PacketPlayer.getYaw(), c03PacketPlayer.getPitch(), 1 != 0);
                v1 = a;
                break;
            }
            case 1: {
                a2 = (S08PacketPlayerPosLook)a2;
                class_212 = new ProtocolSupport_212(((S08PacketPlayerPosLook)a2).getYaw(), ((S08PacketPlayerPosLook)a2).getPitch(), 1 != 0);
                v1 = a;
                break;
            }
            default: {
                return;
            }
        }
        if (!v1.L()) {
            class_207.h = class_212;
            RotationManager.L(class_207.h.L(), class_212.i());
        }
        class_207.e = class_212;
    }

    private ProtocolSupport_207() {
        ProtocolSupport_207 a;
        ProtocolSupport_207 class_207 = a;
        a.l = new UtilitySupport_486();
        class_207.h = ProtocolSupport_212.H;
        a.e = ProtocolSupport_212.H;
    }

    /*
     * WARNING - void declaration
     */
    public void L(ProtocolSupport_212 class_212, boolean bl, ProtocolSupport_208 class_208, UtilityMode_487 enum_487, UtilityListener_485 interface_485, UtilitySupport_500 class_500) {
        void a;
        void a2;
        UtilitySupport_500 a3;
        void a4;
        void a5;
        void a6;
        ProtocolSupport_207 class_207 = class_5002;
        UtilitySupport_500 class_5002 = class_500;
        ProtocolSupport_207 a7 = class_207;
a7.L(a6.L((ProtocolSupport_212)a5, null, (boolean)a4, a3), (UtilityMode_487)a2, (UtilityListener_485)a);
    }

    private boolean d() {
return 1 != 0;
    }

    @Generated
    public ProtocolSupport_212 d() {
        ProtocolSupport_207 a;
return a.f;
    }

    @Generated
    public ProtocolSupport_212 L() {
        ProtocolSupport_207 a;
return a.d;
    }

    public boolean L() {
        ProtocolSupport_207 a;
if (((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer == null) {
            return 0 != 0;
        }
        if (a.i != null) {
            ProtocolSupport_207 class_207 = a;
            return class_207.i.equals(class_207.d);
        }
        return UtilitySupport_477.L((Entity)((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer).equals(UtilitySupport_477.d((Entity)((Minecraft)((Object)ProtocolSupport_207.e)).thePlayer));
    }

    @EventHandler(priority=1000)
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        ProtocolSupport_207 a2 = this;
if (!a2.D()) {
            return;
        }
        OnyxClient.d.post((Object)new EventSupport_615());
        a2.L();
    }

    /*
     * WARNING - void declaration
     */
    public void L(ProtocolSupport_209 class_209, UtilityMode_487 enum_487, UtilityListener_485 interface_485) {
        void a;
        void v2;
        int n;
        OnyxListener_001 a2 = class_209;
        ProtocolSupport_207 a3 = this;
if (!a3.d()) {
            return;
        }
        UtilitySupport_486<ProtocolSupport_209> class_486 = a3.l;
        if (((ProtocolSupport_209)a2).L() == ProtocolMode_213.I) {
            n = 1;
            v2 = a;
        } else {
            n = ((ProtocolSupport_209)a2).L();
            v2 = a;
        }
        class_486.L(new UtilitySupport_481<OnyxListener_001>(n, v2.L(), (UtilityListener_485)a, a2));
    }
}

