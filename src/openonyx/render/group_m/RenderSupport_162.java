/*
 * Decompiled with CFR.
 */
package openonyx.render.group_m;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import openonyx.features.render.FeatureMode_254;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_162
extends Record {
    private final boolean l;
    private final float I;
    private final float d;
    private final FeatureMode_254 i;
    private final float f;
    private final long H;
    private final int e;

    /*
     * WARNING - void declaration
     */
    public RenderSupport_162(FeatureMode_254 enum_254, int n, float f2, long l, float f3, float f4, boolean bl) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        RenderSupport_162 a8;
        boolean bl2 = bl;
        RenderSupport_162 class_162 = a8 = this;
        RenderSupport_162 class_1622 = a8;
        RenderSupport_162 class_1623 = a8;
        a8.i = a7;
        class_1623.e = a6;
        class_1623.f = a5;
        class_1622.H = a4;
        class_1622.I = a3;
        class_162.d = a2;
        class_162.l = a;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_162 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_162.class, "mode;color;opacity;lifetime;lineWidth;pointSize;throughWalls", "i", "e", "f", "H", "I", "d", "l"}, a2, a);
    }

    public float D() {
        RenderSupport_162 a;
return a.f;
    }

    public int L() {
        RenderSupport_162 a;
return a.e;
    }

    @Override
    public final String toString() {
        RenderSupport_162 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_162.class, "mode;color;opacity;lifetime;lineWidth;pointSize;throughWalls", "i", "e", "f", "H", "I", "d", "l"}, a);
    }

    public float d() {
        RenderSupport_162 a;
return a.I;
    }

    @Override
    public final int hashCode() {
        RenderSupport_162 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_162.class, "mode;color;opacity;lifetime;lineWidth;pointSize;throughWalls", "i", "e", "f", "H", "I", "d", "l"}, a);
    }

    public FeatureMode_254 L() {
        RenderSupport_162 a;
return a.i;
    }

    public long L() {
        RenderSupport_162 a;
return a.H;
    }

    public boolean L() {
        RenderSupport_162 a;
return a.l;
    }

    public float L() {
        RenderSupport_162 a;
return a.d;
    }
}

