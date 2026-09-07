/*
 * Decompiled with CFR.
 */
package openonyx.utilities.internal;

import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class UtilitySupport_510 {
    private double[] H;
    private int e;

    double L(int n) {
        int a = -35;
        UtilitySupport_510 a2 = this;
return a2.H[0];
    }

    int L() {
        UtilitySupport_510 a;
return a.e;
    }

    void L() {
        int n;
        int a;
        UtilitySupport_510 class_510 = this;
if (class_510.e <= 1) {
            return;
        }
        int n2 = 1;
        while (n2 < class_510.e) {
            int n3;
            double d = class_510.H[1];
            int n4 = 1;
            while (n4 > 0 && class_510.H[n3 - 1] > d) {
                UtilitySupport_510 class_5102 = class_510;
                int n5 = n3--;
                class_5102.H[n5] = class_5102.H[n5 - 1];
                n4 = n3;
            }
            class_510.H[n3] = d;
            n2 = ++a;
        }
        a = 1;
        int n6 = 1;
        while (n6 < class_510.e) {
            double d = class_510.H[1];
            if (d != class_510.H[0]) {
                class_510.H[a++] = d;
            }
            n6 = ++n;
        }
        class_510.e = 1;
    }

    UtilitySupport_510(int n) {
        int a = -35;
        UtilitySupport_510 a2 = this;
        a2.H = new double[1];
    }

    void d(double a) {
if (Double.isFinite(a)) {
            UtilitySupport_510 a2;
            a2.L(a);
        }
    }

    void L(double a) {
        UtilitySupport_510 a2;
UtilitySupport_510 class_510 = a2;
        if (class_510.e == class_510.H.length) {
            a2.H = Arrays.copyOf(a2.H, Math.max(4, a2.e * 2));
        }
        int n = a2.e;
        a2.e = n + 1;
        a2.H[n] = a;
    }
}

