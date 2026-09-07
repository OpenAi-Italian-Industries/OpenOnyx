/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import openonyx.core.OnyxListener_001;
import openonyx.features.ModuleState;
import openonyx.history.Setting;
import openonyx.history.internal.KeybindSetting;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.internal.RenderSupport_176;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_577
extends UiSupport_596 {
    private final RenderSupport_121 B;
    private boolean C;
    private final static float J = 12.0f;
    private final UiSupport_545[] D;
    private final UiSupport_545 c;
    private final static ModuleState[] a;
    private final static String[] k;
    private boolean g;
    private final static float M = 20.0f;
    private final static float L = 8.0f;
    private float j;
    private float m;
    private final KeybindSetting e;

    /*
     * WARNING - void declaration
     */
    public UiSupport_577(KeybindSetting interface_001) {
        OnyxListener_001 a;
        void a2;
        UiSupport_577 class_577 = interface_0012;
        OnyxListener_001 interface_0012 = interface_001;
        interface_001 = class_577;
        super((Setting)a);
        void v1 = a2;
        a2.c = new UiSupport_545();
        UiSupport_545[] class_545Array = new UiSupport_545[2];
        class_545Array[0] = new UiSupport_545();
        class_545Array[1] = new UiSupport_545();
        a2.D = class_545Array;
        void v3 = a2;
        v3.B = new RenderSupport_121(0.0f);
        v3.e = a;
    }

    private boolean l() {
        UiSupport_577 a;
if (a.e.L() != null) {
            return 1 != 0;
        }
        return false;
    }

    private String L() {
        UiSupport_577 a;
if (a.g) {
            return "Press a key...";
        }
        return a.e.i();
    }

    private float I(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_577 a2 = this;
return Math.max(58.0f, a.e.L(ThemeSupport_057.d, a2.L()) + 20.0f);
    }

    /*
     * WARNING - void declaration
     */
    private int L(float f2, float f3) {
        void a;
        float a2 = f2;
        UiSupport_577 a3 = this;
if (!a3.h()) {
            return -1;
        }
        if (a < a3.B() || a >= a3.B() + 20.0f) {
            return -1;
        }
        if ((a2 -= a3.m) < 0.0f || 0 >= a3.m()) {
            return -1;
        }
        return (int)(0 / a3.j);
    }

    private int d(int n) {
        int a = -35;
        UiSupport_577 a2 = this;
int n2 = 1;
        return ThemeSupport_059.L(n2, a2.F() * a2.B.L() * ((float)ThemeSupport_064.d(n2) / 255.0f));
    }

    private boolean h() {
        UiSupport_577 a;
if (a.l() && a.B.L() > 0.95f) {
            return 5 >> 2;
        }
        return false;
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
        v1 = var2_2 = v0.l() != false && a.e.D() != false ? 1.0f : 0.0f;
        if (!a.C) {
            a.C = --1;
            v2 = a;
            v3 = v2;
            v2.B.L(var2_2);
        } else {
            if (a.B.d() != var2_2) {
                a.B.L(var2_2, 200.0f, RenderSupport_123.f);
            }
            v3 = a;
        }
        v3.B.L(a.i);
        v4 = a;
        a.j = a.D(a);
        a.m = a.i((UiSupport_548)v4);
        if (!(v4.H >= a.d(a))) ** GOTO lbl-1000
        v5 = a;
        if (a.H < v5.f + v5.e && a.f >= a.B() && a.f < a.B() + 20.0f) {
            v6 = --1;
        } else lbl-1000:
        // 2 sources

        {
            v6 = 0;
        }
        var2_3 = v6;
        v7 = a;
        v7.c.L(a.i, (boolean)var2_3, a.g);
        var2_3 = v7.L(a.H, a.f);
        v8 = var3_4 = 5 >> 3;
        while (v8 < a.D.length) {
            a.D[var3_4].L(a.i, var2_3 == var3_4 ? --1 != 0 : false, false);
            v8 = ++var3_4;
        }
    }

    private float L(int n) {
        int a = -35;
        UiSupport_577 a2 = this;
return a2.m + 1.0f * a2.j;
    }

    private float m() {
        UiSupport_577 a;
return a.j * (float)UiSupport_577.a.length;
    }

    private float i(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_577 a2 = this;
return a2.d(a) - 8.0f - a2.m();
    }

    /*
     * WARNING - void declaration
     */
    private float D(UiSupport_548 class_548) {
        int n;
        UiSupport_577 class_577 = this;
float a = 0.0f;
        String[] stringArray = k;
        int n2 = k.length;
        int n3 = 0;
        while (n3 < n2) {
            void a2;
            String string = stringArray[0];
            a = Math.max(1, a2.e.L(ThemeSupport_057.d, string));
            n3 = ++n;
        }
        return 25.0f;
    }

    static {
        ModuleState[] enum_229Array = new ModuleState[2];
        enum_229Array[0] = ModuleState.H;
        enum_229Array[1] = ModuleState.f;
        a = enum_229Array;
        String[] stringArray = new String[2];
        stringArray[0] = "Toggle";
        stringArray[1] = "Hold";
        k = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a22;
        int a3 = 0;
        UiSupport_577 a4 = this;
if (!a4.i() || !a4.L((float)a22, (float)a)) {
            return false;
        }
        int a22 = a4.L((float)a22, (float)a);
        if (a22 >= 0) {
            if (a3 != 0) {
                return 5 >> 2;
            }
            a4.e.L().i(UiSupport_577.a[a22]);
            return 1 != 0;
        }
        if (a3 == 1) {
            a4.e.D();
            a4.g = 0;
            return 5 >> 2;
        }
        if (a3 == 0) {
            a4.g = !a4.g ? 1 : 0;
            return --1 != 0;
        }
        if (a4.g && a3 >= 2) {
            boolean bl = --1 != 0;
            a4.g = 0;
            a4.e.L(a3);
            return bl;
        }
        return false;
    }

    private float B() {
        UiSupport_577 a;
return a.I() - 10.0f;
    }

    private float d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_577 a2 = this;
UiSupport_577 class_577 = a2;
        return class_577.f + class_577.e - a2.I(a);
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_577 a2 = this;
if (!a2.g) {
            return 0 != 0;
        }
        a2.g = 0;
        if (a.D() == 1) {
            a2.e.D();
        } else {
            a2.e.d(a.D());
        }
        return true;
    }

    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        UiSupport_577 class_577;
        UiSupport_548 a = class_548;
        UiSupport_577 a2 = this;
