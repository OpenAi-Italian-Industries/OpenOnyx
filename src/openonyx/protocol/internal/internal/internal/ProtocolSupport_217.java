/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal.internal.internal;

import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_215;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_216;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ProtocolSupport_217
extends ProtocolSupport_216 {
    /*
     * WARNING - void declaration
     */
    @Override
    public ProtocolSupport_212 L(ProtocolSupport_209 class_209, ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        void a;
        void a2;
        Object a3 = class_209;
        ProtocolSupport_217 a4 = this;
a3 = a4.L((ProtocolSupport_209)a3, (ProtocolSupport_212)a2, (ProtocolSupport_212)a);
        return a2.L((ProtocolSupport_212)a, ((ProtocolSupport_215)a3).L(), ((ProtocolSupport_215)a3).d());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int L(ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        ProtocolSupport_215 class_215;
        void a;
        Object a2 = class_212;
        ProtocolSupport_217 a3 = this;
int n = -1;
        do {
            class_215 = a3.L(null, (ProtocolSupport_212)a2, (ProtocolSupport_212)a);
        } while (!((ProtocolSupport_212)(a2 = ((ProtocolSupport_212)a2).L((ProtocolSupport_212)a, class_215.L(), class_215.d()))).L((ProtocolSupport_212)a) && ++n < 80);
        return 0;
    }

    protected ProtocolSupport_217(String string) {
        String a = string;
        ProtocolSupport_217 a2 = this;
        super(a);
    }

    public abstract ProtocolSupport_215 L(ProtocolSupport_209 var1, ProtocolSupport_212 var2, ProtocolSupport_212 var3);
}

