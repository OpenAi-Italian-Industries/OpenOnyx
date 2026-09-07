/*
 * Decompiled with CFR.
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.minecraft.block.Block;
import openonyx.core.OnyxListener_001;
import openonyx.history.Setting;
import openonyx.history.internal.BlockSetSetting;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.render.RenderSupport_103;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.ui.UiSupport_546;
import openonyx.ui.UiSupport_548;
import openonyx.ui.internal.UiSupport_589;
import openonyx.ui.internal.UiSupport_596;

public class UiSupport_601
extends UiSupport_596 {
    private final List<Block> E;
    private final static int F = 6;
    private final UiSupport_589 G;
    private float A;
    private int K;
    private final List<float[]> B;
    private final static float C = 22.0f;
    private final static float J = 9.0f;
    private int D;
    private final static float c = 10.0f;
    private float a;
    private final static float k = 6.0f;
    private final List<Block> g;
    private String M;
    private final static float L = 5.0f;
    private final BlockSetSetting j;
    private final static float m = 22.0f;

    /*
     * WARNING - void declaration
     */
    @Override
    public void d(UiSupport_548 class_548) {
        int n;
        void a;
        float f2;
        int a22;
        UiSupport_601 class_601 = this;
UiSupport_601 class_6012 = class_601;
        class_6012.G.L(class_6012.f, class_601.l(), class_601.e, 40.0f);
        class_601.A = class_601.l() + 40.0f + 6.0f;
        class_601.K = -1;
        int n2 = 0;
        while (n2 < class_601.E.size()) {
            f2 = class_601.A + 0.0f;
            if (a.H >= class_601.f) {
                UiSupport_601 class_6013 = class_601;
                if (a.H < class_6013.f + class_6013.e && a.f >= f2 && a.f < f2 + 22.0f) {
                    class_601.K = 0;
                }
            }
            n2 = ++a22;
        }
        UiSupport_601 class_6014 = class_601;
        class_6014.g.clear();
        class_6014.g.addAll((Collection)class_601.j.L());
        UiSupport_601 class_6015 = class_601;
        class_6015.B.clear();
        float a22 = class_6015.f;
        UiSupport_601 class_6016 = class_601;
        f2 = class_6016.A + (float)class_6016.E.size() * 22.0f + (class_601.E.isEmpty() ? 0.0f : 6.0f);
        class_601.D = -1;
        int n3 = 0;
        while (n3 < class_601.g.size()) {
            UiSupport_601 class_6017 = class_601;
            float f3 = Math.min(class_6017.L((UiSupport_548)a, class_6017.g.get(0)), class_601.e);
            if (a22 > class_601.f) {
                UiSupport_601 class_6018 = class_601;
                if (a22 + f3 > class_6018.f + class_6018.e) {
                    a22 = class_601.f;
                    f2 += 27.0f;
                }
            }
            float[] fArray = new float[3];
            fArray[0] = a22;
            fArray[1] = f2;
            fArray[2] = f3;
            class_601.B.add(fArray);
            if (a.H >= a22 && a.H < a22 + f3 && a.f >= f2 && a.f < f2 + 22.0f) {
                class_601.D = 0;
            }
            a22 += f3 + 5.0f;
            n3 = ++n;
        }
        class_601.a = (class_601.g.isEmpty() ? f2 : f2 + 22.0f) + 6.0f - class_601.d;
        super.d((UiSupport_548)a);
    }

    public UiSupport_601(BlockSetSetting class_044) {
        UiSupport_601 a;
        OnyxListener_001 a2 = class_044;
        UiSupport_601 class_601 = a = this;
        UiSupport_601 class_6012 = a;
        super((Setting)a2);
        UiSupport_601 class_6013 = a;
        a.G = new UiSupport_589("Search blocks");
        class_6013.E = new ArrayList<Block>();
        class_6012.g = new ArrayList<Block>();
        class_6012.B = new ArrayList<float[]>();
        class_6012.M = "";
        class_601.a = 60.0f;
        a.D = class_601.K = -1;
        a.j = a2;
        a.G.L((String string) -> {
            UiSupport_601 class_601;
            Iterator a = string;
            UiSupport_601 a2 = this;
a2.M = a == null ? "" : ((String)((Object)a)).trim().toLowerCase(Locale.ROOT);
            UiSupport_601 class_6012 = a2;
            class_6012.E.clear();
            if (class_6012.M.isEmpty()) {
                return;
            }
            a = Block.blockRegistry.iterator();
            do {
                Block block;
                Iterator iterator = a;
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    block = (Block)a.next();
                    if (BlockSetSetting.L(block).contains(a2.M) || block.getLocalizedName().toLowerCase(Locale.ROOT).contains(a2.M)) break;
                    iterator = a;
                }
                class_601 = a2;
                class_601.E.add(block);
            } while (class_601.E.size() < 6);
        });
        UiSupport_601 class_6014 = a;
        class_6014.l.add(class_6014.G);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean L(float f2, float f3, int n) {
        void a;
        void a2;
        int a3 = 0;
        UiSupport_601 a4 = this;
if (!a4.i() || 0 != 0) {
            return false;
        }
        if (a4.G.L((float)a2, (float)a, 0)) {
            return --1 != 0;
        }
        if (a4.K >= 0) {
            UiSupport_601 class_601 = a4;
            class_601.j.D(class_601.E.get(a4.K));
            return --1 != 0;
        }
        if (a4.D >= 0) {
            UiSupport_601 class_601 = a4;
            class_601.j.d(class_601.g.get(a4.D));
            return --1 != 0;
        }
        return false;
    }

    @Override
    protected float L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_601 a2 = this;
