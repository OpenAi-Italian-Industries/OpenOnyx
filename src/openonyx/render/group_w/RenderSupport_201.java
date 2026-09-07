/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import openonyx.features.hud.CustomGui;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;
import openonyx.render.group_w.RenderSupport_188;
import openonyx.render.group_w.RenderSupport_202;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_201 {
    private final static float W = 7.0f;
    private final static int P = 9;
    private final CustomGui V;
    private float R;
    private final static float p = 22.0f;
    private final static float t = 3.0f;
    private final static float b = 2.5f;
    private final static float E = 16.0f;
    private final ItemStack[] F;
    private final static float G = 4.0f;
    private final RenderSupport_121 A;
    private final static RenderSupport_128 K = new RenderSupport_128(RenderMode_131.H, RenderMode_130.e, 9.0f, 11.0f);
    private final RenderSupport_121[] B;
    private final static float C = 0.0f;
    private final static int J = 0x8000000;
    private final static float D = 6.0f;
    private final static float c = 1.5f;
    private final static float a = 2.0f;
    private final static float k = 0.5f;
    private final static int g = -11740828;
    private final static float M = 4.0f;
    private float L;
    private float j;
    private final static float m = 0.55f;
    private final static float h = 0.0f;
    private final static float l = 1.0f;
    private final static float I = 2.0f;
    private final static float d = 1.0f;
    private float i;
    private final static int f = -50384;
    private final static int H = 3;
    private final static float e = 4.0f;

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        RenderSupport_201 class_201 = this;
Minecraft minecraft = Minecraft.getMinecraft();
        EntityPlayerSP entityPlayerSP = minecraft.thePlayer;
        if (entityPlayerSP == null) {
            return;
        }
        RenderSupport_201 class_2012 = class_201;
        float a5 = class_201.V.i.i.L();
        float f5 = 204.0f;
        float f6 = 28.0f;
        class_201.j = f5 * a5;
        class_201.R = f6 * a5;
        class_201.L((EntityPlayer)entityPlayerSP, (float)a4);
        class_2012.i = (a3 - class_201.j) / 2.0f;
        a3 = a2 - 4.0f - class_201.R - RenderSupport_202.L();
        class_201.L = a3 - class_201.L((EntityPlayer)entityPlayerSP, minecraft) * a5;
        RenderSupport_120.L(class_2012.V.i.H.d());
        void v1 = a;
        void v2 = a;
        v2.F();
        v2.L(class_201.i, (float)a3);
        v1.L(a5, 0.0f, 0.0f);
        class_2012.L((RenderSupport_103)v1, minecraft, entityPlayerSP, f5, f6);
        a.k();
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, Minecraft minecraft, EntityPlayer entityPlayer, float f2) {
        void v0;
        void a;
        void a2;
        void a3;
        void a4;
        Minecraft a222 = minecraft;
        RenderSupport_201 a5 = this;
if (!RenderSupport_201.L(a222)) {
            return;
        }
        float a222 = a4 - 0.0f;
        float f3 = -10.0f;
        a3.D(0.0f, f3, 0, 6.0f, Float.MAX_VALUE, a2.n());
        a222 *= Math.clamp(a.experience, 0.0f, 1.0f);
        if (v0 > 0.5f) {
            a3.D(0.0f, f3, 0, 6.0f, Float.MAX_VALUE, a2.B());
        }
        if (a.experienceLevel <= 0) {
            return;
        }
        a222 = f3 - 1.0f - ThemeSupport_057.m.I() / 2.0f;
        a3.L(ThemeSupport_057.m, String.valueOf(a.experienceLevel), (float)(a4 / 2.0f), 0, a2.B());
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, Minecraft minecraft, EntityPlayer entityPlayer, float f2, float f3) {
        void a;
        void a2;
        float a3;
        void a4;
        void a5;
        float f4 = f3;
        RenderSupport_201 a6 = this;
ThemeSupport_055 class_055 = ThemeSupport_059.L();
        int n = ThemeSupport_060.L(3, class_055);
        void v0 = a5;
        a5.d(0.0f, 0.0f, (float)a4, a3, 7.0f, 3);
        RenderSupport_120.L((RenderSupport_103)v0, 0.0f, 0.0f, (float)a4, a3, 7.0f, n, a6.V.i.H.d());
        a3 = 22.0f;
        float f5 = 3.0f + a6.A.L() * 22.0f + 0.0f;
        float f6 = a3;
        v0.D(f5, 3.0f, f6, f6, 7.0f, ThemeSupport_059.L(class_055.E(), 0.28f));
        float f7 = a3;
        v0.L(f5, 3.0f, f7, f7, 7.0f, 1.5f, class_055.E());
        int n2 = 0;
        while (n2 < 9) {
            a6.L((RenderSupport_103)a5, class_055, a2.inventory.mainInventory[0], a3++);
            n2 = 0;
        }
        a6.L((RenderSupport_103)a5, class_055, (Minecraft)a, (EntityPlayer)a2, (float)a4);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ItemStack itemStack, float f2, float f3) {
        void a;
        float f4;
        void a2;
        void a3;
        void a222;
        RenderSupport_201 class_201 = this;
float a222 = 1.0f - (float)a222.getItemDamage() / (float)a222.getMaxDamage();
        float a4 = 12.0f;
        a3 = a3 + 8.0f - 2.0f - 2.0f;
        a2.D((float)(a -= a4 / 2.0f), (float)a3, a4, 2.0f, Float.MAX_VALUE, -1728053248);
        a4 *= a222;
        if (f4 <= 0.5f) {
            return;
        }
        a2.D((float)a, (float)a3, a4, 2.0f, Float.MAX_VALUE, RenderSupport_124.L(-50384, -11740828, a222));
    }

    private static boolean L(Minecraft a) {
if (a.playerController.gameIsSurvivalOrAdventure() && !a.thePlayer.isRidingHorse()) {
            return 1 != 0;
        }
        return false;
    }

    public float D() {
        RenderSupport_201 a;
return a.i;
    }

    private static boolean L(ItemStack itemStack, ItemStack itemStack2) {
        ItemStack a = itemStack2;
        ItemStack a2 = itemStack;
if (a2 == null || a == null) {
            if (a2 != a) {
                return 1 != 0;
            }
            return false;
        }
        if (a2.getItem() != a.getItem()) {
            return 1 != 0;
        }
        if (!a.isItemStackDamageable() && a2.getMetadata() != a.getMetadata()) {
            return 1 != 0;
        }
        return false;
    }

    public boolean L() {
        RenderSupport_201 class_201 = this;
Minecraft a = Minecraft.getMinecraft();
        if (class_201.V.d() && class_201.V.i.D() && a.thePlayer != null && !a.playerController.isSpectator()) {
            return 1 != 0;
        }
        return false;
    }

    public float d() {
        RenderSupport_201 a;
return a.L;
    }

    public float L() {
        RenderSupport_201 a;
RenderSupport_201 class_201 = a;
        return class_201.i + class_201.j;
    }

    public void L() {
        RenderSupport_201 class_201 = this;
class_201.A.L(0.0f);
        int a = 0;
        int n = 0;
        while (n < 9) {
            class_201.B[0].L(1.0f);
            class_201.F[a++] = null;
            n = 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void L(EntityPlayer entityPlayer, float f2) {
        int a;
        RenderSupport_201 class_201;
        void a2;
        void a3;
        RenderSupport_201 class_2012 = this;
int n = a3.inventory.currentItem;
        RenderSupport_201 class_2013 = class_2012;
        if (class_2012.V.i.f.d()) {
            class_2013.A.L(0, 200.0f, RenderSupport_123.l);
            class_2012.A.L((float)a2);
            class_201 = class_2012;
        } else {
            class_2013.A.L(0);
            class_201 = class_2012;
        }
        n = class_201.V.i.e.d() ? 1 : 0;
        int n2 = 0;
        while (n2 < 9) {
            ItemStack itemStack = a3.inventory.mainInventory[0];
            if (RenderSupport_201.L(class_2012.F[0], itemStack)) {
                class_2012.F[0] = itemStack;
                if (0 != 0 && itemStack != null) {
                    class_2012.B[0].L(0.55f).L(1.0f, 250.0f, RenderSupport_123.l);
                }
            }
            class_2012.B[a++].L((float)a2);
            n2 = 0;
        }
    }

    private float L(EntityPlayer entityPlayer, Minecraft minecraft) {
        Minecraft a = minecraft;
        RenderSupport_201 a2 = this;
if (RenderSupport_201.L(a)) {
            return 10.0f;
        }
        return 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, ItemStack itemStack, int n) {
        void a222;
        void a;
        RenderSupport_103 a3 = class_103;
        RenderSupport_201 a4 = this;
if (a == null || a.getItem() == null) {
            return;
        }
        float f2 = 3.0f + (float)a222 * 22.0f + 11.0f;
        float f3 = 14.0f;
        float a222 = a4.B[a222].L();
        void v0 = a;
        float f4 = f2;
        Object object = a3;
        ((RenderSupport_103)object).F();
        ((RenderSupport_103)object).L(a222, f2, f3);
        a3.L(f4 - 8.0f + 4.0f, f3 - 8.0f + 4.0f, 8.0f, 8.0f, 4.0f, 2.5f, 1.0f, 0x8000000);
        a3.L((ItemStack)v0, f4 - 8.0f, f3 - 8.0f);
        a3.k();
        if (v0.stackSize > 1) {
            void a5;
            String a222 = String.valueOf(a.stackSize);
            float f5 = f2 + 8.0f;
            float f6 = f3 + 8.0f - 1.5f;
            RenderSupport_188.h(a3, K, a222, f5 - a3.L(K, a222), a3.d(K, f6), a5.d());
        }
        if (a.isItemDamaged()) {
            a4.L(a3, (ItemStack)a, f2, f3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public RenderSupport_201(CustomGui object) {
        Object a;
        void a2;
        RenderSupport_201 class_201 = object2;
        Object object2 = object;
        object = class_201;
        void v1 = a2;
        a2.A = new RenderSupport_121(0.0f);
        a2.B = new RenderSupport_121[9];
        a2.F = new ItemStack[9];
        a2.V = a;
        int n = 0;
        while (n < 9) {
            a2.B[a++] = new RenderSupport_121(1.0f);
            n = 0;
        }
    }
}

