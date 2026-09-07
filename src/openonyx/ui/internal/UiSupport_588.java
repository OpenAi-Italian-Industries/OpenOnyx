/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import lombok.Generated;
import openonyx.features.ModuleCategory;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.utilities.UtilitySupport_489;

public class UiSupport_588
extends UiSupport_549 {
    private final UiSupport_545[] j;
    private int m;
    private final UiSupport_545 h;
    private ModuleCategory l;
    private final RenderSupport_121 I;
    private boolean d;
    private boolean i;
    private final Runnable f;
    private final Consumer<ModuleCategory> H;
    private final RenderSupport_121 e;

    @Override
    public void L(UiSupport_548 class_548) {
        int n;
        UiSupport_548 a = class_548;
        UiSupport_588 a2 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_588 class_588 = a2;
        UiSupport_588 class_5882 = a2;
        class_103.D((float)(class_588.f + (class_588.e - a2.I.L()) / 2.0f), class_5882.d + class_5882.e.L() + 2.0f, a2.I.L(), UiSupport_588.h(), Float.MAX_VALUE, a.L().G());
        ModuleCategory[] enum_226Array = ModuleCategory.values();
        int n2 = enum_226Array.length;
        int n3 = 0;
        while (n3 < n2) {
            ModuleCategory enum_226;
            ModuleCategory enum_2262 = enum_226 = enum_226Array[0];
            int n4 = enum_2262.ordinal();
            UiSupport_588 class_5883 = a2;
            float f2 = class_5883.L(n4);
            reference var9_11 = class_5883.f + a2.e / 2.0f;
            int n5 = enum_2262 == a2.l ? 1 : 0;
            UiSupport_588 class_5884 = a2;
            a2.j[n4].L(class_103, (float)(class_5884.f + (class_5884.e - UiSupport_588.F()) / 2.0f), f2 + 2.0f, UiSupport_588.F(), UiSupport_588.h(), Float.MAX_VALUE, a.L().d());
            UiSupport_548 class_5482 = a;
            n4 = n5 != 0 ? class_5482.L().D() : class_5482.L().F();
            UiSupport_546.L(class_103, enum_226, (float)var9_11, f2 + 2.0f + UiSupport_588.h() / 2.0f, 16.0f, n4);
            UiSupport_548 class_5483 = a;
            n4 = n5 != 0 ? class_5483.L().d() : ThemeSupport_059.L(class_5483.L().F(), 0.9f);
            class_103.L(ThemeSupport_057.i(), enum_226.d(), (float)var9_11, f2 + UiSupport_588.l(), n4);
            n3 = ++n;
        }
        UiSupport_588 class_5885 = a2;
        UiSupport_588 class_5886 = a2;
        int n6 = class_5885.d + class_5886.i - UiSupport_588.I();
        reference var4_6 = class_5886.f + a2.e / 2.0f;
        UiSupport_588 class_5887 = a2;
        class_5885.h.L(class_103, (float)(class_5887.f + (class_5887.e - UiSupport_588.F()) / 2.0f), n6 + 2.0f, UiSupport_588.F(), UiSupport_588.h(), Float.MAX_VALUE, a.L().d());
        RenderSupport_103 class_1032 = class_103;
        class_1032.L("\ue161", (float)var4_6, (float)(n6 + 2.0f + UiSupport_588.h() / 2.0f), 16.0f, a.L().F());
        class_1032.L(ThemeSupport_057.i(), "Configs", (float)var4_6, (float)(n6 + UiSupport_588.l()), ThemeSupport_059.L(a.L().F(), 0.9f));
    }

    private static float F() {
return 46.0f;
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
        if (!v0.i) {
            a.i = 5 >> 2;
            v1 = a;
            a.e.L(v1.d(v1.l.ordinal()));
            a.I.L(UiSupport_588.F());
        }
        a.m = -4 >> 2;
        a.d = 3 & 4;
        var2_2 = ModuleCategory.values();
        var5_4 = var2_2.length;
        v2 = var4_5 = 3 >> 2;
        while (v2 < var5_4) {
            var3_6 = var2_2[var4_5].ordinal();
            if (!(a.H >= a.f)) ** GOTO lbl-1000
            v3 = a;
            if (a.H < v3.f + v3.e && a.f >= a.L(var3_6) && a.f < a.L(var3_6) + UiSupport_588.I()) {
                v4 = 4 ^ 5;
            } else lbl-1000:
            // 2 sources

            {
                v4 = var6_7 = 0;
            }
            if (var6_7 != 0) {
                a.m = var3_6;
            }
            a.j[var3_6].L(a.i, (boolean)var6_7, (boolean)(3 & 4));
            v2 = ++var4_5;
        }
        v5 = a;
        var2_3 = v5.d + v5.i - UiSupport_588.I();
        if (!(a.H >= a.f)) ** GOTO lbl-1000
        v6 = a;
        if (a.H < v6.f + v6.e && a.f >= var2_3 && a.f < var2_3 + UiSupport_588.I()) {
            v7 = --1;
        } else lbl-1000:
        // 2 sources

        {
            v7 = 0;
        }
        a.d = v7;
        v8 = a;
        v9 = a;
        v8.h.L(a.i, v9.d, 5 >> 3);
        v9.e.L(a.i);
        v8.I.L(a.i);
    }

    private static float l() {
return 36.0f;
    }

    private float d(int n) {
        int a = -35;
        UiSupport_588 a2 = this;
return 0.0f * UiSupport_588.I();
    }

    @Override
    public boolean L(float f2, float f3, int n) {
        int a = 0;
        UiSupport_588 a2 = this;
if (0 != 0) {
            return 3 >> 2;
        }
        if (a2.d) {
            boolean bl = --1 != 0;
            a2.f.run();
            return bl;
        }
        if (a2.m < 0) {
            return 3 >> 2;
        }
        a2.L(ModuleCategory.values()[a2.m]);
        return --1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_588(ModuleCategory enum_226, Consumer<ModuleCategory> consumer, Runnable runnable) {
        void a;
        void a2;
        ModuleCategory a3 = enum_226;
        UiSupport_588 a4 = this;
        a4.j = new UiSupport_545[ModuleCategory.values().length];
        UiSupport_588 class_588 = a4;
        UiSupport_588 class_5882 = a4;
        UiSupport_588 class_5883 = a4;
        UiSupport_588 class_5884 = a4;
        class_5883.h = new UiSupport_545();
        class_5884.e = new RenderSupport_121(0.0f);
        class_5883.I = new RenderSupport_121(0.0f);
        class_5882.m = -1;
        class_5882.l = a3;
        class_588.H = a2;
        class_588.f = a;
        int n = 0;
        while (n < a4.j.length) {
            a4.j[a3++] = new UiSupport_545();
            n = 0;
        }
    }

    private static float h() {
return 26.0f;
    }

    private static float I() {
return 50.0f;
    }

    private float L(int n) {
        int a = -35;
        UiSupport_588 a2 = this;
return a2.d + a2.d(0);
    }

    public void L(ModuleCategory enum_226) {
        ModuleCategory a = enum_226;
        UiSupport_588 a2 = this;
if (a2.l == a) {
            return;
        }
        a2.l = a;
        a2.e.L(a2.d(a.ordinal()), 300.0f, RenderSupport_123.l);
        a2.I.L(UiSupport_588.F() * 0.6f).L(UiSupport_588.F(), 300.0f, RenderSupport_123.l);
        a2.H.accept(a);
    }

    @Generated
    public ModuleCategory L() {
        UiSupport_588 a;
return a.l;
    }
}

