/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.internal;

import openonyx.configuration.Event;
import openonyx.history.SettingSupport_029;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.internal.RenderSupport_174;

public class FeatureSupport_449
extends SettingSupport_029 {
    final public static FeatureSupport_449 i = new FeatureSupport_449();
    public NumberSetting f;
    public BooleanSetting H;
    public NumberSetting e;

    private FeatureSupport_449() {
        super("Auto block", 1 != 0);
        FeatureSupport_449 a;
        FeatureSupport_449 class_449 = a;
        a.H = new BooleanSetting("Always hold block", 3 >> 2).L("Keeps the block slot held server-side the whole time instead of swapping to it only on the tick a block goes out");
        class_449.e = new NumberSetting("Slot reset delay", 5.0, 0.0, 40.0, 1.0).d(" ticks").L("How long the silent slot is held after a placement before the real slot comes back");
        a.f = new NumberSetting("Do not use below count", 1.0, 0.0, 64.0, 1.0).L("Leaves a stack alone once it is down to this many blocks");
    }
}