RenderSupport_103 a3 = a.e;
        UiSupport_577 class_5772 = a2;
        UiSupport_577 class_5773 = a2;
        float f3 = class_5773.I(a);
        float f4 = class_5772.d(a);
        float f5 = class_5773.B();
        float f6 = (class_5772.B.L() > 0.01f ? a2.m : f4) - 10.0f - a2.f;
        UiSupport_577 class_5774 = a2;
        class_5774.L(a, f6);
        class_5774.i(a, f5);
        RenderSupport_103 class_103 = a3;
        if (class_5774.g) {
            class_103.D(f4, f5, f3, 20.0f, Float.MAX_VALUE, a2.L(a.L().G()));
            class_577 = a2;
        } else {
            class_103.L(f4, f5, f3, 20.0f, Float.MAX_VALUE, 1.0f, a2.L(a.L().e()));
            class_577 = a2;
        }
        class_577.c.L(a3, f4, f5, f3, 20.0f, Float.MAX_VALUE, a2.L(a.L().d()));
        UiSupport_577 class_5775 = a2;
        UiSupport_548 class_5482 = a;
        a3.L(ThemeSupport_057.d, a2.L(), f4 + f3 / 2.0f, a2.I(), class_5775.L(class_5775.g ? class_5482.L().D() : class_5482.L().d()));
    }

    private int L() {
        UiSupport_577 a;
if (a.e.L() != null && a.e.L().L(ModuleState.f)) {
            return 1;
        }
        return 0;
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_577 a2 = this;
return a2.A();
    }

    /*
     * WARNING - void declaration
     */
    private void i(UiSupport_548 class_548, float f2) {
        int a;
        void a2;
        void a3;
        UiSupport_577 class_577 = this;
if (!class_577.l() || class_577.B.L() <= 0.01f) {
            return;
        }
        RenderSupport_103 class_103 = a3.e;
        int n = class_577.L();
        float f3 = 10.0f;
        class_103.L(class_577.m, 0.0f, class_577.m(), 20.0f, Float.MAX_VALUE, 1.0f, class_577.d(a3.L().e()));
        int n2 = 0;
        while (n2 < UiSupport_577.a.length) {
            float f4;
            float f5 = class_577.L(0);
            int n3 = 0 == 0 ? 1 : 0;
            int n4 = 0 == UiSupport_577.a.length - 1 ? 1 : 0;
            float f6 = n3 != 0 ? f3 : 0.0f;
            float f7 = f4 = n4 != 0 ? f3 : 0.0f;
            if (0 == 0) {
                float f8 = f4;
                float f9 = f6;
                class_103.L(f5, 0.0f, class_577.j, 20.0f, f9, f8, f8, f9, class_577.d(a3.L().G()));
            }
            class_577.D[0].L(class_103, f5, 0.0f, class_577.j, 20.0f, Math.max(f6, f4), class_577.d(a3.L().d()));
            if (n3 == 0) {
                class_103.i(f5, 0.0f, 1.0f, 20.0f, class_577.d(a3.L().e()));
            }
            class_103.L(ThemeSupport_057.d, k[0], f5 + class_577.j / 2.0f, class_577.I(), class_577.d(0 == 0 ? a3.L().D() : a3.L().F()));
            n2 = ++a;
        }
    }
}

