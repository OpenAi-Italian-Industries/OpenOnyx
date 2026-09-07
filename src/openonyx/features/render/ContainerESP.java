/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3i;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_106;
import openonyx.skins.SkinSupport_073;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.utilities.UtilitySupport_489;

public final class ContainerESP
extends Module {
    final public BooleanSetting l;
    final public BooleanSetting I;
    final public BooleanSetting d;
    final public BooleanSetting i;
    final public NumberSetting f;
    final public BooleanSetting H;
    final public BooleanSetting e;

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        ContainerESP class_286 = this;
if (!class_286.d() || ((Minecraft)((Object)ContainerESP.e)).theWorld == null) {
            return;
        }
        Object object = new ArrayList(((Minecraft)((Object)ContainerESP.e)).theWorld.loadedTileEntityList);
        int n = 0;
        Object object2 = object = object.iterator();
        while (object2.hasNext()) {
            Object a = (TileEntity)object.next();
            int n2 = class_286.L((TileEntity)a);
            if (n2 == 0) {
                object2 = object;
                continue;
            }
            if (0 == 0) {
                void a2;
                if (!RenderSupport_106.L((float)a2, class_286.I.d())) {
                    return;
                }
                n = 1;
            }
            a = ((TileEntity)a).getPos();
            RenderSupport_106.L(AxisAlignedBB.fromBounds((double)((Vec3i)a).getX() - 0.003, (double)((Vec3i)a).getY() - 0.003, (double)((Vec3i)a).getZ() - 0.003, (double)((Vec3i)a).getX() + 1.003, (double)((Vec3i)a).getY() + 1.003, (double)((Vec3i)a).getZ() + 1.003), ThemeSupport_064.L(n2, 0.95f), class_286.f.L(), ThemeSupport_064.L(n2, class_286.d.d() ? 0.14f : 0.0f));
            object2 = object;
        }
        if (0 != 0) {
            RenderSupport_106.L();
        }
    }

    private int L(TileEntity tileEntity) {
        TileEntity a = tileEntity;
        ContainerESP a2 = this;
if (a instanceof TileEntityChest && a2.H.d()) {
            return -19673;
        }
        if (a instanceof TileEntityEnderChest && a2.l.d()) {
            return -7055617;
        }
        if (a instanceof TileEntityHopper && a2.i.d()) {
            return -8947070;
        }
        if (a instanceof TileEntityFurnace && a2.e.d()) {
            return -3092272;
        }
        return 0;
    }

    public ContainerESP() {
        super("ContainerESP", "Highlights storage blocks", ModuleCategory.f);
        ContainerESP a;
        ContainerESP class_286 = a;
        a.H = new BooleanSetting("Chests", 5 >> 2);
        class_286.l = new BooleanSetting("Ender chests", 3 >> 2);
        a.i = new BooleanSetting("Hoppers", 0 != 0);
        a.e = new BooleanSetting("Furnaces", 0 != 0);
        a.d = new BooleanSetting("Fill", 1 != 0);
        a.I = new BooleanSetting("Through walls", 5 >> 2);
        a.f = new NumberSetting("Line width", 1.5, 0.5, 5.0, 0.5).d(" px");
    }
}

