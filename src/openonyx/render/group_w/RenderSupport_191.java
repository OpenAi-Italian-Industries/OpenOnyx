/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import openonyx.core.OnyxListener_001;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_v.RenderSupport_179;
import openonyx.render.group_v.RenderSupport_182;
import openonyx.render.group_v.RenderSupport_183;
import openonyx.render.group_v.RenderSupport_184;
import openonyx.render.group_w.RenderSupport_198;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_059;
import org.lwjgl.input.Mouse;

public abstract class RenderSupport_191
implements OnyxListener_001 {
    final static protected float C = 10.0f;
    private boolean J;
    private final NumberSetting D;
    private boolean c;
    private final NumberSetting a;
    private float k;
    private final String g;
    private boolean M;
    private final static float L = 7.0f;
    private final static float j = 8.0f;
    private float m;
    private final static float h = 1.0f;
    private float l;
    private float I;
    private float d;
    private final NumberSetting i;
    private RenderSupport_182 f;
    private float H;
    private final RenderSupport_184 e;

    public final void L() {
        RenderSupport_191 a;
RenderSupport_191 class_191 = a;
        RenderSupport_179.L(a.g);
        class_191.J = 0;
        class_191.c = 0;
    }

    protected abstract boolean L(boolean var1);

    protected abstract void L(RenderSupport_103 var1, float var2, float var3, float var4);

    private boolean L() {
return Mouse.isButtonDown(0);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, boolean n) {
        void a;
        int a2 = 0;
        RenderSupport_191 a3 = this;
ThemeSupport_055 class_055 = ThemeSupport_059.L();
        a2 = 4.0f != 0 || a3.J || a3.c ? class_055.E() : class_055.P();
        void v0 = a;
        RenderSupport_191 class_191 = a3;
        RenderSupport_191 class_1912 = a3;
        v0.L(class_191.l, class_191.H, class_1912.k, class_1912.m, 4.0f, 1.0f, (int)4.0f);
        RenderSupport_191 class_1913 = a3;
        v0.D(a3.l + a3.k - 7.0f, class_1913.H + class_1913.m - 7.0f, 7.0f, 7.0f, 4.0f, (int)4.0f);
    }

    public final boolean L(double a, double a2) {
        RenderSupport_191 a3;
if (a >= (double)a3.l) {
            RenderSupport_191 class_191 = a3;
            if (a < (double)(class_191.l + class_191.k) && a2 >= (double)a3.H) {
                RenderSupport_191 class_1912 = a3;
                if (a2 < (double)(class_1912.H + class_1912.m)) {
                    return --1 != 0;
                }
            }
        }
        return false;
    }

    protected abstract float d(RenderSupport_103 var1);

    protected static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }

    /*
     * WARNING - void declaration
     */
    protected static void L(NumberSetting class_052, float f2, float f3) {
        void a;
        float a2 = f3;
        NumberSetting a3 = class_052;
if (4.0f <= 0.0f) {
            return;
        }
        a3.i((double)Math.clamp((float)(a / 4.0f), 0.0f, 1.0f) * 100.0);
    }

    /*
     * Unable to fully structure code
     */
    private boolean L(boolean var1_2, float var2_4, float var3_5, float var4_6, float var5_7, float var6_8, float var7_9) {
        var9_10 = this;
var8_11 = (float)Minecraft.getScaledMouseX() * a / (float)RenderSupport_191.e.displayWidth;
        v0 = a;
        a = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)RenderSupport_191.e.displayHeight - 1.0f;
        v1 = var9_10;
        var10_12 = v1.L();
        var11_13 = v1.L(var8_11, (double)a);
        v2 = var9_10;
        if (!(var8_11 >= v2.l + v2.k - 7.0f)) ** GOTO lbl-1000
        v3 = var9_10;
        if (!(var8_11 < v3.l + v3.k)) ** GOTO lbl-1000
        v4 = var9_10;
        if (!(a >= v4.H + v4.m - 7.0f)) ** GOTO lbl-1000
        v5 = var9_10;
        if (a < v5.H + v5.m) {
            v6 = 4 ^ 5;
        } else lbl-1000:
        // 4 sources

        {
            v6 = var12_14 = 0;
        }
        if (a == false || !var10_12) {
            v7 = var9_10;
            v8 = var9_10;
            v8.J = 3 ^ 3;
            var9_10.c = 3 ^ 3;
            v8.f = RenderSupport_183.f;
        } else {
            if (!var9_10.M && var11_13) {
                v9 = var9_10;
                v9.c = var12_14;
                v9.J = var12_14 == 0 ? --1 : 0;
                var9_10.d = var8_11 - var9_10.l;
                var9_10.I = a - var9_10.H;
            }
            v7 = var9_10;
        }
        v7.M = var10_12;
        if (var9_10.c) {
            a = Math.max(var8_11 - var9_10.l, (float)(a - var9_10.H));
            a = Math.max(var8_11 - var9_10.l >= a - var9_10.H ? a : a, 1.0f);
            var9_10.D.i(Double.valueOf(a / a));
            var9_10.f = RenderSupport_183.f;
            return var11_13;
        }
        if (var9_10.J) {
            v10 = var9_10;
            v11 = var9_10;
            v10.f = RenderSupport_183.L(var8_11 - var9_10.d, (float)(a - v10.I), v11.k, v11.m, (float)a, (float)a, 10.0f, RenderSupport_179.L(var9_10.g));
            v12 = var9_10;
            RenderSupport_191.L(v10.a, v12.f.L() - 10.0f, (float)a);
            RenderSupport_191.L(v12.i, var9_10.f.D() - 10.0f, (float)a);
        }
        return var11_13;
    }

    /*
     * WARNING - void declaration
     */
    protected RenderSupport_191(String string, NumberSetting class_052, NumberSetting class_0522, NumberSetting class_0523) {
        OnyxListener_001 a;
        void a2;
        void a3;
        void a4;
        RenderSupport_191 a5;
        RenderSupport_191 class_191 = interface_001;
        OnyxListener_001 interface_001 = class_0523;
        RenderSupport_191 class_1912 = a5 = class_191;
        RenderSupport_191 class_1913 = a5;
        RenderSupport_191 class_1914 = a5;
        a5.e = new RenderSupport_184();
        class_1914.f = RenderSupport_183.f;
        class_1913.g = a4;
        class_1913.a = a3;
        class_1912.i = a2;
        class_1912.D = a;
    }

    protected abstract float L(RenderSupport_103 var1);

    protected void L(float f2) {
        float a = f2;
        RenderSupport_191 a2 = this;
}

    /*
     * WARNING - void declaration
     */
    public final void L(RenderSupport_103 class_103, float f2, float f3, boolean bl) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_191 class_191 = this;
