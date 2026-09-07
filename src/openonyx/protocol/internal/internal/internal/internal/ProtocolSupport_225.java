/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal.internal.internal.internal;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import openonyx.history.internal.RangeSetting;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_d.ProtocolSupport_210;
import openonyx.protocol.group_m.ProtocolSupport_211;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_215;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_216;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_218;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_219;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_221;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_223;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_224;
import openonyx.theme.internal.ThemeSupport_063;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_493;

public class ProtocolSupport_225
extends ProtocolSupport_216 {
    private final ProtocolSupport_218 I;
    private final RangeSetting d;
    private final RangeSetting i;
    private final ProtocolSupport_219 f;
    private final ProtocolSupport_224 H;
    private final ProtocolSupport_221 e;

    /*
     * WARNING - void declaration
     */
    private ProtocolSupport_215 L(ProtocolSupport_211 class_211, ProtocolSupport_211 class_2112, boolean bl, double d) {
        void a;
        ProtocolSupport_225 class_225;
        float f2;
        ProtocolSupport_225 class_2252;
        float f3;
        void a32;
        void a42;
        boolean a22 = bl;
        ProtocolSupport_225 a5 = this;
float f4 = a5.f.D() ? a5.f.L(a42.L()) : 1.0f;
        int n = a5.H.D() && a22 ? 1 : 0;
        float a22 = (float)((Double)a5.H.f.L() * a32);
        if (a5.e.D()) {
            f3 = ((Double)a5.e.H.L()).floatValue();
            class_2252 = a5;
        } else {
            f3 = 0.0f;
            class_2252 = a5;
        }
        ProtocolSupport_223 a32 = new ProtocolSupport_223(f3, class_2252.I.D() ? ((Double)a5.I.H.L()).floatValue() : 0.0f);
        if (a5.e.D()) {
            f2 = ((Double)a5.e.e.L()).floatValue();
            class_225 = a5;
        } else {
            f2 = 0.0f;
            class_225 = a5;
        }
        ProtocolSupport_223 class_223 = new ProtocolSupport_223(f2, class_225.I.D() ? ((Double)a5.I.e.L()).floatValue() : 0.0f);
        ProtocolSupport_225 class_2253 = a5;
        RangeSetting class_045 = n != 0 ? class_2253.H.H : class_2253.i;
        ProtocolSupport_225 class_2254 = a5;
        RangeSetting class_0452 = n != 0 ? class_2254.H.e : class_2254.d;
        ProtocolSupport_225 class_2255 = a5;
        float a42 = class_2255.L(a42.d(), a.d(), -class_045.L() + a22, class_045.L() + a22, f4);
        a22 = class_2255.L(a42.D(), a.D(), -class_0452.L() + a22, class_0452.L() + a22, f4);
        return new ProtocolSupport_215(a.d() + a42 + a32.L(a42), a.D() + a22 + class_223.L(a22));
    }

    public ProtocolSupport_225() {
        ProtocolSupport_225 a;
        ProtocolSupport_225 class_225 = a;
        ProtocolSupport_225 class_2252 = a;
        super("Acceleration");
        class_2252.i = RangeSetting.L("Yaw acceleration", 20.0, 25.0, 1.0, 180.0).L("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/tÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â²");
        class_2252.d = RangeSetting.L("Pitch acceleration", 20.0, 25.0, 1.0, 180.0).L("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/tÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â²");
        ProtocolSupport_225 class_2253 = a;
        class_225.e = new ProtocolSupport_221();
        class_2253.I = new ProtocolSupport_218();
        class_225.H = new ProtocolSupport_224();
        class_225.f = new ProtocolSupport_219();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ProtocolSupport_212 L(ProtocolSupport_209 class_209, ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        ProtocolSupport_211 a;
        void a2;
        Object a3 = class_209;
        ProtocolSupport_225 a4 = this;
Record record = ProtocolSupport_207.I.L();
        if (record == null) {
            record = UtilitySupport_477.d((Entity)((Minecraft)((Object)ProtocolSupport_225.e)).thePlayer);
        }
        record = record.L((ProtocolSupport_212)a2);
        a = a2.L((ProtocolSupport_212)((Object)a));
        double d = (a3 = ((ProtocolSupport_209)a3).L()) != null ? UtilitySupport_477.d(((Minecraft)((Object)ProtocolSupport_225.e)).thePlayer, (Entity)a3) : 0.0;
        int n = a3 != null && UtilitySupport_493.L((Entity)a3, Math.max(3.0, d), (ProtocolSupport_212)a2) != null ? 1 : 0;
        a3 = a4.L((ProtocolSupport_211)record, a, 0 != 0, d);
        return new ProtocolSupport_212(a2.L() + ((ProtocolSupport_215)a3).L(), a2.i() + ((ProtocolSupport_215)a3).d());
    }

    @Override
    public int L(ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        ProtocolSupport_215 a;
        Object a2 = class_212;
        ProtocolSupport_225 a3 = this;
Record record = ProtocolSupport_207.I.L();
        if (record == null) {
            record = UtilitySupport_477.d((Entity)((Minecraft)((Object)ProtocolSupport_225.e)).thePlayer);
        }
        record = record.L((ProtocolSupport_212)a2);
        if (ProtocolSupport_225.L(((ProtocolSupport_211)(a2 = ((ProtocolSupport_212)a2).L((ProtocolSupport_212)((Object)a)))).d(), 0.0f) && ProtocolSupport_225.L(((ProtocolSupport_211)a2).D(), 0.0f)) {
            return 0;
        }
        a = a3.L((ProtocolSupport_211)record, (ProtocolSupport_211)a2, 0 != 0, 0.0);
        if (ProtocolSupport_225.L(a.L(), 0.0f) && ProtocolSupport_225.L(a.d(), 0.0f) || Math.abs(((ProtocolSupport_211)a2).d()) < Math.abs(a.L()) && Math.abs(((ProtocolSupport_211)a2).D()) < Math.abs(a.d())) {
            return 0;
        }
        Object object = a2;
        double d = Math.floor(Math.abs(((ProtocolSupport_211)object).d()) / Math.abs(a.L()));
        double d2 = Math.floor(Math.abs(((ProtocolSupport_211)object).D()) / Math.abs(a.d()));
        if (Double.isNaN(d) || Double.isNaN(d2)) {
            return 0;
        }
        return (int)Math.max(d, d2);
    }

    /*
     * WARNING - void declaration
     */
    private float L(float f2, float f3, float f4, float f5, float f6) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f7 = f6;
        ProtocolSupport_225 a6 = this;
return ProtocolSupport_210.L(ProtocolSupport_210.L((float)a5, (float)a4), (float)a3, 0.0f) * a;
    }

    private static boolean L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
if (Math.abs(a - a2) < 1.0E-5f) {
            return 1 != 0;
        }
        return false;
    }
}

