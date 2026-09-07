/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_242;
import openonyx.features.render.FeatureSupport_293;
import openonyx.features.render.FeatureMode_252;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_106;
import openonyx.render.RenderSupport_119;
import openonyx.render.internal.RenderSupport_174;
import openonyx.theme.ThemeSupport_056;
import openonyx.theme.internal.ThemeSupport_064;

public final class Trajectories
extends Module {
    private final static double j = 0.03;
    final public BooleanSetting m;
    final public ColorSetting h;
    final public NumberSetting l;
    final public BooleanSetting I;
    private final static double d = 0.05;
    final public ColorSetting i;
    final public NumberSetting f;
    final public FeatureSupport_293 H;
    private final static double e = 0.99;

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a3;
        float f3;
        Trajectories class_301 = this;
if (!class_301.d() || Trajectories.e.theWorld == null || Trajectories.e.thePlayer == null) {
            return;
        }
        Object a2 = class_301.L(Trajectories.e.thePlayer.getHeldItem());
        if (a2 == null) {
            return;
        }
        float f4 = class_301.L((FeatureMode_252)((Object)a2));
        if (f3 <= 0.0f) {
            return;
        }
        if (((FeatureSupport_242)(a2 = class_301.L((FeatureMode_252)((Object)a2), f4, (float)a3))).L().size() < 2) {
            return;
        }
        if (!RenderSupport_119.L((float)a3, class_301.m.d(), class_301.f.L())) {
            return;
        }
        int n = class_301.h.L();
        int n2 = ThemeSupport_064.L(0, (float)ThemeSupport_064.d(0) / 255.0f * 0.35f);
        RenderSupport_119.L(((FeatureSupport_242)a2).L(), 0, 0);
        RenderSupport_119.d();
        if (!class_301.I.d() || ((FeatureSupport_242)a2).L() == null) {
            return;
        }
        if (!RenderSupport_106.L((float)a3, class_301.m.d())) {
            return;
        }
        int a3 = class_301.i.L();
        double d = 0.12;
        int n3 = a3;
        RenderSupport_106.L(AxisAlignedBB.fromBounds(((FeatureSupport_242)a2).L().xCoord - d, ((FeatureSupport_242)a2).L().yCoord - d, ((FeatureSupport_242)a2).L().zCoord - d, ((FeatureSupport_242)a2).L().xCoord + d, ((FeatureSupport_242)a2).L().yCoord + d, ((FeatureSupport_242)a2).L().zCoord + d), n3, class_301.f.L(), ThemeSupport_064.L(n3, (float)ThemeSupport_064.d(n3) / 255.0f * 0.25f));
        RenderSupport_106.L();
    }

    public Trajectories() {
        super("Trajectories", "Predicts where thrown items will land", ModuleCategory.f);
        Trajectories a;
        Trajectories class_301 = a;
        a.h = new ColorSetting("Color", -8857601).D().L("Colour of the predicted path");
        class_301.i = new ColorSetting("Impact color", -38302).L("Colour of the landing marker");
        a.f = new NumberSetting("Line width", 1.5, 0.5, 5.0, 0.5).d(" px");
        a.I = new BooleanSetting("Impact marker", --1 != 0).L("Draw a box where the projectile lands");
        a.m = new BooleanSetting("Through walls", 3 >> 2);
        a.l = new NumberSetting("Max ticks", 120.0, 20.0, 300.0, 10.0).L("How far ahead to simulate");
        a.H = new FeatureSupport_293();
    }

    private FeatureMode_252 L(ItemStack itemStack) {
        ItemStack a = itemStack;
        Trajectories a2 = this;
if (a == null) {
            return null;
        }
        if (a.getItem() instanceof ItemEnderPearl) {
            if (a2.H.e.d()) {
                return FeatureMode_252.I;
            }
            return null;
        }
        if (a.getItem() instanceof ItemSnowball || a.getItem() instanceof ItemEgg) {
            if (a2.H.i.d()) {
                return FeatureMode_252.e;
            }
            return null;
        }
        if (a.getItem() instanceof ItemPotion) {
            if (!a2.H.d.d() || !ItemPotion.isSplash(a.getMetadata())) {
                return null;
            }
            return FeatureMode_252.h;
        }
        if (a.getItem() instanceof ItemBow) {
            if (a2.H.f.d()) {
                return FeatureMode_252.d;
            }
            return null;
        }
        return null;
    }

    private float L(FeatureMode_252 enum_252) {
        float f2;
        FeatureMode_252 a22 = enum_252;
        Trajectories a = this;
if (a22 != FeatureMode_252.d) {
            return a22.d();
        }
        if (!Trajectories.e.thePlayer.isUsingItem()) {
            return 0.0f;
        }
        float a22 = (float)Trajectories.e.thePlayer.getItemInUseDuration() / 20.0f;
        a22 = 0.0f;
        if (f2 < 0.1f) {
            return 0.0f;
        }
        if (0 > 1.0f) {
            a22 = 1.0f;
        }
        return 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    private Vec3 L(Vec3 vec3, Vec3 vec32) {
        void a;
        Vec3 a2 = vec3;
        Trajectories a3 = this;
if (!a3.H.H.d()) {
            return null;
        }
        Object object = AxisAlignedBB.fromBounds(Math.min(a2.xCoord, a.xCoord), Math.min(a2.yCoord, a.yCoord), Math.min(a2.zCoord, a.zCoord), Math.max(a2.xCoord, a.xCoord), Math.max(a2.yCoord, a.yCoord), Math.max(a2.zCoord, a.zCoord)).expand(1.0, 1.0, 1.0);
        Vec3 vec33 = null;
        double d = Double.MAX_VALUE;
        object = Trajectories.e.theWorld.getEntitiesWithinAABBExcludingEntity(Trajectories.e.thePlayer, (AxisAlignedBB)object).iterator();
        block0: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                double d2;
                Object object3 = (Entity)object.next();
                if (!((Entity)object3).canBeCollidedWith()) continue block0;
                if (object3 == Trajectories.e.thePlayer) {
                    object2 = object;
                    continue;
                }
                if ((object3 = ((Entity)object3).getEntityBoundingBox().expand(0.3, 0.3, 0.3).calculateIntercept(a2, (Vec3)a)) == null) continue block0;
                if (((MovingObjectPosition)object3).hitVec == null) {
                    object2 = object;
                    continue;
                }
                double d3 = a2.squareDistanceTo(((MovingObjectPosition)object3).hitVec);
                if (!(d2 < d)) continue block0;
                d = d3;
                vec33 = ((MovingObjectPosition)object3).hitVec;
                continue block0;
            }
            break;
        }
        return vec33;
    }

    /*
     * WARNING - void declaration
     */
    private FeatureSupport_242 L(FeatureMode_252 enum_252, float f2, float f3) {
        void a232;
        double d;
        Object a = enum_252;
        Trajectories a3 = this;
float a3232 = Trajectories.e.thePlayer.rotationYaw;
        float f4 = Trajectories.e.thePlayer.rotationPitch;
        double d2 = (double)a3232 / 180.0 * Math.PI;
        double d3 = (double)f4 / 180.0 * Math.PI;
        double d4 = (double)(f4 + ((FeatureMode_252)((Object)a)).L()) / 180.0 * Math.PI;
        double d5 = Trajectories.e.thePlayer.posX - Math.cos(d2) * 0.16;
        double d6 = Trajectories.e.thePlayer.posY + (double)Trajectories.e.thePlayer.getEyeHeight() - (double)0.1f;
        double d7 = Trajectories.e.thePlayer.posZ - Math.sin(d2) * 0.16;
        double d8 = -Math.sin(d2) * Math.cos(d3);
        d2 = Math.cos(d2) * Math.cos(d3);
        d3 = -Math.sin(d4);
        double d11 = d8;
        d11 = d3;
        d11 = d2;
        d4 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
        if (d < 1.0E-6) {
            return new FeatureSupport_242(List.of(), null);
        }
        d8 = d8 / d4 * (double)a232;
        d3 = d3 / d4 * (double)a232;
        d2 = d2 / d4 * (double)a232;
        d4 = ((FeatureMode_252)((Object)a)).L();
        a = new ArrayList();
        a.add(new Vec3(d5, d6, d7));
        int a232 = a3.l.d();
        int a3232 = 0;
        int n = a3232;
        while (n < a232) {
            Vec3 vec3 = new Vec3(d5, d6, d7);
            Vec3 vec32 = new Vec3(d5 += d8, d6 += d3, d7 += d2);
            boolean bl = 0;
            MovingObjectPosition movingObjectPosition = Trajectories.e.theWorld.rayTraceBlocks(vec3, vec32, bl, --1 != 0, bl);
            if (movingObjectPosition != null && movingObjectPosition.hitVec != null) {
                a.add(movingObjectPosition.hitVec);
                return new FeatureSupport_242((List<Vec3>)a, movingObjectPosition.hitVec);
            }
            if ((vec3 = a3.L(vec3, vec32)) != null) {
                a.add(vec3);
                return new FeatureSupport_242((List<Vec3>)a, vec3);
            }
            a.add(vec32);
            if (d6 < 0.0) {
                return new FeatureSupport_242((List<Vec3>)a, null);
            }
            d8 *= 0.99;
            d3 *= 0.99;
            d2 *= 0.99;
            d3 -= d4;
            n = ++a3232;
        }
        return new FeatureSupport_242((List<Vec3>)a, null);
    }
}

