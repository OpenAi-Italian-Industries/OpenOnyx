/*
 * Decompiled with CFR.
 */
package openonyx.render.group_e;

import java.util.Locale;
import openonyx.render.group_e.RenderSupport_127;
import openonyx.render.group_e.RenderMode_130;
import openonyx.render.group_e.RenderMode_131;
import openonyx.render.internal.RenderSupport_174;
import openonyx.theme.internal.ThemeSupport_063;

public final class RenderSupport_126 {
    final public static float i = 16.0f;
    private static RenderSupport_127 f;
    private final static String H = "/assets/onyx/font/ttf/";
    private final static RenderSupport_127[][] e;

    static {
        e = new RenderSupport_127[RenderMode_131.values().length][RenderMode_130.values().length];
    }

    private RenderSupport_126() {
        RenderSupport_126 a;
    }

    public static RenderSupport_127 L() {
if (f == null) {
            f = RenderSupport_127.L("/assets/onyx/font/ttf/materialicons-regular.ttf", 16.0f);
        }
        return f;
    }

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_127 L(RenderMode_131 enum_131, RenderMode_130 enum_130) {
        void a;
        RenderMode_131 enum_1312 = enum_131;
Object a2 = e[enum_1312.ordinal()][a.ordinal()];
        if (a2 != null) {
            return a2;
        }
        a2 = RenderSupport_127.L(new StringBuilder().insert(0, "/assets/onyx/font/ttf/googlesansflex_").append(enum_1312.L()).append("-").append(a.name().toLowerCase(Locale.ROOT).replace("_", "")).append(".ttf").toString(), enum_1312.L());
        RenderSupport_126.e[enum_1312.ordinal()][a.ordinal()] = a2;
        return a2;
    }
}

