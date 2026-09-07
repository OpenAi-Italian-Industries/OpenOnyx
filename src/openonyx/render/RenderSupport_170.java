/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_170 {
    private static float M;
    private static float L;
    private static float j;
    private static boolean m;
    private static float h;
    private static float l;
    private static float I;
    private static float d;
    private static float i;
    private static float f;
    private static boolean H;
    private static float e;

    private RenderSupport_170() {
        RenderSupport_170 a;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        float a3 = f5;
        float a4 = f2;
j = a4;
        h = a2;
        L = a;
        M = a3;
        H = 1;
    }

    public static void L() {
H = 0;
    }

    public static void L(Entity a) {
if (!m || a == null) {
            return;
        }
        a.rotationYaw = l;
        a.rotationPitch = I;
        a.prevRotationYaw = f;
        a.prevRotationPitch = d;
        if (a instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)a;
            entityLivingBase.rotationYawHead = i;
            entityLivingBase.prevRotationYawHead = e;
        }
        m = false;
    }

    public static boolean L(Entity a) {
if (!H || a == null || m) {
            return false;
        }
        Entity entity = a;
        l = entity.rotationYaw;
        I = entity.rotationPitch;
        f = entity.prevRotationYaw;
        d = entity.prevRotationPitch;
        entity.rotationYaw = j;
        entity.rotationPitch = h;
        entity.prevRotationYaw = L;
        entity.prevRotationPitch = M;
        if (entity instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)a;
            i = entityLivingBase.rotationYawHead;
            e = entityLivingBase.prevRotationYawHead;
            entityLivingBase.rotationYawHead = j;
            entityLivingBase.prevRotationYawHead = L;
        }
        m = true;
        return 1 != 0;
    }

    public static boolean L() {
return H;
    }
}

