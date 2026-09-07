/*
 * Decompiled with CFR.
 */
package openonyx.render.internal;

import openonyx.events.Rotation;
import openonyx.render.internal.RenderSupport_174;
import openonyx.render.internal.RenderSupport_177;
import openonyx.render.internal.RenderSupport_178;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderMode_171
extends Enum<RenderMode_171> {
    final public static RenderMode_171 M;
    final public static RenderMode_171 L;
    private final float j;
    final public static RenderMode_171 m;
    final public static RenderMode_171 h;
    final public static RenderMode_171 l;
    final public static RenderMode_171 I;
    private final RenderSupport_178[] d;
    final public static RenderMode_171 i;
    private final static RenderMode_171[] f;
    final public static RenderMode_171 H;
    private final int[] e;

    static {
        RenderSupport_178[] class_178Array = new RenderSupport_178[13];
        class_178Array[0] = new RenderSupport_178(0.08f, 0.1f, 0.88f);
        class_178Array[1] = new RenderSupport_178(0.28f, 0.34f, 0.78f);
        class_178Array[2] = new RenderSupport_178(0.56f, 0.82f, 0.62f);
        class_178Array[3] = new RenderSupport_178(0.86f, 0.3f, 0.52f);
        class_178Array[4] = new RenderSupport_178(1.14f, 0.46f, 0.4f);
        class_178Array[5] = new RenderSupport_178(1.24f, 0.04f, 0.3f);
        class_178Array[6] = new RenderSupport_178(1.02f, -0.18f, 0.28f);
        class_178Array[7] = new RenderSupport_178(1.18f, -0.64f, 0.22f);
        class_178Array[8] = new RenderSupport_178(0.86f, -0.46f, 0.2f);
        class_178Array[9] = new RenderSupport_178(0.8f, -0.98f, 0.14f);
        class_178Array[10] = new RenderSupport_178(0.54f, -0.74f, 0.16f);
        class_178Array[11] = new RenderSupport_178(0.3f, -1.16f, 0.12f);
        class_178Array[12] = new RenderSupport_178(0.1f, -0.54f, 0.18f);
        H = new RenderMode_171("ANGELIC", 0, class_178Array);
        RenderSupport_178[] class_178Array2 = new RenderSupport_178[12];
        class_178Array2[0] = new RenderSupport_178(0.1f, 0.12f, 0.9f);
        class_178Array2[1] = new RenderSupport_178(0.22f, 0.4f, 0.8f);
        class_178Array2[2] = new RenderSupport_178(0.48f, 0.72f, 0.65f);
        class_178Array2[3] = new RenderSupport_178(0.8f, 0.6f, 0.55f);
        class_178Array2[4] = new RenderSupport_178(1.1f, 0.7f, 0.42f);
        class_178Array2[5] = new RenderSupport_178(1.3f, 0.3f, 0.35f);
        class_178Array2[6] = new RenderSupport_178(1.2f, -0.1f, 0.3f);
        class_178Array2[7] = new RenderSupport_178(1.05f, -0.5f, 0.25f);
        class_178Array2[8] = new RenderSupport_178(0.7f, -0.35f, 0.22f);
        class_178Array2[9] = new RenderSupport_178(0.5f, -0.7f, 0.18f);
        class_178Array2[10] = new RenderSupport_178(0.2f, -0.5f, 0.15f);
        class_178Array2[11] = new RenderSupport_178(0.05f, -0.3f, 0.2f);
        M = new RenderMode_171("DRAGON", 1, class_178Array2);
        RenderSupport_178[] class_178Array3 = new RenderSupport_178[11];
        class_178Array3[0] = new RenderSupport_178(0.12f, 0.15f, 0.92f);
        class_178Array3[1] = new RenderSupport_178(0.3f, 0.5f, 0.85f);
        class_178Array3[2] = new RenderSupport_178(0.5f, 0.9f, 0.7f);
        class_178Array3[3] = new RenderSupport_178(0.7f, 0.8f, 0.6f);
        class_178Array3[4] = new RenderSupport_178(0.85f, 0.55f, 0.5f);
        class_178Array3[5] = new RenderSupport_178(0.75f, 0.2f, 0.45f);
        class_178Array3[6] = new RenderSupport_178(0.55f, -0.15f, 0.4f);
        class_178Array3[7] = new RenderSupport_178(0.4f, -0.6f, 0.3f);
        class_178Array3[8] = new RenderSupport_178(0.25f, -0.85f, 0.2f);
        class_178Array3[9] = new RenderSupport_178(0.12f, -0.65f, 0.25f);
        class_178Array3[10] = new RenderSupport_178(0.06f, -0.35f, 0.3f);
        h = new RenderMode_171("BUTTERFLY", 2, class_178Array3);
        RenderSupport_178[] class_178Array4 = new RenderSupport_178[13];
        class_178Array4[0] = new RenderSupport_178(0.1f, 0.14f, 0.9f);
        class_178Array4[1] = new RenderSupport_178(0.25f, 0.45f, 0.82f);
        class_178Array4[2] = new RenderSupport_178(0.52f, 0.78f, 0.68f);
        class_178Array4[3] = new RenderSupport_178(0.82f, 0.5f, 0.55f);
        class_178Array4[4] = new RenderSupport_178(1.15f, 0.55f, 0.42f);
        class_178Array4[5] = new RenderSupport_178(1.28f, 0.15f, 0.32f);
        class_178Array4[6] = new RenderSupport_178(1.2f, -0.25f, 0.28f);
        class_178Array4[7] = new RenderSupport_178(1.1f, -0.55f, 0.24f);
        class_178Array4[8] = new RenderSupport_178(1.25f, -0.85f, 0.18f);
        class_178Array4[9] = new RenderSupport_178(0.9f, -0.65f, 0.16f);
        class_178Array4[10] = new RenderSupport_178(0.6f, -0.9f, 0.14f);
        class_178Array4[11] = new RenderSupport_178(0.3f, -0.7f, 0.12f);
        class_178Array4[12] = new RenderSupport_178(0.08f, -0.4f, 0.16f);
        m = new RenderMode_171("PHOENIX", 3, class_178Array4);
        RenderSupport_178[] class_178Array5 = new RenderSupport_178[11];
        class_178Array5[0] = new RenderSupport_178(0.15f, 0.1f, 0.85f);
        class_178Array5[1] = new RenderSupport_178(0.4f, 0.35f, 0.75f);
        class_178Array5[2] = new RenderSupport_178(0.7f, 0.6f, 0.6f);
        class_178Array5[3] = new RenderSupport_178(1.0f, 0.4f, 0.5f);
        class_178Array5[4] = new RenderSupport_178(0.85f, 0.1f, 0.45f);
        class_178Array5[5] = new RenderSupport_178(1.1f, -0.15f, 0.35f);
        class_178Array5[6] = new RenderSupport_178(0.9f, -0.45f, 0.3f);
        class_178Array5[7] = new RenderSupport_178(0.65f, -0.3f, 0.25f);
        class_178Array5[8] = new RenderSupport_178(0.45f, -0.6f, 0.2f);
        class_178Array5[9] = new RenderSupport_178(0.2f, -0.4f, 0.22f);
        class_178Array5[10] = new RenderSupport_178(0.08f, -0.15f, 0.3f);
        i = new RenderMode_171("CRYSTAL", 4, class_178Array5);
        RenderSupport_178[] class_178Array6 = new RenderSupport_178[12];
        class_178Array6[0] = new RenderSupport_178(0.08f, 0.08f, 0.9f);
        class_178Array6[1] = new RenderSupport_178(0.2f, 0.25f, 0.82f);
        class_178Array6[2] = new RenderSupport_178(0.45f, 0.4f, 0.7f);
        class_178Array6[3] = new RenderSupport_178(0.7f, 0.35f, 0.58f);
        class_178Array6[4] = new RenderSupport_178(0.95f, 0.25f, 0.48f);
        class_178Array6[5] = new RenderSupport_178(0.9f, 0.0f, 0.4f);
        class_178Array6[6] = new RenderSupport_178(1.1f, -0.15f, 0.32f);
        class_178Array6[7] = new RenderSupport_178(0.8f, -0.3f, 0.28f);
        class_178Array6[8] = new RenderSupport_178(0.55f, -0.2f, 0.25f);
        class_178Array6[9] = new RenderSupport_178(0.4f, -0.45f, 0.2f);
        class_178Array6[10] = new RenderSupport_178(0.15f, -0.3f, 0.22f);
        class_178Array6[11] = new RenderSupport_178(0.05f, -0.1f, 0.28f);
        L = new RenderMode_171("MECHANICAL", 5, class_178Array6);
        RenderSupport_178[] class_178Array7 = new RenderSupport_178[10];
        class_178Array7[0] = new RenderSupport_178(0.1f, 0.12f, 0.9f);
        class_178Array7[1] = new RenderSupport_178(0.25f, 0.38f, 0.82f);
        class_178Array7[2] = new RenderSupport_178(0.42f, 0.65f, 0.68f);
        class_178Array7[3] = new RenderSupport_178(0.55f, 0.7f, 0.58f);
        class_178Array7[4] = new RenderSupport_178(0.6f, 0.45f, 0.5f);
        class_178Array7[5] = new RenderSupport_178(0.5f, 0.15f, 0.42f);
        class_178Array7[6] = new RenderSupport_178(0.38f, -0.1f, 0.35f);
        class_178Array7[7] = new RenderSupport_178(0.3f, -0.35f, 0.28f);
        class_178Array7[8] = new RenderSupport_178(0.18f, -0.45f, 0.22f);
        class_178Array7[9] = new RenderSupport_178(0.08f, -0.25f, 0.26f);
        I = new RenderMode_171("FAIRY", 6, class_178Array7);
        RenderSupport_178[] class_178Array8 = new RenderSupport_178[13];
        class_178Array8[0] = new RenderSupport_178(0.1f, 0.12f, 0.88f);
        class_178Array8[1] = new RenderSupport_178(0.25f, 0.38f, 0.8f);
        class_178Array8[2] = new RenderSupport_178(0.55f, 0.65f, 0.65f);
        class_178Array8[3] = new RenderSupport_178(0.85f, 0.5f, 0.52f);
        class_178Array8[4] = new RenderSupport_178(1.15f, 0.55f, 0.4f);
        class_178Array8[5] = new RenderSupport_178(1.25f, 0.2f, 0.32f);
        class_178Array8[6] = new RenderSupport_178(1.1f, -0.1f, 0.28f);
        class_178Array8[7] = new RenderSupport_178(1.3f, -0.45f, 0.22f);
        class_178Array8[8] = new RenderSupport_178(1.15f, -0.7f, 0.18f);
        class_178Array8[9] = new RenderSupport_178(0.85f, -0.55f, 0.16f);
        class_178Array8[10] = new RenderSupport_178(0.55f, -0.85f, 0.14f);
        class_178Array8[11] = new RenderSupport_178(0.25f, -0.65f, 0.12f);
        class_178Array8[12] = new RenderSupport_178(0.08f, -0.35f, 0.18f);
        l = new RenderMode_171("DEMON", 7, class_178Array8);
        f = RenderMode_171.L();
    }

    public int[] L() {
        RenderMode_171 a;
return a.e;
    }

    public static RenderMode_171[] values() {
return (RenderMode_171[])f.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RenderMode_171(RenderSupport_178 ... class_178Array) {
        int n;
        void var2_-1;
        void var1_-1;
        RenderMode_171 a;
        void var3_4;
        RenderMode_171 a22 = var3_4;
        RenderMode_171 enum_171 = a = this;
        enum_171.d = a22;
        enum_171.e = ((RenderMode_171)a22).length <= 10 ? RenderSupport_177.e : RenderSupport_177.H;
        float f2 = 0.0f;
        RenderMode_171 enum_1712 = a22;
        int a22 = ((RenderMode_171)enum_1712).length;
        int n2 = 0;
        while (n2 < 15) {
            RenderMode_171 enum_1713 = enum_1712[0];
            f2 = Math.max(f2, ((RenderSupport_178)((Object)enum_1713)).L());
            n2 = ++n;
        }
        a.j = f2;
    }

    private static RenderMode_171[] L() {
RenderMode_171[] enum_171Array = new RenderMode_171[8];
        enum_171Array[0] = H;
        enum_171Array[1] = M;
        enum_171Array[2] = h;
        enum_171Array[3] = m;
        enum_171Array[4] = i;
        enum_171Array[5] = L;
        enum_171Array[6] = I;
        enum_171Array[7] = l;
        return enum_171Array;
    }

    public RenderSupport_178[] L() {
        RenderMode_171 a;
return a.d;
    }

    public static RenderMode_171 valueOf(String a) {
return Enum.valueOf(RenderMode_171.class, a);
    }

    public float L() {
        RenderMode_171 a;
return a.j;
    }
}

