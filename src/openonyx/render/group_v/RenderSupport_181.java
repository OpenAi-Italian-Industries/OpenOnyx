/*
 * Decompiled with CFR.
 */
package openonyx.render.group_v;

import net.minecraft.client.gui.ScaledResolution;
import openonyx.core.OnyxClient;
import openonyx.features.render.TNTTimer;
import openonyx.features.render.BedESP;
import openonyx.features.render.Crosshair;
import openonyx.features.hud.FeatureSupport_329;
import openonyx.features.hud.Notifications;
import openonyx.features.hud.Watermark;
import openonyx.features.hud.Keybinds;
import openonyx.features.hud.PotionHUD;
import openonyx.features.hud.TargetHUD;
import openonyx.features.hud.ArrayListModule;
import openonyx.render.RenderSupport_102;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_w.RenderSupport_200;

public final class RenderSupport_181 {
    private final static RenderSupport_103 e = new RenderSupport_103().L();

    private RenderSupport_181() {
        RenderSupport_181 a;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(ScaledResolution scaledResolution, float f2) {
        void a;
        ScaledResolution scaledResolution2 = scaledResolution;
if (OnyxClient.l == null) {
            return;
        }
        TargetHUD class_360 = OnyxClient.l.Y;
        Keybinds class_349 = OnyxClient.l.c;
        PotionHUD class_352 = OnyxClient.l.I;
        Notifications class_330 = OnyxClient.l.l;
        ArrayListModule class_372 = OnyxClient.l.C;
        Watermark class_340 = OnyxClient.l.q;
        FeatureSupport_329 class_329 = class_340.L();
        BedESP class_275 = OnyxClient.l.Ga;
        Crosshair class_304 = OnyxClient.l.s;
        TNTTimer class_230 = OnyxClient.l.N;
        boolean bl = class_360.l();
        boolean bl2 = class_349.l();
        boolean bl3 = class_352.I();
        boolean bl4 = class_330.l();
        boolean bl5 = class_372.l();
        boolean bl6 = class_340.h();
        boolean bl7 = class_329.D();
        boolean bl8 = class_275.h();
        boolean bl9 = class_304.I();
        boolean bl10 = class_230.d();
        boolean a22 = RenderSupport_102.L();
        boolean bl11 = RenderSupport_200.L();
        if (!(bl || bl2 || bl5 || bl6 || bl7 || bl9 || bl10 || a22 || bl11 || bl3 || bl4 || bl8)) {
            return;
        }
        ScaledResolution scaledResolution3 = scaledResolution2;
        float a22 = scaledResolution3.getScaledWidth();
        float f3 = scaledResolution3.getScaledHeight();
        e.i();
        if (bl11) {
            RenderSupport_200.L(e, a22, f3);
        }
        if (bl10) {
            class_230.L(e, a22, f3, (float)a);
        }
        if (bl9) {
            class_304.L(e, a22, f3);
        }
        if (bl) {
            class_360.L(e, a22, f3, (float)a);
        }
        if (bl2) {
            class_349.L(e, a22, f3);
        }
        if (bl3) {
            class_352.L(e, a22, f3);
        }
        if (bl8) {
            class_275.L(e, a22, f3);
        }
        if (bl5) {
            class_372.L(e, a22, f3);
        }
        if (bl6) {
            class_340.L(e, a22, f3);
        }
        if (bl7) {
            class_329.L(e, a22, f3);
        }
        if (bl4) {
            class_330.L(e, a22, f3);
        }
        RenderSupport_102.L(e, a22, f3);
        e.d();
    }
}

