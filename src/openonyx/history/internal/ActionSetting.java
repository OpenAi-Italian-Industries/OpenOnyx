/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import openonyx.history.Setting;

public class ActionSetting
extends Setting {
    private final Runnable H;
    private String e;

    public ActionSetting d(String string) {
        String a = string;
        ActionSetting a2 = this;
a2.e = a;
        return a2;
    }

    @Override
    public JsonElement L() {
return JsonNull.INSTANCE;
    }

    @Override
    public ActionSetting L(String string) {
        String a = string;
        ActionSetting a2 = this;
ActionSetting class_043 = a2;
        super.L(a);
        return class_043;
    }

    @Override
    public ActionSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        ActionSetting a2 = this;
ActionSetting class_043 = a2;
        super.L(a);
        return class_043;
    }

    @Generated
    public String i() {
        ActionSetting a;
return a.e;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((ActionSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    public ActionSetting(String string, Runnable runnable) {
        void a;
        ActionSetting a2;
        String a3 = string;
        ActionSetting class_043 = a2 = this;
        super(a3);
        class_043.H = a;
        class_043.e = a3;
    }

    @Override
    public void L(JsonElement jsonElement) {
        JsonElement a = jsonElement;
        ActionSetting a2 = this;
}

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ActionSetting)object).L((BooleanSupplier)a);
    }

    public void d() {
        ActionSetting a;
a.H.run();
    }
}

