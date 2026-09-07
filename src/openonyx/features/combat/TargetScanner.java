/*
 * Decompiled with CFR.
 */
package openonyx.features.combat;

import java.util.Iterator;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import openonyx.core.OnyxListener_001;
import openonyx.events.GeometryUtils;
import openonyx.events.EntityRelationUtils;
import openonyx.features.combat.AntiBot;
import openonyx.interaction.internal.PlacementResult;
import openonyx.render.group_k.CrystalEffectSettings;

public final class TargetScanner
extends Enum<TargetScanner>
implements OnyxListener_001 {
    private final static TargetScanner[] d;
    final public static TargetScanner i;
    final public static TargetScanner f;
    final public static TargetScanner H;
    final public static TargetScanner e;

    private static boolean L(Entity entity, float f2) {
        float a = f2;
        Entity a2 = entity;
if (0 >= 360.0f) {
            return 3 >> 1;
        }
        Entity entity2 = a2;
        double d = entity2.posX - ((Minecraft)((Object)TargetScanner.e)).thePlayer.posX;
        double d2 = entity2.posZ - ((Minecraft)((Object)TargetScanner.e)).thePlayer.posZ;
        if (Math.abs(MathHelper.wrapAngleTo180_float((float)Math.toDegrees(Math.atan2(-d, d2)) - ((Minecraft)((Object)TargetScanner.e)).thePlayer.rotationYaw)) <= 0.0f) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean L(double d, float f2, Set<TargetScanner> set) {
        double a;
        float f3 = f2;
if (((Minecraft)((Object)TargetScanner.e)).thePlayer == null || ((Minecraft)((Object)TargetScanner.e)).theWorld == null) {
            return false;
        }
        double d2 = 0;
        double d3 = d2 * d2;
        Iterator iterator = ((Minecraft)((Object)TargetScanner.e)).theWorld.loadedEntityList.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a2;
                Entity a3 = (Entity)iterator.next();
                if (!(a3 instanceof EntityLivingBase)) continue block0;
                if ((a3 = (EntityLivingBase)a3) == ((Minecraft)((Object)TargetScanner.e)).thePlayer) {
                    iterator2 = iterator;
                    continue;
                }
                if (!((EntityLivingBase)a3).isEntityAlive()) {
                    iterator2 = iterator;
                    continue;
                }
                if (a3 instanceof EntityArmorStand) {
                    iterator2 = iterator;
                    continue;
                }
                if (a3 instanceof EntityPlayer && ((EntityPlayer)a3).isSpectator()) {
                    iterator2 = iterator;
                    continue;
                }
                if (!TargetScanner.L((EntityLivingBase)a3, (Set<TargetScanner>)a2)) {
                    iterator2 = iterator;
                    continue;
                }
                if (GeometryUtils.L(a3) > d3) {
                    iterator2 = iterator;
                    continue;
                }
                if (TargetScanner.L(a3, f3)) return true;
                iterator2 = iterator;
            }
            break;
        }
        return false;
    }

    private static TargetScanner[] L() {
TargetScanner[] enum_398Array = new TargetScanner[4];
        enum_398Array[0] = H;
        enum_398Array[1] = f;
        enum_398Array[2] = e;
        enum_398Array[3] = i;
        return enum_398Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TargetScanner() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        TargetScanner enum_398 = this;
    }

    public static TargetScanner[] values() {
return (TargetScanner[])d.clone();
    }

    static {
        H = new TargetScanner("PLAYERS", 0);
        f = new TargetScanner("TEAMMATES", 1);
        e = new TargetScanner("MOBS", 2);
        i = new TargetScanner("ANIMALS", 3);
        d = TargetScanner.L();
    }

    public static TargetScanner valueOf(String a) {
return Enum.valueOf(TargetScanner.class, a);
    }

    private static boolean L(EntityLivingBase entityLivingBase, Set<TargetScanner> set) {
        Set<TargetScanner> a = set;
        EntityLivingBase a2 = entityLivingBase;
if (a2 instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)a2;
            if (AntiBot.L(entityPlayer)) {
                return 0 != 0;
            }
            Object object = a;
            if (EntityRelationUtils.L(((Minecraft)((Object)TargetScanner.e)).thePlayer, entityPlayer)) {
                return object.contains(f);
            }
            return object.contains(H);
        }
        if (a2 instanceof EntityAnimal) {
            return a.contains(i);
        }
        if (a2 instanceof EntityLiving) {
            return a.contains(e);
        }
        return false;
    }
}

