/*
 * Decompiled with CFR.
 */
package openonyx.render;

import openonyx.core.OnyxClient;
import openonyx.render.RenderSupport_101;
import openonyx.render.RenderSupport_103;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_120 {
    public static boolean L() {
if (RenderSupport_101.L() && OnyxClient.l != null && OnyxClient.l.k.e.d()) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, float f2, float f3, float f4, float f5, float f6, int n, boolean bl) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        int n2 = n;
        RenderSupport_103 a8 = class_103;
RenderSupport_103 class_1032 = a8;
        if (RenderSupport_120.L((boolean)a7)) {
            class_1032.L((float)a6, (float)a5, (float)a4, (float)a3, (float)a2, 0);
            return;
        }
        class_1032.D((float)a6, (float)a5, (float)a4, (float)a3, (float)a2, 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        int n2 = n;
        RenderSupport_103 a7 = class_103;
RenderSupport_120.L(a7, (float)a6, (float)a5, (float)a4, (float)a3, (float)a2, 0, 1 != 0);
    }

    public static void d() {
if (RenderSupport_120.L()) {
            RenderSupport_101.d();
        }
    }

    public static boolean L(boolean a) {
if (a && RenderSupport_120.L()) {
            return 3 >> 1;
        }
        return false;
    }

    private RenderSupport_120() {
        RenderSupport_120 a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 119;
        int cfr_ignored_0 = n << n ^ 0xA;
        int n4 = 0;
        int n5 = 116;
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

    public static void L(boolean a) {
if (RenderSupport_120.L(a)) {
            RenderSupport_101.D();
        }
    }

    public static void L() {
RenderSupport_120.L(1 != 0);
    }
}

