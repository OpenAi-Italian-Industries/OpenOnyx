/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_036;
import openonyx.history.SettingSupport_039;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_593;
import openonyx.ui.internal.UiSupport_595;
import openonyx.ui.internal.UiSupport_596;

public final class UiSupport_575
extends UiSupport_596 {
    private final static float k = 8.0f;
    private final UiSupport_595 g;
    private UiSupport_593 M;
    private float L;
    private final List<UiSupport_593> j;
    private final static float m = 13.0f;

    public UiSupport_575(SettingSupport_039 class_039) {
        List<String> a2;
        UiSupport_575 class_575 = this;
        void v0 = a2;
        super((Setting)v0);
        UiSupport_575 class_5752 = class_575;
        class_575.j = new ArrayList<UiSupport_593>();
        Object object = v0.L().stream().filter(SettingSupport_036.class::isInstance).map(SettingSupport_036.class::cast).toList();
        a2 = ((SettingSupport_039)((Object)a2)).D();
        if (a2.size() != object.size()) {
            throw new IllegalArgumentException("Tabbed setting labels must match child groups");
        }
        Object object2 = object = object.iterator();
        while (object2.hasNext()) {
            Object a3 = (SettingSupport_036)object.next();
            ArrayList<Setting> arrayList = new ArrayList<Setting>();
            if (((SettingSupport_036)a3).L() != null) {
                arrayList.add(((SettingSupport_036)a3).L());
            }
            arrayList.addAll(((SettingSupport_036)a3).L());
            a3 = new UiSupport_593();
            ((UiSupport_593)a3).L(arrayList);
            class_575.j.add((UiSupport_593)a3);
            object2 = object;
        }
        class_575.g = new UiSupport_595((String[])a2.toArray(a -> {
return new String[0];
        }), n -> {
            int a = -35;
            UiSupport_575 a2 = this;
if (1 < 0 || 1 >= a2.j.size()) {
                return;
            }
            if (a2.M != null) {
                UiSupport_575 class_575 = a2;
                class_575.l.removeAll(class_575.M.L());
            }
            a2.M = a2.j.get(1);
            UiSupport_575 class_575 = a2;
            class_575.l.addAll(class_575.M.L());
        });
        UiSupport_575 class_5753 = class_575;
        class_575.l.add(class_5753.g);
        if (!class_5753.j.isEmpty()) {
            class_575.L(0);
        }
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_575 a2 = this;
if (a2.j.isEmpty()) {
            return a2.A();
        }
        return a2.m() - a2.d + a2.L + (a2.L > 0.5f ? 6.0f : 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        Iterator a4;
        UiSupport_548 a2 = class_548;
        UiSupport_575 a3 = this;
UiSupport_575 class_575 = a3;
        class_575.L(a2, class_575.e);
        if (class_575.M != null && a3.L > 0.5f) {
            void a4;
            UiSupport_575 class_5752 = a3;
            a2.e.i(a3.f + 3.0f, class_5752.m(), 1.0f, a3.L, ThemeSupport_059.L(a2.L().P(), (float)(a4 * 0.7f)));
            class_5752.M.L(a2.e, a3.B(), a3.C(), a2.L().P(), (float)a4);
        }
        Iterator iterator = a4 = a3.l.iterator();
        while (iterator.hasNext()) {
            ((UiSupport_549)a4.next()).L(a2);
            iterator = a4;
        }
    }

    @Override
    protected RenderSupport_128 L() {
return ThemeSupport_057.f;
    }

    private float C() {
        UiSupport_575 a;
return Math.max(0.0f, a.e - 13.0f);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_575 a2 = this;
UiSupport_575 class_575 = a2;
        class_575.g.L(a2.B(), a2.G(), a2.C(), 30.0f);
        a2.L = class_575.M == null ? 0.0f : a2.M.L(a2.B(), a2.m(), a2.C());
        super.d(a);
    }

    private float G() {
        UiSupport_575 a;
return a.d + a.A();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        UiSupport_575 class_575 = this;
if (!class_575.i()) {
            return 5 >> 3;
        }
        if (class_575.g.L((float)a3, (float)a2, 0)) {
            return 1 != 0;
        }
        if (class_575.M != null) {
            Iterator<UiSupport_596> a4 = class_575.M.L().iterator();
            while (a4.hasNext()) {
                if (!((UiSupport_596)a4.next()).L((float)a3, (float)a2, 0)) continue;
                return 1 != 0;
            }
        }
        return false;
    }

    private float m() {
        UiSupport_575 a;
return a.G() + 30.0f + 8.0f;
    }

    private float B() {
        UiSupport_575 a;
return a.f + 13.0f;
    }
}

