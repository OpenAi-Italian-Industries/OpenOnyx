/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.events;

import java.util.Random;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.events.GeometryUtils;
import openonyx.events.RotationManager;
import openonyx.events.RotationMath;
import openonyx.events.Rotation;
import openonyx.events.RotationSettings;
import openonyx.events.RotationMode;
import openonyx.events.RotationFixMode;
import openonyx.history.internal.NumberSetting;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AimController
implements OnyxListener_001 {
    private int k;
    private Rotation g;
    private float M;
    private final RotationSettings L;
    private final static float j = 0.1f;
    private Rotation m;
    private double h;
    private double l;
    private float I;
    private int d;
    private float i;
    private final Random f;
    private double H;
    private float e;

    /*
     * WARNING - void declaration
     */
    public boolean L(Entity entity, Rotation class_535, double d) {
        AxisAlignedBB a;
        void a22;
        Object a3 = class_535;
        AimController a4 = this;
if (a3 == null || AimController.e.thePlayer == null) {
            return false;
        }
        Vec3 vec3 = GeometryUtils.L();
        a3 = GeometryUtils.L(((Rotation)a3).d(), ((Rotation)a3).L());
        a3 = vec3.addVector(((Vec3)a3).xCoord * a22, ((Vec3)a3).yCoord * a22, ((Vec3)a3).zCoord * a22);
        void v0 = a;
        float a22 = v0.getCollisionBorderSize();
        AxisAlignedBB axisAlignedBB = v0.getEntityBoundingBox().expand(a22, a22, a22);
        a = axisAlignedBB.offset(((Entity)((Object)a)).prevPosX - ((Entity)((Object)a)).posX, ((Entity)((Object)a)).prevPosY - ((Entity)((Object)a)).posY, ((Entity)((Object)a)).prevPosZ - ((Entity)((Object)a)).posZ);
        return a4.L(axisAlignedBB, vec3, (Vec3)a3) || a4.L(a, vec3, (Vec3)a3);
    }

    public AimController(RotationSettings class_541) {
        AimController a;
        OnyxListener_001 a2 = class_541;
        AimController class_524 = a = this;
        AimController class_5242 = a;
        a.f = new Random();
        a.k = -1;
        class_524.d = 0;
        class_524.m = null;
        a.g = null;
        a.L = a2;
        a.D();
        a.d();
    }

    private void D() {
        AimController a;
AimController class_524 = a;
        class_524.h = class_524.f.nextDouble();
        class_524.H = class_524.f.nextDouble();
        class_524.l = class_524.f.nextDouble();
    }

    @Generated
    public Rotation d() {
        AimController a;
return a.g;
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(AxisAlignedBB axisAlignedBB, Vec3 vec3, Vec3 vec32) {
        void a;
        void a2;
        Vec3 a3 = vec3;
        AimController a4 = this;
return a2.isVecInside(a3) || a2.calculateIntercept(a3, (Vec3)a) != null;
    }

    private void d() {
        AimController a;
AimController class_524 = a;
        a.i = class_524.L(class_524.L.i, a.L.a);
        class_524.M = class_524.L(class_524.L.h, a.L.j);
    }

    private float d(float f2) {
        float a = f2;
        AimController a2 = this;
return 0 * (a2.f.nextFloat() - a2.f.nextFloat());
    }

    /*
     * WARNING - void declaration
     */
    public void L(Entity entity, double d) {
        void a;
        boolean bl;
        void a32;
        int a422;
        AimController class_524 = this;
if (AimController.e.thePlayer == null) {
            class_524.L();
            return;
        }
        boolean bl2 = RotationManager.D();
        int n = a422 = a32.getEntityId() != class_524.k ? 1 : 0;
        if (a422 != 0) {
            class_524.k = a32.getEntityId();
            bl = bl2;
            class_524.d = 0;
            class_524.D();
        } else {
            if (class_524.L.g.d() > 0 && (class_524.d += 1) >= class_524.L.g.d()) {
                class_524.d = 0;
                class_524.D();
            }
            bl = bl2;
        }
        if (!bl) {
            AimController class_5242 = class_524;
            class_5242.I = 0.0f;
            class_5242.e = 0.0f;
        }
        if (!bl2 || a422 != 0) {
            class_524.d();
        }
        Rotation class_535 = RotationManager.L();
        Vec3 a422 = GeometryUtils.L();
        Vec3 vec3 = GeometryUtils.L((Entity)a32, class_524.h, class_524.H, class_524.l, (Double)class_524.L.l.L() / 100.0);
        void v3 = a;
        if (a422.squareDistanceTo(vec3) > v3 * v3) {
            vec3 = GeometryUtils.L((Entity)a32);
        }
        AimController class_5243 = class_524;
        class_5243.m = RotationMath.L(vec3, class_535);
        Rotation class_5352 = class_535;
        float a32 = MathHelper.wrapAngleTo180_float(class_5243.m.d() - class_5352.d());
        float a422 = class_5243.m.L() - class_535.L();
        AimController class_5244 = class_524;
        a32 = class_535.d() + class_5244.L(a32, class_5244.L(class_5244.i), 5 >> 2);
        AimController class_5245 = class_524;
        a422 = class_5352.L() + class_5245.L(a422, class_5245.L(class_5245.M), 0 != 0);
        if ((Double)class_5243.L.f.L() > 0.0) {
            AimController class_5246 = class_524;
            a32 += class_5246.d(class_5246.L.f.L());
        }
        if ((Double)class_524.L.m.L() > 0.0) {
            AimController class_5247 = class_524;
            a422 += class_5247.d(class_5247.L.m.L());
        }
        a422 = MathHelper.clamp_float(a422, -90.0f, 90.0f);
        if (class_524.L.d.d()) {
            float f2 = RotationMath.L();
            Rotation class_5353 = class_535;
            a32 = RotationMath.d(class_5353.d(), a32, f2);
            a422 = RotationMath.L(class_5353.L(), a422, f2, -90.0f, 90.0f);
        }
        class_524.g = new Rotation(a32, a422);
        RotationManager.L(class_524.g, (RotationFixMode)((Object)class_524.L.k.L()));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private float L(float f2, float f3, boolean bl) {
        float f4;
        void a;
        void a2;
        float a3 = f3;
        AimController a4 = this;
switch ((RotationMode)((Object)a4.L.I.L())) {
            case H: {
                return (float)a2;
            }
            case f: {
                return MathHelper.clamp_float((float)a2, -a3, a3);
            }
            case i: {
                float f5 = 1.0f - a4.L.M.L() / 100.0f;
                float f6 = MathHelper.clamp_float((float)(a2 * f5), -a3, a3);
                float f7 = a4.L.d.d() ? RotationMath.L() : 0.01f;
                return Math.copySign(Math.min(Math.abs((float)a2), Math.max(Math.abs(f6), f7)), (float)a2);
            }
        }
        AimController class_524 = a4;
        float f8 = a != false ? class_524.I : class_524.e;
        float f9 = a4.L.L.L();
        float f10 = a3 * a4.L.e.L() / 100.0f;
        f8 = MathHelper.clamp_float(f8 + f9, f10, a3);
        a3 = (float)Math.sqrt(2.0 * (double)f9 * (double)Math.abs((float)a2));
        a3 = Math.min(Math.min(f8, a3), Math.abs((float)a2));
        AimController class_5242 = a4;
        if (a != false) {
            class_5242.I = a3;
            f4 = a3;
            return Math.copySign(f4, (float)a2);
        }
        class_5242.e = a3;
        f4 = a3;
        return Math.copySign(f4, (float)a2);
    }

    public void L() {
        AimController a;
AimController class_524 = a;
        AimController class_5242 = a;
        AimController class_5243 = a;
        class_5243.k = -1;
        class_5243.d = 0;
        class_5242.I = 0.0f;
        class_5242.e = 0.0f;
        class_524.m = null;
        class_524.g = null;
        RotationManager.d();
    }

    /*
     * WARNING - void declaration
     */
    private float L(NumberSetting class_052, NumberSetting class_0522) {
        void a32;
        OnyxListener_001 a22 = class_052;
        AimController a = this;
if (!a.L.H.d()) {
            return ((NumberSetting)a22).L();
        }
        float a22 = ((NumberSetting)a22).L();
        float a32 = Math.max(0, a32.L());
        float f2 = 0;
        return f2 + a.f.nextFloat() * (a32 - f2);
    }

    public float L(Rotation class_535) {
        Rotation a = class_535;
        AimController a2 = this;
if (a == null || a2.m == null) {
            return 180.0f;
        }
        return Math.max(Math.abs(MathHelper.wrapAngleTo180_float(a2.m.d() - a.d())), Math.abs(a2.m.L() - a.L()));
    }

    private float L(float f2) {
        float a = f2;
        AimController a2 = this;
if (!a2.L.H.d()) {
            return 0;
        }
        return 0 * (1.0f + a2.d(0.1f));
    }

    @Generated
    public Rotation L() {
        AimController a;
return a.m;
    }
}

