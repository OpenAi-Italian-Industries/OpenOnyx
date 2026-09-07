/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import java.util.function.Predicate;
import openonyx.core.OnyxClient;
import openonyx.features.hud.CustomGui;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_198 {
    private static boolean I;
    private static long d;
    private final static float i = 100.0f;
    private final static float f = 16.0f;
    final public static int H = 22;
    private static float e;

    public static boolean e() {
return RenderSupport_198.L((CustomGui a) -> {
return a.l.D();
        });
    }

    public static boolean k() {
return RenderSupport_198.L((CustomGui a) -> {
return a.H.D();
        });
    }

    public static float D() {
return e;
    }

    public static float d() {
long l = System.nanoTime();
        e = d == 0L ? 16.0f : Math.min((float)(l - d) / 1000000.0f, 100.0f);
        d = l;
        return e;
    }

    public static boolean F() {
return RenderSupport_198.L((CustomGui a) -> {
if (a.l.D() && a.l.f.d()) {
                return 1 != 0;
            }
            return false;
        });
    }

    public static boolean l() {
return I;
    }

    public static void d() {
I = 1;
    }

    public static float L() {
CustomGui class_344 = RenderSupport_198.L();
        if (class_344 == null || !class_344.d() || !class_344.h.D()) {
            return 1.0f;
        }
        return class_344.h.e.L() / 100.0f;
    }

    public static void L() {
I = 0;
    }

    public static boolean h() {
return RenderSupport_198.L((CustomGui a) -> {
return a.d.e.d();
        });
    }

    public static boolean I() {
return RenderSupport_198.L((CustomGui a) -> {
return a.f.D();
        });
    }

    private static boolean L(Predicate<CustomGui> predicate) {
        Predicate<CustomGui> predicate2 = predicate;
CustomGui a = RenderSupport_198.L();
        if (a != null && a.d() && predicate2.test(a)) {
            return 1 != 0;
        }
        return false;
    }

    private RenderSupport_198() {
        RenderSupport_198 a;
    }

    public static boolean i() {
return RenderSupport_198.L((CustomGui a) -> {
return a.i.D();
        });
    }

    public static boolean D() {
return RenderSupport_198.L((CustomGui a) -> {
return a.I.D();
        });
    }

    public static boolean d() {
return RenderSupport_198.L((CustomGui a) -> {
return a.m.D();
        });
    }

    public static boolean L() {
CustomGui class_344 = RenderSupport_198.L();
        if (class_344 != null && class_344.d()) {
            return 3 >> 1;
        }
        return false;
    }

    static {
        e = 16.0f;
    }

    public static CustomGui L() {
if (OnyxClient.l == null) {
            return null;
        }
        return OnyxClient.l.O;
    }
}

