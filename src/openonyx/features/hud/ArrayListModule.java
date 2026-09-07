/*
 * Decompiled with CFR.
 */
package openonyx.features.hud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.hud.FeatureSupport_381;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.features.hud.group_m.FeatureMode_365;
import openonyx.features.hud.group_m.FeatureMode_366;
import openonyx.features.hud.group_m.FeatureMode_367;
import openonyx.features.hud.group_m.FeatureMode_368;
import openonyx.history.Setting;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_v.RenderSupport_179;
import openonyx.render.group_v.RenderSupport_182;
import openonyx.render.group_v.RenderSupport_183;
import openonyx.render.group_v.RenderSupport_184;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_064;
import openonyx.ui.UiSupport_545;
import openonyx.ui.internal.TextEditor;
import org.lwjgl.input.Mouse;

public final class ArrayListModule
extends Module {
    public NumberSetting S;
    public NumberSetting o;
    public EnumSetting<FeatureMode_366> U;
    private final static float X = 100.0f;
    public BooleanSetting w;
    private final static float z = 1.0f;
    private final RenderSupport_121 v;
    public ColorSetting s;
    private final RenderSupport_121 Z;
    public MultiSelectSetting<ModuleCategory> O;
    private boolean N;
    private final RenderSupport_121 q;
    private float x;
    public ColorSetting u;
    private boolean y;
    public NumberSetting n;
    public NumberSetting Y;
    public BooleanSetting r;
    public NumberSetting W;
    private long P;
    private final RenderSupport_184 V;
    private final UiSupport_545 R;
    private float p;
    private float t;
    public BooleanSetting b;
    private boolean E;
    public EnumSetting<FeatureMode_367> F;
    public BooleanSetting G;
    private float A;
    public NumberSetting K;
    public BooleanSetting B;
    private final static float C = 2.0f;
    private boolean J;
    private RenderSupport_182 D;
    private final List<Module> c;
    public BooleanSetting a;
    private float k;
    private float g;
    private final static float M = 3.0f;
    private final Map<Module, FeatureSupport_364> L;
    private final static float j = 14.0f;
    public EnumSetting<FeatureMode_365> m;
    private final static float h = 140.0f;
    private final static float l = 4.0f;
    public NumberSetting I;
    public ColorSetting d;
    private final static float i = 14.0f;
    private final static String f = "arraylist";
    private final static float H = 0.0f;
    public EnumSetting<FeatureMode_368> e;

    private float D() {
        ArrayListModule a;
switch ((FeatureMode_365)a.m.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case f: {
                while (false) {
                }
                return 4.0f;
            }
            case H: {
                return 5.0f;
            }
            case e: {
                return 0.0f;
            }
        }
    }

    @Override
    protected void L() {
        ArrayListModule a;
ArrayListModule class_372 = a;
        class_372.y = 0;
        class_372.P = 0L;
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103, Module class_227, FeatureSupport_364 class_364) {
        void a;
        void a2;
        Module a222 = class_227;
        ArrayListModule a3 = this;
float a222 = Math.min(a2.L(ThemeSupport_057.M, a3.L(a222)), 140.0f);
        if (a.I == null) {
            return 0;
        }
        return 3.0f + a2.L(ThemeSupport_057.g, a.I);
    }

    public boolean L(double a, double a2) {
        ArrayListModule a3;
if (a >= (double)a3.p) {
            ArrayListModule class_372 = a3;
            if (a < (double)(class_372.p + class_372.A) && a2 >= (double)a3.x) {
                ArrayListModule class_3722 = a3;
                if (a2 < (double)(class_3722.x + class_3722.g)) {
                    return --1 != 0;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        ArrayListModule class_372;
        int n;
        void a;
        void a2;
        ArrayListModule class_3722;
        float f4;
        void a3;
        ArrayListModule class_3723 = this;
ArrayListModule class_3724 = class_3723;
        float f5 = class_3724.d();
        boolean bl = class_3724.d() && ((Minecraft)((Object)ArrayListModule.e)).currentScreen instanceof GuiChat ? 3 >> 1 : false;
        ArrayListModule class_3725 = class_3723;
        boolean bl2 = class_3725.L((RenderSupport_103)a3, bl, f5);
        RenderSupport_121 class_121 = class_3725.v;
        if (bl2) {
            f4 = 1.0f;
            class_3722 = class_3723;
        } else {
            f4 = 0.0f;
            class_3722 = class_3723;
        }
        class_121.L(f4, class_3722.L(bl2 ? 300.0f : 200.0f), bl2 ? RenderSupport_123.H : RenderSupport_123.h);
        class_3723.v.L(f5);
        if (class_3723.L.isEmpty() && class_3723.v.L() && class_3723.v.L() <= 0.0f) {
            ArrayListModule class_3726 = class_3723;
            class_3723.h();
            class_3723.A = 0.0f;
            class_3726.g = 0.0f;
            class_3726.E = class_3723.e();
            return;
        }
        ThemeSupport_055 class_055 = ThemeSupport_059.L();
        ArrayListModule class_3727 = class_3723;
        float f6 = class_3727.o.L();
        class_3727.A = class_3727.q.L() * f6;
        class_3727.g = class_3727.Z.L() * f6;
        void var8_11 = a2 - class_3723.A - 0.0f;
        void a4 = a - class_3723.g - 0.0f;
        class_3727.p = 0.0f + ArrayListModule.L(class_3723.n, (float)var8_11);
        class_3727.x = 0.0f + ArrayListModule.L(class_3723.K, 0.0f);
        ArrayListModule class_3728 = class_3723;
        ArrayListModule class_3729 = class_3723;
        RenderSupport_179.L(f, class_3728.p, class_3728.x, class_3729.A, class_3729.g);
        boolean bl3 = class_3727.L(bl, (float)var8_11, 0.0f, 0.0f, (float)a);
        if (bl && bl3 && !class_3723.N) {
            float[] fArray = class_3723.V.L(1 != 0);
            if (fArray[0] != 0.0f || fArray[1] != 0.0f) {
                ArrayListModule class_37210 = class_3723;
                ArrayListModule.L(class_37210.n, ArrayListModule.L(class_37210.n, (float)var8_11) + fArray[0], (float)var8_11);
                ArrayListModule.L(class_37210.K, ArrayListModule.L(class_3723.K, 0.0f) + fArray[1], 0.0f);
            }
        } else {
            class_3723.V.L(3 >> 2);
        }
        ArrayListModule class_37211 = class_3723;
        class_3723.p = 0.0f + ArrayListModule.L(class_3723.n, (float)var8_11);
        class_37211.x = 0.0f + ArrayListModule.L(class_3723.K, 0.0f);
        class_37211.p = Math.round(class_3723.p);
        class_37211.x = Math.round(class_37211.x);
        class_37211.J = (Double)class_37211.n.L() > 50.0 ? 1 : 0;
        UiSupport_545 class_545 = class_3723.R;
        if (bl && bl3) {
            n = 1;
            class_372 = class_3723;
        } else {
            n = 0;
            class_372 = class_3723;
        }
        class_545.L(f5, n != 0, class_372.N);
        if (class_3723.N) {
            RenderSupport_183.L((RenderSupport_103)a3, 0.0f, (float)a, class_3723.D);
        }
        void v14 = a3;
        void v15 = a3;
        v15.L(class_3723.v.L());
        v15.F();
        v15.L(class_3723.p, class_3723.x);
        v14.L(f6, 0.0f, 0.0f);
        class_3723.L((RenderSupport_103)v14, class_055);
        v14.k();
        a3.e();
        class_3723.h();
    }

    private boolean e() {
return Mouse.isButtonDown(0);
    }

    private static String d(Module class_227) {
        Module class_2272 = class_227;
Iterator<Setting> a = class_2272.L();
        if (a != null && !((String)((Object)a)).isEmpty()) {
            return a;
        }
        for (Setting class_031 : class_2272.d()) {
            if (!(class_031 instanceof EnumSetting)) continue;
            return EnumSetting.L((Enum)((EnumSetting)class_031).L());
        }
        return null;
    }

    public ArrayListModule() {
        super("Array List", "Lists every enabled module", ModuleCategory.l);
        ArrayListModule a2;
        ArrayListModule class_372 = a2;
        a2.m = new EnumSetting<FeatureMode_365>("Style", FeatureMode_365.f).L("How each row is painted");
        class_372.F = new EnumSetting<FeatureMode_367>("Animation", FeatureMode_367.I).L("How rows enter and leave");
        a2.U = new EnumSetting<FeatureMode_366>("Sort", FeatureMode_366.i).L("Row ordering");
        a2.e = new EnumSetting<FeatureMode_368>("Colors", FeatureMode_368.e).L("Where each row's colour comes from");
        a2.s = new ColorSetting("Color", -8691201).L(a2.e, (T a) -> {
if (a == FeatureMode_368.I) {
                return 5 >> 2;
            }
            return false;
        });
        a2.u = ((ColorSetting)new ColorSetting("First Color", -8691201).L(a2.e, FeatureMode_368::d)).L("Gradient: the top row. Fade: one end of the pulse");
        a2.d = ((ColorSetting)new ColorSetting("Second Color", -12598785).L(a2.e, FeatureMode_368::d)).L("Gradient: the bottom row. Fade: the other end of the pulse");
        a2.I = new NumberSetting("Color Speed", 1.0, 0.1, 5.0, 0.1).d("x").L(a2.e, FeatureMode_368::L);
        a2.W = ((NumberSetting)new NumberSetting("Color Spread", 12.0, 0.0, 60.0, 1.0).L(a2.e, FeatureMode_368::L)).L("How far the colour shifts between neighbouring rows");
        ArrayListModule class_3722 = a2;
        class_3722.b = new BooleanSetting("Suffix", 1 != 0).L("Show the module's mode next to its name");
        class_3722.a = new BooleanSetting("Lowercase", 5 >> 3).L("Write every row in lower case");
        Enum[] enumArray = new ModuleCategory[4];
        enumArray[0] = ModuleCategory.d;
        enumArray[1] = ModuleCategory.H;
        enumArray[2] = ModuleCategory.i;
        enumArray[3] = ModuleCategory.f;
        class_3722.O = new MultiSelectSetting("Categories", ModuleCategory.class, enumArray).L("Which categories the list shows");
        a2.r = new BooleanSetting("Background", 5 >> 2).L(() -> {
            ArrayListModule a;
if (!a.m.L(FeatureMode_365.e)) {
                return 3 >> 1;
            }
            return false;
        });
        a2.G = ((BooleanSetting)new BooleanSetting("Blur", 5 >> 3).L(() -> {
            ArrayListModule a;
if (!a.m.L(FeatureMode_365.e) && a.r.d()) {
                return --1 != 0;
            }
            return false;
        })).L("Frost each row over what is behind it (needs ClickGui's frosted glass)");
        a2.w = new BooleanSetting("Text Shadow", --1 != 0).L(() -> {
            ArrayListModule a;
return a.m.L(FeatureMode_365.e);
        });
        a2.B = new BooleanSetting("Outline", 0 != 0).L(() -> {
            ArrayListModule a;
return a.m.L(FeatureMode_365.H);
        });
        ArrayListModule class_3723 = a2;
        class_3723.o = new NumberSetting("Scale", 1.0, 0.5, 2.0, 0.05).d("x").L("Array list size");
        class_3723.Y = new NumberSetting("Row Spacing", 0.0, 0.0, 6.0, 0.5);
        class_3723.S = new NumberSetting("Animation Speed", 1.0, 0.25, 3.0, 0.05).d("x");
        class_3723.n = new NumberSetting("Position X", 100.0, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        a2.K = new NumberSetting("Position Y", 0.0, 0.0, 100.0, 0.01).L(() -> {
return 0 != 0;
        });
        ArrayListModule class_3724 = a2;
        ArrayListModule class_3725 = a2;
        class_3725.L = new IdentityHashMap<Module, FeatureSupport_364>();
        class_3725.c = new ArrayList<Module>();
        class_3725.v = new RenderSupport_121(0.0f);
        class_3725.q = new RenderSupport_121(0.0f);
        class_3725.Z = new RenderSupport_121(0.0f);
        class_3725.R = new UiSupport_545();
        class_3724.V = new RenderSupport_184();
        class_3724.J = 1;
        class_3724.D = RenderSupport_183.f;
    }

    /*
     * WARNING - void declaration
     */
    private int L(int n, int n2, Module class_227, ThemeSupport_055 class_055) {
        int a = n;
        ArrayListModule a2 = this;
switch ((FeatureMode_368)a2.e.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case e: {
                void a3;
                while (false) {
                }
                return a3.E();
            }
            case I: {
                return a2.s.L();
            }
            case h: {
                double d = ArrayListModule.L() * (double)a2.I.L() + Math.toRadians(0.0f * a2.W.L());
                return RenderSupport_124.L(a2.u.L(), a2.d.L(), (float)(Math.sin(d) + 1.0) / 2.0f);
            }
            case d: {
                void a4;
                return RenderSupport_124.L(a2.u.L(), a2.d.L(), a4 <= 1 ? 0.0f : 0.0f / (float)(a4 - 1));
            }
            case H: {
                float f2;
                float f3 = (float)(ArrayListModule.L() * 60.0 * (double)a2.I.L() + (double)(0.0f * a2.W.L())) % 360.0f;
                return ThemeSupport_064.L(f2 < 0.0f ? f3 + 360.0f : f3, 0.75f, 1.0f, 255);
            }
            case i: {
                void a5;
                return ThemeSupport_064.L((float)a5.L().ordinal() * 67.0f % 360.0f, 0.7f, 1.0f, 255);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(RenderSupport_103 class_103, boolean bl, float f2) {
        int a4;
        void a2;
        FeatureSupport_364 a32;
        ArrayListModule class_372 = this;
class_372.c.clear();
        Iterator<Module> a222 = OnyxClient.l.L().iterator();
        block0: while (true) {
            Iterator<Module> iterator = a222;
            while (iterator.hasNext()) {
                ArrayListModule class_3722;
                float f3;
                Module class_227 = a222.next();
                if (class_227 == class_372) continue block0;
                if (class_227 == OnyxClient.l.k) {
                    iterator = a222;
                    continue;
                }
                int n = class_372.d() && class_227.d() && class_372.O.L(class_227.L()) ? 1 : 0;
                Object a4 = class_372.L.get(class_227);
                if (n != 0 && a4 == null) {
                    a4 = new FeatureSupport_364(0.0f);
                    class_372.L.put(class_227, (FeatureSupport_364)a4);
                }
                if (a4 == null) {
                    iterator = a222;
                    continue;
                }
                if (n != 0) {
                    String string = ((FeatureSupport_364)a4).I = class_372.b.d() ? ArrayListModule.d(class_227) : null;
                    if (((FeatureSupport_364)a4).I != null && class_372.a.d()) {
                        ((FeatureSupport_364)a4).I = ((FeatureSupport_364)a4).I.toLowerCase(Locale.ROOT);
                    }
                    ((FeatureSupport_364)a4).H = class_372.L((RenderSupport_103)((Object)a32), class_227, (FeatureSupport_364)a4);
                    class_372.c.add(class_227);
                }
                RenderSupport_121 class_121 = ((FeatureSupport_364)a4).i;
                if (n != 0) {
                    f3 = 1.0f;
                    class_3722 = class_372;
                } else {
                    f3 = 0.0f;
                    class_3722 = class_372;
                }
                class_121.L(f3, class_3722.L(n != 0 ? 250.0f : 200.0f), n != 0 ? RenderSupport_123.H : RenderSupport_123.h);
                Object object = a4;
                ((FeatureSupport_364)object).i.L((float)a2);
                ((FeatureSupport_364)object).e.L((float)a2);
                if (n != 0 || !((FeatureSupport_364)a4).i.L() || !(((FeatureSupport_364)a4).i.L() <= 0.0f)) continue block0;
                class_372.L.remove(class_227);
                continue block0;
            }
            break;
        }
        class_372.c.sort(class_372.L());
        float a222 = 14.0f + class_372.Y.L();
        float f4 = class_372.D();
        float f5 = 0.0f;
        int n = 0;
        while (n < class_372.c.size()) {
            float f6;
            ArrayListModule class_3723 = class_372;
            a32 = class_3723.L.get(class_3723.c.get(0));
            a32.f = 0;
            FeatureSupport_364 class_364 = a32;
            if (a32.d) {
                class_364.e.L(0.0f * a222, class_372.L(100.0f), RenderSupport_123.l);
                f6 = f5;
            } else {
                class_364.e.L(0.0f * a222);
                a32.d = 1;
                f6 = f5;
            }
            f5 = Math.max(f6, a32.H);
            n = ++a4;
        }
        a4 = class_372.c.size();
        float a32 = 0 == 0 ? 0.0f : f5 + f4 * 2.0f + class_372.L();
        float f7 = f4 = 0 == 0 ? 0.0f : 0.0f * a222 - class_372.Y.L();
        if (0 > 0) {
            class_372.q.L(a32, class_372.L(300.0f), RenderSupport_123.l);
            class_372.Z.L(f4, class_372.L(300.0f), RenderSupport_123.l);
        }
        ArrayListModule class_3724 = class_372;
        class_3724.q.L((float)a2);
        class_3724.Z.L((float)a2);
        if (0 > 0) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ThemeSupport_055 class_055) {
        void a;
        OnyxListener_001 a2 = class_103;
        ArrayListModule a3 = this;
FeatureMode_365 enum_365 = (FeatureMode_365)a3.m.L();
        int n = a3.r.d() && enum_365 != FeatureMode_365.e && a3.G.d() ? 1 : 0;
        RenderSupport_120.L(0 != 0);
        ArrayListModule class_372 = a3;
        float f2 = class_372.q.L();
        float f3 = class_372.Z.L();
        float f4 = class_372.D();
        int n2 = class_372.c.size();
        Iterator<Map.Entry<Module, FeatureSupport_364>> iterator = class_372.L.entrySet().iterator();
        block0: while (true) {
            Iterator<Map.Entry<Module, FeatureSupport_364>> iterator2 = iterator;
            while (iterator2.hasNext()) {
                float f5;
                Object object = iterator.next();
                Module class_227 = object.getKey();
                object = object.getValue();
                float f6 = ((FeatureSupport_364)object).i.L();
                if (f5 <= 0.001f) {
                    iterator2 = iterator;
                    continue;
                }
                ArrayListModule class_3722 = a3;
                Object object2 = object;
                int n3 = class_3722.L(((FeatureSupport_364)object2).f, n2, class_227, (ThemeSupport_055)a);
                float f7 = ((FeatureSupport_364)object2).H + f4 * 2.0f + a3.L();
                float f8 = class_3722.J ? f2 - f7 : 0.0f;
                float f9 = ((FeatureSupport_364)object).e.L();
                FeatureMode_367 enum_367 = (FeatureMode_367)a3.F.L();
                if (enum_367.d()) {
                    ((RenderSupport_103)a2).L(f6);
                }
                ((RenderSupport_103)a2).F();
                if (enum_367.L()) {
                    float f10 = (1.0f - f6) * 14.0f;
                    ((RenderSupport_103)a2).L(a3.J ? f10 : -f10, 0.0f);
                }
                if (enum_367.D()) {
                    ((RenderSupport_103)a2).L(f8 + (a3.J ? f7 : 0.0f), f9 + 7.0f);
                    OnyxListener_001 interface_001 = a2;
                    ((RenderSupport_103)interface_001).L(0.9f + 0.1f * f6, 0.0f, 0.0f);
                    ((RenderSupport_103)interface_001).L(-(f8 + (a3.J ? f7 : 0.0f)), -(f9 + 7.0f));
                }
                a3.L((RenderSupport_103)a2, (ThemeSupport_055)a, enum_365, class_227, (FeatureSupport_364)object, f8, f9, f7, f4, n3, 0 != 0);
                ((RenderSupport_103)a2).k();
                if (!enum_367.d()) continue block0;
                ((RenderSupport_103)a2).e();
                continue block0;
            }
            break;
        }
        a3.R.L((RenderSupport_103)a2, 0.0f, 0.0f, f2, f3, 0.0f, a.d());
    }

    private static double L() {
return (double)System.nanoTime() / 1.0E9;
    }

    private String L(Module class_227) {
        Module a = class_227;
        ArrayListModule a2 = this;
Module class_2272 = a;
        if (a2.a.d()) {
            return class_2272.d().toLowerCase(Locale.ROOT);
        }
        return class_2272.d();
    }

    private float d() {
        ArrayListModule class_372 = this;
long l = System.nanoTime();
        float a = class_372.P == 0L ? 16.0f : Math.min((float)(l - class_372.P) / 1000000.0f, 100.0f);
        class_372.P = l;
        return 0;
    }

    private float L(float f2) {
        float a = f2;
        ArrayListModule a2 = this;
return 0 / a2.S.L();
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
    private static void L(NumberSetting class_052, float f2, float f3) {
        void a;
        float a2 = f3;
        NumberSetting a3 = class_052;
if (4.0f <= 0.0f) {
            return;
        }
        a3.i((double)Math.clamp((float)(a / 4.0f), 0.0f, 1.0f) * 100.0);
    }

    public boolean l() {
        ArrayListModule a;
return ((Minecraft)((Object)ArrayListModule.e)).thePlayer != null && ((Minecraft)((Object)ArrayListModule.e)).theWorld != null && (a.d() || a.y);
    }

    /*
     * Unable to fully structure code
     */
    private void L(RenderSupport_103 var1_1, ThemeSupport_055 var2_2, FeatureMode_365 var3_4, Module var4_5, FeatureSupport_364 var5_6, float var6_8, float var7_9, float var8_10, float var9_11, int var10_12, boolean var11_13) {
        block18: {
            block16: {
                block17: {
                    a = var1_1;
                    a = this;
var12_14 = a.L();
                    var13_15 = a + a - a - (a.J != false ? var12_14 : 0.0f);
                    a = a + a + (a.J != false ? 0.0f : var12_14);
                    var14_16 = a + 7.0f;
                    var15_17 = a == FeatureMode_365.f ? a.d() : a;
                    var16_18 = ThemeSupport_059.L(a == FeatureMode_365.e ? a : a.d(), 0.6f);
                    switch (FeatureSupport_381.H[a.ordinal()]) lbl-1000:
                    // 2 sources

                    {
                        case 1: {
                            if (false) ** GOTO lbl-1000
                            if (!a.r.d()) ** GOTO lbl24
                            var17_19 = ThemeSupport_059.L(a.L(), 0.55f);
                            v0 = a;
                            if (a.Y.L() > 0.0f) {
                                RenderSupport_120.L((RenderSupport_103)v0, (float)a, (float)a, (float)a, 14.0f, 0.0f, var17_19, (boolean)a);
                                v1 = a;
                            } else {
                                v0.d((float)a, (float)a, (float)a, 14.0f);
                                v2 = a;
                                RenderSupport_120.L((RenderSupport_103)v2, (float)a, (float)(a - 4.0f), (float)a, 22.0f, 0.0f, var17_19, (boolean)a);
                                v2.L();
lbl24:
                                // 2 sources

                                v1 = a;
                            }
                            v3 = a;
                            if (a.J) {
                                v3 = v3 + a - var12_14;
                                v4 = a;
                            } else {
                                v4 = a;
                            }
                            v1.i((float)v3, (float)v4, var12_14, 14.0f, a);
                            v5 = a;
                            break;
                        }
                        case 2: {
                            if (a.r.d()) {
                                v6 = a;
                                RenderSupport_120.L((RenderSupport_103)v6, (float)a, (float)a, (float)a, 14.0f, 8.0f, ThemeSupport_059.L(a.L(), 0.72f), (boolean)a);
                                v6.D((float)a, (float)a, (float)a, 14.0f, 8.0f, ThemeSupport_059.L(a, 0.22f));
                            }
                            if (a.B.d()) {
                                v7 = a;
                                v5 = v7;
                                v7.L((float)a, (float)a, (float)a, 14.0f, 8.0f, 1.0f, ThemeSupport_059.L(a, 0.5f));
                                break;
                            }
                        }
                        default: {
                            v5 = a;
                        }
                    }
                    var17_20 = v5.L(ThemeSupport_057.M, a.L((Module)a), 140.0f);
                    a = a.I;
                    v8 = a = a == null ? 0.0f : a.L(ThemeSupport_057.g, a) + 3.0f;
                    if (a != FeatureMode_365.e || !a.w.d()) break block16;
                    a = ThemeSupport_059.L(a.M(), 0.075f);
                    if (!a.J) break block17;
                    a.d(ThemeSupport_057.M, var17_20, (float)(var13_15 - a + 1.0f), (float)(var14_16 + 1.0f), a);
                    if (a == null) break block16;
                    v9 = a;
                    a.d(ThemeSupport_057.g, a, (float)(var13_15 + 1.0f), (float)(var14_16 + 1.0f), a);
                    break block18;
                }
                a.l(ThemeSupport_057.M, var17_20, (float)(a + 1.0f), (float)(var14_16 + 1.0f), a);
                if (a != null) {
                    a.l(ThemeSupport_057.g, a, (float)(a + a.L(ThemeSupport_057.M, var17_20) + 3.0f + 1.0f), (float)(var14_16 + 1.0f), a);
                }
            }
            v9 = a;
        }
        if (v9.J) {
            a.d(ThemeSupport_057.M, var17_20, (float)(var13_15 - a), (float)var14_16, var15_17);
            if (a != null) {
                a.d(ThemeSupport_057.g, a, (float)var13_15, (float)var14_16, var16_18);
                return;
            }
        } else {
            a.l(ThemeSupport_057.M, var17_20, (float)a, (float)var14_16, var15_17);
            if (a != null) {
                a.l(ThemeSupport_057.g, a, (float)(a + a.L(ThemeSupport_057.M, var17_20) + 3.0f), (float)var14_16, var16_18);
            }
        }
    }

    @Override
    protected void D() {
        ArrayListModule a;
ArrayListModule class_372 = a;
        class_372.y = 1;
        class_372.N = 0;
    }

    private Comparator<Module> L() {
        ArrayListModule a;
switch ((FeatureMode_366)a.U.L()) {
            default: {
                throw new MatchException(null, null);
            }
            case i: {
                while (false) {
                }
                return Comparator.comparingDouble(class_227 -> {
                    Module a = class_227;
                    ArrayListModule a2 = this;
return -a2.L.get((Object)a).H;
                }).thenComparing(Module::d);
            }
            case f: {
                return Comparator.comparingDouble(class_227 -> {
                    Module a = class_227;
                    ArrayListModule a2 = this;
return a2.L.get((Object)a).H;
                }).thenComparing(Module::d);
            }
            case d: {
                return Comparator.comparing(Module::d);
            }
        }
    }

    private float L() {
        ArrayListModule a;
if (a.m.L(FeatureMode_365.f)) {
            return 2.0f;
        }
        return 0.0f;
    }

    private void h() {
        ArrayListModule a;
if (a.d() || !a.L.isEmpty() || !a.v.L() || a.v.L() > 0.0f) {
            return;
        }
        ArrayListModule class_372 = a;
        a.y = 0;
        class_372.P = 0L;
        class_372.A = 0.0f;
        a.g = 0.0f;
        RenderSupport_179.L(f);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(boolean bl, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        ArrayListModule class_372 = this;
float f6 = (float)Minecraft.getScaledMouseX() * a3 / (float)((Minecraft)((Object)ArrayListModule.e)).displayWidth;
        void v0 = a2;
        void a4 = v0 - (float)Minecraft.getScaledMouseY() * v0 / (float)((Minecraft)((Object)ArrayListModule.e)).displayHeight - 1.0f;
        ArrayListModule class_3722 = class_372;
        boolean bl2 = class_3722.e();
        boolean bl3 = class_3722.L(f6, 0.0);
        if (a == false || !bl2) {
            v2 = class_372;
            class_372.N = 0;
            class_372.D = RenderSupport_183.f;
        } else {
            if (!class_372.E && bl3) {
                class_372.N = 1;
                class_372.t = f6 - class_372.p;
                class_372.k = a4 - class_372.x;
            }
            v2 = class_372;
        }
        v2.E = bl2;
        if (class_372.N) {
            void a5;
            void a6;
            ArrayListModule class_3723 = class_372;
            ArrayListModule class_3724 = class_372;
            class_3723.D = RenderSupport_183.L(f6 - class_372.t, (float)(a4 - class_3723.k), class_3724.A, class_3724.g, (float)a3, 0.0f, 0.0f, RenderSupport_179.L(f));
            ArrayListModule class_3725 = class_372;
            ArrayListModule.L(class_3723.n, class_3725.D.L() - 0.0f, (float)a6);
            ArrayListModule.L(class_3725.K, class_372.D.D() - 0.0f, (float)a5);
        }
        return bl3;
    }
}

