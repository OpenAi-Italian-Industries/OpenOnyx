/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal.internal.internal.internal;

import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.input.InputSupport_003;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_d.ProtocolSupport_210;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_215;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_217;
import openonyx.utilities.UtilitySupport_476;

public class ProtocolSupport_220
extends ProtocolSupport_217 {
    private final RangeSetting i;
    private final RangeSetting f;
    private final NumberSetting H;
    private final NumberSetting e;

    /*
     * WARNING - void declaration
     */
    private float L(float f2, float f3) {
        void a;
        float a2 = f3;
        ProtocolSupport_220 a3 = this;
double d = (double)(a / 120.0f);
        return ProtocolSupport_210.L((float)(1.0 / (1.0 + Math.exp(-((Double)a3.H.L()).doubleValue() * (d - (Double)a3.e.L()))) * 4.0), 0.0f, 180.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ProtocolSupport_215 L(ProtocolSupport_209 class_209, ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        float a3;
        float a22;
        void a22;
        ProtocolSupport_212 a3 = class_2122;
        ProtocolSupport_220 a4 = this;
float a5 = a22.L(a3);
        ProtocolSupport_220 class_220 = a4;
        if (a5 != null) {
            a22 = class_220.i.L();
            a3 = a4.f.L();
        } else {
            a22 = class_220.i.d();
            a3 = a4.f.d();
        }
        return new ProtocolSupport_215(a4.L(a5, a22), a4.L(a5, a3));
    }

    public ProtocolSupport_220() {
        ProtocolSupport_220 a;
        ProtocolSupport_220 class_220 = a;
        super("Sigmoid");
        class_220.i = RangeSetting.L("Horizontal turn speed", 180.0, 180.0, 0.0, 180.0).L("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/t");
        class_220.f = RangeSetting.L("Vertical turn speed", 180.0, 180.0, 0.0, 180.0).L("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/t");
        ProtocolSupport_220 class_2202 = a;
        class_220.H = new NumberSetting("Slowdown sharpness", 10.0, 0.0, 20.0, 0.1).L("How abruptly the aim shifts between slow (near the target) and full speed (far from it)");
        class_2202.e = new NumberSetting("Half speed distance", 0.3, 0.0, 1.0, 0.01).L("Fraction of a 120ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â° turn left to the target at which the aim moves at half speed");
    }
}

