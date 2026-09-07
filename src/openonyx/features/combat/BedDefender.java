/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.combat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToIntFunction;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import openonyx.commands.CommandSupport_093;
import openonyx.configuration.internal.TickEvent;
import openonyx.core.OnyxClient;
import openonyx.events.GeometryUtils;
import openonyx.events.RotationManager;
import openonyx.events.Rotation;
import openonyx.events.RotationFixMode;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.combat.BedTarget;
import openonyx.features.combat.BedTracker;
import openonyx.features.combat.DefenseStep;
import openonyx.features.combat.PlacementOrder;
import openonyx.features.combat.DefensePattern;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.interaction.BlockUtils;
import openonyx.interaction.SwingMode;
import openonyx.render.RenderSupport_099;
import openonyx.render.RenderSupport_106;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.utilities.BlockItemUtils;
import openonyx.utilities.RayTraceUtils;
import openonyx.utilities.RayTraceMode;

public class BedDefender
extends Module {
    private final static double n = 4.5;
    private BlockPos Y;
    private BlockPos r;
    public NumberSetting W;
    public EnumSetting<RotationFixMode> P;
    private int V;
    public BooleanSetting R;
    public NumberSetting p;
    public NumberSetting t;
    public NumberSetting b;
    private List<DefenseStep> E;
    private String F;
    private int G;
    public NumberSetting A;
    private boolean K;
    private boolean B;
    private final Set<String> C;
    private final static String J = "{\"EndWoolCorners\":[{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":3},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":-1},{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":2}],\"EndWoolCorners2\":[{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":3}],\"EndGlassNoCorners\":[{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"stained_glass\",\"x\":0,\"y\":0,\"z\":3},{\"block\":\"stained_glass\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"stained_glass\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"stained_glass\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"stained_glass\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"stained_glass\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"stained_glass\",\"x\":-1,\"y\":0,\"z\":2},{\"block\":\"stained_glass\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"stained_glass\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"stained_glass\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"stained_glass\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"stained_glass\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"stained_glass\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"stained_glass\",\"x\":0,\"y\":1,\"z\":2}],\"WoodWoolCorners\":[{\"block\":\"planks\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"planks\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"planks\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"planks\",\"x\":-1,\"y\":0,\"z\":2},{\"block\":\"planks\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"planks\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"planks\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"planks\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"planks\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"planks\",\"x\":0,\"y\":0,\"z\":3},{\"block\":\"planks\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"planks\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"planks\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"planks\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"planks\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"planks\",\"x\":0,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":1}],\"EndGlassWool\":[{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":2,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"stained_glass\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"stained_glass\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"stained_glass\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"stained_glass\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"stained_glass\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"stained_glass\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"stained_glass\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"stained_glass\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"stained_glass\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"stained_glass\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"stained_glass\",\"x\":-1,\"y\":0,\"z\":2},{\"block\":\"stained_glass\",\"x\":0,\"y\":1,\"z\":2},{\"block\":\"stained_glass\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"stained_glass\",\"x\":0,\"y\":0,\"z\":3},{\"block\":\"wool\",\"x\":-3,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":-3,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":-2,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":-2,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":3},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":3},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":4},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":3},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":2,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":2,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":3,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":3,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":2,\"z\":0},{\"block\":\"wool\",\"x\":1,\"y\":2,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":2},{\"block\":\"wool\",\"x\":-1,\"y\":2,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":2,\"z\":1},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":-2},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":-3},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":-2},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":-2},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":3,\"z\":0},{\"block\":\"wool\",\"x\":0,\"y\":3,\"z\":1}],\"Wool1Layer\":[{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":-1}],\"EndWoodLongCorners\":[{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"planks\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"planks\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"planks\",\"x\":-1,\"y\":1,\"z\":-1},{\"block\":\"planks\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"planks\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"planks\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"planks\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"planks\",\"x\":1,\"y\":1,\"z\":-1},{\"block\":\"planks\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"planks\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"planks\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"planks\",\"x\":2,\"y\":0,\"z\":1},{\"block\":\"planks\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"planks\",\"x\":0,\"y\":1,\"z\":2},{\"block\":\"planks\",\"x\":0,\"y\":0,\"z\":3},{\"block\":\"planks\",\"x\":-1,\"y\":0,\"z\":2}],\"EndWoolLong\":[{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":2},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":-1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-2},{\"block\":\"end_stone\",\"x\":0,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":-1},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":0},{\"block\":\"end_stone\",\"x\":1,\"y\":0,\"z\":1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":-1},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":0},{\"block\":\"end_stone\",\"x\":0,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":-2,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":-1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":-1},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":0},{\"block\":\"wool\",\"x\":0,\"y\":2,\"z\":1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":-1},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":0},{\"block\":\"wool\",\"x\":1,\"y\":1,\"z\":1},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":-1},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":0},{\"block\":\"wool\",\"x\":2,\"y\":0,\"z\":1},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":2},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":3},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":2},{\"block\":\"wool\",\"x\":1,\"y\":0,\"z\":-2},{\"block\":\"wool\",\"x\":0,\"y\":1,\"z\":-2},{\"block\":\"wool\",\"x\":0,\"y\":0,\"z\":-3},{\"block\":\"wool\",\"x\":-1,\"y\":0,\"z\":-2}]}";
    private int D;
    public EnumSetting<PlacementOrder> c;
    public NumberSetting a;
    public NumberSetting k;
    public NumberSetting g;
    public NumberSetting M;
    public BooleanSetting L;
    private final Map<BlockPos, Integer> j;
    private final static Map<String, List<DefenseStep>> m;
    public BooleanSetting h;
    private boolean l;
    private int I;
    private final static float[] d;
    private int i;
    private BlockPos f;
    public EnumSetting<DefensePattern> H;
    private final Map<String, Integer> e;

    /*
     * WARNING - void declaration
     */
    private int L(String string) {
        int n;
        String string2;
        void a;
        BedDefender class_402 = this;
String string3 = a.toLowerCase();
        Object a2 = class_402.e.get(string3);
        if (a2 != null && (string2 = BedDefender.L(((Minecraft)((Object)BedDefender.e)).thePlayer.inventory.getStackInSlot((Integer)a2))) != null && string2.equalsIgnoreCase((String)a)) {
            return (Integer)a2;
        }
        class_402.L(new StringBuilder().insert(0, "looking for block '").append(string3).append("' in hotbar").toString());
        int n2 = 0;
        while (n2 < 9) {
            a2 = ((Minecraft)((Object)BedDefender.e)).thePlayer.inventory.getStackInSlot(0);
            if (a2 != null) {
                a2 = BedDefender.L((ItemStack)a2);
                Object object = a2;
                class_402.L("slot " + 0 + " -> " + (String)object);
                if (object != null && ((String)a2).equalsIgnoreCase((String)a)) {
                    int n3 = 0;
                    class_402.e.put(string3, n3);
                    return n3;
                }
            }
            n2 = ++n;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private BlockPos L(int n) {
        void a;
        int n2;
        BedDefender class_402 = this;
BlockPos blockPos = new BlockPos(((Minecraft)((Object)BedDefender.e)).thePlayer);
        int n3 = blockPos.getX();
        int n4 = blockPos.getY();
        int n5 = blockPos.getZ();
        double d = Double.MAX_VALUE;
        Object object = null;
        int n6 = n2 = n3 - a;
        while (n6 <= n3 + a) {
            int n7 = n4 - a;
            while (n7 <= n4 + a) {
                int n8;
                int n9 = n5 - a;
                while (n9 <= n5 + a) {
                    int n10;
                    Object object2 = new BlockPos(n2, n8, n10);
                    if ("bed".equalsIgnoreCase(BedDefender.d((BlockPos)object2))) {
                        Object object3;
                        Object a2 = null;
                        BlockPos blockPos2 = null;
                        switch (BedDefender.L((BlockPos)object2)) {
                            case 0: {
                                while (false) {
                                }
                                blockPos2 = object2;
                                int n11 = 0;
                                object3 = a2 = blockPos2.add(n11, n11, 1);
                                break;
                            }
                            case 1: {
                                blockPos2 = object2;
                                int n12 = 0;
                                object3 = a2 = blockPos2.add(-1, n12, n12);
                                break;
                            }
                            case 2: {
                                blockPos2 = object2;
                                int n13 = 0;
                                object3 = a2 = blockPos2.add(n13, n13, -1);
                                break;
                            }
                            case 3: {
                                blockPos2 = object2;
                                int n14 = 0;
                                object3 = a2 = blockPos2.add(1, n14, n14);
                                break;
                            }
                            case 8: {
                                a2 = object2;
                                int n15 = 0;
                                blockPos2 = ((BlockPos)a2).add(n15, n15, -1);
                                object3 = a2;
                                break;
                            }
                            case 9: {
                                a2 = object2;
                                int n16 = 0;
                                blockPos2 = ((BlockPos)a2).add(1, n16, n16);
                                object3 = a2;
                                break;
                            }
                            case 10: {
                                a2 = object2;
                                int n17 = 0;
                                blockPos2 = ((BlockPos)a2).add(n17, n17, 1);
                                object3 = a2;
                                break;
                            }
                            case 11: {
                                a2 = object2;
                                int n18 = 0;
                                blockPos2 = ((BlockPos)a2).add(-1, n18, n18);
                            }
                            default: {
                                object3 = a2;
                            }
                        }
                        if (object3 != null && blockPos2 != null) {
                            double d2 = ((Vec3i)a2).distanceSq(n3, n4, n5);
                            double d3 = blockPos2.distanceSq(n3, n4, n5);
                            double d4 = Math.min(d2, d3);
                            Object object4 = object2 = d2 <= d3 ? a2 : blockPos2;
                            if (d4 < d) {
                                d = d4;
                                object = object2;
                            }
                        }
                    }
                    n9 = ++n10;
                }
                n7 = ++n8;
            }
            n6 = ++n2;
        }
        return object;
    }

    private boolean L(List<DefenseStep> list) {
        Object object;
        Iterator a = list;
        BedDefender a2 = this;
if (a == null || a.isEmpty()) {
            return false;
        }
        HashSet<String> hashSet = new HashSet<String>();
        a = a.iterator();
        while (a.hasNext()) {
            object = (DefenseStep)a.next();
            if (((DefenseStep)object).L() == null) continue;
            hashSet.add(((DefenseStep)object).L().toLowerCase());
        }
        int n = 0;
        while (n < 9) {
            object = BedDefender.L(((Minecraft)((Object)BedDefender.e)).thePlayer.inventory.getStackInSlot(0));
            if (object != null && hashSet.contains(((String)object).toLowerCase())) {
                return 1 != 0;
            }
            n = ++a;
        }
        return false;
    }

    private Comparator<BedTarget> L() {
        BedDefender a2;
switch (((PlacementOrder)a2.c.L()).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: {
                return Comparator.comparingDouble(BedTarget::L).thenComparingInt(BedTarget::L);
            }
            case 1: {
                return Comparator.comparingDouble(BedTarget::L).reversed().thenComparingInt(BedTarget::L);
            }
            case 3: {
                return Comparator.comparingInt(BedTarget::L);
            }
            case 0: 
        }
        ToIntFunction<BedTarget> toIntFunction = a -> {
return a.L().getY();
        };
        while (false) {
        }
        return Comparator.comparingInt(toIntFunction).thenComparing(Comparator.comparingDouble(BedTarget::L).reversed()).thenComparingInt(BedTarget::L);
    }

    @Override
    protected void D() {
        BedDefender a;
if (a.K) {
            BedDefender.d(0 != 0);
            a.K = 0;
        }
        a.f = null;
        RotationManager.d();
        a.L("disabled.");
    }

    private static double L(double a, double a2) {
return ThreadLocalRandom.current().nextDouble(0, a2);
    }

    private void k() {
        BedDefender a;
if (!a.K) {
            return;
        }
        if (a.V > 0) {
            a.V -= 1;
            return;
        }
        BedDefender.d(false);
        a.K = 0;
        a.L("released sneak.");
    }

    private void F() {
        int a;
        BedDefender class_402 = this;
class_402.C.clear();
        int n = 0;
        while (n < 9) {
            String string = BedDefender.L(((Minecraft)((Object)BedDefender.e)).thePlayer.inventory.getStackInSlot(0));
            if (string != null) {
                class_402.C.add(string.toLowerCase());
            }
            n = ++a;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void L(BlockPos blockPos) {
        BedDefender class_402 = this;
int a = class_402.p.d();
        if (0 > 0) {
            void a2;
            class_402.j.put((BlockPos)a2, 0);
        }
    }

    private static String L(Block block) {
        Block block2 = block;
if (block2 == null) {
            return "air";
        }
        Block a = Block.blockRegistry.getNameForObject(block2);
        if (a == null) {
            return "";
        }
        return BedDefender.L(((Object)a).toString());
    }

    private static String L(String string) {
        String string2 = string;
int a = string2.indexOf(58);
        if (0 < 0) {
            return string2;
        }
        return string2.substring(1);
    }

    private static float L(float a) {
        float f2;
a = 0.0f;
        if (f2 > 180.0f) {
            return -360.0f;
        }
        return 0;
    }

    private static MovingObjectPosition L(double d, float f2, float f3) {
        double a;
        float a2 = f3;
        float a222 = f2;
MovingObjectPosition a222 = RayTraceUtils.L(0, RayTraceMode.e, 0 != 0, GeometryUtils.L(), GeometryUtils.L(a222, a2));
        if (a222 == null || a222.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
            return null;
        }
        if (a222.getBlockPos() == null || a222.sideHit == null) {
            return null;
        }
        return a222;
    }

    private static boolean L(boolean[] a) {
boolean bl = 3 >> 1;
        a[0] = bl;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        void a;
        BedDefender class_402 = this;
if (!class_402.d() || class_402.f == null || ((Minecraft)((Object)BedDefender.e)).theWorld == null) {
            return;
        }
        AxisAlignedBB a2 = BlockUtils.e.offset(class_402.f.getX(), class_402.f.getY(), class_402.f.getZ());
        if (!RenderSupport_106.L((float)a, 1 != 0)) {
            return;
        }
        RenderSupport_106.L(a2, -16711936, 1.5f, 0x4000FF00);
        RenderSupport_106.L();
    }

    /*
     * WARNING - void declaration
     */
    private float[] L(float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        BedDefender class_402 = this;
float a5 = class_402.W.L();
        a2 -= a4;
        a -= a3;
        float[] fArray = new float[2];
        fArray[0] = a4 += Math.max(-0.0f, Math.min(0, (float)a2));
        fArray[1] = a3 += Math.max(-0.0f, Math.min(0, (float)a));
        return fArray;
    }

    /*
     * WARNING - void declaration
     */
    private float[] L(float f2, float f3, BlockPos blockPos, String string, float f4, float f5) {
        void a;
        void a2;
        void a32;
        float a2222 = f2;
        BedDefender a4 = this;
Object a2222 = BedDefender.L(4.5, a2222, (float)a32);
        if (a2222 == null) {
            return null;
        }
        MovingObjectPosition movingObjectPosition = a2222;
        a2222 = movingObjectPosition.getBlockPos();
        if (!((BlockPos)a2222).offset((EnumFacing)(a32 = movingObjectPosition.sideHit)).equals(a2)) {
            return null;
        }
        Object object = BedDefender.d((BlockPos)a2222);
        if (a4.h.d() && a32 != EnumFacing.UP && ((String)object).equals("bed")) {
            return null;
        }
        int n = ((Minecraft)((Object)BedDefender.e)).thePlayer.inventory.currentItem;
        int n2 = a4.L((String)a);
        if (n2 == -1) {
            return null;
        }
        if (n != n2) {
            a4.L("switching to slot " + n2 + " for " + (String)a);
            ((Minecraft)((Object)BedDefender.e)).thePlayer.inventory.currentItem = n2;
            a4.D = a4.g.d();
        }
        if (a4.L((BlockPos)a2222, (EnumFacing)a32)) {
            void a5;
            void a6;
            int n3 = a4.D;
            a4.D = n3 - 1;
            if (n3 > 0) {
                BedDefender class_402 = a4;
                class_402.L(new StringBuilder().insert(0, "swap delay... (").append(class_402.D + 1).append(" left)").toString());
                return d;
            }
            if (!((Minecraft)((Object)BedDefender.e)).gameSettings.keyBindSneak.isKeyDown() && ((String)object).equals("bed")) {
                BedDefender.d(--1 != 0);
                BedDefender class_402 = a4;
                a4.K = 1;
                class_402.V = class_402.t.d();
                class_402.L("sneaking over bed for placement");
                return d;
            }
            boolean a2222 = false;
            Object a32 = BedDefender.L(4.5, (float)a6, (float)a5);
            if (a32 != null) {
                EnumFacing enumFacing;
                Object object2 = a32;
                object = ((MovingObjectPosition)object2).getBlockPos();
                if (((BlockPos)object).offset(enumFacing = ((MovingObjectPosition)object2).sideHit).equals(a2)) {
                    String string2 = BedDefender.d((BlockPos)object);
                    if (!a4.h.d() || enumFacing == EnumFacing.UP || !string2.equals("bed")) {
                        a2222 = true;
                    }
                }
            }
            if (a4.i > 0 || !a2222) {
                if (a4.i > 0) {
                    a4.i -= 1;
                }
                return d;
            }
            a4.i = a4.A.d();
            boolean[] blArray = new boolean[1];
            int n4 = 0;
            blArray[n4] = n4;
            object = blArray;
            BlockUtils.L((MovingObjectPosition)a32, () -> BedDefender.L((boolean[])object), () -> {
return 0 != 0;
            }, SwingMode.H);
            BedDefender class_402 = a4;
            if (object[0] != false) {
                class_402.L(new StringBuilder().insert(0, "placed ").append((String)a).append(" at ").append(BedDefender.L((BlockPos)a2)).toString());
                a4.L((BlockPos)a2);
                a4.r = null;
            } else {
                class_402.L(new StringBuilder().insert(0, "place failed at ").append(BedDefender.L((BlockPos)a2)).toString());
            }
            float[] fArray = new float[2];
            fArray[0] = a6;
            fArray[1] = a5;
            return fArray;
        }
        return null;
    }

    static {
        int n;
        Object object;
        DefensePattern[] enum_400Array;
        JsonObject jsonObject;
        JsonObject jsonObject2;
        m = new LinkedHashMap<String, List<DefenseStep>>();
        try {
            jsonObject = jsonObject2 = new JsonParser().parse(J).getAsJsonObject();
        }
        catch (Exception exception) {
            jsonObject = jsonObject2 = new JsonObject();
        }
        DefensePattern[] enum_400Array2 = enum_400Array = jsonObject.entrySet().iterator();
        while (enum_400Array2.hasNext()) {
            Map.Entry<String, JsonElement> entry = enum_400Array.next();
            ArrayList<DefenseStep> arrayList = new ArrayList<DefenseStep>();
            try {
                object = entry.getValue().getAsJsonArray().iterator();
                block8: while (true) {
                    Object object2 = object;
                    while (object2.hasNext()) {
                        JsonElement jsonElement;
                        int n2;
                        JsonElement jsonElement2;
                        int n3;
                        String string;
                        JsonElement jsonElement3;
                        block16: {
                            jsonElement3 = (JsonElement)object.next();
                            try {
                                jsonElement3 = jsonElement3.getAsJsonObject();
                                String string2 = string = ((JsonObject)jsonElement3).has("block") ? ((JsonObject)jsonElement3).get("block").getAsString() : "";
                                if (!string.isEmpty()) break block16;
                                object2 = object;
                                continue;
                            }
                            catch (Exception exception) {}
                        }
                        if (((JsonObject)jsonElement3).has("x")) {
                            n3 = ((JsonObject)jsonElement3).get("x").getAsInt();
                            jsonElement2 = jsonElement3;
                        } else {
                            n3 = 0;
                            jsonElement2 = jsonElement3;
                        }
                        if (((JsonObject)jsonElement2).has("y")) {
                            n2 = ((JsonObject)jsonElement3).get("y").getAsInt();
                            jsonElement = jsonElement3;
                        } else {
                            n2 = 0;
                            jsonElement = jsonElement3;
                        }
                        arrayList.add(new DefenseStep(string, new BlockPos(n3, n2, ((JsonObject)jsonElement).has("z") ? ((JsonObject)jsonElement3).get("z").getAsInt() : 0)));
                        continue block8;
                    }
                    break;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            m.put(entry.getKey(), arrayList);
            enum_400Array2 = enum_400Array;
        }
        enum_400Array = DefensePattern.values();
        int n4 = enum_400Array.length;
        int n5 = 0;
        while (n5 < 0) {
            object = enum_400Array[0];
            if (!m.containsKey(((DefensePattern)object).L())) {
                Object[] objectArray = new Object[1];
                objectArray[0] = ((DefensePattern)object).L();
                OnyxClient.H.warn("BedDefender: no defense named '{}' in the embedded JSON", objectArray);
            }
            n5 = ++n;
        }
        float[] fArray = new float[2];
        fArray[0] = -999.0f;
        fArray[1] = -999.0f;
        d = fArray;
    }

    private static float d(float f2, float f3) {
        float a = f3;
        float a2 = f2;
float f4 = 0;
        return f4 + (((a2 - f4 + 180.0f) % 360.0f + 360.0f) % 360.0f - 180.0f);
    }

    private static String L(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null) {
            return null;
        }
        Object a = BlockItemUtils.L(itemStack2);
        if (a != null) {
            return BedDefender.L((Block)a);
        }
        a = Item.itemRegistry.getNameForObject(itemStack2.getItem());
        if (a == null) {
            return null;
        }
        return BedDefender.L(a.toString());
    }

    private static float[] L(Vec3 a, double a22, double a3, double a4) {
a3 -= a.yCoord;
        double d = a22 -= a.xCoord;
        double d2 = a4 -= a.zCoord;
        double d3 = Math.sqrt(d * d + d2 * d2);
        float a22 = (float)Math.toDegrees(Math.atan2(a4, a22)) - 90.0f;
        a22 = BedDefender.L(a22);
        float f2 = (float)Math.toDegrees(-Math.atan2(a3, d3));
        float[] fArray = new float[2];
        fArray[0] = a22;
        fArray[1] = f2;
        return fArray;
    }

    private static boolean d(BlockPos blockPos) {
        int a;
        BlockPos blockPos2 = blockPos;
EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < 0) {
            EnumFacing enumFacing = enumFacingArray[0];
            if (!"air".equals(BedDefender.d(blockPos2.offset(enumFacing)))) {
                return 1 != 0;
            }
            n2 = ++a;
        }
        return false;
    }

    private static String d(BlockPos a) {
return BedDefender.L(BlockUtils.L(a));
    }

    private float[] d() {
        Object object;
        Object object2;
        int n;
        float f2;
        BedDefender class_402 = this;
BedDefender class_4022 = class_402;
        float f3 = f2 = class_4022.M.L();
        f2 = Math.min(f2, 90.0f);
        Rotation class_535 = RotationManager.L();
        float f4 = class_535.d();
        float f5 = class_535.L();
        if (!class_4022.B) {
            BedDefender class_4023;
            Object a;
            if (class_402.L.d()) {
                a = BedTracker.l.L();
                if (a == null) {
                    BedDefender class_4024 = class_402;
                    class_4024.L("no whitelisted bed. disabling.");
                    return class_4024.L();
                }
                if (!"bed".equalsIgnoreCase(BedDefender.d((BlockPos)a))) {
                    BedDefender class_4025 = class_402;
                    class_4025.L("whitelisted bed pos is stale/not a bed. disabling.");
                    return class_4025.L();
                }
            } else {
                a = class_402.L(16);
                if (a == null) {
                    BedDefender class_4026 = class_402;
                    class_4026.L("no bed in range. disabling.");
                    return class_4026.L();
                }
                if (!"bed".equalsIgnoreCase(BedDefender.d((BlockPos)a))) {
                    BedDefender class_4027 = class_402;
                    class_4027.L("findBed returned invalid target. disabling.");
                    return class_4027.L();
                }
            }
            Object object3 = a;
            class_402.L(new StringBuilder().insert(0, "bed found at ").append(((Vec3i)object3).getX()).append(",").append(((Vec3i)a).getY()).append(",").append(((Vec3i)a).getZ()).toString());
            class_402.Y = object3;
            switch (BedDefender.L((BlockPos)a)) {
                case 0: 
                case 10: {
                    while (false) {
                    }
                    class_4023 = class_402;
                    class_402.F = "north";
                    break;
                }
                case 2: 
                case 8: {
                    class_4023 = class_402;
                    class_402.F = "south";
                    break;
                }
                case 3: 
                case 9: {
                    class_4023 = class_402;
                    class_402.F = "west";
                    break;
                }
                case 1: 
                case 11: {
                    class_4023 = class_402;
                    class_402.F = "east";
                    break;
                }
                default: {
                    class_4023 = class_402;
                    class_402.F = "";
                }
            }
            class_4023.L(new StringBuilder().insert(0, "lockedDirection=").append(class_402.F).toString());
            class_402.B = 1;
        }
        BedDefender class_4028 = class_402;
        class_4028.h();
        class_4028.F();
        int a = 0;
        int n2 = 0;
        ArrayList<BedTarget> arrayList = new ArrayList<BedTarget>();
        ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
        Vec3 vec3 = GeometryUtils.L();
        int n3 = 0;
        while (n3 < class_402.E.size()) {
            object2 = class_402.E.get(0);
            object = class_402.Y.add(BedDefender.L(((DefenseStep)object2).L(), class_402.F));
            if ("air".equals(BedDefender.d((BlockPos)object))) {
                ++a;
                arrayList2.add((BlockPos)object);
                int n4 = class_402.C.contains(((DefenseStep)object2).L().toLowerCase());
                n2 |= n4;
                if (n4 != 0 && BedDefender.d((BlockPos)object) && BedDefender.L((BlockPos)object)) {
                    double d;
                    Object object4 = object;
                    double d2 = (double)((Vec3i)object4).getX() + 0.5 - vec3.xCoord;
                    double d3 = (double)((Vec3i)object4).getY() + 0.5 - vec3.yCoord;
                    double d4 = (double)((Vec3i)object4).getZ() + 0.5 - vec3.zCoord;
                    double d5 = d2;
                    double d6 = d3;
                    double d7 = d4;
                    d2 = d5 * d5 + d6 * d6 + d7 * d7;
                    if (!(d > 36.0)) {
                        arrayList.add(new BedTarget((BlockPos)object, ((DefenseStep)object2).L(), 0, d2));
                    }
                }
            }
            n3 = ++n;
        }
        if (0 == 0) {
            BedDefender class_4029 = class_402;
            class_4029.L("done (pattern filled).");
            return class_4029.L();
        }
        if (n2 == 0) {
            BedDefender class_40210 = class_402;
            class_40210.L("no block left in the hotbar for anything still open (disabling)");
            return class_40210.L();
        }
        HashMap<BlockPos, Integer> hashMap = new HashMap<BlockPos, Integer>();
        Object object5 = object2 = arrayList.iterator();
        while (object5.hasNext()) {
            object = (BedTarget)object2.next();
            object5 = object2;
            hashMap.put(((BedTarget)object).L(), BedDefender.L((BedTarget)object, arrayList2, vec3));
        }
        arrayList.sort(Comparator.comparingInt(class_391 -> {
            BedTarget a = class_391;
            Map a2 = hashMap;
return (Integer)a2.get(a.L());
        }).thenComparing(class_402.L()));
        float[] fArray = class_402.L(arrayList, f4, f5, f3, f2);
        object2 = fArray;
        if (fArray != null) {
            return object2;
        }
        BedDefender class_40211 = class_402;
        class_40211.I += 1;
        if (class_40211.a.d() > 0) {
            BedDefender class_40212 = class_402;
            if (class_40212.I > class_40212.a.d()) {
                BedDefender class_40213 = class_402;
                class_40213.L("nothing placeable for " + class_402.I + " ticks (disabling)");
                return class_40213.L();
            }
        }
        class_402.f = arrayList.isEmpty() ? null : ((BedTarget)arrayList.get(0)).L();
        return null;
    }

    public boolean I() {
        BedDefender a;
return a.d();
    }

    private void l() {
        BedDefender a;
a.l = 0;
        RotationManager.d();
        a.L(3 >> 2);
    }

    private float[] L() {
a.l = 1;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private float[] L(BedTarget class_391, float f2, float f3, float f4, float f5) {
        int a2;
        void a3;
        void a4;
        BlockPos a5;
        BedDefender class_402 = this;
void v0 = a5;
        a5 = v0.L();
        String string = v0.L();
        void var7_10 = a4;
        void var8_12 = a3;
        Object[] objectArray = class_402.L((float)var7_10, (float)var8_12, a5, string, (float)a4, (float)a3);
        if (objectArray != null) {
            if (objectArray[1] == -999.0f) {
                return class_402.L((float)a4, (float)a3, (float)var7_10, (float)var8_12);
            }
            return objectArray;
        }
        EnumFacing[] enumFacingArray = new EnumFacing[6];
        enumFacingArray[0] = EnumFacing.DOWN;
        enumFacingArray[1] = EnumFacing.UP;
        enumFacingArray[2] = EnumFacing.SOUTH;
        enumFacingArray[3] = EnumFacing.NORTH;
        enumFacingArray[4] = EnumFacing.WEST;
        enumFacingArray[5] = EnumFacing.EAST;
        EnumFacing[] enumFacingArray2 = enumFacingArray;
        int[] nArray = new int[6];
        int n = 0;
        nArray[n] = n;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[4] = 1;
        nArray[5] = -1;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[6];
        nArray3[0] = 1;
        nArray3[1] = -1;
        nArray3[2] = 0;
        nArray3[3] = 0;
        nArray3[4] = 0;
        nArray3[5] = 0;
        objectArray = nArray3;
        int[] nArray4 = new int[6];
        int n2 = 0;
        nArray4[n2] = n2;
        nArray4[1] = 0;
        nArray4[2] = -1;
        nArray4[3] = 1;
        nArray4[4] = 0;
        nArray4[5] = 0;
        int[] nArray5 = nArray4;
        Vec3 vec3 = GeometryUtils.L();
        float f6 = BedDefender.L((float)a4);
        void var13_18 = a3;
        float f7 = BedDefender.L(((Minecraft)((Object)BedDefender.e)).thePlayer.rotationYaw);
        float f8 = ((Minecraft)((Object)BedDefender.e)).thePlayer.rotationPitch;
        double d = 0.05;
        double d2 = 0.2;
        double d3 = 0.2;
        double d4 = 1.0 - d - 0.001;
        d += 0.001;
        int n3 = (int)Math.round(1.0 / d2);
        ArrayList<Object[]> arrayList = new ArrayList<Object[]>((n3 + 1) * (n3 + 1) * 6);
        int n4 = 0;
        while (n4 < 6) {
            Object[] objectArray2 = enumFacingArray2[0];
            BlockPos blockPos = a5.add(nArray2[0], (int)objectArray[0], nArray5[0]);
            String string2 = BedDefender.d(blockPos);
            if (!(string2.equals("air") || class_402.h.d() && string2.equals("bed") && objectArray2 != EnumFacing.UP)) {
                int n5;
                int n6 = 0;
                while (n6 <= n3) {
                    int n7;
                    double d5;
                    boolean bl = 0 == 0;
                    double d6 = 0.0 * d2 + BedDefender.L(-d2 * d3, d2 * d3);
                    if (d5 < 0.0) {
                        d6 = 0.0;
                    } else if (d6 > 1.0) {
                        d6 = 1.0;
                    }
                    int n8 = 0;
                    while (n8 <= n3) {
                        void a6;
                        void a7;
                        Vec3 vec32;
                        double d7;
                        double d8;
                        double d9;
                        boolean bl2;
                        double d10;
                        double d11 = 0.0 * d2 + BedDefender.L(-d2 * d3, d2 * d3);
                        if (d10 < 0.0) {
                            d11 = 0.0;
                            bl2 = bl;
                        } else {
                            if (d11 > 1.0) {
                                d11 = 1.0;
                            }
                            bl2 = bl;
                        }
                        double d12 = d9 = bl2 ? d11 : 1.0 - d11;
                        if (0 < 2) {
                            BlockPos blockPos2 = blockPos;
                            d11 = (double)blockPos2.getX() + d9;
                            d8 = (double)blockPos2.getZ() + d6;
                            d7 = (double)blockPos2.getY() + (0 == 1 ? d4 : d);
                            vec32 = vec3;
                        } else if (0 < 4) {
                            BlockPos blockPos3 = blockPos;
                            d11 = (double)blockPos3.getX() + d9;
                            d7 = (double)blockPos3.getY() + d6;
                            d8 = (double)blockPos3.getZ() + (0 == 2 ? d4 : d);
                            vec32 = vec3;
                        } else {
                            BlockPos blockPos4 = blockPos;
                            d8 = (double)blockPos4.getZ() + d9;
                            d7 = (double)blockPos4.getY() + d6;
                            d11 = (double)blockPos4.getX() + (0 == 5 ? d4 : d);
                            vec32 = vec3;
                        }
                        float[] fArray = BedDefender.L(vec32, d11, d7, d8);
                        float f9 = fArray[0];
                        float f10 = fArray[1];
                        if (!(Math.abs(BedDefender.L(f7, f9)) > a7 || Math.abs(f10 - f8) > a6 || Math.abs(f10) > 90.0f)) {
                            d11 = Math.abs((double)BedDefender.L(f6, f9)) + Math.abs((double)(f10 - var13_18)) + (objectArray2 == EnumFacing.UP ? -0.25 : 0.0);
                            Object[] objectArray3 = new Object[3];
                            objectArray3[0] = d11;
                            objectArray3[1] = Float.valueOf(f9);
                            objectArray3[2] = Float.valueOf(f10);
                            arrayList.add(objectArray3);
                        }
                        n8 = ++n7;
                    }
                    n6 = ++n5;
                }
            }
            n4 = ++a2;
        }
        if (arrayList.isEmpty()) {
            class_402.L("no aim candidates (FOV/angles?)");
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(a -> {
return (Double)a[0];
        }));
        for (Object[] objectArray2 : arrayList) {
            float f11 = ((Float)objectArray2[1]).floatValue();
            float f12 = ((Float)objectArray2[2]).floatValue();
            float f13 = BedDefender.d(f11, (float)a4);
            float[] fArray = class_402.L(f13, f12, a5, string, (float)a4, (float)a3);
            if (fArray == null) continue;
            if (fArray[1] == -999.0f) {
                return class_402.L((float)a4, (float)a3, f13, f12);
            }
            return fArray;
        }
        return null;
    }

    private static boolean L(BlockPos a) {
return ((Minecraft)((Object)BedDefender.e)).theWorld.checkNoEntityCollision(BlockUtils.e.offset(a.getX(), a.getY(), a.getZ()));
    }

    private static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
float f4 = a = 0 - a2;
        while (f4 <= -180.0f) {
            f4 = 360.0f;
        }
        float f5 = 0;
        while (f5 > 180.0f) {
            f5 = -360.0f;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private static int L(BedTarget class_391, List<BlockPos> list, Vec3 vec3) {
        Iterator a;
        BedTarget class_3912 = class_391;
AxisAlignedBB axisAlignedBB = new AxisAlignedBB(class_3912.L().getX(), class_3912.L().getY(), class_3912.L().getZ(), class_3912.L().getX() + 1, class_3912.L().getY() + 1, class_3912.L().getZ() + 1);
        int n = 0;
        a = a.iterator();
        block0: while (true) {
            Iterator iterator = a;
            while (iterator.hasNext()) {
                void a2;
                Object a3 = (BlockPos)a.next();
                if (((Vec3i)a3).equals(class_3912.L())) {
                    iterator = a;
                    continue;
                }
                if (a2.squareDistanceTo((Vec3)(a3 = new Vec3((double)((Vec3i)a3).getX() + 0.5, (double)((Vec3i)a3).getY() + 0.5, (double)((Vec3i)a3).getZ() + 0.5))) <= class_3912.L()) {
                    iterator = a;
                    continue;
                }
                if (axisAlignedBB.calculateIntercept((Vec3)a2, (Vec3)a3) == null) continue block0;
                ++n;
                continue block0;
            }
            break;
        }
        return 0;
    }

    private static String L(BlockPos a) {
return a.getX() + "," + a.getY() + "," + a.getZ();
    }

    @Override
    protected void L() {
        BedDefender a;
a.E = m.getOrDefault(((DefensePattern)a.H.L()).L(), new ArrayList());
        BedDefender class_402 = a;
        if (a.E.isEmpty()) {
            class_402.L("enabled, but no defenses loaded.");
            v1 = a;
        } else {
            class_402.L(new StringBuilder().insert(0, "enabled. defense='").append(((DefensePattern)a.H.L()).L()).append("' steps=").append(a.E.size()).toString());
            BedDefender class_4022 = a;
            if (!class_4022.L(class_4022.E)) {
                a.L("no required blocks for selected defense in hotbar (disabling)");
                a.l = 1;
            }
            v1 = a;
        }
        v1.f = null;
        BedDefender class_4023 = a;
        BedDefender class_4024 = a;
        a.r = null;
        class_4024.G = 0;
        class_4024.I = 0;
        class_4023.j.clear();
        class_4023.C.clear();
        a.K = class_4023.B = 0;
        a.F = "";
        a.i = a.A.d();
        a.e.clear();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(BlockPos blockPos, EnumFacing enumFacing) {
        void a;
        EnumFacing a2 = enumFacing;
        BedDefender a3 = this;
return "air".equalsIgnoreCase(BedDefender.d(a.offset(a2)));
    }

    private static int L(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
IBlockState a = BlockUtils.L(blockPos2);
        if (a == null || !(a.getBlock() instanceof BlockBed)) {
            return -1;
        }
        return a.getValue(BlockBed.FACING).getHorizontalIndex() | (a.getValue(BlockBed.PART) == BlockBed.EnumPartType.HEAD ? 8 : 0);
    }

    @EventHandler
    public void L(TickEvent class_618) {
        Object a = class_618;
        BedDefender a2 = this;
if (((Minecraft)((Object)BedDefender.e)).thePlayer == null || ((Minecraft)((Object)BedDefender.e)).theWorld == null) {
            return;
        }
        if (a2.l) {
            a2.l();
            return;
        }
        BedDefender class_402 = a2;
        class_402.k();
        a = class_402.d();
        if (class_402.l) {
            a2.l();
            return;
        }
        if (a == null) {
            RotationManager.d();
            return;
        }
        RotationManager.L(new Rotation((float)a[0], (float)a[1]), (RotationFixMode)((Object)a2.P.L()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static BlockPos L(BlockPos blockPos, String string) {
        int n;
        int n2;
        int n3;
        int a;
        BlockPos blockPos2;
        block12: {
            blockPos2 = blockPos;
BlockPos blockPos3 = blockPos2;
            a = blockPos3.getX();
            n3 = blockPos3.getY();
            n2 = blockPos3.getZ();
            BlockPos a2 = a;
            int n4 = -1;
            switch (((String)((Object)a2)).hashCode()) {
                case 105007365: {
                    if (!((String)((Object)a2)).equals("north")) break;
                    n = 0;
                    break block12;
                }
                case 109627853: {
                    if (!((String)((Object)a2)).equals("south")) break;
                    n = 1;
                    break block12;
                }
                case 3105789: {
                    if (!((String)((Object)a2)).equals("east")) break;
                    n = 2;
                    break block12;
                }
                case 3645871: {
                    if (!((String)((Object)a2)).equals("west")) break;
                    n4 = 3;
                }
            }
            n = 2;
        }
        switch (n) {
            case 0: {
                return new BlockPos(0, n3, n2);
            }
            case 1: {
                return new BlockPos(0, n3, -n2);
            }
            case 2: {
                return new BlockPos(-n2, n3, 0);
            }
            case 3: {
                return new BlockPos(n2, n3, 0);
            }
        }
        return blockPos2;
    }

    /*
     * WARNING - void declaration
     */
    private float[] L(List<BedTarget> list, float f2, float f3, float f4, float f5) {
        int n;
        void a;
        BedDefender class_402;
        block10: {
            void a2;
            void a3;
            void a4;
            void a5;
            Object object;
            class_402 = this;
Object a6 = null;
            if (class_402.r != null) {
                for (BedTarget class_391 : a) {
                    if (!class_391.L().equals(class_402.r)) continue;
                    object = a6 = class_391;
                    break;
                }
            } else {
                object = a6;
            }
            if (object != null && class_402.G > 0) {
                BedDefender class_4022 = class_402;
                class_4022.G -= 1;
                float[] fArray = class_4022.L((BedTarget)a6, (float)a5, (float)a4, (float)a3, (float)a2);
                Object object2 = fArray;
                if (fArray != null) {
                    BedDefender class_4023 = class_402;
                    class_4023.f = ((BedTarget)a6).L();
                    class_4023.I = 0;
                    return object2;
                }
                BedDefender class_4024 = class_402;
                Object object3 = a6;
                class_4024.L(new StringBuilder().insert(0, "lost the aim on ").append(BedDefender.L(((BedTarget)object3).L())).append(", moving on").toString());
                class_4024.L(((BedTarget)object3).L());
            }
            class_402.r = null;
            int n2 = class_402.k.d();
            int n3 = 0;
            Object object4 = a6 = a.iterator();
            while (object4.hasNext()) {
                BedTarget class_391 = (BedTarget)a6.next();
                if (class_402.j.containsKey(class_391.L())) {
                    object4 = a6;
                    continue;
                }
                if (n3 >= n2) {
                    n = n3;
                    break block10;
                }
                ++n3;
                float[] fArray = class_402.L(class_391, (float)a5, (float)a4, (float)a3, (float)a2);
                if (fArray != null) {
                    BedDefender class_4025 = class_402;
                    class_402.r = class_391.L();
                    class_402.G = class_402.b.d();
                    class_4025.f = class_391.L();
                    class_4025.I = 0;
                    return fArray;
                }
                class_402.L(class_391.L());
                object4 = a6;
            }
            n = n3;
        }
        if (n == 0 && !a.isEmpty()) {
            class_402.j.clear();
        }
        return null;
    }

    private static void d(boolean a) {
KeyBinding.setKeyBindState(((Minecraft)((Object)BedDefender.e)).gameSettings.keyBindSneak.getKeyCode(), a);
    }

    private void L(String string) {
        String a = string;
        BedDefender a2 = this;
if (a2.R.d()) {
            CommandSupport_093.L(new StringBuilder().insert(0, "[beddef] ").append(a).toString());
        }
    }

    private void h() {
        BedDefender a2;
a2.j.entrySet().removeIf(a -> {
Map.Entry entry = a;
            entry.setValue((Integer)entry.getValue() - 1);
            if ((Integer)a.getValue() <= 0) {
                return --1 != 0;
            }
            return false;
        });
    }

    public BedDefender() {
        BedDefender a;
        BedDefender class_402 = a;
        BedDefender class_4022 = a;
        super("BedDefender", "Walls your bed in with a preset defense pattern", ModuleCategory.d);
        BedDefender class_4023 = a;
        a.h = new BooleanSetting("Only Top Beds", 1 != 0).L("Never click the side of a bed, only its top face");
        class_4023.L = new BooleanSetting("Bedwars Only", 1 != 0).L("Anchor to the tracked team bed instead of the nearest bed in range");
        a.g = new NumberSetting("Delay After Swap", 0.0, 0.0, 10.0, 1.0).d(" ticks");
        a.A = new NumberSetting("Delay After Aiming", 0.0, 0.0, 10.0, 1.0).d(" ticks");
        a.t = new NumberSetting("Sneak Hold Ticks", 5.0, 0.0, 20.0, 1.0).d(" ticks");
        a.W = new NumberSetting("Aim Speed", 20.0, 1.0, 180.0, 1.0).d(" deg/t");
        a.M = new NumberSetting("FOV", 180.0, 0.0, 180.0, 1.0).L("How far off your own aim a candidate placement angle may be");
        a.H = new EnumSetting<DefensePattern>("Defense", DefensePattern.j);
        a.c = new EnumSetting<PlacementOrder>("Order", PlacementOrder.e).L("Which open spot to wall in first when several are placeable - whatever this says, a spot standing in front of another is still left for last");
        a.k = new NumberSetting("Targets Per Tick", 4.0, 1.0, 16.0, 1.0).L("How many different spots to search for an aim each tick before giving up on the tick");
        a.b = new NumberSetting("Target Lock", 30.0, 5.0, 100.0, 5.0).d(" ticks").L("How long to keep turning toward one spot before writing it off and trying another");
        a.p = new NumberSetting("Retry Cooldown", 20.0, 0.0, 100.0, 5.0).d(" ticks").L("How long a spot that could not be reached is skipped before it is tried again");
        a.a = new NumberSetting("Stuck Timeout", 100.0, 0.0, 400.0, 20.0).d(" ticks").L("Turn off after this long with nothing placeable - 0 never gives up");
        a.P = new EnumSetting<RotationFixMode>("Move fix", RotationFixMode.H).L("Keeps movement consistent with the rotation the server sees");
        class_4022.R = new BooleanSetting("Debug Logs", 0 != 0);
        class_402.F = "";
        class_4022.e = new HashMap<String, Integer>();
        class_402.E = new ArrayList<DefenseStep>();
        class_402.j = new HashMap<BlockPos, Integer>();
        class_402.C = new HashSet<String>();
    }
}

