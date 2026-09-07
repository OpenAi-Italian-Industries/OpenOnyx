/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.movement;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.movement.MovementSupport_083;
import openonyx.movement.MovementSupport_084;
import openonyx.movement.MovementSupport_086;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;

public final class MovementSupport_092
implements OnyxListener_001 {
    private MovementSupport_083 f;
    final public static MovementSupport_092 H = new MovementSupport_092();
    private final Map<EntityPlayer, MovementSupport_083> e;

    @EventHandler(priority=-10)
    private void D(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        MovementSupport_092 a2 = this;
a2.L(a.L(), 5 >> 2);
    }

    public MovementSupport_083 L() {
        MovementSupport_092 class_092 = this;
Object a = class_092.f;
        if (a != null) {
            return a;
        }
        a = MovementSupport_086.L(MovementSupport_084.L(UtilitySupport_477.L(((Minecraft)((Object)MovementSupport_092.e)).thePlayer)));
        class_092.f = a = new MovementSupport_083((MovementSupport_086)a);
        return class_092.f;
    }

    @EventHandler(priority=1000)
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        MovementSupport_092 a2 = this;
a2.e.clear();
    }

    /*
     * WARNING - void declaration
     */
    private void L(MovementInputState class_478, boolean bl) {
        void a;
        Object a2 = class_478;
        MovementSupport_092 a3 = this;
if (((Minecraft)((Object)MovementSupport_092.e)).thePlayer == null) {
            return;
        }
        if (a != false && a3.f != null && a3.f.L().L().L().equals(a2)) {
            return;
        }
        a2 = MovementSupport_086.L(MovementSupport_084.L((MovementInputState)a2));
        MovementSupport_092 class_092 = a3;
        class_092.f = new MovementSupport_083((MovementSupport_086)a2);
    }

    public MovementSupport_083 d(EntityPlayer entityPlayer) {
        EntityPlayer a2 = entityPlayer;
        MovementSupport_092 a3 = this;
return a3.e.computeIfAbsent(a2, a -> {
EntityPlayer entityPlayer = a;
            return new MovementSupport_083(MovementSupport_086.L(entityPlayer, MovementSupport_084.L(entityPlayer)));
        });
    }

    @EventHandler(priority=500)
    private void d(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        MovementSupport_092 a2 = this;
a2.f = null;
        a2.L(a.L(), 3 >> 2);
    }

    @EventHandler
    private void L(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        MovementSupport_092 a2 = this;
a2.L(a.L(), 1 != 0);
    }

    private MovementSupport_092() {
        MovementSupport_092 a;
        MovementSupport_092 class_092 = a;
        class_092.e = new ConcurrentHashMap<EntityPlayer, MovementSupport_083>();
    }
}

