/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.events.MovementRotation;
import openonyx.events.EntityRelationUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_248;
import openonyx.features.render.FeatureMode_283;
import openonyx.history.SettingValue;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_k.CrystalEffectSettings;
import openonyx.render.internal.RenderSupport_172;
import openonyx.render.internal.RenderSupport_174;
import openonyx.render.internal.RenderSupport_175;
import openonyx.render.internal.RenderSupport_176;
import openonyx.render.internal.RenderMode_171;

public final class Wings
extends Module {
    private final List<RenderSupport_176> D;
    public NumberSetting c;
    public EnumSetting<FeatureMode_248> a;
    private final static float k = 1.5f;
    public ColorSetting g;
    public NumberSetting M;
    public EnumSetting<RenderMode_171> L;
    public NumberSetting j;
    public MultiSelectSetting<FeatureMode_283> m;
    public NumberSetting h;
    public BooleanSetting l;
    public NumberSetting I;
    private final RenderSupport_172 d;
    public BooleanSetting i;
    public NumberSetting f;
    public NumberSetting H;
    private final static float e = 0.15f;

    /*
     * WARNING - void declaration
     */
    private float L(EntityPlayer entityPlayer, float f2) {
        void a;
        EntityPlayer a2 = entityPlayer;
        Wings a3 = this;
if (a2 == Wings.e.thePlayer && MovementRotation.L(a2)) {
            return MovementRotation.D((float)a);
        }
        Object object = a2;
        return ((EntityPlayer)object).prevRenderYawOffset + MathHelper.wrapAngleTo180_float(((EntityPlayer)object).renderYawOffset - a2.prevRenderYawOffset) * a;
    }

    public Wings() {
        super("Wings", "Draws a pair of wings on player backs", ModuleCategory.f);
        Wings a;
        Wings class_287 = a;
        a.L = new EnumSetting<RenderMode_171>("Wing type", RenderMode_171.H).L("Silhouette the wings are cut from");
        class_287.a = new EnumSetting<FeatureMode_248>("Fill", FeatureMode_248.H).L("Flat colour, or an animated aurora inside the membrane");
        Enum[] enumArray = new FeatureMode_283[1];
        enumArray[0] = FeatureMode_283.e;
        a.m = new MultiSelectSetting("Targets", FeatureMode_283.class, enumArray).L("Who the wings are drawn on");
        Wings class_2872 = a;
        class_2872.I = new NumberSetting("Scale", 1.0, 0.3, 3.0, 0.1).d("x");
        class_2872.c = new NumberSetting("Angle", 20.0, 0.0, 90.0, 1.0).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¾ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°").L("How far the wings sweep back from the shoulders");
        class_2872.M = new NumberSetting("Height", 1.5, 0.8, 2.5, 0.05).L("How high on the back the wings sit");
        class_2872.h = new NumberSetting("Depth", 0.15f, 0.0, 0.5, 0.01).L("How far the wings stand off the back");
        class_2872.i = new BooleanSetting("Flapping", 3 >> 1);
        class_2872.H = ((NumberSetting)new NumberSetting("Flap strength", 30.0, 5.0, 60.0, 1.0).L("How far the wings swing on every beat")).L((SettingValue)a.i);
        class_2872.j = ((NumberSetting)new NumberSetting("Flap speed", 3.0, 0.5, 8.0, 0.5).L("How quickly the wings beat")).L((SettingValue)a.i);
        class_2872.l = new BooleanSetting("Through walls", 0 != 0);
        class_2872.g = new ColorSetting("Color", -1).D();
        class_2872.f = new NumberSetting("Opacity", 100.0, 5.0, 100.0, 1.0).d("%").L("Overall opacity of the wings");
        class_2872.d = new RenderSupport_172();
        class_2872.D = new ArrayList<RenderSupport_176>();
    }

    /*
     * WARNING - void declaration
     */
    private void L(EntityPlayer entityPlayer, float f2) {
        void a;
        EntityPlayer a2 = entityPlayer;
        Wings a3 = this;
RenderSupport_174 class_174 = a3.d(a2);
        if (class_174 == null) {
            return;
        }
        Vec3 vec3 = new Vec3(a2.prevPosX + (a2.posX - a2.prevPosX) * (double)a, a2.prevPosY + (a2.posY - a2.prevPosY) * (double)a, a2.prevPosZ + (a2.posZ - a2.prevPosZ) * (double)a);
        a3.D.add(new RenderSupport_176(vec3, a3.L(a2, (float)a), a3.L(a2, class_174, (float)a), (RenderMode_171)((Object)a3.L.L()), class_174));
    }

    private RenderSupport_175 L() {
        Wings a;
return new RenderSupport_175(a.a.L(FeatureMode_248.H), a.I.L(), a.M.L() - 1.5f, a.h.L() - 0.15f, a.l.d(), a.g.h(), a.f.L() / 100.0f);
    }

    private RenderSupport_174 d(EntityPlayer entityPlayer) {
        EntityPlayer a = entityPlayer;
        Wings a2 = this;
if (a.isInWater()) {
            return null;
        }
        return a2.L(a);
    }

    private RenderSupport_174 L(EntityPlayer entityPlayer) {
        EntityPlayer a = entityPlayer;
        Wings a2 = this;
if (a.isSneaking()) {
            return new RenderSupport_174(0.0f, 0.0f, 0.96f, 0.1f, 18.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.18f, 4.5f, 0.06f, 0.02f, -11.0f, -4.0f, 0.12f);
        }
        return new RenderSupport_174(0.0f, 0.0f, 1.38f, 0.1f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.18f, 4.5f, 0.06f, 0.02f, -11.0f, -4.0f, 0.12f);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        Wings class_287 = this;
if (!class_287.d() || Wings.e.theWorld == null || Wings.e.thePlayer == null) {
            return;
        }
        Wings class_2872 = class_287;
        class_2872.D.clear();
        if (class_2872.m.L(FeatureMode_283.e) && Wings.e.gameSettings.thirdPersonView != 0 && Wings.e.thePlayer.isEntityAlive()) {
            class_287.L(Wings.e.thePlayer, (float)a);
        }
        if (class_287.m.L(FeatureMode_283.H)) {
            Iterator a2 = Wings.e.theWorld.playerEntities.iterator();
            block0: while (true) {
                Iterator iterator = a2;
                while (iterator.hasNext()) {
                    EntityPlayer entityPlayer = (EntityPlayer)a2.next();
                    if (entityPlayer == Wings.e.thePlayer) continue block0;
                    if (!entityPlayer.isEntityAlive()) {
                        iterator = a2;
                        continue;
                    }
                    class_287.L(entityPlayer, (float)a);
                    iterator = a2;
                }
                break;
            }
        }
        class_287.d.L((float)a, class_287.D, class_287.L());
    }

    @Override
    protected void D() {
        Wings a;
Wings class_287 = a;
        class_287.D.clear();
        class_287.d.close();
    }

    /*
     * WARNING - void declaration
     */
    private float L(EntityPlayer entityPlayer, RenderSupport_174 class_174, float f2) {
        float f3;
        float f4;
        void a;
        EntityPlayer a2 = entityPlayer;
        Wings a3 = this;
float f5 = 0.0f;
        if (a3.i.d()) {
            void a4;
            void v0 = a;
            f4 = v0.L() * (a3.j.L() / 3.0f);
            f3 = v0.F() * (a3.H.L() / 30.0f);
            f5 = (float)Math.sin(((float)a2.ticksExisted + a4) * f4) * f3;
        }
        f4 = (float)Math.sqrt(a2.motionX * a2.motionX + a2.motionZ * a2.motionZ);
        f3 = Math.clamp(f4 * 10.0f, 0.0f, 1.0f);
        return (f5 + f3 * a.G() - a3.c.L()) * a.e();
    }
}

