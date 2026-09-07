/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.util.Locale;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumChatFormatting;
import openonyx.core.OnyxListener_001;
import openonyx.render.group_k.CrystalEffectSettings;

public final class HypixelUtils {
    private final static String H = "BED WARS";
    private final static int e = 1;

    public static boolean d() {
ServerData serverData = OnyxListener_001.e.getCurrentServerData();
        if (serverData != null && serverData.serverIP != null && serverData.serverIP.toLowerCase(Locale.ROOT).contains("hypixel.net")) {
            return 3 >> 1;
        }
        return false;
    }

    private static String d(String a) {
if (a == null) {
            return "";
        }
        return EnumChatFormatting.getTextWithoutFormattingCodes(a);
    }

    private static ScoreObjective L() {
if (OnyxListener_001.e.theWorld == null) {
            return null;
        }
        Scoreboard scoreboard = OnyxListener_001.e.theWorld.getScoreboard();
        if (scoreboard == null) {
            return null;
        }
        return scoreboard.getObjectiveInDisplaySlot(1);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = n << n ^ 3;
        int n4 = 1;
        int n5 = 2;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (1 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 1;
        }
        return new String(cArray);
    }

    public static boolean L() {
if (HypixelUtils.d() && HypixelUtils.L().toUpperCase(Locale.ROOT).contains(H)) {
            return --1 != 0;
        }
        return false;
    }

    private static String L() {
ScoreObjective scoreObjective = HypixelUtils.L();
        if (scoreObjective == null) {
            return "";
        }
        return HypixelUtils.d(scoreObjective.getDisplayName());
    }

    private HypixelUtils() {
        HypixelUtils a;
    }
}

