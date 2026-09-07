/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_m;

import openonyx.history.SettingListener_035;
import openonyx.input.InputSupport_002;
import openonyx.render.internal.RenderSupport_176;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureMode_367
extends Enum<FeatureMode_367>
implements SettingListener_035 {
    final public static FeatureMode_367 I;
    final public static FeatureMode_367 d;
    final public static FeatureMode_367 i;
    private final String f;
    final public static FeatureMode_367 H;
    private final static FeatureMode_367[] e;

    public boolean D() {
        FeatureMode_367 a;
if (a == H) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FeatureMode_367(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        FeatureMode_367 a = var3_2;
        FeatureMode_367 a2 = this;
        a2.f = a;
    }

    private static FeatureMode_367[] L() {
FeatureMode_367[] enum_367Array = new FeatureMode_367[4];
        enum_367Array[0] = i;
        enum_367Array[1] = d;
        enum_367Array[2] = I;
        enum_367Array[3] = H;
        return enum_367Array;
    }

    static {
        i = new FeatureMode_367("SLIDE", 0, "Slide");
        d = new FeatureMode_367("FADE", 1, "Fade");
        I = new FeatureMode_367("SLIDE_FADE", 2, "Slide + Fade");
        H = new FeatureMode_367("SCALE", 3, "Scale");
        e = FeatureMode_367.L();
    }

    public boolean d() {
        FeatureMode_367 a;
if (a != i) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public String L() {
        FeatureMode_367 a;
return a.f;
    }

    public static FeatureMode_367[] values() {
return (FeatureMode_367[])e.clone();
    }

    public static FeatureMode_367 valueOf(String a) {
return Enum.valueOf(FeatureMode_367.class, a);
    }

    public boolean L() {
        FeatureMode_367 a;
return a == i || a == I;
    }
}

