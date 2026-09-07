/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import openonyx.events.Rotation;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_240;
import openonyx.features.render.FeatureMode_303;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_120;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Skybox
extends Module {
    public NumberSetting L;
    public NumberSetting j;
    public NumberSetting m;
    public ColorSetting h;
    public NumberSetting l;
    public EnumSetting<FeatureMode_240> I;
    public NumberSetting d;
    private final static long i = System.nanoTime();
    public NumberSetting f;
    public NumberSetting H;
    public EnumSetting<FeatureMode_303> e;

    public float k() {
        Skybox a;
return a.j.L();
    }

    public float F() {
        Skybox a;
return a.H.L();
    }

    public int D() {
        Skybox a;
return a.h.h();
    }

    public boolean F() {
        Skybox a;
return a.d();
    }

    public int d() {
        Skybox a;
return ((FeatureMode_240)((Object)a.I.L())).L();
    }

    public float l() {
return 0.85f;
    }

    public float h() {
return (float)(System.nanoTime() - i) / 1.0E9f;
    }

    public float I() {
        Skybox a;
return a.L.L() / 100.0f;
    }

    public float i() {
        Skybox a;
return a.m.L();
    }

    public float D() {
        Skybox a;
return a.d.L();
    }

    public float d() {
        Skybox a;
return Math.clamp(a.f.L() / 100.0f, 0.25f, 1.0f);
    }

    public float L() {
        Skybox a;
return a.l.L();
    }

    public Skybox() {
        super("Skybox", "Animated sky with a fixed custom color", ModuleCategory.f);
        Skybox a;
        Skybox class_291 = a;
        a.I = new EnumSetting<FeatureMode_240>("Preset", FeatureMode_240.f).L("Sky theme to paint");
        class_291.h = new ColorSetting("Color", -9335297).D().L("Fixed sky color");
        a.H = new NumberSetting("Animation Speed", 1.0, 0.1, 5.0, 0.1).d("x").L("Controls how fast the sky moves");
        a.l = ((NumberSetting)new NumberSetting("Scale", 5.0, 1.0, 20.0, 0.5).L("Size of the pattern across the sky")).L(() -> {
            Skybox a;
return ((FeatureMode_240)((Object)((Object)a.I.L()))).L();
        });
        a.L = ((NumberSetting)new NumberSetting("Intensity", 1.0, 0.1, 5.0, 0.1).d("%").L("Brightness the pattern is pushed to")).L(() -> {
            Skybox a;
return ((FeatureMode_240)((Object)((Object)a.I.L()))).L();
        });
        a.j = ((NumberSetting)new NumberSetting("Strike Interval", 4.0, 1.0, 10.0, 0.5).d("s").L("Seconds between lightning rolls")).L(() -> {
            Skybox a;
return a.I.L(FeatureMode_240.H);
        });
        a.m = ((NumberSetting)new NumberSetting("Strike Chance", 0.65, 0.0, 1.0, 0.05).L("Odds a roll actually produces a bolt")).L(() -> {
            Skybox a;
return a.I.L(FeatureMode_240.H);
        });
        a.d = ((NumberSetting)new NumberSetting("Strike Glow", 1.0, 0.1, 3.0, 0.1).d("x").L("How hard a bolt lights the storm")).L(() -> {
            Skybox a;
return a.I.L(FeatureMode_240.H);
        });
        Skybox class_2912 = a;
        class_2912.e = new EnumSetting<FeatureMode_303>("Quality", FeatureMode_303.i).L("Noise detail; fewer layers cost far less GPU time");
        class_2912.f = new NumberSetting("Resolution", 50.0, 25.0, 100.0, 25.0).d("%").L("Fraction of the screen resolution the sky is drawn at");
    }

    public int L() {
        Skybox a;
return ((FeatureMode_303)a.e.L()).L();
    }
}

