/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.configuration;

import lombok.Generated;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Event {
    private boolean e = 0;

    public void L() {
a.e = 1;
    }

    @Generated
    public boolean L() {
        Event a;
return a.e;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 1;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 44;
        int cfr_ignored_0 = 0x60 ^ n << n;
        int n4 = 0;
        int n5 = 57;
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

    public Event() {
        Event a;
    }
}

