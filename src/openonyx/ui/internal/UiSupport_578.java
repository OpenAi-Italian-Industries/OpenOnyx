/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import openonyx.input.InputSupport_002;
import openonyx.render.RenderSupport_103;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_060;
import openonyx.ui.UiSupport_545;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_549;
import openonyx.ui.internal.UiSupport_566;

public class UiSupport_578
extends UiSupport_549 {
    private final List<UiSupport_545> G;
    private final static float A = 10.0f;
    private final static float K = 6.0f;
    private final static float B = 16.0f;
    private final static float C = 7.0f;
    private float J;
    private final RenderSupport_121 D;
    private final static float c = 10.0f;
    private final List<UiSupport_566> a;
    private final static float k = 0.85f;
    private final static float g = 30.0f;
    private float M;
    private float L;
    private final static int j = 2;
    private float m;
    private final static float h = 12.0f;
    private boolean l;
    private final static float I = 150.0f;
    private boolean f;
    private final static float H = 14.0f;

    @Generated
    public boolean i() {
        UiSupport_578 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        float a2222 = f2;
        UiSupport_578 a3 = this;
if (!a3.f) {
            return 0 != 0;
        }
        if (!a3.L(a2222, (float)a2)) {
            a3.d();
            return 1 != 0;
        }
        if (a != false) {
            return --1 != 0;
        }
        int a2222 = a3.L((float)a2);
        if (a2222 >= 0) {
            UiSupport_566 class_566 = a3.a.get(a2222);
            Runnable a2222 = class_566.L();
            if (!class_566.d()) {
                a3.d();
            }
            if (a2222 != null) {
                a2222.run();
            }
        }
        return true;
    }

    public UiSupport_578() {
        UiSupport_578 a;
        UiSupport_578 class_578 = a;
        a.a = new ArrayList<UiSupport_566>();
        class_578.G = new ArrayList<UiSupport_545>();
        a.D = new RenderSupport_121(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public void d(List<UiSupport_566> list, UiSupport_549 class_549, UiSupport_549 class_5492, RenderSupport_103 class_103) {
        UiSupport_549 class_5493;
        float f2;
        void a;
        void a32;
        void a22;
        UiSupport_549 a4 = class_5492;
        UiSupport_578 a5 = this;
a5.L((List<UiSupport_566>)a22, a4, (RenderSupport_103)a32);
        void v0 = a;
        float a22 = a.d() + v0.i();
        float a32 = v0.D() + a.L();
        a5.f = Math.clamp(a22 - a5.e, a4.d() + 6.0f, a4.d() + a4.i() - a5.e - 6.0f);
        int n = a5.l = a32 + a5.i > a4.D() + a4.L() - 6.0f ? 1 : 0;
        if (a5.l) {
            f2 = a.D() - a5.i;
            class_5493 = a4;
        } else {
            f2 = a32;
            class_5493 = a4;
        }
        a5.d = Math.clamp(f2, class_5493.D() + 6.0f, a4.D() + a4.L() - a5.i - 6.0f);
        a5.J = a22;
        UiSupport_578 class_578 = a5;
        class_578.M = a5.l ? class_578.d + a5.i : class_578.d;
        a5.D.L(0.0f).L(1.0f, 200.0f, RenderSupport_123.H);
    }

    @Override
    public void d(UiSupport_548 class_548) {
        int n;
        UiSupport_548 a = class_548;
        UiSupport_578 a2 = this;
if (!a2.f) {
            return;
        }
        UiSupport_578 class_578 = a2;
        a2.D.L(a.i);
        a2.h = (float)class_578.L(a.H, a.f);
        int n2 = class_578.h != false ? a2.L(a.f) : -1;
        int n3 = 0;
        while (n3 < a2.G.size()) {
            a2.G.get(++n).L(a.i, (0 == n2 ? 1 : 0) != 0, false);
            n3 = 0;
        }
    }

    public void d() {
        UiSupport_578 a;
if (!a.f) {
            return;
        }
        UiSupport_578 class_578 = a;
        a.f = 0;
        class_578.a.clear();
        class_578.G.clear();
        class_578.L = 0.0f;
        a.m = 0.0f;
    }

    @Override
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        UiSupport_578 a2 = this;
if (!a2.f || a.D() != 1) {
            return false;
        }
        a2.d();
        return --1 != 0;
    }

    private float I() {
        Iterator<UiSupport_566> iterator;
        UiSupport_578 class_578 = this;
float a = 12.0f;
        Iterator<UiSupport_566> iterator2 = iterator = class_578.a.iterator();
        while (iterator2.hasNext()) {
            UiSupport_566 class_566 = iterator.next();
            a += class_566.D() ? 7.0f : 30.0f;
            iterator2 = iterator;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(List<UiSupport_566> list, UiSupport_549 class_549, RenderSupport_103 class_103) {
        void a;
        void a2;
        Iterator a3 = list;
        UiSupport_578 a4 = this;
UiSupport_578 class_578 = a4;
        class_578.a.clear();
        class_578.G.clear();
        class_578.a.addAll((Collection<UiSupport_566>)((Object)a3));
        a3 = a3.iterator();
        Iterator iterator = a3;
        while (iterator.hasNext()) {
            UiSupport_566 cfr_ignored_0 = (UiSupport_566)a3.next();
            iterator = a3;
            a4.G.add(new UiSupport_545());
        }
        UiSupport_578 class_5782 = a4;
        class_5782.e = class_5782.L((RenderSupport_103)a2);
        class_5782.L = class_5782.I();
        a4.i = Math.min(a4.L, a.L() - 12.0f);
        a4.m = 0.0f;
        a4.f = 1;
    }

    /*
     * WARNING - void declaration
     */
    public void L(List<UiSupport_566> list, UiSupport_549 class_549, UiSupport_549 class_5492, RenderSupport_103 class_103) {
        UiSupport_549 class_5493;
        float f2;
        float f3;
        void a;
        void a2;
        void a222;
        UiSupport_549 a3 = class_5492;
        UiSupport_578 a4 = this;
a4.L((List<UiSupport_566>)a222, a3, (RenderSupport_103)a2);
        float a222 = a.d() + a.i();
        int n = a2 = f3 + a4.e > a3.d() + a3.i() - 6.0f ? 1 : 0;
        if (0 != 0) {
            f2 = a.d() - a4.e;
            class_5493 = a3;
        } else {
            f2 = a222;
            class_5493 = a3;
        }
        a4.f = Math.clamp(f2, class_5493.d() + 6.0f, a3.d() + a3.i() - a4.e - 6.0f);
        a4.d = Math.clamp(a.D(), a3.D() + 6.0f, a3.D() + a3.L() - a4.i - 6.0f);
        a4.l = 0;
        UiSupport_578 class_578 = a4;
        class_578.J = a4.l != 0 ? class_578.f + a4.e : class_578.f;
        UiSupport_578 class_5782 = a4;
        class_5782.M = class_5782.d;
        class_5782.D.L(0.0f).L(1.0f, 200.0f, RenderSupport_123.H);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void L(UiSupport_548 var1_2) {
        var3_3 = this;
if (!var3_3.f) {
            return;
        }
        var2_4 = a.e;
        a = var3_3.D.L();
        v0 = var2_4;
        v1 = var2_4;
        v1.D();
        v1.L(a);
        v1.F();
        v2 = var3_3;
        v0.L(0.85f + 0.14999998f * a, v2.J, var3_3.M);
        v3 = var3_3;
        v4 = var3_3;
        v0.d((float)v2.f, v3.d, v4.e, v4.i, 4.0f, 1 ^ 3);
        v5 = var3_3;
        v6 = var3_3;
        v0.D((float)v3.f, v5.d, v6.e, v6.i, 4.0f, ThemeSupport_060.L(1 ^ 3, a.L()));
        v7 = var3_3;
        v8 = var3_3;
        var2_4.d((float)v5.f, v7.d, v8.e, v8.i);
        a = v7.d + 6.0f - var3_3.m;
        v9 = var4_5 = 3 >> 2;
        while (v9 < var3_3.a.size()) {
            block14: {
                block13: {
                    var5_7 = var3_3.a.get(var4_5);
                    if (!var5_7.D()) break block13;
                    if (a + 7.0f >= var3_3.d) {
                        v10 = var3_3;
                        if (a <= v10.d + v10.i) {
                            var2_4.i(var3_3.f + 12.0f, a + 3.5f, var3_3.e - 24.0f, 1.0f, a.L().P());
                        }
                    }
                    a += 7.0f;
                    break block14;
                }
                if (a + 30.0f < var3_3.d) ** GOTO lbl-1000
                v11 = var3_3;
                if (a > v11.d + v11.i) lbl-1000:
                // 2 sources

                {
                    a += 30.0f;
                } else {
                    v12 = a;
                    var6_9 = var5_7.L() != false ? v12.L().K() : v12.L().d();
                    var3_3.G.get(var4_5).L(var2_4, (float)var3_3.f, a, var3_3.e, 30.0f, 0.0f, var6_9);
                    var7_11 = var3_3.f + 12.0f;
                    if (var5_7.L() != null) {
                        var8_12 = var5_7.L().getAsBoolean();
                        var9_13 = var7_11 + 1.0f;
                        var10_14 = a + 8.0f;
                        v13 = var2_4;
                        if (var8_12) {
                            v13.D(var9_13, var10_14, 14.0f, 14.0f, 4.0f, a.L().E());
                            v14 = var7_11;
                            UiSupport_546.d(var2_4, var9_13 + 7.0f, var10_14 + 7.0f, 10.0f, a.L().h());
                        } else {
                            v13.L(var9_13, var10_14, 14.0f, 14.0f, 4.0f, 1.0f, a.L().F());
                            v14 = var7_11;
                        }
                        var7_11 = v14 + 26.0f;
                        v15 = var2_4;
                    } else {
                        if (var5_7.L() != null) {
                            var2_4.L(var5_7.L(), var7_11 + 8.0f, a + 15.0f, 16.0f, var5_7.L() != false ? var6_9 : a.L().F());
                            var7_11 += 26.0f;
                        }
                        v15 = var2_4;
                    }
                    v16 = var3_3;
                    v15.l(ThemeSupport_057.l, var2_4.L(ThemeSupport_057.l, var5_7.d(), (float)(v16.f + v16.e - 12.0f - var7_11)), var7_11, a + 15.0f, var6_9);
                    a += 30.0f;
                }
            }
            v9 = ++var4_5;
        }
        var2_4.L();
        v17 = var3_3;
        var4_6 = Math.max(0.0f, v17.L - v17.i);
        if (v18 > 0.0f) {
            var5_8 = var3_3.i - 12.0f;
            v19 = var3_3;
            var6_10 = Math.max(24.0f, var5_8 * v19.i / var3_3.L);
            var7_11 = v19.d + 6.0f + (var5_8 - var6_10) * var3_3.m / var4_6;
            v20 = var3_3;
            var2_4.D(v20.f + v20.e - 5.0f, var7_11, 3.0f, var6_10, 3.4028235E38f, a.L().P());
        }
        v21 = var2_4;
        v21.k();
        v21.e();
        if (var3_3.h != false) {
            var2_4.h();
        }
    }

    /*
     * WARNING - void declaration
     */
    private int L(float f2) {
        int n;
        UiSupport_578 class_578 = this;
float a = class_578.d + 6.0f - class_578.m;
        int n2 = 0;
        while (n2 < class_578.a.size()) {
            void a2;
            float f3;
            UiSupport_566 class_566 = class_578.a.get(0);
            float f4 = f3 = class_566.D() ? 7.0f : 30.0f;
            if (!class_566.D() && a2 >= 0 && a2 < 0 + f3) {
                return 0;
            }
            a += f3;
            n2 = ++n;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103) {
        Iterator<UiSupport_566> iterator;
        UiSupport_578 class_578 = this;
float f2 = 150.0f;
        Iterator<UiSupport_566> iterator2 = iterator = class_578.a.iterator();
        while (iterator2.hasNext()) {
            void a;
            UiSupport_566 a2 = iterator.next();
            if (a2.D()) {
                iterator2 = iterator;
                continue;
            }
            float f3 = a.L(ThemeSupport_057.l, a2.d());
            float f4 = a2.L() == null && a2.L() == null ? 0.0f : 26.0f;
            f2 = Math.max(f2, 24.0f + f4 + f3);
            iterator2 = iterator;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, double d) {
        void a;
        void a2;
        float a3 = f2;
        UiSupport_578 a4 = this;
if (!a4.f) {
            return 3 >> 2;
        }
        if (!a4.L(a3, (float)a2)) {
            return 3 >> 1;
        }
        UiSupport_578 class_578 = a4;
        a3 = Math.max(0.0f, class_578.L - class_578.i);
        a4.m = Math.clamp(a4.m - 0.0f, 0.0f, a3);
        return --1 != 0;
    }
}

