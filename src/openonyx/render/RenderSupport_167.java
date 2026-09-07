/*
 * Decompiled with CFR.
 */
package openonyx.render;

import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.Ambience;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.render.RenderSupport_109;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;

public final class RenderSupport_167
implements OnyxListener_001 {
    private static RenderSupport_166 f;
    private static boolean H;
    private final static long e;

    private RenderSupport_167() {
        RenderSupport_167 a;
    }

    static {
        e = System.nanoTime();
    }

    public static void L() {
if (OnyxClient.l == null) {
            return;
        }
        Ambience class_321 = OnyxClient.l.J;
        if (!class_321.I() || !RenderSupport_109.L()) {
            return;
        }
        if (!H) {
            H = 1;
            f = RenderSupport_166.L("onyx_ambience");
        }
        if (f == null || !f.L()) {
            return;
        }
        Ambience class_3212 = class_321;
        boolean bl = class_3212.i.D();
        boolean bl2 = class_3212.f.D();
        int n = bl ? class_321.i.H.h() : -1;
        float f2 = bl ? class_321.i.e.L() / 100.0f : 0.0f;
        float f3 = bl2 ? class_321.f.f.L() / 100.0f : 1.0f;
        float f4 = bl2 ? class_321.f.e.L() / 100.0f : 1.0f;
        float f5 = bl2 ? class_321.f.i.L() / 100.0f : 0.0f;
        float f6 = bl2 ? class_321.f.H.L() / 100.0f : 0.0f;
        float f7 = (float)(System.nanoTime() - e) / 1.0E9f;
        RenderSupport_109.L(f, class_166 -> {
            void a;
            void a2;
            void a3;
            void a4;
            void a5;
            void a6;
            void a7;
            RenderSupport_166 class_1662 = class_166;
            int a8 = 0;
void v0 = a7;
            a7.L("uLightColorAndStrength", (float)ThemeSupport_064.i(a8) / 255.0f, (float)ThemeSupport_064.D(a8) / 255.0f, (float)ThemeSupport_064.L(a8) / 255.0f, (float)a6);
            v0.L("uGradeParams", (float)a5, (float)a4, (float)a3, (float)a2);
            v0.L("uTime", (float)a);
        });
    }
}

