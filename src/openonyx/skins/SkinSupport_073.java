/*
 * Decompiled with CFR.
 */
package openonyx.skins;

import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SkinSupport_073 {
    private static volatile ResourceLocation H;
    private static volatile String e;

    public static boolean L() {
if (H != null) {
            return 1 != 0;
        }
        return false;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 23;
        int n3 = 0;
        int n4 = 93;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (0 < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = 0;
        }
        return new String(cArray);
    }

    public static ResourceLocation L() {
return H;
    }

    private SkinSupport_073() {
        SkinSupport_073 a;
    }

    public static void L(ResourceLocation resourceLocation, String string) {
        String a = string;
        ResourceLocation a2 = resourceLocation;
H = a2;
        e = a == null ? "default" : a;
    }

    public static void L() {
H = null;
        e = null;
    }

    public static String L() {
return e;
    }
}

