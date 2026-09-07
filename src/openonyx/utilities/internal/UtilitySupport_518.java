/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;
import openonyx.events.EntityRelationUtils;
import openonyx.ui.internal.UiSupport_593;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilityMode_515;
import openonyx.utilities.internal.UtilityListener_511;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UtilitySupport_518
extends Record
implements UtilityListener_511 {
    private final Vec3 H;
    private final Vec3 e;

    @Override
    public UtilityMode_515 L() {
return UtilityMode_515.f;
    }

    @Override
    public final int hashCode() {
        UtilitySupport_518 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{UtilitySupport_518.class, "start;end", "H", "e"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_518(Vec3 vec3, Vec3 vec32) {
        void a;
        Vec3 a2 = vec32;
        UtilitySupport_518 a3 = this;
        if (UtilitySupport_495.d(a2.subtract((Vec3)a))) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Line segment must not have zero length, actual: ").append(a).append(" -> ").append(a2).toString());
        }
        a3.H = a;
        a3.e = a2;
    }

    public Vec3 i() {
        UtilitySupport_518 a;
return a.e;
    }

    @Override
    public final String toString() {
        UtilitySupport_518 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{UtilitySupport_518.class, "start;end", "H", "e"}, a);
    }

    @Override
    public Vec3 d() {
        UtilitySupport_518 a;
return a.H;
    }

    public double L() {
        UtilitySupport_518 a;
return a.L().length();
    }

    public Vec3 D() {
        UtilitySupport_518 a;
return a.H;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        UtilitySupport_518 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{UtilitySupport_518.class, "start;end", "H", "e"}, a2, a);
    }

    @Override
    public Vec3 L() {
        UtilitySupport_518 a;
UtilitySupport_518 class_518 = a;
        return class_518.e.subtract(class_518.H);
    }
}

