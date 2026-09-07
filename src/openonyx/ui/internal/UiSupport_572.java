/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.TextEditor;
import openonyx.ui.internal.UiListener_573;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class UiSupport_572
extends UiSupport_549 {
    private RenderSupport_103 D;
    private boolean c;
    final protected RenderSupport_121 a;
    final protected TextEditor k;
    private float g;
    private long M;
    private int L;
    private final static float j = 3.0f;
    private float m;
    private final static long h = 320L;
    private final static float l = 0.32f;
    private final static float I = 1.2f;
    protected boolean f;
    private static UiSupport_572 e;

    public String L() {
        UiSupport_572 a;
return a.k.L();
    }

    private int L(float f2) {
        float a = f2;
        UiSupport_572 a2 = this;
return a2.k.L(0 - a2.l() + a2.m, a2.L());
    }

    @Override
    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_572 a2 = this;
if (a2.f && a2.k.L(a)) {
            return --1 != 0;
        }
        return false;
    }

    protected abstract float l();

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_572 a2 = this;
UiSupport_572 class_572 = a2;
        super.d(a);
        a2.D = a.e;
        class_572.a.L(a.i);
        a2.k.L(a.i);
    }

    public static boolean h() {
if (e != null) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f2;
        UiSupport_572 a4 = this;
if (a2 != false) {
            return 3 >> 2;
        }
        if (!a4.L(a3, (float)a)) {
            boolean bl = 3 >> 2;
            a4.D(bl);
            return bl;
        }
        return a4.L(a3, 0 != 0);
    }

    public void D(boolean bl) {
        UiSupport_572 class_572;
        boolean a = bl;
        UiSupport_572 a2 = this;
if (a2.f == a) {
            return;
        }
        a2.f = a;
        a2.c = 0;
        if (a) {
            if (e != null && e != a2) {
                e.D(0 != 0);
            }
            class_572 = e = a2;
        } else {
            if (e == a2) {
                e = null;
            }
            class_572 = a2;
        }
        class_572.k.D();
        if (!a) {
            a2.k.L();
        }
        a2.a.L(a ? 1.0f : 0.0f, 200.0f, RenderSupport_123.f);
    }

    public boolean I() {
        UiSupport_572 a;
return a.k.i();
    }

    protected abstract float h();

    public UiSupport_572() {
        UiSupport_572 a;
        UiSupport_572 class_572 = a;
        a.k = new TextEditor();
        class_572.a = new RenderSupport_121(0.0f);
    }

    public void L(String string) {
        String a = string;
        UiSupport_572 a2 = this;
a2.k.L(a);
        a2.m = 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        void a;
        int a2 = 0;
        UiSupport_572 a3 = this;
if (!a3.c || 0 != 0) {
            return false;
        }
        a3.k.L(a3.L(0.0f), 3 >> 1);
        return --1 != 0;
    }

    public static void D() {
if (e != null) {
            e.D(0 != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected boolean L(float f2, boolean bl) {
        void a;
        float a2 = f2;
        UiSupport_572 a3 = this;
long l = System.currentTimeMillis();
        int n = Math.abs(0 - a3.g) <= 3.0f ? 1 : 0;
        a3.L = l - a3.M <= 320L && 0 != 0 ? a3.L + 1 : 0;
        UiSupport_572 class_572 = a3;
        a3.M = l;
        class_572.g = 0;
        class_572.D(3 >> 1);
        if (class_572.L == 1) {
            boolean bl2 = --1 != 0;
            a3.k.L(a3.L(0));
            return bl2;
        }
        if (a3.L >= 2) {
            a3.k.d();
            return 1 != 0;
        }
        int n2 = 1;
        a3.k.L(a3.L(0), (boolean)a);
        a3.c = n2;
        return 1 != 0;
    }

    @Generated
    public boolean i() {
        UiSupport_572 a;
return a.f;
    }

    protected float I() {
        UiSupport_572 a;
return Math.max(0.0f, a.h() - a.l());
    }

    public void d() {
        UiSupport_572 a;
a.k.d();
    }

    protected abstract RenderSupport_128 L();

    public void d(boolean bl) {
        boolean a = bl;
        UiSupport_572 a2 = this;
a2.k.L(a);
    }

    /*
     * WARNING - void declaration
     */
    private static float L(RenderSupport_103 class_103, RenderSupport_128 class_128, String string) {
        void a;
        String a2 = string;
        RenderSupport_103 a3 = class_103;
return a3.L((RenderSupport_128)a, a2);
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_572 a2 = this;
if (a2.f && a2.k.L(a)) {
            return 3 >> 1;
        }
        return false;
    }

    private UiListener_573 L() {
        UiSupport_572 class_572 = this;
UiSupport_572 class_5722 = class_572;
        OnyxListener_001 a2 = class_5722.D;
        RenderSupport_128 class_128 = class_5722.L();
        if (a2 == null) {
            return a -> {
return 0.0f;
            };
        }
        return arg_0 -> UiSupport_572.L((RenderSupport_103)a2, class_128, arg_0);
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        int a = 0;
        UiSupport_572 a2 = this;
a2.c = 0;
        return a2.c;
    }

    /*
     * WARNING - void declaration
     */
    protected void L(UiSupport_548 class_548, float f2, float f3, int n) {
        void a;
        void a2;
        float f4;
        void a3;
        UiSupport_572 class_572 = this;
RenderSupport_103 class_103 = a3.e;
        UiSupport_572 class_5722 = class_572;
        UiListener_573 interface_573 = class_5722.L();
        String string = class_5722.k.D();
        float a4 = class_5722.I();
        float f5 = class_5722.k.L(interface_573);
        if (f4 - class_572.m > 0) {
            class_572.m = f5 - 0;
        }
        if (f5 - class_572.m < 0.0f) {
            class_572.m = f5;
        }
        UiSupport_572 class_5723 = class_572;
        class_5723.m = Math.clamp(class_5723.m, 0.0f, Math.max(0.0f, interface_573.L(string) - 0));
        float f6 = class_5723.l() - class_572.m;
        class_103.d(class_572.l(), class_572.d, 0, class_572.i);
        if (class_572.k.D()) {
            UiSupport_572 class_5724 = class_572;
            a4 = f6 + class_5724.k.L(class_5724.k.L(), interface_573);
            UiSupport_572 class_5725 = class_572;
            float f7 = f6 + class_5725.k.L(class_5725.k.d(), interface_573);
            float f8 = 0;
            class_103.D(f8, (float)(a2 - a / 2.0f), f7 - f8, (float)a, 0.0f, ThemeSupport_059.L(a3.L().E(), 0.32f));
        }
        if (!string.isEmpty()) {
            void a5;
            class_103.l(class_572.L(), string, f6, 0.0f, (int)a5);
        }
        if (class_572.f && class_572.k.l()) {
            class_103.D(f6 + f5, (float)(a2 - a / 2.0f), 1.2f, (float)a, Float.MAX_VALUE, a3.L().E());
        }
        class_103.L();
    }
}

