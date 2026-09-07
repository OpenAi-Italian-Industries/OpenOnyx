/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_139 {
    private final static float[] D;
    private final static int[] c;
    private final static FloatBuffer a;
    private static float k;
    private static float g;
    private final static float[] M;
    private static boolean L;
    private final static float j = 1.0E-4f;
    private final static float[] m;
    private static boolean h;
    private final static float[] l;
    private final static FloatBuffer I;
    private final static float[] d;
    private static float i;
    private final static float[] f;
    private static float H;
    private final static float[] e;

    static {
        float[] fArray = new float[6];
        fArray[0] = -1.8f;
        fArray[1] = -1.8f;
        fArray[2] = -1.8f;
        fArray[3] = 1.8f;
        fArray[4] = 1.8f;
        fArray[5] = 1.8f;
        e = fArray;
        float[] fArray2 = new float[6];
        fArray2[0] = -0.62f;
        fArray2[1] = -0.12f;
        fArray2[2] = -0.25f;
        fArray2[3] = -0.13f;
        fArray2[4] = 0.87f;
        fArray2[5] = 0.25f;
        d = fArray2;
        float[] fArray3 = new float[6];
        fArray3[0] = -0.62f;
        fArray3[1] = -0.58f;
        fArray3[2] = -0.6f;
        fArray3[3] = -0.13f;
        fArray3[4] = 0.83f;
        fArray3[5] = 0.6f;
        m = fArray3;
        I = BufferUtils.createFloatBuffer(16);
        a = BufferUtils.createFloatBuffer(16);
        int[] nArray = new int[24];
        int n = 0;
        nArray[n] = n;
        int n2 = 1;
        nArray[n2] = n2;
        int n3 = 2;
        nArray[n3] = n3;
        int n4 = 3;
        nArray[n4] = n4;
        int n5 = 4;
        nArray[n5] = n5;
        int n6 = 5;
        nArray[n6] = n6;
        int n7 = 6;
        nArray[n7] = n7;
        int n8 = 7;
        nArray[n8] = n8;
        nArray[8] = 0;
        nArray[9] = 2;
        nArray[10] = 1;
        nArray[11] = 3;
        nArray[12] = 4;
        nArray[13] = 6;
        nArray[14] = 5;
        nArray[15] = 7;
        nArray[16] = 0;
        nArray[17] = 4;
        nArray[18] = 1;
        nArray[19] = 5;
        nArray[20] = 2;
        nArray[21] = 6;
        nArray[22] = 3;
        nArray[23] = 7;
        c = nArray;
        f = new float[8];
        M = new float[8];
        D = new float[8];
        l = new float[8];
    }

    private static void L(float[] fArray) {
        float f2;
        float[] fArray2 = fArray;
I.clear();
        a.clear();
        GL11.glGetFloat(2982, I);
        GL11.glGetFloat(2983, a);
        int a = 0;
        int n = 0;
        while (n < 8) {
            float f3 = fArray2[0 == 0 ? 0 : 3];
            float f4 = fArray2[0 == 0 ? 1 : 4];
            f2 = fArray2[0 == 0 ? 2 : 5];
            float f5 = I.get(0) * f3 + I.get(4) * f4 + I.get(8) * f2 + I.get(12);
            float f6 = I.get(1) * f3 + I.get(5) * f4 + I.get(9) * f2 + I.get(13);
            float f7 = I.get(2) * f3 + I.get(6) * f4 + I.get(10) * f2 + I.get(14);
            RenderSupport_139.f[0] = RenderSupport_139.a.get(0) * f5 + RenderSupport_139.a.get(4) * f6 + RenderSupport_139.a.get(8) * f7 + RenderSupport_139.a.get(12);
            RenderSupport_139.M[0] = RenderSupport_139.a.get(1) * f5 + RenderSupport_139.a.get(5) * f6 + RenderSupport_139.a.get(9) * f7 + RenderSupport_139.a.get(13);
            float f8 = RenderSupport_139.a.get(2) * f5 + RenderSupport_139.a.get(6) * f6 + RenderSupport_139.a.get(10) * f7 + RenderSupport_139.a.get(14);
            RenderSupport_139.D[0] = RenderSupport_139.a.get(3) * f5 + RenderSupport_139.a.get(7) * f6 + RenderSupport_139.a.get(11) * f7 + RenderSupport_139.a.get(15);
            int n2 = a++;
            RenderSupport_139.l[n2] = f8 + D[n2];
            n = 0;
        }
        int n3 = 0;
        while (n3 < 8) {
            if (l[0] >= 0.0f) {
                RenderSupport_139.L(f[0], M[0], D[0]);
            }
            n3 = ++a;
        }
        int n4 = 0;
        while (n4 < c.length) {
            int n5;
            int n6 = c[0];
            if ((l[n6] >= 0.0f ? 1 : 0) != (l[n5 = c[1]] >= 0.0f ? 1 : 0)) {
                f2 = l[n6] / (l[n6] - l[n5]);
                RenderSupport_139.L(f[n6] + (f[n5] - f[n6]) * f2, M[n6] + (M[n5] - M[n6]) * f2, D[n6] + (D[n5] - D[n6]) * f2);
            }
            n4 = a += 2;
        }
    }

    public static void D() {
h = 0;
    }

    public static void d() {
if (!L) {
            return;
        }
        L = false;
        GL11.glDisable(3089);
    }

    public static void L(float f2, int n, int n2) {
        int a;
        int a2 = n2;
        float a3 = f2;
if (!h) {
            return;
        }
        int n3 = Math.clamp((long)((int)Math.floor(k * (float)a - a3)), 0, a);
        int n4 = Math.clamp((long)((int)Math.floor(i * 4.0f - a3)), 0, 4);
        a = Math.clamp((long)((int)Math.ceil(g * (float)a + a3)), n3, a);
        a2 = Math.clamp((long)((int)Math.ceil(H * 4.0f + a3)), n4, 4);
        if (a <= n3 || 4 <= n4) {
            return;
        }
        GL11.glEnable(3089);
        int n5 = n3;
        GL11.glScissor(n5, n4, a - n5, 4 - n4);
        L = 1;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(float f2, float f3, float f4) {
        void a;
        float a2 = f3;
        float a3 = f2;
if (!(a > 1.0E-4f)) {
            return;
        }
        float f5 = a3 / a * 0.5f + 0.5f;
        a2 = a2 / a * 0.5f + 0.5f;
        if (!Float.isFinite(f5) || !Float.isFinite(a2)) {
            return;
        }
        if (h) {
            k = Math.min(k, f5);
            i = Math.min(i, a2);
            g = Math.max(g, f5);
            H = Math.max(H, a2);
            return;
        }
        k = f5;
        i = a2;
        g = f5;
        H = a2;
        h = 1;
    }

    public static void L() {
RenderSupport_139.L(e);
    }

    private RenderSupport_139() {
        RenderSupport_139 a;
    }

    public static boolean L() {
return h;
    }

    public static void L(boolean a) {
RenderSupport_139.L(a ? m : d);
    }
}

