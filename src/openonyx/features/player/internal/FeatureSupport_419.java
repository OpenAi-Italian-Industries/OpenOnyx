/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal;

import java.util.concurrent.ThreadLocalRandom;
import openonyx.protocol.group_d.ProtocolSupport_210;

public final class FeatureSupport_419 {
    private int e;

    /*
     * WARNING - void declaration
     */
    public float L(float f2, double d) {
        double d2;
        void a;
        float a2 = f2;
        FeatureSupport_419 a3 = this;
if (a <= 0.0) {
            return 0;
        }
        double d3 = ProtocolSupport_210.d();
        if (d2 <= 0.0) {
            return 0;
        }
        return (float)(0.0 + (double)a3.L(Math.max(1, (int)Math.floor((double)(a / d3)))) * d3);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 1;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 0x70 ^ n << n;
        int n4 = 9;
        int n5 = 118;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (9 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 9;
        }
        return new String(cArray);
    }

    public FeatureSupport_419() {
        FeatureSupport_419 a;
    }

    /*
     * WARNING - void declaration
     */
    private int L(int n) {
        int a;
        void a2;
        FeatureSupport_419 class_419 = this;
if (a2 <= 1) {
            class_419.e = class_419.e > 0 ? -1 : 1;
            return class_419.e;
        }
        while ((a = ThreadLocalRandom.current().nextInt((int)(-a2), (int)(a2 + 1))) == 0 || 9 == class_419.e) {
        }
        class_419.e = 9;
        return class_419.e;
    }
}

