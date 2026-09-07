/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.internal;

import openonyx.core.OnyxListener_001;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.internal.FeatureSupport_446;
import openonyx.features.player.internal.internal.FeatureSupport_451;
import openonyx.features.player.internal.internal.FeatureListener_444;
import openonyx.interaction.internal.PlacementResult;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_477;

public class FeatureSupport_441
implements OnyxListener_001 {
    public FeatureSupport_441() {
        FeatureSupport_441 a;
    }

    /*
     * WARNING - void declaration
     */
    public static FeatureSupport_451 L(PlacementResult class_027, ProtocolSupport_212 class_212, FeatureListener_444 interface_444) {
        void a;
        void a2;
        PlacementResult class_0272 = class_027;
if (UtilitySupport_477.d(FeatureSupport_441.e.thePlayer)) {
            int n;
            int a3 = FeatureSupport_446.f.D() ? FeatureSupport_446.f.L((ProtocolSupport_212)a2) : Scaffold.E.P.L((ProtocolSupport_212)a2);
            int n2 = Scaffold.E.L() <= 0 ? 1 : 0;
            int n3 = n = a3 >= 1 ? 1 : 0;
            if (n2 != 0 || 0 != 0) {
                boolean bl = 0;
                return new FeatureSupport_451(bl, Math.max(1, a3), bl, bl);
            }
        }
        if (a == null) {
            return FeatureSupport_451.e;
        }
        Record a3 = a.L(class_0272, (ProtocolSupport_212)a2);
        if (a3 != null) {
            return a3;
        }
        return FeatureSupport_451.e;
    }
}

