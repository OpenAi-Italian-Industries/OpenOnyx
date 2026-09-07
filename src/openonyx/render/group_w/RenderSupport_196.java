/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import java.util.Random;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import openonyx.core.OnyxClient;
import openonyx.events.ChatTransformer;
import openonyx.features.hud.CustomGui;
import openonyx.features.hud.FeatureMode_343;
import openonyx.render.group_e.RenderSupport_126;
import openonyx.render.group_e.RenderSupport_127;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_e.RenderSupport_129;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.render.group_w.RenderSupport_198;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_196 {
    private final static Random g = new Random();
    private final static float M = 1.0f;
    private static RenderMode_130 L;
    private final static int j = 0xFCFCFC;
    private static float m;
    private static RenderSupport_128 h;
    private final static float l = 0.2f;
    private static RenderSupport_128 I;
    private final static float d = 7.0f;
    private final static float i = 7.0f;
    private static boolean f;
    private final static String H = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static boolean e;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static float L(FontRenderer fontRenderer, char c, float f2, float f3, int n, boolean bl) {
        float a2;
        char a2 = c;
        FontRenderer a3 = fontRenderer;
String string = String.valueOf(a2);
        e = 1;
        try {
            void a4;
            void a5;
            void a6;
            void a7;
            a3.drawString(string, (float)a7, (float)a6, (int)a5, 0 != 0);
            a2 = (float)a3.getCharWidth(a2) + (a4 != false ? a3.offsetBold : 0.0f);
            e = 0;
        }
        catch (Throwable throwable) {
            e = 0;
            GlStateManager.enableTexture2D();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            throw throwable;
        }
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        return a2;
    }

    public static boolean L(char c) {
        char c2 = c;
try {
            return c2 == 167 || c2 == 32 || RenderSupport_196.L(0 != 0).L().d(c2);
        }
        catch (Throwable a) {
            f = 1;
            OnyxClient.H.warn("Custom GUI font stood down to the bitmap font after a failure", a);
            return 0 != 0;
        }
    }

    public static float L(char c) {
        char c2 = c;
if (c2 == 167) {
            return -1.0f;
        }
        RenderSupport_128 a = RenderSupport_196.L(false);
        return a.L().D(c2) * a.L() + RenderSupport_196.L();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void L(FontRenderer fontRenderer, String string, float f2, float f3, int n, boolean bl) {
        int n2;
        void a;
        int n3;
        void a2;
        FontRenderer fontRenderer2 = fontRenderer;
if (a2.isEmpty()) {
            return;
        }
        RenderSupport_128 a222 = RenderSupport_196.L(false);
        RenderSupport_127 class_127 = a222.L();
        RenderSupport_127 class_1272 = RenderSupport_196.L(--1 != 0).L();
        int n4 = 0;
        while (n4 < a2.length()) {
            class_127.d(a2.charAt(0));
            class_1272.d(a2.charAt(n3++));
            n4 = 0;
        }
        if (class_127.L() == -1) {
            return;
        }
        float f4 = a222.L();
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        int a222 = a;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        while (true) {
            if (n10 >= a2.length()) {
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.resetColor();
                return;
            }
            char c = a2.charAt(0);
            if (c == 167 && 0 < a2.length() - 1) {
                int n11;
                if ((n11 = "0123456789abcdef".indexOf(var17_24 = Character.toLowerCase(a2.charAt(++n2)))) >= 0) {
                    void a3;
                    var13_19 = var14_21 = 0;
                    var12_17 = var14_21;
                    var11_15 = var14_21;
                    var10_13 = var14_21;
                    int n12 = fontRenderer2.getColorCode(var17_24);
                    a222 = a & 0xFF000000 | (a3 != false ? (n12 & 0xFCFCFC) >> 2 : n12) & 0xFFFFFF;
                } else {
                    switch (var17_24) {
                        case 'k': {
                            var12_17 = true;
                            break;
                        }
                        case 'l': {
                            var10_13 = true;
                            break;
                        }
                        case 'm': {
                            var14_21 = true;
                            break;
                        }
                        case 'n': {
                            var13_19 = true;
                            break;
                        }
                        case 'o': {
                            var11_15 = true;
                            break;
                        }
                        case 'r': {
                            var14_21 = false;
                            var13_19 = false;
                            var12_17 = false;
                            var11_15 = false;
                            var10_13 = false;
                            a222 = a;
                            break;
                        }
                    }
                }
            } else {
                char c2 = var17_24 = var12_17 ? RenderSupport_196.L(c) : c;
                if (!RenderSupport_196.L(var17_24)) {
                    void v3 = a;
                    a = v3 + (RenderSupport_196.L(fontRenderer2, var17_24, (float)v3, (float)a, 0, var10_13) + RenderSupport_196.L());
                } else {
                    RenderSupport_127 class_1273 = var10_13 ? class_1272 : class_127;
                    float f5 = class_127.D(c) * f4 + RenderSupport_196.L() + (var10_13 ? RenderSupport_196.L(fontRenderer2) : 0.0f);
                    RenderSupport_196.L(class_1273, var17_24, (float)a, (float)a, f4, 0, var11_15);
                    if (var14_21) {
                        RenderSupport_196.L((float)a, (float)(a + 3.8500001f), f5, 0);
                    }
                    if (var13_19) {
                        RenderSupport_196.L((float)a, (float)(a + 7.0f + 1.0f), f5, 0);
                    }
                    a += f5;
                }
            }
            n10 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int d(FontRenderer fontRenderer, String string, float f2, float f3, int n, boolean bl) {
        void a;
        void a2;
        void a3;
        int a4;
        void a5;
        int n2 = 0;
        FontRenderer a6 = fontRenderer;
if (a5 == null) {
            return 0;
        }
        if ((a4 & 0xFC000000) == 0) {
            a4 |= 0xFF000000;
        }
        if (a3 != false) {
            RenderSupport_196.L(a6, (String)a5, (float)(a2 + 1.0f), (float)(a + 1.0f), RenderSupport_196.L(a4), 1 != 0);
        }
        RenderSupport_196.L(a6, (String)a5, (float)a2, (float)a, a4, 3 >> 2);
        return (int)(a2 + (float)RenderSupport_196.L(a6, (String)a5));
    }

    private static float L(FontRenderer fontRenderer, char c) {
        char a3 = c;
        FontRenderer a2 = fontRenderer;
e = 1;
        try {
            float a3 = a2.getCharWidth(a3);
            e = 0;
            return a3;
        }
        catch (Throwable throwable) {
            e = 0;
            throw throwable;
        }
    }

    private static char L(char a) {
if (a == 32) {
            return a;
        }
        return H.charAt(g.nextInt(H.length()));
    }

    private static RenderMode_130 L(RenderMode_130 a) {
switch (a) {
            case d: {
                while (false) {
                }
                return RenderMode_130.i;
            }
            case j: {
                return RenderMode_130.e;
            }
        }
        return RenderMode_130.e;
    }

    private static RenderSupport_128 L(boolean bl) {
        RenderMode_130 enum_130;
        boolean bl2 = bl;
CustomGui class_344 = RenderSupport_198.L();
        float a = class_344 == null ? 1.0f : class_344.e.i.L();
        RenderMode_130 enum_1302 = enum_130 = class_344 == null ? RenderMode_130.d : ((FeatureMode_343)class_344.e.f.L()).L();
        if (I == null || 0 != m || enum_130 != L) {
            RenderMode_130 enum_1303 = enum_130;
            float f2 = 0;
            I = RenderSupport_196.L(enum_1303, f2);
            h = RenderSupport_196.L(RenderSupport_196.L(enum_1303), 0);
            m = f2;
            L = enum_1303;
        }
        if (bl2) {
            return h;
        }
        return I;
    }

    private static float L() {
CustomGui class_344 = RenderSupport_198.L();
        if (class_344 == null) {
            return 0.0f;
        }
        return class_344.e.H.L();
    }

    /*
     * WARNING - void declaration
     */
    public static int L(FontRenderer fontRenderer, String string, float f2, float f3, int n, boolean bl) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        FontRenderer fontRenderer2 = fontRenderer;
try {
            return RenderSupport_196.d(fontRenderer2, (String)a5, (float)a4, (float)a3, 0, (boolean)a);
        }
        catch (Throwable a6) {
            f = 1;
            e = 0;
            OnyxClient.H.warn("Custom GUI font stood down to the bitmap font after a failure", a6);
            return fontRenderer2.drawString((String)a5, (float)a4, (float)a3, 0, (boolean)a);
        }
    }

    private RenderSupport_196() {
        RenderSupport_196 a;
    }

    public static void L() {
I = null;
        h = null;
        f = 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int L(FontRenderer fontRenderer, String string) {
        int n;
        void a;
        FontRenderer fontRenderer2 = fontRenderer;
if (a == null || a.isEmpty()) {
            return 0;
        }
        float a2 = 0.0f;
        int n2 = 0;
        int n3 = 0;
        while (n3 < a.length()) {
            char c = a.charAt(0);
            if (c == 167 && 0 < a.length() - 1) {
                char c2;
                if ((c2 = Character.toLowerCase(a.charAt(++n))) == 108) {
                    n2 = 1;
                } else if (c2 == 114 || "0123456789abcdef".indexOf(c2) >= 0) {
                    n2 = 0;
                }
            } else {
                a2 += RenderSupport_196.L(c) ? RenderSupport_196.L(c) : RenderSupport_196.L(fontRenderer2, c) + RenderSupport_196.L();
                if (n2 != 0) {
                    a2 += fontRenderer2.offsetBold;
                }
            }
            n3 = ++n;
        }
        return Math.round(4.0f);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(float f2, float f3, float f4, int n) {
        void a;
        void a2;
        int a3 = 0;
        float a4 = f2;
GlStateManager.disableTexture2D();
        GL11.glColor4f((float)(a3 >> 16 & 0xFF) / 255.0f, (float)(a3 >> 8 & 0xFF) / 255.0f, (float)(a3 & 0xFF) / 255.0f, (float)(a3 >>> 24) / 255.0f);
        GL11.glBegin(7);
        GL11.glVertex2f(a4, (float)a2);
        GL11.glVertex2f(a4, (float)(a2 + 1.0f));
        GL11.glVertex2f(a4 + a, (float)(a2 + 1.0f));
        GL11.glVertex2f(a4 + a, (float)a2);
        GL11.glEnd();
        GlStateManager.enableTexture2D();
    }

    private static int L(int a) {
return a & 0xFF000000 | (a & 0xFCFCFC) >> 2;
    }

    public static boolean d() {
if (f || e || !RenderSupport_198.l()) {
            return false;
        }
        CustomGui class_344 = RenderSupport_198.L();
        if (class_344 != null && class_344.d() && class_344.e.D()) {
            return 5 >> 2;
        }
        return false;
    }

    private static float L(FontRenderer a) {
return a.offsetBold;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_127 class_127, char c, float f2, float f3, float f4, int n, boolean bl) {
        void a;
        void a32;
        void a2;
        void a4;
        void a5;
        char a222 = c;
        RenderSupport_127 a6 = class_127;
RenderSupport_129 a222 = a6.d(a222);
        if (a222.L()) {
            return;
        }
        int n2 = a6.L();
        if (n2 == -1) {
            return;
        }
        GlStateManager.bindTexture(n2);
        GL11.glColor4f((float)(a5 >> 16 & 0xFF) / 255.0f, (float)(a5 >> 8 & 0xFF) / 255.0f, (float)(a5 & 0xFF) / 255.0f, (float)(a5 >>> 24) / 255.0f);
        a5 = a4 + 7.0f + a222.k() * a2;
        void var7_13 = (a += a222.D() * a2) + a222.i() * a2;
        a2 = a5 + a222.h() * a2;
        float f5 = a32 != false ? (a4 + 7.0f - a5) * 0.2f : 0.0f;
        float a32 = a32 != false ? (a4 + 7.0f - a2) * 0.2f : 0.0f;
        GL11.glBegin(7);
        void v0 = var7_13;
        void v1 = a;
        RenderSupport_129 class_129 = a222;
        GL11.glTexCoord2f(a222.l(), class_129.F());
        GL11.glVertex2f((float)(v1 + f5), (float)a5);
        RenderSupport_129 class_1292 = a222;
        GL11.glTexCoord2f(class_129.l(), class_1292.d());
        GL11.glVertex2f((float)(v1 + a32), (float)a2);
        GL11.glTexCoord2f(class_1292.I(), a222.d());
        GL11.glVertex2f((float)(v0 + a32), (float)a2);
        GL11.glTexCoord2f(a222.I(), a222.F());
        GL11.glVertex2f((float)(v0 + f5), (float)a5);
        GL11.glEnd();
    }

    public static boolean L() {
CustomGui class_344 = RenderSupport_198.L();
        return class_344 == null || class_344.e.e.d();
    }

    /*
     * WARNING - void declaration
     */
    private static RenderSupport_128 L(RenderMode_130 enum_130, float f2) {
        void a;
        float f3;
        RenderMode_130 enum_1302 = enum_130;
Enum a2 = RenderMode_131.f;
        float f4 = RenderSupport_126.L((RenderMode_131)a2, enum_1302).d() / ((RenderMode_131)a2).L();
        float f5 = f3 > 0.0f ? 7.0f / f4 : ((RenderMode_131)a2).L();
        return new RenderSupport_128((RenderMode_131)a2, enum_1302, f5 * a, 9.0f);
    }
}

