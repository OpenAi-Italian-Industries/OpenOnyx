/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_247;
import openonyx.features.render.FeatureSupport_251;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_146;
import openonyx.render.RenderSupport_170;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.theme.internal.ThemeSupport_063;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Camera
extends Module {
    private boolean t;
    private double b;
    private final static double E = 6.0;
    private double F;
    private double G;
    private float A;
    private float K;
    private boolean B;
    private long C;
    private float J;
    private double D;
    private double c;
    public FeatureSupport_247 a;
    private long k;
    private double g;
    private float M;
    private boolean L;
    public FeatureSupport_251 j;
    private double m;
    private float h;
    private double l;
    private float I;
    public NumberSetting d;
    private double i;
    private final static double f = 8.0;
    private long H;
    public NumberSetting e;

    public double l() {
        Camera a;
return a.l;
    }

    public float D() {
        Camera a;
return a.K;
    }

    public double h() {
        Camera a;
return a.G;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3) {
        void a;
        void a2;
        Camera class_243 = this;
long l = System.nanoTime();
        float a3 = class_243.k == 0L ? 16.0f : Math.min((float)(l - class_243.k) / 1000000.0f, 100.0f);
        class_243.k = l;
        if (!class_243.B) {
            Camera class_2432 = class_243;
            class_243.B = 1;
            class_2432.K = a2;
            class_2432.h = a;
            return;
        }
        Camera class_2433 = class_243;
        double d = class_2433.L(a3);
        class_2433.K += Camera.L((float)(a2 - class_243.K)) * (float)d;
        class_2433.h += (a - class_243.h) * (float)d;
    }

    public float d() {
        Camera class_243 = this;
if (!class_243.d() || !class_243.a.D()) {
            return 0.0f;
        }
        Camera class_2432 = class_243;
        float a = class_2432.a.H.L() / 100.0f;
        if (!class_2432.a.e.d() || ((Minecraft)((Object)Camera.e)).thePlayer == null) {
            return 0;
        }
        double d = Math.sqrt(((Minecraft)((Object)Camera.e)).thePlayer.motionX * ((Minecraft)((Object)Camera.e)).thePlayer.motionX + ((Minecraft)((Object)Camera.e)).thePlayer.motionZ * ((Minecraft)((Object)Camera.e)).thePlayer.motionZ);
        return 0 * (float)Math.min(1.0, d / 0.14);
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Camera a2 = this;
RenderSupport_146.d();
        Camera class_243 = a2;
        class_243.L = 0;
        class_243.t = 0;
    }

    public void L(Entity entity) {
        Camera class_243;
        Entity a22 = entity;
        Camera a = this;
if (!a.d() || !a.j.D() || a22 == null) {
            return;
        }
        if (((Minecraft)((Object)Camera.e)).gameSettings.thirdPersonView != 0 || ((Minecraft)((Object)Camera.e)).gameSettings.debugCamEnable) {
            a.L = 0;
            return;
        }
        Object object = a22;
        float a22 = ((Entity)object).rotationYaw;
        float f2 = ((Entity)object).rotationPitch;
        long l = System.nanoTime();
        float f3 = a.C == 0L ? 16.0f : Math.min((float)(l - a.C) / 1000000.0f, 100.0f);
        a.C = l;
        Camera class_2432 = a;
        if (!a.L) {
            class_2432.L = 1;
            Camera class_2433 = a;
            class_2433.J = class_2433.I = 0;
            Camera class_2434 = a;
            class_2434.A = class_2434.M = f2;
            class_243 = a;
        } else {
            double d;
            class_2432.I = a.J;
            Camera class_2435 = a;
            class_2435.M = class_2435.A;
            double d2 = (double)class_2435.j.e.L() / 100.0 * 260.0;
            float f4 = d <= 0.0 ? 1.0f : (float)(1.0 - Math.exp((double)(-f3) / d2));
            Camera class_2436 = a;
            class_2436.J += Camera.L(0 - a.J) * f4;
            if (class_2436.j.H.d()) {
                a.A += (f2 - a.A) * f4;
                class_243 = a;
            } else {
                a.A = f2;
                class_243 = a;
            }
        }
        Camera class_2437 = a;
        RenderSupport_170.L(class_243.J, class_2437.A, class_2437.J, a.A);
    }

    /*
     * WARNING - void declaration
     */
    public void L(double d, double d2, double d3) {
        double d4;
        void a;
        void a2;
        void a3;
        Camera class_243 = this;
class_243.l = a3;
        class_243.g = a2;
        class_243.b = a;
        long l = System.nanoTime();
        float f2 = class_243.H == 0L ? 16.0f : Math.min((float)(l - class_243.H) / 1000000.0f, 100.0f);
        class_243.H = l;
        double d5 = a3 - class_243.F;
        void var11_9 = a2 - class_243.i;
        void var13_10 = a - class_243.D;
        void v0 = d5;
        void v1 = var11_9;
        void v2 = var13_10;
        int a4 = v0 * v0 + v1 * v1 + v2 * v2 > 64.0 ? 1 : 0;
        class_243.F = a3;
        class_243.i = a2;
        class_243.D = a;
        if (!class_243.t || a4 != 0) {
            Camera class_2432 = class_243;
            class_243.t = 1;
            class_2432.c = a3;
            class_2432.m = a2;
            class_243.G = a;
            return;
        }
        Camera class_2433 = class_243;
        d5 = class_2433.L(f2);
        class_2433.c += (a3 - class_243.c) * d5;
        class_2433.m += (a2 - class_243.m) * d5;
        class_2433.G += (a - class_243.G) * d5;
        d5 = a3 - class_243.c;
        var11_9 = a2 - class_243.m;
        var13_10 = a - class_243.G;
        double d6 = d5;
        void v6 = var11_9;
        void v7 = var13_10;
        double d7 = d6 * d6 + v6 * v6 + v7 * v7;
        if (d4 > 36.0) {
            d7 = 6.0 / Math.sqrt(d7);
            Camera class_2434 = class_243;
            class_243.c = a3 - d5 * d7;
            class_2434.m = a2 - var11_9 * d7;
            class_2434.G = a - var13_10 * d7;
        }
    }

    @Override
    protected void D() {
        Camera a;
RenderSupport_146.d();
        Camera class_243 = a;
        Camera class_2432 = a;
        Camera class_2433 = a;
        Camera class_2434 = a;
        a.L = 0;
        class_2434.C = 0L;
        class_2434.B = 0;
        class_2433.k = 0L;
        class_2433.t = 0;
        class_2432.H = 0L;
        class_2432.F = 0.0;
        class_243.i = 0.0;
        class_243.D = 0.0;
    }

    /*
     * WARNING - void declaration
     */
    public double L(float f2) {
        void a;
        float f3;
        Camera class_243 = this;
float a2 = class_243.e.L();
        if (f3 <= 0.0f) {
            return 1.0;
        }
        double d = 16.0;
        return 1.0 - Math.exp((double)(-a) / d);
    }

    public double I() {
        Camera a;
return a.c;
    }

    public Camera() {
        super("Camera", "Smooth trailing camera position and third-person orbit", ModuleCategory.f);
        Camera a;
        Camera class_243 = a;
        a.e = new NumberSetting("Smoothing", 95.0, 0.0, 95.0, 5.0).d("%").L("How far the camera lags behind you");
        class_243.d = new NumberSetting("Distance", 50.0, 50.0, 160.0, 5.0).d("%").L("Third-person camera distance");
        a.j = new FeatureSupport_251();
        a.a = new FeatureSupport_247();
    }

    public double i() {
        Camera a;
return (double)a.d.L() / 100.0;
    }

    private static float L(float f2) {
        float f3;
        float f4 = f2;
float a = f4 % 360.0f;
        if (f3 >= 180.0f) {
            a -= 360.0f;
        }
        if (a < -180.0f) {
            a += 360.0f;
        }
        return a;
    }

    public double D() {
        Camera a;
return a.b;
    }

    public float L() {
        Camera a;
return a.h;
    }

    public double d() {
        Camera a;
return a.m;
    }

    public double L() {
        Camera a;
return a.g;
    }
}

