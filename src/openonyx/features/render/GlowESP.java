/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import openonyx.core.OnyxClient;
import openonyx.events.TargetType;
import openonyx.features.Module;
import openonyx.features.ModuleManager;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_276;
import openonyx.features.render.FeatureSupport_328;
import openonyx.features.render.FeatureMode_262;
import openonyx.history.SettingSupport_036;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.internal.RenderSupport_174;
import openonyx.theme.ThemeSupport_056;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GlowESP
extends Module {
    private final static String l = "onyx_glow_outline";
    private final static String I = "entity_outline";
    public NumberSetting d;
    private final static String i = "onyx_glow_fill";
    final public FeatureSupport_328 f;
    public NumberSetting H;
    public EnumSetting<FeatureMode_262> e;

    public static String i() {
GlowESP class_309 = GlowESP.L();
        if (class_309 == null || !class_309.d()) {
            return I;
        }
        if (class_309.h()) {
            return i;
        }
        return l;
    }

    public static boolean d(EntityLivingBase entityLivingBase) {
        EntityLivingBase entityLivingBase2 = entityLivingBase;
GlowESP a = GlowESP.L();
        if (a != null && a.L(entityLivingBase2)) {
            return 1 != 0;
        }
        return false;
    }

    public boolean h() {
        GlowESP a;
if (a.d() && a.e.L(FeatureMode_262.e)) {
            return --1 != 0;
        }
        return false;
    }

    public FeatureSupport_276 L(EntityLivingBase entityLivingBase) {
        Object a = entityLivingBase;
        GlowESP a2 = this;
if (!a2.d()) {
            return null;
        }
        if ((a = TargetType.L((EntityLivingBase)a)) == null) {
            return null;
        }
        if (((SettingSupport_036)(a = a2.f.L((TargetType)((Object)a)))).D()) {
            return a;
        }
        return null;
    }

    public boolean L(EntityLivingBase entityLivingBase) {
        EntityLivingBase a = entityLivingBase;
        GlowESP a2 = this;
if (a2.L(a) != null) {
            return 1 != 0;
        }
        return false;
    }

    public static GlowESP L() {
ModuleManager class_228 = OnyxClient.l;
        if (class_228 == null) {
            return null;
        }
        return class_228.F;
    }

    public static int L(EntityLivingBase entityLivingBase) {
        EntityLivingBase a;
        EntityLivingBase entityLivingBase2 = entityLivingBase;
GlowESP class_309 = GlowESP.L();
        EntityLivingBase entityLivingBase3 = a = class_309 == null ? null : class_309.L(entityLivingBase2);
        if (a == null) {
            return 0xFFFFFF;
        }
        return ((FeatureSupport_276)((Object)a)).e.h() & 0xFFFFFF;
    }

    public GlowESP() {
        super("GlowESP", "Outline glow or liquid-metal fill for selected entities", ModuleCategory.f);
        GlowESP a2;
        GlowESP class_309 = a2;
        a2.f = new FeatureSupport_328();
        class_309.e = new EnumSetting<FeatureMode_262>("Mode", FeatureMode_262.H);
        a2.H = ((NumberSetting)new NumberSetting("Radius", 14.0, 2.0, 24.0, 1.0).d(" px").L("How far the glow spreads around the entity")).L(a2.e, a -> {
if (a == FeatureMode_262.H) {
                return --1 != 0;
            }
            return false;
        });
        a2.d = new NumberSetting("Intensity", 40.0, 10.0, 100.0, 5.0).d("%").L("Opacity of the outer glow");
    }

    public static boolean L(Entity entity) {
        Entity entity2 = entity;
GlowESP a = GlowESP.L();
        if (a == null || !a.d()) {
            return entity2 instanceof EntityPlayer;
        }
        if (entity2 instanceof EntityLivingBase && a.L((EntityLivingBase)entity2)) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean I() {
GlowESP class_309 = GlowESP.L();
        if (class_309 != null && class_309.d()) {
            return 1 != 0;
        }
        return false;
    }
}

