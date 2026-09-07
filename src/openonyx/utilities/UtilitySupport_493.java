/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.protocol.group_m.ProtocolSupport_212;

public final class UtilitySupport_493
implements OnyxListener_001 {
    /*
     * WARNING - void declaration
     */
    public static MovingObjectPosition L(Entity entity, double d, ProtocolSupport_212 class_212) {
        void a22;
        Object a = class_212;
        Entity a3 = entity;
Object object = e.getRenderViewEntity();
        if (object == null || a3 == null) {
            return null;
        }
        object = ((Entity)object).getPositionEyes(1.0f);
        a = ((ProtocolSupport_212)a).L();
        a = ((Vec3)object).addVector(((Vec3)a).xCoord * a22, ((Vec3)a).yCoord * a22, ((Vec3)a).zCoord * a22);
        Entity entity2 = a3;
        float a22 = entity2.getCollisionBorderSize();
        a = entity2.getEntityBoundingBox().expand(a22, a22, a22).calculateIntercept((Vec3)object, (Vec3)a);
        if (a == null) {
            return null;
        }
        return new MovingObjectPosition(a3, ((MovingObjectPosition)a).hitVec);
    }

    private UtilitySupport_493() {
        UtilitySupport_493 a;
    }
}

