/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.events.GeometryUtils;
import openonyx.events.ChatFormattingUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_341;
import openonyx.features.hud.FeatureSupport_356;
import openonyx.features.hud.FeatureMode_362;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.features.hud.internal.FeatureSupport_375;
import openonyx.features.hud.internal.FeatureSupport_376;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.features.hud.internal.FeatureMode_374;
import openonyx.features.hud.internal.FeatureMode_379;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.history.internal.ActionSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_v.RenderSupport_179;
import openonyx.render.group_v.RenderSupport_182;
import openonyx.render.group_v.RenderSupport_183;
import openonyx.render.group_v.RenderSupport_184;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_557;
import org.lwjgl.input.Mouse;

public class TargetHUD
extends Module {
    public FeatureSupport_375 aa;
    private final static float Ea = 1.0f;
    private final static float La = 0.94f;
    private final static float Ma = 3.0f;
    public ActionSetting ba;
    private final UiSupport_545 Ia;
    private final static float Fa = 400.0f;
    private float Ja;
    private final static float ja = 9.0f;
    private final static float ma = 0.5f;
    private final static float da = 28.0f;
    private final RenderSupport_121 fa;
    private final static float Ka = 6.0f;
    private float ha;
    private float Ha;
    private final static float ia = 8.0f;
    public FeatureSupport_375 Da;
    private final RenderSupport_121 la;
    private final static float Ga = 8.0f;
    private final static float ga = 1.0f;
    private final static float ca = 100.0f;
    public NumberSetting Q;
    private float T;
    private final RenderSupport_124 S;
    public NumberSetting o;
    private boolean U;
    public FeatureSupport_375 X;
    private final static float w = 8.0f;
    private EntityLivingBase z;
    private float v;
    private final RenderSupport_121 s;
    private final static float Z = 1.35f;
    private final static float O = 0.8f;
    private float N;
    private final static float q = 12.0f;
    private EntityLivingBase x;
    private float u;
    private final static float y = 0.55f;
    private final static float n = 4.0f;
    private List<FeatureSupport_375> Y;
    private final static double r = 0.05;
    private float W;
    public EnumSetting<FeatureMode_362> P;
    private float V;
    private float R;
    private final RenderSupport_121 p;
    private long t;
    private RenderSupport_182 b;
    public NumberSetting E;
    private final static float F = 2.0f;
    private final RenderSupport_184 G;
    private final RenderSupport_121 A;
    private final static float K = 80.0f;
    public FeatureSupport_375 B;
    private final static String C = " \u00b7 ";
    private final static float J = 0.5f;
    private final static float D = 11.0f;
    public FeatureSupport_375 c;
    private boolean a;
    private final static float k = 10.0f;
    public NumberSetting g;
    private boolean M;
    private final RenderSupport_121 L;
    public NumberSetting j;
    private final RenderSupport_124 m;
    public NumberSetting h;
    private float l;
    private final static float I = 0.3f;
    public FeatureSupport_375 d;
    private final static String i = "target-hud";
    private final static float f = 62.0f;
    private final static float H = 26.0f;
    private final static int e = 3;

    private float d() {
        TargetHUD class_360 = this;
long l = System.nanoTime();
        float a = class_360.t == 0L ? 16.0f : Math.min((float)(l - class_360.t) / 1000000.0f, 100.0f);
        class_360.t = l;
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, FeatureSupport_356 class_356, boolean bl) {
        void a;
        void a2;
        void a3;
        OnyxListener_001 a4 = class_103;
        TargetHUD a5 = this;
void v0 = a3;
        float f2 = v0.D();
        float f3 = v0.L();
        int n = ThemeSupport_060.L(3, (ThemeSupport_055)a2);
        OnyxListener_001 interface_001 = a4;
        ((RenderSupport_103)interface_001).d(0.0f, 0.0f, f2, f3, 12.0f, 3);
        RenderSupport_120.L((RenderSupport_103)interface_001, 0.0f, 0.0f, f2, f3, 12.0f, n);
        ((RenderSupport_103)a4).L(a5.s.L());
        block4: for (FeatureSupport_341 class_341 : v0.L()) {
            switch (class_341.L().L()) {
                case d: {
                    while (false) {
                    }
                    a5.L((RenderSupport_103)a4, (ThemeSupport_055)a2, class_341, n);
                    continue block4;
                }
                case H: {
                    a5.L((RenderSupport_103)a4, (ThemeSupport_055)a2, class_341, a3.d());
                    continue block4;
                }
            }
            a5.L((RenderSupport_103)a4, (ThemeSupport_055)a2, class_341);
        }
        ((RenderSupport_103)a4).e();
        if (a != false) {
            a5.Ia.L((RenderSupport_103)a4, 0.0f, 0.0f, f2, f3, 12.0f, a2.d());
        }
        ((RenderSupport_103)a4).L(0.0f, 0.0f, f2, f3, 12.0f, 1.0f, RenderSupport_124.L(a2.P(), a2.E(), a != false ? a5.p.L() : 0.0f));
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
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, FeatureSupport_341 class_341, float f2) {
        float a;
        void a2;
        float f3;
        void a3;
        FeatureSupport_341 a4 = class_341;
        TargetHUD a5 = this;
Object object = a4;
        float f4 = ((FeatureSupport_341)object).L();
        float f5 = ((FeatureSupport_341)object).d();
        if (f4 <= 0.0f) {
            return;
        }
        int n = a5.L(a4.L(), (ThemeSupport_055)a3);
        float f6 = a4.L().g.L();
        if (f3 > 0.0f) {
            a2.L(a4.D(), a4.i(), f4 * a5.la.L(), f5, Float.MAX_VALUE, f6, 0.0f, n);
        }
        float f7 = f4;
        float f8 = a5.L((RenderSupport_103)a2, a4, 0.0f, f7, a5.la.L() * f7, n);
        if (a4.L().i.d()) {
            float f9 = f4;
            f8 = a5.L((RenderSupport_103)a2, a4, f8, f9, (float)(a * f9), a3.B());
        }
        if (a4.L().I.d()) {
            float f10 = f4;
            f8 = a5.L((RenderSupport_103)a2, a4, f8, f10, (a5.L.L() - a5.la.L()) * f10, ThemeSupport_059.L(a3.K(), 0.55f));
        }
        float f11 = a = f8 > 0.0f ? f8 + 3.0f : 0.0f;
        if (f4 - a > 0.5f) {
            a2.D(a4.D() + a, a4.i(), f4 - a, f5, Float.MAX_VALUE, a3.n());
        }
    }

    private float L(RenderSupport_128 class_128) {
        RenderSupport_128 a = class_128;
        TargetHUD a2 = this;
return a.i() * 1.35f;
    }

    public TargetHUD() {
        super("TargetHUD", "Card showing your target's health and distance", ModuleCategory.l);
        TargetHUD a2;
        TargetHUD class_360 = a2;
        class_360.ba = new ActionSetting("Edit layout", () -> {
e.displayGuiScreen(new UiSupport_557(TargetHUD.e.currentScreen));
        }).L("Move, rescale, recolour and retitle the card's elements");
        TargetHUD class_3602 = a2;
        class_3602.h = new NumberSetting("Scale", 0.85, 0.5, 2.0, 0.05).d("x").L("Card size");
        class_3602.o = new NumberSetting("Linger", 1.0, 0.0, 3.0, 0.1).d("s").L("How long the card holds a target it has lost");
        class_3602.Da = new FeatureSupport_375(FeatureMode_379.H, 5 >> 2, "", () -> {
return ThemeSupport_059.L().n();
        });
        a2.B = new FeatureSupport_375(FeatureMode_379.h, 1 != 0, "{name}", () -> {
return ThemeSupport_059.L().d();
        });
        a2.d = new FeatureSupport_375(FeatureMode_379.f, --1 != 0, "{health}", () -> {
return ThemeSupport_059.L().E();
        });
        a2.X = new FeatureSupport_375(FeatureMode_379.l, --1 != 0, "{distance}m", () -> {
return ThemeSupport_059.L().F();
        });
        a2.c = new FeatureSupport_375(FeatureMode_379.i, 1 != 0, "{status}", () -> {
return ThemeSupport_059.L().F();
        });
        a2.aa = new FeatureSupport_375(FeatureMode_379.e, --1 != 0, "", () -> {
return ThemeSupport_059.L().E();
        });
        a2.P = new EnumSetting<FeatureMode_362>("Position", FeatureMode_362.H).L("Fixed on the screen, or floating above the target in the world");
        a2.g = ((NumberSetting)new NumberSetting("Height offset", 0.6, -3.0, 3.0, 0.1).d("m").L("How far above the target's head the card floats")).L(a2.P, (T a) -> {
if (a == FeatureMode_362.e) {
                return 5 >> 2;
            }
            return false;
        });
        TargetHUD class_3603 = a2;
        class_3603.E = new NumberSetting("Opacity", 100.0, 5.0, 100.0, 1.0).d("%").L("Overall opacity of the card - the rendered mob avatar is drawn by the game and stays solid");
        class_3603.Q = new NumberSetting("Position X", 50.0, 0.0, 100.0, 0.01).L(() -> {
return 5 >> 3;
        });
        a2.j = new NumberSetting("Position Y", 78.26, 0.0, 100.0, 0.01).L(() -> {
return 5 >> 3;
        });
        TargetHUD class_3604 = a2;
        TargetHUD class_3605 = a2;
        TargetHUD class_3606 = a2;
        class_3606.A = new RenderSupport_121(0.0f);
        class_3606.s = new RenderSupport_121(1.0f);
        class_3606.fa = new RenderSupport_121(62.0f);
        class_3606.la = new RenderSupport_121(1.0f);
        class_3606.L = new RenderSupport_121(1.0f);
        class_3606.p = new RenderSupport_121(0.0f);
        class_3606.S = new RenderSupport_124(ThemeSupport_059.L().E());
        class_3606.m = new RenderSupport_124(ThemeSupport_059.L().F());
        class_3605.Ia = new UiSupport_545();
        class_3604.Ja = 1.0f;
        class_3605.b = RenderSupport_183.f;
        class_3604.G = new RenderSupport_184();
    }

    public List<FeatureSupport_375> D() {
        TargetHUD a;
if (a.Y == null) {
            TargetHUD class_360 = a;
            TargetHUD class_3602 = a;
            a.Y = List.of(class_360.Da, class_360.B, a.d, class_3602.X, class_3602.c, a.aa);
        }
        return a.Y;
    }

    /*
     * WARNING - void declaration
     */
    private String L(FeatureSupport_375 class_375, RenderSupport_128 class_128, FeatureSupport_376 class_376) {
        void a;
        void a2;
        Object a3 = class_375;
        TargetHUD a4 = this;
a3 = FeatureSupport_377.L((String)((FeatureSupport_375)a3).h.L(), (FeatureSupport_376)a2, (FeatureMode_374)((FeatureSupport_375)a3).e.L());
        return FeatureSupport_377.L(a.L(), (String)a3);
    }

    public boolean l() {
        TargetHUD a;
if (a.d() && TargetHUD.e.thePlayer != null && TargetHUD.e.theWorld != null) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        TargetHUD class_360 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)TargetHUD.e.displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)TargetHUD.e.displayHeight - 1.0f;
        TargetHUD class_3602 = class_360;
        boolean bl2 = class_3602.I();
        boolean bl3 = class_3602.L((double)f6, (double)a4);
        if (a == false || !bl2) {
            v2 = class_360;
            class_360.M = 0;
            class_360.b = RenderSupport_183.f;
        } else {
            if (!class_360.U && bl3) {
                class_360.M = 1;
                class_360.ha = f6 - class_360.T;
                class_360.Ha = a4 - class_360.l;
            }
            v2 = class_360;
        }
        v2.U = bl2;
        if (class_360.M) {
            void a5;
            void a6;
            TargetHUD class_3603 = class_360;
            TargetHUD class_3604 = class_360;
            class_3603.b = RenderSupport_183.L(f6 - class_360.ha, (float)(a4 - class_3603.Ha), class_3604.u, class_3604.W, (float)a3, 0.0f, 10.0f, RenderSupport_179.L(i));
            TargetHUD class_3605 = class_360;
            TargetHUD.L(class_3603.Q, class_3605.b.L() - 10.0f, (float)a6);
            TargetHUD.L(class_3605.j, class_360.b.D() - 10.0f, (float)a5);
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     */
    private void L(boolean bl, float f2) {
        boolean a = bl;
        TargetHUD a2 = this;
EntityLivingBase entityLivingBase = a /* !! */  = a ? TargetHUD.e.thePlayer : a2.L();
        if (a /* !! */  != null) {
            a2.x = a /* !! */ ;
            a2.v = 0.0f;
            return;
        }
        if (a2.x != null) {
            void a3;
            TargetHUD class_360 = a2;
            class_360.v += a3;
            if (class_360.v >= a2.o.L() * 1000.0f) {
                a2.x = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private int L(FeatureSupport_375 class_375, ThemeSupport_055 class_055) {
        void a;
        ThemeSupport_055 a2 = class_055;
        TargetHUD a3 = this;
if (!a.j.d()) {
            return a.j.L();
        }
        switch (a.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case H: {
                while (false) {
                }
                return a2.n();
            }
            case h: {
                return a2.d();
            }
            case f: 
            case e: {
                return a3.S.L();
            }
            case l: {
                return a2.F();
            }
            case i: {
                return a3.m.L();
            }
        }
    }

    public float L() {
        TargetHUD a;
return a.h.L();
    }

    /*
     * WARNING - void declaration
     */
    private void d(float f2, float f3) {
        void a;
        float a2 = f3;
        TargetHUD a3 = this;
TargetHUD class_360 = a3;
        a3.T = Math.clamp(a3.V - class_360.u * 0.5f, 10.0f, Math.max(10.0f, (float)(a - a3.u - 10.0f)));
        a3.l = Math.clamp(class_360.R - a3.W, 10.0f, Math.max(10.0f, 4.0f - a3.W - 10.0f));
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3) {
        TargetHUD class_360;
        void a;
        float a2 = f2;
        TargetHUD a3 = this;
if (4.0f < a3.Ja) {
            a3.N = 0.0f;
        }
        a3.Ja = 4.0f;
        a3.la.L(4.0f, 250.0f, RenderSupport_123.l);
        a3.la.L((float)a);
        if (4.0f > a3.L.d()) {
            TargetHUD class_3602 = a3;
            class_360 = class_3602;
            class_3602.L.L(4.0f, 250.0f, RenderSupport_123.l);
        } else {
            if (4.0f < a3.L.d()) {
                TargetHUD class_3603 = a3;
                class_3603.N += a;
                if (class_3603.N >= 400.0f) {
                    a3.L.L(4.0f, 500.0f, RenderSupport_123.h);
                }
            }
            class_360 = a3;
        }
        class_360.L.L((float)a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, FeatureSupport_341 class_341, int n) {
        void a;
        void v5;
        void a2;
        float f2;
        void a2222;
        FeatureSupport_341 a4222 = class_341;
        TargetHUD a3 = this;
Object object = a4222;
        float f3 = a4222.D();
        float f4 = ((FeatureSupport_341)object).i();
        float f5 = ((FeatureSupport_341)object).L();
        int a2222 = a3.L(a4222.L(), (ThemeSupport_055)a2222);
        float a4222 = ((FeatureSupport_341)object).L().g.L();
        if (f2 > 0.0f) {
            float f6 = f5;
            a2.L(f3, f4, f6, f6, 4.0f, a4222, 0.0f, a2222);
        }
        float f7 = f5;
        a2.D(f3, f4, f7, f7, 4.0f, a2222);
        EntityLivingBase a4222 = a3.z;
        if (a4222 instanceof AbstractClientPlayer) {
            AbstractClientPlayer a2222 = (AbstractClientPlayer)a4222;
            void v4 = a2;
            v5 = v4;
            v4.L(a2222.getLocationSkin(), f3, f4, f5);
        } else {
            int a4222 = (int)Math.max(1.0f, 0.8f * f5 / Math.max(0.5f, a3.z.height));
            void v6 = a2;
            v5 = v6;
            v6.L(a3.z, f3 + f5 / 2.0f, f4 + f5, a4222);
        }
        float f8 = f5;
        v5.i(f3, f4, f8, f8, 4.0f, (int)a);
    }

    private static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103, FeatureSupport_341 class_341, float f2, float f3, float f4, int n) {
        void a;
        void a2;
        void a3;
        float f5;
        float a4;
        void a5;
        void a6;
        TargetHUD class_360 = this;
float a7 = a6 > 0.0f ? a6 + 3.0f : 0.0f;
        a4 = Math.min((float)a5, (float)(a4 - a7));
        if (f5 <= 0.5f) {
            return (float)a6;
        }
        a3.D(a2.D() + a7, a2.i(), a4, a2.d(), Float.MAX_VALUE, (int)a);
        return a7 + a4;
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(float f2, float f3, float f4) {
        float f5;
        Vec3 vec3;
        void a;
        void a2;
        float a222 = f4;
        TargetHUD a3 = this;
if (a3.z == null || !a3.z.isEntityAlive() || a3.x == null) {
            return a3.L((float)a2, (float)a);
        }
        if (!RenderSupport_107.L()) {
            return a3.L((float)a2, (float)a);
        }
        Object a222 = new Vec3(a3.z.lastTickPosX + (a3.z.posX - a3.z.lastTickPosX) * 0.0, a3.z.lastTickPosY + (a3.z.posY - a3.z.lastTickPosY) * 0.0 + (double)a3.z.height + (double)a3.g.L(), a3.z.lastTickPosZ + (a3.z.posZ - a3.z.lastTickPosZ) * 0.0);
        if (vec3.subtract(RenderSupport_107.D()).dotProduct(RenderSupport_107.d()) <= 0.05) {
            a3.a = 0;
            return a3.a;
        }
        float[] fArray = RenderSupport_107.L((Vec3)a222, (float)a2, (float)a);
        a222 = fArray;
        if (fArray == null) {
            a3.a = 5 >> 3;
            return a3.a;
        }
        float f6 = f5 = a3.a ? 28.0f : 0.0f;
        if (a222[0] < -f5 || a222[0] > a2 + f5 || a222[1] < -f5 || a222[1] > a + f5) {
            a3.a = 0;
            return 0 != 0;
        }
        TargetHUD class_360 = a3;
        Object object = a222;
        a3.V = (float)object[0];
        class_360.R = (float)object[1];
        class_360.a = 1;
        a3.d((float)a2, (float)a);
        return 1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, FeatureSupport_341 class_341) {
        void a;
        void a22;
        FeatureSupport_341 a3 = class_341;
        TargetHUD a4 = this;
if (a3.L().isEmpty()) {
            return;
        }
        Object object = a3;
        RenderSupport_128 class_128 = ((FeatureSupport_341)object).L();
        Object object2 = a3;
        int a22 = a4.L(((FeatureSupport_341)object2).L(), (ThemeSupport_055)a22);
        float f2 = ((FeatureSupport_341)object).L().g.L();
        float f3 = ((FeatureSupport_341)object2).i() + a3.d() / 2.0f;
        void v2 = a;
        v2.L(class_128, a3.L(), a3.D(), a.d(class_128, f3), a22, f2);
        v2.l(class_128, a3.L(), a3.D(), f3, a22);
        if (!((FeatureMode_374)((FeatureSupport_341)object).L().e.L()).L()) {
            return;
        }
        float f4 = a4.L(class_128);
        a.L("\ue87d", a3.D() + a3.L() - f4 / 2.0f, f3, f4, a22);
    }

    @Override
    protected void D() {
        TargetHUD a;
TargetHUD class_360 = a;
        TargetHUD class_3602 = a;
        TargetHUD class_3603 = a;
        class_3603.z = null;
        class_3603.x = null;
        class_3602.a = 0;
        class_3602.M = 0;
        class_360.v = 0.0f;
        class_360.t = 0L;
        a.u = 0.0f;
        a.W = 0.0f;
        a.A.L(0.0f);
        a.s.L(1.0f);
        RenderSupport_179.L(i);
    }

    private EntityLivingBase L() {
        TargetHUD class_360 = this;
EntityLivingBase a = OnyxClient.l.u.D();
        if (a != null && a.isEntityAlive()) {
            return a;
        }
        return null;
    }

    public boolean L(double a, double a2) {
        TargetHUD a3;
if (a >= (double)a3.T) {
            TargetHUD class_360 = a3;
            if (a < (double)(class_360.T + class_360.u) && a2 >= (double)a3.l) {
                TargetHUD class_3602 = a3;
                if (a2 < (double)(class_3602.l + class_3602.W)) {
                    return --1 != 0;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<FeatureSupport_341> list, FeatureSupport_375 class_375, String string, RenderSupport_128 class_128, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        OnyxListener_001 a8 = class_375;
        TargetHUD a9 = this;
if (!((FeatureSupport_375)a8).h()) {
            return;
        }
        a7.add(new FeatureSupport_341((FeatureSupport_375)a8, (String)a6, (RenderSupport_128)a5, (float)(a4 + ((FeatureSupport_375)a8).M.L()), (float)(a3 + ((FeatureSupport_375)a8).m.L()), (float)a2, (float)a));
    }

    /*
     * WARNING - void declaration
     */
    private float L(float f2) {
        void a;
        TargetHUD class_360 = this;
if (!(TargetHUD.e.thePlayer != null && class_360.z != TargetHUD.e.thePlayer && TargetHUD.e.thePlayer.isEntityAlive() && class_360.z.isEntityAlive() && Float.isFinite(0.0f))) {
            return 0.0f;
        }
        float a2 = Math.max(TargetHUD.e.thePlayer.getMaxHealth(), 1.0f);
        a2 = Math.clamp(TargetHUD.e.thePlayer.getHealth(), 0.0f, 4.0f);
        float f3 = Math.max(TargetHUD.e.thePlayer.getAbsorptionAmount(), 0.0f);
        return 4.0f + f3 - a;
    }

    /*
     * WARNING - void declaration
     */
    private int L(ThemeSupport_055 class_055, boolean bl, float f2) {
        float f3;
        void a;
        void a22;
        ThemeSupport_055 a3 = class_055;
        TargetHUD a4 = this;
if (a22 != false) {
            return a3.E();
        }
        float a22 = a4.L((float)a);
        if (f3 > 1.0f) {
            return a3.E();
        }
        if (a22 < -1.0f) {
            return a3.K();
        }
        return a3.F();
    }

    /*
     * WARNING - void declaration
     */
    private float L(FeatureSupport_375 class_375, RenderSupport_128 class_128) {
        void a;
        RenderSupport_128 a2 = class_128;
        TargetHUD a3 = this;
if (((FeatureMode_374)a.e.L()).L()) {
            return 2.0f + a3.L(a2);
        }
        return 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3, float f4) {
        TargetHUD class_360;
        boolean bl;
        TargetHUD class_3602;
        void a32;
        void a;
        void a2;
        void a4;
        int n;
        float f5;
        int n2;
        float f6;
        TargetHUD class_3603 = this;
float f7 = class_3603.d();
        boolean bl2 = TargetHUD.e.currentScreen instanceof GuiChat;
        TargetHUD class_3604 = class_3603;
        class_3604.L(bl2, f7);
        class_3604.L(f7);
        int a222 = class_3604.x == null ? 1 : 0;
        RenderSupport_121 class_121 = class_3603.A;
        if (0 != 0) {
            f6 = 0.0f;
            n2 = 0;
        } else {
            f6 = 1.0f;
            n2 = 0;
        }
        if (n2 != 0) {
            f5 = 200.0f;
            n = 0;
        } else {
            f5 = 300.0f;
            n = 0;
        }
        class_121.L(f6, f5, n != 0 ? RenderSupport_123.h : RenderSupport_123.H);
        class_3603.A.L(f7);
        if (class_3603.z == null) {
            TargetHUD class_3605 = class_3603;
            class_3603.u = 0.0f;
            class_3605.W = 0.0f;
            class_3605.U = class_3603.I();
            RenderSupport_179.L(i);
            return;
        }
        RenderSupport_120.L();
        ThemeSupport_055 a222 = ThemeSupport_059.L();
        TargetHUD class_3606 = class_3603;
        FeatureSupport_356 class_356 = class_3606.L((RenderSupport_103)a4, a222, bl2, f7);
        float f8 = class_3606.h.L() * (0.94f + 0.060000002f * class_3603.A.L());
        class_3606.u = class_356.D() * f8;
        class_3606.W = class_356.L() * f8;
        int n3 = class_3606.P.L(FeatureMode_362.e) && !bl2 && class_3603.L((float)a2, (float)a, (float)a32) ? 1 : 0;
        int a32 = 0;
        if (n3 != 0) {
            TargetHUD class_3607 = class_3603;
            class_3602 = class_3607;
            class_3607.U = class_3607.I();
            class_3607.G.L(3 >> 2);
            RenderSupport_179.L(i);
        } else {
            void var10_14 = a2 - class_3603.u - 20.0f;
            void var11_15 = a - class_3603.W - 20.0f;
            class_3603.T = 10.0f + TargetHUD.L(class_3603.Q, (float)var10_14);
            class_3603.l = 10.0f + TargetHUD.L(class_3603.j, (float)var11_15);
            TargetHUD class_3608 = class_3603;
            TargetHUD class_3609 = class_3603;
            RenderSupport_179.L(i, class_3603.T, class_3608.l, class_3609.u, class_3609.W);
            a32 = class_3608.L(bl2, (float)var10_14, (float)var11_15, (float)a2, (float)a) ? 1 : 0;
            if (bl2 && a32 != 0 && !class_3603.M) {
                float[] fArray = class_3603.G.L(5 >> 2);
                if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                    TargetHUD class_36010 = class_3603;
                    TargetHUD.L(class_36010.Q, TargetHUD.L(class_36010.Q, (float)var10_14) + fArray[0], (float)var10_14);
                    TargetHUD.L(class_36010.j, TargetHUD.L(class_3603.j, (float)var11_15) + fArray[1], (float)var11_15);
                }
            } else {
                class_3603.G.L(0 != 0);
            }
            class_3602 = class_3603;
            class_3603.T = 10.0f + TargetHUD.L(class_3603.Q, (float)var10_14);
            class_3603.l = 10.0f + TargetHUD.L(class_3603.j, (float)var11_15);
        }
        class_3602.p.L(bl2 ? 1.0f : 0.0f, 250.0f, RenderSupport_123.l);
        class_3603.p.L(f7);
        UiSupport_545 class_545 = class_3603.Ia;
        if (bl2 && a32 != 0) {
            bl = --1 != 0;
            class_360 = class_3603;
        } else {
            bl = false;
            class_360 = class_3603;
        }
        class_545.L(f7, bl, class_360.M);
        if (class_3603.M) {
            RenderSupport_183.L((RenderSupport_103)a4, (float)a2, (float)a, class_3603.b);
        }
        void v16 = a4;
        void v17 = a4;
        void v18 = a4;
        void v19 = a4;
        TargetHUD class_36011 = class_3603;
        a4.L(class_3603.A.L());
        v19.L(class_36011.E.L() / 100.0f);
        v19.F();
        v18.L(class_36011.T, class_3603.l);
        v18.L(f8, 0.0f, 0.0f);
        class_3603.L((RenderSupport_103)v17, a222, class_356, 5 >> 2);
        v16.k();
        v17.e();
        v16.e();
    }

    private void L(EntityLivingBase entityLivingBase) {
        EntityLivingBase a22 = entityLivingBase;
        TargetHUD a = this;
a.z = a22;
        a.a = 0;
        float a22 = Math.clamp(a22.getHealth() / Math.max(a22.getMaxHealth(), 1.0f), 0.0f, 1.0f);
        a.la.L(0);
        a.L.L(0);
        TargetHUD class_360 = a;
        class_360.Ja = 0;
        class_360.N = 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(ThemeSupport_055 class_055, boolean bl, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        float f5 = f4;
        TargetHUD a6 = this;
void v0 = a5;
        a6.S.L(a4 <= 0.3f ? v0.K() : v0.E(), 250.0f, RenderSupport_123.l);
        TargetHUD class_360 = a6;
        class_360.S.L((float)a3);
        class_360.m.L(a6.L((ThemeSupport_055)a5, (boolean)a2, (float)a), 250.0f, RenderSupport_123.l);
        a6.m.L((float)a3);
    }

    private boolean I() {
return Mouse.isButtonDown(0);
    }

    /*
     * WARNING - void declaration
     */
    public FeatureSupport_356 L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2) {
        void a;
        void a2;
        float a3 = f2;
        TargetHUD a4 = this;
if (TargetHUD.e.thePlayer == null) {
            return null;
        }
        a4.z = TargetHUD.e.thePlayer;
        a4.x = TargetHUD.e.thePlayer;
        a4.s.L(1.0f);
        a4.A.L(1.0f);
        return a4.L((RenderSupport_103)a2, (ThemeSupport_055)a, 0 != 0, a3);
    }

    /*
     * WARNING - void declaration
     */
    private String L(boolean bl, float f2) {
        float f3;
        void a;
        boolean a22 = bl;
        TargetHUD a3 = this;
if (a22) {
            return "Drag to move";
        }
        float a22 = a3.L((float)a);
        if (f3 > 1.0f) {
            return "Winning";
        }
        if (a22 < -1.0f) {
            return "Losing";
        }
        return "Even";
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(float f2, float f3) {
        void a;
        float a2 = f3;
        TargetHUD a3 = this;
if (!a3.a) {
            return 0 != 0;
        }
        a3.d(0.0f, 4.0f);
        return --1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public FeatureSupport_356 L(RenderSupport_103 class_103, ThemeSupport_055 class_055, boolean bl, float f2) {
        ArrayList<FeatureSupport_341> arrayList;
        TargetHUD class_360;
        float f3;
        TargetHUD class_3602;
        float f4;
        float f5;
        float f6;
        String string;
        void a42;
        void a522;
        float a;
        TargetHUD class_3603 = this;
TargetHUD class_3604 = class_3603;
        TargetHUD class_3605 = class_3603;
        float a2 = Math.max(class_3605.z.getMaxHealth(), 1.0f);
        float a222 = Math.clamp(class_3605.z.getHealth(), 0.0f, a2);
        float f7 = Math.max(class_3605.z.getAbsorptionAmount(), 0.0f);
        float f8 = 0 / a2;
        class_3604.L(f8, a);
        class_3604.L((ThemeSupport_055)a2, (boolean)a522, f8, 0 + f7, a);
        boolean bl2 = class_3604.aa.i.d();
        Object a222 = new FeatureSupport_376(ChatFormattingUtils.L(class_3603.z.getName()), 0 + (bl2 ? f7 : 0.0f), a2, (float)Math.sqrt(GeometryUtils.L(class_3603.z)), class_3603.L((boolean)a522, 0 + f7));
        TargetHUD class_3606 = class_3603;
        RenderSupport_128 class_128 = class_3606.L(class_3606.B, ThemeSupport_057.M);
        RenderSupport_128 class_1282 = class_3606.L(class_3606.d, ThemeSupport_057.M);
        RenderSupport_128 class_1283 = class_3606.L(class_3606.X, ThemeSupport_057.g);
        RenderSupport_128 class_1284 = class_3606.L(class_3606.c, ThemeSupport_057.g);
        TargetHUD class_3607 = class_3603;
        RenderSupport_128 class_1285 = class_128;
        String string2 = a42.L(class_1285, class_3607.L(class_3607.B, class_1285, (FeatureSupport_376)a222), 80.0f * class_3603.B.l.L());
        String string3 = class_3606.L(class_3606.d, class_1282, (FeatureSupport_376)a222);
        if (a522 != false) {
            string = "";
        } else {
            TargetHUD class_3608 = class_3603;
            string = class_3608.L(class_3608.X, class_1283, (FeatureSupport_376)a222);
        }
        String a522 = string;
        TargetHUD class_3609 = class_3603;
        a222 = class_3609.L(class_3609.c, class_1284, (FeatureSupport_376)a222);
        if (class_3609.X.h() && class_3603.c.h() && !a522.isEmpty()) {
            a522 = new StringBuilder().insert(0, a522).append(C).toString();
        }
        float f9 = class_3603.Da.h() ? 26.0f * class_3603.Da.l.L() : 0.0f;
        float f10 = 11.0f + (class_3603.Da.h() ? f9 + 9.0f : 0.0f);
        float f11 = f6 = class_3603.B.h() ? a42.L(class_128, string2) : 0.0f;
        if (class_3603.d.h()) {
            TargetHUD class_36010 = class_3603;
            f5 = a42.L(class_1282, string3) + class_36010.L(class_36010.d, class_1282);
        } else {
            f5 = 0.0f;
        }
        float f12 = f5;
        float f13 = class_3603.X.h() ? a42.L(class_1283, a522) : 0.0f;
        float f14 = class_3603.c.h() ? a42.L(class_1284, (String)a222) : 0.0f;
        float a42 = f6 + f12 + (class_3603.B.h() && class_3603.d.h() ? 8.0f : 0.0f);
        float f15 = f13 + f14;
        TargetHUD class_36011 = class_3603;
        class_3603.fa.L(Math.max(62.0f, Math.max(a42, f15)), 300.0f, RenderSupport_123.l);
        class_3603.fa.L(a);
        a42 = f10 + class_3603.fa.L() + 11.0f;
        a = class_36011.aa.H.L();
        if (class_36011.B.h()) {
            f4 = class_128.h();
            class_3602 = class_3603;
        } else {
            f4 = 0.0f;
            class_3602 = class_3603;
        }
        f15 = Math.max(f4, class_3602.d.h() ? class_1282.h() : 0.0f);
        if (class_3603.X.h()) {
            f3 = class_1283.h();
            class_360 = class_3603;
        } else {
            f3 = 0.0f;
            class_360 = class_3603;
        }
        float f16 = Math.max(f3, class_360.c.h() ? class_1284.h() : 0.0f);
        float f17 = f15 + f16 + (f15 > 0.0f && f16 > 0.0f ? 4.0f : 0.0f);
        float f18 = Math.max(f9, f17);
        float f19 = 8.0f + (f18 - f9) / 2.0f;
        float f20 = 8.0f + (f18 - f17) / 2.0f;
        f15 = f20 + f15 / 2.0f;
        f16 = f20 + f17 - f16 / 2.0f;
        f17 = 8.0f + f18 + 6.0f;
        f18 = (class_3603.aa.h() ? f17 + a : 8.0f + f18) + 8.0f;
        ArrayList<FeatureSupport_341> arrayList2 = arrayList = new ArrayList<FeatureSupport_341>(6);
        TargetHUD class_36012 = class_3603;
        TargetHUD class_36013 = class_3603;
        TargetHUD class_36014 = class_3603;
        ArrayList<FeatureSupport_341> arrayList3 = arrayList;
        TargetHUD class_36015 = class_3603;
        float f21 = f9;
        class_36015.L(arrayList, class_36015.Da, null, null, 11.0f, f19, f21, f21);
        RenderSupport_128 class_1286 = class_128;
        class_36014.L(arrayList3, class_36015.B, string2, class_1286, f10, f15 - class_1286.h() / 2.0f, f6, class_128.h());
        RenderSupport_128 class_1287 = class_1282;
        class_36013.L(arrayList3, class_36014.d, string3, class_1287, a42 - 11.0f - f12, f15 - class_1287.h() / 2.0f, f12, class_1282.h());
        RenderSupport_128 class_1288 = class_1283;
        class_36013.L(arrayList, class_36013.X, a522, class_1288, f10, f16 - class_1288.h() / 2.0f, f13, class_1283.h());
        RenderSupport_128 class_1289 = class_1284;
        class_36012.L(arrayList, class_36012.c, (String)a222, class_1289, f10 + f13, f16 - class_1289.h() / 2.0f, f14, class_1284.h());
        class_3603.L(arrayList2, class_36012.aa, null, null, 11.0f, f17, Math.max(0.0f, a42 - 22.0f), a);
        float a522 = f18;
        Iterator iterator = a = arrayList2.iterator();
        while (iterator.hasNext()) {
            a222 = (FeatureSupport_341)a.next();
            a522 = Math.max(a522, ((FeatureSupport_341)a222).i() + ((FeatureSupport_341)a222).d() + 8.0f);
            iterator = a;
        }
        return new FeatureSupport_356(a42, a522, arrayList, f7 / a2);
    }

    public void h() {
        TargetHUD a;
a.z = null;
        a.x = null;
        a.a = 0;
        a.A.L(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    private RenderSupport_128 L(FeatureSupport_375 class_375, RenderSupport_128 class_128) {
        void a22;
        RenderSupport_128 a = class_128;
        TargetHUD a3 = this;
RenderMode_130 enum_130 = (RenderMode_130)((Object)a22.f.L());
        float a22 = a22.l.L();
        if (a22 == 1.0f && enum_130 == a.L()) {
            return a;
        }
        return new RenderSupport_128(a.L(), enum_130, a.d() * a22, a.I() * a22);
    }

    private void L(float f2) {
        float a = f2;
        TargetHUD a2 = this;
TargetHUD class_360 = a2;
        class_360.s.L(0);
        if (class_360.x == a2.z) {
            if (a2.z != null && a2.s.d() < 1.0f) {
                a2.s.L(1.0f, 150.0f, RenderSupport_123.H);
            }
            return;
        }
        if (a2.x == null) {
            if (a2.A.L() && a2.A.L() <= 0.0f) {
                a2.z = null;
            }
            return;
        }
        if (a2.z == null || a2.A.L() <= 0.0f) {
            TargetHUD class_3602 = a2;
            class_3602.L(class_3602.x);
            class_3602.s.L(1.0f);
            return;
        }
        TargetHUD class_3603 = a2;
        if (a2.s.d() > 0.0f) {
            class_3603.s.L(0.0f, 100.0f, RenderSupport_123.h);
            return;
        }
        if (class_3603.s.L()) {
            TargetHUD class_3604 = a2;
            class_3604.L(class_3604.x);
            class_3604.s.L(0.0f).L(1.0f, 150.0f, RenderSupport_123.H);
        }
    }
}

