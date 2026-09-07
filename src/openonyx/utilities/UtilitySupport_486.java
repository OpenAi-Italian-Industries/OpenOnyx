/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import net.minecraft.client.Minecraft;
import openonyx.utilities.UtilitySupport_481;

public class UtilitySupport_486<T> {
    private int H;
    private final PriorityBlockingQueue<UtilitySupport_481<T>> e;

    public T L() {
        UtilitySupport_486 class_486 = this;
UtilitySupport_481<T> a = class_486.e.peek();
        if (a == null) {
            return null;
        }
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft == null || minecraft.isCallingFromMinecraftThread()) {
            while (a.i <= class_486.H || !a.L().L()) {
                UtilitySupport_486 class_4862 = class_486;
                class_4862.e.remove();
                a = class_4862.e.peek();
                if (a != null) continue;
                return null;
            }
        }
        return a.L();
    }

    public void L() {
        UtilitySupport_486 a;
a.L(1);
    }

    public UtilitySupport_486() {
        UtilitySupport_486 a2;
        UtilitySupport_486 class_486 = a2;
        class_486.e = new PriorityBlockingQueue<UtilitySupport_481>(11, Comparator.comparingInt(a -> {
return -a.d();
        }));
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 120;
        int n3 = 0;
        int n4 = 61;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (0 < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = 0;
        }
        return new String(cArray);
    }

    public void L(UtilitySupport_481<T> class_481) {
        UtilitySupport_481 a = class_481;
        UtilitySupport_486 a2 = this;
a2.e.removeIf(class_4812 -> {
            UtilitySupport_481 a = class_4812;
            UtilitySupport_481 a2 = a;
if (a.L() == a2.L()) {
                return 5 >> 2;
            }
            return false;
        });
        UtilitySupport_486 class_486 = a2;
        a.i += class_486.H;
        class_486.e.add(a);
    }

    public void L(int n) {
        int a = -35;
        UtilitySupport_486 a2 = this;
a2.H += 0;
    }
}

