/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import openonyx.events.EntityRelationUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_308;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_111;
import openonyx.theme.internal.ThemeSupport_064;

public final class Arrows
extends Module {
    private long D;
    final public NumberSetting c;
    final public NumberSetting a;
    private final RenderSupport_103 k;
    final public ColorSetting g;
    final public EnumSetting<FeatureMode_308> M;
    private final static ResourceLocation L;
    private final static float j = 100.0f;
    private float m;
    final public NumberSetting h;
    private final static float l = 100.0f;
    final public NumberSetting I;
    final public NumberSetting d;
    private final static ResourceLocation i;
    final public ColorSetting f;
    private final static ResourceLocation H;
    private final static double e = 90.0;

    private float L() {
        Arrows class_310 = this;
long l = System.nanoTime();
        float a = class_310.D == 0L ? 16.0f : Math.min((float)(l - class_310.D) / 1000000.0f, 100.0f);
        class_310.D = l;
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        void a;
        int a2 = n2;
        int a3 = 0;
int n3 = Math.round((float)ThemeSupport_064.d(a3) + (float)(ThemeSupport_064.d(a2) - ThemeSupport_064.d(a3)) * a);
        int n4 = Math.round((float)ThemeSupport_064.i(a3) + (float)(ThemeSupport_064.i(a2) - ThemeSupport_064.i(a3)) * a);
        int n5 = Math.round((float)ThemeSupport_064.D(a3) + (float)(ThemeSupport_064.D(a2) - ThemeSupport_064.D(a3)) * a);
        a2 = Math.round((float)ThemeSupport_064.L(a3) + (float)(ThemeSupport_064.L(a2) - ThemeSupport_064.L(a3)) * a);
        return ThemeSupport_064.L(n3, n4, n5, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, int n, int n2) {
        void a;
        void a2;
        float a3 = f2;
        Arrows a4 = this;
float f3 = a3;
        void v1 = a2;
        a4.k.L(a4.L(), -a3 / 2.0f + a3 / 18.0f, -a3 / 2.0f, f3, f3, (int)v1, Arrows.L((int)a2, (int)a, 0.33333334f), Arrows.L((int)v1, (int)a, 0.6666667f), (int)a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3, float f4, float f5, float f6, float f7) {
        void a;
        void a2;
        void a3;
        float a4;
        void a5;
        void a222;
        float f8 = f6;
        Arrows a6 = this;
Arrows class_310 = a6;
        Arrows class_3102 = a6;
        int n = ThemeSupport_064.L((int)class_310.g.L(), (float)ThemeSupport_064.d(class_3102.g.L()) / 255.0f * a222);
        int a222 = ThemeSupport_064.L((int)class_310.f.L(), (float)ThemeSupport_064.d(a6.f.L()) / 255.0f * a222);
        class_3102.k.F();
        class_310.k.L().d((float)a5, a4);
        a6.k.L().L((float)a3);
        if (a2 > 0.0f) {
            a5 = a * (1.0f + 0.5f * Math.min((float)a2, 2.0f));
            a4 = 0.22f * Math.min((float)a2, 1.5f);
            int n2 = n;
            int n3 = 0;
            a6.L((float)a5, ThemeSupport_064.L(n2, (float)ThemeSupport_064.d(n2) / 255.0f * a4), ThemeSupport_064.L(n3, (float)ThemeSupport_064.d(n3) / 255.0f * a4));
        }
        Arrows class_3103 = a6;
        class_3103.L((float)a, n, 0);
        class_3103.k.k();
    }

    /*
     * Unable to fully structure code
     */
    public void L(float var1_2) {
        var2_3 = this;
if (!var2_3.d() || Arrows.e.theWorld == null || Arrows.e.thePlayer == null) {
            return;
        }
        if (Arrows.e.gameSettings.thirdPersonView != 0) {
            return;
        }
        v0 = var18_4 = new ScaledResolution((Minecraft)Arrows.e);
        var18_5 = v0.getScaledWidth();
        var17_6 = v0.getScaledHeight();
        var4_7 = var2_3.a.L() + (Arrows.e.currentScreen instanceof GuiInventory != false ? 100.0f : 0.0f);
        var2_3.m += (var4_7 - var2_3.m) * (float)(1.0 - Math.exp((double)(-var2_3.L()) / 90.0));
        if (RenderSupport_107.L()) {
            var9_8 = RenderSupport_107.D();
            var10_10 = RenderSupport_107.d();
            v1 = var9_8;
            var5_11 = v1.xCoord;
            var7_12 = v1.zCoord;
            v2 = var4_7 = (float)Math.toDegrees(Math.atan2(-var10_10.xCoord, var10_10.zCoord));
        } else {
            var5_11 = Arrows.e.thePlayer.lastTickPosX + (Arrows.e.thePlayer.posX - Arrows.e.thePlayer.lastTickPosX) * (double)a;
            var7_12 = Arrows.e.thePlayer.lastTickPosZ + (Arrows.e.thePlayer.posZ - Arrows.e.thePlayer.lastTickPosZ) * (double)a;
            v2 = var4_7 = Arrows.e.thePlayer.prevRotationYaw + (Arrows.e.thePlayer.rotationYaw - Arrows.e.thePlayer.prevRotationYaw) * a;
        }
        var9_9 = Math.cos(Math.toRadians(v2));
        var11_13 = Math.sin(Math.toRadians(var4_7));
        var18_5 /= 2.0f;
        var17_6 /= 2.0f;
        v3 = var2_3;
        var4_7 = v3.h.L() / 100.0f;
        var13_14 = v3.d.L() / 100.0f;
        var14_15 = v3.c.L();
        var15_16 = (Double)v3.I.L();
        v4 = new ArrayList<E>(Arrows.e.theWorld.playerEntities);
        var2_3.k.i();
        var3_17 = v4.iterator();
        block0: while (true) {
            v5 = var3_17;
            while (v5.hasNext()) {
                a = (EntityPlayer)var3_17.next();
                if (a == null) continue block0;
                if (a == Arrows.e.thePlayer) {
                    v5 = var3_17;
                    continue;
                }
                if (a.isEntityAlive()) ** break;
                continue block0;
                if (a.isInvisible()) {
                    v5 = var3_17;
                    continue;
                }
                if ((double)Arrows.e.thePlayer.getDistanceToEntity(a) > var15_16) {
                    v5 = var3_17;
                    continue;
                }
                v6 = a;
                var19_19 = v6.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a - var5_11;
                var21_21 = v6.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a - var7_12;
                var23_22 = -(var21_21 * var9_9 - var19_19 * var11_13);
                var19_19 = -(var19_19 * var9_9 + var21_21 * var11_13);
                a = (float)Math.atan2(var23_22, var19_19);
                v5 = var3_17;
                v7 = var2_3;
                var19_18 = (float)((double)v7.m * Math.cos(a)) + var18_5;
                var20_20 = (float)((double)v7.m * Math.sin(a)) + var17_6;
                v7.L(var19_18, var20_20, a, var14_15, var4_7, var13_14);
            }
            break;
        }
        var2_3.k.d();
    }

    public Arrows() {
        super("Arrows", "Points at the players around you", ModuleCategory.f);
        Arrows a;
        Arrows class_310 = a;
        a.M = new EnumSetting<FeatureMode_308>("Design", FeatureMode_308.H).L("Which arrow is drawn");
        class_310.a = new NumberSetting("Distance", 60.0, 20.0, 150.0, 1.0).d(" px").L("How far the pointers sit from the cursor");
        a.c = new NumberSetting("Size", 18.0, 8.0, 40.0, 1.0).d(" px").L("How large each pointer is");
        a.g = new ColorSetting("Color", -8857601).D().L("Colour the pointer starts from");
        a.f = new ColorSetting("Second color", -4879105).D().L(60.0).L("Colour the pointer runs into");
        a.h = new NumberSetting("Opacity", 49.0, 5.0, 100.0, 1.0).d("%").L("How solid the pointers are");
        a.d = new NumberSetting("Glow", 100.0, 0.0, 250.0, 5.0).d("%").L("How much light the pointers throw");
        a.I = new NumberSetting("Range", 128.0, 8.0, 256.0, 8.0).d(" m").L("Farthest a player can be and still get a pointer");
        a.k = new RenderSupport_103().L();
    }

    @Override
    protected void D() {
        Arrows a;
Arrows class_310 = a;
        class_310.m = 0.0f;
        class_310.D = 0L;
    }

    static {
        H = new ResourceLocation("onyx", "textures/pointers/outline.png");
        L = new ResourceLocation("onyx", "textures/pointers/solid.png");
        i = new ResourceLocation("onyx", "textures/pointers/chevron.png");
    }

    private ResourceLocation L() {
        Arrows a;
switch (((FeatureMode_308)((Object)a.M.L())).ordinal()) {
            case 1: {
                while (false) {
                }
                return L;
            }
            case 2: {
                return i;
            }
        }
        return H;
    }
}

