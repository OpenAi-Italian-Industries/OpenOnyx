/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_059;

public final class UiSupport_545 {
    private final RenderSupport_121 e;

    public UiSupport_545() {
        UiSupport_545 a;
        UiSupport_545 class_545 = a;
        class_545.e = new RenderSupport_121(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        float f7;
        UiSupport_545 class_545 = this;
float a8 = class_545.e.L();
        if (f7 <= 0.001f) {
            return;
        }
        a7.D((float)a6, (float)a5, (float)a4, (float)a3, (float)a2, ThemeSupport_059.L((int)a, a8));
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, boolean bl, boolean bl2) {
        void a;
        void a2;
        float a3;
        void a4;
        UiSupport_545 class_545 = this;
float f3 = a4 != false ? 0.1f : (a3 = a2 != false ? 0.08f : 0.0f);
        if (class_545.e.d() != a3) {
            class_545.e.L(a3, a4 != false ? 100.0f : 150.0f, RenderSupport_123.f);
        }
        class_545.e.L(0.0f);
    }
}

