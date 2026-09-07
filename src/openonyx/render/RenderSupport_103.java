/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.glu.GLU
 */
package openonyx.render;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import openonyx.core.OnyxListener_001;
import openonyx.events.EntityRelationUtils;
import openonyx.render.RenderSupport_099;
import openonyx.render.RenderSupport_101;
import openonyx.render.RenderSupport_132;
import openonyx.render.RenderSupport_165;
import openonyx.render.RenderMode_112;
import openonyx.render.RenderMode_138;
import openonyx.render.group_e.RenderSupport_126;
import openonyx.render.group_e.RenderSupport_127;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_e.RenderSupport_129;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.ThemeSupport_058;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.theme.internal.ThemeSupport_061;
import openonyx.theme.internal.ThemeSupport_063;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_103
implements OnyxListener_001 {
    private final static int P = 64;
    private float V;
    private final static float R = 7.0f;
    private static RenderSupport_166 p;
    private final static float t = 0.72f;
    private final static float b = 0.99f;
    private final static float E = 40.0f;
    private static RenderSupport_166 F;
    private final static float G = 8.0f;
    private final static float A = 0.5f;
    private final static int K = -1;
    private final static FloatBuffer B;
    private final RenderSupport_099 C;
    private final static float J = 8.0f;
    private final static float D = 8.0f;
    private final static IntBuffer c;
    private static RenderSupport_166 a;
    private final static float[] k;
    private final static int g = 7425;
    private final static float M = 0.70710677f;
    private final static long L;
    private final RenderSupport_099 j;
    private final static int m = 24;
    private final static int h = 7424;
    private final static FloatBuffer l;
    private boolean I;
    private final static float d = 0.88f;
    private final static FloatBuffer i;
    private final Deque<int[]> f;
    private final static float H = (float)Math.PI * 2;
    private float e;

    /*
     * WARNING - void declaration
     */
    public float L(String string, float f2) {
        void a;
        float a2 = f2;
        RenderSupport_103 a3 = this;
return RenderSupport_126.L().L((String)a) * 0.25f;
    }

    public RenderSupport_103() {
        RenderSupport_103 a;
        RenderSupport_103 class_103 = a;
        RenderSupport_103 class_1032 = a;
        RenderSupport_103 class_1033 = a;
        class_1033.C = new RenderSupport_099();
        class_1032.j = new RenderSupport_099();
        class_1032.f = new ArrayDeque<int[]>();
        class_1032.e = 1.0f;
        class_103.V = 1.0f;
        class_103.I = 1;
    }

    /*
     * WARNING - void declaration
     */
    public void F(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_128 a5 = class_128;
        RenderSupport_103 a6 = this;
a6.i(a5, (String)a4, (float)a3, (float)(a2 + a5.i() - 7.0f * a5.L()), (int)a);
    }

    /*
     * WARNING - void declaration
     */
    private void d(String string, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int n2 = -1;
        RenderSupport_103 a6 = this;
RenderSupport_103 class_103 = a6;
        class_103.F();
        GlStateManager.translate((float)a5, (float)a4, 0.0f);
        void v1 = a3;
        GlStateManager.scale((float)v1, (float)v1, 1.0f);
        class_103.L(RenderSupport_126.L(), (String)a2, 0);
        class_103.k();
    }

    public void e() {
        RenderSupport_103 a;
a.e = a.C.L();
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        float f9 = f7;
        RenderSupport_103 a9 = this;
if (a8 <= 0.0f) {
            return;
        }
        void v0 = a7;
        void v1 = a8;
        void v2 = a6;
        a9.L((float)a5, (float)(a4 + a3), (float)a2, (float)a, (float)v0, (float)v0, (float)v0, (float)v0, (float)v1, (float)(v1 * 2.0f), (int)v2, (int)v2, (int)v2, (int)v2);
    }

    /*
     * WARNING - void declaration
     */
    public void l(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_128 a5 = class_128;
        RenderSupport_103 a6 = this;
a6.i(a5, (String)a4, (float)a3, a6.d(a5, (float)a2), (int)a);
    }

    /*
     * WARNING - void declaration
     */
    public float d(RenderSupport_128 class_128, float f2) {
        void a;
        RenderSupport_128 a2 = class_128;
        RenderSupport_103 a3 = this;
return (float)(a + a2.i() / 2.0f - 7.0f * a2.L());
    }

    static {
        L = System.nanoTime();
        float[] fArray = new float[16];
        fArray[0] = 1.0f;
        fArray[1] = 0.0f;
        fArray[2] = -1.0f;
        fArray[3] = 0.0f;
        fArray[4] = 0.0f;
        fArray[5] = 1.0f;
        fArray[6] = 0.0f;
        fArray[7] = -1.0f;
        fArray[8] = 0.70710677f;
        fArray[9] = 0.70710677f;
        fArray[10] = 0.70710677f;
        fArray[11] = -0.70710677f;
        fArray[12] = -0.70710677f;
        fArray[13] = 0.70710677f;
        fArray[14] = -0.70710677f;
        fArray[15] = -0.70710677f;
        k = fArray;
        i = BufferUtils.createFloatBuffer(16);
        l = BufferUtils.createFloatBuffer(16);
        c = BufferUtils.createIntBuffer(16);
        B = BufferUtils.createFloatBuffer(3);
    }

    /*
     * WARNING - void declaration
     */
    public void i(float f2, float f3, float f4, float f5, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int n2 = -1;
        RenderSupport_103 a6 = this;
a6.D((float)a5, (float)a4, (float)a3, (float)a2, 0.0f, 0);
    }

    public void k() {
        RenderSupport_103 a;
GlStateManager.popMatrix();
        a.V = a.j.L();
    }

    /*
     * WARNING - void declaration
     */
    public void L(ResourceLocation resourceLocation, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        int n3 = n2;
        RenderSupport_103 a12 = this;
a12.L((ResourceLocation)a11, (float)a10, (float)a9, (float)a8, (float)a7, (float)a6, (float)a5, (float)a4, (float)a3, (int)a2, 0, -1);
    }

    private int d(int n) {
        int a = n;
        RenderSupport_103 a2 = this;
if (a2.e >= 1.0f) {
            return 0;
        }
        int n2 = 0;
        return ThemeSupport_064.L(n2, (float)ThemeSupport_064.d(n2) / 255.0f * a2.e);
    }

    /*
     * WARNING - void declaration
     */
    public void h(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = this;
a6.i((RenderSupport_128)a4, a5, (float)(a3 - a6.L((RenderSupport_128)a4, a5)), (float)a2, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    private static void D(float f2, float f3, float f4, float f5, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        float a5 = f2;
GL11.glColor4f((float)(a4 >> 16 & 0xFF) / 255.0f, (float)(a4 >> 8 & 0xFF) / 255.0f, (float)(a4 & 0xFF) / 255.0f, (float)(a4 >>> 24) / 255.0f);
        GL11.glTexCoord2f(a5 - a3, (float)(a2 - a));
        GL11.glVertex2f(a5, (float)a2);
    }

    public void L(float f2) {
        float a = f2;
        RenderSupport_103 a2 = this;
RenderSupport_103 class_103 = a2;
        class_103.C.L(a2.e);
        a2.e = Math.clamp(class_103.e * 0, 0.0f, 1.0f);
    }

    public void F() {
        RenderSupport_103 a;
RenderSupport_103 class_103 = a;
        class_103.j.L(class_103.V);
        GlStateManager.pushMatrix();
    }

    /*
     * WARNING - void declaration
     */
    public float L(RenderSupport_128 class_128, String string) {
        void a;
        RenderSupport_128 a2 = class_128;
        RenderSupport_103 a3 = this;
return a2.L().L((String)a) * a2.L();
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a32;
        float a222 = f2;
        RenderSupport_103 a4 = this;
float f6 = a222;
        int[] a222 = RenderSupport_103.L(f6, (float)a32, f6 + a2, (float)(a32 + a));
        int[] a32 = a4.f.peek();
        if (a32 != null) {
            a222 = RenderSupport_103.L(a222, a32);
        }
        a4.f.push(a222);
        RenderSupport_103.L(a222);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        int n5 = n4;
        RenderSupport_103 a10 = this;
void v0 = a9;
        a10.L((float)a8, (float)a7, (float)a6, (float)a5, (float)v0, (float)v0, (float)v0, (float)v0, (int)a4, (int)a3, (int)a2, 0);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int n, int n2, int n3, int n4) {
        RenderSupport_103 class_103;
        void a32;
        int a;
        int a2;
        int a4;
        void a222;
        void a5;
        void a6;
        void a7;
        void a8;
        float f12 = f5;
        RenderSupport_103 a9 = this;
if (a8 <= 0.0f || a7 <= 0.0f) {
            return;
        }
        void var15_19 = a8 / 2.0f;
        void var16_20 = a7 / 2.0f;
        void var17_21 = a6 + var15_19;
        void var18_22 = a5 + var16_20;
        void var19_23 = a6 - a222;
        void var20_24 = a5 - a222;
        a6 = a6 + a8 + a222;
        a5 = a5 + a7 + a222;
        RenderSupport_103 class_1032 = a9;
        int a222 = class_1032.d(a4);
        a4 = class_1032.d(a2);
        a2 = class_1032.d(a);
        a = class_1032.d((int)a32);
        RenderSupport_166 a32 = RenderSupport_103.d();
        GlStateManager.disableTexture2D();
        if (a32.L()) {
            void a10;
            void a11;
            void a12;
            void a13;
            RenderSupport_166 class_166 = a32;
            RenderSupport_166 class_1662 = a32;
            class_1662.d();
            class_1662.L("uHalfExtents", (float)var15_19, (float)var16_20);
            class_166.L("uCornerRadii", ThemeSupport_058.L((float)a13, (float)a8, (float)a7), ThemeSupport_058.L((float)a12, (float)a8, (float)a7), ThemeSupport_058.L((float)a11, (float)a8, (float)a7), ThemeSupport_058.L((float)a10, (float)a8, (float)a7));
            class_166.L("uSoftness", (float)a);
            RenderSupport_103 class_1033 = a9;
            class_103 = class_1033;
            class_166.L("uPixel", class_1033.V);
        } else {
            if (a != 0.0f) {
                return;
            }
            class_103 = a9;
        }
        class_103.L((float)var19_23, (float)var20_24, (float)a6, (float)a5, (float)var17_21, (float)var18_22, a222, a4, a2, a);
        RenderSupport_166.L();
    }

    /*
     * WARNING - void declaration
     */
    public void I(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        String a5 = string;
        RenderSupport_103 a6 = this;
a6.i((RenderSupport_128)a4, a5, (float)(a3 - a6.L((RenderSupport_128)a4, a5) / 2.0f), (float)a2, (int)a);
    }

    private static void L(int[] a) {
GL11.glEnable(3089);
        GL11.glScissor(a[0], a[1], a[2], a[3]);
    }

    private static int[] L(int[] nArray, int[] nArray2) {
        int[] a22 = nArray2;
        int[] a = nArray;
int n = Math.max(a[0], a22[0]);
        int n2 = Math.max(a[1], a22[1]);
        int n3 = Math.min(a[0] + a[2], a22[0] + a22[2]);
        int a22 = Math.min(a[1] + a[3], a22[1] + a22[3]);
        int[] nArray3 = new int[4];
        nArray3[0] = 0;
        nArray3[1] = n2;
        nArray3[2] = Math.max(0, n3 - 0);
        nArray3[3] = Math.max(0, 0 - n2);
        return nArray3;
    }

    private static float[] L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
B.clear();
        GLU.gluProject((float)a2, (float)a, 0.0f, (FloatBuffer)i, (FloatBuffer)l, (IntBuffer)c, (FloatBuffer)B);
        float[] fArray = new float[2];
        int n = 0;
        fArray[n] = B.get(n);
        int n2 = 1;
        fArray[n2] = B.get(n2);
        return fArray;
    }

    private static RenderSupport_166 D() {
if (F == null) {
            F = RenderSupport_166.L("onyx_clouds");
        }
        return F;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3) {
        void a;
        float a2 = f3;
        RenderSupport_103 a3 = this;
GlStateManager.translate((float)a, 4, 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public float L(RenderSupport_128 class_128, float f2) {
        void a;
        float a2 = f2;
        RenderSupport_103 a3 = this;
return 4 + 7.0f * a.L();
    }

    private static int L(int n) {
        int n2 = n;
int a = 1 + k.length / 2;
        int n3 = n2;
        return ThemeSupport_064.L(n3, 1.0f - (float)Math.pow(1.0f - (float)ThemeSupport_064.d(n3) / 255.0f, 1.0f / (float)a));
    }

    /*
     * WARNING - void declaration
     */
    public void i(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int n2 = -1;
        RenderSupport_103 a6 = this;
a6.D((RenderSupport_128)a5, (String)a4, (float)a3, (float)a2, a6.d(0));
    }

    public void l() {
        RenderSupport_103 a;
if (a.I) {
            RenderSupport_165.L(RenderMode_112.f);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(ItemStack itemStack, float f2, float f3) {
        void a;
        void a2;
        ItemStack a3 = itemStack;
        RenderSupport_103 a4 = this;
if (a3 == null || a3.getItem() == null) {
            return;
        }
        RenderSupport_166.L();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.enableDepth();
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableAlpha();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        RenderHelper.enableGUIStandardItemLighting();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)a2, (float)a, 0.0f);
        int n = 0;
        e.getRenderItem().renderItemAndEffectIntoGUI(a3, n, n);
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableFog();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(8960, 8704, 8448);
        GlStateManager.enableBlend();
        int n2 = 771;
        GlStateManager.tryBlendFuncSeparate(770, n2, 1, n2);
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.shadeModel(7425);
        GlStateManager.resetColor();
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_127 class_127, String string, int n) {
        void a;
        int n2;
        void a22;
        void a3;
        RenderSupport_103 class_103 = this;
if (a3.isEmpty() || a22 >>> 24 == false) {
            return;
        }
        int n3 = 0;
        while (n3 < a3.length()) {
            a.d(a3.charAt(n2++));
            n3 = 0;
        }
        n2 = a.L();
        if (0 == -1) {
            return;
        }
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(0);
        GL11.glColor4f((float)(a22 >> 16 & 0xFF) / 255.0f, (float)(a22 >> 8 & 0xFF) / 255.0f, (float)(a22 & 0xFF) / 255.0f, (float)(a22 >>> 24) / 255.0f);
        GL11.glBegin(7);
        float a22 = 0.0f;
        int n4 = 0;
        while (n4 < a3.length()) {
            RenderSupport_129 a4 = a.d(a3.charAt(0));
            if (!a4.L()) {
                float f2 = a22 + a4.D();
                float f3 = 7.0f + a4.k();
                float f4 = f2 + a4.i();
                float f5 = f3 + a4.h();
                float f6 = f4;
                float f7 = f2;
                Object object = a4;
                GL11.glTexCoord2f(a4.l(), ((RenderSupport_129)object).F());
                GL11.glVertex2f(f7, f3);
                Object object2 = a4;
                GL11.glTexCoord2f(((RenderSupport_129)object).l(), ((RenderSupport_129)object2).d());
                GL11.glVertex2f(f7, f5);
                GL11.glTexCoord2f(((RenderSupport_129)object2).I(), a4.d());
                GL11.glVertex2f(f6, f5);
                GL11.glTexCoord2f(a4.I(), a4.F());
                GL11.glVertex2f(f6, f3);
            }
            a22 += a4.L();
            n4 = ++n2;
        }
        GL11.glEnd();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    private static RenderSupport_166 d() {
if (p == null) {
            p = RenderSupport_166.L("onyx_shape");
        }
        return p;
    }

    /*
     * WARNING - void declaration
     */
    private static int[] L(float f2, float f3, float f4, float f5) {
        void a22;
        void a422;
        float a522 = f4;
        float a = f2;
i.clear();
        l.clear();
        c.clear();
        GL11.glGetFloat(2982, i);
        GL11.glGetFloat(2983, l);
        GL11.glGetInteger(2978, c);
        float[] a422 = RenderSupport_103.L(a, (float)a422);
        float[] a522 = RenderSupport_103.L(a522, (float)a22);
        int a422 = Math.round(Math.min(a422[0], a522[0]));
        int a22 = Math.round(Math.min(a422[1], a522[1]));
        int n = Math.round(Math.max(a422[0], a522[0]));
        int a522 = Math.round(Math.max(a422[1], a522[1]));
        int[] nArray = new int[4];
        nArray[0] = a422;
        nArray[1] = a22;
        nArray[2] = Math.max(0, n - a422);
        nArray[3] = Math.max(0, a522 - a22);
        return nArray;
    }

    public RenderSupport_103 L() {
        RenderSupport_103 a;
a.I = 0;
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public void I(float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a2;
        float f7;
        void a3;
        void a4;
        void a5;
        void a6;
        RenderSupport_103 class_103 = this;
void var7_9 = a6 - a5;
        void var8_10 = a4 - a3;
        void v0 = var7_9;
        void v1 = var8_10;
        float a7 = (float)Math.sqrt((double)(v0 * v0 + v1 * v1));
        if (f7 < 1.0E-4f) {
            return;
        }
        RenderSupport_103 class_1032 = class_103;
        class_1032.F();
        class_1032.L().d((float)((a5 + a6) / 2.0f), (float)((a3 + a4) / 2.0f));
        class_103.L().L((float)Math.atan2((double)var8_10, (double)var7_9));
        RenderSupport_103 class_1033 = class_103;
        class_1033.D(-a7 / 2.0f, (float)(-a2 / 2.0f), a7, (float)a2, Float.MAX_VALUE, (int)a);
        class_1033.k();
    }

    /*
     * WARNING - void declaration
     */
    public void i(float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a2;
        void a3;
        float f7;
        void a4;
        void a5;
        float a6;
        float f8 = f6;
        RenderSupport_103 a7 = this;
a6 = ThemeSupport_058.L(a6, (float)a5, (float)a4);
        if (f7 <= 0.0f) {
            return;
        }
        void v1 = a3;
        a7.L((float)(a2 - a6), (float)(a - a6), (float)(a5 + a6 * 2.0f), (float)(a4 + a6 * 2.0f), a6 * 2.0f, a6 * 2.0f, a6 * 2.0f, a6 * 2.0f, -a6, 0.0f, (int)v1, (int)v1, (int)v1, (int)v1);
    }

    /*
     * WARNING - void declaration
     */
    public void L(ResourceLocation resourceLocation, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        float f5 = f4;
        RenderSupport_103 a5 = this;
RenderSupport_103 class_103 = a5;
        void v1 = a4;
        int n = 64;
        class_103.L((ResourceLocation)a3, (float)a2, (float)a, (float)v1, (float)v1, 8.0f, 8.0f, 8.0f, 8.0f, n, n);
        void v3 = a4;
        int n2 = 64;
        class_103.L((ResourceLocation)a3, (float)a2, (float)a, (float)v3, (float)v3, 40.0f, 8.0f, 8.0f, 8.0f, n2, n2);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3, float f4, float f5, float f6, float f7, int n, int n2, int n3, int n4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        float f8 = f7;
        RenderSupport_103 a11 = this;
GL11.glBegin(7);
        RenderSupport_103.D((float)a10, (float)a9, (float)a8, (float)a7, (int)a6);
        RenderSupport_103.D((float)a10, (float)a5, (float)a8, (float)a7, (int)a4);
        RenderSupport_103.D((float)a3, (float)a5, (float)a8, (float)a7, (int)a2);
        RenderSupport_103.D((float)a3, (float)a9, (float)a8, (float)a7, (int)a);
        GL11.glEnd();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    public void h() {
        RenderSupport_103 a;
if (a.I) {
            RenderSupport_165.L(RenderMode_112.e);
        }
    }

    public void I() {
}

    /*
     * WARNING - void declaration
     */
    private void d(float f2, float f3, float f4, float f5, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int a5;
        int n2 = -1;
        RenderSupport_103 a6 = this;
a5 = a6.d(a5);
        GL11.glColor4f((float)(a5 >> 16 & 0xFF) / 255.0f, (float)(a5 >> 8 & 0xFF) / 255.0f, (float)(a5 & 0xFF) / 255.0f, (float)(a5 >>> 24) / 255.0f);
        GL11.glTexCoord2f((float)a4, (float)a3);
        GL11.glVertex2f((float)a2, (float)a);
    }

    public void i() {
a.V = 1.0f / (float)Math.max(1, new ScaledResolution((Minecraft)e).getScaleFactor());
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(8960, 8704, 8448);
        GlStateManager.enableBlend();
        int n = 771;
        GlStateManager.tryBlendFuncSeparate(770, n, 1, n);
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.shadeModel(7425);
    }

    /*
     * WARNING - void declaration
     */
    public String L(RenderSupport_128 class_128, String string, float f2) {
        void a;
        void a2;
        void a3;
        RenderSupport_103 class_103 = this;
if (class_103.L((RenderSupport_128)a3, (String)a2) <= a) {
            return a2;
        }
        String string2 = "...";
        a -= class_103.L((RenderSupport_128)a3, string2);
        int a4 = 0;
        int n = a2.length();
        while (a4 < n) {
            int n2 = (a4 + n + 1) / 2;
            if (class_103.L((RenderSupport_128)a3, a2.substring(0, n2)) <= a) {
                a4 = n2;
                continue;
            }
            n = a4 - 1;
        }
        int n3 = 0;
        return new StringBuilder().insert(n3, a2.substring(n3, a4)).append(string2).toString();
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, float f2, float f3, float f4, int n, float f5) {
        void a;
        void a2;
        void a3;
        int a4;
        void a5;
        void a6;
        RenderSupport_103 class_103 = this;
RenderSupport_127 a222 = RenderSupport_126.L();
        float a222 = a222.L((String)a6) * (a5 /= 16.0f);
        a2 -= a222 / 2.0f;
        a += a5 * 1.0f;
        a4 = class_103.d(a4);
        if (a3 <= 0.0f) {
            class_103.d((String)a6, (float)a2, (float)a, (float)a5, a4);
            return;
        }
        a4 = RenderSupport_103.L(a4);
        a3 /= 2.0f;
        int n2 = 0;
        while (n2 < k.length) {
            void v1 = a2 + k[0] * a3;
            void v2 = a + k[1] * a3;
            class_103.d((String)a6, (float)v1, (float)v2, (float)a5, a4);
            n2 = a222 += 2;
        }
        class_103.d((String)a6, (float)a2, (float)a, (float)a5, a4);
    }

    /*
     * WARNING - void declaration
     */
    private void D(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        RenderSupport_103 class_103 = this;
float a6 = a5.L();
        RenderSupport_103 class_1032 = class_103;
        class_1032.F();
        GlStateManager.translate((float)a4, (float)a3, 0.0f);
        float f4 = a6;
        GlStateManager.scale(f4, f4, 1.0f);
        class_1032.L(a5.L(), (String)a2, (int)a);
        class_1032.k();
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a22;
        void a3;
        void a4;
        void a5;
        void a6;
        float f7 = f5;
        RenderSupport_103 a7 = this;
int n2 = RenderSupport_101.L();
        RenderSupport_166 class_166 = RenderSupport_103.L();
        if (n2 == -1 || !class_166.L()) {
            a7.D((float)a6, (float)a5, (float)a4, (float)a3, (float)a22, (int)a);
            return 0 != 0;
        }
        void v0 = a6;
        void v1 = a5;
        int[] nArray = RenderSupport_103.L((float)v0, (float)v1, (float)(v0 + a4), (float)(v1 + a3));
        RenderSupport_103 class_103 = a7;
        RenderSupport_101.d(nArray[0], nArray[1], nArray[2], nArray[3]);
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(n2);
        RenderSupport_166 class_1662 = class_166;
        RenderSupport_166 class_1663 = class_166;
        RenderSupport_166 class_1664 = class_166;
        class_166.d();
        class_1664.L("Sampler0", 0);
        class_1664.L("uHalfExtents", (float)(a4 / 2.0f), (float)(a3 / 2.0f));
        class_1663.L("uCornerRadii", ThemeSupport_058.L((float)a22, (float)a4, (float)a3), ThemeSupport_058.L((float)a22, (float)a4, (float)a3), ThemeSupport_058.L((float)a22, (float)a4, (float)a3), ThemeSupport_058.L((float)a22, (float)a4, (float)a3));
        class_1663.L("uResolution", RenderSupport_103.e.displayWidth, RenderSupport_103.e.displayHeight);
        class_1662.L("uPixel", a7.V);
        class_1662.L("uTint", (float)ThemeSupport_064.d((int)a) / 255.0f * 0.88f);
        int a22 = class_103.d((int)(a | 0xFF000000));
        void v6 = a6;
        int n3 = a22;
        class_103.L((float)v6, (float)a5, (float)(v6 + a4), (float)(a5 + a3), (float)(a6 + a4 / 2.0f), (float)(a5 + a3 / 2.0f), n3, n3, n3, n3);
        RenderSupport_166.L();
        return 3 >> 1;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_128 class_128, String string, float f2, float f3, int n, float f4) {
        void a;
        void a2;
        void a3;
        int n2;
        int a4;
        void a5;
        void a6;
        int n3 = -1;
        RenderSupport_103 a7 = this;
if (a6 <= 0.0f || a5.isEmpty() || a4 >>> 24 == false) {
            return;
        }
        a4 = RenderSupport_103.L(a7.d(a4));
        int n4 = 0;
        while (n4 < k.length) {
            void v1 = a3 + k[0] * a6;
            float f5 = k[1] * a6;
            a7.D((RenderSupport_128)a2, (String)a5, (float)v1, (float)(a + f5), a4);
            n4 = n2 += 2;
        }
        a7.D((RenderSupport_128)a2, (String)a5, (float)a3, (float)a, a4);
    }

    public void D() {
}

    /*
     * WARNING - void declaration
     */
    public void L(EntityLivingBase entityLivingBase, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        RenderSupport_103 a5 = this;
if (a4 == null || a3 <= 0) {
            return;
        }
        RenderSupport_166.L();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)a2, (float)a, 0.0f);
        int n3 = 0;
        GuiInventory.drawEntityOnScreen(n3, n3, (int)a3, 0.0f, 0.0f, (EntityLivingBase)a4);
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableColorMaterial();
        GlStateManager.disableFog();
        GlStateManager.disableLighting();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(8960, 8704, 8448);
        GlStateManager.enableBlend();
        int n4 = 771;
        GlStateManager.tryBlendFuncSeparate(770, n4, 1, n4);
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.shadeModel(7425);
        GlStateManager.resetColor();
    }

    /*
     * WARNING - void declaration
     */
    public void d(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_128 a5 = class_128;
        RenderSupport_103 a6 = this;
a6.h(a5, (String)a4, (float)a3, a6.d(a5, (float)a2), (int)a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        int n2 = -1;
        RenderSupport_103 a6 = this;
a6.L((String)a5, (float)a4, (float)a3, (float)a2, 0, 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public void L(ResourceLocation resourceLocation, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        void a12;
        int n4 = n3;
        RenderSupport_103 a13 = this;
a13.L((ResourceLocation)a12, (float)a11, (float)a10, (float)a9, (float)a8, (float)a7, (float)a6, (float)a5, (float)a4, (int)a3, (int)a2, 0, RenderMode_138.e);
    }

    /*
     * WARNING - void declaration
     */
    public void D(float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        int n2 = n;
        RenderSupport_103 a7 = this;
void v0 = a6;
        a7.L((float)a5, (float)a4, (float)a3, (float)a2, (float)v0, (float)v0, (float)v0, (float)v0, 0);
    }

    private static RenderSupport_166 L() {
if (a == null) {
            a = RenderSupport_166.L("onyx_frost");
        }
        return a;
    }

    public RenderSupport_132 L() {
return RenderSupport_132.e;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        int n2 = n;
        RenderSupport_103 a10 = this;
void v0 = a9;
        a10.L((float)a8, (float)a7, (float)a6, (float)a5, (float)a4, (float)a3, (float)a2, (float)a, (int)v0, (int)v0, (int)v0, (int)v0);
    }

    public void d() {
        RenderSupport_103 a;
RenderSupport_103 class_103 = a;
        while (!class_103.f.isEmpty()) {
            RenderSupport_103 class_1032 = a;
            class_103 = class_1032;
            class_1032.L();
        }
        RenderSupport_166.L();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
        GlStateManager.shadeModel(7424);
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        if (a.I) {
            RenderSupport_165.L();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_128 class_128, String string, float f2, float f3, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_128 a5 = class_128;
        RenderSupport_103 a6 = this;
a6.I(a5, (String)a4, (float)a3, a6.d(a5, (float)a2), (int)a);
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2, float f3, float f4, float f5, float f6, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f7;
        void a222;
        int n2 = n;
        RenderSupport_103 a6 = this;
float a222 = ThemeSupport_060.L((int)a222);
        if (f7 <= 0.0f) {
            return;
        }
        int n3 = ThemeSupport_059.L().M();
        RenderSupport_103 class_103 = a6;
        class_103.L((float)a5, (float)a4, (float)a3, (float)a2, (float)a, 0, 0.0f, ThemeSupport_059.L(n3, 0.055f));
        class_103.L((float)a5, (float)a4, (float)a3, (float)a2, (float)a, 0.0f, 0.0f, ThemeSupport_059.L(n3, 0.075f));
    }

    public void L() {
        RenderSupport_103 class_103 = this;
if (class_103.f.isEmpty()) {
            return;
        }
        RenderSupport_103 class_1032 = class_103;
        class_1032.f.pop();
        int[] nArray = class_1032.f.peek();
        Object a = nArray;
        if (nArray == null) {
            GL11.glDisable(3089);
            return;
        }
        RenderSupport_103.L((int[])a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(ResourceLocation resourceLocation, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, RenderMode_138 enum_138) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        void a222;
        int a322;
        int n4 = n3;
        RenderSupport_103 a12 = this;
a322 = a12.d(a322);
        e.getTextureManager().bindTexture((ResourceLocation)a222);
        GlStateManager.enableTexture2D();
        int a222 = a11.L();
        GL11.glColor4f((float)(a322 >> 16 & 0xFF) / 255.0f, (float)(a322 >> 8 & 0xFF) / 255.0f, (float)(a322 & 0xFF) / 255.0f, (float)(a322 >>> 24) / 255.0f);
        float a322 = a10 < (float)a9 ? a11.L() / (float)a9 : 0.0f;
        float f10 = a8 < (float)a7 ? a11.L() / (float)a7 : 0.0f;
        void var15_19 = a6 / (float)a9 + a322;
        void var16_20 = a5 / (float)a7 + f10;
        a6 = (a6 + a10) / (float)a9 - a322;
        a5 = (a5 + a8) / (float)a7 - f10;
        GL11.glBegin(7);
        GL11.glTexCoord2f((float)var15_19, (float)var16_20);
        GL11.glVertex2f((float)a4, (float)a3);
        GL11.glTexCoord2f((float)var15_19, (float)a5);
        GL11.glVertex2f((float)a4, (float)(a3 + a2));
        GL11.glTexCoord2f((float)a6, (float)a5);
        GL11.glVertex2f((float)(a4 + a), (float)(a3 + a2));
        GL11.glTexCoord2f((float)a6, (float)var16_20);
        GL11.glVertex2f((float)(a4 + a), (float)a3);
        GL11.glEnd();
        a11.L(a222);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        float a5 = f4;
        RenderSupport_103 a6 = this;
a6.L((float)(a4 - a5), (float)(a3 - a5), a5 * 2.0f, a5 * 2.0f, Float.MAX_VALUE, (float)a2, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        float a4 = f4;
        RenderSupport_103 a5 = this;
a5.D((float)(a3 - a4), (float)(a2 - a4), a4 * 2.0f, a4 * 2.0f, Float.MAX_VALUE, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        void a12;
        int n5 = n4;
        RenderSupport_103 a13 = this;
a13.L((float)a12, (float)a11, (float)a10, (float)a9, (float)a8, (float)a7, (float)a6, (float)a5, 0.0f, 0.0f, (int)a4, (int)a3, (int)a2, 0);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4) {
        void a;
        void a2;
        float a3 = f2;
        RenderSupport_103 a4 = this;
GlStateManager.translate((float)a2, (float)a, 0.0f);
        float f5 = a3;
        GlStateManager.scale(f5, f5, 1.0f);
        GlStateManager.translate((float)(-a2), (float)(-a), 0.0f);
        if (a3 > 0.0f) {
            a4.V /= a3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        float f6 = f5;
        RenderSupport_103 a5 = this;
if (a4 <= 0.0f || a3 <= 0.0f) {
            return;
        }
        ThemeSupport_061 class_061 = ThemeSupport_061.L(ThemeSupport_059.L());
        double d = class_061.D();
        double d2 = class_061.L() * 0.6;
        int n = ThemeSupport_063.L(d - 25.0, d2).L(15);
        int n2 = ThemeSupport_063.L(d + 20.0, d2).L(27);
        int n3 = ThemeSupport_063.L(d + 60.0, d2).L(41);
        int n4 = ThemeSupport_063.L(d - 45.0, d2).L(57);
        RenderSupport_166 class_166 = RenderSupport_103.D();
        if (!class_166.L()) {
            int n5 = n;
            a5.L((float)a2, (float)a, (float)a4, (float)a3, 0.0f, n2, n3, n5, n5);
            return;
        }
        GlStateManager.disableTexture2D();
        RenderSupport_166 class_1662 = class_166;
        RenderSupport_166 class_1663 = class_166;
        RenderSupport_166 class_1664 = class_166;
        class_166.d();
        class_1664.L("uAspect", (float)(a4 / a3));
        class_1664.L("uTime", (float)(System.nanoTime() - L) / 1.0E9f);
        class_1663.d("uGlow", n4);
        class_1663.d("uMid", n2);
        class_1662.d("uAccent", n3);
        class_1662.d("uDeep", n);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glBegin(7);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex2f((float)a2, (float)a);
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex2f((float)a2, (float)(a + a3));
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex2f((float)(a2 + a4), (float)(a + a3));
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex2f((float)(a2 + a4), (float)a);
        GL11.glEnd();
        RenderSupport_166.L();
        GlStateManager.resetColor();
    }

    /*
     * WARNING - void declaration
     */
    public void L(ResourceLocation resourceLocation, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a222;
        float a8 = f3;
        RenderSupport_103 a9 = this;
e.getTextureManager().bindTexture((ResourceLocation)a222);
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.shadeModel(7425);
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.depthMask(0 != 0);
        int n5 = 1;
        GlStateManager.tryBlendFuncSeparate(770, n5, 0, n5);
        int a222 = RenderMode_138.H.L();
        GL11.glBegin(7);
        RenderSupport_103 class_103 = a9;
        void v2 = a7;
        a9.d((float)a7, a8, 0.0f, 0.99f, (int)a6);
        a9.d((float)v2, a8 + a5, 0.99f, 0.99f, (int)a4);
        class_103.d((float)(v2 + a3), a8 + a5, 0.99f, 0.0f, (int)a2);
        class_103.d((float)(a7 + a3), a8, 0.0f, 0.0f, (int)a);
        GL11.glEnd();
        RenderMode_138.H.L(a222);
        GlStateManager.depthMask(1 != 0);
        GlStateManager.enableAlpha();
        GlStateManager.enableCull();
        int n6 = 771;
        GlStateManager.tryBlendFuncSeparate(770, n6, 1, n6);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, float f6, float f7, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        int n2 = n;
        RenderSupport_103 a8 = this;
void v0 = a7;
        void v1 = a6;
        a8.L((float)a5, (float)a4, (float)a3, (float)a2, (float)v0, (float)v0, (float)v0, (float)v0, (float)(-a), 0.0f, (int)v1, (int)v1, (int)v1, (int)v1);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5, float f6, int n) {
        int n2;
        RenderSupport_103 class_103 = this;
a6 *= (float)Math.PI * 2;
        int n3 = 0;
        while (n3 < 24) {
            void a;
            void a2;
            void a3;
            void a4;
            void a5;
            void a6;
            void a7 = a6 + 0.0f;
            class_103.L((float)(a5 + (float)Math.cos((double)a7) * a4), (float)(a3 + (float)Math.sin((double)a7) * a4), (float)(a2 / 2.0f), (int)a);
            n3 = ++n2;
        }
    }
}

