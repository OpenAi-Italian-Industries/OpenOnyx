/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import openonyx.features.hud.CustomGui;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_w.RenderSupport_198;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_202 {
    final public static float H = 8.0f;
    private final static RenderSupport_121 e = new RenderSupport_121(0.0f);

    public static void L(float f2) {
        float f3;
        float f4;
        float f5 = f2;
CustomGui a22 = RenderSupport_198.L();
        if (a22 == null || !a22.d() || !a22.l.D()) {
            e.L(0.0f);
            return;
        }
        boolean bl = Minecraft.getMinecraft().currentScreen instanceof GuiChat;
        float a22 = a22.l.H.L();
        if (bl) {
            f4 = 1.0f;
            f3 = a22;
        } else {
            f4 = 0.0f;
            f3 = a22;
        }
        e.L(f4, f3, bl ? RenderSupport_123.H : RenderSupport_123.h);
        e.L(f5);
    }

    public static void L() {
e.L(0.0f);
    }

    public static float d() {
return e.L();
    }

    public static float L() {
CustomGui class_344 = RenderSupport_198.L();
        if (class_344 == null || !class_344.d() || !class_344.l.D()) {
            return 0.0f;
        }
        return e.L() * class_344.l.e.L();
    }

    private RenderSupport_202() {
        RenderSupport_202 a;
    }
}

