/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.block.BlockBed;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.util.BlockPos;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_333;
import openonyx.features.hud.Watermark;
import openonyx.features.hud.group_d.FeatureSupport_353;
import openonyx.features.hud.group_d.FeatureMode_354;
import openonyx.features.combat.BedBreaker;
import openonyx.features.player.Scaffold;
import openonyx.history.SettingValue;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.music.MusicSupport_075;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_v.RenderSupport_179;
import openonyx.render.group_v.RenderSupport_182;
import openonyx.render.group_v.RenderSupport_183;
import openonyx.render.group_v.RenderSupport_184;
import openonyx.render.internal.RenderSupport_174;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_545;
import openonyx.ui.internal.UiSupport_593;
import org.lwjgl.input.Mouse;

public final class Notifications
extends Module {
    private RenderSupport_182 U;
    private final static float X = 8.0f;
    private final static float w = 1.0f;
    final public NumberSetting z;
    private long v;
    private final static float s = 34.0f;
    private float Z;
    private final static int O = -9706613;
    final public BooleanSetting N;
    private final UiSupport_545 q;
    private String x;
    private final static float u = 2.0f;
    private final static String y = "notifications";
    private final static float n = 10.0f;
    private final static float Y = 240.0f;
    private final static float r = 4.5f;
    private float W;
    final public NumberSetting P;
    private final Set<Module> V;
    private final static float R = 10.0f;
    private final static float p = 130.0f;
    private BlockPos t;
    private boolean b;
    final public NumberSetting E;
    private final static float F = 14.0f;
    private final static float G = 100.0f;
    private boolean A;
    private float K;
    final public NumberSetting B;
    private final static float C = 9.0f;
    private final static int J = 3;
    final public BooleanSetting D;
    private final static float c = 5.5f;
    private float a;
    final public BooleanSetting k;
    private final RenderSupport_184 g;
    private float M;
    private boolean L;
    final public BooleanSetting j;
    private final static float m = 5.0f;
    final public NumberSetting h;
    final public BooleanSetting l;
    final public NumberSetting I;
    final public BooleanSetting d;
    private final static float i = 16.0f;
    private final List<FeatureSupport_333> f;
    private float H;
    private boolean e;

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        Notifications class_330;
        int n;
        void a52;
        void a2;
        void a3;
        Notifications class_3302 = this;
Notifications class_3303 = class_3302;
        float f4 = class_3303.L();
        boolean bl = class_3303.d() && Notifications.e.currentScreen instanceof GuiChat ? 3 >> 1 : false;
        Notifications class_3304 = class_3302;
        class_3304.H();
        class_3304.e();
        class_3304.L(f4);
        ArrayList<FeatureSupport_333> a4 = new ArrayList<FeatureSupport_333>(class_3302.f);
        if (a4.isEmpty() && bl) {
            a4.add(class_3302.L());
        }
        ThemeSupport_055 class_055 = ThemeSupport_059.L();
        Object object = a4;
        Notifications class_3305 = class_3302;
        float f5 = class_3305.P.L();
        float f6 = class_3305.L((RenderSupport_103)a3, (List<FeatureSupport_333>)a4);
        class_3305.K = f6 * f5;
        class_3302.Z = ((float)object.size() * 34.0f + (float)Math.max(0, a4.size() - 1) * 5.0f) * f5;
        if (object.isEmpty()) {
            RenderSupport_179.L(y);
            class_3302.A = class_3302.F();
            return;
        }
        void var10_13 = a2 - class_3302.K - 20.0f;
        void var11_14 = a52 - class_3302.Z - 20.0f;
        class_3302.a = 10.0f + Notifications.L(class_3302.I, (float)var10_13);
        class_3302.M = 10.0f + Notifications.L(class_3302.E, (float)var11_14);
        Notifications class_3306 = class_3302;
        Notifications class_3307 = class_3302;
        RenderSupport_179.L(y, class_3302.a, class_3306.M, class_3307.K, class_3307.Z);
        boolean bl2 = class_3306.L(bl, (float)var10_13, (float)var11_14, (float)a2, (float)a52);
        if (bl && bl2 && !class_3302.b) {
            float[] fArray = class_3302.g.L(--1 != 0);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                Notifications class_3308 = class_3302;
                Notifications.L(class_3308.I, Notifications.L(class_3308.I, (float)var10_13) + fArray[0], (float)var10_13);
                Notifications.L(class_3308.E, Notifications.L(class_3302.E, (float)var11_14) + fArray[1], (float)var11_14);
            }
        } else {
            class_3302.g.L(0 != 0);
        }
        class_3302.a = 10.0f + Notifications.L(class_3302.I, (float)var10_13);
        class_3302.M = 10.0f + Notifications.L(class_3302.E, (float)var11_14);
        UiSupport_545 class_545 = class_3302.q;
        if (bl && bl2) {
            n = 1;
            class_330 = class_3302;
        } else {
            n = 0;
            class_330 = class_3302;
        }
        class_545.L(f4, n != 0, class_330.b);
        if (class_3302.b) {
            RenderSupport_183.L((RenderSupport_103)a3, (float)a2, (float)a52, class_3302.U);
        }
        RenderSupport_120.L();
        int n2 = (Double)class_3302.E.L() > 50.0 ? 1 : 0;
        void v10 = a3;
        a3.F();
        v10.L(class_3302.a, class_3302.M);
        v10.L(f5, 0.0f, 0.0f);
        int n3 = 0;
        while (n3 < a4.size()) {
            FeatureSupport_333 a52 = (FeatureSupport_333)a4.get(0);
            int n4 = n2 != 0 ? a4.size() - 1 - 0 : 0;
            class_3302.L((RenderSupport_103)a3, class_055, a52, (float)n4 * 39.0f, f6);
            n3 = ++a2;
        }
        a3.k();
    }

    public boolean L(double a, double a2) {
        Notifications a3;
if (a >= (double)a3.a) {
            Notifications class_330 = a3;
            if (a < (double)(class_330.a + class_330.K) && a2 >= (double)a3.M) {
                Notifications class_3302 = a3;
                if (a2 < (double)(class_3302.M + class_3302.Z)) {
                    return 3 >> 1;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103, List<FeatureSupport_333> list) {
        Iterator a;
        Notifications class_330 = this;
float f2 = 130.0f;
        Iterator iterator = a = a.iterator();
        while (iterator.hasNext()) {
            void a2;
            FeatureSupport_333 class_333 = (FeatureSupport_333)a.next();
            float a3 = a2.L(ThemeSupport_057.M, class_333.f.d());
            if (class_330.D.d() && class_333.f.L() != null) {
                a3 = Math.max(a3, a2.L(ThemeSupport_057.h, class_333.f.L()));
            }
            f2 = Math.max(f2, 45.0f + a3);
            iterator = a;
        }
        return Math.min(f2, 240.0f);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        Notifications class_330 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)Notifications.e.displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)Notifications.e.displayHeight - 1.0f;
        Notifications class_3302 = class_330;
        boolean bl2 = class_3302.F();
        boolean bl3 = class_3302.L(f6, (double)a4);
        if (a == false || !bl2) {
            v2 = class_330;
            class_330.b = 0;
            class_330.U = RenderSupport_183.f;
        } else {
            if (!class_330.A && bl3) {
                class_330.b = 1;
                class_330.H = f6 - class_330.a;
                class_330.W = a4 - class_330.M;
            }
            v2 = class_330;
        }
        v2.A = bl2;
        if (class_330.b) {
            void a5;
            void a6;
            Notifications class_3303 = class_330;
            Notifications class_3304 = class_330;
            class_3303.U = RenderSupport_183.L(f6 - class_330.H, (float)(a4 - class_3303.W), class_3304.K, class_3304.Z, (float)a3, 0.0f, 10.0f, RenderSupport_179.L(y));
            Notifications class_3305 = class_330;
            Notifications.L(class_3303.I, class_3305.U.L() - 10.0f, (float)a6);
            Notifications.L(class_3305.E, class_330.U.D() - 10.0f, (float)a5);
        }
        return bl3;
    }

    private FeatureSupport_333 L() {
        Notifications a;
FeatureSupport_333 class_333 = new FeatureSupport_333(new FeatureSupport_353("Notifications", "Drag to move", FeatureMode_354.H), a.h.L() * 1000.0f);
        class_333.i.L(1.0f);
        return class_333;
    }

    private void H() {
        Notifications class_330 = this;
if (!class_330.l.d() || OnyxClient.l == null) {
            class_330.V.clear();
            class_330.e = 0;
            return;
        }
        Iterator<Module> iterator = OnyxClient.l.L().iterator();
        block0: while (true) {
            Iterator<Module> iterator2 = iterator;
            while (iterator2.hasNext()) {
                boolean bl;
                String string;
                Notifications class_3302;
                boolean bl2;
                Module a = iterator.next();
                if (a == class_330) continue block0;
                if (a == OnyxClient.l.k) {
                    iterator2 = iterator;
                    continue;
                }
                boolean bl3 = a.d();
                if (bl3 == (bl2 = class_330.V.contains(a))) {
                    iterator2 = iterator;
                    continue;
                }
                Notifications class_3303 = class_330;
                if (bl3) {
                    class_3303.V.add(a);
                    class_3302 = class_330;
                } else {
                    class_3303.V.remove(a);
                    class_3302 = class_330;
                }
                if (!class_3302.e) continue block0;
                String string2 = a.d();
                if (bl3) {
                    string = "Enabled";
                    bl = bl3;
                } else {
                    string = "Disabled";
                    bl = bl3;
                }
                class_330.L(new FeatureSupport_353(string2, string, bl ? FeatureMode_354.I : FeatureMode_354.H));
                continue block0;
            }
            break;
        }
        class_330.e = 1;
    }

    private void e() {
        Notifications a;
if (OnyxClient.l == null) {
            return;
        }
        Notifications class_330 = a;
        class_330.F();
        class_330.h();
        class_330.l();
    }

    private void k() {
        Notifications a;
Notifications class_330 = a;
        a.L = 0;
        class_330.t = null;
        class_330.x = "";
    }

    private static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }

    public static void L(String string, FeatureMode_354 enum_354) {
        FeatureMode_354 a = enum_354;
        String a2 = string;
Notifications.L(a2, null, a);
    }

    private void F() {
        int n;
        Notifications class_330 = this;
Module a22 = OnyxClient.l.n;
        if (!class_330.k.d() || a22 == null || !a22.d()) {
            class_330.L = 0;
            return;
        }
        int a22 = ((Scaffold)a22).L();
        int n2 = n = 0 <= class_330.z.d() ? 1 : 0;
        if (0 != 0 && !class_330.L) {
            int n3;
            String string;
            String string2 = "Scaffold";
            if (0 <= 0) {
                string = "Out of blocks";
                n3 = 0;
            } else {
                string = 0 + " blocks left";
                n3 = 0;
            }
            class_330.L(new FeatureSupport_353(string2, string, n3 <= 0 ? FeatureMode_354.i : FeatureMode_354.e));
        }
        class_330.L = 0;
    }

    private void l() {
        Notifications class_330 = this;
Object a = OnyxClient.l.q;
        if (!class_330.d.d() || a == null) {
            class_330.x = "";
            return;
        }
        if ((a = ((Watermark)a).L()) == null || ((MusicSupport_075)a).d() == null || ((MusicSupport_075)a).d().isEmpty()) {
            class_330.x = "";
            return;
        }
        if (((MusicSupport_075)a).d().equals(class_330.x)) {
            return;
        }
        class_330.x = ((MusicSupport_075)a).d();
        Notifications class_3302 = class_330;
        class_330.L(new FeatureSupport_353(((MusicSupport_075)a).d(), ((MusicSupport_075)a).L() == null || ((MusicSupport_075)a).L().isEmpty() ? "Now playing" : ((MusicSupport_075)a).L(), FeatureMode_354.H));
    }

    public Notifications() {
        super("Notifications", "Popups for module toggles and client events", ModuleCategory.l);
        Notifications a;
        Notifications class_330 = a;
        a.P = new NumberSetting("Scale", 0.85, 0.5, 2.0, 0.05).d("x").L("Popup size");
        class_330.h = new NumberSetting("Hold", 3.0, 0.5, 10.0, 0.1).d("s").L("How long each popup stays up");
        a.B = new NumberSetting("Max stack", 5.0, 1.0, 10.0, 1.0).L("How many popups can be on screen at once");
        a.l = new BooleanSetting("Module toggles", 5 >> 2).L("Announce modules turning on and off");
        a.k = new BooleanSetting("Scaffold blocks", --1 != 0).L("Warn when Scaffold is running low on blocks");
        a.z = ((NumberSetting)new NumberSetting("Low blocks", 32.0, 1.0, 128.0, 1.0).L("Count at which the warning goes up")).L((SettingValue)a.k);
        a.j = new BooleanSetting("Bed breaker", --1 != 0).L("Announce when BedBreaker takes a bed down");
        a.d = new BooleanSetting("Now playing", 1 != 0).L("Announce whatever the system starts playing");
        a.N = new BooleanSetting("Progress bar", 3 >> 1).L("Show the time each popup has left");
        a.D = new BooleanSetting("Subtitle", --1 != 0).L("Show the second line of each popup");
        a.I = new NumberSetting("Position X", 82.0, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        a.E = new NumberSetting("Position Y", 8.0, 0.0, 100.0, 0.01).L(() -> {
return 5 >> 3;
        });
        Notifications class_3302 = a;
        Notifications class_3303 = a;
        class_3303.f = new ArrayList<FeatureSupport_333>();
        class_3302.x = "";
        class_3303.V = Collections.newSetFromMap(new IdentityHashMap());
        class_3302.q = new UiSupport_545();
        class_3302.g = new RenderSupport_184();
        class_3302.U = RenderSupport_183.f;
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
    public static void L(String string, String string2, FeatureMode_354 enum_354) {
        void a;
        void a2;
        String string3 = string;
if (OnyxClient.l == null) {
            return;
        }
        Notifications a3 = OnyxClient.l.l;
        if (a3 == null || !a3.d()) {
            return;
        }
        a3.L(new FeatureSupport_353(string3, (String)a2, (FeatureMode_354)a));
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, FeatureSupport_333 class_333, float f2, float f3) {
        Notifications class_330;
        void a;
        float a2;
        void a3;
        void a4;
        float f4;
        FeatureSupport_333 a52 = class_333;
        Notifications a6 = this;
float f5 = a52.i.L();
        if (f4 <= 0.001f) {
            return;
        }
        Object object = a52;
        int n = a52.f.L() != null ? ((FeatureSupport_333)object).f.L().intValue() : ((FeatureSupport_333)object).f.L().L((ThemeSupport_055)a4);
        int n2 = ThemeSupport_060.L(3, (ThemeSupport_055)a4);
        void v2 = a3;
        void v3 = a3;
        void v4 = a3;
        v4.L(f5);
        v4.F();
        v3.L((1.0f - f5) * 14.0f, 0);
        v3.d(0.0f, 0.0f, (float)a, 34.0f, 12.0f, 3);
        RenderSupport_120.L((RenderSupport_103)v2, 0.0f, 0.0f, (float)a, 34.0f, 12.0f, n2);
        v2.L(a52.f.L().d(), 18.0f, 17.0f, 16.0f, n);
        a2 = 35.0f;
        f5 = a - 0 - 10.0f;
        n2 = a6.D.d() && a52.f.L() != null ? 1 : 0;
        String string = a3.L(ThemeSupport_057.M, a52.f.d(), f5);
        void v5 = a3;
        if (n2 != 0) {
            v5.l(ThemeSupport_057.M, string, 0, 11.5f, a4.d());
            class_330 = a6;
            void v7 = a3;
            v7.l(ThemeSupport_057.h, v7.L(ThemeSupport_057.h, a52.f.L(), f5), 0, 21.5f, a4.F());
        } else {
            v5.l(ThemeSupport_057.M, string, 0, 17.0f, a4.d());
            class_330 = a6;
        }
        if (class_330.N.d() && a52.e > 0.0f) {
            FeatureSupport_333 class_3332 = a52;
            float a52 = Math.clamp(class_3332.H / class_3332.e, 0.0f, 1.0f);
            a3.D(10.0f, 29.0f, (float)((a - 20.0f) * a52), 2.0f, Float.MAX_VALUE, ThemeSupport_059.L(n, 0.85f));
        }
        a6.q.L((RenderSupport_103)a3, 0.0f, 0.0f, (float)a, 34.0f, 12.0f, a4.d());
        void v9 = a3;
        v9.L(0.0f, 0.0f, (float)a, 34.0f, 12.0f, 1.0f, a4.P());
        v9.k();
        v9.e();
    }

    private void h() {
        Notifications class_330 = this;
Object a = OnyxClient.l.H;
        if (!class_330.j.d() || a == null || !((Module)a).d() || Notifications.e.theWorld == null) {
            class_330.t = null;
            return;
        }
        if ((a = ((BedBreaker)a).d()) != null) {
            class_330.t = a;
            return;
        }
        if (class_330.t != null && !(Notifications.e.theWorld.getBlockState(class_330.t).getBlock() instanceof BlockBed)) {
            class_330.L(new FeatureSupport_353("BedBreaker", "Bed broken", FeatureMode_354.I, -9706613));
        }
        class_330.t = null;
    }

    private boolean F() {
return Mouse.isButtonDown(0);
    }

    private float L() {
        Notifications class_330 = this;
long l = System.nanoTime();
        float a = class_330.v == 0L ? 16.0f : Math.min((float)(l - class_330.v) / 1000000.0f, 100.0f);
        class_330.v = l;
        return 0;
    }

    @Override
    protected void L() {
        Notifications a;
Notifications class_330 = a;
        class_330.e = 0;
        class_330.v = 0L;
    }

    public boolean l() {
        Notifications a;
if (Notifications.e.thePlayer != null && Notifications.e.theWorld != null && a.d()) {
            return 1 != 0;
        }
        return false;
    }

    @Override
    protected void D() {
        Notifications a;
Notifications class_330 = a;
        Notifications class_3302 = a;
        class_3302.f.clear();
        class_3302.V.clear();
        class_3302.k();
        class_330.e = 0;
        class_330.b = 0;
        RenderSupport_179.L(y);
    }

    private void L(FeatureSupport_353 class_353) {
        FeatureSupport_353 a = class_353;
        Notifications a2 = this;
Notifications class_330 = a2;
        Notifications class_3302 = class_330;
        class_330.f.add(new FeatureSupport_333(a, a2.h.L() * 1000.0f));
        while (class_3302.f.size() > a2.B.d()) {
            Notifications class_3303 = a2;
            class_3302 = class_3303;
            class_3303.f.remove(0);
        }
    }

    private void L(float f2) {
        float a = f2;
        Notifications a2 = this;
a2.f.removeIf(class_333 -> {
            int n;
            float f3;
            int n2;
            float f4;
            void a;
            float f5 = 0;
void v0 = a;
            v0.H -= f5;
            int a2 = v0.H <= 0.0f ? 1 : 0;
            RenderSupport_121 class_121 = a.i;
            if (4.0f != 0) {
                f4 = 0.0f;
                n2 = 4.0f;
            } else {
                f4 = 1.0f;
                n2 = 4.0f;
            }
            if (n2 != 0) {
                f3 = 200.0f;
                n = 4.0f;
            } else {
                f3 = 300.0f;
                n = 4.0f;
            }
            class_121.L(f4, f3, n != 0 ? RenderSupport_123.h : RenderSupport_123.H);
            a.i.L(f5);
            if (4.0f != 0 && a.i.L() && a.i.L() <= 0.0f) {
                return 1 != 0;
            }
            return false;
        });
    }
}

