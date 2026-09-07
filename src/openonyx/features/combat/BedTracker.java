/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.combat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.BlockBed;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.util.BlockPos;
import openonyx.configuration.internal.EventSupport_609;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.PacketEvent;
import openonyx.configuration.internal.PacketDirection;
import openonyx.core.OnyxListener_001;
import openonyx.ui.UiSupport_551;
import openonyx.utilities.Timer;

public final class BedTracker
implements OnyxListener_001 {
    private final Set<BlockPos> m;
    private final Timer h;
    final public static BedTracker l = new BedTracker();
    private final static long I = 3000L;
    private final static int d = 15;
    private BlockPos i;
    private boolean f;
    private final static int H = 35;
    private boolean e;

    public boolean L(BlockPos blockPos) {
        BlockPos a = blockPos;
        BedTracker a2 = this;
return a2.m.contains(a);
    }

    @EventHandler
    public void L(EventSupport_609 class_609) {
        EventSupport_609 a = class_609;
        BedTracker a2 = this;
if (!a2.f || !a2.h.L(3000L)) {
            return;
        }
        a2.f = 0;
        a2.d();
    }

    public BlockPos L() {
        BedTracker class_392 = this;
if (BedTracker.e.thePlayer == null || BedTracker.e.theWorld == null || class_392.m.isEmpty()) {
            return null;
        }
        BlockPos blockPos = new BlockPos(BedTracker.e.thePlayer);
        BlockPos blockPos2 = null;
        double d = Double.MAX_VALUE;
        Iterator<BlockPos> a = class_392.m.iterator();
        block0: while (true) {
            Iterator<BlockPos> iterator = a;
            while (iterator.hasNext()) {
                double d2;
                BlockPos blockPos3 = (BlockPos)a.next();
                if (!(BedTracker.e.theWorld.getBlockState(blockPos3).getBlock() instanceof BlockBed)) {
                    iterator = a;
                    continue;
                }
                double d3 = blockPos3.distanceSq(blockPos.getX(), blockPos.getY(), blockPos.getZ());
                if (!(d2 < d)) continue block0;
                d = d3;
                blockPos2 = blockPos3;
                continue block0;
            }
            break;
        }
        return blockPos2;
    }

    private void d() {
        int n;
        BedTracker class_392 = this;
if (class_392.i == null || BedTracker.e.theWorld == null) {
            return;
        }
        int n2 = -35;
        while (n2 <= 35) {
            int n3 = -15;
            while (n3 <= 15) {
                int n4;
                int n5 = -35;
                while (n5 <= 35) {
                    int n6;
                    BlockPos a = class_392.i.add(-35, n4, n6);
                    if (BedTracker.e.theWorld.getBlockState(a).getBlock() instanceof BlockBed) {
                        class_392.m.add(a);
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
    }

    @EventHandler
    public void L(PacketEvent class_623) {
        S08PacketPlayerPosLook a = class_623;
        BedTracker a2 = this;
if (((PacketEvent)((Object)a)).L() != PacketDirection.f) {
            return;
        }
        if ((a = ((PacketEvent)((Object)a)).L()) instanceof S02PacketChat) {
            String string = ((S02PacketChat)((Object)a)).getChatComponent().getUnformattedText();
            if (string.contains("Protect your bed and destroy the enemy bed") || string.contains("Destroy the enemy bed and then eliminate them")) {
                a2.e = 1;
                return;
            }
        } else if (a instanceof S08PacketPlayerPosLook) {
            a = a;
            if (a2.e) {
                a2.e = 0;
                BedTracker class_392 = a2;
                a2.i = new BlockPos(a.getX(), a.getY(), a.getZ());
                a2.f = 1;
                a2.h.L();
            }
        }
    }

    @EventHandler
    public void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        BedTracker a2 = this;
a2.L();
    }

    private void L() {
        BedTracker a;
BedTracker class_392 = a;
        a.m.clear();
        class_392.f = a.e = 0;
        class_392.i = null;
    }

    private BedTracker() {
        BedTracker a;
        BedTracker class_392 = a;
        a.m = new HashSet<BlockPos>();
        class_392.h = new Timer();
    }
}

