/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.util.Vec3;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.ColorSetting;
import openonyx.input.InputSupport_003;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_107;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_551;

public final class TNTTimer
extends Module {
    final public ColorSetting e;

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3, float f4) {
        TNTTimer class_230 = this;
if (!class_230.d() || ((Minecraft)((Object)TNTTimer.e)).theWorld == null || !RenderSupport_107.L()) {
            return;
        }
        Iterator iterator = ((Minecraft)((Object)TNTTimer.e)).theWorld.loadedEntityList.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a;
                void a2;
                void a3;
                void a4;
                Object a5 = (Entity)iterator.next();
                if (!(a5 instanceof EntityTNTPrimed)) continue block0;
                a5 = (EntityTNTPrimed)a5;
                float[] fArray = RenderSupport_107.L(new Vec3(((EntityTNTPrimed)a5).lastTickPosX + (((EntityTNTPrimed)a5).posX - ((EntityTNTPrimed)a5).lastTickPosX) * (double)a4, ((EntityTNTPrimed)a5).lastTickPosY + (((EntityTNTPrimed)a5).posY - ((EntityTNTPrimed)a5).lastTickPosY) * (double)a4 + 1.25, ((EntityTNTPrimed)a5).lastTickPosZ + (((EntityTNTPrimed)a5).posZ - ((EntityTNTPrimed)a5).lastTickPosZ) * (double)a4), (float)a3, (float)a2);
                if (fArray == null) {
                    iterator2 = iterator;
                    continue;
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = Float.valueOf(Math.max(0.0f, ((float)((EntityTNTPrimed)a5).fuse - a4) / 20.0f));
                a5 = String.format("%.1fs", objectArray);
                iterator2 = iterator;
                void v2 = a;
                float f5 = v2.L(ThemeSupport_057.j, (String)a5) + 8.0f;
                v2.D(fArray[0] - f5 / 2.0f, fArray[1] - 7.0f, f5, 14.0f, 8.0f, -1206643431);
                v2.L(ThemeSupport_057.j, (String)a5, fArray[0], fArray[1], class_230.e.h());
            }
            break;
        }
    }

    public TNTTimer() {
        super("TNTTimer", "Shows time remaining before TNT explodes", ModuleCategory.f);
        TNTTimer a;
        TNTTimer class_230 = a;
        class_230.e = new ColorSetting("Color", -41892);
    }
}

