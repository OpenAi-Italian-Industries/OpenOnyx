/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Rotation
extends Record {
    private final float H;
    private final float e;

    public float d() {
        Rotation a;
return a.H;
    }

    @Override
    public final String toString() {
        Rotation a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{Rotation.class, "yaw;pitch", "H", "e"}, a);
    }

    @Override
    public final int hashCode() {
        Rotation a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Rotation.class, "yaw;pitch", "H", "e"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public Rotation(float f2, float f3) {
        void a;
        Rotation a2;
        float a3 = f3;
        Rotation class_535 = a2 = this;
        class_535.H = a;
        class_535.e = a3;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        Rotation a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Rotation.class, "yaw;pitch", "H", "e"}, a2, a);
    }

    public float L() {
        Rotation a;
return a.e;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 2;
        int n3 = 1;
        int n4 = 21;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (1 < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = 1;
        }
        return new String(cArray);
    }
}

