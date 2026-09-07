/*
 * Decompiled with CFR.
 */
package openonyx.configuration.internal;

import openonyx.input.InputSupport_003;
import openonyx.render.RenderSupport_111;

public final class EventMode_621
extends Enum<EventMode_621> {
    private final static EventMode_621[] f;
    final public static EventMode_621 H = new EventMode_621("PRE", 0);
    final public static EventMode_621 e = new EventMode_621("POST", 1);

    public static EventMode_621[] values() {
return (EventMode_621[])f.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EventMode_621() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        EventMode_621 enum_621 = this;
    }

    private static EventMode_621[] L() {
EventMode_621[] enum_621Array = new EventMode_621[2];
        enum_621Array[0] = H;
        enum_621Array[1] = e;
        return enum_621Array;
    }

    static {
        f = EventMode_621.L();
    }

    public static EventMode_621 valueOf(String a) {
return Enum.valueOf(EventMode_621.class, a);
    }
}

