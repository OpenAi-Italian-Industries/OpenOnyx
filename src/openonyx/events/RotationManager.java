/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.events;

import lombok.Generated;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import openonyx.core.OnyxListener_001;
import openonyx.events.MovementRotation;
import openonyx.events.Rotation;
import openonyx.events.RotationFixMode;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_477;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RotationManager
implements OnyxListener_001 {
    private static RotationFixMode k;
    private static boolean g;
    private static float M;
    private static boolean L;
    private static float j;
    private static boolean m;
    private static boolean h;
    private static EntityPlayerSP l;
    private static float I;
    private static float d;
    private static float i;
    private static float f;
    private static float H;
    private static float e;

    public static void D() {
if (!g) {
            return;
        }
        g = false;
        if (RotationManager.e.thePlayer == null) {
            return;
        }
        RotationManager.e.thePlayer.rotationYaw = i;
        RotationManager.e.thePlayer.rotationPitch = e;
    }

    static {
        h = 0;
        I = 0.0f;
        d = 0.0f;
        k = RotationFixMode.i;
        M = 0.0f;
        H = 0.0f;
        L = 0;
        g = 0;
        i = 0.0f;
        e = 0.0f;
        f = 0.0f;
        j = 0.0f;
        m = 0;
        l = null;
    }

    public static boolean i() {
if (!RotationManager.L() && h && k != RotationFixMode.i && RotationManager.e.thePlayer != null) {
            return --1 != 0;
        }
        return false;
    }

    @Generated
    public static boolean D() {
return L;
    }

    public static Rotation L() {
if (m) {
            return new Rotation(f, j);
        }
        return new Rotation(M, H);
    }

    @Generated
    public static float i() {
return H;
    }

    @Generated
    public static float D() {
return I;
    }

    @Generated
    public static float d() {
return d;
    }

    public static void L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
f = a2;
        j = 0;
        m = 1;
        M = a2;
        H = 0;
    }

    @Generated
    public static float L() {
return M;
    }

    public static void d() {
h = 0;
        k = RotationFixMode.i;
    }

    public static void L() {
if (RotationManager.e.thePlayer == null) {
            return;
        }
        if (l != RotationManager.e.thePlayer) {
            l = RotationManager.e.thePlayer;
            M = RotationManager.e.thePlayer.rotationYaw;
            H = RotationManager.e.thePlayer.rotationPitch;
            f = M;
            j = H;
            m = 1;
            L = 0;
        }
        if (RotationManager.L()) {
            ProtocolSupport_212 class_212 = ProtocolSupport_207.I.D();
            if (class_212 == null) {
                class_212 = UtilitySupport_477.L((Entity)RotationManager.e.thePlayer);
            }
            g = false;
            L = 1;
            ProtocolSupport_212 class_2122 = class_212;
            M = class_2122.L();
            H = class_2122.i();
            MovementRotation.L(M, H);
            return;
        }
        if (h) {
            if (m) {
                RotationManager.e.thePlayer.lastReportedYaw = f;
                RotationManager.e.thePlayer.lastReportedPitch = j;
            }
            i = RotationManager.e.thePlayer.rotationYaw;
            e = RotationManager.e.thePlayer.rotationPitch;
            g = 1;
            RotationManager.e.thePlayer.rotationYaw = I;
            RotationManager.e.thePlayer.rotationPitch = d;
        }
        L = h;
        M = RotationManager.e.thePlayer.rotationYaw;
        H = RotationManager.e.thePlayer.rotationPitch;
        MovementRotation.L(RotationManager.e.thePlayer.rotationYaw, RotationManager.e.thePlayer.rotationPitch);
    }

    @Generated
    public static boolean d() {
return h;
    }

    private static boolean L() {
if (h) {
            return 0 != 0;
        }
        return ProtocolSupport_207.I.D() != null || ProtocolSupport_207.I.d() != null;
    }

    public RotationManager() {
        RotationManager a;
    }

    @Generated
    public static RotationFixMode L() {
return k;
    }

    public static void L(Rotation class_535, RotationFixMode enum_539) {
        Object a = enum_539;
        Rotation a2 = class_535;
Rotation class_5352 = a2;
        I = class_5352.d();
        d = class_5352.L();
        k = a;
        h = 1;
    }
}

