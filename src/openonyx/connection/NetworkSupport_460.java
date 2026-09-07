/*
 * Decompiled with CFR.
 */
package openonyx.connection;

import com.mojang.authlib.GameProfile;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.util.ResourceLocation;
import openonyx.connection.NetworkSupport_457;
import openonyx.core.OnyxListener_001;
import openonyx.utilities.UtilitySupport_492;

public final class NetworkSupport_460
implements OnyxListener_001 {
    private final static Map<UUID, Boolean> H;
    private final static Map<UUID, ResourceLocation> e;

    public static void L(UUID a) {
if (a == null) {
            return;
        }
        e.remove(a);
        H.remove(a);
    }

    static {
        e = new ConcurrentHashMap<UUID, ResourceLocation>();
        H = new ConcurrentHashMap<UUID, Boolean>();
    }

    /*
     * WARNING - void declaration
     */
    public static ResourceLocation L(UUID uUID, String string) {
        void a;
        UUID uUID2 = uUID;
if (uUID2 == null) {
            return DefaultPlayerSkin.getDefaultSkinLegacy();
        }
        ResourceLocation a2 = e.get(uUID2);
        if (a2 != null) {
            return a2;
        }
        UUID uUID3 = uUID2;
        NetworkSupport_460.L(uUID3, (String)a);
        return DefaultPlayerSkin.getDefaultSkin(uUID3);
    }

    private NetworkSupport_460() {
        NetworkSupport_460 a;
    }

    private static void L(GameProfile gameProfile, UUID uUID) {
        UUID a = uUID;
        GameProfile a2 = gameProfile;
((Minecraft)((Object)e)).getSkinManager().loadProfileTextures(a2, new NetworkSupport_457(a), 5 >> 3);
    }

    private static void L(UUID uUID, String string) {
        String a = string;
        UUID a2 = uUID;
if (H.putIfAbsent(a2, Boolean.TRUE) != null) {
            return;
        }
        UtilitySupport_492.L(() -> {
            Object a = a;
            UUID a2 = a2;
a = new GameProfile(a2, (String)a);
            try {
                ((Minecraft)((Object)e)).getSessionService().fillProfileProperties((GameProfile)a, 0 != 0);
            }
            catch (RuntimeException runtimeException) {}
            ((Minecraft)((Object)e)).addScheduledTask(() -> NetworkSupport_460.L((GameProfile)a, a2));
        });
    }
}

