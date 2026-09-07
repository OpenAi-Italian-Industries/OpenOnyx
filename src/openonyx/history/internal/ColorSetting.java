/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.interaction.internal.PlacementResult;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_061;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.UtilitySupport_476;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ColorSetting
extends SettingValue<Integer> {
    private boolean d;
    private IntSupplier i;
    private boolean f;
    private boolean H;
    private boolean e;

    public ColorSetting D() {
        ColorSetting a;
ColorSetting class_048 = a;
        class_048.H = 1;
        class_048.d(--1 != 0);
        return class_048;
    }

    @Override
    public ColorSetting L(String string) {
        String a = string;
        ColorSetting a2 = this;
ColorSetting class_048 = a2;
        super.L(a);
        return class_048;
    }

    @Generated
    public boolean h() {
        ColorSetting a;
return a.f;
    }

    @Override
    public ColorSetting d() {
        ColorSetting a;
a.f = 0;
        a.e = 0;
        return a;
    }

    @Override
    public ColorSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        ColorSetting a2 = this;
ColorSetting class_048 = a2;
        super.L(a);
        return class_048;
    }

    @Override
    public JsonElement L() {
        Object a;
        ColorSetting class_048 = this;
if (!class_048.f) {
            return new JsonPrimitive(class_048.d());
        }
        Object object = a = new JsonObject();
        ((JsonObject)object).addProperty("value", class_048.d());
        ((JsonObject)object).addProperty("accent", class_048.e);
        return object;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((ColorSetting)class_038).L(a);
    }

    public int h() {
        ColorSetting a;
return a.L() | 0xFF000000;
    }

    @Override
    public void d() {
        ColorSetting a;
ColorSetting class_048 = a;
        super.d();
        class_048.d(class_048.H);
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((ColorSetting)object).L((Consumer)a);
    }

    /*
     * WARNING - void declaration
     */
    public ColorSetting(String string, int n) {
        void a;
        void a2;
        void a3;
        int n2 = n;
        ColorSetting class_048 = this;
        super((String)a2, 0);
        a3.f = 1;
        a3.i = () -> {
return ThemeSupport_059.L().E();
        };
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ColorSetting)object).L((BooleanSupplier)a);
    }

    public int I() {
        ColorSetting a;
return (Integer)super.L() | 0xFF000000;
    }

    @Override
    public ColorSetting L(Consumer<Integer> consumer) {
        Consumer<Integer> a = consumer;
        ColorSetting a2 = this;
ColorSetting class_048 = a2;
        super.L(a);
        return class_048;
    }

    public int D() {
        ColorSetting a;
return ThemeSupport_064.d(a.L());
    }

    @Override
    public Integer L() {
        int a;
        ColorSetting class_048 = this;
if (!class_048.e) {
            return (Integer)super.L();
        }
        ColorSetting class_0482 = class_048;
        int n = a = class_0482.i.getAsInt();
        return class_0482.d ? ThemeSupport_064.L(n, ThemeSupport_064.d((Integer)super.L())) : n | 0xFF000000;
    }

    public String i() {
        ColorSetting a;
if (a.d) {
            Object[] objectArray = new Object[1];
            objectArray[0] = a.L();
            return String.format("#%08X", objectArray);
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = a.L() & 0xFFFFFF;
        return String.format("#%06X", objectArray);
    }

    @Override
    public ColorSetting L(IntSupplier intSupplier) {
        IntSupplier a = intSupplier;
        ColorSetting a2 = this;
a2.i = a;
        return a2;
    }

    @Override
    public float[] L() {
        ColorSetting a;
return ThemeSupport_064.L(a.L());
    }

    public void d(boolean bl) {
        boolean a = bl;
        ColorSetting a2 = this;
if (!a2.f) {
            return;
        }
        a2.e = a;
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((ColorSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public void L(JsonElement jsonElement) {
        Object a = jsonElement;
        ColorSetting a2 = this;
if (((JsonElement)a).isJsonPrimitive() && ((JsonElement)a).getAsJsonPrimitive().isNumber()) {
            ColorSetting class_048 = a2;
            class_048.i(((JsonElement)a).getAsInt());
            class_048.d(0 != 0);
            return;
        }
        if (!((JsonElement)a).isJsonObject()) {
            return;
        }
        JsonObject jsonObject = ((JsonElement)a).getAsJsonObject();
        a = jsonObject.get("value");
        JsonElement jsonElement2 = jsonObject.get("accent");
        if (a != null && ((JsonElement)a).isJsonPrimitive() && ((JsonElement)a).getAsJsonPrimitive().isNumber()) {
            a2.i(((JsonElement)a).getAsInt());
        }
        if (jsonElement2 != null && jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isBoolean()) {
            a2.d(jsonElement2.getAsBoolean());
        }
    }

    @Override
    public ColorSetting L(double a) {
        ColorSetting a2;
ColorSetting class_048 = a2;
        return class_048.L(() -> {
ThemeSupport_061 class_061 = ThemeSupport_061.L(class_048.i.getAsInt());
            return class_061.L(ThemeSupport_064.D(class_061.D() + a)).L();
        });
    }

    @Override
    public Object L() {
        ColorSetting a;
return a.L();
    }

    @Generated
    public boolean D() {
        ColorSetting a;
return a.d;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        ColorSetting a5 = this;
a5.i(ThemeSupport_064.L((float)a4, (float)a3, (float)a2, 0));
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((ColorSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    public <O> ColorSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        ColorSetting a3 = this;
ColorSetting class_048 = a3;
        super.L(a, a2);
        return class_048;
    }

    @Override
    public ColorSetting L() {
        ColorSetting a;
a.d = 1;
        return a;
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ColorSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public int d() {
        ColorSetting a;
return (Integer)super.L();
    }

    @Override
    public ColorSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        ColorSetting a2 = this;
ColorSetting class_048 = a2;
        super.L(a);
        return class_048;
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((ColorSetting)object).L((String)a);
    }

    @Override
    @Generated
    public boolean d() {
        ColorSetting a;
return a.e;
    }
}