return a2.a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void d(UiSupport_548 class_548, float f2) {
        float f3;
        void a;
        UiSupport_601 class_601 = this;
RenderSupport_103 a2 = a.e;
        String a3 = class_601.g.size() + " selected";
        UiSupport_601 class_6012 = class_601;
        float f4 = a2.L(ThemeSupport_057.C, a3);
        class_6012.L((UiSupport_548)a, class_601.e - f4 - 12.0f);
        UiSupport_601 class_6013 = class_601;
        a2.d(ThemeSupport_057.C, a3, class_6013.f + class_6013.e, class_601.I(), class_601.L(a.L().F()));
        class_6012.G.L((UiSupport_548)a);
        int n = 0;
        while (n < class_601.E.size()) {
            Block block = class_601.E.get(0);
            UiSupport_601 class_6014 = class_601;
            f3 = class_6014.A + 0.0f;
            boolean bl = class_6014.j.L(block);
            if (class_6014.K == 0) {
                a2.D(class_601.f, f3, class_601.e, 22.0f, 4.0f, class_601.L(ThemeSupport_059.L(a.L().d(), 0.08f)));
            }
            void v4 = a;
            a2.l(ThemeSupport_057.I, a2.L(ThemeSupport_057.I, UiSupport_601.L(block), class_601.e - 30.0f), class_601.f + 8.0f, f3 + 11.0f, class_601.L(bl ? v4.L().E() : v4.L().d()));
            if (bl) {
                UiSupport_601 class_6015 = class_601;
                UiSupport_546.d(a2, class_6015.f + class_6015.e - 14.0f, f3 + 11.0f, 12.0f, class_601.L(a.L().E()));
            }
            n = ++a3;
        }
        int n2 = 0;
        while (n2 < class_601.B.size()) {
            float[] fArray = class_601.B.get(0);
            f3 = fArray[0];
            float f5 = fArray[1];
            float f6 = fArray[2];
            a2.D(f3, f5, f6, 22.0f, 8.0f, class_601.L(a.L().G()));
            if (class_601.D == 0) {
                a2.D(f3, f5, f6, 22.0f, 8.0f, class_601.L(ThemeSupport_059.L(a.L().d(), 0.08f)));
            }
            int n3 = a.L().D();
            float f7 = f6 - 18.0f - 10.0f - 5.0f;
            RenderSupport_103 class_103 = a2;
            class_103.l(ThemeSupport_057.d, class_103.L(ThemeSupport_057.d, UiSupport_601.L(class_601.g.get(0)), f7), f3 + 9.0f, f5 + 11.0f, class_601.L(n3));
            f6 = f3 + f6 - 9.0f - 5.0f;
            f7 = f5 + 11.0f;
            float f8 = 4.0f;
            RenderSupport_103 class_1032 = a2;
            class_1032.I(f6 - f8, f7 - f8, f6 + f8, f7 + f8, 1.4f, class_601.L(n3));
            class_1032.I(f6 - f8, f7 + f8, f6 + f8, f7 - f8, 1.4f, class_601.L(n3));
            n2 = ++a3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private float L(UiSupport_548 class_548, Block block) {
        void a;
        Block a2 = block;
        UiSupport_601 a3 = this;
return 18.0f + a.e.L(ThemeSupport_057.d, UiSupport_601.L(a2)) + 10.0f + 5.0f;
    }

    private static String L(Block a) {
return a.getLocalizedName();
    }
}

