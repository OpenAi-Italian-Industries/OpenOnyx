/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.utilities;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import openonyx.configuration.Event;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.PacketEvent;

public final class UtilitySupport_494 {
    private boolean H;
    final public static UtilitySupport_494 e = new UtilitySupport_494();

    private UtilitySupport_494() {
        UtilitySupport_494 a;
    }

    public boolean L() {
        UtilitySupport_494 a;
return Minecraft.getMinecraft().currentScreen instanceof GuiInventory || a.H;
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=-1000)
    private void L(PacketEvent class_623) {
        Packet<?> a = class_623;
        UtilitySupport_494 a2 = this;
if (((Event)((Object)a)).L()) {
            return;
        }
        Packet<?> packet = ((PacketEvent)((Object)a)).L();
        Objects.requireNonNull(packet);
        a = packet;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{C0EPacketClickWindow.class, C0DPacketCloseWindow.class, S2EPacketCloseWindow.class, S2DPacketOpenWindow.class}, a, 0)) {
            case 0: {
                if (((C0EPacketClickWindow)a).getWindowId() != 0) break;
                a2.H = 1;
                return;
            }
            case 1: {
                C0DPacketCloseWindow cfr_ignored_0 = (C0DPacketCloseWindow)a;
                a2.H = 0;
                return;
            }
            case 2: {
                S2EPacketCloseWindow cfr_ignored_1 = (S2EPacketCloseWindow)a;
                a2.H = 0;
                return;
            }
            case 3: {
                S2DPacketOpenWindow cfr_ignored_2 = (S2DPacketOpenWindow)a;
                a2.H = 0;
                return;
            }
        }
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        UtilitySupport_494 a2 = this;
a2.H = 0;
    }
}

