/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.Scaffold;
import openonyx.history.SettingSupport_029;
import openonyx.render.internal.RenderSupport_174;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_483;
import openonyx.utilities.UtilitySupport_495;

public class FeatureSupport_436
extends SettingSupport_029
implements OnyxListener_001 {
    private final static double f = 0.075;
    final public static FeatureSupport_436 H = new FeatureSupport_436();
    private final static double e = 0.2;

    private FeatureSupport_436() {
        super("Stabilize movement", 1 != 0);
        FeatureSupport_436 a;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-10)
    private void L(EventSupport_625 class_625) {
        int n;
        boolean bl;
        int n2;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        double d;
        Vec3 vec3;
        void a;
        FeatureSupport_436 class_436 = this;
if (FeatureSupport_436.e.thePlayer == null) {
            return;
        }
        if (a.D() && FeatureSupport_436.e.thePlayer.onGround) {
            return;
        }
        Object a322 = Scaffold.E.L();
        if (a322 == null) {
            return;
        }
        MovementInputState class_478 = a.L();
        Vec3 vec32 = UtilitySupport_477.D((Entity)FeatureSupport_436.e.thePlayer);
        Vec3 vec33 = ((Vec3)(a322 = a322.L(vec32))).subtract(vec32);
        int n3 = vec33.dotProduct(vec3 = UtilitySupport_495.i(UtilitySupport_477.L((Entity)FeatureSupport_436.e.thePlayer), 0.0)) > 0.0 ? 1 : 0;
        double d2 = d = n3 != 0 ? 0.075 : 0.2;
        if (((Vec3)a322).distanceToSqr(vec32) < d2 * d2) {
            return;
        }
        float a322 = UtilitySupport_483.L(((Vec3)a322).subtract(vec32), FeatureSupport_436.e.thePlayer.rotationYaw);
        MovementInputState a322 = UtilitySupport_483.L(MovementInputState.i, a322, 0.0f);
        boolean bl5 = class_478.d() || class_478.I();
        n3 = class_478.D() || class_478.L() ? 1 : 0;
        if (bl5) {
            bl4 = class_478.d();
            bl3 = bl5;
        } else {
            bl4 = a322.d();
            bl3 = bl5;
        }
        if (bl3) {
            bl2 = class_478.I();
            n2 = n3;
        } else {
            bl2 = a322.I();
            n2 = n3;
        }
        if (n2 != 0) {
            bl = class_478.L();
            n = n3;
        } else {
            bl = a322.L();
            n = n3;
        }
        a.L(new MovementInputState(bl4, bl2, bl, n != 0 ? class_478.D() : a322.D()));
    }
}

