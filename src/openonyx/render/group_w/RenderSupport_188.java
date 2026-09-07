/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.render.group_w.RenderMode_199;

public final class RenderSupport_188 {
    private final static int[] j;
    private final static float m = 0.26f;
    private final static float h = 7.0f;
    private final static float l = 0.5f;
    private final static String I = "0123456789abcdef";
    private final static char d = '\u00a7';
    private final static float i = 2.0f;
    private final static float f = 0.8f;
    private final static float H = 0.12f;
    private final static float e = 1.0f;

    static {
        int[] nArray = new int[16];
        nArray[0] = -16777216;
        nArray[1] = -16777046;
        nArray[2] = -16733696;
        nArray[3] = -16733526;
        nArray[4] = -5636096;
        nArray[5] = -5635926;
        nArray[6] = -22016;
        nArray[7] = -5592406;
        nArray[8] = -11184811;
        nArray[9] = -11184641;
        nArray[10] = -11141291;
        nArray[11] = -11141121;
        nArray[12] = -43691;
        nArray[13] = -43521;
        nArray[14] = -171;
        nArray[15] = -1;
        j = nArray;
    }

    private static RenderMode_199 L(RenderSupport_128 class_128, char c) {
        char a = c;
        RenderSupport_128 a2 = class_128;
if (a2.L().d(a)) {
            return RenderMode_199.H;
        }
        if (RenderSupport_188.L(a) != null) {
            return RenderMode_199.e;
        }
        return RenderMode_199.f;
    }

    /*
     * WARNING - void declaration
     */
    private static float L(RenderSupport_128 class_128, String string) {
        void a;
        RenderSupport_128 class_1282 = class_128;
FontRenderer a2 = Minecraft.getMinecraft().fontRendererObj;
        if (a2 == null) {
            return 0.0f;
        }
        return (float)a2.getStringWidth((String)a) * (class_1282.i() / 7.0f);
    }

    /*
     * WARNING - void declaration
     */
    private static float d(RenderSupport_103 class_103, RenderSupport_128 class_128, String string) {
        void a;
        int n;
        void a22;
        RenderSupport_103 class_1032 = class_103;
float a22 = a22.i() / 0.8f;
        float a3 = 0.0f;
        int n2 = 0;
        while (n2 < a.length()) {
            float f2 = class_1032.L(RenderSupport_188.L(a.charAt(0)), a22);
            a3 += f2 + 1.0f;
            n2 = ++n;
        }
        return a3;
    }

    private static String L(char a) {
switch (a) {
            case '\u2611': 
            case '\u2705': 
            case '\u2713': 
            case '\u2714': {
                while (false) {
                }
                return "\ue5ca";
            }
            case '\u2612': 
            case '\u2715': 
            case '\u2716': 
            case '\u2717': 
            case '\u2718': 
            case '\u274c': {
                return "\ue5cd";
            }
        }
        return null;
    }

