/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.events.FileDialogUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.KeybindSetting;
import openonyx.theme.internal.ThemeSupport_063;

public final class Zoom
extends Module {
    public KeybindSetting d;
    private float i;
    public NumberSetting f;
    public NumberSetting H;
    private long e;

    public Zoom() {
        super("Zoom", "Smooth hold-to-zoom camera", ModuleCategory.f);
        Zoom a;
        Zoom class_250 = a;
        a.d = new KeybindSetting("Zoom Key", 47);
        class_250.H = new NumberSetting("Distance", 4.0, 1.5, 12.0, 0.5).d("x");
        a.f = new NumberSetting("Animation", 180.0, 0.0, 500.0, 10.0).d(" ms");
    }

    /*
     * WARNING - void declaration
     */
    public float d(float f2) {
        void v1;
        void a;
        float f3;
        Zoom class_250 = this;
long l = System.nanoTime();
        float f4 = class_250.e == 0L ? 0.0f : Math.min((float)(l - class_250.e) / 1000000.0f, 100.0f);
        class_250.e = l;
        int n = class_250.d() && class_250.d.D() && Zoom.e.currentScreen == null && class_250.d.l() ? 1 : 0;
        float f5 = n != 0 ? 1.0f : 0.0f;
        float f6 = class_250.f.L();
        if (f3 <= 0.0f) {
            v1 = a;
            class_250.i = f5;
        } else {
            if (f4 > 0.0f) {
                float a2 = Math.clamp(f4 / f6, 0.0f, 1.0f);
                a2 = 1.0f - (float)Math.pow(-3.0f, 3.0);
                float f7 = f5;
                class_250.i += (f7 - class_250.i) * 4.0f;
                if (Math.abs(f7 - class_250.i) < 0.001f) {
                    class_250.i = f5;
                }
            }
            v1 = a;
        }
        void a2 = v1 / class_250.H.L();
        void v3 = a;
        return (float)(v3 + (a2 - v3) * Zoom.L(class_250.i));
    }

    private static float L(float a) {
a = Math.clamp(a, 0.0f, 1.0f);
        return a * a * (3.0f - 2.0f * a);
    }

    @Override
    protected void D() {
a.e = 0L;
    }

    public boolean I() {
        Zoom a;
if (a.d() && a.i > 0.02f) {
            return 1 != 0;
        }
        return false;
    }

    public float L() {
        Zoom a;
if (a.d()) {
            return a.i;
        }
        return 0.0f;
    }
}

