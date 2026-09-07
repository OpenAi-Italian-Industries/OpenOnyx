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
import openonyx.configuration.internal.EventSupport_611;
import openonyx.core.OnyxListener_001;
import openonyx.events.FileDialogUtils;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.internal.RangeSetting;
import openonyx.utilities.UtilitySupport_477;

public class FeatureSupport_445
extends SettingSupport_029
implements OnyxListener_001 {
    public RangeSetting f = RangeSetting.L("Straight speed", 0.48, 0.49, 0.1, 1.0);
    final public static FeatureSupport_445 H = new FeatureSupport_445();
    public RangeSetting e = RangeSetting.L("Diagonal speed", 0.48, 0.49, 0.1, 1.0);

    private FeatureSupport_445() {
        super("Strafe on jump", 0 != 0);
        FeatureSupport_445 a;
        a.L(Setting.H);
    }

    @EventHandler
    private void L(EventSupport_611 class_611) {
        EventSupport_611 a322 = class_611;
        FeatureSupport_445 a = this;
if (((Minecraft)((Object)FeatureSupport_445.e)).thePlayer == null) {
            return;
        }
        int a322 = (float)(Math.rint((UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_445.e)).thePlayer) + 180.0f) / 45.0f) * 45.0) % 90.0f == 0.0f ? 1 : 0;
        FeatureSupport_445 class_445 = a;
        RangeSetting a322 = a322 != 0 ? class_445.f : class_445.e;
        UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_445.e)).thePlayer, UtilitySupport_477.L(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_445.e)).thePlayer), a322.D()));
    }
}

