/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import openonyx.core.OnyxClient;
import openonyx.events.ChatTransformer;
import openonyx.features.render.CapeChanger;
import openonyx.history.Range;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderMode_138;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.render.group_g.RenderMode_134;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiMode_598;
import org.lwjgl.input.Mouse;

public class UiSupport_562
extends GuiScreen {
    private float G;
    private boolean A;
    private final GuiScreen K;
    private double B;
    private float C;
    private float J;
    private final CapeChanger D;
    private double c;
    private final static float a = 0.625f;
    private final UiSupport_576 k;
    private final static float g = 8.0f;
    private final static float M = 96.0f;
    private final UiSupport_576 L;
    private final UiSupport_576 j;
    private final RenderSupport_103 m;
    private final UiSupport_576 h;
    private final static float l = 1.12f;
    private final static float I = 0.56f;
    private final UiSupport_576 d;
    private final static ResourceLocation i = new ResourceLocation("onyx", "capes/source");
    private float f;
    private float H;
    private float e;

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClickMove(int n, int n2, int n3, long l) {
        void a;
        int a2 = n2;
        UiSupport_562 a3 = this;
if (!a3.A) {
            void a4;
            void a5;
            super.mouseClickMove(0, 0, (int)a5, (long)a4);
            return;
        }
        UiSupport_562 class_562 = a3;
        class_562.D.k.i(a3.c + (double)((0.0f - a3.e) / a3.f) * 100.0);
        class_562.D.I.i(a3.B + (double)((0.0f - a3.G) / a3.H) * 100.0);
    }

    private UiSupport_576[] L() {
        UiSupport_562 a;
UiSupport_576[] class_576Array = new UiSupport_576[5];
        class_576Array[0] = a.d;
        class_576Array[1] = a.k;
        class_576Array[2] = a.h;
        class_576Array[3] = a.L;
        class_576Array[4] = a.j;
        return class_576Array;
    }

    @Override
    public void handleMouseInput() throws IOException {
        UiSupport_562 class_562 = this;
super.handleMouseInput();
        int a = Mouse.getEventDWheel();
        if (0 == 0 || class_562.D.L() == null) {
            return;
        }
        double d = 0 > 0 ? (double)1.12f : 0.8928571390558262;
        class_562.D.g.i((Double)class_562.D.g.L() * d);
        class_562.D.l();
    }

    @Override
    public boolean doesGuiPauseGame() {
return 3 >> 2;
    }

    public UiSupport_562(GuiScreen guiScreen) {
        GuiScreen a = guiScreen;
        UiSupport_562 a2 = this;
        a2.D = OnyxClient.l.D;
        UiSupport_562 class_562 = a2;
        class_562.m = new RenderSupport_103();
        a2.d = new UiSupport_576(UiMode_598.d, "Fit", () -> {
            UiSupport_562 a;
a.L(RenderMode_134.i);
        });
        a2.k = new UiSupport_576(UiMode_598.d, "Fill", () -> {
            UiSupport_562 a;
a.L(RenderMode_134.I);
        });
        a2.h = new UiSupport_576(UiMode_598.d, "Stretch", () -> {
            UiSupport_562 a;
a.L(RenderMode_134.e);
        });
        a2.L = new UiSupport_576(UiMode_598.e, "Reset", () -> {
            UiSupport_562 a;
UiSupport_562 class_562 = a;
            class_562.D.g.d();
            class_562.D.k.d();
            class_562.D.I.d();
            class_562.D.l();
        });
        a2.j = new UiSupport_576(UiMode_598.i, "Done", () -> {
            UiSupport_562 a;
UiSupport_562 class_562 = a;
            class_562.D.d(5 >> 3);
            class_562.mc.displayGuiScreen(a.K);
        });
        a2.K = a;
    }

    private void L(BufferedImage bufferedImage) {
        Object a = bufferedImage;
        UiSupport_562 a2 = this;
UiSupport_562 class_562 = a2;
        UiSupport_562 class_5622 = a2;
        UiSupport_562 class_5623 = a2;
        class_562.m.i(class_562.C, class_5622.J, class_5623.f, class_5623.H, (int)(a2.D.i.L() | 0xFF000000));
        double[] dArray = RenderSupport_137.L((BufferedImage)a, RenderSupport_137.L((RenderMode_134)class_5622.D.f.L(), (BufferedImage)a), a2.f, a2.H, (Double)a2.D.g.L() / 100.0, (Double)a2.D.k.L() / 100.0, (Double)a2.D.I.L() / 100.0);
        UiSupport_562 class_5624 = a2;
        UiSupport_562 class_5625 = a2;
        UiSupport_562 class_5626 = a2;
        class_5624.m.d(class_5625.C, class_5626.J, class_5626.f, a2.H);
        class_5624.m.L(i, a2.C + (float)dArray[0], a2.J + (float)dArray[1], (float)dArray[2], (float)dArray[3], 0.0f, 0.0f, ((BufferedImage)a).getWidth(), ((BufferedImage)a).getHeight(), ((BufferedImage)a).getWidth(), ((BufferedImage)a).getHeight(), -1, RenderMode_138.d);
        class_5625.m.L();
        UiSupport_562 class_5627 = a2;
        UiSupport_562 class_5628 = a2;
        class_5624.m.L(class_5627.C, class_5627.J, class_5628.f, class_5628.H, 8.0f, 1.5f, ThemeSupport_059.L().E());
        class_5624.m.I(ThemeSupport_057.C, "top", (float)a2.width / 2.0f, a2.J - 14.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.7f));
        a = RenderSupport_137.L((RenderMode_134)a2.D.f.L(), (BufferedImage)a).L() + "  ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â·  " + Math.round((Double)a2.D.g.L()) + "%";
        UiSupport_562 class_5629 = a2;
        a2.m.I(ThemeSupport_057.C, (String)a, (float)a2.width / 2.0f, class_5629.J + class_5629.H + 8.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.85f));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void keyTyped(char c, int n) throws IOException {
        void a;
        int a2 = 0;
        UiSupport_562 a3 = this;
if (0 == 1) {
            a3.i();
            return;
        }
        super.keyTyped((char)a, 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawScreen(int n, int n2, float f2) {
        int n3;
        void a42;
        void a32;
        UiSupport_562 class_562;
        float a522 = f2;
        UiSupport_562 a = this;
UiSupport_562 class_5622 = a;
        class_5622.L();
        class_5622.m.i();
        UiSupport_562 class_5623 = a;
        if (class_5622.mc.theWorld != null) {
            class_5623.m.i(0.0f, 0.0f, (float)a.width, (float)a.height, ThemeSupport_059.L(0.7f));
            class_562 = a;
        } else {
            class_5623.m.L(0.0f, 0.0f, (float)a.width, (float)a.height);
            class_562 = a;
        }
        class_562.m.I(ThemeSupport_057.l, "Cape", (float)a.width / 2.0f, 22.0f, ThemeSupport_059.L().d());
        UiSupport_562 class_5624 = a;
        class_5624.m.I(ThemeSupport_057.C, "Drag to move, scroll to zoom", (float)a.width / 2.0f, 44.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.85f));
        BufferedImage a522 = class_5624.D.L();
        UiSupport_562 class_5625 = a;
        if (a522 == null) {
            class_5625.m.I(ThemeSupport_057.l, "No cape picture loaded", (float)a.width / 2.0f, (float)a.height / 2.0f, ThemeSupport_059.L(ThemeSupport_059.L().d(), 0.6f));
        } else {
            class_5625.L(a522);
        }
        UiSupport_548 a32 = new UiSupport_548(a.m, 16.0f, (float)a32, (float)a42);
        UiSupport_576[] a42 = a.L();
        int a522 = a42.length;
        int n4 = 0;
        while (n4 < a522) {
            UiSupport_576 class_576;
            UiSupport_576 class_5762 = class_576 = a42[0];
            class_5762.d(a32);
            class_5762.L(a32);
            n4 = ++n3;
        }
        a.m.d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        int n4;
        int a3 = n2;
        UiSupport_562 a4 = this;
UiSupport_576[] class_576Array = a4.L();
        int n5 = class_576Array.length;
        int n6 = 0;
        while (n6 < n5) {
            if (class_576Array[0].L((float)a2, (float)a3, 0)) {
                return;
            }
            n6 = ++n4;
        }
        if (a == false && a4.D.L() != null && a4.L((float)a2, a3)) {
            UiSupport_562 class_562 = a4;
            a4.A = 1;
            a4.D.d(1 != 0);
            a4.e = (float)a2;
            class_562.G = a3;
            class_562.c = (Double)a4.D.k.L();
            a4.B = (Double)a4.D.I.L();
            return;
        }
        super.mouseClicked((int)a2, a3, 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseReleased(int n, int n2, int n3) {
        void a;
        void a2;
        void a3;
        int a4;
        UiSupport_562 class_562 = this;
if (class_562.A) {
            class_562.A = 0;
            class_562.D.d(5 >> 3);
        }
        UiSupport_576[] class_576Array = class_562.L();
        int n4 = class_576Array.length;
        int n5 = 0;
        while (n5 < n4) {
            UiSupport_576 class_576 = class_576Array[0];
            class_576.d((float)a3, 0.0f, (int)a);
            n5 = ++a4;
        }
        super.mouseReleased((int)a3, 0, (int)a);
    }

    private void L() {
        UiSupport_562 class_562 = this;
UiSupport_562 class_5622 = class_562;
        UiSupport_562 class_5623 = class_562;
        class_5623.H = (float)class_5623.height * 0.56f;
        class_5623.f = class_5623.H * 0.625f;
        class_5623.C = (float)class_5623.width / 2.0f - class_562.f / 2.0f;
        class_562.J = (float)class_5623.height / 2.0f - class_562.H / 2.0f - 8.0f;
        float a = 512.0f;
        a = (float)class_5622.width / 2.0f - 0.0f;
        float f2 = (float)class_562.height - 46.0f;
        class_5622.d.L(0, f2, 96.0f, 30.0f);
        class_5622.k.L(104.0f, f2, 96.0f, 30.0f);
        class_5622.h.L(208.0f, f2, 96.0f, 30.0f);
        class_5622.L.L(312.0f, f2, 96.0f, 30.0f);
        class_5622.j.L(416.0f, f2, 96.0f, 30.0f);
    }

    private void L(RenderMode_134 enum_134) {
        RenderMode_134 a = enum_134;
        UiSupport_562 a2 = this;
a2.D.f.i(a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_562 a3 = this;
if (a >= a3.C) {
            UiSupport_562 class_562 = a3;
            if (a <= class_562.C + class_562.f && 0 >= a3.J) {
                UiSupport_562 class_5622 = a3;
                if (0 <= class_5622.J + class_5622.H) {
                    return 1 != 0;
                }
            }
        }
        return false;
    }
}

