/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_036;
import openonyx.history.ModeSetting;
import openonyx.history.ModeOption;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_593;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_585<M extends ModeOption>
extends UiSupport_596 {
    private boolean A;
    private final static float K = 13.0f;
    private final static float B = 4.0f;
    private final RenderSupport_121 C;
    private final List<UiSupport_545> J;
    private final UiSupport_593 D;
    private final static float c = 7.0f;
    private final static float a = 24.0f;
    private final static float k = 8.0f;
    private final ModeSetting<M> g;
    private final static float M = 1.5f;
    private M L;
    private int j;
    private float m;
    private final List<RenderSupport_121> e;

    private float G() {
        UiSupport_585 a;
UiSupport_585 class_585 = a;
        return class_585.L(class_585.g.d().size() - 1) + 24.0f - 4.0f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void d(UiSupport_548 var1_2) {
        var2_3 = this;
v0 = var2_3;
        if (v0.L != v0.g.L()) {
            var2_3.d();
        }
        v1 = var2_3;
        var2_3.m = v1.D.L(v1.f + 13.0f, var2_3.B(), Math.max(0.0f, (float)(var2_3.e - 13.0f)));
        v2 = var2_3;
        if (!v1.A) {
            v2.C.L(var2_3.m);
            v3 = var2_3;
        } else {
            if (v2.C.d() != var2_3.m) {
                v4 = var2_3;
                v4.C.L(v4.m, 300.0f, RenderSupport_123.l);
            }
            v3 = var2_3;
        }
        v3.C.L(a.i);
        var2_3.j = -4 >> 2;
        v5 = a = 3 & 4;
        while (v5 < var2_3.g.d().size()) {
            v6 = var5_6 = var2_3.g.L() == var2_3.g.d().get(a) ? 2 ^ 3 : 0;
            if (!(a.H >= var2_3.f)) ** GOTO lbl-1000
            v7 = var2_3;
            if (a.H < v7.f + v7.e && a.f >= var2_3.L(a) && a.f < var2_3.L(a) + 24.0f) {
                v8 = 5 >> 2;
            } else lbl-1000:
            // 2 sources

            {
                v8 = var4_5 = false;
            }
            if (var4_5) {
                var2_3.j = a;
            }
            var3_4 = var2_3.e.get(a);
            if (!var2_3.A) {
                var3_4.L(var5_6 != 0 ? 1.0f : 0.0f);
                v9 = var3_4;
            } else {
                if (var3_4.d() != (var5_6 != 0 ? 1.0f : 0.0f)) {
                    var3_4.L(var5_6 != 0 ? 1.0f : 0.0f, 200.0f, RenderSupport_123.l);
                }
                v9 = var3_4;
            }
            v9.L(a.i);
            var2_3.J.get(++a).L(a.i, var4_5, 3 >> 2);
            v5 = a;
        }
        var2_3.A = 3 >> 1;
        super.d((UiSupport_548)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        UiSupport_585 class_585 = this;
if (!class_585.i() || a != false) {
            return false;
        }
        if (class_585.j >= 0) {
            UiSupport_585 class_5852 = class_585;
            class_5852.g.L((ModeOption)class_5852.g.d().get(class_585.j));
            return 1 != 0;
        }
        Iterator a2 = class_585.l.iterator();
        while (a2.hasNext()) {
            void a3;
            void a4;
            if (!((UiSupport_549)a2.next()).L((float)a4, (float)a3, 0)) continue;
            return 1 != 0;
        }
        return false;
    }

    private float m() {
        UiSupport_585 a;
return a.l() - 1.5f;
    }

    private float L(int n) {
        int a = -35;
        UiSupport_585 a2 = this;
return a2.m() - 4.0f + 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        void a;
        float f3;
        Object object;
        int a22;
        void a3;
        UiSupport_585 class_585 = this;
RenderSupport_103 class_103 = a3.e;
        UiSupport_585 class_5852 = class_585;
        class_5852.L((UiSupport_548)a3, (float)class_5852.e);
        int n = 0;
        while (n < class_585.g.d().size()) {
            float f4;
            object = (ModeOption)class_585.g.d().get(0);
            UiSupport_585 class_5853 = class_585;
            float f5 = class_5853.L(0);
            float f6 = f5 + 12.0f;
            int n2 = class_5853.g.L() == object ? 1 : 0;
            class_585.J.get(0).L(class_103, class_585.f - 4.0f, f5, (float)(class_585.e + 8.0f), 24.0f, 8.0f, class_585.L(a3.L().d()));
            void v3 = a3;
            n2 = n2 != 0 ? v3.L().E() : v3.L().F();
            UiSupport_585 class_5854 = class_585;
            class_103.L(class_5854.f + 8.0f, f6, 8.0f, 1.5f, class_585.L(n2));
            float f7 = class_5854.e.get(0).L();
            if (f4 > 0.01f) {
                class_103.L(class_585.f + 8.0f, f6, 4.0f * f7, class_585.L(a3.L().E()));
            }
            class_103.l(ThemeSupport_057.I, ((Setting)object).L(), class_585.f + 16.0f + 9.0f, f6, class_585.L(a3.L().d()));
            n = ++a22;
        }
        float a22 = class_585.C.L();
        if (f3 <= 0.5f) {
            return;
        }
        RenderSupport_103 class_1032 = class_103;
        UiSupport_585 class_5855 = class_585;
        class_1032.d(class_585.f, class_5855.B(), (float)class_585.e, a22);
        class_1032.i(class_5855.f + 3.0f, class_585.B(), 1.0f, a22, ThemeSupport_059.L(a3.L().P(), (float)(a * 0.7f)));
        UiSupport_585 class_5856 = class_585;
        class_585.D.L(class_103, class_5856.f + 13.0f, Math.max(0.0f, (float)(class_585.e - 13.0f)), a3.L().P(), (float)a);
        Object object2 = object = class_5856.l.iterator();
        while (object2.hasNext()) {
            UiSupport_549 class_549 = (UiSupport_549)object.next();
            object2 = object;
            class_549.L((UiSupport_548)a3);
        }
        class_103.L();
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a22 = class_548;
        UiSupport_585 a = this;
UiSupport_585 class_585 = a;
        float a22 = class_585.C.L();
        return class_585.G() - a.d + (0 > 0.5f ? 7.0f : 0.0f) + 6.0f;
    }

    private float B() {
        UiSupport_585 a;
return a.G() + 7.0f;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_585(ModeSetting<M> interface_001) {
        int n;
        OnyxListener_001 a;
        void a2;
        UiSupport_585 class_585 = interface_0012;
        OnyxListener_001 interface_0012 = interface_001;
        interface_001 = class_585;
        void v1 = a2;
        super((Setting)a);
        void v2 = a2;
        a2.e = new ArrayList<RenderSupport_121>();
        v2.J = new ArrayList<UiSupport_545>();
        a2.D = new UiSupport_593();
        a2.C = new RenderSupport_121(0.0f);
        v1.j = -1;
        v1.g = a;
        int n2 = 0;
        while (n2 < ((ModeSetting)a).d().size()) {
            a2.e.add(new RenderSupport_121(0.0f));
            a2.J.add(new UiSupport_545());
            n2 = ++n;
        }
        a2.d();
    }

    private void d() {
        UiSupport_585 a;
a.L = (ModeOption)a.g.L();
        UiSupport_585 class_585 = a;
        class_585.l.clear();
        UiSupport_585 class_5852 = a;
        class_585.D.L(((SettingSupport_036)class_5852.L).L());
        class_5852.l.addAll(a.D.L());
        a.m = 0.0f;
    }
}

