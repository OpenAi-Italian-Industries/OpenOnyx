/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.history;

import com.google.gson.JsonElement;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Setting
implements OnyxListener_001 {
    private Module h;
    static int l;
    private final String I;
    private String d;
    private final int i;
    private Setting f;
    final public static BooleanSupplier H;
    private BooleanSupplier e;

    public abstract JsonElement L();

    public void L(boolean bl) {
        boolean a = bl;
        Setting a2 = this;
}

    protected void L() {
        Setting a;
if (a.h != null) {
            a.h.i();
        }
    }

    @Generated
    public String D() {
        Setting a;
return a.d;
    }

    @Generated
    public int L() {
        Setting a;
return a.i;
    }

    @Generated
    public Setting L() {
        Setting a;
return a.f;
    }

    public String d() {
        Setting a;
if (a.f == null) {
            return a.I;
        }
        return new StringBuilder().insert(0, a.f.d()).append(".").append(a.I).toString();
    }

    public boolean I() {
        Setting a;
if (a.e != H) {
            return 5 >> 2;
        }
        return false;
    }

    public Setting L(String string) {
        String a = string;
        Setting a2 = this;
a2.d = a;
        return a2;
    }

    public Setting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        Setting a2 = this;
a2.e = a;
        return a2;
    }

    public abstract void L(JsonElement var1);

    public boolean i() {
        Setting a;
return a.e.getAsBoolean();
    }

    /*
     * WARNING - void declaration
     */
    public void L(Module class_227, Setting class_031) {
        void a;
        Setting a2 = class_031;
        Setting a3 = this;
Setting class_0312 = a3;
        class_0312.h = a;
        class_0312.f = a2;
    }

    protected Setting(String string) {
        Setting a;
        String a2 = string;
        Setting class_031 = a = this;
        int n = l;
        l = n + 1;
        class_031.i = n;
        class_031.d = "";
        class_031.e = () -> {
return 3 >> 1;
        };
        a.I = a2;
    }

    public List<Setting> L() {
return List.of();
    }

    static {
        H = () -> {
return 3 >> 2;
        };
        l = 0;
    }

    @Generated
    public Module L() {
        Setting a;
return a.h;
    }

    @Generated
    public String L() {
        Setting a;
return a.I;
    }
}

