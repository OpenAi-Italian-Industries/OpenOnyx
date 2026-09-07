/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureSupport_451
extends Record {
    private final boolean d;
    private final boolean i;
    private final int f;
    private final boolean H;
    final public static FeatureSupport_451 e;

    @Override
    public final String toString() {
        FeatureSupport_451 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{FeatureSupport_451.class, "jump;sneakTime;stopInput;stepBack", "i", "f", "H", "d"}, a);
    }

    public boolean D() {
        FeatureSupport_451 a;
return a.H;
    }

    public int L() {
        FeatureSupport_451 a;
return a.f;
    }

    public boolean d() {
        FeatureSupport_451 a;
return a.d;
    }

    @Override
    public final int hashCode() {
        FeatureSupport_451 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{FeatureSupport_451.class, "jump;sneakTime;stopInput;stepBack", "i", "f", "H", "d"}, a);
    }

    public boolean L() {
        FeatureSupport_451 a;
return a.i;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        FeatureSupport_451 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{FeatureSupport_451.class, "jump;sneakTime;stopInput;stepBack", "i", "f", "H", "d"}, a2, a);
    }

    /*
     * WARNING - void declaration
     */
    public FeatureSupport_451(boolean bl, int n, boolean bl2, boolean bl3) {
        void a;
        void a2;
        void a3;
        void a4;
        FeatureSupport_451 a5;
        boolean bl4 = bl3;
        FeatureSupport_451 class_451 = a5 = this;
        FeatureSupport_451 class_4512 = a5;
        class_4512.i = a4;
        class_4512.f = a3;
        class_451.H = a2;
        class_451.d = a;
    }

    static {
        boolean bl = 0;
        e = new FeatureSupport_451(bl, bl ? 1 : 0, bl, bl);
    }
}

