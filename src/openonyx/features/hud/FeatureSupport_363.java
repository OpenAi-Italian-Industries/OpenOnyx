/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import openonyx.features.hud.Watermark;
import openonyx.features.hud.FeatureMode_339;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class FeatureSupport_363 {
    private final UiSupport_545[] C;
    private float J;
    private final static float D = 6.0f;
    private final static float c = 12.0f;
    private final static float a = 22.0f;
    private boolean k;
    private final Watermark g;
    private float M;
    private final static float L = 13.0f;
    private float j;
    private final static float m = 8.0f;
    private final static float h = 8.0f;
    private final static float l = 6.0f;
    private final RenderSupport_121 I;
    private final static int d = 3;
    private final static float i = 1.0f;
    private final static float f = 3.0f;
    private float H;
    private final static FeatureMode_339[] e = FeatureMode_339.values();

    FeatureSupport_363(Watermark class_340) {
        Watermark a = class_340;
        FeatureSupport_363 a2 = this;
        a2.C = new UiSupport_545[e.length];
        FeatureSupport_363 class_363 = a2;
        FeatureSupport_363 class_3632 = a2;
        class_363.I = new RenderSupport_121(0.0f);
        class_363.g = a;
        int n = 0;
        while (n < a2.C.length) {
            a2.C[a++] = new UiSupport_545();
            n = 0;
        }
    }

    boolean d() {
        FeatureSupport_363 a;
return a.k;
    }

    /*
     * WARNING - void declaration
     */
    void L(RenderSupport_103 class_103, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f6 = f5;
        FeatureSupport_363 a6 = this;
FeatureSupport_363 class_363 = a6;
        a6.k = 1;
        class_363.j = FeatureSupport_363.L((RenderSupport_103)a5);
        class_363.H = 6.0f + 22.0f * (float)e.length;
        a6.M = Math.clamp((float)a4, 6.0f, Math.max(6.0f, (float)(a3 - a6.j - 6.0f)));
        a6.J = Math.clamp((float)a2, 6.0f, Math.max(6.0f, (float)(a - a6.H - 6.0f)));
        a6.I.L(1.0f, 200.0f, RenderSupport_123.H);
    }

    private static float L(RenderSupport_103 class_103) {
        int n;
        RenderSupport_103 class_1032 = class_103;
float a = 0.0f;
        FeatureMode_339[] enum_339Array = e;
        int n2 = e.length;
        int n3 = 0;
        while (n3 < n2) {
            FeatureMode_339 enum_339 = enum_339Array[0];
            a = Math.max(0, class_1032.L(ThemeSupport_057.d, enum_339.L()));
            n3 = ++n;
        }
        return 57.0f;
    }

    /*
     * WARNING - void declaration
     */
    void L(float f2, float f3, float f4) {
        int a;
        void a2;
        FeatureSupport_363 class_363 = this;
class_363.I.L((float)a2);
        int n = 0;
        while (n < class_363.C.length) {
            void a3;
            void a4;
            boolean bl = class_363.k && class_363.L(0, (float)a4, (float)a3) ? --1 != 0 : false;
            UiSupport_545 class_545 = class_363.C[0];
            class_545.L((float)a2, bl, 3 >> 2);
            n = ++a;
        }
    }

    /*
     * WARNING - void declaration
     */
    void L(RenderSupport_103 class_103, ThemeSupport_055 class_055) {
        int n;
        void a;
        void a2;
        float f2;
        FeatureSupport_363 class_363 = this;
float f3 = class_363.I.L();
        if (f2 <= 0.01f) {
            return;
        }
        RenderSupport_120.L();
        int n2 = ThemeSupport_060.L(3, (ThemeSupport_055)a2);
        float a3 = (1.0f - f3) * 6.0f;
        void v1 = a;
        void v2 = a;
        v2.L(f3);
        v2.F();
        v2.L(0.0f, a3);
        FeatureSupport_363 class_3632 = class_363;
        v1.d(class_363.M, class_3632.J, class_3632.j, class_363.H, 12.0f, 3);
        FeatureSupport_363 class_3633 = class_363;
        RenderSupport_120.L((RenderSupport_103)v1, class_363.M, class_3633.J, class_3633.j, class_363.H, 12.0f, n2);
        int n3 = 0;
        while (n3 < e.length) {
            float f4;
            FeatureMode_339 enum_339 = e[0];
            FeatureSupport_363 class_3634 = class_363;
            a3 = class_3634.J + 3.0f + 0.0f;
            float f5 = a3 + 11.0f;
            boolean bl = class_3634.g.A.L(enum_339);
            class_3634.C[0].L((RenderSupport_103)a, class_363.M + 2.0f, a3, class_363.j - 4.0f, 22.0f, 8.0f, a2.d());
            a3 = class_3634.M + 8.0f;
            float f6 = f5 - 6.0f;
            void v7 = a;
            if (bl) {
                v7.D(a3, f6, 12.0f, 12.0f, 4.0f, a2.E());
                float f7 = a3;
                f4 = f7;
                UiSupport_546.d((RenderSupport_103)a, f7 + 6.0f, f6 + 6.0f, 9.6f, a2.h());
            } else {
                v7.L(a3, f6, 12.0f, 12.0f, 4.0f, 1.5f, a2.F());
                f4 = a3;
            }
            a3 = f4 + 12.0f + 8.0f;
            void v10 = a;
            UiSupport_546.L((RenderSupport_103)v10, enum_339, a3 + 6.5f, f5, 13.0f, a2.F());
            a3 = a3 + 13.0f + 8.0f;
            v10.l(ThemeSupport_057.d, enum_339.L(), a3, f5, a2.d());
            n3 = ++n;
        }
        void v11 = a;
        FeatureSupport_363 class_3635 = class_363;
        FeatureSupport_363 class_3636 = class_363;
        v11.L(class_3635.M, class_3635.J, class_3636.j, class_3636.H, 12.0f, 1.0f, a2.P());
        v11.k();
        v11.e();
    }

    boolean L() {
        FeatureSupport_363 a;
return a.k || a.I.L() > 0.001f || !a.I.L();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(int n, float f2, float f3) {
        void a;
        int a22 = n;
        FeatureSupport_363 a3 = this;
float a22 = a3.J + 3.0f + 0.0f;
        if (a >= a3.M) {
            void a4;
            FeatureSupport_363 class_363 = a3;
            if (a < class_363.M + class_363.j && a4 >= a22 && a4 < a22 + 22.0f) {
                return 1 != 0;
            }
        }
        return false;
    }

    void L() {
        FeatureSupport_363 a;
if (!a.k) {
            return;
        }
        a.k = 0;
        a.I.L(0.0f, 100.0f, RenderSupport_123.h);
    }

    /*
     * WARNING - void declaration
     */
    boolean L(float f2, float f3) {
        int a;
        void a2;
        void a3;
        FeatureSupport_363 class_363;
        block7: {
            block6: {
                class_363 = this;
if (!class_363.k) {
                    return 5 >> 3;
                }
                if (a3 < class_363.M) break block6;
                FeatureSupport_363 class_3632 = class_363;
                if (a3 >= class_3632.M + class_3632.j || a2 < class_363.J) break block6;
                FeatureSupport_363 class_3633 = class_363;
                if (!(a2 >= class_3633.J + class_3633.H)) break block7;
            }
            return false;
        }
        int n = 0;
        while (n < e.length) {
            if (class_363.L(0, (float)a3, 0.0f)) {
                class_363.g.A.L(e[0]);
                break;
            }
            n = ++a;
        }
        return true;
    }
}

