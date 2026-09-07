/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.configuration.internal;

import lombok.Generated;
import net.minecraft.util.Vec3;
import openonyx.configuration.Event;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EventSupport_616
extends Event {
    private final float i;
    private Vec3 f;
    private final float H;
    private final Vec3 e;

    @Generated
    public float d() {
        EventSupport_616 a;
return a.H;
    }

    @Generated
    public Vec3 d() {
        EventSupport_616 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public EventSupport_616(Vec3 vec3, float f2, float f3, Vec3 vec32) {
        Vec3 a;
        void a2;
        void a3;
        void a4;
        EventSupport_616 a5;
        EventSupport_616 class_616 = vec33;
        Vec3 vec33 = vec32;
        EventSupport_616 class_6162 = a5 = class_616;
        EventSupport_616 class_6163 = a5;
        class_6163.e = a4;
        class_6163.i = a3;
        class_6162.H = a2;
        class_6162.f = a;
    }

    @Generated
    public float L() {
        EventSupport_616 a;
return a.i;
    }

    @Generated
    public Vec3 L() {
        EventSupport_616 a;
return a.f;
    }

    @Generated
    public void L(Vec3 vec3) {
        Vec3 a = vec3;
        EventSupport_616 a2 = this;
a2.f = a;
    }
}

