/*
 * Decompiled with CFR.
 */
package openonyx.render.group_i;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import openonyx.render.group_i.RenderMode_140;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_142
extends Record {
    private final float M;
    private final float L;
    private final float j;
    private final RenderMode_140 m;
    private final boolean h;
    private final boolean l;
    private final int I;
    private final float d;
    private final boolean i;
    private final float f;
    private final int H;
    private final float e;

    /*
     * WARNING - void declaration
     */
    public RenderSupport_142(float f2, float f3, RenderMode_140 enum_140, int n, int n2, float f4, float f5, boolean bl, boolean bl2, float f6, float f7, boolean bl3) {
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
        RenderSupport_142 a13;
        boolean bl4 = bl3;
        RenderSupport_142 class_142 = a13 = this;
        RenderSupport_142 class_1422 = a13;
        RenderSupport_142 class_1423 = a13;
        RenderSupport_142 class_1424 = a13;
        RenderSupport_142 class_1425 = a13;
        RenderSupport_142 class_1426 = a13;
        class_1426.L = a12;
        class_1426.f = a11;
        class_1425.m = a10;
        class_1425.H = a9;
        class_1424.I = a8;
        class_1424.M = a7;
        class_1423.j = a6;
        class_1423.l = a5;
        class_1422.h = a4;
        class_1422.d = a3;
        class_142.e = a2;
        class_142.i = a;
    }

    public boolean D() {
        RenderSupport_142 a;
return a.h;
    }

    public boolean d() {
        RenderSupport_142 a;
return a.i;
    }

    public int d() {
        RenderSupport_142 a;
return a.H;
    }

    @Override
    public final String toString() {
        RenderSupport_142 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_142.class, "radius;height;colors;color;secondColor;colorPhase;opacity;glow;trail;trailSpan;sweep;throughWalls", "L", "f", "m", "H", "I", "M", "j", "l", "h", "d", "e", "i"}, a);
    }

    public float h() {
        RenderSupport_142 a;
return a.e;
    }

    public float I() {
        RenderSupport_142 a;
return a.M;
    }

    public float i() {
        RenderSupport_142 a;
return a.L;
    }

    public RenderMode_140 L() {
        RenderSupport_142 a;
return a.m;
    }

    @Override
    public final int hashCode() {
        RenderSupport_142 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_142.class, "radius;height;colors;color;secondColor;colorPhase;opacity;glow;trail;trailSpan;sweep;throughWalls", "L", "f", "m", "H", "I", "M", "j", "l", "h", "d", "e", "i"}, a);
    }

    public float D() {
        RenderSupport_142 a;
return a.f;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = 3;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = n2 << n2 ^ 7;
        int n5 = 0;
        int n6 = n << n ^ 5;
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

    public float d() {
        RenderSupport_142 a;
return a.j;
    }

    public boolean L() {
        RenderSupport_142 a;
return a.l;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_142 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_142.class, "radius;height;colors;color;secondColor;colorPhase;opacity;glow;trail;trailSpan;sweep;throughWalls", "L", "f", "m", "H", "I", "M", "j", "l", "h", "d", "e", "i"}, a2, a);
    }

    public float L() {
        RenderSupport_142 a;
return a.d;
    }

    public int L() {
        RenderSupport_142 a;
return a.I;
    }
}

