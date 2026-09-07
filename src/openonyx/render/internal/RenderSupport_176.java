/*
 * Decompiled with CFR.
 */
package openonyx.render.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;
import openonyx.render.internal.RenderSupport_174;
import openonyx.render.internal.RenderMode_171;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_176
extends Record {
    private final Vec3 d;
    private final RenderSupport_174 i;
    private final RenderMode_171 f;
    private final float H;
    private final float e;

    public float d() {
        RenderSupport_176 a;
return a.H;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        RenderSupport_176 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderSupport_176.class, "position;bodyYaw;open;shape;pose", "d", "H", "e", "f", "i"}, a2, a);
    }

    public float L() {
        RenderSupport_176 a;
return a.e;
    }

    public Vec3 L() {
        RenderSupport_176 a;
return a.d;
    }

    @Override
    public final String toString() {
        RenderSupport_176 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderSupport_176.class, "position;bodyYaw;open;shape;pose", "d", "H", "e", "f", "i"}, a);
    }

    public RenderSupport_174 L() {
        RenderSupport_176 a;
return a.i;
    }

    @Override
    public final int hashCode() {
        RenderSupport_176 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderSupport_176.class, "position;bodyYaw;open;shape;pose", "d", "H", "e", "f", "i"}, a);
    }

    public RenderMode_171 L() {
        RenderSupport_176 a;
return a.f;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 12;
        int cfr_ignored_0 = n << n;
        int n4 = 0;
        int n5 = 103;
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

    /*
     * WARNING - void declaration
     */
    public RenderSupport_176(Vec3 vec3, float f2, float f3, RenderMode_171 enum_171, RenderSupport_174 class_174) {
        Record a;
        void a2;
        void a3;
        void a4;
        void a5;
        RenderSupport_176 a6;
        RenderSupport_176 class_176 = record;
        Record record = class_174;
        RenderSupport_176 class_1762 = a6 = class_176;
        RenderSupport_176 class_1763 = a6;
        a6.d = a5;
        class_1763.H = a4;
        class_1763.e = a3;
        class_1762.f = a2;
        class_1762.i = a;
    }
}

