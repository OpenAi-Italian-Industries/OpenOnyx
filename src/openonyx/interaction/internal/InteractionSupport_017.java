/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Vec3;
import openonyx.core.OnyxListener_001;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class InteractionSupport_017
implements OnyxListener_001 {
    private final boolean i;
    private final static float f = 1.54f;
    private final static float H = 1.62f;
    private final Vec3 e;

    @Generated
    public boolean L() {
        InteractionSupport_017 a;
return a.i;
    }

    public float L() {
        InteractionSupport_017 a;
return InteractionSupport_017.L(a.i);
    }

    @Generated
    public Vec3 d() {
        InteractionSupport_017 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public InteractionSupport_017(Vec3 vec3, boolean bl) {
        void a;
        InteractionSupport_017 a2;
        boolean a3 = bl;
        InteractionSupport_017 class_017 = a2 = this;
        class_017.e = a;
        class_017.i = a3;
    }

    public Vec3 L() {
        InteractionSupport_017 a;
return a.e.add(0.0, a.L(), 0.0);
    }

    public static float L(boolean a) {
if (a) {
            return 1.54f;
        }
        return 1.62f;
    }

    public InteractionSupport_017(Vec3 vec3) {
        Vec3 a = vec3;
        InteractionSupport_017 a2 = this;
        a2(a, (((Minecraft)((Object)InteractionSupport_017.e)).thePlayer != null && ((Minecraft)((Object)InteractionSupport_017.e)).thePlayer.isSneaking() ? 1 : 0) != 0);
    }
}

