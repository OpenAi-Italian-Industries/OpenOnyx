/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.List;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_254;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.interaction.internal.PlacementResult;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_m.RenderSupport_161;
import openonyx.render.group_m.RenderSupport_162;
import openonyx.render.group_m.RenderSupport_164;

public final class Trails
extends Module {
    final public NumberSetting M;
    private final static double L = 1.0E-8;
    final public NumberSetting j;
    final public NumberSetting m;
    private final static float h = 0.8f;
    final public EnumSetting<FeatureMode_254> l;
    final public NumberSetting I;
    private final RenderSupport_161 d;
    private final List<RenderSupport_164> i;
    final public BooleanSetting f;
    final public BooleanSetting H;
    final public ColorSetting e;

    @Override
    protected void L() {
        Trails a;
a.i.clear();
    }

    private RenderSupport_162 L() {
        Trails a;
return new RenderSupport_162((FeatureMode_254)a.l.L(), a.e.h(), a.m.L() / 100.0f, (long)((Double)a.I.L() * 1000.0), a.j.L(), a.M.L(), a.H.d());
    }

    private void h() {
        Trails a;
long l = System.currentTimeMillis() - (long)((Double)a.I.L() * 1000.0);
        a.i.removeIf(a2 -> {
if (a2.L() < 0) {
                return 1 != 0;
            }
            return false;
        });
    }

    public Trails() {
        super("Trails", "Leaves a fading trail behind you", ModuleCategory.f);
        Trails a2;
        Trails class_289 = a2;
        a2.l = new EnumSetting<FeatureMode_254>("Mode", FeatureMode_254.i);
        class_289.e = new ColorSetting("Color", -10178561).D();
        a2.I = new NumberSetting("Length", 1.0, 0.25, 5.0, 0.05).d(" s").L("How long the trail stays behind you");
        a2.m = new NumberSetting("Opacity", 60.0, 5.0, 100.0, 1.0).d("%").L("Overall opacity of the trail");
        a2.j = ((NumberSetting)new NumberSetting("Line width", 1.5, 0.5, 5.0, 0.5).d(" px").L("Thickness of the two lines bounding the wall")).L(a2.l, a -> {
if (a == FeatureMode_254.i) {
                return 1 != 0;
            }
            return false;
        });
        a2.M = new NumberSetting("Point size", 4.0, 1.0, 12.0, 0.5).d(" px").L(a2.l, a -> {
if (a == FeatureMode_254.H) {
                return 1 != 0;
            }
            return false;
        });
        Trails class_2892 = a2;
        class_2892.f = new BooleanSetting("First person", 0 != 0).L("Draw the trail in first person too, where it runs through the camera");
        class_2892.H = new BooleanSetting("Through walls", 0 != 0);
        class_2892.d = new RenderSupport_161();
        class_2892.i = new ArrayList<RenderSupport_164>();
    }

    /*
     * WARNING - void declaration
     */
    private List<RenderSupport_164> L(float f2) {
        void a;
        Object a2;
        Trails class_289 = this;
Object object = a2 = new ArrayList<RenderSupport_164>(class_289.i.size() + 1);
        a2.addAll(class_289.i);
        Object object2 = a2;
        object.add(new RenderSupport_164(new Vec3(((Minecraft)((Object)Trails.e)).thePlayer.prevPosX + (((Minecraft)((Object)Trails.e)).thePlayer.posX - ((Minecraft)((Object)Trails.e)).thePlayer.prevPosX) * (double)a, ((Minecraft)((Object)Trails.e)).thePlayer.prevPosY + (((Minecraft)((Object)Trails.e)).thePlayer.posY - ((Minecraft)((Object)Trails.e)).thePlayer.prevPosY) * (double)a, ((Minecraft)((Object)Trails.e)).thePlayer.prevPosZ + (((Minecraft)((Object)Trails.e)).thePlayer.posZ - ((Minecraft)((Object)Trails.e)).thePlayer.prevPosZ) * (double)a), System.currentTimeMillis()));
        return object;
    }

    @EventHandler
    private void L(TickEndEvent class_626) {
        Trails a;
        Trails class_289 = this;
if (((Minecraft)((Object)Trails.e)).thePlayer == null || ((Minecraft)((Object)Trails.e)).theWorld == null) {
            return;
        }
        Trails class_2892 = class_289;
        class_2892.h();
        Vec3 a2 = new Vec3(((Minecraft)((Object)Trails.e)).thePlayer.posX, ((Minecraft)((Object)Trails.e)).thePlayer.posY, ((Minecraft)((Object)Trails.e)).thePlayer.posZ);
        if (class_2892.i.isEmpty()) {
            v1 = null;
        } else {
            Trails class_2893 = class_289;
            v1 = a = class_2893.i.get(class_2893.i.size() - 1);
        }
        if (a == null || ((RenderSupport_164)((Object)a)).L().squareDistanceTo(a2) > 1.0E-8) {
            class_289.i.add(new RenderSupport_164(a2, System.currentTimeMillis()));
        }
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Trails a2 = this;
a2.i.clear();
    }

    private float L() {
return ((Minecraft)((Object)Trails.e)).thePlayer.height * (((Minecraft)((Object)Trails.e)).thePlayer.isSneaking() ? 0.8f : 1.0f);
    }

    @Override
    protected void D() {
        Trails a;
Trails class_289 = a;
        class_289.i.clear();
        class_289.d.d();
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        Trails class_289 = this;
if (!class_289.d() || ((Minecraft)((Object)Trails.e)).theWorld == null || ((Minecraft)((Object)Trails.e)).thePlayer == null) {
            return;
        }
        if (!class_289.f.d() && ((Minecraft)((Object)Trails.e)).gameSettings.thirdPersonView == 0) {
            return;
        }
        class_289.h();
        List<RenderSupport_164> a2 = class_289.L((float)a);
        if (a2.size() < (class_289.l.L(FeatureMode_254.i) ? 2 : 1)) {
            return;
        }
        class_289.d.L((float)a, a2, class_289.L(), class_289.L());
    }
}

