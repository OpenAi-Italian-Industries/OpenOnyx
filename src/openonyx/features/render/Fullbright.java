/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import meteordevelopment.orbit.EventHandler;
import openonyx.configuration.internal.EventSupport_619;
import openonyx.events.Rotation;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.NumberSetting;
import openonyx.render.group_i.RenderSupport_142;

public class Fullbright
extends Module {
    public NumberSetting H;
    private float e;

    @Override
    protected void L() {
        Fullbright a;
a.e = Fullbright.e.gameSettings.gammaSetting;
        a.h();
    }

    @Override
    protected void D() {
        Fullbright a;
Fullbright.e.gameSettings.gammaSetting = a.e;
    }

    @EventHandler
    private void L(EventSupport_619 class_619) {
        EventSupport_619 a = class_619;
        Fullbright a2 = this;
a2.h();
    }

    private void h() {
        Fullbright a;
Fullbright.e.gameSettings.gammaSetting = a.H.L();
    }

    public Fullbright() {
        super("Fullbright", "Makes the world brighter", ModuleCategory.f);
        Fullbright a;
        Fullbright class_264 = a;
        class_264.H = new NumberSetting("Gamma", 100.0, 1.0, 100.0, 1.0).L("Gamma to apply (vanilla max brightness is 1)");
    }
}

