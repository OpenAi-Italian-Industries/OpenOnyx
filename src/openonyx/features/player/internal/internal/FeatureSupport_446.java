/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.internal;

import java.util.List;
import net.minecraft.client.Minecraft;
import openonyx.core.OnyxListener_001;
import openonyx.events.ChatTransformer;
import openonyx.events.HypixelUtils;
import openonyx.features.player.internal.internal.FeatureSupport_452;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.internal.NumberSetting;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_477;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class FeatureSupport_446
extends SettingSupport_029
implements OnyxListener_001 {
    final public static FeatureSupport_446 f = new FeatureSupport_446();
    public NumberSetting H;
    public NumberSetting e;

    public boolean L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        FeatureSupport_446 a2 = this;
if (!a2.D() || ((Minecraft)((Object)FeatureSupport_446.e)).thePlayer == null || a == null) {
            return false;
        }
        if (!UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_446.e)).thePlayer)) {
            return 5 >> 3;
        }
        if (!UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_446.e)).thePlayer, (double)a2.e.L())) {
            return 0 != 0;
        }
        if (ProtocolSupport_207.I.I().L(a) > 1.0f) {
            return 1 != 0;
        }
        return false;
    }

    private FeatureSupport_446() {
        FeatureSupport_446 a;
        FeatureSupport_446 class_446 = a;
        super("Clutch", 1 != 0);
        FeatureSupport_446 class_4462 = a;
        class_446.H = new NumberSetting("Clutch speed", 90.0, 1.0, 180.0, 1.0).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/t").L("How fast the aim may move while clutching a fall. Higher lands more placements but looks less like the slow rotation; lower keeps more of the slow rotation at the cost of the odd fall.");
        class_4462.e = new NumberSetting("Clutch distance", 0.2, 0.05, 0.6, 0.01).L("How close to the fall-off edge the aim starts clutching. Larger engages earlier, so the aim is ready before the edge is reached.");
        class_446.L(Setting.H);
    }

    public int L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        FeatureSupport_446 a2 = this;
return (int)Math.ceil(ProtocolSupport_207.I.I().L(a) / Math.max(1.0f, a2.H.L()));
    }

    public ProtocolSupport_209 L(ProtocolSupport_209 class_209) {
        OnyxListener_001 a = class_209;
        FeatureSupport_446 a2 = this;
if (!a2.D()) {
            return a;
        }
        return new ProtocolSupport_209(((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), List.of(new FeatureSupport_452(a2, ((ProtocolSupport_209)a).L())), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L());
    }
}

