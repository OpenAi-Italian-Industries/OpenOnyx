/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector4f
 */
package openonyx.render;

import java.nio.FloatBuffer;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FeatureSupport_274;
import openonyx.features.render.Hand;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_160;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_102
implements OnyxListener_001 {
    private final static float y = 0.07f;
    private final static float n = 0.03f;
    private final static Matrix4f Y;
    private static boolean r;
    private static float W;
    private static float P;
    private final static float V = 70.0f;
    private static float R;
    private static boolean p;
    private final static RenderSupport_121 t;
    private static float b;
    private static float E;
    private final static float F = 0.08f;
    private final static RenderSupport_121 G;
    private final static float A = 1.05f;
    private static float K;
    private static long B;
    private static boolean C;
    private final static FloatBuffer J;
    private final static RenderSupport_121 D;
    private final static float c = 0.05f;
    private static float a;
    private static boolean k;
    private final static float g = 55.0f;
    private final static float M = 70.0f;
    private final static float L = 22.0f;
    private static boolean j;
    private static float m;
    private static float h;
    private final static float l = 14.0f;
    private final static float I = 72.0f;
    private static boolean d;
    private final static float i = 30.0f;
    private static float f;
    private final static Matrix4f H;
    private static float e;

    private static float d() {
long l = System.nanoTime();
        long l2 = B;
        B = l;
        if (l2 == 0L) {
            return 0.0f;
        }
        return Math.min((float)(l - l2) / 1000000.0f, 100.0f);
    }

    private RenderSupport_102() {
        RenderSupport_102 a;
    }

    private static RenderSupport_160 L() {
        FeatureSupport_274 class_274;
if (OnyxClient.l == null || RenderSupport_102.e.thePlayer == null) {
            return null;
        }
        Hand class_320 = OnyxClient.l.d;
        if (!class_320.d()) {
            return null;
        }
        FeatureSupport_274 class_2742 = class_274 = class_320.e;
        FeatureSupport_274 class_2743 = class_274;
        FeatureSupport_274 class_2744 = class_274;
        return new RenderSupport_160(class_2742.h, class_2742.e, class_2743.i, class_2743.H, class_2744.d, class_2744.f);
    }

    public static boolean L(double a) {
if (!C && !p) {
            return 5 >> 3;
        }
        RenderSupport_160 class_160 = RenderSupport_102.L();
        if (class_160 == null) {
            return 0 != 0;
        }
        if (GuiScreen.isShiftKeyDown()) {
            if (class_160.d()) {
                RenderSupport_160 class_1602 = class_160;
                class_1602.e.i((Double)class_1602.e.L() + a * (double)0.03f);
            }
        } else if (class_160.L()) {
            double d = Math.pow(1.05f, a);
            RenderSupport_160 class_1603 = class_160;
            RenderSupport_102.L(class_1603.D(), d, a);
            RenderSupport_102.L(class_1603.i(), d, a);
            RenderSupport_102.L(class_1603.d(), d, a);
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3) {
        void a;
        void a2;
        void a3;
        float f4;
        RenderSupport_103 class_1032 = class_103;
float f5 = t.L();
        if (f4 <= 0.01f) {
            return;
        }
        RenderSupport_160 class_160 = RenderSupport_102.L();
        if (class_160 == null) {
            return;
        }
        float a4 = RenderSupport_102.L((float)a3);
        a2 = a2 / 2.0f + f / a4;
        a3 = a3 / 2.0f - W / a4 - 30.0f;
        a4 = G.L();
        float f6 = 14.0f + 4.0f * a4;
        int n = a.E();
        RenderSupport_103 class_1033 = class_1032;
        void v2 = a2;
        class_1032.L(f5);
        class_1032.L((float)v2, (float)a3, f6, ThemeSupport_059.L(n, 0.05f + 0.13f * a4));
        class_1033.L((float)v2, (float)a3, f6, 1.5f, ThemeSupport_059.L(n, 0.4f + 0.5f * a4));
        class_1033.L((float)a2, (float)a3, 1.5f + a4, ThemeSupport_059.L(n, 0.6f + 0.4f * a4));
        if (a4 > 0.01f) {
            CharSequence charSequence = new StringBuilder();
            if (class_160.d()) {
                Object[] objectArray = new Object[3];
                objectArray[0] = class_160.I.L();
                objectArray[1] = class_160.d.L();
                objectArray[2] = class_160.e.L();
                ((StringBuilder)charSequence).append(String.format(Locale.ROOT, "%.2f  %.2f  %.2f", objectArray));
            }
            if (class_160.L()) {
                if (((StringBuilder)charSequence).length() > 0) {
                    ((StringBuilder)charSequence).append("  ");
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = class_160.H.L();
                ((StringBuilder)charSequence).append(String.format(Locale.ROOT, "x%.2f", objectArray));
            }
            charSequence = ((StringBuilder)charSequence).toString();
            RenderSupport_103 class_1034 = class_1032;
            float f7 = class_1034.L(ThemeSupport_057.j, (String)charSequence) + 14.0f;
            a3 = a3 + f6 + 7.0f;
            class_1034.L(a4);
            class_1034.D((float)(a2 - f7 / 2.0f), (float)a3, f7, 17.0f, 8.5f, a.O());
            class_1034.L(ThemeSupport_057.j, (String)charSequence, (float)a2, (float)(a3 + 8.5f), a.d());
            class_1034.e();
        }
        class_1032.e();
    }

    static {
        J = BufferUtils.createFloatBuffer(16);
        Y = new Matrix4f();
        H = new Matrix4f();
        D = new RenderSupport_121(0.0f);
        G = new RenderSupport_121(0.0f);
        t = new RenderSupport_121(0.0f);
        a = 1.0f;
    }

    private static void L(float f2, boolean bl) {
        int a;
        float f3 = f2;
float a2 = (float)Math.exp(-f3 / 70.0f);
        a = a != 0 && d && r && RenderSupport_102.L() != null ? 1 : 0;
        t.L(a != 0 ? 1.0f : 0.0f, 200.0f, RenderSupport_123.f);
        t.L(f3);
        G.L(j ? 1.0f : 0.0f, 150.0f, RenderSupport_123.f);
        G.L(f3);
        D.L(p ? 1.0f : 0.0f, p ? 250.0f : 200.0f, p ? RenderSupport_123.H : RenderSupport_123.f);
        D.L(f3);
        if (p) {
            return;
        }
        R *= a2;
        h *= a2;
        b *= a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(float f2, float f3, float f4) {
        void a;
        float a2;
        float f5 = f2;
RenderSupport_160 a3 = RenderSupport_102.L();
        if (a3 == null || !a3.d()) {
            p = false;
            return;
        }
        float f6 = RenderSupport_102.L(RenderSupport_102.a);
        K = RenderSupport_102.L(K + (f5 - m) * f6, a3.I);
        e = RenderSupport_102.L(e - (a2 - P) * f6, a3.d);
        m = f5;
        P = a2;
        a2 = 1.0f - (float)Math.exp((double)(-a / 55.0f));
        RenderSupport_160 class_160 = a3;
        R = RenderSupport_102.L(class_160.I, R, K, a2);
        h = RenderSupport_102.L(class_160.d, h, e, a2);
    }

    private static boolean d() {
if (!(RenderSupport_102.e.currentScreen instanceof GuiChat)) {
            return 5 >> 3;
        }
        if (RenderSupport_102.e.thePlayer == null) {
            return 0 != 0;
        }
        if (RenderSupport_102.e.gameSettings.thirdPersonView != 0) {
            return 3 >> 2;
        }
        if (OnyxClient.l == null) {
            return 3 >> 2;
        }
        return OnyxClient.l.d.d();
    }

    public static void D() {
d = 1;
        float f2 = D.L();
        GlStateManager.translate(R, h + 0.05f * f2, b + 0.07f * f2);
    }

    public static void d() {
Matrix4f.invert((Matrix4f)RenderSupport_102.L(H), (Matrix4f)Y);
        r = 0;
        d = 0;
    }

    public static boolean L() {
if (RenderSupport_102.d() && OnyxClient.l != null && RenderSupport_102.L() != null) {
            return 1 != 0;
        }
        return false;
    }

    private static void L(NumberSetting a, double a2, double a3) {
        double d;
double d2 = (Double)a.L();
        a2 = d2 * a2;
        if (Math.abs(d - d2) < a.L()) {
            a2 = d2 + Math.signum(a3) * a.L();
        }
        a.i(a2);
    }

    public static float L() {
return 1.0f + 0.08f * D.L();
    }

    private static float L(float f2) {
        float f3 = f2;
float a = Math.max(0.1f, -E);
        return (float)(2.0 * (double)a * Math.tan(Math.toRadians(35.0)) / (double)f3);
    }

    /*
     * WARNING - void declaration
     */
    public static void L(RenderSupport_103 class_103, float f2, float f3) {
        boolean bl;
        void a;
        void a2;
        RenderSupport_103 class_1032 = class_103;
float f4 = RenderSupport_102.d();
        boolean bl2 = RenderSupport_102.d();
        RenderSupport_102.a = Math.max(1.0f, (float)a2);
        float a3 = (float)Minecraft.getScaledMouseX() * a / (float)RenderSupport_102.e.displayWidth;
        void v0 = a2;
        void var3_7 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)RenderSupport_102.e.displayHeight - 1.0f;
        boolean bl3 = Mouse.isButtonDown(0);
        if (!bl2 || !bl3) {
            p = false;
            bl = bl3;
        } else {
            RenderSupport_160 class_160;
            if (!k && !p && RenderSupport_102.L(a3, (float)var3_7, (float)a, (float)a2, 22.0f) && (class_160 = RenderSupport_102.L()) != null) {
                p = 1;
                m = a3;
                P = var3_7;
                RenderSupport_160 class_1602 = class_160;
                K = class_1602.I.L();
                e = class_1602.d.L();
            }
            bl = bl3;
        }
        k = bl;
        j = bl2 && (p || RenderSupport_102.L(a3, (float)var3_7, (float)a, (float)a2, 22.0f));
        boolean bl4 = C = bl2 && (p || RenderSupport_102.L(a3, (float)var3_7, (float)a, (float)a2, 72.0f));
        if (p) {
            RenderSupport_102.L(a3, (float)var3_7, f4);
        }
        RenderSupport_102.L(f4, bl2);
        if (!bl2) {
            return;
        }
        RenderSupport_102.L(class_1032, ThemeSupport_059.L(), (float)a, (float)a2);
        if (j) {
            class_1032.h();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean L(float f2, float f3, float f4, float f5, float f6) {
        void a;
        void a2;
        void a3;
        void a4;
        float f7 = f2;
if (!d || !r || RenderSupport_102.L() == null) {
            return false;
        }
        float a5 = RenderSupport_102.L((float)a4);
        a3 = a3 / 2.0f + f / a5 - f7;
        a2 = a4 / 2.0f - W / a5 - 30.0f - a2;
        void v0 = a3;
        void v1 = a2;
        void v2 = a;
        if (v0 * v0 + v1 * v1 < v2 * v2) {
            return --1 != 0;
        }
        return false;
    }

    private static Matrix4f L(Matrix4f a) {
J.clear();
        GL11.glGetFloat(2982, J);
        J.rewind();
        a.load(J);
        return a;
    }

    public static void L() {
        Vector4f vector4f;
if (OnyxClient.l == null) {
            return;
        }
        Vector4f vector4f2 = Matrix4f.transform((Matrix4f)RenderSupport_102.L(H), (Vector4f)new Vector4f(0.0f, 0.0f, 0.0f, 1.0f), null);
        Vector4f vector4f3 = vector4f = Matrix4f.transform((Matrix4f)Y, (Vector4f)vector4f2, null);
        f = vector4f3.x;
        W = vector4f3.y;
        E = vector4f3.z;
        r = 1;
    }

    private static float L(float f2, NumberSetting class_052) {
        NumberSetting a = class_052;
        float a2 = f2;
return Math.clamp(a2, (float)a.i(), (float)a.D());
    }

    /*
     * WARNING - void declaration
     */
    private static float L(NumberSetting class_052, float f2, float f3, float f4) {
        void a;
        void a2;
        float a3 = f2;
        NumberSetting a4 = class_052;
NumberSetting class_0522 = a4;
        float f5 = a3 = class_0522.L() + a3;
        a3 = f5 + (a2 - f5) * a;
        class_0522.i(Double.valueOf(a3));
        return a3 - a4.L();
    }
}

