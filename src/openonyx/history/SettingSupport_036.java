/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.utilities.UtilityListener_485;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SettingSupport_036
extends Setting
implements UtilityListener_485 {
    private boolean f;
    private final BooleanSetting H;
    private final List<Setting> e;

    public boolean D() {
        SettingSupport_036 a;
return a.H == null || (Boolean)a.H.L() != false;
    }

    /*
     * WARNING - void declaration
     */
    protected SettingSupport_036(String string, boolean bl2) {
        void a;
        SettingSupport_036 a2;
        boolean a3 = bl2;
        SettingSupport_036 class_036 = a2 = this;
        super((String)a);
        SettingSupport_036 class_0362 = a2;
        class_036.e = new ArrayList<Setting>();
        class_0362.H = new BooleanSetting("Enabled", a3);
        class_036.H.L(bl -> {
            Boolean a = bl;
            SettingSupport_036 a2 = this;
a2.L();
        });
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((SettingSupport_036)object).L((BooleanSupplier)a);
    }

    protected SettingSupport_036(String string) {
        String a = string;
        SettingSupport_036 a2 = this;
        super(a);
        SettingSupport_036 class_036 = a2;
        a2.e = new ArrayList<Setting>();
        a2.H = null;
    }

    protected void D() {
}

    /*
     * WARNING - void declaration
     */
    private void L(Object object, Class<?> clazz) {
        void a;
        void a2;
        Class<?> clazz2;
        SettingSupport_036 class_036 = this;
Class<?> clazz3 = clazz2 = a2.getClass();
        while (clazz3 != null && clazz2 != a) {
            Field[] fieldArray = clazz2.getDeclaredFields();
            int n = fieldArray.length;
            int n2 = 0;
            while (n2 < n) {
                int n3;
                Field a3 = fieldArray[n3];
                if (Setting.class.isAssignableFrom(a3.getType()) && !Modifier.isStatic(a3.getModifiers()) && !Modifier.isTransient(a3.getModifiers())) {
                    try {
                        a3.setAccessible(3 >> 1);
                        Object object2 = a3.get(a2);
                        if (object2 != null) {
                            class_036.e.add((Setting)object2);
                        }
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = a3.getName();
                        objectArray[1] = illegalAccessException;
                        OnyxClient.H.error("Failed to read setting field '{}'", objectArray);
                    }
                }
                n2 = ++n3;
            }
            clazz3 = clazz2.getSuperclass();
        }
    }

    @Override
    public void L(JsonElement jsonElement) {
        Iterator<Setting> iterator;
        Object a = jsonElement;
        SettingSupport_036 a2 = this;
if (a2.H != null && ((JsonElement)a).isJsonPrimitive() && ((JsonElement)a).getAsJsonPrimitive().isBoolean()) {
            a2.H.L((JsonElement)a);
            return;
        }
        if (!((JsonElement)a).isJsonObject()) {
            return;
        }
        a = ((JsonElement)a).getAsJsonObject();
        if (a2.H != null) {
            SettingSupport_036.L(a2.H, (JsonObject)a);
        }
        Iterator<Setting> iterator2 = iterator = a2.e.iterator();
        while (iterator2.hasNext()) {
            SettingSupport_036.L(iterator.next(), (JsonObject)a);
            iterator2 = iterator;
        }
    }

    @Override
    public SettingSupport_036 L(String string) {
        String a = string;
        SettingSupport_036 a2 = this;
SettingSupport_036 class_036 = a2;
        super.L(a);
        return class_036;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void L(boolean var1_2) {
        a = var1_2;
        a = this;
v0 = a = a != 0 && a.D() != false ? 4 ^ 5 : 0;
        if (a == a.f) ** GOTO lbl15
        a.f = a;
        if (a.f) {
            OnyxClient.d.subscribe((Object)a);
            v1 = a;
            v2 = v1;
            v1.D();
        } else {
            OnyxClient.d.unsubscribe((Object)a);
            a.d();
lbl15:
            // 2 sources

            v2 = a;
        }
        v3 = var2_4 = v2.e.iterator();
        while (v3.hasNext()) {
            var2_4.next().L((boolean)a);
            v3 = var2_4;
        }
    }

    @Override
    @Generated
    public BooleanSetting L() {
        SettingSupport_036 a;
return a.H;
    }

    protected void d() {
}

    @Override
    public SettingSupport_036 L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        SettingSupport_036 a2 = this;
SettingSupport_036 class_036 = a2;
        super.L(a);
        return class_036;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((SettingSupport_036)object).L((String)a);
    }

    @Override
    public JsonElement L() {
        Object a;
        SettingSupport_036 class_036 = this;
JsonObject jsonObject = new JsonObject();
        if (class_036.H != null) {
            jsonObject.add((String)class_036.H.L(), class_036.H.L());
        }
        Object object = a = class_036.e.iterator();
        while (object.hasNext()) {
            Setting class_031 = (Setting)a.next();
            if (!class_031.I()) {
                object = a;
                continue;
            }
            jsonObject.add(class_031.L(), class_031.L());
            object = a;
        }
        return jsonObject;
    }

    @Override
    @Generated
    public List<Setting> L() {
        SettingSupport_036 a;
return a.e;
    }

    public List<Setting> d() {
        SettingSupport_036 a;
return a.e.stream().filter(Setting::i).toList();
    }

    public boolean d() {
        SettingSupport_036 a;
if (a.H != null) {
            return 1 != 0;
        }
        return false;
    }

    @Override
    public boolean L() {
        SettingSupport_036 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(Setting class_031, JsonObject jsonObject) {
        void a;
        Setting class_0312 = class_031;
if (!class_0312.I()) {
            return;
        }
        Object a2 = a.get(class_0312.L());
        if (a2 != null && !((JsonElement)a2).isJsonNull()) {
            try {
                class_0312.L((JsonElement)a2);
                return;
            }
            catch (RuntimeException runtimeException) {
                Object[] objectArray = new Object[2];
                objectArray[0] = class_0312.d();
                objectArray[1] = runtimeException;
                OnyxClient.H.warn("Failed to load setting '{}'", objectArray);
                return;
            }
        }
        if (class_0312 instanceof SettingSupport_036) {
            SettingSupport_036 class_036 = (SettingSupport_036)class_0312;
            if (class_036.L() != null) {
                SettingSupport_036.L(class_036.L(), (JsonObject)a);
            }
            Iterator<Setting> iterator = a2 = class_036.L().iterator();
            while (iterator.hasNext()) {
                SettingSupport_036.L(a2.next(), (JsonObject)a);
                iterator = a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(Module class_227, Setting class_031) {
        Iterator<Setting> iterator;
        HashSet<String> a;
        void a2;
        SettingSupport_036 class_036 = this;
SettingSupport_036 class_0362 = class_036;
        super.L((Module)a2, (Setting)((Object)a));
        if (class_0362.H != null) {
            class_036.H.L((Module)a2, class_036);
        }
        SettingSupport_036 class_0363 = class_036;
        SettingSupport_036 class_0364 = class_036;
        class_0364.e.clear();
        class_0364.L(class_0363, SettingSupport_036.class);
        class_0363.e.sort(Comparator.comparingInt(Setting::L));
        a = new HashSet<String>();
        Iterator<Setting> iterator2 = iterator = class_036.e.iterator();
        while (iterator2.hasNext()) {
            Setting a3 = iterator.next();
            if (!a.add(a3.L())) {
                Object[] objectArray = new Object[2];
                objectArray[0] = a3.L();
                objectArray[1] = class_036.d();
                OnyxClient.H.warn("Duplicate setting name '{}' in group '{}'", objectArray);
            }
            a3.L((Module)a2, class_036);
            iterator2 = iterator;
        }
    }
}

