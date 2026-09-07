/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui;

import lombok.Generated;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class UiSupport_553
extends UiSupport_549 {
    protected int j;
    protected float m;
    final protected RenderSupport_121 h;
    final protected RenderSupport_121 l;
    protected float I;
    private float H;

    /*
     * WARNING - void declaration
     */
    protected void h(UiSupport_548 class_548) {
        void a;
        UiSupport_553 class_553 = this;
UiSupport_549 a2 = class_553.L();
        if (a2 == null) {
            return;
        }
        a.e.L(a2.d(), a2.D(), a2.i(), a2.L(), class_553.I(), 2.0f, a.L().E());
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(int n, int n2) {
        void a;
        int a2 = -35;
        UiSupport_553 a3 = this;
if (a3.l.isEmpty()) {
            return 5 >> 3;
        }
        int n3 = Math.max(1, a3.L());
        if ((a2 += a * n3) == 0) {
            return 0 != 0;
        }
        a3.j = a3.j < 0 ? (0 > 0 ? 0 : a3.l.size() - 1) : Math.clamp((long)(a3.j + 0), 0, a3.l.size() - 1);
        boolean bl = --1 != 0;
        a3.d();
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, double d) {
        float f4;
        void a;
        void a2;
        float a3 = f2;
        UiSupport_553 a4 = this;
if (!a4.L(a3, (float)a2)) {
            return super.L(a3, (float)a2, 0.0);
        }
        UiSupport_553 class_553 = a4;
        a3 = Math.max(0.0f, class_553.I - class_553.i);
        if (f4 <= 0.0f) {
            return 0 != 0;
        }
        a4.m = Math.clamp(a4.m - 0.0f, 0.0f, a3);
        a4.H = 0.0f;
        return 1 != 0;
    }

    @Generated
    public int d() {
        UiSupport_553 a;
return a.j;
    }

    public void D() {
a.j = -1;
    }

    protected int L() {
return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        void a;
        UiSupport_553 class_553 = this;
UiSupport_553 class_5532 = class_553;
        class_553.i((UiSupport_548)a);
        UiSupport_553 class_5533 = class_553;
        float a22 = Math.max(0.0f, class_5533.I - class_5533.i);
        class_553.m = Math.clamp(class_5532.m, 0.0f, 0);
        if (class_5532.h.d() != class_553.m) {
            UiSupport_553 class_5534 = class_553;
            class_5534.h.L(class_5534.m, 250.0f, RenderSupport_123.i);
        }
        UiSupport_553 class_5535 = class_553;
        if (class_5535.j >= class_5535.l.size()) {
            class_553.j = class_553.l.isEmpty() ? -1 : class_553.l.size() - 1;
        }
        UiSupport_553 class_5536 = class_553;
        class_5536.h.L(a.i);
        class_5536.H += a.i;
        boolean a22 = 0 > 0.0f && (class_553.h != false || class_553.H < 900.0f);
        if (class_553.l.d() != (a22 ? 1.0f : 0.0f)) {
            class_553.l.L(a22 ? 1.0f : 0.0f, 200.0f, RenderSupport_123.f);
        }
        UiSupport_553 class_5537 = class_553;
        void v6 = a;
        class_5537.l.L(v6.i);
        super.d((UiSupport_548)v6);
    }

    /*
     * WARNING - void declaration
     */
    private void I(UiSupport_548 class_548) {
        void a;
        UiSupport_553 class_553 = this;
float f2 = class_553.l.L();
        UiSupport_553 class_5532 = class_553;
        float a2 = Math.max(0.0f, class_5532.I - class_5532.i);
        if (f2 <= 0.01f || 0 <= 0.0f) {
            return;
        }
        UiSupport_553 class_5533 = class_553;
        float f3 = class_5533.i - 8.0f;
        UiSupport_553 class_5534 = class_553;
        float f4 = Math.max(24.0f, f3 * (class_5534.i / class_5534.I));
        a2 = class_5533.d + 4.0f + (f3 - f4) * (class_553.h.L() / 0);
        UiSupport_553 class_5535 = class_553;
        a.e.D(class_5535.f + class_5535.e - 7.0f, 0, 4.0f, f4, Float.MAX_VALUE, ThemeSupport_059.L(a.L().P(), f2 * 0.8f));
    }

    public UiSupport_553() {
        UiSupport_553 a;
        UiSupport_553 class_553 = a;
        UiSupport_553 class_5532 = a;
        class_553.h = new RenderSupport_121(0.0f);
        class_553.l = new RenderSupport_121(0.0f);
        class_553.j = -1;
    }

    private void d() {
        UiSupport_553 class_553 = this;
UiSupport_549 a22 = class_553.L();
        if (a22 == null) {
            return;
        }
        float f2 = a22.D() + class_553.h.L() - class_553.d;
        float a22 = f2 + a22.L();
        if (f2 < class_553.m) {
            class_553.m = f2;
        }
        UiSupport_553 class_5532 = class_553;
        if (0 > class_5532.m + class_5532.i) {
            class_553.m = 0 - class_553.i;
        }
        class_553.H = 0.0f;
    }

    protected float I() {
return 12.0f;
    }

    protected abstract void i(UiSupport_548 var1);

    public UiSupport_549 L() {
        UiSupport_553 a;
if (a.j >= 0) {
            UiSupport_553 class_553 = a;
            if (class_553.j < class_553.l.size()) {
                UiSupport_553 class_5532 = a;
                return (UiSupport_549)class_5532.l.get(class_5532.j);
            }
        }
        return null;
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_553 a2 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_553 class_553 = a2;
        UiSupport_553 class_5532 = a2;
        UiSupport_553 class_5533 = a2;
        class_103.d(class_5532.f, class_5532.d, class_5533.e, class_5533.i);
        Object object = a;
        a2.D(a);
        super.L((UiSupport_548)object);
        class_553.h((UiSupport_548)object);
        class_103.L();
        class_553.I(a);
    }

    protected void D(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_553 a2 = this;
}
}

