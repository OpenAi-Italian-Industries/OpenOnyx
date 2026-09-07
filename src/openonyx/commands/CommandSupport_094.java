/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.commands;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lombok.Generated;
import openonyx.commands.CommandSupport_093;
import openonyx.commands.internal.CommandSupport_095;
import openonyx.core.OnyxClient;
import openonyx.history.Range;
import openonyx.input.InputSupport_003;

public class CommandSupport_094 {
    public CommandSupport_095 f;
    final public static String H = ".";
    private final ArrayList<CommandSupport_093> e;

    public boolean L(String string) {
        Iterator<CommandSupport_093> iterator;
        String[] a3 = string;
        CommandSupport_094 a2 = this;
if (a3 == null) {
            return 0 != 0;
        }
        if (!(a3 = a3.trim()).startsWith(H)) {
            return 0 != 0;
        }
        if ((a3 = a3.substring(H.length()).trim()).isEmpty()) {
            return 0 != 0;
        }
        a3 = a3.split("\\s+");
        String string2 = a3[0];
        a3 = Arrays.copyOfRange(a3, 1, a3.length);
        Iterator<CommandSupport_093> iterator2 = iterator = a2.e.iterator();
        while (iterator2.hasNext()) {
            CommandSupport_093 class_093 = iterator.next();
            if (!class_093.L(string2)) {
                iterator2 = iterator;
                continue;
            }
            try {
                class_093.L(a3);
            }
            catch (Exception a3) {
                CommandSupport_093.d(new StringBuilder().insert(0, "Command failed: ").append(a3).toString());
                Object[] objectArray = new Object[2];
                objectArray[0] = string2;
                objectArray[1] = a3;
                OnyxClient.H.error("Command '{}' failed", objectArray);
            }
            return true;
        }
        CommandSupport_093.d(new StringBuilder().insert(0, "Unknown command: ").append(string2).toString());
        return --1 != 0;
    }

    @Generated
    public ArrayList<CommandSupport_093> L() {
        CommandSupport_094 a;
return a.e;
    }

    public CommandSupport_094() {
        int n;
        CommandSupport_094 class_094;
        CommandSupport_094 class_0942 = class_094 = this;
        CommandSupport_094 class_0943 = class_094;
        class_0942.f = new CommandSupport_095();
        class_0943.e = new ArrayList();
        Field[] fieldArray = class_0942.getClass().getDeclaredFields();
        int n2 = fieldArray.length;
        int n3 = 0;
        while (n3 < n2) {
            Field a2 = fieldArray[0];
            if (CommandSupport_093.class.isAssignableFrom(a2.getType())) {
                try {
                    class_094.e.add((CommandSupport_093)a2.get(class_094));
                }
                catch (IllegalAccessException a2) {
                    a2.printStackTrace();
                }
            }
            n3 = ++n;
        }
    }
}

