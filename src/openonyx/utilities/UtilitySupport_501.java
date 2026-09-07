/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import openonyx.utilities.UtilitySupport_482;

public final class UtilitySupport_501 {
    private static List<UtilitySupport_482> e;

    private UtilitySupport_501() {
        UtilitySupport_501 a;
    }

    private static List<UtilitySupport_482> d() {
ArrayList<UtilitySupport_482> arrayList = new ArrayList<UtilitySupport_482>();
        Iterator<Item> iterator = Item.itemRegistry.iterator();
        block0: while (true) {
            Iterator<Item> iterator2 = iterator;
            while (iterator2.hasNext()) {
                Object object = iterator.next();
                if (object == null) {
                    iterator2 = iterator;
                    continue;
                }
                ResourceLocation resourceLocation = Item.itemRegistry.getNameForObject((Item)object);
                if (resourceLocation == null) {
                    iterator2 = iterator;
                    continue;
                }
                String string = resourceLocation.toString();
                object = UtilitySupport_501.L((Item)object).iterator();
                block2: while (true) {
                    Object object2 = object;
                    while (true) {
                        if (!object2.hasNext()) continue block0;
                        ItemStack itemStack = (ItemStack)object.next();
                        if (itemStack == null) continue block2;
                        if (itemStack.getItem() == null) {
                            object2 = object;
                            continue;
                        }
                        String string2 = UtilitySupport_501.L(itemStack, resourceLocation.getResourcePath());
                        object2 = object;
                        String string3 = string;
                        String string4 = string2;
                        arrayList.add(new UtilitySupport_482(itemStack, string3, string4, new StringBuilder().insert(0, string3).append((char)32).append(string4).toString().toLowerCase(Locale.ROOT)));
                    }
                    break;
                }
            }
            break;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static List<UtilitySupport_482> L(String string, int n) {
        void a;
        String string2 = string;
ArrayList a2 = new ArrayList();
        String string3 = string2 == null ? "" : string2.trim().toLowerCase(Locale.ROOT);
        Iterator<UtilitySupport_482> iterator = UtilitySupport_501.L().iterator();
        do {
            UtilitySupport_482 class_482;
            Iterator<UtilitySupport_482> iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return a2;
                }
                class_482 = iterator.next();
                if (string3.isEmpty() || class_482.D().contains(string3)) break;
                iterator2 = iterator;
            }
            a2.add(class_482);
        } while (a <= 0 || a2.size() < a);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static String L(ItemStack itemStack, String string) {
        void a;
        ItemStack itemStack2 = itemStack;
try {
            String a2 = itemStack2.getDisplayName();
            if (a2 != null && !a2.isEmpty()) {
                return a2;
            }
        }
        catch (RuntimeException a2) {
            // empty catch block
        }
        return a;
    }

    private static List<ItemStack> L(Item item) {
        Object object;
        Item item2 = item;
ArrayList a = new ArrayList();
        try {
            Item item3 = item2;
            item3.getSubItems(item3, null, a);
            object = a;
        }
        catch (RuntimeException runtimeException) {
            Object object2 = a;
            object = object2;
            object2.clear();
        }
        if (object.isEmpty()) {
            a.add(new ItemStack(item2));
        }
        return a;
    }

    public static List<UtilitySupport_482> L() {
if (e == null) {
            e = UtilitySupport_501.d();
        }
        return e;
    }
}

