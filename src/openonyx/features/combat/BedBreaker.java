/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.combat;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.TickEvent;
import openonyx.core.OnyxClient;
import openonyx.events.GeometryUtils;
import openonyx.events.RotationManager;
import openonyx.events.RotationMath;
import openonyx.events.Rotation;
import openonyx.events.RotationFixMode;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.combat.BedTracker;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.SwingMode;
import openonyx.render.group_i.RenderSupport_142;
import openonyx.render.internal.RenderSupport_175;
import openonyx.utilities.Timer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BedBreaker
extends Module {
    private boolean a;
    public BooleanSetting k;
    public NumberSetting g;
    public BooleanSetting M;
    private BlockPos L;
    private int j;
    private BlockPos m;
    public BooleanSetting h;
    private BlockPos l;
    public EnumSetting<RotationFixMode> I;
    private final static long d = 10L;
    public EnumSetting<SwingMode> i;
    private final static long f = 400L;
    private final Timer H;
    private final Timer e;

    /*
     * WARNING - void declaration
     */
    private EnumFacing L(BlockPos blockPos, Rotation class_535) {
        void a;
        Object a2 = class_535;
        BedBreaker a3 = this;
Vec3 vec3 = GeometryUtils.L();
        a2 = GeometryUtils.L(((Rotation)a2).d(), ((Rotation)a2).L());
        double d = (double)a3.g.L() + 1.0;
        a2 = vec3.addVector(((Vec3)a2).xCoord * d, ((Vec3)a2).yCoord * d, ((Vec3)a2).zCoord * d);
        boolean bl = 5 >> 3;
        a2 = ((Minecraft)((Object)BedBreaker.e)).theWorld.rayTraceBlocks(vec3, (Vec3)a2, bl, bl, bl);
        if (a2 != null && ((MovingObjectPosition)a2).typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && a.equals(((MovingObjectPosition)a2).getBlockPos()) && ((MovingObjectPosition)a2).sideHit != null) {
            return ((MovingObjectPosition)a2).sideHit;
        }
        return a3.L((BlockPos)a);
    }

    /*
     * WARNING - void declaration
     */
    private BlockPos L(BlockPos blockPos) {
        int n;
        void a;
        BedBreaker class_388 = this;
Vec3 vec3 = GeometryUtils.L();
        int n2 = 0;
        Object object = null;
        double d = -1.0;
        double d2 = Double.MAX_VALUE;
        int n3 = 0;
        BlockPos[] blockPosArray = class_388.L((BlockPos)a);
        int n4 = blockPosArray.length;
        int n5 = 0;
        while (n5 < n4) {
            BlockPos blockPos2 = blockPosArray[0];
            EnumFacing[] enumFacingArray = new EnumFacing[5];
            enumFacingArray[0] = EnumFacing.UP;
            enumFacingArray[1] = EnumFacing.NORTH;
            enumFacingArray[2] = EnumFacing.EAST;
            enumFacingArray[3] = EnumFacing.SOUTH;
            enumFacingArray[4] = EnumFacing.WEST;
            EnumFacing[] enumFacingArray2 = enumFacingArray;
            int n6 = enumFacingArray.length;
            int n7 = 0;
            while (n7 < n6) {
                Block block;
                int n8;
                Object a2 = enumFacingArray2[n8];
                if (class_388.L((BlockPos)(a2 = blockPos2.offset((EnumFacing)a2)), block = ((Minecraft)((Object)BedBreaker.e)).theWorld.getBlockState((BlockPos)a2).getBlock())) {
                    n2 = 1;
                } else if (!(block instanceof BlockBed) && class_388.L((BlockPos)a2)) {
                    double d3;
                    double d4 = class_388.L((BlockPos)a2, block);
                    if (!(d3 <= 0.0)) {
                        if (((Vec3i)a2).equals(class_388.l)) {
                            n3 = 1;
                        }
                        Vec3 vec32 = vec3;
                        double d5 = vec32.squareDistanceTo(GeometryUtils.L(vec32, class_388.L((BlockPos)a2)));
                        if (d4 > d || d4 == d && d5 < d2) {
                            d = d4;
                            d2 = d5;
                            object = a2;
                        }
                    }
                }
                n7 = ++n8;
            }
            n5 = ++n;
        }
        if (n2 != 0) {
            return a;
        }
        if (n3 != 0) {
            return class_388.l;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    private float L(ItemStack itemStack, Block block) {
        void a;
        float f2;
        ItemStack a2 = itemStack;
        BedBreaker a3 = this;
if (a2 == null) {
            return 1.0f;
        }
        float f3 = f2 = !a2.canHarvestBlock((Block)a) && a2.getItem() instanceof ItemPickaxe ? 1.0f : a2.getStrVsBlock((Block)a);
        if (a2.getItem() instanceof ItemTool && f2 > 1.0f && (a2 = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, a2)) > 0) {
            int n = 4.0f;
            f2 += (float)(n * n + 1);
        }
        return f2;
    }

    @EventHandler
    public void L(TickEvent class_618) {
        Object a;
        BedBreaker class_388 = this;
if (((Minecraft)((Object)BedBreaker.e)).thePlayer == null || ((Minecraft)((Object)BedBreaker.e)).theWorld == null) {
            return;
        }
        if (class_388.k.d() && OnyxClient.l.u.d()) {
            if (OnyxClient.l.u.L() != null) {
                class_388.e.L();
            }
            if (!class_388.e.d(400L)) {
                class_388.h();
                return;
            }
        }
        if ((a = class_388.L()) == null) {
            class_388.h();
            return;
        }
        BlockPos a2 = class_388.L((BlockPos)a);
        if (a2 == null) {
            class_388.h();
            return;
        }
        BedBreaker class_3882 = class_388;
        class_388.L = a;
        a = RotationMath.L(class_3882.L(a2), RotationManager.L());
        class_388.L(a2, (Rotation)a);
        a = class_3882.L(a2, (Rotation)a);
        class_3882.L(a2);
        ((Minecraft)((Object)BedBreaker.e)).playerController.onPlayerDamageBlock(a2, (EnumFacing)a);
        ((SwingMode)class_3882.i.L()).L();
        BedBreaker class_3883 = class_388;
        class_3883.m = a2;
        class_3883.l = a2;
    }

    private void L(BlockPos blockPos) {
        int a;
        int n;
        Block a2;
        BedBreaker class_388 = this;
a2 = ((Minecraft)((Object)BedBreaker.e)).theWorld.getBlockState((BlockPos)((Object)a2)).getBlock();
        int n2 = n = ((Minecraft)((Object)BedBreaker.e)).thePlayer.inventory.currentItem;
        float f2 = class_388.L(((Minecraft)((Object)BedBreaker.e)).thePlayer.inventory.getStackInSlot(0), a2);
        int n3 = 0;
        while (n3 < 9) {
            float f3;
            float f4 = class_388.L(((Minecraft)((Object)BedBreaker.e)).thePlayer.inventory.getStackInSlot(0), a2);
            if (f3 > f2) {
                f2 = f4;
                n2 = 0;
            }
            n3 = ++a;
        }
        if (n2 == 0) {
            return;
        }
        if (class_388.j == -1) {
            class_388.j = 0;
        }
        ((Minecraft)((Object)BedBreaker.e)).thePlayer.inventory.currentItem = n2;
    }

    /*
     * WARNING - void declaration
     */
    private double L(BlockPos blockPos, Block block) {
        float f2;
        void a;
        BlockPos a22 = blockPos;
        BedBreaker a3 = this;
float a22 = a.getBlockHardness(((Minecraft)((Object)BedBreaker.e)).theWorld, a22);
        if (f2 < 0.0f) {
            return -1.0;
        }
        if (0 == 0.0f) {
            return Double.MAX_VALUE;
        }
        return a3.L((Block)a) / 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(BlockPos blockPos, Rotation class_535) {
        void a;
        Rotation a2 = class_535;
        BedBreaker a3 = this;
if (a3.h.d()) {
            RotationManager.L(a2, (RotationFixMode)((Object)a3.I.L()));
            return;
        }
        if (!a.equals(a3.m)) {
            RotationManager.L(a2, (RotationFixMode)((Object)a3.I.L()));
            a3.H.L();
            a3.a = 1;
            return;
        }
        if (a3.a && a3.H.d(10L)) {
            RotationManager.d();
            a3.a = 0;
        }
    }

    public BedBreaker() {
        BedBreaker a;
        BedBreaker class_388 = a;
        BedBreaker class_3882 = a;
        super("BedBreaker", "Breaks nearby beds with the best tool", ModuleCategory.d);
        BedBreaker class_3883 = a;
        a.g = new NumberSetting("Range", 4.5, 1.0, 6.0, 0.05).d("m");
        class_3883.I = new EnumSetting<RotationFixMode>("Move fix", RotationFixMode.H).L("Keeps movement consistent with the rotation the server sees");
        a.i = new EnumSetting<SwingMode>("Swing", SwingMode.H).L("How the mining swing is shown");
        a.h = new BooleanSetting("Keep rotation", 0 != 0).L("Holds the aim on the block the whole time instead of a brief flick per block");
        a.M = new BooleanSetting("Ignore own bed", --1 != 0).L("Skips your team's bed, found from the BedWars start message and base teleport");
        class_3882.k = new BooleanSetting("Prioritize KillAura", 5 >> 3).L("Pauses bed breaking while KillAura has a target so attacks take priority");
        class_388.j = -1;
        class_3882.H = new Timer();
        class_388.e = new Timer();
    }

    @Override
    protected void D() {
        BedBreaker a;
a.h();
    }

    /*
     * WARNING - void declaration
     */
    private BlockPos[] L(BlockPos blockPos) {
        void a;
        BedBreaker class_388 = this;
Object a2 = ((Minecraft)((Object)BedBreaker.e)).theWorld.getBlockState((BlockPos)a);
        if (!(a2.getBlock() instanceof BlockBed)) {
            BlockPos[] blockPosArray = new BlockPos[1];
            blockPosArray[0] = a;
            return blockPosArray;
        }
        BlockBed.EnumPartType enumPartType = a2.getValue(BlockBed.PART);
        a2 = a2.getValue(BlockBed.FACING);
        a2 = a.offset((EnumFacing)(enumPartType == BlockBed.EnumPartType.HEAD ? ((EnumFacing)a2).getOpposite() : a2));
        BlockPos[] blockPosArray = new BlockPos[2];
        blockPosArray[0] = a;
        blockPosArray[1] = a2;
        return blockPosArray;
    }

    public BlockPos D() {
        BedBreaker a;
return a.l;
    }

    /*
     * WARNING - void declaration
     */
    private float L(Block block) {
        int n;
        BedBreaker class_388 = this;
float a = 1.0f;
        int n2 = 0;
        while (n2 < 9) {
            void a2;
            ItemStack itemStack = ((Minecraft)((Object)BedBreaker.e)).thePlayer.inventory.getStackInSlot(0);
            a = Math.max(0, class_388.L(itemStack, (Block)a2));
            n2 = ++n;
        }
        return 0;
    }

    private void h() {
        BedBreaker a;
if (a.l != null) {
            ((Minecraft)((Object)BedBreaker.e)).playerController.resetBlockRemoving();
            a.l = null;
        }
        if (a.j != -1) {
            if (((Minecraft)((Object)BedBreaker.e)).thePlayer != null) {
                ((Minecraft)((Object)BedBreaker.e)).thePlayer.inventory.currentItem = a.j;
                if (((Minecraft)((Object)BedBreaker.e)).playerController != null) {
                    ((Minecraft)((Object)BedBreaker.e)).playerController.syncCurrentPlayItem();
                }
            }
            a.j = -1;
        }
        BedBreaker class_388 = a;
        class_388.m = null;
        class_388.L = null;
        a.a = 0;
        RotationManager.d();
    }

    /*
     * WARNING - void declaration
     */
    private EnumFacing L(BlockPos blockPos) {
        int n;
        BedBreaker class_388 = this;
Vec3 vec3 = GeometryUtils.L();
        Object object = EnumFacing.UP;
        double d = Double.MAX_VALUE;
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n2 = enumFacingArray.length;
        int n3 = 0;
        while (n3 < n2) {
            void a;
            EnumFacing a2 = enumFacingArray[0];
            if (BlockUtils.d(a.offset(a2))) {
                double d2;
                Vec3 vec32 = new Vec3((double)a.getX() + 0.5 + (double)a2.getFrontOffsetX() * 0.5, (double)a.getY() + 0.5 + (double)a2.getFrontOffsetY() * 0.5, (double)a.getZ() + 0.5 + (double)a2.getFrontOffsetZ() * 0.5);
                double d3 = vec3.squareDistanceTo(vec32);
                if (d2 < d) {
                    d = d3;
                    object = a2;
                }
            }
            n3 = ++n;
        }
        return object;
    }

    private boolean L(BlockPos blockPos) {
        BlockPos a = blockPos;
        BedBreaker a2 = this;
double d = a2.g.L();
        Vec3 vec3 = GeometryUtils.L();
        double d2 = 0.0;
        if (vec3.squareDistanceTo(GeometryUtils.L(vec3, a2.L(a))) <= d2 * d2) {
            return --1 != 0;
        }
        return false;
    }

    @EventHandler
    public void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        BedBreaker a2 = this;
a2.h();
    }

    private AxisAlignedBB L(BlockPos blockPos) {
        BlockPos a = blockPos;
        BedBreaker a2 = this;
return BlockUtils.L(a).offset(a.getX(), a.getY(), a.getZ());
    }

    public BlockPos d() {
        BedBreaker a;
return a.L;
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(BlockPos blockPos, Block block) {
        void a;
        Block a2 = block;
        BedBreaker a3 = this;
return BlockUtils.d((BlockPos)a) || a2.getMaterial().isReplaceable();
    }

    private BlockPos L() {
        int n;
        BedBreaker class_388 = this;
BedBreaker class_3882 = class_388;
        double d = class_3882.g.L();
        double d2 = d * d;
        Vec3 vec3 = GeometryUtils.L();
        if (!(class_3882.L == null || !(((Minecraft)((Object)BedBreaker.e)).theWorld.getBlockState(class_388.L).getBlock() instanceof BlockBed) || class_388.M.d() && BedTracker.l.L(class_388.L))) {
            Vec3 vec32 = vec3;
            BedBreaker class_3883 = class_388;
            if (vec32.squareDistanceTo(GeometryUtils.L(vec32, class_3883.L(class_3883.L))) <= d2) {
                return class_388.L;
            }
        }
        BlockPos blockPos = new BlockPos(((Minecraft)((Object)BedBreaker.e)).thePlayer);
        int a = (int)Math.ceil(d);
        BlockPos blockPos2 = null;
        d = Double.MAX_VALUE;
        int n2 = 0;
        while (n2 <= 0) {
            int n3 = 0;
            while (n3 <= 0) {
                int n4;
                int n5 = 0;
                while (n5 <= 0) {
                    int n6;
                    BlockPos blockPos3 = blockPos.add(0, n4, n6);
                    if (!(!(((Minecraft)((Object)BedBreaker.e)).theWorld.getBlockState(blockPos3).getBlock() instanceof BlockBed) || class_388.M.d() && BedTracker.l.L(blockPos3))) {
                        double d3;
                        Vec3 vec33 = vec3;
                        double d4 = vec33.squareDistanceTo(GeometryUtils.L(vec33, class_388.L(blockPos3)));
                        if (!(d3 > d2) && d4 < d) {
                            d = d4;
                            blockPos2 = blockPos3;
                        }
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return blockPos2;
    }

    private Vec3 L(BlockPos blockPos) {
        BlockPos a = blockPos;
        BedBreaker a2 = this;
return GeometryUtils.L(GeometryUtils.L(), a2.L(a));
    }
}

