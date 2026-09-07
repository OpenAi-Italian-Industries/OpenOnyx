/*
 * Decompiled with CFR.
 */
package openonyx.commands.internal;

import java.util.List;
import java.util.Locale;
import openonyx.commands.CommandSupport_093;
import openonyx.core.OnyxClient;
import openonyx.misc.MiscSupport_628;
import openonyx.render.group_k.RenderSupport_152;
import openonyx.ui.internal.TextEditor;

public class CommandSupport_095
extends CommandSupport_093 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void L(String[] stringArray) {
        int n;
        void a;
        CommandSupport_095 class_095;
        block16: {
            class_095 = this;
if (((void)a).length == 0) {
                class_095.d();
                return;
            }
            String string = a[0].toLowerCase(Locale.ROOT);
            int a2 = -1;
            switch (string.hashCode()) {
                case 3522941: {
                    if (!string.equals("save")) break;
                    n = 0;
                    break block16;
                }
                case 3327206: {
                    if (!string.equals("load")) break;
                    n = 1;
                    break block16;
                }
                case 3322014: {
                    if (!string.equals("list")) break;
                    n = 2;
                    break block16;
                }
                case -1268966290: {
                    if (!string.equals("folder")) break;
                    n = 3;
                    break block16;
                }
                case 3417674: {
                    if (!string.equals("open")) break;
                    n = 4;
                    break block16;
                }
                case 3198785: {
                    if (!string.equals("help")) break;
                    a2 = 5;
                }
            }
            n = 4;
        }
        switch (n) {
            case 0: {
                CommandSupport_095 class_0952 = class_095;
                class_0952.i(class_0952.L((String[])a));
                return;
            }
            case 1: {
                CommandSupport_095 class_0953 = class_095;
                class_0953.D(class_0953.L((String[])a));
                return;
            }
            case 2: {
                class_095.L();
                return;
            }
            case 3: 
            case 4: {
                class_095.D();
                return;
            }
            case 5: {
                class_095.d();
                return;
            }
        }
        CommandSupport_095.d(new StringBuilder().insert(0, "Unknown subcommand: ").append((String)a[0]).append(" (try ").append(class_095.d()).append(")").toString());
    }

    public CommandSupport_095() {
        CommandSupport_095 a;
        String[] stringArray = new String[1];
        stringArray[0] = "cfg";
        super("config", "Saves and loads client configs", ".config <save|load|list|folder|help> [name]", stringArray);
    }

    private String L(String[] stringArray) {
        String[] a = stringArray;
        String[] a2 = this;
if (a.length > 1) {
            return a[1];
        }
        return "default";
    }

    private void D() {
OnyxClient.e.d();
        CommandSupport_095.L(new StringBuilder().insert(0, "Opened ").append(OnyxClient.e.L()).toString());
    }

    private void i(String string) {
        StringBuilder stringBuilder;
        String a = string;
        CommandSupport_095 a2 = this;
MiscSupport_628 class_628 = OnyxClient.e;
        if (!class_628.h(a)) {
            CommandSupport_095.d(new StringBuilder().insert(0, "Invalid name '").append(a).append("', use letters, digits, - and _").toString());
            return;
        }
        if (class_628.F(a)) {
            stringBuilder = new StringBuilder();
            CommandSupport_095.L(stringBuilder.insert(0, "Saved config '").append(a).append("'").toString());
            return;
        }
        stringBuilder = new StringBuilder();
        CommandSupport_095.d(stringBuilder.insert(0, "Could not save config '").append(a).append("', see the log").toString());
    }

    private void d() {
        CommandSupport_095 a;
CommandSupport_095.L(a.D());
        CommandSupport_095.L(".config save [name] - writes the current settings");
        CommandSupport_095.L(".config load [name] - applies a saved config");
        CommandSupport_095.L(".config list - lists saved configs");
        CommandSupport_095.L(".config folder - opens the config folder");
        CommandSupport_095.L("[name] defaults to 'default', which loads on start and saves on quit");
    }

    private void D(String string) {
        StringBuilder stringBuilder;
        String a = string;
        CommandSupport_095 a2 = this;
MiscSupport_628 class_628 = OnyxClient.e;
        if (!class_628.h(a)) {
            CommandSupport_095.d(new StringBuilder().insert(0, "Invalid name '").append(a).append("', use letters, digits, - and _").toString());
            return;
        }
        if (!class_628.i(a)) {
            CommandSupport_095.d(new StringBuilder().insert(0, "No config named '").append(a).append("'").toString());
            return;
        }
        if (class_628.D(a)) {
            stringBuilder = new StringBuilder();
            CommandSupport_095.L(stringBuilder.insert(0, "Loaded config '").append(a).append("'").toString());
            return;
        }
        stringBuilder = new StringBuilder();
        CommandSupport_095.d(stringBuilder.insert(0, "Could not load config '").append(a).append("', see the log").toString());
    }

    private void L() {
        CommandSupport_095 class_095 = this;
List<String> a = OnyxClient.e.L();
        if (a.isEmpty()) {
            CommandSupport_095.L("No configs saved yet");
            return;
        }
        CommandSupport_095.L(a.size() + " config(s): " + String.join((CharSequence)", ", (Iterable<? extends CharSequence>)a));
    }
}

