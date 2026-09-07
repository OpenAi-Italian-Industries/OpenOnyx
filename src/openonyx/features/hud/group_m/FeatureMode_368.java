/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_m;

import openonyx.history.SettingListener_035;
import openonyx.interaction.internal.PlacementResult;
import openonyx.ui.UiSupport_546;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureMode_368
extends Enum<FeatureMode_368>
implements SettingListener_035 {
    final public static FeatureMode_368 h;
    private final String l;
    final public static FeatureMode_368 I;
    final public static FeatureMode_368 d;
    final public static FeatureMode_368 i;
    private final static FeatureMode_368[] f;
    final public static FeatureMode_368 H;
    final public static FeatureMode_368 e;

    public static FeatureMode_368[] values() {
return (FeatureMode_368[])f.clone();
    }

    @Override
    public String L() {
        FeatureMode_368 a;
return a.l;
    }

    public boolean d() {
        FeatureMode_368 a;
return a == h || a == d;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FeatureMode_368(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        FeatureMode_368 a = var3_2;
        FeatureMode_368 a2 = this;
        a2.l = a;
    }

    public static FeatureMode_368 valueOf(String a) {
return Enum.valueOf(FeatureMode_368.class, a);
    }

    private static FeatureMode_368[] L() {
FeatureMode_368[] enum_368Array = new FeatureMode_368[6];
        enum_368Array[0] = e;
        enum_368Array[1] = I;
        enum_368Array[2] = h;
        enum_368Array[3] = d;
        enum_368Array[4] = H;
        enum_368Array[5] = i;
        return enum_368Array;
    }

    public boolean L() {
        FeatureMode_368 a;
return a == h || a == H;
    }

    static {
        e = new FeatureMode_368("ACCENT", 0, "Accent");
        I = new FeatureMode_368("STATIC", 1, "Static");
        h = new FeatureMode_368("FADE", 2, "Fade");
        d = new FeatureMode_368("GRADIENT", 3, "Gradient");
        H = new FeatureMode_368("RAINBOW", 4, "Rainbow");
        i = new FeatureMode_368("CATEGORY", 5, "Category");
        f = FeatureMode_368.L();
    }
}

