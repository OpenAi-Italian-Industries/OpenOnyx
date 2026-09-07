/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import openonyx.connection.NetworkSupport_458;
import openonyx.core.OnyxClient;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_553;
import openonyx.ui.internal.UiSupport_584;

public class UiSupport_552
extends UiSupport_553 {
    private final Consumer<UiSupport_584> h;
    private final static float l = 5.0f;
    private final static float H = 9.0f;
    private final Consumer<UiSupport_584> e;

    /*
     * WARNING - void declaration
     */
    public UiSupport_552(Consumer<UiSupport_584> consumer, Consumer<UiSupport_584> consumer2) {
        void a;
        Consumer<UiSupport_584> a2 = consumer2;
        UiSupport_552 a3 = this;
        a3.h = a;
        a3.e = a2;
        a3.d();
    }

    public void d() {
        UiSupport_552 class_552 = this;
UiSupport_552 class_5522 = class_552;
        class_5522.l.clear();
        class_5522.m = 0.0f;
        ((RenderSupport_121)((Object)class_5522.h)).L(0.0f);
        List<NetworkSupport_458> list = OnyxClient.f.L();
        int a = list.size() - 1;
        int n = 0;
        while (n >= 0) {
            UiSupport_552 class_5523 = class_552;
            class_552.l.add(new UiSupport_584(list.get(--a), class_5523.h, class_5523.e));
            n = 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a3 = f3;
        UiSupport_552 a4 = this;
if (a4.L((float)a2, a3) && super.L((float)a2, a3, 0)) {
            return 1 != 0;
        }
        return false;
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_552 a2 = this;
if (a2.l.isEmpty()) {
            UiSupport_552 class_552 = a2;
            UiSupport_552 class_5522 = a2;
            a.e.L(ThemeSupport_057.I, "No accounts yet", class_552.f + class_552.e / 2.0f, class_5522.d + class_5522.i / 2.0f, a.L().F());
            return;
        }
        super.L(a);
    }

    @Override
    protected void i(UiSupport_548 class_548) {
        Iterator iterator;
        UiSupport_548 a22 = class_548;
        UiSupport_552 a = this;
UiSupport_552 class_552 = a;
        float a22 = a.d - ((RenderSupport_121)((Object)class_552.h)).L();
        Iterator iterator2 = iterator = class_552.l.iterator();
        while (iterator2.hasNext()) {
            ((UiSupport_549)iterator.next()).L(a.f, 0, (float)(a.e - 9.0f), 56.0f);
            a22 += 61.0f;
            iterator2 = iterator;
        }
        a.I = a.l.isEmpty() ? 0.0f : (float)a.l.size() * 61.0f - 5.0f;
    }
}

