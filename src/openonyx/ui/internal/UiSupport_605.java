/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_605
extends UiSupport_596 {
    private final static float j = 13.0f;
    private final static float m = 15.0f;
    private final RenderSupport_121 I;
    private final BooleanSetting d;
    private boolean i;
    private boolean f;
    private final UiSupport_545 e;

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_605 a2 = this;
return a2.A();
    }

    private float m() {
        UiSupport_605 a;
UiSupport_605 class_605 = a;
        return class_605.f + class_605.e - 15.0f;
    }

    private float B() {
        UiSupport_605 a;
return a.I() - 7.5f;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_605 a2 = this;
UiSupport_605 class_605 = a2;
        super.d(a);
        if (!class_605.i) {
            a2.i = 1;
            a2.f = (Boolean)a2.d.L();
            UiSupport_605 class_6052 = a2;
            class_6052.I.L(class_6052.f ? 1.0f : 0.0f);
        }
        if ((Boolean)a2.d.L() != a2.f) {
            a2.f = (Boolean)a2.d.L();
            UiSupport_605 class_6053 = a2;
            class_6053.I.L(class_6053.f ? 1.0f : 0.0f, 200.0f, RenderSupport_123.l);
        }
        UiSupport_605 class_6054 = a2;
        class_6054.I.L(a.i);
        UiSupport_605 class_6055 = a2;
        class_6054.e.L(a.i, class_6055.h, class_6055.H);
    }

    public UiSupport_605(BooleanSetting class_051) {
        UiSupport_605 a;
        OnyxListener_001 a2 = class_051;
        UiSupport_605 class_605 = a = this;
        super((Setting)a2);
        UiSupport_605 class_6052 = a;
        class_605.e = new UiSupport_545();
        class_605.I = new RenderSupport_121(0.0f);
        class_605.d = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_605 a4 = this;
if (!a4.i() || 0 != 0 || !a4.L((float)a2, (float)a)) {
            return false;
        }
        a4.d.D();
        return 1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        void a;
        UiSupport_605 class_605 = this;
RenderSupport_103 a2 = a.e;
        UiSupport_605 class_6052 = class_605;
        UiSupport_605 class_6053 = class_605;
        float f3 = class_6053.m();
        float f4 = class_6053.B();
        float f5 = class_6052.I.L();
        class_6052.L((UiSupport_548)a, f3 - 10.0f - class_605.f);
        class_6052.e.L(a2, f3 - 6.0f, f4 - 6.0f, 27.0f, 27.0f, Float.MAX_VALUE, class_605.L(a.L().d()));
        if (f5 > 0.01f) {
            float a3 = (1.0f - f5) * 15.0f / 2.0f;
            a2.D(f3 + 0, f4 + 0, 15.0f, 15.0f, 4.0f, class_605.L(a.L().E()));
        }
        if (f5 < 0.99f) {
            a2.L(f3, f4, 15.0f, 15.0f, 4.0f, 1.5f, class_605.L(a.L().F()));
        }
        if (f5 > 0.15f) {
            float a3 = Math.clamp((f5 - 0.15f) / 0.85f, 0.0f, 1.0f);
            UiSupport_546.d(a2, f3 + 7.5f, f4 + 7.5f, 9.099999f, class_605.L(ThemeSupport_059.L(a.L().h(), 0)));
        }
    }
}

