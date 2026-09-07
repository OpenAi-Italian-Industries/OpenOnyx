/*
 * Decompiled with CFR.
 */
package openonyx.theme;

public final class ThemeSupport_056 {
    final public static float c = 50.0f;
    final public static float a = 350.0f;
    final public static float k = 450.0f;
    final public static float g = 400.0f;
    final public static float M = 700.0f;
    final public static float L = 200.0f;
    final public static float j = 550.0f;
    final public static float m = 300.0f;
    final public static float h = 800.0f;
    final public static float l = 1000.0f;
    final public static float I = 500.0f;
    final public static float d = 600.0f;
    final public static float i = 900.0f;
    final public static float f = 150.0f;
    final public static float H = 250.0f;
    final public static float e = 100.0f;

    private ThemeSupport_056() {
        ThemeSupport_056 a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 18;
        int n3 = 0;
        int n4 = 32;
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
}

