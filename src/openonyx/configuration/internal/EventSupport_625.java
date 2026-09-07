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

public class EventSupport_625
extends Event {
    private boolean f;
    private boolean H;
    private MovementInputState e;

    @Generated
    public void d(boolean bl) {
        boolean a = bl;
        EventSupport_625 a2 = this;
a2.f = a;
    }

    /*
     * WARNING - void declaration
     */
    public EventSupport_625(MovementInputState class_478, boolean bl, boolean bl2) {
        void a;
        void a2;
        EventSupport_625 a3;
        boolean a4 = bl2;
        EventSupport_625 class_625 = a3 = this;
        a3.e = a2;
        class_625.H = a;
        class_625.f = a4;
    }

    @Generated
    public boolean D() {
        EventSupport_625 a;
return a.H;
    }

    @Generated
    public MovementInputState L() {
        EventSupport_625 a;
return a.e;
    }

    @Generated
    public void L(MovementInputState class_478) {
        MovementInputState a = class_478;
        EventSupport_625 a2 = this;
a2.e = a;
    }

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        EventSupport_625 a2 = this;
a2.H = a;
    }

    @Generated
    public boolean d() {
        EventSupport_625 a;
return a.f;
    }
}

