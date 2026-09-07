/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import openonyx.render.RenderSupport_100;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_113;

public final class RenderSupport_111 {
    private final static double M = 0.05;
    private final static double L = 8.0;
    private final static double j = 24.0;
    private final static double m = 0.05859375;
    private final static float h = 1.0f;
    private final static int l = 1;
    private final static double I = 1.0;
    private final static double d = 4.0;
    private final static double i = -8.5;
    private final static int f = 3;
    private final static int H = 4;
    private final static double e = 0.1875;

    /*
     * WARNING - void declaration
     */
    private static float L(Entity entity, float f2) {
        void a;
        Entity entity2 = entity;
Entity entity3 = entity2;
        if (!(entity2 instanceof EntityLivingBase)) {
            Entity entity4 = entity2;
            return entity3.prevRotationYaw + (entity4.rotationYaw - entity4.prevRotationYaw) * a;
        }
        Entity a2 = (EntityLivingBase)entity3;
        Entity entity5 = a2;
        return ((EntityLivingBase)a2).prevRenderYawOffset + (((EntityLivingBase)entity5).renderYawOffset - ((EntityLivingBase)entity5).prevRenderYawOffset) * a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 100;
        int n3 = 0;
        int n4 = 92;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (0 < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = 0;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_113 L(Entity entity, float f2, float f3, float f4) {
        void a;
        void a2;
        int a222;
        Vec3 vec3;
        float a3;
        Entity entity2 = entity;
if (!RenderSupport_107.L()) {
            return null;
        }
        Vec3 vec32 = RenderSupport_111.L(entity2, a3);
        if (vec3.addVector(0.0, (double)entity2.height * 0.5, 0.0).subtract(RenderSupport_107.D()).dotProduct(RenderSupport_107.d()) <= 0.05) {
            return null;
        }
        Entity entity3 = entity2;
        RenderSupport_100 class_100 = RenderSupport_100.L(entity3);
        double d = Math.toRadians(RenderSupport_111.L(entity3, a3));
        double d2 = Math.cos(d) * class_100.L();
        double d3 = Math.sin(d) * class_100.L();
        double d4 = -Math.sin(d) * class_100.i();
        d = Math.cos(d) * class_100.i();
        a3 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = -3.4028235E38f;
        int n = 0;
        while (n < 8) {
            Vec3 vec33;
            double d5;
            double d6;
            double d7 = 0 == 0 ? 1.0 : -1.0;
            double d8 = 0 == 0 ? 1.0 : -1.0;
            RenderSupport_100 class_1002 = class_100;
            if (0 == 0) {
                d6 = class_1002.d();
                d5 = d3;
            } else {
                d6 = class_1002.D();
                d5 = d3;
            }
            Vec3 vec34 = vec32.addVector(d2 * d7 + d4 * d8, d6, d5 * d7 + d * d8);
            if (vec33.subtract(RenderSupport_107.D()).dotProduct(RenderSupport_107.d()) <= 0.05) {
                return null;
            }
            float[] fArray = RenderSupport_107.L(vec34, (float)a2, (float)a);
            if (fArray == null) {
                return null;
            }
            a3 = Math.min(a3, fArray[0]);
            f5 = Math.max(f5, fArray[0]);
            f6 = Math.min(f6, fArray[1]);
            f7 = Math.max(f7, fArray[1]);
            n = ++a222;
        }
        if (f7 - f6 <= 1.0f) {
            return null;
        }
        Vec3 vec35 = vec32;
        float[] a222 = RenderSupport_107.L(vec35.addVector(0.0, class_100.d(), 0.0), (float)a2, (float)a);
        float[] fArray = RenderSupport_107.L(vec35.addVector(0.0, class_100.D(), 0.0), (float)a2, (float)a);
        if (a222 == null || fArray == null) {
            return null;
        }
        float f8 = a3;
        return new RenderSupport_113(f8, f6, f5 - f8, f7 - f6, a222[0], fArray[0]);
    }

    private static Vec3 L(Entity entity, float f2) {
        float a = f2;
        Entity a2 = entity;
return new Vec3(a2.lastTickPosX + (a2.posX - a2.lastTickPosX) * 0.0, a2.lastTickPosY + (a2.posY - a2.lastTickPosY) * 0.0, a2.lastTickPosZ + (a2.posZ - a2.lastTickPosZ) * 0.0);
    }

    private RenderSupport_111() {
        RenderSupport_111 a;
    }
}

