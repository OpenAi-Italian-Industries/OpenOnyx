/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_d;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.core.OnyxListener_001;
import openonyx.history.Range;
import openonyx.history.ModeOption;
import openonyx.utilities.UtilitySupport_477;

public class FeatureSupport_422
extends ModeOption
implements OnyxListener_001 {
    final public static FeatureSupport_422 H = new FeatureSupport_422();
    private final static float e = 0.8f;

    private FeatureSupport_422() {
        super("Watchdog");
        FeatureSupport_422 a;
    }

    @EventHandler
    private void L(TickEndEvent class_626) {
        TickEndEvent a = class_626;
        FeatureSupport_422 a2 = this;
if (FeatureSupport_422.e.thePlayer == null) {
            return;
        }
        if (!FeatureSupport_422.e.gameSettings.keyBindJump.isKeyDown()) {
            return;
        }
        if (FeatureSupport_422.e.thePlayer.onGround && !FeatureSupport_422.l()) {
            FeatureSupport_422.e.thePlayer.jump();
        }
        if (UtilitySupport_477.L((Entity)FeatureSupport_422.e.thePlayer) != 0.0) {
            return;
        }
        switch (UtilitySupport_477.L(FeatureSupport_422.e.thePlayer)) {
            case 4: {
                while (false) {
                }
                FeatureSupport_422.e.thePlayer.motionY -= 0.03;
                return;
            }
            case 5: {
                FeatureSupport_422.e.thePlayer.motionY -= 0.5;
                return;
            }
        }
    }

    private static boolean l() {
return Math.abs(FeatureSupport_422.e.thePlayer.moveForward) >= 0.8f || Math.abs(FeatureSupport_422.e.thePlayer.moveStrafing) >= 0.8f;
    }
}

