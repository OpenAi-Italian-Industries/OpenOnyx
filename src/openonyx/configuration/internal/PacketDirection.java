/*
 * Decompiled with CFR.
 */
package openonyx.configuration.internal;

import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.render.group_k.CrystalEffectSettings;

public final class PacketDirection
extends Enum<PacketDirection> {
    final public static PacketDirection f = new PacketDirection("INCOMING", 0);
    private final static PacketDirection[] H;
    final public static PacketDirection e = new PacketDirection("OUTGOING", 1);

    static {
        H = PacketDirection.L();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PacketDirection() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        PacketDirection enum_613 = this;
    }

    public static PacketDirection valueOf(String a) {
return Enum.valueOf(PacketDirection.class, a);
    }

    public static PacketDirection[] values() {
return (PacketDirection[])H.clone();
    }

    private static PacketDirection[] L() {
PacketDirection[] enum_613Array = new PacketDirection[2];
        enum_613Array[0] = f;
        enum_613Array[1] = e;
        return enum_613Array;
    }
}

