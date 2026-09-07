/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_239;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.Timer;

public class Crosshair
extends Module {
    public BooleanSetting k;
    public EnumSetting<FeatureMode_239> g;
    private float M;
    public BooleanSetting L;
    private boolean j;
    public NumberSetting m;
    public NumberSetting h;
    private float l;
    private float I;
    private float d;
    public ColorSetting i;
    private long f;
    public NumberSetting H;
    private final static long e = System.nanoTime();

    private int L(float f2) {
        float a = f2;
        Crosshair a2 = this;
switch (((FeatureMode_239)((Object)a2.g.L())).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return ThemeSupport_064.L(0.0f, 0.75f, 1.0f, 255);
            }
            case 1: {
                return ThemeSupport_059.L().E() | 0xFF000000;
            }
            case 2: {
                return a2.i.L();
            }
        }
    }

    public Crosshair() {
        super("Crosshair", "Animated dynamic crosshair", ModuleCategory.f);
        Crosshair a;
        Crosshair class_304 = a;
        a.h = new NumberSetting("Size", 5.0, 2.0, 16.0, 0.5).d("px").L("Radius of the ring");
        class_304.H = new NumberSetting("Thickness", 1.5, 0.5, 4.0, 0.25).d("px");
        a.k = new BooleanSetting("Center dot", 3 >> 1);
        a.g = new EnumSetting<FeatureMode_239>("Color", FeatureMode_239.f).L("Rainbow shimmer, the global accent, or a fixed colour");
        a.i = ((ColorSetting)new ColorSetting("Custom colour", -1).L()).L(() -> {
            Crosshair a;
return a.g.L(FeatureMode_239.H);
        });
        Crosshair class_3042 = a;
        class_3042.m = new NumberSetting("Follow", 40.0, 0.0, 100.0, 5.0).d("%").L("How much the crosshair drifts with view movement");
        class_3042.L = new BooleanSetting("Pulse", --1 != 0).L("Breathe with the idle animation");
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        void a;
        void a2;
        void a3;
        Crosshair class_304 = this;
Crosshair class_3042 = class_304;
        float f4 = class_3042.L();
        float a222 = (float)(System.nanoTime() - e) / 1.0E9f;
        class_3042.L(f4);
        a3 = a3 / 2.0f + class_304.d;
        Crosshair class_3043 = class_304;
        a2 = a2 / 2.0f + class_3043.M;
        f4 = class_3043.L.d() ? class_304.d(0) : 1.0f;
        Crosshair class_3044 = class_304;
        f4 = class_304.h.L() * f4;
        float f5 = class_3044.H.L();
        int a222 = class_3044.L(0);
        a.L(0.0f, (float)a2, f4, f5, 0);
        if (class_3044.k.d()) {
            a.L(0.0f, (float)a2, Math.max(f5 * 0.9f, 0.75f), 0);
        }
    }

    private float L() {
        Crosshair class_304 = this;
long l = System.nanoTime();
        float a = class_304.f == 0L ? 16.0f : Math.min((float)(l - class_304.f) / 1000000.0f, 100.0f);
        class_304.f = l;
        return 0;
    }

    private float d(float f2) {
        float a = f2;
        Crosshair a2 = this;
return 1.0f + 0.05f * (float)Math.sin(0.0f);
    }

    public boolean I() {
        Crosshair a;
if (a.d() && Crosshair.e.thePlayer != null && Crosshair.e.gameSettings.thirdPersonView == 0) {
            return 3 >> 1;
        }
        return false;
    }

    private static float L(float f2) {
        float f3;
        float f4 = f2;
float a = f4 % 360.0f;
        if (f3 >= 180.0f) {
            a -= 360.0f;
        }
        if (0 < -180.0f) {
            a += 360.0f;
        }
        return 0;
    }

    private void L(float f2) {
        float a;
        Crosshair class_304 = this;
float f3 = Crosshair.e.thePlayer.rotationYaw;
        float a2 = Crosshair.e.thePlayer.rotationPitch;
        if (!class_304.j) {
            Crosshair class_3042 = class_304;
            class_304.j = 1;
            class_3042.I = f3;
            class_3042.l = 4.0f;
        }
        float f4 = Crosshair.L(f3 - class_304.I);
        float f5 = 4.0f - class_304.l;
        Crosshair class_3043 = class_304;
        class_304.I = f3;
        class_3043.l = 4.0f;
        f3 = class_304.m.L() / 100.0f * 1.1f;
        a2 = class_3043.h.L() * 2.0f;
        f4 = Math.clamp(-f4 * f3, -4.0f, 4.0f);
        f3 = Math.clamp(-f5 * f3, -4.0f, 4.0f);
        a = 1.0f - (float)Math.exp((double)(-0 / 70.0f));
        class_3043.d += (f4 - class_304.d) * 0;
        class_3043.M += (f3 - class_304.M) * 0;
    }
}

