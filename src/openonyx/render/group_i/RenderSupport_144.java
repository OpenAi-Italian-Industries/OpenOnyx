/*
 * Decompiled with CFR.
 */
package openonyx.render.group_i;

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
import openonyx.render.group_g.RenderSupport_137;
import openonyx.render.group_i.RenderSupport_142;
import openonyx.render.group_i.RenderSupport_143;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

public final class RenderSupport_144
implements OnyxListener_001 {
    private final static int D = -1;
    private final static float c = 2.0f;
    private final static float a = 0.07f;
    private final static float k = 0.14f;
    private final static float g = (float)Math.PI * 2;
    private final int[] M;
    private final static int L = 48;
    private final static float j = 1.01f;
    private final static float[] m;
    private final static float h = 0.12f;
    private final static int l = 8;
    private boolean I;
    private final static float d = 0.22f;
    private final static int i = 48;
    private final static float[] f;
    private final static float H = 0.012f;
    private final static float e = 1.35f;

    private static void i() {
GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_142 class_142) {
        int a;
        RenderSupport_144 class_144 = this;
int n = 0;
        while (n <= 48) {
            void a2;
            int n2 = a++;
            class_144.M[n2] = RenderSupport_144.L((RenderSupport_142)a2, (float)Math.PI * 2 * (float)n2 / 48.0f);
            n = 0;
        }
    }

    private static void L(boolean a) {
GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.enableBlend();
        RenderSupport_144.i();
        GlStateManager.disableCull();
        GlStateManager.depthMask(0 != 0);
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
    private void i(List<RenderSupport_145> list, RenderSupport_142 class_142, Vec3 vec3) {
        void a;
        RenderSupport_144 class_144 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        int a2 = (int)(255.0f * a.d() * 0.7f);
        for (Object object : a2) {
            void a3;
            object = new RenderSupport_143((RenderSupport_145)object, (Vec3)a3);
            int n = 0;
            while (n < 8) {
                int n2;
                float f2 = (float)n2 / 8.0f;
                float f3 = (float)(n2 + 1) / 8.0f;
                void v1 = a;
                float f4 = v1.i() * RenderSupport_144.L(f2);
                float f5 = v1.i() * RenderSupport_144.L(f3);
                f2 = v1.D() * RenderSupport_144.d(f2);
                f3 = v1.D() * RenderSupport_144.d(f3);
                int n3 = 0;
                while (n3 < 48) {
                    int a4;
                    RenderSupport_144 class_1442 = class_144;
                    int n4 = RenderSupport_144.L(class_1442.M[a4], a2);
                    int n5 = RenderSupport_144.L(class_1442.M[a4 + 1], a2);
                    Object object2 = object;
                    WorldRenderer worldRenderer2 = worldRenderer;
                    float f6 = f4;
                    ((RenderSupport_143)object).L(worldRenderer, f6 * m[a4], f2, f4 * f[a4], n4);
                    ((RenderSupport_143)object).L(worldRenderer2, f6 * m[a4 + 1], f2, f4 * f[a4 + 1], n5);
                    ((RenderSupport_143)object2).L(worldRenderer2, f5 * m[a4 + 1], f3, f5 * f[a4 + 1], n5);
                    float f7 = f5 * m[a4];
                    float f8 = f[a4];
                    ((RenderSupport_143)object2).L(worldRenderer, f7, f3, f5 * f8, n4);
                    n3 = ++a4;
                }
                n = ++n2;
            }
        }
        tessellator.draw();
    }

    /*
     * WARNING - void declaration
     */
    private static int L(RenderSupport_142 class_142, float f2, float f3) {
        void a;
        float a2 = f3;
        RenderSupport_142 a3 = class_142;
a2 = RenderSupport_144.D(4);
        return RenderSupport_144.L(RenderSupport_144.L(RenderSupport_144.L(a3, (float)a), -1, 1.4f), (int)(255.0f * a3.d() * 0.8f * 4));
    }

    private static void D() {
int n = 1;
        GlStateManager.tryBlendFuncSeparate(770, n, n, 0);
    }

    private static int L(int a) {
return a >> 24 & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private void D(List<RenderSupport_145> list, RenderSupport_142 class_142, Vec3 vec3) {
        void a;
        RenderSupport_144 class_144 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        GL11.glLineWidth(2.0f);
        worldRenderer.begin(1, DefaultVertexFormats.POSITION_COLOR);
        void v0 = a;
        int a2 = (int)(255.0f * v0.d());
        float f2 = a.i();
        float f3 = v0.D() * RenderSupport_144.d(0.0f);
        Iterator iterator = a2.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a3;
                RenderSupport_145 class_145 = (RenderSupport_145)iterator.next();
                RenderSupport_143 class_143 = new RenderSupport_143(class_145, (Vec3)a3);
                int n = 0;
                while (n < 48) {
                    int a222;
                    RenderSupport_143 class_1432 = class_143;
                    class_1432.L(worldRenderer, f2 * m[0], f3, f2 * f[0], RenderSupport_144.L(class_144.M[0], a2));
                    float f4 = f2 * m[1];
                    float f5 = f2 * f[1];
                    int n2 = class_144.M[1];
                    class_1432.L(worldRenderer, f4, f3, f5, RenderSupport_144.L(n2, a2));
                    n = ++a222;
                }
                if (!a.D()) {
                    iterator2 = iterator;
                    continue;
                }
                float a222 = class_145.d() + a.h();
                float f6 = (float)Math.cos(0);
                float f7 = (float)Math.sin(0);
                int a222 = RenderSupport_144.L(RenderSupport_144.L((RenderSupport_142)a, 0), a2);
                int n3 = 0;
                while (true) {
                    int n4;
                    if (n3 >= 8) continue block0;
                    float f8 = (float)n4 / 8.0f;
                    float f9 = (float)(n4 + 1) / 8.0f;
                    void v8 = a;
                    float f10 = v8.i() * RenderSupport_144.L(f8) * 1.01f;
                    float f11 = v8.i() * RenderSupport_144.L(f9) * 1.01f;
                    f8 = v8.D() * (RenderSupport_144.d(f8) + 0.012f);
                    f9 = v8.D() * (RenderSupport_144.d(f9) + 0.012f);
                    RenderSupport_143 class_1433 = class_143;
                    class_1433.L(worldRenderer, f10 * f6, f8, f10 * f7, a222);
                    class_1433.L(worldRenderer, f11 * f6, f9, f11 * f7, a222);
                    n3 = ++n4;
                }
            }
            break;
        }
        tessellator.draw();
        GL11.glLineWidth(1.0f);
    }

    private static float D(float f2) {
        float f3 = f2;
float a = Math.clamp(1.0f - f3, 0.0f, 1.0f);
        return a * a * (3.0f - 2.0f * a);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(WorldRenderer worldRenderer, double d, double d2, double d3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = n;
        WorldRenderer a5 = worldRenderer;
a5.pos((double)a4, (double)a3, (double)a2).color(RenderSupport_144.d(0, 16), RenderSupport_144.d(0, 8), RenderSupport_144.d(0, 0), RenderSupport_144.L(0)).endVertex();
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        int a2 = n2;
        int a3 = 0;
int n3 = RenderSupport_144.d(a3, 16) + (int)((float)(RenderSupport_144.d(a2, 16) - RenderSupport_144.d(a3, 16)) * a);
        int n4 = RenderSupport_144.d(a3, 8) + (int)((float)(RenderSupport_144.d(a2, 8) - RenderSupport_144.d(a3, 8)) * a);
        a2 = RenderSupport_144.d(a3, 0) + (int)((float)(RenderSupport_144.d(a2, 0) - RenderSupport_144.d(a3, 0)) * a);
        return a3 & 0xFF000000 | n3 << 16 | n4 << 8 | a2;
    }

    /*
     * WARNING - void declaration
     */
    private void d(List<RenderSupport_145> list, RenderSupport_142 class_142, Vec3 vec3) {
        Iterator a;
        RenderSupport_144 class_144 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        a = a.iterator();
        while (a.hasNext()) {
            void a2;
            void a3;
            RenderSupport_145 class_145 = (RenderSupport_145)a.next();
            RenderSupport_143 class_143 = new RenderSupport_143(class_145, (Vec3)a3);
            float f2 = class_145.d() + a2.h();
            int n = 0;
            while (n < 48) {
                int n2;
                float f3 = f2 - a2.L() * (float)n2 / 48.0f;
                float a4 = f2 - a2.L() * (float)(n2 + 1) / 48.0f;
                void v1 = a2;
                int n3 = RenderSupport_144.L((RenderSupport_142)v1, f3, (float)n2 / 48.0f);
                int n4 = RenderSupport_144.L((RenderSupport_142)v1, a4, (float)(n2 + 1) / 48.0f);
                if (RenderSupport_144.L(n3) != 0 || RenderSupport_144.L(n4) != 0) {
                    float f4 = (float)Math.cos(f3);
                    f3 = (float)Math.sin(f3);
                    float f5 = (float)Math.cos(a4);
                    a4 = (float)Math.sin(a4);
                    int n5 = 0;
                    while (n5 < 8) {
                        int n6;
                        float f6 = (float)n6 / 8.0f;
                        float f7 = (float)(n6 + 1) / 8.0f;
                        void v3 = a2;
                        float f8 = v3.i() * RenderSupport_144.L(f6) * 1.01f;
                        float f9 = v3.i() * RenderSupport_144.L(f7) * 1.01f;
                        f6 = v3.D() * (RenderSupport_144.d(f6) + 0.012f);
                        f7 = v3.D() * (RenderSupport_144.d(f7) + 0.012f);
                        RenderSupport_143 class_1432 = class_143;
                        WorldRenderer worldRenderer2 = worldRenderer;
                        class_143.L(worldRenderer, f8 * f4, f6, f8 * f3, n3);
                        class_143.L(worldRenderer2, f9 * f4, f7, f9 * f3, n3);
                        class_1432.L(worldRenderer2, f9 * f5, f7, f9 * a4, n4);
                        class_1432.L(worldRenderer, f8 * f5, f6, f8 * a4, n4);
                        n5 = ++n6;
                    }
                }
                n = ++n2;
            }
        }
        tessellator.draw();
    }

    private static float d(float a) {
return (float)Math.pow(a, 1.35f) + 0.12f * (float)Math.pow(1.0f - a, 5.0);
    }

    private static int d(int n, int n2) {
        int a = n2;
        int a2 = 0;
return a2 >> a & 0xFF;
    }

    public RenderSupport_144() {
        RenderSupport_144 a;
        RenderSupport_144 class_144 = a;
        class_144.I = 1;
        class_144.M = new int[49];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static int L(RenderSupport_142 class_142, float f2) {
        void a;
        RenderSupport_142 class_1422 = class_142;
switch (class_1422.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case H: {
                return class_1422.d();
            }
            case i: {
                return RenderSupport_144.L(class_1422.d(), class_1422.L(), 0.5f - 0.5f * (float)Math.cos((double)(a + class_1422.I())));
            }
            case f: 
        }
        float[] fArray = ThemeSupport_064.L(class_1422.d());
        Object a2 = fArray;
        return ThemeSupport_064.L(fArray[0] + (float)Math.toDegrees((double)(a + class_1422.I())), (float)a2[1], (float)a2[2], 255);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, List<RenderSupport_145> list, RenderSupport_142 class_142) {
        void a322;
        void a;
        RenderSupport_144 class_144 = this;
if (!class_144.I || a.isEmpty()) {
            return;
        }
        Entity a2 = e.getRenderViewEntity();
        if (a2 == null) {
            return;
        }
        Vec3 a322 = new Vec3(a2.prevPosX + (a2.posX - a2.prevPosX) * (double)a322, a2.prevPosY + (a2.posY - a2.prevPosY) * (double)a322, a2.prevPosZ + (a2.posZ - a2.prevPosZ) * (double)a322);
        try {
            void a4;
            void v0 = a4;
            class_144.L((RenderSupport_142)v0);
            RenderSupport_144.L(v0.d());
            class_144.i((List<RenderSupport_145>)a, (RenderSupport_142)v0, a322);
            if (a4.D()) {
                class_144.d((List<RenderSupport_145>)a, (RenderSupport_142)a4, a322);
            }
            if (a4.L()) {
                class_144.L((List<RenderSupport_145>)a, (RenderSupport_142)a4, a322);
            }
            class_144.D((List<RenderSupport_145>)a, (RenderSupport_142)a4, a322);
            RenderSupport_144.L();
            return;
        }
        catch (Throwable a322) {
            class_144.I = 0;
            OnyxClient.H.warn("ChinaHat renderer has been disabled after a render failure", a322);
            return;
        }
    }

    private static int L(int n, int n2) {
        int a = n2;
        int a2 = 0;
return Math.clamp((long)a, 0, 255) << 24 | a2 & 0xFFFFFF;
    }

    private static float L(float a) {
return 1.0f - a;
    }

    static {
        int n;
        m = new float[49];
        f = new float[49];
        int n2 = 0;
        while (n2 <= 48) {
            float f2 = 0.0f;
            RenderSupport_144.m[0] = (float)Math.cos(f2);
            RenderSupport_144.f[n++] = (float)Math.sin(f2);
            n2 = 0;
        }
    }

    public void d() {
a.I = 1;
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<RenderSupport_145> list, RenderSupport_142 class_142, Vec3 vec3) {
        void a22;
        RenderSupport_144 class_144 = this;
Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        RenderSupport_144.D();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        int a = (int)(255.0f * a22.d() * 0.22f);
        void v0 = a22;
        float a22 = a22.i();
        float f2 = v0.D() * RenderSupport_144.d(0.0f);
        float f3 = v0.i() * 1.07f;
        float f4 = v0.i() * RenderSupport_144.L(0.14f);
        float f5 = v0.D() * RenderSupport_144.d(0.14f);
        for (Object object : a) {
            void a3;
            object = new RenderSupport_143((RenderSupport_145)object, (Vec3)a3);
            int n = 0;
            while (n < 48) {
                int a4;
                RenderSupport_144 class_1442 = class_144;
                int n2 = RenderSupport_144.L(class_1442.M[a4], a);
                int n3 = RenderSupport_144.L(class_1442.M[a4 + 1], a);
                int n4 = RenderSupport_144.L(n2, 0);
                int n5 = RenderSupport_144.L(n3, 0);
                Object object2 = object;
                WorldRenderer worldRenderer2 = worldRenderer;
                float f6 = a22;
                Object object3 = object;
                WorldRenderer worldRenderer3 = worldRenderer;
                float f7 = a22;
                ((RenderSupport_143)object).L(worldRenderer, f7 * m[a4], f2, a22 * f[a4], n2);
                ((RenderSupport_143)object).L(worldRenderer3, f7 * m[a4 + 1], f2, a22 * f[a4 + 1], n3);
                ((RenderSupport_143)object3).L(worldRenderer3, f3 * m[a4 + 1], f2, f3 * f[a4 + 1], n5);
                ((RenderSupport_143)object3).L(worldRenderer, f3 * m[a4], f2, f3 * f[a4], n4);
                ((RenderSupport_143)object).L(worldRenderer, f6 * m[a4], f2, a22 * f[a4], n2);
                ((RenderSupport_143)object).L(worldRenderer2, f6 * m[a4 + 1], f2, a22 * f[a4 + 1], n3);
                ((RenderSupport_143)object2).L(worldRenderer2, f4 * m[a4 + 1], f5, f4 * f[a4 + 1], n5);
                float f8 = f4 * m[a4];
                float f9 = f[a4];
                ((RenderSupport_143)object2).L(worldRenderer, f8, f5, f4 * f9, n4);
                n = ++a4;
            }
        }
        tessellator.draw();
        RenderSupport_144.i();
    }

    private static void L() {
GL11.glDisable(2848);
        GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(1 != 0);
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

