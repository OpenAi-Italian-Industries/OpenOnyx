/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.movement.MovementSupport_088;

public final class RayTraceMode
extends Enum<RayTraceMode> {
    private final boolean i;
    final public static RayTraceMode f;
    private final static RayTraceMode[] H;
    final public static RayTraceMode e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RayTraceMode(boolean bl) {
        void var2_-1;
        void var1_-1;
        void var3_3;
        void a = var3_3;
        RayTraceMode a2 = this;
        a2.i = a;
    }

    public boolean L() {
        RayTraceMode a;
return a.i;
    }

    private static RayTraceMode[] L() {
RayTraceMode[] enum_490Array = new RayTraceMode[2];
        enum_490Array[0] = e;
        enum_490Array[1] = f;
        return enum_490Array;
    }

    public static RayTraceMode[] values() {
return (RayTraceMode[])H.clone();
    }

    public static RayTraceMode valueOf(String a) {
return Enum.valueOf(RayTraceMode.class, a);
    }

    static {
        boolean bl = 5 >> 3;
        e = new RayTraceMode("OUTLINE", bl ? 1 : 0, bl);
        boolean bl2 = 1;
        f = new RayTraceMode("COLLIDER", bl2 ? 1 : 0, bl2);
        H = RayTraceMode.L();
    }
}

