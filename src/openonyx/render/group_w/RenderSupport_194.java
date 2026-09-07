/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import openonyx.core.OnyxListener_001;
import openonyx.events.ChatTransformer;
import openonyx.features.hud.CustomGui;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;
import openonyx.render.group_w.RenderSupport_188;
import openonyx.render.group_w.RenderSupport_191;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_059;

public final class RenderSupport_194
extends RenderSupport_191 {
    private String M;
    private final static String L = "Title";
    private final static RenderSupport_128 j;
    private final static float m = 120.0f;
    private float h;
    private String l;
    private final static float I = 0.88f;
    private final static float d = 6.0f;
    private final static String i = "Subtitle";
    private final static float f = 0.6f;
    private float H;
    private final static RenderSupport_128 e;

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean L(boolean bl) {
        void a;
        RenderSupport_194 class_194 = this;
GuiIngame a2 = Minecraft.getMinecraft().ingameGUI;
        if (a2 != null && a2.getTitlesTimer() > 0) {
            class_194.M = a2.getDisplayedTitle() == null ? "" : a2.getDisplayedTitle();
            String string = class_194.l = a2.getDisplayedSubTitle() == null ? "" : a2.getDisplayedSubTitle();
            if (!class_194.M.isEmpty() || !class_194.l.isEmpty()) {
                return class_194.L(a2);
            }
        }
        if (a != false) {
            RenderSupport_194 class_1942 = class_194;
            RenderSupport_194 class_1943 = class_194;
            class_1943.M = L;
            class_1943.l = i;
            class_1942.h = 1.0f;
            class_1942.H = 1.0f;
            return 1 != 0;
        }
        class_194.h = 0.0f;
        return 0 != 0;
    }

    public RenderSupport_194(CustomGui class_344) {
        RenderSupport_194 a;
        OnyxListener_001 a2 = class_344;
        RenderSupport_194 class_194 = a = this;
        super("mcgui:title", ((CustomGui)a2).I.H, ((CustomGui)a2).I.f, ((CustomGui)a2).I.e);
        class_194.M = "";
        class_194.l = "";
    }

    private boolean L(GuiIngame guiIngame) {
        GuiIngame a = guiIngame;
        RenderSupport_194 a2 = this;
float f2 = a.getTitlesTimer();
        int n = Math.max(1, a.getTitleFadeIn());
        int n2 = Math.max(1, a.getTitleFadeOut());
        float f3 = 1.0f;
        a2.H = 1.0f;
        if (f2 > (float)(a.getTitleFadeOut() + a.getTitleDisplayTime())) {
            f3 = Math.clamp(((float)(n + a.getTitleDisplayTime() + a.getTitleFadeOut()) - f2) / (float)n, 0.0f, 1.0f);
            v0 = a2;
            a2.H = Math.clamp(f3 / 0.6f, 0.0f, 1.0f);
        } else {
            if (f2 <= (float)a.getTitleFadeOut()) {
                f3 = Math.clamp(f2 / (float)n2, 0.0f, 1.0f);
            }
            v0 = a2;
        }
        v0.h = (float)RenderSupport_123.l.L(f3);
        if (a2.h > 0.03f) {
            return 5 >> 2;
        }
        return false;
    }

    @Override
    protected float d(RenderSupport_103 class_103) {
        OnyxListener_001 a = class_103;
        RenderSupport_194 a2 = this;
return Math.max(120.0f, Math.max(RenderSupport_188.L((RenderSupport_103)a, e, a2.M), RenderSupport_188.L((RenderSupport_103)a, j, a2.l)));
    }

    static {
        e = new RenderSupport_128(RenderMode_131.h, RenderMode_130.e, 36.0f, 44.0f);
        j = new RenderSupport_128(RenderMode_131.f, RenderMode_130.i, 16.0f, 24.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void L(RenderSupport_103 class_103, float f2, float f3, float f4) {
        void a;
        void a2;
        float a3 = f3;
        RenderSupport_194 a4 = this;
ThemeSupport_055 a5 = ThemeSupport_059.L();
        float f5 = (float)RenderSupport_123.H.L(a4.H);
        f5 = 0.88f + 0.120000005f * f5;
        void v0 = a2;
        v0.L(a4.h);
        v0.F();
        v0.L(f5, (float)(a / 2.0f), a3 / 2.0f);
        a3 = 0.0f;
        if (!a4.M.isEmpty()) {
            RenderSupport_188.L((RenderSupport_103)a2, e, a4.M, (float)(a / 2.0f), a2.d(e, a3 + e.I() / 2.0f), a5.d());
            a3 += e.I() + 6.0f;
        }
        if (!a4.l.isEmpty()) {
            RenderSupport_188.L((RenderSupport_103)a2, j, a4.l, (float)(a / 2.0f), a2.d(j, a3 + j.I() / 2.0f), a5.F());
        }
        void v1 = a2;
        v1.k();
        v1.e();
    }

    @Override
    protected float L(RenderSupport_103 class_103) {
        float a2;
        OnyxListener_001 a2 = class_103;
        RenderSupport_194 a3 = this;
float f2 = a2 = a3.M.isEmpty() ? 0.0f : e.I();
        if (!a3.l.isEmpty()) {
            float f3 = 4.0f;
            a2 = f3 + ((f3 > 0.0f ? 6.0f : 0.0f) + j.I());
        }
        return 4.0f;
    }
}

