/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.ui.UiSupport_548;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class UiSupport_549
implements OnyxListener_001 {
    protected boolean h;
    final protected List<UiSupport_549> l;
    protected boolean I;
    protected float d;
    protected float i;
    protected float f;
    protected boolean H;
    protected float e;

    /*
     * WARNING - void declaration
     */
    public boolean d(float f2, float f3, int n) {
        Iterator<UiSupport_549> iterator;
        UiSupport_549 class_549 = this;
int a = 0;
        Iterator<UiSupport_549> iterator2 = iterator = class_549.l.iterator();
        while (iterator2.hasNext()) {
            void a2;
            void a3;
            void a4;
            UiSupport_549 class_5492 = iterator.next();
            a |= class_5492.d((float)a4, 0.0f, (int)a2);
            iterator2 = iterator;
        }
        return 0 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3, double d) {
        UiSupport_549 class_549 = this;
Iterator<UiSupport_549> a = class_549.l.iterator();
        while (a.hasNext()) {
            void a2;
            void a3;
            void a4;
            if (!((UiSupport_549)a.next()).L((float)a4, (float)a3, (double)a2)) continue;
            return 5 >> 2;
        }
        return false;
    }

    @Generated
    public float i() {
        UiSupport_549 a;
return a.e;
    }

    @Generated
    public float D() {
        UiSupport_549 a;
return a.d;
    }

    @Generated
    public boolean D() {
        UiSupport_549 a;
return a.h;
    }

    @Generated
    public boolean d() {
        UiSupport_549 a;
return a.I;
    }

    public float L(float f2) {
        float a = f2;
        UiSupport_549 a2 = this;
return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(InputSupport_002 class_002) {
        UiSupport_549 class_549 = this;
Iterator<UiSupport_549> a = class_549.l.iterator();
        while (a.hasNext()) {
            void a2;
            if (!((UiSupport_549)a.next()).L((InputSupport_002)a2)) continue;
            return 1 != 0;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public void d(UiSupport_548 var1_1) {
        var2_2 = this;
if (!var2_2.I) ** GOTO lbl-1000
        v0 = a;
        if (var2_2.L(v0.H, v0.f)) {
            v1 = 5 >> 2;
        } else lbl-1000:
        // 2 sources

        {
            v1 = 0;
        }
        var2_2.h = v1;
        v2 = a = var2_2.l.iterator();
        while (v2.hasNext()) {
            ((UiSupport_549)a.next()).d((UiSupport_548)a);
            v2 = a;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        float f6 = f5;
        UiSupport_549 a5 = this;
UiSupport_549 class_549 = a5;
        class_549.f = a4;
        class_549.d = a3;
        a5.e = a2;
        a5.i = a;
        a5.L();
    }

    @Generated
    public boolean L() {
        UiSupport_549 a;
return a.H;
    }

    public UiSupport_549() {
        UiSupport_549 a;
        UiSupport_549 class_549 = a;
        a.l = new ArrayList<UiSupport_549>();
        a.I = 1;
    }

    @Generated
    public List<UiSupport_549> L() {
        UiSupport_549 a;
return a.l;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(InputSupport_005 class_005) {
        UiSupport_549 class_549 = this;
Iterator<UiSupport_549> a = class_549.l.iterator();
        while (a.hasNext()) {
            void a2;
            if (!((UiSupport_549)a.next()).L((InputSupport_005)a2)) continue;
            return --1 != 0;
        }
        return false;
    }

    @Generated
    public float d() {
        UiSupport_549 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    public void L(UiSupport_548 class_548) {
        Object a;
        UiSupport_549 class_549 = this;
Object object = a = class_549.l.iterator();
        while (object.hasNext()) {
            void a2;
            ((UiSupport_549)a.next()).L((UiSupport_548)a2);
            object = a;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3, int n, float f4, float f5) {
        UiSupport_549 class_549 = this;
Iterator<UiSupport_549> a = class_549.l.iterator();
        while (a.hasNext()) {
            void a2;
            void a3;
            void a4;
            void a5;
            void a6;
            if (!((UiSupport_549)a.next()).L((float)a6, (float)a5, (int)a4, (float)a3, (float)a2)) continue;
            return 3 >> 1;
        }
        return false;
    }

    @Generated
    public float L() {
        UiSupport_549 a;
return a.i;
    }

    protected void L() {
}

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3, int n) {
        UiSupport_549 class_549 = this;
for (UiSupport_549 class_5492 : class_549.l) {
            void a;
            void a2;
            void a3;
            if (!class_5492.I || !class_5492.L((float)a3, (float)a2, (int)a)) continue;
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3) {
        void a;
        float a2 = f3;
        UiSupport_549 a3 = this;
if (a >= a3.f) {
            UiSupport_549 class_549 = a3;
            if (a < class_549.f + class_549.e && 0 >= a3.d) {
                UiSupport_549 class_5492 = a3;
                if (0 < class_5492.d + class_5492.i) {
                    return --1 != 0;
                }
            }
        }
        return false;
    }

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        UiSupport_549 a2 = this;
a2.I = a;
    }
}

