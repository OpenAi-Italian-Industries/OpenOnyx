/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.configuration.internal;

import lombok.Generated;
import openonyx.configuration.Event;
import openonyx.utilities.MovementInputState;

public class EventSupport_622
extends Event {
    private final MovementInputState H;
    private boolean e;

    @Generated
    public MovementInputState L() {
        EventSupport_622 a;
return a.H;
    }

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        EventSupport_622 a2 = this;
a2.e = a;
    }

    @Generated
    public boolean d() {
        EventSupport_622 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public EventSupport_622(MovementInputState class_478, boolean bl) {
        void a;
        EventSupport_622 a2;
        boolean a3 = bl;
        EventSupport_622 class_622 = a2 = this;
        class_622.H = a;
        class_622.e = a3;
    }
}

