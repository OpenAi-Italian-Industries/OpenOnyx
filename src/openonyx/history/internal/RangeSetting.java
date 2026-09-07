/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.history.Setting;
import openonyx.history.Range;
import openonyx.history.SettingValue;
import openonyx.input.InputSupport_003;
import openonyx.interaction.internal.PlacementResult;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RangeSetting
extends SettingValue<Range> {
    private final double i;
    private final double f;
    private final double H;
    private String e;

    /*
     * WARNING - void declaration
     */
    public static RangeSetting L(String string, int n, int n2, int n3, int n4) {
        void a;
        void a2;
        void a3;
        void a4;
        int n5 = n4;
        String a5 = string;
return new RangeSetting(a5, (double)a4, (double)a3, (double)a2, 0.0, 1.0);
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((RangeSetting)class_038).L(a);
    }

    public float D() {
        RangeSetting a;
return (float)((Range)a.L()).D();
    }

    public double h() {
        RangeSetting a;
return ((Range)a.L()).L();
    }

    @Override
    protected Range L(Range class_033) {
        Range a = class_033;
        RangeSetting a2 = this;
return new Range(a2.d(a.L()), a2.d(a.D()));
    }

    /*
     * WARNING - void declaration
     */
    public <O> RangeSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        RangeSetting a3 = this;
RangeSetting class_045 = a3;
        super.L(a, a2);
        return class_045;
    }

    @Generated
    public double I() {
        RangeSetting a;
return a.f;
    }

    public RangeSetting d(String string) {
        String a = string;
        RangeSetting a2 = this;
RangeSetting class_045 = a2;
        super.L(a);
        return class_045;
    }

    @Override
    public float d() {
        RangeSetting a;
return (float)((Range)a.L()).L();
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public RangeSetting L(String string) {
        String a = string;
        RangeSetting a2 = this;
a2.e = a;
        return a2;
    }

    public int i() {
        RangeSetting class_045 = this;
Range class_033 = (Range)class_045.L();
        int a = (int)Math.round(class_033.L());
        int n = (int)Math.round(class_033.D());
        if (n <= 0) {
            return 0;
        }
        return ThreadLocalRandom.current().nextInt(0, n + 1);
    }

    public String I() {
        StringBuilder stringBuilder;
        RangeSetting class_045 = this;
if (class_045.d()) {
            if (class_045.d() == class_045.D()) {
                return class_045.d() + class_045.e;
            }
            return class_045.d() + class_045.e + " - " + class_045.D() + class_045.e;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = class_045.h();
        String a = String.format("%.2f", objectArray);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = class_045.d();
        String string = String.format("%.2f", objectArray2);
        if (a.equals(string)) {
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(0, a).append(class_045.e).toString();
        }
        stringBuilder = new StringBuilder();
        return stringBuilder.insert(0, a).append(class_045.e).append(" - ").append(string).append(class_045.e).toString();
    }

    public double D(double a) {
        RangeSetting a2;
RangeSetting class_045 = a2;
        return class_045.d(class_045.i + Math.clamp(a, 0.0, 1.0) * (a2.f - a2.i));
    }

    @Override
    public RangeSetting L(Consumer<Range> consumer) {
        Consumer<Range> a = consumer;
        RangeSetting a2 = this;
RangeSetting class_045 = a2;
        super.L(a);
        return class_045;
    }

    public void d(double a) {
        RangeSetting a2;
RangeSetting class_045 = a2;
        RangeSetting class_0452 = a2;
        class_0452.i(new Range(class_0452.h(), Math.max(a2.d(a), a2.h())));
    }

    public int D() {
        RangeSetting a;
return (int)Math.round(((Range)a.L()).D());
    }

    @Override
    public void L(double a) {
        RangeSetting a2;
RangeSetting class_045 = a2;
        RangeSetting class_0452 = a2;
        class_0452.i(new Range(Math.min(class_0452.d(a), a2.d()), a2.d()));
    }

    @Override
    public void L(JsonElement jsonElement) {
        Object a = jsonElement;
        RangeSetting a2 = this;
if (!((JsonElement)a).isJsonObject()) {
            return;
        }
        JsonObject jsonObject = ((JsonElement)a).getAsJsonObject();
        a = jsonObject.get("min");
        JsonElement jsonElement2 = jsonObject.get("max");
        if (a == null || jsonElement2 == null || !((JsonElement)a).isJsonPrimitive() || !jsonElement2.isJsonPrimitive()) {
            return;
        }
        if (!((JsonElement)a).getAsJsonPrimitive().isNumber() || !jsonElement2.getAsJsonPrimitive().isNumber()) {
            return;
        }
        a2.i(new Range(((JsonElement)a).getAsDouble(), jsonElement2.getAsDouble()));
    }

    @Override
    public int d() {
        RangeSetting a;
return (int)Math.round(((Range)a.L()).L());
    }

    private double d(double a) {
        RangeSetting a2;
a = Math.clamp(a, a2.i, a2.f);
        if (a2.H <= 0.0) {
            return a;
        }
        return (double)Math.round(Math.clamp(a2.i + (double)Math.round((a - a2.i) / a2.H) * a2.H, a2.i, a2.f) * 1000000.0) / 1000000.0;
    }

    @Override
    public JsonElement L() {
        Object a;
        RangeSetting class_045 = this;
Object object = a = new JsonObject();
        ((JsonObject)object).addProperty("min", class_045.h());
        ((JsonObject)object).addProperty("max", class_045.d());
        return object;
    }

    @Override
    public float L() {
        RangeSetting a;
return (float)a.D();
    }

    public static RangeSetting L(String a, double a2, double a3, double a4, double a5) {
return new RangeSetting(a, a2, a3, a4, a5, 0.01);
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).L((Consumer)a);
    }

    @Generated
    public double i() {
        RangeSetting a;
return a.i;
    }

    @Override
    public RangeSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        RangeSetting a2 = this;
RangeSetting class_045 = a2;
        super.L(a);
        return class_045;
    }

    public double D() {
        Range class_033;
        RangeSetting class_045 = this;
Range a = (Range)class_045.L();
        if (class_033.d() <= 0.0) {
            return a.L();
        }
        return ThreadLocalRandom.current().nextDouble(a.L(), a.D());
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).L(class_038, (Predicate)a);
    }

    /*
     * WARNING - void declaration
     */
    public RangeSetting(String string, double d, double d2, double d3, double d4, double d5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        RangeSetting a6;
        String a7 = string;
        RangeSetting class_045 = a6 = this;
        RangeSetting class_0452 = a6;
        RangeSetting class_0453 = a6;
        super(a7, new Range((double)a5, (double)a4));
        class_0453.e = "";
        class_0453.i = a3;
        class_0452.f = a2;
        class_0452.H = a;
        class_045.i(class_045.L((Range)class_045.L()));
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).d((String)a);
    }

    @Generated
    public String i() {
        RangeSetting a;
return a.e;
    }

    @Override
    public RangeSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        RangeSetting a2 = this;
RangeSetting class_045 = a2;
        super.L(a);
        return class_045;
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).d((String)a);
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).L((Range)a);
    }

    @Override
    public double d() {
        RangeSetting a;
return ((Range)a.L()).D();
    }

    @Override
    public boolean d() {
        RangeSetting a;
if (a.H >= 1.0 && a.H == Math.floor(a.H)) {
            return 1 != 0;
        }
        return false;
    }

    @Override
    @Generated
    public double L() {
        RangeSetting a;
return a.H;
    }

    @Override
    public double L(double a) {
        RangeSetting a2;
if (a2.f == a2.i) {
            return 0.0;
        }
        return (a - a2.i) / (a2.f - a2.i);
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((RangeSetting)object).L((BooleanSupplier)a);
    }
}

