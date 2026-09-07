/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.combat.AntiBot;
import openonyx.history.Range;
import openonyx.history.SettingValue;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_119;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_r.RenderSupport_168;
import openonyx.render.group_r.RenderSupport_169;
import openonyx.theme.internal.ThemeSupport_064;

public final class SkeletonESP
extends Module {
    final public NumberSetting h;
    final public BooleanSetting l;
    final public NumberSetting I;
    final public BooleanSetting d;
    final public NumberSetting i;
    final public ColorSetting f;
    final public BooleanSetting H;
    final public BooleanSetting e;

    public SkeletonESP() {
        super("SkeletonESP", "Draws the bones of nearby players", ModuleCategory.f);
        SkeletonESP a;
        SkeletonESP class_232 = a;
        a.f = new ColorSetting("Color", -8857601).D().L("Colour of the bones");
        class_232.H = new BooleanSetting("Health color", 0 != 0).L("Fade the bones from green to red as the target loses health");
        a.i = new NumberSetting("Line width", 1.5, 0.5, 5.0, 0.5).d(" px");
        a.e = new BooleanSetting("Joints", 1 != 0).L("Draw a dot at every joint");
        a.h = new NumberSetting("Joint size", 3.0, 1.0, 8.0, 0.5).d(" px").L((SettingValue)a.e);
        a.d = new BooleanSetting("Through walls", 1 != 0);
        a.I = new NumberSetting("Range", 128.0, 8.0, 256.0, 8.0).d(" m");
        a.l = new BooleanSetting("Mobs", 0 != 0).L("Also draw bones for non-player mobs");
    }

    /*
     * WARNING - void declaration
     */
    private void L(Vec3 vec3, Vec3 vec32, int n) {
        void a;
        void a2;
        int a3 = 0;
        SkeletonESP a4 = this;
int n2 = a3;
        RenderSupport_119.d((Vec3)a2, (Vec3)a, n2, n2);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_168 class_168, int n) {
        void a;
        int a2 = 0;
        SkeletonESP a3 = this;
RenderSupport_119.L();
        SkeletonESP class_232 = a3;
        SkeletonESP class_2322 = a3;
        void v2 = a;
        class_2322.L(a.D(), v2.H(), (int)4.0f);
        void v3 = a;
        class_2322.L(v2.H(), v3.i(), (int)4.0f);
        void v4 = a;
        class_2322.L(v3.H(), v4.h(), (int)4.0f);
        void v5 = a;
        class_2322.L(v4.H(), v5.e(), (int)4.0f);
        void v6 = a;
        class_2322.L(v5.h(), v6.d(), (int)4.0f);
        void v7 = a;
        class_2322.L(v6.e(), v7.F(), (int)4.0f);
        void v8 = a;
        class_2322.L(v7.i(), v8.I(), (int)4.0f);
        void v9 = a;
        class_2322.L(v8.i(), v9.l(), (int)4.0f);
        class_232.L(v9.I(), a.L(), (int)4.0f);
        class_232.L(a.l(), a.k(), (int)4.0f);
        RenderSupport_119.D();
        if (!class_232.e.d()) {
            return;
        }
        float f2 = a3.h.L();
        void v10 = a;
        RenderSupport_119.L(v10.D(), f2, 4.0f);
        RenderSupport_119.L(v10.H(), f2, 4.0f);
        RenderSupport_119.L(v10.i(), f2, 4.0f);
        RenderSupport_119.L(v10.h(), f2, 4.0f);
        RenderSupport_119.L(v10.e(), f2, 4.0f);
        RenderSupport_119.L(v10.d(), f2, 4.0f);
        RenderSupport_119.L(v10.F(), f2, 4.0f);
        RenderSupport_119.L(v10.L(), f2, 4.0f);
        RenderSupport_119.L(v10.k(), f2, 4.0f);
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        SkeletonESP class_232 = this;
if (!class_232.d() || ((Minecraft)((Object)SkeletonESP.e)).theWorld == null || ((Minecraft)((Object)SkeletonESP.e)).thePlayer == null) {
            return;
        }
        double d = (Double)class_232.I.L();
        int n = 0;
        Iterator iterator = ((Minecraft)((Object)SkeletonESP.e)).theWorld.loadedEntityList.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a;
                Object a2 = iterator.next();
                if (!(a2 instanceof EntityLivingBase) || (a2 = (EntityLivingBase)a2) == ((Minecraft)((Object)SkeletonESP.e)).thePlayer) continue block0;
                if (!((EntityLivingBase)a2).isEntityAlive()) {
                    iterator2 = iterator;
                    continue;
                }
                if (AntiBot.L((Entity)a2)) {
                    iterator2 = iterator;
                    continue;
                }
                if (!(a2 instanceof EntityPlayer) && !class_232.l.d()) {
                    iterator2 = iterator;
                    continue;
                }
                if (((Entity)a2).isInvisible() && !class_232.L((EntityLivingBase)a2)) {
                    iterator2 = iterator;
                    continue;
                }
                if ((double)((Minecraft)((Object)SkeletonESP.e)).thePlayer.getDistanceToEntity((Entity)a2) > d) {
                    iterator2 = iterator;
                    continue;
                }
                if (0 == 0) {
                    if (!RenderSupport_119.L((float)a, class_232.d.d(), class_232.i.L())) {
                        return;
                    }
                    n = 1;
                }
                class_232.L(RenderSupport_169.L((EntityLivingBase)a2, (float)a), class_232.L((EntityLivingBase)a2));
                iterator2 = iterator;
            }
            break;
        }
        if (0 != 0) {
            RenderSupport_119.d();
        }
    }

    private boolean L(EntityLivingBase entityLivingBase) {
        EntityLivingBase a = entityLivingBase;
        SkeletonESP a2 = this;
if (OnyxClient.l != null && OnyxClient.l.ca.L(a)) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private int L(EntityLivingBase entityLivingBase) {
        void a22;
        SkeletonESP class_232 = this;
SkeletonESP class_2322 = class_232;
        int n = class_2322.f.L();
        if (!class_2322.H.d()) {
            return n;
        }
        float a32 = a22.getMaxHealth() <= 0.0f ? 1.0f : Math.clamp(a22.getHealth() / a22.getMaxHealth(), 0.0f, 1.0f);
        int a22 = Math.round(255.0f - 100.0f * a32);
        int a32 = Math.round(90.0f + 137.0f * a32);
        return ThemeSupport_064.L(ThemeSupport_064.d(n), a22, a32, 98);
    }
}

