/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.hud;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
import java.util.Set;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import openonyx.configuration.internal.PacketEvent;
import openonyx.configuration.internal.PacketDirection;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_329;
import openonyx.features.hud.FeatureSupport_335;
import openonyx.features.hud.FeatureSupport_338;
import openonyx.features.hud.FeatureSupport_351;
import openonyx.features.hud.FeatureSupport_358;
import openonyx.features.hud.FeatureMode_339;
import openonyx.features.hud.FeatureMode_355;
import openonyx.features.combat.BedBreaker;
import openonyx.features.player.Scaffold;
import openonyx.history.SettingValue;
import openonyx.history.internal.MultiEnumSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.input.InputSupport_002;
import openonyx.music.MusicSupport_075;
import openonyx.music.MusicSupport_081;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.RenderMode_138;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_i.RenderSupport_142;
import openonyx.render.group_v.RenderSupport_179;
import openonyx.render.group_v.RenderSupport_182;
import openonyx.render.group_v.RenderSupport_183;
import openonyx.render.group_v.RenderSupport_184;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_545;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Watermark
extends Module {
    public BooleanSetting Wa;
    private final static float sa = 9.0f;
    private final static float na = 6.0f;
    private final static float Za = 2.0f;
    private final static int Xa = 256;
    private RenderSupport_182 ya;
    public NumberSetting Sa;
    public NumberSetting Qa;
    private float wa;
    private final static float Oa = 2.5f;
    private final static float oa = 3.5f;
    private final static float ta = 2.0f;
    private final RenderSupport_121 Va;
    private final static float ra = 8.0f;
    private final static float za = 7.0f;
    private final static float Pa = 1.0f;
    private final static float Na = 6.0f;
    private final MusicSupport_081 Ra;
    private float ka;
    private final FeatureSupport_329 ea;
    private final static float Aa = 3.0f;
    private final static float Ca = 6.0f;
    private final static float Ba = 0.94f;
    private final RenderSupport_124 aa;
    private final static float Ea = 5.0f;
    private final RenderSupport_121 La;
    private float Ma;
    private final RenderSupport_121 ba;
    private boolean Ia;
    private final static int Fa = 3;
    private final static String Ja = "watermark";
    private float ja;
    private final static float ma = 11.0f;
    private final static float da = 0.5f;
    public NumberSetting fa;
    private FeatureSupport_351 Ka;
    private final UiSupport_545 ha;
    public NumberSetting Ha;
    private FeatureSupport_338 ia;
    private final static float Da = 16.695652f;
    private final RenderSupport_121 la;
    private final static float Ga = 12.0f;
    private long ga;
    private final RenderSupport_121 ca;
    private boolean Q;
    private final static float T = 22.0f;
    private FeatureSupport_358 S;
    private final static float o = 12.0f;
    private final static int U = 184;
    private String X;
    private String w;
    private final static float z = 8.0f;
    private final static float v = 22.0f;
    public NumberSetting s;
    public BooleanSetting Z;
    private float O;
    private final static float N = 10.0f;
    private final static float q = 6.0f;
    private final static ResourceLocation x = new ResourceLocation("onyx", "textures/gui/logo.png");
    private final static float u = 12.0f;
    private final static float y = 6.0f;
    private final static float n = 90.0f;
    private final static int Y = 3;
    public BooleanSetting r;
    private float W;
    private final static float P = 3.0f;
    private float V;
    private float R;
    private final RenderSupport_124 p;
    private final static float t = 10.0f;
    private final static float b = 5.0f;
    private float E;
    private final static float F = 30.0f;
    private final static float G = 5.0f;
    public MultiEnumSetting<FeatureMode_339> A;
    public NumberSetting K;
    private boolean B;
    private boolean C;
    private float J;
    private final static float D = 0.007f;
    private final RenderSupport_184 c;
    private final static FeatureSupport_335 a;
    private final RenderSupport_121 k;
    private final static float g = 100.0f;
    private String M;
    private int L;
    private FeatureSupport_335 j;
    private final static float m = 2.0f;
    private final static float h = 54.0f;
    private final static FeatureSupport_335 l;
    private final static float I = 4.5f;
    private final RenderSupport_121 d;
    private final RenderSupport_124 i;
    private FeatureSupport_335 f;
    public NumberSetting H;
    private final Set<Module> e;

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f5 = f3;
        Watermark a6 = this;
a5 = a5 - 7.0f - 2.0f;
        void v0 = a4;
        void v1 = a4;
        void v2 = a4;
        v2.l(ThemeSupport_057.g, a6.f.d(), (float)(a += 2.0f), 11.0f, a3.F());
        v2.L(a6.Va.L());
        v1.F();
        v1.L(0.0f, (1.0f - a6.Va.L()) * 5.0f * a6.Ma);
        v1.d(ThemeSupport_057.M, a6.f.L(), 0.0f, 11.0f, a6.aa.L());
        v0.k();
        v0.e();
        a2 = a2 - 8.0f - 3.0f;
        void var6_8 = (a5 -= a) * a6.ca.L();
        v0.D((float)a, (float)a2, 0.0f, 3.0f, Float.MAX_VALUE, a3.n());
        if (var6_8 > 0.5f) {
            a4.D((float)a, (float)a2, (float)var6_8, 3.0f, Float.MAX_VALUE, a6.i.L());
        }
    }

    /*
     * WARNING - void declaration
     */
    private void i(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3) {
        float f4;
        void a;
        void a2;
        void a3;
        float a4 = f2;
        Watermark a5 = this;
void var5_7 = a3 - 6.0f;
        float f5 = a4 * a5.f.L();
        void v0 = a2;
        v0.d(0.0f, (float)var5_7, a4, 6.0f);
        v0.L(0.0f, 0.0f, a4, (float)a3, Float.MAX_VALUE, 2.5f, a.n());
        v0.L();
        if (f4 <= 0.5f) {
            return;
        }
        void v2 = a2;
        v2.d(0.0f, (float)var5_7, f5, 6.0f);
        v2.L(0.0f, 0.0f, a4, (float)a3, Float.MAX_VALUE, 2.5f, a.E());
        a2.L();
    }

    @Generated
    public FeatureSupport_329 L() {
        Watermark a;
return a.ea;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, float f2, FeatureSupport_335 class_335) {
        void a;
        void a2;
        FeatureSupport_335 a3 = class_335;
        Watermark a4 = this;
Watermark class_340 = a4;
        a4.k.L(Math.max(22.0f, class_340.L((RenderSupport_103)a2, a3)), 200.0f, RenderSupport_123.l);
        class_340.d.L(a3.L() == FeatureMode_355.H ? 30.0f : 22.0f, 200.0f, RenderSupport_123.l);
        Watermark class_3402 = a4;
        class_3402.k.L((float)a);
        class_3402.d.L((float)a);
    }

    private boolean H() {
        Watermark a;
if (a.la.d() <= 0.0f) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(ThemeSupport_055 class_055, float f2) {
        void a;
        void a2;
        Watermark class_340 = this;
Watermark class_3402 = class_340;
        class_340.p.L(a2.P(), 400.0f, RenderSupport_123.l);
        class_3402.p.L((float)a);
        int a3 = class_3402.S != null && class_340.S.L() ? 1 : 0;
        void v1 = a2;
        class_340.aa.L(a3 != 0 ? v1.K() : v1.d(), 250.0f, RenderSupport_123.l);
        class_340.aa.L((float)a);
        void v2 = a2;
        class_340.i.L(a3 != 0 ? v2.K() : v2.E(), 250.0f, RenderSupport_123.l);
        class_340.i.L((float)a);
    }

    public MusicSupport_075 L() {
        Watermark a;
if (a.ia == null) {
            return null;
        }
        return a.Ra.L();
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, int n, float f2) {
        void a;
        void a32;
        void a2;
        Watermark class_340 = this;
void var5_10 = a2 / 2.0f;
        float a222 = Math.min(16.695652f, (float)(a2 - 9.0f));
        float f3 = 15.347826f;
        void var8_12 = var5_10 - 0.0f;
        void v0 = a32;
        if (class_340.f.L() != null) {
            void a4;
            float f4 = 0;
            int n2 = 1;
            v0.L(class_340.f.L(), f3, (float)var8_12, f4, f4, 0.0f, 0.0f, 1.0f, 1.0f, n2, n2, -1, RenderMode_138.H);
            float f5 = 0;
            a32.i(f3, (float)var8_12, f5, f5, 3.5f, (int)a4);
        } else {
            v0.L("\ue405", 15.347826f, (float)var5_10, 12.0f, a.F());
        }
        float a4 = 29.695652f;
        String a222 = a32.L(ThemeSupport_057.M, class_340.M, 90.0f);
        Watermark class_3402 = class_340;
        class_3402.L((RenderSupport_103)a32, (ThemeSupport_055)a, a4, (float)var5_10, a222, (float)a2);
        float a32 = a4 + a32.L(ThemeSupport_057.M, a222) + 6.0f;
        class_3402.d((RenderSupport_103)a32, (ThemeSupport_055)a, a32, (float)var5_10);
    }

    private void D(float f2) {
        float a = f2;
        Watermark a2 = this;
Watermark class_340 = a2;
        class_340.la.L(0);
        if (Watermark.L(class_340.j, a2.f)) {
            Watermark class_3402 = a2;
            class_3402.f = class_3402.j;
            if (class_3402.la.d() < 1.0f) {
                a2.la.L(1.0f, 200.0f, RenderSupport_123.d);
            }
            return;
        }
        if (a2.La.L() <= 0.0f) {
            Watermark class_3403 = a2;
            class_3403.f = class_3403.j;
            class_3403.la.L(1.0f);
            return;
        }
        Watermark class_3404 = a2;
        if (a2.la.d() > 0.0f) {
            class_3404.la.L(0.0f, 50.0f, RenderSupport_123.h);
            return;
        }
        if (class_3404.la.L()) {
            Watermark class_3405 = a2;
            class_3405.f = class_3405.j;
            class_3405.la.L(0.0f).L(1.0f, 200.0f, RenderSupport_123.d);
            if (class_3405.f.L() == FeatureMode_355.e && !a2.f.d().isEmpty()) {
                Watermark class_3406 = a2;
                class_3406.d(class_3406.f.L());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void L(boolean bl, float f2) {
        void a;
        float a2 = f2;
        Watermark a3 = this;
if (a != false) {
            a3.j = Watermark.a;
            return;
        }
        if (a3.Ka != null) {
            Watermark class_340 = a3;
            class_340.R -= 4.0f;
            if (class_340.R > 0.0f) {
                Watermark class_3402;
                String string;
                if (a3.Ka.L()) {
                    string = "ON";
                    class_3402 = a3;
                } else {
                    string = "OFF";
                    class_3402 = a3;
                }
                a3.j = Watermark.L(FeatureMode_355.e, a3.Ka.L(), string, class_3402.Ka.L());
                return;
            }
            a3.Ka = null;
        }
        if (a3.S != null) {
            a3.j = Watermark.L(FeatureMode_355.H, a3.S.L(), a3.S.d(), (!a3.S.L() ? 1 : 0) != 0);
            return;
        }
        if (a3.ia != null) {
            Watermark class_340 = a3;
            class_340.j = new FeatureSupport_335(FeatureMode_355.f, a3.ia.d(), a3.ia.L(), 1 != 0, a3.ia.L(), a3.ia.L(), a3.ia.L());
            return;
        }
        a3.j = l;
    }

    /*
     * WARNING - void declaration
     */
    private static FeatureSupport_335 L(FeatureMode_355 enum_355, String string, String string2, boolean bl) {
        void a;
        void a2;
        boolean a3 = bl;
        FeatureMode_355 a4 = enum_355;
return new FeatureSupport_335(a4, (String)a2, (String)a, a3, null, 0.0f, 0 != 0);
    }

    @Override
    protected void L() {
        Watermark a;
Watermark class_340 = a;
        class_340.Q = a.Ia = 0;
        class_340.ga = 0L;
    }

    @Override
    protected void D() {
        Watermark a;
Watermark class_340 = a;
        Watermark class_3402 = a;
        Watermark class_3403 = a;
        a.ea.L();
        class_3403.Ia = 1;
        class_3403.B = 0;
        class_3402.Ka = null;
        class_3402.R = 0.0f;
        class_340.S = null;
        class_340.X = null;
        a.V = 0.0f;
        a.L = 0;
        a.e.clear();
        a.f = l;
        a.j = l;
        a.la.L(1.0f);
        a.ia = null;
        a.M = "";
        a.w = "";
        a.ba.L(1.0f);
        a.Ra.D();
    }

    @EventHandler
    private void L(PacketEvent class_623) {
        PacketEvent a = class_623;
        Watermark a2 = this;
if (a.L() == PacketDirection.f) {
            a2.ea.L(a.L());
        }
    }

    private void F() {
        int a22;
        Watermark class_340 = this;
int n = a22 = class_340.d() && class_340.Wa.d() && class_340.Ra.L() ? 1 : 0;
        if (0 == 0) {
            class_340.Ra.D();
            class_340.ia = null;
            return;
        }
        Watermark class_3402 = class_340;
        class_3402.Ra.d();
        MusicSupport_075 a22 = class_3402.Ra.L();
        if (a22 == null || a22.d() == null || a22.d().isEmpty()) {
            class_340.ia = null;
            return;
        }
        class_340.ia = new FeatureSupport_338(a22.d(), a22.L(), a22.L(), a22.L(), a22.L());
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        Watermark class_340;
        int n;
        void a;
        void a2;
        void a3;
        Watermark class_3402;
        float f4;
        Watermark class_3403;
        float f5;
        Watermark class_3404 = this;
Watermark class_3405 = class_3404;
        float a4 = class_3405.L();
        int n2 = class_3405.d() && ((Minecraft)((Object)Watermark.e)).currentScreen instanceof GuiChat ? 1 : 0;
        Watermark class_3406 = class_3404;
        Watermark class_3407 = class_3404;
        Watermark class_3408 = class_3404;
        class_3404.O = (class_3404.O + a4) % 100000.0f;
        class_3408.h();
        class_3407.L(a4);
        class_3408.F();
        float f6 = a4;
        class_3407.L(n2 != 0, f6);
        class_3406.D(f6);
        class_3406.d(a4);
        RenderSupport_121 class_121 = class_3406.La;
        if (class_3404.d()) {
            f5 = 1.0f;
            class_3403 = class_3404;
        } else {
            f5 = 0.0f;
            class_3403 = class_3404;
        }
        if (class_3403.d()) {
            f4 = 300.0f;
            class_3402 = class_3404;
        } else {
            f4 = 200.0f;
            class_3402 = class_3404;
        }
        class_121.L(f5, f4, class_3402.d() ? RenderSupport_123.H : RenderSupport_123.h);
        class_3404.La.L(a4);
        if (!class_3404.d() && class_3404.La.L() && class_3404.La.L() <= 0.0f) {
            Watermark class_3409 = class_3404;
            class_3409.l();
            class_3409.C = class_3409.k();
            return;
        }
        RenderSupport_120.L();
        ThemeSupport_055 class_055 = ThemeSupport_059.L();
        Watermark class_34010 = class_3404;
        class_34010.L(class_055, a4);
        Watermark class_34011 = class_3404;
        FeatureSupport_335 class_335 = class_34010.H() ? class_34011.f : class_34011.j;
        Watermark class_34012 = class_3404;
        class_34012.L((RenderSupport_103)a3, a4, class_335);
        float f7 = class_34012.s.L() * (0.94f + 0.060000002f * class_3404.La.L());
        Watermark class_34013 = class_3404;
        float f8 = 36.695652f + class_34013.k.L();
        float f9 = class_34013.d.L();
        class_34012.ja = f8 * f7;
        class_34012.E = f9 * f7;
        void var10_12 = a2 - class_3404.ja - 20.0f;
        void var11_13 = a - class_3404.E - 20.0f;
        class_34012.W = 10.0f + Watermark.L(class_3404.K, (float)var10_12);
        class_34012.ka = 10.0f + Watermark.L(class_3404.Ha, (float)var11_13);
        Watermark class_34014 = class_3404;
        Watermark class_34015 = class_3404;
        RenderSupport_179.L(Ja, class_34014.W, class_34014.ka, class_34015.ja, class_34015.E);
        boolean bl = class_34012.L(n2 != 0, (float)var10_12, (float)var11_13, 0.0f, (float)a);
        if (n2 != 0 && bl && !class_3404.B) {
            float[] fArray = class_3404.c.L(--1 != 0);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                Watermark class_34016 = class_3404;
                Watermark.L(class_34016.K, Watermark.L(class_34016.K, (float)var10_12) + fArray[0], (float)var10_12);
                Watermark.L(class_34016.Ha, Watermark.L(class_3404.Ha, (float)var11_13) + fArray[1], (float)var11_13);
            }
        } else {
            class_3404.c.L(3 >> 2);
        }
        class_3404.W = 10.0f + Watermark.L(class_3404.K, (float)var10_12);
        class_3404.ka = 10.0f + Watermark.L(class_3404.Ha, (float)var11_13);
        UiSupport_545 class_545 = class_3404.ha;
        if (n2 != 0 && bl) {
            n = 1;
            class_340 = class_3404;
        } else {
            n = 0;
            class_340 = class_3404;
        }
        class_545.L(a4, n != 0, class_340.B);
        if (class_3404.B) {
            RenderSupport_183.L((RenderSupport_103)a3, 0.0f, (float)a, class_3404.ya);
        }
        void v21 = a3;
        void v22 = a3;
        v22.L(class_3404.La.L());
        v22.F();
        v22.L(class_3404.W, class_3404.ka + (1.0f - class_3404.La.L()) * 5.0f);
        v21.L(f7, 0.0f, 0.0f);
        class_3404.D((RenderSupport_103)v21, class_055, f8, f9);
        v21.k();
        a3.e();
    }

    private boolean k() {
return Mouse.isButtonDown(0);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3, String string, float f4) {
        void a8;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        float f5;
        Watermark class_340 = this;
float a7 = class_340.ba.L();
        if (f5 >= 0.999f) {
            a6.l(ThemeSupport_057.M, (String)a5, (float)a4, (float)a3, a2.d());
            return;
        }
        a6.d((float)a4, 0.0f, 102.0f, (float)a8);
        if (!class_340.w.isEmpty()) {
            void v1 = a6;
            String a8 = v1.L(ThemeSupport_057.M, class_340.w, 90.0f);
            v1.L(1.0f - a7);
            v1.l(ThemeSupport_057.M, a8, (float)(a4 - 12.0f * a7), (float)a3, a2.d());
            v1.e();
        }
        void v2 = a6;
        v2.L(a7);
        v2.l(ThemeSupport_057.M, (String)a5, (float)(a4 + 12.0f * (1.0f - a7)), (float)a3, a2.d());
        v2.e();
        v2.L();
    }

    private void d(float f2) {
        float a = f2;
        Watermark a2 = this;
if (a2.f.L() != FeatureMode_355.f) {
            Watermark class_340 = a2;
            class_340.M = class_340.f.L();
            class_340.ba.L(1.0f);
            return;
        }
        if (!a2.f.L().equals(a2.M)) {
            Watermark class_340 = a2;
            class_340.w = class_340.M;
            class_340.M = class_340.f.L();
            class_340.ba.L(0.0f).L(1.0f, 250.0f, RenderSupport_123.H);
        }
        a2.ba.L(0);
    }

    /*
     * WARNING - void declaration
     */
    private void D(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3) {
        OnyxListener_001 interface_001;
        int n;
        void a;
        void a2;
        void a3;
        OnyxListener_001 a4 = class_103;
        Watermark a5 = this;
int n2 = ThemeSupport_060.L(3, (ThemeSupport_055)a3);
        OnyxListener_001 interface_0012 = a4;
        ((RenderSupport_103)interface_0012).d(0.0f, 0.0f, (float)a2, (float)a, Float.MAX_VALUE, 3);
        RenderSupport_120.L((RenderSupport_103)interface_0012, 0.0f, 0.0f, (float)a2, (float)a, Float.MAX_VALUE, n2);
        int n3 = n = a5.f.L() == FeatureMode_355.f ? 1 : 0;
        if (n == 0) {
            ((RenderSupport_103)a4).L(x, 7.0f, (float)((a - 12.0f) / 2.0f), 16.695652f, 12.0f, 0.0f, 0.0f, 256.0f, 184.0f, 256, 184, a3.E(), RenderMode_138.H);
        }
        OnyxListener_001 interface_0013 = a4;
        ((RenderSupport_103)interface_0013).L(a5.la.L());
        ((RenderSupport_103)interface_0013).F();
        ((RenderSupport_103)interface_0013).L(0.0f, (1.0f - a5.la.L()) * 6.0f);
        ((RenderSupport_103)a4).d(0.0f, 0.0f, (float)a2, (float)a);
        if (n != 0) {
            OnyxListener_001 interface_0014 = a4;
            interface_001 = interface_0014;
            a5.L((RenderSupport_103)interface_0014, (ThemeSupport_055)a3, n2, (float)a);
        } else {
            float f4 = 29.695652f;
            switch (a5.f.L().ordinal()) {
                case 0: {
                    OnyxListener_001 interface_0015 = a4;
                    while (false) {
                    }
                    interface_001 = interface_0015;
                    ((RenderSupport_103)interface_0015).l(ThemeSupport_057.M, a5.f.L(), f4, (float)(a / 2.0f), a3.d());
                    break;
                }
                case 2: {
                    a5.L((RenderSupport_103)a4, (ThemeSupport_055)a3, f4, (float)a2, (float)a);
                    interface_001 = a4;
                    break;
                }
                case 1: {
                    a5.L((RenderSupport_103)a4, (ThemeSupport_055)a3, f4, (float)(a / 2.0f));
                    interface_001 = a4;
                    break;
                }
                default: {
                    interface_001 = a4;
                }
            }
        }
        ((RenderSupport_103)interface_001).L();
        OnyxListener_001 interface_0016 = a4;
        ((RenderSupport_103)a4).k();
        ((RenderSupport_103)interface_0016).e();
        a5.ha.L((RenderSupport_103)a4, 0.0f, 0.0f, (float)a2, (float)a, Float.MAX_VALUE, a3.d());
        ((RenderSupport_103)interface_0016).L(0.0f, 0.0f, (float)a2, (float)a, Float.MAX_VALUE, 1.0f, a5.p.L());
        if (n != 0) {
            a5.i((RenderSupport_103)a4, (ThemeSupport_055)a3, (float)a2, (float)a);
        }
    }

    private float L() {
        Watermark class_340 = this;
long l = System.nanoTime();
        float a = class_340.ga == 0L ? 16.0f : Math.min((float)(l - class_340.ga) / 1000000.0f, 100.0f);
        class_340.ga = l;
        return 0;
    }

    private void l() {
        Watermark a;
Watermark class_340 = a;
        Watermark class_3402 = a;
        class_3402.Ia = 0;
        class_3402.ga = 0L;
        class_340.ja = 0.0f;
        class_340.E = 0.0f;
        RenderSupport_179.L(Ja);
    }

    static {
        l = Watermark.L(FeatureMode_355.i, "onyx", "", 1 != 0);
        a = Watermark.L(FeatureMode_355.e, "Drag to move", "", 1 != 0);
    }

    private static float L(RenderSupport_103 class_103, String string) {
        String a = string;
        RenderSupport_103 a2 = class_103;
return 10.0f + a2.L(ThemeSupport_057.g, a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        Watermark class_340 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)((Minecraft)((Object)Watermark.e)).displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)((Minecraft)((Object)Watermark.e)).displayHeight - 1.0f;
        Watermark class_3402 = class_340;
        boolean bl2 = class_3402.k();
        boolean bl3 = class_3402.L(f6, (double)a4);
        if (a == false || !bl2) {
            v2 = class_340;
            class_340.B = 0;
            class_340.ya = RenderSupport_183.f;
        } else {
            if (!class_340.C && bl3) {
                class_340.B = 1;
                class_340.J = f6 - class_340.W;
                class_340.wa = a4 - class_340.ka;
            }
            v2 = class_340;
        }
        v2.C = bl2;
        if (class_340.B) {
            void a5;
            void a6;
            Watermark class_3403 = class_340;
            Watermark class_3404 = class_340;
            class_3403.ya = RenderSupport_183.L(f6 - class_340.J, (float)(a4 - class_3403.wa), class_3404.ja, class_3404.E, (float)a3, 0.0f, 10.0f, RenderSupport_179.L(Ja));
            Watermark class_3405 = class_340;
            Watermark.L(class_3403.K, class_3405.ya.L() - 10.0f, (float)a6);
            Watermark.L(class_3405.Ha, class_340.ya.D() - 10.0f, (float)a5);
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private float L(RenderSupport_103 class_103, FeatureSupport_335 class_335) {
        void a;
        FeatureSupport_335 a2 = class_335;
        Watermark a3 = this;
switch (a2.L().ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                return a.L(ThemeSupport_057.M, a2.L());
            }
            case 2: {
                return Math.max(54.0f, a.L(ThemeSupport_057.g, a2.d()) + 8.0f + a.L(ThemeSupport_057.M, a2.L())) + 4.0f;
            }
            case 1: {
                float f2 = Math.min(a.L(ThemeSupport_057.M, a2.L()), 90.0f);
                if (a2.d().isEmpty()) {
                    return f2;
                }
                return f2 + 6.0f + Watermark.L((RenderSupport_103)a, a2.d());
            }
            case 3: 
        }
        float f3 = Math.min(a.L(ThemeSupport_057.M, a2.L()), 90.0f);
        return f3 + 6.0f + 10.0f;
    }

    /*
     * WARNING - void declaration
     */
    private void d(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3) {
        int n;
        Watermark class_340 = this;
int n2 = 0;
        while (n2 < 3) {
            void a;
            void a2;
            void a3;
            void a4;
            float a5 = 0.0f;
            float f4 = class_340.f.d() ? 0.5f + 0.5f * (float)Math.sin(class_340.O * 0.007f + 0) : 0.1f;
            a5 = 3.0f + 6.0f * f4;
            void v1 = a4;
            a3.D((float)v1, (float)(a2 - 0.0f), 2.0f, 0, Float.MAX_VALUE, a.E());
            a4 = v1 + 4.0f;
            n2 = ++n;
        }
    }

    public boolean L(double a, double a2) {
        Watermark a3;
if (a >= (double)a3.W) {
            Watermark class_340 = a3;
            if (a < (double)(class_340.W + class_340.ja) && a2 >= (double)a3.ka) {
                Watermark class_3402 = a3;
                if (a2 < (double)(class_3402.ka + class_3402.E)) {
                    return 1 != 0;
                }
            }
        }
        return false;
    }

    private static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }

    private static boolean L(FeatureSupport_335 class_335, FeatureSupport_335 class_3352) {
        FeatureSupport_335 a = class_3352;
        FeatureSupport_335 a2 = class_335;
return a2.equals(a) || a2.L() == FeatureMode_355.H && a.L() == FeatureMode_355.H || a2.L() == FeatureMode_355.f && a.L() == FeatureMode_355.f;
    }

    private FeatureSupport_358 d() {
        Watermark class_340 = this;
Object a = OnyxClient.l.H;
        if (!((Module)a).d()) {
            return null;
        }
        if ((a = ((BedBreaker)a).D()) == null || ((Minecraft)((Object)Watermark.e)).theWorld == null) {
            return new FeatureSupport_358("Bed", "Idle", 0.0f, 0.0f, 3 >> 2);
        }
        float f2 = Math.clamp(((Minecraft)((Object)Watermark.e)).playerController.getCurBlockDamage(), 0.0f, 1.0f);
        int n = Math.round(f2 * 100.0f);
        return new FeatureSupport_358((String)(a = ((Minecraft)((Object)Watermark.e)).theWorld.getBlockState((BlockPos)a).getBlock().getLocalizedName()), 0 + "%", f2, 0, 0 != 0);
    }

    public boolean h() {
        Watermark a;
return ((Minecraft)((Object)Watermark.e)).thePlayer != null && ((Minecraft)((Object)Watermark.e)).theWorld != null && (a.d() || a.Ia);
    }

    /*
     * WARNING - void declaration
     */
    private void d(boolean bl) {
        void a;
        Watermark class_340 = this;
ThemeSupport_055 a2 = ThemeSupport_059.L();
        Object object = a2;
        class_340.p.L(a != false ? ((ThemeSupport_055)object).E() : ((ThemeSupport_055)object).K());
    }

    private FeatureSupport_358 L() {
        int n;
        float f2;
        Watermark class_340 = this;
Module a22 = OnyxClient.l.n;
        if (!class_340.Z.d() || !a22.d()) {
            class_340.L = 0;
            return null;
        }
        int a22 = ((Scaffold)a22).L();
        if (0 > class_340.L) {
            class_340.L = 0;
        }
        String string = "Blocks";
        String string2 = String.valueOf(0);
        if (class_340.L > 0) {
            f2 = Math.clamp(0.0f / (float)class_340.L, 0.0f, 1.0f);
            n = 0;
        } else {
            f2 = 0.0f;
            n = 0;
        }
        return new FeatureSupport_358(string, string2, f2, n, (0 <= class_340.fa.d() ? 1 : 0) != 0);
    }

    public Watermark() {
        super("Watermark", "Dynamic island that reacts to what the client is doing", ModuleCategory.l);
        Watermark a;
        Watermark class_340 = a;
        a.s = new NumberSetting("Scale", 1.0, 0.5, 2.0, 0.05).d("x").L("Island size");
        class_340.r = new BooleanSetting("Module toggles", --1 != 0).L("Announce modules turning on and off");
        a.Sa = ((NumberSetting)new NumberSetting("Hold", 0.5, 0.3, 5.0, 0.1).d("s").L("How long a notification stays expanded")).L((SettingValue)a.r);
        a.Z = new BooleanSetting("Scaffold blocks", 1 != 0).L("Live block counter while Scaffold runs");
        a.fa = ((NumberSetting)new NumberSetting("Low blocks", 32.0, 0.0, 128.0, 1.0).L("Count below which the number turns red")).L((SettingValue)a.Z);
        Enum[] enumArray = new FeatureMode_339[2];
        enumArray[0] = FeatureMode_339.I;
        enumArray[1] = FeatureMode_339.i;
        a.A = new MultiEnumSetting("Stats", FeatureMode_339.class, enumArray).L("Live client and connection readouts on their own island ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¾ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ drag them on the island itself (press T) to reorder");
        Watermark class_3402 = a;
        class_3402.Wa = new BooleanSetting("Now playing", --1 != 0).L("Show whatever's currently playing on the system (Windows/macOS only)");
        class_3402.K = new NumberSetting("Position X", 50.0, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        a.Ha = new NumberSetting("Position Y", 0.0, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        a.Qa = new NumberSetting("Stats X", 0.0, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        a.H = new NumberSetting("Stats Y", 0.0, 0.0, 100.0, 0.01).L(() -> {
return 3 >> 2;
        });
        Watermark class_3403 = a;
        Watermark class_3404 = a;
        Watermark class_3405 = a;
        Watermark class_3406 = a;
        a.ea = new FeatureSupport_329(a);
        class_3406.Ra = new MusicSupport_081();
        class_3406.La = new RenderSupport_121(0.0f);
        class_3406.k = new RenderSupport_121(22.0f);
        class_3406.d = new RenderSupport_121(22.0f);
        class_3406.la = new RenderSupport_121(1.0f);
        class_3406.Va = new RenderSupport_121(1.0f);
        class_3406.ca = new RenderSupport_121(1.0f);
        class_3406.ba = new RenderSupport_121(1.0f);
        class_3406.p = new RenderSupport_124(ThemeSupport_059.L().P());
        class_3406.aa = new RenderSupport_124(ThemeSupport_059.L().d());
        class_3406.i = new RenderSupport_124(ThemeSupport_059.L().E());
        class_3406.ha = new UiSupport_545();
        class_3406.e = Collections.newSetFromMap(new IdentityHashMap());
        class_3405.f = l;
        class_3405.j = l;
        class_3405.Ma = 1.0f;
        class_3404.M = "";
        class_3403.w = "";
        class_3404.ya = RenderSupport_183.f;
        class_3403.c = new RenderSupport_184();
    }

    /*
     * Unable to fully structure code
     */
    private void h() {
        var2_1 = this;
if (!var2_1.d()) {
            return;
        }
        var1_2 = OnyxClient.l.L().iterator();
        block0: while (true) {
            v0 = var1_2;
            while (v0.hasNext()) {
                a = var1_2.next();
                if (a == var2_1) continue block0;
                if (a == OnyxClient.l.k) {
                    v0 = var1_2;
                    continue;
                }
                var3_3 = a.d();
                if (var3_3 == var2_1.e.contains(a)) {
                    v0 = var1_2;
                    continue;
                }
                v1 = var2_1;
                if (var3_3) {
                    v1.e.add(a);
                    v2 = var2_1;
                } else {
                    v1.e.remove(a);
                    v2 = var2_1;
                }
                if (v2.Q) ** break;
                continue block0;
                if (!var2_1.r.d()) {
                    v0 = var1_2;
                    continue;
                }
                var2_1.Ka = new FeatureSupport_351(a.d(), var3_3);
                var2_1.R = var2_1.Sa.L() * 1000.0f;
                v0 = var1_2;
            }
            break;
        }
        var2_1.Q = --1;
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2) {
        void a;
        Watermark a2;
        Watermark class_340 = this;
Watermark class_3402 = class_340;
        class_3402.S = class_3402.L();
        if (class_3402.S == null) {
            class_340.S = class_340.d();
        }
        Watermark class_3403 = a2 = class_340.S == null ? null : class_340.S.L();
        if (!Objects.equals(a2, class_340.X) && class_340.Va.L()) {
            class_340.Ma = class_340.S != null && class_340.S.d() < class_340.V ? -1.0f : 1.0f;
            class_340.Va.L(0.0f).L(1.0f, 100.0f, RenderSupport_123.H);
        }
        class_340.X = a2;
        class_340.V = class_340.S == null ? 0.0f : class_340.S.d();
        Watermark class_3404 = class_340;
        class_3404.ca.L(class_3404.S == null ? 0.0f : class_340.S.L(), 250.0f, RenderSupport_123.l);
        Watermark class_3405 = class_340;
        class_3405.ca.L((float)a);
        class_3405.Va.L((float)a);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(NumberSetting class_052, float f2, float f3) {
        void a;
        float a2 = f3;
        NumberSetting a3 = class_052;
if (4.0f <= 0.0f) {
            return;
        }
        a3.i((double)Math.clamp((float)(a / 4.0f), 0.0f, 1.0f) * 100.0);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2, float f3) {
        void a;
        void a2;
        void a3;
        void a4;
        Watermark class_340 = this;
void v0 = a4;
        String a222 = v0.L(ThemeSupport_057.M, class_340.f.L(), 90.0f);
        v0.l(ThemeSupport_057.M, a222, (float)a3, 0.0f, a.d());
        if (class_340.f.d().isEmpty()) {
            return;
        }
        a3 = a3 + a4.L(ThemeSupport_057.M, a222) + 6.0f;
        void v1 = a4;
        float a222 = Watermark.L((RenderSupport_103)v1, class_340.f.d());
        void v2 = a;
        v1.D((float)a3, (float)(a2 - 6.0f), 0, 12.0f, Float.MAX_VALUE, class_340.f.L() ? v2.J() : v2.n());
        void v3 = a;
        a4.L(ThemeSupport_057.g, class_340.f.d(), (float)(a3 + 0.0f), 0.0f, class_340.f.L() ? v3.c() : v3.F());
    }
}

