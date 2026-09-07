/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3i;
import net.minecraft.world.chunk.Chunk;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_261;
import openonyx.features.render.FeatureSupport_269;
import openonyx.features.render.FeatureSupport_271;
import openonyx.features.render.FeatureSupport_323;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.features.combat.BedTracker;
import openonyx.history.SettingValue;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.interaction.BlockUtils;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_106;
import openonyx.render.RenderSupport_125;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.Timer;

public final class BedESP
extends Module {
    private final static double r = 0.5625;
    final public BooleanSetting W;
    final public NumberSetting P;
    final public BooleanSetting V;
    final public BooleanSetting R;
    final public NumberSetting p;
    final public NumberSetting t;
    private boolean b;
    final public BooleanSetting E;
    final public NumberSetting F;
    final public ColorSetting G;
    final public BooleanSetting A;
    final public BooleanSetting K;
    private final List<BlockPos> B;
    private final static double C = 0.003;
    final public BooleanSetting J;
    private final FeatureSupport_261 D;
    final public NumberSetting c;
    final public NumberSetting a;
    final public NumberSetting k;
    final public ColorSetting g;
    final public BooleanSetting M;
    private final static int L = 8;
    private final List<FeatureSupport_271> j;
    final public BooleanSetting m;
    final public NumberSetting h;
    final public BooleanSetting l;
    final public BooleanSetting I;
    final public ColorSetting d;
    final public ColorSetting i;
    final public NumberSetting f;
    private final List<FeatureSupport_323> H;
    private final Timer e;

    @Override
    protected void L() {
        BedESP a;
a.F();
    }

    /*
     * WARNING - void declaration
     */
    private static List<FeatureSupport_269> L(Map<Integer, int[]> map, Map<Integer, IBlockState> map2) {
        Iterator<Map.Entry<Integer, int[]>> iterator;
        Map<Integer, int[]> map3 = map;
ArrayList a = new ArrayList();
        Iterator<Map.Entry<Integer, int[]>> iterator2 = iterator = map3.entrySet().iterator();
        while (iterator2.hasNext()) {
            void a2;
            Map.Entry<Integer, int[]> entry = iterator.next();
            IBlockState iBlockState = (IBlockState)a2.get(entry.getKey());
            Block block = iBlockState.getBlock();
            Block block2 = block;
            a.add(new FeatureSupport_269(new ItemStack(block2, 1, block2.damageDropped(iBlockState)), block.getLocalizedName(), entry.getValue()[0]));
            iterator2 = iterator;
        }
        a.sort(Comparator.comparingInt(FeatureSupport_269::L).reversed());
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2) {
        void a;
        Object object;
        BedESP class_275;
        block19: {
            block18: {
                class_275 = this;
if (!class_275.d() || ((Minecraft)((Object)BedESP.e)).theWorld == null || ((Minecraft)((Object)BedESP.e)).thePlayer == null) {
                    return;
                }
                if (!class_275.b) break block18;
                BedESP class_2752 = class_275;
                if (!class_2752.e.d(class_2752.p.d())) break block19;
            }
            BedESP class_2753 = class_275;
            class_2753.l();
            class_2753.e.L();
            class_275.b = 1;
        }
        if (class_275.B.isEmpty()) {
            return;
        }
        boolean bl = false;
        BedESP class_2754 = class_275;
        float f3 = class_2754.h.L() / 100.0f;
        Iterator<BlockPos> a2 = (class_2754.I.d() ? class_275.j : List.of()).iterator();
        Iterator<Object> iterator = a2;
        while (iterator.hasNext()) {
            object = (FeatureSupport_271)a2.next();
            AxisAlignedBB axisAlignedBB = class_275.d(((FeatureSupport_271)object).L());
            if (axisAlignedBB == null) {
                iterator = a2;
                continue;
            }
            if (!bl) {
                if (!RenderSupport_106.L((float)a, class_275.m.d())) {
                    return;
                }
                bl = true;
            }
            RenderSupport_106.L(axisAlignedBB, ThemeSupport_064.L(((FeatureSupport_271)object).L(), f3), class_275.c.L(), class_275.E.d() ? ThemeSupport_064.L(((FeatureSupport_271)object).L(), f3 * 0.18f) : 0);
            iterator = a2;
        }
        Iterator<BlockPos> iterator2 = a2 = class_275.B.iterator();
        while (iterator2.hasNext()) {
            int n;
            int n2;
            object = a2.next();
            boolean bl2 = BedTracker.l.L((BlockPos)object);
            if (bl2 && !class_275.R.d()) {
                iterator2 = a2;
                continue;
            }
            if (!bl2 && !class_275.V.d()) {
                iterator2 = a2;
                continue;
            }
            AxisAlignedBB axisAlignedBB = class_275.L((BlockPos)object);
            if (axisAlignedBB == null) {
                iterator2 = a2;
                continue;
            }
            if (!bl) {
                if (!RenderSupport_106.L((float)a, class_275.m.d())) {
                    return;
                }
                bl = true;
            }
            BedESP class_2755 = class_275;
            int n3 = n2 = (bl2 ? class_2755.g.L() : class_2755.G.L()).intValue();
            int n4 = ThemeSupport_064.L(n3, (float)ThemeSupport_064.d(n3) / 255.0f * 0.95f);
            float f4 = class_275.c.L();
            if (class_275.E.d()) {
                int n5 = 0;
                n = ThemeSupport_064.L(n5, (float)ThemeSupport_064.d(n5) / 255.0f * 0.16f);
            } else {
                n = 0;
            }
            RenderSupport_106.L(axisAlignedBB, n4, f4, n);
            iterator2 = a2;
        }
        if (bl) {
            RenderSupport_106.L();
        }
        class_275.L((float)a);
    }

    private void F() {
        BedESP a;
BedESP class_275 = a;
        a.B.clear();
        class_275.j.clear();
        class_275.H.clear();
        class_275.b = 0;
    }

    private static boolean L(BlockPos blockPos) {
        int a;
        BlockPos blockPos2 = blockPos;
EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < 0) {
            EnumFacing enumFacing = enumFacingArray[0];
            if (BlockUtils.d(blockPos2.offset(enumFacing))) {
                return 5 >> 2;
            }
            n2 = ++a;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void l() {
        var3_1 = this;
var3_1.B.clear();
        var10_2 = BedESP.e.theWorld.getChunkProvider();
        if (!(var10_2 instanceof ChunkProviderClient)) {
            return;
        }
        var1_4 = (ChunkProviderClient)var10_2;
        var10_3 = Block.getIdFromBlock(Blocks.bed);
        var1_4 = var1_4.getLoadedChunks().iterator();
        block0: while (true) {
            v0 = var1_4;
            while (v0.hasNext()) {
                var8_10 = (Chunk)var1_4.next();
                if (var8_10 == null) continue block0;
                if (var8_10.isEmpty()) {
                    v0 = var1_4;
                    continue;
                }
                v1 = var8_10;
                var8_11 = v1.xPosition << --4;
                var4_6 = v1.zPosition << --4;
                var5_7 = v1.getBlockStorageArray();
                var6_8 = var5_7.length;
                v2 = 3 >> 2;
                while (true) {
                    if (v2 >= var6_8) ** break;
                    a = var5_7[var7_9];
                    if (a != null && !a.isEmpty()) {
                        v3 = a;
                        a = v3.getData();
                        var9_12 = v3.getYLocation();
                        v4 = 5 >> 3;
                        while (v4 < ((Object)a).length) {
                            var11_13 = a[var2_5];
                            if (var11_13 >> --4 == var10_3 && (var11_13 & (46 & 89)) != 0) {
                                var3_1.B.add(new BlockPos(var8_11 + (var2_5 & (15 & 127)), var9_12 + (var2_5 >> (9 & 126) & (31 & 111)), var4_6 + (var2_5 >> --4 & (15 & 127))));
                            }
                            v4 = ++var2_5;
                        }
                    }
                    v2 = ++var7_9;
                }
            }
            break;
        }
        var3_1.h();
    }

    private AxisAlignedBB d(BlockPos blockPos) {
        BlockPos a = blockPos;
        BedESP a2 = this;
if (BlockUtils.d(a)) {
            return null;
        }
        return BlockUtils.L(a).offset(a.getX(), a.getY(), a.getZ()).expand(0.003, 0.003, 0.003);
    }

    /*
     * Unable to fully structure code
     */
    private void h() {
        var1_1 = this;
v0 = var1_1;
        v0.j.clear();
        v0.H.clear();
        if (!v0.I.d() && !var1_1.J.d()) {
            return;
        }
        v1 = var1_1;
        var6_2 = v1.P.d();
        var17_3 = new HashSet<Object>();
        var19_4 = v1.B.iterator();
        block0: while (true) {
            v2 = var19_4;
            while (v2.hasNext()) {
                var4_7 = var19_4.next();
                var5_8 = BedTracker.l.L(var4_7);
                if (var5_8 && !var1_1.R.d()) {
                    v2 = var19_4;
                    continue;
                }
                if (!var5_8 && !var1_1.V.d()) {
                    v2 = var19_4;
                    continue;
                }
                a = BedESP.e.theWorld.getBlockState(var4_7);
                if (!(a.getBlock() instanceof BlockBed)) {
                    v2 = var19_4;
                    continue;
                }
                a = var4_7.offset(a.getValue(BlockBed.FACING).getOpposite());
                v3 = var4_7;
                var7_9 = Math.min(v3.getX(), a.getX()) - var6_2;
                var8_10 = Math.max(v3.getX(), a.getX()) + var6_2;
                var9_11 = Math.min(v3.getZ(), a.getZ()) - var6_2;
                var10_12 = Math.max(v3.getZ(), a.getZ()) + var6_2;
                var11_13 = v3.getY();
                var12_14 = Math.min(25855 & 7167, var4_7.getY() + var6_2);
                var13_15 = new LinkedHashMap<Integer, int[]>();
                var14_16 = new LinkedHashMap<Integer, IBlockState>();
                var15_17 = 3 & 4;
                var16_18 = new HashSet<Object>();
                var2_5 = new ArrayDeque<BlockPos>();
                for (Object var18_19 : List.of(v3, a)) {
                    var16_18.add(var18_19);
                    var3_6 = EnumFacing.values();
                    var20_20 = ((EnumFacing[])var3_6).length;
                    v4 = 3 >> 2;
                    while (v4 < var20_20) {
                        var22_23 = var3_6[var21_21];
                        var23_25 = var18_19.offset(var22_23);
                        if (var23_25.getY() >= var11_13) {
                            var2_5.add(var23_25);
                        }
                        v4 = ++var21_21;
                    }
                }
                block4: while (true) {
                    v5 = var2_5;
                    while (!v5.isEmpty()) {
                        a = (BlockPos)var2_5.poll();
                        if (a.getY() < var11_13) continue block4;
                        if (a.getY() > var12_14) {
                            v5 = var2_5;
                            continue;
                        }
                        if (a.getX() < var7_9) continue block4;
                        if (a.getX() > var8_10) {
                            v5 = var2_5;
                            continue;
                        }
                        if (a.getZ() < var9_11) continue block4;
                        if (a.getZ() > var10_12) {
                            v5 = var2_5;
                            continue;
                        }
                        if (!var16_18.add(a)) {
                            v5 = var2_5;
                            continue;
                        }
                        var18_19 = BedESP.e.theWorld.getBlockState((BlockPos)a);
                        var3_6 = var18_19.getBlock();
                        if (var3_6.getMaterial() == Material.air) {
                            v5 = var2_5;
                            continue;
                        }
                        if (!var3_6.getMaterial().isSolid()) {
                            v5 = var2_5;
                            continue;
                        }
                        if (var3_6 instanceof BlockBed) {
                            v5 = var2_5;
                            continue;
                        }
                        var20_20 = Block.getIdFromBlock((Block)var3_6) << --4 | var3_6.damageDropped((IBlockState)var18_19) & (63 & 79);
                        v6 = var13_15.computeIfAbsent(var20_20, (Function<Integer, int[]>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, L(java.lang.Integer ), (Ljava/lang/Integer;)[I)());
                        v7 = 3 & 4;
                        v6[v7] = v6[v7] + (4 ^ 5);
                        ++var15_17;
                        var14_16.putIfAbsent(var20_20, (IBlockState)var18_19);
                        if (BedESP.L((BlockPos)a) && var17_3.add(a)) {
                            var1_1.j.add(new FeatureSupport_271((BlockPos)a, BedESP.L((IBlockState)var18_19)));
                        }
                        var21_22 = EnumFacing.values();
                        var22_24 = var21_22.length;
                        v8 = 3 ^ 3;
                        while (true) {
                            if (v8 < var22_24) ** break;
                            continue block4;
                            var24_27 = var21_22[var23_26];
                            var2_5.add(a.offset(var24_27));
                            v8 = ++var23_26;
                        }
                    }
                    break;
                }
                if (!var1_1.J.d() || var15_17 <= 0) continue block0;
                var1_1.H.add(new FeatureSupport_323(var4_7, var5_8, BedESP.L(var13_15, var14_16), var15_17));
                continue block0;
            }
            break;
        }
    }

    public List<FeatureSupport_323> D() {
        BedESP a;
return a.H;
    }

    public BedESP() {
        super("BedESP", "Highlights beds through walls", ModuleCategory.f);
        BedESP a;
        BedESP class_275 = a;
        a.R = new BooleanSetting("Own bed", 1 != 0).L("Highlight the bed the tracker believes is yours");
        class_275.V = new BooleanSetting("Enemy beds", 1 != 0).L("Highlight every other bed");
        a.g = new ColorSetting("Own color", -9706613).L("Colour of your own bed").L((SettingValue)a.R);
        a.G = new ColorSetting("Enemy color", -38302).L("Colour of enemy beds").L((SettingValue)a.V);
        a.I = ((BooleanSetting)new BooleanSetting("Defense", 5 >> 3).L("Outline the blocks walling each bed in, coloured by what they are made of")).L((T bl) -> {
            Boolean a = bl;
            BedESP a2 = this;
a2.F();
        });
        a.P = ((NumberSetting)((NumberSetting)new NumberSetting("Defense radius", 3.0, 1.0, 6.0, 1.0).d(" m").L("How far around a bed counts as its defense")).L(() -> {
            BedESP a;
return a.I.d() || a.J.d();
        })).L((T d) -> {
            Double a = d;
            BedESP a2 = this;
a2.F();
        });
        a.h = ((NumberSetting)new NumberSetting("Defense opacity", 70.0, 10.0, 100.0, 5.0).d("%").L("How strongly the defense outlines are drawn")).L((SettingValue)a.I);
        a.J = ((BooleanSetting)new BooleanSetting("Defense tags", 3 >> 2).L("Float the blocks making up each bed's defense above the bed itself")).L((T bl) -> {
            Boolean a = bl;
            BedESP a2 = this;
a2.F();
        });
        BedESP class_2752 = a;
        a.k = ((NumberSetting)new NumberSetting("Tag scale", 1.0, 0.5, 2.0, 0.05).d("x").L("Defense tag size - it still shrinks with distance")).L((SettingValue)a.J);
        class_2752.t = ((NumberSetting)new NumberSetting("Tag falloff", 1.0, 0.0, 2.0, 0.05).d("x").L("How hard a tag shrinks as its bed gets further away - 0 keeps every tag the same size however far off it is")).L((SettingValue)a.J);
        a.K = ((BooleanSetting)new BooleanSetting("Tag blur", 3 >> 1).L("Frost the world behind each defense tag instead of tinting it flat")).L((SettingValue)a.J);
        class_2752.A = new BooleanSetting("Beam", 0 != 0).L("Stand a light beam over every highlighted bed");
        class_2752.a = ((NumberSetting)new NumberSetting("Beam height", 24.0, 4.0, 128.0, 4.0).d(" m").L("How far the beam reaches above the bed")).L((SettingValue)a.A);
        class_2752.f = ((NumberSetting)new NumberSetting("Beam width", 0.5, 0.1, 2.0, 0.1).d(" m").L("How wide the beam column is")).L((SettingValue)a.A);
        class_2752.F = ((NumberSetting)new NumberSetting("Beam opacity", 55.0, 10.0, 100.0, 5.0).d("%").L("How strongly the beam is drawn at its base")).L((SettingValue)a.A);
        class_2752.M = ((BooleanSetting)new BooleanSetting("Beam color", 0 != 0).L("Draw every beam in one colour of its own instead of the bed's own/enemy colour")).L((SettingValue)a.A);
        class_2752.d = new ColorSetting("Beam tint", -8399617).L("The colour every beam is drawn in").L((SettingValue)a.M);
        class_2752.W = ((BooleanSetting)new BooleanSetting("Own bed beam", 1 != 0).L("Stand a beam over your own bed too - off leaves the column to enemy beds, which is one less thing lit up in the middle of your own base")).L((SettingValue)a.A);
        class_2752.l = ((BooleanSetting)new BooleanSetting("Own beam color", 0 != 0).L("Give your own bed's beam a colour of its own instead of the one the rest of the beams use")).L(() -> {
            BedESP a;
if (a.A.d() && a.W.d()) {
                return 1 != 0;
            }
            return false;
        });
        a.i = new ColorSetting("Own beam tint", -9706613).L("The colour your own bed's beam is drawn in").L(() -> {
            BedESP a;
if (a.A.d() && a.W.d() && a.l.d()) {
                return --1 != 0;
            }
            return false;
        });
        BedESP class_2753 = a;
        class_2753.E = new BooleanSetting("Fill", 5 >> 2);
        class_2753.m = new BooleanSetting("Through walls", --1 != 0);
        class_2753.c = new NumberSetting("Line width", 1.5, 0.5, 5.0, 0.5).d(" px");
        class_2753.p = new NumberSetting("Refresh", 500.0, 100.0, 2000.0, 50.0).d("ms").L("How often the world is rescanned for beds");
        class_2753.e = new Timer();
        class_2753.B = new ArrayList<BlockPos>();
        class_2753.j = new ArrayList<FeatureSupport_271>();
        class_2753.H = new ArrayList<FeatureSupport_323>();
        class_2753.D = new FeatureSupport_261(a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2) {
        BedESP class_275 = this;
if (!class_275.A.d()) {
            return;
        }
        boolean bl = false;
        BedESP class_2752 = class_275;
        float f3 = class_2752.F.L() / 100.0f;
        double d = (Double)class_2752.f.L();
        double d2 = (Double)class_275.a.L();
        Iterator<BlockPos> iterator = class_275.B.iterator();
        block0: while (true) {
            Iterator<BlockPos> iterator2 = iterator;
            while (iterator2.hasNext()) {
                BlockPos blockPos = iterator.next();
                int a = BedTracker.l.L(blockPos);
                if (0 != 0) {
                    if (!class_275.R.d()) continue block0;
                    if (!class_275.W.d()) {
                        iterator2 = iterator;
                        continue;
                    }
                }
                if (0 == 0 && !class_275.V.d()) {
                    iterator2 = iterator;
                    continue;
                }
                AxisAlignedBB axisAlignedBB = class_275.L(blockPos);
                if (axisAlignedBB == null) {
                    iterator2 = iterator;
                    continue;
                }
                if (!bl) {
                    void a2;
                    if (!RenderSupport_125.L((float)a2, class_275.m.d())) {
                        return;
                    }
                    bl = true;
                }
                a = class_275.L(0 != 0);
                float f4 = (float)ThemeSupport_064.d(0) / 255.0f * f3;
                iterator2 = iterator;
                double d3 = (double)blockPos.getY() + 0.5625;
                AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
                double d4 = (axisAlignedBB.minX + axisAlignedBB2.maxX) / 2.0;
                double d5 = (axisAlignedBB2.minZ + axisAlignedBB.maxZ) / 2.0;
                double d6 = d3;
                RenderSupport_125.L(d4, d5, d6, d6 + d2, d, ThemeSupport_064.L(0, f4 * 0.55f), ThemeSupport_064.L(0, 0.0f));
                double d7 = d3;
                RenderSupport_125.L(d4, d5, d7, d7 + d2, d * 0.35, ThemeSupport_064.L(0, f4), ThemeSupport_064.L(0, 0.0f));
            }
            break;
        }
        if (bl) {
            RenderSupport_125.L();
        }
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        BedESP a2 = this;
a2.F();
    }

    private static int L(IBlockState iBlockState) {
        int n;
        IBlockState iBlockState2 = iBlockState;
Object a = iBlockState2.getBlock();
        if (a == Blocks.obsidian) {
            return -15003098;
        }
        if (a == Blocks.glass) {
            return -4199947;
        }
        int n2 = n = (a = ((Block)a).getMapColor(iBlockState2)) == null ? 0 : ((MapColor)a).colorValue;
        if (0 == 0) {
            return -5197648;
        }
        return -16777216;
    }

    public boolean h() {
        BedESP a;
return a.D.L();
    }

    private static int[] L(Integer a) {
return new int[1];
    }

    @Override
    protected void D() {
        BedESP a;
a.F();
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        void a;
        void a2;
        float a3 = f3;
        BedESP a4 = this;
a4.D.L((RenderSupport_103)a2, (float)a, a3);
    }

    private int L(boolean bl) {
        boolean a = bl;
        BedESP a2 = this;
if (a && a2.l.d()) {
            return a2.i.L();
        }
        if (a2.M.d()) {
            return a2.d.L();
        }
        BedESP class_275 = a2;
        return a ? class_275.g.L() : class_275.G.L();
    }

    /*
     * WARNING - void declaration
     */
    private AxisAlignedBB L(BlockPos blockPos) {
        void a;
        BedESP class_275 = this;
Object a2 = ((Minecraft)((Object)BedESP.e)).theWorld.getBlockState((BlockPos)a);
        if (!(a2.getBlock() instanceof BlockBed)) {
            return null;
        }
        a2 = a.offset(a2.getValue(BlockBed.FACING).getOpposite());
        void v0 = a;
        double d = (double)Math.min(v0.getX(), ((Vec3i)a2).getX()) - 0.003;
        double d2 = (double)Math.min(v0.getZ(), ((Vec3i)a2).getZ()) - 0.003;
        double d3 = (double)(Math.max(v0.getX(), ((Vec3i)a2).getX()) + 1) + 0.003;
        double d4 = (double)(Math.max(v0.getZ(), ((Vec3i)a2).getZ()) + 1) + 0.003;
        return AxisAlignedBB.fromBounds(d, (double)a.getY() - 0.003, d2, d3, (double)a.getY() + 0.5625 + 0.003, d4);
    }
}

