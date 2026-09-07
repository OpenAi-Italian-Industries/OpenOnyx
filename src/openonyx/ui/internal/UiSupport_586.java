/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.NumberSetting;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_586
extends UiSupport_596 {
    private boolean c;
    private final static float a = 3.0f;
    private final static float k = 3.0f;
    private final static float g = 16.0f;
    private final static float M = 5.0f;
    private final RenderSupport_121 L;
    private final NumberSetting j;
    private final static float m = 3.0f;

    private double L() {
        UiSupport_586 a;
UiSupport_586 class_586 = a;
        if (a.j.L() > 0.0) {
            return class_586.j.L();
        }
        return (class_586.j.D() - a.j.i()) / 100.0;
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_586 a2 = this;
if (!a2.i() || !a2.h) {
            return false;
        }
        switch (a.D()) {
            case 203: {
                UiSupport_586 class_586 = a2;
                while (false) {
                }
                class_586.j.i((Double)class_586.j.L() - a2.L());
                return 3 >> 1;
            }
            case 205: {
                UiSupport_586 class_586 = a2;
                class_586.j.i((Double)class_586.j.L() + a2.L());
                return 1 != 0;
            }
        }
        return false;
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_586 a2 = this;
return a2.l() - a2.d + 3.0f + 6.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        float f3;
        float f4;
        void a;
        UiSupport_586 class_586 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_586 class_5862 = class_586;
        float a2 = class_103.L(ThemeSupport_057.C, class_5862.j.i());
        class_5862.L((UiSupport_548)a, class_586.e - 0 - 12.0f);
        UiSupport_586 class_5863 = class_586;
        UiSupport_586 class_5864 = class_586;
        class_103.d(ThemeSupport_057.C, class_5863.j.i(), class_5864.f + class_5864.e, class_586.I(), class_586.L(a.L().F()));
        UiSupport_586 class_5865 = class_586;
        a2 = class_5865.m();
        float f5 = (float)class_5865.j.d();
        f5 = class_5865.B() + class_586.G() * f5;
        float f6 = class_5863.L.L() / 2.0f;
        float f7 = f5 - f6 - 5.0f;
        if (f4 > class_586.f) {
            class_103.D(class_586.f, -1.5f, f7 - class_586.f, 3.0f, Float.MAX_VALUE, class_586.L(a.L().E()));
        }
        f7 = f5 + f6 + 5.0f;
        UiSupport_586 class_5866 = class_586;
        if (f3 < class_5866.f + class_5866.e) {
            UiSupport_586 class_5867 = class_586;
            float f8 = f7;
            class_103.D(f8, -1.5f, class_5867.f + class_5867.e - f8, 3.0f, Float.MAX_VALUE, class_586.L(a.L().n()));
        }
        if (class_586.h || class_586.c) {
            void a3;
            class_103.L(f5, (float)0, 11.0f, ThemeSupport_059.L(a.L().E(), (float)(a3 * (class_586.c ? 0.1f : 0.08f))));
        }
        class_103.D(f5 - f6, -8.0f, class_586.L.L(), 16.0f, Float.MAX_VALUE, class_586.L(a.L().E()));
    }

    @Override
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        float a = f2;
        UiSupport_586 a2 = this;
if (!a2.c) {
            return 5 >> 3;
        }
        a2.L((float)0);
        return --1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_586 a4 = this;
if (!a4.i() || a2 != false || !a4.L(0.0f, a3)) {
            return false;
        }
        if (a3 < a4.j()) {
            return 5 >> 3;
        }
        a4.c = 1;
        a4.L(0.0f);
        return 1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        float a;
        void a2;
        UiSupport_586 class_586 = this;
UiSupport_586 class_5862 = class_586;
        super.d((UiSupport_548)a2);
        float f2 = class_5862.c ? 1.5f : (a = class_586.h ? 4.5f : 3.0f);
        if (class_586.L.d() != 0) {
            class_586.L.L(0, 150.0f, RenderSupport_123.f);
        }
        UiSupport_586 class_5863 = class_586;
        class_5863.L.L(a2.i);
        if (class_5863.c) {
            class_586.L(a2.H);
        }
    }

    private float G() {
        UiSupport_586 a;
return a.e - 6.0f;
    }

    private void L(float f2) {
        float a = f2;
        UiSupport_586 a2 = this;
a2.j.L((0 - a2.B()) / a2.G());
    }

    public UiSupport_586(NumberSetting class_052) {
        OnyxListener_001 a = class_052;
        UiSupport_586 a2 = this;
        super((Setting)a);
        UiSupport_586 class_586 = a2;
        a2.L = new RenderSupport_121(3.0f);
        a2.j = a;
    }

    private float m() {
        UiSupport_586 a;
return a.l() + 1.5f;
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        float a22 = f2;
        UiSupport_586 a = this;
boolean a22 = a.c;
        a.c = 0;
        return a22;
    }

    private float B() {
        UiSupport_586 a;
return a.f + 3.0f;
    }
}

