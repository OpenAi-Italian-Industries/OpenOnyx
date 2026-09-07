/*
 * Decompiled with CFR.
 */
package openonyx.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import openonyx.configuration.Event;
import openonyx.core.OnyxListener_001;
import openonyx.events.EntityRelationUtils;
import openonyx.features.combat.AntiBot;
import openonyx.utilities.UtilitySupport_476;

public final class TargetType
extends Enum<TargetType> {
    private final static TargetType[] I;
    final public static TargetType d;
    final public static TargetType i;
    final public static TargetType f;
    final public static TargetType H;
    final public static String[] e;

    private static TargetType[] L() {
TargetType[] enum_527Array = new TargetType[4];
        enum_527Array[0] = H;
        enum_527Array[1] = d;
        enum_527Array[2] = i;
        enum_527Array[3] = f;
        return enum_527Array;
    }

    static {
        H = new TargetType("SELF", 0);
        d = new TargetType("ENEMY", 1);
        i = new TargetType("TEAM", 2);
        f = new TargetType("MOBS", 3);
        I = TargetType.L();
        String[] stringArray = new String[4];
        stringArray[0] = "Self";
        stringArray[1] = "Enemy";
        stringArray[2] = "Team";
        stringArray[3] = "Mobs";
        e = stringArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TargetType() {
        void var1_-1;
        void var2_-1;
        void a = var2_-1;
        TargetType enum_527 = this;
    }

    public static TargetType valueOf(String a) {
return Enum.valueOf(TargetType.class, a);
    }

    public static TargetType[] values() {
return (TargetType[])I.clone();
    }

    public static TargetType L(EntityLivingBase entityLivingBase) {
        EntityPlayer entityPlayer;
        EntityLivingBase entityLivingBase2 = entityLivingBase;
Minecraft a = OnyxListener_001.e;
        if (a.thePlayer == null || a.theWorld == null) {
            return null;
        }
        if (!entityLivingBase2.isEntityAlive()) {
            return null;
        }
        if (entityLivingBase2 instanceof EntityArmorStand) {
            return null;
        }
        if (entityLivingBase2 instanceof EntityPlayer && (entityPlayer = (EntityPlayer)entityLivingBase2).isSpectator()) {
            return null;
        }
        if (AntiBot.L(entityLivingBase2)) {
            return null;
        }
        if (entityLivingBase2 == a.thePlayer) {
            if (a.gameSettings.thirdPersonView == 0) {
                return null;
            }
            return H;
        }
        if (entityLivingBase2 instanceof EntityPlayer) {
            entityPlayer = (EntityPlayer)entityLivingBase2;
            if (EntityRelationUtils.L(a.thePlayer, entityPlayer)) {
                return i;
            }
            return d;
        }
        return f;
    }
}

