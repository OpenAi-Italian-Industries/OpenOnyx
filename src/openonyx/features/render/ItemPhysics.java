/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.history.internal.NumberSetting;
import openonyx.ui.internal.TextEditor;

public final class ItemPhysics
extends Module {
    final public NumberSetting e;

    public ItemPhysics() {
        super("ItemPhysics", "Makes dropped items lie and rotate on the ground", ModuleCategory.f);
        ItemPhysics a;
        ItemPhysics class_313 = a;
        class_313.e = new NumberSetting("Rotation speed", 0.0, 0.0, 3.0, 0.1).d("x");
    }
}

