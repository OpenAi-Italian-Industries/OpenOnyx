/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_551;

public class UiSupport_571
extends UiSupport_549 {
    private float D;
    private final static float c = 12.0f;
    private final static float a = 34.0f;
    private final RenderSupport_121 k;
    private boolean g;
    private final static float M = 16.0f;
    private final static float L = 13.0f;
    private final static int j = 4;
    private String m;
    private final static float h = 10.0f;
    private final static float l = 10.0f;
    private final static float I = 16.0f;
    private String i;
    private final static int f = 3;
    private final static float H = 380.0f;

    /*
     * WARNING - void declaration
     */
    public void L(String string, String string2) {
        void a;
        String a2 = string2;
        UiSupport_571 a3 = this;
a3.L((String)a, a2, 1 != 0);
    }

    private boolean i() {
        UiSupport_571 a;
return a.i != null && (a.k.L() > 0.001f || a.k.d() > 0.0f);
    }

    public void d() {
        UiSupport_571 a;
a.D = 0.0f;
        a.k.L(0.0f, 200.0f, RenderSupport_123.f);
    }

    public void L(String string) {
        String a = string;
        UiSupport_571 a2 = this;
a2.L(a, null, 0 != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        Iterator<String> iterator;
        Iterator<String> iterator2;
        void a22;
        UiSupport_571 class_571 = this;
if (!class_571.i()) {
            return;
        }
        RenderSupport_103 class_103 = a22.e;
        UiSupport_571 class_5712 = class_571;
        float f2 = class_5712.k.L();
        void v1 = a22;
        int a32 = class_5712.g ? v1.L().l() : v1.L().Q();
        void v2 = a22;
        int a22 = class_571.g ? v2.L().a() : v2.L().k();
        float f3 = class_571.m == null ? 0.0f : 26.0f;
        float f4 = Math.min(380.0f, class_571.e) - 32.0f - f3;
        Object object = class_571.L(class_103, f4);
        float f5 = 0.0f;
        Iterator<String> iterator3 = iterator2 = object.iterator();
        while (iterator3.hasNext()) {
            String string = iterator2.next();
            f5 = Math.max(f5, class_103.L(ThemeSupport_057.I, string));
            iterator3 = iterator2;
        }
        float f6 = 32.0f + f3 + f5;
        float f7 = Math.max(34.0f, 21.0f + (float)object.size() * 13.0f);
        UiSupport_571 class_5713 = class_571;
        f5 = class_5713.f + (class_571.e - f6) / 2.0f;
        float f8 = class_5713.d + class_571.i - 12.0f - f7 + 10.0f * (1.0f - f2);
        float f9 = f5;
        RenderSupport_103 class_1032 = class_103;
        class_1032.D();
        class_1032.L(f2);
        class_103.d(f9, f8, f6, f7, 4.0f, 3);
        class_103.D(f9, f8, f6, f7, 4.0f, a32);
        f2 = f5 + 16.0f;
        float a32 = f8 + f7 / 2.0f;
        if (class_5713.m != null) {
            float f10 = f2;
            class_103.L(class_571.m, f10 + 8.0f, a32, 16.0f, a22);
            f2 = f10 + f3;
        }
        a32 -= (float)(object.size() - 1) * 13.0f / 2.0f;
        Iterator<String> iterator4 = iterator = object.iterator();
        while (iterator4.hasNext()) {
            object = iterator.next();
            iterator4 = iterator;
            class_103.l(ThemeSupport_057.I, (String)object, f2, a32, a22);
            a32 += 13.0f;
        }
        class_103.e();
    }

    /*
     * WARNING - void declaration
     */
    private List<String> L(RenderSupport_103 class_103, float f2) {
        int n;
        ArrayList<String> arrayList;
        void a;
        void a2;
        StringBuilder a3;
        ArrayList<String> arrayList2;
        block7: {
            int n2;
            UiSupport_571 class_571 = this;
arrayList2 = new ArrayList<String>();
            a3 = new StringBuilder();
            String[] stringArray = class_571.i.split(" ");
            int n3 = stringArray.length;
            int n4 = 0;
            while (n4 < n3) {
                String string = stringArray[0];
                if (!string.isEmpty()) {
                    String string2;
                    String string3 = string2 = a3.isEmpty() ? string : a3 + " " + string;
                    if (a2.L(ThemeSupport_057.I, string2) <= a || a3.isEmpty()) {
                        a3.setLength(0);
                        a3.append(string2);
                    } else {
                        ArrayList<String> arrayList3 = arrayList2;
                        arrayList3.add(a3.toString());
                        Object object = a3;
                        ((StringBuilder)object).setLength(0);
                        ((StringBuilder)object).append(string);
                        if (arrayList3.size() == 4) {
                            arrayList = arrayList2;
                            break block7;
                        }
                    }
                }
                n4 = ++n2;
            }
            arrayList = arrayList2;
        }
        if (arrayList.size() < 4 && !a3.isEmpty()) {
            arrayList2.add(a3.toString());
        }
        int n5 = 0;
        while (n5 < arrayList2.size()) {
            int n6 = 0;
            String string = (String)arrayList2.get(0);
            arrayList2.set(n6, a2.L(ThemeSupport_057.I, string, (float)a));
            n5 = ++n;
        }
        return arrayList2;
    }

    public UiSupport_571() {
        UiSupport_571 a;
        UiSupport_571 class_571 = a;
        class_571.k = new RenderSupport_121(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, String string2, boolean bl) {
        void a;
        void a2;
        boolean a3 = bl;
        UiSupport_571 a4 = this;
UiSupport_571 class_571 = a4;
        UiSupport_571 class_5712 = a4;
        class_5712.i = a2;
        class_5712.m = a;
        class_571.g = a3;
        class_571.D = 800.0f * (a3 ? 2.0f : 1.0f);
        a4.k.L(1.0f, 300.0f, RenderSupport_123.H);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_571 a2 = this;
if (a2.i == null) {
            return;
        }
        if (a2.D > 0.0f) {
            UiSupport_571 class_571 = a2;
            class_571.D -= a.i;
            if (class_571.D <= 0.0f) {
                a2.d();
            }
        }
        UiSupport_571 class_571 = a2;
        class_571.k.L(a.i);
        if (class_571.k.d() == 0.0f && a2.k.L()) {
            a2.i = null;
        }
    }
}

