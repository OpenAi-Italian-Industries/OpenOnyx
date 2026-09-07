/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureMode_339;
import openonyx.render.RenderSupport_103;

public final class UiSupport_546 {
    final public static String u = "\ue566";
    final public static String y = "\ue5c4";
    final public static String n = "\ue87d";
    final public static String Y = "\ue7fe";
    final public static String r = "\ue640";
    final public static String W = "\ue7fd";
    final public static String P = "\ue9e0";
    final public static String V = "\ue5d5";
    final public static String R = "\ue8f4";
    final public static String p = "\ue5cd";
    final public static String t = "\ue8b6";
    final public static String b = "\ue5ca";
    final public static String E = "\uea77";
    final public static String F = "\ue001";
    final public static String G = "\ue9ba";
    private final static float A = 0.06f;
    final public static String K = "\ue8b8";
    final public static String B = "\ue14d";
    final public static String C = "\ue872";
    final public static String J = "\ue7f4";
    final public static String D = "\ue73c";
    final public static String c = "\ue161";
    final public static String a = "\uea4b";
    final public static String k = "\ue88e";
    final public static String g = "\ue875";
    final public static String M = "\ue405";
    final public static String L = "\ue002";
    final public static String j = "\ue871";
    final public static String m = "\ue145";
    final public static String h = "\ue2c4";
    final public static String l = "\ue2c8";
    final public static String I = "\ue5d4";
    final public static String d = "\ue9e4";
    final public static String i = "\ue5cf";
    final public static String f = "\ue202";
    final public static String H = "\ue89e";
    final public static String e = "\ue312";

    /*
     * WARNING - void declaration
     */
    public static void I(RenderSupport_103 class_103, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        RenderSupport_103 a5 = class_103;
a5.L(y, (float)a4, (float)a3, (float)a2, 1);
    }

    /*
     * WARNING - void declaration
     */
    public static void i(RenderSupport_103 class_103, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        RenderSupport_103 a5 = class_103;
a5.L(i, (float)a4, (float)a3, (float)a2, 1);
    }

    /*
     * WARNING - void declaration
     */
    public static void D(RenderSupport_103 class_103, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        RenderSupport_103 a5 = class_103;
a5.L(p, (float)a4, (float)a3, (float)a2, 1);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, FeatureMode_339 enum_339, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int n2 = 0;
        RenderSupport_103 a6 = class_103;
a6.L(UiSupport_546.L((FeatureMode_339)a5), (float)a4, (float)a3, 0.0f, 1);
    }

    private static String L(FeatureMode_339 a) {
switch (a) {
            default: {
                throw new MatchException(null, null);
            }
            case I: {
                while (false) {
                }
                return d;
            }
            case f: {
                return W;
            }
            case i: {
                return r;
            }
            case l: {
                return f;
            }
            case d: {
                return g;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void d(RenderSupport_103 class_103, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        RenderSupport_103 a5 = class_103;
void v0 = a4;
        a5.L(b, (float)a3, 0.0f, (float)v0, 1, (float)(v0 * 0.06f));
    }

    private static String L(ModuleCategory a) {
switch (a) {
            default: {
                throw new MatchException(null, null);
            }
            case d: {
                while (false) {
                }
                return P;
            }
            case H: {
                return u;
            }
            case i: {
                return W;
            }
            case f: {
                return R;
            }
            case l: {
                return j;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, ModuleCategory enum_226, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int n2 = 0;
        RenderSupport_103 a6 = class_103;
a6.L(UiSupport_546.L((ModuleCategory)a5), (float)a4, (float)a3, 0.0f, 1);
    }

    private UiSupport_546() {
        UiSupport_546 a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 58;
        int cfr_ignored_0 = n << n ^ 3;
        int n4 = 1;
        int n5 = 39;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (1 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 1;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        RenderSupport_103 a5 = class_103;
a5.L(t, (float)a4, (float)a3, (float)a2, 1);
    }
}

