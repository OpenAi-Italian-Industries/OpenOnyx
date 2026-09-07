/*
 * Decompiled with CFR.
 */
package openonyx.protocol;

import java.util.List;
import net.minecraft.entity.Entity;
import openonyx.history.SettingSupport_036;
import openonyx.history.ModeSetting;
import openonyx.history.ModeOption;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.movement.MovementSupport_088;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.ProtocolMode_213;
import openonyx.protocol.internal.internal.ProtocolListener_214;
import openonyx.protocol.internal.internal.internal.ProtocolSupport_216;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_220;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_222;
import openonyx.protocol.internal.internal.internal.internal.ProtocolSupport_225;
import openonyx.ui.UiSupport_551;
import openonyx.utilities.UtilitySupport_500;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ProtocolSupport_208
extends SettingSupport_036 {
    private final ModeSetting<ProtocolSupport_216> i;
    private final EnumSetting<ProtocolMode_213> f;
    private final NumberSetting H;
    private final NumberSetting e;

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_208(ProtocolMode_213 enum_213) {
        void a;
        ProtocolSupport_208 class_208 = this;
        super("Rotations");
        SettingSupport_036 a2 = new ProtocolSupport_222();
        ProtocolSupport_208 class_2082 = class_208;
        ModeOption[] class_041Array = new ProtocolSupport_216[3];
        class_041Array[0] = a2;
        class_041Array[1] = new ProtocolSupport_225();
        class_041Array[2] = new ProtocolSupport_220();
        class_2082.i = new ModeSetting("Angle smooth", (ModeOption)a2, class_041Array);
        ProtocolSupport_208 class_2083 = class_208;
        class_2083.f = new EnumSetting<void>("Movement correction", a);
        class_2083.H = new NumberSetting("Reset threshold", 2.0, 1.0, 180.0, 1.0).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°").L("How close the aim has to get to your real look while easing back before control snaps to you");
        class_2083.e = new NumberSetting("Ticks until reset", 5.0, 1.0, 30.0, 1.0).d(" ticks").L("How long the last aim is held after the module stops updating it, before it eases back");
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_209 L(ProtocolSupport_212 class_212, Entity entity, boolean bl, UtilitySupport_500 class_500) {
        void a;
        void a2;
        void a3;
        void a4;
        ProtocolSupport_208 class_208 = this;
List<ProtocolListener_214> a5 = List.of((ProtocolListener_214)class_208.i.L());
        return new ProtocolSupport_209((ProtocolSupport_212)a4, (Entity)a3, a5, (int)Math.round((Double)class_208.e.L()), ((Double)class_208.H.L()).floatValue(), (boolean)a2, (ProtocolMode_213)class_208.f.L(), (UtilitySupport_500)a);
    }

    public ProtocolSupport_208() {
        a(ProtocolMode_213.f);
        ProtocolSupport_208 a;
    }

    public int L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        ProtocolSupport_208 a2 = this;
return a2.i.L().L(ProtocolSupport_207.I.I(), a);
    }

    public ProtocolSupport_209 L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        ProtocolSupport_208 a2 = this;
return a2.L(a, null, 0 != 0, null);
    }

    public ProtocolMode_213 L() {
        ProtocolSupport_208 a;
return (ProtocolMode_213)a.f.L();
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_209 L(ProtocolSupport_212 class_212, boolean bl) {
        void a;
        boolean a2 = bl;
        ProtocolSupport_208 a3 = this;
return a3.L((ProtocolSupport_212)a, null, a2, null);
    }
}

