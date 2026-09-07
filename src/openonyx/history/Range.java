/*
 * Decompiled with CFR.
 */
package openonyx.history;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class Range
extends Record {
    private final double H;
    private final double e;

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        Range a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Range.class, "min;max", "e", "H"}, a2, a);
    }

    public double D() {
        Range a;
return a.H;
    }

    public Range(double a, double a2) {
        Range a3;
        if (a > a2) {
            double d = a;
            a = a2;
            a2 = d;
        }
        a3.e = a;
        a3.H = a2;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 99;
        int n3 = a;
        int n4 = 10;
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

    public boolean L(double a) {
        Range a2;
if (a >= a2.e && a <= a2.H) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public final String toString() {
        Range a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{Range.class, "min;max", "e", "H"}, a);
    }

    @Override
    public final int hashCode() {
        Range a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Range.class, "min;max", "e", "H"}, a);
    }

    public double d() {
        Range a;
return a.H - a.e;
    }

    public double L() {
        Range a;
return a.e;
    }
}

