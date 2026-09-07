/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import openonyx.history.Setting;
import openonyx.render.RenderSupport_103;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.internal.UiSupport_570;
import openonyx.ui.internal.UiSupport_596;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UiSupport_593 {
    private final List<UiSupport_596> H;
    private final List<UiSupport_570> e;

    public UiSupport_593() {
        UiSupport_593 a;
        UiSupport_593 class_593 = a;
        a.H = new ArrayList<UiSupport_596>();
        class_593.e = new ArrayList<UiSupport_570>();
    }

    public void L() {
        UiSupport_593 a;
UiSupport_593 class_593 = a;
        class_593.H.clear();
        class_593.e.clear();
    }

    /*
     * WARNING - void declaration
     */
    public float L(float f2, float f3, float f4) {
        Iterator<UiSupport_596> iterator;
        void a;
        UiSupport_593 class_593 = this;
UiSupport_593 class_5932 = class_593;
        class_5932.e.clear();
        void a2 = a;
        float f5 = 0.0f;
        int n = 1;
        Iterator<UiSupport_596> iterator2 = iterator = class_5932.H.iterator();
        while (iterator2.hasNext()) {
            void a3;
            void a4;
            UiSupport_596 class_596 = iterator.next();
            float f6 = class_596.e();
            float f7 = class_596.h();
            if (f6 <= 0.5f) {
                iterator2 = iterator;
                class_596.L((float)a4, 0.0f, (float)a3, 0.0f);
                continue;
            }
            if (0 == 0) {
                class_593.e.add(new UiSupport_570((float)(a2 + 7.5f), Math.min(f5, f7)));
                a2 += 15.0f;
            }
            class_596.L((float)a4, 0.0f, (float)a3, f6);
            a2 += f6;
            f5 = f7;
            n = 0;
            iterator2 = iterator;
        }
        return (float)(a2 - a);
    }

    public boolean L() {
        UiSupport_593 a;
return a.H.isEmpty();
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 116;
        int cfr_ignored_0 = n << n ^ 6;
        int n4 = 0;
        int n5 = 119;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (0 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 0;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3, int n, float f4) {
        Object a;
        UiSupport_593 class_593 = this;
Object object = a = class_593.e.iterator();
        while (object.hasNext()) {
            void a2;
            void a3;
            void a4;
            void a5;
            float f5;
            void a6;
            UiSupport_570 class_570 = (UiSupport_570)a.next();
            float f6 = class_570.d() * a6;
            if (f5 <= 0.01f) {
                object = a;
                continue;
            }
            a5.i((float)a4, class_570.L(), (float)a3, 1.0f, ThemeSupport_059.L((int)a2, f6 * 0.8f));
            object = a;
        }
    }

    public void L(List<Setting> list) {
        Iterator a = list;
        UiSupport_593 a2 = this;
a2.L();
        a = a.iterator();
        while (a.hasNext()) {
            UiSupport_596 class_596 = UiSupport_596.L((Setting)a.next());
            if (class_596 == null) continue;
            a2.H.add(class_596);
        }
    }

    public List<UiSupport_596> L() {
        UiSupport_593 a;
return a.H;
    }
}

