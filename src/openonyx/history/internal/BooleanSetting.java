/*
 * Decompiled with CFR.
 */
package openonyx.history.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import openonyx.history.Setting;
import openonyx.history.SettingValue;

public class BooleanSetting
extends SettingValue<Boolean> {
    @Override
    public BooleanSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        BooleanSetting a2 = this;
BooleanSetting class_051 = a2;
        super.L(a);
        return class_051;
    }

    /*
     * WARNING - void declaration
     */
    public BooleanSetting(String string, boolean bl) {
        void a;
        boolean a2 = bl;
        BooleanSetting a3 = this;
        super((String)a, a2);
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((BooleanSetting)object).L((BooleanSupplier)a);
    }

    public void D() {
        BooleanSetting a;
BooleanSetting class_051 = a;
        class_051.i(((Boolean)class_051.L() == false ? 1 : 0) != 0);
    }

    @Override
    public void L(JsonElement jsonElement) {
        JsonElement a = jsonElement;
        BooleanSetting a2 = this;
if (!a.isJsonPrimitive() || !a.getAsJsonPrimitive().isBoolean()) {
            return;
        }
        a2.i(a.getAsBoolean());
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((BooleanSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((BooleanSetting)object).L((String)a);
    }

    @Override
    public JsonElement L() {
        BooleanSetting a;
return new JsonPrimitive((Boolean)a.L());
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((BooleanSetting)object).L((String)a);
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((BooleanSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public BooleanSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        BooleanSetting a2 = this;
BooleanSetting class_051 = a2;
        super.L(a);
        return class_051;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((BooleanSetting)class_038).L(a);
    }

    @Override
    public BooleanSetting L(Consumer<Boolean> consumer) {
        Consumer<Boolean> a = consumer;
        BooleanSetting a2 = this;
BooleanSetting class_051 = a2;
        super.L(a);
        return class_051;
    }

    @Override
    public BooleanSetting L(String string) {
        String a = string;
        BooleanSetting a2 = this;
BooleanSetting class_051 = a2;
        super.L(a);
        return class_051;
    }

    @Override
    public boolean d() {
        BooleanSetting a;
return (Boolean)a.L();
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((BooleanSetting)object).L((Consumer)a);
    }

    /*
     * WARNING - void declaration
     */
    public <O> BooleanSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        BooleanSetting a3 = this;
BooleanSetting class_051 = a3;
        super.L(a, a2);
        return class_051;
    }
}

