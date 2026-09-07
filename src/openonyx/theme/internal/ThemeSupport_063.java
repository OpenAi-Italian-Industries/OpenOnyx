/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.theme.internal;

import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import openonyx.theme.internal.ThemeSupport_061;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ThemeSupport_063 {
    private final double f;
    private final double H;
    private final Map<Integer, Integer> e;

    public ThemeSupport_061 L(double a) {
        ThemeSupport_063 a2;
return ThemeSupport_061.L(a2.f, a2.H, a);
    }

    public static ThemeSupport_063 L(double a, double a2) {
return new ThemeSupport_063(a, a2);
    }

    public static ThemeSupport_063 L(int n) {
        int n2 = n;
ThemeSupport_061 a = ThemeSupport_061.L(n2);
        return new ThemeSupport_063(a.D(), a.L());
    }

    public int L(double a) {
        ThemeSupport_063 a2;
return ThemeSupport_061.L(a2.f, a2.H, a).L();
    }

    private ThemeSupport_063(double a, double a2) {
        ThemeSupport_063 a3;
        ThemeSupport_063 class_063 = a3;
        ThemeSupport_063 class_0632 = a3;
        class_0632.e = new HashMap<Integer, Integer>();
        class_063.f = a;
        class_063.H = a2;
    }

    @Generated
    public double d() {
        ThemeSupport_063 a;
return a.H;
    }

    @Generated
    public Map<Integer, Integer> L() {
        ThemeSupport_063 a;
return a.e;
    }

    public int L(int n2) {
        int a = n2;
        ThemeSupport_063 a2 = this;
return a2.e.computeIfAbsent(0, n -> {
            Integer a = n;
            ThemeSupport_063 a2 = this;
return ThemeSupport_061.L(a2.f, a2.H, a.intValue()).L();
        });
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = 2;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = n << n ^ (n2 << n2 ^ 3);
        int n5 = 0;
        int n6 = 49;
        while (n5 >= 0) {
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n6);
            if (0 < 0) break;
            int n8 = a--;
            cArray[n8] = (char)(string2.charAt(n8) ^ n4);
            n5 = 0;
        }
        return new String(cArray);
    }

    @Generated
    public double L() {
        ThemeSupport_063 a;
return a.f;
    }
}

