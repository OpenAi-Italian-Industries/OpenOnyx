/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_342;
import openonyx.features.hud.FeatureSupport_345;
import openonyx.features.hud.FeatureSupport_346;
import openonyx.features.hud.FeatureSupport_347;
import openonyx.features.hud.FeatureSupport_348;
import openonyx.features.hud.FeatureSupport_370;
import openonyx.features.hud.FeatureSupport_371;
import openonyx.features.hud.FeatureSupport_373;
import openonyx.features.hud.FeatureSupport_380;
import openonyx.movement.MovementSupport_088;
import openonyx.render.group_w.RenderSupport_185;
import openonyx.render.group_w.RenderSupport_200;
import openonyx.render.group_w.RenderSupport_202;
import openonyx.utilities.UtilitySupport_486;

public final class CustomGui
extends Module {
    final public FeatureSupport_373 m;
    final public FeatureSupport_346 h;
    final public FeatureSupport_380 l;
    final public FeatureSupport_345 I;
    final public FeatureSupport_371 d;
    final public FeatureSupport_347 i;
    final public FeatureSupport_370 f;
    final public FeatureSupport_342 H;
    final public FeatureSupport_348 e;

    public CustomGui() {
        super("CustomGui", "Reskins Minecraft's own HUD and screens", ModuleCategory.l);
        CustomGui a;
        CustomGui class_344 = a;
        a.e = new FeatureSupport_348();
        class_344.l = new FeatureSupport_380();
        a.m = new FeatureSupport_373();
        a.I = new FeatureSupport_345();
        a.f = new FeatureSupport_370();
        a.i = new FeatureSupport_347();
        a.H = new FeatureSupport_342();
        a.h = new FeatureSupport_346();
        a.d = new FeatureSupport_371();
    }

    @Override
    protected void D() {
RenderSupport_202.L();
        RenderSupport_185.D();
        RenderSupport_200.L();
    }
}

