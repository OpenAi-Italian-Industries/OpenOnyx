/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_572;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UiSupport_563
extends UiSupport_572 {
    private final UiSupport_545 g;
    final public static float M = 26.0f;
    private final static float L = 9.0f;
    private final static float j = 16.0f;
    private final static float m = 12.0f;
    private final static float h = 7.0f;
    private final UiSupport_545 l;
    private final static float I = 2.0f;
    private final static String f = "Search modules";
    private final static float H = 22.0f;

    public UiSupport_563(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        UiSupport_563 a2 = this;
        UiSupport_563 class_563 = a2;
        class_563.g = new UiSupport_545();
        a2.l = new UiSupport_545();
        a2.i = 26.0f;
        a2.k.L(a);
        a2.k.d(() -> {
            UiSupport_563 a;
a.D(0 != 0);
        });
        a2.k.L(() -> {
            UiSupport_563 a;
if (!a.l()) {
                a.D(5 >> 3);
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(float f2, float f3) {
        void a;
        float a2 = f2;
        UiSupport_563 a3 = this;
if (!a3.k.L() && Math.abs(0 - a3.F()) <= 11.0f && a3.L(0, (float)a)) {
            return 5 >> 2;
        }
        return false;
    }

    public boolean l() {
        UiSupport_563 a;
return a.k.d();
    }

    @Override
    protected float h() {
        UiSupport_563 a;
UiSupport_563 class_563 = a;
        if (a.k.L()) {
            return (float)(class_563.f + a.e - 9.0f);
        }
        return class_563.F() - 16.0f;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_563 a2 = this;
UiSupport_563 class_563 = a2;
        super.d(a);
        boolean bl = class_563.d(a.H, a.f);
        class_563.g.L(a.i, (a2.h != false && !bl ? 1 : 0) != 0, false);
        a2.l.L(a.i, bl, 0 != 0);
    }

    @Override
    protected float l() {
        UiSupport_563 a;
return a.e() + 16.0f - 2.0f + 7.0f;
    }

    private float e() {
        UiSupport_563 a;
return (float)(a.f + 9.0f - 2.0f);
    }

    public boolean d(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_563 a2 = this;
UiSupport_563 class_563 = a2;
        class_563.D(--1 != 0);
        return class_563.k.L(a);
    }

    public String d() {
        UiSupport_563 a;
return a.k.L();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_563 a4 = this;
if (a3 == 0 && a4.d((float)a2, (float)a)) {
            boolean bl = 5 >> 2;
            a4.l();
            a4.D(bl);
            return bl;
        }
        return super.L((float)a2, (float)a, a3);
    }

    public static float k() {
return 26.0f;
    }

    @Override
    protected RenderSupport_128 L() {
return ThemeSupport_057.L();
    }

    private float F() {
        UiSupport_563 a;
UiSupport_563 class_563 = a;
        return (float)(class_563.f + class_563.e - 9.0f + 2.0f - 8.0f);
    }

    @Override
    public void L(UiSupport_548 class_548) {
        float f2;
        UiSupport_548 a = class_548;
        UiSupport_563 a2 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_563 class_563 = a2;
        UiSupport_563 class_5632 = a2;
        class_103.D((float)class_563.f, class_5632.d, class_5632.e, a2.i, Float.MAX_VALUE, a.L().O());
        UiSupport_563 class_5633 = a2;
        UiSupport_563 class_5634 = a2;
        class_563.g.L(class_103, (float)class_5633.f, class_5633.d, class_5634.e, class_5634.i, Float.MAX_VALUE, a.L().d());
        float f3 = class_563.a.L();
        if (f2 > 0.01f) {
            UiSupport_563 class_5635 = a2;
            UiSupport_563 class_5636 = a2;
            class_103.L((float)class_5635.f, class_5635.d, class_5636.e, class_5636.i, Float.MAX_VALUE, 1.5f, ThemeSupport_059.L(a.L().E(), f3));
        }
        UiSupport_563 class_5637 = a2;
        f3 = class_5637.d + class_5637.i / 2.0f;
        UiSupport_546.L(class_103, a2.e() + 8.0f, f3, 16.0f, a.L().F());
        if (a2.k.L() && !a2.i()) {
            class_103.l(a2.L(), f, a2.l(), f3, ThemeSupport_059.L(a.L().F(), 0.7f));
        }
        UiSupport_563 class_5638 = a2;
        UiSupport_548 class_5482 = a;
        class_5638.L(class_5482, f3, 12.0f, class_5482.L().d());
        if (!class_5638.k.L()) {
            UiSupport_563 class_5639 = a2;
            RenderSupport_103 class_1032 = class_103;
            class_5639.l.L(class_1032, a2.F() - 11.0f, f3 - 11.0f, 22.0f, 22.0f, Float.MAX_VALUE, a.L().d());
            UiSupport_546.D(class_1032, class_5639.F(), f3, 16.0f, a.L().F());
        }
        UiSupport_548 class_5483 = a;
        if (a2.d(class_5483.H, class_5483.f)) {
            class_103.h();
            return;
        }
        if (a2.h != false) {
            class_103.l();
        }
    }
}

