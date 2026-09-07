/*
 * Decompiled with CFR.
 */
package openonyx.interaction.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import openonyx.protocol.group_m.ProtocolSupport_212;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PlacementResult
extends Record {
    private final BlockPos d;
    private final BlockPos i;
    private final double f;
    private final EnumFacing H;
    private final ProtocolSupport_212 e;

    public boolean L(MovingObjectPosition movingObjectPosition) {
        MovingObjectPosition a = movingObjectPosition;
        PlacementResult a2 = this;
if (a == null) {
            return 0 != 0;
        }
        if (a.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
            return 0 != 0;
        }
        if (!a.getBlockPos().equals(a2.d)) {
            return 0 != 0;
        }
        if (a.sideHit != a2.H) {
            return 0 != 0;
        }
        if (!(a.hitVec.yCoord < a2.f)) {
            return 1 != 0;
        }
        return false;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 122;
        int n3 = a;
        int n4 = 38;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (a < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = a;
        }
        return new String(cArray);
    }

    @Override
    public final int hashCode() {
        PlacementResult a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{PlacementResult.class, "interactedBlockPos;placedBlock;direction;minPlacementY;rotation", "d", "i", "H", "f", "e"}, a);
    }

    public ProtocolSupport_212 L() {
        PlacementResult a;
return a.e;
    }

    public BlockPos d() {
        PlacementResult a;
return a.i;
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        PlacementResult a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{PlacementResult.class, "interactedBlockPos;placedBlock;direction;minPlacementY;rotation", "d", "i", "H", "f", "e"}, a2, a);
    }

    public double L() {
        PlacementResult a;
return a.f;
    }

    @Override
    public final String toString() {
        PlacementResult a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{PlacementResult.class, "interactedBlockPos;placedBlock;direction;minPlacementY;rotation", "d", "i", "H", "f", "e"}, a);
    }

    public BlockPos L() {
        PlacementResult a;
return a.d;
    }

    public EnumFacing L() {
        PlacementResult a;
return a.H;
    }

    /*
     * WARNING - void declaration
     */
    public PlacementResult(BlockPos blockPos, BlockPos blockPos2, EnumFacing enumFacing, double d, ProtocolSupport_212 class_212) {
        Record a;
        void a2;
        void a3;
        void a4;
        void a5;
        PlacementResult a6;
        PlacementResult class_027 = record;
        Record record = class_212;
        PlacementResult class_0272 = a6 = class_027;
        PlacementResult class_0273 = a6;
        a6.d = a5;
        class_0273.i = a4;
        class_0273.H = a3;
        class_0272.f = a2;
        class_0272.e = a;
    }

    public MovingObjectPosition L() {
        PlacementResult a;
PlacementResult class_027 = a;
        return new MovingObjectPosition(Vec3.atCenterOf(a.d), class_027.H, class_027.d);
    }
}

