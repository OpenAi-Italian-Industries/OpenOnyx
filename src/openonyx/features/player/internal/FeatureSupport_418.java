/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal;

import java.util.List;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.features.player.internal.FeatureSupport_421;
import openonyx.history.Setting;
import openonyx.history.Range;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.protocol.ProtocolSupport_208;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.render.group_g.RenderSupport_137;

public class FeatureSupport_418
extends ProtocolSupport_208 {
    public BooleanSetting f;
    private final transient FeatureSupport_419 H;
    public NumberSetting e;

    public ProtocolSupport_209 L(ProtocolSupport_209 class_209) {
        OnyxListener_001 a = class_209;
        FeatureSupport_418 a2 = this;
if ((Double)a2.e.L() <= 0.0) {
            return a;
        }
        return new ProtocolSupport_209(((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), List.of(new FeatureSupport_421(a2, ((ProtocolSupport_209)a).L())), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L(), ((ProtocolSupport_209)a).L());
    }

    public FeatureSupport_418() {
        FeatureSupport_418 a;
        FeatureSupport_418 class_418 = a;
        a.f = new BooleanSetting("Consider inventory", 3 >> 2).L(Setting.H);
        class_418.e = new NumberSetting("Rotation variance", 0.3, 0.0, 3.0, 0.05).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°").L("Wobbles the sent yaw by a mouse step or two each tick so no two placements go out with the same yaw (Grim DuplicateRotPlace). 0 turns it off.");
        a.H = new FeatureSupport_419();
    }
}

