/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import lombok.Generated;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_554;

public class UiSupport_580
extends UiSupport_549 {
    private final RenderSupport_121 j;
    private float m;
    private final static float h = 12.0f;
    private final Runnable l;
    private final static float I = 0.16f;
    private final static float H = 0.62f;
    private final String e;

    @Generated
    public void L(float f2) {
        float a = f2;
        UiSupport_580 a2 = this;
a2.m = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        float a;
        void a2;
        UiSupport_580 class_580 = this;
UiSupport_580 class_5802 = class_580;
        super.d((UiSupport_548)a2);
        float f2 = a = class_5802.h != false ? 1.0f : 0.0f;
        if (class_580.j.d() != 0) {
            class_580.j.L(0, 150.0f, RenderSupport_123.f);
        }
        class_580.j.L(a2.i);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_580 a4 = this;
if (a3 != 0 || a4.I == false || !a4.L((float)a2, (float)a)) {
            return false;
        }
        a4.l.run();
        return 5 >> 2;
    }

    @Override
    public void L(UiSupport_548 class_548) {
        Object a = class_548;
        UiSupport_580 a2 = this;
Object object = a;
        a = ((UiSupport_548)object).e;
        ThemeSupport_055 class_055 = ((UiSupport_548)object).L();
        UiSupport_580 class_580 = a2;
        float f2 = class_580.j.L();
        UiSupport_580 class_5802 = a2;
        reference var3_4 = class_580.e / class_5802.m;
        float f3 = class_5802.i / a2.m;
        int n = class_055.D();
        Object object2 = a;
        ((RenderSupport_103)object2).L(UiSupport_554.L());
        ((RenderSupport_103)object2).F();
        UiSupport_580 class_5803 = a2;
        UiSupport_580 class_5804 = a2;
        ((RenderSupport_103)object2).L().d(class_5803.f, class_5803.d).L(class_5804.m, class_5804.m);
        Object object3 = a;
        ((RenderSupport_103)object3).d(0.0f, 0.0f, (float)var3_4, f3, 12.0f, 1);
        ((RenderSupport_103)object3).L(0.0f, 0.0f, (float)var3_4, f3, 12.0f, ThemeSupport_059.L(class_055.G(), 0.62f + 0.16f * f2));
        if (f2 > 0.001f) {
            ((RenderSupport_103)a).D(0.0f, 0.0f, (float)var3_4, f3, 12.0f, ThemeSupport_059.L(0, 0.08f * f2));
        }
        Object object4 = a;
        ((RenderSupport_103)object4).L(ThemeSupport_057.l, a2.e, (float)(var3_4 / 2.0f), f3 / 2.0f, 0);
        ((RenderSupport_103)object4).k();
        ((RenderSupport_103)object4).e();
        if (a2.h != false) {
            ((RenderSupport_103)a).h();
        }
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_580(String string, Runnable runnable) {
        void a;
        UiSupport_580 a2;
        Runnable a3 = runnable;
        UiSupport_580 class_580 = a2 = this;
        UiSupport_580 class_5802 = a2;
        a2.j = new RenderSupport_121(0.0f);
        a2.m = 1.0f;
        class_580.e = a;
        class_580.l = a3;
    }
}

