/*
 * Decompiled with CFR.
 */
package openonyx.features.player;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import openonyx.connection.NetworkSupport_453;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleManager;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.TextSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.theme.internal.ThemeSupport_061;

public final class NameChanger
extends Module {
    public BooleanSetting d;
    public TextSetting i;
    public BooleanSetting f;
    public BooleanSetting H;
    public BooleanSetting e;

    public static String i() {
NameChanger class_413 = NameChanger.L();
        if (class_413 == null) {
            return "";
        }
        return (String)class_413.i.L();
    }

    private static NameChanger L() {
ModuleManager class_228 = OnyxClient.l;
        if (class_228 == null) {
            return null;
        }
        return class_228.B;
    }

    private static boolean L(GameProfile a) {
if (((Minecraft)((Object)NameChanger.e)).thePlayer != null && a != null && a.getId() != null && a.getId().equals(((Minecraft)((Object)NameChanger.e)).thePlayer.getGameProfile().getId())) {
            return 1 != 0;
        }
        return false;
    }

    public static String L(EntityPlayer a) {
if (NameChanger.L((EntityLivingBase)a)) {
            return NameChanger.i();
        }
        return a.getName();
    }

    private boolean h() {
        NameChanger a;
if (a.d() && !((String)a.i.L()).isBlank()) {
            return 3 >> 1;
        }
        return false;
    }

    public static String L(String string) {
        String string2 = string;
NameChanger a = NameChanger.L();
        if (a == null || !a.h() || !a.f.d()) {
            return string2;
        }
        if (((Minecraft)((Object)NameChanger.e)).thePlayer == null || !string2.equals(((Minecraft)((Object)NameChanger.e)).thePlayer.getGameProfile().getName())) {
            return string2;
        }
        return (String)a.i.L();
    }

    public NameChanger() {
        super("NameChanger", "Overrides your own displayed name locally", ModuleCategory.i);
        NameChanger a;
        NameChanger class_413 = a;
        a.i = new TextSetting("Display name", "").L("Shown instead of your real name, locally only");
        class_413.e = new BooleanSetting("Tab list", --1 != 0);
        a.f = new BooleanSetting("Scoreboard", 1 != 0);
        a.d = new BooleanSetting("Chat", 3 >> 1).L("Substitute your name inside chat messages too");
        a.H = new BooleanSetting("Nametag", 1 != 0).L("Your own in-world nametag (third person)");
    }

    public static boolean L(EntityLivingBase entityLivingBase) {
        EntityLivingBase entityLivingBase2 = entityLivingBase;
NameChanger a = NameChanger.L();
        if (a != null && a.h() && a.H.d() && entityLivingBase2 == ((Minecraft)((Object)NameChanger.e)).thePlayer) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static String L(NetworkPlayerInfo networkPlayerInfo, String string) {
        NetworkPlayerInfo networkPlayerInfo2 = networkPlayerInfo;
NameChanger a = NameChanger.L();
        if (!(a != null && a.h() && a.e.d() && NameChanger.L(networkPlayerInfo2.getGameProfile()))) {
            void a2;
            return a2;
        }
        return ScorePlayerTeam.formatPlayerName(networkPlayerInfo2.getPlayerTeam(), (String)a.i.L());
    }

    public static boolean I() {
NameChanger class_413 = NameChanger.L();
        if (class_413 != null && class_413.h() && class_413.d.d() && ((Minecraft)((Object)NameChanger.e)).thePlayer != null) {
            return --1 != 0;
        }
        return false;
    }
}

