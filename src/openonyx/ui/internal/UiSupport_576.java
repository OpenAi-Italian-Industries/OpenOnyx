/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.render.RenderSupport_103;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiMode_598;

public class UiSupport_576
extends UiSupport_549 {
    private final static float C = 16.0f;
    private final static float J = 6.0f;
    private String D;
    final public static float c = 30.0f;
    private final static float a = 18.0f;
    private final static float k = 900.0f;
    private final Runnable g;
    private final static float M = 12.0f;
    private String L;
    private final UiSupport_545 j;
    private final static float m = 1.8f;
    private final UiMode_598 h;
    private boolean l;
    private final static float I = 12.0f;
    private float H;

    private boolean I() {
        UiSupport_576 a;
if (a.I != false && !a.l) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, int n) {
        void a;
        void a2;
        UiSupport_576 class_576 = this;
UiSupport_576 class_5762 = class_576;
        float a3 = a2.L(ThemeSupport_057.l, class_5762.L);
        float f2 = class_5762.D == null ? 0.0f : 22.0f;
        UiSupport_576 class_5763 = class_576;
        UiSupport_576 class_5764 = class_576;
        a3 = class_5763.f + (class_5764.e - a3 - f2) / 2.0f;
        float f3 = class_5763.d + class_576.i / 2.0f;
        if (class_5764.D != null) {
            float f4 = a3;
            a2.L(class_576.D, f4 + 8.0f, f3, 16.0f, (int)a);
            a3 = f4 + f2;
        }
        a2.l(ThemeSupport_057.l, class_576.L, a3, f3, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_576 a4 = this;
if (a3 != 0 || !a4.I() || !a4.L((float)a2, (float)a)) {
            return false;
        }
        a4.H = 1;
        a4.g.run();
        return 3 >> 1;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_576 class_576;
        int n;
        UiSupport_548 a = class_548;
        UiSupport_576 a2 = this;
UiSupport_576 class_5762 = a2;
        super.d(a);
        UiSupport_545 class_545 = class_5762.j;
        float f2 = a.i;
        if (a2.h != false && a2.I()) {
            n = 1;
            class_576 = a2;
        } else {
            n = 0;
            class_576 = a2;
        }
        class_545.L(f2, n != 0, (class_576.H != false && a2.I() ? 1 : 0) != 0);
        if (a2.l) {
            a2.H = (a2.H + a.i) % 900.0f;
        }
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        int a = 0;
        UiSupport_576 a2 = this;
boolean bl = 5 >> 3;
        a2.H = (float)bl;
        return bl;
    }

    @Generated
    public void d(String string) {
        String a = string;
        UiSupport_576 a2 = this;
a2.D = a;
    }

    @Generated
    public void d(boolean bl) {
        boolean a = bl;
        UiSupport_576 a2 = this;
a2.l = a;
    }

    @Generated
    public void L(String string) {
        String a = string;
        UiSupport_576 a2 = this;
a2.L = a;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_576(UiMode_598 enum_598, String string, String string2, Runnable runnable) {
        Runnable a;
        void a2;
        void a3;
        void a4;
        UiSupport_576 a5;
        UiSupport_576 class_576 = runnable2;
        Runnable runnable2 = runnable;
        UiSupport_576 class_5762 = a5 = class_576;
        UiSupport_576 class_5763 = a5;
        UiSupport_576 class_5764 = a5;
        a5.j = new UiSupport_545();
        a5.h = a4;
        class_5763.L = a3;
        class_5763.D = a2;
        class_5762.g = a;
        class_5762.i = 30.0f;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_576(UiMode_598 enum_598, String string, Runnable runnable) {
        void a;
        void a2;
        Runnable a3 = runnable;
        UiSupport_576 a4 = this;
        a4((UiMode_598)a2, (String)a, null, a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_576 class_576;
        void a;
        UiSupport_576 class_5762 = this;
OnyxListener_001 a2 = a.e;
        UiSupport_576 class_5763 = class_5762;
        int n = class_5763.L((UiSupport_548)a);
        int n2 = class_5763.d((UiSupport_548)a);
        if (!class_5763.I()) {
            n = ThemeSupport_059.L(0);
        }
        if (n2 != 0) {
            UiSupport_576 class_5764 = class_5762;
            UiSupport_576 class_5765 = class_5762;
            ((RenderSupport_103)a2).D(class_5764.f, class_5764.d, class_5765.e, class_5765.i, Float.MAX_VALUE, class_5762.I() ? n2 : ThemeSupport_059.L(a.L().d(), 0.12f));
        }
        if (class_5762.h == UiMode_598.d) {
            UiSupport_576 class_5766 = class_5762;
            UiSupport_576 class_5767 = class_5762;
            void v5 = a;
            ((RenderSupport_103)a2).L(class_5766.f, class_5766.d, class_5767.e, class_5767.i, Float.MAX_VALUE, 1.0f, class_5762.I() ? v5.L().e() : ThemeSupport_059.L(v5.L().e()));
        }
        UiSupport_576 class_5768 = class_5762;
        UiSupport_576 class_5769 = class_5762;
        UiSupport_576 class_57610 = class_5762;
        class_5768.j.L((RenderSupport_103)a2, class_5769.f, class_5769.d, class_57610.e, class_57610.i, Float.MAX_VALUE, 0);
        if (class_5768.l) {
            UiSupport_576 class_57611 = class_5762;
            class_576 = class_57611;
            UiSupport_576 class_57612 = class_5762;
            ((RenderSupport_103)a2).L(class_5762.f + class_57611.e / 2.0f, class_57612.d + class_57612.i / 2.0f, 6.0f, 1.8f, class_5762.H / 900.0f, 0);
        } else {
            UiSupport_576 class_57613 = class_5762;
            class_576 = class_57613;
            class_57613.L((RenderSupport_103)a2, 0);
        }
        if (class_576.h != false && class_5762.I()) {
            ((RenderSupport_103)a2).h();
        }
    }

    public float L(RenderSupport_103 class_103) {
        OnyxListener_001 a22 = class_103;
        UiSupport_576 a = this;
float f2 = a.h == UiMode_598.f ? 12.0f : 18.0f;
        UiSupport_576 class_576 = a;
        float a22 = ((RenderSupport_103)a22).L(ThemeSupport_057.l, class_576.L);
        float f3 = class_576.D == null ? 0.0f : 22.0f;
        return f2 * 2.0f + 0 + f3;
    }

    @Generated
    public boolean i() {
        UiSupport_576 a;
return a.l;
    }

    private int d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_576 a2 = this;
switch (a2.h.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return a.L().E();
            }
            case 1: {
                return a.L().G();
            }
            case 2: 
            case 3: {
                return 0;
            }
        }
    }

    private int L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_576 a2 = this;
switch (a2.h.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return a.L().h();
            }
            case 1: {
                return a.L().D();
            }
            case 2: 
            case 3: {
                return a.L().E();
            }
        }
    }
}

