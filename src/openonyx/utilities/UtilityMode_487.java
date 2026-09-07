/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.utilities;

import lombok.Generated;
import openonyx.events.HypixelUtils;
import openonyx.render.internal.RenderSupport_176;

public final class UtilityMode_487
extends Enum<UtilityMode_487> {
    final public static UtilityMode_487 m;
    final public static UtilityMode_487 h;
    private final int l;
    final public static UtilityMode_487 I;
    final public static UtilityMode_487 d;
    final public static UtilityMode_487 i;
    final public static UtilityMode_487 f;
    final public static UtilityMode_487 H;
    private final static UtilityMode_487[] e;

    public static UtilityMode_487[] values() {
return (UtilityMode_487[])e.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UtilityMode_487(int n) {
        void var2_-1;
        void var1_-1;
        void var3_3;
        void a = var3_3;
        UtilityMode_487 a2 = this;
        a2.l = a;
    }

    private static UtilityMode_487[] L() {
UtilityMode_487[] enum_487Array = new UtilityMode_487[7];
        enum_487Array[0] = i;
        enum_487Array[1] = H;
        enum_487Array[2] = h;
        enum_487Array[3] = f;
        enum_487Array[4] = m;
        enum_487Array[5] = d;
        enum_487Array[6] = I;
        return enum_487Array;
    }

    public static UtilityMode_487 valueOf(String a) {
return Enum.valueOf(UtilityMode_487.class, a);
    }

    static {
        i = new UtilityMode_487("NOT_IMPORTANT", 0, -20);
        H = new UtilityMode_487("NORMAL", 1, 0);
        h = new UtilityMode_487("IMPORTANT_FOR_USAGE_1", 2, 20);
        f = new UtilityMode_487("IMPORTANT_FOR_USAGE_2", 3, 30);
        m = new UtilityMode_487("IMPORTANT_FOR_USAGE_3", 4, 35);
        d = new UtilityMode_487("IMPORTANT_FOR_PLAYER_LIFE", 5, 40);
        I = new UtilityMode_487("IMPORTANT_FOR_USER_SAFETY", 6, 60);
        e = UtilityMode_487.L();
    }

    @Generated
    public int L() {
        UtilityMode_487 a;
return a.l;
    }
}

