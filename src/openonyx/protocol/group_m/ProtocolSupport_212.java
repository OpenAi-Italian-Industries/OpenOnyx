/*
 * Decompiled with CFR.
 */
package openonyx.protocol.group_m;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.group_d.ProtocolSupport_210;
import openonyx.protocol.group_m.ProtocolSupport_211;
import openonyx.utilities.UtilitySupport_477;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ProtocolSupport_212
extends Record {
    private final boolean i;
    private final float f;
    final public static ProtocolSupport_212 H = new ProtocolSupport_212(0.0f, 0.0f);
    private final float e;

    public float i() {
        ProtocolSupport_212 a;
return a.e;
    }

    @Override
    public final String toString() {
        ProtocolSupport_212 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{ProtocolSupport_212.class, "yaw;pitch;isNormalized", "f", "e", "i"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_212(float f2, float f3, boolean bl) {
        void a;
        void a2;
        ProtocolSupport_212 a3;
        boolean a4 = bl;
        ProtocolSupport_212 class_212 = a3 = this;
        a3.f = a2;
        class_212.e = a;
        class_212.i = a4;
    }

    public float L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        ProtocolSupport_212 a2 = this;
return Math.min(a2.L(a).L(), 180.0f);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_212 L(float f2, float f3) {
        void a;
        float a2 = f3;
        ProtocolSupport_212 a3 = this;
return new ProtocolSupport_212(a3.f + 4.0f, a3.e + a);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        ProtocolSupport_212 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ProtocolSupport_212.class, "yaw;pitch;isNormalized", "f", "e", "i"}, a2, a);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_212(float f2, float f3) {
        void a;
        float a2 = f3;
        ProtocolSupport_212 a3 = this;
        a3((float)a, 4.0f, 0 != 0);
    }

    public Vec3 L() {
        ProtocolSupport_212 a;
ProtocolSupport_212 class_212 = a;
        return Vec3.directionFromRotation(class_212.e, class_212.f);
    }

    public ProtocolSupport_212 L() {
        ProtocolSupport_212 class_212 = this;
if (class_212.i) {
            return class_212;
        }
        double d = ProtocolSupport_210.d();
        ProtocolSupport_212 a22 = ProtocolSupport_207.I.D();
        if (a22 == null) {
            a22 = UtilitySupport_477.L((Entity)Minecraft.getMinecraft().thePlayer);
        }
        ProtocolSupport_212 class_2122 = a22;
        ProtocolSupport_211 class_211 = class_2122.L(class_212);
        double d2 = (double)Math.round((double)class_211.d() / d) * d;
        d = (double)Math.round((double)class_211.D() / d) * d;
        float a22 = class_2122.L() + (float)d2;
        float f2 = class_2122.i() + (float)d;
        return new ProtocolSupport_212(0, MathHelper.clamp_float(f2, -90.0f, 90.0f), 1 != 0);
    }

    public float D() {
        ProtocolSupport_212 a;
return a.f;
    }

    public boolean L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        ProtocolSupport_212 a2 = this;
return a2.L(a, 2.0f);
    }

    @Override
    public final int hashCode() {
        ProtocolSupport_212 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ProtocolSupport_212.class, "yaw;pitch;isNormalized", "f", "e", "i"}, a);
    }

    public static ProtocolSupport_212 L(Vec3 a) {
return ProtocolSupport_212.L(a.xCoord, a.yCoord, a.zCoord);
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_212 L(ProtocolSupport_212 class_212, float f2) {
        void a;
        float a2 = f2;
        ProtocolSupport_212 a3 = this;
return new ProtocolSupport_212(Math.fma(4.0f, a.f - a3.f, a3.f), Math.fma(4.0f, a.e - a3.e, a3.e));
    }

    public ProtocolSupport_211 L(ProtocolSupport_212 class_212) {
        ProtocolSupport_212 a = class_212;
        ProtocolSupport_212 a2 = this;
return new ProtocolSupport_211(ProtocolSupport_210.L(a.f, a2.f), ProtocolSupport_210.L(a.e, a2.e));
    }

    public static ProtocolSupport_212 L(double a, double a2, double a3) {
return new ProtocolSupport_212(MathHelper.wrapAngleTo180_float((float)Math.toDegrees(Math.atan2(a3, a)) - 90.0f), MathHelper.wrapAngleTo180_float((float)(-Math.toDegrees(Math.atan2(a2, Math.hypot(a, a3))))));
    }

    public ProtocolSupport_212 L(ProtocolSupport_212 class_212, float f2, float f3) {
        float a;
        ProtocolSupport_211 a2;
        float a3 = f3;
        ProtocolSupport_212 a4 = this;
ProtocolSupport_212 class_2122 = a4;
        a2 = class_2122.L((ProtocolSupport_212)((Object)a2));
        float f4 = a2.L();
        a = Math.abs(a2.d() / f4) * a;
        a3 = Math.abs(a2.D() / f4) * a3;
        return class_2122.L(ProtocolSupport_210.L(a2.D(), -a3, a3), ProtocolSupport_210.L(a2.d(), -a, a));
    }

    public float d() {
        ProtocolSupport_212 a;
return a.e;
    }

    public boolean L() {
        ProtocolSupport_212 a;
return a.i;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(ProtocolSupport_212 class_212, float f2) {
        void a;
        float a2 = f2;
        ProtocolSupport_212 a3 = this;
if (a3.L((ProtocolSupport_212)a) <= 4.0f) {
            return 1 != 0;
        }
        return false;
    }

    public float L() {
        ProtocolSupport_212 a;
return a.f;
    }

    public static ProtocolSupport_212 L(Vec3 vec3, Vec3 vec32) {
        Vec3 a = vec32;
        Vec3 a2 = vec3;
return ProtocolSupport_212.L(a2.subtract(a));
    }
}

