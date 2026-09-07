/*
 * Decompiled with CFR.
 */
package openonyx.render.group_z;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_206
extends Record {
    private final Vec3 H;
    private final long e;

    public Vec3 L() {
        RenderSupport_206 a;
return a.H;
    }

    public long L() {
        RenderSupport_206 a;
return a.e;
    }

    @Override
    public final String toString() {
        RenderSupport_206 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_206.class, "position;time", "H", "e"}, a);
    }

    @Override
    public final int hashCode() {
        RenderSupport_206 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_206.class, "position;time", "H", "e"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_206(Vec3 vec3, long l) {
        void a;
        RenderSupport_206 a2;
        Vec3 a3 = vec3;
        RenderSupport_206 class_206 = a2 = this;
        class_206.H = a3;
        class_206.e = a;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_206 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_206.class, "position;time", "H", "e"}, a2, a);
    }
}

