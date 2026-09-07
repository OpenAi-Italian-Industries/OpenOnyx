/*
 * Decompiled with CFR.
 */
package openonyx.render.group_e;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import openonyx.render.group_e.RenderSupport_126;
import openonyx.render.group_e.RenderSupport_127;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_128
extends Record {
    private final float i;
    private final RenderMode_130 f;
    private final float H;
    private final RenderMode_131 e;

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_128 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_128.class, "optical;weight;size;lineHeight", "e", "f", "H", "i"}, a2, a);
    }

    @Override
    public final String toString() {
        RenderSupport_128 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_128.class, "optical;weight;size;lineHeight", "e", "f", "H", "i"}, a);
    }

    public float h() {
        RenderSupport_128 a;
return a.i() + a.D();
    }

    public float I() {
        RenderSupport_128 a;
return a.i;
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_128(RenderMode_131 enum_131, RenderMode_130 enum_130, float f2, float f3) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_128 a5;
        float f4 = f3;
        RenderSupport_128 class_128 = a5 = this;
        RenderSupport_128 class_1282 = a5;
        class_1282.e = a4;
        class_1282.f = a3;
        class_128.H = a2;
        class_128.i = a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 125;
        int n3 = 0;
        int n4 = 101;
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

    public float i() {
        RenderSupport_128 a;
return a.L().d() * a.L();
    }

    public float D() {
        RenderSupport_128 a;
return a.L().L() * a.L();
    }

    public float d() {
        RenderSupport_128 a;
return a.H;
    }

    public RenderMode_130 L() {
        RenderSupport_128 a;
return a.f;
    }

    public float L() {
        RenderSupport_128 a;
RenderSupport_128 class_128 = a;
        return class_128.H / class_128.e.L();
    }

    public RenderMode_131 L() {
        RenderSupport_128 a;
return a.e;
    }

    @Override
    public final int hashCode() {
        RenderSupport_128 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_128.class, "optical;weight;size;lineHeight", "e", "f", "H", "i"}, a);
    }

    public RenderSupport_127 L() {
        RenderSupport_128 a;
RenderSupport_128 class_128 = a;
        return RenderSupport_126.L(class_128.e, class_128.f);
    }
}

