/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleManager;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_263;
import openonyx.features.render.FeatureMode_318;
import openonyx.history.internal.EnumSetting;
import openonyx.render.internal.RenderSupport_176;

public class Animations
extends Module {
    public EnumSetting<FeatureMode_263> H;
    public EnumSetting<FeatureMode_318> e;

    public Animations() {
        super("Animations", "Changes the swinging and blocking item animations", ModuleCategory.f);
        Animations a;
        Animations class_316 = a;
        a.H = new EnumSetting<FeatureMode_263>("Block", FeatureMode_263.f).L("Raises the sword higher and lets it sweep along with the swing");
        class_316.e = new EnumSetting<FeatureMode_318>("Swing", FeatureMode_318.H).L("Drives the item bob off the equip progress instead of the swing progress");
    }

    public static boolean h() {
Animations class_316 = Animations.L();
        if (class_316 != null && class_316.d() && class_316.H.L(FeatureMode_263.f)) {
            return 1 != 0;
        }
        return false;
    }

    public static boolean I() {
Animations class_316 = Animations.L();
        if (class_316 != null && class_316.d() && class_316.e.L(FeatureMode_318.H)) {
            return --1 != 0;
        }
        return false;
    }

    private static Animations L() {
ModuleManager class_228 = OnyxClient.l;
        if (class_228 == null) {
            return null;
        }
        return class_228.t;
    }
}

