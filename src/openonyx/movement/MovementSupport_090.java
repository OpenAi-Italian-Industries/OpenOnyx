/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.movement;

import lombok.Generated;
import net.minecraft.util.Vec3;
import openonyx.movement.MovementSupport_083;
import openonyx.movement.MovementListener_085;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MovementSupport_090
implements MovementListener_085 {
    private int H;
    private final MovementSupport_083 e;

    public MovementSupport_090(MovementSupport_083 class_083) {
        MovementSupport_083 a = class_083;
        MovementSupport_090 a2 = this;
        a2.e = a;
    }

    @Generated
    public int L() {
        MovementSupport_090 a;
return a.H;
    }

    @Override
    public Vec3 L() {
        MovementSupport_090 a;
MovementSupport_090 class_090 = a;
        return class_090.e.L(class_090.H).d();
    }

    @Override
    public void L() {
a.H += 1;
    }

    @Generated
    public MovementSupport_083 L() {
        MovementSupport_090 a;
return a.e;
    }
}

