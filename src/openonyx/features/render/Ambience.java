/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import openonyx.configuration.internal.EventSupport_619;
import openonyx.configuration.internal.PacketEvent;
import openonyx.configuration.internal.PacketDirection;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_265;
import openonyx.features.render.FeatureSupport_306;
import openonyx.history.SettingValue;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.internal.RenderSupport_175;
import openonyx.theme.internal.ThemeSupport_063;

public final class Ambience
extends Module {
    public BooleanSetting d;
    public FeatureSupport_306 i;
    public FeatureSupport_265 f;
    private volatile S03PacketTimeUpdate H;
    public NumberSetting e;

    @EventHandler
    private void L(EventSupport_619 class_619) {
        EventSupport_619 a = class_619;
        Ambience a2 = this;
if (((Minecraft)((Object)Ambience.e)).theWorld == null) {
            return;
        }
        if (a2.d.d()) {
            ((Minecraft)((Object)Ambience.e)).theWorld.setWorldTime(a2.e.d());
            return;
        }
        a2.h();
    }

    public Ambience() {
        super("Ambience", "Cinematic world lighting and color grading", ModuleCategory.f);
        Ambience a;
        Ambience class_321 = a;
        a.d = new BooleanSetting("Time lock", 0 != 0).L("Locks the client-side time of day without changing server time");
        class_321.e = ((NumberSetting)new NumberSetting("Time", 6000.0, 0.0, 24000.0, 100.0).d(" ticks").L("World time to display (0 = sunrise, 6000 = noon, 18000 = midnight)")).L((SettingValue)a.d);
        a.i = new FeatureSupport_306(a);
        a.f = new FeatureSupport_265(a);
    }

    @Override
    protected void D() {
        Ambience a;
a.h();
    }

    private void h() {
        Ambience class_321 = this;
S03PacketTimeUpdate a = class_321.H;
        class_321.H = null;
        if (a != null && ((Minecraft)((Object)Ambience.e)).theWorld != null) {
            ((Minecraft)((Object)Ambience.e)).theWorld.setTotalWorldTime(a.getTotalWorldTime());
            ((Minecraft)((Object)Ambience.e)).theWorld.setWorldTime(a.getWorldTime());
        }
    }

    public boolean I() {
        Ambience a;
return a.d() && (a.i.D() || a.f.D());
    }

    @EventHandler
    private void L(PacketEvent class_623) {
        PacketEvent a = class_623;
        Ambience a2 = this;
if (a.L() != PacketDirection.f) {
            return;
        }
        if (a.L()) {
            return;
        }
        if (!a2.d.d()) {
            return;
        }
        Packet<?> packet = a.L();
        if (packet instanceof S03PacketTimeUpdate) {
            S03PacketTimeUpdate s03PacketTimeUpdate;
            a2.H = s03PacketTimeUpdate = (S03PacketTimeUpdate)packet;
            a.L();
        }
    }

    @Override
    protected void L() {
a.H = null;
    }
}

