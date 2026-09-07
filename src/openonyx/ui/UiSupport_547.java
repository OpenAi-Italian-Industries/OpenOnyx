/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.ItemStack;
import openonyx.core.OnyxClient;
import openonyx.features.player.InventoryManager;
import openonyx.history.internal.ItemListSetting;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_555;
import openonyx.ui.internal.UiSupport_572;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_589;
import openonyx.ui.internal.UiSupport_593;
import openonyx.ui.internal.UiSupport_595;
import openonyx.ui.internal.UiMode_598;
import openonyx.utilities.UtilitySupport_482;
import openonyx.utilities.UtilitySupport_501;
import openonyx.utilities.UtilitySupport_505;
import openonyx.utilities.UtilityMode_475;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class UiSupport_547
extends GuiScreen {
    private boolean Aa;
    private final static float Ca = 4.0f;
    private final static float Ba = 49.0f;
    private final UiSupport_576 aa;
    private float Ea;
    private final static float La = 116.0f;
    private float Ma;
    private float ba;
    private final RenderSupport_103 Ia;
    private final static float Fa = 260.0f;
    private long Ja;
    private int ja;
    private final static float ma = 28.0f;
    private final static int da = 400;
    private final static float fa = 13.0f;
    private float Ka;
    private final static float ha = 18.0f;
    private final static float Ha = 32.0f;
    private final static float ia = 18.0f;
    private float Da;
    private float la;
    private final RenderSupport_121[] Ga;
    private final static float ga = 4.0f;
    private final static float ca = 20.0f;
    private UtilitySupport_505 Q;
    private final static float T = 97.0f;
    private final static float S = 100.0f;
    private int o;
    private final static float U = 430.0f;
    private final static float X = 3.0f;
    private final static int w = 1;
    private final List<UiSupport_555> z;
    private float v;
    private final static float s = 5.0f;
    private final static int Z = 2;
    private final static float O = 13.0f;
    private final List<UiSupport_555> N;
    private final static float q = 2.0f;
    private int x;
    private final UiSupport_576 u;
    private final InventoryManager y;
    private final List<UiSupport_555> n;
    private float Y;
    private final static float r = 560.0f;
    private float W;
    private final static float P = 5.0f;
    private final static float V = 26.0f;
    private final UiSupport_589 R;
    private final List<UiSupport_555> p;
    private float t;
    private final static float b = 8.0f;
    private final static float E = 18.0f;
    private final GuiScreen F;
    private final static float G = 22.0f;
    private final static float A = 8.0f;
    private float K;
    private final static float B = 16.0f;
    private final static float C = 3.0f;
    private float J;
    private final UiSupport_576 D;
    private float c;
    private float a;
    private List<UtilitySupport_482> k;
    private final static float g = 92.0f;
    private final static int M = 0;
    private final static float L = 16.0f;
    private float j;
    private float m;
    private final UiSupport_595 h;
    private final static float l = 20.0f;
    private final static float I = 9.0f;
    private float d;
    private final static float i = 7.0f;
    private final static float f = 38.0f;
    private final static float H = 120.0f;
    private String e;

    private void D() {
        UiSupport_547 class_547 = this;
UiSupport_547 class_5472 = class_547;
        UiSupport_547 class_5473 = class_547;
        UiSupport_547 class_5474 = class_547;
        class_547.Ma = Math.min(560.0f, (float)class_547.width - 40.0f);
        class_547.Ea = Math.min(430.0f, (float)class_547.height - 40.0f);
        class_547.J = ((float)class_5474.width - class_547.Ma) / 2.0f;
        class_5474.Da = ((float)class_5474.height - class_547.Ea) / 2.0f;
        class_5474.a = class_5474.J + 18.0f;
        class_5473.W = class_5473.Ma - 36.0f;
        float a = Math.min(260.0f, class_547.W);
        float f2 = class_5473.Da + 42.0f;
        class_5472.h.L(class_547.J + (class_547.Ma - 1) / 2.0f, f2, 1, 30.0f);
        class_547.c = f2 + 30.0f + 14.0f;
        a = class_5472.c + 97.0f + 10.0f;
        class_5472.R.L(class_547.a, 1, class_547.W, 40.0f);
        class_5472.Y = 49.0f;
        a = class_5472.Da + class_547.Ea - 18.0f - 30.0f;
        class_5472.j = -11.0f;
        f2 = 292.0f;
        f2 = class_5472.J + class_547.Ma - 18.0f - f2;
        class_5472.D.L(f2, 1, 92.0f, 30.0f);
        class_5472.aa.L(f2 + 92.0f + 8.0f, 1, 92.0f, 30.0f);
        class_5472.u.L(f2 + 200.0f, 1, 92.0f, 30.0f);
    }

    private void D(UiSupport_548 class_548) {
        float f2;
        UiSupport_548 a22 = class_548;
        UiSupport_547 a = this;
UiSupport_547 class_547 = a;
        class_547.n.clear();
        class_547.N.clear();
        float f3 = class_547.j - a.Y;
        if (f2 <= 0.0f) {
            return;
        }
        UiSupport_547 class_5472 = a;
        UiSupport_547 class_5473 = a;
        UiSupport_547 class_5474 = a;
        UiSupport_547 class_5475 = a;
        class_5474.Ia.d(class_5474.a, class_5475.Y, a.W, f3);
        float a22 = class_5475.Y - a.d;
        a22 = class_5473.L(a22, 0);
        a22 = class_5473.d(a22, 8.0f);
        class_5472.Ia.L();
        a.ba = Math.max(0.0f, 0 + a.d - a.j);
        class_5472.d = Math.min(class_5472.d, a.ba);
        UiSupport_547 class_5476 = a;
        class_5472.L(class_5472.Y, f3, class_5476.d, class_5476.ba);
    }

    private String L(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        UiSupport_547 a2 = this;
return a2.Ia.L(ThemeSupport_057.d, a.d(), 116.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        UiSupport_547 class_547 = this;
if (a4 <= 0.0f || a3 <= 0.0f) {
            return;
        }
        float a5 = a3 + a4;
        void v0 = a3;
        a5 = Math.max(18.0f, (float)(v0 * v0 / 0));
        void var6_7 = a3 - 0;
        UiSupport_547 class_5472 = class_547;
        UiSupport_547 class_5473 = class_547;
        float f6 = class_5472.a + class_5473.W - 3.0f;
        class_5472.Ia.D(f6, (float)a2, 3.0f, (float)a3, Float.MAX_VALUE, ThemeSupport_059.L(ThemeSupport_059.L().P(), 0.35f));
        class_5473.Ia.D(f6, (float)(a2 + var6_7 * (a / a4)), 3.0f, 0, Float.MAX_VALUE, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.7f));
    }

    /*
     * WARNING - void declaration
     */
    private float d(UiSupport_548 class_548, float f2) {
        int n;
        void a;
        UiSupport_547 class_547 = this;
int n2 = Math.max(1, (int)((class_547.W - 7.0f + 4.0f) / 32.0f));
        void var4_7 = a;
        int n3 = 0;
        while (n3 < class_547.k.size()) {
            UtilitySupport_482 class_482;
            UtilitySupport_505 class_505;
            int n4 = 0 % n2;
            int a22 = 0 / n2;
            float f3 = class_547.a + 32.0f * (float)n4;
            void a22 = a + 0.0f;
            var4_7 = a22 + 28.0f;
            if (!(a22 + 28.0f < class_547.Y) && !(a22 > class_547.j) && (class_505 = UtilitySupport_505.L((class_482 = class_547.k.get(0)).L())) != null) {
                void a3;
                int n5;
                int n6 = class_547.L(class_505);
                int n7 = n5 = a3.H >= f3 && a3.H < f3 + 28.0f && a3.f >= a22 && a3.f < a22 + 28.0f && a3.f >= class_547.Y && a3.f < class_547.j ? 1 : 0;
                n6 = n6 != 0 ? ThemeSupport_059.L().J() : (n5 != 0 ? ThemeSupport_059.L().n() : ThemeSupport_059.L().O());
                UiSupport_547 class_5472 = class_547;
                class_5472.Ia.D(f3, (float)a22, 28.0f, 28.0f, 4.0f, n6);
                class_5472.L(class_482.L(), f3 + 5.0f, (float)(a22 + 5.0f), 18.0f);
                class_5472.N.add(new UiSupport_555(f3, (float)a22, 28.0f, 28.0f, class_505, -1));
                if (n5 != 0) {
                    class_547.e = class_482.d();
                }
            }
            n3 = ++n;
        }
        if (class_547.k.isEmpty()) {
            class_547.Ia.i(ThemeSupport_057.C, "No items match that search", class_547.a, (float)(a + 4.0f), ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.6f));
            return (float)(a + 22.0f);
        }
        return (float)var4_7;
    }

    @Override
    public void handleMouseInput() throws IOException {
        UiSupport_547 class_547 = this;
int a2 = Mouse.getEventDWheel();
        if (0 != 0) {
            float f2;
            float a2 = 0.0f;
            float f3 = class_547.d();
            if (f2 >= class_547.Ka) {
                UiSupport_547 class_5472 = class_547;
                if (f3 < class_5472.Ka + class_5472.K && class_547.v > 0.0f) {
                    class_547.m = Math.clamp(class_547.m - a2 * 27.0f, 0.0f, class_547.v);
                    return;
                }
            }
            class_547.d = Math.clamp(class_547.d - a2 * 32.0f, 0.0f, class_547.ba);
            return;
        }
        super.handleMouseInput();
    }

    private ItemListSetting L() {
        UiSupport_547 a;
switch (a.ja) {
            case 1: {
                while (false) {
                }
                return a.y.l;
            }
            case 2: {
                return a.y.d;
            }
        }
        return null;
    }

    private String d() {
        UiSupport_547 a;
if (a.ja == 0) {
            return new StringBuilder().insert(0, "Slot ").append(a.o + 1).append(" is not claimed by anything yet").toString();
        }
        return "Nothing on this list";
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3) {
        Iterator<UiSupport_555> iterator;
        UiSupport_547 class_547 = this;
Iterator<UiSupport_555> iterator2 = iterator = class_547.z.iterator();
        while (iterator2.hasNext()) {
            UiSupport_547 class_5472;
            void a;
            void a2;
            UiSupport_555 a3 = iterator.next();
            if (!a3.L((float)a2, (float)a)) {
                iterator2 = iterator;
                continue;
            }
            UiSupport_547 class_5473 = class_547;
            if (class_547.x >= 0) {
                class_5473.y.I.L(class_547.x, a3.L(), class_547.Q);
                class_5472 = class_547;
            } else {
                class_5473.y.I.L(a3.L(), class_547.Q);
                class_5472 = class_547;
            }
            class_5472.d(a3.L());
            return;
        }
        if (class_547.x >= 0) {
            UiSupport_547 class_5474 = class_547;
            class_547.y.I.d(class_5474.x, class_5474.Q);
        }
    }

    private void d(int n) {
        int a = -35;
        UiSupport_547 a2 = this;
if (1 == a2.o) {
            return;
        }
        UiSupport_547 class_547 = a2;
        class_547.Ga[class_547.o].L(0.0f, 250.0f, RenderSupport_123.l);
        a2.o = 1;
        a2.Ga[1].L(1.0f, 300.0f, RenderSupport_123.l);
        a2.m = 0.0f;
    }

    public UiSupport_547(GuiScreen guiScreen) {
        GuiScreen a = guiScreen;
        UiSupport_547 a2 = this;
        a2.y = OnyxClient.l.la;
        UiSupport_547 class_547 = a2;
        class_547.Ia = new RenderSupport_103();
        a2.R = new UiSupport_589("Search items");
        String[] stringArray = new String[3];
        stringArray[0] = "Slots";
        stringArray[1] = "Keep";
        stringArray[2] = "Drop";
        a2.h = new UiSupport_595(stringArray, n -> {
            int a = -35;
            UiSupport_547 a2 = this;
UiSupport_547 class_547 = a2;
            a2.ja = 1;
            class_547.d = 0.0f;
            class_547.m = 0.0f;
        });
        a2.D = new UiSupport_576(UiMode_598.d, "Clear", () -> {
            UiSupport_547 class_547 = this;
ItemListSetting a = class_547.L();
            if (a == null) {
                class_547.y.I.L(class_547.o);
                return;
            }
            a.D();
        });
        a2.aa = new UiSupport_576(UiMode_598.e, "Reset", () -> {
            UiSupport_547 a;
UiSupport_547 class_547 = a;
            class_547.y.I.d();
            class_547.y.l.d();
            class_547.y.d.d();
        });
        a2.u = new UiSupport_576(UiMode_598.i, "Done", () -> {
            UiSupport_547 a;
UiSupport_572.D();
            UiSupport_547 class_547 = a;
            class_547.mc.displayGuiScreen(class_547.F);
        });
        UiSupport_547 class_5472 = a2;
        UiSupport_547 class_5473 = a2;
        class_5473.z = new ArrayList<UiSupport_555>();
        class_5473.p = new ArrayList<UiSupport_555>();
        class_5472.n = new ArrayList<UiSupport_555>();
        class_5472.N = new ArrayList<UiSupport_555>();
        class_5472.Ga = new RenderSupport_121[9];
        UiSupport_547 class_5474 = a2;
        UiSupport_547 class_5475 = a2;
        class_5475.k = List.of();
        class_5475.ja = 0;
        class_5474.x = -1;
        class_5474.F = a;
        int n2 = 0;
        while (n2 < a2.Ga.length) {
            int n3 = 0;
            a2.Ga[n3] = new RenderSupport_121(n3 == a2.o ? 1.0f : 0.0f);
            n2 = ++a;
        }
        a2.R.L((String string) -> {
            String a = string;
            UiSupport_547 a2 = this;
UiSupport_547 class_547 = a2;
            class_547.k = UtilitySupport_501.L(a, 400);
            class_547.d = 0.0f;
        });
    }

    @Override
    public void initGui() {
        UiSupport_547 a;
Keyboard.enableRepeatEvents(1 != 0);
        a.Ja = 0L;
        a.k = UtilitySupport_501.L(a.R.L(), 400);
    }

    private static int L(int n, int n2, float f2) {
        int a;
        float a2 = f2;
        int a3 = 0;
a2 = Math.clamp(0, 0.0f, 1.0f);
        int n3 = (int)(0.0f + (float)((0 >>> 24 & 0xFF) - 0) * 0);
        int n4 = (int)(0.0f + (float)((0 >>> 16 & 0xFF) - 0) * 0);
        int n5 = (int)(0.0f + (float)((0 >>> 8 & 0xFF) - 0) * 0);
        a = 0;
        return n3 << 24 | 0 | n5 << 8 | 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawScreen(int n, int n2, float f2) {
        int n3;
        RenderSupport_121[] class_121Array;
        RenderSupport_121[] class_121Array2;
        void a;
        void a2;
        int n4;
        RenderSupport_121[] class_121Array3 = this;
class_121Array3.D();
        float a3 = class_121Array3.L();
        Object a4 = class_121Array3.Ga;
        int n5 = class_121Array3.Ga.length;
        int n6 = 0;
        while (n6 < n5) {
            RenderSupport_121 class_121 = a4[0];
            RenderSupport_121 class_1212 = class_121;
            class_121.L(a3);
            n6 = ++n4;
        }
        a4 = new UiSupport_548(class_121Array3.Ia, a3, (float)a2, (float)a);
        class_121Array3.Ia.i();
        RenderSupport_121[] class_121Array4 = class_121Array3;
        if (class_121Array3.mc.theWorld != null) {
            class_121Array4.Ia.i(0.0f, 0.0f, (float)class_121Array3.width, (float)class_121Array3.height, ThemeSupport_059.L(0.7f));
            class_121Array2 = class_121Array3;
        } else {
            class_121Array4.Ia.L(0.0f, 0.0f, (float)class_121Array3.width, (float)class_121Array3.height);
            class_121Array2 = class_121Array3;
        }
        class_121Array2.Ia.D(class_121Array3.J, class_121Array3.Da, class_121Array3.Ma, class_121Array3.Ea, 28.0f, ThemeSupport_059.L().f());
        RenderSupport_121[] class_121Array5 = class_121Array3;
        RenderSupport_121[] class_121Array6 = class_121Array3;
        RenderSupport_121[] class_121Array7 = class_121Array3;
        class_121Array6.Ia.i(ThemeSupport_057.f, "Inventory rules", class_121Array3.a, class_121Array3.Da + 26.0f, ThemeSupport_059.L().d());
        class_121Array7.Ia.h(ThemeSupport_057.C, class_121Array3.L(), class_121Array3.J + class_121Array3.Ma - 18.0f, class_121Array3.Da + 26.0f + 3.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.85f));
        class_121Array3.h.d((UiSupport_548)a4);
        class_121Array6.h.L((UiSupport_548)a4);
        class_121Array7.p.clear();
        class_121Array5.z.clear();
        class_121Array3.e = null;
        if (class_121Array5.ja == 0) {
            class_121Array3.d((UiSupport_548)a4);
            class_121Array = class_121Array3;
            class_121Array3.Ka = class_121Array3.c + 38.0f + 10.0f;
            class_121Array3.K = UiSupport_547.L(49.0f);
            class_121Array3.L((UiSupport_548)a4, class_121Array3.y.I.L(class_121Array3.o), class_121Array3.o);
        } else {
            class_121Array3.Ka = class_121Array3.c;
            class_121Array3.K = UiSupport_547.L(97.0f);
            class_121Array3.L((UiSupport_548)a4, (List)class_121Array3.L().L(), -1);
            class_121Array = class_121Array3;
        }
        class_121Array.R.d((UiSupport_548)a4);
        RenderSupport_121[] class_121Array8 = class_121Array3;
        class_121Array8.R.L((UiSupport_548)a4);
        class_121Array3.D((UiSupport_548)a4);
        if (class_121Array8.e != null) {
            class_121Array3.Ia.l(ThemeSupport_057.d, class_121Array3.Ia.L(ThemeSupport_057.d, class_121Array3.e, Math.max(40.0f, class_121Array3.W - 276.0f - 16.0f - 12.0f)), class_121Array3.a, class_121Array3.D.D() + 15.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.9f));
        }
        UiSupport_576[] class_576Array = class_121Array3.L();
        n4 = class_576Array.length;
        int n7 = 0;
        while (n7 < 0) {
            UiSupport_576 class_576 = a2 = class_576Array[0];
            class_576.d((UiSupport_548)a4);
            class_576.L((UiSupport_548)a4);
            n7 = ++n3;
        }
        if (class_121Array3.Aa) {
            class_121Array3.L((UiSupport_548)a4);
        }
        class_121Array3.Ia.d();
    }

    private void L(UiSupport_555 class_555) {
        UiSupport_555 a = class_555;
        UiSupport_547 a2 = this;
UiSupport_547 class_547 = a2;
        if (a.L() >= 0) {
            class_547.y.I.d(a.L(), a.L());
            return;
        }
        ItemListSetting class_047 = class_547.L();
        if (class_047 != null) {
            class_047.L(a.L());
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void mouseReleased(int var1_2, int var2_3, int var3_5) {
        a = var2_3;
        a = this;
var4_6 = a.L();
        var5_7 = var4_6.length;
        v0 = var6_8 = 2 & 5;
        while (v0 < var5_7) {
            v1 = var4_6[var6_8];
            v1.d((float)a, a, (int)a);
            v0 = ++var6_8;
        }
        v2 = a;
        v2.R.d((float)a, a, (int)a);
        if (v2.Q == null) ** GOTO lbl25
        v3 = a;
        if (a.Aa) {
            v3.L((float)a, (float)a);
            v4 = a;
        } else {
            if (v3.x < 0) {
                v5 = a;
                v5.L(v5.Q);
            }
lbl25:
            // 4 sources

            v4 = a;
        }
        v4.Q = null;
        a.x = -4 >> 2;
        a.Aa = 5 >> 3;
        super.mouseReleased((int)a, a, (int)a);
    }

    private float d() {
        UiSupport_547 class_547 = this;
int a = new ScaledResolution(class_547.mc).getScaleFactor();
        return (float)(class_547.mc.displayHeight - Minecraft.getScaledMouseY()) / 1.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void keyTyped(char c, int n) throws IOException {
        void a;
        char a2 = c;
        UiSupport_547 a3 = this;
int n2 = 0;
        InputSupport_002 class_002 = new InputSupport_002((int)a, n2, n2, a2);
        if (a3.R.L(class_002)) {
            return;
        }
        if (a2 >= 32 && a3.R.L(new InputSupport_005(a2, 0))) {
            return;
        }
        if (a == 1) {
            a3.L();
            return;
        }
        super.keyTyped(a2, (int)a);
    }

    private float L() {
        UiSupport_547 a;
long l = System.nanoTime();
        if (a.Ja == 0L) {
            a.Ja = l;
            return 16.0f;
        }
        a.Ja = l;
        return Math.min((float)(l - a.Ja) / 1000000.0f, 100.0f);
    }

    /*
     * WARNING - void declaration
     */
    private void d(UiSupport_548 class_548) {
        int n;
        UiSupport_547 class_547 = this;
float f2 = 382.0f;
        UiSupport_547 class_5472 = class_547;
        f2 = class_5472.J + (class_5472.Ma - f2) / 2.0f;
        int n2 = 0;
        while (n2 < 9) {
            List<UtilitySupport_505> list;
            float f3;
            void a;
            float a2 = f2 + 0.0f;
            UiSupport_547 class_5473 = class_547;
            class_5473.z.add(new UiSupport_555(0, class_547.c, 38.0f, 38.0f, null, 0));
            int n3 = class_5473.Aa && a.H >= 0 && a.H < 38.0f && a.f >= class_547.c && a.f < class_547.c + 38.0f ? 1 : 0;
            float f4 = class_547.Ga[0].L();
            int n4 = ThemeSupport_059.L().n();
            int n5 = n3 != 0 ? ThemeSupport_059.L().J() : UiSupport_547.L(n4, ThemeSupport_059.L().G(), f4);
            class_547.Ia.D(0, class_547.c, 38.0f, 38.0f, 8.0f, n5);
            float f5 = Math.max(f4, n3 != 0 ? 1.0f : 0.0f);
            if (f3 > 0.01f) {
                class_547.Ia.L(0, class_547.c, 38.0f, 38.0f, 8.0f, 1.5f, ThemeSupport_059.L(ThemeSupport_059.L().E(), f5));
            }
            if (!(list = class_547.y.I.L(0)).isEmpty()) {
                class_547.L(list.get(0).L(), 9.0f, class_547.c + 13.0f + 2.5f, 20.0f);
            }
            if (list.size() > 1) {
                class_547.Ia.h(ThemeSupport_057.h, new StringBuilder().insert(0, "+").append(list.size() - 1).toString(), 35.0f, class_547.c + 38.0f - 11.0f, ThemeSupport_059.L().d());
            }
            String string = String.valueOf(1);
            class_547.Ia.I(ThemeSupport_057.h, string, 19.0f, class_547.c + 4.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.55f + 0.4f * f4));
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClickMove(int n, int n2, int n3, long l) {
        void a;
        void a2;
        void a3;
        int a4 = n2;
        UiSupport_547 a5 = this;
if (a5.Q != null && !a5.Aa && (Math.abs((float)a3 - a5.la) > 3.0f || Math.abs(0.0f - a5.t) > 3.0f)) {
            a5.Aa = 1;
        }
        if (a5.Aa) {
            return;
        }
        super.mouseClickMove((int)a3, 0, (int)a2, (long)a);
    }

    private void L(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        UiSupport_547 a2 = this;
if (a == null) {
            return;
        }
        ItemListSetting class_047 = a2.L();
        if (class_047 != null) {
            class_047.D(a);
            return;
        }
        UiSupport_547 class_547 = a2;
        if (a2.y.I.L(a2.o).contains(a)) {
            class_547.y.I.d(a2.o, a);
            return;
        }
        class_547.y.I.L(a2.o, a);
    }

    private static float L(float f2) {
        float f3 = f2;
float a = 27.0f;
        return (float)Math.max(1, (int)((f3 + 5.0f) / 0)) * 0 - 5.0f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(ItemStack itemStack, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        ItemStack a4 = itemStack;
        UiSupport_547 a5 = this;
if (a4 == null || a4.getItem() == null) {
            return;
        }
        UiSupport_547 class_547 = a5;
        class_547.Ia.F();
        class_547.Ia.L((float)a3, (float)a2);
        class_547.Ia.L((float)(a / 16.0f), 0.0f, 0.0f);
        class_547.Ia.L(a4, 0.0f, 0.0f);
        class_547.Ia.k();
    }

    private String L() {
        UiSupport_547 a;
if (a.ja == 0) {
            return "Pick a slot, then click or drag an item onto it";
        }
        if (a.ja == 1) {
            return "Never thrown away, even if the Drop list says so";
        }
        return "Thrown away when Drop junk is on";
    }

    @Override
    public boolean doesGuiPauseGame() {
return 0 != 0;
    }

    private void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_547 a2 = this;
if (a2.Q == null) {
            return;
        }
        UiSupport_547 class_547 = a2;
        class_547.L(class_547.Q.L(), a.H - 6.5f, a.f - 6.5f, 13.0f);
    }

    private float L(UtilitySupport_505 class_505) {
        UtilitySupport_505 a = class_505;
        UiSupport_547 a2 = this;
return 33.0f + a2.Ia.L(ThemeSupport_057.d, a2.L(a)) + 4.0f + 9.0f;
    }

    /*
     * WARNING - void declaration
     */
    private void L(UtilitySupport_505 class_505, int n, float f2, float f3) {
        void a;
        void a2;
        void a3;
        void a4;
        float f4 = f3;
        UiSupport_547 a5 = this;
UiSupport_547 class_547 = a5;
        UiSupport_547 class_5472 = a5;
        a5.Q = a4;
        class_5472.x = a3;
        class_5472.la = a2;
        class_547.t = a;
        class_547.Aa = 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(UtilitySupport_505 class_505) {
        void a;
        UiSupport_547 class_547 = this;
ItemListSetting a2 = class_547.L();
        if (a2 == null) {
            return class_547.y.I.L(class_547.o).contains(a);
        }
        return a2.L((UtilitySupport_505)a);
    }

    /*
     * WARNING - void declaration
     */
    private float L(UiSupport_548 class_548, float f2) {
        void a;
        int n;
        UiSupport_547 class_547 = this;
float a2 = class_547.a;
        UtilityMode_475[] enum_475Array = UtilityMode_475.values();
        int n2 = enum_475Array.length;
        int n3 = 0;
        while (n3 < n2) {
            void a3;
            int n4;
            UtilitySupport_505 class_505 = UtilitySupport_505.L(enum_475Array[0]);
            float f3 = class_547.L(class_505);
            UiSupport_547 class_5472 = class_547;
            if (0 + f3 > class_5472.a + class_5472.W - 7.0f && 0 > class_547.a) {
                a2 = class_547.a;
                a += 27.0f;
            }
            boolean bl = class_547.L(class_505);
            int n5 = n4 = a3.H >= 0 && a3.H < 0 + f3 && a3.f >= a && a3.f < a + 22.0f && a3.f >= class_547.Y && a3.f < class_547.j ? 1 : 0;
            int n6 = bl ? ThemeSupport_059.L().J() : (n4 != 0 ? ThemeSupport_059.L().n() : ThemeSupport_059.L().O());
            UiSupport_547 class_5473 = class_547;
            class_5473.Ia.D(0, (float)a, f3, 22.0f, Float.MAX_VALUE, n6);
            class_5473.L(class_505.L(), 8.0f, (float)(a + 4.5f), 13.0f);
            class_5473.Ia.l(ThemeSupport_057.d, class_547.L(class_505), 25.0f, (float)(a + 11.0f), bl ? ThemeSupport_059.L().c() : ThemeSupport_059.L().d());
            if (bl) {
                UiSupport_546.d(class_547.Ia, 0 + f3 - 8.0f - 4.5f, (float)(a + 11.0f), 11.0f, ThemeSupport_059.L().c());
            }
            class_547.n.add(new UiSupport_555(0, (float)a, f3, 22.0f, class_505, -1));
            a2 += f3 + 5.0f;
            n3 = ++n;
        }
        return (float)(a + 22.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        void a3;
        int n4;
        UiSupport_547 class_547 = this;
Object object = class_547.L();
        int a42 = ((UiSupport_576[])object).length;
        int n5 = 0;
        while (n5 < a42) {
            if (object[0].L((float)a3, (float)a2, (int)a)) {
                return;
            }
            n5 = ++n4;
        }
        if (class_547.h.L((float)a3, (float)a2, (int)a)) {
            return;
        }
        if (class_547.R.L((float)a3, (float)a2, (int)a)) {
            return;
        }
        if (a != false) {
            super.mouseClicked((int)a3, (int)a2, (int)a);
            return;
        }
        Object object2 = object = class_547.z.iterator();
        while (object2.hasNext()) {
            UiSupport_555 a42 = (UiSupport_555)object.next();
            if (!a42.L((float)a3, (float)a2)) {
                object2 = object;
                continue;
            }
            class_547.d(a42.L());
            return;
        }
        Object object3 = object = class_547.p.iterator();
        while (object3.hasNext()) {
            UiSupport_555 a42 = (UiSupport_555)object.next();
            if (!a42.L((float)a3, (float)a2)) {
                object3 = object;
                continue;
            }
            if ((float)a3 >= a42.d() + a42.i() - 8.0f - 9.0f - 2.0f) {
                class_547.L(a42);
                return;
            }
            class_547.L(a42.L(), a42.L(), (float)a3, (float)a2);
            return;
        }
        if ((float)a2 >= class_547.Y && (float)a2 < class_547.j) {
            Object object4 = object = class_547.n.iterator();
            while (object4.hasNext()) {
                UiSupport_555 a42 = (UiSupport_555)object.next();
                if (!a42.L((float)a3, (float)a2)) {
                    object4 = object;
                    continue;
                }
                class_547.L(a42.L(), -1, (float)a3, (float)a2);
                return;
            }
            Object object5 = object = class_547.N.iterator();
            while (object5.hasNext()) {
                UiSupport_555 a42 = (UiSupport_555)object.next();
                if (!a42.L((float)a3, (float)a2)) {
                    object5 = object;
                    continue;
                }
                class_547.L(a42.L(), -1, (float)a3, (float)a2);
                return;
            }
        }
        super.mouseClicked((int)a3, (int)a2, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiSupport_548 class_548, List<UtilitySupport_505> list, int n) {
        Iterator a;
        UiSupport_547 class_547 = this;
if (a.isEmpty()) {
            class_547.v = 0.0f;
            class_547.m = 0.0f;
            UiSupport_547 class_5472 = class_547;
            class_547.Ia.i(ThemeSupport_057.C, class_547.d(), class_5472.a, class_5472.Ka + 4.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.6f));
            return;
        }
        UiSupport_547 class_5473 = class_547;
        UiSupport_547 class_5474 = class_547;
        UiSupport_547 class_5475 = class_547;
        class_5473.Ia.d(class_5473.a, class_5474.Ka, class_5475.W, class_5475.K);
        float f2 = class_5474.a;
        float a2 = class_5473.Ka - class_547.m;
        Iterator iterator = a = a.iterator();
        while (iterator.hasNext()) {
            UtilitySupport_505 class_505 = (UtilitySupport_505)a.next();
            float f3 = class_547.L(class_505);
            UiSupport_547 class_5476 = class_547;
            if (f2 + f3 > class_5476.a + class_5476.W - 7.0f && f2 > class_547.a) {
                f2 = class_547.a;
                a2 += 27.0f;
            }
            if (22.0f >= class_547.Ka) {
                UiSupport_547 class_5477 = class_547;
                if (0 < class_5477.Ka + class_5477.K) {
                    void a3;
                    void a4;
                    int n2 = a4.H >= f2 && a4.H < f2 + f3 && a4.f >= 0 && a4.f < 22.0f ? 1 : 0;
                    class_547.Ia.D(f2, 0, f3, 22.0f, Float.MAX_VALUE, n2 != 0 ? ThemeSupport_059.L().G() : ThemeSupport_059.L().n());
                    UiSupport_547 class_5478 = class_547;
                    class_5478.L(class_505.L(), f2 + 8.0f, 4.5f, 13.0f);
                    UiSupport_547 class_5479 = class_547;
                    class_5478.Ia.l(ThemeSupport_057.d, class_5479.L(class_505), f2 + 8.0f + 13.0f + 4.0f, 11.0f, ThemeSupport_059.L().d());
                    UiSupport_546.D(class_5479.Ia, f2 + f3 - 8.0f - 4.5f, 11.0f, 9.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), n2 != 0 ? 1.0f : 0.7f));
                    class_547.p.add(new UiSupport_555(f2, 0, f3, 22.0f, class_505, (int)a3));
                }
            }
            f2 += f3 + 5.0f;
            iterator = a;
        }
        UiSupport_547 class_54710 = class_547;
        class_547.Ia.L();
        UiSupport_547 class_54711 = class_547;
        class_547.v = Math.max(0.0f, 22.0f + class_547.m - (class_54711.Ka + class_54711.K));
        class_547.m = Math.min(class_54710.m, class_547.v);
        UiSupport_547 class_54712 = class_547;
        class_54710.L(class_54710.Ka, class_54712.K, class_54712.m, class_547.v);
    }

    @Override
    public void onGuiClosed() {
Keyboard.enableRepeatEvents(0 != 0);
        UiSupport_572.D();
    }

    private UiSupport_576[] L() {
        UiSupport_547 a;
UiSupport_576[] class_576Array = new UiSupport_576[3];
        class_576Array[0] = a.D;
        class_576Array[1] = a.aa;
        class_576Array[2] = a.u;
        return class_576Array;
    }
}

