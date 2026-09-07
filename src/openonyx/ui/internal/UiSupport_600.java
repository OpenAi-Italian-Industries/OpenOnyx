/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.Iterator;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_036;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_587;
import openonyx.ui.internal.UiSupport_593;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_600
extends UiSupport_596 {
    private float j;
    final static protected float m = 13.0f;
    private final UiSupport_593 f;
    private final UiSupport_587 H;
    private final SettingSupport_036 e;

    private static void L(SettingSupport_036 class_036, Boolean bl) {
        Boolean a = bl;
        SettingSupport_036 a2 = class_036;
a2.L().i(a);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_600 a2 = this;
if (a2.H != null) {
            UiSupport_600 class_600 = a2;
            class_600.H.L((float)(class_600.f + a2.e - 38.0f), a2.d + (a2.G() - 22.0f) / 2.0f, 38.0f, 22.0f);
        }
        a2.j = a2.f.L(a2.m(), a2.d + a2.G(), a2.B());
        super.d(a);
    }

    public UiSupport_600(SettingSupport_036 class_036) {
        OnyxListener_001 a = class_036;
        UiSupport_600 a2 = this;
        super((Setting)a);
        UiSupport_600 class_600 = a2;
        a2.f = new UiSupport_593();
        a2.e = a;
        OnyxListener_001 interface_001 = a;
        a2.f.L(((SettingSupport_036)interface_001).L());
        a2.l.addAll(a2.f.L());
        UiSupport_600 class_6002 = a2;
        if (((SettingSupport_036)interface_001).d()) {
            class_6002.H = new UiSupport_587(() -> UiSupport_600.L((SettingSupport_036)a), arg_0 -> UiSupport_600.L((SettingSupport_036)a, arg_0));
            UiSupport_600 class_6003 = a2;
            class_6003.l.add(class_6003.H);
            return;
        }
        class_6002.H = null;
    }

    @Override
    protected RenderSupport_128 L() {
return ThemeSupport_057.f;
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_600 a2 = this;
return a2.G() + a2.j + (a2.j > 0.5f ? 6.0f : 0.0f);
    }

    private float G() {
        UiSupport_600 class_600 = this;
UiSupport_600 class_6002 = class_600;
        float a = class_6002.A();
        if (class_6002.H == null) {
            return 0;
        }
        return Math.max(0, 34.0f);
    }

    private float m() {
        UiSupport_600 a;
return (float)(a.f + 13.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        UiSupport_600 class_600 = this;
if (!class_600.i()) {
            return 0 != 0;
        }
        Iterator a4 = class_600.l.iterator();
        while (a4.hasNext()) {
            if (!((UiSupport_549)a4.next()).L((float)a3, (float)a2, 0)) continue;
            return --1 != 0;
        }
        if (class_600.H != null && a == false && a3 >= class_600.f) {
            UiSupport_600 class_6002 = class_600;
            if (a3 < class_6002.f + class_6002.e && a2 >= class_600.d && a2 < class_600.d + class_600.G()) {
                class_600.e.L().D();
                return 5 >> 2;
            }
        }
        return false;
    }

    private static boolean L(SettingSupport_036 a) {
return (Boolean)a.L().L();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        void a;
        UiSupport_548 a2 = class_548;
        UiSupport_600 a3 = this;
float f3 = a3.H == null ? 0.0f : 48.0f;
        UiSupport_600 class_600 = a3;
        class_600.L(a2, (float)(class_600.e - f3));
        if (class_600.j > 0.5f) {
            a2.e.i((float)(a3.f + 3.0f), a3.d + a3.G(), 1.0f, a3.j, ThemeSupport_059.L(a2.L().P(), (float)(a * 0.7f)));
        }
        UiSupport_600 class_6002 = a3;
        class_6002.f.L(a2.e, a3.m(), a3.B(), a2.L().P(), (float)a);
        Iterator iterator = a = class_6002.l.iterator();
        while (iterator.hasNext()) {
            ((UiSupport_549)a.next()).L(a2);
            iterator = a;
        }
    }

    private float B() {
        UiSupport_600 a;
return Math.max(0.0f, (float)(a.e - 13.0f));
    }
}

