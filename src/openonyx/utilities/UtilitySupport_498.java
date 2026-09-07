/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import openonyx.core.OnyxListener_001;

public class UtilitySupport_498
implements OnyxListener_001 {
    private final List<Packet> e;

    public void L() {
        UtilitySupport_498 a;
if (a.e.isEmpty() || ((Minecraft)((Object)e)).getNetHandler() == null) {
            return;
        }
        ((Minecraft)((Object)e)).getNetHandler().getNetworkManager().sendGrouped(a.e);
        a.e.clear();
    }

    public UtilitySupport_498 L(Packet packet) {
        Packet a = packet;
        UtilitySupport_498 a2 = this;
if (a != null) {
            a2.e.add(a);
        }
        return a2;
    }

    public UtilitySupport_498() {
        UtilitySupport_498 a;
        UtilitySupport_498 class_498 = a;
        class_498.e = new ArrayList<Packet>();
    }
}

