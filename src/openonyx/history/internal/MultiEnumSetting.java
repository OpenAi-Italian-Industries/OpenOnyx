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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
public class MultiEnumSetting<E extends Enum<E>>
extends SettingValue<List<E>> {
    private final Class<E> H;
    private final List<E> e;

    /*
     * WARNING - void declaration
     */
    @SafeVarargs
    public MultiEnumSetting(String string, Class<E> clazz, E ... EArray) {
        void a;
        void a2;
        MultiEnumSetting a3;
        Class<E> a4 = clazz;
        MultiEnumSetting class_050 = a3 = this;
        super((String)a2, List.of(a));
        class_050.H = a4;
        class_050.e = List.of((Enum[])a4.getEnumConstants());
    }

    @Override
    public MultiEnumSetting<E> L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        MultiEnumSetting a2 = this;
MultiEnumSetting class_050 = a2;
        super.L(a);
        return class_050;
    }

    @Override
    public boolean d() {
        MultiEnumSetting a;
return ((List)a.L()).isEmpty();
    }

    @Override
    public Class<E> L() {
        MultiEnumSetting a;
return a.H;
    }

    @Override
    public JsonElement L() {
        Object a;
        MultiEnumSetting class_050 = this;
JsonArray jsonArray = new JsonArray();
        Object object = a = ((List)class_050.L()).iterator();
        while (object.hasNext()) {
            Enum enum_ = (Enum)a.next();
            object = a;
            jsonArray.add(new JsonPrimitive(enum_.name()));
        }
        return jsonArray;
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L((Consumer)a);
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(E e) {
        void a;
        MultiEnumSetting class_050 = this;
ArrayList a2 = new ArrayList((Collection)class_050.L());
        if (!a2.remove(a)) {
            a2.add(a);
        }
        class_050.i(a2);
    }

    /*
     * WARNING - void declaration
     */
    public void L(E e, boolean bl) {
        void a;
        MultiEnumSetting<E> a2 = e;
        MultiEnumSetting a3 = this;
if (a3.L((E)a2) == a) {
            return;
        }
        a3.L((E)a2);
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
        var2_2 = new ArrayList<Enum>();
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
                var4_4 = a.e.iterator();
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

    @Override
    public boolean L(E e) {
        MultiEnumSetting<E> a = e;
        MultiEnumSetting a2 = this;
return ((List)a2.L()).contains(a);
    }

    @Override
    @Generated
    public List<E> d() {
        MultiEnumSetting a;
return a.e;
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L((List)a);
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public MultiEnumSetting<E> L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        MultiEnumSetting a2 = this;
MultiEnumSetting class_050 = a2;
        super.L(a);
        return class_050;
    }

    /*
     * WARNING - void declaration
     */
    public void L(int n, int n2) {
        int a;
        void a22;
        MultiEnumSetting class_050 = this;
ArrayList<Enum> a3 = (List)class_050.L();
        if (a22 < 0 || a22 >= a3.size()) {
            return;
        }
        if ((a = Math.clamp((long)a, 0, a3.size() - 1)) == a22) {
            return;
        }
        a3 = new ArrayList<Enum>(a3);
        Enum a22 = (Enum)a3.remove((int)a22);
        ArrayList<Enum> arrayList = a3;
        arrayList.add(a, a22);
        class_050.i(arrayList);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <O> MultiEnumSetting<E> L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        MultiEnumSetting a3 = this;
MultiEnumSetting class_050 = a3;
        super.L(a, a2);
        return class_050;
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    protected List<E> L(List<E> list) {
        Iterator a;
        MultiEnumSetting class_050 = this;
ArrayList a2 = new ArrayList();
        a = a.iterator();
        while (a.hasNext()) {
            Enum enum_ = (Enum)a.next();
            if (enum_ == null || a2.contains(enum_)) continue;
            a2.add(enum_);
        }
        return List.copyOf(a2);
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((MultiEnumSetting)class_038).L(a);
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((MultiEnumSetting)object).L((String)a);
    }

    @Override
    public MultiEnumSetting<E> L(String string) {
        String a = string;
        MultiEnumSetting a2 = this;
MultiEnumSetting class_050 = a2;
        super.L(a);
        return class_050;
    }

    @Override
    public MultiEnumSetting<E> L(Consumer<List<E>> consumer) {
        Consumer<List<E>> a = consumer;
        MultiEnumSetting a2 = this;
MultiEnumSetting class_050 = a2;
        super.L(a);
        return class_050;
    }
}

