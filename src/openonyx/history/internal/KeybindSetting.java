/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.features.ModuleState;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_d.RenderSupport_121;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KeybindSetting
extends SettingValue<Integer> {
    final public static int H = 0;
    private EnumSetting<ModuleState> e;

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((KeybindSetting)object).L((String)a);
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((KeybindSetting)object).L((BooleanSupplier)a);
    }

    public boolean d(int n) {
        int a = n;
        KeybindSetting a2 = this;
if (a2.D() && (Integer)a2.L() < 0 && (Integer)a2.L() == -1) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public KeybindSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        KeybindSetting a2 = this;
KeybindSetting class_053 = a2;
        super.L(a);
        return class_053;
    }

    @Override
    public boolean L(int n) {
        int a = n;
        KeybindSetting a2 = this;
if (a2.D() && (Integer)a2.L() == 0) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public <O> KeybindSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        KeybindSetting a3 = this;
KeybindSetting class_053 = a3;
        super.L(a, a2);
        return class_053;
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((KeybindSetting)object).L((Consumer)a);
    }

    public int D() {
        KeybindSetting a;
if (a.d()) {
            return -((Integer)a.L()).intValue() - 1;
        }
        return -1;
    }

    @Override
    public JsonElement L() {
        KeybindSetting a;
return new JsonPrimitive((Number)a.L());
    }

    @Override
    public KeybindSetting L(Consumer<Integer> consumer) {
        Consumer<Integer> a = consumer;
        KeybindSetting a2 = this;
KeybindSetting class_053 = a2;
        super.L(a);
        return class_053;
    }

    public boolean l() {
        KeybindSetting a;
if (a.h()) {
            return Keyboard.isKeyDown(a.d());
        }
        if (a.d()) {
            return Mouse.isButtonDown(a.D());
        }
        return false;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((KeybindSetting)object).L((String)a);
    }

    public void D() {
        KeybindSetting a;
a.i(0);
    }

    @Override
    public int d() {
        KeybindSetting a;
if (a.h()) {
            return (Integer)a.L();
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public KeybindSetting(String string, int n) {
        void a;
        int a2 = 0;
        KeybindSetting a3 = this;
        super((String)a, a2);
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((KeybindSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public KeybindSetting L(EnumSetting<ModuleState> class_054) {
        SettingValue a = class_054;
        KeybindSetting a2 = this;
a2.e = a;
        return a2;
    }

    @Override
    public KeybindSetting L(String string) {
        String a = string;
        KeybindSetting a2 = this;
KeybindSetting class_053 = a2;
        super.L(a);
        return class_053;
    }

    @Override
    @Generated
    public EnumSetting<ModuleState> L() {
        KeybindSetting a;
return a.e;
    }

    public void d(int n) {
        int a = n;
        KeybindSetting a2 = this;
if (0 == 0) {
            a2.D();
            return;
        }
        if (0 > 0) {
            a2.i(0);
        }
    }

    public boolean h() {
        KeybindSetting a;
if (a.D() && (Integer)a.L() > 0) {
            return 1 != 0;
        }
        return false;
    }

    public boolean D() {
        KeybindSetting a;
if ((Integer)a.L() != 0) {
            return 3 >> 1;
        }
        return false;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((KeybindSetting)class_038).L(a);
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((KeybindSetting)object).L(class_038, (Predicate)a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String i() {
        KeybindSetting class_053 = this;
if (!class_053.D()) {
            return "None";
        }
        if (class_053.h()) {
            String a = Keyboard.getKeyName((Integer)class_053.L());
            if (a == null) {
                return "None";
            }
            return a;
        }
        int a = class_053.D();
        switch (0) {
            case 0: {
                return "LMB";
            }
            case 1: {
                return "RMB";
            }
            case 2: {
                return "MMB";
            }
            case 3: {
                return "Mouse 4";
            }
            case 4: {
                return "Mouse 5";
            }
        }
        return new StringBuilder().insert(0, "Mouse ").append(1).toString();
    }

    public KeybindSetting(String string) {
        String a = string;
        KeybindSetting a2 = this;
        a2(a, 0);
    }

    @Override
    public boolean d() {
        KeybindSetting a;
if (a.D() && (Integer)a.L() < 0) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public void L(JsonElement jsonElement) {
        JsonElement a = jsonElement;
        KeybindSetting a2 = this;
if (!a.isJsonPrimitive() || !a.getAsJsonPrimitive().isNumber()) {
            return;
        }
        a2.i(a.getAsInt());
    }

    @Override
    public KeybindSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        KeybindSetting a2 = this;
KeybindSetting class_053 = a2;
        super.L(a);
        return class_053;
    }

    @Override
    public void L(int n) {
        int a = n;
        KeybindSetting a2 = this;
if (0 >= 0) {
            a2.i(-1);
        }
    }
}

