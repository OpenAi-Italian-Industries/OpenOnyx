/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui;

import lombok.Generated;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.events.EntityRelationUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.UndoManager;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.misc.MiscSupport_628;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_551;
import openonyx.ui.internal.UiSupport_563;
import openonyx.ui.internal.UiSupport_564;
import openonyx.ui.internal.UiSupport_571;
import openonyx.ui.internal.UiSupport_582;
import openonyx.ui.internal.UiSupport_588;
import openonyx.ui.internal.UiSupport_594;

public class UiSupport_543
extends UiSupport_549 {
    private final static float p = 36.0f;
    private final static float t = 640.0f;
    private float b;
    private float E;
    private float F;
    private final UiSupport_563 G;
    private final static String A = "onyx client";
    private final UiSupport_582 K;
    private final RenderSupport_121 B;
    private boolean C;
    private final UiSupport_545 J;
    private static float D;
    private final static float c = 420.0f;
    private float a;
    private final static float k = 96.0f;
    private final UiSupport_588 g;
    private float M;
    private float L;
    private static float j;
    private boolean m;
    private static ModuleCategory h;
    private boolean l;
    private float I;
    private final UiSupport_594 f;
    private final UiSupport_564 H;
    private final UiSupport_571 e;

    private boolean D(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_543 a2 = this;
if (UiSupport_551.i(a)) {
            a2.d();
            return 1 != 0;
        }
        if (UiSupport_551.D(a)) {
            a2.e.L(UndoManager.d() ? "Undone" : "Nothing to undo");
            return 1 != 0;
        }
        if (UiSupport_551.L(a)) {
            a2.e.L(UndoManager.L() ? "Redone" : "Nothing to redo");
            return 5 >> 2;
        }
        return false;
    }

    static {
        h = ModuleCategory.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_543 a4 = this;
if (a2 == false && a4.d(0.0f, a3)) {
            boolean bl = --1 != 0;
            a4.I();
            return bl;
        }
        if (a4.l) {
            if (a4.C) {
                if (a4.K.L(0.0f, a3, (int)a2)) {
                    return --1 != 0;
                }
            } else if (a4.f.L(0.0f, a3, (int)a2)) {
                return 3 >> 1;
            }
            if (a2 == 1 && a4.L(0.0f, a3)) {
                boolean bl = --1 != 0;
                a4.I();
                return bl;
            }
        } else {
            if (a4.G.L(0.0f, a3, (int)a2)) {
                return --1 != 0;
            }
            if (a4.g.L(0.0f, a3, (int)a2)) {
                return --1 != 0;
            }
            if (a4.H.L(0.0f, a3, (int)a2)) {
                return 3 >> 1;
            }
        }
        if (a2 == false && a >= a4.f) {
            UiSupport_543 class_543 = a4;
            if (a < class_543.f + class_543.e && a3 >= a4.d && a3 < a4.d + UiSupport_543.F()) {
                a4.m = 1;
                a4.E = a - a4.f;
                a4.I = a3 - a4.d;
                return 3 >> 1;
            }
        }
        return a4.L(0.0f, a3);
    }

    private float B() {
        UiSupport_543 a;
return a.d + UiSupport_543.F() / 2.0f;
    }

    public float j() {
        UiSupport_543 a;
UiSupport_543 class_543 = a;
        return (float)(class_543.f + class_543.e / 2.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        void a;
        OnyxListener_001 a2;
        UiSupport_543 class_543 = this;
OnyxListener_001 interface_001 = a2 = a.e;
        UiSupport_543 class_5432 = class_543;
        ((RenderSupport_103)a2).L(class_5432.F);
        UiSupport_543 class_5433 = class_543;
        ((RenderSupport_103)interface_001).d((float)class_5432.f, class_5433.d, (float)class_5433.e, class_543.i, 28.0f, 3);
        UiSupport_543 class_5434 = class_543;
        RenderSupport_120.L((RenderSupport_103)interface_001, (float)class_543.f, class_5434.d, (float)class_5434.e, class_543.i, 28.0f, ThemeSupport_060.L(2, a.L()));
        ((RenderSupport_103)interface_001).e();
        UiSupport_543 class_5435 = class_543;
        float f2 = class_5435.B.L();
        class_5435.L((UiSupport_548)a, f2);
        if (f2 < 0.999f) {
            UiSupport_543 class_5436 = class_543;
            OnyxListener_001 interface_0012 = a2;
            OnyxListener_001 interface_0013 = a2;
            ((RenderSupport_103)interface_0013).L(class_543.F * (1.0f - f2));
            ((RenderSupport_103)interface_0013).F();
            ((RenderSupport_103)interface_0012).L(-36.0f * f2, 0.0f);
            class_5436.g.L((UiSupport_548)a);
            class_5436.H.L((UiSupport_548)a);
            ((RenderSupport_103)interface_0012).k();
            ((RenderSupport_103)interface_0012).e();
        }
        if (f2 > 0.001f) {
            OnyxListener_001 interface_0014;
            OnyxListener_001 interface_0015 = a2;
            ((RenderSupport_103)interface_0015).L(class_543.F * f2);
            ((RenderSupport_103)interface_0015).F();
            ((RenderSupport_103)interface_0015).L(36.0f * (1.0f - f2), 0.0f);
            UiSupport_543 class_5437 = class_543;
            if (class_543.C) {
                class_5437.K.L((UiSupport_548)a);
                interface_0014 = a2;
            } else {
                class_5437.f.L((UiSupport_548)a);
                interface_0014 = a2;
            }
            ((RenderSupport_103)interface_0014).k();
            ((RenderSupport_103)a2).e();
        }
        class_543.e.L((UiSupport_548)a);
    }

    private String L() {
        UiSupport_543 class_543 = this;
if (!class_543.H.i()) {
            return class_543.g.L().d();
        }
        int a = class_543.H.i();
        if (1 == 1) {
            return "1 result";
        }
        return 1 + " results";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        float a5 = f3;
        UiSupport_543 a6 = this;
if (a6.m) {
            UiSupport_543 class_543 = a6;
            class_543.d((float)(a4 - a6.E), 0 - class_543.I);
            return 1 != 0;
        }
        if (!a6.l) {
            return a6.G.L((float)a4, 0, (int)a3, 0.0f, (float)a);
        }
        UiSupport_543 class_543 = a6;
        if (a6.C) {
            return class_543.K.L((float)a4, 0, (int)a3, 0.0f, (float)a);
        }
        return class_543.f.L((float)a4, 0, (int)a3, 0.0f, (float)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_543 a4 = this;
a4.m = 0;
        if (a4.l) {
            UiSupport_543 class_543 = a4;
            if (a4.C) {
                return class_543.K.d((float)a2, (float)a, a3);
            }
            return class_543.f.d((float)a2, (float)a, a3);
        }
        return a4.H.d((float)a2, (float)a, a3);
    }

    private static float A() {
return 10.0f;
    }

    private boolean d(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_543 a2 = this;
switch (a.D()) {
            case 200: {
                while (false) {
                }
                return a2.H.L(0, -1);
            }
            case 208: {
                return a2.H.L(0, 1);
            }
            case 203: {
                if (!a2.G.i() && a2.H.L(-1, 0)) {
                    return --1 != 0;
                }
                return false;
            }
            case 205: {
                if (!a2.G.i() && a2.H.L(1, 0)) {
                    return 3 >> 1;
                }
                return false;
            }
        }
        return false;
    }

    private static float H() {
return 62.0f;
    }

    @Override
    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_543 a2 = this;
if (a2.l) {
            UiSupport_543 class_543 = a2;
            if (a2.C) {
                return class_543.K.L(a);
            }
            return class_543.f.L(a);
        }
        if (a2.G.i()) {
            return a2.G.L(a);
        }
        if (!UiSupport_551.L(a) || Character.isWhitespace(a.L())) {
            return false;
        }
        return a2.G.d(a);
    }

    public boolean l() {
        UiSupport_543 a;
return a.l;
    }

    @Override
    protected void L() {
        UiSupport_543 class_543 = this;
UiSupport_543 class_5432 = class_543;
        float f2 = class_5432.d + UiSupport_543.F();
        float a = class_5432.i - UiSupport_543.F() - UiSupport_543.A();
        class_5432.g.L((float)(class_543.f + UiSupport_543.A()), f2, UiSupport_543.H(), 1);
        class_5432.f.L((float)(class_543.f + UiSupport_543.A()), f2, (float)(class_543.e - UiSupport_543.A() * 2.0f), 1);
        class_5432.K.L((float)(class_543.f + UiSupport_543.A()), f2, (float)(class_543.e - UiSupport_543.A() * 2.0f), 1);
        UiSupport_543 class_5433 = class_543;
        UiSupport_543 class_5434 = class_543;
        class_5432.e.L((float)class_5433.f, class_5433.d, (float)class_5434.e, class_5434.i);
    }

    /*
     * WARNING - void declaration
     */
    private void d(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_543 a3 = this;
UiSupport_543 class_543 = a3;
        UiSupport_543 class_5432 = a3;
        class_543.L(Math.round(Math.clamp(0.0f, 96.0f - class_543.e, a3.M - 96.0f)), Math.round(Math.clamp(0, 0.0f, a3.b - UiSupport_543.F())), (float)class_5432.e, class_5432.i);
        UiSupport_543 class_5433 = a3;
        j = (float)(class_543.f - class_5433.L);
        D = class_5433.d - a3.a;
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_543 a3 = this;
if (a3.l && a >= a3.I() && a < a3.I() + UiSupport_543.l() && 0 >= a3.k() && 0 < a3.k() + UiSupport_543.l()) {
            return 1 != 0;
        }
        return false;
    }

    public float e() {
        UiSupport_543 a;
UiSupport_543 class_543 = a;
        return class_543.d + class_543.i / 2.0f;
    }

    public void L(Module class_227) {
        OnyxListener_001 a = class_227;
        UiSupport_543 a2 = this;
UiSupport_543 class_543 = a2;
        boolean bl = 3 >> 2;
        class_543.G.D(bl);
        class_543.f.L((Module)a);
        a2.C = bl;
        a2.l = 1;
        a2.B.L(1.0f, 300.0f, RenderSupport_123.l);
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, float f2) {
        void a;
        float a2 = f2;
        UiSupport_543 a3 = this;
RenderSupport_103 class_103 = a.e;
        if (0 < 0.999f) {
            RenderSupport_103 class_1032 = class_103;
            float f3 = a3.F * 1.0f;
            RenderSupport_103 class_1033 = class_103;
            class_1033.l(ThemeSupport_057.I(), A, (float)(a3.f + UiSupport_543.A() + 6.0f), a3.B(), ThemeSupport_059.L(a.L().d(), f3));
            UiSupport_543 class_543 = a3;
            class_1033.d(ThemeSupport_057.i(), a3.L(), (float)(class_543.f + class_543.e - UiSupport_543.A() - 6.0f), a3.B(), ThemeSupport_059.L(a.L().F(), f3));
            class_1032.L(f3);
            a3.G.L((UiSupport_548)a);
            class_1032.e();
        }
        Module class_227 = a3.f.L();
        if (0 > 0.001f && (a3.C || class_227 != null)) {
            UiSupport_543 class_543;
            String string;
            UiSupport_543 class_5432;
            String string2;
            UiSupport_543 class_5433 = a3;
            a2 = class_5433.F * 0;
            class_5433.J.L(class_103, a3.I(), a3.k(), UiSupport_543.l(), UiSupport_543.l(), Float.MAX_VALUE, a.L().d());
            RenderSupport_103 class_1034 = class_103;
            UiSupport_546.I(class_1034, a3.I() + UiSupport_543.l() / 2.0f, a3.k() + UiSupport_543.l() / 2.0f, 15.0f, ThemeSupport_059.L(a.L().d(), 0));
            RenderSupport_128 class_128 = ThemeSupport_057.I();
            if (a3.C) {
                string2 = "Configs";
                class_5432 = a3;
            } else {
                string2 = class_227.d();
                class_5432 = a3;
            }
            class_1034.l(class_128, string2, class_5432.I() + UiSupport_543.l() + 8.0f, a3.B(), ThemeSupport_059.L(a.L().d(), 0));
            RenderSupport_128 class_1282 = ThemeSupport_057.i();
            if (a3.C) {
                string = a3.K.L();
                class_543 = a3;
            } else {
                string = class_227.L().d();
                class_543 = a3;
            }
            class_103.d(class_1282, string, (float)(class_543.f + a3.e - UiSupport_543.A() - 6.0f), a3.B(), ThemeSupport_059.L(a.L().F(), 0));
        }
    }

    private float k() {
        UiSupport_543 a;
return a.B() - UiSupport_543.l() / 2.0f;
    }

    private void D(UiSupport_548 class_548) {
        Object a = class_548;
        UiSupport_543 a2 = this;
a = ((UiSupport_548)a).e;
        UiSupport_543 class_543 = a2;
        UiSupport_543 class_5432 = a2;
        a = class_5432.f + UiSupport_543.A() + 6.0f + ((RenderSupport_103)a).L(ThemeSupport_057.I(), A);
        a = Math.max((float)(class_5432.f + UiSupport_543.A() + UiSupport_543.H() + UiSupport_543.A()), (float)(a + UiSupport_543.h()));
        Object object = ((RenderSupport_103)a).L(ThemeSupport_057.i(), a2.L());
        float f2 = class_5432.d + UiSupport_543.F();
        UiSupport_543 class_5433 = a2;
        object = class_543.f + class_5433.e - UiSupport_543.A() - 6.0f - object - UiSupport_543.h();
        Object object2 = a;
        class_5433.G.L((float)object2, a2.B() - UiSupport_563.k() / 2.0f, object - object2, UiSupport_563.k());
        UiSupport_543 class_5434 = a2;
        Object object3 = a;
        class_543.H.L((float)object3, f2, (float)(class_5434.f + class_5434.e - UiSupport_543.A() - object3), a2.i - UiSupport_543.F() - UiSupport_543.A());
    }

    private boolean h() {
        UiSupport_543 class_543 = this;
OnyxListener_001 a = class_543.H.L();
        if (a == null) {
            return 5 >> 3;
        }
        class_543.L((Module)a);
        return 5 >> 2;
    }

    public boolean I() {
        UiSupport_543 a;
if (!a.l) {
            return 0 != 0;
        }
        if (a.C) {
            a.K.D();
        }
        a.l = 0;
        a.B.L(0.0f, 300.0f, RenderSupport_123.l);
        return --1 != 0;
    }

    public void D() {
        UiSupport_543 a;
UiSupport_543 class_543 = a;
        class_543.G.D(0 != 0);
        class_543.K.i();
        a.C = 1;
        a.l = 1;
        a.B.L(1.0f, 300.0f, RenderSupport_123.l);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3) {
        void a;
        float a2 = f2;
        UiSupport_543 a3 = this;
a3.M = 0;
        a3.b = a;
        a3.L = (0 - a3.e) / 2.0f;
        a3.a = (a3.b - a3.i) / 2.0f;
        UiSupport_543 class_543 = a3;
        class_543.d(a3.L + j, class_543.a + D);
    }

    private static float F() {
return 38.0f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void d(UiSupport_548 var1_1) {
        a = var1_1;
        a = this;
v0 = a;
        v1 = a;
        v1.D(a);
        v1.B.L(a.i);
        v2 = a;
        a.J.L(a.i, a.d(v2.H, v2.f), 5 >> 3);
        a.h = (ModuleCategory)v0.L(a.H, a.f);
        var2_2 = v0.B.L();
        if (v3 < 0.999f) {
            v4 = a;
            v4.g.d(a);
            v4.G.d(a);
            v4.H.d(a);
        }
        if (!(var2_2 > 0.001f)) ** GOTO lbl24
        v5 = a;
        if (a.C) {
            v5.K.d(a);
            v6 = a;
        } else {
            v5.f.d(a);
lbl24:
            // 2 sources

            v6 = a;
        }
        v6.e.d(a);
    }

    public UiSupport_543() {
        UiSupport_543 a;
        UiSupport_543 class_543 = a;
        a.f = new UiSupport_594();
        class_543.K = new UiSupport_582();
        a.G = new UiSupport_563(string -> {
            String a = string;
            UiSupport_543 a2 = this;
a2.H.L(a);
        });
        UiSupport_543 class_5432 = a;
        UiSupport_543 class_5433 = a;
        a.e = new UiSupport_571();
        class_5433.J = new UiSupport_545();
        class_5433.B = new RenderSupport_121(0.0f);
        class_5433.F = 1.0f;
        class_5432.e = (UiSupport_571)640.0f;
        class_5432.i = 420.0f;
        class_5432.H = new UiSupport_564(h, a::L);
        a.g = new UiSupport_588(h, enum_226 -> {
            ModuleCategory a = enum_226;
            UiSupport_543 a2 = this;
h = a;
            a2.G.l();
            a2.H.L(a);
        }, a::D);
        UiSupport_543 class_5434 = a;
        class_5434.l.add(class_5434.g);
        UiSupport_543 class_5435 = a;
        class_5435.l.add(class_5435.G);
        UiSupport_543 class_5436 = a;
        class_5436.l.add(class_5436.H);
        UiSupport_543 class_5437 = a;
        class_5437.l.add(class_5437.f);
        UiSupport_543 class_5438 = a;
        class_5438.l.add(class_5438.K);
    }

    private boolean i() {
        UiSupport_543 class_543 = this;
OnyxListener_001 a = class_543.H.L();
        if (a == null) {
            return 3 >> 2;
        }
        ((Module)a).I();
        return 1 != 0;
    }

    private void d() {
        String string;
        UiSupport_543 class_543 = this;
MiscSupport_628 class_628 = OnyxClient.e;
        String a = class_628.d();
        UiSupport_571 class_571 = class_543.e;
        if (class_628.F(a)) {
            v1 = new StringBuilder();
            string = v1.insert(0, "Saved ").append(a).toString();
        } else {
            v1 = new StringBuilder();
            string = v1.insert(0, "Could not save ").append(a).toString();
        }
        class_571.L(string);
    }

    private static float l() {
return 26.0f;
    }

    @Generated
    public void L(float f2) {
        float a = f2;
        UiSupport_543 a2 = this;
a2.F = 1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, double d) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_543 a4 = this;
if (a4.l) {
            UiSupport_543 class_543 = a4;
            if (a4.C) {
                return class_543.K.L((float)a2, a3, 0.0);
            }
            return class_543.f.L((float)a2, a3, 0.0);
        }
        return a4.H.L((float)a2, a3, 0.0);
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_543 a2 = this;
if (a2.l) {
            if (a2.C ? a2.K.L(a) : a2.f.L(a)) {
                return true;
            }
            if (a2.D(a)) {
                return 5 >> 2;
            }
            if (UiSupport_551.l(a)) {
                return a2.I();
            }
            return false;
        }
        if (UiSupport_551.I(a)) {
            UiSupport_543 class_543 = a2;
            boolean bl = 5 >> 2;
            class_543.G.D(bl);
            class_543.G.d();
            return bl;
        }
        if (a2.D(a)) {
            return 1 != 0;
        }
        if (a2.d(a)) {
            return 3 >> 1;
        }
        if (UiSupport_551.d(a) && a2.h()) {
            return 1 != 0;
        }
        if (a2.G.L(a)) {
            return 5 >> 2;
        }
        if (a.D() == 57 && a2.i()) {
            return --1 != 0;
        }
        if (UiSupport_551.l(a) && !a2.G.i()) {
            return 1 != 0;
        }
        return false;
    }

    private static float h() {
return 12.0f;
    }

    private float I() {
        UiSupport_543 a;
return (float)(a.f + UiSupport_543.A());
    }
}

