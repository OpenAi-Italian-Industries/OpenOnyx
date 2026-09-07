/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.internal;

import openonyx.events.EntityRelationUtils;
import openonyx.history.SettingListener_035;
import openonyx.render.internal.RenderSupport_174;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureMode_374
extends Enum<FeatureMode_374>
implements SettingListener_035 {
    final public static FeatureMode_374 d = new FeatureMode_374("NUMBER", 0, "Points");
    final public static FeatureMode_374 i = new FeatureMode_374("HEARTS", 1, "Hearts");
    final public static FeatureMode_374 f = new FeatureMode_374("ICON", 2, "Hearts + icon");
    private final String H;
    private final static FeatureMode_374[] e;

    static {
        e = FeatureMode_374.L();
    }

    @Override
    public String L() {
        FeatureMode_374 a;
return a.H;
    }

    public boolean d() {
        FeatureMode_374 a;
if (a != d) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FeatureMode_374(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        FeatureMode_374 a = var3_2;
        FeatureMode_374 a2 = this;
        a2.H = a;
    }

    public static FeatureMode_374[] values() {
return (FeatureMode_374[])e.clone();
    }

    public boolean L() {
        FeatureMode_374 a;
if (a == f) {
            return 1 != 0;
        }
        return false;
    }

    public static FeatureMode_374 valueOf(String a) {
return Enum.valueOf(FeatureMode_374.class, a);
    }

    private static FeatureMode_374[] L() {
FeatureMode_374[] enum_374Array = new FeatureMode_374[3];
        enum_374Array[0] = d;
        enum_374Array[1] = i;
        enum_374Array[2] = f;
        return enum_374Array;
    }
}

