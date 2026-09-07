/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.io.IOException;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.item.ItemStack;
import openonyx.connection.NetworkSupport_453;
import openonyx.core.OnyxClient;
import openonyx.features.render.ESP;
import openonyx.features.render.FeatureSupport_298;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiMode_598;
import openonyx.utilities.UtilitySupport_489;

public class UiSupport_558
extends GuiScreen {
    private float R;
    private final RenderSupport_103 p;
    private final static float t = 3.0f;
    private final static float b = 16.0f;
    private final static int E = 2;
    private final static int F = 0;
    private final static float G = 16.0f;
    private final RenderSupport_121 A;
    private final ESP K;
    private float B;
    private long C;
    private float[] J;
    private int D;
    private final UiSupport_576 c;
    private float a;
    private float k;
    private final RenderSupport_121 g;
    private final RenderSupport_121 M;
    private final static float L = 100.0f;
    private final RenderSupport_121 j;
    private final UiSupport_576 m;
    private float h;
    private final UiSupport_576 l;
    private float[] I;
    private float d;
    private final GuiScreen i;
    private float f;
    private final static int H = 1;
    private boolean e;

    @Override
    public boolean doesGuiPauseGame() {
return 0 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(float[] fArray, boolean bl, String string) {
        int n;
        float f2;
        void a;
        Object a2 = fArray;
        UiSupport_558 a3 = this;
int n2 = a != false ? ThemeSupport_059.L().E() : ThemeSupport_059.L(ThemeSupport_059.L().d(), 0.4f);
        RenderSupport_103 class_103 = a3.p;
        reference v4 = a2[0] - 3.0f;
        v4 = a2[1] - 3.0f;
        v4 = a2[2] + 6.0f;
        v4 = a2[3] + 6.0f;
        if (a != false) {
            f2 = 1.5f;
            n = n2;
        } else {
            f2 = 1.0f;
            n = n2;
        }
        class_103.L((float)v1, (float)v2, (float)v3, (float)v4, 8.0f, f2, n);
        if (a != false) {
            void a4;
            a3.p.I(ThemeSupport_057.C, (String)a4, (float)(a2[0] + a2[2] / 2.0f), (float)(a2[1] - 3.0f - 3.0f - ThemeSupport_057.C.I()), n2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void d(int n, int n2) {
        void a;
        void a2;
        float f2;
        UiSupport_558 class_558 = this;
UiSupport_558 class_5582 = class_558;
        float f3 = class_558.K.L(class_5582.h);
        Object a3 = class_5582.K.d(class_558.mc.thePlayer);
        List<ItemStack> list = a3.isEmpty() ? class_558.K.D() : a3;
        a3 = null;
        FeatureSupport_298 class_298 = null;
        UiSupport_558 class_5583 = class_558;
        float f4 = class_558.a + class_5583.B / 2.0f;
        UiSupport_558 class_5584 = class_558;
        UiSupport_558 class_5585 = class_558;
        UiSupport_558 class_5586 = class_558;
        float f5 = f4;
        for (FeatureSupport_298 class_2982 : class_5583.K.L(class_5584.p, class_5584.mc.thePlayer, class_5585.a, class_5585.d, class_5586.B, class_5586.h, f5, f5, 3 >> 1)) {
            if (class_2982.L() == 0) {
                a3 = class_2982;
                continue;
            }
            class_298 = a3;
        }
        class_558.J = null;
        class_558.I = null;
        if (a3 != null) {
            boolean bl = !class_558.e || class_558.K.F.d() && class_558.D == 1;
            UiSupport_558 class_5587 = class_558;
            float f6 = class_5587.L(class_5587.j, ((FeatureSupport_298)a3).L(), bl);
            f2 = class_5587.L(class_5587.A, ((FeatureSupport_298)a3).D(), bl);
            UiSupport_558 class_5588 = class_558;
            class_5587.K.L(class_5588.p, class_5588.mc.thePlayer, f6, f2, f3);
            float[] fArray = new float[4];
            fArray[0] = f6 - ((FeatureSupport_298)a3).d() / 2.0f;
            fArray[1] = f2 - ((FeatureSupport_298)a3).i() / 2.0f;
            fArray[2] = ((FeatureSupport_298)a3).d();
            fArray[3] = ((FeatureSupport_298)a3).i();
            class_5587.J = fArray;
        }
        if (class_298 != null) {
            boolean bl = !class_558.e || class_558.K.F.d() && class_558.D == 2;
            UiSupport_558 class_5589 = class_558;
            float f7 = class_5589.L(class_5589.M, class_298.L(), bl);
            f2 = class_5589.L(class_5589.g, class_298.D(), bl);
            UiSupport_558 class_55810 = class_558;
            class_5589.K.L(class_55810.p, class_55810.mc.thePlayer, f7, f2, f3, list, class_298.L());
            float[] fArray = new float[4];
            fArray[0] = f7 - class_298.d() / 2.0f;
            fArray[1] = f2 - class_298.i() / 2.0f;
            fArray[2] = class_298.d();
            fArray[3] = class_298.i();
            class_5589.I = fArray;
        }
        class_558.e = 1;
        if (class_558.J != null) {
            UiSupport_558 class_55811 = class_558;
            class_55811.L(class_558.J, class_55811.L(1, class_558.J, (int)a2, (int)a), "Name");
        }
        if (class_558.I != null) {
            UiSupport_558 class_55812 = class_558;
            class_55812.L(class_558.I, class_55812.L(2, class_558.I, (int)a2, (int)a), "Equipment");
        }
        if (class_558.D != 0 && !class_558.K.F.d()) {
            class_558.L();
        }
    }

    public UiSupport_558(GuiScreen guiScreen) {
        GuiScreen a = guiScreen;
        UiSupport_558 a2 = this;
        a2.K = OnyxClient.l.v;
        UiSupport_558 class_558 = a2;
        class_558.p = new RenderSupport_103();
        a2.c = new UiSupport_576(UiMode_598.d, "Reset", () -> {
            UiSupport_558 a;
UiSupport_558 class_558 = a;
            class_558.K.c.d();
            class_558.K.I.d();
            class_558.K.W.d();
            class_558.K.j.d();
            class_558.K.G.d();
            class_558.K.V.d();
            class_558.K.q.i(0 != 0);
            class_558.K.F.i(5 >> 3);
            class_558.m.L("Unlock");
        });
        a2.m = new UiSupport_576(UiMode_598.e, "Unlock", () -> {
            UiSupport_558 a;
UiSupport_558 class_558 = a;
            class_558.K.F.D();
            class_558.m.L(a.K.F.d() ? "Snap to slots" : "Unlock");
        });
        a2.l = new UiSupport_576(UiMode_598.i, "Done", () -> {
            UiSupport_558 a;
UiSupport_558 class_558 = a;
            class_558.mc.displayGuiScreen(class_558.i);
        });
        UiSupport_558 class_5582 = a2;
        UiSupport_558 class_5583 = a2;
        class_5583.D = 0;
        class_5583.j = new RenderSupport_121(0.0f);
        class_5583.A = new RenderSupport_121(0.0f);
        class_5582.M = new RenderSupport_121(0.0f);
        class_5582.g = new RenderSupport_121(0.0f);
        class_5582.i = a;
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_121 class_121, float f2, boolean bl) {
        RenderSupport_121 class_1212;
        void a;
        RenderSupport_121 a2 = class_121;
        UiSupport_558 a3 = this;
Object object = a2;
        if (a != false) {
            ((RenderSupport_121)object).L((float)a);
            class_1212 = a2;
        } else {
            if (Math.abs(((RenderSupport_121)object).d() - a) > 0.01f) {
                a2.L((float)a, 200.0f, RenderSupport_123.l);
            }
            class_1212 = a2;
        }
        class_1212.L(a3.R);
        return a2.L();
    }

    /*
     * WARNING - void declaration
     */
    private int L(float f2, float f3) {
        void v1;
        void a;
        float a2 = f2;
        UiSupport_558 a3 = this;
UiSupport_558 class_558 = a3;
        float f4 = a3.a + class_558.B / 2.0f;
        float f5 = class_558.d + a3.h / 2.0f;
        a2 = (0 - f4) / (a3.B / 2.0f + 1.0f);
        a = (a - f5) / (a3.h / 2.0f + 1.0f);
        if (Math.abs((float)v1) >= Math.abs(0)) {
            if (a < 0.0f) {
                return 0;
            }
            return 3;
        }
        if (0 < 0.0f) {
            return 1;
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, float[] fArray, float f2, float f3) {
        void a;
        void a2;
        void a3;
        Object a4 = fArray;
        UiSupport_558 a5 = this;
UiSupport_558 class_558 = a5;
        a5.D = a3;
        class_558.k = a2 - (a4[0] + a4[2] / 2.0f);
        class_558.f = a - (a4[1] + a4[3] / 2.0f);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(int n, float[] fArray, int n2, int n3) {
        void a;
        void a2;
        void a3;
        void a4;
        int n4 = n3;
        UiSupport_558 a5 = this;
if (a5.D == a4) {
            return --1 != 0;
        }
        if (a5.D == 0 && UiSupport_558.L((float[])a3, (float)a2, 0.0f)) {
            return 1 != 0;
        }
        return false;
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
        UiSupport_558 a5 = this;
if (a5.D != 0) {
            a5.L((float)a3, 0.0f);
            return;
        }
        super.mouseClickMove((int)a3, 0, (int)a2, (long)a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, int n2) {
        void a;
        int a22 = 0;
        UiSupport_558 a3 = this;
UiSupport_558 class_558 = a3;
        class_558.p.I(ThemeSupport_057.l, "ESP layout", (float)a3.width / 2.0f, 22.0f, ThemeSupport_059.L().d());
        class_558.p.I(ThemeSupport_057.C, "Drag the name and equipment around the player", (float)a3.width / 2.0f, 44.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.85f));
        UiSupport_558 class_5582 = a3;
        UiSupport_548 a22 = new UiSupport_548(class_5582.p, a3.R, 0, (float)a);
        class_5582.c.d(a22);
        class_558.m.d(a22);
        class_558.l.d(a22);
        class_558.c.L(a22);
        class_558.m.L(a22);
        class_558.l.L(a22);
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3) {
        void a;
        void a2;
        UiSupport_558 class_558 = this;
if (class_558.B <= 0.0f || class_558.h <= 0.0f) {
            return;
        }
        if (class_558.K.F.d()) {
            UiSupport_558 class_5582 = class_558;
            UiSupport_558 class_5583 = class_558;
            float a3 = class_5582.a + class_5583.B / 2.0f;
            float f4 = class_5582.d + class_558.h / 2.0f;
            NumberSetting class_052 = class_5583.D == 1 ? class_558.K.W : class_558.K.G;
            NumberSetting class_0522 = class_558.D == 1 ? class_558.K.j : class_558.K.V;
            class_052.i((double)((a2 - class_558.k - a3) / class_558.h));
            class_0522.i((double)((a - class_558.f - f4) / class_558.h));
            return;
        }
        UiSupport_558 class_5584 = class_558;
        int a3 = class_5584.L((float)a2, (float)a);
        NumberSetting class_052 = class_5584.D == 1 ? class_558.K.c : class_558.K.I;
        int n = 0;
        class_052.i(Double.valueOf(n));
        class_558.L(n, (float)a);
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, float f2) {
        void a32;
        int a22 = n;
        UiSupport_558 a = this;
if (!a.K.d.d() || !a.K.R.d()) {
            return;
        }
        if ((a.D == 1 ? a.K.I : a.K.c).d() != 0) {
            return;
        }
        float[] fArray = a22 = a.D == 1 ? a.I : a.J;
        if (a22 == null) {
            return;
        }
        float a22 = a22[1] + a22[3] / 2.0f;
        int n2 = a22 = a32 - a.f < a22 ? 1 : 0;
        int a32 = a.D == 1 ? a22 : (a22 == 0 ? 1 : 0);
        a.K.q.i((a32 == 0 ? 1 : 0) != 0);
    }

    @Override
    public void initGui() {
        UiSupport_558 a;
a.C = 0L;
        a.m.L(a.K.F.d() ? "Snap to slots" : "Unlock");
    }

    private void l() {
        UiSupport_558 a;
UiSupport_558 class_558 = a;
        class_558.p.d();
        UiSupport_558 class_5582 = a;
        GuiInventory.drawEntityOnScreen(class_558.width / 2, (int)(a.d + class_5582.h), (int)(a.h * 0.5f), 0.0f, 0.0f, a.mc.thePlayer);
        class_5582.p.i();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_558 a3 = this;
if (a3.J != null && UiSupport_558.L(a3.J, 0.0f, 0)) {
            boolean bl = 1;
            UiSupport_558 class_558 = a3;
            class_558.L(bl ? 1 : 0, class_558.J, 0.0f, 0);
            return bl;
        }
        if (a3.I != null && UiSupport_558.L(a3.I, 0.0f, 0)) {
            UiSupport_558 class_558 = a3;
            class_558.L(2, class_558.I, 0.0f, 0);
            return 1 != 0;
        }
        return false;
    }

    private void I() {
        UiSupport_558 class_558 = this;
float a = 118.0f;
        float f2 = 10.0f;
        float f3 = 0.0f + f2 * 2.0f;
        UiSupport_558 class_5582 = class_558;
        f3 = (float)class_5582.width / 2.0f - f3 / 2.0f;
        float f4 = (float)class_5582.height - 46.0f;
        class_5582.c.L(f3, f4, 0, 30.0f);
        class_5582.m.L(f3 + 0 + f2, f4, 0, 30.0f);
        class_5582.l.L(f3 + (0 + f2) * 2.0f, f4, 0, 30.0f);
    }

    private void i() {
        UiSupport_558 class_558 = this;
UiSupport_558 class_5582 = class_558;
        float a = class_5582.mc.thePlayer.width / class_558.mc.thePlayer.height;
        class_558.h = (float)class_5582.height * 0.5f;
        class_5582.d = (float)class_5582.height / 2.0f - class_558.h / 2.0f;
        class_5582.B = class_5582.h * 0;
        class_5582.a = (float)class_5582.width / 2.0f - class_558.B / 2.0f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseReleased(int n, int n2, int n3) {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_558 a4 = this;
a4.D = 0;
        a4.c.d((float)a2, (float)a, a3);
        a4.m.d((float)a2, (float)a, a3);
        a4.l.d((float)a2, (float)a, a3);
        super.mouseReleased((int)a2, (int)a, a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void keyTyped(char c, int n) throws IOException {
        void a;
        int a2 = 0;
        UiSupport_558 a3 = this;
if (0 == 1) {
            a3.D();
            return;
        }
        super.keyTyped((char)a, 0);
    }

    private float L() {
        UiSupport_558 a;
long l = System.nanoTime();
        if (a.C == 0L) {
            a.C = l;
            return 16.0f;
        }
        a.C = l;
        return Math.min((float)(l - a.C) / 1000000.0f, 100.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawScreen(int n, int n2, float f2) {
        void a;
        UiSupport_558 class_558;
        int a2 = n2;
        UiSupport_558 a3 = this;
UiSupport_558 class_5582 = a3;
        class_5582.R = class_5582.L();
        class_5582.I();
        class_5582.p.i();
        UiSupport_558 class_5583 = a3;
        if (class_5582.mc.theWorld != null) {
            class_5583.p.i(0.0f, 0.0f, (float)a3.width, (float)a3.height, ThemeSupport_059.L(0.55f));
            class_558 = a3;
        } else {
            class_5583.p.L(0.0f, 0.0f, (float)a3.width, (float)a3.height);
            class_558 = a3;
        }
        if (class_558.mc.thePlayer != null) {
            UiSupport_558 class_5584 = a3;
            class_5584.i();
            class_5584.l();
            class_5584.d(0, 0);
        }
        UiSupport_558 class_5585 = a3;
        class_5585.L(0, 0);
        class_5585.p.d();
    }

    /*
     * WARNING - void declaration
     */
    private static boolean L(float[] fArray, float f2, float f3) {
        void a;
        float a2 = f3;
        float[] a3 = fArray;
if (a >= a3[0] && a <= a3[0] + a3[2] && 0 >= a3[1] && 0 <= a3[1] + a3[3]) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, int n2, float f2, float f3) {
        void a;
        void a2;
        int n3;
        float f4;
        int a3;
        int a4 = n2;
        UiSupport_558 a5 = this;
a3 = a3 == 0 ? 1 : 0;
        a4 = a3 != 0 ? ThemeSupport_059.L().E() : ThemeSupport_059.L(ThemeSupport_059.L().d(), 0.3f);
        RenderSupport_103 class_103 = a5.p;
        if (a3 != 0) {
            f4 = 4.0f;
            n3 = 0;
        } else {
            f4 = 2.5f;
            n3 = 0;
        }
        class_103.L((float)a2, (float)a, f4, n3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_558 a4 = this;
if (a3 == 0 && a4.L((float)a2, (float)a)) {
            return;
        }
        if (a4.c.L((float)a2, (float)a, a3)) {
            return;
        }
        if (a4.m.L((float)a2, (float)a, a3)) {
            return;
        }
        if (a4.l.L((float)a2, (float)a, a3)) {
            return;
        }
        super.mouseClicked((int)a2, (int)a, a3);
    }

    private void L() {
        UiSupport_558 class_558 = this;
int a = (class_558.D == 1 ? class_558.K.c : class_558.K.I).d();
        UiSupport_558 class_5582 = class_558;
        UiSupport_558 class_5583 = class_558;
        float f2 = class_5582.a + class_5583.B / 2.0f;
        float f3 = class_5582.d + class_558.h / 2.0f;
        class_5583.L(0, 0, f2, class_558.d - 16.0f);
        UiSupport_558 class_5584 = class_558;
        class_5582.L(3, 0, f2, class_5584.d + class_5584.h + 16.0f);
        class_5582.L(1, 0, class_558.a - 16.0f, f3);
        UiSupport_558 class_5585 = class_558;
        class_5582.L(2, 0, class_5585.a + class_5585.B + 16.0f, f3);
    }
}

