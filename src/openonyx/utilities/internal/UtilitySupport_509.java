/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UtilitySupport_509
extends Record {
    private final Vec3 H;
    private final double e;

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        UtilitySupport_509 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{UtilitySupport_509.class, "point;distanceSquared", "H", "e"}, a2, a);
    }

    @Override
    public final int hashCode() {
        UtilitySupport_509 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{UtilitySupport_509.class, "point;distanceSquared", "H", "e"}, a);
    }

    @Override
    public final String toString() {
        UtilitySupport_509 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{UtilitySupport_509.class, "point;distanceSquared", "H", "e"}, a);
    }

    public double L() {
        UtilitySupport_509 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_509(Vec3 vec3, double d) {
        void a;
        UtilitySupport_509 a2;
        Vec3 a3 = vec3;
        UtilitySupport_509 class_509 = a2 = this;
        class_509.H = a3;
        class_509.e = a;
    }

    public Vec3 L() {
        UtilitySupport_509 a;
return a.H;
    }
}

