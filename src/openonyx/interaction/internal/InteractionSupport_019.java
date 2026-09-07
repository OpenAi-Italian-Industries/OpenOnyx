/*
 * Decompiled with CFR.
 */
package openonyx.interaction.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.core.OnyxListener_001;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.interaction.internal.InteractionSupport_014;
import openonyx.interaction.internal.InteractionSupport_015;
import openonyx.interaction.internal.PlacementResult;
import openonyx.interaction.internal.InteractionMode_018;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.utilities.UtilitySupport_507;
import openonyx.utilities.internal.UtilitySupport_516;

public final class InteractionSupport_019
implements OnyxListener_001 {
    private final static Comparator<InteractionSupport_015> e = Comparator.comparingDouble(a -> {
return a.e.subtract(0.5, 0.5, 0.5).multiply(new Vec3(a.f.getDirectionVec())).lengthSqr();
    }).thenComparingDouble(a -> {
return a.e.yCoord;
    });

    private static boolean L(IBlockState iBlockState, BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB;
        Object a = blockPos;
        IBlockState a2 = iBlockState;
if (InteractionSupport_019.L(a2)) {
            return 5 >> 3;
        }
        a = BlockUtils.L(a2, (BlockPos)a);
        if (axisAlignedBB.maxY >= 1.0 && ((AxisAlignedBB)a).minX <= 0.5 && ((AxisAlignedBB)a).maxX >= 0.5 && ((AxisAlignedBB)a).minZ <= 0.5 && ((AxisAlignedBB)a).maxZ >= 0.5) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static InteractionSupport_015 L(IBlockState iBlockState, BlockPos blockPos, InteractionSupport_014 class_014, BlockPlacementContext class_009) {
        void a;
        IBlockState iBlockState2 = iBlockState;
Object object = List.of(BlockUtils.L(iBlockState2, (BlockPos)a));
        Object object2 = null;
        object = object.iterator();
        block0: while (true) {
            Object object3 = object;
            while (object3.hasNext()) {
                void a2;
                Object object4;
                void a3;
                Object a4;
                Object object5 = a4 = UtilitySupport_507.L((AxisAlignedBB)object.next(), a3.H);
                if (((UtilitySupport_516)object5).i().yCoord >= 0.9) {
                    object4 = ((UtilitySupport_516)object5).L(0.6).L();
                    Object object6 = object5 = object4 != null ? object4 : a4;
                }
                if ((object4 = a2.L().L().L((UtilitySupport_516)object5, (BlockPos)a)) == null) {
                    object3 = object;
                    continue;
                }
                a4 = new InteractionSupport_015((UtilitySupport_516)a4, a3.H, (Vec3)object4);
                if (object2 != null && e.compare((InteractionSupport_015)a4, (InteractionSupport_015)object2) <= 0) continue block0;
                object2 = a4;
                continue block0;
            }
            break;
        }
        return object2;
    }

    private static boolean L(IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
Material a = iBlockState2.getBlock().getMaterial();
        return a == Material.air || a.isLiquid();
    }

    /*
     * WARNING - void declaration
     */
    private static InteractionSupport_014 L(BlockPos blockPos, InteractionMode_018 enum_018, BlockPlacementContext class_009) {
        ProtocolSupport_212 a32;
        int a22;
        void a;
        BlockPos blockPos2 = blockPos;
Vec3 vec3 = a.L().L();
        ArrayList<InteractionSupport_014> arrayList = new ArrayList<InteractionSupport_014>(6);
        Object object = EnumFacing.values();
        int n = ((EnumFacing[])object).length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = object[0];
            InteractionSupport_014 class_0142 = InteractionSupport_019.L(blockPos2, enumFacing, (InteractionMode_018)((Object)a32));
            if (class_0142 != null && (a.L().L() || !(class_0142.L(vec3) < 0.0))) {
                arrayList.add(class_0142);
            }
            n2 = ++a22;
        }
        object = ProtocolSupport_207.I.i();
        InteractionSupport_014 class_014 = null;
        float a22 = Float.POSITIVE_INFINITY;
        for (InteractionSupport_014 class_0142 : arrayList) {
            float f;
            a32 = ProtocolSupport_212.L(class_0142.f, vec3);
            float a32 = ((ProtocolSupport_212)object).L(a32);
            if (!(f < a22)) continue;
            a22 = a32;
            class_014 = class_0142;
        }
        return class_014;
    }

    public static PlacementResult L(BlockPos blockPos, BlockPlacementContext class_009) {
        ProtocolSupport_212 a;
        BlockPos blockPos2 = blockPos;
if (InteractionSupport_019.L(BlockUtils.d(blockPos2), blockPos2)) {
            return null;
        }
        Object object = new ArrayList<Vec3i>(((BlockPlacementContext)((Object)a)).L().L());
        Object object2 = ((BlockPlacementContext)((Object)a)).L().L();
        object.sort((vec3i, vec3i2) -> {
            void a;
            void a2;
            BlockPos a3 = blockPos2;
            Comparator a4 = object2;
return a4.compare(a3.add((Vec3i)a2), a3.add((Vec3i)a));
        });
        Object object3 = object = object.iterator();
        while (object3.hasNext()) {
            Object a2;
            object2 = (Vec3i)object.next();
            Object object4 = BlockUtils.d((BlockPos)(object2 = blockPos2.add((Vec3i)object2)));
            if (InteractionSupport_019.L((IBlockState)object4, (BlockPos)object2)) {
                object3 = object;
                continue;
            }
            Object object5 = a2 = InteractionSupport_019.L((IBlockState)object4) ? InteractionMode_018.f : InteractionMode_018.H;
            if (a2 == InteractionMode_018.H && !BlockUtils.L((IBlockState)object4, (BlockPos)object2, ((BlockPlacementContext)((Object)a)).L())) {
                object3 = object;
                continue;
            }
            object4 = InteractionSupport_019.L((BlockPos)object2, (InteractionMode_018)((Object)a2), (BlockPlacementContext)((Object)a));
            if (object4 == null) {
                object3 = object;
                continue;
            }
            a2 = ((InteractionSupport_014)object4).e;
            object4 = InteractionSupport_019.L(BlockUtils.d((BlockPos)a2), (BlockPos)a2, (InteractionSupport_014)object4, (BlockPlacementContext)((Object)a));
            if (object4 == null) {
                object3 = object;
                continue;
            }
            a = ProtocolSupport_212.L(((InteractionSupport_015)object4).e.add(((Vec3i)a2).getX(), ((Vec3i)a2).getY(), ((Vec3i)a2).getZ()), ((BlockPlacementContext)((Object)a)).L().L());
            Object object6 = object4;
            return new PlacementResult((BlockPos)a2, (BlockPos)object2, ((InteractionSupport_015)object6).f, ((InteractionSupport_015)object6).H.D().yCoord + (double)((Vec3i)a2).getY(), a);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static InteractionSupport_014 L(BlockPos blockPos, EnumFacing enumFacing, InteractionMode_018 enum_018) {
        Object a = enum_018;
        BlockPos a2 = blockPos;
switch (((Enum)a).ordinal()) {
            case 0: {
                void a3;
                while (false) {
                }
                a = a2.offset(a3.getOpposite());
                IBlockState iBlockState = BlockUtils.L((BlockPos)a);
                if (iBlockState == null) {
                    return null;
                }
                if (iBlockState.getBlock().isReplaceable(((Minecraft)((Object)InteractionSupport_019.e)).theWorld, (BlockPos)a)) {
                    return null;
                }
                return new InteractionSupport_014((BlockPos)a, (EnumFacing)a3);
            }
            case 1: {
                void a3;
                return new InteractionSupport_014(a2, (EnumFacing)a3);
            }
        }
        return null;
    }

    private InteractionSupport_019() {
        InteractionSupport_019 a;
    }
}

