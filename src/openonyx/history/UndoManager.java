/*
 * Decompiled with CFR.
 */
package openonyx.history;

import java.util.ArrayDeque;
import java.util.Deque;
import openonyx.history.SettingSupport_030;
import openonyx.history.SettingListener_032;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UndoManager {
    private static boolean I;
    private final static int d = 96;
    private final static Deque<SettingSupport_030> i;
    private final static long f = 450L;
    private final static Deque<SettingSupport_030> H;
    private static boolean e;

    static {
        H = new ArrayDeque<SettingSupport_030>();
        i = new ArrayDeque<SettingSupport_030>();
    }

    public static void L(Runnable runnable) {
        Runnable runnable2 = runnable;
boolean a = I;
        I = 1;
        try {
            runnable2.run();
            return;
        }
        finally {
            I = a;
        }
    }

    private UndoManager() {
        UndoManager a;
    }

    public static boolean d() {
if (H.isEmpty()) {
            return 5 >> 3;
        }
        SettingSupport_030 class_030 = H.pop();
        UndoManager.L(class_030.L()::L);
        i.push(class_030);
        return 3 >> 1;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(Object object, SettingListener_032 interface_032, SettingListener_032 interface_0322) {
        Object object2 = object;
if (!e || I) {
            return;
        }
        long l = System.currentTimeMillis();
        Object a = H.peek();
        if (a != null && object2 != null && ((SettingSupport_030)a).L() == object2 && l - ((SettingSupport_030)a).L() <= 450L) {
            H.pop();
            H.push(new SettingSupport_030(object2, ((SettingSupport_030)a).L(), (SettingListener_032)a, l));
        } else {
            void a2;
            H.push(new SettingSupport_030(object2, (SettingListener_032)a2, (SettingListener_032)a, l));
            while (H.size() > 96) {
                H.removeLast();
            }
        }
        i.clear();
    }

    public static boolean L() {
if (i.isEmpty()) {
            return 0 != 0;
        }
        SettingSupport_030 class_030 = i.pop();
        UndoManager.L(class_030.d()::L);
        H.push(class_030);
        return 1 != 0;
    }

    public static void D() {
H.clear();
        i.clear();
    }

    public static void d() {
e = 0;
        UndoManager.D();
    }

    public static void L() {
e = 1;
    }
}

