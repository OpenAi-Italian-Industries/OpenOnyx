/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.MathHelper;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_109;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.FileUtils;

public final class Hurtcam
extends Module {
    private long k;
    final public NumberSetting g;
    final public BooleanSetting M;
    final public NumberSetting L;
    private final static float j = 100.0f;
    private float m;
    final public ColorSetting h;
    private int l;
    private RenderSupport_166 I;
    private boolean d;
    final public NumberSetting i;
    private float f;
    final public BooleanSetting H;
    private float e;

    public Hurtcam() {
        super("Hurtcam", FileUtils.L("\f#98\u007f>:(\u007f*3-,$\u007f--#*\";l+$:l,/-):\"\u007f;7)1l&#*l+-4)\u007f(>!>+:"), ModuleCategory.f);
        Hurtcam a;
        Hurtcam class_272 = a;
        a.h = new ColorSetting("Color", -49088).L(FileUtils.L("\u000b%18\u007f#9l+$:l;-2-8)\u007f;>?7"));
        class_272.g = new NumberSetting("Intensity", 45.0, 5.0, 100.0, 5.0).d(FileUtils.L("z")).L("How strong the wash gets at full health loss");
        a.i = new NumberSetting(FileUtils.L("\u001f66:"), 55.0, 10.0, 100.0, 5.0).d("%").L(FileUtils.L("\u0017#(l9--l6\"\u007f*-#2l+$:l:(8)\u007f87)\u007f;>?7l-)>/7),"));
        a.L = new NumberSetting("Duration", 450.0, 100.0, 1500.0, 50.0).d(FileUtils.L("!,")).L("How long the wash takes to fade out");
        a.M = new BooleanSetting(FileUtils.L("\f/> :l(%+$\u007f(>!>+:"), 1 != 0).L("Bigger hits flash brighter");
        a.H = new BooleanSetting(FileUtils.L("\u001b%-)<86#1-3"), 0 != 0).L("Bias the wash towards where the hit came from");
    }

    private void F() {
        Hurtcam a;
Hurtcam class_272 = a;
        Hurtcam class_2722 = a;
        a.f = 0.0f;
        class_2722.e = 0.0f;
        class_2722.l = 0;
        class_272.m = 0.0f;
        class_272.k = 0L;
    }

    @Override
    protected void L() {
        Hurtcam a;
a.F();
    }

    @Override
    protected void D() {
        Hurtcam a;
a.F();
    }

    public void l() {
        Hurtcam class_272 = this;
if (!class_272.d() || Hurtcam.e.thePlayer == null) {
            return;
        }
        Hurtcam class_2722 = class_272;
        class_2722.h();
        if (class_2722.f <= 0.002f) {
            return;
        }
        if (!RenderSupport_109.L()) {
            return;
        }
        if (!class_272.d) {
            Hurtcam class_2723 = class_272;
            class_2723.I = RenderSupport_166.L(FileUtils.L("0\"&4\u0000$*>+"), "onyx_post", FileUtils.L("0\"&4\u0000$*>+"));
            class_2723.d = 1;
        }
        if (class_272.I == null || !class_272.I.L()) {
            return;
        }
        Hurtcam class_2724 = class_272;
        int n = class_2724.h.L();
        Hurtcam class_2725 = class_272;
        float f2 = class_2724.f * (class_2725.g.L() / 100.0f);
        float f3 = class_2725.i.L() / 100.0f;
        boolean a = class_2724.H.d();
        RenderSupport_109.L(class_2724.I, class_166 -> {
            void a;
            void a2;
            void a3;
            void a4;
            int a5 = n;
            Hurtcam a6 = this;
void v0 = a4;
            void v1 = a4;
            a4.L("uTint", (float)ThemeSupport_064.i(a5) / 255.0f, (float)ThemeSupport_064.D(a5) / 255.0f, (float)ThemeSupport_064.L(a5) / 255.0f);
            v1.L(FileUtils.L("*\u001f+>:\"887"), (float)(a3 * ((float)ThemeSupport_064.d(a5) / 255.0f)));
            v1.L("uReach", (float)a2);
            v0.L(FileUtils.L("*\u000e6-,"), a6.m);
            v0.L("uDirectional", a != false ? 1.0f : 0.0f);
        });
    }

    private void h() {
        float f2;
        Hurtcam class_272 = this;
long l = System.nanoTime();
        float a = class_272.k == 0L ? 16.0f : Math.min((float)(l - class_272.k) / 1000000.0f, 100.0f);
        class_272.k = l;
        int n = Hurtcam.e.thePlayer.hurtTime;
        if (n > class_272.l) {
            class_272.e = 1.0f;
            if (class_272.M.d()) {
                f2 = Math.max(1.0f, (float)Hurtcam.e.thePlayer.maxHurtTime);
                class_272.e = MathHelper.clamp_float((float)n / f2, 0.35f, 1.0f);
            }
            class_272.f = Math.max(class_272.f, class_272.e);
            class_272.m = Hurtcam.e.thePlayer.attackedAtYaw;
        }
        Hurtcam class_2722 = class_272;
        class_2722.l = n;
        f2 = class_2722.L.L();
        class_2722.f = class_2722.f - (f2 <= 0.0f ? class_272.f : 0 / f2 * class_272.e);
        if (class_272.f < 0.0f) {
            class_272.f = 0.0f;
        }
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Hurtcam a2 = this;
a2.F();
    }
}

