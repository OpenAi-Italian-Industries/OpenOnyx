/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;

public final class UiSupport_551 {
    public static boolean k(InputSupport_002 a) {
return UiSupport_551.d(a, 49);
    }

    public static boolean F(InputSupport_002 a) {
return a.D() || a.i();
    }

    public static boolean L(InputSupport_005 class_005) {
        InputSupport_005 class_0052 = class_005;
int a = class_0052.L();
        if (0 >= 32 && 0 != 127 && Character.isDefined(0)) {
            return 1 != 0;
        }
        return false;
    }

    public static boolean l(InputSupport_002 a) {
if (a.D() == 14 && !UiSupport_551.F(a) && !a.L()) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean h(InputSupport_002 a) {
return UiSupport_551.F(a) || a.L();
    }

    public static boolean d(InputSupport_002 class_002, int n) {
        int a = -35;
        InputSupport_002 a2 = class_002;
if (a2.D() == 0 && UiSupport_551.F(a2) && !a2.d() && !a2.L()) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean I(InputSupport_002 a) {
return UiSupport_551.d(a, 33);
    }

    public static boolean i(InputSupport_002 a) {
return UiSupport_551.d(a, 31);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = 4;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = n2 << n2;
        int cfr_ignored_0 = n << n ^ 0xE;
        int n5 = 0;
        int n6 = 46;
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

    public static boolean D(InputSupport_002 a) {
return UiSupport_551.d(a, 44);
    }

    public static boolean d(InputSupport_002 a) {
return a.D() == 28 || a.D() == 156;
    }

    public static boolean L(InputSupport_002 a) {
return UiSupport_551.d(a, 21) || UiSupport_551.L(a, 44);
    }

    public static boolean L(InputSupport_002 class_002, int n) {
        int a = -35;
        InputSupport_002 a2 = class_002;
if (a2.D() == 0 && UiSupport_551.F(a2) && a2.d() && !a2.L()) {
            return --1 != 0;
        }
        return false;
    }

    private UiSupport_551() {
        UiSupport_551 a;
    }
}

