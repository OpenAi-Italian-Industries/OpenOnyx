/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.EventSupport_611;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.group_m.internal.FeatureMode_437;
import openonyx.history.SettingSupport_029;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.input.InputSupport_002;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.utilities.UtilitySupport_477;

public class FeatureSupport_438
extends SettingSupport_029
implements OnyxListener_001 {
    private transient int I;
    private transient int d;
    public RangeSetting i;
    final public static FeatureSupport_438 f = new FeatureSupport_438();
    public NumberSetting H;
    public EnumSetting<FeatureMode_437> e;

    private FeatureSupport_438() {
        FeatureSupport_438 a;
        FeatureSupport_438 class_438 = a;
        super("Telly", 0 != 0);
        FeatureSupport_438 class_4382 = a;
        class_4382.e = new EnumSetting<FeatureMode_437>("Jump aim", FeatureMode_437.e).L("What the aim does while the jump goes out: keep the spoofed aim pitched down, or hand it back to your real look");
        a.H = new NumberSetting("Straight ticks", 0.0, 0.0, 5.0, 1.0).d(" ticks").L("Air ticks after the jump during which the aim stays straight ahead");
        int n = 0;
        class_438.i = RangeSetting.L("Jump delay", n, n, n, 10).L(" ticks").d("Ground ticks to wait between jumps");
        class_438.d = a.i.i();
    }

    @EventHandler
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        FeatureSupport_438 a2 = this;
if (((Minecraft)((Object)FeatureSupport_438.e)).thePlayer == null) {
            return;
        }
        if (((Minecraft)((Object)FeatureSupport_438.e)).thePlayer.onGround) {
            a2.I += 1;
        }
    }

    public boolean l() {
        FeatureSupport_438 a;
if (UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_438.e)).thePlayer) <= a.H.d()) {
            FeatureSupport_438 class_438 = a;
            if (class_438.I >= class_438.d) {
                return 5 >> 2;
            }
        }
        return false;
    }

    public boolean h() {
        FeatureSupport_438 a;
FeatureSupport_438 class_438 = a;
        if (class_438.I >= class_438.d && UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_438.e)).thePlayer) && a.D()) {
            return 1 != 0;
        }
        return false;
    }

    @EventHandler
    private void L(EventSupport_611 class_611) {
        EventSupport_611 a = class_611;
        FeatureSupport_438 a2 = this;
a2.I = 0;
        a2.d = a2.i.i();
    }

    @Override
    protected void D() {
        FeatureSupport_438 a;
a.I = 0;
        a.d = a.i.i();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private void L(EventSupport_625 class_625) {
        FeatureSupport_438 class_438 = this;
if (((Minecraft)((Object)FeatureSupport_438.e)).thePlayer == null) {
            return;
        }
        if (!UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_438.e)).thePlayer) || Scaffold.E.L() <= 0 || !((Minecraft)((Object)FeatureSupport_438.e)).thePlayer.onGround) {
            return;
        }
        boolean a = ProtocolSupport_207.I.D() == null || class_438.H.d() == 0;
        switch (((FeatureMode_437)class_438.e.L()).ordinal()) {
            case 0: {
                void a2;
                while (false) {
                }
                a2.L(5 >> 2);
                return;
            }
            case 1: {
                void a2;
                if (!a) break;
                FeatureSupport_438 class_4382 = class_438;
                if (class_4382.I < class_4382.d) break;
                a2.L(--1 != 0);
            }
        }
    }
}

