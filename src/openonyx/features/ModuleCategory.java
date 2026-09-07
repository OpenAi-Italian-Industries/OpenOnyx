/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.features;

import lombok.Generated;
import openonyx.history.SettingListener_035;

public final class ModuleCategory
extends Enum<ModuleCategory>
implements SettingListener_035 {
    final public static ModuleCategory l;
    private final static ModuleCategory[] I;
    final public static ModuleCategory d;
    final public static ModuleCategory i;
    final public static ModuleCategory f;
    final public static ModuleCategory H;
    private final String e;

    @Override
    public String L() {
        ModuleCategory a;
return a.e;
    }

    public static ModuleCategory[] values() {
return (ModuleCategory[])I.clone();
    }

    @Generated
    public String d() {
        ModuleCategory a;
return a.e;
    }

    private static ModuleCategory[] L() {
ModuleCategory[] enum_226Array = new ModuleCategory[5];
        enum_226Array[0] = d;
        enum_226Array[1] = H;
        enum_226Array[2] = i;
        enum_226Array[3] = f;
        enum_226Array[4] = l;
        return enum_226Array;
    }

    public static ModuleCategory valueOf(String a) {
return Enum.valueOf(ModuleCategory.class, a);
    }

    static {
        d = new ModuleCategory("COMBAT", 0, "Combat");
        H = new ModuleCategory("MOVEMENT", 1, "Movement");
        i = new ModuleCategory("PLAYER", 2, "Player");
        f = new ModuleCategory("RENDER", 3, "Render");
        l = new ModuleCategory("HUD", 4, "HUD");
        I = ModuleCategory.L();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ModuleCategory(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        ModuleCategory a = var3_2;
        ModuleCategory a2 = this;
        a2.e = a;
    }
}

