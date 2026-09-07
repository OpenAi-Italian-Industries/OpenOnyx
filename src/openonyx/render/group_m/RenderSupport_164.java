/*
 * Decompiled with CFR.
 */
package openonyx.render.group_m;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_164
extends Record {
    private final long H;
    private final Vec3 e;

    @Override
    public final String toString() {
        RenderSupport_164 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_164.class, "position;time", "e", "H"}, a);
    }

    public Vec3 L() {
        RenderSupport_164 a;
return a.e;
    }

    public long L() {
        RenderSupport_164 a;
return a.H;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_164 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_164.class, "position;time", "e", "H"}, a2, a);
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_164(Vec3 vec3, long l) {
        void a;
        RenderSupport_164 a2;
        Vec3 a3 = vec3;
        RenderSupport_164 class_164 = a2 = this;
        class_164.e = a3;
        class_164.H = a;
    }

    @Override
    public final int hashCode() {
        RenderSupport_164 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_164.class, "position;time", "e", "H"}, a);
    }
}

