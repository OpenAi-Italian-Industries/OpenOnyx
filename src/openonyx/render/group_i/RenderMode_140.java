/*
 * Decompiled with CFR.
 */
package openonyx.render.group_i;

import openonyx.events.Rotation;
import openonyx.theme.internal.ThemeSupport_063;

public final class RenderMode_140
extends Enum<RenderMode_140> {
    final public static RenderMode_140 i;
    final public static RenderMode_140 f;
    final public static RenderMode_140 H;
    private final static RenderMode_140[] e;

    public static RenderMode_140 valueOf(String a) {
return Enum.valueOf(RenderMode_140.class, a);
    }

    private static RenderMode_140[] L() {
RenderMode_140[] enum_140Array = new RenderMode_140[3];
        enum_140Array[0] = H;
        enum_140Array[1] = i;
        enum_140Array[2] = f;
        return enum_140Array;
    }

    static {
        H = new RenderMode_140("STATIC", 0);
        i = new RenderMode_140("GRADIENT", 1);
        f = new RenderMode_140("RAINBOW", 2);
        e = RenderMode_140.L();
    }

    public static RenderMode_140[] values() {
return (RenderMode_140[])e.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RenderMode_140() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        RenderMode_140 enum_140 = this;
    }
}

