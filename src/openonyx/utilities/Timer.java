/*
 * Decompiled with CFR.
 */
package openonyx.utilities;


/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Timer {
    private long e;

    public void d(long a) {
a.e = a;
    }

    public long L() {
        Timer a;
return System.currentTimeMillis() - a.e;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 110;
        int n3 = 0;
        int n4 = 106;
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

    public void L(long a) {
        Timer a2;
a2.e = Math.max(a2.e, System.currentTimeMillis() + a);
    }

    public void L() {
        Timer a;
a.d(System.currentTimeMillis());
    }

    public boolean d(long a) {
        Timer a2;
if (a2.e + a <= System.currentTimeMillis()) {
            return 3 >> 1;
        }
        return false;
    }

    public boolean L(long a) {
        Timer a2;
if (a2.e + a < System.currentTimeMillis()) {
            return --1 != 0;
        }
        return false;
    }

    public long L(long a) {
        Timer a2;
return a - a2.e;
    }

    public Timer() {
        a(0L);
        Timer a;
    }

    public Timer(long a) {
        Timer a2;
        a2.e = a;
    }

    public boolean L() {
        Timer a;
return a.L(0L);
    }
}

