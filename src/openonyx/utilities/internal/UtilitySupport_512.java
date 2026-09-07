/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;

public final class UtilitySupport_512
extends Record {
    private final Vec3 H;
    private final Vec3 e;

    @Override
    public final int hashCode() {
        UtilitySupport_512 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{UtilitySupport_512.class, "first;second", "e", "H"}, a);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        UtilitySupport_512 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{UtilitySupport_512.class, "first;second", "e", "H"}, a2, a);
    }

    public Vec3 d() {
        UtilitySupport_512 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_512(Vec3 vec3, Vec3 vec32) {
        void a;
        UtilitySupport_512 a2;
        Vec3 a3 = vec32;
        UtilitySupport_512 class_512 = a2 = this;
        class_512.e = a;
        class_512.H = a3;
    }

    @Override
    public final String toString() {
        UtilitySupport_512 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{UtilitySupport_512.class, "first;second", "e", "H"}, a);
    }

    public Vec3 L() {
        UtilitySupport_512 a;
return a.H;
    }
}

