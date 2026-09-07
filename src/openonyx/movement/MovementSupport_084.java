/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.movement;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_620;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.history.Range;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_479;
import openonyx.utilities.UtilitySupport_483;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MovementSupport_084
implements OnyxListener_001 {
    private float h;
    private boolean l;
    private final static double I = 0.121;
    private float d;
    private boolean i;
    private boolean f;
    private final MovementInputState H;
    public UtilitySupport_479 e;

    @Generated
    public boolean D() {
        MovementSupport_084 a;
return a.i;
    }

    @Generated
    public void D(boolean bl) {
        boolean a = bl;
        MovementSupport_084 a2 = this;
a2.f = a;
    }

    public String toString() {
        MovementSupport_084 a;
return new StringBuilder().insert(0, "SimulatedPlayerInput(forwards={").append(a.e.l()).append("}, backwards={").append(a.e.h()).append("}, left={").append(a.e.I()).append("}, right={").append(a.e.D()).append("}, jumping={").append(a.e.L()).append("}, sprinting=").append(a.l).append(", slowDown=").append(a.e.i()).append(")").toString();
    }

    @Generated
    public float i() {
        MovementSupport_084 a;
return a.h;
    }

    @Generated
    public boolean d() {
        MovementSupport_084 a;
return a.f;
    }

    @Generated
    public boolean L() {
        MovementSupport_084 a;
return a.l;
    }

    @Generated
    public UtilitySupport_479 L() {
        MovementSupport_084 a;
return a.e;
    }

    public float D() {
        MovementSupport_084 a;
return a.h;
    }

    /*
     * WARNING - void declaration
     */
    public MovementSupport_084(MovementInputState class_478, boolean bl, boolean bl2, boolean bl3) {
        void a;
        void a2;
        void a3;
        void a4;
        boolean bl4 = bl3;
        MovementSupport_084 a5 = this;
        a5((MovementInputState)a4, (boolean)a3, (boolean)a2, (boolean)a, 3 >> 2);
    }

    @Generated
    public MovementInputState L() {
        MovementSupport_084 a;
return a.H;
    }

    /*
     * WARNING - void declaration
     */
    public static MovementSupport_084 L(MovementInputState class_478, boolean bl, boolean bl2, boolean bl3) {
        void a;
        void a22;
        boolean a32 = bl2;
        MovementInputState a4 = class_478;
MovementSupport_084 a22 = new MovementSupport_084(a4, (boolean)a22, a32, (boolean)a);
        EventSupport_620 a32 = new EventSupport_620();
        OnyxClient.d.post((Object)a32);
        if (a32.d()) {
            a22.f = 1;
        }
        return a22;
    }

    @Generated
    public void d(boolean bl) {
        boolean a = bl;
        MovementSupport_084 a2 = this;
a2.i = a;
    }

    public float d() {
        MovementSupport_084 a;
return a.d;
    }

    /*
     * WARNING - void declaration
     */
    public MovementSupport_084(MovementInputState class_478, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        void a;
        void a2;
        void a3;
        void a4;
        MovementSupport_084 a5;
        MovementInputState a6 = class_478;
        MovementSupport_084 class_084 = a5 = this;
        a5.H = a6;
        class_084.l = a4;
        class_084.i = a3;
        MovementSupport_084 class_0842 = a5;
        class_084.e = new UtilitySupport_479(a6.d(), a6.I(), a6.L(), a6.D(), (boolean)a2, (boolean)a, (boolean)a4);
    }

    @Generated
    public float L() {
        MovementSupport_084 a;
return a.d;
    }

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        MovementSupport_084 a2 = this;
a2.l = a;
    }

    public static MovementSupport_084 L(MovementInputState a) {
return MovementSupport_084.L(a, (((Minecraft)((Object)MovementSupport_084.e)).thePlayer.movementInput != null && ((Minecraft)((Object)MovementSupport_084.e)).thePlayer.movementInput.jump ? 1 : 0) != 0, ((Minecraft)((Object)MovementSupport_084.e)).thePlayer.isSprinting(), ((Minecraft)((Object)MovementSupport_084.e)).thePlayer.isSneaking());
    }

    public static MovementSupport_084 L(EntityPlayer entityPlayer) {
        boolean bl;
        boolean bl2;
        MovementInputState class_478;
        double d;
        boolean bl3;
        EntityPlayer entityPlayer2 = entityPlayer;
Vec3 a2 = UtilitySupport_477.D(entityPlayer2).subtract(UtilitySupport_477.d(entityPlayer2));
        double d2 = a2.horizontalDistanceSqr();
        boolean bl4 = bl3 = d >= 0.014641 ? 5 >> 2 : false;
        if (d2 > 0.0025000000000000005) {
            float a2 = UtilitySupport_483.L(a2, entityPlayer2.rotationYaw);
            class_478 = UtilitySupport_483.L(MovementInputState.i, MathHelper.wrapAngleTo180_float(a2));
        } else {
            class_478 = MovementInputState.i;
        }
        if (!entityPlayer2.onGround) {
            bl2 = --1 != 0;
            bl = bl3;
        } else {
            bl2 = false;
            bl = bl3;
        }
        return new MovementSupport_084(class_478, bl2, bl, entityPlayer2.isSneaking());
    }

    public void L() {
        MovementSupport_084 class_084;
        float a;
        MovementSupport_084 class_0842;
        float f;
        MovementSupport_084 class_0843 = this;
if (class_0843.e.l() != class_0843.e.h()) {
            f = class_0843.e.l() ? 1.0f : -1.0f;
            class_0842 = class_0843;
        } else {
            f = 0.0f;
            class_0842 = class_0843;
        }
        if (class_0842.e.I() == class_0843.e.D()) {
            a = 0.0f;
            class_084 = class_0843;
        } else if (class_0843.e.I()) {
            a = 1.0f;
            class_084 = class_0843;
        } else {
            a = -1.0f;
            class_084 = class_0843;
        }
        if (class_084.e.i()) {
            a = 0.0f;
            f = (float)((double)f * 0.3);
        }
        class_0843.h = 0;
        class_0843.d = f;
    }
}

