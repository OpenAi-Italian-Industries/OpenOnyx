/*
 * Decompiled with CFR.
 */
package openonyx.features;

import openonyx.render.internal.RenderSupport_176;

public final class ModuleState
extends Enum<ModuleState> {
    final public static ModuleState f;
    final public static ModuleState H;
    private final static ModuleState[] e;

    private static ModuleState[] L() {
ModuleState[] enum_229Array = new ModuleState[2];
        enum_229Array[0] = H;
        enum_229Array[1] = f;
        return enum_229Array;
    }

    static {
        H = new ModuleState("TOGGLE", 0);
        f = new ModuleState("HOLD", 1);
        e = ModuleState.L();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ModuleState() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        ModuleState enum_229 = this;
    }

    public static ModuleState[] values() {
return (ModuleState[])e.clone();
    }

    public static ModuleState valueOf(String a) {
return Enum.valueOf(ModuleState.class, a);
    }
}

