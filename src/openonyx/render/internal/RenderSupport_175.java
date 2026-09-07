/*
 * Decompiled with CFR.
 */
package openonyx.render.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_175
extends Record {
    private final float l;
    private final boolean I;
    private final int d;
    private final float i;
    private final boolean f;
    private final float H;
    private final float e;

    public int L() {
        RenderSupport_175 a;
return a.d;
    }

    @Override
    public final int hashCode() {
        RenderSupport_175 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_175.class, "shaderFill;scale;heightOffset;depthOffset;throughWalls;color;opacity", "f", "l", "e", "H", "I", "d", "i"}, a);
    }

    public boolean d() {
        RenderSupport_175 a;
return a.f;
    }

    public boolean L() {
        RenderSupport_175 a;
return a.I;
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_175(boolean bl, float f2, float f3, float f4, boolean bl2, int n, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        RenderSupport_175 a8;
        float f6 = f5;
        RenderSupport_175 class_175 = a8 = this;
        RenderSupport_175 class_1752 = a8;
        RenderSupport_175 class_1753 = a8;
        a8.f = a7;
        class_1753.l = a6;
        class_1753.e = a5;
        class_1752.H = a4;
        class_1752.I = a3;
        class_175.d = a2;
        class_175.i = a;
    }

    public float i() {
        RenderSupport_175 a;
return a.i;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_175 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_175.class, "shaderFill;scale;heightOffset;depthOffset;throughWalls;color;opacity", "f", "l", "e", "H", "I", "d", "i"}, a2, a);
    }

    public float D() {
        RenderSupport_175 a;
return a.l;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 5 << n;
        int n4 = 0;
        int n5 = n;
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

    @Override
    public final String toString() {
        RenderSupport_175 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_175.class, "shaderFill;scale;heightOffset;depthOffset;throughWalls;color;opacity", "f", "l", "e", "H", "I", "d", "i"}, a);
    }

    public float d() {
        RenderSupport_175 a;
return a.H;
    }

    public float L() {
        RenderSupport_175 a;
return a.e;
    }
}

