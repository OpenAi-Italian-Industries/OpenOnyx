/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.movement;

import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import openonyx.configuration.internal.EventSupport_612;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.movement.MovementSupport_084;
import openonyx.movement.MovementListener_085;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_495;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MovementSupport_086
implements MovementListener_085,
OnyxListener_001 {
    private Vec3 D;
    private boolean c;
    private double a;
    private final static double k = 1.0;
    private float g;
    private Vec3 M;
    private int L;
    private boolean j;
    private boolean m;
    private int h;
    private final EntityPlayer l;
    private float I;
    private boolean d;
    private boolean i;
    private MovementSupport_084 f;
    private boolean H;
    private AxisAlignedBB e;

    private boolean H() {
        MovementSupport_086 a;
return a.L().isMaterialInBB(a.e.expand(-0.1f, -0.4f, -0.1f), Material.lava);
    }

    private void i() {
a.a = 0.0;
    }

    @Generated
    public boolean e() {
        MovementSupport_086 a;
return a.c;
    }

    public static MovementSupport_086 L(MovementSupport_084 a) {
return MovementSupport_086.L(((Minecraft)((Object)MovementSupport_086.e)).thePlayer, a, UtilitySupport_477.L((Entity)((Minecraft)((Object)MovementSupport_086.e)).thePlayer));
    }

    @Generated
    public boolean k() {
        MovementSupport_086 a;
return a.m;
    }

    @Generated
    public void L(MovementSupport_084 class_084) {
        OnyxListener_001 a = class_084;
        MovementSupport_086 a2 = this;
a2.f = a;
    }

    private boolean F() {
        MovementSupport_086 class_086 = this;
MovementSupport_086 class_0862 = class_086;
        MovementSupport_086 class_0863 = class_086;
        Block a = class_0863.L(new BlockPos(MathHelper.floor_double(class_0863.D.xCoord), MathHelper.floor_double(class_086.e.minY), MathHelper.floor_double(class_086.D.zCoord))).getBlock();
        return a == Blocks.ladder || a == Blocks.vine;
    }

    public void i(Vec3 vec3) {
        Vec3 a = vec3;
        MovementSupport_086 a2 = this;
MovementSupport_086 class_086 = a2;
        class_086.D = a;
        class_086.e = UtilitySupport_477.L(a);
    }

    @Generated
    public float i() {
        MovementSupport_086 a;
return a.g;
    }

    @Generated
    public MovementSupport_084 L() {
        MovementSupport_086 a;
return a.f;
    }

    @Generated
    public void I(boolean bl) {
        boolean a = bl;
        MovementSupport_086 a2 = this;
a2.j = a;
    }

    @Generated
    public int d() {
        MovementSupport_086 a;
return a.L;
    }

    private IBlockState L(BlockPos blockPos) {
        BlockPos a = blockPos;
        MovementSupport_086 a2 = this;
return a2.L().getBlockState(a);
    }

    private boolean L(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB a = axisAlignedBB;
        MovementSupport_086 a2 = this;
return a2.L().getCollidingBoundingBoxes(a2.l, a).isEmpty();
    }

    @Generated
    public boolean l() {
        MovementSupport_086 a;
return a.i;
    }

    public MovementSupport_086 L() {
        MovementSupport_086 a;
MovementSupport_086 class_086 = a;
        MovementSupport_086 class_0862 = a;
        MovementSupport_086 class_0863 = a;
        MovementSupport_086 class_0864 = a;
        MovementSupport_086 class_0865 = a;
        MovementSupport_086 class_0866 = a;
        return new MovementSupport_086(class_086.l, class_086.f, class_0862.D, class_0862.M, class_0863.e, class_0863.I, class_0864.g, class_0864.d, a.a, class_0865.L, class_0865.j, class_0866.m, class_0866.i, a.c);
    }

    private float D() {
        MovementSupport_086 class_086 = this;
float a = 0.02f;
        if (class_086.f.L()) {
            return 0.0f;
        }
        return 0;
    }

    @Generated
    public void D(Vec3 vec3) {
        Vec3 a = vec3;
        MovementSupport_086 a2 = this;
a2.M = a;
    }

    private Vec3 D(Vec3 vec3) {
        double d;
        Vec3 a = vec3;
        MovementSupport_086 a2 = this;
if (!a2.F()) {
            return a;
        }
        a2.i();
        Object object = a;
        double d2 = MathHelper.clamp_double(((Vec3)object).xCoord, -0.15f, 0.15f);
        double d3 = MathHelper.clamp_double(((Vec3)object).zCoord, -0.15f, 0.15f);
        double d4 = Math.max(((Vec3)object).yCoord, (double)-0.15f);
        if (d < 0.0 && a2.f.e.i()) {
            d4 = 0.0;
        }
        return new Vec3(d2, d4, d3);
    }

    @Generated
    public void d(int n) {
        int a = n;
        MovementSupport_086 a2 = this;
a2.h = 0;
    }

    @Generated
    public void i(boolean bl) {
        boolean a = bl;
        MovementSupport_086 a2 = this;
a2.m = a;
    }

    @Generated
    public Vec3 D() {
        MovementSupport_086 a;
return a.M;
    }

    private float d() {
        MovementSupport_086 a;
return a.l.getAIMoveSpeed();
    }

    /*
     * Unable to fully structure code
     */
    private static MovementSupport_086 L(EntityPlayer var0, MovementSupport_084 var1_1, Vec3 var2_2) {
        a = var1_1;
        a = var0;
v0 = a;
        v1 = UtilitySupport_477.D(v0);
        v2 = a.getEntityBoundingBox();
        v3 = a;
        v4 = v3.rotationPitch;
        v5 = a.isSprinting();
        v6 = a.fallDistance;
        if (!(a instanceof EntityPlayerSP)) ** GOTO lbl-1000
        a = (EntityPlayerSP)a;
        if (a.movementInput != null && a.movementInput.jump) {
            v7 = 5 >> 2;
            v8 = a;
        } else lbl-1000:
        // 2 sources

        {
            v7 = 0;
            v8 = a;
        }
        v9 = a;
        return new MovementSupport_086(v0, (MovementSupport_084)a, v1, (Vec3)a, v2, v3.rotationYaw, v4, v5, v6, 2 & 5, (boolean)v7, v8.onGround, v9.isCollidedHorizontally, v9.isCollidedVertically);
    }

    private boolean h() {
        MovementSupport_086 a;
return a.L().isMaterialInBB(a.e.expand(0.0, -0.4f, 0.0).contract(0.001, 0.001, 0.001), Material.water);
    }

    @Generated
    public void L(double a) {
a.a = a;
    }

    @Generated
    public boolean I() {
        MovementSupport_086 a;
return a.j;
    }

    @Generated
    public float L() {
        MovementSupport_086 a;
return a.I;
    }

    @Generated
    public int L() {
        MovementSupport_086 a;
return a.h;
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f, Vec3 vec3) {
        void a;
        Vec3 a2 = vec3;
        MovementSupport_086 a3 = this;
a3.M = a3.M.add(UtilitySupport_477.L(a2, (float)a, a3.I));
    }

    private IBlockState L() {
        MovementSupport_086 a;
MovementSupport_086 class_086 = a;
        MovementSupport_086 class_0862 = a;
        return class_0862.L(new BlockPos(MathHelper.floor_double(class_0862.D.xCoord), MathHelper.floor_double(a.e.minY) - 1, MathHelper.floor_double(a.D.zCoord)));
    }

    public void D() {
        MovementSupport_086 class_086 = this;
MovementSupport_086 class_0862 = class_086;
        class_0862.M = UtilitySupport_495.i(class_0862.M, 0.42f);
        PotionEffect a2 = class_0862.l.getActivePotionEffect(Potion.jump);
        if (a2 != null) {
            class_086.M = class_086.M.add(0.0, (float)(a2.getAmplifier() + 1) * 0.1f, 0.0);
        }
        if (class_086.d) {
            MovementSupport_086 class_0863 = class_086;
            float a2 = class_0863.I * ((float)Math.PI / 180);
            class_0863.M = class_0863.M.add(-MathHelper.sin(a2) * 0.2f, 0.0, MathHelper.cos(a2) * 0.2f);
        }
    }

    private void d(Vec3 vec3) {
        MovementSupport_086 class_086;
        Vec3 vec32;
        Object a = vec3;
        MovementSupport_086 a2 = this;
a = new EventSupport_612((Vec3)a);
        OnyxClient.d.post(a);
        a = ((EventSupport_612)a).L();
        if (a2.D()) {
            a = ((Vec3)a).multiply(0.25, 0.05f, 0.25);
            a2.M = Vec3.ZERO;
        }
        MovementSupport_086 class_0862 = a2;
        a = class_0862.L((Vec3)a);
        Vec3 vec33 = class_0862.d((Vec3)a);
        if (vec32.lengthSqr() > 1.0E-7) {
            MovementSupport_086 class_0863 = a2;
            class_0863.D = class_0863.D.add(vec33);
            class_0863.e = UtilitySupport_477.L(class_0863.D);
        }
        int n = ((Vec3)a).xCoord != vec33.xCoord ? 1 : 0;
        int n2 = ((Vec3)a).zCoord != vec33.zCoord ? 1 : 0;
        a2.i = n != 0 || n2 != 0;
        a2.c = ((Vec3)a).yCoord != vec33.yCoord ? 1 : 0;
        int n3 = a2.m = a2.c && ((Vec3)a).yCoord < 0.0 ? 1 : 0;
        if (a2.m) {
            MovementSupport_086 class_0864 = a2;
            class_086 = class_0864;
            class_0864.i();
        } else {
            if (vec33.yCoord < 0.0) {
                a2.a -= vec33.yCoord;
            }
            class_086 = a2;
        }
        a = class_086.M;
        if (a2.i || a2.c) {
            int n4;
            double d;
            MovementSupport_086 class_0865;
            double d2;
            if (n != 0) {
                d2 = 0.0;
                class_0865 = a2;
            } else {
                d2 = ((Vec3)a).xCoord;
                class_0865 = a2;
            }
            if (class_0865.m) {
                d = 0.0;
                n4 = n2;
            } else {
                d = ((Vec3)a).yCoord;
                n4 = n2;
            }
            a2.M = new Vec3(d2, d, n4 != 0 ? 0.0 : ((Vec3)a).zCoord);
        }
    }

    public void d() {
        MovementSupport_086 a;
a.D();
    }

    @Generated
    public void L(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB a = axisAlignedBB;
        MovementSupport_086 a2 = this;
a2.e = a;
    }

    private Vec3 d(Vec3 vec3) {
        float f;
        AxisAlignedBB axisAlignedBB;
        Iterator<AxisAlignedBB> iterator;
        Object a222;
        List<AxisAlignedBB> a;
        MovementSupport_086 class_086 = this;
void v0 = a;
        double d = v0.xCoord;
        double d2 = v0.yCoord;
        double d3 = v0.zCoord;
        double d4 = d;
        double d5 = d3;
        Iterator<AxisAlignedBB> iterator2 = class_086.e;
        Object object = iterator2;
        Object object2 = class_086.L().getCollidingBoundingBoxes(class_086.l, ((AxisAlignedBB)object).addCoord(d, d2, d3));
        Object object3 = a222 = object2.iterator();
        while (object3.hasNext()) {
            iterator = (AxisAlignedBB)a222.next();
            object3 = a222;
            d2 = ((AxisAlignedBB)((Object)iterator)).calculateYOffset((AxisAlignedBB)object, d2);
        }
        object = ((AxisAlignedBB)object).offset(0.0, d2, 0.0);
        boolean a222 = class_086.m || ((Vec3)((Object)a)).yCoord != d2 && ((Vec3)((Object)a)).yCoord < 0.0;
        Iterator<AxisAlignedBB> iterator3 = iterator = object2.iterator();
        while (iterator3.hasNext()) {
            axisAlignedBB = (AxisAlignedBB)iterator.next();
            iterator3 = iterator;
            d = axisAlignedBB.calculateXOffset((AxisAlignedBB)object, d);
        }
        object = ((AxisAlignedBB)object).offset(d, 0.0, 0.0);
        Iterator<AxisAlignedBB> iterator4 = iterator = object2.iterator();
        while (iterator4.hasNext()) {
            axisAlignedBB = iterator.next();
            iterator4 = iterator;
            d3 = axisAlignedBB.calculateZOffset((AxisAlignedBB)object, d3);
        }
        object = ((AxisAlignedBB)object).offset(0.0, 0.0, d3);
        float f2 = class_086.l.stepHeight;
        if (f > 0.0f && a222 && (d4 != d || d5 != d3)) {
            List<AxisAlignedBB> list;
            Iterator<AxisAlignedBB> iterator5;
            Iterator<AxisAlignedBB> iterator6;
            Iterator<AxisAlignedBB> iterator7;
            Iterator<AxisAlignedBB> iterator8;
            double d6 = d;
            double d7 = d2;
            double d8 = d3;
            d2 = f2;
            a = class_086.L().getCollidingBoundingBoxes(class_086.l, ((AxisAlignedBB)((Object)iterator2)).addCoord(d4, d2, d5));
            object2 = iterator2;
            Object a222 = ((AxisAlignedBB)object2).addCoord(d4, 0.0, d5);
            double d9 = d2;
            Iterator<AxisAlignedBB> iterator9 = iterator8 = a.iterator();
            while (iterator9.hasNext()) {
                d9 = iterator8.next().calculateYOffset((AxisAlignedBB)a222, d9);
                iterator9 = iterator8;
            }
            object2 = ((AxisAlignedBB)object2).offset(0.0, d9, 0.0);
            double d10 = d4;
            Iterator<AxisAlignedBB> iterator10 = iterator7 = a.iterator();
            while (iterator10.hasNext()) {
                d10 = iterator7.next().calculateXOffset((AxisAlignedBB)object2, d10);
                iterator10 = iterator7;
            }
            object2 = ((AxisAlignedBB)object2).offset(d10, 0.0, 0.0);
            double d11 = d5;
            Object object4 = a222 = a.iterator();
            while (object4.hasNext()) {
                AxisAlignedBB axisAlignedBB2 = (AxisAlignedBB)a222.next();
                object4 = a222;
                d11 = axisAlignedBB2.calculateZOffset((AxisAlignedBB)object2, d11);
            }
            object2 = ((AxisAlignedBB)object2).offset(0.0, 0.0, d11);
            a222 = iterator2;
            double d12 = d2;
            Iterator<AxisAlignedBB> iterator11 = iterator6 = a.iterator();
            while (iterator11.hasNext()) {
                d12 = iterator6.next().calculateYOffset((AxisAlignedBB)a222, d12);
                iterator11 = iterator6;
            }
            a222 = ((AxisAlignedBB)a222).offset(0.0, d12, 0.0);
            double d13 = d4;
            Iterator<AxisAlignedBB> iterator12 = iterator5 = a.iterator();
            while (iterator12.hasNext()) {
                d13 = iterator5.next().calculateXOffset((AxisAlignedBB)a222, d13);
                iterator12 = iterator5;
            }
            a222 = ((AxisAlignedBB)a222).offset(d13, 0.0, 0.0);
            double d14 = d5;
            Iterator<AxisAlignedBB> iterator13 = iterator2 = a.iterator();
            while (iterator13.hasNext()) {
                AxisAlignedBB axisAlignedBB3 = (AxisAlignedBB)iterator2.next();
                iterator13 = iterator2;
                d14 = axisAlignedBB3.calculateZOffset((AxisAlignedBB)a222, d14);
            }
            a222 = ((AxisAlignedBB)a222).offset(0.0, 0.0, d14);
            double d15 = d10;
            double d16 = d11;
            double d17 = d13;
            double d18 = d14;
            if (d15 * d15 + d16 * d16 > d17 * d17 + d18 * d18) {
                d = d10;
                d3 = d11;
                d2 = -d9;
                object = object2;
                list = a;
            } else {
                d = d13;
                d3 = d14;
                d2 = -d12;
                object = a222;
                list = a;
            }
            Iterator<AxisAlignedBB> iterator14 = iterator2 = list.iterator();
            while (iterator14.hasNext()) {
                AxisAlignedBB axisAlignedBB4 = iterator2.next();
                iterator14 = iterator2;
                d2 = axisAlignedBB4.calculateYOffset((AxisAlignedBB)object, d2);
            }
            double d19 = d6;
            double d20 = d8;
            double d21 = d;
            double d22 = d3;
            if (d19 * d19 + d20 * d20 >= d21 * d21 + d22 * d22) {
                d = d6;
                d2 = d7;
                d3 = d8;
            }
        }
        return new Vec3(d, d2, d3);
    }

    @Generated
    public void D(boolean bl) {
        boolean a = bl;
        MovementSupport_086 a2 = this;
a2.i = a;
    }

    public static MovementSupport_086 L(EntityPlayer entityPlayer, MovementSupport_084 class_084) {
        MovementSupport_084 a = class_084;
        EntityPlayer a2 = entityPlayer;
EntityPlayer entityPlayer2 = a2;
        return MovementSupport_086.L(entityPlayer2, a, UtilitySupport_477.D(a2).subtract(UtilitySupport_477.d(entityPlayer2)));
    }

    @Override
    public Vec3 L() {
        MovementSupport_086 a;
return a.D;
    }

    private void L(Vec3 vec3) {
        MovementSupport_086 class_086 = this;
MovementSupport_086 class_0862 = class_086;
        boolean bl = class_0862.l.capabilities.isFlying;
        double d = class_0862.M.yCoord;
        if (class_0862.h() && !bl) {
            float f;
            MovementSupport_086 class_0863 = class_086;
            double d2 = class_0863.D.yCoord;
            float a = 0.8f;
            float f2 = 0.02f;
            float f3 = EnchantmentHelper.getDepthStriderModifier(class_0863.l);
            if (f > 3.0f) {
                f3 = 3.0f;
            }
            if (!class_086.m) {
                f3 *= 0.5f;
            }
            if (f3 > 0.0f) {
                float f4 = 0;
                a = f4 + (0.54600006f - f4) * f3 / 3.0f;
                float f5 = f2;
                f2 = f5 + (class_086.d() * 1.0f - f5) * f3 / 3.0f;
            }
            MovementSupport_086 class_0864 = class_086;
            class_0864.L(f2, (Vec3)a);
            class_0864.d(class_0864.M);
            class_0864.M = class_0864.M.multiply(0, 0.8f, 0).add(0.0, -0.02, 0.0);
            if (class_0864.i) {
                MovementSupport_086 class_0865 = class_086;
                if (class_0865.L(class_086.M.xCoord, class_0865.M.yCoord + (double)0.6f - class_086.D.yCoord + d2, class_086.M.zCoord)) {
                    class_086.M = UtilitySupport_495.i(class_086.M, 0.3f);
                    return;
                }
            }
        } else if (class_086.H() && !bl) {
            MovementSupport_086 class_0866 = class_086;
            double d3 = class_0866.D.yCoord;
            class_0866.L(0.02f, (Vec3)a);
            class_0866.d(class_0866.M);
            class_0866.M = class_0866.M.scale(0.5).add(0.0, -0.02, 0.0);
            if (class_0866.i) {
                MovementSupport_086 class_0867 = class_086;
                if (class_0867.L(class_086.M.xCoord, class_0867.M.yCoord + (double)0.6f - class_086.D.yCoord + d3, class_086.M.zCoord)) {
                    class_086.M = UtilitySupport_495.i(class_086.M, 0.3f);
                    return;
                }
            }
        } else {
            float f = 0.91f;
            if (class_086.m) {
                f = class_086.L().getBlock().slipperiness * 0.91f;
            }
            float f6 = f;
            float f7 = 0.16277136f / (f6 * f6 * f);
            MovementSupport_086 class_0868 = class_086;
            float a = class_086.m ? class_0868.d() * f7 : class_0868.D();
            MovementSupport_086 class_0869 = class_086;
            class_0869.L(a, (Vec3)a);
            class_0869.M = class_0869.D(class_0869.M);
            class_0869.d(class_0869.M);
            if (class_0869.i && class_086.F()) {
                class_086.M = UtilitySupport_495.i(class_086.M, 0.2);
            }
            double d4 = bl ? d * 0.6 : (class_086.M.yCoord - 0.08) * (double)0.98f;
            MovementSupport_086 class_08610 = class_086;
            class_086.M = new Vec3(class_086.M.xCoord * (double)f, d4, class_086.M.zCoord * (double)f);
            if (bl) {
                class_086.i();
            }
        }
    }

    @Generated
    public AxisAlignedBB L() {
        MovementSupport_086 a;
return a.e;
    }

    @Generated
    public Vec3 d() {
        MovementSupport_086 a;
return a.D;
    }

    @Generated
    public EntityPlayer L() {
        MovementSupport_086 a;
return a.l;
    }

    private boolean L(double a5, double a2, double a3) {
        MovementSupport_086 a4;
MovementSupport_086 class_086 = a4;
        AxisAlignedBB a5 = class_086.e.offset(a5, a2, a3);
        if (class_086.L(a5) && !a4.L().isAnyLiquid(a5)) {
            return 1 != 0;
        }
        return false;
    }

    @Generated
    public void d(boolean bl) {
        boolean a = bl;
        MovementSupport_086 a2 = this;
a2.d = a;
    }

    @Generated
    public boolean i() {
        MovementSupport_086 a;
return a.d;
    }

    private Vec3 L(Vec3 vec3) {
        Vec3 a = vec3;
        MovementSupport_086 a2 = this;
if (!a2.m || a.yCoord > 0.0) {
            return a;
        }
        Object object = a;
        double d = ((Vec3)object).xCoord;
        double d2 = ((Vec3)object).zCoord;
        double d3 = 0.05;
        double d4 = d;
        while (d4 != 0.0) {
            MovementSupport_086 class_086 = a2;
            if (!class_086.L(class_086.e.offset(d, -1.0, 0.0))) break;
            if (d < d3 && d >= -d3) {
                d4 = 0.0;
                continue;
            }
            if (0.0 > 0.0) {
                d4 = 0.0 - d3;
                continue;
            }
            d4 = 0.0 + d3;
        }
        double d5 = d2;
        while (d5 != 0.0) {
            MovementSupport_086 class_086 = a2;
            if (!class_086.L(class_086.e.offset(0.0, -1.0, d2))) break;
            if (d2 < d3 && d2 >= -d3) {
                d5 = 0.0;
                continue;
            }
            if (0.0 > 0.0) {
                d5 = 0.0 - d3;
                continue;
            }
            d5 = 0.0 + d3;
        }
        double d6 = 0.0;
        while (d6 != 0.0 && 0.0 != 0.0) {
            double d7;
            MovementSupport_086 class_086 = a2;
            if (!class_086.L(class_086.e.offset(0.0, -1.0, 0.0))) break;
            if (0.0 < d3 && 0.0 >= -d3) {
                d = 0.0;
                d7 = 0.0;
            } else if (0.0 > 0.0) {
                d -= d3;
                d7 = 0.0;
            } else {
                d += d3;
                d7 = 0.0;
            }
            if (d7 < d3 && 0.0 >= -d3) {
                d2 = 0.0;
                d6 = 0.0;
                continue;
            }
            if (0.0 > 0.0) {
                d2 -= d3;
                d6 = 0.0;
                continue;
            }
            d2 += d3;
            d6 = 0.0;
        }
        if (a.xCoord != 0.0 || a.zCoord != 0.0) {
            a2.H = 1;
        }
        if (!a2.L()) {
            return a;
        }
        return new Vec3(0.0, a.yCoord, 0.0);
    }

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        MovementSupport_086 a2 = this;
a2.c = a;
    }

    /*
     * WARNING - void declaration
     */
    public MovementSupport_086(EntityPlayer entityPlayer, MovementSupport_084 class_084, Vec3 vec3, Vec3 vec32, AxisAlignedBB axisAlignedBB, float f, float f2, boolean bl, double d, int n, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        void a9;
        void a10;
        void a11;
        void a12;
        void a13;
        void a14;
        MovementSupport_086 a15;
        boolean bl6 = bl5;
        MovementSupport_086 class_086 = a15 = this;
        MovementSupport_086 class_0862 = a15;
        MovementSupport_086 class_0863 = a15;
        MovementSupport_086 class_0864 = a15;
        MovementSupport_086 class_0865 = a15;
        MovementSupport_086 class_0866 = a15;
        MovementSupport_086 class_0867 = a15;
        class_0867.l = a14;
        class_0867.f = a13;
        class_0866.D = a12;
        class_0866.M = a11;
        class_0865.e = a10;
        class_0865.I = a9;
        class_0864.g = a8;
        class_0864.d = a7;
        class_0863.a = a6;
        class_0863.L = a5;
        class_0862.j = a4;
        class_0862.m = a3;
        class_086.i = a2;
        class_086.c = a;
    }

    @Override
    public void L() {
        MovementSupport_086 class_086;
        double d;
        double d2;
        MovementSupport_086 a;
        block7: {
            block8: {
                block5: {
                    block6: {
                        MovementSupport_086 class_0862;
a.H = 0;
                        if (class_0862.D.yCoord <= -70.0) {
                            return;
                        }
                        MovementSupport_086 class_0863 = a;
                        class_0863.f.L();
                        if (class_0863.L > 0) {
                            a.L -= 1;
                        }
                        MovementSupport_086 class_0864 = a;
                        class_0864.j = class_0864.f.e.L();
                        d2 = class_0864.M.xCoord;
                        d = class_0864.M.yCoord;
                        double d3 = class_0864.M.zCoord;
                        if (Math.abs(d2) < 0.005) {
                            d2 = 0.0;
                        }
                        if (Math.abs(d) < 0.005) {
                            d = 0.0;
                        }
                        if (Math.abs(d3) < 0.005) {
                            d3 = 0.0;
                        }
                        a.M = new Vec3(d2, d, d3);
                        if (!a.j) break block5;
                        if (!a.h() && !a.H()) break block6;
                        MovementSupport_086 class_0865 = a;
                        class_086 = class_0865;
                        class_0865.M = class_0865.M.add(0.0, 0.04f, 0.0);
                        break block7;
                    }
                    if (!a.m || a.L != 0) break block8;
                    MovementSupport_086 class_0866 = a;
                    class_086 = class_0866;
                    class_0866.D();
                    class_0866.L = 10;
                    break block7;
                }
                a.L = 0;
            }
            class_086 = a;
        }
        d2 = (double)class_086.f.D() * 0.98;
        MovementSupport_086 class_0867 = a;
        d = (double)class_0867.f.d() * 0.98;
        class_0867.L(new Vec3(d2, 0.0, d));
        a.h += 1;
    }

    @Generated
    public double L() {
        MovementSupport_086 a;
return a.a;
    }

    @Generated
    public void L(int n) {
        int a = n;
        MovementSupport_086 a2 = this;
a2.L = 0;
    }

    private boolean D() {
        MovementSupport_086 a;
MovementSupport_086 class_086 = a;
        if (class_086.L(UtilitySupport_495.L(class_086.D)).getBlock() == Blocks.web) {
            return 1 != 0;
        }
        return false;
    }

    @Generated
    public void d(float f) {
        float a = f;
        MovementSupport_086 a2 = this;
a2.I = 0;
    }

    @Generated
    public boolean d() {
        MovementSupport_086 a;
return a.H;
    }

    private boolean L() {
        MovementSupport_086 a;
return !a.f.D() && (a.f.e.i() || a.f.d());
    }

    private World L() {
        MovementSupport_086 a;
return a.l.worldObj;
    }

    @Generated
    public void L(float f) {
        float a = f;
        MovementSupport_086 a2 = this;
a2.g = 0;
    }
}

