/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_m;

import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.history.SettingListener_035;
import openonyx.render.group_e.RenderSupport_128;

public final class FeatureMode_365
extends Enum<FeatureMode_365>
implements SettingListener_035 {
    private final static FeatureMode_365[] d;
    private final String i;
    final public static FeatureMode_365 f = new FeatureMode_365("ACCENT_BAR", 0, "Accent Bar");
    final public static FeatureMode_365 H = new FeatureMode_365("PILLS", 1, "Pills");
    final public static FeatureMode_365 e = new FeatureMode_365("TEXT", 2, "Text");

    private static FeatureMode_365[] L() {
FeatureMode_365[] enum_365Array = new FeatureMode_365[3];
        enum_365Array[0] = f;
        enum_365Array[1] = H;
        enum_365Array[2] = e;
        return enum_365Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FeatureMode_365(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        FeatureMode_365 a = var3_2;
        FeatureMode_365 a2 = this;
        a2.i = a;
    }

    public static FeatureMode_365 valueOf(String a) {
return Enum.valueOf(FeatureMode_365.class, a);
    }

    @Override
    public String L() {
        FeatureMode_365 a;
return a.i;
    }

    static {
        d = FeatureMode_365.L();
    }

    public static FeatureMode_365[] values() {
return (FeatureMode_365[])d.clone();
    }
}

