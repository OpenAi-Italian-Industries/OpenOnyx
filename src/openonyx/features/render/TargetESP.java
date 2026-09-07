/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.EventSupport_617;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_295;
import openonyx.features.render.FeatureSupport_297;
import openonyx.features.render.FeatureMode_244;
import openonyx.features.render.FeatureMode_246;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_099;
import openonyx.render.group_k.RenderSupport_151;
import openonyx.render.group_k.RenderSupport_152;
import openonyx.render.group_k.RenderSupport_153;
import openonyx.render.group_k.RenderSupport_154;
import openonyx.render.group_k.CrystalEffectSettings;
import openonyx.render.group_k.RenderSupport_156;
import openonyx.skins.SkinSupport_073;

public final class TargetESP
extends Module {
    private final RenderSupport_154 k;
    private final RenderSupport_151 g;
    private final static float M = 100.0f;
    public NumberSetting L;
    public FeatureSupport_297 j;
    public EnumSetting<FeatureMode_246> m;
    private long h;
    public ColorSetting l;
    private final RenderSupport_152 I;
    private final RenderSupport_153<EntityLivingBase> d;
    public NumberSetting i;
    public FeatureSupport_295 f;
    public ColorSetting H;
    public NumberSetting e;

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        TargetESP a2 = this;
a2.h();
    }

    private RenderSupport_156 L() {
        TargetESP a;
return new RenderSupport_156(a.l.h(), a.f.a.L(), a.f.j.L(), ((FeatureMode_244)a.f.i.L()).L(), a.f.e.L() / 100.0f, a.f.h.d(), a.f.g.d(), a.f.f.L(), a.f.I.L() / 100.0f, a.f.d.d(), a.f.l.L(), a.f.m.L(), a.f.L.d(), a.f.H.L(), a.f.k.L(), a.f.M.L());
    }

    private EntityLivingBase L() {
        TargetESP class_299 = this;
if (((Minecraft)((Object)TargetESP.e)).theWorld == null || ((Minecraft)((Object)TargetESP.e)).thePlayer == null) {
            return null;
        }
        EntityLivingBase a = OnyxClient.l.u.D();
        if (a == null || !a.isEntityAlive() || a.worldObj != ((Minecraft)((Object)TargetESP.e)).theWorld) {
            return null;
        }
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        TargetESP class_299;
        TargetESP class_2992 = this;
if (!class_2992.d()) {
            return;
        }
        long l = System.nanoTime();
        float a22 = class_2992.h == 0L ? 0.0f : Math.min((float)(l - class_2992.h) / 1000000.0f, 100.0f);
        class_2992.h = l;
        TargetESP class_2993 = class_2992;
        if (class_2992.h()) {
            class_2993.I.L((float)0);
            class_299 = class_2992;
        } else {
            class_2993.I.L();
            class_299 = class_2992;
        }
        EntityLivingBase entityLivingBase = class_299.L();
        TargetESP class_2994 = class_2992;
        class_2994.d.L(entityLivingBase, 0);
        EntityLivingBase a22 = class_2994.d.d();
        float f3 = class_2992.d.L();
        if (a22 == null || f3 <= 0.0f || a22.worldObj != ((Minecraft)((Object)TargetESP.e)).theWorld) {
            return;
        }
        if (class_2992.m.L(FeatureMode_246.e)) {
            class_2992.g.L(a22, f3, (float)a, class_2992.L());
            return;
        }
        class_2992.k.L(a22, f3, System.currentTimeMillis(), (float)a, class_2992.L(), class_2992.I);
    }

    @Override
    protected void L() {
        TargetESP a;
a.h();
    }

    @EventHandler
    private void L(EventSupport_617 class_617) {
        EventSupport_617 a = class_617;
        TargetESP a2 = this;
if (!a2.h() || a.L() != ((Minecraft)((Object)TargetESP.e)).thePlayer) {
            return;
        }
        if (a.L() != a2.d.d()) {
            return;
        }
        TargetESP class_299 = a2;
        class_299.I.L(class_299.j.e.d(), a2.j.H.L() / 100.0f);
    }

    @EventHandler
    private void L(TickEndEvent class_626) {
        TargetESP class_299;
        Object object;
        Object a = class_626;
        TargetESP a2 = this;
if (!a2.m.L(FeatureMode_246.e)) {
            return;
        }
        a = a2.d.d();
        RenderSupport_151 class_151 = a2.g;
        if (a != null && ((EntityLivingBase)a).worldObj == ((Minecraft)((Object)TargetESP.e)).theWorld) {
            object = a;
            class_299 = a2;
        } else {
            object = null;
            class_299 = a2;
        }
        class_151.d((EntityLivingBase)object, class_299.d.L(), a2.L());
    }

    private boolean h() {
        TargetESP a;
if (a.m.L(FeatureMode_246.i) && a.j.D()) {
            return 1 != 0;
        }
        return false;
    }

    @Override
    protected void D() {
        TargetESP a;
a.h();
    }

    private void h() {
        TargetESP a;
TargetESP class_299 = a;
        class_299.d.L();
        class_299.I.L();
        a.g.d();
        a.h = 0L;
    }

    private CrystalEffectSettings L() {
        TargetESP a;
return new CrystalEffectSettings(a.e.L() / 100.0f, a.L.L() / 100.0f, a.i.L() / 100.0f, a.j.i.L() / 100.0f, a.l.h(), a.H.h(), a.j.f.h());
    }

    public TargetESP() {
        super("TargetESP", "Marks the KillAura target", ModuleCategory.f);
        TargetESP a2;
        TargetESP class_299 = a2;
        a2.m = new EnumSetting<FeatureMode_246>("Style", FeatureMode_246.i);
        class_299.l = new ColorSetting("Color", -8857601).D().L("Colour of the mark on the target");
        a2.H = ((ColorSetting)new ColorSetting("Glow color", -8857601).L(a2.m, a -> {
if (a == FeatureMode_246.i) {
                return --1 != 0;
            }
            return false;
        })).L("Colour of the halo around each shard");
        a2.e = ((NumberSetting)new NumberSetting("Glow", 75.0, 0.0, 300.0, 5.0).d("%").L(a2.m, a -> {
if (a == FeatureMode_246.i) {
                return --1 != 0;
            }
            return false;
        })).L("How much light the halos throw");
        a2.L = ((NumberSetting)new NumberSetting("Glow size", 70.0, 25.0, 300.0, 5.0).d("%").L(a2.m, a -> {
if (a == FeatureMode_246.i) {
                return --1 != 0;
            }
            return false;
        })).L("Radius of each halo");
        a2.i = ((NumberSetting)new NumberSetting("Crystal opacity", 100.0, 0.0, 100.0, 5.0).d("%").L(a2.m, a -> {
if (a == FeatureMode_246.i) {
                return 3 >> 1;
            }
            return false;
        })).L("How solid the orbiting shards are");
        a2.f = new FeatureSupport_295();
        a2.j = new FeatureSupport_297();
        a2.d = new RenderSupport_153();
        a2.I = new RenderSupport_152();
        a2.k = new RenderSupport_154();
        a2.g = new RenderSupport_151();
        a2.f.L(() -> {
            TargetESP a;
return a.m.L(FeatureMode_246.e);
        });
        a2.j.L(() -> {
            TargetESP a;
return a.m.L(FeatureMode_246.i);
        });
    }
}

