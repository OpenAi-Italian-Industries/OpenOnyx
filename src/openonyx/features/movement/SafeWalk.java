/*
 * Decompiled with CFR.
 */
package openonyx.features.movement;

import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.movement.internal.FeatureSupport_385;
import openonyx.features.movement.internal.Safe;
import openonyx.history.SettingSupport_034;
import openonyx.history.ModeSetting;
import openonyx.history.ModeOption;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.skins.SkinSupport_073;

public class SafeWalk
extends Module {
    public ModeSetting<ModeOption> e = SafeWalk.L("Mode");

    public static ModeSetting<ModeOption> L(String string) {
        String string2 = string;
SettingSupport_034 class_034 = new SettingSupport_034();
        Safe a = new Safe();
        FeatureSupport_385 class_385 = new FeatureSupport_385();
        ModeOption[] class_041Array = new ModeOption[3];
        class_041Array[0] = class_034;
        class_041Array[1] = a;
        class_041Array[2] = class_385;
        return new ModeSetting(string2, (ModeOption)a, class_041Array);
    }

    public SafeWalk() {
        super("SafeWalk", "Prevents you from falling down as if you were sneaking", ModuleCategory.H);
        SafeWalk a;
    }
}

