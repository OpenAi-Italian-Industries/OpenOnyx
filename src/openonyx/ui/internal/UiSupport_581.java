/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.List;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_581<E extends Enum<E>>
extends UiSupport_596 {
    private final static float D = 24.0f;
    private final static float c = 8.0f;
    private final List<RenderSupport_121> a;
    private final List<UiSupport_545> k;
    private int g;
    private final EnumSetting<E> M;
    private boolean L;
    private final static float j = 1.5f;
    private final static float m = 4.0f;

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_581 a2 = this;
return a2.B() - a2.d + (float)a2.M.d().size() * 24.0f - 8.0f + 6.0f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void d(UiSupport_548 var1_2) {
        var2_3 = this;
super.d((UiSupport_548)a);
        var2_3.g = -4 >> 2;
        v0 = a = 2 & 5;
        while (v0 < var2_3.M.d().size()) {
            v1 = var5_6 = var2_3.M.L() == var2_3.M.d().get(a) ? --1 : 0;
            if (!(a.H >= var2_3.f)) ** GOTO lbl-1000
            v2 = var2_3;
            if (a.H < v2.f + v2.e && a.f >= var2_3.L(a) && a.f < var2_3.L(a) + 24.0f) {
                v3 = 4 ^ 5;
            } else lbl-1000:
            // 2 sources

            {
                v3 = var4_5 = 0;
            }
            if (var4_5 != 0) {
                var2_3.g = a;
            }
            var3_4 = var2_3.a.get(a);
            if (!var2_3.L) {
                var3_4.L(var5_6 != 0 ? 1.0f : 0.0f);
                v4 = var3_4;
            } else {
                if (var3_4.d() != (var5_6 != 0 ? 1.0f : 0.0f)) {
                    var3_4.L(var5_6 != 0 ? 1.0f : 0.0f, 200.0f, RenderSupport_123.l);
                }
                v4 = var3_4;
            }
            v4.L(a.i);
            var2_3.k.get(++a).L(a.i, (boolean)var4_5, (boolean)(2 & 5));
            v0 = a;
        }
        var2_3.L = 4 ^ 5;
    }

    private float B() {
        UiSupport_581 a;
return a.l() - 1.5f;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_581(EnumSetting<E> interface_001) {
        int n;
        OnyxListener_001 a;
        void a2;
        UiSupport_581 class_581 = interface_0012;
        OnyxListener_001 interface_0012 = interface_001;
        interface_001 = class_581;
        void v1 = a2;
        super((Setting)a);
        void v2 = a2;
        a2.a = new ArrayList<RenderSupport_121>();
        v2.k = new ArrayList<UiSupport_545>();
        v1.g = -1;
        v1.M = a;
        int n2 = 0;
        while (n2 < ((EnumSetting)a).d().size()) {
            a2.a.add(new RenderSupport_121(0.0f));
            a2.k.add(new UiSupport_545());
            n2 = ++n;
        }
    }

    private float L(int n) {
        int a = -35;
        UiSupport_581 a2 = this;
return a2.B() - 4.0f + 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        int n;
        void a;
        UiSupport_581 class_581 = this;
RenderSupport_103 a2 = a.e;
        UiSupport_581 class_5812 = class_581;
        class_5812.L((UiSupport_548)a, class_5812.e);
        int n2 = 0;
        while (n2 < class_581.M.d().size()) {
            float f3;
            Enum enum_ = (Enum)class_581.M.d().get(0);
            UiSupport_581 class_5813 = class_581;
            float a322 = class_5813.L(0);
            float f4 = a322 + 12.0f;
            int n3 = class_5813.M.L() == enum_ ? 1 : 0;
            class_581.k.get(0).L(a2, class_581.f - 4.0f, a322, class_581.e + 8.0f, 24.0f, 8.0f, class_581.L(a.L().d()));
            void v3 = a;
            int a322 = n3 != 0 ? v3.L().E() : v3.L().F();
            UiSupport_581 class_5814 = class_581;
            a2.L(class_5814.f + 8.0f, f4, 8.0f, 1.5f, class_581.L(a322));
            float a322 = class_5814.a.get(0).L();
            if (f3 > 0.01f) {
                a2.L(class_581.f + 8.0f, f4, 4.0f * a322, class_581.L(a.L().E()));
            }
            a2.l(ThemeSupport_057.I, EnumSetting.L(enum_), class_581.f + 16.0f + 9.0f, f4, class_581.L(a.L().d()));
            n2 = ++n;
        }
    }

    @Override
    public boolean L(float f2, float f3, int n) {
        int a = 0;
        UiSupport_581 a2 = this;
if (!a2.i() || 0 != 0 || a2.g < 0) {
            return false;
        }
        UiSupport_581 class_581 = a2;
        class_581.M.i((Enum)class_581.M.d().get(a2.g));
        return 1 != 0;
    }
}

