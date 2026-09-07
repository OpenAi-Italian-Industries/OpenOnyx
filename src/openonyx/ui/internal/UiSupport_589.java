/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import lombok.Generated;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_572;

public class UiSupport_589
extends UiSupport_572 {
    private final UiSupport_545 g;
    private Runnable M;
    private final static float L = 11.0f;
    private final static float j = 2.0f;
    final public static float m = 40.0f;
    private final static float h = 1.0f;
    private final static float l = 12.0f;
    private final static float I = 9.0f;
    private Consumer<String> f;
    private final static float H = 12.0f;
    private final String e;

    @Override
    protected float l() {
        UiSupport_589 a;
return (float)(a.f + 12.0f);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_589 a2 = this;
UiSupport_589 class_589 = a2;
        super.d(a);
        class_589.g.L(a.i, (boolean)a2.h, 0 != 0);
    }

    @Generated
    public void L(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        UiSupport_589 a2 = this;
a2.f = a;
    }

    public UiSupport_589(String string2) {
        String a = string2;
        UiSupport_589 a2 = this;
        UiSupport_589 class_589 = a2;
        class_589.g = new UiSupport_545();
        a2.e = a;
        a2.i = 40.0f;
        a2.k.L((String string) -> {
            String a = string;
            UiSupport_589 a2 = this;
if (a2.f != null) {
                a2.f.accept(a);
            }
        });
        a2.k.d(() -> {
            UiSupport_589 a;
if (a.M != null) {
                a.M.run();
            }
        });
        a2.k.L(() -> {
            UiSupport_589 a;
a.D(0 != 0);
        });
    }

    @Override
    protected RenderSupport_128 L() {
return ThemeSupport_057.L();
    }

    @Generated
    public void L(Runnable runnable) {
        Runnable a = runnable;
        UiSupport_589 a2 = this;
a2.M = a;
    }

    @Override
    protected float h() {
        UiSupport_589 a;
UiSupport_589 class_589 = a;
        return (float)(class_589.f + class_589.e - 12.0f);
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_589 class_589;
        UiSupport_548 a = class_548;
        UiSupport_589 a2 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_589 class_5892 = a2;
        float f2 = class_5892.a.L();
        boolean bl = class_5892.i() || !a2.k.L();
        UiSupport_589 class_5893 = a2;
        RenderSupport_103 class_1032 = class_103;
        UiSupport_589 class_5894 = a2;
        UiSupport_589 class_5895 = a2;
        class_1032.D((float)class_5894.f, class_5894.d, (float)class_5895.e, class_5895.i, 4.0f, a.L().n());
        UiSupport_589 class_5896 = a2;
        UiSupport_589 class_5897 = a2;
        class_5893.g.L(class_103, (float)class_5896.f, class_5896.d, (float)class_5897.e, class_5897.i, 4.0f, a.L().d());
        UiSupport_589 class_5898 = a2;
        class_1032.L((float)class_5893.f, class_5898.d, (float)class_5898.e, a2.i, 4.0f, 1.0f + 1.0f * f2, RenderSupport_124.L(a.L().e(), a.L().E(), f2));
        if (bl) {
            UiSupport_548 class_5482 = a;
            class_103.l(ThemeSupport_057.i(), a2.e, a2.l(), a2.d + 9.0f, f2 > 0.5f ? class_5482.L().E() : class_5482.L().F());
            class_589 = a2;
        } else {
            UiSupport_589 class_5899 = a2;
            class_103.l(a2.L(), a2.e, a2.l(), class_5899.d + class_5899.i / 2.0f, ThemeSupport_059.L(a.L().F(), 0.7f));
            class_589 = a2;
        }
        UiSupport_589 class_58910 = a2;
        class_589.L(a, bl ? class_58910.d + a2.i - 11.0f : class_58910.d + a2.i / 2.0f, 12.0f, a.L().d());
        if (a2.h != false) {
            class_103.l();
        }
    }
}

