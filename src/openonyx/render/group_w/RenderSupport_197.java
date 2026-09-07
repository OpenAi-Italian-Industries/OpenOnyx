/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import openonyx.features.hud.CustomGui;
import openonyx.features.hud.FeatureMode_369;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderMode_138;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_w.RenderSupport_190;
import openonyx.render.group_w.RenderSupport_195;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_059;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_197 {
    private final static float s = 0.2f;
    private final static float Z = 2.0f;
    private final CustomGui O;
    private final static int N = 10;
    private final static float q = 471.0f;
    private final static float x = 8.0f;
    private final RenderSupport_190 u;
    private final static RenderSupport_195 y = new RenderSupport_195(16.0f, 9.0f, 34.0f, 9.0f, 1.06f);
    final public static float n = 103.0f;
    private final static float Y = 22.0f;
    private final static float r = 8.0f;
    private final static float W = 9.0f;
    private final static int P = -4668204;
    private final RenderSupport_190 V;
    private final static RenderSupport_195 R = new RenderSupport_195(52.0f, 9.0f, 88.0f, 9.0f);
    private float p;
    private final static float t = 0.6f;
    private float b;
    private final RenderSupport_190 E;
    private final static float F = 250.0f;
    private final static float G = 0.006f;
    private final static float A = 0.5f;
    private final static float K = 0.006f;
    private final RenderSupport_190 B;
    private final static int C = -5211588;
    private final static float J = 1.6f;
    private float D;
    private final static float c = 2.0f;
    private float a;
    private final static int k = -45745;
    private final static int g = 256;
    private float M;
    private final RenderSupport_190 L;
    private final static RenderSupport_195 j = new RenderSupport_195(25.0f, 18.0f, 16.0f, 18.0f);
    private final static int m = -15043;
    private final static int h = -11688193;
    private final static float l = 0.25f;
    private final static int I = -2047904;
    private float d;
    private final static float i = 4.0f;
    private final static float f = 8.0f;
    private final RenderSupport_190 H;
    private final static float e = 6.0f;

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a222;
        float f6 = f5;
        RenderSupport_197 a5 = this;
EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().thePlayer;
        if (entityPlayerSP == null) {
            return;
        }
        RenderSupport_197 class_197 = a5;
        a5.D = (a5.D + a222) % 100000.0f;
        class_197.L(entityPlayerSP);
        class_197.L(0.0f);
        ThemeSupport_055 a222 = ThemeSupport_059.L();
        a -= 2.0f;
        RenderSupport_197 class_1972 = a5;
        if (a5.O.H.e.L(FeatureMode_369.i)) {
            class_1972.d((RenderSupport_103)a4, a222, entityPlayerSP, (float)a3, (float)a2, (float)a);
            return;
        }
        class_1972.L((RenderSupport_103)a4, a222, entityPlayerSP, (float)a3, (float)a2, (float)a);
    }

    /*
     * WARNING - void declaration
     */
    private void d(RenderSupport_103 class_103, ThemeSupport_055 class_055, EntityPlayer entityPlayer, float f2, float f3, float f4) {
        boolean bl;
        float f5;
        float f6;
        void a;
        void a2;
        void a3;
        void a222;
        EntityPlayer a322 = entityPlayer;
        RenderSupport_197 a4 = this;
void a5 = a222 - 8.0f;
        int a222 = a322.getTotalArmorValue() > 0 ? 1 : 0;
        boolean bl2 = RenderSupport_197.L(a322);
        Object object = a322;
        float f7 = a4.L((RenderSupport_103)a3, (EntityPlayer)object, (float)a2, (float)a5);
        RenderSupport_197 class_197 = a4;
        if (RenderSupport_197.L((EntityPlayer)object) != null) {
            class_197.L((RenderSupport_103)a3, R, a4.V, (float)a, (float)a5, 0 != 0, 1.0f, 0.0f);
            f6 = f7;
        } else {
            class_197.L((RenderSupport_103)a3, RenderSupport_197.d(a322), a4.L, (float)a, (float)a5, 5 >> 3, 1.0f, 0.0f);
            f6 = f7;
        }
        float a322 = f6 - 8.0f - 2.0f;
        void var9_12 = a5 - 8.0f - 2.0f;
        if (a222 != 0) {
            RenderSupport_197 class_1972 = a4;
            class_1972.L((RenderSupport_103)a3, y, class_1972.B, (float)a2, a322, 5 >> 2, 1.0f, 0.0f);
        }
        if (bl2) {
            RenderSupport_197 class_1973 = a4;
            class_1973.L((RenderSupport_103)a3, j, class_1973.E, (float)a, (float)var9_12, 0 != 0, 1.0f, 0.0f);
        }
        if (a222 != 0) {
            f5 = a322;
            bl = bl2;
        } else {
            f5 = f7;
            bl = bl2;
        }
        a4.M = Math.min(f5, (float)(bl ? var9_12 : a5));
    }

    private static RenderSupport_195 D(EntityPlayer entityPlayer) {
        float a;
        EntityPlayer entityPlayer2 = entityPlayer;
float f2 = entityPlayer2.isPotionActive(Potion.poison) ? 52.0f : (entityPlayer2.isPotionActive(Potion.wither) ? 88.0f : 16.0f);
        float f3 = a = entityPlayer2.worldObj.getWorldInfo().isHardcoreModeEnabled() ? 45.0f : 0.0f;
        return new RenderSupport_195(16.0f, f3, f2 + 36.0f, f3);
    }

    private float D() {
        RenderSupport_197 a;
if (a.a <= 0.0f) {
            return 0.0f;
        }
        return (float)Math.sin(a.D * 0.05f) * 1.6f * a.a;
    }

    public boolean L() {
        RenderSupport_197 class_197 = this;
Minecraft a = Minecraft.getMinecraft();
        if (class_197.O.d() && class_197.O.H.D() && a.thePlayer != null && a.playerController.shouldDrawHUD()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, RenderSupport_195 class_195, RenderSupport_190 class_190, float f2, float f3, boolean bl, float f4, float f5) {
        void a;
        void a2;
        void a3;
        float f6 = f4;
        RenderSupport_197 a4 = this;
void v0 = a3;
        float f7 = v0.D() * 10.0f;
        float f8 = v0.d() * 10.0f;
        boolean bl2 = a4.O.H.H.d();
        boolean bl3 = a4.O.H.f.d();
        a2.L(0.0f);
        int n = 0;
        while (n < 10) {
            void a5;
            void a6;
            void v4;
            void v3;
            void a7;
            void a8;
            void v2 = a8;
            if (a7 != false) {
                v3 = v2 + 0.0f;
                v4 = a;
            } else {
                v3 = v2 - 8.0f;
                v4 = a;
            }
            void var13_16 = v3 + v4;
            float f9 = bl2 ? a4.L(0, (RenderSupport_190)a3) : 1.0f;
            void v5 = a2;
            v5.F();
            v5.L(f9, (float)(var13_16 + 4.0f), (float)(a6 + 4.0f));
            a4.L((RenderSupport_103)v5, (RenderSupport_195)a5, (float)var13_16, (float)a6);
            if (bl3) {
                a4.L((RenderSupport_103)a2, (RenderSupport_195)a5, (float)var13_16, (float)a6, Math.clamp(f8 - 0.0f, 0.0f, 1.0f), (boolean)a7, 0.45f);
            }
            float f10 = Math.clamp(f7 - 0.0f, 0.0f, 1.0f);
            a4.L((RenderSupport_103)a2, (RenderSupport_195)a5, (float)var13_16, (float)a6, f10, (boolean)a7, 1.0f);
            a2.k();
            n = ++a;
        }
        a2.e();
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, RenderSupport_195 class_195, float f2, float f3) {
        void a;
        void a2;
        void a3;
        RenderSupport_197 class_197 = this;
void v0 = a3;
        float a4 = v0.D();
        float a5 = v0.l();
        float f4 = a4;
        int n = 256;
        a4.L(Gui.icons, (float)(a2 + a5), (float)(a + a5), f4, f4, a3.h(), a3.I(), 9.0f, 9.0f, n, n, -1, RenderMode_138.e);
    }

    private float d() {
        RenderSupport_197 a;
if (!a.O.H.H.d() || a.H.D() > 0.2f) {
            return 1.0f;
        }
        return 1.0f - 0.25f * (0.5f + 0.5f * (float)Math.sin((double)(a.D * 0.006f) * Math.PI));
    }

    private static RenderSupport_195 d(EntityPlayer a) {
        RenderSupport_195 class_195;
if (a.isPotionActive(Potion.hunger)) {
            class_195 = new RenderSupport_195(133.0f, 27.0f, 88.0f, 27.0f);
            return class_195;
        }
        class_195 = new RenderSupport_195(16.0f, 27.0f, 52.0f, 27.0f);
        return class_195;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, RenderSupport_195 class_195, float f2, float f3, float f4, float f5, float f6) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        RenderSupport_197 class_197 = this;
if (a7 <= a6) {
            return;
        }
        void v0 = a5;
        float f7 = v0.D();
        float a8 = v0.l();
        int n = a6 <= 0.0f && a7 >= 1.0f ? 1 : 0;
        a4.L((float)a3);
        if (n == 0) {
            a4.d((float)(a2 + a8 + f7 * a6), (float)(a + a8), f7 * (a7 - a6), f7);
        }
        float f8 = f7;
        int n2 = 256;
        a4.L(Gui.icons, (float)(a2 + a8), (float)(a + a8), f8, f8, a5.d(), a5.i(), 9.0f, 9.0f, n2, n2, -1, RenderMode_138.e);
        if (n == 0) {
            a4.L();
        }
        a4.e();
    }

    private static RenderSupport_195 L(EntityPlayer entityPlayer) {
        float a;
        EntityPlayer entityPlayer2 = entityPlayer;
float f2 = entityPlayer2.isPotionActive(Potion.poison) ? 52.0f : (entityPlayer2.isPotionActive(Potion.wither) ? 88.0f : 16.0f);
        float f3 = a = entityPlayer2.worldObj.getWorldInfo().isHardcoreModeEnabled() ? 45.0f : 0.0f;
        return new RenderSupport_195(16.0f, f3, f2 + 144.0f, f3);
    }

    private void L(EntityPlayer entityPlayer) {
        Object a22 = entityPlayer;
        RenderSupport_197 a = this;
RenderSupport_197 class_197 = a;
        Object object = a22;
        a.d = Math.max((float)((EntityLivingBase)object).getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue(), 1.0f);
        a.p = Math.max(((EntityPlayer)object).getAbsorptionAmount(), 0.0f);
        float f2 = ((EntityLivingBase)a22).getHealth();
        a.H.L(f2, a.d);
        RenderSupport_197 class_1972 = a;
        class_197.u.L(a.p, class_1972.d);
        class_1972.B.L(((EntityPlayer)a22).getTotalArmorValue(), 20.0f);
        class_197.L.L(((EntityPlayer)a22).getFoodStats().getFoodLevel(), 20.0f);
        class_197.E.L(RenderSupport_197.L((EntityPlayer)a22) ? (float)((Entity)a22).getAir() : 300.0f, 300.0f);
        a22 = RenderSupport_197.L((EntityPlayer)a22);
        if (a22 != null) {
            a.V.L(((EntityLivingBase)a22).getHealth(), ((EntityLivingBase)a22).getMaxHealth());
        }
        float a22 = f2 + a.p;
        if (a.O.H.H.d() && a.b >= 0.0f && 15 < a.b - 0.01f) {
            a.a = 1.0f;
        }
        a.b = 15;
    }

    public void L() {
        RenderSupport_197 a;
RenderSupport_197 class_197 = a;
        a.a = 0.0f;
        class_197.b = -1.0f;
        class_197.M = Float.NaN;
    }

    private void L(float f2) {
        float a = f2;
        RenderSupport_197 a2 = this;
RenderSupport_197 class_197 = a2;
        RenderSupport_197 class_1972 = a2;
        class_1972.H.L(0);
        class_1972.u.L(0);
        class_1972.B.L(0);
        class_1972.L.L(0);
        class_197.E.L(0);
        class_197.V.L(0);
        class_197.a = Math.max(0.0f, a2.a - 0.0f);
    }

    private static boolean L(EntityPlayer a) {
return a.isInsideOfMaterial(Material.water) || a.getAir() < 300;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, RenderSupport_195 class_195, float f2, float f3, float f4, boolean bl, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        float f6 = f4;
        RenderSupport_197 a8 = this;
if (a7 <= 0.0f) {
            return;
        }
        RenderSupport_197 class_197 = a8;
        if (a6 != false) {
            class_197.L((RenderSupport_103)a5, (RenderSupport_195)a4, (float)a3, 0.0f, 0.0f, (float)a7, (float)a);
            return;
        }
        class_197.L((RenderSupport_103)a5, (RenderSupport_195)a4, (float)a3, 0.0f, 1.0f - a7, 1.0f, (float)a);
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103, EntityPlayer entityPlayer, float f2, float f3) {
        void a;
        int n;
        void a2;
        RenderSupport_195 a3;
        RenderSupport_197 class_197 = this;
void v0 = a3;
        a3 = RenderSupport_197.D((EntityPlayer)v0);
        RenderSupport_195 class_195 = RenderSupport_197.L((EntityPlayer)v0);
        RenderSupport_197 class_1972 = class_197;
        RenderSupport_197 class_1973 = class_197;
        float f4 = class_1972.d + class_1973.p;
        int n2 = Math.max(1, MathHelper.ceiling_float_int(f4 / 2.0f));
        int n3 = Math.max(1, MathHelper.ceiling_float_int((float)n2 / 10.0f));
        float f5 = Math.max(10.0f - (float)(n3 - 2), 3.0f);
        float f6 = class_1972.H.D() * class_197.d;
        float f7 = class_1973.H.d() * class_197.d;
        float f8 = class_1972.d + class_197.u.D() * class_197.d;
        float f9 = class_1972.d + class_197.u.d() * class_197.d;
        int n4 = MathHelper.floor_float(class_1972.d / 2.0f);
        boolean bl = class_1972.O.H.H.d();
        boolean bl2 = class_1972.O.H.f.d();
        float f10 = class_1972.D();
        a2.L(class_197.d());
        int n5 = 0;
        while (n5 < n2) {
            float f11;
            float f12;
            int n6;
            void a4;
            void var18_21 = a4 + 0.0f + f10;
            void var19_22 = a - 0.0f * f5;
            float a5 = 0.0f;
            int n7 = n6 = f12 >= class_197.d ? 1 : 0;
            if (bl) {
                int n8;
                int n9;
                int n10 = 0;
                if (n6 != 0) {
                    n9 = Math.max(n10 - n4, 0);
                    n8 = n6;
                } else {
                    n9 = n10 % 10;
                    n8 = n6;
                }
                f11 = class_197.L(n9, n8 != 0 ? class_197.u : class_197.H);
            } else {
                f11 = 1.0f;
            }
            float f13 = f11;
            void v10 = a2;
            v10.F();
            v10.L(f13, (float)(var18_21 + 4.0f), (float)(var19_22 + 4.0f));
            class_197.L((RenderSupport_103)v10, a3, (float)var18_21, (float)var19_22);
            if (bl2) {
                RenderSupport_197 class_1974 = class_197;
                class_1974.L((RenderSupport_103)a2, a3, (float)var18_21, (float)var19_22, 0.0f, RenderSupport_197.L(f7 - a5), 0.45f);
                class_1974.L((RenderSupport_103)a2, class_195, (float)var18_21, (float)var19_22, RenderSupport_197.L(class_197.d - a5), RenderSupport_197.L(f9 - a5), 0.45f);
            }
            void v12 = a2;
            class_197.L((RenderSupport_103)v12, a3, (float)var18_21, (float)var19_22, 0.0f, RenderSupport_197.L(f6 - a5), 1.0f);
            class_197.L((RenderSupport_103)v12, class_195, (float)var18_21, (float)var19_22, RenderSupport_197.L(class_197.d - a5), RenderSupport_197.L(f8 - a5), 1.0f);
            a2.k();
            n5 = ++n;
        }
        a2.e();
        return (float)(a - (float)(n3 - 1) * f5);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, RenderSupport_190 class_190, int n, float f2, float f3, float f4, float f5, float f6) {
        void a;
        void v2;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        ThemeSupport_055 a92 = class_055;
        RenderSupport_197 a10 = this;
void v0 = a8;
        v0.L((float)a7);
        v0.D((float)a6, (float)a5, (float)a4, 6.0f, Float.MAX_VALUE, a92.n());
        if (a10.O.H.f.d()) {
            void v1;
            void a92 = a4 * a3.d();
            if (v1 > 0.5f) {
                a8.D((float)a6, (float)a5, (float)a92, 6.0f, Float.MAX_VALUE, ThemeSupport_059.L((int)a2, 0.4f));
            }
        }
        void a92 = a4 * a3.D();
        if (v2 > 0.5f) {
            a8.D((float)a6, (float)a5, (float)a92, 6.0f, Float.MAX_VALUE, (int)a2);
        }
        if (a > 0.0f) {
            void v3;
            a92 = a4 * Math.clamp((float)a, 0.0f, 1.0f);
            if (v3 > 0.5f) {
                a8.D((float)a6, (float)a5, (float)a92, 6.0f, Float.MAX_VALUE, ThemeSupport_059.L(-15043, 0.85f));
            }
        }
        a8.e();
    }

    public float L() {
        RenderSupport_197 a;
return a.M;
    }

    private static float L(float a) {
return Math.clamp(a / 2.0f, 0.0f, 1.0f);
    }

    /*
     * WARNING - void declaration
     */
    private float L(int n, RenderSupport_190 class_190) {
        float f2;
        void a;
        int a22 = n;
        RenderSupport_197 a3 = this;
float a22 = a.L() - 330.0f;
        if (f2 < 0.0f) {
            return 0.6f;
        }
        if (a22 >= 250.0f) {
            return 1.0f;
        }
        return 0.6f + 0.39999998f * (float)RenderSupport_123.H.L(a22 / 250.0f);
    }

    public RenderSupport_197(CustomGui class_344) {
        RenderSupport_197 a;
        CustomGui a2 = class_344;
        RenderSupport_197 class_197 = a = this;
        RenderSupport_197 class_1972 = a;
        RenderSupport_197 class_1973 = a;
        a.H = new RenderSupport_190();
        class_1973.L = new RenderSupport_190();
        a.B = new RenderSupport_190();
        a.E = new RenderSupport_190();
        a.u = new RenderSupport_190();
        a.V = new RenderSupport_190();
        class_1972.d = 20.0f;
        class_1972.M = Float.NaN;
        class_197.b = -1.0f;
        class_197.O = a2;
    }

    private static EntityLivingBase L(EntityPlayer entityPlayer) {
        EntityPlayer entityPlayer2 = entityPlayer;
Entity a = entityPlayer2.ridingEntity;
        if (a instanceof EntityLivingBase) {
            return a;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, EntityPlayer entityPlayer, float f2, float f3, float f4) {
        void v2;
        void a;
        void a2;
        void a3;
        void a222;
        void a4;
        void a5;
        float f5 = f4;
        RenderSupport_197 a6 = this;
void var7_10 = (a5 - a4 - 8.0f) / 2.0f;
        a5 -= var7_10;
        int n = a222.getTotalArmorValue() > 0 ? 1 : 0;
        void v0 = a222;
        boolean a222 = RenderSupport_197.L((EntityPlayer)v0);
        a6.L((RenderSupport_103)a3, (ThemeSupport_055)a2, a6.H, -45745, (float)(a4 + a6.D()), (float)(a -= 6.0f), (float)var7_10, a6.d(), a6.u.D());
        RenderSupport_197 class_197 = a6;
        if (RenderSupport_197.L((EntityPlayer)v0) != null) {
            class_197.L((RenderSupport_103)a3, (ThemeSupport_055)a2, a6.V, -2047904, (float)a5, 0.0f, (float)var7_10, 1.0f, 0.0f);
            v2 = a;
        } else {
            class_197.L((RenderSupport_103)a3, (ThemeSupport_055)a2, a6.L, -5211588, (float)a5, 0.0f, (float)var7_10, 1.0f, 0.0f);
            v2 = a;
        }
        void var9_12 = v2 - 6.0f - 4.0f;
        if (n != 0) {
            RenderSupport_197 class_1972 = a6;
            class_1972.L((RenderSupport_103)a3, (ThemeSupport_055)a2, class_1972.B, -4668204, (float)a4, (float)var9_12, (float)var7_10, 1.0f, 0.0f);
        }
        if (a222) {
            RenderSupport_197 class_1973 = a6;
            class_1973.L((RenderSupport_103)a3, (ThemeSupport_055)a2, class_1973.E, -11688193, (float)a5, (float)var9_12, (float)var7_10, 1.0f, 0.0f);
        }
        a6.M = n != 0 || a222 ? var9_12 : a;
    }
}

