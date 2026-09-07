/*
 * Decompiled with CFR.
 */
package openonyx.input;

import java.util.Arrays;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class InputSupport_004 {
    private final static boolean[] H = new boolean[256];
    private static boolean e = 1;

    private InputSupport_004() {
        InputSupport_004 a;
    }

    private static boolean L(int n, int n2) {
        int a = n2;
        int a2 = n;
return InputSupport_004.L(a2) || InputSupport_004.L(a);
    }

    private static boolean L(int a) {
if (!H[a]) {
            return 3 >> 2;
        }
        if (Keyboard.isKeyDown(a)) {
            return 1 != 0;
        }
        InputSupport_004.H[a] = 0;
        return 0 != 0;
    }

    public static boolean i() {
return InputSupport_004.L(42, 54);
    }

    public static void d() {
Arrays.fill(H, 0 != 0);
    }

    public static boolean D() {
return InputSupport_004.L(29, 157);
    }

    public static void L() {
boolean bl = Display.isActive();
        if (!bl || !e) {
            InputSupport_004.d();
        }
        e = bl;
    }

    public static boolean d() {
return InputSupport_004.L(56, 184);
    }

    public static boolean L() {
return InputSupport_004.L(219, 220);
    }

    public static void L(int n, boolean bl) {
        int a = bl ? 1 : 0;
        int a2 = n;
if (a2 > 0 && a2 < H.length) {
            InputSupport_004.H[a2] = a;
        }
    }
}

