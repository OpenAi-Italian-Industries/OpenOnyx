/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.renderer.GlStateManager;

public final class RenderSupport_132 {
    final static RenderSupport_132 e = new RenderSupport_132();

    public RenderSupport_132 L(float f2) {
        float a = f2;
        RenderSupport_132 a2 = this;
GlStateManager.rotate((float)Math.toDegrees(0), 0.0f, 0.0f, 1.0f);
        return a2;
    }

    public RenderSupport_132 d() {
        RenderSupport_132 a;
GlStateManager.popMatrix();
        return a;
    }

    private RenderSupport_132() {
        RenderSupport_132 a;
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_132 d(float f2, float f3) {
        void a;
        float a2 = f3;
        RenderSupport_132 a3 = this;
GlStateManager.translate((float)a, 4, 0.0f);
        return a3;
    }

    public RenderSupport_132 L() {
        RenderSupport_132 a;
GlStateManager.pushMatrix();
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_132 L(float f2, float f3) {
        void a;
        float a2 = f3;
        RenderSupport_132 a3 = this;
GlStateManager.scale((float)a, 4, 1.0f);
        return a3;
    }
}

