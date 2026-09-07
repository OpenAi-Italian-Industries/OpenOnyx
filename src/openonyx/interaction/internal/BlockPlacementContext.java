/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.interaction.internal;

import java.util.Comparator;
import lombok.Generated;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.internal.InteractionSupport_010;
import openonyx.interaction.internal.InteractionSupport_013;
import openonyx.interaction.internal.InteractionSupport_017;
import openonyx.utilities.UtilitySupport_507;
import openonyx.utilities.internal.UtilitySupport_509;
import openonyx.utilities.internal.UtilitySupport_513;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockPlacementContext {
    private final InteractionSupport_010 i;
    private final InteractionSupport_017 f;
    private final InteractionSupport_013 H;
    private final ItemStack e;

    private static AxisAlignedBB L(BlockPos a) {
return BlockUtils.L(a).offset(a.getX(), a.getY(), a.getZ());
    }

    @Generated
    public InteractionSupport_010 L() {
        BlockPlacementContext a;
return a.i;
    }

    public static Comparator<BlockPos> L(UtilitySupport_513 a) {
return Comparator.comparingDouble(blockPos -> {
            Object a = blockPos;
            UtilitySupport_513 a2 = a;
a = BlockPlacementContext.L((BlockPos)a);
            a = a2.L((AxisAlignedBB)a);
            return -(a != null ? ((UtilitySupport_509)a).L() : Double.POSITIVE_INFINITY);
        });
    }

    public static Comparator<BlockPos> L(Vec3 a) {
return Comparator.comparingDouble(blockPos -> {
            BlockPos a = blockPos;
            Vec3 a2 = a;
return -UtilitySupport_507.L(BlockPlacementContext.L(a), a2);
        });
    }

    @Generated
    public InteractionSupport_013 L() {
        BlockPlacementContext a;
return a.H;
    }

    @Generated
    public InteractionSupport_017 L() {
        BlockPlacementContext a;
return a.f;
    }

    @Generated
    public ItemStack L() {
        BlockPlacementContext a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public BlockPlacementContext(InteractionSupport_010 class_010, InteractionSupport_013 class_013, ItemStack itemStack, InteractionSupport_017 class_017) {
        InteractionSupport_017 a;
        void a2;
        void a3;
        void a4;
        BlockPlacementContext a5;
        BlockPlacementContext class_009 = class_0172;
        InteractionSupport_017 class_0172 = class_017;
        BlockPlacementContext class_0092 = a5 = class_009;
        BlockPlacementContext class_0093 = a5;
        class_0093.i = a4;
        class_0093.H = a3;
        class_0092.e = a2;
        class_0092.f = a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 83;
        int n4 = a;
        int n5 = n << n ^ 4;
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (a < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = a;
        }
        return new String(cArray);
    }
}

