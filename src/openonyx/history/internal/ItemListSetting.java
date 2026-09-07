/*
 * Decompiled with CFR.
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
import net.minecraft.item.ItemStack;
import openonyx.history.Setting;
import openonyx.history.SettingValue;
import openonyx.utilities.UtilitySupport_505;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ItemListSetting
extends SettingValue<List<UtilitySupport_505>> {
    @Override
    public ItemListSetting L(String string) {
        String a = string;
        ItemListSetting a2 = this;
ItemListSetting class_047 = a2;
        super.L(a);
        return class_047;
    }

    public void D(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        ItemListSetting a2 = this;
ItemListSetting class_047 = a2;
        if (a2.L(a)) {
            class_047.L(a);
            return;
        }
        class_047.d(a);
    }

    @Override
    public ItemListSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        ItemListSetting a2 = this;
ItemListSetting class_047 = a2;
        super.L(a);
        return class_047;
    }

    /*
     * WARNING - void declaration
     */
    public ItemListSetting(String string, String ... stringArray) {
        void a;
        String[] a2 = stringArray;
        String[] a3 = this;
        super((String)a, ItemListSetting.L(a2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(ItemStack itemStack) {
        ItemListSetting class_047 = this;
Iterator a = ((List)class_047.L()).iterator();
        while (a.hasNext()) {
            void a2;
            if (!((UtilitySupport_505)a.next()).L((ItemStack)a2)) continue;
            return 1 != 0;
        }
        return false;
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((ItemListSetting)class_038).L(a);
    }

    public void d(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        ItemListSetting a2 = this;
if (a == null || a2.L(a)) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>((Collection)a2.L());
        arrayList.add(a);
        a2.i(arrayList);
    }

    private static List<UtilitySupport_505> L(String ... stringArray) {
        int n;
        String[] stringArray2 = stringArray;
ArrayList a = new ArrayList();
        String[] stringArray3 = stringArray2;
        int n2 = stringArray2.length;
        int n3 = 0;
        while (n3 < n2) {
            UtilitySupport_505 class_505 = UtilitySupport_505.d(stringArray3[0]);
            if (class_505 != null && !a.contains(class_505)) {
                a.add(class_505);
            }
            n3 = ++n;
        }
        return a;
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public ItemListSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        ItemListSetting a2 = this;
ItemListSetting class_047 = a2;
        super.L(a);
        return class_047;
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L(class_038, (Predicate)a);
    }

    @Override
    public ItemListSetting L(Consumer<List<UtilitySupport_505>> consumer) {
        Consumer<List<UtilitySupport_505>> a = consumer;
        ItemListSetting a2 = this;
ItemListSetting class_047 = a2;
        super.L(a);
        return class_047;
    }

    @Override
    public JsonElement L() {
        Object a;
        ItemListSetting class_047 = this;
JsonArray jsonArray = new JsonArray();
        Object object = a = ((List)class_047.L()).iterator();
        while (object.hasNext()) {
            UtilitySupport_505 class_505 = (UtilitySupport_505)a.next();
            object = a;
            jsonArray.add(new JsonPrimitive(class_505.L()));
        }
        return jsonArray;
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L((List)a);
    }

    @Override
    protected List<UtilitySupport_505> L(List<UtilitySupport_505> list) {
        Iterator a;
        ItemListSetting class_047 = this;
ArrayList a2 = new ArrayList();
        if (a == null) {
            return a2;
        }
        a = a.iterator();
        while (a.hasNext()) {
            UtilitySupport_505 class_505 = (UtilitySupport_505)a.next();
            if (class_505 == null || a2.contains(class_505)) continue;
            a2.add(class_505);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public <O> ItemListSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        ItemListSetting a3 = this;
ItemListSetting class_047 = a3;
        super.L(a, a2);
        return class_047;
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L((Consumer)a);
    }

    @Override
    public void L(JsonElement jsonElement) {
        Iterator<JsonElement> a;
        ItemListSetting class_047 = this;
if (!((JsonElement)((Object)a)).isJsonArray()) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        a = ((JsonElement)((Object)a)).getAsJsonArray().iterator();
        block0: while (true) {
            Iterator<JsonElement> iterator = a;
            while (iterator.hasNext()) {
                Object a2 = a.next();
                if (!((JsonElement)a2).isJsonPrimitive()) continue block0;
                if (!((JsonElement)a2).getAsJsonPrimitive().isString()) {
                    iterator = a;
                    continue;
                }
                if ((a2 = UtilitySupport_505.d(((JsonElement)a2).getAsString())) == null || arrayList.contains(a2)) continue block0;
                arrayList.add(a2);
                continue block0;
            }
            break;
        }
        class_047.i(arrayList);
    }

    @Override
    public void L(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        ItemListSetting a2 = this;
if (a == null || !a2.L(a)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection)a2.L());
        arrayList.remove(a);
        a2.i(arrayList);
    }

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public boolean L(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        ItemListSetting a2 = this;
return ((List)a2.L()).contains(a);
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L((String)a);
    }

    public void D() {
        ItemListSetting a;
a.i(new ArrayList());
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((ItemListSetting)object).L((String)a);
    }
}

