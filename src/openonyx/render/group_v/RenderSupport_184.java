/*
 * Decompiled with CFR.
 */
package openonyx.render.group_v;

import org.lwjgl.input.Keyboard;

public final class RenderSupport_184 {
    private boolean I;
    private boolean d;
    private boolean i;
    private boolean f;
    private final static float H = 1.0f;
    private final static float[] e;

    static {
        float[] fArray = new float[2];
        fArray[0] = 0.0f;
        fArray[1] = 0.0f;
        e = fArray;
    }

    public RenderSupport_184() {
        RenderSupport_184 a;
    }

    public float[] L(boolean bl) {
        int a;
        RenderSupport_184 class_184 = this;
int n = a != 0 && Keyboard.isKeyDown(203) ? 1 : 0;
        int n2 = a != 0 && Keyboard.isKeyDown(205) ? 1 : 0;
        int n3 = a != 0 && Keyboard.isKeyDown(200) ? 1 : 0;
        a = a != 0 && Keyboard.isKeyDown(208) ? 1 : 0;
        float a2 = 0.0f;
        float f2 = 0.0f;
        if (n != 0 && !class_184.f) {
            a2 -= 1.0f;
        }
        if (n2 != 0 && !class_184.I) {
            a2 += 1.0f;
        }
        if (n3 != 0 && !class_184.d) {
            f2 -= 1.0f;
        }
        if (a != 0 && !class_184.i) {
            f2 += 1.0f;
        }
        RenderSupport_184 class_1842 = class_184;
        class_184.f = n;
        class_1842.I = n2;
        class_1842.d = n3;
        class_184.i = a;
        if (4.0f == 0.0f && f2 == 0.0f) {
            return e;
        }
        float[] fArray = new float[2];
        fArray[0] = 4.0f;
        fArray[1] = f2;
        return fArray;
    }
}

