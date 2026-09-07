/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.Iterator;
import java.util.function.Consumer;
import openonyx.core.OnyxClient;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_553;
import openonyx.ui.internal.UiSupport_604;

public class UiSupport_583
extends UiSupport_553 {
    private final static float j = 9.0f;
    private final Consumer<UiSupport_604> h;
    private final static float l = 5.0f;
    private final Consumer<UiSupport_604> H;
    private final Consumer<UiSupport_604> e;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_583 a4 = this;
if (a4.L((float)a2, a3) && super.L((float)a2, a3, 0)) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_583(Consumer<UiSupport_604> consumer, Consumer<UiSupport_604> consumer2, Consumer<UiSupport_604> consumer3) {
        void a;
        void a2;
        Consumer<UiSupport_604> a3 = consumer3;
        UiSupport_583 a4 = this;
        a4.H = a2;
        a4.h = a;
        a4.e = a3;
        a4.d();
    }

    @Override
    public UiSupport_604 L() {
        UiSupport_583 class_583 = this;
UiSupport_549 a = class_583.L();
        if (a instanceof UiSupport_604) {
            return (UiSupport_604)a;
        }
        return null;
    }

    @Override
    protected void i(UiSupport_548 class_548) {
        Iterator iterator;
        UiSupport_548 a22 = class_548;
        UiSupport_583 a = this;
UiSupport_583 class_583 = a;
        float a22 = a.d - ((RenderSupport_121)((Object)class_583.h)).L();
        Iterator iterator2 = iterator = class_583.l.iterator();
        while (iterator2.hasNext()) {
            ((UiSupport_549)iterator.next()).L(a.f, 0, (float)(a.e - 9.0f), 50.0f);
            a22 += 55.0f;
            iterator2 = iterator;
        }
        a.I = a.l.isEmpty() ? 0.0f : (float)a.l.size() * 55.0f - 5.0f;
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_583 a2 = this;
if (a2.l.isEmpty()) {
            UiSupport_583 class_583 = a2;
            UiSupport_583 class_5832 = a2;
            a.e.L(ThemeSupport_057.L(), "No configs saved yet", class_583.f + class_583.e / 2.0f, class_5832.d + class_5832.i / 2.0f, a.L().F());
            return;
        }
        super.L(a);
    }

    public void d() {
        UiSupport_583 class_583 = this;
UiSupport_583 class_5832 = class_583;
        class_583.l.clear();
        class_5832.D();
        class_5832.m = 0.0f;
        ((RenderSupport_121)((Object)class_5832.h)).L(0.0f);
        Iterator<String> a = OnyxClient.e.L().iterator();
        Iterator<String> iterator = a;
        while (iterator.hasNext()) {
            String string = (String)a.next();
            iterator = a;
            UiSupport_583 class_5833 = class_583;
            class_583.l.add(new UiSupport_604(string, class_5833.H, class_5833.h, class_583.e));
        }
    }

    public int D() {
        UiSupport_583 a;
return a.l.size();
    }
}

