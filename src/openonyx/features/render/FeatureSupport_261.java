/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.core.OnyxListener_001;
import openonyx.features.render.FeatureSupport_269;
import openonyx.features.render.BedESP;
import openonyx.features.render.FeatureSupport_323;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_i.RenderSupport_142;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;

public final class FeatureSupport_261
implements OnyxListener_001 {
    private final static int k = 5;
    private final static float g = 16.0f;
    private final static float M = 0.45f;
    private final static float L = 1.4f;
    private final static float j = 12.0f;
    private final static float m = 11.0f;
    private final static float h = 4.0f;
    private final static double l = 1.4;
    private final static int I = -938339561;
    private final static float d = 10.0f;
    private final static float i = 1.0f;
    private final BedESP f;
    private final static float H = 4.0f;
    private final static float e = 30.0f;

    private static String L(FeatureSupport_269 a) {
return String.valueOf(a.L());
    }

    public FeatureSupport_261(BedESP class_275) {
        OnyxListener_001 a = class_275;
        FeatureSupport_261 a2 = this;
        a2.f = a;
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, FeatureSupport_269 class_269, float f2, float f3) {
        void a;
        void a2;
        void a3;
        OnyxListener_001 a4 = class_103;
        FeatureSupport_261 a5 = this;
OnyxListener_001 interface_001 = a4;
        OnyxListener_001 interface_0012 = a4;
        OnyxListener_001 interface_0013 = a4;
        ((RenderSupport_103)interface_0013).F();
        ((RenderSupport_103)interface_0013).L(4.0f, (float)(a3 + 0.5f));
        ((RenderSupport_103)interface_0012).L(0.625f, 0.0f, 0.0f);
        ((RenderSupport_103)interface_001).L(a2.L(), 0.0f, 0.0f);
        ((RenderSupport_103)interface_0012).k();
        ((RenderSupport_103)interface_001).d(ThemeSupport_057.g, FeatureSupport_261.L((FeatureSupport_269)a2), (float)(a - 4.0f), (float)(a3 + 5.5f), ThemeSupport_059.L().d());
    }

    private double L(BlockPos blockPos) {
        BlockPos a = blockPos;
        FeatureSupport_261 a2 = this;
return FeatureSupport_261.e.thePlayer.getDistanceSq((double)a.getX() + 0.5, (double)a.getY() + 0.5, (double)a.getZ() + 0.5);
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, float f2, float f3) {
        FeatureSupport_261 class_261 = this;
Object object = new ArrayList<FeatureSupport_323>(class_261.f.D());
        if (object.isEmpty()) {
            return;
        }
        RenderSupport_120.L(class_261.f.K.d());
        object.sort(Comparator.comparingDouble(class_323 -> {
            FeatureSupport_323 a = class_323;
            FeatureSupport_261 a2 = this;
return -a2.L(a.L());
        }));
        Object object2 = object = object.iterator();
        while (object2.hasNext()) {
            void a;
            void a2;
            void a3;
            FeatureSupport_323 class_3232;
            FeatureSupport_323 class_3233 = class_3232 = (FeatureSupport_323)object.next();
            double d = class_261.L(class_3233.L());
            Object a4 = class_3233.L();
            float[] fArray = RenderSupport_107.L(new Vec3((double)((Vec3i)a4).getX() + 0.5, (double)((Vec3i)a4).getY() + 1.4, (double)((Vec3i)a4).getZ() + 0.5), (float)a3, (float)a2);
            a4 = fArray;
            if (fArray == null) {
                object2 = object;
                continue;
            }
            class_261.L((RenderSupport_103)a, class_3232, (float)a4[0], (float)a4[1], class_261.L(d));
            object2 = object;
        }
    }

    public boolean L() {
        FeatureSupport_261 a;
if (a.f.d() && a.f.J.d() && FeatureSupport_261.e.thePlayer != null && FeatureSupport_261.e.theWorld != null && RenderSupport_107.L()) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private float L(double d) {
        void a22;
        FeatureSupport_261 class_261 = this;
float a22 = (float)Math.sqrt((double)a22);
        float a = 12.0f / Math.max(1.0f, a22);
        float f2 = class_261.f.t.L();
        if (f2 != 1.0f) {
            a = (float)Math.pow(0, f2);
        }
        return class_261.f.k.L() * Math.min(1.4f, Math.max(0.45f, 0));
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, FeatureSupport_323 class_323, float f2, float f3, float f4) {
        void a;
        void a2;
        float a3;
        void a4;
        int n;
        List<FeatureSupport_269> a5;
        FeatureSupport_261 class_261 = this;
a5 = ((FeatureSupport_323)((Object)a5)).L();
        int n2 = Math.min(5, a5.size());
        int n3 = a5.size() > n2 ? 1 : 0;
        int n4 = n2 + (n3 != 0 ? 1 : 0);
        float a6 = 30.0f;
        int n5 = 0;
        while (n5 < n2) {
            float f5 = a4.L(ThemeSupport_057.g, FeatureSupport_261.L(a5.get(0)));
            a6 = Math.max(a6, 22.0f + f5);
            n5 = ++n;
        }
        float f6 = 8.0f + (float)n4 * 11.0f + (float)Math.max(0, n4 - 1) * 1.0f;
        void v2 = a4;
        void v3 = a4;
        a4.F();
        v3.L(a3, 0.0f);
        v3.L((float)a, 0.0f, 0.0f);
        v2.L(-a6 / 2.0f, -f6);
        RenderSupport_120.L((RenderSupport_103)v2, 0.0f, 0.0f, a6, f6, 8.0f, -938339561, class_261.f.K.d());
        a3 = 4.0f;
        int n6 = 0;
        while (n6 < n2) {
            class_261.L((RenderSupport_103)a4, a5.get(0), a6, a3);
            a3 += 12.0f;
            n6 = ++a2;
        }
        if (n3 != 0) {
            a4.L(ThemeSupport_057.g, new StringBuilder().insert(0, "+").append(a5.size() - n2).toString(), a6 / 2.0f, a3 + 5.5f, ThemeSupport_059.L(ThemeSupport_059.L().F(), 0.75f));
        }
        a4.k();
    }
}

