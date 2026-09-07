/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.configuration.internal;

import lombok.Generated;
import net.minecraft.network.Packet;
import openonyx.configuration.Event;
import openonyx.configuration.internal.PacketDirection;

public class PacketEvent
extends Event {
    private final Packet<?> f;
    private final boolean H;
    private final PacketDirection e;

    @Generated
    public Packet<?> L() {
        PacketEvent a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    public PacketEvent(PacketDirection enum_613, Packet<?> packet, boolean bl) {
        void a;
        void a2;
        PacketEvent a3;
        boolean a4 = bl;
        PacketEvent class_623 = a3 = this;
        a3.e = a2;
        class_623.f = a;
        class_623.H = a4;
    }

    @Generated
    public boolean d() {
        PacketEvent a;
return a.H;
    }

    @Generated
    public PacketDirection L() {
        PacketEvent a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public PacketEvent(PacketDirection enum_613, Packet<?> packet) {
        void a;
        Packet<?> a2 = packet;
        PacketEvent a3 = this;
        a3((PacketDirection)a, a2, 1 != 0);
    }
}

