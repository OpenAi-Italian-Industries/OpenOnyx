/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.entity.boss.BossStatus;
import openonyx.core.OnyxListener_001;
import openonyx.events.EntityRelationUtils;
import openonyx.features.hud.CustomGui;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;
import openonyx.render.group_w.RenderSupport_188;
import openonyx.render.group_w.RenderSupport_191;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_059;

public final class RenderSupport_189
extends RenderSupport_191 {
    private final RenderSupport_121 g;
    private final static float M = 0.5f;
    private String L;
    private float j;
    private final CustomGui m;
    private final static float h = 182.0f;
    private final static float l = 3.0f;
    private final RenderSupport_121 I;
    private final static float d = 2.0f;
    private final static float i = 0.7f;
    private final static RenderSupport_128 f = new RenderSupport_128(RenderMode_131.f, RenderMode_130.e, 12.0f, 15.0f);
    private final static float H = 10.0f;
    private final static float e = 6.0f;

    @Override
    protected float d(RenderSupport_103 class_103) {
        OnyxListener_001 a = class_103;
        RenderSupport_189 a2 = this;
return 182.0f;
    }

    @Override
    protected boolean L(boolean bl) {
        boolean a = bl;
        RenderSupport_189 a2 = this;
if (BossStatus.bossName != null && BossStatus.statusBarTime > 0) {
            BossStatus.statusBarTime -= 1;
            RenderSupport_189 class_189 = a2;
            class_189.L = BossStatus.bossName;
            class_189.j = Math.clamp(BossStatus.healthScale, 0.0f, 1.0f);
            return 3 >> 1;
        }
        if (a) {
            RenderSupport_189 class_189 = a2;
            class_189.L = "Boss";
            class_189.j = 0.7f;
            return --1 != 0;
        }
        return false;
    }

    @Override
    protected float L(RenderSupport_103 class_103) {
        OnyxListener_001 a = class_103;
        RenderSupport_189 a2 = this;
return f.I() + 3.0f + 6.0f;
    }

    public RenderSupport_189(CustomGui class_344) {
        RenderSupport_189 a;
        OnyxListener_001 a2 = class_344;
        RenderSupport_189 class_189 = a = this;
        super("mcgui:bossbar", ((CustomGui)a2).f.f, ((CustomGui)a2).f.i, ((CustomGui)a2).f.e);
        RenderSupport_189 class_1892 = a;
        a.g = new RenderSupport_121(0.0f);
        class_1892.I = new RenderSupport_121(0.0f);
        class_189.L = "";
        class_189.m = a2;
    }

    @Override
    protected void L(float f2) {
        float a = f2;
        RenderSupport_189 a2 = this;
RenderSupport_189 class_189 = a2;
        RenderSupport_189 class_1892 = a2;
        class_189.g.L(class_189.j, 200.0f, RenderSupport_123.l);
        class_1892.g.L(0);
        RenderSupport_189 class_1893 = a2;
        if (class_1892.j >= a2.I.d()) {
            RenderSupport_189 class_1894 = a2;
            class_1893.I.L(Math.max(class_1894.j, class_1894.g.L()));
            return;
        }
        class_1893.I.L(a2.j, 500.0f, RenderSupport_123.h);
        a2.I.L(0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void L(RenderSupport_103 class_103, float f2, float f3, float f4) {
        float f5;
        float f6;
        void a;
        void a2;
        float a3 = f2;
        RenderSupport_189 a4 = this;
ThemeSupport_055 a5 = ThemeSupport_059.L();
        RenderSupport_189 class_189 = a4;
        RenderSupport_188.L((RenderSupport_103)a2, f, class_189.L, a3 / 2.0f, a2.d(f, f.I() / 2.0f), a5.d());
        a2.D(0.0f, (float)(a -= 6.0f), a3, 6.0f, Float.MAX_VALUE, a5.n());
        if (class_189.m.f.H.d()) {
            a4.L((RenderSupport_103)a2, a5, a3, (float)a);
            return;
        }
        float f7 = a3 * a4.I.L();
        if (f6 > 0.5f) {
            a2.D(0.0f, (float)a, f7, 6.0f, Float.MAX_VALUE, ThemeSupport_059.L(a5.K(), 0.45f));
        }
        a3 *= a4.g.L();
        if (f5 > 0.5f) {
            a2.D(0.0f, (float)a, a3, 6.0f, Float.MAX_VALUE, a5.K());
        }
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3) {
        int n;
        float a = f2;
        RenderSupport_189 a2 = this;
float f4 = 0.2f;
        float f5 = f4 - 2.0f;
        a *= a2.g.L();
        int n2 = 0;
        while ((float)n2 < 10.0f) {
            void a3;
            void a4;
            void a5;
            float f6;
            float f7 = 0.0f * f4;
            if (f6 >= 0) {
                return;
            }
            void v2 = a5;
            v2.d(f7, (float)a4, Math.min(f5, 0 - f7), 6.0f);
            v2.D(f7, (float)a4, f5, 6.0f, Float.MAX_VALUE, a3.K());
            a5.L();
            n2 = ++n;
        }
    }
}

