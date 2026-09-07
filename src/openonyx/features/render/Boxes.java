/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import openonyx.events.TargetType;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_235;
import openonyx.features.render.FeatureSupport_288;
import openonyx.features.render.FeatureSupport_290;
import openonyx.features.render.FeatureMode_280;
import openonyx.features.render.FeatureMode_282;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.history.SettingSupport_036;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_106;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_111;
import openonyx.render.RenderSupport_113;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.Timer;

public final class Boxes
extends Module {
    final public EnumSetting<FeatureMode_280> L;
    final public NumberSetting j;
    private final static double m = 0.125;
    private final static double h = 0.06;
    final public BooleanSetting l;
    final public FeatureSupport_235 I;
    final public EnumSetting<FeatureMode_282> d;
    private final static float i = 2.0f;
    private final RenderSupport_103 f;
    final public NumberSetting H;
    final public NumberSetting e;

    private static AxisAlignedBB L(AxisAlignedBB a) {
double d = a.maxY - a.minY;
        d = Math.min(0.125, d * 0.5);
        return new AxisAlignedBB(a.minX, a.minY, a.minZ, a.maxX, a.maxY - d, a.maxZ);
    }

    private static AxisAlignedBB L(EntityLivingBase entityLivingBase, float f2) {
        float a22 = f2;
        EntityLivingBase a = entityLivingBase;
EntityLivingBase entityLivingBase2 = a;
        double d = entityLivingBase2.lastTickPosX + (a.posX - a.lastTickPosX) * 0.0 - a.posX;
        EntityLivingBase entityLivingBase3 = a;
        double d2 = entityLivingBase2.lastTickPosY + (entityLivingBase3.posY - a.lastTickPosY) * 0.0 - a.posY;
        double d3 = entityLivingBase3.lastTickPosZ + (a.posZ - a.lastTickPosZ) * 0.0 - a.posZ;
        AxisAlignedBB a22 = entityLivingBase2.getEntityBoundingBox().offset(d, d2, d3).expand(0.06, 0.06, 0.06);
        if (Boxes.L(entityLivingBase2)) {
            return Boxes.L(a22);
        }
        return a22;
    }

    public Boxes() {
        super("Boxes", "Outlines entities with a 2D or 3D box", ModuleCategory.f);
        Boxes a;
        Boxes class_233 = a;
        a.L = new EnumSetting<FeatureMode_280>("Shape", FeatureMode_280.i).L("A flat rectangle around the entity, or a cuboid sitting on it in the world");
        class_233.d = new EnumSetting<FeatureMode_282>("Style", FeatureMode_282.i).L("Lines only, or lines over a translucent fill");
        a.H = ((NumberSetting)new NumberSetting("Fill opacity", 18.0, 1.0, 60.0, 1.0).d("%").L("How solid the fill sits behind the outline")).L(() -> {
            Boxes a;
return a.d.L(FeatureMode_282.f);
        });
        a.e = new NumberSetting("Line width", 1.5, 0.5, 5.0, 0.5).d(" px");
        a.l = ((BooleanSetting)new BooleanSetting("Through walls", 3 >> 1).L("Keeps the box visible when the entity is behind blocks")).L(() -> {
            Boxes a;
return a.L.L(FeatureMode_280.H);
        });
        Boxes class_2332 = a;
        class_2332.j = new NumberSetting("Distance", 256.0, 8.0, 256.0, 8.0).d(" m").L("Maximum distance at which a box is drawn");
        class_2332.I = new FeatureSupport_235();
        class_2332.f = new RenderSupport_103().L();
    }

    private static boolean L(EntityLivingBase a) {
if (a instanceof EntityPlayer && ((EntityPlayer)a).isSneaking()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2) {
        ScaledResolution scaledResolution;
        Boxes class_233 = this;
if (!class_233.L(FeatureMode_280.i) || !RenderSupport_107.L()) {
            return;
        }
        List<FeatureSupport_288> list = class_233.D();
        if (list.isEmpty()) {
            return;
        }
        ScaledResolution scaledResolution2 = scaledResolution = new ScaledResolution((Minecraft)((Object)e));
        float f3 = scaledResolution2.getScaledWidth();
        float f4 = scaledResolution2.getScaledHeight();
        class_233.f.i();
        Iterator<FeatureSupport_288> iterator = list.iterator();
        block0: while (true) {
            Iterator<FeatureSupport_288> iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a;
                FeatureSupport_288 class_288 = iterator.next();
                RenderSupport_113 a2 = RenderSupport_111.L(class_288.L(), (float)a, f3, f4);
                if (a2 == null) continue block0;
                if (a2.L() < 2.0f) {
                    iterator2 = iterator;
                    continue;
                }
                int n = class_288.L();
                Boxes class_2332 = class_233;
                float f5 = class_2332.e.L();
                if (class_2332.d.L(FeatureMode_282.f)) {
                    class_233.f.i(a2.D(), a2.I(), a2.L(), a2.d(), class_233.L(n));
                }
                class_233.f.L(a2.D(), a2.I(), a2.L(), a2.d(), 0.0f, f5, n);
                iterator2 = iterator;
            }
            break;
        }
        class_233.f.d();
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        Boxes class_233 = this;
if (!class_233.L(FeatureMode_280.H)) {
            return;
        }
        Object a2 = class_233.D();
        if (a2.isEmpty()) {
            return;
        }
        if (!RenderSupport_106.L((float)a, class_233.l.d())) {
            return;
        }
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            int n;
            FeatureSupport_288 class_288 = (FeatureSupport_288)a2.next();
            iterator = a2;
            FeatureSupport_288 class_2882 = class_288;
            int n2 = n = class_2882.L();
            RenderSupport_106.L(Boxes.L(class_2882.L(), (float)a), n2, class_233.e.L(), class_233.L(n2));
        }
        RenderSupport_106.L();
    }

    private boolean L(FeatureMode_280 enum_280) {
        FeatureMode_280 a = enum_280;
        Boxes a2 = this;
if (a2.d() && a2.L.L(a) && ((Minecraft)((Object)Boxes.e)).thePlayer != null && ((Minecraft)((Object)Boxes.e)).theWorld != null) {
            return 1 != 0;
        }
        return false;
    }

    private int L(int n) {
        int a = n;
        Boxes a2 = this;
if (a2.d.L(FeatureMode_282.f)) {
            return ThemeSupport_064.L(0, a2.H.L() / 100.0f);
        }
        return 0;
    }

    private List<FeatureSupport_288> D() {
        Boxes class_233 = this;
ArrayList<FeatureSupport_288> arrayList = new ArrayList<FeatureSupport_288>();
        double d = (Double)class_233.j.L() * (Double)class_233.j.L();
        Iterator a2 = ((Minecraft)((Object)Boxes.e)).theWorld.loadedEntityList.iterator();
        block0: while (true) {
            Iterator iterator = a2;
            while (iterator.hasNext()) {
                Entity entity = (Entity)a2.next();
                if (!(entity instanceof EntityLivingBase)) continue block0;
                Object object = TargetType.L((EntityLivingBase)(entity = (EntityLivingBase)entity));
                if (object == null) {
                    iterator = a2;
                    continue;
                }
                if (!((SettingSupport_036)(object = class_233.I.L((TargetType)((Object)object)))).D()) {
                    iterator = a2;
                    continue;
                }
                if (((Minecraft)((Object)Boxes.e)).thePlayer.getDistanceSqToEntity(entity) > d) {
                    iterator = a2;
                    continue;
                }
                arrayList.add(new FeatureSupport_288((EntityLivingBase)entity, ((FeatureSupport_290)object).e.h()));
                iterator = a2;
            }
            break;
        }
        arrayList.sort(Comparator.comparingDouble(a -> {
return ((Minecraft)((Object)Boxes.e)).thePlayer.getDistanceSqToEntity(a.L());
        }).reversed());
        return arrayList;
    }
}

