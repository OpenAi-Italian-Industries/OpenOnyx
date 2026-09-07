/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.history.Setting;
import openonyx.history.SettingValue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MultiSelectSetting<E extends Enum<E>>
extends SettingValue<EnumSet<E>> {
    private final Class<E> f;
    private final List<E> H;
    private boolean e;

    @Override
    public MultiSelectSetting<E> L(boolean bl) {
        boolean a = bl;
        MultiSelectSetting a2 = this;
a2.e = a;
        return a2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void L(JsonElement var1_1) {
        a = var1_1;
        a = this;
if (!a.isJsonArray()) {
            return;
        }
        var2_2 = EnumSet.noneOf(a.f);
        a = a.getAsJsonArray().iterator();
        block0: while (true) {
            v0 = a;
            while (v0.hasNext()) {
                var3_3 = a.next();
                if (!var3_3.isJsonPrimitive()) continue block0;
                if (!var3_3.getAsJsonPrimitive().isString()) {
                    v0 = a;
                    continue;
                }
                var3_3 = var3_3.getAsString();
                var4_4 = a.H.iterator();
                while (true) {
                    if (var4_4.hasNext()) ** break;
                    continue block0;
                    var5_5 = (Enum)var4_4.next();
                    if (!var5_5.name().equals(var3_3)) continue;
                    var2_2.add(var5_5);
                }
            }
            break;
        }
        a.i(var2_2);
    }

    /*
     * WARNING - void declaration
     */
    public void L(E e, boolean bl) {
        void a;
        MultiSelectSetting<E> a2 = e;
        MultiSelectSetting a3 = this;
if (a3.L((E)a2) == a) {
            return;
        }
        a3.L((E)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <O> MultiSelectSetting<E> L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        MultiSelectSetting a3 = this;
MultiSelectSetting class_042 = a3;
        super.L(a, a2);
        return class_042;
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L((EnumSet)a);
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public boolean L(E e) {
        MultiSelectSetting<E> a = e;
        MultiSelectSetting a2 = this;
return ((EnumSet)a2.L()).contains(a);
    }

    @Override
    public MultiSelectSetting<E> L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        MultiSelectSetting a2 = this;
MultiSelectSetting class_042 = a2;
        super.L(a);
        return class_042;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((MultiSelectSetting)class_038).L(a);
    }

    public boolean D() {
        MultiSelectSetting a;
return ((EnumSet)a.L()).isEmpty();
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L((String)a);
    }

    @Override
    public Class<E> L() {
        MultiSelectSetting a;
return a.f;
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L((String)a);
    }

    @Override
    public MultiSelectSetting<E> L(Consumer<EnumSet<E>> consumer) {
        Consumer<EnumSet<E>> a = consumer;
        MultiSelectSetting a2 = this;
MultiSelectSetting class_042 = a2;
        super.L(a);
        return class_042;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(E e) {
        void a;
        MultiSelectSetting class_042 = this;
EnumSet a2 = EnumSet.copyOf((EnumSet)class_042.L());
        if (!a2.remove(a)) {
            a2.add(a);
        }
        class_042.i(a2);
    }

    @Override
    protected EnumSet<E> L(EnumSet<E> enumSet) {
        EnumSet<E> a = enumSet;
        MultiSelectSetting a2 = this;
if (!a2.e && a.isEmpty() && a2.L() != null) {
            return (EnumSet)a2.L();
        }
        return EnumSet.copyOf(a);
    }

    @Override
    public JsonElement L() {
        Object a;
        MultiSelectSetting class_042 = this;
JsonArray jsonArray = new JsonArray();
        Object object = a = ((EnumSet)class_042.L()).iterator();
        while (object.hasNext()) {
            Enum enum_ = (Enum)a.next();
            object = a;
            jsonArray.add(new JsonPrimitive(enum_.name()));
        }
        return jsonArray;
    }

    @Override
    @Generated
    public boolean d() {
        MultiSelectSetting a;
return a.e;
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L((Consumer)a);
    }

    /*
     * WARNING - void declaration
     */
    @SafeVarargs
    public MultiSelectSetting(String string, Class<E> clazz, E ... EArray) {
        void a;
        void a2;
        Class<E> a3 = clazz;
        MultiSelectSetting a4 = this;
        super((String)a2, ((void)a).length == 0 ? EnumSet.noneOf(a3) : EnumSet.copyOf(List.of(a)));
        MultiSelectSetting class_042 = a4;
        a4.e = 1;
        class_042.f = a3;
        class_042.H = List.of((Enum[])a3.getEnumConstants());
    }

    @Override
    @Generated
    public List<E> d() {
        MultiSelectSetting a;
return a.H;
    }

    @Override
    public MultiSelectSetting<E> L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        MultiSelectSetting a2 = this;
MultiSelectSetting class_042 = a2;
        super.L(a);
        return class_042;
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((MultiSelectSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public MultiSelectSetting<E> L(String string) {
        String a = string;
        MultiSelectSetting a2 = this;
MultiSelectSetting class_042 = a2;
        super.L(a);
        return class_042;
    }
}

