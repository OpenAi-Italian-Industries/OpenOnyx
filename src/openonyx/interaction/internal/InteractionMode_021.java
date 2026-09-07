/*
 * Decompiled with CFR.
 */
package openonyx.interaction.internal;

import openonyx.history.SettingListener_035;
import openonyx.movement.MovementSupport_088;
import openonyx.render.group_k.RenderSupport_152;

public final class InteractionMode_021
extends Enum<InteractionMode_021>
implements SettingListener_035 {
    final public static InteractionMode_021 l;
    final public static InteractionMode_021 I;
    final public static InteractionMode_021 d;
    final public static InteractionMode_021 i;
    private final String f;
    final public static InteractionMode_021 H;
    private final static InteractionMode_021[] e;

    @Override
    public String L() {
        InteractionMode_021 a;
return a.f;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InteractionMode_021(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        InteractionMode_021 a = var3_2;
        InteractionMode_021 a2 = this;
        a2.f = a;
    }

    public static InteractionMode_021 valueOf(String a) {
return Enum.valueOf(InteractionMode_021.class, a);
    }

    static {
        I = new InteractionMode_021("CENTER", 0, "Center");
        l = new InteractionMode_021("RANDOM", 1, "Random");
        d = new InteractionMode_021("STABILIZED", 2, "Stabilized");
        H = new InteractionMode_021("NEAREST_ROTATION", 3, "NearestRotation");
        i = new InteractionMode_021("EDGE_POINT", 4, "EdgePoint");
        e = InteractionMode_021.L();
    }

    public static InteractionMode_021[] values() {
return (InteractionMode_021[])e.clone();
    }

    private static InteractionMode_021[] L() {
InteractionMode_021[] enum_021Array = new InteractionMode_021[5];
        enum_021Array[0] = I;
        enum_021Array[1] = l;
        enum_021Array[2] = d;
        enum_021Array[3] = H;
        enum_021Array[4] = i;
        return enum_021Array;
    }
}

