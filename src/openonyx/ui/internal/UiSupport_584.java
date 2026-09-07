/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import lombok.Generated;
import openonyx.configuration.Event;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.NetworkSupport_460;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_602;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UiSupport_584
extends UiSupport_549 {
    private final NetworkSupport_458 t;
    final public static float b = 56.0f;
    private final static float E = 1.8f;
    private final static float F = 14.0f;
    private final Consumer<UiSupport_584> G;
    private boolean A;
    private final static float K = 24.0f;
    private final static float B = 20.0f;
    private final Consumer<UiSupport_584> C;
    private float J;
    private final static float D = 3.0f;
    private final static float c = 10.0f;
    private final RenderSupport_124 a;
    private final static long k = 60000L;
    private final static float g = 900.0f;
    private final static float M = 6.0f;
    private final static float L = 11.0f;
    private final static float j = 8.0f;
    private final UiSupport_545 m;
    private final static float h = 32.0f;
    private boolean l;
    private final static long d = 600000L;
    private final UiSupport_602 i;
    private final RenderSupport_121 f;
    private final static float H = 12.0f;
    private final static long e = 3600000L;

    /*
     * WARNING - void declaration
     */
    public UiSupport_584(NetworkSupport_458 class_458, Consumer<UiSupport_584> consumer, Consumer<UiSupport_584> consumer2) {
        void a;
        void a2;
        UiSupport_584 a3;
        Consumer<UiSupport_584> a4 = consumer2;
        UiSupport_584 class_584 = a3 = this;
        UiSupport_584 class_5842 = a3;
        UiSupport_584 class_5843 = a3;
        a3.m = new UiSupport_545();
        class_5843.a = new RenderSupport_124(0);
        a3.f = new RenderSupport_121(0.0f);
        class_5842.t = a2;
        class_5842.i = (UiSupport_602)56.0f;
        class_584.G = a;
        class_584.C = a4;
        class_584.i = new UiSupport_602("\ue5d4", () -> {
            Consumer a = a4;
            UiSupport_584 a2 = this;
a.accept(a2);
        });
        UiSupport_584 class_5844 = a3;
        class_5844.l.add(class_5844.i);
    }

    @Override
    protected void L() {
        UiSupport_584 a;
UiSupport_584 class_584 = a;
        UiSupport_584 class_5842 = a;
        class_584.i.L((float)(class_584.f + a.e - 30.0f - 8.0f), class_5842.d + (class_5842.i - 30.0f) / 2.0f, 30.0f, 30.0f);
    }

    private int L(ThemeSupport_055 class_055) {
        ThemeSupport_055 a = class_055;
        UiSupport_584 a2 = this;
long l = a2.t.d() - System.currentTimeMillis();
        if (l <= 600000L) {
            return a.K();
        }
        if (l <= 3600000L) {
            return a.H();
        }
        return a.B();
    }

    private boolean i() {
        UiSupport_584 a;
if (OnyxClient.f.L() == a.t) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        float f2;
        void a;
        UiSupport_584 class_584 = this;
OnyxListener_001 a2 = a.e;
        UiSupport_584 class_5842 = class_584;
        int n = class_584.i();
        long l = class_5842.d + class_584.i / 2.0f;
        UiSupport_584 class_5843 = class_584;
        UiSupport_584 class_5844 = class_584;
        ((RenderSupport_103)a2).D((float)class_5843.f, class_5843.d, class_5844.e, (float)class_5844.i, 16.0f, class_584.a.L());
        UiSupport_584 class_5845 = class_584;
        UiSupport_584 class_5846 = class_584;
        class_5842.m.L((RenderSupport_103)a2, (float)class_5845.f, class_5845.d, class_5846.e, (float)class_5846.i, 16.0f, a.L().d());
        float f3 = class_5842.f.L();
        if (f2 > 0.01f) {
            ((RenderSupport_103)a2).L((float)(class_584.f + 11.0f), (float)l, 3.0f * f3, ThemeSupport_059.L(a.L().E(), f3));
        }
        f3 = l - 16.0f;
        OnyxListener_001 interface_001 = a2;
        ((RenderSupport_103)interface_001).D((float)(class_584.f + 20.0f), f3, 32.0f, 32.0f, 4.0f, a.L().n());
        ((RenderSupport_103)interface_001).L(NetworkSupport_460.L(class_584.t.L(), class_584.t.D()), (float)(class_584.f + 20.0f), f3, 32.0f);
        void v7 = a;
        int n2 = n != 0 ? v7.L().D() : v7.L().d();
        void v8 = a;
        n = n != 0 ? ThemeSupport_059.L(v8.L().D(), 0.72f) : v8.L().F();
        String string = class_584.L();
        float f4 = string == null ? 0.0f : ((RenderSupport_103)a2).L(ThemeSupport_057.C, string) + 10.0f;
        UiSupport_584 class_5847 = class_584;
        reference var8_10 = class_5847.f + 20.0f + 32.0f + 12.0f;
        f4 = class_5847.i.d() - 10.0f - f4;
        String string2 = new StringBuilder().insert(0, "(").append(class_584.t.L().L()).append(")").toString();
        OnyxListener_001 interface_0012 = a2;
        float f5 = ((RenderSupport_103)interface_0012).L(ThemeSupport_057.C, string2);
        String string3 = ((RenderSupport_103)interface_0012).L(ThemeSupport_057.l, class_584.t.D(), Math.max(24.0f, f4 - var8_10 - f5 - 6.0f));
        ((RenderSupport_103)interface_0012).l(ThemeSupport_057.l, string3, (float)var8_10, l, n2);
        ((RenderSupport_103)interface_0012).l(ThemeSupport_057.C, string2, (float)(var8_10 + ((RenderSupport_103)a2).L(ThemeSupport_057.l, string3) + 6.0f), l, n);
        if (string != null) {
            ((RenderSupport_103)a2).d(ThemeSupport_057.C, string, class_584.i.d() - 10.0f, l, class_584.L(a.L()));
        }
        if (class_584.l) {
            ((RenderSupport_103)a2).L(class_584.i.d() + 15.0f, l, 7.0f, 1.8f, class_584.J / 900.0f, a.L().E());
            return;
        }
        super.L((UiSupport_548)a);
    }

    @Generated
    public NetworkSupport_458 L() {
        UiSupport_584 a;
return a.t;
    }

    public UiSupport_549 L() {
        UiSupport_584 a;
return a.i;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_584 a4 = this;
if (a4.l) {
            return a4.L((float)a2, (float)a);
        }
        if (a4.i.L((float)a2, (float)a, a3)) {
            return 1 != 0;
        }
        if (!a4.L((float)a2, (float)a)) {
            return 0 != 0;
        }
        if (a3 == 0) {
            boolean bl = 1;
            a4.H = (float)bl;
            a4.G.accept(a4);
            return bl;
        }
        if (a3 == 1) {
            boolean bl = --1 != 0;
            a4.C.accept(a4);
            return bl;
        }
        return false;
    }

    private String L() {
        StringBuilder stringBuilder;
        UiSupport_584 a;
long l = a.t.d();
        if (l <= 0L) {
            return null;
        }
        if ((l -= System.currentTimeMillis()) <= 0L) {
            return "Expired";
        }
        long l2 = l / 3600000L;
        l = l % 3600000L / 60000L;
        if (l2 > 0L) {
            stringBuilder = new StringBuilder();
            return stringBuilder.append(l2).append("h").append(l).append("m").toString();
        }
        stringBuilder = new StringBuilder();
        return stringBuilder.append(Math.max(1L, l)).append("m").toString();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_584 a4 = this;
a4.H = 0;
        return super.d((float)a2, (float)a, a3);
    }

    @Generated
    public void d(boolean bl) {
        boolean a = bl;
        UiSupport_584 a2 = this;
a2.l = a;
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_584 class_584;
        int n;
        int n2;
        UiSupport_548 a = class_548;
        UiSupport_584 a2 = this;
UiSupport_584 class_5842 = a2;
        super.d(a);
        boolean bl = class_5842.i();
        Object object = a;
        int n3 = n2 = bl ? ((UiSupport_548)object).L().G() : ((UiSupport_548)object).L().O();
        if (!a2.A) {
            UiSupport_584 class_5843 = a2;
            class_5843.A = 1;
            class_5843.a.L(n2);
            class_5843.f.L(bl ? 1.0f : 0.0f);
        }
        UiSupport_584 class_5844 = a2;
        class_5844.a.L(n2, 250.0f, RenderSupport_123.f);
        a2.a.L(a.i);
        class_5844.f.L(bl ? 1.0f : 0.0f, 250.0f, RenderSupport_123.f);
        a2.f.L(a.i);
        UiSupport_545 class_545 = a2.m;
        float f2 = a.i;
        if (a2.h != false && !a2.l && !a2.i.D()) {
            n = 1;
            class_584 = a2;
        } else {
            n = 0;
            class_584 = a2;
        }
        class_545.L(f2, n != 0, (boolean)class_584.H);
        if (a2.l) {
            a2.J = (a2.J + a.i) % 900.0f;
        }
    }
}

