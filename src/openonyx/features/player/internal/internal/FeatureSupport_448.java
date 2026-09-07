/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.EventSupport_611;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.EventSupport_622;
import openonyx.configuration.internal.PacketEvent;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.configuration.internal.PacketDirection;
import openonyx.core.OnyxListener_001;
import openonyx.features.movement.NoSlow;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.features.player.internal.internal.FeatureMode_443;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_d.ProtocolSupport_210;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.ProtocolMode_213;
import openonyx.ui.UiSupport_551;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.Timer;

public class FeatureSupport_448
extends SettingSupport_029
implements OnyxListener_001 {
    private final transient Timer M;
    private final transient List<Packet> L;
    private transient boolean j;
    public BooleanSetting m;
    public NumberSetting h;
    public EnumSetting<FeatureMode_443> l;
    final public static FeatureSupport_448 I = new FeatureSupport_448();
    private transient boolean d;
    private final static long i = 329L;
    private transient boolean f;
    public NumberSetting H;
    private final transient FeatureSupport_419 e;

    @EventHandler(priority=-10)
    private void L(EventSupport_622 class_622) {
        EventSupport_622 a = class_622;
        FeatureSupport_448 a2 = this;
switch (((FeatureMode_443)a2.l.L()).ordinal()) {
            case 1: {
                while (false) {
                }
                if (!a.L().i()) break;
                a.L(1 != 0);
                return;
            }
            case 5: {
                if (!a.L().i()) {
                    return;
                }
                if (a2.d && !((Minecraft)((Object)FeatureSupport_448.e)).thePlayer.willJumpThisTick()) {
                    a.L(0 != 0);
                    return;
                }
                if (!(((Minecraft)((Object)FeatureSupport_448.e)).thePlayer.movementInput.moveForward >= NoSlow.L())) break;
                a.L(1 != 0);
                return;
            }
            case 2: {
                a.L(0 != 0);
                return;
            }
            case 4: {
                a.L((!((Minecraft)((Object)FeatureSupport_448.e)).thePlayer.onGround ? 1 : 0) != 0);
                return;
            }
            case 3: {
                if (!a2.d || ((Minecraft)((Object)FeatureSupport_448.e)).thePlayer.willJumpThisTick()) break;
                a.L(0 != 0);
                return;
            }
        }
    }

    private void h() {
        FeatureSupport_448 class_448 = this;
class_448.f = 0;
        if (class_448.L.isEmpty()) {
            return;
        }
        ArrayList<Packet> a22 = new ArrayList<Packet>(class_448.L);
        class_448.L.clear();
        if (((Minecraft)((Object)e)).getNetHandler() == null) {
            return;
        }
        class_448.j = 1;
        try {
            ((Minecraft)((Object)e)).getNetHandler().getNetworkManager().sendGrouped((List<Packet>)a22);
            class_448.j = 0;
            return;
        }
        catch (Throwable a22) {
            class_448.j = 0;
            throw a22;
        }
    }

    @Override
    protected void d() {
        FeatureSupport_448 a;
a.h();
    }

    public boolean l() {
        FeatureSupport_448 a;
return a.L() && (a.l.L(FeatureMode_443.i) || a.l.L(FeatureMode_443.e));
    }

    @Override
    protected void D() {
        FeatureSupport_448 a;
a.d = 0;
        a.I();
    }

    @EventHandler(priority=-500)
    private void L(EventSupport_625 class_625) {
        EventSupport_625 a22 = class_625;
        FeatureSupport_448 a = this;
if (!a.l.L(FeatureMode_443.e) || ((Minecraft)((Object)FeatureSupport_448.e)).thePlayer == null) {
            return;
        }
        if (a.d) {
            return;
        }
        if (!a22.L().i()) {
            return;
        }
        if (!((Minecraft)((Object)FeatureSupport_448.e)).thePlayer.willJumpThisTick(a22.D())) {
            return;
        }
        Object object = ProtocolSupport_207.I.d();
        if (object == null || ((ProtocolSupport_209)object).L() == ProtocolMode_213.H) {
            return;
        }
        if (ThreadLocalRandom.current().nextInt(100) >= a.H.d()) {
            return;
        }
        float a22 = UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_448.e)).thePlayer, a22.L());
        object = ProtocolSupport_207.I.D();
        if (object == null) {
            object = UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_448.e)).thePlayer);
        }
        if (Math.abs(ProtocolSupport_210.L(0, ((ProtocolSupport_212)object).L())) > a.h.L()) {
            return;
        }
        float f2 = (float)ThreadLocalRandom.current().nextDouble(60.0, 70.0);
        a22 = a.e.L(0, (Double)Scaffold.E.P.e.L());
        ProtocolSupport_207.I.L(new ProtocolSupport_212(0, f2).L());
    }

    private FeatureSupport_448() {
        super("Sprint control", 0 != 0);
        FeatureSupport_448 a;
        FeatureSupport_448 class_448 = a;
        Enum[] enumArray = new FeatureMode_443[4];
        enumArray[0] = FeatureMode_443.d;
        enumArray[1] = FeatureMode_443.i;
        enumArray[2] = FeatureMode_443.f;
        enumArray[3] = FeatureMode_443.e;
        class_448.l = new EnumSetting("Mode", (Enum)FeatureMode_443.d, enumArray);
        a.H = ((NumberSetting)new NumberSetting("Jump forward chance", 100.0, 0.0, 100.0, 1.0).d("%").L("Chance to redirect the sprint jump impulse along the movement direction")).L(() -> {
            FeatureSupport_448 a;
return a.l.L(FeatureMode_443.e);
        });
        a.h = ((NumberSetting)new NumberSetting("Max flick", 75.0, 0.0, 180.0, 1.0).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°").L("Skips the jump-forward snap when it would flick the sent yaw further than this")).L(() -> {
            FeatureSupport_448 a;
return a.l.L(FeatureMode_443.e);
        });
        FeatureSupport_448 class_4482 = a;
        class_4482.m = ((BooleanSetting)new BooleanSetting("Blink jump", 5 >> 2).L("Holds outgoing packets from the jump until the next placement, so the rotation flip and the ascent arrive as one lag burst")).L(Setting.H);
        class_4482.e = new FeatureSupport_419();
        class_4482.L = new CopyOnWriteArrayList<Packet>();
        class_4482.M = new Timer(System.currentTimeMillis());
    }

    private void I() {
        FeatureSupport_448 a;
a.f = 0;
        a.j = 0;
        a.L.clear();
    }

    @EventHandler
    private void L(EventSupport_611 class_611) {
        EventSupport_611 a = class_611;
        FeatureSupport_448 a2 = this;
if (!a2.l.L(FeatureMode_443.e) || !((Boolean)a2.m.L()).booleanValue()) {
            return;
        }
        if (((Minecraft)((Object)FeatureSupport_448.e)).thePlayer == null || !UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_448.e)).thePlayer)) {
            return;
        }
        a2.h();
        a2.f = 1;
        a2.M.L();
    }

    public void i() {
a.d = 1;
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        FeatureSupport_448 a2 = this;
a2.I();
    }

    @EventHandler(priority=500)
    private void L(PacketEvent class_623) {
        PacketEvent a = class_623;
        FeatureSupport_448 a2 = this;
if (a2.j || a.L()) {
            return;
        }
        if (a.L() == PacketDirection.f) {
            if (a.L() instanceof S08PacketPlayerPosLook) {
                a2.h();
            }
            return;
        }
        if (!a2.f) {
            return;
        }
        if (a.L() instanceof C08PacketPlayerBlockPlacement) {
            a2.h();
            return;
        }
        a2.L.add(a.L());
        a.L();
    }

    @EventHandler(priority=1000)
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        FeatureSupport_448 a2 = this;
if (a2.d) {
            a2.d = 0;
        }
        if (a2.f && ((Minecraft)((Object)FeatureSupport_448.e)).thePlayer != null && (((Minecraft)((Object)FeatureSupport_448.e)).thePlayer.onGround || a2.M.L(329L))) {
            a2.h();
        }
    }
}

