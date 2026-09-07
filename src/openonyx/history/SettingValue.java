/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.history.Setting;
import openonyx.history.UndoManager;

public abstract class SettingValue<T>
extends Setting {
    private final T f;
    private T H;
    private Consumer<T> e;

    public SettingValue<T> L(Consumer<T> consumer) {
        Consumer<T> a = consumer;
        SettingValue a2 = this;
a2.e = a;
        return a2;
    }

    public void i(T t) {
        SettingValue<T> a = t;
        SettingValue a2 = this;
a = a2.L((T)a);
        if (a.equals(a2.H)) {
            return;
        }
        SettingValue class_038 = a2;
        T t2 = class_038.H;
        class_038.H = a;
        UndoManager.L(class_038, () -> {
            Object a = t2;
            SettingValue a2 = this;
a2.i(a);
        }, () -> {
            Object a = a;
            SettingValue a2 = this;
a2.i(a);
        });
        a2.e.accept(a);
    }

    @Generated
    public T d() {
        SettingValue a;
return a.f;
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((SettingValue)object).L((BooleanSupplier)a);
    }

    public T L() {
        SettingValue a;
return a.H;
    }

    @Override
    public SettingValue<T> L(String string) {
        String a = string;
        SettingValue a2 = this;
SettingValue class_038 = a2;
        super.L(a);
        return class_038;
    }

    /*
     * WARNING - void declaration
     */
    protected SettingValue(String string, T t) {
        void a2;
        SettingValue<T> a3 = t;
        SettingValue a4 = this;
        super((String)a2);
        a4.e = a -> {
        };
        SettingValue class_038 = a4;
        class_038.f = a3;
        class_038.H = a3;
    }

    /*
     * WARNING - void declaration
     */
    public <O> SettingValue<T> L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        SettingValue a3 = this;
return a3.L(() -> SettingValue.L(a2, (SettingValue)a));
    }

    public SettingValue<T> L(SettingValue<Boolean> class_038) {
        SettingValue<Boolean> a = class_038;
        SettingValue<Boolean> a2 = this;
return a2.L(a::L);
    }

    @Override
    public SettingValue<T> L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        SettingValue a2 = this;
SettingValue class_038 = a2;
        super.L(a);
        return class_038;
    }

    public boolean L() {
        SettingValue a;
SettingValue class_038 = a;
        return class_038.H.equals(class_038.f);
    }

    protected T L(T t) {
        SettingValue<T> a = t;
        SettingValue a2 = this;
return (T)a;
    }

    private static boolean L(Predicate predicate, SettingValue class_038) {
        SettingValue a = class_038;
        Predicate a2 = predicate;
return a2.test(a.L());
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((SettingValue)object).L((String)a);
    }

    public void d() {
        SettingValue a;
SettingValue class_038 = a;
        class_038.i(class_038.f);
    }
}

