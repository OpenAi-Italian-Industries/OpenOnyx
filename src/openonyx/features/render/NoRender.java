/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.core.OnyxListener_001;
import openonyx.events.HypixelUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.BooleanSetting;
import openonyx.interaction.internal.BlockPlacementContext;

public final class NoRender
extends Module {
    final public BooleanSetting I;
    final public BooleanSetting d;
    final public BooleanSetting i;
    final public BooleanSetting f;
    final public BooleanSetting H;
    final public BooleanSetting e;

    public boolean L(BooleanSetting class_051) {
        OnyxListener_001 a = class_051;
        NoRender a2 = this;
if (a2.d() && ((BooleanSetting)a).d()) {
            return --1 != 0;
        }
        return false;
    }

    public NoRender() {
        super("NoRender", "Hides selected vanilla visual effects", ModuleCategory.f);
        NoRender a;
        NoRender class_270 = a;
        a.H = new BooleanSetting("Fire", 1 != 0);
        class_270.i = new BooleanSetting("Hurt camera", --1 != 0);
        a.d = new BooleanSetting("Hand bob", 0 != 0);
        a.f = new BooleanSetting("Boss bar", 3 >> 2);
        a.I = new BooleanSetting("Bad effects", 1 != 0);
        a.e = new BooleanSetting("Scoreboard", 0 != 0);
    }
}

