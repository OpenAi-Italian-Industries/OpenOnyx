/*
 * Decompiled with CFR.
 */
package openonyx.history;

import java.util.function.BooleanSupplier;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_036;
import openonyx.history.ModeSetting;

public class ModeOption
extends SettingSupport_036 {
    private transient ModeSetting<?> e;

    @Override
    public ModeOption L(String string) {
        String a = string;
        ModeOption a2 = this;
ModeOption class_041 = a2;
        super.L(a);
        return class_041;
    }

    @Override
    public SettingSupport_036 L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ModeOption)object).L((BooleanSupplier)a);
    }

    public boolean h() {
        ModeOption a;
if (a.e != null && a.e.L() == a) {
            return 1 != 0;
        }
        return false;
    }

    void L(ModeSetting<?> class_037) {
        Setting a = class_037;
        ModeOption a2 = this;
a2.e = a;
    }

    protected ModeOption(String string) {
        String a = string;
        ModeOption a2 = this;
        super(a);
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ModeOption)object).L((BooleanSupplier)a);
    }

    public void i() {
        ModeOption a;
if (a.e != null) {
            a.e.d(a);
        }
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((ModeOption)object).L((String)a);
    }

    @Override
    public ModeOption L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        ModeOption a2 = this;
ModeOption class_041 = a2;
        super.L(a);
        return class_041;
    }

    @Override
    public SettingSupport_036 L(String object) {
        Object a = object;
        object = this;
return ((ModeOption)object).L((String)a);
    }
}

