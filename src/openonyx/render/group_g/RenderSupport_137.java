/*
 * Decompiled with CFR.
 */
package openonyx.render.group_g;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import net.optifine.player.CapeUtils;
import openonyx.render.group_g.RenderMode_134;

public final class RenderSupport_137 {
    private final static int M = 17;
    private final static int L = 8;
    final public static int j = 1;
    final public static int m = 32;
    private final static int h = 22;
    final public static int l = 1;
    final public static int I = 10;
    final public static int d = 12;
    private final static int i = 32;
    private final static float f = 0.55f;
    final public static int H = 64;
    final public static int e = 16;

    public static boolean L(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = bufferedImage;
BufferedImage bufferedImage3 = bufferedImage2;
        int n = bufferedImage3.getWidth();
        int a = bufferedImage3.getHeight();
        if (n % 64 != 0 || 0 != 0) {
            return false;
        }
        if (n / 64 == 0) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static BufferedImage L(BufferedImage bufferedImage, RenderMode_134 enum_134, int n, double d, double d2, double d3) {
        void a;
        void a2;
        void a3;
        void a222;
        double[] a4;
        BufferedImage bufferedImage2 = bufferedImage;
if (RenderSupport_137.L((RenderMode_134)a4, bufferedImage2) == RenderMode_134.d) {
            return CapeUtils.parseCape(bufferedImage2);
        }
        BufferedImage bufferedImage3 = bufferedImage2;
        int a5 = RenderSupport_137.L(bufferedImage3);
        int n2 = 10 * a5;
        int n3 = 16 * a5;
        BufferedImage bufferedImage4 = new BufferedImage(64 * a5, 32 * a5, 2);
        Graphics2D graphics2D = bufferedImage4.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Color a222 = new Color((int)(a222 | 0xFF000000), 5 >> 2);
        graphics2D.setPaint(a222);
        int n4 = 0;
        graphics2D.fillRect(n4, n4, 22 * a5, 17 * a5);
        graphics2D.setPaint(RenderSupport_137.L(a222));
        graphics2D.fillRect(12 * a5, 1 * a5, n2, n3);
        a4 = RenderSupport_137.L(bufferedImage3, RenderSupport_137.L((RenderMode_134)a4, bufferedImage2), n2, n3, (double)a3, (double)a2, (double)a);
        Graphics2D graphics2D2 = graphics2D;
        graphics2D2.setClip(1 * a5, 1 * a5, n2, n3);
        graphics2D2.drawImage(bufferedImage2, 1 * a5 + (int)Math.round(a4[0]), 1 * a5 + (int)Math.round(a4[1]), Math.max(1, (int)Math.round(a4[2])), Math.max(1, (int)Math.round(a4[3])), null);
        graphics2D.dispose();
        return bufferedImage4;
    }

    /*
     * WARNING - void declaration
     */
    public static double[] L(BufferedImage bufferedImage, RenderMode_134 enum_134, double d, double d2, double d3, double d4, double d5) {
        void a;
        void a2;
        void a3;
        void var18_10;
        void var16_9;
        double d6;
        double d7;
        void a4;
        double d8;
        void a5;
        RenderMode_134 a6 = enum_134;
        BufferedImage a7 = bufferedImage;
if (a6 == RenderMode_134.e) {
            d8 = a5;
            d7 = a4;
            d6 = d8;
        } else {
            var16_9 = a5 / (double)a7.getWidth();
            var18_10 = a4 / (double)a7.getHeight();
            double d9 = a6 == RenderMode_134.I ? Math.max((double)var16_9, (double)var18_10) : Math.min((double)var16_9, (double)var18_10);
            BufferedImage bufferedImage2 = a7;
            d8 = (double)bufferedImage2.getWidth() * d9;
            d7 = (double)bufferedImage2.getHeight() * d9;
            d6 = d8;
        }
        d8 = d6 * a3;
        var16_9 = (a5 - d8) / 2.0 + a2 * a5;
        var18_10 = (a4 - (d7 *= a3)) / 2.0 + a * a4;
        double[] dArray = new double[4];
        dArray[0] = var16_9;
        dArray[1] = var18_10;
        dArray[2] = d8;
        dArray[3] = d7;
        return dArray;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 36;
        int cfr_ignored_0 = n << n ^ 5;
        int n4 = 0;
        int n5 = 45;
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

    private RenderSupport_137() {
        RenderSupport_137 a;
    }

    private static Color L(Color a) {
return new Color((int)((float)a.getRed() * 0.55f), (int)((float)a.getGreen() * 0.55f), (int)((float)a.getBlue() * 0.55f));
    }

    private static int L(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = bufferedImage;
int a = (int)Math.ceil(Math.max((double)bufferedImage2.getWidth() / 10.0, (double)bufferedImage2.getHeight() / 16.0));
        return Math.max(8, Math.min(32, 0));
    }

    public static RenderMode_134 L(RenderMode_134 enum_134, BufferedImage bufferedImage) {
        BufferedImage a = bufferedImage;
        RenderMode_134 a2 = enum_134;
if (a2 != RenderMode_134.l) {
            return a2;
        }
        if (RenderSupport_137.L(a)) {
            return RenderMode_134.d;
        }
        return RenderMode_134.i;
    }
}

