/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C0APacketAnimation;
import openonyx.core.OnyxListener_001;
import openonyx.features.hud.group_m.FeatureSupport_364;
import openonyx.history.SettingListener_035;
import openonyx.skins.SkinSupport_073;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SwingMode
extends Enum<SwingMode>
implements SettingListener_035,
Runnable,
OnyxListener_001 {
    final public static SwingMode l;
    private final static SwingMode[] I;
    final public static SwingMode d;
    private final boolean i;
    final public static SwingMode f;
    final public static SwingMode H;
    private final String e;

    @Generated
    public boolean L() {
        SwingMode a;
return a.i;
    }

    private static SwingMode[] L() {
SwingMode[] enum_007Array = new SwingMode[4];
        enum_007Array[0] = H;
        enum_007Array[1] = l;
        enum_007Array[2] = f;
        enum_007Array[3] = d;
        return enum_007Array;
    }

    public static SwingMode[] values() {
return (SwingMode[])I.clone();
    }

    /*
     * WARNING - void declaration
     */
    private SwingMode(String string2, boolean string2) {
        void a;
        void a2;
        void var2_-1;
        void var1_-1;
        SwingMode a3;
        void var4_2;
        void var0_1 = var4_2;
        SwingMode enum_007 = a3 = this;
        enum_007.e = a2;
        enum_007.i = a;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void run() {
        SwingMode a;
switch (a.ordinal()) {
            case 0: {
                ((Minecraft)((Object)SwingMode.e)).thePlayer.swingItem();
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                ((Minecraft)((Object)e)).getNetHandler().addToSendQueue(new C0APacketAnimation());
                return;
            }
            case 3: {
                ((Minecraft)((Object)SwingMode.e)).thePlayer.swingItemClientOnly();
                return;
            }
        }
    }

    public static SwingMode valueOf(String a) {
return Enum.valueOf(SwingMode.class, a);
    }

    @Override
    public String L() {
        SwingMode a;
return a.e;
    }

    public void L() {
        SwingMode a;
a.run();
    }

    @Generated
    public String d() {
        SwingMode a;
return a.e;
    }

    static {
        H = new SwingMode("DO_NOT_HIDE", 0, "Do not hide", --1 != 0);
        l = new SwingMode("HIDE_BOTH", 1, "Hide for both", 0 != 0);
        f = new SwingMode("HIDE_CLIENT", 2, "Hide for client", 1 != 0);
        d = new SwingMode("HIDE_SERVER", 3, "Hide for server", 0 != 0);
        I = SwingMode.L();
    }
}

