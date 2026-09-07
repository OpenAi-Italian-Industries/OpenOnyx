/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_m;

import openonyx.events.Rotation;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.history.SettingListener_035;

public final class FeatureMode_366
extends Enum<FeatureMode_366>
implements SettingListener_035 {
    final public static FeatureMode_366 d;
    final public static FeatureMode_366 i;
    final public static FeatureMode_366 f;
    private final static FeatureMode_366[] H;
    private final String e;

    public static FeatureMode_366 valueOf(String a) {
return Enum.valueOf(FeatureMode_366.class, a);
    }

    public static FeatureMode_366[] values() {
return (FeatureMode_366[])H.clone();
    }

    private static FeatureMode_366[] L() {
FeatureMode_366[] enum_366Array = new FeatureMode_366[3];
        enum_366Array[0] = i;
        enum_366Array[1] = f;
        enum_366Array[2] = d;
        return enum_366Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FeatureMode_366(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        FeatureMode_366 a = var3_2;
        FeatureMode_366 a2 = this;
        a2.e = a;
    }

    static {
        i = new FeatureMode_366("WIDTH_DESC", 0, "Longest first");
        f = new FeatureMode_366("WIDTH_ASC", 1, "Shortest first");
        d = new FeatureMode_366("ALPHABETICAL", 2, "A-Z");
        H = FeatureMode_366.L();
    }

    @Override
    public String L() {
        FeatureMode_366 a;
return a.e;
    }
}

