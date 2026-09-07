/*
 * Decompiled with CFR.
 */
package openonyx.render;

import java.nio.IntBuffer;
import openonyx.events.Rotation;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.render.RenderMode_112;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;

public final class RenderSupport_165 {
    private final static int M = -1;
    private static boolean L;
    private final static int j = 16;
    private final static int m = 0;
    private static Cursor h;
    private static Cursor l;
    private static boolean I;
    private final static int d = -16777216;
    private final static String[] i;
    private final static String[] f;
    private static RenderMode_112 H;
    private static RenderMode_112 e;

    private static void D() {
if (I) {
            return;
        }
        I = true;
        if ((Cursor.getCapabilities() & 1) == 0 || Cursor.getMinCursorSize() > 16 || Cursor.getMaxCursorSize() < 16) {
            L = true;
            return;
        }
        h = RenderSupport_165.L(i, 5, 0);
        l = RenderSupport_165.L(f, 5, 7);
        if (h == null || l == null) {
            L = true;
        }
    }

    private RenderSupport_165() {
        RenderSupport_165 a;
    }

    public static void d() {
e = RenderMode_112.i;
        if (L || H == RenderMode_112.i) {
            return;
        }
        try {
            Mouse.setNativeCursor(null);
        }
        catch (RuntimeException | LWJGLException exception) {
            // empty catch block
        }
        H = RenderMode_112.i;
    }

    public static void L(RenderMode_112 a) {
if (a.ordinal() > e.ordinal()) {
            e = a;
        }
    }

    static {
        String[] stringArray = new String[16];
        stringArray[0] = "     ##         ";
        stringArray[1] = "    #..#        ";
        stringArray[2] = "    #..#        ";
        stringArray[3] = "    #..#        ";
        stringArray[4] = "    #..#        ";
        stringArray[5] = "    #..# ##     ";
        stringArray[6] = "    #..##..#    ";
        stringArray[7] = "    #..#..#.#   ";
        stringArray[8] = " ## #..#..#..#  ";
        stringArray[9] = "#..##........#  ";
        stringArray[10] = "#............#  ";
        stringArray[11] = " #...........#  ";
        stringArray[12] = "  #..........#  ";
        stringArray[13] = "  #.........#   ";
        stringArray[14] = "   #........#   ";
        stringArray[15] = "   #########    ";
        i = stringArray;
        String[] stringArray2 = new String[16];
        stringArray2[0] = "                ";
        stringArray2[1] = "   ##  ##       ";
        stringArray2[2] = "   #.##.#       ";
        stringArray2[3] = "    #..#        ";
        stringArray2[4] = "    #..#        ";
        stringArray2[5] = "    #..#        ";
        stringArray2[6] = "    #..#        ";
        stringArray2[7] = "    #..#        ";
        stringArray2[8] = "    #..#        ";
        stringArray2[9] = "    #..#        ";
        stringArray2[10] = "    #..#        ";
        stringArray2[11] = "    #..#        ";
        stringArray2[12] = "    #..#        ";
        stringArray2[13] = "   #.##.#       ";
        stringArray2[14] = "   ##  ##       ";
        stringArray2[15] = "                ";
        f = stringArray2;
        e = RenderMode_112.i;
        H = RenderMode_112.i;
    }

    public static void L() {
        Cursor cursor;
RenderMode_112 enum_112 = e;
        e = RenderMode_112.i;
        if (L || enum_112 == H) {
            return;
        }
        RenderSupport_165.D();
        if (L) {
            return;
        }
        switch (enum_112.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 1: {
                cursor = h;
                break;
            }
            case 2: {
                cursor = l;
                break;
            }
            case 0: {
                cursor = null;
                while (false) {
                }
                break block1;
            }
        }
        Cursor cursor2 = cursor;
        try {
            Mouse.setNativeCursor(cursor2);
            H = enum_112;
            return;
        }
        catch (RuntimeException | LWJGLException exception) {
            L = 1;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static Cursor L(String[] stringArray, int n, int n2) {
        int a22;
        String[] stringArray2 = stringArray;
IntBuffer intBuffer = BufferUtils.createIntBuffer(256);
        int n3 = 15;
        while (n3 >= 0) {
            String string = stringArray2[15];
            int n4 = 0;
            while (n4 < 16) {
                int n5;
                int n6;
                switch (string.charAt(n6)) {
                    case '#': {
                        n5 = -16777216;
                        while (false) {
                        }
                        break;
                    }
                    case '.': {
                        n5 = -1;
                        break;
                    }
                    default: {
                        n5 = 0;
                    }
                }
                intBuffer.put(n5);
                n4 = ++n6;
            }
            n3 = --a22;
        }
        intBuffer.flip();
        try {
            void a;
            void a3;
            int n7 = 16;
            return new Cursor(n7, n7, (int)a3, 15 - a, 1, intBuffer, null);
        }
        catch (RuntimeException | LWJGLException a22) {
            return null;
        }
    }
}

