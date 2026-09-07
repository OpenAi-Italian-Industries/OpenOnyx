/*
 * Decompiled with CFR.
 */
package openonyx.input;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class InputSupport_005
extends Record {
    private final int H;
    private final int e;

    /*
     * WARNING - void declaration
     */
    public InputSupport_005(int n, int n2) {
        void a;
        InputSupport_005 a2;
        int a3 = n2;
        InputSupport_005 class_005 = a2 = this;
        class_005.e = a;
        class_005.H = a3;
    }

    public InputSupport_005(char c) {
        char a = c;
        InputSupport_005 a2 = this;
        a2(a, 0);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = n << n ^ 6;
        int n4 = a;
        int n5 = 106;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (a < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = a;
        }
        return new String(cArray);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        InputSupport_005 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{InputSupport_005.class, "codepoint;modifiers", "e", "H"}, a2, a);
    }

    public int d() {
        InputSupport_005 a;
return a.H;
    }

    @Override
    public final int hashCode() {
        InputSupport_005 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{InputSupport_005.class, "codepoint;modifiers", "e", "H"}, a);
    }

    @Override
    public final String toString() {
        InputSupport_005 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{InputSupport_005.class, "codepoint;modifiers", "e", "H"}, a);
    }

    public int L() {
        InputSupport_005 a;
return a.e;
    }
}

