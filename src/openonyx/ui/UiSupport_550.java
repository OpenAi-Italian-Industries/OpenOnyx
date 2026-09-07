/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_101;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_561;

public class UiSupport_550
extends GuiScreen {
    private final RenderSupport_103 D;
    private final RenderSupport_121 c;
    private final static float a = 0.92f;
    private final static float k = 100.0f;
    private float g;
    private boolean M;
    private final static float L = 0.5f;
    private final GuiScreen j;
    private final static float m = 0.32f;
    private long h;
    private final static float l = 16.0f;
    private float I;
    private final RenderSupport_121 d;
    private float i;
    private float f;
    private final UiSupport_561 H;
    private final static float e = 0.72f;

    @Override
    public boolean doesGuiPauseGame() {
return 3 >> 2;
    }

    private void D() {
        UiSupport_550 class_550 = this;
UiSupport_550 class_5502 = class_550;
        float a = Math.min((float)class_5502.width * 0.5f / class_550.H.i(), (float)class_550.height * 0.72f / class_550.H.L());
        class_5502.f = Math.min(ThemeSupport_059.d(), 0);
        class_550.I = ThemeSupport_059.d();
        class_5502.H.L((float)class_550.width / class_550.f, (float)class_550.height / class_550.f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_550 a4 = this;
UiSupport_550 class_550 = a4;
        class_550.d();
        UiSupport_550 class_5502 = a4;
        if (class_550.H.L(class_5502.g, class_5502.i, a3)) {
            return;
        }
        super.mouseClicked((int)a2, (int)a, a3);
    }

    public UiSupport_550(GuiScreen guiScreen) {
        GuiScreen a = guiScreen;
        UiSupport_550 a2 = this;
        UiSupport_550 class_550 = a2;
        a2.H = new UiSupport_561(() -> {
            UiSupport_550 a;
UiSupport_550 class_550 = a;
            class_550.mc.displayGuiScreen(class_550.j);
        });
        UiSupport_550 class_5502 = a2;
        UiSupport_550 class_5503 = a2;
        class_5503.D = new RenderSupport_103();
        class_5503.c = new RenderSupport_121(0.0f);
        class_5503.d = new RenderSupport_121(0.0f);
        class_5502.f = 1.0f;
        class_5502.j = a;
    }

    private void d() {
        UiSupport_550 class_550 = this;
int a = new ScaledResolution(class_550.mc).getScaleFactor();
        UiSupport_550 class_5502 = class_550;
        class_5502.g = class_5502.L((float)Minecraft.getScaledMouseX() / 0.0f);
        class_5502.i = class_5502.L((float)(class_5502.mc.displayHeight - Minecraft.getScaledMouseY()) / 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClickMove(int n, int n2, int n3, long l) {
        void a;
        void a2;
        void a3;
        void a4;
        UiSupport_550 class_550 = this;
UiSupport_550 class_5502 = class_550;
        float f2 = class_5502.g;
        float a5 = class_5502.i;
        class_5502.d();
        UiSupport_550 class_5503 = class_550;
        if (class_5502.H.L(class_5503.g, class_5503.i, (int)a4, class_550.g - f2, class_550.i - 0)) {
            return;
        }
        super.mouseClickMove((int)a3, 0, (int)a4, (long)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void keyTyped(char c, int n) throws IOException {
        void a;
        char a2 = c;
        UiSupport_550 a3 = this;
int n2 = 0;
        InputSupport_002 class_002 = new InputSupport_002((int)a, n2, n2, a2);
        if (a3.H.L(class_002)) {
            return;
        }
        if (a2 >= 32 && a3.H.L(new InputSupport_005(a2, 0))) {
            return;
        }
        if (a == 1) {
            a3.L();
            return;
        }
        super.keyTyped(a2, (int)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseReleased(int n, int n2, int n3) {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_550 a4 = this;
UiSupport_550 class_550 = a4;
        class_550.d();
        UiSupport_550 class_5502 = a4;
        if (class_550.H.d(class_5502.g, class_5502.i, a3)) {
            return;
        }
        super.mouseReleased((int)a2, (int)a, a3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawScreen(int n, int n2, float f2) {
        int a322 = n;
        UiSupport_550 a = this;
UiSupport_550 class_550 = a;
        float a322 = class_550.L();
        class_550.c.L(a322);
        class_550.d.L(a322);
        if (class_550.I != ThemeSupport_059.d()) {
            a.D();
        }
        UiSupport_550 class_5502 = a;
        class_5502.d();
        if (class_5502.mc.theWorld == null && a.j != null) {
            void a2;
            int n3 = -1;
            a.j.drawScreen(n3, n3, (float)a2);
        }
        UiSupport_550 class_5503 = a;
        class_5503.D.i();
        if (class_5503.mc.theWorld == null) {
            if (a.j == null) {
                UiSupport_550 class_5504 = a;
                class_5504.D.L(0.0f, 0.0f, (float)a.width, (float)a.height);
                class_5504.D.d();
                RenderSupport_101.d();
                RenderSupport_101.l();
                class_5504.D.i();
            }
        } else {
            RenderSupport_120.d();
            a.D.i(0.0f, 0.0f, (float)a.width, (float)a.height, ThemeSupport_059.L(0.32f * a.d.L()));
        }
        UiSupport_550 class_5505 = a;
        UiSupport_548 a322 = new UiSupport_548(a.D, a322, class_5505.g, class_5505.i);
        UiSupport_550 class_5506 = a;
        float a4 = class_5506.c.L();
        class_5506.D.F();
        UiSupport_550 class_5507 = a;
        class_5506.D.L().L(class_5507.f, class_5507.f);
        UiSupport_550 class_5508 = a;
        UiSupport_550 class_5509 = a;
        class_5508.D.L(0.92f + 0.07999998f * a4, class_5509.H.I(), a.H.h());
        class_5509.H.L(a4);
        class_5508.H.d(a322);
        class_5508.H.L(a322);
        class_5508.D.k();
        class_5508.D.d();
    }

    private float L() {
        UiSupport_550 a;
long l = System.nanoTime();
        if (a.h == 0L) {
            a.h = l;
            return 16.0f;
        }
        a.h = l;
        return Math.min((float)(l - a.h) / 1000000.0f, 100.0f);
    }

    private float L(double a) {
        UiSupport_550 a2;
return (float)(a / (double)a2.f);
    }

    @Override
    public void initGui() {
        UiSupport_550 a;
if (!a.M) {
            UiSupport_550 class_550 = a;
            class_550.M = 1;
            class_550.H.d();
            class_550.c.L(0.0f).L(1.0f, 400.0f, RenderSupport_123.H);
            a.d.L(0.0f).L(1.0f, 250.0f, RenderSupport_123.i);
        }
        a.h = 0L;
        a.D();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void setWorldAndResolution(Minecraft minecraft, int n, int n2) {
        void a;
        void a2;
        Minecraft a3 = minecraft;
        UiSupport_550 a4 = this;
UiSupport_550 class_550 = a4;
        super.setWorldAndResolution(a3, (int)a2, (int)a);
        if (class_550.j != null && a3.theWorld == null) {
            a4.j.setWorldAndResolution(a3, (int)a2, (int)a);
        }
        a4.D();
    }
}

