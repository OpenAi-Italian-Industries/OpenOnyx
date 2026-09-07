/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;

public final class UiSupport_554 {
    private final static RenderSupport_121 H = new RenderSupport_121(1.0f);
    private static long e;

    public static void L(boolean bl) {
        float f2;
        boolean bl2 = bl;
long l = System.nanoTime();
        float a = e == 0L ? 16.0f : Math.min((float)(l - e) / 1000000.0f, 100.0f);
        e = l;
        float f3 = f2 = bl2 ? 1.0f : 0.0f;
        if (H.d() != f2) {
            H.L(f2, 300.0f, RenderSupport_123.l);
        }
        H.L(0);
    }

    public static float L() {
return H.L();
    }

    private UiSupport_554() {
        UiSupport_554 a;
    }
}

