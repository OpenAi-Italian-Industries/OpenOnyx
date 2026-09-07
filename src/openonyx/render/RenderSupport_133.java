/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import openonyx.features.render.GlowESP;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_133 {
    private static int k;
    private static float g;
    private static float M;
    private final static float L = 1.0E-4f;
    private final static double j = 0.5;
    private final static float[] m;
    private final static int[] h;
    private static boolean l;
    private static boolean I;
    private static float d;
    private static int i;
    private static float f;
    private final static FloatBuffer H;
    private final static FloatBuffer e;

    /*
     * WARNING - void declaration
     */
    public static void d(float f2, int n, int n2) {
        void a;
        int a2 = n2;
        float a3 = f2;
if (!l) {
            return;
        }
        RenderSupport_133.L(a3, (int)a, 4);
        GL11.glEnable(3089);
        GL11.glScissor(h[0], h[1], h[2], h[3]);
        I = 1;
    }

    static {
        e = BufferUtils.createFloatBuffer(16);
        H = BufferUtils.createFloatBuffer(16);
        m = new float[2];
        h = new int[4];
        k = 1;
        i = 1;
    }

    private static void L(float f2, int n, int n2) {
        int a;
        int a2 = n2;
        float a3 = f2;
float f3 = (float)a / (float)k;
        float f4 = 4.0f / (float)i;
        int n3 = Math.clamp((long)((int)Math.floor((d - a3) * f3) - 1), 0, (int)(a - 1));
        int n4 = Math.clamp((long)((int)Math.floor((f - a3) * f4) - 1), 0, 3);
        a = Math.clamp((long)((int)Math.ceil((g + a3) * f3) + 1), n3 + 1, a);
        a2 = Math.clamp((long)((int)Math.ceil((M + a3) * f4) + 1), n4 + 1, 4);
        RenderSupport_133.h[0] = n3;
        RenderSupport_133.h[1] = n4;
        RenderSupport_133.h[2] = a - n3;
        RenderSupport_133.h[3] = 4 - n4;
    }

    private static boolean L(float f2, float f3, float f4) {
        float a;
        float a2 = f3;
        float a3 = f2;
float f5 = e.get(0) * a3 + e.get(4) * a2 + e.get(8) * a + e.get(12);
        float f6 = e.get(1) * a3 + e.get(5) * a2 + e.get(9) * a + e.get(13);
        a2 = e.get(2) * a3 + e.get(6) * a2 + e.get(10) * a + e.get(14);
        a = H.get(3) * f5 + H.get(7) * f6 + H.get(11) * a2 + H.get(15);
        if (!(a > 1.0E-4f)) {
            return 3 >> 2;
        }
        float f7 = H.get(0) * f5 + H.get(4) * f6 + H.get(8) * a2 + H.get(12);
        a2 = H.get(1) * f5 + H.get(5) * f6 + H.get(9) * a2 + H.get(13);
        RenderSupport_133.m[0] = (f7 / a * 0.5f + 0.5f) * (float)k;
        RenderSupport_133.m[1] = (a2 / a * 0.5f + 0.5f) * (float)i;
        if (Float.isFinite(m[0]) && Float.isFinite(m[1])) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(List<Entity> list, float f2, double d, double d2, double d3) {
        List<Entity> list2 = list;
l = 0;
        if (!GlowESP.I() || list2.isEmpty()) {
            return;
        }
        Minecraft minecraft = Minecraft.getMinecraft();
        k = Math.max(1, minecraft.displayWidth);
        i = Math.max(1, minecraft.displayHeight);
        e.clear();
        H.clear();
        GL11.glGetFloat(2982, e);
        GL11.glGetFloat(2983, H);
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        float f6 = -3.4028235E38f;
        int n = 0;
        int n2 = n;
        while (n2 < list2.size()) {
            void a;
            void a2;
            void a3;
            void a4;
            Entity a222 = list2.get(n);
            AxisAlignedBB axisAlignedBB = a222.getEntityBoundingBox();
            Object object = a222;
            double d4 = a222.lastTickPosX + (((Entity)object).posX - a222.lastTickPosX) * (double)a4 - a222.posX - a3;
            double d5 = ((Entity)object).lastTickPosY + (a222.posY - a222.lastTickPosY) * (double)a4 - a222.posY - a2;
            double d6 = a222.lastTickPosZ + (a222.posZ - a222.lastTickPosZ) * (double)a4 - a222.posZ - a;
            AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
            float a222 = (float)(axisAlignedBB2.minX + d4 - 0.5);
            float f7 = (float)(axisAlignedBB2.minY + d5 - 0.5);
            float f8 = (float)(axisAlignedBB2.minZ + d6 - 0.5);
            float f9 = (float)(axisAlignedBB2.maxX + d4 + 0.5);
            float f10 = (float)(axisAlignedBB2.maxY + d5 + 0.5);
            float f11 = (float)(axisAlignedBB2.maxZ + d6 + 0.5);
            int n3 = 0;
            while (n3 < 8) {
                int n4;
                float f12;
                int n5;
                float f13;
                int n6;
                if ((n6 & 1) == 0) {
                    f13 = 0;
                    n5 = n6;
                } else {
                    f13 = f9;
                    n5 = n6;
                }
                if ((n5 & 2) == 0) {
                    f12 = f7;
                    n4 = n6;
                } else {
                    f12 = f10;
                    n4 = n6;
                }
                if (!RenderSupport_133.L(f13, f12, (n4 & 4) == 0 ? f8 : f11)) {
                    return;
                }
                f3 = Math.min(f3, m[0]);
                f4 = Math.min(f4, m[1]);
                f5 = Math.max(f5, m[0]);
                f6 = Math.max(f6, m[1]);
                n3 = ++n6;
            }
            n2 = ++n;
        }
        RenderSupport_133.d = f3;
        f = f4;
        g = f5;
        M = f6;
        l = 1;
    }

    public static boolean L() {
return l;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(Shader shader, float f2) {
        void a;
        Object a2;
        Shader shader2 = shader;
if (!l) {
            shader2.clearScissor();
            return;
        }
        Shader shader3 = shader2;
        Object object = a2 = shader3.framebufferOut;
        RenderSupport_133.L((float)a, ((Framebuffer)object).framebufferTextureWidth, ((Framebuffer)object).framebufferTextureHeight);
        shader3.setScissor(h[0], h[1], h[2], h[3]);
    }

    public static void L() {
if (!I) {
            return;
        }
        GL11.glDisable(3089);
        I = 0;
    }

    private RenderSupport_133() {
        RenderSupport_133 a;
    }
}

