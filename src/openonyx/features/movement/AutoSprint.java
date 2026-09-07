/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.movement;

import meteordevelopment.orbit.EventHandler;
import openonyx.configuration.internal.EventSupport_619;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.input.InputSupport_002;
import openonyx.interaction.internal.PlacementResult;

public class AutoSprint
extends Module {
    public AutoSprint() {
        super("AutoSprint", "Automatically sprints for you", ModuleCategory.H);
        AutoSprint a;
    }

    @Override
    protected void D() {
AutoSprint.e.gameSettings.keyBindSprint.setPressed(0 != 0);
        if (AutoSprint.e.thePlayer != null) {
            AutoSprint.e.thePlayer.setSprinting(0 != 0);
        }
    }

    @EventHandler
    public void L(EventSupport_619 class_619) {
        EventSupport_619 a = class_619;
        AutoSprint a2 = this;
AutoSprint.e.gameSettings.keyBindSprint.setPressed(--1 != 0);
    }
}

