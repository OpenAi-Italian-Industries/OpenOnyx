/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.glu.GLU
 */
package openonyx.render;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_107
implements OnyxListener_001 {
    private final static FloatBuffer m;
    private static Vec3 h;
    private static Vec3 l;
    private final static IntBuffer I;
    private static boolean d;
    private static Vec3 i;
    private final static FloatBuffer f;
    private final static FloatBuffer H;
    private static Vec3 e;

    static {
        f = BufferUtils.createFloatBuffer(16);
        m = BufferUtils.createFloatBuffer(16);
        H = BufferUtils.createFloatBuffer(3);
        I = BufferUtils.createIntBuffer(16);
        e = new Vec3(0.0, 0.0, 0.0);
        h = new Vec3(0.0, 0.0, 0.0);
        l = new Vec3(0.0, 0.0, 1.0);
        i = new Vec3(1.0, 0.0, 0.0);
        int n = 0;
        I.put(n, n);
        I.put(1, 0);
        I.put(2, 1);
        I.put(3, 1);
    }

    public static boolean L() {
return d;
    }

    public static void L(float f2) {
        float f3 = f2;
Entity a = ((Minecraft)((Object)e)).getRenderViewEntity();
        if (a == null) {
            d = 0;
            return;
        }
        f.clear();
        m.clear();
        GL11.glGetFloat(2982, f);
        GL11.glGetFloat(2983, m);
        e = new Vec3(a.prevPosX + (a.posX - a.prevPosX) * (double)f3, a.prevPosY + (a.posY - a.prevPosY) * (double)f3, a.prevPosZ + (a.posZ - a.prevPosZ) * (double)f3);
        l = RenderSupport_107.L(0.0f, 0.0f, -1.0f);
        i = RenderSupport_107.L(-1.0f, 0.0f, 0.0f);
        h = e.add(RenderSupport_107.L(-f.get(12), -f.get(13), -f.get(14)));
        d = 1;
    }

    public static Vec3 D() {
return h;
    }

    public static Vec3 d() {
return l;
    }

    public static Vec3 L() {
return i;
    }

    public static float d() {
return Math.abs(m.get(0));
    }

    /*
     * WARNING - void declaration
     */
    private static Vec3 L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
return new Vec3(f.get(0) * a3 + f.get(1) * a + f.get(2) * a2, f.get(4) * a3 + f.get(5) * a + f.get(6) * a2, f.get(8) * a3 + f.get(9) * a + f.get(10) * a2);
    }

    public static float L() {
return Math.abs(m.get(5));
    }

    public static void L() {
d = 0;
    }

    private RenderSupport_107() {
        RenderSupport_107 a;
    }

    public static float[] L(Vec3 vec3, float f2, float f3) {
        float a;
        float a2 = f3;
        Vec3 a3 = vec3;
if (!d) {
            return null;
        }
        H.clear();
        if (!GLU.gluProject((float)((float)(a3.xCoord - RenderSupport_107.e.xCoord)), (float)((float)(a3.yCoord - RenderSupport_107.e.yCoord)), (float)((float)(a3.zCoord - RenderSupport_107.e.zCoord)), (FloatBuffer)f, (FloatBuffer)m, (IntBuffer)I, (FloatBuffer)H)) {
            return null;
        }
        float f4 = H.get(2);
        if (!Float.isFinite(f4) || f4 < 0.0f || f4 > 1.0f) {
            return null;
        }
        a = H.get(0) * a;
        a2 = (1.0f - H.get(1)) * 4;
        if (!Float.isFinite(a) || !Float.isFinite(4)) {
            return null;
        }
        float[] fArray = new float[2];
        fArray[0] = a;
        fArray[1] = 4;
        return fArray;
    }
}

