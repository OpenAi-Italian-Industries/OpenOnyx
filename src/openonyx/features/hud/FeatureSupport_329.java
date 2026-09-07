/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.network.Packet;
import openonyx.configuration.Event;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.hud.FeatureSupport_336;
import openonyx.features.hud.Watermark;
import openonyx.features.hud.FeatureSupport_359;
import openonyx.features.hud.FeatureSupport_363;
import openonyx.features.hud.FeatureMode_339;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.history.internal.NumberSetting;
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
import openonyx.ui.UiSupport_546;
import org.lwjgl.input.Mouse;

public final class FeatureSupport_329
implements OnyxListener_001 {
    private final UiSupport_545 X;
    private float w;
    private final RenderSupport_184 z;
    private final List<RenderSupport_121> v;
    private float s;
    private final RenderSupport_121 Z;
    private boolean O;
    private float N;
    private boolean q;
    private final static float x = 1.0f;
    private final static float u = 7.0f;
    private final static float y = 250.0f;
    private float n;
    private RenderSupport_182 Y;
    private boolean r;
    private final static float W = 100.0f;
    private final static float P = 10.0f;
    private final static float V = 22.0f;
    private float[] R;
    private final static float p = 3.0f;
    private final static float t = 10.0f;
    private final static int b = 3;
    private final static float E = 8.0f;
    private float F;
    private final static float G = 28.0f;
    private final static String A = "stats-island";
    private float[] K;
    private float B;
    private final static float C = 96.0f;
    private final static float J = 5.0f;
    private int D;
    private float c;
    private final List<FeatureSupport_336> a;
    private final FeatureSupport_359 k;
    private boolean g;
    private boolean M;
    private long L;
    private final FeatureSupport_363 j;
    private final RenderSupport_121 m;
    private final static float h = 0.94f;
    private int l;
    private final static float I = 3.0f;
    private boolean d;
    private float i;
    private final Watermark f;
    private final static float H = 1.0f;
    private float e;

    private String L() {
        FeatureSupport_329 class_329 = this;
ServerData a = e.getCurrentServerData();
        if (a != null) {
            return a.serverIP;
        }
        if (e.isSingleplayer()) {
            return "Singleplayer";
        }
        return "Local";
    }

    public FeatureSupport_329(Watermark class_340) {
        FeatureSupport_329 a;
        OnyxListener_001 a2 = class_340;
        FeatureSupport_329 class_329 = a = this;
        FeatureSupport_329 class_3292 = a;
        int n = 0;
        FeatureSupport_329 class_3293 = a;
        FeatureSupport_329 class_3294 = a;
        a.k = new FeatureSupport_359();
        class_3294.Z = new RenderSupport_121(0.0f);
        a.m = new RenderSupport_121(28.0f);
        a.X = new UiSupport_545();
        class_3293.a = new ArrayList<FeatureSupport_336>();
        class_3293.v = new ArrayList<RenderSupport_121>();
        class_3293.K = new float[n];
        class_3292.R = new float[n];
        class_3292.D = -1;
        class_3292.Y = RenderSupport_183.f;
        class_329.z = new RenderSupport_184();
        class_329.f = a2;
        class_329.j = new FeatureSupport_363((Watermark)a2);
    }

    public boolean D() {
        FeatureSupport_329 a;
return FeatureSupport_329.e.thePlayer != null && FeatureSupport_329.e.theWorld != null && (a.L() || a.Z.L() > 0.0f || !a.Z.L());
    }

    private void i() {
        FeatureSupport_329 a;
if (a.D >= 0) {
            FeatureSupport_329 class_329 = a;
            if (class_329.l != class_329.D) {
                FeatureSupport_329 class_3292 = a;
                a.f.A.L(class_3292.D, class_3292.l);
            }
        }
        a.D = -1;
    }

    private List<Integer> L() {
        int a;
        FeatureSupport_329 class_329 = this;
ArrayList<Integer> arrayList = new ArrayList<Integer>(class_329.a.size());
        int n = 0;
        while (n < class_329.a.size()) {
            if (0 != class_329.D) {
                arrayList.add(0);
            }
            n = ++a;
        }
        ArrayList<Integer> arrayList2 = arrayList;
        arrayList2.add(Math.clamp((long)class_329.l, 0, arrayList.size()), class_329.D);
        return arrayList2;
    }

    public boolean L(double a, double a2) {
        FeatureSupport_329 a3;
if (a >= (double)a3.F) {
            FeatureSupport_329 class_329 = a3;
            if (a < (double)(class_329.F + class_329.N) && a2 >= (double)a3.i) {
                FeatureSupport_329 class_3292 = a3;
                if (a2 < (double)(class_3292.i + class_3292.e)) {
                    return --1 != 0;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103) {
        int a;
        FeatureSupport_329 class_329 = this;
FeatureSupport_329 class_3292 = class_329;
        class_3292.d();
        int n = class_3292.a.size();
        if (class_3292.K.length != 0) {
            FeatureSupport_329 class_3293 = class_329;
            class_3293.K = new float[0];
            class_3293.R = new float[0];
        }
        float f2 = 8.0f;
        int n2 = 0;
        while (n2 < 0) {
            void a2;
            if (0 > 0) {
                f2 += 7.0f;
            }
            FeatureSupport_329 class_3294 = class_329;
            class_3294.K[0] = f2;
            FeatureSupport_329 class_3295 = class_329;
            class_3294.R[0] = class_3295.L((RenderSupport_103)a2, class_3295.a.get(0));
            f2 += class_329.R[a++];
            n2 = 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, float f2) {
        float f3;
        int a5;
        void a2;
        void a3;
        void a4;
        FeatureSupport_329 class_329 = this;
int n = ThemeSupport_060.L(3, (ThemeSupport_055)a4);
        void v0 = a3;
        v0.d(0.0f, 0.0f, (float)a2, 22.0f, Float.MAX_VALUE, 3);
        RenderSupport_120.L((RenderSupport_103)v0, 0.0f, 0.0f, (float)a2, 22.0f, Float.MAX_VALUE, n);
        float f4 = 11.0f;
        int n2 = 0;
        while (n2 < class_329.a.size()) {
            if (0 != class_329.D) {
                f3 = class_329.v.get(0).L();
                if (0 > 0 && 0 != class_329.D) {
                    a3.L(class_329.K[0] - 3.5f + f3, f4, 1.0f, a4.P());
                }
                int n3 = 0;
                class_329.L((RenderSupport_103)a3, (ThemeSupport_055)a4, n3, class_329.K[n3] + f3, f4, 1.0f);
            }
            n2 = ++a5;
        }
        if (class_329.D >= 0) {
            FeatureSupport_329 class_3292 = class_329;
            if (class_3292.D < class_3292.R.length) {
                FeatureSupport_329 class_3293 = class_329;
                float a5 = class_3293.R[class_329.D];
                f3 = Math.clamp(class_3293.B - class_329.w, 0.0f, Math.max(0.0f, (float)(a2 - a5)));
                a3.D(f3 - 4.0f, 2.0f, a5 + 8.0f, 18.0f, 8.0f, ThemeSupport_059.L(a4.G(), 0.92f));
                class_3293.L((RenderSupport_103)a3, (ThemeSupport_055)a4, class_329.D, f3, f4, 1.0f);
            }
        }
        class_329.X.L((RenderSupport_103)a3, 0.0f, 0.0f, (float)a2, 22.0f, Float.MAX_VALUE, a4.d());
        a3.L(0.0f, 0.0f, (float)a2, 22.0f, Float.MAX_VALUE, 1.0f, a4.P());
    }

    private static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }

    private void D() {
        int n;
        FeatureSupport_329 class_329 = this;
if (class_329.D < 0) {
            for (RenderSupport_121 a : class_329.v) {
                if (a.d() == 0.0f) continue;
                a.L(0.0f, 100.0f, RenderSupport_123.l);
            }
            return;
        }
        List<Integer> list = class_329.L();
        float a = 8.0f;
        int n2 = 0;
        while (n2 < list.size()) {
            int n3 = list.get(0);
            if (0 > 0) {
                a += 7.0f;
            }
            if (n3 != class_329.D) {
                float f2 = a - class_329.K[n3];
                RenderSupport_121 class_121 = class_329.v.get(n3);
                if (class_121.d() != f2) {
                    class_121.L(f2, 100.0f, RenderSupport_123.l);
                }
            }
            a += class_329.R[n3];
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103, FeatureSupport_336 class_336) {
        void a;
        void a2;
        FeatureSupport_329 class_329 = this;
void v0 = a2;
        float a3 = Math.min(a.L(ThemeSupport_057.M, v0.L()), 96.0f);
        a3 = 13.0f + a3;
        if (!v0.d().isEmpty()) {
            a3 += 3.0f + a.L(ThemeSupport_057.g, a2.d());
        }
        return a3;
    }

    private boolean d() {
return Mouse.isButtonDown(0);
    }

    public void L(Packet<?> packet) {
        Packet<?> a = packet;
        FeatureSupport_329 a2 = this;
a2.k.L();
    }

    private void d() {
        FeatureSupport_329 a;
FeatureSupport_329 class_329 = a;
        while (class_329.v.size() < a.a.size()) {
            FeatureSupport_329 class_3292 = a;
            class_329 = class_3292;
            class_3292.v.add(new RenderSupport_121(0.0f));
        }
        FeatureSupport_329 class_3293 = a;
        while (class_3293.v.size() > a.a.size()) {
            FeatureSupport_329 class_3294 = a;
            class_3293 = class_3294;
            a.v.remove(class_3294.v.size() - 1);
        }
    }

    private int L() {
        FeatureSupport_329 class_329 = this;
if (e.getNetHandler() == null || FeatureSupport_329.e.thePlayer == null) {
            return 0;
        }
        NetworkPlayerInfo a = e.getNetHandler().getPlayerInfo(FeatureSupport_329.e.thePlayer.getUniqueID());
        if (a == null) {
            return 0;
        }
        return Math.max(0, a.getResponseTime());
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        Iterator<RenderSupport_121> a2;
        FeatureSupport_329 class_329;
        int a2;
        void a3;
        void a4;
        float a5;
        float f6 = f4;
        FeatureSupport_329 a6 = this;
a5 = (float)Minecraft.getScaledMouseX() * 0 / (float)FeatureSupport_329.e.displayWidth;
        void v0 = a4;
        a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)FeatureSupport_329.e.displayHeight - 1.0f;
        boolean bl2 = a6.d();
        a5 = (0 - a6.F) / a3;
        a3 = (a4 - a6.i) / a3;
        if (a2 == 0 || !bl2) {
            if (a6.D >= 0) {
                a6.i();
            }
            class_329 = a6;
            FeatureSupport_329 class_3292 = a6;
            class_3292.O = bl2;
            class_3292.d = 0;
        } else {
            if (!a6.O) {
                a2 = a6.L((float)0, 0.0f);
                int n = a6.d = a2 >= 0 ? 1 : 0;
                if (a6.d) {
                    FeatureSupport_329 class_3293 = a6;
                    a6.D = a2;
                    class_3293.w = 0 - a6.K[a2];
                    class_3293.l = a2;
                }
            }
            FeatureSupport_329 class_3294 = a6;
            class_3294.O = bl2;
            class_3294.B = 0;
            if (a6.D >= 0) {
                a6.l = a6.L(0);
            }
            class_329 = a6;
        }
        class_329.D();
        Iterator<RenderSupport_121> iterator = a2 = a6.v.iterator();
        while (iterator.hasNext()) {
            void a7;
            a2.next().L((float)a7);
            iterator = a2;
        }
        return a6.d;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, int n, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a222;
        float f5 = f2;
        FeatureSupport_329 a6 = this;
FeatureSupport_336 a222 = a6.a.get((int)a222);
        void v0 = a5;
        UiSupport_546.L((RenderSupport_103)v0, a222.L(), (float)(a4 + 5.0f), (float)a3, 10.0f, ThemeSupport_059.L(a2.F(), (float)a));
        String string = v0.L(ThemeSupport_057.M, a222.L(), 96.0f);
        v0.l(ThemeSupport_057.M, string, (float)(a4 += 13.0f), (float)a3, ThemeSupport_059.L(a2.d(), (float)a));
        a4 += a5.L(ThemeSupport_057.M, string);
        if (a222.d().isEmpty()) {
            return;
        }
        a5.l(ThemeSupport_057.g, a222.d(), (float)(a4 += 3.0f), (float)a3, ThemeSupport_059.L(a2.F(), (float)a));
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        FeatureSupport_329 class_329;
        int n;
        void a;
        void a2;
        void a3;
        boolean bl;
        float f4;
        boolean bl2;
        float f5;
        FeatureSupport_329 class_3292 = this;
FeatureSupport_329 class_3293 = class_3292;
        float f6 = class_3293.L();
        boolean bl3 = class_3293.f.d() && FeatureSupport_329.e.currentScreen instanceof GuiChat ? --1 != 0 : false;
        FeatureSupport_329 class_3294 = class_3292;
        boolean a2232 = class_3294.L();
        class_3294.L(f6, a2232);
        RenderSupport_121 class_121 = class_3294.Z;
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
        class_3292.Z.L(f6);
        if (!a2232 && class_3292.Z.L() && class_3292.Z.L() <= 0.0f) {
            class_3292.N = 0.0f;
            class_3292.e = 0.0f;
            class_3292.q = class_3292.d();
            class_3292.j.L();
            RenderSupport_179.L(A);
            return;
        }
        RenderSupport_120.L();
        ThemeSupport_055 a2232 = ThemeSupport_059.L();
        class_3292.m.L(Math.max(28.0f, class_3292.L((RenderSupport_103)a3)), 200.0f, RenderSupport_123.l);
        FeatureSupport_329 class_3295 = class_3292;
        FeatureSupport_329 class_3296 = class_3292;
        class_3296.m.L(f6);
        float f7 = class_3296.f.s.L() * (0.94f + 0.060000002f * class_3292.Z.L());
        float f8 = class_3296.m.L();
        class_3296.N = f8 * f7;
        class_3296.e = 22.0f * f7;
        void var9_11 = a2 - class_3292.N - 20.0f;
        void var10_12 = a - class_3292.e - 20.0f;
        class_3296.F = 10.0f + FeatureSupport_329.L(class_3292.f.Qa, (float)var9_11);
        class_3295.i = 10.0f + FeatureSupport_329.L(class_3292.f.H, (float)var10_12);
        FeatureSupport_329 class_3297 = class_3292;
        FeatureSupport_329 class_3298 = class_3292;
        RenderSupport_179.L(A, class_3297.F, class_3297.i, class_3298.N, class_3298.e);
        class_3295.L((RenderSupport_103)a3, bl3, f6, (float)a2, (float)a);
        int n2 = class_3295.j.d();
        boolean bl4 = n2 != 0 ? 5 >> 3 : (boolean)class_3292.L(bl3, f7, f6, (float)a2, (float)a);
        int n3 = n2 = n2 != 0 ? 0 : (int)(class_3292.L(bl3, bl4, (float)var9_11, (float)var10_12, (float)a2, (float)a) ? 1 : 0);
        if (bl3 && n2 != 0 && !class_3292.g && class_3292.D < 0) {
            float[] fArray = class_3292.z.L(--1 != 0);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                FeatureSupport_329 class_3299 = class_3292;
                FeatureSupport_329.L(class_3299.f.Qa, FeatureSupport_329.L(class_3292.f.Qa, (float)var9_11) + fArray[0], (float)var9_11);
                FeatureSupport_329.L(class_3299.f.H, FeatureSupport_329.L(class_3292.f.H, (float)var10_12) + fArray[1], (float)var10_12);
            }
        } else {
            class_3292.z.L(3 >> 2);
        }
        class_3292.F = 10.0f + FeatureSupport_329.L(class_3292.f.Qa, (float)var9_11);
        class_3292.i = 10.0f + FeatureSupport_329.L(class_3292.f.H, (float)var10_12);
        UiSupport_545 class_545 = class_3292.X;
        if (bl3 && n2 != 0) {
            n = 1;
            class_329 = class_3292;
        } else {
            n = 0;
            class_329 = class_3292;
        }
        class_545.L(f6, n != 0, class_329.g);
        if (class_3292.g) {
            RenderSupport_183.L((RenderSupport_103)a3, (float)a2, (float)a, class_3292.Y);
        }
        void v16 = a3;
        void v17 = a3;
        v17.L(class_3292.Z.L());
        v17.F();
        v17.L(class_3292.F, class_3292.i + (1.0f - class_3292.Z.L()) * 5.0f);
        v16.L(f7, 0.0f, 0.0f);
        class_3292.L((RenderSupport_103)v16, a2232, f8);
        v16.k();
        a3.e();
        if (class_3292.j.L()) {
            class_3292.j.L((RenderSupport_103)a3, a2232);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, boolean bl2, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        FeatureSupport_329 class_329 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)FeatureSupport_329.e.displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)FeatureSupport_329.e.displayHeight - 1.0f;
        FeatureSupport_329 class_3292 = class_329;
        boolean bl3 = class_3292.d();
        boolean bl4 = class_3292.L((double)f6, (double)a4);
        if (a == false || !bl3) {
            v2 = class_329;
            class_329.g = 0;
            class_329.Y = RenderSupport_183.f;
        } else {
            void a5;
            if (!class_329.q && bl4 && a5 == false) {
                class_329.g = 1;
                class_329.c = f6 - class_329.F;
                class_329.s = a4 - class_329.i;
            }
            v2 = class_329;
        }
        v2.q = bl3;
        if (class_329.g) {
            void a6;
            void a7;
            FeatureSupport_329 class_3293 = class_329;
            FeatureSupport_329 class_3294 = class_329;
            class_3293.Y = RenderSupport_183.L(f6 - class_329.c, (float)(a4 - class_3293.s), class_3294.N, class_3294.e, (float)a3, (float)a2, 10.0f, RenderSupport_179.L(A));
            FeatureSupport_329 class_3295 = class_329;
            FeatureSupport_329.L(class_3293.f.Qa, class_3295.Y.L() - 10.0f, (float)a7);
            FeatureSupport_329.L(class_3295.f.H, class_329.Y.D() - 10.0f, (float)a6);
        }
        return bl4;
    }

    /*
     * WARNING - void declaration
     */
    private int L(float f2, float f3) {
        float a = f3;
        FeatureSupport_329 a2 = this;
if (0 < 0.0f || 0 >= 22.0f) {
            return -1;
        }
        int n = 0;
        while (n < a2.a.size()) {
            void a3;
            if (a3 >= a2.K[0] && a3 < a2.K[0] + a2.R[0]) {
                return 0;
            }
            n = ++a;
        }
        return -1;
    }

    private float L(RenderSupport_103 class_103) {
        OnyxListener_001 a22 = class_103;
        FeatureSupport_329 a = this;
FeatureSupport_329 class_329 = a;
        class_329.L((RenderSupport_103)a22);
        if (class_329.a.isEmpty()) {
            return 16.0f;
        }
        FeatureSupport_329 class_3292 = a;
        int a22 = class_3292.a.size() - 1;
        return class_3292.K[0] + a.R[0] + 8.0f;
    }

    private boolean L() {
        FeatureSupport_329 a;
if (a.f.d() && !a.f.A.d()) {
            return --1 != 0;
        }
        return false;
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

    public void L() {
        FeatureSupport_329 a;
FeatureSupport_329 class_329 = a;
        FeatureSupport_329 class_3292 = a;
        FeatureSupport_329 class_3293 = a;
        FeatureSupport_329 class_3294 = a;
        FeatureSupport_329 class_3295 = a;
        class_3295.a.clear();
        class_3295.v.clear();
        class_3294.D = -1;
        class_3293.d = class_3294.O = 0;
        class_3293.g = 0;
        class_3292.n = 0.0f;
        class_3292.L = 0L;
        class_329.k.D();
        class_329.j.L();
        RenderSupport_179.L(A);
    }

    private float L() {
        FeatureSupport_329 class_329 = this;
long l = System.nanoTime();
        float a = class_329.L == 0L ? 16.0f : Math.min((float)(l - class_329.L) / 1000000.0f, 100.0f);
        class_329.L = l;
        return 0;
    }

    private FeatureSupport_336 L(FeatureMode_339 enum_339) {
        FeatureMode_339 a = enum_339;
        FeatureSupport_329 a2 = this;
switch (a) {
            default: {
                throw new MatchException(null, null);
            }
            case I: {
                return new FeatureSupport_336(a, String.valueOf(Minecraft.getDebugFPS()), "fps");
            }
            case f: {
                return new FeatureSupport_336(a, OnyxClient.L(), "");
            }
            case i: {
                return new FeatureSupport_336(a, String.valueOf(a2.L()), "ms");
            }
            case l: {
                return new FeatureSupport_336(a, String.valueOf(a2.k.L()), "% loss");
            }
            case d: 
        }
        return new FeatureSupport_336(a, a2.L(), "");
    }

    /*
     * WARNING - void declaration
     */
    private int L(float f2) {
        int a;
        FeatureSupport_329 class_329 = this;
int n = 0;
        int n2 = 0;
        while (n2 < class_329.a.size()) {
            float f3;
            void a2;
            if (0 != class_329.D && a2 > (f3 = class_329.K[0] + class_329.R[0] / 2.0f)) {
                ++n;
            }
            n2 = ++a;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, boolean bl, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        void a4;
        FeatureSupport_329 class_329 = this;
float f5 = (float)Minecraft.getScaledMouseX() * a4 / (float)FeatureSupport_329.e.displayWidth;
        void v0 = a3;
        void a5 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)FeatureSupport_329.e.displayHeight - 1.0f;
        boolean bl2 = Mouse.isButtonDown(1);
        boolean bl3 = class_329.d();
        if (a2 == false) {
            FeatureSupport_329 class_3292 = class_329;
            v2 = class_3292;
            class_3292.j.L();
        } else if (bl2 && !class_329.r && class_329.L((double)f5, 0.0)) {
            void a6;
            FeatureSupport_329 class_3293 = class_329;
            v2 = class_3293;
            class_3293.j.L((RenderSupport_103)a6, f5, 0.0f, (float)a4, (float)a3);
        } else {
            if (bl3 && !class_329.M && class_329.j.d() && !class_329.j.L(f5, 0.0f)) {
                class_329.j.L();
            }
            v2 = class_329;
        }
        v2.r = bl2;
        class_329.M = bl3;
        class_329.j.L((float)a, f5, 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, boolean bl) {
        void a;
        boolean a22 = bl;
        FeatureSupport_329 a3 = this;
FeatureSupport_329 class_329 = a3;
        class_329.k.d();
        class_329.n -= a;
        if (!a22 || a3.n > 0.0f && !a3.a.isEmpty()) {
            return;
        }
        if (a3.D >= 0) {
            return;
        }
        FeatureSupport_329 class_3292 = a3;
        class_3292.n = 250.0f;
        class_3292.a.clear();
        for (Object a22 : (List)class_3292.f.A.L()) {
            if ((a22 = a3.L((FeatureMode_339)a22)) == null) continue;
            a3.a.add((FeatureSupport_336)a22);
        }
    }
}

