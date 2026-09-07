/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.events.ChatTransformer;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.SettingValue;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.interaction.internal.PlacementResult;

public final class FogBlur
extends Module {
    final public NumberSetting d;
    final public BooleanSetting i;
    final public NumberSetting f;
    final public BooleanSetting H;
    final public NumberSetting e;

    public FogBlur() {
        super("Fog Blur", "Blurs the world based on distance from the camera", ModuleCategory.f);
        FogBlur a;
        FogBlur class_319 = a;
        a.f = new NumberSetting("Distance", 24.0, 4.0, 256.0, 1.0).d("m");
        class_319.e = new NumberSetting("Fade", 48.0, 4.0, 256.0, 1.0).d("m");
        a.H = new BooleanSetting("Client Color", --1 != 0);
        a.d = new NumberSetting("Tint", 0.5, 0.05, 0.95, 0.05).L((SettingValue)a.H);
        a.i = new BooleanSetting("Disable on zoom", 3 >> 1);
    }
}

