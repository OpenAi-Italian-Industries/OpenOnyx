/*
 * Decompiled with CFR.
 */
package openonyx.interaction.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class InteractionSupport_026
extends Record {
    private final double H;
    private final Vec3 e;

    public Vec3 L() {
        InteractionSupport_026 a;
return a.e;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        InteractionSupport_026 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{InteractionSupport_026.class, "eyePos;randomNumber", "e", "H"}, a2, a);
    }

    @Override
    public final String toString() {
        InteractionSupport_026 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{InteractionSupport_026.class, "eyePos;randomNumber", "e", "H"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public InteractionSupport_026(Vec3 vec3, double d) {
        void a;
        InteractionSupport_026 a2;
        Vec3 a3 = vec3;
        InteractionSupport_026 class_026 = a2 = this;
        class_026.e = a3;
        class_026.H = a;
    }

    @Override
    public final int hashCode() {
        InteractionSupport_026 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{InteractionSupport_026.class, "eyePos;randomNumber", "e", "H"}, a);
    }

    public double L() {
        InteractionSupport_026 a;
return a.H;
    }
}

