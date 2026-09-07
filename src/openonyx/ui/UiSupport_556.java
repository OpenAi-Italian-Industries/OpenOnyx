/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.gui.GuiScreen;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.NetworkSupport_460;
import openonyx.connection.NetworkSupport_465;
import openonyx.connection.NetworkMode_462;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_111;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_552;
import openonyx.ui.internal.UiSupport_566;
import openonyx.ui.internal.UiSupport_568;
import openonyx.ui.internal.UiSupport_571;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_578;
import openonyx.ui.internal.UiSupport_584;
import openonyx.ui.internal.UiSupport_602;
import openonyx.ui.internal.UiSupport_603;
import openonyx.ui.internal.UiMode_598;

public class UiSupport_556
extends UiSupport_549 {
    private final UiSupport_571 y;
    private float n;
    private final static float Y = 34.0f;
    private boolean r;
    private final UiSupport_578 W;
    private final static float P = 36.0f;
    private float V;
    private final RenderSupport_121 R;
    private final UiSupport_552 p;
    private float t;
    private static float b;
    private final static float E = 12.0f;
    private float F;
    private static float G;
    private final UiSupport_602 A;
    private final static float K = 82.0f;
    private boolean B;
    private final UiSupport_603 C;
    private final static float J = 12.0f;
    private float D;
    private float c;
    private final UiSupport_576 a;
    private float k;
    private final static float g = 400.0f;
    private boolean M;
    private final static float L = 4.0f;
    private final UiSupport_568 j;
    private final static float m = 96.0f;
    private final static String h = "Accounts";
    private final UiSupport_576 l;
    private final static float I = 46.0f;
    private final UiSupport_576 i;
    private UiSupport_584 f;
    private final static float H = 560.0f;

    /*
     * WARNING - void declaration
     */
    private void d(UiSupport_584 class_584, Void void_, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        UiSupport_556 a3 = this;
e.addScheduledTask(() -> a3.L((UiSupport_584)a, a2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_556 a4 = this;
a4.M = 0;
        if (a4.B) {
            return a4.C.d((float)a2, (float)a, a3);
        }
        if (a4.r) {
            return a4.j.d((float)a2, (float)a, a3);
        }
        return a4.l.d((float)a2, (float)a, a3) | a4.a.d((float)a2, (float)a, a3) | a4.i.d((float)a2, (float)a, a3) | a4.p.d((float)a2, (float)a, a3);
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, RenderSupport_103 class_103) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_556 a3 = this;
UiSupport_556 class_556 = a3;
        float f2 = class_556.d + a3.i - 17.0f;
        UiSupport_556 class_5562 = a3;
        a.i((float)(a3.f + 12.0f), class_5562.d + class_5562.i - 34.0f, a3.e - 24.0f, 1.0f, a2.L().P());
        a.l(ThemeSupport_057.C, a.L(ThemeSupport_057.C, a3.L(), a3.a.d() - a3.f - 24.0f), (float)(a3.f + 12.0f + 4.0f), f2, a2.L().F());
        class_556.a.L(a2);
        class_556.i.L(a2);
    }

    /*
     * WARNING - void declaration
     */
    private void d(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_556 a3 = this;
UiSupport_556 class_556 = a3;
        UiSupport_556 class_5562 = a3;
        class_556.L(Math.round(Math.clamp(0.0f, 96.0f - class_556.e, a3.k - 96.0f)), Math.round(Math.clamp(0, 0.0f, a3.F - 46.0f)), class_5562.e, (float)class_5562.i);
        UiSupport_556 class_5563 = a3;
        b = (float)(class_556.f - class_5563.c);
        G = class_5563.d - a3.t;
    }

    private static String L(Throwable throwable) {
        Throwable a;
        Throwable throwable2 = throwable;
Throwable throwable3 = a = throwable2.getCause() == null ? throwable2 : throwable2.getCause();
        if (a.getMessage() == null) {
            return throwable3.toString();
        }
        return throwable3.getMessage();
    }

    /*
     * WARNING - void declaration
     */
    private void d(UiSupport_584 class_584, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        UiSupport_556 a3 = this;
a.d(3 >> 2);
        if (a2 == null) {
            a3.y.L(new StringBuilder().insert(0, "Logged in as ").append(a.L().D()).toString());
            return;
        }
        a3.L(UiSupport_556.L(a2));
    }

    /*
     * WARNING - void declaration
     */
    private void L(String string, String string2) {
        void a;
        String a2 = string2;
        UiSupport_556 a3 = this;
if (a2 == null || a2.isBlank()) {
            a3.L("Nothing to copy");
            return;
        }
        GuiScreen.setClipboardString(a2);
        a3.y.L(new StringBuilder().insert(0, (String)a).append(" copied").toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_556 a4 = this;
if (a4.W.L((float)a2, a3, 0)) {
            return --1 != 0;
        }
        if (a4.B) {
            if (a4.A.L((float)a2, a3, 0)) {
                return --1 != 0;
            }
            if (a4.C.L((float)a2, a3, 0)) {
                return 1 != 0;
            }
        } else if (a4.r) {
            if (a4.A.L((float)a2, a3, 0)) {
                return 5 >> 2;
            }
            if (a4.j.L((float)a2, a3, 0)) {
                return 5 >> 2;
            }
        } else {
            if (a4.l.L((float)a2, a3, 0)) {
                return --1 != 0;
            }
            if (a4.a.L((float)a2, a3, 0)) {
                return --1 != 0;
            }
            if (a4.i.L((float)a2, a3, 0)) {
                return 5 >> 2;
            }
            if (a4.p.L((float)a2, a3, 0)) {
                return 1 != 0;
            }
        }
        if (a == false && a2 >= a4.f) {
            UiSupport_556 class_556 = a4;
            if (a2 < class_556.f + class_556.e && a3 >= a4.d && a3 < a4.d + 46.0f) {
                a4.M = 1;
                a4.D = a2 - a4.f;
                a4.n = a3 - a4.d;
                return 5 >> 2;
            }
        }
        return a4.L((float)a2, a3);
    }

    public float l() {
        UiSupport_556 a;
UiSupport_556 class_556 = a;
        return (float)(class_556.f + class_556.e / 2.0f);
    }

    private NetworkSupport_465 L() {
return OnyxClient.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, double d) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_556 a4 = this;
if (a4.W.L((float)a2, a3, 0.0)) {
            return 1 != 0;
        }
        if (!a4.B && !a4.r && a4.p.L((float)a2, a3, 0.0)) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_584 class_584, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        UiSupport_556 a3 = this;
a.d(5 >> 3);
        if (a2 == null) {
            a3.y.L(new StringBuilder().insert(0, "Refreshed ").append(a.L().D()).toString());
            return;
        }
        a3.L(UiSupport_556.L(a2));
    }

    /*
     * WARNING - void declaration
     */
    private List<UiSupport_566> L(UiSupport_584 class_584) {
        void a;
        UiSupport_556 class_556 = this;
NetworkSupport_458 class_458 = a.L();
        ArrayList<UiSupport_566> a2 = new ArrayList<UiSupport_566>();
        a2.add(UiSupport_566.D("\ue7fd", "Copy username", () -> {
            NetworkSupport_458 a = class_458;
            UiSupport_556 a2 = this;
a2.L("Username", a.D());
        }));
        a2.add(UiSupport_566.D("\ue14d", "Copy UUID", () -> {
            NetworkSupport_458 a = class_458;
            UiSupport_556 a2 = this;
a2.L("UUID", a.L() == null ? null : a.L().toString());
        }));
        if (class_458.L() != NetworkMode_462.e) {
            a2.add(UiSupport_566.D("\ue73c", "Copy access token", () -> {
                NetworkSupport_458 a = class_458;
                UiSupport_556 a2 = this;
a2.L("Access token", a.d());
            }));
            if (class_458.L() != null) {
                a2.add(UiSupport_566.D("\ue73c", "Copy OAuth refresh token", () -> {
                    NetworkSupport_458 a = class_458;
                    UiSupport_556 a2 = this;
a2.L("Refresh token", a.L());
                }));
            }
            a2.add(UiSupport_566.L());
            a2.add(UiSupport_566.D("\ue5d5", "Refresh tokens", () -> class_556.L((UiSupport_584)a)));
        }
        a2.add(UiSupport_566.L());
        a2.add(UiSupport_566.L("\ue872", "Delete", () -> {
            NetworkSupport_458 a = class_458;
            UiSupport_556 a2 = this;
a2.L(a);
        }));
        return a2;
    }

    private void d(UiSupport_584 class_584) {
        UiSupport_549 a = class_584;
        UiSupport_556 a2 = this;
((UiSupport_584)a).d(3 >> 1);
        a2.L().L(((UiSupport_584)a).L()).whenComplete((arg_0, arg_1) -> a2.d((UiSupport_584)a, arg_0, arg_1));
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_556 a2 = this;
if (a2.W.L(a)) {
            return 1 != 0;
        }
        if (a2.B) {
            return a2.C.L(a);
        }
        if (a2.r && a2.j.L(a)) {
            return 5 >> 2;
        }
        return false;
    }

    private String L() {
        UiSupport_556 class_556 = this;
NetworkSupport_458 a = class_556.L().L();
        return new StringBuilder().insert(0, "Session: ").append(a == null ? e.getSession().getUsername() : a.D()).toString();
    }

    @Generated
    public void L(float f2) {
        float a = f2;
        UiSupport_556 a2 = this;
a2.V = 0;
    }

    public UiSupport_556() {
        UiSupport_556 a;
        UiSupport_556 class_556 = a;
        UiSupport_556 class_5562 = a;
        UiSupport_556 class_5563 = a;
        a.C = new UiSupport_603();
        class_5563.j = new UiSupport_568();
        a.W = new UiSupport_578();
        class_5562.y = new UiSupport_571();
        class_5562.R = new RenderSupport_121(0.0f);
        class_5562.V = 1.0f;
        class_556.e = 560.0f;
        class_556.i = (UiSupport_576)400.0f;
        class_556.p = new UiSupport_552(class_584 -> {
            UiSupport_549 a = class_584;
            UiSupport_556 a2 = this;
if (((UiSupport_584)a).L() == a2.L().L()) {
                return;
            }
            ((UiSupport_584)a).d(1 != 0);
            a2.L().d(((UiSupport_584)a).L()).whenComplete((arg_0, arg_1) -> a2.L((UiSupport_584)a, arg_0, arg_1));
        }, class_584 -> {
            UiSupport_549 a = class_584;
            UiSupport_556 a2 = this;
a2.f = a;
        });
        a.l = new UiSupport_576(UiMode_598.i, "Add", "\ue145", a::D);
        a.a = new UiSupport_576(UiMode_598.f, "Proxy settings", "\ue8b8", () -> {
            UiSupport_556 a;
if (a.B || a.r) {
                return;
            }
            UiSupport_556 class_556 = a;
            class_556.W.d();
            class_556.j.I();
            class_556.r = 1;
            a.R.L(1.0f, 300.0f, RenderSupport_123.l);
        });
        a.i = new UiSupport_576(UiMode_598.f, "Restore launcher", () -> {
            UiSupport_556 a;
UiSupport_556 class_556 = a;
            class_556.L().L();
            class_556.y.L("Restored the launcher account");
        });
        a.A = new UiSupport_602("\ue5c4", a::i);
        a.C.D((NetworkSupport_458 class_458) -> {
            NetworkSupport_458 a = class_458;
            UiSupport_556 a2 = this;
UiSupport_556 class_556 = a2;
            class_556.p.d();
            class_556.i();
            a2.y.L(new StringBuilder().insert(0, "Added ").append(a.D()).toString());
        });
        a.C.d((String string) -> {
            String a = string;
            UiSupport_556 a2 = this;
a2.y.L(a, "\ue001");
        });
        UiSupport_556 class_5564 = a;
        class_5564.C.L(class_5564.y::L);
        UiSupport_556 class_5565 = a;
        class_5565.j.d(class_5565.y::L);
        a.j.L((String string) -> {
            String a = string;
            UiSupport_556 a2 = this;
a2.y.L(a, "\ue001");
        });
        UiSupport_556 class_5566 = a;
        class_5566.l.add(class_5566.l);
        UiSupport_556 class_5567 = a;
        class_5567.l.add(class_5567.p);
        UiSupport_556 class_5568 = a;
        class_5568.l.add(class_5568.a);
        UiSupport_556 class_5569 = a;
        class_5569.l.add(class_5569.i);
        UiSupport_556 class_55610 = a;
        class_55610.l.add(class_55610.A);
        UiSupport_556 class_55611 = a;
        class_55611.l.add(class_55611.C);
        UiSupport_556 class_55612 = a;
        class_55612.l.add(class_55612.j);
    }

    public void D() {
        UiSupport_556 a;
if (a.B || a.r) {
            return;
        }
        UiSupport_556 class_556 = a;
        class_556.W.d();
        class_556.C.D();
        class_556.B = 1;
        a.R.L(1.0f, 300.0f, RenderSupport_123.l);
    }

    @Override
    protected void L() {
        UiSupport_556 class_556 = this;
UiSupport_556 class_5562 = class_556;
        float f2 = class_5562.d + 46.0f;
        float a = class_5562.e - 24.0f;
        class_5562.A.L((float)(class_556.f + 12.0f), class_556.h() - 15.0f, 30.0f, 30.0f);
        UiSupport_556 class_5563 = class_556;
        class_5562.l.L((float)(class_5563.f + class_5563.e - 12.0f - 82.0f), class_556.h() - 15.0f, 82.0f, 30.0f);
        class_5562.p.L((float)(class_556.f + 12.0f), f2, 0, (float)(class_556.i - 46.0f - 34.0f));
        class_5562.C.L((float)(class_556.f + 12.0f), f2, 0, (float)(class_556.i - 46.0f - 12.0f));
        class_5562.j.L((float)(class_556.f + 12.0f), f2, 0, (float)(class_556.i - 46.0f - 12.0f));
        UiSupport_556 class_5564 = class_556;
        UiSupport_556 class_5565 = class_556;
        class_5562.y.L((float)class_5564.f, class_5564.d, class_5565.e, (float)class_5565.i);
    }

    private void D(UiSupport_548 class_548) {
        Object a22 = class_548;
        UiSupport_556 a = this;
a22 = ((UiSupport_548)a22).e;
        UiSupport_556 class_556 = a;
        UiSupport_556 class_5562 = a;
        float f2 = class_556.d + class_5562.i - 17.0f;
        float f3 = class_556.i.L((RenderSupport_103)a22);
        UiSupport_556 class_5563 = a;
        class_5562.i.L((float)(class_5563.f + class_5563.e - 12.0f - f3), f2 - 15.0f, f3, 30.0f);
        class_556.i.L(a.L().L() != null ? --1 != 0 : false);
        UiSupport_556 class_5564 = a;
        float a22 = class_5564.a.L((RenderSupport_103)a22);
        class_5564.a.L(a.i.d() - 0, f2 - 15.0f, 0, 30.0f);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void d(UiSupport_548 var1_1) {
        a = var1_1;
        a = this;
v0 = a;
        a.D(a);
        a.R.L(a.i);
        a.h = (String)v0.L(a.H, a.f);
        var2_2 = v0.R.L();
        if (v1 < 0.999f) {
            v2 = a;
            v2.l.d(a);
            v2.p.d(a);
            v2.a.d(a);
            v2.i.d(a);
        }
        if (!(var2_2 > 0.001f)) ** GOTO lbl24
        v3 = a;
        v3.A.d(a);
        v4 = a;
        if (v3.B) {
            v4.C.d(a);
            v5 = a;
        } else {
            v4.j.d(a);
lbl24:
            // 2 sources

            v5 = a;
        }
        if (v5.f != null) {
            a.W.d(a.L(a.f), a.f.L(), a, a.e);
            a.f = null;
        }
        v6 = a;
        v6.W.d(a);
        v6.y.d(a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_584 class_584, Void void_, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        UiSupport_556 a3 = this;
e.addScheduledTask(() -> a3.d((UiSupport_584)a, a2));
    }

    private void L(UiSupport_584 class_584) {
        UiSupport_549 a = class_584;
        UiSupport_556 a2 = this;
a2.d((UiSupport_584)a);
    }

    private float h() {
        UiSupport_556 a;
return a.d + 23.0f;
    }

    @Override
    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_556 a2 = this;
if (a2.B) {
            return a2.C.L(a);
        }
        if (a2.r && a2.j.L(a)) {
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
        float f3;
        void a;
        UiSupport_556 class_556 = this;
OnyxListener_001 a2 = a.e;
        UiSupport_556 class_5562 = class_556;
        ((RenderSupport_103)a2).L(class_556.V);
        UiSupport_556 class_5563 = class_556;
        ((RenderSupport_103)a2).d((float)class_5562.f, class_5563.d, class_5563.e, (float)class_556.i, 28.0f, 3);
        ((RenderSupport_103)a2).e();
        UiSupport_556 class_5564 = class_556;
        UiSupport_556 class_5565 = class_556;
        RenderSupport_120.L((RenderSupport_103)a2, (float)class_5562.f, class_5564.d, class_5565.e, (float)class_5565.i, 28.0f, ThemeSupport_059.L(ThemeSupport_060.L(2, a.L()), class_556.V));
        float f4 = class_5564.R.L();
        if (f3 < 0.999f) {
            UiSupport_556 class_5566 = class_556;
            f2 = class_5566.V * (1.0f - f4);
            OnyxListener_001 interface_001 = a2;
            ((RenderSupport_103)interface_001).l(ThemeSupport_057.f, h, (float)(class_556.f + 12.0f + 4.0f), class_556.h(), ThemeSupport_059.L(a.L().d(), f2));
            ((RenderSupport_103)interface_001).L(f2);
            class_5566.l.L((UiSupport_548)a);
            OnyxListener_001 interface_0012 = a2;
            ((RenderSupport_103)a2).e();
            ((RenderSupport_103)interface_0012).L(f2);
            ((RenderSupport_103)interface_0012).F();
            ((RenderSupport_103)interface_0012).L(-36.0f * f4, 0.0f);
            void v8 = a;
            class_5566.p.L((UiSupport_548)v8);
            OnyxListener_001 interface_0013 = a2;
            class_5566.L((UiSupport_548)v8, (RenderSupport_103)interface_0013);
            ((RenderSupport_103)a2).k();
            ((RenderSupport_103)interface_0013).e();
        }
        if (f4 > 0.001f) {
            OnyxListener_001 interface_001;
            UiSupport_556 class_5567;
            String string;
            OnyxListener_001 interface_0014 = a2;
            f2 = class_556.V * f4;
            ((RenderSupport_103)interface_0014).L(f2);
            class_556.A.L((UiSupport_548)a);
            if (class_556.B) {
                string = "Add account";
                class_5567 = class_556;
            } else {
                string = "Proxy settings";
                class_5567 = class_556;
            }
            ((RenderSupport_103)interface_0014).l(ThemeSupport_057.f, string, class_5567.A.d() + 30.0f + 6.0f, class_556.h(), a.L().d());
            OnyxListener_001 interface_0015 = a2;
            ((RenderSupport_103)a2).e();
            ((RenderSupport_103)interface_0015).L(f2);
            ((RenderSupport_103)interface_0015).F();
            ((RenderSupport_103)interface_0015).L(36.0f * (1.0f - f4), 0.0f);
            UiSupport_556 class_5568 = class_556;
            if (class_556.B) {
                class_5568.C.L((UiSupport_548)a);
                interface_001 = a2;
            } else {
                class_5568.j.L((UiSupport_548)a);
                interface_001 = a2;
            }
            ((RenderSupport_103)interface_001).k();
            ((RenderSupport_103)a2).e();
        }
        UiSupport_556 class_5569 = class_556;
        class_5569.W.L((UiSupport_548)a);
        class_5569.y.L((UiSupport_548)a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3) {
        void a;
        float a2 = f2;
        UiSupport_556 a3 = this;
a3.k = 0;
        a3.F = a;
        a3.c = (0 - a3.e) / 2.0f;
        a3.t = (a3.F - a3.i) / 2.0f;
        UiSupport_556 class_556 = a3;
        class_556.d(a3.c + b, class_556.t + G);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        void a;
        float a2 = f3;
        UiSupport_556 a3 = this;
if (!a3.M) {
            return 3 >> 2;
        }
        a3.d((float)(a - a3.D), 0 - a3.n);
        return --1 != 0;
    }

    public float I() {
        UiSupport_556 a;
UiSupport_556 class_556 = a;
        return class_556.d + class_556.i / 2.0f;
    }

    private void L(NetworkSupport_458 class_458) {
        NetworkSupport_458 a = class_458;
        UiSupport_556 a2 = this;
NetworkSupport_460.L(a.L());
        UiSupport_556 class_556 = a2;
        class_556.L().L(a);
        a2.p.d();
        class_556.y.L(new StringBuilder().insert(0, "Removed ").append(a.D()).toString());
    }

    public boolean i() {
        UiSupport_556 a;
if (!a.B && !a.r) {
            return 0 != 0;
        }
        if (a.B) {
            a.C.D();
        }
        UiSupport_556 class_556 = a;
        class_556.B = 0;
        class_556.r = 0;
        a.R.L(0.0f, 300.0f, RenderSupport_123.l);
        return --1 != 0;
    }
}

