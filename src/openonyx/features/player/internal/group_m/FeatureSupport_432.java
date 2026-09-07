/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player.internal.group_m;

import java.util.ArrayList;
import java.util.List;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.configuration.internal.EventSupport_616;
import openonyx.configuration.internal.TickEvent;
import openonyx.configuration.internal.EventSupport_624;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.features.player.Scaffold;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.input.InputSupport_002;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.PlacementResult;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.group_d.ProtocolSupport_210;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.ProtocolMode_213;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.RayTraceUtils;
import openonyx.utilities.RayTraceMode;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_432
extends FeatureSupport_431 {
    private float A;
    private final static int K = 2;
    private boolean B;
    private final static double C = 4.5;
    private final static int J = 10;
    private float D;
    private final static float c = 90.0f;
    private final static float a = 200.0f;
    private final static List<MovementInputState> k;
    private boolean g;
    private final static float M = 83.0f;
    private int L;
    private final static float[] j;
    private final static float m = 60.0f;
    private float h;
    private boolean l;
    final public static FeatureSupport_432 I;
    private final static float[] d;
    private final static float i = 45.0f;
    private final static int f = 3;
    private float H;
    private final static float e = 0.1f;

    /*
     * Unable to fully structure code
     */
    private float L() {
        block6: {
            block7: {
                block8: {
                    block4: {
                        block5: {
                            var1_2 = this;
a = FeatureSupport_432.e.thePlayer.rotationYaw;
                            var5_3 = FeatureSupport_432.e.gameSettings.keyBindForward.isKeyDown();
                            var4_4 = FeatureSupport_432.e.gameSettings.keyBindBack.isKeyDown();
                            var3_5 = FeatureSupport_432.e.gameSettings.keyBindLeft.isKeyDown();
                            var2_6 = FeatureSupport_432.e.gameSettings.keyBindRight.isKeyDown();
                            if (!var5_3 || var4_4) break block4;
                            if (!var3_5 || var2_6) break block5;
                            v0 = a = a - 45.0f;
                            break block6;
                        }
                        if (!var2_6 || var3_5) ** GOTO lbl32
                        v0 = a = a + 45.0f;
                        break block6;
                    }
                    if (!var4_4 || var5_3) break block7;
                    a += 180.0f;
                    if (!var3_5 || var2_6) break block8;
                    v0 = a = a + 45.0f;
                    break block6;
                }
                if (!var2_6 || var3_5) ** GOTO lbl32
                v0 = a = a - 45.0f;
                break block6;
            }
            if (var3_5 && !var2_6) {
                v0 = a = a - 90.0f;
            } else {
                if (var2_6 && !var3_5) {
                    a += 90.0f;
                }
lbl32:
                // 5 sources

                v0 = a;
            }
        }
        a = v0 % 360.0f;
        if (v1 < 0.0f) {
            return a + 360.0f;
        }
        return a;
    }

    private FeatureSupport_432() {
        super("HypixelSprint");
        FeatureSupport_432 a;
    }

    @Override
    public PlacementResult L(Vec3 vec3, boolean bl, UtilitySupport_513 class_513, ItemStack itemStack) {
        FeatureSupport_432 class_432 = itemStack2;
        ItemStack itemStack2 = itemStack;
        FeatureSupport_432 a = class_432;
return null;
    }

    /*
     * WARNING - void declaration
     */
    private MovementInputState L(float f2) {
        FeatureSupport_432 class_432 = this;
MovementInputState class_478 = MovementInputState.h;
        float f3 = Float.MAX_VALUE;
        for (MovementInputState a : k) {
            float f4;
            void a2;
            float f5 = Math.abs(MathHelper.wrapAngleTo180_float(UtilitySupport_477.L(class_432.h, a) - a2));
            if (!(f4 < f3)) continue;
            f3 = f5;
            class_478 = a;
        }
        return class_478;
    }

    @Override
    protected void D() {
        FeatureSupport_432 a;
FeatureSupport_432 class_432 = a;
        FeatureSupport_432 class_4322 = a;
        class_4322.l = 0;
        class_432.g = class_4322.B = 0;
        class_432.L = 0;
        if (FeatureSupport_432.e.thePlayer == null) {
            return;
        }
        FeatureSupport_432 class_4323 = a;
        a.h = FeatureSupport_432.e.thePlayer.rotationYaw;
        class_4323.D = 83.0f;
        class_4323.H = a.L() - 180.0f;
        a.A = 83.0f;
    }

    @EventHandler
    private void L(TickEndEvent class_626) {
        TickEndEvent a = class_626;
        FeatureSupport_432 a2 = this;
if (FeatureSupport_432.e.thePlayer == null) {
            return;
        }
        FeatureSupport_432.e.thePlayer.rotationYawHead = a = a2.L() - 180.0f;
        FeatureSupport_432.e.thePlayer.renderYawOffset = 9;
    }

    @Override
    protected void d() {
ProtocolSupport_207.I.L((ProtocolSupport_212)null);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-500)
    private void L(EventSupport_625 class_625) {
        void a;
        FeatureSupport_432 class_432 = this;
MovementInputState a22 = a.L();
        if (FeatureSupport_432.L() != ProtocolMode_213.f || !a22.i()) {
            return;
        }
        float a22 = UtilitySupport_477.L(FeatureSupport_432.e.thePlayer.rotationYaw, a22);
        a.L(class_432.L(0));
    }

    private ProtocolSupport_212 L() {
        FeatureSupport_432 a;
FeatureSupport_432 class_432 = a;
        return new ProtocolSupport_212(class_432.h, class_432.D, --1 != 0);
    }

    /*
     * WARNING - void declaration
     */
    private MovingObjectPosition L(float f2, float f3) {
        void a;
        void a2;
        FeatureSupport_432 class_432 = this;
Entity entity = e.getRenderViewEntity();
        Vec3 a3 = entity.getPositionEyes(1.0f);
        return RayTraceUtils.L(4.5, RayTraceMode.f, 0 != 0, a3, Vec3.directionFromRotation((float)a2, (float)a), entity);
    }

    /*
     * WARNING - void declaration
     */
    private MovingObjectPosition L(BlockPos blockPos) {
        int n;
        void a;
        FeatureSupport_432 class_432 = this;
if (!BlockUtils.L(BlockUtils.d((BlockPos)a), (BlockPos)a, null)) {
            return null;
        }
        Object a2 = null;
        EnumFacing enumFacing = null;
        double d = Double.MAX_VALUE;
        int n2 = -3;
        while (n2 <= 3) {
            int n3 = -2;
            while (n3 <= 0) {
                int n4;
                int n5 = -3;
                while (n5 <= 3) {
                    EnumFacing enumFacing2;
                    int n6;
                    BlockPos blockPos2 = a.add(-3, n4, n6);
                    if (!BlockUtils.d(blockPos2) && (enumFacing2 = FeatureSupport_432.L(blockPos2, (BlockPos)a)) != EnumFacing.DOWN) {
                        double d2;
                        double d3 = FeatureSupport_432.e.thePlayer.getDistanceSqToCenter(blockPos2);
                        if (!(d2 >= d)) {
                            d = d3;
                            a2 = blockPos2;
                            enumFacing = enumFacing2;
                        }
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        if (a2 == null) {
            return null;
        }
        return new MovingObjectPosition(Vec3.atCenterOf((Vec3i)a2), enumFacing, (BlockPos)a2);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-500)
    private void L(EventSupport_624 class_624) {
        void a;
        FeatureSupport_432 class_432 = this;
ProtocolMode_213 a2 = FeatureSupport_432.L();
        if (a2 != ProtocolMode_213.f && a2 != ProtocolMode_213.i) {
            return;
        }
        a.d(class_432.h);
    }

    private static EnumFacing L(BlockPos blockPos, BlockPos blockPos2) {
        BlockPos a22 = blockPos2;
        BlockPos a = blockPos;
BlockPos blockPos3 = a22;
        int a22 = blockPos3.getX() - a.getX();
        int n = blockPos3.getY() - a.getY();
        int n2 = blockPos3.getZ() - a.getZ();
        if (Math.abs(0) >= Math.abs(0) && Math.abs(0) >= Math.abs(n2)) {
            if (0 > 0) {
                return EnumFacing.EAST;
            }
            return EnumFacing.WEST;
        }
        if (Math.abs(0) >= Math.abs(0) && Math.abs(0) >= Math.abs(n2)) {
            if (0 > 0) {
                return EnumFacing.UP;
            }
            return EnumFacing.DOWN;
        }
        if (n2 > 0) {
            return EnumFacing.SOUTH;
        }
        return EnumFacing.NORTH;
    }

    static {
        I = new FeatureSupport_432();
        j = FeatureSupport_432.L(180.0f);
        d = FeatureSupport_432.L(90.0f);
        k = List.of(MovementInputState.h, MovementInputState.g, MovementInputState.L, MovementInputState.M, MovementInputState.l, MovementInputState.j, MovementInputState.H, MovementInputState.I);
    }

    /*
     * WARNING - void declaration
     */
    private ProtocolSupport_212 L(MovingObjectPosition movingObjectPosition) {
        int n;
        FeatureSupport_432 class_432 = this;
float f2 = class_432.L() + 90.0f;
        float[] fArray = j;
        int n2 = j.length;
        int n3 = 0;
        while (n3 < 0) {
            float f3 = fArray[0];
            float[] fArray2 = d;
            int n4 = d.length;
            int n5 = 0;
            while (n5 < n4) {
                void a;
                int n6;
                float a2 = fArray2[n6];
                float f4 = f2 + f3;
                MovingObjectPosition movingObjectPosition2 = class_432.L(f4, a2 = MathHelper.clamp_float(0, -90.0f, 90.0f));
                if (movingObjectPosition2 != null && movingObjectPosition2.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && movingObjectPosition2.getBlockPos().equals(a.getBlockPos()) && movingObjectPosition2.sideHit == a.sideHit) {
                    return new ProtocolSupport_212(f4, 0);
                }
                n5 = ++n6;
            }
            n3 = ++n;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private void I() {
        var1_2 = this;
if (var1_2.B) {
            return;
        }
        var1_2.B = 3 & 5;
        a = (float)(200.0 - Math.random());
        v0 = var1_2;
        var1_2.h += MathHelper.clamp_float(MathHelper.wrapAngleTo180_float(v0.H - v0.h), -a, a);
        var2_3 = FeatureSupport_432.e.thePlayer.rotationYaw;
        v1 = var1_2;
        var1_2.h = var2_3 + MathHelper.wrapAngleTo180_float(v1.h - var2_3);
        v2 = var1_2;
        v1.D += MathHelper.clamp_float(MathHelper.wrapAngleTo180_float(v2.A - v2.D), -a, a);
        if (!(Math.abs(MathHelper.wrapAngleTo180_float(v3.h - var1_2.H)) <= 0.1f)) ** GOTO lbl-1000
        v4 = var1_2;
        if (Math.abs(MathHelper.wrapAngleTo180_float(v4.D - v4.A)) <= 0.1f) {
            v5 = 3 >> 1;
        } else lbl-1000:
        // 2 sources

        {
            v5 = 0;
        }
        var1_2.l = v5;
    }

    private void L(BlockPos blockPos) {
        Object a = blockPos;
        FeatureSupport_432 a2 = this;
a = a2.L((BlockPos)a);
        if (a == null) {
            return;
        }
        ProtocolSupport_212 class_212 = a2.L((MovingObjectPosition)a);
        if (class_212 == null) {
            FeatureSupport_432 class_432 = a2;
            class_432.l = 0;
            class_432.B = 1;
            return;
        }
        FeatureSupport_432 class_432 = a2;
        class_432.H = class_212.L();
        class_432.A = class_212.i();
        a2.I();
        if (FeatureSupport_432.e.gameSettings.keyBindJump.isKeyDown() && FeatureSupport_432.e.thePlayer.onGround) {
            a2.l = 0;
        }
        if (!a2.l) {
            return;
        }
        if (a2.L(((MovingObjectPosition)a).getBlockPos())) {
            BlockUtils.L((MovingObjectPosition)a);
            FeatureSupport_432.e.thePlayer.swingItem();
        }
        a2.L = 10;
    }

    @EventHandler(priority=1000)
    private void L(TickEvent class_618) {
        FeatureSupport_432 class_432 = this;
if (FeatureSupport_432.e.thePlayer == null || FeatureSupport_432.e.theWorld == null || FeatureSupport_432.e.playerController == null) {
            return;
        }
        if (class_432.L > 0) {
            class_432.L -= 1;
        }
        class_432.B = 0;
        boolean a = Scaffold.E.h();
        BlockPos a2 = new BlockPos(FeatureSupport_432.e.thePlayer).down();
        if (a && BlockUtils.d(a2)) {
            class_432.L(a2);
        }
        if (class_432.L == (a2 = 10 - ((a2 = Math.abs(MathHelper.wrapAngleTo180_float((a = class_432.L() + 45.0f) - class_432.h))) > 60.0f ? 2 : 1)) && !FeatureSupport_432.e.gameSettings.keyBindJump.isKeyDown() && class_432.g) {
            class_432.h = a;
        }
        if (FeatureSupport_432.e.thePlayer.onGround && FeatureSupport_432.e.gameSettings.keyBindJump.isKeyDown()) {
            class_432.h = class_432.L();
        }
        if (FeatureSupport_432.L() == ProtocolMode_213.I) {
            ProtocolSupport_210.L(FeatureSupport_432.e.thePlayer, class_432.L());
            ProtocolSupport_207.I.L((ProtocolSupport_212)null);
            v0 = class_432;
        } else {
            ProtocolSupport_207.I.L(class_432.L());
            v0 = class_432;
        }
        v0.g = true;
    }

    private boolean L(BlockPos blockPos) {
        double d;
        BlockPos a = blockPos;
        FeatureSupport_432 a2 = this;
double d2 = d = (double)FeatureSupport_432.e.playerController.getBlockReachDistance();
        if (FeatureSupport_432.e.thePlayer.getPositionEyes(1.0f).squareDistanceTo(Vec3.atCenterOf(a)) <= d2 * d2) {
            return 3 >> 1;
        }
        return false;
    }

    @EventHandler(priority=-500)
    private void L(EventSupport_616 class_616) {
        EventSupport_616 a = class_616;
        FeatureSupport_432 a2 = this;
ProtocolMode_213 enum_213 = FeatureSupport_432.L();
        float f2 = enum_213 == ProtocolMode_213.f || enum_213 == ProtocolMode_213.i ? a2.h : a.d();
        Object object = a;
        ((EventSupport_616)object).L(UtilitySupport_477.L(a.d(), ((EventSupport_616)object).L(), f2));
    }

    private static float[] L(float f2) {
        int n;
        float f3 = f2;
ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(Float.valueOf(0.0f));
        float a22 = 1.0f;
        float f4 = a22;
        while (f4 <= 20.0f) {
            arrayList.add(Float.valueOf(-a22));
            arrayList.add(Float.valueOf(a22));
            f4 = a22 += 1.0f;
        }
        float f5 = 22.0f;
        while (f5 <= f3) {
            arrayList.add(Float.valueOf(-22.0f));
            arrayList.add(Float.valueOf(22.0f));
            f5 = a22 += 2.0f;
        }
        float[] a22 = new float[arrayList.size()];
        int n2 = 0;
        while (n2 < a22.length) {
            int n3 = n++;
            a22[n3] = ((Float)arrayList.get(n3)).floatValue();
            n2 = 0;
        }
        return a22;
    }

    private static ProtocolMode_213 L() {
return Scaffold.E.P.L();
    }
}

