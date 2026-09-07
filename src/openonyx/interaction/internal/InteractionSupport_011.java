/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import openonyx.interaction.internal.InteractionSupport_020;
import openonyx.interaction.internal.InteractionSupport_022;
import openonyx.interaction.internal.InteractionSupport_026;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.internal.UtilitySupport_513;
import openonyx.utilities.internal.UtilitySupport_516;
import openonyx.utilities.internal.UtilityListener_511;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class InteractionSupport_011
extends InteractionSupport_022 {
    private final InteractionSupport_026 H;
    private final UtilitySupport_513 e;

    @Generated
    public UtilitySupport_513 L() {
        InteractionSupport_011 a;
return a.e;
    }

    @Override
    public Vec3 L(UtilitySupport_516 class_516, BlockPos blockPos) {
        UtilitySupport_516 a;
        BlockPos a2 = blockPos;
        InteractionSupport_011 a3 = this;
InteractionSupport_011 class_011 = a3;
        a = class_011.L(a).L(a2);
        UtilitySupport_516 class_5162 = class_011.L(((Minecraft)((Object)InteractionSupport_011.e)).thePlayer, a);
        if (class_5162 == null) {
            class_5162 = a;
        }
        return new InteractionSupport_020(a3.H).L(a2, class_5162.L(new Vec3(-a2.getX(), -a2.getY(), -a2.getZ())));
    }

    /*
     * WARNING - void declaration
     */
    private UtilitySupport_516 L(EntityPlayerSP entityPlayerSP, UtilitySupport_516 class_516) {
        UtilitySupport_516 class_5162;
        void a;
        Object a2 = entityPlayerSP;
        InteractionSupport_011 a3 = this;
if (a3.e == null) {
            return null;
        }
        a2 = UtilitySupport_477.D((Entity)a2);
        Vec3 vec3 = a3.e.L((Vec3)a2);
        vec3 = ((Vec3)a2).subtract(vec3).normalize();
        Object object = new UtilitySupport_513(a3.H.L(), a3.e.L());
        object = a.L().L((UtilityListener_511)object);
        if (object == null) {
            return null;
        }
        vec3 = ((Vec3)a2).add(vec3.scale(2.0));
        a2 = new AxisAlignedBB(((Vec3)object).xCoord, ((Vec3)a2).yCoord - 2.0, ((Vec3)object).zCoord, vec3.xCoord, ((Vec3)a2).yCoord + 1.0, vec3.zCoord);
        a2 = a.L((AxisAlignedBB)a2);
        if (class_5162.L() < 1.0E-4) {
            return null;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public InteractionSupport_011(InteractionSupport_026 class_026, UtilitySupport_513 class_513) {
        void a;
        InteractionSupport_011 a2;
        UtilitySupport_513 a3 = class_513;
        InteractionSupport_011 class_011 = a2 = this;
        class_011.H = a;
        class_011.e = a3;
    }

    @Generated
    public InteractionSupport_026 L() {
        InteractionSupport_011 a;
return a.H;
    }
}

