/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.Range;
import openonyx.history.internal.RangeSetting;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_597
extends UiSupport_596 {
    private final RenderSupport_121 D;
    private final static float c = 5.0f;
    private int a;
    private int k;
    private float g;
    private final static float M = 16.0f;
    private final static float L = 3.0f;
    private final static float j = 3.0f;
    private final static float m = 3.0f;
    private final RenderSupport_121 H;
    private final RangeSetting e;

    private void L(float f2) {
        float a = f2;
        UiSupport_597 a2 = this;
UiSupport_597 class_597 = a2;
        double d = a2.e.D((0 - class_597.m()) / a2.B());
        UiSupport_597 class_5972 = a2;
        double d2 = class_597.k == 0 ? class_5972.e.d() : class_5972.e.h();
        a2.e.i(new Range(d2, d));
        if (d < d2) {
            a2.k = 0;
            return;
        }
        if (d > d2) {
            a2.k = 1;
        }
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_597 a2 = this;
return a2.l() - a2.d + 3.0f + 6.0f;
    }

    public UiSupport_597(RangeSetting class_045) {
        UiSupport_597 a;
        OnyxListener_001 a2 = class_045;
        UiSupport_597 class_597 = a = this;
        UiSupport_597 class_5972 = a;
        super((Setting)a2);
        UiSupport_597 class_5973 = a;
        class_5972.H = new RenderSupport_121(3.0f);
        class_5972.D = new RenderSupport_121(3.0f);
        class_597.a = class_5972.k = -1;
        class_597.e = a2;
    }

    private float G() {
        UiSupport_597 a;
return a.l() + 1.5f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        void a;
        float f3;
        float f4;
        float f5;
        void a2;
        UiSupport_597 class_597 = this;
RenderSupport_103 class_103 = a2.e;
        UiSupport_597 class_5972 = class_597;
        float a3 = class_103.L(ThemeSupport_057.C, class_5972.e.I());
        class_5972.L((UiSupport_548)a2, (float)(class_597.e - 0 - 12.0f));
        UiSupport_597 class_5973 = class_597;
        UiSupport_597 class_5974 = class_597;
        class_103.d(ThemeSupport_057.C, class_5973.e.I(), class_5974.f + class_5974.e, class_597.I(), class_597.L(a2.L().F()));
        UiSupport_597 class_5975 = class_597;
        a3 = class_5975.G();
        float f6 = class_5975.L(class_5975.e.h());
        float f7 = class_5975.L(class_5975.e.d());
        float f8 = class_5975.H.L() / 2.0f;
        float f9 = class_5973.D.L() / 2.0f;
        float f10 = f6 - f8 - 5.0f;
        if (f5 > class_597.f) {
            class_103.D(class_597.f, -1.5f, f10 - class_597.f, 3.0f, Float.MAX_VALUE, class_597.L(a2.L().n()));
        }
        f8 = f6 + f8 + 5.0f;
        f10 = f7 - f9 - 5.0f;
        if (f4 > f8) {
            float f11 = f8;
            class_103.D(f11, -1.5f, f10 - f11, 3.0f, Float.MAX_VALUE, class_597.L(a2.L().E()));
        }
        f8 = f7 + f9 + 5.0f;
        UiSupport_597 class_5976 = class_597;
        if (f3 < class_5976.f + class_5976.e) {
            UiSupport_597 class_5977 = class_597;
            float f12 = f8;
            class_103.D(f12, -1.5f, class_5977.f + class_5977.e - f12, 3.0f, Float.MAX_VALUE, class_597.L(a2.L().n()));
        }
        void v11 = a2;
        class_597.L((UiSupport_548)v11, (float)a, f6, 0, class_597.H.L(), 0);
        class_597.L((UiSupport_548)v11, (float)a, f7, 0, class_597.D.L(), 1);
    }

    private float m() {
        UiSupport_597 a;
return a.f + 3.0f;
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        float a22 = f2;
        UiSupport_597 a = this;
int a22 = a.k >= 0 ? 1 : 0;
        a.k = -1;
        return a22 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_121 class_121, int n) {
        void a;
        float a2;
        void a3;
        UiSupport_597 class_597 = this;
float f2 = class_597.k == a3 ? 1.5f : (a2 = class_597.a == a3 ? 4.5f : 3.0f);
        if (a.d() != 0) {
            a.L(0, 150.0f, RenderSupport_123.f);
        }
    }

    private float L(double a) {
        UiSupport_597 a2;
return a2.m() + a2.B() * (float)a2.e.L(a);
    }

    private double L() {
        UiSupport_597 a;
UiSupport_597 class_597 = a;
        if (a.e.L() > 0.0) {
            return class_597.e.L();
        }
        return (class_597.e.I() - a.e.i()) / 100.0;
    }

    private int L(float f2) {
        float a = f2;
        UiSupport_597 a2 = this;
UiSupport_597 class_597 = a2;
        float f3 = Math.abs(0 - class_597.L(class_597.e.h()));
        UiSupport_597 class_5972 = a2;
        a = Math.abs(0 - class_5972.L(class_5972.e.d()));
        if (f3 <= 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_597 a2 = this;
Object object = a;
        super.d(a);
        a2.a = -1;
        a2.g = ((UiSupport_548)object).H;
        if (Math.abs(((UiSupport_548)object).f - a2.G()) <= 16.0f) {
            Object object2 = a;
            UiSupport_597 class_597 = a2;
            float f2 = Math.abs(((UiSupport_548)object2).H - class_597.L(class_597.e.h()));
            UiSupport_597 class_5972 = a2;
            float f3 = Math.abs(((UiSupport_548)object2).H - class_5972.L(class_5972.e.d()));
            if (Math.min(f2, f3) <= 8.0f) {
                a2.a = f2 <= f3 ? 0 : 1;
            }
        }
        UiSupport_597 class_597 = a2;
        class_597.L(class_597.H, 0);
        class_597.L(class_597.D, 1);
        class_597.H.L(a.i);
        class_597.D.L(a.i);
        if (class_597.k >= 0) {
            a2.L(a.H);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_597 a4 = this;
if (!a4.i() || a2 != false || !a4.L(0.0f, 0)) {
            return false;
        }
        if (0 < a4.j()) {
            return 3 >> 2;
        }
        UiSupport_597 class_597 = a4;
        void v1 = a;
        class_597.k = class_597.L((float)v1);
        class_597.L((float)v1);
        return --1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, float f2, float f3, float f4, float f5, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        UiSupport_597 class_597 = this;
OnyxListener_001 a6 = a5.e;
        if (class_597.a == a4 || class_597.k == a4) {
            void a7;
            ((RenderSupport_103)a6).L((float)a3, (float)a2, 11.0f, ThemeSupport_059.L(a5.L().E(), (float)(a7 * (class_597.k == a4 ? 0.1f : 0.08f))));
        }
        ((RenderSupport_103)a6).D((float)(a3 - a / 2.0f), (float)(a2 - 8.0f), (float)a, 16.0f, Float.MAX_VALUE, class_597.L(a5.L().E()));
    }

    private float B() {
        UiSupport_597 a;
return (float)(a.e - 6.0f);
    }

    @Override
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        float a = f2;
        UiSupport_597 a2 = this;
if (a2.k < 0) {
            return 0 != 0;
        }
        a2.L((float)0);
        return 1 != 0;
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        double d;
        InputSupport_002 a = class_002;
        UiSupport_597 a2 = this;
if (!a2.i() || !a2.h) {
            return false;
        }
        switch (a.D()) {
            case 203: {
                while (false) {
                }
                double d2 = -a2.L();
                break;
            }
            case 205: {
                double d2 = a2.L();
                break;
            }
            default: {
                double d2 = 0.0;
            }
        }
        if (0.0 == 0.0) {
            return 0 != 0;
        }
        UiSupport_597 class_597 = a2;
        UiSupport_597 class_5972 = a2;
        if (class_597.L(class_597.g) == 0) {
            class_5972.e.L(a2.e.h() + 0.0);
        } else {
            class_5972.e.d(a2.e.d() + 0.0);
        }
        return true;
    }
}

