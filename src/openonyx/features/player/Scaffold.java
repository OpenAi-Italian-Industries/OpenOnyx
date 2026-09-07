/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.EventSupport_615;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.movement.SafeWalk;
import openonyx.features.player.FeatureSupport_412;
import openonyx.features.player.FeatureMode_409;
import openonyx.features.player.internal.FeatureSupport_417;
import openonyx.features.player.internal.FeatureSupport_418;
import openonyx.features.player.internal.FeatureSupport_420;
import openonyx.features.player.internal.group_d.FeatureSupport_422;
import openonyx.features.player.internal.group_m.FeatureSupport_425;
import openonyx.features.player.internal.group_m.FeatureSupport_426;
import openonyx.features.player.internal.group_m.FeatureSupport_427;
import openonyx.features.player.internal.group_m.FeatureSupport_430;
import openonyx.features.player.internal.group_m.FeatureSupport_431;
import openonyx.features.player.internal.group_m.FeatureSupport_432;
import openonyx.features.player.internal.group_m.FeatureSupport_435;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_438;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_439;
import openonyx.features.player.internal.group_m.internal.FeatureSupport_440;
import openonyx.features.player.internal.internal.FeatureSupport_441;
import openonyx.features.player.internal.internal.FeatureSupport_442;
import openonyx.features.player.internal.internal.FeatureSupport_445;
import openonyx.features.player.internal.internal.FeatureSupport_446;
import openonyx.features.player.internal.internal.FeatureSupport_447;
import openonyx.features.player.internal.internal.FeatureSupport_448;
import openonyx.features.player.internal.internal.FeatureSupport_449;
import openonyx.features.player.internal.internal.FeatureSupport_450;
import openonyx.features.player.internal.internal.FeatureSupport_451;
import openonyx.features.player.internal.internal.FeatureListener_444;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_034;
import openonyx.history.ModeSetting;
import openonyx.history.ModeOption;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.SwingMode;
import openonyx.interaction.internal.PlacementResult;
import openonyx.movement.MovementSupport_088;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.ProtocolSupport_209;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.ui.internal.UiSupport_593;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_489;
import openonyx.utilities.UtilitySupport_497;
import openonyx.utilities.UtilitySupport_499;
import openonyx.utilities.BlockItemUtils;
import openonyx.utilities.UtilityMode_487;
import openonyx.utilities.internal.UtilitySupport_513;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Scaffold
extends Module {
    private transient boolean u;
    final public static UtilitySupport_489<ItemStack> y;
    private final static UtilitySupport_489<ItemStack> n;
    private transient boolean Y;
    public FeatureSupport_447 r;
    private transient int W;
    public FeatureSupport_418 P;
    public FeatureSupport_449 V;
    public ModeSetting<ModeOption> R;
    public FeatureSupport_446 p;
    private transient int t;
    private transient int b;
    final public static Scaffold E;
    public FeatureSupport_442 F;
    public EnumSetting<SwingMode> G;
    private transient boolean A;
    public FeatureSupport_450 K;
    private transient MovementInputState B;
    public BooleanSetting C;
    public ModeSetting<ModeOption> J;
    public NumberSetting D;
    private transient boolean c;
    public BooleanSetting a;
    public FeatureSupport_448 k;
    public BooleanSetting g;
    private transient PlacementResult M;
    public EnumSetting<FeatureMode_409> L;
    private transient int j;
    private transient Block m;
    private transient int h;
    public RangeSetting l;
    private transient int I;
    public FeatureSupport_445 d;
    public ModeSetting<FeatureSupport_431> i;
    public BooleanSetting f;
    private transient UtilitySupport_513 H;
    private final static int e = 1;

    private void e() {
        Scaffold class_408 = this;
if (!class_408.l()) {
            return;
        }
        if (Scaffold.e.thePlayer.onGround) {
            int a = new BlockPos(Scaffold.e.thePlayer).getY() - 1;
            int n = class_408.c = !Scaffold.k() && !class_408.A && 0 == class_408.h + 1 ? 1 : 0;
            if (!class_408.c) {
                class_408.h = 0;
            }
            Scaffold class_4082 = class_408;
            class_4082.Y = 0;
            class_4082.A = 0;
            class_408.b += 1;
        }
        if (Scaffold.e.gameSettings.keyBindJump.isKeyDown()) {
            Scaffold class_4083 = class_408;
            Scaffold class_4084 = class_408;
            class_4083.I = new BlockPos(Scaffold.e.thePlayer).getY();
            class_4083.b = 2;
        }
        Scaffold class_4085 = class_408;
        PlacementResult a = class_4085.M;
        Object object = class_4085.L();
        ProtocolSupport_212 class_212 = class_4085.L().L();
        object = ((FeatureSupport_431)object).L(a, class_212);
        int n = class_4085.l.i();
        boolean bl = FeatureSupport_420.d(Scaffold.e.thePlayer.inventory.getCurrentItem());
        if (((Boolean)FeatureSupport_449.i.H.L()).booleanValue()) {
            bl = class_408.L(bl);
        }
        if (a == null || object == null) {
            return;
        }
        if (!a.L((MovingObjectPosition)object) || !class_408.L((MovingObjectPosition)object)) {
            return;
        }
        if (!((Boolean)FeatureSupport_449.i.H.L()).booleanValue()) {
            bl = class_408.L(bl);
        }
        if (!bl) {
            return;
        }
        boolean[] blArray = new boolean[1];
        int n2 = 0;
        blArray[n2] = n2;
        boolean[] blArray2 = blArray;
        Vec3 vec3 = class_408.H != null ? FeatureSupport_450.I.L(class_408.H) : null;
        BlockUtils.L((MovingObjectPosition)object, () -> {
            void a;
            Object a2 = blArray2;
            Scaffold a3 = this;
a3.L(a.d());
            a3.M = null;
            a2[0] = 1;
            return 1 != 0;
        }, () -> {
return 5 >> 2;
        }, (SwingMode)class_408.G.L());
        if (blArray2[0]) {
            if (class_408.L(a.d())) {
                class_408.Y = 1;
            }
            FeatureSupport_450.I.L(class_408.H, vec3);
            class_408.t = Math.max(0, -1);
        }
    }

    @Override
    protected void D() {
        Scaffold a;
Scaffold class_408 = a;
        class_408.h();
        class_408.k();
    }

    private List<FeatureSupport_412> D() {
        int a;
        Scaffold class_408 = this;
ArrayList<FeatureSupport_412> arrayList = new ArrayList<FeatureSupport_412>(9);
        if (!class_408.l()) {
            return arrayList;
        }
        int n = 0;
        while (n <= 8) {
            ItemStack itemStack = Scaffold.e.thePlayer.inventory.getStackInSlot(0);
            if (FeatureSupport_420.d(itemStack)) {
                arrayList.add(new FeatureSupport_412(0, itemStack));
            }
            n = ++a;
        }
        return arrayList;
    }

    private Integer L() {
        Scaffold class_408 = this;
Object a = class_408.D();
        int n = FeatureSupport_449.i.f.d();
        Comparator comparator = (class_412, class_4122) -> {
            FeatureSupport_412 a = class_4122;
            FeatureSupport_412 a2 = class_412;
return n.compare(a2.L(), a.L());
        };
        a = a.stream().filter(class_412 -> {
            FeatureSupport_412 a = class_412;
            int a2 = 0;
if (a.L().stackSize > a2) {
                return --1 != 0;
            }
            return false;
        }).max(comparator).orElseGet(() -> Scaffold.L((List)a, comparator));
        if (a != null) {
            return ((FeatureSupport_412)a).L();
        }
        return null;
    }

    private static BlockPos L(BlockPos blockPos, int n) {
        int a = -35;
        BlockPos a2 = blockPos;
return new BlockPos(a2.getX(), 0, a2.getZ());
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Scaffold a2 = this;
Scaffold class_408 = a2;
        class_408.k();
        class_408.u = 0;
        if (class_408.f.d()) {
            a2.l();
        }
    }

    private void L(BlockPos blockPos) {
        BlockPos a = blockPos;
        Scaffold a2 = this;
if (!a2.L(a)) {
            FeatureSupport_417.L(a);
        }
        FeatureSupport_439.e.i();
        FeatureSupport_448.I.i();
        FeatureSupport_425.B.h();
    }

    private static boolean k() {
return Scaffold.e.gameSettings.keyBindJump.isKeyDown();
    }

    private void k() {
        Scaffold a;
Scaffold class_408 = a;
        Scaffold class_4082 = a;
        Scaffold class_4083 = a;
        a.t = 0;
        FeatureSupport_417.L();
        FeatureSupport_450.I.i();
        UtilitySupport_497.e.L(a);
        class_4083.m = null;
        class_4083.j = 0;
        class_4082.M = null;
        class_408.c = class_4082.Y = 0;
        class_408.A = 0;
    }

    private boolean F() {
        Scaffold a;
if (!FeatureSupport_438.f.D() || a.Y || a.c) {
            return false;
        }
        if (!UtilitySupport_477.L(Scaffold.e.thePlayer) || Scaffold.e.thePlayer.onGround) {
            return false;
        }
        if (Scaffold.e.thePlayer.motionY <= 0.0 && Scaffold.e.thePlayer.posY >= (double)a.h + 2.0) {
            return 3 >> 1;
        }
        return false;
    }

    private FeatureSupport_431 L() {
        Scaffold a;
return a.i.L();
    }

    private BlockPos L() {
        Scaffold class_408 = this;
if (!class_408.F()) {
            return null;
        }
        BlockPos a = FeatureSupport_417.L();
        if (a == null || a.getY() != class_408.h) {
            return null;
        }
        return a.up();
    }

    @EventHandler
    private void L(EventSupport_615 class_615) {
        ItemStack itemStack;
        Scaffold class_408;
        Object a = class_615;
        Scaffold a2 = this;
if (!a2.l()) {
            return;
        }
        a = a2.L();
        if (a == null) {
            class_408 = a2;
            a2.m = null;
            itemStack = new ItemStack(Blocks.sandstone, 64);
        } else {
            itemStack = Scaffold.e.thePlayer.inventory.getStackInSlot((Integer)a);
            class_408 = a2;
            a2.m = BlockItemUtils.L(itemStack);
        }
        a = class_408.H;
        Vec3 vec3 = FeatureSupport_450.I.d((UtilitySupport_513)a);
        if (vec3 == null) {
            vec3 = UtilitySupport_477.D((Entity)Scaffold.e.thePlayer);
        }
        boolean bl = FeatureSupport_439.e.D() && FeatureSupport_439.e.L(UtilitySupport_477.L(Scaffold.e.thePlayer)) ? 5 >> 2 : false;
        FeatureSupport_431 class_431 = a2.L();
        a2.M = class_431.L(vec3, bl, (UtilitySupport_513)a, itemStack);
        a = class_431.L(a2.M);
        if (a == null) {
            return;
        }
        Scaffold class_4082 = a2;
        a = class_431.L((ProtocolSupport_212)a, class_4082.P, (Boolean)class_4082.P.f.L());
        ProtocolSupport_207.I.L(a2.P.L(FeatureSupport_446.f.L((ProtocolSupport_209)a)), UtilityMode_487.d, a2);
    }

    public int L() {
        Scaffold class_408 = this;
if (!class_408.l()) {
            return 0;
        }
        int a = 0;
        if (FeatureSupport_449.i.D()) {
            Iterator<FeatureSupport_412> iterator;
            Iterator<FeatureSupport_412> iterator2 = iterator = class_408.D().iterator();
            while (iterator2.hasNext()) {
                FeatureSupport_412 class_412 = iterator.next();
                a += Scaffold.L(class_412.L());
                iterator2 = iterator;
            }
        } else {
            a += Scaffold.L(Scaffold.e.thePlayer.inventory.getCurrentItem());
        }
        return 0;
    }

    private Scaffold() {
        Scaffold a2;
        Scaffold class_408 = a2;
        super("Scaffold", "Places blocks under you", ModuleCategory.i);
        int n = 0;
        a2.l = RangeSetting.L("Delay", n, n, n, 40).L(" ticks").L(Setting.H);
        Scaffold class_4082 = a2;
        class_408.D = new NumberSetting("Min distance", 0.0, 0.0, 0.25, 0.01).L(Setting.H);
        class_4082.V = FeatureSupport_449.i;
        class_408.K = FeatureSupport_450.I;
        ModeOption[] class_041Array = new FeatureSupport_431[6];
        class_041Array[0] = FeatureSupport_427.f;
        class_041Array[1] = FeatureSupport_430.H;
        class_041Array[2] = FeatureSupport_435.i;
        class_041Array[3] = FeatureSupport_426.e;
        class_041Array[4] = FeatureSupport_425.B;
        class_041Array[5] = FeatureSupport_432.I;
        class_408.i = new ModeSetting("Technique", (ModeOption)FeatureSupport_427.f, class_041Array);
        a2.L = new EnumSetting<FeatureMode_409>("Same Y", FeatureMode_409.f);
        a2.C = ((BooleanSetting)new BooleanSetting("Space climb", 0 != 0).L("Climb up normally while the jump key is held")).L(a2.L, a -> {
if (a == FeatureMode_409.l) {
                return 3 >> 1;
            }
            return false;
        });
        Scaffold class_4083 = a2;
        Scaffold class_4084 = a2;
        class_4084.R = Scaffold.L();
        class_4083.J = SafeWalk.L("Safe walk");
        class_4084.G = new EnumSetting<SwingMode>("Swing", SwingMode.H);
        class_4083.P = new FeatureSupport_418();
        class_4083.k = FeatureSupport_448.I;
        class_4083.F = FeatureSupport_442.e;
        class_4083.r = FeatureSupport_447.H;
        class_4083.d = FeatureSupport_445.H;
        class_4083.p = FeatureSupport_446.f;
        class_4083.g = new BooleanSetting("Edge safety", 1 != 0).L("Waits at the edge until the aim is on the block, instead of walking off");
        class_4083.f = ((BooleanSetting)new BooleanSetting("Auto F5", 5 >> 3).L("Drops into third person behind you while scaffolding, and puts the camera back after")).L((T bl) -> {
            Boolean a = bl;
            Scaffold a2 = this;
if (!a2.d()) {
                return;
            }
            Scaffold class_408 = a2;
            if (a.booleanValue()) {
                class_408.l();
                return;
            }
            class_408.h();
        });
        Scaffold class_4085 = a2;
        class_4085.a = new BooleanSetting("Disable on death", 5 >> 2).L("Turns Scaffold off when you die, so you do not respawn still bridging");
        class_4085.B = MovementInputState.i;
    }

    @Generated
    public MovementInputState L() {
        Scaffold a;
return a.B;
    }

    private static ModeSetting<ModeOption> L() {
SettingSupport_034 class_034 = new SettingSupport_034();
        ModeOption[] class_041Array = new ModeOption[2];
        class_041Array[0] = class_034;
        class_041Array[1] = FeatureSupport_422.H;
        return new ModeSetting("Tower", (ModeOption)class_034, class_041Array).L("Vertical bridging while you hold jump standing still");
    }

    public void F() {
        Scaffold a;
if (a.d() && a.a.d()) {
            a.L(0 != 0);
        }
    }

    public boolean L(MovingObjectPosition movingObjectPosition) {
        Object a = movingObjectPosition;
        Scaffold a2 = this;
if (a == null || ((MovingObjectPosition)a).hitVec == null) {
            return false;
        }
        Object object = a;
        a = ((MovingObjectPosition)object).hitVec.subtract(Scaffold.e.thePlayer.getPositionEyes(1.0f));
        EnumFacing enumFacing = ((MovingObjectPosition)object).sideHit;
        if (enumFacing != null && enumFacing.getAxis() != EnumFacing.Axis.Y) {
            double d;
            double d2 = d = enumFacing == EnumFacing.NORTH || enumFacing == EnumFacing.SOUTH ? ((Vec3)a).zCoord : ((Vec3)a).xCoord;
            if (Math.abs(d) < (double)a2.D.L()) {
                return 5 >> 3;
            }
        }
        return true;
    }

    private boolean l() {
if (Scaffold.e.thePlayer != null && Scaffold.e.theWorld != null && Scaffold.e.playerController != null) {
            return 5 >> 2;
        }
        return false;
    }

    private boolean L(BlockPos blockPos) {
        BlockPos a = blockPos;
        Scaffold a2 = this;
if (a2.L.L() == FeatureMode_409.H && a.getY() == a2.h + 1) {
            return 1 != 0;
        }
        return false;
    }

    private ProtocolSupport_212 L() {
        Scaffold class_408 = this;
ProtocolSupport_212 a = ProtocolSupport_207.I.D();
        if (a != null) {
            return a;
        }
        return UtilitySupport_477.L((Entity)Scaffold.e.thePlayer);
    }

    public boolean h() {
        Scaffold a;
if (!a.l()) {
            return 5 >> 3;
        }
        return a.L(FeatureSupport_420.d(Scaffold.e.thePlayer.inventory.getCurrentItem()));
    }

    private boolean L(boolean bl) {
        boolean a = bl;
        Scaffold a2 = this;
if (FeatureSupport_449.i.D() && !a) {
            Integer n = a2.L();
            if (n != null) {
                UtilitySupport_497.e.L(a2, n, FeatureSupport_449.i.e.d());
                return 1 != 0;
            }
            UtilitySupport_497.e.L(a2);
            return a;
        }
        UtilitySupport_497.e.L(a2);
        return a;
    }

    private static FeatureSupport_412 L(List list, Comparator comparator) {
        Comparator a = comparator;
        List a2 = list;
return a2.stream().max(a).orElse(null);
    }

    @Override
    protected void L() {
        Scaffold a;
if (a.f.d()) {
            a.l();
        }
        if (Scaffold.e.thePlayer == null) {
            return;
        }
        a.h = new BlockPos(Scaffold.e.thePlayer).getY() - 1;
        Scaffold class_408 = a;
        class_408.I = new BlockPos(Scaffold.e.thePlayer).getY();
        a.b = 2;
        FeatureSupport_417.L();
    }

    private void l() {
        Scaffold a;
if (a.u) {
            return;
        }
        a.W = Scaffold.e.gameSettings.thirdPersonView;
        Scaffold.e.gameSettings.thirdPersonView = 1;
        a.u = Scaffold.e.gameSettings.thirdPersonView;
    }

    @EventHandler
    private void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        Scaffold a2 = this;
if (!a2.l()) {
            a2.t = 0;
            return;
        }
        if (!Scaffold.e.thePlayer.onGround && Scaffold.k()) {
            a2.A = 1;
        }
        if (a2.t > 0) {
            a2.t -= 1;
            return;
        }
        a2.e();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-50)
    private void d(EventSupport_625 class_625) {
        void a;
        Scaffold class_408 = this;
if (!class_408.l()) {
            return;
        }
        if (class_408.j > 0) {
            a.d(--1 != 0);
            class_408.j -= 1;
        }
        if (!((Boolean)class_408.g.L()).booleanValue()) {
            return;
        }
        Object a2 = class_408.L();
        ProtocolSupport_212 class_212 = ProtocolSupport_207.I.D();
        if (class_212 == null) {
            class_212 = UtilitySupport_477.L((Entity)Scaffold.e.thePlayer);
        }
        if (((FeatureSupport_451)(a2 = FeatureSupport_441.L(class_408.M, class_212, a2 instanceof FeatureListener_444 ? (FeatureListener_444)a2 : null))).L()) {
            a.L(1 != 0);
        }
        if (((FeatureSupport_451)a2).D()) {
            a.L(MovementInputState.i);
        }
        if (((FeatureSupport_451)a2).d()) {
            a.L(new MovementInputState(3 >> 2, 3 >> 1, a.L().L(), a.L().D()));
        }
        if (((FeatureSupport_451)a2).L() > class_408.j) {
            a.d(1 != 0);
            class_408.j = ((FeatureSupport_451)a2).L();
        }
    }

    private void h() {
        Scaffold a;
if (!a.u) {
            return;
        }
        a.u = 0;
        if (Scaffold.e.gameSettings.thirdPersonView == 1) {
            Scaffold.e.gameSettings.thirdPersonView = a.W;
        }
    }

    private BlockPos d(BlockPos blockPos) {
        BlockPos a = blockPos;
        Scaffold a2 = this;
switch (((FeatureMode_409)a2.L.L()).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return null;
            }
            case 1: {
                if (((Boolean)a2.C.L()).booleanValue() && (Scaffold.k() || a2.A)) {
                    return null;
                }
                return Scaffold.L(a, a2.h);
            }
            case 2: {
                if (Scaffold.e.thePlayer.motionY < 0.2) {
                    return Scaffold.L(a, a2.h);
                }
                return null;
            }
            case 3: {
                if (Scaffold.e.thePlayer.motionY == -0.15233518685055708 && a2.b >= 2) {
                    a2.b = 0;
                    return Scaffold.L(a, a2.I);
                }
                return Scaffold.L(a, a2.I - 1);
            }
            case 4: 
        }
        if (Scaffold.k() || a2.A) {
            return null;
        }
        BlockPos blockPos2 = a2.L();
        if (blockPos2 != null) {
            return blockPos2;
        }
        return Scaffold.L(a, a2.h);
    }

    static {
        E = new Scaffold();
        Comparator[] comparatorArray = new Comparator[7];
        comparatorArray[0] = UtilitySupport_499.i;
        comparatorArray[1] = UtilitySupport_499.d;
        comparatorArray[2] = UtilitySupport_499.f;
        comparatorArray[3] = UtilitySupport_499.m;
        comparatorArray[4] = UtilitySupport_499.L(--1 != 0);
        comparatorArray[5] = UtilitySupport_499.I;
        comparatorArray[6] = UtilitySupport_499.L(0 != 0);
        n = new UtilitySupport_489(comparatorArray);
        Comparator[] comparatorArray2 = new Comparator[7];
        comparatorArray2[0] = UtilitySupport_499.i;
        comparatorArray2[1] = UtilitySupport_499.d;
        comparatorArray2[2] = UtilitySupport_499.f;
        comparatorArray2[3] = UtilitySupport_499.m;
        comparatorArray2[4] = UtilitySupport_499.L(1 != 0);
        comparatorArray2[5] = UtilitySupport_499.H;
        comparatorArray2[6] = UtilitySupport_499.L(3 >> 2);
        y = new UtilitySupport_489(comparatorArray2);
    }

    public BlockPos L(BlockPos blockPos) {
        BlockPos blockPos2;
        BlockPos a = blockPos;
        Scaffold a2 = this;
if (FeatureSupport_440.e.L() && FeatureSupport_440.h()) {
            int n = 0;
            return a.add(n, -2, n);
        }
        if (a2.L.L() == FeatureMode_409.H && (blockPos2 = a2.d(a)) != null) {
            return blockPos2;
        }
        if (Scaffold.e.thePlayer.movementInput.jump && (!UtilitySupport_477.L(Scaffold.e.thePlayer) || Scaffold.e.thePlayer.isCollidedHorizontally)) {
            int n = 0;
            return a.add(n, -1, n);
        }
        blockPos2 = a2.d(a);
        if (blockPos2 != null) {
            return blockPos2;
        }
        int n = 0;
        return a.add(n, -1, n);
    }

    @EventHandler(priority=-10)
    private void L(EventSupport_625 class_625) {
        EventSupport_625 a = class_625;
        Scaffold a2 = this;
if (!a2.l()) {
            return;
        }
        a2.H = null;
        a2.B = a.L();
        if (a.L().equals(MovementInputState.i)) {
            return;
        }
        a2.H = FeatureSupport_417.L(a.L());
    }

    @Generated
    public UtilitySupport_513 L() {
        Scaffold a;
return a.H;
    }

    private static int L(ItemStack a) {
if (FeatureSupport_420.d(a)) {
            return a.stackSize;
        }
        return 0;
    }
}

