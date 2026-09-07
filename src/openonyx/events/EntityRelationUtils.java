/*
 * Decompiled with CFR.
 */
package openonyx.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class EntityRelationUtils {
    private static Integer L(ItemStack itemStack) {
        Item item;
        ItemStack itemStack2 = itemStack;
if (itemStack2 == null || !((item = itemStack2.getItem()) instanceof ItemArmor)) {
            return null;
        }
        ItemArmor a = (ItemArmor)item;
        if (!a.hasColor(itemStack2)) {
            return null;
        }
        return a.getColor(itemStack2);
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = 3;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = n2 << n2 ^ 6;
        int cfr_ignored_0 = n << n ^ 0xD;
        int n5 = 1;
        int n6 = 18;
        while (n5 >= 0) {
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n6);
            if (1 < 0) break;
            int n8 = a--;
            cArray[n8] = (char)(string2.charAt(n8) ^ n4);
            n5 = 1;
        }
        return new String(cArray);
    }

    public EntityRelationUtils() {
        EntityRelationUtils a;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean D(EntityPlayer entityPlayer, EntityPlayer entityPlayer2) {
        int a;
        EntityPlayer entityPlayer3 = entityPlayer;
int n = 1;
        while (n <= 4) {
            void a2;
            Integer n2 = EntityRelationUtils.L(entityPlayer3.getEquipmentInSlot(1));
            Integer n3 = EntityRelationUtils.L(a2.getEquipmentInSlot(1));
            if (n2 != null && n2.equals(n3)) {
                return 1 != 0;
            }
            n = ++a;
        }
        return false;
    }

    private static boolean d(EntityPlayer entityPlayer, EntityPlayer entityPlayer2) {
        EnumChatFormatting a;
        EntityPlayer entityPlayer3 = entityPlayer;
Object a2 = entityPlayer3.getDisplayName().getChatStyle().getColor();
        a = ((EntityPlayer)((Object)a)).getDisplayName().getChatStyle().getColor();
        if (a2 != null && a2 == a) {
            return 5 >> 2;
        }
        return false;
    }

    private static boolean L(EntityPlayer entityPlayer) {
        int a;
        EntityPlayer entityPlayer2 = entityPlayer;
int n = 1;
        while (n <= 4) {
            if (EntityRelationUtils.L(entityPlayer2.getEquipmentInSlot(1)) != null) {
                return --1 != 0;
            }
            n = ++a;
        }
        return false;
    }

    public static boolean L(EntityPlayer entityPlayer, EntityPlayer entityPlayer2) {
        EntityPlayer a = entityPlayer2;
        EntityPlayer a2 = entityPlayer;
if (a2 == null || a == null || a2 == a) {
            return false;
        }
        if (!EntityRelationUtils.L(a2)) {
            return 0 != 0;
        }
        if (a2.isOnSameTeam(a)) {
            return 1 != 0;
        }
        if (EntityRelationUtils.d(a2, a)) {
            return 1 != 0;
        }
        return EntityRelationUtils.D(a2, a);
    }
}

