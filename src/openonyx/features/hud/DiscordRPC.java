/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.hud;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import openonyx.configuration.internal.EventSupport_619;
import openonyx.core.OnyxClient;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.internal.BooleanSetting;
import openonyx.interaction.internal.PlacementResult;
import openonyx.ipc.EventSupport_519;
import openonyx.theme.internal.ThemeSupport_061;

public class DiscordRPC
extends Module {
    private volatile String L;
    private long j;
    private ScheduledExecutorService m;
    private final static String h = "https://discord.gg/onyxmcclient";
    private final static String l = "1543222663961382952";
    public BooleanSetting I;
    private final static int d = 5;
    private EventSupport_519 i;
    private final static String f = "onyx";
    private String H;
    public BooleanSetting e;

    @Override
    protected void D() {
        DiscordRPC class_332 = this;
DiscordRPC class_3322 = class_332;
        ScheduledExecutorService a = class_3322.m;
        EventSupport_519 class_519 = class_3322.i;
        class_3322.m = null;
        class_3322.i = null;
        if (a == null) {
            return;
        }
        a.execute(() -> {
if (class_519 != null) {
                class_519.L();
            }
        });
        a.shutdown();
    }

    @Override
    protected void L() {
        DiscordRPC a2;
DiscordRPC class_332 = a2;
        class_332.j = System.currentTimeMillis() / 1000L;
        class_332.H = null;
        DiscordRPC class_3322 = a2;
        class_332.i = new EventSupport_519();
        class_3322.m = Executors.newSingleThreadScheduledExecutor(a -> {
Thread thread = new Thread(a, "Onyx-DiscordRPC");
            thread.setDaemon(1 != 0);
            return thread;
        });
        a2.m.scheduleWithFixedDelay(() -> {
            DiscordRPC class_332 = this;
EventSupport_519 class_519 = class_332.i;
            if (class_519 == null) {
                return;
            }
            try {
                Object a;
                if (!class_519.L()) {
                    if (!class_519.L(l)) {
                        return;
                    }
                    class_332.H = null;
                    OnyxClient.H.info("Discord RPC: connected to Discord");
                }
                if (((String)(a = class_332.i())).equals(class_332.H)) {
                    return;
                }
                class_519.L(1, DiscordRPC.d((String)a));
                class_332.H = a;
                Object[] objectArray = new Object[1];
                objectArray[0] = a;
                OnyxClient.H.info("Discord RPC: pushed activity {}", objectArray);
                return;
            }
            catch (IOException a) {
                class_519.L();
                class_332.H = null;
                OnyxClient.H.warn("Discord RPC update failed; will reconnect", (Throwable)a);
                return;
            }
            catch (Throwable a) {
                OnyxClient.H.warn("Discord RPC tick failed", a);
                return;
            }
        }, 0L, 5L, TimeUnit.SECONDS);
    }

    private String I() {
        DiscordRPC class_332 = this;
if (((Minecraft)((Object)DiscordRPC.e)).theWorld == null) {
            return "In the Main Menu";
        }
        if (((Minecraft)((Object)e)).isSingleplayer()) {
            return "Playing Singleplayer";
        }
        ServerData a = ((Minecraft)((Object)e)).getCurrentServerData();
        if (a != null && class_332.e.d()) {
            return new StringBuilder().insert(0, "Playing on ").append(a.serverIP).toString();
        }
        return "Playing Multiplayer";
    }

    private String i() {
        DiscordRPC class_332 = this;
StringBuilder a = new StringBuilder("{");
        DiscordRPC class_3322 = class_332;
        a.append("\"details\":\"").append(DiscordRPC.L(class_3322.L)).append("\",");
        a.append("\"state\":\"").append(DiscordRPC.L(new StringBuilder().insert(0, "Username: ").append(OnyxClient.L()).toString())).append("\",");
        if (class_3322.I.d()) {
            a.append("\"timestamps\":{\"start\":").append(class_332.j).append("},");
        }
        Object object = a;
        ((StringBuilder)object).append("\"assets\":{").append("\"large_image\":\"").append(DiscordRPC.L(f)).append("\",").append("\"large_text\":\"Onyx Client\"},");
        a.append("\"buttons\":[{\"label\":\"Join our Discord\",\"url\":\"").append(DiscordRPC.L(h)).append("\"}]");
        a.append("}");
        return ((StringBuilder)object).toString();
    }

    public DiscordRPC() {
        super("DiscordRPC", "Shows Onyx as your Discord status", ModuleCategory.l);
        DiscordRPC a;
        DiscordRPC class_332 = a;
        a.e = new BooleanSetting("Show Server", --1 != 0).L("Reveal the current server IP in the status; off keeps it private");
        class_332.I = new BooleanSetting("Elapsed Time", 1 != 0).L("Show how long the client has been running");
        a.L = "In the Main Menu";
        a.L(--1 != 0);
    }

    @EventHandler
    private void L(EventSupport_619 class_619) {
        EventSupport_619 a = class_619;
        DiscordRPC a2 = this;
a2.L = a2.I();
    }

    private static String d(String a) {
return new StringBuilder().insert(0, "{\"cmd\":\"SET_ACTIVITY\",\"nonce\":\"").append(UUID.randomUUID()).append("\",\"args\":{\"pid\":").append(ProcessHandle.current().pid()).append(",\"activity\":").append(a).append("}}").toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String L(String string) {
        int n;
        String string2 = string;
CharSequence a = new StringBuilder(string2.length() + 8);
        int n2 = 0;
        while (n2 < string2.length()) {
            char c = string2.charAt(0);
            switch (c) {
                case '\"': {
                    ((StringBuilder)a).append("\\\"");
                    break;
                }
                case '\\': {
                    ((StringBuilder)a).append("\\\\");
                    break;
                }
                case '\n': {
                    ((StringBuilder)a).append("\\n");
                    break;
                }
                case '\r': {
                    ((StringBuilder)a).append("\\r");
                    break;
                }
                case '\t': {
                    ((StringBuilder)a).append("\\t");
                    break;
                }
                default: {
                    if (c < 32) {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = (int)c;
                        ((StringBuilder)a).append(String.format("\\u%04x", objectArray));
                        break;
                    }
                    ((StringBuilder)a).append(c);
                }
            }
            n2 = ++n;
        }
        return ((StringBuilder)a).toString();
    }
}

