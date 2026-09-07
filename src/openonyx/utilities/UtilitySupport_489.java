/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.Comparator;

public class UtilitySupport_489<T>
implements Comparator<T> {
    private final Comparator<? super T>[] e;

    @SafeVarargs
    public UtilitySupport_489(Comparator<? super T> ... comparatorArray) {
        Comparator<? super T>[] a = comparatorArray;
        Comparator<? super T>[] a2 = this;
        a2.e = a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 18;
        int n3 = 0;
        int n4 = 117;
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

    /*
     * WARNING - void declaration
     */
    @Override
    public int compare(T t, T t2) {
        int a;
        UtilitySupport_489 class_489 = this;
Comparator<? super T>[] comparatorArray = class_489.e;
        int n = class_489.e.length;
        int n2 = 0;
        while (n2 < 0) {
            void a2;
            void a3;
            int n3 = comparatorArray[0].compare(a3, a2);
            if (n3 != 0) {
                return n3;
            }
            n2 = ++a;
        }
        return 0;
    }
}

