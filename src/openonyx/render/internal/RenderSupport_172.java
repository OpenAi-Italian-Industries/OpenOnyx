/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package openonyx.render.internal;

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
import openonyx.events.HypixelUtils;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.render.internal.RenderSupport_174;
import openonyx.render.internal.RenderSupport_175;
import openonyx.render.internal.RenderSupport_176;
import openonyx.render.internal.RenderSupport_178;
import openonyx.render.internal.RenderMode_171;
import openonyx.render.internal.RenderListener_173;
import openonyx.utilities.FileUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public final class RenderSupport_172
implements AutoCloseable,
OnyxListener_001 {
    private final static float m = 0.84f;
    private final static float h = 1.22f;
    private RenderSupport_166 l;
    private final static float I = 1.0f;
    final public static int d = 220;
    private final static float i = 0.96f;
    private boolean f;
    private boolean H = 1;
    private final static long e = 180000000000L;

    /*
     * WARNING - void declaration
     */
    private void L(List<RenderSupport_176> list, RenderSupport_175 class_175, Vec3 vec3, int n, int n2) {
        void a;
        void a2;
        void a3;
        int a4;
        int a5;
        int n3 = n2;
        RenderSupport_172 a6 = this;
int n4 = RenderSupport_172.d(a5, a4);
        a5 = RenderSupport_172.d(a5, (int)((float)a4 * 0.45f));
        a4 = a3.d() && a6.L() ? 1 : 0;
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(4, DefaultVertexFormats.POSITION_COLOR);
        RenderSupport_172.L((List<RenderSupport_176>)a2, (RenderSupport_175)a3, (Vec3)a, (class_176, matrix4f, f2) -> {
            void a;
            void a2;
            void a3;
            void a4;
            void a5;
            float f3 = f2;
            WorldRenderer a6 = worldRenderer;
RenderSupport_172.L(a6, (Matrix4f)a5, (float)a4, 1.0f, a3.L().L(), (int)a2, (int)a);
        });
        tessellator.draw();
        if (a4 != 0) {
            RenderSupport_166.L();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        int a2 = n2;
        int a3 = 0;
int n3 = RenderSupport_172.L(a3, 24) + (int)((float)(RenderSupport_172.L(a2, 24) - RenderSupport_172.L(a3, 24)) * a);
        int n4 = RenderSupport_172.L(a3, 16) + (int)((float)(RenderSupport_172.L(a2, 16) - RenderSupport_172.L(a3, 16)) * a);
        int n5 = RenderSupport_172.L(a3, 8) + (int)((float)(RenderSupport_172.L(a2, 8) - RenderSupport_172.L(a3, 8)) * a);
        a2 = RenderSupport_172.L(a3, 0) + (int)((float)(RenderSupport_172.L(a2, 0) - RenderSupport_172.L(a3, 0)) * a);
        return n3 << 24 | n4 << 16 | n5 << 8 | a2;
    }

    /*
     * WARNING - void declaration
     */
    private void d(List<RenderSupport_176> list, RenderSupport_175 class_175, Vec3 vec3, int n, int n2, int n3) {
        void a;
        void a2;
        void a3;
        int a4;
        int a5;
        int a6;
        int n4 = n3;
        RenderSupport_172 a7 = this;
int n5 = RenderSupport_172.d(a6, (int)((float)a5 * 0.22f));
        a6 = RenderSupport_172.d(a6, 0);
        a5 = RenderSupport_172.d(a4, (int)((float)a5 * 0.26f));
        a4 = RenderSupport_172.d(a4, 0);
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(4, DefaultVertexFormats.POSITION_COLOR);
        RenderSupport_172.L((List<RenderSupport_176>)a3, (RenderSupport_175)a2, (Vec3)a, (class_176, matrix4f, f2) -> {
            void a;
            void a2;
            void a3;
            void a4;
            void a5;
            void a6;
            RenderSupport_178[] a7;
            WorldRenderer worldRenderer = worldRenderer;
            worldRenderer = class_176;
            WorldRenderer a8 = worldRenderer;
a7 = a7.L().L();
            WorldRenderer worldRenderer2 = a8;
            RenderSupport_172.L(worldRenderer2, (Matrix4f)a6, (float)a5, 1.22f, a7, (int)a4, (int)a3);
            RenderSupport_172.L(worldRenderer2, (Matrix4f)a6, (float)a5, 0.84f, a7, (int)a2, (int)a);
        });
        tessellator.draw();
    }

    @Override
    public void close() {
        RenderSupport_172 a;
RenderSupport_172 class_172 = a;
        a.H = 1;
        class_172.f = 0;
        class_172.l = null;
    }

    private static int d(int n, int n2) {
        int a = n2;
        int a2 = 0;
return Math.clamp((long)a, 0, 255) << 24 | a2 & 0xFFFFFF;
    }

    private static int L(int n, float f2) {
        float a = f2;
        int a2 = 0;
int n2 = a2;
        return RenderSupport_172.d(n2, Math.clamp((long)((int)((float)RenderSupport_172.L(n2) * 0)), 0, 255));
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<RenderSupport_176> list, RenderSupport_175 class_175, Vec3 vec3, int n, int n2, int n3) {
        void a;
        void a2;
        void a3;
        int a4;
        int a5;
        int a6;
        int n4 = n3;
        RenderSupport_172 a7 = this;
a6 = RenderSupport_172.d(a6, (int)Math.min(255.0f, (float)a5 * 0.95f));
        int n5 = a4 = RenderSupport_172.d(a4, (int)((float)a5 * 0.2f));
        a5 = RenderSupport_172.d(n5, Math.max(Math.round(8.0f * a3.i()), (int)((float)RenderSupport_172.L(n5) * 0.75f)));
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        GL11.glLineWidth(2.2f);
        worldRenderer.begin(1, DefaultVertexFormats.POSITION_COLOR);
        RenderSupport_172.L((List<RenderSupport_176>)a2, (RenderSupport_175)a3, (Vec3)a, (class_176, matrix4f, f2) -> {
            int n4;
            void a;
            void a2;
            int n5;
            RenderMode_171 a3;
            int a42 = a6;
            WorldRenderer a5 = worldRenderer;
a3 = ((RenderSupport_176)((Object)a3)).L();
            RenderSupport_178[] class_178Array = a3.L();
            int n6 = 0;
            while (n6 < class_178Array.length) {
                RenderSupport_178 class_178 = class_178Array[0];
                RenderSupport_178 class_1782 = class_178Array[1 % class_178Array.length];
                WorldRenderer worldRenderer2 = a5;
                RenderSupport_172.L(worldRenderer2, (Matrix4f)a2, (float)(a * class_178.L() * 1.0f), class_178.d() * 1.0f, a42);
                RenderSupport_172.L(worldRenderer2, (Matrix4f)a2, (float)(a * class_1782.L() * 1.0f), class_1782.d() * 1.0f, a42);
                n6 = ++n5;
            }
            int[] nArray = a3.L();
            int n7 = nArray.length;
            int n8 = 0;
            while (n8 < n7) {
                a42 = nArray[0];
                if (a42 < class_178Array.length) {
                    void a6;
                    void a7;
                    RenderSupport_178 a42 = class_178Array[a42];
                    WorldRenderer worldRenderer3 = a5;
                    RenderSupport_172.L(worldRenderer3, (Matrix4f)a2, 0.0f, 0.0f, (int)a7);
                    RenderSupport_172.L(worldRenderer3, (Matrix4f)a2, (float)(a * a42.L() * 0.96f), a42.d() * 0.96f, RenderSupport_172.L((int)a6, a42.D()));
                }
                n8 = ++n4;
            }
        });
        tessellator.draw();
        GL11.glLineWidth(1.0f);
    }

    private static void L(boolean a) {
GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.disableCull();
        GlStateManager.depthMask(0 != 0);
        GlStateManager.shadeModel(7425);
        if (a) {
            GlStateManager.disableDepth();
        }
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
    }

    public RenderSupport_172() {
        RenderSupport_172 a;
    }

    /*
     * WARNING - void declaration
     */
    private static Matrix4f L(Matrix4f matrix4f, RenderSupport_176 class_176, float f2) {
        void a;
        Matrix4f a2;
        void a3;
        Matrix4f matrix4f2 = matrix4f;
RenderSupport_174 class_174 = a3.L();
        Matrix4f matrix4f3 = a2 = new Matrix4f(matrix4f2);
        matrix4f3.translate(new Vector3f((float)(a * class_174.D()), 0.0f, class_174.k()));
        a2.rotate((float)Math.toRadians((double)(a * a3.L())), new Vector3f(0.0f, 1.0f, 0.0f));
        a2.rotate((float)Math.toRadians((double)(a * class_174.i())), new Vector3f(0.0f, 0.0f, 1.0f));
        a2.rotate((float)Math.toRadians(class_174.j()), new Vector3f(1.0f, 0.0f, 0.0f));
        return matrix4f3;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, Matrix4f matrix4f, float f2, float f3, RenderSupport_178[] class_178Array, int n, int n2) {
        void a;
        int n3;
        WorldRenderer worldRenderer2 = worldRenderer;
int n4 = 0;
        while (n4 < ((void)a).length) {
            void a2;
            void a3;
            void a4;
            void a5;
            void a6;
            void var8_9 = a[0];
            void v1 = a;
            WorldRenderer a7 = v1[1 % ((void)v1).length];
            WorldRenderer worldRenderer3 = worldRenderer2;
            void v3 = a6;
            RenderSupport_172.L(worldRenderer2, (Matrix4f)v3, 0.0f, 0.0f, (int)a5);
            RenderSupport_172.L(worldRenderer3, (Matrix4f)v3, (float)(a4 * var8_9.L() * a3), var8_9.d() * a3, RenderSupport_172.L((int)a2, var8_9.D()));
            RenderSupport_172.L(worldRenderer3, (Matrix4f)a6, (float)(a4 * ((RenderSupport_178)((Object)a7)).L() * a3), ((RenderSupport_178)((Object)a7)).d() * a3, RenderSupport_172.L((int)a2, ((RenderSupport_178)((Object)a7)).D()));
            n4 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static Matrix4f L(RenderSupport_176 class_176, RenderSupport_175 class_175, Vec3 vec3) {
        void a;
        void a2;
        RenderSupport_176 class_1762 = class_176;
Record a3 = class_1762.L();
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.translate(new Vector3f((float)(class_1762.L().xCoord - a2.xCoord), (float)(class_1762.L().yCoord - a2.yCoord), (float)(class_1762.L().zCoord - a2.zCoord)));
        matrix4f.rotate((float)Math.toRadians(180.0f - class_1762.d()), new Vector3f(0.0f, 1.0f, 0.0f));
        if (((RenderSupport_174)a3).m() != 0.0f || ((RenderSupport_174)a3).l() != 0.0f) {
            matrix4f.translate(new Vector3f(0.0f, ((RenderSupport_174)a3).m(), ((RenderSupport_174)a3).l()));
        }
        if (((RenderSupport_174)a3).B() != 0.0f) {
            matrix4f.rotate((float)Math.toRadians(((RenderSupport_174)a3).B()), new Vector3f(1.0f, 0.0f, 0.0f));
        }
        if (((RenderSupport_174)a3).A() != 0.0f) {
            matrix4f.rotate((float)Math.toRadians(((RenderSupport_174)a3).A()), new Vector3f(0.0f, 1.0f, 0.0f));
        }
        if (((RenderSupport_174)a3).h() != 0.0f) {
            matrix4f.rotate((float)Math.toRadians(((RenderSupport_174)a3).h()), new Vector3f(0.0f, 0.0f, 1.0f));
        }
        Matrix4f matrix4f2 = matrix4f;
        matrix4f2.translate(new Vector3f(0.0f, ((RenderSupport_174)a3).I() + a.L(), ((RenderSupport_174)a3).d() + a.d()));
        float f2 = a = a.D() * ((RenderSupport_174)a3).H();
        matrix4f.scale(new Vector3f(f2, f2, f2));
        return matrix4f2;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(List<RenderSupport_176> list, RenderSupport_175 class_175, Vec3 vec3, RenderListener_173 interface_173) {
        Iterator<RenderSupport_176> iterator;
        List<RenderSupport_176> list2 = list;
Iterator<RenderSupport_176> iterator2 = iterator = list2.iterator();
        while (iterator2.hasNext()) {
            void a;
            void a2;
            void a3;
            RenderSupport_176 a4 = iterator.next();
            Matrix4f matrix4f = RenderSupport_172.L(a4, (RenderSupport_175)a3, (Vec3)a2);
            iterator2 = iterator;
            void v1 = a;
            Object object = a4;
            v1.L((RenderSupport_176)object, RenderSupport_172.L(matrix4f, (RenderSupport_176)object, -1.0f), -1.0f);
            v1.L(a4, RenderSupport_172.L(matrix4f, a4, 1.0f), 1.0f);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, List<RenderSupport_176> list, RenderSupport_175 class_175) {
        void a;
        void a422;
        void a2;
        RenderSupport_172 class_172 = this;
if (!class_172.H || a2.isEmpty()) {
            return;
        }
        Entity a32 = e.getRenderViewEntity();
        if (a32 == null) {
            return;
        }
        Vec3 a422 = new Vec3(a32.prevPosX + (a32.posX - a32.prevPosX) * (double)a422, a32.prevPosY + (a32.posY - a32.prevPosY) * (double)a422, a32.prevPosZ + (a32.posZ - a32.prevPosZ) * (double)a422);
        int a32 = a.L() | 0xFF000000;
        int n = RenderSupport_172.L(a32, -1, 0.28f);
        int n2 = RenderSupport_172.L(a32, -1, 0.55f);
        int n3 = Math.round(255.0f * a.i());
        try {
            RenderSupport_172.L(a.L());
            RenderSupport_172 class_1722 = class_172;
            void v1 = a2;
            class_172.d((List<RenderSupport_176>)v1, (RenderSupport_175)a, a422, n, n2, n3);
            class_1722.L((List<RenderSupport_176>)v1, (RenderSupport_175)a, a422, a32, n3);
            class_1722.L((List<RenderSupport_176>)a2, (RenderSupport_175)a, a422, a32, n, n3);
            RenderSupport_172.L();
            return;
        }
        catch (Throwable a422) {
            class_172.H = 0;
            OnyxClient.H.warn("Wings renderer has been disabled after a render failure", a422);
            return;
        }
    }

    private boolean L() {
        RenderSupport_172 a;
if (!a.f) {
            RenderSupport_172 class_172 = a;
            class_172.f = 1;
            class_172.l = RenderSupport_166.L(FileUtils.L("0\"&4\u0000;6\"8?\u0000-*>0>>"));
        }
        if (a.l == null || !a.l.L()) {
            return false;
        }
        RenderSupport_172 class_172 = a;
        class_172.l.d();
        class_172.l.L("uTime", (float)(System.nanoTime() % 180000000000L) / 1.0E9f);
        class_172.l.L(FileUtils.L("*\u001e:?0 *86#1"), RenderSupport_172.e.displayWidth, RenderSupport_172.e.displayHeight);
        return 3 >> 1;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, Matrix4f matrix4f, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        WorldRenderer a4 = matrix4f;
        WorldRenderer a5 = worldRenderer;
a4 = Matrix4f.transform((Matrix4f)a4, (Vector4f)new Vector4f((float)a3, (float)a2, 0.0f, 1.0f), null);
        a5.pos(((Vector4f)a4).x, ((Vector4f)a4).y, ((Vector4f)a4).z).color(RenderSupport_172.L((int)a, 16), RenderSupport_172.L((int)a, 8), RenderSupport_172.L((int)a, 0), RenderSupport_172.L((int)a)).endVertex();
    }

    private static int L(int n, int n2) {
        int a = n2;
        int a2 = 0;
return a2 >> a & 0xFF;
    }

    private static int L(int a) {
return a >> 24 & 0xFF;
    }

    private static void L() {
GL11.glDisable(2848);
        GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(--1 != 0);
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
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