float f4 = RenderSupport_198.D();
        RenderSupport_191 class_1912 = class_191;
        class_1912.L(f4);
        if (!class_1912.L((boolean)a4)) {
            RenderSupport_191 class_1913 = class_191;
            RenderSupport_179.L(class_1913.g);
            class_1913.M = class_1913.L();
            return;
        }
        RenderSupport_191 class_1914 = class_191;
        float a5 = class_1914.D.L();
        float f5 = Math.max(8.0f, class_191.d((RenderSupport_103)a3));
        float f6 = Math.max(8.0f, class_191.L((RenderSupport_103)a3));
        class_1914.k = f5 * a5;
        class_191.m = f6 * a5;
        void var9_10 = a2 - class_191.k - 20.0f;
        void var10_11 = a - class_191.m - 20.0f;
        class_1914.l = 10.0f + RenderSupport_191.L(class_191.a, (float)var9_10);
        class_1914.H = 10.0f + RenderSupport_191.L(class_191.i, (float)var10_11);
        RenderSupport_191 class_1915 = class_191;
        RenderSupport_191 class_1916 = class_191;
        RenderSupport_179.L(class_1914.g, class_1915.l, class_1915.H, class_1916.k, class_1916.m);
        boolean bl2 = class_1914.L((boolean)a4, f5, f6, (float)var9_10, (float)var10_11, (float)a2, (float)a);
        if (a4 != false && bl2 && !class_191.J && !class_191.c) {
            float[] fArray = class_191.e.L(3 >> 1);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                RenderSupport_191 class_1917 = class_191;
                RenderSupport_191.L(class_1917.a, RenderSupport_191.L(class_1917.a, (float)var9_10) + fArray[0], (float)var9_10);
                RenderSupport_191.L(class_1917.i, RenderSupport_191.L(class_191.i, (float)var10_11) + fArray[1], (float)var10_11);
            }
        } else {
            class_191.e.L(3 >> 2);
        }
        RenderSupport_191 class_1918 = class_191;
        a5 = class_1918.D.L();
        class_1918.k = f5 * a5;
        class_1918.m = f6 * a5;
        class_1918.l = 10.0f + RenderSupport_191.L(class_191.a, (float)var9_10);
        class_1918.H = 10.0f + RenderSupport_191.L(class_191.i, (float)var10_11);
        if (class_1918.J || class_191.c) {
            RenderSupport_183.L((RenderSupport_103)a3, (float)a2, (float)a, class_191.f);
        }
        void v7 = a3;
        a3.F();
        v7.L(class_191.l, class_191.H);
        v7.L(a5, 0.0f, 0.0f);
        class_191.L((RenderSupport_103)v7, f5, f6, f4);
        a3.k();
        if (a4 != false) {
            class_191.L((RenderSupport_103)a3, bl2);
        }
    }
}

