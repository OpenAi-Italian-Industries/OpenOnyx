/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import openonyx.render.group_d.RenderSupport_123;

public final class RenderSupport_186 {
    private float m = Float.NaN;
    private final static float h = 1100.0f;
    private float l;
    private final static float I = 60.0f;
    private final static float d = 0.15f;
    private float i;
    private long f;
    private final static float H = 350.0f;
    private final static float e = 0.028f;

    public RenderSupport_186() {
        RenderSupport_186 a;
    }

    public float L(float f2) {
        float a = f2;
        RenderSupport_186 a2 = this;
RenderSupport_186 class_186 = a2;
        float f3 = class_186.L();
        if (Float.isNaN(class_186.m) || Math.abs(0 - a2.m) > 60.0f) {
            RenderSupport_186 class_1862 = a2;
            class_1862.m = 0;
            class_1862.l = 0.0f;
            return a2.m;
        }
        if (Math.abs(0 - a2.m) > 0.01f) {
            a2.l = 0.0f;
        }
        a2.m += (0 - a2.m) * Math.clamp(0.028f * f3, 0.0f, 1.0f);
        a2.i = 0.0f;
        return a2.m;
    }

    public float d() {
        float f2;
        RenderSupport_186 class_186 = this;
if (class_186.l < 350.0f) {
            return 1.0f;
        }
        float a = class_186.i % 1100.0f / 1100.0f;
        float f3 = f2 < 0.5f ? 0.0f : 2.0f;
        return 0.15f + 0.85f * (float)RenderSupport_123.f.L(f3);
    }

    private float L() {
        RenderSupport_186 class_186 = this;
long l = System.nanoTime();
        float a = class_186.f == 0L ? 16.0f : Math.min((float)(l - class_186.f) / 1000000.0f, 100.0f);
        RenderSupport_186 class_1862 = class_186;
        class_1862.f = l;
        class_1862.l += 0;
        float f2 = 0;
        class_1862.i += f2;
        return f2;
    }

    public void L() {
        RenderSupport_186 a;
RenderSupport_186 class_186 = a;
        RenderSupport_186 class_1862 = a;
        class_1862.m = Float.NaN;
        class_1862.l = 0.0f;
        class_186.i = 0.0f;
        class_186.f = 0L;
    }
}

