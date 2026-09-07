/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import lombok.Generated;
import openonyx.render.RenderSupport_103;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;

public class UiSupport_602
extends UiSupport_549 {
    private final UiSupport_545 l;
    final public static float I = 30.0f;
    private String d;
    private final Runnable i;
    private Integer f;
    private final static float H = 18.0f;

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(UiSupport_548 class_548) {
        void a;
        UiSupport_602 class_602 = this;
RenderSupport_103 class_103 = a.e;
        int a2 = class_602.f != null ? class_602.f.intValue() : a.L().F();
        UiSupport_602 class_6022 = class_602;
        RenderSupport_103 class_1032 = class_103;
        UiSupport_602 class_6023 = class_602;
        UiSupport_602 class_6024 = class_602;
        class_6022.l.L(class_1032, (float)class_6023.f, (float)class_6023.d, class_6024.e, (float)class_6024.i, Float.MAX_VALUE, 0);
        UiSupport_602 class_6025 = class_602;
        UiSupport_602 class_6026 = class_602;
        class_1032.L(class_6022.d, (float)(class_6025.f + class_6025.e / 2.0f), (float)(class_6026.d + class_6026.i / 2.0f), 18.0f, class_602.I != false ? 0 : ThemeSupport_059.L(0));
        if (class_602.h) {
            class_103.h();
        }
    }

    @Override
    public void d(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_602 a2 = this;
UiSupport_602 class_602 = a2;
        super.d(a);
        UiSupport_602 class_6022 = a2;
        class_602.l.L(a.i, class_6022.h, (boolean)class_6022.H);
    }

    @Override
    public boolean d(float f2, float f3, int n) {
        int a = 0;
        UiSupport_602 a2 = this;
boolean bl = 3 >> 2;
        a2.H = (float)bl;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_602 a4 = this;
if (0 != 0 || a4.I == false || !a4.L((float)a2, (float)a)) {
            return false;
        }
        a4.H = 1;
        a4.i.run();
        return 1 != 0;
    }

    @Generated
    public void L(String string) {
        String a = string;
        UiSupport_602 a2 = this;
a2.d = a;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_602(String string, Runnable runnable) {
        void a;
        UiSupport_602 a2;
        Runnable a3 = runnable;
        UiSupport_602 class_602 = a2 = this;
        UiSupport_602 class_6022 = a2;
        UiSupport_602 class_6023 = a2;
        class_6023.l = new UiSupport_545();
        class_6022.d = a;
        class_6022.i = a3;
        class_602.e = 30.0f;
        class_602.i = (Runnable)30.0f;
    }

    @Generated
    public void L(Integer n) {
        Integer a = n;
        UiSupport_602 a2 = this;
a2.f = a;
    }
}

