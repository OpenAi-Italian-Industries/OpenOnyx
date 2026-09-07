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
import openonyx.configuration.internal.EventSupport_619;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_268;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_170;
import openonyx.utilities.UtilitySupport_476;

public final class Freelook
extends Module {
    private float m;
    private float h;
    private boolean l;
    private float I;
    final public NumberSetting d;
    private int i;
    private final static double f = 0.15;
    final public EnumSetting<FeatureMode_268> H;
    private float e;

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Freelook a2 = this;
a2.F();
    }

    @Override
    protected void D() {
        Freelook a;
a.F();
    }

    private void F() {
        Freelook a;
if (!a.l) {
            return;
        }
        a.l = 0;
        Freelook.e.gameSettings.thirdPersonView = a.i;
    }

    @EventHandler
    private void L(EventSupport_619 class_619) {
        EventSupport_619 a = class_619;
        Freelook a2 = this;
Freelook class_277 = a2;
        class_277.I = class_277.e;
        class_277.m = class_277.h;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3) {
        void a;
        float a2 = f3;
        Freelook a3 = this;
if (!a3.d() || Freelook.e.thePlayer == null) {
            return false;
        }
        Freelook class_277 = a3;
        class_277.h();
        double d = 0.15 * ((double)a3.d.L() / 100.0);
        class_277.e += (float)(0.0 * d);
        a3.h = MathHelper.clamp_float((float)((double)a3.h - 4.0 * d), -90.0f, 90.0f);
        return 1 != 0;
    }

    public Freelook() {
        super("Freelook", "Look around without turning your player", ModuleCategory.f);
        Freelook a;
        Freelook class_277 = a;
        a.H = new EnumSetting<FeatureMode_268>("Perspective", FeatureMode_268.i).L("Which way the detached camera faces");
        class_277.d = new NumberSetting("Sensitivity", 100.0, 25.0, 200.0, 5.0).d("%").L("Mouse speed while looking around");
    }

    @Override
    protected void L() {
a.l = 0;
    }

    public void l() {
        Freelook a;
if (!a.d() || Freelook.e.thePlayer == null) {
            return;
        }
        Freelook class_277 = a;
        class_277.h();
        Freelook class_2772 = a;
        RenderSupport_170.L(class_277.e, class_2772.h, class_2772.I, a.m);
    }

    private void h() {
        Freelook a;
if (a.l || Freelook.e.thePlayer == null) {
            return;
        }
        Freelook class_277 = a;
        class_277.e = class_277.I = Freelook.e.thePlayer.rotationYaw;
        Freelook class_2772 = a;
        class_2772.h = class_2772.m = Freelook.e.thePlayer.rotationPitch;
        a.i = Freelook.e.gameSettings.thirdPersonView;
        Freelook.e.gameSettings.thirdPersonView = ((FeatureMode_268)a.H.L()).L();
        a.l = 1;
    }
}

