/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import openonyx.core.OnyxClient;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.misc.MiscSupport_628;
import openonyx.misc.MiscSupport_630;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_k.RenderSupport_152;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_551;
import openonyx.ui.internal.UiSupport_566;
import openonyx.ui.internal.UiSupport_571;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_578;
import openonyx.ui.internal.UiSupport_583;
import openonyx.ui.internal.UiSupport_589;
import openonyx.ui.internal.UiSupport_604;
import openonyx.ui.internal.UiMode_598;

public class UiSupport_582
extends UiSupport_549 {
    private final UiSupport_583 C;
    private final static float J = 120.0f;
    private final UiSupport_589 D;
    private final static float c = 10.0f;
    private final UiSupport_571 a;
    private final UiSupport_578 k;
    private UiSupport_604 g;
    private String M;
    private boolean L;
    private final UiSupport_576 j;
    private List<String> m;
    private final UiSupport_576 h;
    private final Set<String> l;
    private final static float I = 8.0f;
    private final UiSupport_578 H;
    private final UiSupport_576 e;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_582 a4 = this;
return a4.D.d((float)a2, (float)a, a3) | a4.j.d((float)a2, (float)a, a3) | a4.h.d((float)a2, (float)a, a3) | a4.e.d((float)a2, (float)a, a3) | a4.C.d((float)a2, (float)a, a3);
    }

    /*
     * WARNING - void declaration
     */
    private void H(UiSupport_604 class_604) {
        void a;
        UiSupport_582 class_582 = this;
String a2 = class_582.L().d(a.L());
        if (a2 == null) {
            class_582.a.L(new StringBuilder().insert(0, "Could not duplicate ").append(a.L()).toString(), "\ue001");
            return;
        }
        UiSupport_582 class_5822 = class_582;
        class_5822.C.d();
        class_5822.a.L(new StringBuilder().insert(0, "Duplicated as ").append(a2).toString());
    }

    private void e(UiSupport_604 class_604) {
        Object a = class_604;
        UiSupport_582 a2 = this;
a = ((UiSupport_604)a).L();
        UiSupport_582 class_582 = a2;
        if (a2.L().L((String)a)) {
            class_582.C.d();
            a2.a.L(new StringBuilder().insert(0, "Deleted ").append((String)a).toString());
            return;
        }
        class_582.a.L(new StringBuilder().insert(0, "Could not delete ").append((String)a).toString(), "\ue001");
    }

    private void k(UiSupport_604 class_604) {
        UiSupport_549 a = class_604;
        UiSupport_582 a2 = this;
a2.m = a2.L().L().stream().filter(arg_0 -> UiSupport_582.L((UiSupport_604)a, arg_0)).toList();
        if (a2.m.isEmpty()) {
            a2.a.L("No other configs to copy visuals to", "\ue001");
            return;
        }
        a2.M = ((UiSupport_604)a).L();
        a2.l.clear();
        a2.L = 1;
    }

    private MiscSupport_628 L() {
return OnyxClient.e;
    }

    private void F(UiSupport_604 class_604) {
        UiSupport_549 a = class_604;
        UiSupport_582 a2 = this;
a2.e((UiSupport_604)a);
    }

    private void l(UiSupport_604 class_604) {
        UiSupport_549 a = class_604;
        UiSupport_582 a2 = this;
a2.H((UiSupport_604)a);
    }

    private void I(UiSupport_604 class_604) {
        UiSupport_549 a = class_604;
        UiSupport_582 a2 = this;
a2.k((UiSupport_604)a);
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_582 a2 = this;
UiSupport_582 class_582 = a2;
        class_582.D.L(a);
        class_582.j.L(a);
        class_582.h.L(a);
        class_582.e.L(a);
        class_582.C.L(a);
        class_582.H.L(a);
        class_582.k.L(a);
        class_582.a.L(a);
    }

    /*
     * WARNING - void declaration
     */
    private List<UiSupport_566> L(UiSupport_604 class_604) {
        void a;
        UiSupport_582 class_582 = this;
ArrayList<UiSupport_566> a2 = new ArrayList<UiSupport_566>();
        a2.add(UiSupport_566.D("\ue161", "Overwrite with current", () -> class_582.d((UiSupport_604)a)));
        a2.add(UiSupport_566.D("\ue14d", "Duplicate", () -> class_582.l((UiSupport_604)a)));
        a2.add(UiSupport_566.D("\ue14d", "Copy visuals to", () -> class_582.I((UiSupport_604)a)));
        a2.add(UiSupport_566.L());
        a2.add(UiSupport_566.L("\ue872", "Delete", () -> class_582.F((UiSupport_604)a)));
        return a2;
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_582 a2 = this;
if (a2.k.L(a)) {
            return --1 != 0;
        }
        if (a2.H.L(a)) {
            return 1 != 0;
        }
        if (a2.D.L(a)) {
            return --1 != 0;
        }
        if (UiSupport_551.k(a)) {
            UiSupport_582 class_582 = a2;
            boolean bl = --1 != 0;
            class_582.D.D(bl);
            class_582.D.d();
            return bl;
        }
        if (UiSupport_551.i(a) && !a2.D.L().isBlank()) {
            a2.I();
            return 1 != 0;
        }
        if (a.D() == 200) {
            return a2.C.L(0, -1);
        }
        if (a.D() == 208) {
            return a2.C.L(0, 1);
        }
        if (UiSupport_551.d(a) && a2.C.L() != null) {
            UiSupport_582 class_582 = a2;
            class_582.L(class_582.C.L());
            return 1 != 0;
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
        int a3 = 0;
        UiSupport_582 a4 = this;
if (a4.k.L((float)a2, (float)a, a3)) {
            return 1 != 0;
        }
        if (a4.H.L((float)a2, (float)a, a3)) {
            return --1 != 0;
        }
        if (a4.D.L((float)a2, (float)a, a3)) {
            return --1 != 0;
        }
        if (a4.j.L((float)a2, (float)a, a3)) {
            return 1 != 0;
        }
        if (a4.h.L((float)a2, (float)a, a3)) {
            return 1 != 0;
        }
        if (a4.e.L((float)a2, (float)a, a3)) {
            return --1 != 0;
        }
        return a4.C.L((float)a2, (float)a, a3);
    }

    public String L() {
        UiSupport_582 class_582 = this;
int a = class_582.C.D();
        if (0 == 1) {
            return "1 config";
        }
        return 0 + " configs";
    }

    @Override
    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        UiSupport_582 a2 = this;
return a2.D.L(a);
    }

    private void D(UiSupport_548 class_548) {
        Object a22 = class_548;
        UiSupport_582 a = this;
a22 = ((UiSupport_548)a22).e;
        UiSupport_582 class_582 = a;
        float f2 = class_582.j.L((RenderSupport_103)a22);
        float f3 = class_582.h.L((RenderSupport_103)a22);
        float a22 = class_582.e.L((RenderSupport_103)a22);
        float f4 = Math.max(120.0f, (float)(a.e - f2 - f3 - 0 - 30.0f));
        float f5 = class_582.d + 5.0f;
        UiSupport_582 class_5822 = a;
        class_582.D.L(class_5822.f, class_5822.d, f4, 40.0f);
        class_582.j.L(a.D.d() + a.D.i() + 10.0f, f5, f2, 30.0f);
        class_582.h.L(a.j.d() + f2 + 10.0f, f5, f3, 30.0f);
        UiSupport_582 class_5823 = a;
        class_582.e.L(class_5823.f + class_5823.e - 0, f5, 0, 30.0f);
        UiSupport_582 class_5824 = a;
        UiSupport_582 class_5825 = a;
        class_582.C.L(class_5824.f, class_5824.d + 40.0f + 8.0f, (float)class_5825.e, class_5825.i - 40.0f - 8.0f);
        UiSupport_582 class_5826 = a;
        UiSupport_582 class_5827 = a;
        class_582.a.L(class_5826.f, class_5826.d, (float)class_5827.e, class_5827.i);
    }

    private static boolean L(UiSupport_604 class_604, String string) {
        String a = string;
        UiSupport_604 a2 = class_604;
if (!a.equals(a2.L())) {
            return --1 != 0;
        }
        return false;
    }

    private void d(String string) {
        String a = string;
        UiSupport_582 a2 = this;
if (!a2.l.add(a)) {
            a2.l.remove(a);
        }
    }

    public void i() {
        UiSupport_582 a;
UiSupport_582 class_582 = a;
        class_582.C.d();
        class_582.D.L("");
        class_582.D.D(3 >> 2);
        class_582.H.d();
        class_582.k.d();
        class_582.l.clear();
    }

    public void D() {
        UiSupport_582 a;
UiSupport_582 class_582 = a;
        class_582.D.D(3 >> 2);
        class_582.H.d();
        class_582.k.d();
        class_582.a.d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, double d) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_582 a4 = this;
