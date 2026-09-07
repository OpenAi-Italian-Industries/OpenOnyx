/*
 * Decompiled with CFR.
 */
package openonyx.features.player;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.skins.SkinSupport_073;
import openonyx.utilities.Timer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class FastPlace
extends Module {
    private transient long I;
    public RangeSetting d;
    public BooleanSetting i;
    private final transient Timer f;
    public BooleanSetting H;
    public BooleanSetting e;

    @Override
    public String L() {
        FastPlace a;
return a.d.I();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(MovingObjectPosition movingObjectPosition, ItemStack itemStack) {
        void a;
        void a2;
        FastPlace class_406 = this;
int a3 = a2 != null && a2.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && a != null && a.getItem() instanceof ItemBlock ? 1 : 0;
        FastPlace class_4062 = class_406;
        if (a3 != 0) {
            return class_4062.H.d();
        }
        return class_4062.i.d();
    }

    private static FastPlace L() {
if (OnyxClient.l == null) {
            return null;
        }
        return OnyxClient.l.ga;
    }

    public FastPlace() {
        FastPlace a;
        FastPlace class_406 = a;
        super("FastPlace", "Places, interacts and jumps without vanilla's cooldowns", ModuleCategory.i);
        FastPlace class_4062 = a;
        class_4062.H = new BooleanSetting("Place", --1 != 0).L("Removes the delay when the right click puts a block down");
        class_406.i = new BooleanSetting("Interact", 1 != 0).L("Removes the delay on everything else the right click does - using items, and clicking entities");
        class_406.e = new BooleanSetting("Jump", 5 >> 3).L("Removes the 10 tick cooldown after a jump, so you leave the ground again the tick you land");
        int n = 20;
        class_406.d = RangeSetting.L("CPS", 12, n, 1, n).L(" cps").d("The rate the held right click repeats at - re-rolled inside this range every action").L(() -> {
FastPlace class_406 = FastPlace.L();
            return class_406 != null && (class_406.H.d() || class_406.i.d());
        });
        a.f = new Timer();
    }

    /*
     * WARNING - void declaration
     */
    public static int L(MovingObjectPosition movingObjectPosition, ItemStack itemStack) {
        void a;
        MovingObjectPosition movingObjectPosition2 = movingObjectPosition;
FastPlace a2 = FastPlace.L();
        if (a2 == null || !a2.d()) {
            return 4;
        }
        a2.f.L();
        if (a2.L(movingObjectPosition2, (ItemStack)a)) {
            return 0;
        }
        return 4;
    }

    @Override
    protected void L() {
        FastPlace a;
FastPlace class_406 = a;
        class_406.I = class_406.L();
        class_406.f.L();
    }

    private long L() {
        FastPlace a;
return (long)(1000.0 / a.d.D());
    }

    public static boolean I() {
FastPlace class_406 = FastPlace.L();
        if (class_406 == null || !class_406.d()) {
            return true;
        }
        if (!class_406.H.d() && !class_406.i.d()) {
            return 5 >> 2;
        }
        FastPlace class_4062 = class_406;
        if (!class_4062.f.L(class_4062.I)) {
            return 0 != 0;
        }
        class_406.I = class_406.L();
        return 3 >> 1;
    }

    public static int L(EntityLivingBase entityLivingBase) {
        EntityLivingBase entityLivingBase2 = entityLivingBase;
FastPlace a = FastPlace.L();
        if (a == null || !a.d() || !a.e.d()) {
            return 10;
        }
        if (entityLivingBase2 == ((Minecraft)((Object)FastPlace.e)).thePlayer) {
            return 0;
        }
        return 10;
    }
}

