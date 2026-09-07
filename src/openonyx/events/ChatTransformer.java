/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import openonyx.events.FileDialogUtils;
import openonyx.features.player.NameChanger;

public final class ChatTransformer {
    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 96;
        int n3 = 0;
        int n4 = 103;
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

    /*
     * WARNING - void declaration
     */
    private static String L(String string, String string2, String string3) {
        void a;
        String a2 = string2;
        String a3 = string;
if (a3.isEmpty() || !a3.contains(a2)) {
            return a3;
        }
        return Pattern.compile(new StringBuilder().insert(0, "\\b").append(Pattern.quote(a2)).append("\\b").toString()).matcher(a3).replaceAll(Matcher.quoteReplacement((String)a));
    }

    /*
     * WARNING - void declaration
     */
    private static IChatComponent L(IChatComponent iChatComponent, String string, String string2) {
        Object object;
        ChatComponentStyle chatComponentStyle;
        void a;
        void a2;
        ChatComponentStyle chatComponentStyle2;
        Object a3;
        IChatComponent iChatComponent2 = iChatComponent;
IChatComponent iChatComponent3 = iChatComponent2;
        if (iChatComponent2 instanceof ChatComponentText) {
            a3 = (ChatComponentText)iChatComponent3;
            chatComponentStyle = chatComponentStyle2 = new ChatComponentText(ChatTransformer.L(((ChatComponentText)a3).getChatComponentText_TextValue(), (String)a2, (String)a));
        } else if (iChatComponent3 instanceof ChatComponentTranslation) {
            int n;
            ChatComponentTranslation chatComponentTranslation = (ChatComponentTranslation)iChatComponent2;
            object = chatComponentTranslation.getFormatArgs();
            Object[] objectArray = new Object[((Object[])object).length];
            int n2 = 0;
            while (n2 < ((Object[])object).length) {
                Object object2;
                Object object3 = object2 = object[0];
                if (object2 instanceof IChatComponent) {
                    var10_10 = (IChatComponent)object3;
                    objectArray[0] = ChatTransformer.L((IChatComponent)var10_10, (String)a2, (String)a);
                } else if (object3 instanceof String) {
                    var10_10 = (String)object2;
                    objectArray[0] = ChatTransformer.L((String)var10_10, (String)a2, (String)a);
                } else {
                    objectArray[0] = object2;
                }
                n2 = ++n;
            }
            chatComponentStyle = chatComponentStyle2 = new ChatComponentTranslation(chatComponentTranslation.getKey(), objectArray);
        } else {
            return iChatComponent2;
        }
        chatComponentStyle.setChatStyle(iChatComponent2.getChatStyle());
        a3 = iChatComponent2.getSiblings().iterator();
        Object object4 = a3;
        while (object4.hasNext()) {
            object = (IChatComponent)a3.next();
            object4 = a3;
            chatComponentStyle2.appendSibling(ChatTransformer.L((IChatComponent)object, (String)a2, (String)a));
        }
        return chatComponentStyle2;
    }

    public static IChatComponent L(IChatComponent iChatComponent) {
        IChatComponent iChatComponent2 = iChatComponent;
if (!NameChanger.I()) {
            return iChatComponent2;
        }
        String string = Minecraft.getMinecraft().thePlayer.getGameProfile().getName();
        String a = NameChanger.i();
        if (string.isEmpty() || a.isEmpty()) {
            return iChatComponent2;
        }
        return ChatTransformer.L(iChatComponent2, string, a);
    }

    private ChatTransformer() {
        ChatTransformer a;
    }
}

