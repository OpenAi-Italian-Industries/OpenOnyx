/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import openonyx.utilities.UtilitySupport_491;

public final class UtilitySupport_492 {
    private final static ExecutorService H;
    private final static AtomicInteger e;

    private UtilitySupport_492() {
        UtilitySupport_492 a;
    }

    static {
        e = new AtomicInteger();
        H = Executors.newCachedThreadPool(new UtilitySupport_491());
    }

    public static Executor L() {
return H;
    }

    public static void L(Runnable a) {
H.execute(a);
    }
}

