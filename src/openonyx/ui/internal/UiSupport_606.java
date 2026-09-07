/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.ActionSetting;
import openonyx.render.RenderSupport_103;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_606
extends UiSupport_596 {
    private final static float m = 30.0f;
    private final ActionSetting H;
    private final UiSupport_545 e;

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_606 a2 = this;
return 30.0f;
    }

    public UiSupport_606(ActionSetting class_043) {
        OnyxListener_001 a = class_043;
        UiSupport_606 a2 = this;
        super((Setting)a);
        UiSupport_606 class_606 = a2;
        a2.e = new UiSupport_545();
        a2.H = a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_606 a4 = this;
if (!a4.i() || 0 != 0 || !a4.L((float)a2, (float)a)) {
            return false;
        }
        a4.H.d();
        return --1 != 0;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_606 a2 = this;
UiSupport_606 class_606 = a2;
        super.d(a);
        UiSupport_606 class_6062 = a2;
        class_606.e.L(a.i, class_6062.h, (boolean)class_6062.H);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        void a;
        UiSupport_606 class_606 = this;
RenderSupport_103 a2 = a.e;
        int a3 = class_606.L(a.L().D());
        UiSupport_606 class_6062 = class_606;
        a2.D(class_606.f, class_6062.d, (float)class_606.e, 30.0f, Float.MAX_VALUE, class_606.L(a.L().G()));
        UiSupport_606 class_6063 = class_606;
        class_6062.e.L(a2, class_6063.f, class_6063.d, (float)class_606.e, 30.0f, Float.MAX_VALUE, 0);
        UiSupport_606 class_6064 = class_606;
        UiSupport_606 class_6065 = class_606;
        a2.L(ThemeSupport_057.l, class_6064.H.i(), class_6065.f + class_6065.e / 2.0f, class_606.d + 15.0f, 0);
        if (class_6064.h && class_606.i()) {
            a2.h();
        }
    }
}

