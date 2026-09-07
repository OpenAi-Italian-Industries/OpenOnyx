/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal;

import openonyx.history.SettingListener_035;
import openonyx.render.group_i.RenderSupport_142;
import openonyx.ui.UiSupport_551;

public final class ProtocolMode_213
extends Enum<ProtocolMode_213>
implements SettingListener_035 {
    final public static ProtocolMode_213 I;
    private final String d;
    final public static ProtocolMode_213 i;
    final public static ProtocolMode_213 f;
    final public static ProtocolMode_213 H;
    private final static ProtocolMode_213[] e;

    static {
        H = new ProtocolMode_213("OFF", 0, "Off");
        i = new ProtocolMode_213("STRICT", 1, "Strict");
        f = new ProtocolMode_213("SILENT", 2, "Silent");
        I = new ProtocolMode_213("CHANGE_LOOK", 3, "Change look");
        e = ProtocolMode_213.L();
    }

    public static ProtocolMode_213 valueOf(String a) {
return Enum.valueOf(ProtocolMode_213.class, a);
    }

    @Override
    public String L() {
        ProtocolMode_213 a;
return a.d;
    }

    private static ProtocolMode_213[] L() {
ProtocolMode_213[] enum_213Array = new ProtocolMode_213[4];
        enum_213Array[0] = H;
        enum_213Array[1] = i;
        enum_213Array[2] = f;
        enum_213Array[3] = I;
        return enum_213Array;
    }

    public static ProtocolMode_213[] values() {
return (ProtocolMode_213[])e.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ProtocolMode_213(String string) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        ProtocolMode_213 a = var3_2;
        ProtocolMode_213 a2 = this;
        a2.d = a;
    }
}

