/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.List;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_567<E extends Enum<E>>
extends UiSupport_596 {
    private final List<float[]> D;
    private float c;
    private final static float a = 9.0f;
    private final List<RenderSupport_121> k;
    private final MultiSelectSetting<E> g;
    private final static float M = 5.0f;
    private boolean L;
    private final static float j = 12.0f;
    private final static float m = 23.0f;

    /*
     * WARNING - void declaration
     */
    public UiSupport_567(MultiSelectSetting<E> interface_001) {
        int n;
        OnyxListener_001 a;
        void a2;
        UiSupport_567 class_567 = interface_0012;
        OnyxListener_001 interface_0012 = interface_001;
        interface_001 = class_567;
        void v1 = a2;
        super((Setting)a);
        void v2 = a2;
        a2.k = new ArrayList<RenderSupport_121>();
        v2.D = new ArrayList<float[]>();
        v1.c = 50.0f;
        v1.g = a;
        int n2 = 0;
        while (n2 < ((MultiSelectSetting)a).d().size()) {
            a2.k.add(new RenderSupport_121(0.0f));
            float[] fArray = new float[3];
            fArray[0] = 0.0f;
            fArray[1] = 0.0f;
            fArray[2] = 0.0f;
            a2.D.add(fArray);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        int a;
        UiSupport_567 class_567 = this;
if (!class_567.i() || a != 0) {
            return false;
        }
        int n2 = 0;
        while (n2 < class_567.D.size()) {
            void a2;
            void a3;
            Object a4 = class_567.D.get(0);
            if (a3 >= a4[0] && a3 < a4[0] + a4[2] && a2 >= a4[1] && a2 < a4[1] + 23.0f) {
                UiSupport_567 class_5672 = class_567;
                class_5672.g.L((Enum)class_5672.g.d().get(0));
                return 1 != 0;
            }
            n2 = ++a;
        }
        return false;
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_567 a2 = this;
return a2.c;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        int a;
        void a2;
        UiSupport_567 class_567 = this;
UiSupport_567 class_5672 = class_567;
        super.d((UiSupport_548)a2);
        float f2 = class_5672.f;
        float f3 = class_5672.l();
        float f4 = 23.0f;
        int n = 0;
        while (n < class_567.g.d().size()) {
            RenderSupport_121 class_121;
            UiSupport_567 class_5673 = class_567;
            boolean bl = class_5673.g.L((Enum)class_5673.g.d().get(0));
            RenderSupport_121 class_1212 = class_567.k.get(0);
            if (!class_567.L) {
                class_1212.L(bl ? 1.0f : 0.0f);
                class_121 = class_1212;
            } else {
                if (class_1212.d() != (bl ? 1.0f : 0.0f)) {
                    class_1212.L(bl ? 1.0f : 0.0f, 250.0f, RenderSupport_123.l);
                }
                class_121 = class_1212;
            }
            class_121.L(a2.i);
            float f5 = class_567.L((UiSupport_548)a2, 0, class_1212.L());
            if (f2 > class_567.f) {
                UiSupport_567 class_5674 = class_567;
                if (f2 + f5 > class_5674.f + class_5674.e) {
                    f2 = class_567.f;
                    f3 += f4 + 5.0f;
                }
            }
            class_567.D.get(0)[0] = f2;
            class_567.D.get(0)[1] = f3;
            class_567.D.get(0)[2] = f5;
            f2 += f5 + 5.0f;
            n = ++a;
        }
        class_567.L = 1;
        class_567.c = f3 + f4 + 6.0f - class_567.d;
    }

    /*
     * WARNING - void declaration
     */
    private float L(UiSupport_548 class_548, int n, float f2) {
        void a;
        void a32;
        int a22 = 0;
        UiSupport_567 a4 = this;
String a22 = EnumSetting.L((Enum)a4.g.d().get(0));
        float a32 = a32.e.L(ThemeSupport_057.d, a22);
        return 18.0f + a32 + 16.0f * a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        int n;
        void a;
        UiSupport_567 class_567 = this;
RenderSupport_103 a2 = a.e;
        UiSupport_567 class_5672 = class_567;
        class_5672.L((UiSupport_548)a, class_5672.e);
        int n2 = 0;
        while (n2 < class_567.g.d().size()) {
            int n3;
            Object a3 = class_567.D.get(0);
            float f3 = class_567.k.get(0).L();
            Object object = a3;
            a3 = object[0];
            Object object2 = object[1];
            reference var7_9 = object[2];
            int n4 = n3 = a.H >= a3 && a.H < a3 + var7_9 && a.f >= object2 && a.f < object2 + 23.0f ? 1 : 0;
            if (f3 > 0.01f) {
                a2.D((float)a3, (float)object2, (float)var7_9, 23.0f, 8.0f, class_567.L(ThemeSupport_059.L(a.L().G(), f3)));
            }
            if (f3 < 0.99f) {
                a2.L((float)a3, (float)object2, (float)var7_9, 23.0f, 8.0f, 1.0f, class_567.L(ThemeSupport_059.L(a.L().e(), 1.0f - f3)));
            }
            if (n3 != 0) {
                a2.D((float)a3, (float)object2, (float)var7_9, 23.0f, 8.0f, class_567.L(ThemeSupport_059.L(a.L().d(), 0.08f)));
            }
            var7_9 = a3 + 9.0f + 16.0f * f3;
            void v4 = a;
            int n5 = n3 = f3 > 0.5f ? v4.L().D() : v4.L().F();
            if (f3 > 0.05f) {
                UiSupport_546.d(a2, (float)(a3 + 9.0f + 6.0f), (float)(object2 + 11.5f), 12.0f * (0.7f + 0.3f * f3), class_567.L(ThemeSupport_059.L(n3, f3)));
            }
            String string = EnumSetting.L((Enum)class_567.g.d().get(0));
            a2.l(ThemeSupport_057.d, string, (float)var7_9, (float)(object2 + 11.5f), class_567.L(n3));
            n2 = ++n;
        }
    }
}

