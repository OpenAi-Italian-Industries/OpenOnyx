/*
 * Decompiled with CFR.
 */
package openonyx.render.group_e;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import openonyx.configuration.Event;
import openonyx.core.OnyxClient;
import openonyx.render.group_e.RenderSupport_129;
import openonyx.utilities.UtilitySupport_476;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_127 {
    private boolean E;
    private final Map<Character, RenderSupport_129> F;
    private final float G;
    private int A;
    private final float K;
    private int B;
    private int C;
    private final static int J = 8;
    private int D;
    private final static RenderSupport_129 c = h = new RenderSupport_129(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    private final static int a = 512;
    private final static int k = 3;
    private final Font g;
    private final static int M = 2048;
    private final static int L = 8;
    private final static int j = 192;
    private final static float m = 100.0f;
    private final static RenderSupport_129 h;
    final public static int l = 4;
    private final static int I = 12;
    private final FontRenderContext d;
    private final int i;
    private final float f;
    private final static float H = 0.72f;
    private final static float e = 0.21f;

    public float D(char c) {
        char a = c;
        RenderSupport_127 a2 = this;
return a2.d(a).L();
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] L(byte[] byArray, int n, int n2, int n3, int n4) {
        int n5;
        void a;
        void a2;
        byte[] byArray2 = byArray;
byte[] byArray3 = new byte[a2 * a];
        int n6 = 0;
        while (n6 < a) {
            void a3;
            int n7 = 0;
            int n8 = Math.min(n7 + 1, (int)(a3 - 1));
            int n9 = 0;
            while (n9 < a2) {
                void a4;
                int n10;
                int a5 = n10 * 2;
                int n11 = Math.min(a5 + 1, (int)(a4 - 1));
                a5 = (byArray2[n7 * a4 + a5] & 0xFF) + (byArray2[n7 * a4 + n11] & 0xFF) + (byArray2[n8 * a4 + a5] & 0xFF) + (byArray2[n8 * a4 + n11] & 0xFF);
                int n12 = 0 * a2 + n10;
                byArray3[n12] = (byte)(a5 >> 2);
                n9 = ++n10;
            }
            n6 = ++n5;
        }
        return byArray3;
    }

    public float d() {
        RenderSupport_127 a;
return a.G;
    }

    private float d(char c) {
        char a = c;
        RenderSupport_127 a2 = this;
return (float)(-a2.L((char)a).y) * a2.K;
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, int n2, int n3, int n4, int n5, byte[] byArray) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        int n6 = n5;
        RenderSupport_127 a7 = this;
ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(a6 * a5));
        byteBuffer.put((byte[])a4, 0, (int)(a6 * a5)).flip();
        GL11.glTexSubImage2D(3553, (int)a3, (int)a2, (int)a, (int)a6, (int)a5, 6406, 5121, byteBuffer);
    }

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_127 L(String string, float f2) {
        RenderSupport_127 class_127;
        block9: {
            void a;
            String string2 = string;
InputStream a22 = RenderSupport_127.class.getResourceAsStream(string2);
            try {
                if (a22 == null) {
                    throw new IOException(new StringBuilder().insert(0, "Missing font ").append(string2).toString());
                }
                class_127 = new RenderSupport_127(Font.createFont(0, a22), (float)a);
                if (a22 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    Throwable throwable2;
                    block10: {
                        if (a22 != null) {
                            try {
                                a22.close();
                                throwable2 = throwable;
                                break block10;
                            }
                            catch (Throwable throwable3) {
                                throwable.addSuppressed(throwable3);
                            }
                        }
                        throwable2 = throwable;
                    }
                    throw throwable2;
                }
                catch (Exception a22) {
                    Object[] objectArray = new Object[2];
                    objectArray[0] = string2;
                    objectArray[1] = a22;
                    OnyxClient.H.error("Failed to load font '{}'", objectArray);
                    return new RenderSupport_127(new Font("SansSerif", 0, 1), (float)a);
                }
            }
            a22.close();
        }
        return class_127;
    }

    /*
     * WARNING - void declaration
     */
    private RenderSupport_127(Font font, float f2) {
        float f3;
        void a32422;
        void a;
        RenderSupport_127 class_127;
        RenderSupport_127 class_1273 = class_127 = this;
        class_1273 = class_127;
        class_1272.F = new HashMap<Character, RenderSupport_129>();
        boolean bl = 5 >> 2;
        class_1272.d = new FontRenderContext(null, bl, bl);
        class_1272.B = -1;
        float a2 = Math.min((float)(a * 4.0f), 192.0f);
        LineMetrics lineMetrics = a32422.deriveFont(100.0f).getLineMetrics("Ayg", class_127.d);
        float f4 = lineMetrics.getAscent() + lineMetrics.getDescent();
        float f5 = f3 <= 0.0f ? 1.0f : 100.0f / f4;
        class_127.g = a32422.deriveFont(4 * f5);
        class_127.K = a / 4;
        int a32422 = 20;
        class_127.i = Math.min(2048, Math.max(512, Integer.highestOneBit(a32422 * 12 - 1) * 2));
        float a32422 = class_127.d((char)72);
        a2 = class_127.L((char)112);
        class_127.G = a32422 > 0.0f ? a32422 : a * 0.72f;
        class_127.f = 4 > 0.0f ? 4 : a * 0.21f;
    }

    /*
     * WARNING - void declaration
     */
    public float L(String string) {
        void a;
        int n;
        RenderSupport_127 class_127 = this;
float a2 = 0.0f;
        int n2 = 0;
        while (n2 < a.length()) {
            char c = a.charAt(0);
            a2 += class_127.D(c);
            n2 = ++n;
        }
        return 4;
    }

    private static int L(int a) {
return a + 8 - 1 & 0xFFFFFFF8;
    }

    private int[] L(int n, int n2) {
        int a;
        int a2 = n2;
        RenderSupport_127 a3 = this;
if (a3.E) {
            return null;
        }
        a = RenderSupport_127.L(a);
        a2 = RenderSupport_127.L(4);
        if (a3.A + a > a3.i) {
            a3.A = 0;
            a3.C += a3.D;
            a3.D = 0;
        }
        if (a3.C + 4 > a3.i) {
            a3.E = 1;
            Object[] objectArray = new Object[1];
            objectArray[0] = a3.i;
            OnyxClient.H.warn("Glyph atlas full at {}px", objectArray);
            return null;
        }
        int[] nArray = new int[2];
        nArray[0] = a3.A;
        nArray[1] = a3.C;
        RenderSupport_127 class_127 = a3;
        class_127.A += a;
        class_127.D = Math.max(class_127.D, 4);
        return nArray;
    }

    public float L() {
        RenderSupport_127 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(BufferedImage bufferedImage, int n, int n2, int n3, int n4) {
        int a;
        int a2;
        int n5;
        Object a222 = bufferedImage;
        RenderSupport_127 a3 = this;
if (a3.B == -1) {
            a3.L();
        }
        int[] nArray = ((DataBufferInt)((BufferedImage)a222).getRaster().getDataBuffer()).getData();
        a222 = nArray;
        byte[] byArray = new byte[nArray.length];
        int n6 = 0;
        while (n6 < ((Object)a222).length) {
            int n7 = n5++;
            byArray[n7] = (byte)(a222[n7] >>> 24);
            n6 = 0;
        }
        GlStateManager.bindTexture(a3.B);
        GL11.glPixelStorei(3317, 1);
        n5 = a2;
        int a222 = a;
        int n8 = 0;
        while (n8 <= 3) {
            void a4;
            void a5;
            int n9 = 0;
            a3.L(n9, (int)(a5 >> 0), (int)(a4 >> 0), 0, 0, byArray);
            if (n9 == 3) break;
            a = Math.max(1, 0);
            int n10 = 1;
            int n11 = Math.max(n10, (int)(0 >> n10));
            byArray = RenderSupport_127.L(byArray, 0, 0, a, n11);
            n5 = a;
            a222 = n11;
            n8 = ++a2;
        }
        GL11.glPixelStorei(3317, 4);
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_129 d(char c) {
        void a;
        RenderSupport_127 class_127 = this;
Object a2 = class_127.F.get(Character.valueOf((char)a));
        if (a2 != null) {
            return a2;
        }
        RenderSupport_127 class_1272 = class_127;
        a2 = class_1272.L((char)a);
        class_1272.F.put(Character.valueOf((char)a), (RenderSupport_129)a2);
        return a2;
    }

    private RenderSupport_129 L(char c) {
        Graphics2D graphics2D;
        char a22 = c;
        RenderSupport_127 a = this;
if (!a.g.canDisplay(a22)) {
            return RenderSupport_127.c;
        }
        RenderSupport_127 class_127 = a;
        char[] cArray = new char[1];
        cArray[0] = a22;
        Object a22 = class_127.g.createGlyphVector(class_127.d, cArray);
        GlyphVector glyphVector = a22;
        float f2 = glyphVector.getGlyphMetrics(0).getAdvanceX() * a.K;
        Rectangle rectangle = glyphVector.getPixelBounds(a.d, 0.0f, 0.0f);
        if (rectangle.width <= 0 || rectangle.height <= 0) {
            return new RenderSupport_129(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2);
        }
        Rectangle rectangle2 = rectangle;
        int n = rectangle2.width + 16;
        int n2 = rectangle2.height + 16;
        if (n > a.i || n2 > a.i) {
            return h;
        }
        BufferedImage bufferedImage = new BufferedImage(n, n2, 2);
        Graphics2D graphics2D2 = graphics2D = bufferedImage.createGraphics();
        Graphics2D graphics2D3 = graphics2D;
        graphics2D3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D3.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D3.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        graphics2D3.setColor(Color.WHITE);
        graphics2D2.setFont(a.g);
        graphics2D2.drawGlyphVector((GlyphVector)a22, 8 - rectangle.x, 8 - rectangle.y);
        graphics2D2.dispose();
        int[] nArray = a.L(n, n2);
        a22 = nArray;
        if (nArray == null) {
            return h;
        }
        a.L(bufferedImage, (int)a22[0], (int)a22[1], n, n2);
        return new RenderSupport_129((float)a22[0] / (float)a.i, (float)a22[1] / (float)a.i, (float)(a22[0] + n) / (float)a.i, (float)(a22[1] + n2) / (float)a.i, (float)(rectangle.x - 8) * a.K, (float)(rectangle.y - 8) * a.K, (float)n * a.K, (float)n2 * a.K, f2);
    }

    private float L(char c) {
        char a = c;
        RenderSupport_127 a2 = this;
Rectangle rectangle = a2.L(a);
        return (float)(rectangle.y + rectangle.height) * a2.K;
    }

    public boolean d(char c) {
        char a = c;
        RenderSupport_127 a2 = this;
if (Character.isWhitespace(a)) {
            return --1 != 0;
        }
        if (a2.L(a) && !a2.d(a).L()) {
            return 5 >> 2;
        }
        return false;
    }

    public int L() {
        RenderSupport_127 a;
return a.B;
    }

    public boolean L(char c) {
        char a = c;
        RenderSupport_127 a2 = this;
return a2.g.canDisplay(a);
    }

    private Rectangle L(char c) {
        char a = c;
        RenderSupport_127 a2 = this;
RenderSupport_127 class_127 = a2;
        char[] cArray = new char[1];
        cArray[0] = a;
        return class_127.g.createGlyphVector(class_127.d, cArray).getPixelBounds(a2.d, 0.0f, 0.0f);
    }

    private void L() {
        int a;
        RenderSupport_127 class_127 = this;
class_127.B = TextureUtil.glGenTextures();
        GlStateManager.bindTexture(class_127.B);
        GL11.glTexParameteri(3553, 10241, 9987);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
        GL11.glTexParameteri(3553, 33085, 3);
        GL11.glPixelStorei(3317, 1);
        int n = 0;
        while (n <= 3) {
            int n2 = class_127.i >> 0;
            int n3 = n2;
            int n4 = n2;
            GL11.glTexImage2D(3553, a++, 6406, n3, n3, 0, 6406, 5121, BufferUtils.createByteBuffer(n4 * n4));
            n = 0;
        }
        GL11.glPixelStorei(3317, 4);
    }
}

