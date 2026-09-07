/*
 * Decompiled with CFR.
 */
package openonyx.movement;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.Vec3;
import openonyx.movement.MovementSupport_086;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MovementSupport_088
extends Record {
    private final double d;
    private final Vec3 i;
    private final boolean f;
    private final boolean H;
    private final Vec3 e;

    public double L() {
        MovementSupport_088 a;
return a.d;
    }

    public boolean d() {
        MovementSupport_088 a;
return a.H;
    }

    @Override
    public final int hashCode() {
        MovementSupport_088 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MovementSupport_088.class, "pos;fallDistance;velocity;onGround;clipLedged", "i", "d", "e", "H", "f"}, a);
    }

    public Vec3 d() {
        MovementSupport_088 a;
return a.i;
    }

    @Override
    public final String toString() {
        MovementSupport_088 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{MovementSupport_088.class, "pos;fallDistance;velocity;onGround;clipLedged", "i", "d", "e", "H", "f"}, a);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        MovementSupport_088 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MovementSupport_088.class, "pos;fallDistance;velocity;onGround;clipLedged", "i", "d", "e", "H", "f"}, a2, a);
    }

    public boolean L() {
        MovementSupport_088 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    public MovementSupport_088(Vec3 vec3, double d, Vec3 vec32, boolean bl, boolean bl2) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        MovementSupport_088 a6;
        boolean bl3 = bl2;
        MovementSupport_088 class_088 = a6 = this;
        MovementSupport_088 class_0882 = a6;
        a6.i = a5;
        class_0882.d = a4;
        class_0882.e = a3;
        class_088.H = a2;
        class_088.f = a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = 1;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = 14;
        int cfr_ignored_0 = n << n ^ 2;
        int n5 = 0;
        int n6 = 0x70 ^ n2 << n2;
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

    public MovementSupport_088(MovementSupport_086 class_086) {
        MovementSupport_086 a = class_086;
        MovementSupport_088 a2 = this;
        a2(a.d(), a.L(), a.D(), a.k(), a.d());
    }

    public Vec3 L() {
        MovementSupport_088 a;
return a.e;
    }
}

