/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

public final class UtilitySupport_476 {
    final public static int l = -500;
    final public static int I = -50;
    final public static int d = -10;
    final public static int i = -100;
    final public static int f = 500;
    final public static int H = 1000;
    final public static int e = -1000;

    private UtilitySupport_476() {
        UtilitySupport_476 a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = n << n ^ 6;
        int n4 = 0;
        int n5 = 112;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (0 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 0;
        }
        return new String(cArray);
    }
}

