/*
 * Decompiled with CFR.
 */
package openonyx.render.group_m;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_m.RenderSupport_162;
import openonyx.render.group_m.RenderSupport_164;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_161
implements OnyxListener_001 {
    private boolean i = 1;
    private final static float f = 0.8f;
    private final static float H = 0.004f;
    private final static float e = 2.5f;

    private static int L(int a) {
return a >> 24 & 0xFF;
    }

    public void d() {
a.i = 1;
    }

    private static void L(boolean a) {
GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.disableCull();
        GlStateManager.depthMask(3 >> 2);
        GlStateManager.shadeModel(7425);
        if (a) {
            GlStateManager.disableDepth();
        }
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, List<RenderSupport_164> list, float f3, RenderSupport_162 class_162) {
        void a322;
        RenderSupport_161 class_161 = this;
if (!class_161.i) {
            return;
        }
        Entity a = e.getRenderViewEntity();
        if (a == null) {
            return;
        }
        Vec3 a322 = new Vec3(a.prevPosX + (a.posX - a.prevPosX) * (double)a322, a.prevPosY + (a.posY - a.prevPosY) * (double)a322, a.prevPosZ + (a.posZ - a.prevPosZ) * (double)a322);
        long l = System.currentTimeMillis();
        try {
            void a2;
            switch (a2.L()) {
                case i: {
                    void a4;
                    while (false) {
                    }
                    if (a4.size() >= 2) {
                        void a5;
                        class_161.L((List<RenderSupport_164>)a4, (float)a5, (RenderSupport_162)a2, a322, l);
                        return;
                    }
                    break;
                }
                case H: {
                    void a4;
                    if (a4.isEmpty()) break;
                    class_161.L((List<RenderSupport_164>)a4, (RenderSupport_162)a2, a322, l);
                }
                default: {
                    return;
                }
            }
        }
        catch (Throwable a322) {
            class_161.i = 0;
            OnyxClient.H.warn("Trails renderer has been disabled after a render failure", a322);
        }
    }

    public RenderSupport_161() {
        RenderSupport_161 a;
    }

    private static int d(int n, int n2) {
        int a = n2;
        int a2 = 0;
return Math.clamp((long)a, 0, 255) << 24 | a2 & 0xFFFFFF;
    }

    /*
     * WARNING - void declaration
     */
    private void L(Tessellator tessellator, WorldRenderer worldRenderer, List<RenderSupport_164> list, float f2, RenderSupport_162 class_162, Vec3 vec3, long l) {
        void a;
        void a2;
        Iterator a3 = list;
        RenderSupport_161 a4 = this;
a2.begin(3, DefaultVertexFormats.POSITION_COLOR);
        Iterator iterator = a3 = a3.iterator();
        while (iterator.hasNext()) {
            void a5;
            void a6;
            void a7;
            void a8;
            RenderSupport_164 class_164 = (RenderSupport_164)a3.next();
            iterator = a3;
            void v1 = a8;
            RenderSupport_161.L((WorldRenderer)a2, class_164.L(), (float)a7, (Vec3)a6, RenderSupport_161.d((RenderSupport_162)v1, RenderSupport_161.L(class_164, (RenderSupport_162)v1, (long)a5)));
        }
        a.draw();
    }

    private static int L(int n, int n2) {
        int a = n2;
        int a2 = 0;
return a2 >> a & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, Vec3 vec3, float f2, Vec3 vec32, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        WorldRenderer a5 = worldRenderer;
a5.pos(a4.xCoord - a3.xCoord, a4.yCoord + (double)a2 - a3.yCoord, a4.zCoord - a3.zCoord).color(RenderSupport_161.L(0, 16), RenderSupport_161.L(0, 8), RenderSupport_161.L(0, 0), RenderSupport_161.L(0)).endVertex();
    }

    private static int d(RenderSupport_162 class_162, float f2) {
        float a = f2;
        RenderSupport_162 a2 = class_162;
return RenderSupport_161.d(a2.L(), (int)(255.0f * Math.min(1.0f, a2.D() * 2.5f) * 0));
    }

    /*
     * WARNING - void declaration
     */
    private static float L(RenderSupport_164 class_164, RenderSupport_162 class_162, long l) {
        void a;
        Record a2 = class_162;
        RenderSupport_164 a3 = class_164;
return 1.0f - Math.clamp((float)(a - a3.L()) / (float)((RenderSupport_162)a2).L(), 0.0f, 1.0f);
    }

    private static int L(RenderSupport_162 class_162, float f2) {
        float a = f2;
        RenderSupport_162 a2 = class_162;
return RenderSupport_161.d(a2.L(), (int)(255.0f * a2.D() * 0));
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<RenderSupport_164> list, float f2, RenderSupport_162 class_162, Vec3 vec3, long l) {
        void a;
        void a2;
        void a3;
        void a4;
        int n;
        void a5;
        RenderSupport_161 class_161 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer a6 = tessellator.getWorldRenderer();
        RenderSupport_161.L(a5.L());
        a6.begin(7, DefaultVertexFormats.POSITION_COLOR);
        int n2 = 0;
        while (n2 < a4.size() - 1) {
            RenderSupport_164 class_164 = (RenderSupport_164)a4.get(0);
            RenderSupport_164 class_1642 = (RenderSupport_164)a4.get(1);
            void v1 = a5;
            int n3 = RenderSupport_161.L((RenderSupport_162)v1, RenderSupport_161.L(class_164, (RenderSupport_162)v1, (long)a3));
            int n4 = RenderSupport_161.L((RenderSupport_162)v1, RenderSupport_161.L(class_1642, (RenderSupport_162)a5, (long)a3));
            Object object = a6;
            Object object2 = a6;
            RenderSupport_161.L((WorldRenderer)object2, class_164.L(), 0.0f, (Vec3)a2, n3);
            RenderSupport_161.L((WorldRenderer)object2, class_164.L(), (float)a, (Vec3)a2, n3);
            RenderSupport_161.L((WorldRenderer)object, class_1642.L(), (float)a, (Vec3)a2, n4);
            RenderSupport_161.L((WorldRenderer)object, class_1642.L(), 0.0f, (Vec3)a2, n4);
            n2 = ++n;
        }
        tessellator.draw();
        GL11.glLineWidth(a5.d());
        RenderSupport_161 class_1612 = class_161;
        class_1612.L(tessellator, a6, (List<RenderSupport_164>)a4, 0.004f, (RenderSupport_162)a5, (Vec3)a2, (long)a3);
        class_1612.L(tessellator, a6, (List<RenderSupport_164>)a4, (float)(a - 0.004f), (RenderSupport_162)a5, (Vec3)a2, (long)a3);
        RenderSupport_161.L();
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<RenderSupport_164> list, RenderSupport_162 class_162, Vec3 vec3, long l) {
        void a;
        Iterator a2 = list;
        RenderSupport_161 a3 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        void v0 = a;
        RenderSupport_161.L(v0.L());
        GL11.glEnable(2832);
        GL11.glHint(3153, 4354);
        GL11.glPointSize(v0.L());
        worldRenderer.begin(0, DefaultVertexFormats.POSITION_COLOR);
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            void a4;
            void a5;
            RenderSupport_164 class_164 = (RenderSupport_164)a2.next();
            iterator = a2;
            void v2 = a;
            RenderSupport_161.L(worldRenderer, class_164.L(), 0.8f, (Vec3)a5, RenderSupport_161.d((RenderSupport_162)v2, RenderSupport_161.L(class_164, (RenderSupport_162)v2, (long)a4)));
        }
        tessellator.draw();
        GL11.glPointSize(1.0f);
        GL11.glDisable(2832);
        RenderSupport_161.L();
    }

    private static void L() {
GL11.glLineWidth(1.0f);
        GL11.glDisable(2848);
        GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.blendFunc(770, 771);
        GlStateManager.disableFog();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }
}

