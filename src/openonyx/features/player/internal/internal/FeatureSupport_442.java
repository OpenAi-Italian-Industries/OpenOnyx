/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.core.OnyxListener_001;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.theme.ThemeSupport_056;
import openonyx.ui.internal.TextEditor;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_495;

public class FeatureSupport_442
extends SettingSupport_029
implements OnyxListener_001 {
    public NumberSetting f;
    public BooleanSetting H;
    final public static FeatureSupport_442 e = new FeatureSupport_442();

    @EventHandler
    private void L(EventSupport_609 class_609) {
        double d;
        EventSupport_609 a = class_609;
        FeatureSupport_442 a2 = this;
if (((Minecraft)((Object)FeatureSupport_442.e)).thePlayer == null) {
            return;
        }
        if (((Boolean)a2.H.L()).booleanValue() && !((Minecraft)((Object)FeatureSupport_442.e)).thePlayer.onGround) {
            return;
        }
        double d2 = d = (double)a2.f.L();
        UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_442.e)).thePlayer, UtilitySupport_495.d(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_442.e)).thePlayer), d2, 1.0, d2));
    }

    private FeatureSupport_442() {
        FeatureSupport_442 a;
        FeatureSupport_442 class_442 = a;
        super("Acceleration", 0 != 0);
        FeatureSupport_442 class_4422 = a;
        class_442.f = new NumberSetting("Speed multiplier", 0.6, 0.1, 3.0, 0.01);
        class_4422.H = new BooleanSetting("Only on ground", 0 != 0);
        class_442.L(Setting.H);
    }
}

