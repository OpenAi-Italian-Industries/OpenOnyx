/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.movement.internal;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.EventSupport_625;
import openonyx.core.OnyxListener_001;
import openonyx.features.movement.internal.FeatureMode_387;
import openonyx.history.SettingSupport_028;
import openonyx.history.ModeOption;
import openonyx.history.internal.RangeSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.movement.MovementSupport_092;
import openonyx.render.RenderSupport_099;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.MovementInputState;
import openonyx.utilities.UtilitySupport_483;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.Timer;

public class FeatureSupport_385
extends ModeOption
implements OnyxListener_001 {
    private transient int j;
    public RangeSetting m;
    private transient int h;
    public EnumSetting<FeatureMode_387> I;
    public RangeSetting d;
    public BooleanSetting i;
    private final transient SettingSupport_028 f;
    public RangeSetting H;
    private transient Vec3 e;

    public FeatureSupport_385() {
        FeatureSupport_385 a;
        FeatureSupport_385 class_385 = a;
        super("On edge");
        a.m = RangeSetting.L("Distance", 0.1, 0.15, 0.05, 0.5);
        int n = 1;
        class_385.d = RangeSetting.L("Keep", n, 2, n, 20).L(" ticks");
        FeatureSupport_385 class_3852 = a;
        class_385.I = new EnumSetting<FeatureMode_387>("Mode", FeatureMode_387.i);
        int n2 = 0;
        class_385.H = RangeSetting.L("Sneak", n2, n2, n2, 20).L(" ticks");
        class_385.i = new BooleanSetting("Jump", 3 >> 2);
        a.f = new SettingSupport_028(a.m);
    }

    @Override
    protected void d() {
        FeatureSupport_385 a;
a.e = null;
        a.j = 0;
        a.f.L();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=-100)
    private void L(EventSupport_625 class_625) {
        Vec3 a32;
        void a2;
        int a32;
        FeatureSupport_385 class_385 = this;
if (((Minecraft)((Object)FeatureSupport_385.e)).thePlayer == null) {
            return;
        }
        int n = a32 = ((Minecraft)((Object)FeatureSupport_385.e)).thePlayer.onGround && !a2.d() ? 1 : 0;
        if (a32 != 0) {
            boolean bl = UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_385.e)).thePlayer, a2.L(), Math.min(UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_385.e)).thePlayer), class_385.f.L()));
            a32 = bl ? 1 : 0;
            if (bl) {
                Vec3 vec3 = class_385.e;
                if (vec3 != null) {
                    Vec3 vec32 = vec3;
                    double d = vec32.subtract(UtilitySupport_477.D((Entity)((Minecraft)((Object)FeatureSupport_385.e)).thePlayer)).horizontalDistanceSqr();
                    if (vec32.subtract(MovementSupport_092.H.L().L(1).d()).horizontalDistanceSqr() <= d) {
                        return;
                    }
                }
                if (class_385.j == 0) {
                    FeatureSupport_385 class_3852 = class_385;
                    class_3852.f.L();
                    class_3852.j = class_3852.d.i();
                }
                if (class_385.h == 0) {
                    class_385.h = class_385.H.i();
                }
            }
        }
        if (class_385.j > 0) {
            FeatureSupport_385 class_3853;
            FeatureSupport_385 class_3854 = class_385;
            class_3854.j -= 1;
            if (class_3854.I.L(FeatureMode_387.f)) {
                class_3853 = class_385;
                void v6 = a2;
                v6.L(v6.L().L());
                v6.L(0 != 0);
            } else if (class_385.I.L(FeatureMode_387.H) || UtilitySupport_477.L((Entity)((Minecraft)((Object)FeatureSupport_385.e)).thePlayer) > 0.05) {
                Vec3 a32 = class_385.e != null ? class_385.e : UtilitySupport_495.d(new BlockPos(((Minecraft)((Object)FeatureSupport_385.e)).thePlayer));
                class_3853 = class_385;
                float f2 = UtilitySupport_483.L(a32.subtract(UtilitySupport_477.D((Entity)((Minecraft)((Object)FeatureSupport_385.e)).thePlayer)), ((Minecraft)((Object)FeatureSupport_385.e)).thePlayer.rotationYaw);
                a2.L(UtilitySupport_483.L(MovementInputState.i, f2, 20.0f));
            } else {
                if (class_385.I.L(FeatureMode_387.i)) {
                    void v7 = a2;
                    v7.L(MovementInputState.i);
                    v7.L(0 != 0);
                }
                class_3853 = class_385;
            }
            if (((Boolean)class_3853.i.L()).booleanValue()) {
                a2.L(1 != 0);
            }
        }
        if (class_385.h > 0) {
            int n2 = 1;
            class_385.h -= n2;
            a2.d(n2 != 0);
        }
        if (!UtilitySupport_477.L((EntityPlayer)((Minecraft)((Object)FeatureSupport_385.e)).thePlayer, a32 = UtilitySupport_495.d(new BlockPos(((Minecraft)((Object)FeatureSupport_385.e)).thePlayer)))) {
            class_385.e = a32;
        }
    }
}

