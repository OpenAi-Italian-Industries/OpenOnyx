/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import openonyx.features.Module;
import openonyx.history.UndoManager;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_101;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_543;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_572;
import org.lwjgl.input.Mouse;

public class UiSupport_560
extends GuiScreen {
    private float J;
    private final static float D = 100.0f;
    private final GuiScreen c;
    private float a;
    private final RenderSupport_103 k;
    private float g;
    private final RenderSupport_121 M;
    private long L;
    private final static float j = 0.62f;
    private final UiSupport_543 m;
    private final RenderSupport_121 h;
    private final static int l = 120;
    private final Module I;
    private boolean d;
    private final static float i = 0.72f;
    private final static float f = 16.0f;
    private float H;
    private boolean e;

    private void D() {
        UiSupport_560 class_560 = this;
int a = new ScaledResolution(class_560.mc).getScaleFactor();
        UiSupport_560 class_5602 = class_560;
        class_5602.H = class_5602.L((float)Minecraft.getScaledMouseX() / 0.0f);
        class_5602.J = class_5602.L((float)(class_5602.mc.displayHeight - Minecraft.getScaledMouseY()) / 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_560 a4 = this;
UiSupport_560 class_560 = a4;
        class_560.D();
        UiSupport_560 class_5602 = a4;
        if (class_560.m.L(class_5602.H, class_5602.J, a3)) {
            return;
        }
        super.mouseClicked((int)a2, (int)a, a3);
    }

    @Override
    public void drawScreen(int n, int n2, float f2) {
        int a322 = n;
        UiSupport_560 a = this;
if (a.d()) {
            a.L();
            return;
        }
        UiSupport_560 class_560 = a;
        float a322 = class_560.L();
        class_560.M.L(a322);
        class_560.h.L(a322);
        if (class_560.g != ThemeSupport_059.d()) {
            a.d();
        }
        UiSupport_560 class_5602 = a;
        class_5602.D();
        class_5602.k.i();
        if (class_5602.mc.theWorld == null) {
            UiSupport_560 class_5603 = a;
            class_5603.k.L(0.0f, 0.0f, (float)a.width, (float)a.height);
            class_5603.k.d();
            RenderSupport_101.d();
            RenderSupport_101.l();
            class_5603.k.i();
        } else {
            RenderSupport_120.d();
            a.k.i(0.0f, 0.0f, (float)a.width, (float)a.height, ThemeSupport_059.L(0.32f * a.h.L()));
        }
        UiSupport_560 class_5604 = a;
        UiSupport_548 a322 = new UiSupport_548(a.k, a322, class_5604.H, class_5604.J);
        UiSupport_560 class_5605 = a;
        float a2 = class_5605.M.L();
        class_5605.k.F();
        UiSupport_560 class_5606 = a;
        class_5605.k.L().L(class_5606.a, class_5606.a);
        UiSupport_560 class_5607 = a;
        UiSupport_560 class_5608 = a;
        class_5607.k.L(0.92f + 0.08f * a2, class_5608.m.j(), a.m.e());
        class_5608.m.L(a2);
        class_5607.m.d(a322);
        class_5607.m.L(a322);
        class_5607.k.k();
        class_5607.k.d();
    }

    private void d() {
        UiSupport_560 class_560 = this;
UiSupport_560 class_5602 = class_560;
        float a = Math.min((float)class_5602.width * 0.62f / class_560.m.i(), (float)class_560.height * 0.72f / class_560.m.L());
        class_5602.a = Math.min(ThemeSupport_059.d(), 0);
        class_560.g = ThemeSupport_059.d();
        class_5602.m.L((float)class_560.width / class_560.a, (float)class_560.height / class_560.a);
    }

    @Override
    public void initGui() {
        UiSupport_560 a;
if (!a.e) {
            a.e = 1;
            UndoManager.L();
            a.M.L(0.0f).L(1.0f, 400.0f, RenderSupport_123.H);
            a.h.L(0.0f).L(1.0f, 250.0f, RenderSupport_123.i);
        }
        UiSupport_560 class_560 = a;
        class_560.L = 0L;
        class_560.d = class_560.L();
        class_560.d();
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_560(Module class_227, GuiScreen guiScreen) {
        void a;
        UiSupport_560 a2;
        GuiScreen a3 = guiScreen;
        UiSupport_560 class_560 = a2 = this;
        UiSupport_560 class_5602 = a2;
        UiSupport_560 class_5603 = a2;
        a2.m = new UiSupport_543();
        class_5603.k = new RenderSupport_103();
        class_5602.M = new RenderSupport_121(0.0f);
        class_5602.h = new RenderSupport_121(0.0f);
        class_5602.a = 1.0f;
        class_560.I = a;
        class_560.c = a3;
    }

    @Override
    public void onGuiClosed() {
        UiSupport_560 a;
UndoManager.d();
        if (a.I != null && a.I.d()) {
            a.I.I();
        }
    }

    private boolean d() {
        UiSupport_560 class_560 = this;
boolean a = class_560.L();
        if (a == class_560.d) {
            return 0 != 0;
        }
        class_560.d = a;
        if (a && !UiSupport_572.h()) {
            return 5 >> 2;
        }
        return false;
    }

    private float L() {
        UiSupport_560 a;
long l = System.nanoTime();
        if (a.L == 0L) {
            a.L = l;
            return 16.0f;
        }
        a.L = l;
        return Math.min((float)(l - a.L) / 1000000.0f, 100.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseReleased(int n, int n2, int n3) {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_560 a4 = this;
UiSupport_560 class_560 = a4;
        class_560.D();
        UiSupport_560 class_5602 = a4;
        if (class_560.m.d(class_5602.H, class_5602.J, a3)) {
            return;
        }
        super.mouseReleased((int)a2, (int)a, a3);
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
        UiSupport_560 class_560 = this;
UiSupport_560 class_5602 = class_560;
        float f2 = class_5602.H;
        float a5 = class_5602.J;
        class_5602.D();
        UiSupport_560 class_5603 = class_560;
        if (class_5602.m.L(class_5603.H, class_5603.J, (int)a4, class_560.H - f2, class_560.J - 0)) {
            return;
        }
        super.mouseClickMove((int)a3, 0, (int)a4, (long)a);
    }

    private boolean L() {
        UiSupport_560 a;
if (a.I == null || !a.I.L().D()) {
            return false;
        }
        return a.I.L().l();
    }

    private void L() {
        UiSupport_560 a;
UiSupport_560 class_560 = a;
        class_560.mc.displayGuiScreen(class_560.c);
    }

    @Override
    public void handleMouseInput() throws IOException {
        UiSupport_560 class_560 = this;
int a = Mouse.getEventDWheel();
        if (0 != 0) {
            UiSupport_560 class_5602 = class_560;
            class_5602.D();
            UiSupport_560 class_5603 = class_560;
            if (class_5602.m.L(class_5603.H, class_5603.J, 0.0)) {
                return;
            }
        }
        super.handleMouseInput();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void setWorldAndResolution(Minecraft minecraft, int n, int n2) {
        void a;
        void a2;
        int a3 = n2;
        UiSupport_560 a4 = this;
UiSupport_560 class_560 = a4;
        super.setWorldAndResolution((Minecraft)a2, (int)a, a3);
        class_560.d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void keyTyped(char c, int n) throws IOException {
        void a;
        int a2 = 0;
        UiSupport_560 a3 = this;
int n2 = 0;
        InputSupport_002 class_002 = new InputSupport_002(0, n2, n2, (char)a);
        if (a3.m.L(class_002)) {
            return;
        }
        if (0 == 1 && a3.m.I()) {
            return;
        }
        if (a3.I != null && a3.I.L().L(0) && !UiSupport_572.h()) {
            return;
        }
        if (a >= 32 && a3.m.L(new InputSupport_005(0, 0))) {
            return;
        }
        if (0 == 1) {
            a3.L();
            return;
        }
        super.keyTyped((char)a, 0);
    }

    @Override
    public boolean doesGuiPauseGame() {
return 5 >> 3;
    }

    private float L(double a) {
        UiSupport_560 a2;
return (float)(a / (double)a2.a);
    }
}

