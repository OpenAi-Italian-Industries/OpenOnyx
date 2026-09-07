/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_440;
import openonyx.history.SettingSupport_028;
import openonyx.history.SettingSupport_029;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.theme.internal.ThemeSupport_063;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;

public class FeatureSupport_439
extends SettingSupport_029
implements OnyxListener_001 {
    private final transient SettingSupport_028 l;
    private transient int I;
    public RangeSetting d;
    private final transient SettingSupport_028 i;
    public RangeSetting f;
    public BooleanSetting H;
    final public static FeatureSupport_439 e = new FeatureSupport_439();

    public void i() {
        FeatureSupport_439 a;
if (!a.D()) {
            return;
        }
        FeatureSupport_439 class_439 = a;
        class_439.I += 1;
        if (class_439.I > a.i.L()) {
            FeatureSupport_439 class_4392 = a;
            class_4392.I = 0;
            class_4392.i.L();
            class_4392.l.L();
        }
    }

    @EventHandler(priority=-50)
    private void L(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        FeatureSupport_439 a2 = this;
if (!a.d() && a2.L(a.L())) {
            a.d(3 >> 1);
        }
    }

    private FeatureSupport_439() {
        FeatureSupport_439 a;
        FeatureSupport_439 class_439 = a;
        FeatureSupport_439 class_4392 = a;
        super("Sneak", 3 >> 2);
        int n = 0;
        class_4392.d = RangeSetting.L("Blocks to sneak", n, n, n, 10).d("How many blocks to place between sneaks");
        class_4392.f = RangeSetting.L("Edge distance", 0.01, 0.05, 0.01, 1.3).L(" blocks");
        FeatureSupport_439 class_4393 = a;
        class_439.H = new BooleanSetting("Only on ground", 3 >> 1);
        class_4393.i = new SettingSupport_028(a.d);
        class_439.l = new SettingSupport_028(a.f);
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(MovementInputState class_478) {
        void a;
        int a2;
        FeatureSupport_439 class_439 = this;
if (((Minecraft)((Object)FeatureSupport_439.e)).thePlayer == null) {
            return 5 >> 3;
        }
        if (FeatureSupport_440.l()) {
            return 0 != 0;
        }
        if (!((Minecraft)((Object)FeatureSupport_439.e)).thePlayer.onGround && ((Boolean)class_439.H.L()).booleanValue()) {
            return 5 >> 3;
        }
        int n = a2 = !((Minecraft)((Object)FeatureSupport_439.e)).thePlayer.capabilities.isFlying && class_439.I == 0 ? 1 : 0;
        if (0 != 0 && UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_439.e)).thePlayer, (MovementInputState)a, class_439.l.L())) {
            return 1 != 0;
        }
        return false;
    }
}

