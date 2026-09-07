/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.concurrent.ThreadLocalRandom;
import openonyx.events.HypixelUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.NumberSetting;
import openonyx.skins.SkinSupport_073;
import openonyx.ui.internal.UiSupport_593;

public final class ParticleLimiter
extends Module {
    final public NumberSetting e;

    public ParticleLimiter() {
        super("Particle Limiter", "Thins vanilla particles in the Hypixel Bed Wars lobby", ModuleCategory.f);
        ParticleLimiter a;
        ParticleLimiter class_260 = a;
        class_260.e = new NumberSetting("Keep", 5.0, 5.0, 100.0, 5.0).d("%");
    }

    public boolean I() {
        ParticleLimiter a;
if (!a.d() || !HypixelUtils.L()) {
            return false;
        }
        if (ThreadLocalRandom.current().nextInt(100) >= a.e.d()) {
            return 5 >> 2;
        }
        return false;
    }
}

