/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.utilities.internal;

import lombok.Generated;
import net.minecraft.util.Vec3;
import openonyx.theme.ThemeSupport_056;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilitySupport_513;
import openonyx.utilities.internal.UtilityListener_511;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UtilitySupport_517 {
    private final Vec3 H;
    private final Vec3 e;

    /*
     * WARNING - void declaration
     */
    public Vec3 L(UtilityListener_511 interface_511) {
        void a;
        UtilitySupport_517 class_517 = this;
Double a2 = class_517.L((UtilityListener_511)a);
        if (a2 == null) {
            return null;
        }
        return a.L(a2);
    }

    public Double L(UtilityListener_511 interface_511) {
        UtilityListener_511 a = interface_511;
        UtilitySupport_517 a2 = this;
UtilitySupport_517 class_517 = a2;
        double d = class_517.H.dotProduct(class_517.e);
        double d2 = a.L().dotProduct(a2.e);
        if (UtilityListener_511.L(0.0, 0.0)) {
            return null;
        }
        return (0.0 - a.d().dotProduct(a2.e)) / 0.0;
    }

    @Generated
    public Vec3 d() {
        UtilitySupport_517 a;
return a.H;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_517(Vec3 vec3, Vec3 vec32) {
        void a;
        UtilitySupport_517 a2;
        Vec3 a3 = vec32;
        UtilitySupport_517 class_517 = a2 = this;
        class_517.H = a;
        class_517.e = UtilitySupport_495.L(a3);
    }

    @Generated
    public Vec3 L() {
        UtilitySupport_517 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public static UtilitySupport_517 d(Vec3 vec3, Vec3 vec32, Vec3 vec33) {
        void a;
        Vec3 a2 = vec32;
        Vec3 a3 = vec3;
a2 = a2.crossProduct((Vec3)a).normalize();
        if (UtilitySupport_495.d(a2)) {
            throw new IllegalArgumentException("Points must not be on the same line");
        }
        return new UtilitySupport_517(a3, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static UtilitySupport_517 L(Vec3 vec3, Vec3 vec32, Vec3 vec33) {
        void a;
        Vec3 a2 = vec33;
        Vec3 a3 = vec3;
Vec3 vec34 = a3;
        return UtilitySupport_517.d(vec34, a.subtract(a3), a2.subtract(vec34));
    }

    public UtilitySupport_513 L(UtilitySupport_517 class_517) {
        Vec3 a;
        UtilitySupport_517 class_5172 = this;
Vec3 vec3 = ((UtilitySupport_517)((Object)a)).e;
        Vec3 vec32 = class_5172.e;
        Vec3 a2 = vec3.crossProduct(vec32);
        double d = a2.lengthSqr();
        if (UtilityListener_511.L(d, 0.0)) {
            return null;
        }
        double d2 = vec3.dotProduct(((UtilitySupport_517)((Object)a)).H);
        Vec3 vec33 = vec32;
        double d3 = vec33.dotProduct(class_5172.H);
        a = vec33.crossProduct(a2).scale(d2).add(a2.crossProduct(vec3).scale(d3)).scale(1.0 / d);
        return new UtilitySupport_513(a, a2);
    }
}

