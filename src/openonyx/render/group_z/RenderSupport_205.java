/*
 * Decompiled with CFR.
 */
package openonyx.render.group_z;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import openonyx.features.render.FeatureMode_305;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_205
extends Record {
    private final boolean M;
    private final float L;
    private final int j;
    private final FeatureMode_305 m;
    private final String h;
    private final float l;
    private final boolean I;
    private final float d;
    private final float i;
    private final long f;
    private final float H;
    private final float e;

    /*
     * WARNING - void declaration
     */
    public RenderSupport_205(FeatureMode_305 enum_305, int n, float f2, float f3, long l, float f4, String string, float f5, boolean bl, boolean bl2, float f6, float f7) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        void a12;
        RenderSupport_205 a13;
        float f8 = f7;
        RenderSupport_205 class_205 = a13 = this;
        RenderSupport_205 class_2052 = a13;
        RenderSupport_205 class_2053 = a13;
        RenderSupport_205 class_2054 = a13;
        RenderSupport_205 class_2055 = a13;
        RenderSupport_205 class_2056 = a13;
        class_2056.m = a12;
        class_2056.j = a11;
        class_2055.l = a10;
        class_2055.e = a9;
        class_2054.f = a8;
        class_2054.d = a7;
        class_2053.h = a6;
        class_2053.i = a5;
        class_2052.M = a4;
        class_2052.I = a3;
        class_205.H = a2;
        class_205.L = a;
    }

    public float h() {
        RenderSupport_205 a;
return a.e;
    }

    @Override
    public final int hashCode() {
        RenderSupport_205 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_205.class, "mode;color;opacity;radius;lifetime;spin;text;textHeight;throughWalls;glass;glassBlur;glassWarp", "m", "j", "l", "e", "f", "d", "h", "i", "M", "I", "H", "L"}, a);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 8;
        int cfr_ignored_0 = n << n ^ 7;
        int n4 = 0;
        int n5 = 117;
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

    public String L() {
        RenderSupport_205 a;
return a.h;
    }

    public float I() {
        RenderSupport_205 a;
return a.L;
    }

    public int L() {
        RenderSupport_205 a;
return a.j;
    }

    public float i() {
        RenderSupport_205 a;
return a.i;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_205 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_205.class, "mode;color;opacity;radius;lifetime;spin;text;textHeight;throughWalls;glass;glassBlur;glassWarp", "m", "j", "l", "e", "f", "d", "h", "i", "M", "I", "H", "L"}, a2, a);
    }

    public FeatureMode_305 L() {
        RenderSupport_205 a;
return a.m;
    }

    public boolean d() {
        RenderSupport_205 a;
return a.I;
    }

    public float D() {
        RenderSupport_205 a;
return a.d;
    }

    public float d() {
        RenderSupport_205 a;
return a.H;
    }

    @Override
    public final String toString() {
        RenderSupport_205 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_205.class, "mode;color;opacity;radius;lifetime;spin;text;textHeight;throughWalls;glass;glassBlur;glassWarp", "m", "j", "l", "e", "f", "d", "h", "i", "M", "I", "H", "L"}, a);
    }

    public boolean L() {
        RenderSupport_205 a;
return a.M;
    }

    public long L() {
        RenderSupport_205 a;
return a.f;
    }

    public float L() {
        RenderSupport_205 a;
return a.l;
    }
}

