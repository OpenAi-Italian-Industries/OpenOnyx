/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.internal;

import openonyx.features.hud.internal.FeatureMode_378;
import openonyx.history.SettingListener_035;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.utilities.Timer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureMode_379
extends Enum<FeatureMode_379>
implements SettingListener_035 {
    private final String m;
    final public static FeatureMode_379 h;
    final public static FeatureMode_379 l;
    private final static FeatureMode_379[] I;
    private final FeatureMode_378 d;
    final public static FeatureMode_379 i;
    final public static FeatureMode_379 f;
    final public static FeatureMode_379 H;
    final public static FeatureMode_379 e;

    public boolean D() {
        FeatureMode_379 a;
if (a.d == FeatureMode_378.H) {
            return 1 != 0;
        }
        return false;
    }

    public FeatureMode_378 L() {
        FeatureMode_379 a;
return a.d;
    }

    public boolean d() {
        FeatureMode_379 a;
return a.d == FeatureMode_378.f || a.d == FeatureMode_378.i;
    }

    private static FeatureMode_379[] L() {
FeatureMode_379[] enum_379Array = new FeatureMode_379[6];
        enum_379Array[0] = H;
        enum_379Array[1] = h;
        enum_379Array[2] = f;
        enum_379Array[3] = l;
        enum_379Array[4] = i;
        enum_379Array[5] = e;
        return enum_379Array;
    }

    public boolean L() {
        FeatureMode_379 a;
if (a.d == FeatureMode_378.i) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public String L() {
        FeatureMode_379 a;
return a.m;
    }

    static {
        H = new FeatureMode_379("AVATAR", 0, "Avatar", FeatureMode_378.d);
        h = new FeatureMode_379("NAME", 1, "Name", FeatureMode_378.f);
        f = new FeatureMode_379("HEALTH", 2, "Health", FeatureMode_378.i);
        l = new FeatureMode_379("DISTANCE", 3, "Distance", FeatureMode_378.f);
        i = new FeatureMode_379("STATUS", 4, "Status", FeatureMode_378.f);
        e = new FeatureMode_379("HEALTH_BAR", 5, "Health bar", FeatureMode_378.H);
        I = FeatureMode_379.L();
    }

    public static FeatureMode_379 valueOf(String a) {
return Enum.valueOf(FeatureMode_379.class, a);
    }

    /*
     * WARNING - void declaration
     */
    private FeatureMode_379(String string2, FeatureMode_378 string2) {
        FeatureMode_379 a;
        void a2;
        void var2_-1;
        void var1_-1;
        FeatureMode_379 a3;
        void var4_1;
        FeatureMode_379 enum_379 = enum_3792;
        FeatureMode_379 enum_3792 = var4_1;
        FeatureMode_379 enum_3793 = a3 = enum_379;
        enum_3793.m = a2;
        enum_3793.d = a;
    }

    public static FeatureMode_379[] values() {
return (FeatureMode_379[])I.clone();
    }
}

