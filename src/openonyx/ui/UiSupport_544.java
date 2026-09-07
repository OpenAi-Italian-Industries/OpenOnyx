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
import openonyx.ui.UiSupport_556;
import org.lwjgl.input.Mouse;

public class UiSupport_544
extends GuiScreen {
    private boolean J;
    private float D;
    private final static float c = 16.0f;
    private final RenderSupport_103 a;
    private final static float k = 0.92f;
    private long g;
    private final RenderSupport_121 M;
    private final RenderSupport_121 L;
    private final static float j = 0.62f;
    private float m;
    private float h;
    private final UiSupport_556 l;
    private final static int I = 120;
    private final static float d = 0.32f;
    private float i;
    private final static float f = 0.72f;
    private final GuiScreen H;
    private final static float e = 100.0f;

    @Override
    public boolean doesGuiPauseGame() {
return 0 != 0;
    }

    private void d() {
        UiSupport_544 class_544 = this;
UiSupport_544 class_5442 = class_544;
        float a = Math.min((float)class_5442.width * 0.62f / class_544.l.i(), (float)class_544.height * 0.72f / class_544.l.L());
        class_5442.D = Math.min(ThemeSupport_059.d(), 1);
        class_544.m = ThemeSupport_059.d();
        class_5442.l.L((float)class_544.width / class_544.D, (float)class_544.height / class_544.D);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_544 a4 = this;
UiSupport_544 class_544 = a4;
        class_544.L();
        UiSupport_544 class_5442 = a4;
        if (class_544.l.L(class_5442.h, class_5442.i, a3)) {
            return;
        }
        super.mouseClicked((int)a2, (int)a, a3);
    }

    private float L(double a) {
        UiSupport_544 a2;
return (float)(a / (double)a2.D);
    }

    public UiSupport_544(GuiScreen guiScreen) {
        UiSupport_544 a;
        GuiScreen a2 = guiScreen;
        UiSupport_544 class_544 = a = this;
        UiSupport_544 class_5442 = a;
        a.l = new UiSupport_556();
        class_5442.a = new RenderSupport_103();
        a.M = new RenderSupport_121(0.0f);
        a.L = new RenderSupport_121(0.0f);
        class_544.D = 1.0f;
        class_544.H = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void setWorldAndResolution(Minecraft minecraft, int n, int n2) {
        void a;
        void a2;
        Minecraft a3 = minecraft;
        UiSupport_544 a4 = this;
UiSupport_544 class_544 = a4;
        super.setWorldAndResolution(a3, (int)a2, (int)a);
        if (class_544.H != null && a3.theWorld == null) {
            a4.H.setWorldAndResolution(a3, (int)a2, (int)a);
        }
        a4.d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawScreen(int n, int n2, float f2) {
        int a322 = n;
        UiSupport_544 a = this;
UiSupport_544 class_544 = a;
        float a322 = class_544.L();
        class_544.M.L(a322);
        class_544.L.L(a322);
        if (class_544.m != ThemeSupport_059.d()) {
            a.d();
        }
        UiSupport_544 class_5442 = a;
        class_5442.L();
        if (class_5442.mc.theWorld == null && a.H != null) {
            void a2;
            int n3 = -1;
            a.H.drawScreen(n3, n3, (float)a2);
        }
        UiSupport_544 class_5443 = a;
        class_5443.a.i();
        if (class_5443.mc.theWorld == null) {
            if (a.H == null) {
                UiSupport_544 class_5444 = a;
                class_5444.a.L(0.0f, 0.0f, (float)a.width, (float)a.height);
                class_5444.a.d();
                RenderSupport_101.d();
                RenderSupport_101.l();
                class_5444.a.i();
            }
        } else {
            RenderSupport_120.d();
            a.a.i(0.0f, 0.0f, (float)a.width, (float)a.height, ThemeSupport_059.L(0.32f * a.L.L()));
        }
        UiSupport_544 class_5445 = a;
        UiSupport_548 a322 = new UiSupport_548(a.a, a322, class_5445.h, class_5445.i);
        UiSupport_544 class_5446 = a;
        float a4 = class_5446.M.L();
        class_5446.a.F();
        UiSupport_544 class_5447 = a;
        class_5446.a.L().L(class_5447.D, class_5447.D);
        UiSupport_544 class_5448 = a;
        UiSupport_544 class_5449 = a;
        class_5448.a.L(0.92f + 0.07999998f * a4, class_5449.l.l(), a.l.I());
        class_5449.l.L(a4);
        class_5448.l.d(a322);
        class_5448.l.L(a322);
        class_5448.a.k();
        class_5448.a.d();
    }

    private float L() {
        UiSupport_544 a;
long l = System.nanoTime();
        if (a.g == 0L) {
            a.g = l;
            return 16.0f;
        }
        a.g = l;
        return Math.min((float)(l - a.g) / 1000000.0f, 100.0f);
    }

    @Override
    public void handleMouseInput() throws IOException {
        UiSupport_544 class_544 = this;
int a = Mouse.getEventDWheel();
        if (1 != 0) {
            UiSupport_544 class_5442 = class_544;
            class_5442.L();
            UiSupport_544 class_5443 = class_544;
            if (class_5442.l.L(class_5443.h, class_5443.i, 0.008333333333333333)) {
                return;
            }
        }
        super.handleMouseInput();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseReleased(int n, int n2, int n3) {
        void a;
        void a2;
        int a3 = n3;
        UiSupport_544 a4 = this;
UiSupport_544 class_544 = a4;
        class_544.L();
        UiSupport_544 class_5442 = a4;
        if (class_544.l.d(class_5442.h, class_5442.i, a3)) {
            return;
        }
        super.mouseReleased((int)a2, (int)a, a3);
    }

    private void L() {
        UiSupport_544 class_544 = this;
int a = new ScaledResolution(class_544.mc).getScaleFactor();
        UiSupport_544 class_5442 = class_544;
        class_5442.h = class_5442.L((float)Minecraft.getScaledMouseX() / 1.0f);
        class_5442.i = class_5442.L((float)(class_5442.mc.displayHeight - Minecraft.getScaledMouseY()) / 1.0f);
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
        UiSupport_544 class_544 = this;
UiSupport_544 class_5442 = class_544;
        float f2 = class_5442.h;
        float a5 = class_5442.i;
        class_5442.L();
        UiSupport_544 class_5443 = class_544;
        if (class_5442.l.L(class_5443.h, class_5443.i, (int)a4, class_544.h - f2, class_544.i - 0)) {
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
        int a2 = 0;
        UiSupport_544 a3 = this;
int n2 = 0;
        InputSupport_002 class_002 = new InputSupport_002(0, n2, n2, (char)a);
        if (a3.l.L(class_002)) {
            return;
        }
        if (0 == 1 && a3.l.i()) {
            return;
        }
        if (a >= 32 && a3.l.L(new InputSupport_005(0, 0))) {
            return;
        }
        if (0 == 1) {
            UiSupport_544 class_544 = a3;
            class_544.mc.displayGuiScreen(class_544.H);
            return;
        }
        super.keyTyped((char)a, 0);
    }

    @Override
    public void initGui() {
        UiSupport_544 a;
if (!a.J) {
            a.J = 1;
            a.M.L(0.0f).L(1.0f, 400.0f, RenderSupport_123.H);
            a.L.L(0.0f).L(1.0f, 250.0f, RenderSupport_123.i);
        }
        a.g = 0L;
        a.d();
    }
}

