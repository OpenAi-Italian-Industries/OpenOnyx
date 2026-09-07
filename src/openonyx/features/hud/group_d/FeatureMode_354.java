/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_d;

import openonyx.events.FileDialogUtils;
import openonyx.history.SettingListener_035;
import openonyx.theme.ThemeSupport_055;
import openonyx.ui.UiSupport_546;

public final class FeatureMode_354
extends Enum<FeatureMode_354>
implements SettingListener_035 {
    final public static FeatureMode_354 I;
    private final String d;
    final public static FeatureMode_354 i;
    private final static FeatureMode_354[] f;
    final public static FeatureMode_354 H;
    final public static FeatureMode_354 e;

    public static FeatureMode_354[] values() {
return (FeatureMode_354[])f.clone();
    }

    static {
        H = new FeatureMode_354("INFO", 0, "Info");
        I = new FeatureMode_354("SUCCESS", 1, "Success");
        e = new FeatureMode_354("WARNING", 2, "Warning");
        i = new FeatureMode_354("ERROR", 3, "Error");
        f = FeatureMode_354.L();
    }

    private static FeatureMode_354[] L() {
FeatureMode_354[] enum_354Array = new FeatureMode_354[4];
        enum_354Array[0] = H;
        enum_354Array[1] = I;
        enum_354Array[2] = e;
        enum_354Array[3] = i;
        return enum_354Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FeatureMode_354(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        FeatureMode_354 a = var3_2;
        FeatureMode_354 a2 = this;
        a2.d = a;
    }

    public static FeatureMode_354 valueOf(String a) {
return Enum.valueOf(FeatureMode_354.class, a);
    }

    @Override
    public String L() {
        FeatureMode_354 a;
return a.d;
    }

    public String d() {
        FeatureMode_354 a;
switch (a.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return "\ue88e";
            }
            case 1: {
                return "\ue5ca";
            }
            case 2: {
                return "\ue002";
            }
            case 3: {
                return "\ue001";
            }
        }
    }

    public int L(ThemeSupport_055 class_055) {
        ThemeSupport_055 a = class_055;
        FeatureMode_354 a2 = this;
switch (a2.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return a.E();
            }
            case 1: {
                return a.B();
            }
            case 2: {
                return a.H();
            }
            case 3: {
                return a.K();
            }
        }
    }
}

