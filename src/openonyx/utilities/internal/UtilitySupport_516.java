/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.utilities.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.utilities.UtilitySupport_486;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.UtilitySupport_507;
import openonyx.utilities.internal.UtilitySupport_509;
import openonyx.utilities.internal.UtilitySupport_512;
import openonyx.utilities.internal.UtilitySupport_517;
import openonyx.utilities.internal.UtilitySupport_518;
import openonyx.utilities.internal.UtilityListener_511;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UtilitySupport_516 {
    private final Vec3 H;
    private final Vec3 e;

    public UtilitySupport_516 L(Vec3i vec3i) {
        Vec3i a = vec3i;
        UtilitySupport_516 a2 = this;
return new UtilitySupport_516(a2.e.add(a.getX(), a.getY(), a.getZ()), a2.H.add(a.getX(), a.getY(), a.getZ()));
    }

    private Vec3[] L() {
        UtilitySupport_516 class_516 = this;
Vec3 a = class_516.L();
        if (UtilityListener_511.L(a.xCoord, 0.0)) {
            Vec3[] vec3Array = new Vec3[2];
            vec3Array[0] = new Vec3(0.0, a.yCoord, 0.0);
            vec3Array[1] = new Vec3(0.0, 0.0, a.zCoord);
            return vec3Array;
        }
        if (UtilityListener_511.L(a.yCoord, 0.0)) {
            Vec3[] vec3Array = new Vec3[2];
            vec3Array[0] = new Vec3(a.xCoord, 0.0, 0.0);
            vec3Array[1] = new Vec3(0.0, 0.0, a.zCoord);
            return vec3Array;
        }
        if (UtilityListener_511.L(a.zCoord, 0.0)) {
            Vec3[] vec3Array = new Vec3[2];
            vec3Array[0] = new Vec3(0.0, a.yCoord, 0.0);
            vec3Array[1] = new Vec3(a.xCoord, 0.0, 0.0);
            return vec3Array;
        }
        throw new IllegalStateException(new StringBuilder().insert(0, "Face must be axis aligned for this function to work. dimensions=").append(a).toString());
    }

    public UtilitySupport_516 L() {
        UtilitySupport_516 a;
if (UtilityListener_511.L(a.L(), 0.0)) {
            return null;
        }
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_516(Vec3 vec3, Vec3 vec32) {
        void a;
        Vec3 a2 = vec32;
        UtilitySupport_516 a3 = this;
        UtilitySupport_516 class_516 = a3;
        a3.e = new Vec3(Math.min(a.xCoord, a2.xCoord), Math.min(a.yCoord, a2.yCoord), Math.min(a.zCoord, a2.zCoord));
        class_516.H = new Vec3(Math.max(a.xCoord, a2.xCoord), Math.max(a.yCoord, a2.yCoord), Math.max(a.zCoord, a2.zCoord));
    }

    public Vec3 I() {
        UtilitySupport_516 class_516;
        double d;
        UtilitySupport_516 class_5162;
        double d2;
        UtilitySupport_516 class_5163 = this;
ThreadLocalRandom a = ThreadLocalRandom.current();
        if (class_5163.e.xCoord == class_5163.H.xCoord) {
            d2 = class_5163.e.xCoord;
            class_5162 = class_5163;
        } else {
            d2 = a.nextDouble(class_5163.e.xCoord, class_5163.H.xCoord);
            class_5162 = class_5163;
        }
        if (class_5162.e.yCoord == class_5163.H.yCoord) {
            d = class_5163.e.yCoord;
            class_516 = class_5163;
        } else {
            d = a.nextDouble(class_5163.e.yCoord, class_5163.H.yCoord);
            class_516 = class_5163;
        }
        return new Vec3(d2, d, class_516.e.zCoord == class_5163.H.zCoord ? class_5163.e.zCoord : a.nextDouble(class_5163.e.zCoord, class_5163.H.zCoord));
    }

    @Generated
    public Vec3 i() {
        UtilitySupport_516 a;
return a.H;
    }

    public UtilitySupport_517 L() {
        Vec3[] vec3Array = this;
Vec3[] a = vec3Array.L();
        return UtilitySupport_517.d(vec3Array.e, a[0], a[1]);
    }

    public UtilitySupport_516 L(double a) {
        UtilitySupport_516 a2;
return new UtilitySupport_516(new Vec3(a2.e.xCoord, Math.max(a2.e.yCoord, a), a2.e.zCoord), new Vec3(a2.H.xCoord, Math.max(a2.H.yCoord, a), a2.H.zCoord));
    }

    public UtilitySupport_516 L(Vec3 vec3) {
        Vec3 a = vec3;
        UtilitySupport_516 a2 = this;
return new UtilitySupport_516(a2.e.add(a), a2.H.add(a));
    }

    public UtilitySupport_516 L(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB a = axisAlignedBB;
        UtilitySupport_516 a2 = this;
return new UtilitySupport_516(UtilitySupport_507.L(a, a2.e), UtilitySupport_507.L(a, a2.H));
    }

    @Generated
    public Vec3 D() {
        UtilitySupport_516 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public Vec3 L(UtilityListener_511 interface_511) {
        Object object;
        Object object2;
        Object object3;
        void a;
        Vec3[] vec3Array = this;
Object a2 = vec3Array.L();
        a2 = UtilitySupport_517.d(vec3Array.e, a2[0], a2[1]);
        List<UtilitySupport_518> list = vec3Array.L();
        a2 = ((UtilitySupport_517)a2).L((UtilityListener_511)a);
        Vec3 vec3 = vec3Array.d();
        if (a2 != null) {
            List<UtilitySupport_518> list2;
            int n;
            block8: {
                n = 1;
                Iterator<UtilitySupport_518> iterator = list.iterator();
                while (iterator.hasNext()) {
                    Vec3 vec32;
                    object3 = iterator.next().d(0.5);
                    object2 = ((Vec3)object3).subtract(vec3);
                    object = ((Vec3)object3).subtract((Vec3)a2);
                    if (!(vec32.dotProduct((Vec3)object2) <= 0.0)) continue;
                    n = 0;
                    list2 = list;
                    break block8;
                }
                list2 = list;
            }
            if (list2.isEmpty() || 0 != 0) {
                return a2;
            }
        }
        Vec3 vec33 = null;
        double d = Double.POSITIVE_INFINITY;
        object3 = list.iterator();
        block1: while (true) {
            Object object4 = object3;
            while (object4.hasNext()) {
                double d2;
                object2 = object3.next();
                object = object2.L((UtilityListener_511)a);
                if (object == null) {
                    object4 = object3;
                    continue;
                }
                double d3 = ((UtilitySupport_512)object).d().distanceToSqr(((UtilitySupport_512)object).L());
                if (!(d2 < d)) continue block1;
                d = d3;
                vec33 = ((UtilitySupport_512)object).d();
                continue block1;
            }
            break;
        }
        if (vec33 != null) {
            return vec33;
        }
        if (a2 != null) {
            return a2;
        }
        return vec3;
    }

    public Vec3 d() {
        UtilitySupport_516 a;
UtilitySupport_516 class_516 = a;
        return class_516.e.lerp(class_516.H, 0.5);
    }

    private List<UtilitySupport_518> L() {
        Vec3[] vec3Array = this;
ArrayList<UtilitySupport_518> arrayList = new ArrayList<UtilitySupport_518>(4);
        Vec3[] a = vec3Array.L();
        if (!UtilitySupport_495.d(a[0])) {
            arrayList.add(new UtilitySupport_518(vec3Array.e, vec3Array.e.add(a[0])));
            arrayList.add(new UtilitySupport_518(vec3Array.H, vec3Array.H.subtract(a[0])));
        }
        if (!UtilitySupport_495.d(a[1])) {
            arrayList.add(new UtilitySupport_518(vec3Array.e, vec3Array.e.add(a[1])));
            arrayList.add(new UtilitySupport_518(vec3Array.H, vec3Array.H.subtract(a[1])));
        }
        return arrayList;
    }

    public double L() {
        UtilitySupport_516 class_516 = this;
Vec3 a = class_516.L();
        return a.xCoord * a.yCoord + a.yCoord * a.zCoord + a.xCoord * a.zCoord;
    }

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_518 L(UtilityListener_511 interface_511) {
        Object object;
        Object a;
        UtilitySupport_516 class_516 = this;
ArrayList<UtilitySupport_509> arrayList = new ArrayList<UtilitySupport_509>(4);
        Object object2 = a = class_516.L().iterator();
        while (object2.hasNext()) {
            void a2;
            object = (UtilitySupport_518)a.next();
            UtilitySupport_512 class_512 = a2.L((UtilityListener_511)object);
            if (class_512 == null) {
                object2 = a;
                continue;
            }
            arrayList.add(new UtilitySupport_509(class_512.L(), class_512.L().distanceToSqr(class_512.d())));
            object2 = a;
        }
        arrayList.sort((class_509, class_5092) -> {
            UtilitySupport_509 a = class_5092;
            UtilitySupport_509 a2 = class_509;
return Double.compare(a2.L(), a.L());
        });
        if (arrayList.size() < 2) {
            return null;
        }
        a = ((UtilitySupport_509)arrayList.get(0)).L();
        object = ((UtilitySupport_509)arrayList.get(1)).L();
        if (UtilitySupport_495.d(((Vec3)object).subtract((Vec3)a))) {
            return null;
        }
        return new UtilitySupport_518((Vec3)a, (Vec3)object);
    }

    public Vec3 L() {
        UtilitySupport_516 a;
return new Vec3(a.H.xCoord - a.e.xCoord, a.H.yCoord - a.e.yCoord, a.H.zCoord - a.e.zCoord);
    }
}

