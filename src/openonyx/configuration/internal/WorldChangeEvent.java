/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.configuration.internal;

import lombok.Generated;
import net.minecraft.client.multiplayer.WorldClient;
import openonyx.configuration.Event;

public class WorldChangeEvent
extends Event {
    private final WorldClient e;

    public WorldChangeEvent(WorldClient worldClient) {
        WorldClient a = worldClient;
        WorldChangeEvent a2 = this;
        a2.e = a;
    }

    @Generated
    public WorldClient L() {
        WorldChangeEvent a;
return a.e;
    }
}

