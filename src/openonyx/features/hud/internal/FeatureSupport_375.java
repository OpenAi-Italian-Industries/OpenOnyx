/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.internal;

import java.util.function.IntSupplier;
import openonyx.events.EntityRelationUtils;
import openonyx.features.hud.internal.FeatureMode_374;
import openonyx.features.hud.internal.FeatureMode_379;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.history.internal.TextSetting;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.internal.RenderSupport_176;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureSupport_375
extends SettingSupport_029 {
    public NumberSetting g;
    public NumberSetting M;
    private final static double L = 150.0;
    public ColorSetting j;
    public NumberSetting m;
    public TextSetting h;
    public NumberSetting l;
    public BooleanSetting I;
    private final FeatureMode_379 d;
    public BooleanSetting i;
    public EnumSetting<RenderMode_130> f;
    public NumberSetting H;
    public EnumSetting<FeatureMode_374> e;

    public boolean h() {
        FeatureSupport_375 a;
return a.D();
    }

    public float L() {
        FeatureSupport_375 a;
if (a.d.D()) {
            return 1.0f;
        }
        return a.l.L();
    }

    /*
     * WARNING - void declaration
     */
    public FeatureSupport_375(FeatureMode_379 enum_379, boolean bl, String string, IntSupplier intSupplier) {
        void a;
        void a2;
        void a3;
        FeatureMode_379 a4 = enum_379;
        FeatureSupport_375 a5 = this;
        super(a4.L(), (boolean)a3);
        a5.d = a4;
        a5.h = new TextSetting("Text", (String)a2).L("Supports {name} {health} {max} {hearts} {distance} {status}");
        FeatureSupport_375.L((Setting)a5.h, a4.d());
        a5.e = new EnumSetting<FeatureMode_374>("Readout", FeatureMode_374.d).L("How {health} and {max} are written out");
        FeatureSupport_375.L(a5.e, a4.L());
        Enum[] enumArray = new RenderMode_130[5];
        enumArray[0] = RenderMode_130.H;
        enumArray[1] = RenderMode_130.d;
        enumArray[2] = RenderMode_130.j;
        enumArray[3] = RenderMode_130.i;
        enumArray[4] = RenderMode_130.e;
        a5.f = new EnumSetting("Weight", (Enum)RenderMode_130.j, enumArray).L("Font weight");
        FeatureSupport_375.L(a5.f, a4.d());
        a5.l = new NumberSetting("Size", 1.0, 0.25, 3.0, 0.05).d("x");
        FeatureSupport_375.L((Setting)a5.l, (!a4.D() ? 1 : 0) != 0);
        FeatureSupport_375 class_375 = a5;
        class_375.H = new NumberSetting("Thickness", 3.0, 1.0, 12.0, 0.5);
        FeatureSupport_375.L((Setting)class_375.H, a4.D());
        class_375.M = new NumberSetting("Offset X", 0.0, -150.0, 150.0, 0.5);
        class_375.m = new NumberSetting("Offset Y", 0.0, -150.0, 150.0, 0.5);
        class_375.j = new ColorSetting("Colour", -1).D().L((IntSupplier)a);
        class_375.g = new NumberSetting("Glow", 0.0, 0.0, 12.0, 0.5).L("Halo radius behind the element - 0 turns it off");
        class_375.i = new BooleanSetting("Absorption", 3 >> 1).L("Count golden hearts as an extra bar segment");
        FeatureSupport_375.L((Setting)class_375.i, a4.D());
        class_375.I = new BooleanSetting("Damage trail", 1 != 0).L("Trailing bar that drains after a hit");
        FeatureSupport_375.L((Setting)class_375.I, a4.D());
    }

    private static void L(Setting class_031, boolean bl) {
        boolean a = bl;
        Setting a2 = class_031;
if (!a) {
            a2.L(Setting.H);
        }
    }

    public void i() {
        FeatureSupport_375 class_375 = this;
FeatureSupport_375 class_3752 = class_375;
        class_3752.L().d();
        for (Setting class_031 : class_3752.L()) {
            if (!(class_031 instanceof SettingValue)) continue;
            ((SettingValue)class_031).d();
        }
    }

    public FeatureMode_379 L() {
        FeatureSupport_375 a;
return a.d;
    }
}

