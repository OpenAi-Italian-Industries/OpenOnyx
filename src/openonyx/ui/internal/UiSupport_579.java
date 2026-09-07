/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.ColorSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_111;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;
import openonyx.ui.internal.UiMode_599;

public class UiSupport_579
extends UiSupport_596 {
    private final UiSupport_545 r;
    private final static float W = 6.0f;
    private float P;
    private final RenderSupport_121 V;
    private final static float R = 1.0f;
    private boolean p;
    private float t;
    private final ColorSetting b;
    private final static int[] E;
    private final static float F = 3.0f;
    private final static float G = 11.0f;
    private final UiSupport_545 A;
    private final static float K = 15.0f;
    private final static float B = 12.0f;
    private final static float C = 120.0f;
    private final static float J = 0.32f;
    private float D;
    private final static float c = 9.0f;
    private final static float a = 13.0f;
    private final RenderSupport_121 k;
    private int g;
    private final static float M = 15.0f;
    private UiMode_599 L;
    private final static float j = 14.0f;
    private final static float m = 18.0f;

    /*
     * WARNING - void declaration
     */
    private boolean D(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_579 a3 = this;
if (a >= a3.f) {
            UiSupport_579 class_579 = a3;
            if (a < class_579.f + class_579.e && 0 >= a3.d && 0 < a3.d + a3.A()) {
                return 3 >> 1;
            }
        }
        return false;
    }

    private float K() {
        UiSupport_579 a;
return a.e - 30.0f * a.B() - 3.0f;
    }

    private float b() {
        UiSupport_579 a;
return a.m() + 18.0f + 12.0f;
    }

    private float C() {
        UiSupport_579 a;
UiSupport_579 class_579 = a;
        return class_579.f + class_579.e - 11.0f - 8.0f - 9.0f;
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_579 class_579 = this;
UiSupport_579 class_5792 = class_579;
        float a = class_5792.A();
        float a2 = class_5792.h() ? 29.0f : 0.0f;
        float f2 = a;
        return f2 + (class_579.l() - class_579.d + 120.0f + 0 + 6.0f - f2) * class_579.V.L();
    }

    private void D() {
        UiSupport_579 class_579 = this;
if (class_579.b.d() == class_579.g) {
            return;
        }
        float[] fArray = ThemeSupport_064.L(class_579.b.d());
        Object a = fArray;
        if (fArray[1] > 0.001f) {
            class_579.D = (float)a[0];
        }
        UiSupport_579 class_5792 = class_579;
        class_5792.P = (float)a[1];
        class_5792.t = (float)a[2];
        class_579.g = class_579.b.d();
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(float f2, float f3) {
        void a;
        UiSupport_579 class_579 = this;
float a2 = class_579.G();
        if (a >= class_579.f) {
            void a3;
            UiSupport_579 class_5792 = class_579;
            if (a < class_5792.f + class_5792.e && a3 >= 0 && a3 < 15.0f) {
                return 1 != 0;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void l(UiSupport_548 class_548) {
        float f2;
        void a;
        UiSupport_579 class_579 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_579 class_5792 = class_579;
        float a2 = class_579.l();
        float f3 = f2 = class_5792.b();
        class_103.D(f3, 0, 18.0f, 120.0f, Float.MAX_VALUE, class_579.L(a.L().n()));
        UiSupport_579 class_5793 = class_579;
        UiSupport_579 class_5794 = class_579;
        int n = 0;
        class_103.L(f3, (float)0, 18.0f, 120.0f, Float.MAX_VALUE, class_5793.L(class_5793.b.I()), class_5794.L(class_5794.b.I()), n, n);
        class_5792.L((UiSupport_548)a, f2, 0 + (1.0f - (float)ThemeSupport_064.d(class_579.b.d()) / 255.0f) * 120.0f);
    }

    private boolean h() {
        UiSupport_579 a;
return a.b.h();
    }

    private float G() {
        UiSupport_579 a;
return a.l() + 120.0f + 14.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void h(UiSupport_548 class_548) {
        UiSupport_548 a3 = class_548;
        UiSupport_579 a2 = this;
UiSupport_579 class_579 = a2;
        float f2 = class_579.l();
        switch (class_579.L.ordinal()) {
            case 1: {
                UiSupport_579 class_5792 = a2;
                class_5792.P = Math.clamp((a3.H - a2.f) / a2.K(), 0.0f, 1.0f);
                class_5792.t = 1.0f - Math.clamp((a3.f - f2) / 120.0f, 0.0f, 1.0f);
                a2.d();
                return;
            }
            case 2: {
                a2.D = Math.clamp((a3.f - f2) / 120.0f, 0.0f, 1.0f) * 360.0f;
                a2.d();
                return;
            }
            case 3: {
                float a3 = 1.0f - Math.clamp((a3.f - f2) / 120.0f, 0.0f, 1.0f);
                UiSupport_579 class_5793 = a2;
                class_5793.g = ThemeSupport_064.L(class_5793.b.d(), a3);
                class_5793.b.i(a2.g);
                return;
            }
        }
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        float a232 = f2;
        UiSupport_579 a = this;
boolean a232 = a.L != UiMode_599.i ? 5 >> 2 : false;
        a.L = UiMode_599.i;
        return a232;
    }

    private float m() {
        UiSupport_579 a;
return a.f + a.K() + 12.0f;
    }

    private void d() {
        int a;
        UiSupport_579 class_579 = this;
UiSupport_579 class_5792 = class_579;
        UiSupport_579 class_5793 = class_579;
        class_579.g = a = ThemeSupport_064.L(class_579.D, class_5792.P, class_5793.t, ThemeSupport_064.d(class_5793.b.d()));
        class_5792.b.i(0);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_579 a4 = this;
if (!a4.i() || a2 != false) {
            return false;
        }
        if (a4.D(0.0f, a3)) {
            a4.p = !a4.p ? 1 : 0;
            UiSupport_579 class_579 = a4;
            class_579.V.L(class_579.p ? 1.0f : 0.0f, 300.0f, RenderSupport_123.l);
            return 1 != 0;
        }
        if (a4.V.L() < 0.5f) {
            return 0 != 0;
        }
        if (a4.h() && a4.d(0.0f, a3)) {
            UiSupport_579 class_579 = a4;
            class_579.b.d((!class_579.b.d() ? 1 : 0) != 0);
            return --1 != 0;
        }
        if (a4.b.d()) {
            return 3 >> 2;
        }
        if (a4.L(0.0f, a3, a4.f, a4.K())) {
            a4.L = UiMode_599.H;
            return true;
        } else if (a4.L(0.0f, a3, a4.m(), 18.0f)) {
            a4.L = UiMode_599.e;
            return true;
        } else {
            if (!a4.b.D()) return false;
            UiSupport_579 class_579 = a4;
            if (!class_579.L(0.0f, a3, class_579.b(), 18.0f)) return false;
            a4.L = UiMode_599.d;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private void I(UiSupport_548 class_548) {
        void a;
        UiSupport_579 class_579 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_579 class_5792 = class_579;
        float a2 = class_5792.G();
        UiSupport_579 class_5793 = class_579;
        float f2 = class_5792.f + class_5793.e - 15.0f;
        float f3 = 0.0f;
        float f4 = 7.5f;
        float f5 = class_5793.k.L();
        RenderSupport_103 class_1032 = class_103;
        class_5792.A.L(class_1032, class_579.f - 6.0f, -6.0f, class_579.e + 12.0f, 27.0f, 8.0f, class_579.L(a.L().d()));
        class_1032.l(ThemeSupport_057.I, "Use accent colour", class_579.f, f4, class_579.L(a.L().d()));
        if (f5 > 0.01f) {
            a2 = (1.0f - f5) * 15.0f / 2.0f;
            class_103.D(f2 + 0, f3 + 0, 15.0f, 15.0f, 4.0f, class_579.L(a.L().E()));
        }
        if (f5 < 0.99f) {
            class_103.L(f2, f3, 15.0f, 15.0f, 4.0f, 1.5f, class_579.L(a.L().F()));
        }
        if (f5 > 0.15f) {
            a2 = Math.clamp((f5 - 0.15f) / 0.85f, 0.0f, 1.0f);
            UiSupport_546.d(class_103, f2 + 7.5f, f3 + 7.5f, 9.099999f, class_579.L(ThemeSupport_059.L(a.L().h(), 0)));
        }
    }

    static {
        int[] nArray = new int[7];
        nArray[0] = -65536;
        nArray[1] = -256;
        nArray[2] = -16711936;
        nArray[3] = -16711681;
        nArray[4] = -16776961;
        nArray[5] = -65281;
        nArray[6] = -65536;
        E = nArray;
    }

    private float B() {
        UiSupport_579 a;
if (a.b.D()) {
            return 2.0f;
        }
        return 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void d(UiSupport_548 var1_1) {
        a = var1_1;
        a = this;
v0 = a;
        super.d(a);
        v0.V.L(a.i);
        v1 = a;
        v0.r.L(a.i, a.D(v1.H, v1.f), 3 >> 2);
        if (!v0.h() || !(a.V.L() > 0.5f)) ** GOTO lbl-1000
        v2 = a;
        if (a.d(v2.H, v2.f)) {
            v3 = 2 ^ 3;
        } else lbl-1000:
        // 2 sources

        {
            v3 = 0;
        }
        var2_2 = v3;
        v4 = a;
        v4.A.L(a.i, (boolean)var2_2, (boolean)(3 & 4));
        if (v4.k.d() != (a.b.d() != false ? 1.0f : 0.0f)) {
            v5 = a;
            v5.k.L(v5.b.d() != false ? 1.0f : 0.0f, 200.0f, RenderSupport_123.l);
        }
        v6 = a;
        v6.k.L(a.i);
        if (v6.L == UiMode_599.i) {
            a.D();
            return;
        }
        a.h(a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        UiSupport_579 class_579 = this;
float a5 = class_579.l();
        if (a4 >= a3 && a4 < a3 + a2 && a >= 0 && a < 120.0f) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        void a;
        float a22 = f2;
        UiSupport_579 a3 = this;
RenderSupport_103 a22 = a.e;
        UiSupport_579 class_579 = a3;
        UiSupport_579 class_5792 = a3;
        UiSupport_579 class_5793 = a3;
        class_579.r.L(a22, class_5792.f - 6.0f, class_5793.d, class_5793.e + 12.0f, a3.A(), 8.0f, a3.L(a.L().d()));
        String string = class_5792.b.i();
        float f3 = class_579.C() - 9.0f - 8.0f;
        class_579.L((UiSupport_548)a, f3 - a22.L(ThemeSupport_057.C, string) - 12.0f - a3.f);
        RenderSupport_103 class_103 = a22;
        RenderSupport_103 class_1032 = a22;
        a22.d(ThemeSupport_057.C, string, f3, a3.I(), a3.L(a.L().F()));
        UiSupport_579 class_5794 = a3;
        class_1032.L(a3.C(), a3.I(), 9.0f, class_5794.L(class_5794.b.h()));
        class_103.L(a3.C(), a3.I(), 9.0f, 1.0f, a3.L(a.L().e()));
        class_1032.F();
        UiSupport_579 class_5795 = a3;
        class_103.L().d(class_5795.f + class_5795.e - 5.5f, a3.I());
        a22.L().L((float)Math.PI * a3.V.L());
        RenderSupport_103 class_1033 = a22;
        UiSupport_546.i(class_1033, 0.0f, 0.0f, 11.0f, a3.L(a.L().F()));
        class_1033.k();
        float f4 = a3.V.L();
        if (f4 <= 0.01f) {
            return;
        }
        RenderSupport_103 class_1034 = a22;
        UiSupport_579 class_5796 = a3;
        class_1034.d(a3.f - 6.0f, class_5796.d, class_5796.e + 12.0f, a3.i);
        class_1034.L(f4);
        a22.L(1.0f - 0.68f * a3.k.L());
        UiSupport_579 class_5797 = a3;
        class_5797.D((UiSupport_548)a);
        class_5797.i((UiSupport_548)a);
        if (class_5797.b.D()) {
            a3.l((UiSupport_548)a);
        }
        a22.e();
        if (a3.h()) {
            a3.I((UiSupport_548)a);
        }
        RenderSupport_103 class_1035 = a22;
        class_1035.e();
        class_1035.L();
    }

    /*
     * WARNING - void declaration
     */
    private void i(UiSupport_548 class_548) {
        int a;
        void a2;
        UiSupport_579 class_579 = this;
RenderSupport_103 class_103 = a2.e;
        UiSupport_579 class_5792 = class_579;
        float f2 = class_5792.l();
        float f3 = class_5792.m();
        float f4 = 20.0f;
        float f5 = 9.0f;
        int n = 0;
        while (n < 6) {
            float f6 = f2 + 0.0f * f4;
            float f7 = f6 + f4 + (0 == 5 ? 0.0f : 1.0f);
            float f8 = 0 == 0 ? f5 : 0.0f;
            float f9 = 0 == 5 ? f5 : 0.0f;
            int n2 = E[0];
            int n3 = ThemeSupport_064.L((f7 - f2) / 120.0f * 360.0f, 1.0f, 1.0f, 255);
            float f10 = f6;
            float f11 = f8;
            float f12 = f9;
            class_103.L(f3, f10, 18.0f, f7 - f10, f11, f11, f12, f12, class_579.L(n2), class_579.L(n2), class_579.L(n3), class_579.L(n3));
            n = ++a;
        }
        class_579.L((UiSupport_548)a2, f3, f2 + class_579.D / 360.0f * 120.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, float f2, float f3) {
        void a;
        void a2;
        void a3;
        OnyxListener_001 a4;
        UiSupport_579 class_579 = this;
OnyxListener_001 interface_001 = a4 = a3.e;
        ((RenderSupport_103)interface_001).D((float)(a2 - 3.0f), (float)(a - 3.0f), 24.0f, 6.0f, Float.MAX_VALUE, class_579.L(-1));
        ((RenderSupport_103)interface_001).L((float)(a2 - 3.0f), (float)(a - 3.0f), 24.0f, 6.0f, Float.MAX_VALUE, 1.0f, class_579.L(ThemeSupport_059.L(a3.L().i(), 0.35f)));
    }

    /*
     * WARNING - void declaration
     */
    private void D(UiSupport_548 class_548) {
        void a22;
        UiSupport_579 class_579 = this;
RenderSupport_103 class_103 = a22.e;
        UiSupport_579 class_5792 = class_579;
        float a = class_5792.l();
        float f2 = class_5792.K();
        int n = ThemeSupport_064.L(class_5792.D, 1.0f, 1.0f, 255);
        RenderSupport_103 class_1032 = class_103;
        UiSupport_579 class_5793 = class_579;
        class_103.L(class_5793.f, (float)0, f2, 120.0f, 12.0f, class_579.L(-1), class_579.L(0), class_579.L(0), class_579.L(-1));
        int n2 = 0;
        class_1032.L(class_5793.f, (float)0, f2, 120.0f, 12.0f, n2, n2, class_579.L(-16777216), class_579.L(-16777216));
        class_1032.L(class_579.f, 0, f2, 120.0f, 12.0f, 1.0f, class_579.L(a22.L().P()));
        float a22 = class_5792.f + class_579.P * f2;
        RenderSupport_103 class_1033 = class_103;
        class_1033.L(a22, a += (1.0f - class_579.t) * 120.0f, 6.0f, class_579.L(-1));
        UiSupport_579 class_5794 = class_579;
        class_1033.L(a22, (float)0, 4.5f, class_5794.L(class_5794.b.I()));
    }

    public UiSupport_579(ColorSetting class_048) {
        UiSupport_579 a;
        OnyxListener_001 a2 = class_048;
        UiSupport_579 class_579 = a = this;
        super((Setting)a2);
        UiSupport_579 class_5792 = a;
        a.V = new RenderSupport_121(0.0f);
        class_5792.r = new UiSupport_545();
        a.A = new UiSupport_545();
        a.k = new RenderSupport_121(0.0f);
        a.L = UiMode_599.i;
        class_579.b = a2;
        float[] fArray = ThemeSupport_064.L(((ColorSetting)a2).d());
        a.D = fArray[0];
        class_579.P = fArray[1];
        a.t = fArray[2];
        a.g = ((ColorSetting)a2).d();
        a.k.L(((ColorSetting)a2).d() ? 1.0f : 0.0f);
    }
}

