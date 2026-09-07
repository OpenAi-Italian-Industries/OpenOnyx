/*
 * Decompiled with CFR.
 */
package openonyx.render.group_v;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class RenderSupport_179 {
    private final static Map<String, float[]> e = new LinkedHashMap<String, float[]>();

    public static void L(String a) {
e.remove(a);
    }

    private RenderSupport_179() {
        RenderSupport_179 a;
    }

    public static List<float[]> L(String string) {
        String string2 = string;
ArrayList<float[]> arrayList = new ArrayList<float[]>(e.size());
        for (Map.Entry entry : e.entrySet()) {
            if (((String)entry.getKey()).equals(string2)) continue;
            arrayList.add((float[])entry.getValue());
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(String string, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        float f6 = f5;
        String a5 = string;
float[] fArray = new float[4];
        fArray[0] = a4;
        fArray[1] = a3;
        fArray[2] = a2;
        fArray[3] = a;
        e.put(a5, fArray);
    }
}

