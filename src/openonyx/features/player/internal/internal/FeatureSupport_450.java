/*
 * Decompiled with CFR.
 */
package openonyx.features.player.internal.internal;

import java.util.ArrayDeque;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;
import openonyx.features.player.internal.FeatureSupport_417;
import openonyx.features.player.internal.FeatureSupport_423;
import openonyx.history.SettingSupport_029;
import openonyx.history.Setting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.ui.internal.UiSupport_593;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_483;
import openonyx.utilities.UtilitySupport_495;
import openonyx.utilities.internal.UtilitySupport_513;

public class FeatureSupport_450
extends SettingSupport_029
implements OnyxListener_001 {
    final public static FeatureSupport_450 I = new FeatureSupport_450();
    public NumberSetting d;
    public NumberSetting i;
    private final transient ArrayDeque<Vec3> f;
    private final static int H = 4;
    public NumberSetting e;

    @Override
    protected void d() {
        FeatureSupport_450 a;
a.i();
    }

    /*
     * WARNING - void declaration
     */
    private Vec3 L(Vec3 vec3, Vec3 vec32) {
        void a;
        Vec3 a2 = vec3;
        FeatureSupport_450 a3 = this;
if (a3.i.L() <= 0.0f) {
            return a2;
        }
        return a2.subtract(UtilitySupport_495.D((Vec3)a, a3.i.L()));
    }

    public Vec3 d(UtilitySupport_513 class_513) {
        Vec3 a;
        FeatureSupport_450 class_450 = this;
if (a == null || !class_450.D()) {
            return null;
        }
        if (UtilitySupport_477.L(((Minecraft)((Object)FeatureSupport_450.e)).thePlayer, (double)class_450.e.L())) {
            return null;
        }
        Vec3 vec3 = class_450.L((UtilitySupport_513)((Object)a));
        if (vec3 == null) {
            return null;
        }
        Object a2 = UtilitySupport_477.D((Entity)((Minecraft)((Object)FeatureSupport_450.e)).thePlayer);
        a2 = vec3.subtract((Vec3)a2);
        FeatureSupport_450 class_4502 = class_450;
        a2 = class_4502.L(vec3, (Vec3)a2);
        Vec3 vec32 = class_4502.L();
        if (vec32 == null) {
            FeatureSupport_423 class_423 = FeatureSupport_417.d();
            if (class_423 != null) {
                return ((Vec3)a2).add(class_423.d(), 0.0, class_423.L());
            }
            return a2;
        }
        float f2 = (float)Math.atan2(((UtilitySupport_513)((Object)a)).L().zCoord, ((UtilitySupport_513)((Object)a)).L().xCoord);
        a = vec3.add(vec32.rotateYaw(-f2));
        return ((Vec3)a2).lerp(a, class_450.L());
    }

    /*
     * WARNING - void declaration
     */
    public void L(UtilitySupport_513 class_513, Vec3 vec3) {
        void a;
        UtilitySupport_513 a322 = class_513;
        FeatureSupport_450 a2 = this;
if (a322 == null || !a2.D()) {
            return;
        }
        if (a == null) {
            return;
        }
        float a322 = (float)Math.atan2(a322.L().zCoord, a322.L().xCoord);
        Vec3 a322 = UtilitySupport_477.D((Entity)((Minecraft)((Object)FeatureSupport_450.e)).thePlayer).subtract((Vec3)a).rotateYaw(a322);
        FeatureSupport_450 class_450 = a2;
        class_450.f.addLast(a322);
        if (class_450.f.size() > 4) {
            a2.f.removeFirst();
        }
    }

    public Vec3 L() {
        FeatureSupport_450 a;
if (a.f.isEmpty()) {
            return null;
        }
        return UtilitySupport_495.L(a.f);
    }

    public void i() {
        FeatureSupport_450 a;
a.f.clear();
    }

    public Vec3 L(UtilitySupport_513 class_513) {
        Object a = class_513;
        FeatureSupport_450 a2 = this;
Vec3 vec3 = a.L(UtilitySupport_477.D((Entity)((Minecraft)((Object)FeatureSupport_450.e)).thePlayer)).add(0.0, -0.1, 0.0);
        a = UtilitySupport_483.L(vec3, vec3.add(UtilitySupport_495.D(((UtilitySupport_513)a).L(), 3.0)));
        if (a == null) {
            return null;
        }
        return UtilitySupport_495.i((Vec3)a, ((Minecraft)((Object)FeatureSupport_450.e)).thePlayer.posY);
    }

    private FeatureSupport_450() {
        FeatureSupport_450 a;
        FeatureSupport_450 class_450 = a;
        super("Prediction", 5 >> 3);
        FeatureSupport_450 class_4502 = a;
        class_450.f = new ArrayDeque(5);
        class_4502.i = new NumberSetting("Bootstrap backoff", 0.2, 0.0, 0.4, 0.01);
        class_450.e = new NumberSetting("Prediction cutoff distance", 0.05, 0.0, 0.3, 0.01);
        class_450.d = new NumberSetting("Warmup placements", 2.0, 0.0, 4.0, 1.0);
        class_450.L(Setting.H);
    }

    private double L() {
        FeatureSupport_450 a;
if (a.d.d() <= 0) {
            return 1.0;
        }
        return Math.clamp((double)a.f.size() / (double)a.d.d(), 0.0, 1.0);
    }
}

