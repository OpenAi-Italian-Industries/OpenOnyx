/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal.internal.internal.internal;

import openonyx.core.OnyxListener_001;
import openonyx.history.internal.RangeSetting;
import openonyx.input.InputSupport_002;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_215;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_217;
import openonyx.render.RenderSupport_099;

public class ProtocolSupport_222
extends ProtocolSupport_217 {
    private final RangeSetting H;
    private final RangeSetting e;

    public ProtocolSupport_222() {
        a(180.0f, 180.0f, 180.0f, 180.0f);
        ProtocolSupport_222 a;
    }

    @Override
    public ProtocolSupport_215 L(ProtocolSupport_209 class_209, ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        OnyxListener_001 a = class_209;
        ProtocolSupport_222 a2 = this;
if (a != null) {
            return new ProtocolSupport_215(a2.H.L(), a2.e.L());
        }
        return new ProtocolSupport_215(a2.H.d(), a2.e.d());
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_222(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        ProtocolSupport_222 a5;
        float f6 = f5;
        ProtocolSupport_222 class_222 = a5 = this;
        super("Linear");
        class_222.H = RangeSetting.L("Horizontal turn speed", (double)a4, (double)a3, 0.0, 180.0).L("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/t");
        class_222.e = RangeSetting.L("Vertical turn speed", (double)a2, 0.0, 0.0, 180.0).L("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/t");
    }
}

