/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.history.internal.TextSetting;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_589;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_590
extends UiSupport_596 {
    private final UiSupport_589 M;
    private final TextSetting L;
    private String j;
    private final static float m = 6.0f;

    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        UiSupport_548 a = class_548;
        UiSupport_590 a2 = this;
UiSupport_590 class_590 = a2;
        class_590.M.L(a);
        if (!class_590.I()) {
            return;
        }
        float a3 = a2.d + 6.0f + 40.0f + 6.0f;
        a.e.F(e, a.e.L(e, a2.m.D(), a2.e), a2.f, a3, a2.L(ThemeSupport_059.L(a.L().F(), 0.85f)));
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_590 a2 = this;
UiSupport_590 class_590 = a2;
        super.d(a);
        if (!((String)class_590.L.L()).equals(a2.j)) {
            a2.j = (String)a2.L.L();
            UiSupport_590 class_5902 = a2;
            class_5902.M.L(class_5902.j);
        }
    }

    @Override
    protected void L() {
        UiSupport_590 a;
UiSupport_590 class_590 = a;
        class_590.M.L(class_590.f, a.d + 6.0f, a.e, 40.0f);
    }

    public UiSupport_590(TextSetting class_046) {
        UiSupport_590 a;
        OnyxListener_001 a2 = class_046;
        UiSupport_590 class_590 = a = this;
        OnyxListener_001 interface_001 = a2;
        super((Setting)interface_001);
        class_590.L = interface_001;
        UiSupport_590 class_5902 = a;
        class_590.M = new UiSupport_589((String)((SettingValue)a2).L());
        class_590.j = (String)((SettingValue)a2).L();
        UiSupport_590 class_5903 = a;
        a.M.L(class_5903.j);
        class_5903.M.L(((TextSetting)a2)::i);
        UiSupport_590 class_5904 = a;
        class_5904.l.add(class_5904.M);
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a22 = class_548;
        UiSupport_590 a = this;
float a22 = 46.0f;
        if (a.I()) {
            a22 += 6.0f + e.i();
        }
        return 6.0f;
    }
}

