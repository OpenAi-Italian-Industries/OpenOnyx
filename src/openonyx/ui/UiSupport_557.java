/*
 * Decompiled with CFR.
 */
package openonyx.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import openonyx.core.OnyxClient;
import openonyx.events.EntityRelationUtils;
import openonyx.features.hud.FeatureSupport_341;
import openonyx.features.hud.FeatureSupport_356;
import openonyx.features.hud.TargetHUD;
import openonyx.features.hud.internal.FeatureSupport_375;
import openonyx.history.Setting;
import openonyx.history.internal.BooleanSetting;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_v.RenderSupport_182;
import openonyx.render.group_v.RenderSupport_183;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_576;
import openonyx.ui.internal.UiSupport_593;
import openonyx.ui.internal.UiSupport_596;
import openonyx.ui.internal.UiMode_598;
import openonyx.utilities.UtilitySupport_489;
import org.lwjgl.input.Mouse;

public class UiSupport_557
extends GuiScreen {
    private final GuiScreen x;
    private final static float u = 16.0f;
    private float y;
    private final static float n = 2.0f;
    private final static float Y = 12.0f;
    private final static float r = 100.0f;
    private final static float W = 46.0f;
    private float P;
    private final UiSupport_576 V;
    private final static float R = 210.0f;
    private FeatureSupport_375 p;
    private final List<float[]> t;
    private final static float b = 9.0f;
    private final TargetHUD E;
    private float F;
    private float G;
    private final static float A = 20.0f;
    private long K;
    private float B;
    private final UiSupport_593 C;
    private float J;
    private final static float D = 120.0f;
    private float c;
    private final static float a = 10.0f;
    private FeatureSupport_375 k;
    private final static float g = 2.4f;
    private final static float M = 12.0f;
    private float L;
    private RenderSupport_182 j;
    private float m;
    private FeatureSupport_356 h;
    private final UiSupport_576 l;
    private float I;
    private float d;
    private float i;
    private float f;
    private final static float H = 5.0f;
    private final RenderSupport_103 e;

    /*
     * WARNING - void declaration
     */
    @Override
    protected void keyTyped(char c, int n) throws IOException {
        void a;
        void a2;
        UiSupport_557 class_557 = this;
int n2 = 0;
        InputSupport_002 class_002 = new InputSupport_002((int)a2, n2, n2, (char)a);
        for (UiSupport_596 object : class_557.C.L()) {
            if (!object.L(class_002)) continue;
            return;
        }
        if (a >= 32) {
            InputSupport_005 a3 = new InputSupport_005((int)a, 0);
            Iterator<UiSupport_596> iterator = class_557.C.L().iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().L(a3)) continue;
                return;
            }
        }
        if (a2 == 1) {
            class_557.d();
            return;
        }
        super.keyTyped((char)a, (int)a2);
    }

    @Override
    public void initGui() {
        UiSupport_557 a;
a.K = 0L;
        if (a.p == null) {
            a.p = a.E.D().get(0);
        }
        a.L();
    }

    @Override
    public void onGuiClosed() {
        UiSupport_557 a;
a.E.h();
    }

    private void D() {
        UiSupport_557 class_557 = this;
float a = 100.0f;
        UiSupport_557 class_5572 = class_557;
        float f2 = (float)class_5572.width - 210.0f - 12.0f;
        float f3 = (float)class_5572.height - 46.0f + 10.0f;
        class_5572.l.L(f2, f3, 0, 30.0f);
        class_5572.V.L(f2 + 0 + 10.0f, f3, 0, 30.0f);
    }

    @Override
    public void handleMouseInput() throws IOException {
        UiSupport_557 class_557 = this;
int n = Mouse.getEventDWheel();
        if (0 != 0) {
            ScaledResolution a22 = new ScaledResolution(class_557.mc);
            float f2 = (float)(Mouse.getEventX() * a22.getScaledWidth()) / (float)class_557.mc.displayWidth;
            float a22 = (float)a22.getScaledHeight() - (float)(Mouse.getEventY() * a22.getScaledHeight()) / (float)class_557.mc.displayHeight - 1.0f;
            if (f2 >= (float)class_557.width - 210.0f - 12.0f && 0 >= class_557.c) {
                UiSupport_557 class_5572 = class_557;
                if (0 < class_5572.c + class_5572.f) {
                    UiSupport_557 class_5573 = class_557;
                    class_557.F = Math.clamp(class_557.F - 0.0f, 0.0f, Math.max(0.0f, class_5573.m - class_5573.f));
                    return;
                }
            }
        }
        super.handleMouseInput();
    }

    /*
     * WARNING - void declaration
     */
    private List<float[]> L(FeatureSupport_375 class_375) {
        Iterator<FeatureSupport_341> iterator;
        UiSupport_557 class_557 = this;
ArrayList<float[]> arrayList = new ArrayList<float[]>();
        Iterator<FeatureSupport_341> iterator2 = iterator = class_557.h.L().iterator();
        while (iterator2.hasNext()) {
            void a;
            FeatureSupport_341 a2 = iterator.next();
            if (a2.L() == a) {
                iterator2 = iterator;
                continue;
            }
            float[] fArray = new float[4];
            fArray[0] = a2.D();
            fArray[1] = a2.i();
            fArray[2] = a2.L();
            fArray[3] = a2.d();
            arrayList.add(fArray);
            iterator2 = iterator;
        }
        return arrayList;
    }

    private float[] L(FeatureSupport_341 class_341) {
        FeatureSupport_341 a = class_341;
        UiSupport_557 a2 = this;
float[] fArray = new float[4];
        fArray[0] = a2.B + a.D() * 2.4f;
        fArray[1] = a2.J + a.i() * 2.4f;
        fArray[2] = Math.max(a.L(), 1.0f) * 2.4f;
        fArray[3] = Math.max(a.d(), 1.0f) * 2.4f;
        return fArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseReleased(int n, int n2, int n3) {
        void a;
        void a2;
        Iterator<UiSupport_596> iterator;
        int a3 = n3;
        UiSupport_557 a4 = this;
a4.k = null;
        a4.j = RenderSupport_183.f;
        Iterator<UiSupport_596> iterator2 = iterator = a4.C.L().iterator();
        while (iterator2.hasNext()) {
            iterator.next().d((float)a2, (float)a, a3);
            iterator2 = iterator;
        }
        a4.l.d((float)a2, (float)a, a3);
        a4.V.d((float)a2, (float)a, a3);
        super.mouseReleased((int)a2, (int)a, a3);
    }

    /*
     * WARNING - void declaration
     */
    private FeatureSupport_341 L(FeatureSupport_375 class_375) {
        UiSupport_557 class_557 = this;
for (FeatureSupport_341 class_341 : class_557.h.L()) {
            void a;
            if (class_341.L() != a) continue;
            return class_341;
        }
        return null;
    }

    private float L() {
        UiSupport_557 a;
long l = System.nanoTime();
        if (a.K == 0L) {
            a.K = l;
            return 16.0f;
        }
        a.K = l;
        return Math.min((float)(l - a.K) / 1000000.0f, 100.0f);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean L(float[] fArray, float f2, float f3) {
        void a;
        float a2 = f3;
        float[] a3 = fArray;
if (a >= a3[0] && a <= a3[0] + a3[2] && 0 >= a3[1] && 0 <= a3[1] + a3[3]) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void L(float f2, float f3) {
        void a;
        void a2;
        UiSupport_557 class_557 = this;
if (class_557.h == null) {
            return;
        }
        UiSupport_557 class_5572 = class_557;
        FeatureSupport_341 a3 = class_5572.L(class_5572.k);
        if (a3 == null) {
            return;
        }
        a2 = (a2 - class_557.d - class_557.B) / 2.4f;
        a = (a - class_557.i - class_557.J) / 2.4f;
        UiSupport_557 class_5573 = class_557;
        class_557.j = RenderSupport_183.L((float)a2, (float)a, a3.L(), a3.d(), class_557.h.D(), class_557.h.L(), 0.0f, class_5573.L(class_5573.k));
        UiSupport_557 class_5574 = class_557;
        class_557.k.M.i(Double.valueOf(class_557.j.L() - class_5574.L));
        class_5574.k.m.i(Double.valueOf(class_557.j.D() - class_557.I));
    }

    /*
     * WARNING - void declaration
     */
    private void d(int n, int n2) {
        void a32;
        void a22;
        UiSupport_557 class_557 = this;
UiSupport_557 class_5572 = class_557;
        float f2 = (float)class_5572.width - 210.0f - 12.0f;
        float a42 = 12.0f;
        float f3 = (float)class_5572.height - 46.0f;
        float f4 = a42;
        class_5572.e.D(f2, f4, 210.0f, f3 - f4, 16.0f, ThemeSupport_060.L(2, ThemeSupport_059.L()));
        class_5572.e.F(ThemeSupport_057.f, "Elements", f2 + 12.0f, a42 += 12.0f, ThemeSupport_059.L().d());
        a42 += ThemeSupport_057.f.I() + 4.0f;
        a42 = class_5572.L(f2 + 12.0f, a42, 186.0f, (int)a22, (int)a32);
        class_5572.e.i(f2 + 12.0f, a42 += 8.0f, 186.0f, 1.0f, ThemeSupport_059.L().P());
        class_5572.c = a42 += 10.0f;
        class_5572.f = Math.max(0.0f, f3 - 12.0f - class_557.c);
        UiSupport_557 class_5573 = class_557;
        UiSupport_548 a22 = new UiSupport_548(class_5573.e, class_5573.G, (float)a22, (float)a32);
        float a32 = f2 + 12.0f;
        f2 = 186.0f;
        Iterator<UiSupport_596> iterator = a42 = class_5572.C.L().iterator();
        while (iterator.hasNext()) {
            UiSupport_596 class_596 = a42.next();
            iterator = a42;
            class_596.d(a22);
        }
        UiSupport_557 class_5574 = class_557;
        class_557.m = class_5574.C.L(a32, class_557.c - class_557.F, f2);
        UiSupport_557 class_5575 = class_557;
        class_5574.F = Math.clamp(class_5574.F, 0.0f, Math.max(0.0f, class_5575.m - class_5575.f));
        UiSupport_557 class_5576 = class_557;
        class_5574.m = class_5574.C.L(a32, class_5576.c - class_5576.F, f2);
        class_5574.e.d(a32, class_557.c, f2, class_557.f);
        class_5574.C.L(class_557.e, a32, f2, ThemeSupport_059.L().P(), 1.0f);
        Iterator<UiSupport_596> a42 = class_5574.C.L().iterator();
        Iterator<UiSupport_596> iterator2 = a42;
        while (iterator2.hasNext()) {
            UiSupport_596 class_596 = a42.next();
            iterator2 = a42;
            class_596.L(a22);
        }
        UiSupport_557 class_5577 = class_557;
        class_5577.e.L();
        class_5577.D();
        class_5577.l.d(a22);
        class_5577.V.d(a22);
        class_5577.l.L(a22);
        class_5577.V.L(a22);
    }

    /*
     * WARNING - void declaration
     */
    private float L(float f2, float f3, float f4, int n, int n2) {
        void a;
        Iterator<FeatureSupport_375> iterator;
        void a2;
        UiSupport_557 class_557 = this;
UiSupport_557 class_5572 = class_557;
        class_5572.t.clear();
        void a3 = a2;
        Iterator<FeatureSupport_375> iterator2 = iterator = class_5572.E.D().iterator();
        while (iterator2.hasNext()) {
            int n3;
            void a4;
            void a5;
            int n4;
            void a6;
            FeatureSupport_375 class_375 = iterator.next();
            String string = class_375.L().L();
            float f5 = class_557.e.L(ThemeSupport_057.C, string) + 18.0f;
            if (a3 > a2 && a3 + f5 > a2 + a6) {
                a3 = a2;
                a += 25.0f;
            }
            int n5 = class_375 == class_557.p ? 1 : 0;
            int n6 = n4 = (float)a5 >= a3 && (float)a5 < a3 + f5 && (float)a4 >= a && (float)a4 < a + 20.0f ? 1 : 0;
            int n7 = n5 != 0 ? ThemeSupport_059.L().G() : (n3 = ThemeSupport_059.L(ThemeSupport_059.L().d(), n4 != 0 ? 0.1f : 0.04f));
            n5 = n5 != 0 ? ThemeSupport_059.L().D() : ThemeSupport_059.L(ThemeSupport_059.L().F(), class_375.h() ? 1.0f : 0.45f);
            iterator2 = iterator;
            UiSupport_557 class_5573 = class_557;
            class_5573.e.D((float)a3, (float)a, f5, 20.0f, Float.MAX_VALUE, n3);
            class_5573.e.L(ThemeSupport_057.C, string, (float)(a3 + f5 / 2.0f), (float)(a + 10.0f), n5);
            float[] fArray = new float[4];
            fArray[0] = a3;
            fArray[1] = a;
            fArray[2] = f5;
            fArray[3] = 20.0f;
            class_5573.t.add(fArray);
            a3 += f5 + 5.0f;
        }
        return (float)(a + 20.0f);
    }

    @Override
    public boolean doesGuiPauseGame() {
return 3 >> 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        void a;
        void a2;
        void a3;
        UiSupport_557 class_557 = this;
if (a3 == false) {
            int a4;
            int n4 = 0;
            while (n4 < class_557.t.size()) {
                if (UiSupport_557.L(class_557.t.get(0), (float)a2, (float)a)) {
                    UiSupport_557 class_5572 = class_557;
                    class_5572.L(class_5572.E.D().get(0));
                    return;
                }
                n4 = ++a4;
            }
        }
        Iterator<UiSupport_596> a4 = class_557.C.L().iterator();
        while (a4.hasNext()) {
            if (!((UiSupport_596)a4.next()).L((float)a2, (float)a, (int)a3)) continue;
            return;
        }
        if (class_557.l.L((float)a2, (float)a, (int)a3)) {
            return;
        }
        if (class_557.V.L((float)a2, (float)a, (int)a3)) {
            return;
        }
        if (a3 == false && class_557.L((float)a2, (float)a)) {
            return;
        }
        super.mouseClicked((int)a2, (int)a, (int)a3);
    }

    /*
     * WARNING - void declaration
     */
    private void L(FeatureSupport_341 class_341, int n, int n2) {
        int n3;
        float f2;
        void a;
        int a2;
        boolean bl;
        Object a3 = class_341;
        UiSupport_557 a4 = this;
int n4 = ((FeatureSupport_341)a3).L() == a4.p ? 1 : 0;
        a3 = a4.L((FeatureSupport_341)a3);
        boolean bl2 = bl = n4 != 0 || a4.k == null && UiSupport_557.L((float[])a3, a2, (float)a);
        if (!bl) {
            return;
        }
        a2 = n4 != 0 ? ThemeSupport_059.L().E() : ThemeSupport_059.L(ThemeSupport_059.L().d(), 0.45f);
        RenderSupport_103 class_103 = a4.e;
        reference v5 = a3[0] - 2.0f;
        v5 = a3[1] - 2.0f;
        v5 = a3[2] + 4.0f;
        v5 = a3[3] + 4.0f;
        if (n4 != 0) {
            f2 = 1.5f;
            n3 = a2;
        } else {
            f2 = 1.0f;
            n3 = a2;
        }
        class_103.L((float)v2, (float)v3, (float)v4, (float)v5, 4.0f, f2, n3);
    }

    private void L(FeatureSupport_375 class_375) {
        FeatureSupport_375 a = class_375;
        UiSupport_557 a2 = this;
if (a2.p == a) {
            return;
        }
        a2.p = a;
        a2.L();
    }

    private void L() {
        UiSupport_557 class_557 = this;
UiSupport_557 class_5572 = class_557;
        class_5572.C.L();
        class_5572.F = 0.0f;
        if (class_5572.p == null) {
            return;
        }
        ArrayList<BooleanSetting> a = new ArrayList<BooleanSetting>();
        a.add(class_557.p.L());
        a.addAll(class_557.p.L());
        class_557.C.L((List<Setting>)a);
    }

    public UiSupport_557(GuiScreen guiScreen) {
        GuiScreen a = guiScreen;
        UiSupport_557 a2 = this;
        a2.E = OnyxClient.l.Y;
        UiSupport_557 class_557 = a2;
        class_557.e = new RenderSupport_103();
        a2.C = new UiSupport_593();
        a2.l = new UiSupport_576(UiMode_598.d, "Reset", () -> {
            UiSupport_557 a;
if (a.p == null) {
                return;
            }
            a.p.i();
        });
        a2.V = new UiSupport_576(UiMode_598.i, "Done", () -> {
            UiSupport_557 a;
UiSupport_557 class_557 = a;
            class_557.mc.displayGuiScreen(class_557.x);
        });
        UiSupport_557 class_5572 = a2;
        class_5572.j = RenderSupport_183.f;
        class_5572.t = new ArrayList<float[]>();
        class_5572.x = a;
    }

    /*
     * WARNING - void declaration
     */
    private void L(int n, int n2) {
        Object a;
        UiSupport_557 class_557 = this;
UiSupport_557 class_5572 = class_557;
        class_5572.y = class_5572.h.D() * 2.4f;
        class_5572.P = class_5572.h.L() * 2.4f;
        class_5572.B = ((float)class_5572.width - 210.0f - 12.0f) / 2.0f - class_557.y / 2.0f;
        class_5572.J = (float)class_5572.height / 2.0f - class_557.P / 2.0f;
        class_5572.e.F();
        UiSupport_557 class_5573 = class_557;
        class_5572.e.L(class_5573.B, class_5573.J);
        class_5572.e.L(2.4f, 0.0f, 0.0f);
        class_5572.E.L(class_557.e, ThemeSupport_059.L(), class_557.h, 0 != 0);
        if (class_5572.k != null) {
            UiSupport_557 class_5574 = class_557;
            RenderSupport_183.L(class_5574.e, class_5574.h.D(), class_557.h.L(), class_557.j);
        }
        UiSupport_557 class_5575 = class_557;
        class_5575.e.k();
        Object object = a = class_5575.h.L().iterator();
        while (object.hasNext()) {
            void a2;
            void a3;
            FeatureSupport_341 class_341 = (FeatureSupport_341)a.next();
            object = a;
            class_557.L(class_341, (int)a3, (int)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawScreen(int n, int n2, float f2) {
        void a;
        void a2;
        float f3;
        String string;
        float a3 = f2;
        UiSupport_557 a4 = this;
UiSupport_557 class_557 = a4;
        class_557.G = class_557.L();
        class_557.e.i();
        UiSupport_557 class_5572 = a4;
        if (class_557.mc.theWorld != null) {
            class_5572.e.i(0.0f, 0.0f, (float)a4.width, (float)a4.height, ThemeSupport_059.L(0.55f));
            v2 = a4;
        } else {
            class_5572.e.L(0.0f, 0.0f, (float)a4.width, (float)a4.height);
            v2 = a4;
        }
        UiSupport_557 class_5573 = a4;
        v2.h = class_5573.E.L(class_5573.e, ThemeSupport_059.L(), a4.G);
        UiSupport_557 class_5574 = a4;
        a3 = (float)class_5574.width - 210.0f - 12.0f;
        class_5574.e.I(ThemeSupport_057.l, "Target HUD", a3 / 2.0f, 22.0f, ThemeSupport_059.L().d());
        RenderSupport_103 class_103 = class_5574.e;
        if (a4.h == null) {
            string = "Join a world to preview the card";
            f3 = a3;
        } else {
            string = "Drag an element to move it, or pick one to edit";
            f3 = a3;
        }
        class_103.I(ThemeSupport_057.C, string, f3 / 2.0f, 44.0f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.85f));
        if (a4.h != null) {
            a4.L((int)a2, (int)a);
        }
        UiSupport_557 class_5575 = a4;
        class_5575.d((int)a2, (int)a);
        class_5575.e.d();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(float f2, float f3) {
        int n;
        UiSupport_557 class_557 = this;
if (class_557.h == null) {
            return 0 != 0;
        }
        List<FeatureSupport_341> list = class_557.h.L();
        int n2 = n = list.size() - 1;
        while (n2 >= 0) {
            void a;
            void a2;
            FeatureSupport_341 a3 = list.get(0);
            float[] fArray = class_557.L(a3);
            if (UiSupport_557.L(fArray, (float)a2, (float)a)) {
                UiSupport_557 class_5572 = class_557;
                UiSupport_557 class_5573 = class_557;
                class_557.L(a3.L());
                class_557.k = a3.L();
                class_5573.d = a2 - fArray[0];
                class_5573.i = a - fArray[1];
                Object object = a3;
                class_5572.L = a3.D() - ((FeatureSupport_341)object).L().M.L();
                class_5572.I = ((FeatureSupport_341)object).i() - a3.L().m.L();
                return 1 != 0;
            }
            n2 = --n;
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
        void a4;
        UiSupport_557 class_557 = this;
if (class_557.k != null) {
            class_557.L((float)a4, (float)a3);
            return;
        }
        Iterator<UiSupport_596> a5 = class_557.C.L().iterator();
        while (a5.hasNext()) {
            if (!((UiSupport_596)a5.next()).L((float)a4, (float)a3, (int)a2, 0.0f, 0.0f)) continue;
            return;
        }
        super.mouseClickMove((int)a4, (int)a3, (int)a2, (long)a);
    }
}

