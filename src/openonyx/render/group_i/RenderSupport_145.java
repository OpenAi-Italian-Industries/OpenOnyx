/*
 * Decompiled with CFR.
 */
package openonyx.render.group_i;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_145
extends Record {
    private final float d;
    private final Vec3 i;
    private final float f;
    private final float H;
    private final float e;

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_145 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_145.class, "pivot;lift;yaw;pitch;phase", "i", "d", "H", "e", "f"}, a2, a);
    }

    public float i() {
        RenderSupport_145 a;
return a.e;
    }

    public float D() {
        RenderSupport_145 a;
return a.H;
    }

    @Override
    public final int hashCode() {
        RenderSupport_145 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_145.class, "pivot;lift;yaw;pitch;phase", "i", "d", "H", "e", "f"}, a);
    }

    @Override
    public final String toString() {
        RenderSupport_145 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_145.class, "pivot;lift;yaw;pitch;phase", "i", "d", "H", "e", "f"}, a);
    }

    public float d() {
        RenderSupport_145 a;
return a.f;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = 1;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = 0x50 ^ n2 << n2;
        int n5 = 0;
        int n6 = n << n ^ 2;
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

    public Vec3 L() {
        RenderSupport_145 a;
return a.i;
    }

    public float L() {
        RenderSupport_145 a;
return a.d;
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_145(Vec3 vec3, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        RenderSupport_145 a6;
        float f6 = f5;
        RenderSupport_145 class_145 = a6 = this;
        RenderSupport_145 class_1452 = a6;
        a6.i = a5;
        class_1452.d = a4;
        class_1452.H = a3;
        class_145.e = a2;
        class_145.f = a;
    }
}

