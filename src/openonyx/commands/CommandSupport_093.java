/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.commands;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import openonyx.core.OnyxListener_001;
import openonyx.render.internal.RenderSupport_174;
import openonyx.ui.internal.TextEditor;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class CommandSupport_093
implements OnyxListener_001 {
    private final String[] i;
    private final String f;
    private final String H;
    private final String e;

    @Generated
    public String D() {
        CommandSupport_093 a;
return a.e;
    }

    public abstract void L(String[] var1);

    /*
     * WARNING - void declaration
     */
    public boolean L(String string) {
        int a;
        void a2;
        CommandSupport_093 class_093 = this;
if (class_093.f.equalsIgnoreCase((String)a2)) {
            return 5 >> 2;
        }
        String[] stringArray = class_093.i;
        int n = class_093.i.length;
        int n2 = 0;
        while (n2 < n) {
            if (stringArray[0].equalsIgnoreCase((String)a2)) {
                return --1 != 0;
            }
            n2 = ++a;
        }
        return false;
    }

    public static void d(String a) {
CommandSupport_093.L(new ChatComponentText(a).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.RED)));
    }

    /*
     * WARNING - void declaration
     */
    protected CommandSupport_093(String string, String string2, String string3, String ... stringArray) {
        String[] a;
        void a2;
        void a3;
        void a4;
        String[] stringArray2 = stringArray3;
        String[] stringArray3 = stringArray;
        String[] a5 = stringArray2;
        a5.f = a4;
        a5.e = a3;
        a5.H = a2;
        a5.i = a;
    }

    public static void L(IChatComponent a) {
if (((Minecraft)((Object)CommandSupport_093.e)).ingameGUI == null) {
            return;
        }
        ((Minecraft)((Object)CommandSupport_093.e)).ingameGUI.getChatGUI().printChatMessage(new ChatComponentText("").appendSibling(new ChatComponentText("[").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.DARK_GRAY))).appendSibling(new ChatComponentText("onyx").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.AQUA))).appendSibling(new ChatComponentText("] ").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.DARK_GRAY))).appendSibling(a));
    }

    public static void L(String a) {
CommandSupport_093.L(new ChatComponentText(a).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.GRAY)));
    }

    @Generated
    public String[] L() {
        CommandSupport_093 a;
return a.i;
    }

    @Generated
    public String d() {
        CommandSupport_093 a;
return a.H;
    }

    @Generated
    public String L() {
        CommandSupport_093 a;
return a.f;
    }
}

