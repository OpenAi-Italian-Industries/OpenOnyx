/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;

public class UiSupport_587
extends UiSupport_549 {
    private final static float k = 10.0f;
    private final RenderSupport_124 g;
    final public static float M = 22.0f;
    private final RenderSupport_124 L;
    private final RenderSupport_121 j;
    final public static float m = 38.0f;
    private final RenderSupport_121 h;
    private final static float l = 6.0f;
    private final static float I = 8.5f;
    private boolean d;
    private final Consumer<Boolean> i;
    private boolean f;
    private final BooleanSupplier e;

    /*
     * WARNING - void declaration
     */
    public UiSupport_587(BooleanSupplier booleanSupplier, Consumer<Boolean> consumer) {
        void a;
        UiSupport_587 a2;
        Consumer<Boolean> a3 = consumer;
        UiSupport_587 class_587 = a2 = this;
        UiSupport_587 class_5872 = a2;
        UiSupport_587 class_5873 = a2;
        a2.h = new RenderSupport_121(0.0f);
        class_5873.j = new RenderSupport_121(6.0f);
        a2.g = new RenderSupport_124(0);
        a2.L = new RenderSupport_124(0);
        class_5872.e = a;
        class_5872.i = a3;
        class_587.e = (BooleanSupplier)38.0f;
        class_587.i = (Consumer<Boolean>)22.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        void a;
        UiSupport_587 class_587 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_587 class_5872 = class_587;
        UiSupport_587 class_5873 = class_587;
        int n = class_587.d + class_5873.i / 2.0f;
        Object a2 = class_5873.e - 22.0f;
        a2 = class_5872.f + 11.0f + a2 * class_587.h.L();
        float f2 = class_5872.j.L();
        UiSupport_587 class_5874 = class_587;
        UiSupport_587 class_5875 = class_587;
        class_103.D((float)class_5874.f, (float)class_5874.d, (float)class_5875.e, (float)class_5875.i, Float.MAX_VALUE, class_587.g.L());
        if (class_5872.h.L() < 0.999f) {
            UiSupport_587 class_5876 = class_587;
            UiSupport_587 class_5877 = class_587;
            class_103.L((float)class_5876.f, (float)class_5876.d, (float)class_5877.e, (float)class_5877.i, Float.MAX_VALUE, 1.5f, ThemeSupport_059.L(a.L().e(), 1.0f - class_587.h.L()));
        }
        if (class_587.h != false) {
            UiSupport_587 class_5878;
            int n2;
            void v6 = a;
            if (class_587.e.getAsBoolean()) {
                n2 = v6.L().E();
                class_5878 = class_587;
            } else {
                n2 = v6.L().d();
                class_5878 = class_587;
            }
            class_103.L(0.0f, 0.0f, 14.0f, ThemeSupport_059.L(n2, class_5878.H ? 0.1f : 0.08f));
        }
        class_103.L(0.0f, 0.0f, f2, class_587.L.L());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_587 a4 = this;
if (a3 != 0 || !a4.L((float)a2, (float)a)) {
            return false;
        }
        a4.H = 1;
        a4.i.accept((!a4.e.getAsBoolean() ? 1 : 0) != 0);
        return 5 >> 2;
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        int a = 0;
        UiSupport_587 a2 = this;
a2.H = 5 >> 3;
        return a2.H;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        float f2;
        int n;
        void a;
        UiSupport_587 class_587 = this;
UiSupport_587 class_5872 = class_587;
        super.d((UiSupport_548)a);
        boolean a2 = class_5872.e.getAsBoolean();
        void v1 = a;
        int n2 = a2 ? v1.L().E() : v1.L().n();
        void v2 = a;
        int n3 = n = a2 ? v2.L().h() : v2.L().e();
        if (!class_587.d) {
            class_587.d = 1;
            class_587.f = a2;
            class_587.h.L(a2 ? 1.0f : 0.0f);
            class_587.j.L(a2 ? 8.5f : 6.0f);
            class_587.g.L(n2);
            class_587.L.L(0);
        }
        if (a2 != class_587.f) {
            class_587.f = a2;
            class_587.h.L(a2 ? 1.0f : 0.0f, 300.0f, RenderSupport_123.l);
        }
        UiSupport_587 class_5873 = class_587;
        class_5873.g.L(n2, 300.0f, RenderSupport_123.f);
        class_587.L.L(0, 300.0f, RenderSupport_123.f);
        float f3 = class_5873.H ? 10.0f : (f2 = a2 ? 8.5f : 6.0f);
        if (class_587.j.d() != f2) {
            class_587.j.L(f2, 150.0f, RenderSupport_123.f);
        }
        UiSupport_587 class_5874 = class_587;
        class_5874.h.L(a.i);
        class_5874.j.L(a.i);
        class_5874.g.L(a.i);
        class_5874.L.L(a.i);
    }
}

