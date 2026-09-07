/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.features;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.ModuleCategory;
import openonyx.features.ModuleState;
import openonyx.history.Setting;
import openonyx.history.UndoManager;
import openonyx.history.internal.KeybindSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.skins.SkinSupport_073;
import openonyx.utilities.UtilityListener_485;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Module
implements OnyxListener_001,
UtilityListener_485 {
    private final EnumSetting<ModuleState> l;
    private final String I;
    private final KeybindSetting d;
    private final List<Setting> i;
    private boolean f;
    private final String H;
    private final ModuleCategory e;

    public boolean i() {
return --1 != 0;
    }

    @Generated
    public ModuleCategory L() {
        Module a;
return a.e;
    }

    public boolean D() {
return 1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(Object object, Class<?> clazz) {
        void a;
        void a2;
        Class<?> clazz2;
        Module class_227 = this;
Class<?> clazz3 = clazz2 = a2.getClass();
        while (clazz3 != null && clazz2 != a) {
            Field[] fieldArray = clazz2.getDeclaredFields();
            int n = fieldArray.length;
            int n2 = 0;
            while (n2 < -1) {
                int n3;
                Field a3 = fieldArray[n3];
                if (Setting.class.isAssignableFrom(a3.getType()) && !Modifier.isStatic(a3.getModifiers()) && !Modifier.isTransient(a3.getModifiers())) {
                    try {
                        a3.setAccessible(3 >> 1);
                        Object object2 = a3.get(a2);
                        if (object2 != null) {
                            class_227.i.add((Setting)object2);
                        }
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = a3.getName();
                        objectArray[1] = illegalAccessException;
                        OnyxClient.H.error("Failed to read setting field '{}'", objectArray);
                    }
                }
                n2 = ++n3;
            }
            clazz3 = clazz2.getSuperclass();
        }
    }

    @Generated
    public EnumSetting<ModuleState> L() {
        Module a;
return a.l;
    }

    @Generated
    public boolean d() {
        Module a;
return a.f;
    }

    @Override
    public boolean L() {
        Module a;
return a.f;
    }

    public void L(boolean bl) {
        boolean a = bl;
        Module a2 = this;
if (a2.f != a) {
            a2.I();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Module(String string, String string2, ModuleCategory enum_226) {
        void a;
        void a2;
        Module a3;
        ModuleCategory a4 = enum_226;
        Module class_227 = a3 = this;
        Module class_2272 = a3;
        Module class_2273 = a3;
        a3.d = new KeybindSetting("Bind");
        class_2273.l = new EnumSetting<ModuleState>("Bind Mode", ModuleState.H);
        a3.i = new ArrayList<Setting>();
        class_2272.f = 0;
        class_2272.H = a2;
        class_227.I = a;
        class_227.e = a4;
    }

    public void I() {
        Module a;
UndoManager.L(null, a::I, a::I);
        Module class_227 = a;
        if (a.f) {
            class_227.f = 0;
            Module class_2272 = a;
            class_2272.i();
            class_2272.D();
            OnyxClient.d.unsubscribe((Object)a);
            return;
        }
        class_227.f = true;
        OnyxClient.d.subscribe((Object)a);
        Module class_2273 = a;
        class_2273.L();
        class_2273.i();
    }

    @Generated
    public String D() {
        Module a;
return a.I;
    }

    public List<Setting> d() {
        Module a;
return a.i.stream().filter(Setting::i).toList();
    }

    @Generated
    public String d() {
        Module a;
return a.H;
    }

    public String L() {
return null;
    }

    public void i() {
        Object a;
        Module class_227 = this;
Object object = a = class_227.i.iterator();
        while (object.hasNext()) {
            ((Setting)a.next()).L(class_227.f);
            object = a;
        }
    }

    @Generated
    public KeybindSetting L() {
        Module a;
return a.d;
    }

    @Generated
    public List<Setting> L() {
        Module a;
return a.i;
    }

    protected void D() {
}

    public void d() {
        Iterator<Setting> iterator;
        Module class_227 = this;
Module class_2272 = class_227;
        Module class_2273 = class_227;
        class_2272.d.L(class_2273, null);
        class_2272.l.L(class_227, null);
        if (class_2273.i()) {
            Module class_2274 = class_227;
            class_2274.d.L(class_2274.l);
        }
        Module class_2275 = class_227;
        Module class_2276 = class_227;
        class_2276.i.clear();
        class_2276.L(class_2275, Module.class);
        class_2275.i.sort(Comparator.comparingInt(Setting::L));
        HashSet<String> hashSet = new HashSet<String>();
        Iterator<Setting> iterator2 = iterator = class_227.i.iterator();
        while (iterator2.hasNext()) {
            OnyxListener_001 a = iterator.next();
            if (!hashSet.add(((Setting)a).L())) {
                Object[] objectArray = new Object[2];
                objectArray[0] = ((Setting)a).L();
                objectArray[1] = class_227.H;
                OnyxClient.H.warn("Duplicate setting name '{}' in module '{}'", objectArray);
            }
            ((Setting)a).L(class_227, null);
            iterator2 = iterator;
        }
    }

    protected void L() {
}
}

