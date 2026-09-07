/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import net.minecraft.client.Minecraft;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_120;
import openonyx.theme.ThemeSupport_056;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_560;

public class ClickGUI
extends Module {
    public ColorSetting i;
    public NumberSetting f;
    public NumberSetting H;
    public BooleanSetting e;

    @Override
    public boolean D() {
return 5 >> 3;
    }

    @Override
    protected void L() {
        ClickGUI a;
if (((Minecraft)((Object)ClickGUI.e)).currentScreen instanceof UiSupport_560) {
            return;
        }
        ((Minecraft)((Object)e)).displayGuiScreen(new UiSupport_560(a, ((Minecraft)((Object)ClickGUI.e)).currentScreen));
    }

    @Override
    public boolean i() {
return 5 >> 3;
    }

    public ClickGUI() {
        super("ClickGUI", "Opens click GUI", ModuleCategory.f);
        ClickGUI a2;
        ClickGUI class_231 = a2;
        class_231.i = new ColorSetting("Accent", -10006364).d().L("Seed colour the whole theme is generated from").L(ThemeSupport_059::L);
        a2.f = ((NumberSetting)new NumberSetting("Background tint", 25.0, 0.0, 100.0, 5.0).d("%").L("How much the accent colours the panel background")).L(a -> {
ThemeSupport_059.d(a.floatValue() / 100.0f);
        });
        a2.H = ((NumberSetting)new NumberSetting("Scale", 1.0, 0.5, 1.5, 0.05).d("x").L("Interface size")).L(a -> {
ThemeSupport_059.L(a.floatValue());
        });
        a2.e = new BooleanSetting("Frosted glass", 1 != 0).L("Blur the world behind the panel instead of the whole screen");
        a2.L().i(54);
    }
}

