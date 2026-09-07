/*
 * Decompiled with CFR.
 */
package openonyx.protocol.internal.internal.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ProtocolSupport_215
extends Record {
    private final float H;
    private final float e;

    public float d() {
        ProtocolSupport_215 a;
return a.e;
    }

    public float L() {
        ProtocolSupport_215 a;
return a.H;
    }

    @Override
    public final String toString() {
        ProtocolSupport_215 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{ProtocolSupport_215.class, "x;y", "H", "e"}, a);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        ProtocolSupport_215 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ProtocolSupport_215.class, "x;y", "H", "e"}, a2, a);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_215(float f2, float f3) {
        void a;
        ProtocolSupport_215 a2;
        float a3 = f3;
        ProtocolSupport_215 class_215 = a2 = this;
        class_215.H = a;
        class_215.e = a3;
    }

    @Override
    public final int hashCode() {
        ProtocolSupport_215 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ProtocolSupport_215.class, "x;y", "H", "e"}, a);
    }
}