if (a4.k.L((float)a2, a3, 0.0)) {
            return 3 >> 1;
        }
        if (a4.H.L((float)a2, a3, 0.0)) {
            return 1 != 0;
        }
        return a4.C.L((float)a2, a3, 0.0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f6 = f5;
        UiSupport_582 a6 = this;
return a6.D.L((float)a5, (float)a4, (int)a3, 0.0f, 0.0f);
    }

    public UiSupport_582() {
        UiSupport_582 a;
        UiSupport_582 class_582 = a;
        a.D = new UiSupport_589("Config name");
        class_582.j = new UiSupport_576(UiMode_598.e, "New", "\ue145", () -> {
            Object object;
            UiSupport_582 class_582 = this;
String a = class_582.D.L().trim();
            if (!a.isEmpty() && !class_582.L().h(a)) {
                class_582.a.L("Use 1-64 letters, digits, - or _", "\ue001");
                return;
            }
            if (!a.isEmpty() && class_582.L().i(a)) {
                class_582.a.L("Config already exists; use its menu to overwrite", "\ue001");
                return;
            }
            Object object2 = object = a.isEmpty() ? class_582.L().D("new") : a;
            if (object == null || !class_582.L().l((String)object)) {
                class_582.a.L("Could not create a config", "\ue001");
                return;
            }
            UiSupport_582 class_5822 = class_582;
            class_5822.C.d();
            class_5822.D.L("");
            class_5822.D.D(5 >> 3);
            class_5822.a.L(new StringBuilder().insert(0, "Created ").append((String)object).toString());
        });
        a.h = new UiSupport_576(UiMode_598.d, "Save as", "\ue161", () -> {
            UiSupport_582 class_582 = this;
UiSupport_582 class_5822 = class_582;
            String a = class_5822.D.L().trim();
            if (!class_5822.L().h(a)) {
                class_582.a.L("Use 1-64 letters, digits, - or _", "\ue001");
                return;
            }
            if (class_582.L().i(a)) {
                class_582.a.L("Config already exists; use its menu to overwrite", "\ue001");
                return;
            }
            if (!class_582.L().F(a)) {
                class_582.a.L(new StringBuilder().insert(0, "Could not save ").append(a).toString(), "\ue001");
                return;
            }
            UiSupport_582 class_5823 = class_582;
            class_5823.C.d();
            class_5823.D.L("");
            class_5823.D.D(5 >> 3);
            class_5823.a.L(new StringBuilder().insert(0, "Saved ").append(a).toString());
        });
        a.e = new UiSupport_576(UiMode_598.f, "Open folder", "\ue2c8", () -> {
            UiSupport_582 a;
UiSupport_582 class_582 = a;
            class_582.L().d();
            class_582.a.L("Opened config folder");
        });
        a.C = new UiSupport_583(class_604 -> {
            Object a = class_604;
            UiSupport_582 a2 = this;
a = ((UiSupport_604)a).L();
            UiSupport_582 class_582 = a2;
            if (a2.L().D((String)a)) {
                class_582.a.L(new StringBuilder().insert(0, "Loaded ").append((String)a).toString());
                return;
            }
            class_582.a.L(new StringBuilder().insert(0, "Could not load ").append((String)a).toString(), "\ue001");
        }, class_604 -> {
            Object a = class_604;
            UiSupport_582 a2 = this;
a = ((UiSupport_604)a).L();
            UiSupport_582 class_582 = a2;
            if (a2.L().F((String)a)) {
                class_582.a.L(new StringBuilder().insert(0, "Saved ").append((String)a).toString());
                return;
            }
            class_582.a.L(new StringBuilder().insert(0, "Could not save ").append((String)a).toString(), "\ue001");
        }, class_604 -> {
            UiSupport_549 a = class_604;
            UiSupport_582 a2 = this;
a2.k.d();
            a2.g = a;
        });
        a.H = new UiSupport_578();
        a.k = new UiSupport_578();
        a.a = new UiSupport_571();
        a.l = new LinkedHashSet<String>();
        a.m = List.of();
        a.D.L(() -> {
            UiSupport_582 class_582 = this;
UiSupport_582 class_5822 = class_582;
            String a = class_5822.D.L().trim();
            if (!class_5822.L().h(a)) {
                class_582.a.L("Use 1-64 letters, digits, - or _", "\ue001");
                return;
            }
            if (class_582.L().i(a)) {
                class_582.a.L("Config already exists; use its menu to overwrite", "\ue001");
                return;
            }
            if (!class_582.L().F(a)) {
                class_582.a.L(new StringBuilder().insert(0, "Could not save ").append(a).toString(), "\ue001");
                return;
            }
            UiSupport_582 class_5823 = class_582;
            class_5823.C.d();
            class_5823.D.L("");
            class_5823.D.D(5 >> 3);
            class_5823.a.L(new StringBuilder().insert(0, "Saved ").append(a).toString());
        });
    }

    private List<UiSupport_566> d() {
        UiSupport_582 class_582 = this;
ArrayList<UiSupport_566> a = new ArrayList<UiSupport_566>();
        a.add(UiSupport_566.L("Select all", () -> {
            UiSupport_582 a;
if (!a.m.isEmpty()) {
                UiSupport_582 class_582 = a;
                if (class_582.l.containsAll(class_582.m)) {
                    return 1 != 0;
                }
            }
            return false;
        }, () -> {
            UiSupport_582 a;
UiSupport_582 class_582 = a;
            if (a.i()) {
                class_582.l.clear();
                return;
            }
            class_582.l.addAll(a.m);
        }));
        a.add(UiSupport_566.L());
        Iterator<String> iterator = class_582.m.iterator();
        Iterator<String> iterator2 = iterator;
        while (iterator2.hasNext()) {
            String string;
            String string2 = string = iterator.next();
            a.add(UiSupport_566.L(string2, () -> {
                String a = string2;
                UiSupport_582 a2 = this;
return a2.l.contains(a);
            }, () -> {
                String a = string;
                UiSupport_582 a2 = this;
a2.d(a);
            }));
            iterator2 = iterator;
        }
        a.add(UiSupport_566.L());
        a.add(UiSupport_566.d("\ue14d", "Copy to selected", () -> {
            UiSupport_582 class_582;
            UiSupport_582 class_5822 = this;
if (class_5822.l.isEmpty()) {
                class_5822.a.L("Select at least one config", "\ue001");
                return;
            }
            MiscSupport_630 a = class_5822.L().L(class_5822.M, new ArrayList<String>(class_5822.l));
            if (a.L() == 0) {
                class_5822.a.L("Could not copy visuals", "\ue001");
                return;
            }
            UiSupport_582 class_5823 = class_5822;
            if (!a.L().isEmpty()) {
                class_5823.a.L(new StringBuilder().insert(0, "Copied to ").append(a.L()).append("; failed: ").append(String.join((CharSequence)", ", a.L())).toString(), "\ue001");
                class_582 = class_5822;
            } else {
                class_5823.a.L(new StringBuilder().insert(0, "Copied visuals to ").append(a.L()).append(" config(s)").toString());
                class_582 = class_5822;
            }
            class_582.l.clear();
            class_5822.k.d();
        }));
        return a;
    }

    private void i(UiSupport_604 class_604) {
        Object a = class_604;
        UiSupport_582 a2 = this;
a = ((UiSupport_604)a).L();
        UiSupport_582 class_582 = a2;
        if (a2.L().F((String)a)) {
            class_582.a.L(new StringBuilder().insert(0, "Updated ").append((String)a).toString());
            return;
        }
        class_582.a.L(new StringBuilder().insert(0, "Could not update ").append((String)a).toString(), "\ue001");
    }

    private void d(UiSupport_604 class_604) {
        UiSupport_549 a = class_604;
        UiSupport_582 a2 = this;
a2.i((UiSupport_604)a);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_582 a2 = this;
UiSupport_582 class_582 = a2;
        class_582.D(a);
        class_582.D.d(a);
        class_582.j.d(a);
        class_582.h.d(a);
        class_582.e.d(a);
        class_582.C.d(a);
        if (class_582.g != null) {
            a2.H.d(a2.L(a2.g), a2.g.L(), a2, a.e);
            a2.g = null;
        }
        if (a2.L) {
            a2.k.L(a2.d(), a2.H, a2, a.e);
            a2.L = 0;
        }
        UiSupport_582 class_5822 = a2;
        class_5822.H.d(a);
        class_5822.k.d(a);
        class_5822.a.d(a);
    }
}

