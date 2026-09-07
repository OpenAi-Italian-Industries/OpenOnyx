/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal.internal.internal;

import openonyx.history.ModeOption;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.internal.ProtocolListener_214;

public abstract class ProtocolSupport_216
extends ModeOption
implements ProtocolListener_214 {
    protected ProtocolSupport_216(String string) {
        String a = string;
        ProtocolSupport_216 a2 = this;
        super(a);
    }

    public abstract int L(ProtocolSupport_212 var1, ProtocolSupport_212 var2);
}

