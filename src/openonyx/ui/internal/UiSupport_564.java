/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.Iterator;
import java.util.Locale;
import java.util.function.Consumer;
import lombok.Generated;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.UiSupport_553;
import openonyx.ui.internal.UiSupport_565;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UiSupport_564
extends UiSupport_553 {
    private String f;
    private final Consumer<Module> H;
    private ModuleCategory e;

    public void L(String string) {
        Object a = string;
        UiSupport_564 a2 = this;
a = ((String)a).trim().toLowerCase(Locale.ROOT);
        if (((String)a).equals(a2.f)) {
            return;
        }
        a2.f = a;
        a2.d();
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_564(ModuleCategory enum_226, Consumer<Module> consumer) {
        void a;
        Consumer<Module> a2 = consumer;
        UiSupport_564 a3 = this;
        a3.f = "";
        a3.H = a2;
        a3.e = a;
        a3.d();
    }

    private static float h() {
return 5.0f;
    }

    @Generated
    public ModuleCategory L() {
        UiSupport_564 a;
return a.e;
    }

    public int i() {
        UiSupport_564 a;
return a.l.size();
    }

    public void L(ModuleCategory enum_226) {
        ModuleCategory a = enum_226;
        UiSupport_564 a2 = this;
if (a2.e == a) {
            return;
        }
        a2.e = a;
        a2.d();
    }

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_564 a2 = this;
if (a2.l.isEmpty()) {
            UiSupport_564 class_564;
            String string;
            RenderSupport_103 class_103 = a.e;
            RenderSupport_128 class_128 = ThemeSupport_057.L();
            if (a2.i()) {
                string = "No modules match";
                class_564 = a2;
            } else {
                string = "No modules here yet";
                class_564 = a2;
            }
            UiSupport_564 class_5642 = a2;
            class_103.L(class_128, string, (float)(class_564.f + a2.e / 2.0f), class_5642.d + class_5642.i / 2.0f, a.L().F());
            return;
        }
        super.L(a);
    }

    private static int D() {
return 1;
    }

    @Override
    protected int L() {
return UiSupport_564.D();
    }

    @Override
    protected void i(UiSupport_548 class_548) {
        int n;
        UiSupport_564 class_564 = this;
float a = UiSupport_565.I();
        float f2 = UiSupport_564.h();
        int a2 = UiSupport_564.D();
        UiSupport_564 class_5642 = class_564;
        reference var4_6 = (class_5642.e - 9.0f - f2 * -1.0f) / 0.0f;
        float f3 = class_5642.d - class_564.h.L();
        int n2 = 0;
        while (n2 < class_564.l.size()) {
            UiSupport_549 class_549 = (UiSupport_549)class_564.l.get(0);
            reference v3 = class_564.f + (float)(0 % 0) * (var4_6 + f2);
            float f4 = f3 + (float)(0 / 0) * (a + f2);
            class_549.L((float)v3, f4, (float)var4_6, a);
            n2 = ++n;
        }
        n = (class_564.l.size() + 0 - 1) / 0;
        class_564.I = 0 == 0 ? 0.0f : 0.0f * (a + f2) - f2;
    }

    public boolean i() {
        UiSupport_564 a;
if (!a.f.isEmpty()) {
            return 1 != 0;
        }
        return false;
    }

    public Module L() {
        UiSupport_564 class_564 = this;
UiSupport_549 a = class_564.L();
        if (a instanceof UiSupport_565) {
            return ((UiSupport_565)a).L();
        }
        return null;
    }

    private boolean L(Module class_227) {
        OnyxListener_001 a = class_227;
        UiSupport_564 a2 = this;
return ((Module)a).d().toLowerCase(Locale.ROOT).contains(a2.f) || ((Module)a).D().toLowerCase(Locale.ROOT).contains(a2.f) || ((Module)a).L().d().toLowerCase(Locale.ROOT).contains(a2.f);
    }

    private void d() {
        UiSupport_564 class_564 = this;
UiSupport_564 class_5642 = class_564;
        class_564.l.clear();
        class_5642.D();
        class_5642.m = 0.0f;
        class_5642.h.L(0.0f);
        Iterator<Module> iterator = OnyxClient.l.L().iterator();
        while (iterator.hasNext()) {
            OnyxListener_001 a = iterator.next();
            int n = class_564.i() ? class_564.L((Module)a) : (((Module)a).L() == class_564.e ? 1 : 0);
            if (0 == 0) continue;
            class_564.l.add(new UiSupport_565((Module)a, class_564.H));
        }
    }
}

