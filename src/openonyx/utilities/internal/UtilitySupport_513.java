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
public final class UtilitySupport_513
extends Record
implements UtilityListener_511 {
    private final Vec3 H;
    private final Vec3 e;

    @Override
    public Vec3 L() {
        UtilitySupport_513 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_513(Vec3 vec3, Vec3 vec32) {
        void a;
        UtilitySupport_513 a2;
        Vec3 a3 = vec32;
        UtilitySupport_513 class_513 = a2 = this;
        UtilityListener_511.L(a3);
        class_513.H = a;
        class_513.e = a3;
    }

    @Override
    public final String toString() {
        UtilitySupport_513 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{UtilitySupport_513.class, "position;direction", "H", "e"}, a);
    }

    @Override
    public UtilityMode_515 L() {
return UtilityMode_515.m;
    }

    public Vec3 D() {
        UtilitySupport_513 a;
return a.H;
    }

    @Override
    public Vec3 d() {
        UtilitySupport_513 a;
return a.H;
    }

    @Override
    public final int hashCode() {
        UtilitySupport_513 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{UtilitySupport_513.class, "position;direction", "H", "e"}, a);
    }

    public static UtilitySupport_513 L(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
Vec3 vec33 = a2;
        return new UtilitySupport_513(vec33, a.subtract(vec33));
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        UtilitySupport_513 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{UtilitySupport_513.class, "position;direction", "H", "e"}, a2, a);
    }
}

