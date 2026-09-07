/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_331;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_099;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
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

public final class Keybinds
extends Module {
    private final static float N = 31.0f;
    public NumberSetting q;
    private boolean x;
    private final UiSupport_545 u;
    private final static float y = 100.0f;
    private final static float n = 1.0f;
    private float Y;
    private final static float r = 16.0f;
    private final static float W = 20.0f;
    private final Map<Module, FeatureSupport_331> P;
    private final static float V = 6.0f;
    private final static float R = 1.0f;
    private float p;
    private float t;
    public NumberSetting b;
    private final static float E = 12.0f;
    private final static int F = 3;
    public NumberSetting G;
    private final static float A = 6.0f;
    private final static float K = 4.0f;
    private final RenderSupport_184 B;
    private boolean C;
    private final static float J = 0.94f;
    private boolean D;
    private final RenderSupport_121 c;
    private final static float a = 10.0f;
    private float k;
    private final RenderSupport_121 g;
    private RenderSupport_182 M;
    private final static float L = 5.0f;
    private final RenderSupport_121 j;
    private final static float m = 5.0f;
    private final static float h = 20.0f;
    private long l;
    private float I;
    private final static float d = 5.0f;
    private final static float i = 100.0f;
    private final static float f = 3.0f;
    private final static String H = "keybinds";
    private float e;

    private float L() {
        Keybinds class_349 = this;
long l = System.nanoTime();
        float a = class_349.l == 0L ? 16.0f : Math.min((float)(l - class_349.l) / 1000000.0f, 100.0f);
        class_349.l = l;
        return 0;
    }

    public boolean L(double a, double a2) {
        Keybinds a3;
if (a >= (double)a3.k) {
            Keybinds class_349 = a3;
            if (a < (double)(class_349.k + class_349.I) && a2 >= (double)a3.p) {
                Keybinds class_3492 = a3;
                if (a2 < (double)(class_3492.p + class_3492.t)) {
                    return 3 >> 1;
                }
            }
        }
        return false;
    }

    @Override
    protected void L() {
        Keybinds a;
Keybinds class_349 = a;
        class_349.x = 0;
        class_349.l = 0L;
    }

    private static String L(String string) {
        String string2 = string;
String string3 = string2.trim().toUpperCase(Locale.ROOT);
        String[] a = string3.split("\\s+");
        if (a.length > 1) {
            int n;
            StringBuilder stringBuilder = new StringBuilder(a.length);
            int n2 = a.length;
            int n3 = 0;
            while (n3 < n2) {
                String string4 = a[0];
                if (!string4.isEmpty()) {
                    stringBuilder.append(string4.charAt(0));
                }
                n3 = ++n;
            }
            return stringBuilder.substring(0, Math.min(stringBuilder.length(), 3));
        }
        return string3.substring(0, Math.min(string3.length(), 3));
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        Keybinds class_349;
        int n;
        void a;
        void a2;
        void a3;
        boolean bl;
        float f4;
        boolean bl2;
        float f5;
        Keybinds class_3492 = this;
Keybinds class_3493 = class_3492;
        float f6 = class_3493.L();
        boolean bl3 = class_3493.d() && Keybinds.e.currentScreen instanceof GuiChat ? 3 >> 1 : false;
        Keybinds class_3494 = class_3492;
        boolean a2232 = class_3494.L(bl3, f6);
        RenderSupport_121 class_121 = class_3494.c;
        if (a2232) {
            f5 = 1.0f;
            bl2 = a2232;
        } else {
            f5 = 0.0f;
            bl2 = a2232;
        }
        if (bl2) {
            f4 = 300.0f;
            bl = a2232;
        } else {
            f4 = 200.0f;
            bl = a2232;
        }
        class_121.L(f5, f4, bl ? RenderSupport_123.H : RenderSupport_123.h);
        class_3492.c.L(f6);
        if (class_3492.P.isEmpty() && class_3492.c.L() && class_3492.c.L() <= 0.0f) {
            Keybinds class_3495 = class_3492;
            class_3492.h();
            class_3492.I = 0.0f;
            class_3495.t = 0.0f;
            class_3495.C = class_3492.h();
            return;
        }
        ThemeSupport_055 a2232 = ThemeSupport_059.L();
        Keybinds class_3496 = class_3492;
        class_3496.L((RenderSupport_103)a3, f6);
        float f7 = class_3496.b.L() * (0.94f + 0.060000002f * class_3492.c.L());
        class_3496.I = class_3496.j.L() * f7;
        class_3496.t = class_3496.g.L() * f7;
        void var8_10 = a2 - class_3492.I - 20.0f;
        void var9_11 = a - class_3492.t - 20.0f;
        class_3496.k = 10.0f + Keybinds.L(class_3492.G, (float)var8_10);
        class_3496.p = 10.0f + Keybinds.L(class_3492.q, (float)var9_11);
        Keybinds class_3497 = class_3492;
        Keybinds class_3498 = class_3492;
        RenderSupport_179.L(H, class_3497.k, class_3497.p, class_3498.I, class_3498.t);
        boolean bl4 = class_3496.L(bl3, (float)var8_10, (float)var9_11, (float)a2, (float)a);
        if (bl3 && bl4 && !class_3492.D) {
            float[] fArray = class_3492.B.L(--1 != 0);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                Keybinds class_3499 = class_3492;
                Keybinds.L(class_3499.G, Keybinds.L(class_3499.G, (float)var8_10) + fArray[0], (float)var8_10);
                Keybinds.L(class_3499.q, Keybinds.L(class_3492.q, (float)var9_11) + fArray[1], (float)var9_11);
            }
        } else {
            class_3492.B.L(3 >> 2);
        }
        class_3492.k = 10.0f + Keybinds.L(class_3492.G, (float)var8_10);
        class_3492.p = 10.0f + Keybinds.L(class_3492.q, (float)var9_11);
        UiSupport_545 class_545 = class_3492.u;
        if (bl3 && bl4) {
            n = 1;
            class_349 = class_3492;
        } else {
            n = 0;
            class_349 = class_3492;
        }
        class_545.L(f6, n != 0, class_349.D);
        if (class_3492.D) {
            RenderSupport_183.L((RenderSupport_103)a3, (float)a2, (float)a, class_3492.M);
        }
        RenderSupport_120.L();
        void v15 = a3;
        Keybinds class_34910 = class_3492;
        void v17 = a3;
        void v18 = a3;
        Keybinds class_34911 = class_3492;
        v18.L(class_34911.c.L());
        v18.F();
        v17.L(class_34911.k, class_3492.p + (1.0f - class_3492.c.L()) * 5.0f);
        v17.L(f7, 0.0f, 0.0f);
        class_34910.L((RenderSupport_103)v17, a2232);
        v15.k();
        v15.e();
        class_34910.h();
    }

    public boolean l() {
        Keybinds a;
return Keybinds.e.thePlayer != null && Keybinds.e.theWorld != null && (a.d() || a.x);
    }

    private static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }

    public Keybinds() {
        super("Keybinds", "Shows enabled modules with assigned keybinds", ModuleCategory.l);
        Keybinds a;
        Keybinds class_349 = a;
        a.b = new NumberSetting("Scale", 0.85, 0.5, 2.0, 0.05).d("x").L("Keybind list size");
        class_349.G = new NumberSetting("Position X", 6.78, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        a.q = new NumberSetting("Position Y", 18.79, 0.0, 100.0, 0.01).L(() -> {
return 5 >> 3;
        });
        Keybinds class_3492 = a;
        class_3492.P = new IdentityHashMap<Module, FeatureSupport_331>();
        class_3492.c = new RenderSupport_121(0.0f);
        class_3492.j = new RenderSupport_121(38.0f);
        class_3492.g = new RenderSupport_121(57.0f);
        class_3492.u = new UiSupport_545();
        class_3492.M = RenderSupport_183.f;
        class_3492.B = new RenderSupport_184();
    }

    @Override
    protected void D() {
        Keybinds a;
Keybinds class_349 = a;
        class_349.x = 1;
        class_349.D = 0;
    }

    private boolean h() {
return Mouse.isButtonDown(0);
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, float f2) {
        void a;
        Object a22;
        void a3;
        Keybinds class_349 = this;
float f3 = 29.0f + a3.L(ThemeSupport_057.M, "Keybinds");
        Object object = a22 = OnyxClient.l.L().iterator();
        while (object.hasNext()) {
            Module class_227 = (Module)a22.next();
            if (class_349.P.get(class_227) == null) {
                object = a22;
                continue;
            }
            float f4 = Math.min(a3.L(ThemeSupport_057.g, class_227.d()), 100.0f);
            f3 = Math.max(f3, 38.0f + f4);
            object = a22;
        }
        Keybinds class_3492 = class_349;
        int a22 = class_3492.P.size();
        float f5 = 37.0f + (float)Math.max(0, -1) * 4.0f;
        class_3492.j.L(f3, 300.0f, RenderSupport_123.l);
        class_349.g.L(f5, 300.0f, RenderSupport_123.l);
        Keybinds class_3493 = class_349;
        class_3493.j.L((float)a);
        class_3493.g.L((float)a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        Keybinds class_349 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)Keybinds.e.displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)Keybinds.e.displayHeight - 1.0f;
        Keybinds class_3492 = class_349;
        boolean bl2 = class_3492.h();
        boolean bl3 = class_3492.L(f6, (double)a4);
        if (a == false || !bl2) {
            v2 = class_349;
            class_349.D = 0;
            class_349.M = RenderSupport_183.f;
        } else {
            if (!class_349.C && bl3) {
                class_349.D = 1;
                class_349.Y = f6 - class_349.k;
                class_349.e = a4 - class_349.p;
            }
            v2 = class_349;
        }
        v2.C = bl2;
        if (class_349.D) {
            void a5;
            void a6;
            Keybinds class_3493 = class_349;
            Keybinds class_3494 = class_349;
            class_3493.M = RenderSupport_183.L(f6 - class_349.Y, (float)(a4 - class_3493.e), class_3494.I, class_3494.t, (float)a3, 0.0f, 10.0f, RenderSupport_179.L(H));
            Keybinds class_3495 = class_349;
            Keybinds.L(class_3493.G, class_3495.M.L() - 10.0f, (float)a6);
            Keybinds.L(class_3495.q, class_349.M.D() - 10.0f, (float)a5);
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055) {
        Iterator<Module> iterator;
        void a;
        void a2;
        Keybinds class_349 = this;
Keybinds class_3492 = class_349;
        float f2 = class_3492.j.L();
        float f3 = class_3492.g.L();
        int a222 = ThemeSupport_060.L(3, (ThemeSupport_055)a2);
        void v1 = a;
        void v2 = a;
        v2.d(0.0f, 0.0f, f2, f3, 12.0f, 3);
        RenderSupport_120.L((RenderSupport_103)v2, 0.0f, 0.0f, f2, f3, 12.0f, 0);
        float a222 = 14.0f;
        v1.L("\ue312", 12.0f, 0, 12.0f, a2.E());
        v1.l(ThemeSupport_057.M, "Keybinds", 23.0f, 0, a2.d());
        v1.i(6.0f, 25.0f, f2 - 12.0f, 1.0f, ThemeSupport_059.L(a2.P(), 0.7f));
        a222 = 31.0f;
        Iterator<Module> iterator2 = iterator = OnyxClient.l.L().iterator();
        while (iterator2.hasNext()) {
            Object object = iterator.next();
            FeatureSupport_331 class_331 = class_349.P.get(object);
            if (class_331 == null) {
                iterator2 = iterator;
                continue;
            }
            float f4 = class_331.H.L();
            void v4 = a;
            void v5 = a;
            void v6 = a;
            v6.L(f4);
            v6.F();
            v5.L((1.0f - f4) * 5.0f, 0.0f);
            v4.D(6.0f, 0, 20.0f, 20.0f, 4.0f, a2.G());
            v5.L(ThemeSupport_057.g, Keybinds.L(class_331.e), 16.0f, 10.0f, a2.D());
            object = v4.L(ThemeSupport_057.g, ((Module)object).d(), 100.0f);
            v4.l(ThemeSupport_057.g, (String)object, 32.0f, 10.0f, a2.d());
            v4.k();
            v4.e();
            a222 += 24.0f;
            iterator2 = iterator;
        }
        class_349.u.L((RenderSupport_103)a, 0.0f, 0.0f, f2, f3, 12.0f, a2.d());
        a.L(0.0f, 0.0f, f2, f3, 12.0f, 1.0f, a2.P());
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

    private void h() {
        Keybinds a;
if (a.d() || !a.P.isEmpty() || !a.c.L() || a.c.L() > 0.0f) {
            return;
        }
        Keybinds class_349 = a;
        a.x = 0;
        class_349.l = 0L;
        class_349.I = 0.0f;
        a.t = 0.0f;
        RenderSupport_179.L(H);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2) {
        Keybinds class_349 = this;
int n = 0;
        Iterator<Module> iterator = OnyxClient.l.L().iterator();
        block0: while (true) {
            Iterator<Module> iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a;
                boolean bl2;
                float f3;
                boolean bl3;
                float f4;
                void a2;
                Module a3 = iterator.next();
                if (a3 == class_349) continue block0;
                if (a3 == OnyxClient.l.k) {
                    iterator2 = iterator;
                    continue;
                }
                boolean bl4 = class_349.d() && a3.L().D() && (a2 != false || a3.d());
                FeatureSupport_331 class_331 = class_349.P.get(a3);
                if (bl4 && class_331 == null) {
                    class_331 = new FeatureSupport_331(a3.L().i());
                    class_349.P.put(a3, class_331);
                }
                if (class_331 == null) {
                    iterator2 = iterator;
                    continue;
                }
                if (a3.L().D()) {
                    class_331.e = a3.L().i();
                }
                RenderSupport_121 class_121 = class_331.H;
                if (bl4) {
                    f4 = 1.0f;
                    bl3 = bl4;
                } else {
                    f4 = 0.0f;
                    bl3 = bl4;
                }
                if (bl3) {
                    f3 = 150.0f;
                    bl2 = bl4;
                } else {
                    f3 = 100.0f;
                    bl2 = bl4;
                }
                class_121.L(f4, f3, bl2 ? RenderSupport_123.H : RenderSupport_123.h);
                class_331.H.L((float)a);
                if (bl4) {
                    n = 1;
                }
                if (bl4 || !class_331.H.L() || !(class_331.H.L() <= 0.0f)) continue block0;
                class_349.P.remove(a3);
                continue block0;
            }
            break;
        }
        return n != 0;
    }
}

