/*
 * Decompiled with CFR.
 */
package openonyx.history.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.item.ItemStack;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.utilities.UtilitySupport_505;

public class ItemMappingSetting
extends SettingValue<Map<Integer, List<UtilitySupport_505>>> {
    final public static int e = 9;

    public void D() {
        ItemMappingSetting a;
a.i(new LinkedHashMap());
    }

    @Override
    public ItemMappingSetting L(String string) {
        String a = string;
        ItemMappingSetting a2 = this;
ItemMappingSetting class_049 = a2;
        super.L(a);
        return class_049;
    }

    /*
     * WARNING - void declaration
     */
    public void d(int n, UtilitySupport_505 class_505) {
        void a;
        void a2;
        ItemMappingSetting class_049 = this;
if (a2 == null || !class_049.L((int)a).contains(a2)) {
            return;
        }
        Map<Integer, List<UtilitySupport_505>> a3 = class_049.L();
        List<UtilitySupport_505> list = a3.get((int)a);
        if (list == null) {
            return;
        }
        List<UtilitySupport_505> list2 = list;
        list2.remove(a2);
        if (list2.isEmpty()) {
            a3.remove((int)a);
        }
        class_049.i(a3);
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L((Map)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(int n) {
        void a;
        ItemMappingSetting class_049 = this;
if (class_049.L((int)a).isEmpty()) {
            return;
        }
        Map<Integer, List<UtilitySupport_505>> a2 = class_049.L();
        a2.remove((int)a);
        class_049.i(a2);
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L(class_038, (Predicate)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int L(ItemStack itemStack) {
        int a;
        ItemMappingSetting class_049 = this;
int n = -1;
        int n2 = 0;
        while (n2 < 9) {
            Iterator<UtilitySupport_505> iterator = class_049.L(0).iterator();
            block1: while (true) {
                Iterator<UtilitySupport_505> iterator2 = iterator;
                while (iterator2.hasNext()) {
                    void a2;
                    UtilitySupport_505 class_505 = iterator.next();
                    if (!class_505.L((ItemStack)a2)) {
                        iterator2 = iterator;
                        continue;
                    }
                    if (class_505.L()) {
                        return 0;
                    }
                    if (n >= 0) continue block1;
                    n = 0;
                    continue block1;
                }
                break;
            }
            n2 = ++a;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(int n, ItemStack itemStack) {
        int a22 = n;
        ItemMappingSetting a = this;
Iterator<UtilitySupport_505> a22 = a.L(0).iterator();
        while (a22.hasNext()) {
            void a3;
            if (!a22.next().L((ItemStack)a3)) continue;
            return 1 != 0;
        }
        return false;
    }

    @Override
    private Map<Integer, List<UtilitySupport_505>> L() {
        Iterator iterator;
        ItemMappingSetting class_049 = this;
LinkedHashMap<Integer, List<UtilitySupport_505>> linkedHashMap = new LinkedHashMap<Integer, List<UtilitySupport_505>>();
        Iterator iterator2 = iterator = ((Map)class_049.L()).entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry a = iterator.next();
            linkedHashMap.put((Integer)a.getKey(), new ArrayList((Collection)a.getValue()));
            iterator2 = iterator;
        }
        return linkedHashMap;
    }

    @Override
    public ItemMappingSetting L(Consumer<Map<Integer, List<UtilitySupport_505>>> consumer) {
        Consumer<Map<Integer, List<UtilitySupport_505>>> a = consumer;
        ItemMappingSetting a2 = this;
ItemMappingSetting class_049 = a2;
        super.L(a);
        return class_049;
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L((BooleanSupplier)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected Map<Integer, List<UtilitySupport_505>> L(Map<Integer, List<UtilitySupport_505>> map) {
        int n;
        void a;
        ItemMappingSetting class_049 = this;
LinkedHashMap<Integer, List<UtilitySupport_505>> linkedHashMap = new LinkedHashMap<Integer, List<UtilitySupport_505>>();
        if (a == null) {
            return linkedHashMap;
        }
        int n2 = 0;
        while (n2 < 9) {
            Object a2 = (List)a.get(0);
            if (a2 != null) {
                ArrayList<UtilitySupport_505> arrayList = new ArrayList<UtilitySupport_505>();
                a2 = a2.iterator();
                while (a2.hasNext()) {
                    UtilitySupport_505 class_505 = (UtilitySupport_505)a2.next();
                    if (class_505 == null || arrayList.contains(class_505)) continue;
                    arrayList.add(class_505);
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(0, arrayList);
                }
            }
            n2 = ++n;
        }
        return linkedHashMap;
    }

    @Override
    public List<UtilitySupport_505> L(int n) {
        int a22 = n;
        ItemMappingSetting a = this;
List a22 = (List)((Map)a.L()).get(0);
        if (a22 == null) {
            return List.of();
        }
        return a22;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L((String)a);
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(int n, UtilitySupport_505 class_505) {
        void a2;
        int a3 = n;
        ItemMappingSetting a4 = this;
if (a2 == null || a3 < 0 || a3 >= 9) {
            return;
        }
        if (a4.L(a3).contains(a2)) {
            return;
        }
        Map<Integer, List<UtilitySupport_505>> map = a4.L();
        map.computeIfAbsent(a3, a -> {
return new ArrayList();
        }).add(a2);
        a4.i(map);
    }

    @Override
    public void L(JsonElement jsonElement) {
        Iterator<Map.Entry<String, JsonElement>> a;
        ItemMappingSetting class_049 = this;
if (!((JsonElement)((Object)a)).isJsonObject()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = ((JsonElement)((Object)a)).getAsJsonObject().entrySet().iterator();
        block2: while (true) {
            Iterator<Map.Entry<String, JsonElement>> iterator = a;
            while (iterator.hasNext()) {
                int n;
                Iterator<JsonElement> a2 = a.next();
                try {
                    n = Integer.parseInt((String)a2.getKey());
                }
                catch (NumberFormatException numberFormatException) {
                    iterator = a;
                    continue;
                }
                if (0 < 0 || 0 >= 9) continue block2;
                if (!((JsonElement)a2.getValue()).isJsonArray()) {
                    iterator = a;
                    continue;
                }
                ArrayList<Object> arrayList = new ArrayList<Object>();
                a2 = ((JsonElement)a2.getValue()).getAsJsonArray().iterator();
                block4: while (true) {
                    Iterator<JsonElement> iterator2 = a2;
                    while (iterator2.hasNext()) {
                        Object object = a2.next();
                        if (!((JsonElement)object).isJsonPrimitive()) continue block4;
                        if (!((JsonElement)object).getAsJsonPrimitive().isString()) {
                            iterator2 = a2;
                            continue;
                        }
                        if ((object = UtilitySupport_505.d(((JsonElement)object).getAsString())) == null || arrayList.contains(object)) continue block4;
                        arrayList.add(object);
                        continue block4;
                    }
                    break;
                }
                if (arrayList.isEmpty()) continue block2;
                linkedHashMap.put(0, arrayList);
                continue block2;
            }
            break;
        }
        class_049.i(linkedHashMap);
    }

    @Override
    public boolean d() {
        ItemMappingSetting a;
return ((Map)a.L()).isEmpty();
    }

    public static Map<Integer, List<UtilitySupport_505>> L(Object ... objectArray) {
        int n;
        Object[] objectArray2 = objectArray;
LinkedHashMap<Integer, List<UtilitySupport_505>> linkedHashMap = new LinkedHashMap<Integer, List<UtilitySupport_505>>();
        int n2 = 0;
        while (n2 + 1 < objectArray2.length) {
            int a2 = (Integer)objectArray2[0];
            UtilitySupport_505 class_505 = UtilitySupport_505.d(String.valueOf(objectArray2[1]));
            if (class_505 != null && a2 >= 0 && a2 < 9) {
                linkedHashMap.computeIfAbsent(a2, a -> {
return new ArrayList();
                }).add(class_505);
            }
            n2 = n += 2;
        }
        return linkedHashMap;
    }

    @Override
    public ItemMappingSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        ItemMappingSetting a2 = this;
ItemMappingSetting class_049 = a2;
        super.L(a);
        return class_049;
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L((BooleanSupplier)a);
    }

    /*
     * WARNING - void declaration
     */
    public <O> ItemMappingSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        ItemMappingSetting a3 = this;
ItemMappingSetting class_049 = a3;
        super.L(a, a2);
        return class_049;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((ItemMappingSetting)class_038).L(a);
    }

    @Override
    public ItemMappingSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        ItemMappingSetting a2 = this;
ItemMappingSetting class_049 = a2;
        super.L(a);
        return class_049;
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((ItemMappingSetting)object).L((Consumer)a);
    }

    /*
     * WARNING - void declaration
     */
    public ItemMappingSetting(String string, Map<Integer, List<UtilitySupport_505>> map) {
        void a;
        Map<Integer, List<UtilitySupport_505>> a2 = map;
        ItemMappingSetting a3 = this;
        super((String)a, a2);
    }

    @Override
    public JsonElement L() {
        int n;
        ItemMappingSetting class_049 = this;
JsonObject jsonObject = new JsonObject();
        int n2 = 0;
        while (n2 < 9) {
            Object a = class_049.L(0);
            if (!a.isEmpty()) {
                JsonArray jsonArray = new JsonArray();
                Iterator iterator = a = a.iterator();
                while (iterator.hasNext()) {
                    UtilitySupport_505 class_505 = (UtilitySupport_505)a.next();
                    iterator = a;
                    jsonArray.add(new JsonPrimitive(class_505.L()));
                }
                jsonObject.add(String.valueOf(0), jsonArray);
            }
            n2 = ++n;
        }
        return jsonObject;
    }

    /*
     * WARNING - void declaration
     */
    public void L(int n, int n2, UtilitySupport_505 class_505) {
        void a2;
        void a3;
        int a4 = n;
        ItemMappingSetting a5 = this;
if (a3 == null || a4 == a2 || a2 < 0 || a2 >= 9) {
            return;
        }
        if (!a5.L(a4).contains(a3)) {
            return;
        }
        Map<Integer, List<UtilitySupport_505>> map = a5.L();
        List<UtilitySupport_505> list = map.get(a4);
        if (list != null) {
            List<UtilitySupport_505> list2 = list;
            list2.remove(a3);
            if (list2.isEmpty()) {
                map.remove(a4);
            }
        }
        if (!(a4 = map.computeIfAbsent((int)a2, a -> {
return new ArrayList();
        })).contains(a3)) {
            a4.add(a3);
        }
        a5.i(map);
    }
}

