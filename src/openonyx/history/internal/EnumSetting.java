/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.history.Setting;
import openonyx.history.Range;
import openonyx.history.SettingValue;
import openonyx.history.SettingListener_035;
import openonyx.interaction.internal.PlacementResult;

public class EnumSetting<E extends Enum<E>>
extends SettingValue<E> {
    private final List<E> e;

    /*
     * WARNING - void declaration
     */
    @SafeVarargs
    public EnumSetting(String string, E e, E ... EArray) {
        void a;
        void a2;
        EnumSetting a3;
        EnumSetting<E> a4 = e;
        EnumSetting class_054 = a3 = this;
        super((String)a2, a4);
        class_054.e = List.of(a);
        if (!class_054.e.contains(a4)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Default '").append(a4).append("' is not offered by '").append((String)a2).append("'").toString());
        }
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((EnumSetting)class_038).L(a);
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((EnumSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <O> EnumSetting<E> L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        EnumSetting a3 = this;
EnumSetting class_054 = a3;
        super.L(a, a2);
        return class_054;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((EnumSetting)object).L((String)a);
    }

    public static String L(Enum<?> enum_) {
        int n;
        Object a;
        Enum<?> enum_2 = enum_;
if (enum_2 instanceof SettingListener_035) {
            a = (SettingListener_035)((Object)enum_2);
            return a.L();
        }
        a = new StringBuilder(enum_2.name().length());
        String[] stringArray = enum_2.name().toLowerCase().split("_");
        int n2 = stringArray.length;
        int n3 = 0;
        while (n3 < n2) {
            String string = stringArray[0];
            if (!string.isEmpty()) {
                Object object;
                Object object2 = a;
                if (a.isEmpty()) {
                    ((StringBuilder)object2).append(Character.toUpperCase(string.charAt(0)));
                    object = a;
                } else {
                    ((StringBuilder)object2).append(' ').append(string.charAt(0));
                    object = a;
                }
                ((StringBuilder)object).append(string, 1, string.length());
            }
            n3 = ++n;
        }
        return ((StringBuilder)a).toString();
    }

    @Override
    public JsonElement L() {
        EnumSetting a;
return new JsonPrimitive(((Enum)a.L()).name());
    }

    /*
     * WARNING - void declaration
     */
    public EnumSetting(String string, E e) {
        void a;
        EnumSetting<E> a2 = e;
        EnumSetting a3 = this;
        super((String)a, a2);
        a3.e = List.of((Enum[])((Enum)((Object)a2)).getDeclaringClass().getEnumConstants());
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((EnumSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public EnumSetting<E> L(String string) {
        String a = string;
        EnumSetting a2 = this;
EnumSetting class_054 = a2;
        super.L(a);
        return class_054;
    }

    @Override
    public void L(JsonElement jsonElement) {
        Object a = jsonElement;
        EnumSetting a2 = this;
if (!((JsonElement)a).isJsonPrimitive() || !((JsonElement)a).getAsJsonPrimitive().isString()) {
            return;
        }
        a = ((JsonElement)a).getAsString();
        for (Enum enum_ : a2.e) {
            if (!enum_.name().equals(a)) continue;
            a2.i(enum_);
            return;
        }
    }

    @Override
    public EnumSetting<E> L(Consumer<E> consumer) {
        Consumer<E> a = consumer;
        EnumSetting a2 = this;
EnumSetting class_054 = a2;
        super.L(a);
        return class_054;
    }

    @Override
    @Generated
    public List<E> d() {
        EnumSetting a;
return a.e;
    }

    @Override
    public EnumSetting<E> L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        EnumSetting a2 = this;
EnumSetting class_054 = a2;
        super.L(a);
        return class_054;
    }

    @Override
    public boolean L(E e) {
        EnumSetting<E> a = e;
        EnumSetting a2 = this;
if (a2.L() == a) {
            return 3 >> 1;
        }
        return false;
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((EnumSetting)object).L((Consumer)a);
    }

    public void D() {
        EnumSetting a;
EnumSetting class_054 = a;
        EnumSetting class_0542 = a;
        class_0542.i((Enum)class_054.e.get((class_054.e.indexOf(class_0542.L()) + 1) % a.e.size()));
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((EnumSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public EnumSetting<E> L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        EnumSetting a2 = this;
EnumSetting class_054 = a2;
        super.L(a);
        return class_054;
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((EnumSetting)object).L(class_038, (Predicate)a);
    }
}

