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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TextSetting
extends SettingValue<String> {
    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L((String)a);
    }

    @Override
    public TextSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        TextSetting a2 = this;
TextSetting class_046 = a2;
        super.L(a);
        return class_046;
    }

    @Override
    public JsonElement L() {
        TextSetting a;
return new JsonPrimitive((String)a.L());
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L((String)a);
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((TextSetting)class_038).L(a);
    }

    @Override
    public TextSetting L(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        TextSetting a2 = this;
TextSetting class_046 = a2;
        super.L(a);
        return class_046;
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L((String)a);
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L((Consumer)a);
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public TextSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        TextSetting a2 = this;
TextSetting class_046 = a2;
        super.L(a);
        return class_046;
    }

    @Override
    public TextSetting L(String string) {
        String a = string;
        TextSetting a2 = this;
TextSetting class_046 = a2;
        super.L(a);
        return class_046;
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((TextSetting)object).L((BooleanSupplier)a);
    }

    /*
     * WARNING - void declaration
     */
    public TextSetting(String string, String string2) {
        void a;
        String a2 = string2;
        TextSetting a3 = this;
        super((String)a, a2);
    }

    /*
     * WARNING - void declaration
     */
    public <O> TextSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        TextSetting a3 = this;
TextSetting class_046 = a3;
        super.L(a, a2);
        return class_046;
    }

    @Override
    protected String L(String string) {
        String a = string;
        TextSetting a2 = this;
if (a == null) {
            return "";
        }
        return a;
    }

    @Override
    public void L(JsonElement jsonElement) {
        JsonElement a = jsonElement;
        TextSetting a2 = this;
if (!a.isJsonPrimitive() || !a.getAsJsonPrimitive().isString()) {
            return;
        }
        a2.i(a.getAsString());
    }
}

