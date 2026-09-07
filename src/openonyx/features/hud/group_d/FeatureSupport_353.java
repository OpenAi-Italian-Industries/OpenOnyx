/*
 * Decompiled with CFR.
 */
package openonyx.features.hud.group_d;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import openonyx.features.hud.group_d.FeatureMode_354;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FeatureSupport_353
extends Record {
    private final String i;
    private final String f;
    private final Integer H;
    private final FeatureMode_354 e;

    /*
     * WARNING - void declaration
     */
    public FeatureSupport_353(String string, String string2, FeatureMode_354 enum_354) {
        void a;
        void a2;
        FeatureMode_354 a3 = enum_354;
        FeatureSupport_353 a4 = this;
        a4((String)a2, (String)a, a3, null);
    }

    public String d() {
        FeatureSupport_353 a;
return a.f;
    }

    public Integer L() {
        FeatureSupport_353 a;
return a.H;
    }

    @Override
    public final int hashCode() {
        FeatureSupport_353 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{FeatureSupport_353.class, "title;message;level;accent", "f", "i", "e", "H"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public FeatureSupport_353(String string, String string2, FeatureMode_354 enum_354, Integer n) {
        Integer a;
        void a2;
        void a3;
        void a4;
        FeatureSupport_353 a5;
        FeatureSupport_353 class_353 = n2;
        Integer n2 = n;
        FeatureSupport_353 class_3532 = a5 = class_353;
        FeatureSupport_353 class_3533 = a5;
        class_3533.f = a4;
        class_3533.i = a3;
        class_3532.e = a2;
        class_3532.H = a;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        FeatureSupport_353 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{FeatureSupport_353.class, "title;message;level;accent", "f", "i", "e", "H"}, a2, a);
    }

    public String L() {
        FeatureSupport_353 a;
return a.i;
    }

    public FeatureMode_354 L() {
        FeatureSupport_353 a;
return a.e;
    }

    @Override
    public final String toString() {
        FeatureSupport_353 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{FeatureSupport_353.class, "title;message;level;accent", "f", "i", "e", "H"}, a);
    }
}

