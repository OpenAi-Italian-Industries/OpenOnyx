/*
 * Decompiled with CFR.
 */
package openonyx.events;

import openonyx.commands.CommandSupport_093;
import openonyx.core.OnyxListener_001;
import openonyx.features.hud.Notifications;
import openonyx.features.hud.group_d.FeatureMode_354;
import openonyx.render.internal.RenderSupport_176;
import openonyx.ui.UiSupport_551;

public final class NotificationDispatcher
implements OnyxListener_001 {
    /*
     * WARNING - void declaration
     */
    public static void d(String string, String string2, FeatureMode_354 enum_354) {
        void a;
        FeatureMode_354 a2 = enum_354;
        String a3 = string;
e.addScheduledTask(() -> NotificationDispatcher.L(a3, (String)a, a2));
    }

    /*
     * WARNING - void declaration
     */
    private static void L(String string, String string2, FeatureMode_354 enum_354) {
        void a;
        String a2 = string2;
        String a3 = string;
void v0 = a;
        Notifications.L(a3, a2, (FeatureMode_354)v0);
        if (v0 == FeatureMode_354.i || a == FeatureMode_354.e) {
            CommandSupport_093.d(new StringBuilder().insert(0, a3).append(": ").append(a2).toString());
            return;
        }
        CommandSupport_093.L(new StringBuilder().insert(0, a3).append(": ").append(a2).toString());
    }

    private NotificationDispatcher() {
        NotificationDispatcher a;
    }
}

