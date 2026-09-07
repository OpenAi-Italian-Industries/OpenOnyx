/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.List;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.MultiEnumSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_591<E extends Enum<E>>
extends UiSupport_596 {
    private final static float c = 9.0f;
    private boolean a;
    private final static float k = 5.0f;
    private final List<float[]> g;
    private final static float M = 12.0f;
    private final static float L = 23.0f;
    private final MultiEnumSetting<E> j;
    private float m;
    private final List<RenderSupport_121> e;

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_591 a2 = this;
return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    private float L(UiSupport_548 class_548, int n, float f2) {
        void a;
        void a32;
        int a22 = 0;
        UiSupport_591 a4 = this;
String a22 = EnumSetting.L((Enum)a4.j.d().get(0));
        float a32 = a32.e.L(ThemeSupport_057.d, a22);
        return 18.0f + a32 + 16.0f * a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        int a;
        UiSupport_591 class_591 = this;
if (!class_591.i() || 0 != 0) {
            return false;
        }
        int n2 = 0;
        while (n2 < class_591.g.size()) {
            void a2;
            void a3;
            Object a4 = class_591.g.get(0);
            if (a3 >= a4[0] && a3 < a4[0] + a4[2] && a2 >= a4[1] && a2 < a4[1] + 23.0f) {
                UiSupport_591 class_5912 = class_591;
                class_5912.j.L((Enum)class_5912.j.d().get(0));
                return 5 >> 2;
            }
            n2 = ++a;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public UiSupport_591(MultiEnumSetting<E> interface_001) {
        int n;
        OnyxListener_001 a;
        void a2;
        UiSupport_591 class_591 = interface_0012;
        OnyxListener_001 interface_0012 = interface_001;
        interface_001 = class_591;
        void v1 = a2;
        super((Setting)a);
        void v2 = a2;
        a2.e = new ArrayList<RenderSupport_121>();
        v2.g = new ArrayList<float[]>();
        v1.m = 50.0f;
        v1.j = a;
        int n2 = 0;
        while (n2 < ((MultiEnumSetting)a).d().size()) {
            a2.e.add(new RenderSupport_121(0.0f));
            float[] fArray = new float[3];
            fArray[0] = 0.0f;
            fArray[1] = 0.0f;
            fArray[2] = 0.0f;
            a2.g.add(fArray);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        int a;
        void a2;
        UiSupport_591 class_591 = this;
UiSupport_591 class_5912 = class_591;
        super.d((UiSupport_548)a2);
        float f2 = class_5912.f;
        float f3 = class_5912.l();
        float f4 = 23.0f;
        int n = 0;
        while (n < class_591.j.d().size()) {
            RenderSupport_121 class_121;
            UiSupport_591 class_5913 = class_591;
            boolean bl = class_5913.j.L((Enum)class_5913.j.d().get(0));
            RenderSupport_121 class_1212 = class_591.e.get(0);
            if (!class_591.a) {
                class_1212.L(bl ? 1.0f : 0.0f);
                class_121 = class_1212;
            } else {
                if (class_1212.d() != (bl ? 1.0f : 0.0f)) {
                    class_1212.L(bl ? 1.0f : 0.0f, 250.0f, RenderSupport_123.l);
                }
                class_121 = class_1212;
            }
            class_121.L(a2.i);
            float f5 = class_591.L((UiSupport_548)a2, 0, class_1212.L());
            if (f2 > class_591.f) {
                UiSupport_591 class_5914 = class_591;
                if (f2 + f5 > class_5914.f + class_5914.e) {
                    f2 = class_591.f;
                    f3 += f4 + 5.0f;
                }
            }
            class_591.g.get(0)[0] = f2;
            class_591.g.get(0)[1] = f3;
            class_591.g.get(0)[2] = f5;
            f2 += f5 + 5.0f;
            n = ++a;
        }
        class_591.a = 1;
        class_591.m = f3 + f4 + 6.0f - class_591.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        int n;
        void a;
        UiSupport_591 class_591 = this;
RenderSupport_103 a2 = a.e;
        UiSupport_591 class_5912 = class_591;
        class_5912.L((UiSupport_548)a, (float)class_5912.e);
        int n2 = 0;
        while (n2 < class_591.j.d().size()) {
            int n3;
            Object a3 = class_591.g.get(0);
            float f3 = class_591.e.get(0).L();
            Object object = a3;
            a3 = object[0];
            Object object2 = object[1];
            reference var7_9 = object[2];
            int n4 = n3 = a.H >= a3 && a.H < a3 + var7_9 && a.f >= object2 && a.f < object2 + 23.0f ? 1 : 0;
            if (f3 > 0.01f) {
                a2.D(0.0f, (float)object2, (float)var7_9, 23.0f, 8.0f, class_591.L(ThemeSupport_059.L(a.L().G(), f3)));
            }
            if (f3 < 0.99f) {
                a2.L(0.0f, (float)object2, (float)var7_9, 23.0f, 8.0f, 1.0f, class_591.L(ThemeSupport_059.L(a.L().e(), 1.0f - f3)));
            }
            if (n3 != 0) {
                a2.D(0.0f, (float)object2, (float)var7_9, 23.0f, 8.0f, class_591.L(ThemeSupport_059.L(a.L().d(), 0.08f)));
            }
            var7_9 = a3 + 9.0f + 16.0f * f3;
            void v4 = a;
            int n5 = n3 = f3 > 0.5f ? v4.L().D() : v4.L().F();
            if (f3 > 0.05f) {
                UiSupport_546.d(a2, (float)(a3 + 9.0f + 6.0f), (float)(object2 + 11.5f), 12.0f * (0.7f + 0.3f * f3), class_591.L(ThemeSupport_059.L(n3, f3)));
            }
            String string = EnumSetting.L((Enum)class_591.j.d().get(0));
            a2.l(ThemeSupport_057.d, string, (float)var7_9, (float)(object2 + 11.5f), class_591.L(n3));
            n2 = ++n;
        }
    }
}

