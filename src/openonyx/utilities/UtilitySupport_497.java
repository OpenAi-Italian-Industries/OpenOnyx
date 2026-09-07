/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.utilities;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.EventSupport_610;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.utilities.UtilitySupport_484;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UtilitySupport_497
implements OnyxListener_001 {
    private int f;
    private UtilitySupport_484 H;
    final public static UtilitySupport_497 e = new UtilitySupport_497();

    private int D() {
if (((Minecraft)((Object)UtilitySupport_497.e)).thePlayer == null) {
            return 0;
        }
        return ((Minecraft)((Object)UtilitySupport_497.e)).thePlayer.inventory.currentItem;
    }

    public int d() {
        UtilitySupport_497 a;
if (a.H != null) {
            return a.H.i;
        }
        return a.D();
    }

    public boolean L(Object object) {
        Object a = object;
        UtilitySupport_497 a2 = this;
if (a2.H != null && a2.H.H == a) {
            return --1 != 0;
        }
        return false;
    }

    public int L() {
        UtilitySupport_497 a;
if (a.H != null) {
            return a.H.e;
        }
        return a.D();
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(Object object, int n, int n2) {
        void a;
        void a2;
        int a3 = 0;
        UtilitySupport_497 a4 = this;
if (!UtilitySupport_497.L(a3)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, "Invalid hotbar slot: ").append(a3).toString());
        }
        EventSupport_610 class_610 = new EventSupport_610(a2, a3);
        OnyxClient.d.post((Object)class_610);
        if (class_610.L()) {
            return 0 != 0;
        }
        a4.H = new UtilitySupport_484(a3, a2, 0, a4.d());
        a4.f = 0;
        return 5 >> 2;
    }

    private UtilitySupport_497() {
        UtilitySupport_497 a;
    }

    public boolean L() {
        UtilitySupport_497 a;
if (a.H != null) {
            return 1 != 0;
        }
        return false;
    }

    public void L(Object object) {
        Object a = object;
        UtilitySupport_497 a2 = this;
if (a2.H != null && a2.H.H == a) {
            a2.H = null;
        }
    }

    @EventHandler
    public void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        UtilitySupport_497 a2 = this;
UtilitySupport_497 class_497 = a2;
        class_497.H = null;
        class_497.f = 0;
    }

    @EventHandler(priority=1001)
    public void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        UtilitySupport_497 a2 = this;
if (a2.H == null) {
            return;
        }
        UtilitySupport_497 class_497 = a2;
        if (class_497.f >= class_497.H.f) {
            a2.H = null;
            return;
        }
        a2.f += 1;
    }

    public static boolean L(int a) {
if (0 >= 0 && 0 < 9) {
            return 5 >> 2;
        }
        return false;
    }
}

