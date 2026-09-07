/*
 * Decompiled with CFR.
 */
package openonyx.render.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class RenderSupport_178
extends Record {
    private final float f;
    private final float H;
    private final float e;

    @Override
    public final int hashCode() {
        RenderSupport_178 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_178.class, "x;y;alphaMul", "H", "e", "f"}, a);
    }

    public float D() {
        RenderSupport_178 a;
return a.f;
    }

    public float d() {
        RenderSupport_178 a;
return a.e;
    }

    @Override
    public final String toString() {
        RenderSupport_178 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_178.class, "x;y;alphaMul", "H", "e", "f"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_178(float f2, float f3, float f4) {
        void a;
        void a2;
        RenderSupport_178 a3;
        float a4 = f4;
        RenderSupport_178 class_178 = a3 = this;
        a3.H = a2;
        class_178.e = a;
        class_178.f = a4;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_178 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_178.class, "x;y;alphaMul", "H", "e", "f"}, a2, a);
    }

    public float L() {
        RenderSupport_178 a;
return a.H;
    }
}

