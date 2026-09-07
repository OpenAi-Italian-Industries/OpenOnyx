/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;
import openonyx.configuration.internal.EventSupport_620;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.BlockPlacementContext;

public class FeatureSupport_440
extends SettingSupport_029
implements OnyxListener_001 {
    final public static FeatureSupport_440 e = new FeatureSupport_440();

    private FeatureSupport_440() {
        FeatureSupport_440 a;
        FeatureSupport_440 class_440 = a;
        super("Down", 0 != 0);
        class_440.L(Setting.H);
    }

    public static boolean l() {
if (((Minecraft)((Object)FeatureSupport_440.e)).thePlayer == null) {
            return 0 != 0;
        }
        if (FeatureSupport_440.h()) {
            int n = 0;
            if (BlockUtils.L(new BlockPos(((Minecraft)((Object)FeatureSupport_440.e)).thePlayer).add(n, -2, n))) {
                return 1 != 0;
            }
        }
        return false;
    }

    public static boolean h() {
if (e.D() && ((Minecraft)((Object)FeatureSupport_440.e)).gameSettings.keyBindSneak.isKeyDown()) {
            return 5 >> 2;
        }
        return false;
    }

    @EventHandler(priority=-100)
    private void L(EventSupport_620 class_620) {
        EventSupport_620 a = class_620;
        FeatureSupport_440 a2 = this;
if (FeatureSupport_440.l()) {
            a.L(5 >> 3);
        }
    }

    @EventHandler(priority=-100)
    private void L(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        FeatureSupport_440 a2 = this;
if (FeatureSupport_440.l()) {
            a.d(0 != 0);
        }
    }
}

