/*
 * Decompiled with CFR.
 */
package openonyx.protocol.group_m;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ProtocolSupport_211
extends Record {
    private final float H;
    private final float e;

    @Override
    public final int hashCode() {
        ProtocolSupport_211 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ProtocolSupport_211.class, "deltaYaw;deltaPitch", "H", "e"}, a);
    }

    public float D() {
        ProtocolSupport_211 a;
return a.e;
    }

    @Override
    public final String toString() {
        ProtocolSupport_211 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{ProtocolSupport_211.class, "deltaYaw;deltaPitch", "H", "e"}, a);
    }

    public float d() {
        ProtocolSupport_211 a;
return a.H;
    }

    public float L() {
        ProtocolSupport_211 a;
return (float)Math.hypot(a.H, a.e);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_211(float f2, float f3) {
        void a;
        ProtocolSupport_211 a2;
        float a3 = f3;
        ProtocolSupport_211 class_211 = a2 = this;
        class_211.H = a;
        class_211.e = a3;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        ProtocolSupport_211 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ProtocolSupport_211.class, "deltaYaw;deltaPitch", "H", "e"}, a2, a);
    }
}

