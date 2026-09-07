/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.Objects;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_259;
import openonyx.features.render.FeatureSupport_267;
import openonyx.features.render.FeatureSupport_327;
import openonyx.features.render.FeatureMode_257;
import openonyx.features.render.FeatureMode_278;
import openonyx.features.render.FeatureMode_314;
import openonyx.features.render.FeatureMode_325;
import openonyx.features.combat.BedBreaker;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_a.RenderSupport_115;
import openonyx.render.group_a.RenderSupport_116;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_k.CrystalEffectSettings;
import openonyx.utilities.FileUtils;

public final class BlockOverlay
extends Module {
    private final static float P = 70.0f;
    final public BooleanSetting V;
    private final static float R = 60.0f;
    final public NumberSetting p;
    private double t;
    private float b;
    final public BooleanSetting E;
    private final static float F = 0.004f;
    private BlockPos G;
    final public BooleanSetting A;
    private final RenderSupport_121 K;
    final public NumberSetting B;
    private final RenderSupport_121 C;
    private BlockPos J;
    final public EnumSetting<FeatureMode_278> D;
    private final RenderSupport_121 c;
    final public FeatureSupport_327 a;
    final public ColorSetting k;
    private final RenderSupport_116 g;
    private final RenderSupport_121[] M;
    private boolean L;
    private final static double j = 16.0;
    final public NumberSetting m;
    private double h;
    private double l;
    final public FeatureSupport_259 I;
    final public FeatureSupport_267 d;
    final public NumberSetting i;
    private long f;
    private final static float H = 100.0f;
    final public ColorSetting e;

    private void d(float f2) {
        int n;
        float a = f2;
        BlockOverlay a2 = this;
RenderSupport_121[] class_121Array = a2.M;
        int n2 = a2.M.length;
        int n3 = 0;
        while (n3 < n2) {
            class_121Array[n++].L(0);
            n3 = 0;
        }
        BlockOverlay class_312 = a2;
        class_312.c.L(0);
        class_312.K.L(0);
        class_312.C.L(0);
    }

    /*
     * WARNING - void declaration
     */
    private void d(AxisAlignedBB axisAlignedBB) {
        void a;
        BlockOverlay class_312 = this;
BlockOverlay class_3122 = class_312;
        float a2 = class_3122.d.e.L();
        class_3122.M[0].L((float)(a.minX - class_312.h), 4.0f, RenderSupport_123.l);
        class_312.M[1].L((float)(a.minY - class_312.l), 4.0f, RenderSupport_123.l);
        class_312.M[2].L((float)(a.minZ - class_312.t), 4.0f, RenderSupport_123.l);
        class_312.M[3].L((float)(a.maxX - class_312.h), 4.0f, RenderSupport_123.l);
        class_312.M[4].L((float)(a.maxY - class_312.l), 4.0f, RenderSupport_123.l);
        class_312.M[5].L((float)(a.maxZ - class_312.t), 4.0f, RenderSupport_123.l);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        BlockOverlay class_312;
        float a2;
        BlockOverlay class_3122;
        block4: {
            block3: {
                AxisAlignedBB axisAlignedBB;
                BlockPos blockPos;
                block2: {
                    class_3122 = this;
BlockOverlay class_3123 = class_3122;
                    a2 = class_3123.d();
                    if (!class_3123.d() || ((Minecraft)((Object)BlockOverlay.e)).theWorld == null || ((Minecraft)((Object)BlockOverlay.e)).thePlayer == null) {
                        class_3122.h();
                        return;
                    }
                    BlockOverlay class_3124 = class_3122;
                    blockPos = class_3124.L(class_3124.L(), 4.0f);
                    AxisAlignedBB axisAlignedBB2 = axisAlignedBB = blockPos == null ? null : class_3122.L(blockPos);
                    if (axisAlignedBB != null) break block2;
                    if (!class_3122.L) break block3;
                    class_3122.L = 0;
                    BlockOverlay class_3125 = class_3122;
                    class_3122.c.L(0.0f, class_3125.d.f.L(), RenderSupport_123.h);
                    class_3125.K.L(((FeatureMode_314)class_3122.d.i.L()).L(), class_3122.d.f.L(), RenderSupport_123.h);
                    class_3122.C.L(0.0f);
                    class_312 = class_3122;
                    break block4;
                }
                BlockOverlay class_3126 = class_3122;
                class_3126.L(blockPos, axisAlignedBB);
                class_3126.C.L(class_3122.L(), 70.0f, RenderSupport_123.e);
            }
            class_312 = class_3122;
        }
        class_312.d(4.0f);
        BlockOverlay class_3127 = class_3122;
        a2 = class_3127.c.L();
        if (!class_3127.L && 4.0f <= 0.004f) {
            class_3122.J = null;
            return;
        }
        class_3122.g.L(0.0f, class_3122.J, class_3122.L(), 4.0f, class_3122.C.L(), class_3122.L());
    }

    /*
     * WARNING - void declaration
     */
    private void L(BlockPos blockPos, AxisAlignedBB axisAlignedBB) {
        int n;
        void a;
        int n2;
        BlockOverlay class_312 = this;
int a2 = class_312.J == null ? 1 : 0;
        int n3 = n2 = 4.0f == 0 && a.distanceSq(class_312.J.getX(), class_312.J.getY(), class_312.J.getZ()) > 16.0 ? 1 : 0;
        if (!a.equals(class_312.J)) {
            class_312.C.L(0.0f);
        }
        class_312.J = a;
        class_312.L = 1;
        if (4.0f != 0 || n2 != 0) {
            void v1 = a;
            BlockOverlay class_3122 = class_312;
            class_3122.h = a.minX;
            class_3122.l = a.minY;
            class_312.t = v1.minZ;
            class_312.L((AxisAlignedBB)v1);
            n = 4.0f;
        } else {
            class_312.d((AxisAlignedBB)a);
            n = 4.0f;
        }
        if (n != 0) {
            BlockOverlay class_3123 = class_312;
            class_3123.c.L(0.0f);
            class_3123.K.L(((FeatureMode_314)class_312.d.i.L()).L());
        }
        class_312.c.L(1.0f, class_312.d.H.L(), RenderSupport_123.H);
        class_312.K.L(1.0f, class_312.d.H.L(), RenderSupport_123.H);
    }

    private RenderSupport_115 L() {
        float a;
        BlockOverlay class_312 = this;
float f2 = a = class_312.p.L() / 100.0f;
        return new RenderSupport_115((FeatureMode_278)class_312.D.L(), class_312.e.L(), class_312.k.h(), class_312.m.L(), class_312.i.L() / 100.0f, f2, Math.clamp(f2 * 3.0f, 0.0f, 1.6f), class_312.I.f.L(), class_312.I.e.L(), class_312.I.H.L() / 100.0f, class_312.a.D(), (FeatureMode_257)class_312.a.e.L(), class_312.a.H.L(FeatureMode_325.i), class_312.a.f.L() / 100.0f, class_312.E.d());
    }

    public BlockOverlay() {
        super("BlockOverlay", FileUtils.L("\u0017%8$3%8$+?\u007f87)\u007f.3#<'\u007f509\u007f--)\u007f 0#4%1+\u007f-+"), ModuleCategory.f);
        BlockOverlay a2;
        BlockOverlay class_312 = a2;
        a2.D = new EnumSetting<FeatureMode_278>("Theme", FeatureMode_278.d).L(FileUtils.L("\u0003*83%1)\u007f#1l68,l0;1`\u007f#))-l>l+>>\",<>>:\"+l9%3 sl0>\u007f#))-l+$:l= 0/4k,l0;1l+)'8*>:"));
        class_312.e = new ColorSetting("Color", -10178561).D().L();
        a2.k = new ColorSetting(FileUtils.L("\u001f:/0\";l<#3#-"), -7055617).D().L(48.0).L("The other end of the glint's gradient").L(a2.D, (T a) -> {
if (a == FeatureMode_278.e) {
                return 1 != 0;
            }
            return false;
        });
        BlockOverlay class_3122 = a2;
        class_3122.m = new NumberSetting(FileUtils.L("\u00006\":l(%;87"), 1.5, 0.5, 5.0, 0.5).d(" px");
        class_3122.i = new NumberSetting(FileUtils.L("\u00109+ 6\":l0<>/68&"), 90.0, 5.0, 100.0, 5.0).d("%");
        a2.p = new NumberSetting(FileUtils.L("\n6 3l0<>/68&"), 22.0, 1.0, 80.0, 1.0).d("%").L(a2.D, (T a) -> {
if (a != FeatureMode_278.f) {
                return 1 != 0;
            }
            return false;
        });
        BlockOverlay class_3123 = a2;
        BlockOverlay class_3124 = a2;
        class_3124.B = new NumberSetting(FileUtils.L("\u000f-;(6\"8"), 0.6, 0.0, 5.0, 0.1).d("%").L(FileUtils.L("\u0017#(l9--l+$:l=#'l,8>\";?\u007f#9*\u007f87)\u007f.3#<'\u007f*>/:`\u007f-,l>l9>>/+%0\"\u007f#9l>l= 0/4"));
        class_3124.I = new FeatureSupport_259();
        class_3124.d = new FeatureSupport_267();
        class_3124.a = new FeatureSupport_327();
        class_3124.V = new BooleanSetting("Only on bed break", 0 != 0).L(FileUtils.L("\u0017%;),l+$:l0::>3-&l*\"3),?\u007f\u000e:(\u001d>:-4)-l6?\u007f!6\"6\"8`\u007f?0l68\u007f!>>4?\u007f87)\u007f.:(\u007f-1(\u007f\"087%1+\u007f)3?:"));
        class_3123.E = new BooleanSetting("Through walls", --1 != 0).L(FileUtils.L("\b--(?\u007f87)\u007f;7#3)\u007f.04\u007f-1(\u007f%+?\u007f<-#8>:?,l:::\"\u007f;7)1l+$:l= 0/4l6?\u007f.*>6);"));
        class_3123.A = new BooleanSetting("Hide vanilla outline", 3 >> 1).L(FileUtils.L("\u001f*</>:?,),l+$:l= >/4l(%-)9>>!:l+$6?\u007f#))- >5\u007f%,l,8>\";%1+\u007f%1l9#-"));
        RenderSupport_121[] class_121Array = new RenderSupport_121[6];
        class_121Array[0] = new RenderSupport_121(0.0f);
        class_121Array[1] = new RenderSupport_121(0.0f);
        class_121Array[2] = new RenderSupport_121(0.0f);
        class_121Array[3] = new RenderSupport_121(0.0f);
        class_121Array[4] = new RenderSupport_121(0.0f);
        class_121Array[5] = new RenderSupport_121(0.0f);
        class_3123.M = class_121Array;
        a2.c = new RenderSupport_121(0.0f);
        a2.K = new RenderSupport_121(1.0f);
        a2.C = new RenderSupport_121(0.0f);
        a2.g = new RenderSupport_116();
        a2.I.L(() -> {
            BlockOverlay a;
return a.D.L(FeatureMode_278.e);
        });
    }

    @Override
    protected void D() {
        BlockOverlay a;
BlockOverlay class_312 = a;
        class_312.h();
        class_312.g.L();
    }

    private void h() {
        int a;
        BlockOverlay class_312 = this;
BlockOverlay class_3122 = class_312;
        BlockOverlay class_3123 = class_312;
        class_312.J = null;
        class_3123.G = null;
        class_3123.b = 0.0f;
        class_3122.L = 0;
        class_3122.f = 0L;
        RenderSupport_121[] class_121Array = class_3122.M;
        int n = class_3122.M.length;
        int n2 = 0;
        while (n2 < 0) {
            class_121Array[a++].L(0.0f);
            n2 = 0;
        }
        class_312.c.L(0.0f);
        class_312.K.L(1.0f);
        class_312.C.L(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    private BlockPos L(BlockPos blockPos, float f2) {
        void a;
        BlockPos a2 = blockPos;
        BlockOverlay a3 = this;
if (a3.J == null || Objects.equals(a2, a3.J)) {
            a3.G = null;
            a3.b = 0.0f;
            return a2;
        }
        if (!Objects.equals(a2, a3.G)) {
            BlockOverlay class_312 = a3;
            class_312.G = a2;
            class_312.b = 0.0f;
        }
        BlockOverlay class_312 = a3;
        class_312.b += a;
        if (class_312.b >= 60.0f) {
            return a2;
        }
        return a3.J;
    }

    private float d() {
        BlockOverlay a;
long l = System.nanoTime();
        if (a.f == 0L) {
            a.f = l;
            return 0.0f;
        }
        a.f = l;
        return Math.clamp((float)(l - a.f) / 1000000.0f, 0.0f, 100.0f);
    }

    private AxisAlignedBB L() {
        BlockOverlay a;
BlockOverlay class_312 = a;
        double d = class_312.h + (double)a.M[0].L();
        BlockOverlay class_3122 = a;
        double d2 = class_312.l + (double)class_3122.M[1].L();
        double d3 = class_3122.t + (double)a.M[2].L();
        double d4 = class_312.h + (double)a.M[3].L();
        double d5 = class_312.l + (double)a.M[4].L();
        double d6 = class_312.t + (double)a.M[5].L();
        double d7 = (d + d4) / 2.0;
        double d8 = (d2 + d5) / 2.0;
        double d9 = (d3 + d6) / 2.0;
        double d10 = class_312.K.L();
        double d11 = (Double)class_312.B.L() / 100.0;
        double d12 = d7;
        double d13 = d8;
        double d14 = d9;
        double d15 = d7;
        double d16 = d8;
        double d17 = d9;
        return AxisAlignedBB.fromBounds(d12 + (d - d12) * d10 - d11, d13 + (d2 - d13) * d10 - d11, d14 + (d3 - d14) * d10 - d11, d15 + (d4 - d15) * d10 + d11, d16 + (d5 - d16) * d10 + d11, d17 + (d6 - d17) * d10 + d11);
    }

    private BlockPos L() {
        Object a;
        BlockOverlay class_312 = this;
Object object = a = OnyxClient.l == null ? null : OnyxClient.l.H;
        if (a != null && ((Module)a).d() && ((BedBreaker)a).D() != null) {
            return ((BedBreaker)a).D();
        }
        if (class_312.V.d()) {
            return null;
        }
        a = ((Minecraft)((Object)BlockOverlay.e)).objectMouseOver;
        if (a == null || ((MovingObjectPosition)a).typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
            return null;
        }
        return ((MovingObjectPosition)a).getBlockPos();
    }

    private float L() {
        int n;
        BlockOverlay class_312 = this;
if (!class_312.a.D() || ((Minecraft)((Object)BlockOverlay.e)).playerController == null) {
            return 0.0f;
        }
        Module a = OnyxClient.l == null ? null : OnyxClient.l.H;
        int n2 = n = a != null && a.d() && ((BedBreaker)a).D() != null ? 1 : 0;
        if (0 == 0 && !((Minecraft)((Object)BlockOverlay.e)).playerController.isHittingBlock()) {
            return 0.0f;
        }
        return Math.clamp(((Minecraft)((Object)BlockOverlay.e)).playerController.getCurBlockDamage(), 0.0f, 1.0f);
    }

    public boolean I() {
        BlockOverlay a;
if (a.d() && a.A.d() && a.L() != null) {
            return 3 >> 1;
        }
        return false;
    }

    private AxisAlignedBB L(BlockPos blockPos) {
        BlockPos a = blockPos;
        BlockOverlay a2 = this;
if (((Minecraft)((Object)BlockOverlay.e)).theWorld.getBlockState(a).getBlock().getMaterial() == Material.air) {
            return null;
        }
        return RenderSupport_116.L(a);
    }

    private void L(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB a = axisAlignedBB;
        BlockOverlay a2 = this;
a2.M[0].L((float)(a.minX - a2.h));
        a2.M[1].L((float)(a.minY - a2.l));
        a2.M[2].L((float)(a.minZ - a2.t));
        a2.M[3].L((float)(a.maxX - a2.h));
        a2.M[4].L((float)(a.maxY - a2.l));
        a2.M[5].L((float)(a.maxZ - a2.t));
    }
}

