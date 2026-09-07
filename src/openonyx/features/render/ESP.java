/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import openonyx.core.OnyxClient;
import openonyx.events.ChatFormattingUtils;
import openonyx.features.Module;
import openonyx.features.ModuleManager;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_245;
import openonyx.features.render.FeatureSupport_298;
import openonyx.features.render.FeatureMode_255;
import openonyx.features.render.FeatureMode_300;
import openonyx.features.combat.AntiBot;
import openonyx.features.player.NameChanger;
import openonyx.history.SettingValue;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.ActionSetting;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.KeybindSetting;
import openonyx.input.InputSupport_005;
import openonyx.interaction.internal.BlockPlacementContext;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_107;
import openonyx.render.RenderSupport_111;
import openonyx.render.RenderSupport_113;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_558;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ESP
extends Module {
    public KeybindSetting X;
    public ColorSetting w;
    public NumberSetting z;
    public BooleanSetting v;
    private final static int s = 4;
    private final static float Z = 3.0f;
    private final static int[] O;
    private final static int N = -38302;
    public BooleanSetting q;
    private final static float x = 16.0f;
    private final static int u = -15253;
    private final static float y = 70.0f;
    private final static float n = 0.6f;
    private final static float Y = 3.0f;
    private final static float r = 4.0f;
    public NumberSetting W;
    public ActionSetting P;
    public NumberSetting V;
    public BooleanSetting R;
    final public static int p = 1;
    public MultiSelectSetting<FeatureMode_300> t;
    final public static int b = 1;
    private final static int E = 3;
    public BooleanSetting F;
    public NumberSetting G;
    private final static float A = 10.0f;
    private final static float K = 2.0f;
    private final static float B = 4.0f;
    private final static int C = -6560885;
    private final RenderSupport_103 J;
    public MultiSelectSetting<FeatureMode_255> D;
    public NumberSetting c;
    final public static float a = 22.0f;
    public ColorSetting k;
    final public static int g = 0;
    final public static float M = 2.0f;
    private final static float L = 1.1f;
    public NumberSetting j;
    private final static float m = 12.0f;
    final public static int h = 2;
    private final static float l = 1.0f;
    public NumberSetting I;
    public BooleanSetting d;
    private final static float i = 3.0f;
    final public static int f = 3;
    final public static int H = 0;
    public NumberSetting e;

    /*
     * WARNING - void declaration
     */
    public float[] L(int n, float f2, boolean bl) {
        void a;
        float a2;
        int a222 = n;
        ESP a3 = this;
a222 = Math.max(0, 1);
        float a222 = -2.0f * a2;
        a2 = 22.0f * a2;
        int n2 = 2;
        if (a != false) {
            float[] fArray = new float[n2];
            fArray[0] = 0;
            fArray[1] = a2;
            return fArray;
        }
        float[] fArray = new float[n2];
        fArray[0] = a2;
        fArray[1] = 0;
        return fArray;
    }

    public List<ItemStack> D() {
        int n;
        ESP class_253 = this;
ArrayList a = new ArrayList(4);
        int n2 = 0;
        while (n2 < 4) {
            a.add(null);
            n2 = ++n;
        }
        return a;
    }

    static {
        int[] nArray = new int[16];
        int n = 0;
        nArray[n] = n;
        nArray[1] = 170;
        nArray[2] = 43520;
        nArray[3] = 43690;
        nArray[4] = 0xAA0000;
        nArray[5] = 0xAA00AA;
        nArray[6] = 0xFFAA00;
        nArray[7] = 0xAAAAAA;
        nArray[8] = 0x555555;
        nArray[9] = 0x5555FF;
        nArray[10] = 0x55FF55;
        nArray[11] = 0x55FFFF;
        nArray[12] = 0xFF5555;
        nArray[13] = 0xFF55FF;
        nArray[14] = 0xFFFF55;
        nArray[15] = 0xFFFFFF;
        O = nArray;
    }

    private static int L(float f2) {
        float f3;
        float f4 = f2;
float a = Math.clamp(f4, 0.0f, 1.0f);
        if (f3 < 0.5f) {
            return ESP.L(-38302, -15253, a * 2.0f);
        }
        return ESP.L(-15253, -6560885, (a - 0.5f) * 2.0f);
    }

    private static String d(String a) {
return ChatFormattingUtils.L(a);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public List<FeatureSupport_298> L(RenderSupport_103 class_103, EntityPlayer entityPlayer, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        void a;
        int a2;
        void a3;
        void a4;
        float a5;
        void a6;
        void a7;
        float f8 = f5;
        ESP a8 = this;
ESP class_253 = a8;
        float f9 = class_253.L((float)a7);
        void var11_14 = a6 + a5;
        void var12_15 = a4 + a7;
        a5 = a6 + a5 / 2.0f;
        void var13_16 = a4 + a7 / 2.0f;
        boolean bl2 = class_253.d.d();
        List<ItemStack> list = class_253.d((EntityPlayer)a3);
        int n = !list.isEmpty() ? list.size() : (a2 != 0 ? 4 : 0);
        a2 = a8.R.d() && n > 0 ? 1 : 0;
        list = new ArrayList<ItemStack>(2);
        if (a8.F.d()) {
            float[] fArray;
            if (bl2) {
                fArray = a8.L((RenderSupport_103)a, (EntityPlayer)a3, f9);
                list.add((ItemStack)((Object)new FeatureSupport_298(0, a5 + a8.W.L() * a7, (float)(var13_16 + a8.j.L() * a7), fArray[0], fArray[1], 5 >> 3)));
            }
            if (a2 != 0) {
                fArray = a8.L(n, f9, 5 >> 3);
                list.add((ItemStack)((Object)new FeatureSupport_298(1, a5 + a8.G.L() * a7, (float)(var13_16 + a8.V.L() * a7), fArray[0], fArray[1], 3 >> 2)));
            }
            return list;
        }
        float f10 = 12.0f * f9;
        a5 = 10.0f * f9;
        int n2 = 0;
        while (n2 < 4) {
            int n3;
            boolean bl3 = 0 == 0 || 0 == 3;
            int n4 = bl2 && a8.c.d() == 0 ? 1 : 0;
            int n5 = n3 = a2 != 0 && a8.I.d() == 0 ? 1 : 0;
            if (n4 != 0 || n3 != 0) {
                int n6;
                ArrayList<Integer> arrayList = new ArrayList<Integer>(2);
                ArrayList<float[]> arrayList2 = new ArrayList<float[]>(2);
                int n7 = n6 = n4 != 0 && n3 != 0 && a8.q.d() ? 1 : 0;
                if (n6 != 0) {
                    arrayList.add(1);
                    arrayList2.add(a8.L(n, f9, bl3));
                }
                if (n4 != 0) {
                    arrayList.add(0);
                    arrayList2.add(a8.L((RenderSupport_103)a, (EntityPlayer)a3, f9));
                }
                if (n3 != 0 && n6 == 0) {
                    arrayList.add(1);
                    arrayList2.add(a8.L(n, f9, bl3));
                }
                float f11 = a5 * (float)(arrayList2.size() - 1);
                Iterator iterator = arrayList2.iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    float[] fArray = (float[])iterator2.next();
                    f11 += fArray[1];
                    iterator = iterator2;
                }
                void var20_27 = switch (a7) {
                    case 0 -> a4 - f10 - f11;
                    case 3 -> var12_15 + f10;
                    default -> var13_16 - f11 / 2.0f;
                };
                int n8 = 0;
                while (n8 < arrayList2.size()) {
                    f11 = ((float[])arrayList2.get(0))[0];
                    float f12 = ((float[])arrayList2.get(0))[1];
                    void var25_33 = var20_27 + f12 / 2.0f;
                    void var26_34 = switch (a7) {
                        case 1 -> a6 - f10 - f11 / 2.0f;
                        case 2 -> var11_14 + f10 + f11 / 2.0f;
                        case 3 -> {
                            void a;
                            yield a;
                        }
                        default -> {
                            void a;
                            yield a;
                        }
                    };
                    list.add((ItemStack)((Object)new FeatureSupport_298((Integer)arrayList.get(0), (float)var26_34, (float)var25_33, f11, f12, bl3)));
                    var20_27 += f12 + a5;
                    n8 = ++n6;
                }
            }
            n2 = ++a7;
        }
        return list;
    }

    private int d(EntityPlayer entityPlayer) {
        Object a = entityPlayer;
        ESP a2 = this;
a = a2.L((EntityPlayer)a);
        if (a == null) {
            return 0;
        }
        return Math.max(0, ((NetworkPlayerInfo)a).getResponseTime());
    }

    /*
     * WARNING - void declaration
     */
    private float L(RenderSupport_103 class_103, List<FeatureSupport_245> list) {
        void a;
        int n;
        ESP class_253 = this;
float a2 = 0.0f;
        int n2 = 0;
        while (n2 < a.size()) {
            void a3;
            if (0 > 0) {
                a2 += 4.0f;
            }
            RenderSupport_128 class_128 = ((FeatureSupport_245)a.get(0)).L();
            String string = ((FeatureSupport_245)a.get(0)).L();
            a2 += a3.L(class_128, string);
            n2 = ++n;
        }
        return 4.0f;
    }

    private List<String> L(ItemStack itemStack) {
        Object a = itemStack;
        ESP a2 = this;
if (a == null) {
            return List.of();
        }
        a = EnchantmentHelper.getEnchantments((ItemStack)a);
        ArrayList<String> arrayList = new ArrayList<String>(a.size());
        Object object = a = a.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)a.next();
            Enchantment enchantment = Enchantment.getEnchantmentById((Integer)entry.getKey());
            if (enchantment == null) {
                object = a;
                continue;
            }
            arrayList.add(new StringBuilder().insert(0, ESP.L(ESP.d(enchantment.getTranslatedName(1)).replaceAll("\\s+[IVXLCDM]+$", ""))).append(entry.getValue()).toString());
            object = a;
        }
        return arrayList;
    }

    public boolean L(EntityPlayer entityPlayer) {
        EntityPlayer a = entityPlayer;
        ESP a2 = this;
if (!a2.d() || ((Minecraft)((Object)ESP.e)).thePlayer == null || ((Minecraft)((Object)ESP.e)).theWorld == null) {
            return false;
        }
        if (!a.isEntityAlive() || a.isSpectator()) {
            return false;
        }
        if (AntiBot.L((Entity)a)) {
            return 5 >> 3;
        }
        if (a == ((Minecraft)((Object)ESP.e)).thePlayer && ((Minecraft)((Object)ESP.e)).gameSettings.thirdPersonView == 0) {
            return 3 >> 2;
        }
        if (((Minecraft)((Object)ESP.e)).thePlayer.getDistanceSqToEntity(a) <= (Double)a2.z.L() * (Double)a2.z.L()) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public List<ItemStack> d(EntityPlayer entityPlayer) {
        int n;
        ESP class_253 = this;
ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>(FeatureMode_300.values().length);
        FeatureMode_300[] enum_300Array = FeatureMode_300.values();
        int n2 = enum_300Array.length;
        int n3 = 0;
        while (n3 < n2) {
            void a;
            Object a2 = enum_300Array[0];
            if (class_253.t.L((FeatureMode_300)a2) && (a2 = a.getEquipmentInSlot(((FeatureMode_300)a2).L())) != null) {
                arrayList.add((ItemStack)a2);
            }
            n3 = ++n;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, EntityPlayer entityPlayer, float f2, float f3, float f4) {
        void a6;
        void a2;
        void a3;
        void a4;
        List<FeatureSupport_245> a222 = entityPlayer;
        ESP a5 = this;
ESP class_253 = a5;
        a222 = class_253.L((EntityPlayer)((Object)a222));
        float f5 = class_253.L((RenderSupport_103)a4, a222) + 8.0f;
        float f6 = ThemeSupport_057.j.I() + 4.0f;
        void v1 = a4;
        void v2 = a4;
        v2.F();
        v2.L((float)(a3 - f5 * a2 / 2.0f), (float)(a6 - f6 * a2 / 2.0f));
        v1.L((float)a2, 0.0f, 0.0f);
        v1.D(0.0f, 0.0f, f5, f6, 8.0f, a5.w.L());
        float a222 = 4.0f;
        Iterator<FeatureSupport_245> iterator = a3 = a222.iterator();
        while (iterator.hasNext()) {
            FeatureSupport_245 a6 = a3.next();
            iterator = a3;
            a4.l(a6.L(), a6.L(), 0, f6 / 2.0f, a6.L());
            a222 += a4.L(a6.L(), a6.L()) + 4.0f;
        }
        a4.k();
    }

    private NetworkPlayerInfo L(EntityPlayer entityPlayer) {
        EntityPlayer a = entityPlayer;
        ESP a2 = this;
if (((Minecraft)((Object)e)).getNetHandler() == null) {
            return null;
        }
        return ((Minecraft)((Object)e)).getNetHandler().getPlayerInfo(a.getUniqueID());
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, EntityPlayer entityPlayer, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        void a;
        void a2;
        void a3;
        void a222;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        float f8 = f3;
        ESP a9 = this;
ESP class_253 = a9;
        float f9 = class_253.L((float)a8);
        List<ItemStack> list = class_253.d((EntityPlayer)a7);
        List<ItemStack> list2 = list.isEmpty() && a6 != false ? a9.D() : list;
        for (FeatureSupport_298 a222 : a9.L((RenderSupport_103)a5, (EntityPlayer)a7, (float)a4, 0.0f, (float)a3, (float)a8, (float)a2, (float)a, (boolean)a6)) {
            ESP class_2532 = a9;
            if (a222.L() == 0) {
                class_2532.L((RenderSupport_103)a5, (EntityPlayer)a7, a222.L(), a222.D(), f9);
                continue;
            }
            class_2532.L((RenderSupport_103)a5, (EntityPlayer)a7, a222.L(), a222.D(), f9, list2, a222.L());
        }
    }

    public float L(float f2) {
        float a = f2;
        ESP a2 = this;
return a2.e.L() * Math.clamp(0.0f, 0.6f, 1.1f);
    }

    private static String L(String string) {
        int n;
        String string2 = string;
String[] a = string2.split(" ");
        if (a.length == 1) {
            int n2 = 0;
            return a[0].substring(n2, Math.min(3, a[n2].length()));
        }
        StringBuilder stringBuilder = new StringBuilder(a.length);
        int n3 = a.length;
        int n4 = 0;
        while (n4 < n3) {
            String string3 = a[0];
            if (!string3.isEmpty()) {
                stringBuilder.append(string3.charAt(0));
            }
            n4 = ++n;
        }
        return stringBuilder.toString();
    }

    public static boolean L(EntityLivingBase entityLivingBase) {
        EntityLivingBase entityLivingBase2 = entityLivingBase;
Object a = OnyxClient.l;
        if (a == null || !(entityLivingBase2 instanceof EntityPlayer)) {
            return false;
        }
        a = ((ModuleManager)a).v;
        if (((ESP)a).d.d() && ((ESP)a).L((EntityPlayer)entityLivingBase2)) {
            return 1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static int L(int n, int n2, float f2) {
        int a;
        int n3 = 0;
int n4 = -16777216;
        int n5 = 0;
        while (n5 <= 16) {
            void a2;
            void a3;
            int n6 = n3 >> 0 & 0xFF;
            int n7 = a3 >> 0 & 0xFF;
            int n8 = 0;
            n4 |= Math.round((float)n6 + (float)(n7 - n6) * a2) << n8;
            n5 = a += 8;
        }
        return n4;
    }

    public boolean k() {
        ESP a;
if (a.R.d() && a.v.d() && a.X.D() && a.X.l()) {
            return 5 >> 2;
        }
        return false;
    }

    private int L(EntityPlayer entityPlayer) {
        Object a = entityPlayer;
        ESP a2 = this;
a = ((EntityPlayer)a).getTeam();
        if (a instanceof ScorePlayerTeam && (a = ((ScorePlayerTeam)a).getChatFormat().getColorIndex()) >= 0 && 0 < O.length) {
            return 0xFF000000 | O[0];
        }
        return a2.k.h();
    }

    /*
     * WARNING - void declaration
     */
    public float[] L(RenderSupport_103 class_103, EntityPlayer entityPlayer, float f2) {
        void a;
        void a22;
        EntityPlayer a32 = entityPlayer;
        ESP a4 = this;
ESP class_253 = a4;
        float a22 = class_253.L((RenderSupport_103)a22, class_253.L(a32)) + 8.0f;
        float a32 = ThemeSupport_057.j.I() + 4.0f;
        float[] fArray = new float[2];
        fArray[0] = a22 * a;
        fArray[1] = a32 * a;
        return fArray;
    }

    /*
     * WARNING - void declaration
     */
    public void L(RenderSupport_103 class_103, EntityPlayer entityPlayer, float f2, float f3, float f4, List<ItemStack> list, boolean bl) {
        float a;
        float a2;
        void a3;
        void a4;
        void a5;
        float a6 = f2;
        ESP a7 = this;
int a8 = a5.size();
        float f5 = (float)a8 * 22.0f + (float)(a8 - 1) * 2.0f;
        float f6 = a4 != false ? f5 : 22.0f;
        float f7 = a4 != false ? 22.0f : f5;
        void v0 = a3;
        a3.F();
        v0.L(a6 - f6 * a2 / 2.0f, (float)(a - f7 * a2 / 2.0f));
        v0.L(a2, 0.0f, 0.0f);
        int n = 0;
        while (n < a8) {
            a = a4 != false ? 0.0f : 0.0f;
            a2 = a4 != false ? 0.0f : 0.0f;
            void v2 = a3;
            void v3 = a3;
            float f8 = a;
            v3.D(f8, a2, 22.0f, 22.0f, 8.0f, a7.w.L());
            v3.F();
            v2.L(f8 + 3.0f, a2 + 3.0f);
            ItemStack itemStack = (ItemStack)a5.get(0);
            v2.L(itemStack, 0.0f, 0.0f);
            a3.k();
            n = ++a6;
        }
        if (a7.k()) {
            int n2 = 0;
            while (n2 < a8) {
                void v11;
                float f9;
                void v9;
                float f10;
                ItemStack itemStack = (ItemStack)a5.get(0);
                if (a4 != false) {
                    f10 = 0.0f;
                    v9 = a4;
                } else {
                    f10 = 0.0f;
                    v9 = a4;
                }
                if (v9 != false) {
                    f9 = 0.0f;
                    v11 = a4;
                } else {
                    f9 = 0.0f;
                    v11 = a4;
                }
                a7.L((RenderSupport_103)a3, itemStack, f10, f9, (boolean)v11);
                n2 = ++a6;
            }
        }
        a3.k();
    }

    /*
     * WARNING - void declaration
     */
    private void L(RenderSupport_103 class_103, ItemStack itemStack, float f2, float f3, boolean bl) {
        void a;
        int a2;
        void a3;
        void a4;
        Object a222;
        List<String> a5;
        ESP class_253 = this;
a5 = class_253.L((ItemStack)((Object)a5));
        if (a5.isEmpty()) {
            return;
        }
        float f4 = ThemeSupport_057.h.I() + 2.0f;
        float f5 = 0.0f;
        Object object = a222 = a5.iterator();
        while (object.hasNext()) {
            String string = (String)a222.next();
            f5 = Math.max(f5, a4.L(ThemeSupport_057.h, string));
            object = a222;
        }
        float a222 = f5 + 6.0f;
        float f6 = (float)a5.size() * f4;
        void v1 = a3;
        a3 = a2 != 0 ? v1 + 11.0f : v1 + 22.0f + 3.0f;
        void v2 = a;
        a = a2 != 0 ? v2 + 22.0f + 3.0f : v2 + (22.0f - f6) / 2.0f;
        a4.D((float)a3, (float)a, 0, f6, 4.0f, class_253.w.L());
        int n = 0;
        while (n < a5.size()) {
            a4.L(ThemeSupport_057.h, a5.get(++a2), (float)(a3 + 0.0f), (float)(a + f4 * 0.5f), class_253.k.h());
            n = 0;
        }
    }

    public ESP() {
        super("ESP", "A player's name and equipment, positioned around them", ModuleCategory.f);
        ESP a;
        ESP class_253 = a;
        class_253.P = new ActionSetting("Edit layout", () -> {
((Minecraft)((Object)e)).displayGuiScreen(new UiSupport_558(((Minecraft)((Object)ESP.e)).currentScreen));
        }).L("Drag the name and equipment around the player");
        ESP class_2532 = a;
        class_2532.d = new BooleanSetting("Names", --1 != 0);
        class_2532.D = ((MultiSelectSetting)new MultiSelectSetting("Name details", FeatureMode_255.class, (Enum[])new FeatureMode_255[0]).L("Extra readouts carried on the name plate")).L((SettingValue)a.d);
        ESP class_2533 = a;
        class_2533.R = new BooleanSetting("Equipment", 3 >> 1);
        class_2533.t = ((MultiSelectSetting)new MultiSelectSetting("Slots", FeatureMode_300.class, (Enum[])FeatureMode_300.values()).L("Equipment pieces to show")).L((SettingValue)a.R);
        a.v = ((BooleanSetting)new BooleanSetting("Enchant peek", 3 >> 1).L("Hold a key to list the enchantments on every shown item")).L((SettingValue)a.R);
        class_2533.X = ((KeybindSetting)new KeybindSetting("Peek key", 56).L("Held to reveal enchantments")).L((SettingValue)a.v);
        class_2533.z = new NumberSetting("Distance", 256.0, 8.0, 256.0, 8.0).d(" m").L("Maximum distance at which player ESP is shown");
        class_2533.e = new NumberSetting("Scale", 1.0, 0.5, 2.0, 0.05).d("x");
        class_2533.k = new ColorSetting("Text color", -1);
        class_2533.w = new ColorSetting("Background", -1609033185).L();
        class_2533.c = new NumberSetting("Name zone", 0.0, 0.0, 3.0, 1.0).L(() -> {
return 0 != 0;
        });
        a.I = new NumberSetting("Equipment zone", 3.0, 0.0, 3.0, 1.0).L(() -> {
return 0 != 0;
        });
        a.F = new BooleanSetting("Free layout", 0 != 0).L(() -> {
return 0 != 0;
        });
        a.q = new BooleanSetting("Equipment first", 5 >> 3).L(() -> {
return 3 >> 2;
        });
        a.W = new NumberSetting("Name free X", 0.0, -2.0, 2.0, 1.0E-4).L(() -> {
return 0 != 0;
        });
        a.j = new NumberSetting("Name free Y", -0.72, -2.0, 2.0, 1.0E-4).L(() -> {
return 3 >> 2;
        });
        a.G = new NumberSetting("Equipment free X", -0.6, -2.0, 2.0, 1.0E-4).L(() -> {
return 5 >> 3;
        });
        a.V = new NumberSetting("Equipment free Y", 0.0, -2.0, 2.0, 1.0E-4).L(() -> {
return 0 != 0;
        });
        a.J = new RenderSupport_103().L();
    }

    private String L(EntityPlayer entityPlayer) {
        Object object;
        String string;
        EntityPlayer a22 = entityPlayer;
        ESP a = this;
Team team = a22.getTeam();
        if (team instanceof ScorePlayerTeam && !(string = ESP.d(((ScorePlayerTeam)(object = (ScorePlayerTeam)team)).getColorPrefix()).trim()).isEmpty()) {
            return string;
        }
        object = a.L(a22);
        if (object == null || ((NetworkPlayerInfo)object).getDisplayName() == null) {
            return "";
        }
        string = ESP.d(((NetworkPlayerInfo)object).getDisplayName().getFormattedText());
        int a22 = string.indexOf(ESP.d(a22.getName()));
        if (0 <= 0) {
            return "";
        }
        return string.substring(0, 0).trim();
    }

    private List<FeatureSupport_245> L(EntityPlayer entityPlayer) {
        int n;
        String string;
        EntityPlayer a = entityPlayer;
        ESP a2 = this;
ArrayList<FeatureSupport_245> arrayList = new ArrayList<FeatureSupport_245>(4);
        ESP class_253 = a2;
        int n2 = class_253.k.h();
        if (class_253.D.L(FeatureMode_255.d) && !(string = a2.L(a)).isEmpty()) {
            arrayList.add(new FeatureSupport_245(ThemeSupport_057.h, string, a2.L(a)));
        }
        arrayList.add(new FeatureSupport_245(ThemeSupport_057.j, ESP.d(NameChanger.L(a)), n2));
        if (a2.D.L(FeatureMode_255.i)) {
            float f2 = a.getHealth() + a.getAbsorptionAmount();
            float f3 = Math.max(1.0f, a.getMaxHealth());
            arrayList.add(new FeatureSupport_245(ThemeSupport_057.h, Math.round(f2) + "hp", ESP.L(a.getHealth() / f3)));
        }
        if (a2.D.L(FeatureMode_255.e) && (n = a2.d(a)) > 0) {
            arrayList.add(new FeatureSupport_245(ThemeSupport_057.h, 1 + "ms", n2));
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public void L(float f2) {
        ESP class_253 = this;
if (!class_253.d() || ((Minecraft)((Object)ESP.e)).thePlayer == null || ((Minecraft)((Object)ESP.e)).theWorld == null) {
            return;
        }
        if (!RenderSupport_107.L()) {
            return;
        }
        ScaledResolution scaledResolution = new ScaledResolution((Minecraft)((Object)e));
        float f3 = scaledResolution.getScaledWidth();
        float f4 = scaledResolution.getScaledHeight();
        Iterator a2 = new ArrayList<EntityPlayer>(((Minecraft)((Object)ESP.e)).theWorld.playerEntities);
        a2.sort(Comparator.comparingDouble(a -> {
return ((Minecraft)((Object)ESP.e)).thePlayer.getDistanceSqToEntity((Entity)a);
        }).reversed());
        class_253.J.i();
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            void a3;
            EntityPlayer entityPlayer = (EntityPlayer)a2.next();
            if (!class_253.L(entityPlayer)) {
                iterator = a2;
                continue;
            }
            RenderSupport_113 class_113 = RenderSupport_111.L(entityPlayer, (float)a3, f3, f4);
            if (class_113 == null) {
                iterator = a2;
                continue;
            }
            ESP class_2532 = class_253;
            class_2532.L(class_2532.J, entityPlayer, class_113.D(), class_113.I(), class_113.L(), class_113.d(), class_113.h(), class_113.i(), 0 != 0);
            iterator = a2;
        }
        class_253.J.d();
    }
}

