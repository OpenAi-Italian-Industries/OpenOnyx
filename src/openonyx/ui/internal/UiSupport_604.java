/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import lombok.Generated;
import openonyx.core.OnyxClient;
import openonyx.events.EntityRelationUtils;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_602;
import openonyx.ui.internal.UiMode_598;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UiSupport_604
extends UiSupport_549 {
    private final static float g = 6.0f;
    private final UiSupport_576 M;
    private final UiSupport_602 L;
    private boolean j;
    private final String m;
    final public static float h = 50.0f;
    private final static float l = 8.0f;
    private final static float I = 76.0f;
    private final Consumer<UiSupport_604> d;
    private final UiSupport_545 i;
    private final Consumer<UiSupport_604> f;
    private final RenderSupport_124 H;
    private final Consumer<UiSupport_604> e;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_604 a4 = this;
a4.H = (RenderSupport_124)0;
        return super.d((float)a2, (float)a, 0);
    }

    @Generated
    public String L() {
        UiSupport_604 a;
return a.m;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        void a;
        UiSupport_604 class_604 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_604 class_6042 = class_604;
        UiSupport_604 class_6043 = class_604;
        int a2 = class_6043.i();
        UiSupport_604 class_6044 = class_604;
        UiSupport_604 class_6045 = class_604;
        class_103.D((float)class_6044.f, (float)class_6044.d, (float)class_6045.e, (float)class_6045.i, 12.0f, class_604.H.L());
        UiSupport_604 class_6046 = class_604;
        UiSupport_604 class_6047 = class_604;
        class_6042.i.L(class_103, (float)class_6046.f, (float)class_6046.d, (float)class_6047.e, (float)class_6047.i, 12.0f, a.L().d());
        reference var4_5 = class_6043.f + 12.0f;
        float f2 = class_6042.M.d() - 6.0f - var4_5;
        String string = 0 != 0 ? "Loaded" : "Saved config";
        void v6 = a;
        int n = 0 != 0 ? v6.L().D() : v6.L().d();
        void v7 = a;
        a2 = 0 != 0 ? ThemeSupport_059.L(v7.L().D(), 0.72f) : v7.L().F();
        RenderSupport_103 class_1032 = class_103;
        UiSupport_604 class_6048 = class_604;
        class_1032.l(ThemeSupport_057.d(), class_1032.L(ThemeSupport_057.d(), class_604.m, f2), (float)var4_5, (float)(class_6048.d + class_6048.i * 0.33f), n);
        UiSupport_604 class_6049 = class_604;
        class_1032.l(ThemeSupport_057.i(), string, (float)var4_5, (float)(class_6049.d + class_6049.i * 0.7f), 0);
        super.L((UiSupport_548)a);
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_604(String string, Consumer<UiSupport_604> consumer, Consumer<UiSupport_604> consumer2, Consumer<UiSupport_604> consumer3) {
        Consumer<UiSupport_604> a;
        void a2;
        void a3;
        void a4;
        UiSupport_604 a5;
        UiSupport_604 class_604 = consumer4;
        Consumer<UiSupport_604> consumer4 = consumer3;
        UiSupport_604 class_6042 = a5 = class_604;
        UiSupport_604 class_6043 = a5;
        UiSupport_604 class_6044 = a5;
        a5.i = new UiSupport_545();
        class_6044.H = new RenderSupport_124(0);
        class_6043.m = a4;
        class_6043.d = a3;
        class_6042.e = a2;
        class_6042.f = a;
        class_6042.M = new UiSupport_576(UiMode_598.f, "Load", "\ue2c4", () -> {
            UiSupport_604 a;
UiSupport_604 class_604 = a;
            if (a.i()) {
                class_604.e.accept(a);
                return;
            }
            class_604.d.accept(a);
        });
        a5.L = new UiSupport_602("\ue5d4", () -> {
            Consumer a = a;
            UiSupport_604 a2 = this;
a.accept(a2);
        });
        a5.i = (UiSupport_545)50.0f;
        a5.l.add(a5.M);
        UiSupport_604 class_6045 = a5;
        class_6045.l.add(class_6045.L);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_604 a4 = this;
if (a4.M.L((float)a2, (float)a, 0)) {
            return 1 != 0;
        }
        if (a4.L.L((float)a2, (float)a, 0)) {
            return 3 >> 1;
        }
        if (!a4.L((float)a2, (float)a)) {
            return 0 != 0;
        }
        if (0 == 0) {
            a4.H = (RenderSupport_124)1;
            if (!a4.i()) {
                a4.d.accept(a4);
            }
            return true;
        }
        if (0 == 1) {
            a4.f.accept(a4);
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_604 class_604;
        int n;
        void a;
        UiSupport_604 class_6042 = this;
UiSupport_604 class_6043 = class_6042;
        int a2 = class_6043.i();
        class_6043.M.L(0 != 0 ? "Save" : "Load");
        class_6042.M.d(0 != 0 ? "\ue161" : "\ue2c4");
        super.d((UiSupport_548)a);
        void v1 = a;
        int n2 = a2 = 0 != 0 ? v1.L().G() : v1.L().O();
        if (!class_6042.j) {
            class_6042.j = 1;
            class_6042.H.L(0);
        }
        UiSupport_604 class_6044 = class_6042;
        class_6044.H.L(0, 250.0f, RenderSupport_123.f);
        class_6042.H.L(a.i);
        UiSupport_545 class_545 = class_6044.i;
        float f2 = a.i;
        if (class_6042.h != false && !class_6042.M.D() && !class_6042.L.D()) {
            n = 1;
            class_604 = class_6042;
        } else {
            n = 0;
            class_604 = class_6042;
        }
        class_545.L(f2, n != 0, (boolean)class_604.H);
    }

    @Override
    protected void L() {
        UiSupport_604 a;
UiSupport_604 class_604 = a;
        UiSupport_604 class_6042 = a;
        UiSupport_604 class_6043 = a;
        class_604.L.L((float)(class_604.f + class_6042.e - 30.0f - 8.0f), (float)(class_6043.d + (class_6043.i - 30.0f) / 2.0f), 30.0f, 30.0f);
        UiSupport_604 class_6044 = a;
        class_6042.M.L(a.L.d() - 6.0f - 76.0f, (float)(class_6044.d + (class_6044.i - 30.0f) / 2.0f), 76.0f, 30.0f);
    }

    private boolean i() {
        UiSupport_604 a;
return OnyxClient.e.I(a.m);
    }

    public UiSupport_549 L() {
        UiSupport_604 a;
return a.L;
    }
}

