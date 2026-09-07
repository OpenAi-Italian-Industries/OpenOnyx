/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import openonyx.core.OnyxClient;
import openonyx.features.hud.CustomGui;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_w.RenderSupport_189;
import openonyx.render.group_w.RenderSupport_192;
import openonyx.render.group_w.RenderSupport_194;
import openonyx.render.group_w.RenderSupport_197;
import openonyx.render.group_w.RenderSupport_198;
import openonyx.render.group_w.RenderSupport_201;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_200 {
    private static RenderSupport_197 I;
    private static float d;
    private static RenderSupport_201 i;
    private static RenderSupport_189 f;
    private static RenderSupport_194 H;
    private static RenderSupport_192 e;

    public static float L() {
return d;
    }

    private static CustomGui L() {
CustomGui class_344 = RenderSupport_198.L();
        if (class_344 == null) {
            return null;
        }
        if (e == null) {
            e = new RenderSupport_192(class_344);
            H = new RenderSupport_194(class_344);
            f = new RenderSupport_189(class_344);
            i = new RenderSupport_201(class_344);
            I = new RenderSupport_197(class_344);
        }
        return class_344;
    }

    public static boolean L() {
CustomGui class_344 = RenderSupport_200.L();
        Minecraft minecraft = Minecraft.getMinecraft();
        if (class_344 != null && class_344.d() && minecraft.thePlayer != null && minecraft.theWorld != null) {
            return 1 != 0;
        }
        return false;
    }

    private RenderSupport_200() {
        RenderSupport_200 a;
    }

    /*
     * Unable to fully structure code
     */
    public static void L(RenderSupport_103 var0, float var1_3, float var2_4) {
        var4_5 = var0;
var3_6 = RenderSupport_200.L();
        if (var3_6 == null) {
            return;
        }
        a = Minecraft.getMinecraft();
        if (a.thePlayer == null || a.theWorld == null) {
            return;
        }
        var5_8 = RenderSupport_198.D();
        a = a.currentScreen instanceof GuiChat;
        var6_9 = OnyxClient.l.m;
        if (!var3_6.f.D()) ** GOTO lbl-1000
        v0 = var6_9;
        if (!v0.L(v0.f)) {
            RenderSupport_200.f.L(var4_5, a, (float)a, a);
            v1 = var3_6;
        } else lbl-1000:
        // 2 sources

        {
            RenderSupport_200.f.L();
            v1 = var3_6;
        }
        if (!v1.m.D()) ** GOTO lbl-1000
        v2 = var6_9;
        if (!v2.L(v2.e)) {
            RenderSupport_200.e.L(var4_5, a, (float)a, a);
            v3 = var3_6;
        } else lbl-1000:
        // 2 sources

        {
            RenderSupport_200.e.L();
            v3 = var3_6;
        }
        if (v3.I.D()) {
            RenderSupport_200.H.L(var4_5, a, (float)a, a);
            v4 = a;
        } else {
            RenderSupport_200.H.L();
            v4 = a;
        }
        var3_7 = v4;
        a = a / 2.0f - 103.0f;
        var6_10 = a / 2.0f + 103.0f;
        if (RenderSupport_200.i.L()) {
            RenderSupport_200.i.L(var4_5, a, (float)a, var5_8);
            var3_7 = RenderSupport_200.i.d();
            a = RenderSupport_200.i.D();
            var6_10 = RenderSupport_200.i.L();
        }
        a = var3_7;
        if (RenderSupport_200.I.L()) {
            RenderSupport_200.I.L(var4_5, a, var6_10, var3_7, var5_8);
            if (Float.isFinite(RenderSupport_200.I.L())) {
                a = Math.min(a, RenderSupport_200.I.L());
            }
        }
        RenderSupport_200.d = a;
    }

    static {
        d = Float.NaN;
    }

    public static void L() {
if (e == null) {
            return;
        }
        e.L();
        H.L();
        f.L();
        i.L();
        I.L();
        d = Float.NaN;
    }
}

