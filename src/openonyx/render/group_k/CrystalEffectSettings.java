/*
 * Decompiled with CFR.
 */
package openonyx.render.group_k;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CrystalEffectSettings
extends Record {
    private final float l;
    private final float I;
    private final int d;
    private final int i;
    private final int f;
    private final float H;
    private final float e;

    public float i() {
        CrystalEffectSettings a;
return a.l;
    }

    public int D() {
        CrystalEffectSettings a;
return a.i;
    }

    public float D() {
        CrystalEffectSettings a;
return a.H;
    }

    public int d() {
        CrystalEffectSettings a;
return a.d;
    }

    /*
     * WARNING - void declaration
     */
    public CrystalEffectSettings(float f2, float f3, float f4, float f5, int n, int n2, int n3) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        CrystalEffectSettings a8;
        int n4 = n3;
        CrystalEffectSettings class_155 = a8 = this;
        CrystalEffectSettings class_1552 = a8;
        CrystalEffectSettings class_1553 = a8;
        a8.e = a7;
        class_1553.H = a6;
        class_1553.l = a5;
        class_1552.I = a4;
        class_1552.d = a3;
        class_155.i = a2;
        class_155.f = a;
    }

    @Override
    public final String toString() {
        CrystalEffectSettings a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{CrystalEffectSettings.class, "bloom;size;crystal;reach;crystalColor;bloomColor;strikeColor", "e", "H", "l", "I", "d", "i", "f"}, a);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        CrystalEffectSettings a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{CrystalEffectSettings.class, "bloom;size;crystal;reach;crystalColor;bloomColor;strikeColor", "e", "H", "l", "I", "d", "i", "f"}, a2, a);
    }

    public int L() {
        CrystalEffectSettings a;
return a.f;
    }

    @Override
    public final int hashCode() {
        CrystalEffectSettings a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{CrystalEffectSettings.class, "bloom;size;crystal;reach;crystalColor;bloomColor;strikeColor", "e", "H", "l", "I", "d", "i", "f"}, a);
    }

    public float d() {
        CrystalEffectSettings a;
return a.e;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 59;
        int n3 = 0;
        int n4 = 106;
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

    public float L() {
        CrystalEffectSettings a;
return a.I;
    }
}

