/*
 * Decompiled with CFR.
 */
package openonyx.events;

import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.render.internal.RenderSupport_176;

public final class RotationFixMode
extends Enum<RotationFixMode> {
    final public static RotationFixMode i = new RotationFixMode("OFF", 0);
    private final static RotationFixMode[] f;
    final public static RotationFixMode H;
    final public static RotationFixMode e;

    private static RotationFixMode[] L() {
RotationFixMode[] enum_539Array = new RotationFixMode[3];
        enum_539Array[0] = i;
        enum_539Array[1] = e;
        enum_539Array[2] = H;
        return enum_539Array;
    }

    static {
        e = new RotationFixMode("STRICT", 1);
        H = new RotationFixMode("SILENT", 2);
        f = RotationFixMode.L();
    }

    public static RotationFixMode[] values() {
return (RotationFixMode[])f.clone();
    }

    public static RotationFixMode valueOf(String a) {
return Enum.valueOf(RotationFixMode.class, a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RotationFixMode() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        RotationFixMode enum_539 = this;
    }
}

