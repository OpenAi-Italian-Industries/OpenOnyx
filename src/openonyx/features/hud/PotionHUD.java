/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.resources.I18n;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_350;
import openonyx.features.hud.FeatureSupport_357;
import openonyx.features.hud.FeatureMode_334;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_i.RenderSupport_145;
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

public final class PotionHUD
extends Module {
    private RenderSupport_182 T;
    private final static float S = 3.0f;
    private final static int o = 200;
    private final UiSupport_545 U;
    private final static float X = 10.0f;
    private final RenderSupport_121 w;
    private final static float z = 100.0f;
    final public EnumSetting<FeatureMode_334> v;
    final public BooleanSetting s;
    final public BooleanSetting Z;
    private float O;
    private final static float N = 5.0f;
    private final static float q = 10.0f;
    final public BooleanSetting x;
    private boolean u;
    final public NumberSetting y;
    private final static float n = 5.0f;
    private final static float Y = 12.0f;
    private float r;
    private final RenderSupport_121 W;
    private final static float P = 6.0f;
    private final static float V = 5.0f;
    private float R;
    private float p;
    private final static float t = 1.0f;
    private final static float b = 1.0f;
    private final static float E = 0.94f;
    private final static float F = 18.0f;
    private long G;
    private boolean A;
    private final Map<Integer, FeatureSupport_357> K;
    private final static float B = 16.0f;
    private final RenderSupport_121 C;
    private final static float J = 110.0f;
    private final static float D = 6.0f;
    private final RenderSupport_184 c;
    private final static int a = 3;
    private float k;
    final public BooleanSetting g;
    final public BooleanSetting M;
    private final static ResourceLocation L = new ResourceLocation("textures/gui/container/inventory.png");
    private final static float j = 31.0f;
    private boolean m;
    final public BooleanSetting h;
    final public NumberSetting l;
    private final static float I = 20.0f;
    final public NumberSetting d;
    private final static float i = 4.0f;
    private final static String f = "potions";
    private float H;
    private final static String[] e;

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        PotionHUD class_352 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)PotionHUD.e.displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)PotionHUD.e.displayHeight - 1.0f;
        PotionHUD class_3522 = class_352;
        boolean bl2 = class_3522.l();
        boolean bl3 = class_3522.L(f6, (double)a4);
        if (a == false || !bl2) {
            v2 = class_352;
            class_352.m = 0;
            class_352.T = RenderSupport_183.f;
        } else {
            if (!class_352.u && bl3) {
                class_352.m = 1;
                class_352.H = f6 - class_352.p;
                class_352.R = a4 - class_352.r;
            }
            v2 = class_352;
        }
        v2.u = bl2;
        if (class_352.m) {
            void a5;
            void a6;
            PotionHUD class_3523 = class_352;
            PotionHUD class_3524 = class_352;
            class_3523.T = RenderSupport_183.L(f6 - class_352.H, (float)(a4 - class_3523.R), class_3524.O, class_3524.k, (float)a3, 0.0f, 10.0f, RenderSupport_179.L(f));
            PotionHUD class_3525 = class_352;
            PotionHUD.L(class_3523.d, class_3525.T.L() - 10.0f, (float)a6);
            PotionHUD.L(class_3525.y, class_352.T.D() - 10.0f, (float)a5);
        }
        return bl3;
    }

    @Override
    protected void L() {
        PotionHUD a;
PotionHUD class_352 = a;
        class_352.A = 0;
        class_352.G = 0L;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        PotionHUD class_352;
        boolean bl;
        void a;
        void a2;
        void a3;
        boolean bl2;
        float f4;
        boolean bl3;
        float f5;
        PotionHUD class_3522 = this;
PotionHUD class_3523 = class_3522;
        float f6 = class_3523.L();
        boolean bl4 = class_3523.d() && PotionHUD.e.currentScreen instanceof GuiChat ? 5 >> 2 : false;
        PotionHUD class_3524 = class_3522;
        List<FeatureSupport_350> list = class_3524.L(bl4);
        boolean a2232 = class_3524.L(list, f6);
        RenderSupport_121 class_121 = class_3524.W;
        if (a2232) {
            f5 = 1.0f;
            bl3 = a2232;
        } else {
            f5 = 0.0f;
            bl3 = a2232;
        }
        if (bl3) {
            f4 = 300.0f;
            bl2 = a2232;
        } else {
            f4 = 200.0f;
            bl2 = a2232;
        }
        class_121.L(f5, f4, bl2 ? RenderSupport_123.H : RenderSupport_123.h);
        class_3522.W.L(f6);
        if (class_3522.K.isEmpty() && class_3522.W.L() && class_3522.W.L() <= 0.0f) {
            PotionHUD class_3525 = class_3522;
            class_3522.h();
            class_3522.O = 0.0f;
            class_3525.k = 0.0f;
            class_3525.u = class_3522.l();
            return;
        }
        ThemeSupport_055 a2232 = ThemeSupport_059.L();
        PotionHUD class_3526 = class_3522;
        class_3526.L((RenderSupport_103)a3, list, f6);
        float f7 = class_3526.l.L() * (0.94f + 0.060000002f * class_3522.W.L());
        class_3526.O = class_3526.w.L() * f7;
        class_3526.k = class_3526.C.L() * f7;
        void var9_11 = a2 - class_3522.O - 20.0f;
        void var10_12 = a - class_3522.k - 20.0f;
        class_3526.p = 10.0f + PotionHUD.L(class_3522.d, (float)var9_11);
        class_3526.r = 10.0f + PotionHUD.L(class_3522.y, (float)var10_12);
        PotionHUD class_3527 = class_3522;
        PotionHUD class_3528 = class_3522;
        RenderSupport_179.L(f, class_3527.p, class_3527.r, class_3528.O, class_3528.k);
        boolean bl5 = class_3526.L(bl4, (float)var9_11, (float)var10_12, (float)a2, (float)a);
        if (bl4 && bl5 && !class_3522.m) {
            float[] fArray = class_3522.c.L(1 != 0);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                PotionHUD class_3529 = class_3522;
                PotionHUD.L(class_3529.d, PotionHUD.L(class_3529.d, (float)var9_11) + fArray[0], (float)var9_11);
                PotionHUD.L(class_3529.y, PotionHUD.L(class_3522.y, (float)var10_12) + fArray[1], (float)var10_12);
            }
        } else {
            class_3522.c.L(0 != 0);
        }
        class_3522.p = 10.0f + PotionHUD.L(class_3522.d, (float)var9_11);
        class_3522.r = 10.0f + PotionHUD.L(class_3522.y, (float)var10_12);
        UiSupport_545 class_545 = class_3522.U;
        if (bl4 && bl5) {
            bl = --1 != 0;
            class_352 = class_3522;
        } else {
            bl = false;
            class_352 = class_3522;
        }
        class_545.L(f6, bl, class_352.m);
        if (class_3522.m) {
            RenderSupport_183.L((RenderSupport_103)a3, (float)a2, (float)a, class_3522.T);
        }
        RenderSupport_120.L();
        void v15 = a3;
        PotionHUD class_35210 = class_3522;
        void v17 = a3;
        void v18 = a3;
        PotionHUD class_35211 = class_3522;
        v18.L(class_35211.W.L());
        v18.F();
        v17.L(class_35211.p, class_3522.r + (1.0f - class_3522.W.L()) * 5.0f);
        v17.L(f7, 0.0f, 0.0f);
        class_35210.L((RenderSupport_103)v17, a2232, list);
        v15.k();
        v15.e();
        class_35210.h();
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

    static {
        String[] stringArray = new String[8];
        stringArray[0] = "";
        stringArray[1] = "II";
        stringArray[2] = "III";
        stringArray[3] = "IV";
        stringArray[4] = "V";
        stringArray[5] = "VI";
        stringArray[6] = "VII";
        stringArray[7] = "VIII";
        e = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, List<FeatureSupport_350> list, float f2) {
        void a;
        void a2;
        Iterator iterator;
        void a3;
        PotionHUD class_352 = this;
float f3 = 29.0f + a3.L(ThemeSupport_057.M, "Potions");
        Iterator iterator2 = iterator = a2.iterator();
        while (iterator2.hasNext()) {
            FeatureSupport_350 class_350 = (FeatureSupport_350)iterator.next();
            PotionHUD class_3522 = class_352;
            float a4 = Math.min(a3.L(ThemeSupport_057.g, class_3522.D(class_350)), 110.0f);
            a4 = 18.0f + a4;
            if (class_3522.s.d()) {
                a4 += 18.0f;
            }
            if (class_352.g.d()) {
                a4 += 10.0f + a3.L(ThemeSupport_057.g, class_352.d(class_350));
            }
            f3 = Math.max(f3, a4);
            iterator2 = iterator;
        }
        int n = a2.size();
        float f4 = 37.0f + (float)n * 20.0f + (float)Math.max(0, n - 1) * 4.0f;
        class_352.w.L(f3, 300.0f, RenderSupport_123.l);
        class_352.C.L(f4, 300.0f, RenderSupport_123.l);
        PotionHUD class_3523 = class_352;
        class_3523.w.L((float)a);
        class_3523.C.L((float)a);
    }

    private String D(FeatureSupport_350 class_350) {
        FeatureSupport_350 a22 = class_350;
        PotionHUD a = this;
PotionHUD class_352 = a;
        String string = class_352.L(a22);
        if (!class_352.x.d() || a22.L() == null) {
            return string;
        }
        int a22 = a22.L().getAmplifier();
        if (0 <= 0 || 0 >= e.length) {
            return string;
        }
        return new StringBuilder().insert(0, string).append(" ").append(e[0]).toString();
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, FeatureSupport_350 class_350, float f2, float f3) {
        void a;
        void a2;
        void a3;
        void a4;
        int n;
        FeatureSupport_350 a5 = class_350;
        PotionHUD a6 = this;
float f4 = 6.0f;
        int n2 = n = a5.L() == null ? a4.E() : 0xFF000000 | a5.L().getLiquidColor();
        if (a6.s.d()) {
            if (a6.M.d()) {
                a3.D(6.0f, (float)(a2 + 1.0f), 18.0f, 18.0f, 4.0f, ThemeSupport_059.L(n, 0.22f));
            }
            if (a5.L() != null && a5.L().hasStatusIcon()) {
                int n3 = a5.L().getStatusIconIndex();
                int n4 = 256;
                a3.L(L, 7.0f, (float)(a2 + 1.0f + 1.0f), 16.0f, 16.0f, n3 % 8 * 18, 198 + n3 / 8 * 18, 18.0f, 18.0f, n4, n4);
            }
            f4 += 24.0f;
        }
        void v2 = a3;
        String string = v2.L(ThemeSupport_057.g, a6.D(a5), 110.0f);
        v2.l(ThemeSupport_057.g, string, f4, (float)(a2 + 10.0f), a6.M.d() ? n : a4.d());
        if (!a6.g.d()) {
            return;
        }
        int n5 = a6.h.d() && a5.L() != null && !a5.L().getIsPotionDurationMax() && a5.L().getDuration() < 200 ? 1 : 0;
        void v3 = a4;
        a3.d(ThemeSupport_057.g, a6.d(a5), (float)(a - 6.0f), (float)(a2 + 10.0f), n5 != 0 ? v3.K() : v3.F());
    }

    private boolean l() {
return Mouse.isButtonDown(0);
    }

    private String d(FeatureSupport_350 class_350) {
        FeatureSupport_350 a = class_350;
        PotionHUD a2 = this;
if (a.L() == null) {
            return "0:00";
        }
        if (a.L().getIsPotionDurationMax()) {
            return "**:**";
        }
        return Potion.getDurationString(a.L());
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(List<FeatureSupport_350> list, float f2) {
        void a2;
        Iterator a3;
        PotionHUD class_352 = this;
int n = 0;
        Iterator iterator = a3 = a3.iterator();
        while (iterator.hasNext()) {
            Object a4 = (FeatureSupport_350)a3.next();
            a4 = class_352.K.computeIfAbsent(((FeatureSupport_350)a4).L(), a -> {
return new FeatureSupport_357();
            });
            iterator = a3;
            ((FeatureSupport_357)a4).e = 1;
            ((FeatureSupport_357)a4).H.L(1.0f, 150.0f, RenderSupport_123.H);
            ((FeatureSupport_357)a4).H.L((float)a2);
            n = 1;
        }
        class_352.K.entrySet().removeIf(arg_0 -> PotionHUD.L((float)a2, arg_0));
        return 0 != 0;
    }

    @Override
    protected void D() {
        PotionHUD a;
PotionHUD class_352 = a;
        class_352.A = 1;
        class_352.m = 0;
    }

    private Comparator<FeatureSupport_350> L() {
        PotionHUD a2;
switch (((FeatureMode_334)a2.v.L()).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                ToIntFunction<FeatureSupport_350> toIntFunction = a -> {
if (a.L() == null) {
                        return Integer.MAX_VALUE;
                    }
                    return a.L().getDuration();
                };
                while (false) {
                }
                return Comparator.comparingInt(toIntFunction);
            }
            case 1: {
                return Comparator.comparing(class_350 -> {
                    FeatureSupport_350 a = class_350;
                    PotionHUD a2 = this;
if (a.L() == null) {
                        return "Effect";
                    }
                    return I18n.format(a.L().getName(), new Object[0]);
                }, String.CASE_INSENSITIVE_ORDER);
            }
            case 2: {
                return Comparator.comparingInt(a -> {
if (a.L() == null) {
                        return 0;
                    }
                    return -a.L().getAmplifier();
                }).thenComparing(class_350 -> {
                    FeatureSupport_350 a = class_350;
                    PotionHUD a2 = this;
if (a.L() == null) {
                        return "Effect";
                    }
                    return I18n.format(a.L().getName(), new Object[0]);
                }, String.CASE_INSENSITIVE_ORDER);
            }
        }
    }

    private static boolean L(float f2, Map.Entry entry) {
        Object a = entry;
        float a2 = f2;
a = (FeatureSupport_357)a.getValue();
        if (!((FeatureSupport_357)a).e) {
            ((FeatureSupport_357)a).H.L(0.0f, 100.0f, RenderSupport_123.h);
            ((FeatureSupport_357)a).H.L(a2);
        }
        ((FeatureSupport_357)a).e = 0;
        if (((FeatureSupport_357)a).H.L() && ((FeatureSupport_357)a).H.L() <= 0.0f && ((FeatureSupport_357)a).H.d() <= 0.0f) {
            return 5 >> 2;
        }
        return false;
    }

    public PotionHUD() {
        super("PotionHUD", "Shows your active potion effects", ModuleCategory.l);
        PotionHUD a;
        PotionHUD class_352 = a;
        a.l = new NumberSetting("Scale", 0.85, 0.5, 2.0, 0.05).d("x").L("Potion list size");
        class_352.v = new EnumSetting<FeatureMode_334>("Sort", FeatureMode_334.d).L("Row order");
        a.s = new BooleanSetting("Icons", --1 != 0).L("Show the vanilla effect icon");
        a.g = new BooleanSetting("Duration", 5 >> 2).L("Show the time remaining");
        a.x = new BooleanSetting("Amplifier", 1 != 0).L("Show the effect level as a roman numeral");
        a.M = new BooleanSetting("Potion color", 1 != 0).L("Tint each row with the potion's own colour");
        a.h = new BooleanSetting("Low time warning", --1 != 0).L("Turn the timer red as an effect runs out");
        a.Z = new BooleanSetting("Hide ambient", 0 != 0).L("Skip beacon effects");
        a.d = new NumberSetting("Position X", 6.78, 0.0, 100.0, 0.01).L(() -> {
return 3 >> 2;
        });
        a.y = new NumberSetting("Position Y", 45.0, 0.0, 100.0, 0.01).L(() -> {
return 5 >> 3;
        });
        PotionHUD class_3522 = a;
        class_3522.K = new HashMap<Integer, FeatureSupport_357>();
        class_3522.W = new RenderSupport_121(0.0f);
        class_3522.w = new RenderSupport_121(36.0f);
        class_3522.C = new RenderSupport_121(57.0f);
        class_3522.U = new UiSupport_545();
        class_3522.T = RenderSupport_183.f;
        class_3522.c = new RenderSupport_184();
    }

    public boolean L(double a, double a2) {
        PotionHUD a3;
if (a >= (double)a3.p) {
            PotionHUD class_352 = a3;
            if (a < (double)(class_352.p + class_352.O) && a2 >= (double)a3.r) {
                PotionHUD class_3522 = a3;
                if (a2 < (double)(class_3522.r + class_3522.k)) {
                    return 1 != 0;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055, List<FeatureSupport_350> list) {
        Iterator iterator;
        void a;
        void a2;
        PotionHUD class_352 = this;
PotionHUD class_3522 = class_352;
        float a3 = class_3522.w.L();
        float f2 = class_3522.C.L();
        int a222 = ThemeSupport_060.L(3, (ThemeSupport_055)a2);
        void v1 = a;
        void v2 = a;
        v2.d(0.0f, 0.0f, a3, f2, 12.0f, 3);
        RenderSupport_120.L((RenderSupport_103)v2, 0.0f, 0.0f, a3, f2, 12.0f, 0);
        float a222 = 14.0f;
        v1.L("\uea4b", 12.0f, 0, 12.0f, a2.E());
        v1.l(ThemeSupport_057.M, "Potions", 23.0f, 0, a2.d());
        v1.i(6.0f, 25.0f, a3 - 12.0f, 1.0f, ThemeSupport_059.L(a2.P(), 0.7f));
        a222 = 31.0f;
        Iterator iterator2 = iterator = a3.iterator();
        while (iterator2.hasNext()) {
            FeatureSupport_350 class_350 = (FeatureSupport_350)iterator.next();
            FeatureSupport_357 class_357 = class_352.K.get(class_350.L());
            float f3 = class_357 == null ? 1.0f : class_357.H.L();
            iterator2 = iterator;
            void v4 = a;
            void v5 = a;
            v5.L(f3);
            v5.F();
            v5.L((1.0f - f3) * 5.0f, 0.0f);
            class_352.L((RenderSupport_103)v4, (ThemeSupport_055)a2, class_350, 0, a3);
            v4.k();
            v4.e();
            a222 += 24.0f;
        }
        class_352.U.L((RenderSupport_103)a, 0.0f, 0.0f, a3, f2, 12.0f, a2.d());
        a.L(0.0f, 0.0f, a3, f2, 12.0f, 1.0f, a2.P());
    }

    private float L() {
        PotionHUD class_352 = this;
long l = System.nanoTime();
        float a = class_352.G == 0L ? 16.0f : Math.min((float)(l - class_352.G) / 1000000.0f, 100.0f);
        class_352.G = l;
        return 0;
    }

    public boolean I() {
        PotionHUD a;
return PotionHUD.e.thePlayer != null && PotionHUD.e.theWorld != null && (a.d() || a.A);
    }

    /*
     * WARNING - void declaration
     */
    private List<FeatureSupport_350> L(boolean bl) {
        void a;
        PotionHUD class_352 = this;
ArrayList<FeatureSupport_350> arrayList = new ArrayList<FeatureSupport_350>();
        if (class_352.d() && PotionHUD.e.thePlayer != null) {
            Iterator<PotionEffect> iterator;
            Iterator<PotionEffect> iterator2 = iterator = new ArrayList<PotionEffect>(PotionHUD.e.thePlayer.getActivePotionEffects()).iterator();
            while (iterator2.hasNext()) {
                Potion potion;
                PotionEffect a2 = iterator.next();
                if (a2 == null) {
                    iterator2 = iterator;
                    continue;
                }
                if (class_352.Z.d() && a2.getIsAmbient()) {
                    iterator2 = iterator;
                    continue;
                }
                Potion potion2 = potion = a2.getPotionID() >= 0 && a2.getPotionID() < Potion.potionTypes.length ? Potion.potionTypes[a2.getPotionID()] : null;
                if (potion == null) {
                    iterator2 = iterator;
                    continue;
                }
                arrayList.add(new FeatureSupport_350(a2.getPotionID(), potion, a2));
                iterator2 = iterator;
            }
        }
        if (arrayList.isEmpty() && a != false) {
            arrayList.add(new FeatureSupport_350(-1, null, null));
        }
        ArrayList<FeatureSupport_350> arrayList2 = arrayList;
        arrayList2.sort(class_352.L());
        return arrayList2;
    }

    private void h() {
        PotionHUD a;
if (a.d() || !a.K.isEmpty() || !a.W.L() || a.W.L() > 0.0f) {
            return;
        }
        PotionHUD class_352 = a;
        a.A = 0;
        class_352.G = 0L;
        class_352.O = 0.0f;
        a.k = 0.0f;
        RenderSupport_179.L(f);
    }

    private static float L(NumberSetting class_052, float f2) {
        float a = f2;
        NumberSetting a2 = class_052;
if (0 <= 0.0f) {
            return 0.0f;
        }
        return (float)(0.0 * (Double)a2.L() / 100.0);
    }
}

