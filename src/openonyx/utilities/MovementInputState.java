/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.MovementInput;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MovementInputState
extends Record {
    final public static MovementInputState g;
    final public static MovementInputState M;
    final public static MovementInputState L;
    final public static MovementInputState j;
    private final boolean m;
    final public static MovementInputState h;
    final public static MovementInputState l;
    final public static MovementInputState I;
    private final boolean d;
    final public static MovementInputState i;
    private final boolean f;
    final public static MovementInputState H;
    private final boolean e;

    public float d() {
        MovementInputState a;
MovementInputState class_478 = a;
        if (class_478.d == class_478.e) {
            return 0.0f;
        }
        if (a.d) {
            return 1.0f;
        }
        return -1.0f;
    }

    public boolean I() {
        MovementInputState a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public MovementInputState(float f2, float f3) {
        float f4;
        boolean bl;
        float f5;
        boolean bl2;
        void v1;
        int n;
        void a;
        float a2 = f3;
        MovementInputState a3 = this;
        if (a > 0.0f) {
            n = 1;
            v1 = a;
        } else {
            n = 0;
            v1 = a;
        }
        if (v1 < 0.0f) {
            bl2 = 5 >> 2;
            f5 = 0;
        } else {
            bl2 = false;
            f5 = 0;
        }
        if (f5 > 0.0f) {
            bl = --1 != 0;
            f4 = 0;
        } else {
            bl = false;
            f4 = 0;
        }
        a3(n != 0, bl2, bl, (f4 < 0.0f ? 1 : 0) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public MovementInputState(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        void a;
        void a2;
        void a3;
        void a4;
        MovementInputState a5;
        boolean bl5 = bl4;
        MovementInputState class_478 = a5 = this;
        MovementInputState class_4782 = a5;
        class_4782.d = a4;
        class_4782.e = a3;
        class_478.m = a2;
        class_478.f = a;
    }

    public float L() {
        MovementInputState a;
MovementInputState class_478 = a;
        if (class_478.m == class_478.f) {
            return 0.0f;
        }
        if (a.m) {
            return 1.0f;
        }
        return -1.0f;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        MovementInputState a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MovementInputState.class, "forwards;backwards;left;right", "d", "e", "m", "f"}, a2, a);
    }

    public MovementInputState L() {
        MovementInputState a;
MovementInputState class_478 = a;
        MovementInputState class_4782 = a;
        return new MovementInputState(class_478.e, class_478.d, class_4782.f, class_4782.m);
    }

    public MovementInputState(MovementInput movementInput) {
        MovementInput a = movementInput;
        MovementInputState a2 = this;
        Object object = a;
        a2(((MovementInput)object).moveForward, ((MovementInput)object).moveStrafe);
    }

    public boolean i() {
        block3: {
            block2: {
                MovementInputState a;
MovementInputState class_478 = a;
                if (class_478.d != class_478.e) break block2;
                MovementInputState class_4782 = a;
                if (class_4782.m == class_4782.f) break block3;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        MovementInputState a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MovementInputState.class, "forwards;backwards;left;right", "d", "e", "m", "f"}, a);
    }

    public boolean D() {
        MovementInputState a;
return a.f;
    }

    public boolean d() {
        MovementInputState a;
return a.d;
    }

    @Override
    public final String toString() {
        MovementInputState a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{MovementInputState.class, "forwards;backwards;left;right", "d", "e", "m", "f"}, a);
    }

    static {
        boolean bl = 5 >> 3;
        i = new MovementInputState(bl, bl, bl, bl);
        boolean bl2 = 5 >> 3;
        h = new MovementInputState(--1 != 0, bl2, bl2, bl2);
        boolean bl3 = 0;
        l = new MovementInputState(bl3, 5 >> 2, bl3, bl3);
        boolean bl4 = 3 >> 2;
        H = new MovementInputState(bl4, bl4, --1 != 0, bl4);
        boolean bl5 = 3 >> 2;
        L = new MovementInputState(bl5, bl5, bl5, 1 != 0);
        boolean bl6 = 1;
        I = new MovementInputState(bl6, 3 >> 2, bl6, 3 >> 2);
        boolean bl8 = 0;
        bl8 = --1 != 0;
        g = new MovementInputState(bl8, bl7, bl7, bl8);
        boolean bl10 = 5 >> 2;
        bl10 = 0;
        j = new MovementInputState(bl10, bl9, bl9, bl10);
        boolean bl11 = 0;
        M = new MovementInputState(bl11, 1 != 0, bl11, --1 != 0);
    }

    public boolean L() {
        MovementInputState a;
return a.m;
    }
}

