/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import openonyx.events.FileDialogUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.interaction.internal.BlockPlacementContext;

public final class SeeInvisibles
extends Module {
    final public BooleanSetting i;
    final public NumberSetting f;
    final public BooleanSetting H;
    final public BooleanSetting e;

    public float L() {
        SeeInvisibles a;
return a.f.L() / 100.0f;
    }

    public boolean L(EntityLivingBase entityLivingBase) {
        EntityLivingBase a = entityLivingBase;
        SeeInvisibles a2 = this;
if (!a2.d() || a == null || !a.isInvisible()) {
            return false;
        }
        if (a instanceof EntityPlayer) {
            return a2.H.d();
        }
        if (a instanceof IMob) {
            return a2.i.d();
        }
        if (a instanceof EntityAnimal) {
            return a2.e.d();
        }
        return a2.e.d();
    }

    public SeeInvisibles() {
        super("SeeInvisibles", "Renders invisible entities", ModuleCategory.f);
        SeeInvisibles a;
        SeeInvisibles class_234 = a;
        a.H = new BooleanSetting("Players", 5 >> 2).L("Show invisible players");
        class_234.i = new BooleanSetting("Mobs", --1 != 0).L("Show invisible hostile mobs");
        a.e = new BooleanSetting("Animals", 0 != 0).L("Show invisible passive mobs");
        a.f = new NumberSetting("Opacity", 60.0, 10.0, 100.0, 5.0).d("%").L("How solid an invisible entity is drawn");
    }
}

