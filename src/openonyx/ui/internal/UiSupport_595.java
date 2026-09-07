/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.IntConsumer;
import lombok.Generated;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;

public class UiSupport_595
extends UiSupport_549 {
    private final RenderSupport_121 a;
    private final RenderSupport_121 k;
    private final UiSupport_545[] g;
    private final static float M = 14.0f;
    private final static float L = 5.0f;
    private boolean j;
    final public static float m = 30.0f;
    private final RenderSupport_121 h;
    private final String[] l;
    private final static float I = 2.0f;
    private int f;
    private final IntConsumer H;
    private int e;

    /*
     * WARNING - void declaration
     */
    private int L(float f2, float f3) {
        void a;
        float a2 = f2;
        UiSupport_595 a3 = this;
if (!a3.L(0, (float)a)) {
            return -1;
        }
        return Math.clamp((long)((int)((0 - a3.f - 2.0f) / a3.I())), 0, a3.l.length - 1);
    }

    public void L(int n) {
        int a = -35;
        UiSupport_595 a2 = this;
if (0 == a2.f) {
            return;
        }
        a2.f = 0;
        a2.h.L(a2.L(0), 300.0f, RenderSupport_123.l);
        a2.a.L(a2.I(), 300.0f, RenderSupport_123.l);
        a2.k.L(0.0f).L(19.0f, 300.0f, RenderSupport_123.l);
        a2.H.accept(0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        int a;
        void a2;
        UiSupport_595 class_595 = this;
RenderSupport_103 class_103 = a2.e;
        RenderSupport_103 class_1032 = class_103;
        UiSupport_595 class_5952 = class_595;
        UiSupport_595 class_5953 = class_595;
        class_1032.L(class_5952.f, class_5952.d, class_5953.e, class_5953.i, Float.MAX_VALUE, 1.0f, a2.L().e());
        class_1032.D(class_595.h.L(), class_595.d + 2.0f, class_595.a.L(), class_595.i - 4.0f, Float.MAX_VALUE, a2.L().G());
        int n = 0;
        while (n < class_595.l.length) {
            int n2 = 0 == class_595.f ? 1 : 0;
            class_595.g[0].L(class_103, class_595.L(0), class_595.d + 2.0f, class_595.I(), class_595.i - 4.0f, Float.MAX_VALUE, a2.L().d());
            void v4 = a2;
            int n3 = 0 != 0 ? v4.L().D() : v4.L().F();
            float f2 = 0 != 0 ? class_595.k.L() : 0.0f;
            UiSupport_595 class_5954 = class_595;
            float f3 = class_103.L(ThemeSupport_057.l, class_5954.l[0]);
            f3 = class_595.L(0) + (class_595.I() - f3 - f2) / 2.0f;
            float f4 = class_5954.d + class_595.i / 2.0f;
            if (f2 > 0.5f) {
                RenderSupport_103 class_1033 = class_103;
                class_1033.d(f3, class_595.d, f2, class_595.i);
                UiSupport_546.d(class_1033, f3 + 7.0f, f4, 14.0f, n3);
                class_1033.L();
            }
            class_103.l(ThemeSupport_057.l, class_595.l[0], f3 + f2, f4, n3);
            if (0 > 0 && 0 != class_595.f && -1 != class_595.f) {
                class_103.i(class_595.L(0), class_595.d + 2.0f, 1.0f, class_595.i - 4.0f, a2.L().e());
            }
            n = ++a;
        }
        if (class_595.e >= 0) {
            class_103.h();
        }
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_595(String[] stringArray, IntConsumer intConsumer) {
        void a;
        UiSupport_595 a2;
        IntConsumer a3 = intConsumer;
        UiSupport_595 class_595 = a2 = this;
        UiSupport_595 class_5952 = a2;
        UiSupport_595 class_5953 = a2;
        UiSupport_595 class_5954 = a2;
        class_5954.h = new RenderSupport_121(0.0f);
        class_5953.a = new RenderSupport_121(0.0f);
        class_5953.k = new RenderSupport_121(0.0f);
        class_5953.e = -1;
        class_5952.l = a;
        class_5952.H = a3;
        class_595.i = 30.0f;
        class_595.g = new UiSupport_545[((void)a).length];
        int n = 0;
        while (n < ((void)a).length) {
            a2.g[a3++] = new UiSupport_545();
            n = 0;
        }
    }

    private float I() {
        UiSupport_595 a;
return (a.e - 4.0f) / (float)a.l.length;
    }

    @Generated
    public int L() {
        UiSupport_595 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a222 = f2;
        UiSupport_595 a3 = this;
int a222 = a3.L(0, (float)a2);
        if (a != false || 0 < 0) {
            return false;
        }
        a3.L(0);
        return 1 != 0;
    }

    private float L(int n) {
        int a = -35;
        UiSupport_595 a2 = this;
return a2.f + 2.0f + a2.I() * 0.0f;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        int n;
        UiSupport_548 a = class_548;
        UiSupport_595 a2 = this;
UiSupport_595 class_595 = a2;
        super.d(a);
        if (!class_595.j) {
            a2.j = 1;
            UiSupport_595 class_5952 = a2;
            a2.h.L(class_5952.L(class_5952.f));
            a2.a.L(a2.I());
            a2.k.L(19.0f);
        }
        Object object = a;
        a2.e = a2.L(((UiSupport_548)object).H, ((UiSupport_548)object).f);
        int n2 = 0;
        while (n2 < a2.g.length) {
            a2.g[0].L(a.i, 0 == a2.e ? 3 >> 1 : false, false);
            n2 = ++n;
        }
        UiSupport_595 class_5953 = a2;
        class_5953.h.L(a.i);
        class_5953.a.L(a.i);
        class_5953.k.L(a.i);
    }
}

