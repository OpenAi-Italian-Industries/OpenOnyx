/*
 * Decompiled with CFR.
 */
package openonyx.theme.internal;


/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ThemeSupport_064 {
    private final static double[][] f;
    final public static double[] H;
    private final static double[][] e;

    public static double I(double a) {
return 100.0 * ThemeSupport_064.i((a + 16.0) / 116.0);
    }

    public static double d(int a) {
return ThemeSupport_064.d(ThemeSupport_064.L(a)[1]);
    }

    public static int L(int n, int n2) {
        int a = n2;
        int a2 = n;
return a2 & 0xFFFFFF | (a & 0xFF) << 24;
    }

    public static double L(int a) {
        double d;
double d2 = (double)a / 255.0;
        if (d <= 0.040449936) {
            return d2 / 12.92 * 100.0;
        }
        return Math.pow((d2 + 0.055) / 1.055, 2.4) * 100.0;
    }

    public static int i(int a) {
return a >> 16 & 0xFF;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static int L(float f, float f2, float f3, int n) {
        void v0;
        void a;
        float f4;
        float f5;
        void a2;
        void a3;
        float f6 = f;
float a4 = (float)ThemeSupport_064.D(f6) / 60.0f;
        a2 = a3 * Math.clamp((float)a2, 0.0f, 1.0f);
        void var5_5 = a2 * (1.0f - Math.abs(a4 % 2.0f - 1.0f));
        a3 -= a2;
        switch ((int)a4 % 6) {
            case 0: {
                a4 = a2;
                f5 = var5_5;
                f4 = 0.0f;
                v0 = a;
                return ThemeSupport_064.L((int)v0, Math.round((a4 + a3) * 255.0f), Math.round((f5 + a3) * 255.0f), Math.round((f4 + a3) * 255.0f));
            }
            case 1: {
                a4 = var5_5;
                f5 = a2;
                f4 = 0.0f;
                v0 = a;
                return ThemeSupport_064.L((int)v0, Math.round((a4 + a3) * 255.0f), Math.round((f5 + a3) * 255.0f), Math.round((f4 + a3) * 255.0f));
            }
            case 2: {
                a4 = 0.0f;
                f5 = a2;
                f4 = var5_5;
                v0 = a;
                return ThemeSupport_064.L((int)v0, Math.round((a4 + a3) * 255.0f), Math.round((f5 + a3) * 255.0f), Math.round((f4 + a3) * 255.0f));
            }
            case 3: {
                a4 = 0.0f;
                f5 = var5_5;
                f4 = a2;
                v0 = a;
                return ThemeSupport_064.L((int)v0, Math.round((a4 + a3) * 255.0f), Math.round((f5 + a3) * 255.0f), Math.round((f4 + a3) * 255.0f));
            }
            case 4: {
                a4 = var5_5;
                f5 = 0.0f;
                f4 = a2;
                v0 = a;
                return ThemeSupport_064.L((int)v0, Math.round((a4 + a3) * 255.0f), Math.round((f5 + a3) * 255.0f), Math.round((f4 + a3) * 255.0f));
            }
        }
        a4 = a2;
        f5 = 0.0f;
        f4 = var5_5;
        v0 = a;
        return ThemeSupport_064.L((int)v0, Math.round((a4 + a3) * 255.0f), Math.round((f5 + a3) * 255.0f), Math.round((f4 + a3) * 255.0f));
    }

    private static double i(double a) {
        double d;
double d2 = 0.008856451679035631;
        double d3 = 903.2962962962963;
        double d4 = a;
        double d5 = d4 * d4 * a;
        if (d > d2) {
            return d5;
        }
        return (116.0 * a - 16.0) / d3;
    }

    /*
     * WARNING - void declaration
     */
    public static int L(int n, int n2, int n3, int n4) {
        void a;
        void a2;
        int a3 = n4;
        int a4 = n;
return (a4 & 0xFF) << 24 | (a2 & 0xFF) << 16 | (a & 0xFF) << 8 | a3 & 0xFF;
    }

    public static double D(double a) {
        double d;
a %= 360.0;
        if (d < 0.0) {
            return a + 360.0;
        }
        return a;
    }

    public static int d(double a) {
        double d;
double d2 = a / 100.0;
        double d3 = d <= 0.0031308 ? d2 * 12.92 : 1.055 * Math.pow(d2, 0.4166666666666667) - 0.055;
        return Math.clamp(Math.round(d3 * 255.0), 0, 255);
    }

    public static int L(double a) {
        int n;
int n2 = n = ThemeSupport_064.d(ThemeSupport_064.I(a));
        return ThemeSupport_064.L(255, n2, n2, n2);
    }

    public static double d(double a) {
return ThemeSupport_064.L(a / 100.0) * 116.0 - 16.0;
    }

    public static int L(int n, float f) {
        float a = f;
        int a2 = n;
return ThemeSupport_064.L(a2, Math.round(Math.clamp(0, 0.0f, 1.0f) * 255.0f));
    }

    public static int D(int a) {
return a >> 8 & 0xFF;
    }

    public static double[] L(int a) {
double d = ThemeSupport_064.L(ThemeSupport_064.i(a));
        double d2 = ThemeSupport_064.L(ThemeSupport_064.D(a));
        double d3 = ThemeSupport_064.L(ThemeSupport_064.L(a));
        double[] dArray = new double[3];
        int n = 0;
        dArray[n] = f[0][n] * d + f[0][1] * d2 + f[0][2] * d3;
        int n2 = 1;
        dArray[n2] = f[n2][0] * d + f[1][1] * d2 + f[1][2] * d3;
        int n3 = 2;
        dArray[n3] = f[n3][0] * d + f[2][1] * d2 + f[2][2] * d3;
        return dArray;
    }

    private static double L(double a) {
double d = 0.008856451679035631;
        double d2 = 903.2962962962963;
        if (a > d) {
            return Math.cbrt(a);
        }
        return (d2 * a + 16.0) / 116.0;
    }

    static {
        double[] dArray = new double[3];
        dArray[0] = 95.047;
        dArray[1] = 100.0;
        dArray[2] = 108.883;
        H = dArray;
        double[][] dArrayArray = new double[3][];
        double[] dArray2 = new double[3];
        int n = 0;
        dArray2[n] = 0.41233895;
        dArray2[1] = 0.35762064;
        dArray2[2] = 0.18051042;
        dArrayArray[n] = dArray2;
        double[] dArray3 = new double[3];
        dArray3[0] = 0.2126;
        int n2 = 1;
        dArray3[n2] = 0.7152;
        dArray3[2] = 0.0722;
        dArrayArray[n2] = dArray3;
        double[] dArray4 = new double[3];
        dArray4[0] = 0.01932141;
        dArray4[1] = 0.11916382;
        int n3 = 2;
        dArray4[n3] = 0.95034478;
        dArrayArray[n3] = dArray4;
        f = dArrayArray;
        double[][] dArrayArray2 = new double[3][];
        double[] dArray5 = new double[3];
        int n4 = 0;
        dArray5[n4] = 3.2413774792388685;
        dArray5[1] = -1.5376652402851851;
        dArray5[2] = -0.49885366846268053;
        dArrayArray2[n4] = dArray5;
        double[] dArray6 = new double[3];
        dArray6[0] = -0.9691452513005321;
        int n5 = 1;
        dArray6[n5] = 1.8758853451067872;
        dArray6[2] = 0.04156585616912061;
        dArrayArray2[n5] = dArray6;
        double[] dArray7 = new double[3];
        dArray7[0] = 0.05562093689691305;
        dArray7[1] = -0.20395524564742123;
        int n6 = 2;
        dArray7[n6] = 1.0571799111220335;
        dArrayArray2[n6] = dArray7;
        e = dArrayArray2;
    }

    public static int d(int a) {
return a >>> 24;
    }

    private ThemeSupport_064() {
        ThemeSupport_064 a;
    }

    public static int L(int a) {
return a & 0xFF;
    }

    public static float[] L(int n) {
        int n2 = n;
float f = (float)ThemeSupport_064.i(n2) / 255.0f;
        float f2 = (float)ThemeSupport_064.D(n2) / 255.0f;
        float f3 = (float)ThemeSupport_064.L(n2) / 255.0f;
        float f4 = Math.max(f, Math.max(f2, f3));
        float a = Math.min(f, Math.min(f2, f3));
        a = f4 - 0;
        float f5 = 0.0f;
        if (0 > 0.0f) {
            f5 = f4 == f ? 60.0f * ((f2 - f3) / 0 % 6.0f) : (f4 == f2 ? 60.0f * ((f3 - f) / 0 + 2.0f) : 60.0f * ((f - f2) / 0 + 4.0f));
        }
        float[] fArray = new float[3];
        fArray[0] = (float)ThemeSupport_064.D(f5);
        fArray[1] = f4 == 0.0f ? 0.0f : 0 / f4;
        fArray[2] = f4;
        return fArray;
    }

    public static int L(double a, double a2, double a3) {
int n = ThemeSupport_064.d(e[0][0] * a + e[0][1] * a2 + e[0][2] * a3);
        int n2 = ThemeSupport_064.d(e[1][0] * a + e[1][1] * a2 + e[1][2] * a3);
        int n3 = ThemeSupport_064.d(e[2][0] * a + e[2][1] * a2 + e[2][2] * a3);
        return ThemeSupport_064.L(255, n, n2, n3);
    }
}