    public static String L(String string) {
        int a;
        String string2 = string;
if (string2 == null || string2.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        int n = 0;
        while (n < string2.length()) {
            char c = string2.charAt(0);
            if (c == 167 && 0 < string2.length() - 1) {
                ++a;
            } else {
                stringBuilder.append(c);
            }
            n = ++a;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static float F(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = class_103;
return RenderSupport_188.l(a6, (RenderSupport_128)a4, a5, (float)(a3 - RenderSupport_188.L(a6, (RenderSupport_128)a4, a5)), (float)a2, (int)a);
    }

    private RenderSupport_188() {
        RenderSupport_188 a;
    }

    private static int L(float a) {
return (int)(Math.clamp(a, 0.0f, 1.0f) * 255.0f) << 24;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static float L(RenderSupport_103 class_103, RenderSupport_128 class_128, String string) {
        int n;
        void a;
        Object a2 = string;
        RenderSupport_103 a3 = class_103;
a2 = RenderSupport_188.L((String)a2);
        if (((String)a2).isEmpty()) {
            return 0.0f;
        }
        float f2 = 0.0f;
        int n2 = 0;
        RenderMode_199 enum_199 = RenderSupport_188.L((RenderSupport_128)a, ((String)a2).charAt(0));
        int n3 = 1;
        while (n3 <= ((String)a2).length()) {
            RenderMode_199 enum_1992;
            RenderMode_199 enum_1993 = enum_1992 = 1 < ((String)a2).length() ? RenderSupport_188.L((RenderSupport_128)a, ((String)a2).charAt(1)) : null;
            if (1 >= ((String)a2).length() || enum_1992 != enum_199) {
                String string2 = ((String)a2).substring(n2, 1);
                f2 += (switch (enum_199.ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> a3.L((RenderSupport_128)a, string2);
                    case 1 -> RenderSupport_188.d(a3, (RenderSupport_128)a, string2);
                    case 2 -> RenderSupport_188.L((RenderSupport_128)a, string2);
                });
                n2 = 1;
                enum_199 = enum_1992;
            }
            n3 = ++n;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    public static float l(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        int n2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = class_103;
if (a5 == null || a5.isEmpty()) {
            return 0.0f;
        }
        int n3 = a4 & 0xFF000000;
        int n4 = a4;
        void var8_8 = a3;
        int n5 = 0;
        int n6 = 0;
        while (n6 < a5.length()) {
            if (a5.charAt(0) == 167 && 0 < a5.length() - 1) {
                var8_8 += RenderSupport_188.L(a6, (RenderSupport_128)a2, a5, n5, 0, (float)var8_8, (float)a, n4);
                char c = Character.toLowerCase(a5.charAt(1));
                int n7 = I.indexOf(c);
                if (n7 >= 0) {
                    n4 = n3 | j[n7] & 0xFFFFFF;
                } else if (c == 114) {
                    n4 = a4;
                }
                n5 = ++n2 + 1;
            }
            n6 = ++n2;
        }
        Object object = a5;
        var8_8 += RenderSupport_188.L(a6, (RenderSupport_128)a2, (String)object, n5, ((String)object).length(), (float)var8_8, (float)a, n4);
        return (float)(var8_8 - a3);
    }

    /*
     * WARNING - void declaration
     */
    public static float h(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = class_103;
if (a5 == null || a5.isEmpty()) {
            return 0.0f;
        }
        String string2 = RenderSupport_188.L(a5);
        float f4 = (float)(a4 >>> 24) / 255.0f;
        RenderSupport_103 class_1032 = a6;
        RenderSupport_188.l(class_1032, (RenderSupport_128)a3, string2, (float)(a2 + 2.0f), (float)(a + 2.0f), RenderSupport_188.L(0.12f * f4));
        RenderSupport_188.l(a6, (RenderSupport_128)a3, string2, (float)(a2 + 1.0f), (float)(a + 1.0f), RenderSupport_188.L(0.26f * f4));
        return RenderSupport_188.l(class_1032, (RenderSupport_128)a3, a5, (float)a2, (float)a, (int)a4);
    }

    /*
     * WARNING - void declaration
     */
    private static float I(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        int n2;
        void a2;
        void a3;
        void a222;
        float f4 = f3;
        RenderSupport_103 a4 = class_103;
float f5 = a222.i() / 0.8f;
        float a222 = a4.L((RenderSupport_128)a222, (float)a3) - a222.i() / 2.0f;
        a3 = a2;
        int n3 = 0;
        while (n3 < a.length()) {
            void a5;
            String string2 = RenderSupport_188.L(a.charAt(0));
            RenderSupport_103 class_1032 = a4;
            float f6 = class_1032.L(string2, f5) + 1.0f;
            class_1032.L(string2, (float)(a3 + f6 / 2.0f), a222, f5, (int)a5);
            a3 += f6;
            n3 = ++n2;
        }
        return (float)(a3 - a2);
    }

    /*
     * WARNING - void declaration
     */
    public static float i(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = class_103;
return RenderSupport_188.l(a6, (RenderSupport_128)a4, a5, (float)(a3 - RenderSupport_188.L(a6, (RenderSupport_128)a4, a5) / 2.0f), (float)a2, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    private static float D(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = class_103;
RenderSupport_103 class_1032 = a6;
        class_1032.i((RenderSupport_128)a4, a5, (float)a3, (float)a2, (int)a);
        return class_1032.L((RenderSupport_128)a4, a5);
    }

    /*
     * WARNING - void declaration
     */
    private static float d(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a322;
        RenderSupport_103 class_1032 = class_103;
FontRenderer a222 = Minecraft.getMinecraft().fontRendererObj;
        if (a222 == null) {
            return 0.0f;
        }
        float a222 = a322.i() / 7.0f;
        RenderSupport_103 class_1033 = class_1032;
        float a322 = class_1033.L((RenderSupport_128)a322, (float)a4) - 0.0f;
        RenderSupport_166.L();
        class_1033.F();
        class_1033.L((float)a3, a322);
        class_1033.L(0, 0.0f, 0.0f);
        void v1 = a2;
        a222.drawString((String)v1, 0.0f, 0.0f, (int)a, 0 != 0);
        class_1032.k();
        return RenderSupport_188.L((RenderSupport_128)a322, (String)v1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static float L(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, int n, int n2, float f2, float f3, int n3) {
        void a;
        void a2;
        void a3;
        void a4;
        int a5 = 0;
        RenderSupport_103 a6 = class_103;
if (a4 <= a5) {
            return 0.0f;
        }
        void var8_10 = a3;
        int n4 = a5;
        RenderMode_199 enum_199 = RenderSupport_188.L((RenderSupport_128)a2, a.charAt(a5));
        int n5 = a5 = a5 + 1;
        while (n5 <= a4) {
            RenderMode_199 enum_1992;
            RenderMode_199 enum_1993 = enum_1992 = a5 < a4 ? RenderSupport_188.L((RenderSupport_128)a2, a.charAt(a5)) : null;
            if (a5 >= a4 || enum_1992 != enum_199) {
                String string2 = a.substring(n4, a5);
                var8_10 += (switch (enum_199.ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> {
                        void a;
                        void a;
                        yield RenderSupport_188.D(a6, (RenderSupport_128)a2, string2, (float)var8_10, (float)a, (int)a);
                    }
                    case 1 -> {
                        void a;
                        void a;
                        yield RenderSupport_188.I(a6, (RenderSupport_128)a2, string2, (float)var8_10, (float)a, (int)a);
                    }
                    case 2 -> {
                        void a;
                        void a;
                        yield RenderSupport_188.d(a6, (RenderSupport_128)a2, string2, (float)var8_10, (float)a, (int)a);
                    }
                });
                n4 = a5;
                enum_199 = enum_1992;
            }
            n5 = ++a5;
        }
        return (float)(var8_10 - a3);
    }

    /*
     * WARNING - void declaration
     */
    public static float L(RenderSupport_103 class_103, RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = class_103;
return RenderSupport_188.h(a6, (RenderSupport_128)a4, a5, (float)(a3 - RenderSupport_188.L(a6, (RenderSupport_128)a4, a5) / 2.0f), (float)a2, (int)a);
    }
}

