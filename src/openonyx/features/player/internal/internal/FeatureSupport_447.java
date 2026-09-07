/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.core.OnyxListener_001;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.internal.RenderSupport_175;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_495;

public class FeatureSupport_447
extends SettingSupport_029
implements OnyxListener_001 {
    private transient int d;
    public BooleanSetting i;
    public NumberSetting f;
    final public static FeatureSupport_447 H = new FeatureSupport_447();
    public BooleanSetting e;

    @EventHandler
    private void L(EventSupport_609 class_609) {
        FeatureSupport_447 class_447;
        Object a = class_609;
        FeatureSupport_447 a2 = this;
if (((Minecraft)((Object)FeatureSupport_447.e)).thePlayer == null) {
            return;
        }
        if (UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_447.e)).thePlayer)) {
            a2.d += 1;
            class_447 = a2;
        } else {
            a2.d = 0;
            class_447 = a2;
        }
        if (((Boolean)class_447.e.L()).booleanValue() && !((Minecraft)((Object)FeatureSupport_447.e)).thePlayer.onGround) {
            return;
        }
        if (((Boolean)a2.i.L()).booleanValue()) {
            double d = 0.207;
            a = ((Minecraft)((Object)FeatureSupport_447.e)).thePlayer.getActivePotionEffect(Potion.moveSpeed);
            if ((a != null ? ((PotionEffect)a).getAmplifier() : -1) >= 0) {
                d = 0.295;
            }
            if (((Minecraft)((Object)FeatureSupport_447.e)).thePlayer.ticksExisted % 20 == 0 || a2.d <= 7) {
                d = 0.09800000190734863;
            }
            UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_447.e)).thePlayer, UtilitySupport_477.L(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_447.e)).thePlayer), 0.0));
            return;
        }
        UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_447.e)).thePlayer, UtilitySupport_477.L(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_447.e)).thePlayer), (double)a2.f.L()));
    }

    @Override
    protected void d() {
        FeatureSupport_447 a;
if (!((Boolean)a.i.L()).booleanValue() || ((Minecraft)((Object)FeatureSupport_447.e)).thePlayer == null) {
            return;
        }
        UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_447.e)).thePlayer, UtilitySupport_495.d(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_447.e)).thePlayer), 0.5, 1.0, 0.5));
    }

    @Override
    protected void D() {
a.d = 0;
    }

    private FeatureSupport_447() {
        FeatureSupport_447 a;
        FeatureSupport_447 class_447 = a;
        super("Strafe", 5 >> 3);
        FeatureSupport_447 class_4472 = a;
        class_447.f = new NumberSetting("Speed", 0.247, 0.0, 5.0, 0.001);
        class_4472.i = new BooleanSetting("Hypixel", 0 != 0);
        class_447.e = new BooleanSetting("Only on ground", 3 >> 2);
        class_447.L(Setting.H);
    }
}

