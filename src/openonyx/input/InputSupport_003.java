/*
 * Decompiled with CFR.
 */
package openonyx.input;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class InputSupport_003
extends Record {
    private final double f;
    private final int H;
    private final double e;

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        InputSupport_003 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{InputSupport_003.class, "x;y;button", "f", "e", "H"}, a2, a);
    }

    /*
     * WARNING - void declaration
     */
    public InputSupport_003(double d, double d2, int n) {
        void a;
        void a2;
        void a3;
        InputSupport_003 a4;
        int n2 = n;
        InputSupport_003 class_003 = a4 = this;
        a4.f = a3;
        class_003.e = a2;
        class_003.H = a;
    }

    public double d() {
        InputSupport_003 a;
return a.e;
    }

    @Override
    public final int hashCode() {
        InputSupport_003 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{InputSupport_003.class, "x;y;button", "f", "e", "H"}, a);
    }

    @Override
    public final String toString() {
        InputSupport_003 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{InputSupport_003.class, "x;y;button", "f", "e", "H"}, a);
    }

    public int L() {
        InputSupport_003 a;
return a.H;
    }

    public double L() {
        InputSupport_003 a;
return a.f;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 43;
        int n3 = a;
        int n4 = 110;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (a < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = a;
        }
        return new String(cArray);
    }
}

