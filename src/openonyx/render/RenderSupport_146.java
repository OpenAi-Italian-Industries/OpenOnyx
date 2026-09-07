/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.events.HypixelUtils;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_097;
import openonyx.render.RenderSupport_108;
import openonyx.render.RenderSupport_109;
import openonyx.render.group_p.RenderSupport_166;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_146
implements OnyxListener_001 {
    private static RenderSupport_166 d;
    private static boolean i;
    private static boolean f;
    private final static RenderSupport_108 H;
    private static boolean e;

    public static void d() {
i = 0;
    }

    public static void L() {
        float f2;
if (f || OnyxClient.l == null) {
            return;
        }
        float f3 = OnyxClient.l.U.d();
        if (f2 <= 0.0f) {
            i = 0;
            return;
        }
        if (!RenderSupport_109.L()) {
            return;
        }
        if (!e) {
            e = 1;
            d = RenderSupport_166.L("onyx_motion_blur", "onyx_post", "onyx_motion_blur");
        }
        if (d == null || !d.L()) {
            return;
        }
        int n = RenderSupport_109.d();
        int n2 = RenderSupport_109.L();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        try {
            if (H.L(n, n2)) {
                i = 0;
            }
            if (i) {
                float f4 = f3;
                RenderSupport_109.L(d, (RenderSupport_166 class_166) -> {
                    RenderSupport_166 a = class_166;
                    float a2 = f4;
RenderSupport_097.L(1, H.d());
                    RenderSupport_166 class_1662 = a;
                    class_1662.L("Sampler1", 1);
                    class_1662.L("uAmount", a2);
                    GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
                });
                RenderSupport_097.L(1, 0);
                GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
            }
            GlStateManager.bindTexture(H.d());
            int n3 = 0;
            GL11.glCopyTexSubImage2D(3553, n3, n3, n3, n3, 0, n, n2);
            GlStateManager.bindTexture(0);
            i = 1;
            return;
        }
        catch (Throwable throwable) {
            OnyxClient.H.error("Motion blur disabled", throwable);
            f = 1;
            i = 0;
            H.L();
            return;
        }
    }

    private RenderSupport_146() {
        RenderSupport_146 a;
    }

    static {
        H = new RenderSupport_108(0 != 0);
    }
}

