/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_587;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UiSupport_565
extends UiSupport_549 {
    private final RenderSupport_124 I;
    private final UiSupport_545 d;
    private final Module i;
    private boolean f;
    private final Consumer<Module> H;
    private final UiSupport_587 e;

    @Generated
    public Module L() {
        UiSupport_565 a;
return a.i;
    }

    private static float h() {
return 12.0f;
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a22 = class_548;
        UiSupport_565 a = this;
RenderSupport_103 class_103 = a22.e;
        int n = a.i.d();
        UiSupport_565 class_565 = a;
        UiSupport_565 class_5652 = a;
        class_103.D((float)a.f, (float)class_565.d, (float)class_5652.e, (float)class_5652.i, 12.0f, a.I.L());
        UiSupport_565 class_5653 = a;
        UiSupport_565 class_5654 = a;
        class_565.d.L(class_103, (float)class_5653.f, (float)class_5653.d, (float)class_5654.e, (float)class_5654.i, 12.0f, a22.L().d());
        Object object = a22;
        int n2 = 0 != 0 ? ((UiSupport_548)object).L().D() : ((UiSupport_548)object).L().d();
        Object object2 = a22;
        n = 0 != 0 ? ThemeSupport_059.L(((UiSupport_548)object2).L().D(), 0.72f) : ((UiSupport_548)object2).L().F();
        UiSupport_565 class_5655 = a;
        int a22 = a.f + UiSupport_565.h();
        float f2 = class_5655.e.d() - 8.0f - 0;
        RenderSupport_103 class_1032 = class_103;
        UiSupport_565 class_5656 = a;
        class_1032.l(ThemeSupport_057.d(), class_1032.L(ThemeSupport_057.d(), a.i.d(), f2), 0, (float)(class_5656.d + class_5656.i * 0.32f), n2);
        UiSupport_565 class_5657 = a;
        class_103.l(ThemeSupport_057.i(), class_103.L(ThemeSupport_057.i(), a.i.D(), f2), 0, (float)(class_5657.d + class_5657.i * 0.7f), 0);
        super.L(a22);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_565 a4 = this;
if (a4.e.L((float)a2, (float)a, a3)) {
            return 5 >> 2;
        }
        if (!a4.L((float)a2, (float)a)) {
            return 3 >> 2;
        }
        if (a3 == 0) {
            boolean bl = --1 != 0;
            a4.H = (Consumer<Module>)bl;
            a4.i.I();
            return bl;
        }
        if (a3 == 1) {
            boolean bl = --1 != 0;
            UiSupport_565 class_565 = a4;
            class_565.H.accept(class_565.i);
            return bl;
        }
        return false;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_565 class_565;
        int n;
        int n2;
        UiSupport_548 a = class_548;
        UiSupport_565 a2 = this;
UiSupport_565 class_5652 = a2;
        super.d(a);
        Object object = a;
        int n3 = n2 = class_5652.i.d() ? ((UiSupport_548)object).L().G() : ((UiSupport_548)object).L().O();
        if (!a2.f) {
            a2.f = 1;
            a2.I.L(n2);
        }
        UiSupport_565 class_5653 = a2;
        class_5653.I.L(n2, 250.0f, RenderSupport_123.f);
        a2.I.L(a.i);
        UiSupport_545 class_545 = class_5653.d;
        float f2 = a.i;
        if (a2.h && !a2.e.D()) {
            n = 1;
            class_565 = a2;
        } else {
            n = 0;
            class_565 = a2;
        }
        class_545.L(f2, n != 0, (boolean)class_565.H);
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_565(Module class_227, Consumer<Module> consumer) {
        void a;
        UiSupport_565 a2;
        OnyxListener_001 a3 = class_227;
        UiSupport_565 class_565 = a2 = this;
        UiSupport_565 class_5652 = a2;
        UiSupport_565 class_5653 = a2;
        a2.d = new UiSupport_545();
        class_5653.I = new RenderSupport_124(0);
        class_5652.i = a3;
        class_565.H = a;
        class_5652.i = (Module)UiSupport_565.I();
        class_565.e = new UiSupport_587(((Module)a3)::d, ((Module)a3)::L);
        UiSupport_565 class_5654 = a2;
        class_5654.l.add(class_5654.e);
    }

    public static float I() {
return 46.0f;
    }

    @Override
    protected void L() {
        UiSupport_565 a;
UiSupport_565 class_565 = a;
        class_565.e.L(5 >> 2);
        UiSupport_565 class_5652 = a;
        UiSupport_565 class_5653 = a;
        class_565.e.L(class_5652.f + class_5652.e - 38.0f - UiSupport_565.h(), (float)(class_5653.d + (class_5653.i - 22.0f) / 2.0f), 38.0f, 22.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_565 a4 = this;
a4.H = (Consumer<Module>)0;
        return super.d((float)a2, (float)a, a3);
    }
}

