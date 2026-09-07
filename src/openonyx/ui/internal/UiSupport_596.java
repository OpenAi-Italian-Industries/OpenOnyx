/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_036;
import openonyx.history.ModeSetting;
import openonyx.history.SettingSupport_039;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.ActionSetting;
import openonyx.history.internal.BlockSetSetting;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.TextSetting;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.MultiEnumSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.KeybindSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_567;
import openonyx.ui.internal.UiSupport_575;
import openonyx.ui.internal.UiSupport_577;
import openonyx.ui.internal.UiSupport_579;
import openonyx.ui.internal.UiSupport_581;
import openonyx.ui.internal.UiSupport_585;
import openonyx.ui.internal.UiSupport_586;
import openonyx.ui.internal.UiSupport_590;
import openonyx.ui.internal.UiSupport_591;
import openonyx.ui.internal.UiSupport_597;
import openonyx.ui.internal.UiSupport_600;
import openonyx.ui.internal.UiSupport_601;
import openonyx.ui.internal.UiSupport_605;
import openonyx.ui.internal.UiSupport_606;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class UiSupport_596
extends UiSupport_549 {
    private final RenderSupport_121 L;
    private final RenderSupport_121 j;
    final protected Setting m;
    final static protected float h = 6.0f;
    final static protected float l = 3.0f;
    final static protected float I = 13.5f;
    private boolean d;
    final static protected RenderSupport_128 i = ThemeSupport_057.I;
    private boolean f;
    final public static float H = 15.0f;
    final static protected RenderSupport_128 e = ThemeSupport_057.C;

    protected float j() {
        UiSupport_596 a;
UiSupport_596 class_596 = a;
        if (a.I()) {
            return class_596.H() + e.i();
        }
        return class_596.k();
    }

    protected float A() {
        UiSupport_596 a;
return a.j() - a.d + 6.0f;
    }

    protected float H() {
        UiSupport_596 a;
return a.k() + a.L().D() + 3.0f;
    }

    public float e() {
        UiSupport_596 a;
return a.L.L();
    }

    @Generated
    public Setting L() {
        UiSupport_596 a;
return a.m;
    }

    /*
     * WARNING - void declaration
     */
    protected void D(UiSupport_548 class_548, float f2) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_596 a3 = this;
if (!a3.I()) {
            return;
        }
        a2.e.F(e, a2.e.L(e, a3.m.D(), (float)a), (float)a3.f, a3.H(), a3.L(ThemeSupport_059.L(a2.L().F(), 0.85f)));
    }

    protected float k() {
        UiSupport_596 a;
return a.d + 6.0f + a.L().i();
    }

    protected abstract void d(UiSupport_548 var1, float var2);

    protected float F() {
        UiSupport_596 a;
return a.j.L();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        void a;
        float f2;
        UiSupport_596 class_596 = this;
float a2 = class_596.j.L();
        if (f2 <= 0.01f) {
            return;
        }
        class_596.d((UiSupport_548)a, 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_596 a4 = this;
if (a4.i() && super.L((float)a2, (float)a, 0)) {
            return 1 != 0;
        }
        return false;
    }

    protected float l() {
        UiSupport_596 a;
return a.j() + 13.5f;
    }

    protected int L(int n) {
        int a = -35;
        UiSupport_596 a2 = this;
int n2 = 0;
        return ThemeSupport_059.L(n2, a2.F() * ((float)ThemeSupport_064.d(n2) / 255.0f));
    }

    protected boolean I() {
        UiSupport_596 a;
if (!a.m.D().isEmpty()) {
            return 1 != 0;
        }
        return false;
    }

    public static UiSupport_596 L(Setting class_031) {
        Setting a;
        Setting class_0312 = class_031;
if (class_0312 instanceof BooleanSetting) {
            a = (BooleanSetting)class_0312;
            return new UiSupport_605((BooleanSetting)a);
        }
        if (class_0312 instanceof NumberSetting) {
            a = (NumberSetting)class_0312;
            return new UiSupport_586((NumberSetting)a);
        }
        if (class_0312 instanceof RangeSetting) {
            a = (RangeSetting)class_0312;
            return new UiSupport_597((RangeSetting)a);
        }
        if (class_0312 instanceof EnumSetting) {
            a = (EnumSetting)class_0312;
            return new UiSupport_581(a);
        }
        if (class_0312 instanceof MultiSelectSetting) {
            a = (MultiSelectSetting)class_0312;
            return new UiSupport_567(a);
        }
        if (class_0312 instanceof MultiEnumSetting) {
            a = (MultiEnumSetting)class_0312;
            return new UiSupport_591(a);
        }
        if (class_0312 instanceof ColorSetting) {
            a = (ColorSetting)class_0312;
            return new UiSupport_579((ColorSetting)a);
        }
        if (class_0312 instanceof ActionSetting) {
            a = (ActionSetting)class_0312;
            return new UiSupport_606((ActionSetting)a);
        }
        if (class_0312 instanceof KeybindSetting) {
            a = (KeybindSetting)class_0312;
            return new UiSupport_577((KeybindSetting)a);
        }
        if (class_0312 instanceof BlockSetSetting) {
            a = (BlockSetSetting)class_0312;
            return new UiSupport_601((BlockSetSetting)a);
        }
        if (class_0312 instanceof TextSetting) {
            a = (TextSetting)class_0312;
            return new UiSupport_590((TextSetting)a);
        }
        if (class_0312 instanceof ModeSetting) {
            a = (ModeSetting)class_0312;
            return new UiSupport_585(a);
        }
        if (class_0312 instanceof SettingSupport_039) {
            a = (SettingSupport_039)class_0312;
            return new UiSupport_575((SettingSupport_039)a);
        }
        if (class_0312 instanceof SettingSupport_036) {
            a = (SettingSupport_036)class_0312;
            return new UiSupport_600((SettingSupport_036)a);
        }
        return null;
    }

    protected UiSupport_596(Setting class_031) {
        UiSupport_596 a;
        OnyxListener_001 a2 = class_031;
        UiSupport_596 class_596 = a = this;
        UiSupport_596 class_5962 = a;
        class_596.L = new RenderSupport_121(0.0f);
        class_596.j = new RenderSupport_121(0.0f);
        class_596.m = a2;
    }

    /*
     * WARNING - void declaration
     */
    protected void L(UiSupport_548 class_548, float f2) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_596 a3 = this;
Object object = a2;
        UiSupport_596 class_596 = a3;
        UiSupport_596 class_5962 = a3;
        ((UiSupport_548)object).e.F(class_596.L(), a2.e.L(a3.L(), a3.m.L(), (float)a), (float)class_5962.f, class_5962.d + 6.0f, a3.L(a2.L().d()));
        class_596.D((UiSupport_548)object, (float)a);
    }

    public float h() {
        UiSupport_596 a;
return a.j.L();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_596 class_596;
        void a;
        UiSupport_596 class_5962 = this;
UiSupport_596 class_5963 = class_5962;
        super.d((UiSupport_548)a);
        boolean a2 = class_5963.m.i();
        float f2 = class_5963.L((UiSupport_548)a);
        if (!class_5963.f) {
            class_5962.f = 1;
            class_5962.d = a2;
            class_5962.L.L(a2 ? f2 : 0.0f);
            class_5962.j.L(a2 ? 1.0f : 0.0f);
        }
        if (a2 != class_5962.d) {
            class_5962.d = a2;
            class_5962.L.L(a2 ? f2 : 0.0f, 300.0f, RenderSupport_123.l);
            class_5962.j.L(a2 ? 1.0f : 0.0f, 200.0f, RenderSupport_123.f);
            class_596 = class_5962;
        } else {
            if (a2 && class_5962.L.L() && class_5962.L.d() != f2) {
                class_5962.L.L(f2);
            }
            class_596 = class_5962;
        }
        class_596.L.L(a.i);
        class_5962.j.L(a.i);
    }

    protected abstract float L(UiSupport_548 var1);

    protected RenderSupport_128 L() {
return i;
    }

    protected boolean i() {
        UiSupport_596 a;
if (a.j.L() > 0.95f) {
            return 1 != 0;
        }
        return false;
    }

    protected float I() {
        UiSupport_596 a;
return a.d + 6.0f + a.L().i() / 2.0f;
    }
}

