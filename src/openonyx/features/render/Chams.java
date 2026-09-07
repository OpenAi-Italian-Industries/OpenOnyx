/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import net.minecraft.entity.EntityLivingBase;
import openonyx.events.TargetType;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_237;
import openonyx.features.render.FeatureSupport_296;
import openonyx.movement.MovementSupport_088;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.theme.internal.ThemeSupport_064;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Chams
extends Module {
    final public FeatureSupport_296 e;

    public float d(TargetType enum_527) {
        Object a = enum_527;
        Chams a2 = this;
a = a2.e.L((TargetType)((Object)a));
        if (((FeatureSupport_237)a).I.d()) {
            return ((FeatureSupport_237)a).H.L() / 100.0f;
        }
        return 0.0f;
    }

    public int L(TargetType enum_527) {
        Object a22 = enum_527;
        Chams a = this;
FeatureSupport_237 class_237 = a.e.L((TargetType)((Object)a22));
        int a22 = Math.round(Math.clamp(class_237.d.L() / 100.0f, 0.05f, 1.0f) * 255.0f);
        return ThemeSupport_064.L(class_237.l.h(), 0);
    }

    public float L(TargetType enum_527) {
        Object a = enum_527;
        Chams a2 = this;
return a2.e.L((TargetType)((Object)a)).e.L() / 100.0f;
    }

    public FeatureSupport_237 L(TargetType enum_527) {
        Object a = enum_527;
        Chams a2 = this;
return a2.e.L((TargetType)((Object)a));
    }

    public boolean L(TargetType enum_527) {
        Object a = enum_527;
        Chams a2 = this;
return a2.e.L((TargetType)((Object)a)).i.d();
    }

    public Chams() {
        super("Chams", "Reskins entities with a graded color tint on the model itself", ModuleCategory.f);
        Chams a;
        Chams class_284 = a;
        class_284.e = new FeatureSupport_296();
    }

    public TargetType L(EntityLivingBase entityLivingBase) {
        Object a = entityLivingBase;
        Chams a2 = this;
if (!a2.d()) {
            return null;
        }
        if ((a = TargetType.L((EntityLivingBase)a)) == null) {
            return null;
        }
        if (a2.e.L((TargetType)((Object)a)).D()) {
            return a;
        }
        return null;
    }
}

