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
import openonyx.connection.NetworkSupport_453;
import openonyx.connection.NetworkMode_456;
import openonyx.connection.internal.NetworkSupport_467;
import openonyx.connection.internal.NetworkSupport_470;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.core.OnyxClient;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_551;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_587;
import openonyx.ui.internal.UiSupport_589;
import openonyx.ui.internal.UiSupport_595;
import openonyx.ui.internal.UiMode_598;
import openonyx.utilities.UtilitySupport_492;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UiSupport_568
extends UiSupport_549 {
    private final UiSupport_576 F;
    private final static float G = 14.0f;
    private Consumer<String> A;
    private final static float K = 10.0f;
    private boolean B;
    private final static float C = 144.0f;
    private boolean J;
    private final UiSupport_595 D;
    private final static float c = 28.0f;
    private final UiSupport_576 a;
    private final static float k = 88.0f;
    private final UiSupport_589 g;
    private final UiSupport_589 M;
    private final UiSupport_589 L;
    private final static int j = 8000;
    private final UiSupport_587 m;
    private Consumer<String> h;
    private final static String l = "https://api.minecraftservices.com/publickeys";
    private final static float I = 10.0f;
    private final UiSupport_587 f;
    private final static float H = 8.0f;

    public static float I() {
return 308.0f;
    }

    private void h() {
        UiSupport_568 a;
UiSupport_568 class_568 = a;
        OnyxClient.f.L().L(a.L(), class_568.J, class_568.B, a.L.L(), a.M.L(), a.g.L());
        OnyxClient.f.L();
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_568 a2 = this;
if (super.L(a)) {
            return --1 != 0;
        }
        if (UiSupport_551.i(a)) {
            boolean bl = --1 != 0;
            a2.i();
            return bl;
        }
        if (a.D() == 15) {
            return a2.L(a.d());
        }
        return false;
    }

    @Generated
    public void d(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        UiSupport_568 a2 = this;
a2.h = a;
    }

    public UiSupport_568() {
        UiSupport_568 a;
        UiSupport_568 class_568 = a;
        a.f = new UiSupport_587(() -> {
            UiSupport_568 a;
return a.J;
        }, bl -> {
            Boolean a = bl;
            UiSupport_568 a2 = this;
a2.J = a;
        });
        a.m = new UiSupport_587(() -> {
            UiSupport_568 a;
return a.B;
        }, bl -> {
            Boolean a = bl;
            UiSupport_568 a2 = this;
a2.B = a;
        });
        String[] stringArray = new String[2];
        stringArray[0] = "SOCKS5";
        stringArray[1] = "HTTP/HTTPS";
        a.D = new UiSupport_595(stringArray, n -> {
            int a = -35;
            UiSupport_568 a2 = this;
if (0 < 0 || 0 >= NetworkMode_456.values().length) {
                return;
            }
        });
        UiSupport_568 class_5682 = a;
        class_5682.L = new UiSupport_589("Address");
        class_5682.M = new UiSupport_589("Username");
        class_5682.g = new UiSupport_589("Password");
        class_5682.F = new UiSupport_576(UiMode_598.d, "Test connection", () -> {
            UiSupport_568 class_568 = this;
if (!class_568.J) {
                if (class_568.A != null) {
                    class_568.A.accept("Enable a proxy before testing");
                }
                return;
            }
            try {
                class_568.h();
            }
            catch (IllegalArgumentException a) {
                if (class_568.A != null) {
                    class_568.A.accept(a.getMessage());
                }
                return;
            }
            class_568.F.d(3 >> 1);
            UtilitySupport_492.L(() -> {
                Object a2;
                UiSupport_568 class_568 = this;
String string = null;
                try {
                    a2 = NetworkSupport_470.L(l, 8000);
                    if (!((NetworkSupport_467)a2).L()) {
                        string = new StringBuilder().insert(0, "Proxy test returned HTTP ").append(((NetworkSupport_467)a2).L()).toString();
                    }
                }
                catch (RuntimeException | NetworkSupport_474 a2) {
                    Exception exception = a2;
                    string = a2.getMessage() == null ? exception.toString() : exception.getMessage();
                }
                a2 = string;
                e.addScheduledTask(() -> class_568.L((String)a2));
            });
        });
        a.a = new UiSupport_576(UiMode_598.i, "Save", a::i);
        UiSupport_568 class_5683 = a;
        class_5683.g.d(1 != 0);
        class_5683.L.L(a::i);
        a.M.L(a::i);
        a.g.L(a::i);
        UiSupport_568 class_5684 = a;
        class_5684.l.add(class_5684.f);
        UiSupport_568 class_5685 = a;
        class_5685.l.add(class_5685.m);
        UiSupport_568 class_5686 = a;
        class_5686.l.add(class_5686.D);
        UiSupport_568 class_5687 = a;
        class_5687.l.add(class_5687.L);
        UiSupport_568 class_5688 = a;
        class_5688.l.add(class_5688.M);
        UiSupport_568 class_5689 = a;
        class_5689.l.add(class_5689.g);
        UiSupport_568 class_56810 = a;
        class_56810.l.add(class_56810.F);
        UiSupport_568 class_56811 = a;
        class_56811.l.add(class_56811.a);
    }

    @Generated
    public void L(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        UiSupport_568 a2 = this;
a2.A = a;
    }

    private void L(String string) {
        String a = string;
        UiSupport_568 a2 = this;
a2.F.d(0 != 0);
        if (a == null) {
            if (a2.h != null) {
                a2.h.accept("Proxy connection verified");
                return;
            }
        } else if (a2.A != null) {
            a2.A.accept(a);
        }
    }

    private NetworkMode_456 L() {
        UiSupport_568 a;
return NetworkMode_456.values()[a.D.L()];
    }

    public void I() {
        UiSupport_568 class_568 = this;
NetworkSupport_453 a = OnyxClient.f.L();
        UiSupport_568 class_5682 = class_568;
        class_568.J = a.d();
        class_5682.B = a.L();
        class_568.D.L(a.L().ordinal());
        class_5682.L.L(a.L());
        class_5682.M.L(a.D());
        class_5682.g.L(a.i());
        class_5682.L.D(0 != 0);
        class_5682.M.D(0 != 0);
        class_5682.g.D(3 >> 2);
    }

    public void i() {
        UiSupport_568 class_568 = this;
try {
            class_568.h();
            OnyxClient.f.L().whenComplete((void_, throwable) -> {
                Throwable a = throwable;
                UiSupport_568 a2 = this;
e.addScheduledTask(() -> {
                    Throwable a = a;
                    UiSupport_568 a2 = this;
if (a != null) {
                        if (a2.A != null) {
                            Object object = a;
                            a2.A.accept(a.getCause() == null ? ((Throwable)object).getMessage() : ((Throwable)object).getCause().getMessage());
                        }
                        return;
                    }
                    if (a2.h != null) {
                        UiSupport_568 class_568 = a2;
                        class_568.h.accept(class_568.J ? "Proxy settings applied" : "Proxy disabled");
                    }
                });
            });
            return;
        }
        catch (IllegalArgumentException a) {
            if (class_568.A != null) {
                class_568.A.accept(a.getMessage());
            }
            return;
        }
    }

    @Override
    protected void L() {
        UiSupport_568 class_568 = this;
UiSupport_568 class_5682 = class_568;
        float a = class_5682.d;
        UiSupport_568 class_5683 = class_568;
        class_5682.f.L((float)class_5683.f, 3.0f, 38.0f, 22.0f);
        class_5683.m.L((float)class_568.f, (a += 38.0f) + 3.0f, 38.0f, 22.0f);
        class_5682.D.L((float)class_568.f, a += 42.0f, class_568.e, 30.0f);
        class_5682.L.L((float)class_568.f, a += 44.0f, class_568.e, 40.0f);
        class_5682.M.L((float)class_568.f, a += 50.0f, class_568.e, 40.0f);
        class_5682.g.L((float)class_568.f, a += 50.0f, class_568.e, 40.0f);
        UiSupport_568 class_5684 = class_568;
        class_5682.a.L((float)(class_5684.f + class_5684.e - 88.0f), a += 54.0f, 88.0f, 30.0f);
        class_5682.F.L(class_568.a.d() - 8.0f - 144.0f, 0, 144.0f, 30.0f);
    }

    @Override
    public void L(UiSupport_548 class_548) {
        RenderSupport_103 class_103;
        UiSupport_548 a = class_548;
        UiSupport_568 a2 = this;
RenderSupport_103 class_1032 = class_103 = a.e;
        class_1032.l(ThemeSupport_057.d(), "Use proxy", a2.f.d() + 38.0f + 10.0f, a2.f.D() + 11.0f, a.L().d());
        class_1032.l(ThemeSupport_057.d(), "Use for account login", a2.m.d() + 38.0f + 10.0f, a2.m.D() + 11.0f, a.L().F());
        super.L(a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl) {
        int n;
        void a22;
        int a;
        UiSupport_568 class_568 = this;
UiSupport_589[] class_589Array = new UiSupport_589[3];
        class_589Array[0] = class_568.L;
        class_589Array[1] = class_568.M;
        class_589Array[2] = class_568.g;
        UiSupport_589[] class_589Array2 = class_589Array;
        int n2 = -1;
        int n3 = 0;
        while (n3 < class_589Array2.length) {
            if (class_589Array2[0].i()) {
                n2 = 0;
            }
            n3 = ++a;
        }
        a = Math.floorMod(0 + (a22 != false ? -1 : 1), class_589Array2.length);
        UiSupport_589[] a22 = class_589Array2;
        n2 = class_589Array2.length;
        int n4 = 0;
        while (n4 < 0) {
            a22[n++].D(5 >> 3);
            n4 = 0;
        }
        int n5 = 0;
        class_589Array2[n5].D(--1 != 0);
        class_589Array2[n5].d();
        return --1 != 0;
    }
}

