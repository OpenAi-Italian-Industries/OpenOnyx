/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.movement;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.TickEvent;
import openonyx.connection.NetworkSupport_453;
import openonyx.core.OnyxClient;
import openonyx.events.RotationManager;
import openonyx.events.Rotation;
import openonyx.events.RotationFixMode;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.combat.KillAura;
import openonyx.features.player.Scaffold;
import openonyx.history.internal.BooleanSetting;
import openonyx.ui.internal.UiSupport_593;

public class NoSlow
extends Module {
    private boolean f;
    public BooleanSetting H;
    private boolean e;

    private void F() {
        NoSlow a;
a.e = 0;
        if (!a.f) {
            return;
        }
        RotationManager.d();
        a.f = 0;
    }

    private static NoSlow L() {
if (OnyxClient.l == null) {
            return null;
        }
        return OnyxClient.l.K;
    }

    public static boolean A() {
NoSlow class_384 = NoSlow.L();
        if (class_384 == null || !NoSlow.e() || !class_384.f) {
            return false;
        }
        if (NoSlow.e.thePlayer != null && class_384.F() && !NoSlow.e.thePlayer.isRiding()) {
            return --1 != 0;
        }
        return false;
    }

    public static void l() {
NoSlow class_384 = NoSlow.L();
        if (class_384 == null || !NoSlow.e() || !class_384.f) {
            return;
        }
        if (NoSlow.e.thePlayer == null || NoSlow.e.thePlayer.movementInput == null) {
            return;
        }
        if (NoSlow.e.thePlayer.isCollidedHorizontally) {
            return;
        }
        if (NoSlow.e.thePlayer.movementInput.moveForward <= 0.0f) {
            return;
        }
        NoSlow.e.thePlayer.setSprinting(1 != 0);
    }

    public static void h() {
NoSlow class_384 = NoSlow.L();
        if (class_384 == null || !NoSlow.e()) {
            return;
        }
        if (NoSlow.e.thePlayer == null || NoSlow.e.thePlayer.movementInput == null) {
            return;
        }
        if (NoSlow.A() && NoSlow.h()) {
            NoSlow.e.thePlayer.movementInput.moveForward *= 0.2f;
            NoSlow.e.thePlayer.movementInput.moveStrafe *= 0.2f;
        }
        if (class_384.e) {
            NoSlow.e.thePlayer.movementInput.jump = 0;
        }
    }

    public NoSlow() {
        super("NoSlow", "Stops KillAura's blocking from slowing you down", ModuleCategory.H);
        NoSlow a;
        NoSlow class_384 = a;
        class_384.H = new BooleanSetting("Pause on KillAura", 1 != 0).L("Fully disables NoSlow while KillAura is enabled, so the two never trade rotations");
    }

    private boolean H() {
        Module a;
        NoSlow class_384 = this;
if (!class_384.H.d()) {
            return 3 >> 2;
        }
        Module class_227 = a = OnyxClient.l == null ? null : OnyxClient.l.u;
        if (a != null && a.d()) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean e() {
NoSlow class_384 = NoSlow.L();
        if (class_384 != null && class_384.d() && !Scaffold.E.d() && !class_384.H()) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean k() {
NoSlow class_384 = NoSlow.L();
        if (class_384 != null && class_384.f) {
            return --1 != 0;
        }
        return false;
    }

    private boolean F() {
return NoSlow.e.thePlayer.isUsingItem();
    }

    private static float d() {
GameSettings gameSettings = NoSlow.e.gameSettings;
        float f2 = 180.0f;
        if (gameSettings.keyBindBack.isKeyDown()) {
            f2 = 0.0f;
            if (gameSettings.keyBindRight.isKeyDown()) {
                f2 -= 45.0f;
            }
            if (gameSettings.keyBindLeft.isKeyDown()) {
                f2 += 45.0f;
            }
        } else if (gameSettings.keyBindForward.isKeyDown()) {
            if (gameSettings.keyBindRight.isKeyDown()) {
                f2 = 225.0f;
            }
            if (gameSettings.keyBindLeft.isKeyDown()) {
                f2 -= 45.0f;
            }
        } else {
            if (gameSettings.keyBindRight.isKeyDown()) {
                f2 = 270.0f;
            }
            if (gameSettings.keyBindLeft.isKeyDown()) {
                f2 -= 90.0f;
            }
        }
        return (MathHelper.wrapAngleTo180_float(NoSlow.e.thePlayer.rotationYaw) + f2 % 360.0f + 360.0f) % 360.0f;
    }

    private boolean l() {
        NoSlow class_384 = this;
ItemStack a = NoSlow.e.thePlayer.getHeldItem();
        if (a != null && a.getItem() != Items.bow) {
            return --1 != 0;
        }
        return false;
    }

    private static boolean h() {
GameSettings gameSettings = NoSlow.e.gameSettings;
        return gameSettings.keyBindRight.isKeyDown() || gameSettings.keyBindLeft.isKeyDown() || gameSettings.keyBindForward.isKeyDown() || gameSettings.keyBindBack.isKeyDown();
    }

    @EventHandler
    public void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        NoSlow a2 = this;
a2.F();
    }

    private boolean I() {
        NoSlow class_384 = this;
Module a = OnyxClient.l.u;
        if (a.d() && ((KillAura)a).D() != null) {
            return 1 != 0;
        }
        return false;
    }

    @EventHandler(priority=-50)
    public void L(TickEvent class_618) {
        TickEvent a22 = class_618;
        NoSlow a = this;
a.e = 0;
        if (NoSlow.e.thePlayer == null || NoSlow.e.theWorld == null || !NoSlow.e()) {
            a.F();
            return;
        }
        if (a.I()) {
            a.f = 0;
            return;
        }
        if (!a.F() || !a.l()) {
            a.F();
            return;
        }
        float a22 = NoSlow.d() + 180.0f;
        if (!NoSlow.e.gameSettings.keyBindJump.isKeyDown() || !NoSlow.e.thePlayer.onGround) {
            a22 -= 45.0f;
            a.e = 1;
        }
        RotationManager.L(new Rotation(0, NoSlow.e.thePlayer.rotationPitch), RotationFixMode.H);
        a.f = 1;
    }

    public static float L() {
if (NoSlow.A()) {
            return 0.1f;
        }
        return 0.8f;
    }

    @Override
    protected void D() {
        NoSlow a;
a.F();
    }
}

