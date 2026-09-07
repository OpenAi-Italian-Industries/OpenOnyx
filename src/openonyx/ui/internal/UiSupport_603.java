/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.function.Consumer;
import lombok.Generated;
import net.minecraft.client.gui.GuiScreen;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.NetworkSupport_459;
import openonyx.connection.NetworkSupport_464;
import openonyx.connection.NetworkSupport_466;
import openonyx.connection.internal.NetworkSupport_469;
import openonyx.connection.internal.NetworkSupport_471;
import openonyx.connection.internal.NetworkSupport_473;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.core.OnyxClient;
import openonyx.events.FileDialogUtils;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_587;
import openonyx.ui.internal.UiSupport_589;
import openonyx.ui.internal.UiSupport_595;
import openonyx.ui.internal.UiMode_598;
import openonyx.utilities.UtilitySupport_492;

public class UiSupport_603
extends UiSupport_549 {
    private final static int p = 0;
    private String t;
    private final static int b = 1;
    private Consumer<String> E;
    private final static float F = 8.0f;
    private final static float G = 10.0f;
    private NetworkSupport_469 A;
    private Consumer<String> K;
    private final UiSupport_595 B;
    private final static float C = 10.0f;
    private final UiSupport_576 J;
    private final UiSupport_576 D;
    private final UiSupport_587 c;
    private boolean a;
    private final UiSupport_576 k;
    private final static float g = 16.0f;
    private final UiSupport_589 M;
    private final static int L = 3;
    private final UiSupport_576 j;
    private final static float m = 14.0f;
    private final UiSupport_589 h;
    private final static float l = 96.0f;
    private final static float I = 14.0f;
    private final UiSupport_576 d;
    private final UiSupport_589 i;
    private final static String[] f;
    private Consumer<NetworkSupport_458> H;
    private final static int e = 2;

    static {
        String[] stringArray = new String[4];
        stringArray[0] = "Offline";
        stringArray[1] = "Access";
        stringArray[2] = "Refresh";
        stringArray[3] = "Microsoft";
        f = stringArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_603 a4 = this;
if (a4.B.L((float)a2, (float)a, 0)) {
            return 5 >> 2;
        }
        switch (a4.L()) {
            case 0: {
                return a4.i.L((float)a2, (float)a, 0) || a4.c.L((float)a2, (float)a, 0) || a4.k.L((float)a2, (float)a, 0);
            }
            case 1: {
                return a4.M.L((float)a2, (float)a, 0) || a4.j.L((float)a2, (float)a, 0);
            }
            case 2: {
                return a4.h.L((float)a2, (float)a, 0) || a4.D.L((float)a2, (float)a, 0);
            }
        }
        return a4.J.L((float)a2, (float)a, 0) || a4.d.L((float)a2, (float)a, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_603 a2 = this;
switch (a2.L()) {
            case 0: {
                return a2.i.L(a);
            }
            case 1: {
                return a2.M.L(a);
            }
            case 2: {
                return a2.h.L(a);
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, RenderSupport_103 class_103, String string, float f2) {
        void a;
        void a2;
        void a3;
        void a4;
        float f3 = f2;
        UiSupport_603 a5 = this;
void v0 = a4;
        v0.l(ThemeSupport_057.I, v0.L(ThemeSupport_057.I, (String)a3, (float)a5.e), (float)a5.f, (float)(a2 + 8.0f + 7.0f), ThemeSupport_059.L(a.L().F(), 0.9f));
    }

    private void i(String string) {
        String a = string;
        UiSupport_603 a2 = this;
if (a2.E != null) {
            a2.E.accept(a);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_603 a2 = this;
RenderSupport_103 class_103 = a.e;
        UiSupport_603 class_603 = a2;
        class_603.B.L(a);
        switch (class_603.L()) {
            case 0: {
                a2.i(a, class_103);
                return;
            }
            case 1: {
                a2.L(a, class_103);
                return;
            }
            case 2: {
                a2.d(a, class_103);
                return;
            }
        }
        a2.D(a, class_103);
    }

    /*
     * WARNING - void declaration
     */
    private void i(UiSupport_548 class_548, RenderSupport_103 class_103) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_603 a3 = this;
void v0 = a;
        UiSupport_603 class_603 = a3;
        class_603.i.L(a2);
        class_603.c.L(a2);
        class_603.k.L(a2);
        v0.l(ThemeSupport_057.I, "Resolve premium UUID", a3.c.d() + 38.0f + 10.0f, a3.c.D() + 11.0f, a2.L().d());
        a3.L(a2, (RenderSupport_103)v0, "Looks the name up on Mojang so the real skin and UUID are used.", a3.k.D() + 30.0f);
    }

    private void L(NetworkSupport_464 class_464) {
        NetworkSupport_464 a = class_464;
        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
        class_603.j.d(3 >> 2);
        class_603.L((NetworkSupport_458)a);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_603 a4 = this;
switch (a4.L()) {
            case 0: {
                return a4.c.d((float)a2, (float)a, 0) | a4.k.d((float)a2, (float)a, 0);
            }
            case 1: {
                return a4.j.d((float)a2, (float)a, 0);
            }
            case 2: {
                return a4.D.d((float)a2, (float)a, 0);
            }
        }
        return a4.J.d((float)a2, (float)a, 0) | a4.d.d((float)a2, (float)a, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_603 a2 = this;
switch (a2.L()) {
            case 0: {
                return a2.i.L(a);
            }
            case 1: {
                return a2.M.L(a);
            }
            case 2: {
                return a2.h.L(a);
            }
        }
        return false;
    }

    @Generated
    public void D(Consumer<NetworkSupport_458> consumer) {
        Consumer<NetworkSupport_458> a = consumer;
        UiSupport_603 a2 = this;
a2.H = a;
    }

    private void L(NetworkSupport_458 class_458) {
        NetworkSupport_458 a = class_458;
        UiSupport_603 a2 = this;
OnyxClient.f.i(a);
        if (a2.H != null) {
            a2.H.accept(a);
        }
    }

    public UiSupport_603() {
        UiSupport_603 a;
        UiSupport_603 class_603 = a;
        class_603.B = new UiSupport_595(f, n -> {
            int a = -35;
            UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
            class_603.i.D(5 >> 3);
            class_603.M.D(5 >> 3);
            class_603.h.D(0 != 0);
            if (0 != 3) {
                a2.h();
            }
        });
        UiSupport_603 class_6032 = a;
        class_6032.i = new UiSupport_589("Username");
        class_6032.M = new UiSupport_589("Minecraft access token");
        class_6032.h = new UiSupport_589("Microsoft OAuth refresh token");
        class_6032.c = new UiSupport_587(() -> {
            UiSupport_603 a;
return a.a;
        }, bl -> {
            Boolean a = bl;
            UiSupport_603 a2 = this;
a2.a = a;
        });
        a.k = new UiSupport_576(UiMode_598.i, "Add", () -> {
            UiSupport_603 class_603 = this;
Object a = class_603.i.L().trim();
            if (((String)a).isEmpty()) {
                class_603.i("Enter a username");
                return;
            }
            a = new NetworkSupport_466((String)a);
            UiSupport_603 class_6032 = class_603;
            ((NetworkSupport_466)a).L(class_6032.a);
            if (!class_6032.a) {
                class_603.L((NetworkSupport_458)a);
                return;
            }
            class_603.k.d(1 != 0);
            UtilitySupport_492.L(() -> class_603.L((NetworkSupport_466)a));
        });
        a.j = new UiSupport_576(UiMode_598.i, "Add", () -> {
            UiSupport_603 class_603 = this;
String a = class_603.M.L().trim();
            if (a.isEmpty()) {
                class_603.i("Paste an access token");
                return;
            }
            class_603.j.d(5 >> 2);
            UtilitySupport_492.L(() -> {
                Object a = a;
                UiSupport_603 a2 = this;
try {
                    a = NetworkSupport_464.L((String)a);
                }
                catch (NetworkSupport_474 class_474) {
                    e.addScheduledTask(() -> {
                        NetworkSupport_474 a = class_474;
                        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
                        class_603.j.d(0 != 0);
                        class_603.i(a.getMessage());
                    });
                    return;
                }
                e.addScheduledTask(() -> a2.L((NetworkSupport_464)a));
            });
        });
        a.D = new UiSupport_576(UiMode_598.i, "Add", () -> {
            UiSupport_603 class_603 = this;
String a = class_603.h.L().trim();
            if (a.isEmpty()) {
                class_603.i("Paste a refresh token");
                return;
            }
            class_603.D.d(1 != 0);
            UtilitySupport_492.L(() -> {
                Object a = a;
                UiSupport_603 a2 = this;
try {
                    a = NetworkSupport_459.L((String)a);
                }
                catch (NetworkSupport_474 class_474) {
                    e.addScheduledTask(() -> {
                        NetworkSupport_474 a = class_474;
                        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
                        class_603.D.d(0 != 0);
                        class_603.i(a.getMessage());
                    });
                    return;
                }
                e.addScheduledTask(() -> a2.L((NetworkSupport_459)a));
            });
        });
        a.J = new UiSupport_576(UiMode_598.i, "Sign in with Microsoft", "\ue89e", () -> {
            UiSupport_603 class_603 = this;
if (class_603.A != null) {
                class_603.h();
                return;
            }
            try {
                class_603.A = NetworkSupport_469.L(class_471 -> {
                    NetworkSupport_471 a = class_471;
                    UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
                    class_603.h();
                    class_603.L((NetworkSupport_458)NetworkSupport_459.L(a));
                }, string -> {
                    String a = string;
                    UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
                    class_603.h();
                    class_603.i(a);
                });
            }
            catch (NetworkSupport_474 a) {
                class_603.i(a.getMessage());
                return;
            }
            class_603.A.d();
            UiSupport_603 class_6032 = class_603;
            class_6032.J.L("Cancel");
            class_6032.J.d("\ue5cd");
            class_6032.t = "Waiting for the browser\u2026";
        });
        a.d = new UiSupport_576(UiMode_598.f, "Copy link", () -> {
            UiSupport_603 a;
if (a.A == null) {
                a.i("Start the sign-in first");
                return;
            }
            UiSupport_603 class_603 = a;
            GuiScreen.setClipboardString(class_603.A.d());
            if (class_603.K != null) {
                a.K.accept("Sign-in link copied");
            }
        });
        UiSupport_603 class_6033 = a;
        class_6033.M.d(--1 != 0);
        class_6033.h.d(1 != 0);
        class_6033.i.L(() -> {
            UiSupport_603 class_603 = this;
Object a = class_603.i.L().trim();
            if (((String)a).isEmpty()) {
                class_603.i("Enter a username");
                return;
            }
            a = new NetworkSupport_466((String)a);
            UiSupport_603 class_6032 = class_603;
            ((NetworkSupport_466)a).L(class_6032.a);
            if (!class_6032.a) {
                class_603.L((NetworkSupport_458)a);
                return;
            }
            class_603.k.d(1 != 0);
            UtilitySupport_492.L(() -> class_603.L((NetworkSupport_466)a));
        });
        a.M.L(() -> {
            UiSupport_603 class_603 = this;
String a = class_603.M.L().trim();
            if (a.isEmpty()) {
                class_603.i("Paste an access token");
                return;
            }
            class_603.j.d(5 >> 2);
            UtilitySupport_492.L(() -> {
                Object a = a;
                UiSupport_603 a2 = this;
try {
                    a = NetworkSupport_464.L((String)a);
                }
                catch (NetworkSupport_474 class_474) {
                    e.addScheduledTask(() -> {
                        NetworkSupport_474 a = class_474;
                        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
                        class_603.j.d(0 != 0);
                        class_603.i(a.getMessage());
                    });
                    return;
                }
                e.addScheduledTask(() -> a2.L((NetworkSupport_464)a));
            });
        });
        a.h.L(() -> {
            UiSupport_603 class_603 = this;
String a = class_603.h.L().trim();
            if (a.isEmpty()) {
                class_603.i("Paste a refresh token");
                return;
            }
            class_603.D.d(1 != 0);
            UtilitySupport_492.L(() -> {
                Object a = a;
                UiSupport_603 a2 = this;
try {
                    a = NetworkSupport_459.L((String)a);
                }
                catch (NetworkSupport_474 class_474) {
                    e.addScheduledTask(() -> {
                        NetworkSupport_474 a = class_474;
                        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
                        class_603.D.d(0 != 0);
                        class_603.i(a.getMessage());
                    });
                    return;
                }
                e.addScheduledTask(() -> a2.L((NetworkSupport_459)a));
            });
        });
        UiSupport_603 class_6034 = a;
        class_6034.l.add(class_6034.B);
        UiSupport_603 class_6035 = a;
        class_6035.l.add(class_6035.i);
        UiSupport_603 class_6036 = a;
        class_6036.l.add(class_6036.c);
        UiSupport_603 class_6037 = a;
        class_6037.l.add(class_6037.k);
        UiSupport_603 class_6038 = a;
        class_6038.l.add(class_6038.M);
        UiSupport_603 class_6039 = a;
        class_6039.l.add(class_6039.j);
        UiSupport_603 class_60310 = a;
        class_60310.l.add(class_60310.h);
        UiSupport_603 class_60311 = a;
        class_60311.l.add(class_60311.D);
        UiSupport_603 class_60312 = a;
        class_60312.l.add(class_60312.J);
        UiSupport_603 class_60313 = a;
        class_60313.l.add(class_60313.d);
    }

    private void D(UiSupport_548 class_548) {
        UiSupport_548 a232 = class_548;
        UiSupport_603 a = this;
UiSupport_603 class_603 = a;
        reference var2_3 = class_603.d + 30.0f + 14.0f;
        float f2 = class_603.J.L(a232.e);
        float a232 = class_603.d.L(a232.e);
        class_603.J.L((float)a.f, (float)var2_3, f2, 30.0f);
        class_603.d.L((float)(a.f + f2 + 10.0f), (float)var2_3, a232, 30.0f);
        class_603.d.L((a.A != null ? 1 : 0) != 0);
    }

    private void h() {
        UiSupport_603 a;
if (a.A != null) {
            a.A.D();
        }
        a.A = null;
        a.t = null;
        a.J.L("Sign in with Microsoft");
        a.J.d("\ue89e");
    }

    public boolean I() {
        UiSupport_603 a;
return a.i.i() || a.M.i() || a.h.i();
    }

    /*
     * WARNING - void declaration
     */
    private void D(UiSupport_548 class_548, RenderSupport_103 class_103) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_603 a3 = this;
UiSupport_603 class_603 = a3;
        class_603.J.L(a2);
        class_603.d.L(a2);
        float f2 = class_603.J.D() + 30.0f;
        if (!NetworkSupport_473.L()) {
            float f3 = f2 + 8.0f + 7.0f;
            void v1 = a;
            v1.L("\ue001", (float)(a3.f + 8.0f), f3, 16.0f, a2.L().K());
            v1.l(ThemeSupport_057.I, "No Azure client id is configured for this build.", (float)(a3.f + 16.0f + 10.0f), f3, a2.L().K());
            return;
        }
        if (a3.t != null) {
            UiSupport_603 class_6032 = a3;
            a.l(ThemeSupport_057.I, class_6032.t, (float)class_6032.f, f2 + 8.0f + 7.0f, a2.L().E());
        }
        a3.L(a2, (RenderSupport_103)a, "Opens your browser. Use Copy link if it does not open by itself.", f2 + (a3.t == null ? 0.0f : 14.0f));
    }

    private void L(NetworkSupport_459 class_459) {
        NetworkSupport_459 a = class_459;
        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
        class_603.D.d(5 >> 3);
        class_603.L((NetworkSupport_458)a);
    }

    @Generated
    public void d(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        UiSupport_603 a2 = this;
a2.E = a;
    }

    private int L() {
        UiSupport_603 a;
return a.B.L();
    }

    private void L(NetworkSupport_466 class_466) {
        NetworkSupport_466 a = class_466;
        UiSupport_603 a2 = this;
try {
            a.L();
        }
        catch (NetworkSupport_474 class_474) {}
        e.addScheduledTask(() -> {
            NetworkSupport_466 a = a;
            UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
            class_603.k.d(5 >> 3);
            class_603.L((NetworkSupport_458)a);
        });
    }

    /*
     * WARNING - void declaration
     */
    private void d(UiSupport_548 class_548, RenderSupport_103 class_103) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_603 a3 = this;
UiSupport_603 class_603 = a3;
        a3.h.L(a2);
        class_603.D.L(a2);
        class_603.L(a2, (RenderSupport_103)a, "The msaartifacts refresh token from a launcher. Works without an Azure app.", a3.D.D() + 30.0f);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_603 a2 = this;
UiSupport_603 class_603 = a2;
        a2.D(a);
        a2.h = (UiSupport_589)class_603.L(a.H, a.f);
        class_603.B.d(a);
        switch (class_603.L()) {
            case 0: {
                UiSupport_603 class_6032 = a2;
                while (false) {
                }
                class_6032.i.d(a);
                class_6032.c.d(a);
                class_6032.k.d(a);
                return;
            }
            case 1: {
                UiSupport_603 class_6033 = a2;
                class_6033.M.d(a);
                class_6033.j.d(a);
                return;
            }
            case 2: {
                UiSupport_603 class_6034 = a2;
                class_6034.h.d(a);
                class_6034.D.d(a);
                return;
            }
        }
        UiSupport_603 class_6035 = a2;
        class_6035.J.d(a);
        class_6035.d.d(a);
    }

    public void D() {
        UiSupport_603 a;
UiSupport_603 class_603 = a;
        UiSupport_603 class_6032 = a;
        class_6032.h();
        class_6032.i.L("");
        class_6032.M.L("");
        class_6032.h.L("");
        class_6032.i.D(0 != 0);
        class_603.M.D(0 != 0);
        class_603.h.D(5 >> 3);
        class_603.t = null;
    }

    @Generated
    public void L(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        UiSupport_603 a2 = this;
a2.K = a;
    }

    @Override
    protected void L() {
        UiSupport_603 class_603 = this;
UiSupport_603 class_6032 = class_603;
        UiSupport_603 class_6033 = class_603;
        UiSupport_603 class_6034 = class_603;
        class_6032.B.L((float)class_6033.f, (float)class_6034.d, class_6034.e, 30.0f);
        reference a = class_6032.d + 30.0f + 14.0f;
        class_6033.i.L((float)class_603.f, 0.0f, (float)class_603.e, 40.0f);
        class_6032.M.L((float)class_603.f, 0.0f, (float)class_603.e, 40.0f);
        class_6032.h.L((float)class_603.f, 0.0f, (float)class_603.e, 40.0f);
        a = a + 40.0f + 10.0f;
        class_6032.c.L((float)class_603.f, (float)(a + 4.0f), 38.0f, 22.0f);
        UiSupport_603 class_6035 = class_603;
        class_6032.k.L((float)(class_6035.f + class_6035.e - 96.0f), 0.0f, 96.0f, 30.0f);
        UiSupport_603 class_6036 = class_603;
        class_6032.j.L((float)(class_6036.f + class_6036.e - 96.0f), 0.0f, 96.0f, 30.0f);
        UiSupport_603 class_6037 = class_603;
        class_6032.D.L((float)(class_6037.f + class_6037.e - 96.0f), 0.0f, 96.0f, 30.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, RenderSupport_103 class_103) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_603 a3 = this;
UiSupport_603 class_603 = a3;
        a3.M.L(a2);
        class_603.j.L(a2);
        class_603.L(a2, (RenderSupport_103)a, "A Minecraft session token from a launcher. Expires in ~24h and cannot be renewed.", a3.j.D() + 30.0f);
    }
}

