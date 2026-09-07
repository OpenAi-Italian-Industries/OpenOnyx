/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lombok.Generated;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.history.ModeOption;
import openonyx.render.internal.RenderSupport_175;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ModeSetting<M extends ModeOption>
extends SettingValue<M> {
    private final List<M> e;

    @Override
    public ModeSetting<M> L(String string) {
        String a = string;
        ModeSetting a2 = this;
ModeSetting class_037 = a2;
        super.L(a);
        return class_037;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <O> ModeSetting<M> L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        ModeSetting a3 = this;
ModeSetting class_037 = a3;
        super.L(a, a2);
        return class_037;
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((ModeSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public ModeSetting<M> L(Consumer<M> consumer) {
        Consumer<M> a = consumer;
        ModeSetting a2 = this;
ModeSetting class_037 = a2;
        super.L(a);
        return class_037;
    }

    @Override
    public M L() {
        ModeSetting a;
return (M)((ModeOption)a.L());
    }

    /*
     * WARNING - void declaration
     */
    public void d(ModeOption class_041) {
        ModeSetting class_037 = this;
for (ModeOption class_0412 : class_037.e) {
            void a;
            if (class_0412 != a) continue;
            class_037.L((M)class_0412);
            return;
        }
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((ModeSetting)object).L((String)a);
    }

    @Override
    public JsonElement L() {
        Object a;
        ModeSetting class_037 = this;
JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mode", ((ModeOption)class_037.L()).L());
        JsonObject jsonObject2 = new JsonObject();
        Object object = a = class_037.e.iterator();
        while (object.hasNext()) {
            ModeOption class_041 = (ModeOption)a.next();
            if (!class_041.I()) {
                object = a;
                continue;
            }
            jsonObject2.add(class_041.L(), class_041.L());
            object = a;
        }
        JsonObject jsonObject3 = jsonObject;
        jsonObject3.add("modes", jsonObject2);
        return jsonObject3;
    }

    @Override
    public ModeSetting<M> L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        ModeSetting a2 = this;
ModeSetting class_037 = a2;
        super.L(a);
        return class_037;
    }

    @Override
    @Generated
    public List<M> d() {
        ModeSetting a;
return a.e;
    }

    @Override
    public List<Setting> L() {
        ModeSetting a;
return List.copyOf(a.e);
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ModeSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((ModeSetting)object).L((Consumer)a);
    }

    @Override
    public boolean L(M m) {
        ModeSetting<M> a = m;
        ModeSetting a2 = this;
if (a2.L() == a) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((ModeSetting)class_038).L(a);
    }

    @Override
    public void L(JsonElement jsonElement) {
        JsonElement jsonElement2;
        JsonObject a;
        ModeSetting class_037 = this;
if (a.isJsonPrimitive() && a.getAsJsonPrimitive().isString()) {
            class_037.L(a.getAsString());
            return;
        }
        if (!a.isJsonObject()) {
            return;
        }
        Object a2 = (a = a.getAsJsonObject()).get("modes");
        if (a2 != null && ((JsonElement)a2).isJsonObject()) {
            jsonElement2 = ((JsonElement)a2).getAsJsonObject();
            a2 = class_037.e.iterator();
            block2: while (true) {
                Iterator<M> iterator = a2;
                while (iterator.hasNext()) {
                    ModeOption class_041 = (ModeOption)a2.next();
                    if (!class_041.I()) {
                        iterator = a2;
                        continue;
                    }
                    JsonElement jsonElement3 = ((JsonObject)jsonElement2).get(class_041.L());
                    if (jsonElement3 == null) continue block2;
                    if (jsonElement3.isJsonNull()) {
                        iterator = a2;
                        continue;
                    }
                    try {
                        class_041.L(jsonElement3);
                    }
                    catch (RuntimeException runtimeException) {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = class_041.d();
                        objectArray[1] = runtimeException;
                        OnyxClient.H.warn("Failed to load mode '{}'", objectArray);
                    }
                    continue block2;
                }
                break;
            }
        }
        if ((jsonElement2 = a.get("mode")) != null && jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isString()) {
            class_037.L(jsonElement2.getAsString());
        }
    }

    @Override
    public void L(String string) {
        String a;
        ModeSetting class_037 = this;
a = ModeSetting.L(a);
        for (ModeOption class_041 : class_037.e) {
            if (!ModeSetting.L(class_041.L()).equals(a)) continue;
            class_037.L((M)class_041);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(boolean bl) {
        Object a;
        ModeSetting class_037 = this;
Object object = a = class_037.e.iterator();
        while (object.hasNext()) {
            void a2;
            ModeOption class_041 = (ModeOption)a.next();
            class_041.L((a2 != false && class_041 == class_037.L() ? 1 : 0) != 0);
            object = a;
        }
    }

    @Override
    public ModeSetting<M> L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        ModeSetting a2 = this;
ModeSetting class_037 = a2;
        super.L(a);
        return class_037;
    }

    @Override
    public void i(Object object) {
        Object a = object;
        object = this;
((ModeSetting)object).L((M)((ModeOption)a));
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((ModeSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(Module class_227, Setting class_031) {
        void a;
        Object a2 = class_031;
        ModeSetting a3 = this;
ModeSetting class_037 = a3;
        super.L((Module)a, (Setting)a2);
        Object object = a2 = class_037.e.iterator();
        while (object.hasNext()) {
            ModeOption class_041 = (ModeOption)a2.next();
            object = a2;
            ModeOption class_0412 = class_041;
            class_0412.L(a3);
            class_0412.L((Module)a, a3);
        }
    }

    /*
     * WARNING - void declaration
     */
    @SafeVarargs
    public ModeSetting(String string, M m, M ... MArray) {
        void a;
        void a2;
        ModeSetting a3;
        ModeSetting<M> a4 = m;
        ModeSetting class_037 = a3 = this;
        super((String)a2, a4);
        class_037.e = List.of(a);
        if (!class_037.e.contains(a4)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Default mode '").append(((Setting)a4).L()).append("' is not part of '").append((String)a2).append("'").toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(M m) {
        void a;
        ModeSetting class_037 = this;
Setting a2 = (ModeOption)class_037.L();
        ModeSetting class_0372 = class_037;
        super.i(a);
        if (class_0372.L() != a2) {
            class_037.L();
        }
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ModeSetting)object).L((BooleanSupplier)a);
    }

    private static String L(String string) {
        int a;
        String string2 = string;
if (string2 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        int n = 0;
        while (n < string2.length()) {
            char c = string2.charAt(0);
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            }
            n = ++a;
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean L(String string) {
        String a = string;
        ModeSetting a2 = this;
return ((ModeOption)a2.L()).L().equals(a);
    }
}

