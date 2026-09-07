/*
 * Decompiled with CFR.
 */
package openonyx.history;

import openonyx.history.Range;
import openonyx.history.internal.RangeSetting;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SettingSupport_028 {
    private double f;
    private final boolean H;
    private final RangeSetting e;

    public void L() {
        SettingSupport_028 a;
SettingSupport_028 class_028 = a;
        class_028.f = a.H ? (double)class_028.e.i() : class_028.e.D();
    }

    public SettingSupport_028(RangeSetting class_045) {
        RangeSetting a = class_045;
        SettingSupport_028 a2 = this;
        Object object = a;
        a2.e = a;
        a2.H = ((RangeSetting)object).d();
        ((RangeSetting)object).L(class_033 -> {
            Range a = class_033;
            SettingSupport_028 a2 = this;
a2.L();
        });
        a2.L();
    }

    public int L() {
        SettingSupport_028 a;
return (int)Math.round(a.f);
    }

    public float L() {
        SettingSupport_028 a;
return (float)a.f;
    }

    public double L() {
        SettingSupport_028 a;
return a.f;
    }
}

