/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import openonyx.events.EntityRelationUtils;
import openonyx.input.InputSupport_002;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UtilityMode_515
extends Enum<UtilityMode_515> {
    final public static UtilityMode_515 m = new UtilityMode_515("UNBOUNDED", 0, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    private final static double[] h;
    private final static double[] l;
    private final static double[] I;
    private final static UtilityMode_515[] d;
    private final double i;
    final public static UtilityMode_515 f;
    final public static UtilityMode_515 H;
    private final double e;

    public double d() {
        UtilityMode_515 a;
return a.i;
    }

    public double D(double a) {
        UtilityMode_515 a2;
if (!Double.isFinite(a)) {
            return Double.NaN;
        }
        if (a < a2.e - 1.0E-9 || a > a2.i + 1.0E-9) {
            return Double.NaN;
        }
        return a2.L(a);
    }

    public double[] L() {
        UtilityMode_515 a;
switch (a.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return h;
            }
            case 1: {
                return I;
            }
            case 2: {
                return l;
            }
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UtilityMode_515(double d, double d2) {
        void a;
        void a2;
        void var1_-1;
        UtilityMode_515 enum_515;
        void var2_-1;
        void a3 = var2_-1;
        UtilityMode_515 enum_5152 = enum_515 = this;
        enum_5152.e = a2;
        enum_5152.i = a;
    }

    public double d(double a) {
        UtilityMode_515 a2;
if (!Double.isFinite(a)) {
            return Double.NaN;
        }
        return a2.L(a);
    }

    private double L(double a) {
        UtilityMode_515 a2;
if (a < a2.e) {
            return a2.e;
        }
        if (a > a2.i) {
            return a2.i;
        }
        return a;
    }

    private static UtilityMode_515[] L() {
UtilityMode_515[] enum_515Array = new UtilityMode_515[3];
        enum_515Array[0] = m;
        enum_515Array[1] = H;
        enum_515Array[2] = f;
        return enum_515Array;
    }

    static {
        H = new UtilityMode_515("FORWARD", 1, 0.0, Double.POSITIVE_INFINITY);
        f = new UtilityMode_515("SEGMENT_01", 2, 0.0, 1.0);
        d = UtilityMode_515.L();
        h = new double[0];
        double[] dArray = new double[1];
        dArray[0] = 0.0;
        I = dArray;
        double[] dArray2 = new double[2];
        dArray2[0] = 0.0;
        dArray2[1] = 1.0;
        l = dArray2;
    }

    public double L() {
        UtilityMode_515 a;
return a.e;
    }

    public static UtilityMode_515 valueOf(String a) {
return Enum.valueOf(UtilityMode_515.class, a);
    }

    public static UtilityMode_515[] values() {
return (UtilityMode_515[])d.clone();
    }
}

