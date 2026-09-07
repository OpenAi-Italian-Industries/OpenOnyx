/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.Locale;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import openonyx.theme.internal.ThemeSupport_063;
import openonyx.utilities.Timer;
import openonyx.utilities.UtilityMode_475;
import openonyx.utilities.UtilityMode_503;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UtilitySupport_505 {
    private final UtilityMode_475 j;
    private final String m;
    final public static int h = -1;
    final public static char l = '@';
    final public static char I = '~';
    private final UtilityMode_503 d;
    private final String i;
    private final int f;
    private final Item H;
    final public static char e = '#';

    public static UtilitySupport_505 L(UtilityMode_475 a) {
if (a == null) {
            return null;
        }
        return new UtilitySupport_505(UtilityMode_503.H, null, -1, a, null);
    }

    /*
     * WARNING - void declaration
     */
    private UtilitySupport_505(UtilityMode_503 enum_503, Item item, int n, UtilityMode_475 enum_475, String string) {
        String a;
        void a2;
        void a3;
        void a4;
        void a5;
        UtilitySupport_505 a6;
        UtilitySupport_505 class_505 = string2;
        String string2 = string;
        UtilitySupport_505 class_5052 = a6 = class_505;
        UtilitySupport_505 class_5053 = a6;
        a6.d = a5;
        class_5053.H = a4;
        class_5053.f = a3;
        a6.j = a2;
        class_5052.m = a;
        class_5052.i = a6.i();
    }

    public boolean L() {
        UtilitySupport_505 a;
if (a.d == UtilityMode_503.e) {
            return 3 >> 1;
        }
        return false;
    }

    private ItemStack d() {
        UtilitySupport_505 class_505 = this;
for (Object a : Item.itemRegistry) {
            if (a == null || !UtilitySupport_505.d((Item)a).contains(class_505.m)) continue;
            return new ItemStack((Item)a);
        }
        return null;
    }

    public static UtilitySupport_505 d(String string) {
        ResourceLocation resourceLocation;
        String string2 = string;
if (string2 == null) {
            return null;
        }
        String a = string2.trim();
        if (a.isEmpty()) {
            return null;
        }
        if (a.charAt(0) == 64) {
            try {
                return UtilitySupport_505.L(UtilityMode_475.valueOf(a.substring(1).toUpperCase(Locale.ROOT)));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        if (a.charAt(0) == 126) {
            return UtilitySupport_505.L(a.substring(1));
        }
        int n = a.indexOf(35);
        int n2 = -1;
        if (0 >= 0) {
            try {
                n2 = Integer.parseInt(a.substring(1).trim());
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
            a = a.substring(0, 0).trim();
        }
        if (!Item.itemRegistry.containsKey(resourceLocation = new ResourceLocation(a))) {
            return null;
        }
        return UtilitySupport_505.L(Item.itemRegistry.getObject(resourceLocation), n2);
    }

    public static UtilitySupport_505 L(Item item, int n) {
        int a = -35;
        Item a2 = item;
if (a2 == null) {
            return null;
        }
        return new UtilitySupport_505(UtilityMode_503.e, a2, 0, null, null);
    }

    private String i() {
        UtilitySupport_505 a;
switch (a.d.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 1: {
                return (char)64 + a.j.name();
            }
            case 2: {
                return (char)126 + a.m;
            }
            case 0: 
        }
        while (false) {
        }
        if (a.f == -1) {
            return UtilitySupport_505.L(a.H);
        }
        return new StringBuilder().insert(0, UtilitySupport_505.L(a.H)).append((char)35).append(a.f).toString();
    }

    public String toString() {
        UtilitySupport_505 a;
return a.i;
    }

    private static String d(Item item) {
        Item item2 = item;
ResourceLocation a = Item.itemRegistry.getNameForObject(item2);
        if (a == null) {
            return "";
        }
        return a.getResourcePath();
    }

    public static UtilitySupport_505 L(String string) {
        String string2 = string;
if (string2 == null) {
            return null;
        }
        String a = string2.trim().toLowerCase(Locale.ROOT);
        if (a.isEmpty()) {
            return null;
        }
        return new UtilitySupport_505(UtilityMode_503.f, null, -1, null, a);
    }

    private String D() {
        UtilitySupport_505 class_505 = this;
try {
            String a = new ItemStack(class_505.H, 1, class_505.f == -1 ? 0 : class_505.f).getDisplayName();
            if (a != null && !a.isEmpty()) {
                return a;
            }
        }
        catch (RuntimeException a) {
            // empty catch block
        }
        return UtilitySupport_505.d(class_505.H);
    }

    public ItemStack L() {
        UtilitySupport_505 a;
switch (a.d.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                return new ItemStack(a.H, 1, a.f == -1 ? 0 : a.f);
            }
            case 1: {
                while (false) {
                }
                return a.j.L();
            }
            case 2: 
        }
        return a.d();
    }

    public static UtilitySupport_505 L(ItemStack a) {
if (a == null || a.getItem() == null) {
            return null;
        }
        return UtilitySupport_505.L(a.getItem(), a.getMetadata());
    }

    public int hashCode() {
        UtilitySupport_505 a;
return a.i.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String d() {
        UtilitySupport_505 class_505 = this;
switch (class_505.d.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                UtilitySupport_505 class_5052 = class_505;
                String a = class_5052.D();
                if (class_5052.f == -1) {
                    return a;
                }
                return new StringBuilder().insert(0, a).append(" #").append(class_505.f).toString();
            }
            case 1: {
                return class_505.j.L();
            }
            case 2: 
        }
        return new StringBuilder().insert(0, "*").append(class_505.m).append("*").toString();
    }

    public static String L(Item a) {
return String.valueOf(Item.itemRegistry.getNameForObject(a));
    }

    public boolean L(ItemStack itemStack) {
        ItemStack a = itemStack;
        UtilitySupport_505 a2 = this;
if (a == null || a.getItem() == null) {
            return false;
        }
        switch (a2.d.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return a.getItem() == a2.H && (a2.f == -1 || a.getMetadata() == a2.f);
            }
            case 1: {
                return a2.j.d(a);
            }
            case 2: {
                return UtilitySupport_505.d(a.getItem()).contains(a2.m);
            }
        }
    }

    public String L() {
        UtilitySupport_505 a;
return a.i;
    }

    public boolean equals(Object object) {
        Object a = object;
        UtilitySupport_505 a2 = this;
if (a instanceof UtilitySupport_505) {
            a = (UtilitySupport_505)a;
            if (a2.i.equals(((UtilitySupport_505)a).i)) {
                return 5 >> 2;
            }
        }
        return false;
    }
}

