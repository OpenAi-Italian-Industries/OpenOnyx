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
import openonyx.events.EntityRelationUtils;
import openonyx.history.Setting;
import openonyx.history.SettingValue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NumberSetting
extends SettingValue<Double> {
    private String i;
    private final double f;
    private final double H;
    private final double e;

    public NumberSetting d(String string) {
        String a = string;
        NumberSetting a2 = this;
a2.i = a;
        return a2;
    }

    @Override
    protected Double L(Double d) {
        Double a = d;
        NumberSetting a2 = this;
NumberSetting class_052 = a2;
        double d2 = Math.clamp(a, class_052.H, a2.f);
        if (class_052.e <= 0.0) {
            return d2;
        }
        return (double)Math.round(Math.clamp(a2.H + (double)Math.round((d2 - a2.H) / a2.e) * a2.e, a2.H, a2.f) * 1000000.0) / 1000000.0;
    }

    @Generated
    public String I() {
        NumberSetting a;
return a.i;
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public void L(double a) {
        NumberSetting a2;
NumberSetting class_052 = a2;
        class_052.i(class_052.H + Math.clamp(a, 0.0, 1.0) * (a2.f - a2.H));
    }

    /*
     * WARNING - void declaration
     */
    public <O> NumberSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        NumberSetting a3 = this;
NumberSetting class_052 = a3;
        super.L(a, a2);
        return class_052;
    }

    @Generated
    public double i() {
        NumberSetting a;
return a.H;
    }

    @Generated
    public double D() {
        NumberSetting a;
return a.f;
    }

    @Override
    public int d() {
        NumberSetting a;
return (int)Math.round((Double)a.L());
    }

    @Override
    public NumberSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        NumberSetting a2 = this;
NumberSetting class_052 = a2;
        super.L(a);
        return class_052;
    }

    @Override
    public NumberSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        NumberSetting a2 = this;
NumberSetting class_052 = a2;
        super.L(a);
        return class_052;
    }

    public String i() {
        String string;
        NumberSetting a;
StringBuilder stringBuilder = new StringBuilder();
        if (a.d()) {
            string = String.valueOf(a.d());
        } else {
            Object[] objectArray = new Object[1];
            objectArray[0] = a.L();
            string = String.format("%.2f", objectArray);
        }
        return stringBuilder.append(string).append(a.i).toString();
    }

    @Override
    public float L() {
        NumberSetting a;
return ((Double)a.L()).floatValue();
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L((String)a);
    }

    @Override
    public double d() {
        NumberSetting a;
if (a.f == a.H) {
            return 0.0;
        }
        return ((Double)a.L() - a.H) / (a.f - a.H);
    }

    @Override
    public void L(JsonElement jsonElement) {
        JsonElement a = jsonElement;
        NumberSetting a2 = this;
if (!a.isJsonPrimitive() || !a.getAsJsonPrimitive().isNumber()) {
            return;
        }
        a2.i(a.getAsDouble());
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L((Double)a);
    }

    /*
     * WARNING - void declaration
     */
    public NumberSetting(String string, double d, double d2, double d3, double d4) {
        void a;
        void a2;
        void a3;
        void a4;
        NumberSetting a5;
        String a6 = string;
        NumberSetting class_052 = a5 = this;
        NumberSetting class_0522 = a5;
        super(a6, (double)a4);
        a5.i = "";
        class_0522.H = a3;
        class_0522.f = a2;
        class_052.e = a;
        class_052.i(class_052.L((Double)((double)a4)));
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public boolean d() {
        NumberSetting a;
if (a.e >= 1.0 && a.e == Math.floor(a.e)) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L((String)a);
    }

    @Override
    public JsonElement L() {
        NumberSetting a;
return new JsonPrimitive((Number)a.L());
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((NumberSetting)object).L((Consumer)a);
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((NumberSetting)class_038).L(a);
    }

    @Override
    public NumberSetting L(Consumer<Double> consumer) {
        Consumer<Double> a = consumer;
        NumberSetting a2 = this;
NumberSetting class_052 = a2;
        super.L(a);
        return class_052;
    }

    @Override
    public NumberSetting L(String string) {
        String a = string;
        NumberSetting a2 = this;
NumberSetting class_052 = a2;
        super.L(a);
        return class_052;
    }

    @Override
    @Generated
    public double L() {
        NumberSetting a;
return a.e;
    }
}

