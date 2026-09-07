/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.function.BooleanSupplier;

public class UtilitySupport_500 {
    private final Runnable f;
    private boolean H;
    private final BooleanSupplier e;

    /*
     * WARNING - void declaration
     */
    public UtilitySupport_500(BooleanSupplier booleanSupplier, Runnable runnable) {
        void a;
        UtilitySupport_500 a2;
        Runnable a3 = runnable;
        UtilitySupport_500 class_500 = a2 = this;
        class_500.e = a;
        class_500.f = a3;
    }

    public void L() {
        UtilitySupport_500 a;
if (!a.H && a.e.getAsBoolean()) {
            a.f.run();
            a.H = 1;
        }
    }
}

