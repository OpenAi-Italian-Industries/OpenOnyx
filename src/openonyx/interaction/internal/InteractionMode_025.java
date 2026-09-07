/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import net.minecraft.util.BlockPos;
import openonyx.interaction.internal.InteractionSupport_023;
import openonyx.render.RenderSupport_111;
import openonyx.utilities.UtilitySupport_486;

public final class InteractionMode_025
extends Enum<InteractionMode_025> {
    private final List<BlockPos> I;
    final public static InteractionMode_025 d;
    private final static InteractionMode_025[] i;
    final public static InteractionMode_025 f;
    final public static InteractionMode_025 H;
    final public static InteractionMode_025 e;

    private static InteractionMode_025[] L() {
InteractionMode_025[] enum_025Array = new InteractionMode_025[4];
        enum_025Array[0] = f;
        enum_025Array[1] = d;
        enum_025Array[2] = H;
        enum_025Array[3] = e;
        return enum_025Array;
    }

    public static InteractionMode_025[] values() {
return (InteractionMode_025[])i.clone();
    }

    static {
        f = new InteractionMode_025("NO_OFFSET", 0, List.of(BlockPos.ORIGIN));
        int[] nArray = new int[3];
        int n = 0;
        nArray[n] = n;
        int n2 = 1;
        nArray[n2] = -1;
        nArray[2] = 1;
        d = new InteractionMode_025("NORMAL", n2, InteractionMode_025.L(nArray));
        int[] nArray2 = new int[5];
        int n3 = 0;
        nArray2[n3] = n3;
        nArray2[1] = -1;
        int n4 = 2;
        nArray2[n4] = 1;
        nArray2[3] = -2;
        nArray2[4] = 2;
        H = new InteractionMode_025("DOWN", n4, InteractionMode_025.L(nArray2));
        int[] nArray3 = new int[9];
        int n5 = 0;
        nArray3[n5] = n5;
        nArray3[1] = -1;
        nArray3[2] = 1;
        int n6 = 3;
        nArray3[n6] = -2;
        nArray3[4] = 2;
        nArray3[5] = -3;
        nArray3[6] = 3;
        nArray3[7] = -4;
        nArray3[8] = 4;
        e = new InteractionMode_025("FULL", n6, InteractionMode_025.L(nArray3));
        i = InteractionMode_025.L();
    }

    public static InteractionMode_025 valueOf(String a) {
return Enum.valueOf(InteractionMode_025.class, a);
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(int n, int n2, int n3) {
        void a;
        void a2;
        int a3 = n3;
        InteractionMode_025 a4 = this;
return a4.I.contains(new BlockPos((int)a2, (int)a, a3));
    }

    @Generated
    public List<BlockPos> L() {
        InteractionMode_025 a;
return a.I;
    }

    private static List<BlockPos> L(int ... nArray) {
        Iterator iterator;
        int n;
        int[] nArray2 = nArray;
Object a = new ArrayList(nArray2.length * nArray2.length * 2);
        Object object = nArray2;
        int n2 = nArray2.length;
        int n3 = 0;
        while (n3 < n2) {
            int n4 = object[0];
            int[] nArray3 = nArray2;
            int n5 = nArray2.length;
            int n6 = 0;
            while (n6 < n5) {
                int n7;
                int n8 = nArray3[n7];
                long l = new BlockPos(n4, 0, n8).toLong();
                long l2 = new BlockPos(n4, -1, n8).toLong();
                if (!a.contains(l)) {
                    a.add(l);
                }
                if (!a.contains(l2)) {
                    a.add(l2);
                }
                n6 = ++n7;
            }
            n3 = ++n;
        }
        object = new ArrayList(a.size());
        Iterator iterator2 = iterator = a.iterator();
        while (iterator2.hasNext()) {
            long l = (Long)iterator.next();
            iterator2 = iterator;
            object.add(BlockPos.fromLong(l));
        }
        Object object2 = object;
        object2.sort(InteractionSupport_023.e);
        return List.copyOf(object2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InteractionMode_025(List<BlockPos> list) {
        void var2_-1;
        void var1_-1;
        void var3_2;
        InteractionMode_025 a = var3_2;
        InteractionMode_025 a2 = this;
        a2.I = a;
    }
}

