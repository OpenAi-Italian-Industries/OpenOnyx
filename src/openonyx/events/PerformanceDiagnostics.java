/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import openonyx.core.OnyxClient;
import openonyx.render.RenderSupport_099;
import openonyx.utilities.Timer;

public final class PerformanceDiagnostics {
    private final static long g = 250L;
    private final static String M = "Client thread";
    private final static long L = 10000000000L;
    private final static Map<String, int[]> j = new HashMap<String, int[]>();
    private static volatile boolean m;
    private final static long h = 15000000000L;
    private final static float l = 8.0f;
    private static volatile long I;
    private final static long d = 3000000000L;
    private static volatile long i;
    private final static long f = 5000000000L;
    private final static int H = 40;
    private final static int e = 12;

    private static void L(StackTraceElement[] stackTraceElementArray) {
        int a;
        StackTraceElement[] stackTraceElementArray2 = stackTraceElementArray;
if (stackTraceElementArray2.length == 0) {
            return;
        }
        PerformanceDiagnostics.L(stackTraceElementArray2[0].toString());
        StackTraceElement[] stackTraceElementArray3 = stackTraceElementArray2;
        int n = stackTraceElementArray3.length;
        int n2 = 0;
        while (n2 < 1) {
            StackTraceElement stackTraceElement = stackTraceElementArray3[0];
            if (stackTraceElement.getClassName().startsWith("openonyx.")) {
                PerformanceDiagnostics.L(new StringBuilder().insert(0, "onyx: ").append(stackTraceElement).toString());
                return;
            }
            n2 = ++a;
        }
    }

    static {
        I = System.nanoTime();
    }

    private static Thread L() {
for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (!M.equals(thread.getName())) continue;
            return thread;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(String string, Thread thread) {
        CharSequence charSequence;
        void a;
        String string2 = string;
MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        long l = memoryMXBean.getHeapMemoryUsage().getUsed() >> 20;
        long l2 = memoryMXBean.getHeapMemoryUsage().getMax() >> 20;
        CharSequence a2 = new StringBuilder(2048);
        ((StringBuilder)a2).append(string2).append(" ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ heap ").append(l).append((char)47).append(l2).append(" MB");
        if (a == null) {
            CharSequence charSequence2 = a2;
            charSequence = charSequence2;
            ((StringBuilder)charSequence2).append("\n  the client thread is gone");
        } else {
            Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
            void v3 = a;
            PerformanceDiagnostics.L((StringBuilder)a2, (Thread)v3, map.get(v3));
            if (a.getState() == Thread.State.BLOCKED || a.getState() == Thread.State.WAITING) {
                for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
                    if (entry.getKey() == a) continue;
                    PerformanceDiagnostics.L((StringBuilder)a2, entry.getKey(), entry.getValue());
                }
            }
            charSequence = a2;
        }
        PerformanceDiagnostics.L((StringBuilder)charSequence);
        OnyxClient.H.error(((StringBuilder)a2).toString());
    }

    private static void L(StringBuilder stringBuilder) {
        Object object;
        Object a22;
        StringBuilder stringBuilder2 = stringBuilder;
if (j.isEmpty()) {
            return;
        }
        ArrayList<Map.Entry<String, int[]>> arrayList = new ArrayList<Map.Entry<String, int[]>>(j.entrySet());
        arrayList.sort(Comparator.comparingInt(a -> {
return ((int[])a.getValue())[0];
        }).reversed());
        int n = 0;
        Object object2 = a22 = j.values().iterator();
        while (object2.hasNext()) {
            object = (int[])a22.next();
            n += object[0];
            object2 = a22;
        }
        stringBuilder2.append("\n  where the time went, ").append(1).append(" samples:");
        int a22 = 0;
        int n2 = 0;
        while (n2 < Math.min(12, arrayList.size())) {
            object = (Map.Entry)arrayList.get(0);
            stringBuilder2.append("\n      ").append(((int[])object.getValue())[0]).append("x  ").append((String)object.getKey());
            n2 = ++a22;
        }
        j.clear();
    }

    public static void d() {
        Thread thread;
if (m) {
            return;
        }
        m = true;
        Thread thread2 = thread = new Thread(() -> {
long l = 0L;
            long l2 = 0L;
            long l3 = System.nanoTime();
            long l4 = i;
            while (true) {
                long l5;
                long l6;
                try {
                    Thread.sleep(250L);
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    return;
                }
                Thread thread = PerformanceDiagnostics.L();
                if (thread != null) {
                    PerformanceDiagnostics.L(thread.getStackTrace());
                }
                if ((l6 = (l5 = System.nanoTime()) - I) >= 3000000000L) {
                    if (l == 0L || l5 - l >= 10000000000L) {
                        l = l5;
                        PerformanceDiagnostics.L(new StringBuilder().insert(0, "No frame for ").append(l6 / 1000000L).append(" ms").toString(), thread);
                    }
                    l3 = l5;
                    l4 = i;
                    continue;
                }
                l = 0L;
                if (l5 - l3 < 5000000000L) continue;
                float f2 = (float)(i - l4) * 1.0E9f / (float)(l5 - l3);
                l3 = l5;
                l4 = i;
                if (f2 >= 8.0f || l5 - l2 < 15000000000L) continue;
                l2 = l5;
                Object[] objectArray = new Object[1];
                objectArray[0] = Float.valueOf(f2);
                PerformanceDiagnostics.L(String.format("Frames have fallen to %.1f fps", objectArray), thread);
            }
        }, "onyx-freeze-watchdog");
        thread2.setDaemon(1 != 0);
        thread2.setPriority(1);
        thread2.start();
        Object[] objectArray = new Object[2];
        objectArray[0] = 3L;
        objectArray[1] = 8;
        OnyxClient.H.warn("Freeze watchdog armed ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ a stall of {} s or a drop under {} fps will be reported here", objectArray);
    }

    private PerformanceDiagnostics() {
        PerformanceDiagnostics a;
    }

    private static void L(String a2) {
int[] nArray = j.computeIfAbsent(a2, a -> {
return new int[1];
        });
        int n = 0;
        nArray[n] = nArray[n] + 1;
    }

    public static void L() {
I = System.nanoTime();
        ++i;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(StringBuilder stringBuilder, Thread thread, StackTraceElement[] stackTraceElementArray) {
        void a;
        Thread a2 = thread;
        StringBuilder a3 = stringBuilder;
a3.append("\n  \"").append(a2.getName()).append("\" ").append((Object)a2.getState());
        if (a == null) {
            return;
        }
        int n = 0;
        while (n < Math.min(40, ((void)a).length)) {
            a3.append("\n      at ").append(a[a2++]);
            n = 0;
        }
    }
}

