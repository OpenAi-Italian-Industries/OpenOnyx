/*
 * Decompiled with CFR.
 */
package openonyx.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.events.TargetType;
import openonyx.features.render.FeatureSupport_237;
import openonyx.features.render.Chams;
import openonyx.features.player.internal.FeatureSupport_419;
import openonyx.interaction.internal.PlacementResult;
import openonyx.render.group_p.RenderSupport_166;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_110
implements OnyxListener_001 {
    private static float j;
    private static boolean m;
    private static boolean h;
    private static boolean l;
    private static RenderSupport_166 I;
    private static float d;
    private static float i;
    private static boolean f;
    private static float H;
    private static float e;

    public static void d() {
if (!h) {
            return;
        }
        h = false;
        RenderSupport_166.L();
        GlStateManager.enableDepth();
        GlStateManager.depthMask(--1 != 0);
        GlStateManager.disableBlend();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.resetColor();
    }

    public static boolean d() {
if (!h || !f) {
            return false;
        }
        GlStateManager.disableDepth();
        GlStateManager.depthMask(3 >> 2);
        I.L("uTint", i, e, j, d);
        return 1 != 0;
    }

    public static boolean L(Entity entity) {
        Entity entity2 = entity;
if (!(entity2 instanceof EntityLivingBase)) {
            return false;
        }
        Object a = (EntityLivingBase)entity2;
        if (!RenderSupport_110.L()) {
            return 5 >> 3;
        }
        Chams class_284 = OnyxClient.l.f;
        if ((a = class_284.L((EntityLivingBase)a)) != null && class_284.L((TargetType)((Object)a))) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean L(EntityLivingBase entityLivingBase) {
        EntityLivingBase entityLivingBase2 = entityLivingBase;
if (!m || OnyxClient.l == null) {
            return false;
        }
        if (!OpenGlHelper.shadersSupported) {
            return 0 != 0;
        }
        Chams class_284 = OnyxClient.l.f;
        Object a = class_284.L(entityLivingBase2);
        if (a == null) {
            return 3 >> 2;
        }
        if (!l) {
            l = 1;
            I = RenderSupport_166.L("onyx_chams");
        }
        if (I == null || !I.L()) {
            m = false;
            return 0 != 0;
        }
        Chams class_2842 = class_284;
        FeatureSupport_237 class_237 = class_2842.L((TargetType)((Object)a));
        int n = class_2842.L((TargetType)((Object)a));
        i = (float)ThemeSupport_064.i(0) / 255.0f;
        e = (float)ThemeSupport_064.D(0) / 255.0f;
        j = (float)ThemeSupport_064.L(0) / 255.0f;
        H = (float)ThemeSupport_064.d(0) / 255.0f;
        f = class_2842.L((TargetType)((Object)a));
        d = H * class_284.L((TargetType)((Object)a));
        GlStateManager.enableBlend();
        int n2 = 771;
        GlStateManager.tryBlendFuncSeparate(770, n2, 1, n2);
        GlStateManager.depthMask(5 >> 2);
        I.d();
        I.L("Sampler0", 0);
        I.L("Sampler1", 1);
        I.L("uTint", i, e, j, H);
        I.L("uStyle", class_237.f.L() / 100.0f, 0.0f, 0.0f, class_284.d((TargetType)((Object)a)));
        I.L("uFogEnabled", GL11.glIsEnabled(2912) ? 1.0f : 0.0f);
        h = 1;
        return 1 != 0;
    }

    public static void L() {
GlStateManager.enableDepth();
        GlStateManager.depthMask(--1 != 0);
        I.L("uTint", i, e, j, H);
    }

    private RenderSupport_110() {
        RenderSupport_110 a;
    }

    static {
        m = 1;
    }

    public static boolean L() {
        int n;
if (!m || OnyxClient.l == null) {
            return false;
        }
        if (!OpenGlHelper.shadersSupported) {
            return 0 != 0;
        }
        Chams class_284 = OnyxClient.l.f;
        if (!class_284.d()) {
            return 5 >> 3;
        }
        TargetType[] enum_527Array = TargetType.values();
        int n2 = enum_527Array.length;
        int n3 = 0;
        while (n3 < n2) {
            TargetType enum_527 = enum_527Array[0];
            if (class_284.L(enum_527).D() && class_284.L(enum_527)) {
                return 3 >> 1;
            }
            n3 = ++n;
        }
        return false;
    }
}

