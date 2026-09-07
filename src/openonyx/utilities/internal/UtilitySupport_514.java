/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;
import openonyx.utilities.internal.UtilityMode_515;
import openonyx.utilities.internal.UtilityListener_511;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UtilitySupport_514
extends Record
implements UtilityListener_511 {
    private final Vec3 H;
    private final Vec3 e;

    @Override
    public Vec3 d() {
        UtilitySupport_514 a;
return a.e;
    }

    @Override
    public final int hashCode() {
        UtilitySupport_514 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{UtilitySupport_514.class, "origin;direction", "e", "H"}, a);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        UtilitySupport_514 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{UtilitySupport_514.class, "origin;direction", "e", "H"}, a2, a);
    }

    public static UtilitySupport_514 L(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
Vec3 vec33 = a2;
        return new UtilitySupport_514(vec33, a.subtract(vec33));
    }

    @Override
    public Vec3 L() {
        UtilitySupport_514 a;
return a.H;
    }

    @Override
    public UtilityMode_515 L() {
return UtilityMode_515.H;
    }

    @Override
    public final String toString() {
        UtilitySupport_514 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{UtilitySupport_514.class, "origin;direction", "e", "H"}, a);
    }

    public Vec3 D() {
        UtilitySupport_514 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_514(Vec3 vec3, Vec3 vec32) {
        void a;
        UtilitySupport_514 a2;
        Vec3 a3 = vec32;
        UtilitySupport_514 class_514 = a2 = this;
        UtilityListener_511.L(a3);
        class_514.e = a;
        class_514.H = a3;
    }
}

