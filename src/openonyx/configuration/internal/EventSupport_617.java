/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.configuration.internal;

import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import openonyx.configuration.Event;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EventSupport_617
extends Event {
    private final EntityPlayer H;
    private final Entity e;

    @Generated
    public Entity L() {
        EventSupport_617 a;
return a.e;
    }

    @Generated
    public EntityPlayer L() {
        EventSupport_617 a;
return a.H;
    }

    /*
     * WARNING - void declaration
     */
    public EventSupport_617(EntityPlayer entityPlayer, Entity entity) {
        void a;
        EventSupport_617 a2;
        Entity a3 = entity;
        EventSupport_617 class_617 = a2 = this;
        class_617.H = a;
        class_617.e = a3;
    }
}

