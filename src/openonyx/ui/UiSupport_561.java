/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui;

import lombok.Generated;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_568;
import openonyx.ui.internal.UiSupport_571;
import openonyx.ui.internal.UiSupport_602;

public class UiSupport_561
extends UiSupport_549 {
    private final static float M = 12.0f;
    private final UiSupport_602 L;
    private final static float j = 420.0f;
    private final UiSupport_568 m;
    private final static float h = 4.0f;
    private final static String l = "Proxy";
    private float I;
    private final UiSupport_571 f;
    private final static float H = 46.0f;

    private float l() {
        UiSupport_561 a;
return a.d + 23.0f;
    }

    public float h() {
        UiSupport_561 a;
UiSupport_561 class_561 = a;
        return class_561.d + class_561.i / 2.0f;
    }

    public void d() {
        UiSupport_561 a;
a.m.I();
    }

    @Override
    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_561 a2 = this;
return a2.m.L(a);
    }

    @Override
    protected void L() {
        UiSupport_561 a;
UiSupport_561 class_561 = a;
        UiSupport_561 class_5612 = a;
        class_561.L.L((float)(class_5612.f + a.e - 12.0f - 30.0f), a.l() - 15.0f, 30.0f, 30.0f);
        class_561.m.L((float)(a.f + 12.0f), a.d + 46.0f, a.e - 24.0f, a.i - 46.0f - 12.0f);
        UiSupport_561 class_5613 = a;
        UiSupport_561 class_5614 = a;
        class_5612.f.L((float)class_5613.f, class_5613.d, class_5614.e, class_5614.i);
    }

    @Generated
    public void L(float f2) {
        float a = f2;
        UiSupport_561 a2 = this;
a2.I = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_561 a4 = this;
return super.L((float)a2, a3, 0) || a4.L((float)a2, a3);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_561 a2 = this;
UiSupport_561 class_561 = a2;
        super.d(a);
        class_561.f.d(a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_561 a3 = this;
UiSupport_561 class_561 = a3;
        UiSupport_561 class_5612 = a3;
        class_561.L(Math.round((float)((a - a3.e) / 2.0f)), Math.round((0 - class_561.i) / 2.0f), class_5612.e, class_5612.i);
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_561 a2 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_561 class_561 = a2;
        RenderSupport_103 class_1032 = class_103;
        RenderSupport_103 class_1033 = class_103;
        UiSupport_561 class_5612 = a2;
        class_103.L(class_5612.I);
        UiSupport_561 class_5613 = a2;
        class_1033.d((float)class_5612.f, class_5613.d, class_5613.e, a2.i, 28.0f, 3);
        UiSupport_561 class_5614 = a2;
        RenderSupport_120.L(class_1033, (float)a2.f, class_5614.d, class_5614.e, a2.i, 28.0f, ThemeSupport_060.L(2, a.L()));
        class_1032.e();
        class_1032.L(a2.I);
        class_1032.l(ThemeSupport_057.I(), l, (float)(a2.f + 12.0f + 4.0f), a2.l(), a.L().d());
        super.L(a);
        class_103.e();
        class_561.f.L(a);
    }

    public UiSupport_561(Runnable runnable) {
        UiSupport_561 a;
        Runnable a2 = runnable;
        UiSupport_561 class_561 = a = this;
        UiSupport_561 class_5612 = a;
        UiSupport_561 class_5613 = a;
        class_5612.m = new UiSupport_568();
        class_5612.f = new UiSupport_571();
        class_5612.I = 1.0f;
        class_561.e = 420.0f;
        a.i = 46.0f + UiSupport_568.I() + 12.0f;
        class_561.L = new UiSupport_602("\ue5cd", a2);
        a.m.d(a.f::L);
        a.m.L((String string) -> {
            String a = string;
            UiSupport_561 a2 = this;
a2.f.L(a, "\ue001");
        });
        UiSupport_561 class_5614 = a;
        class_5614.l.add(class_5614.L);
        UiSupport_561 class_5615 = a;
        class_5615.l.add(class_5615.m);
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_561 a2 = this;
return a2.m.L(a);
    }

    public float I() {
        UiSupport_561 a;
UiSupport_561 class_561 = a;
        return (float)(class_561.f + class_561.e / 2.0f);
    }
}

