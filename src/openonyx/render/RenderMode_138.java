/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import openonyx.movement.MovementSupport_088;
import openonyx.utilities.UtilitySupport_486;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderMode_138
extends Enum<RenderMode_138> {
    private final static Set<Integer> I;
    final public static RenderMode_138 d;
    private final static RenderMode_138[] i;
    private final static Set<Integer> f;
    final public static RenderMode_138 H;
    final public static RenderMode_138 e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RenderMode_138() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        RenderMode_138 enum_138 = this;
    }

    private static boolean d() {
int n = RenderMode_138.L(0, 4096);
        int n2 = RenderMode_138.L(0, 4097);
        int n3 = RenderMode_138.L(0, 4099);
        if (0 <= 0 || n2 <= 0) {
            return false;
        }
        int n4 = 0;
        while (0 > 1 || n2 > 1) {
            n = Math.max(1, 0);
            n2 = Math.max(1, n2 / 2);
            if (RenderMode_138.L(++n4, 4096) != 0) {
                return 0 != 0;
            }
            if (RenderMode_138.L(n4, 4097) != n2) {
                return 0 != 0;
            }
            if (RenderMode_138.L(n4, 4099) == n3) continue;
            return 0 != 0;
        }
        if (GL11.glGetTexParameteri(3553, 33085) >= n4 && GL11.glGetTexParameterf(3553, 33083) >= (float)n4) {
            return 3 >> 1;
        }
        return false;
    }

    private static int L(int n, int n2) {
        int a = n2;
        int a2 = 0;
return GL11.glGetTexLevelParameteri(3553, a2, a);
    }

    float L() {
        RenderMode_138 a;
if (a == e) {
            return 0.01f;
        }
        return 0.5f;
    }

    public static void d(int a) {
I.remove(a);
        f.remove(a);
    }

    void L(int n) {
        int a = n;
        RenderMode_138 a2 = this;
if (a2 == e) {
            return;
        }
        GL11.glTexParameteri(3553, 10241, 0);
        GL11.glTexParameteri(3553, 10240, 0);
    }

    public static RenderMode_138[] values() {
return (RenderMode_138[])i.clone();
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] L(byte[] byArray, int n, int n2, int n3, int n4) {
        int n5;
        void a;
        void a2;
        byte[] byArray2 = byArray;
byte[] byArray3 = new byte[a2 * a * 4];
        int n6 = 0;
        while (n6 < a) {
            int n7 = 0;
            while (n7 < a2) {
                int n8;
                int n9;
                int n10 = 0;
                int n11 = 0;
                int n12 = 0;
                int a3 = 0;
                int n13 = 0;
                int n14 = 0;
                while (n14 < 2) {
                    void a4;
                    int n15 = 0;
                    if (n15 < a4) {
                        int n16;
                        int n17 = 0;
                        while (n17 < 2) {
                            void a5;
                            int n18 = n8 * 2 + 0;
                            if (n18 < a5) {
                                n18 = (n15 * a5 + n18) * 4;
                                int n19 = byArray2[n18 + 3] & 0xFF;
                                n10 += (byArray2[n18] & 0xFF) * n19;
                                n11 += (byArray2[n18 + 1] & 0xFF) * n19;
                                n12 += (byArray2[n18 + 2] & 0xFF) * n19;
                                ++n13;
                                a3 += n19;
                            }
                            n17 = ++n16;
                        }
                    }
                    n14 = ++n9;
                }
                n9 = (0 * a2 + n8) * 4;
                byArray3[0] = (byte)(a3 == 0 ? 0 : n10 / a3);
                byArray3[1] = (byte)(a3 == 0 ? 0 : n11 / a3);
                byArray3[2] = (byte)(a3 == 0 ? 0 : n12 / a3);
                byArray3[3] = (byte)(n13 == 0 ? 0 : a3 / n13);
                n7 = ++n8;
            }
            n6 = ++n5;
        }
        return byArray3;
    }

    static {
        e = new RenderMode_138("PIXELS", 0);
        d = new RenderMode_138("SMOOTH", 1);
        H = new RenderMode_138("MINIFIED", 2);
        i = RenderMode_138.L();
        I = new HashSet<Integer>();
        f = new HashSet<Integer>();
    }

    private static void L() {
int n = RenderMode_138.L(0, 4096);
        int n2 = RenderMode_138.L(0, 4097);
        int n3 = RenderMode_138.L(0, 4099);
        if (0 <= 0 || n2 <= 0 || n3 <= 0) {
            return;
        }
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer(0 * n2 * 4);
        GL11.glGetTexImage(3553, 0, 6408, 5121, byteBuffer);
        byte[] byArray = new byte[0 * n2 * 4];
        byteBuffer.get(byArray);
        int n4 = 0;
        int n5 = 0;
        while (n5 > 1 || n2 > 1) {
            int n6 = Math.max(1, 0);
            int n7 = Math.max(1, n2 / 2);
            byArray = RenderMode_138.L(byArray, 0, n2, n6, n7);
            ++n4;
            n = n6;
            n2 = n7;
            ByteBuffer byteBuffer2 = BufferUtils.createByteBuffer(byArray.length);
            n5 = 0;
            byteBuffer2.put(byArray).flip();
            GL11.glTexImage2D(3553, n4, n3, 0, n2, 0, 6408, 5121, byteBuffer2);
        }
        GL11.glTexParameteri(3553, 33085, n4);
        GL11.glTexParameterf(3553, 33082, 0.0f);
        GL11.glTexParameterf(3553, 33083, n4);
    }

    int L() {
        RenderMode_138 a;
if (a == e) {
            return 9728;
        }
        if (a == H && RenderMode_138.L()) {
            GL11.glTexParameteri(3553, 10241, 9987);
        } else {
            GL11.glTexParameteri(3553, 10241, 9729);
        }
        GL11.glTexParameteri(3553, 10240, 9729);
        return 9728;
    }

    private static boolean L() {
int n = GL11.glGetInteger(32873);
        if (0 <= 0 || f.contains(0)) {
            return false;
        }
        if (I.contains(0) && RenderMode_138.L(1, 4096) > 0) {
            return 1 != 0;
        }
        I.remove(0);
        if (!RenderMode_138.d()) {
            RenderMode_138.L();
        }
        if (RenderMode_138.d()) {
            I.add(0);
            return 3 >> 1;
        }
        GL11.glTexParameteri(3553, 33085, 0);
        GL11.glTexParameterf(3553, 33083, 0.0f);
        f.add(0);
        return 0 != 0;
    }

    public static RenderMode_138 valueOf(String a) {
return Enum.valueOf(RenderMode_138.class, a);
    }

    private static RenderMode_138[] L() {
RenderMode_138[] enum_138Array = new RenderMode_138[3];
        enum_138Array[0] = e;
        enum_138Array[1] = d;
        enum_138Array[2] = H;
        return enum_138Array;
    }
}

