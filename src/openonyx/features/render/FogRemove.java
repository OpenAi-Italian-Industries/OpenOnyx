/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import net.minecraft.client.renderer.GlStateManager;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.Range;
import openonyx.theme.internal.ThemeSupport_061;

public final class FogRemove
extends Module {
    private final static float H = 8.5070587E37f;
    private final static float e = 1.7014117E38f;

    public void L(int n) {
        int a = n;
        FogRemove a2 = this;
if (!a2.d()) {
            return;
        }
        GlStateManager.setFog(9729);
        GlStateManager.setFogDensity(0.0f);
        GlStateManager.setFogStart(8.5070587E37f);
        GlStateManager.setFogEnd(1.7014117E38f);
    }

    public FogRemove() {
        super("FogRemove", "Removes first-person environmental and distance fog", ModuleCategory.f);
        FogRemove a;
    }
}

