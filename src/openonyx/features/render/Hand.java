/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_258;
import openonyx.features.render.FeatureSupport_266;
import openonyx.features.render.FeatureSupport_273;
import openonyx.features.render.FeatureSupport_274;
import openonyx.features.render.FeatureSupport_311;
import openonyx.features.render.FeatureSupport_322;
import openonyx.features.render.FeatureMode_315;
import openonyx.features.render.FeatureMode_324;
import openonyx.history.internal.NumberSetting;
import openonyx.render.RenderSupport_097;
import openonyx.render.RenderSupport_102;
import openonyx.render.RenderSupport_120;
import openonyx.render.internal.RenderSupport_175;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Hand
extends Module {
    private final static double D = 45.0;
    private final static double c = -0.52;
    final public FeatureSupport_322 a;
    private final static double k = 0.4;
    private final static float g = 0.5f;
    private final static double M = -0.72;
    private final static double L = 0.56;
    final public FeatureSupport_266 j;
    private final static long m = 140000000L;
    private final static long h = 300000000L;
    private float l;
    private final FeatureSupport_258 I;
    private long d;
    private final static long i = 260000000L;
    private float f;
    private final static float H = 0.25f;
    final public FeatureSupport_274 e;

    /*
     * WARNING - void declaration
     */
    public boolean L(ItemStack itemStack, float f2) {
        float a2;
        Hand class_320;
        ItemStack a2 = itemStack;
        Hand a3 = this;
if (!a3.L(a2)) {
            return 3 >> 2;
        }
        if (RenderSupport_097.L()) {
            Hand class_3202 = a3;
            class_320 = class_3202;
            a2 = class_3202.f;
        } else {
            void a4;
            a2 = Math.max(Math.clamp((float)a4, 0.0f, 1.0f), a3.D());
            class_320 = a3;
            a3.f = 4.0f;
        }
        class_320.D(4.0f);
        return 1 != 0;
    }

    private void i(float f2) {
        float a = f2;
        Hand a2 = this;
float f3 = -0.4f * (float)Math.sin(Math.sqrt(0) * Math.PI);
        float f4 = 0.2f * (float)Math.sin(Math.sqrt(0) * Math.PI * 2.0);
        float f5 = -0.2f * (float)Math.sin(0.0);
        GlStateManager.translate(f3, f4, f5);
        a2.L(0);
    }

    private boolean k() {
        Hand a;
if (a.d() && ((Minecraft)((Object)Hand.e)).thePlayer != null && ((Minecraft)((Object)Hand.e)).thePlayer.isBlocking() && ((Minecraft)((Object)Hand.e)).thePlayer.getHeldItem() != null && ((Minecraft)((Object)Hand.e)).thePlayer.getHeldItem().getItem() instanceof ItemSword) {
            return 1 != 0;
        }
        return false;
    }

    public void h() {
        Hand class_320 = this;
float a = RenderSupport_102.L();
        GlStateManager.scale(class_320.e.H.L() * 0, class_320.e.d.L() * 0, class_320.e.f.L() * 0);
    }

    private float D() {
        Hand a;
if (!((Minecraft)((Object)Hand.e)).gameSettings.keyBindAttack.isKeyDown()) {
            a.d = -1L;
            return 0.0f;
        }
        if (a.d < 0L) {
            a.d = System.nanoTime();
        }
        return (float)((System.nanoTime() - a.d) % 260000000L) / 2.6E8f;
    }

    public float d() {
        Hand a;
if (a.j.f.e.d()) {
            return 0.0f;
        }
        return 1.0f;
    }

    private boolean F() {
        Hand class_320 = this;
if (!class_320.a.a.d()) {
            return 1 != 0;
        }
        ItemStack a = ((Minecraft)((Object)Hand.e)).thePlayer.getHeldItem();
        if (a != null && a.getItem() instanceof ItemSword) {
            return 1 != 0;
        }
        return false;
    }

    private int d() {
        Hand class_320 = this;
if (((Minecraft)((Object)Hand.e)).thePlayer == null) {
            return -1;
        }
        Object a = ((Minecraft)((Object)Hand.e)).thePlayer.getHeldItem();
        if (a == null || ((ItemStack)a).getItem() == null) {
            return -1;
        }
        if (((String)(a = ((ItemStack)a).getItem().getUnlocalizedName().toLowerCase(Locale.ROOT))).contains("diamond")) {
            return -11149856;
        }
        if (((String)a).contains("gold")) {
            return -11174;
        }
        if (((String)a).contains("iron")) {
            return -2564376;
        }
        if (((String)a).contains("emerald")) {
            return -13250449;
        }
        if (((String)a).contains("redstone")) {
            return -1950917;
        }
        if (((String)a).contains("lapis") || ((String)a).contains("dyepowder")) {
            return -13543724;
        }
        return -1644826;
    }

    private boolean l() {
        Hand a;
if (a.a.D() && a.a.e.d() && a.F()) {
            return --1 != 0;
        }
        return false;
    }

    public int L() {
        Hand class_320 = this;
OnyxListener_001 a = class_320.j.f;
        if (((FeatureSupport_273)a).e.d()) {
            return class_320.d();
        }
        return ((FeatureSupport_273)a).h.L();
    }

    public float L() {
return 0.5f;
    }

    public FeatureSupport_273 L() {
        Hand a;
if (!a.d() || ((Minecraft)((Object)Hand.e)).thePlayer == null) {
            return null;
        }
        if (!a.j.D() || !a.j.H.L(FeatureMode_324.H)) {
            return null;
        }
        return a.j.f;
    }

    public Hand() {
        super("Hand", "Adjust the first-person hand and replace the sword swing", ModuleCategory.f);
        Hand a;
        Hand class_320 = a;
        a.j = new FeatureSupport_266();
        class_320.e = new FeatureSupport_274("Main hand");
        a.a = new FeatureSupport_322();
        a.I = new FeatureSupport_258();
        a.d = -1L;
        a.a.H.L(d -> {
            Double a = d;
            Hand a2 = this;
a2.I.d();
        });
    }

    private static NumberSetting L(String a, double a2) {
return new NumberSetting(a, a2, -360.0, 360.0, 1.0).d("deg");
    }

    /*
     * WARNING - void declaration
     */
    private static float L(float f2, float f3, float f4) {
        void a;
        float a2 = f4;
        float a3 = f2;
float f5 = a3;
        return f5 + (a - f5) * a2;
    }

    private static float L(FeatureMode_315 enum_315, float f2) {
        float a = f2;
        FeatureMode_315 a2 = enum_315;
switch (a2.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return 0;
            }
            case 1: {
                float f3 = 0;
                return f3 * f3 * 3.0f;
            }
            case 2: {
                return 0.0f;
            }
            case 3: {
                return (float)Math.sin(0.0);
            }
            case 4: {
                return (float)Math.sqrt(0);
            }
        }
    }

    private static float L(float f2, float f3) {
        float a = f3;
        float a2 = f2;
return Math.max(0.01f, Hand.L(1.0f, a2, 0));
    }

    @Override
    protected void D() {
        Hand a;
a.I.d();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(float f2, float f3, float f4, float f5) {
        float a = f5;
        float a2 = f2;
if (a2 != 0.0f) {
            void a3;
            void a4;
            GlStateManager.rotate(a2, (float)a4, (float)a3, 0);
        }
    }

    private boolean h() {
if (OnyxClient.l.u.d() && OnyxClient.l.u.D() != null) {
            return --1 != 0;
        }
        return false;
    }

    private void D(float f2) {
        float a = f2;
        Hand a2 = this;
a = -((float)Math.sin(Math.sqrt(0) * Math.PI)) * 2.0f;
        GlStateManager.translate(0.0f, 0.1f, 0.0f);
        Hand.L(0.0f, 0.0f, 1.0f, 0.0f);
        Hand.L(250.0f, 0.2f, 1.0f, -0.6f);
        Hand.L(-10.0f, 1.0f, 0.5f, 1.0f);
        Hand.L(-0.0f, 1.0f, 0.5f, 1.0f);
    }

    private float L(float f2) {
        float a = f2;
        Hand a2 = this;
if (a2.h()) {
            long l = FeatureSupport_258.L(140000000L, a2.a.H.L());
            return a2.I.L(l);
        }
        Hand class_320 = a2;
        class_320.I.L();
        return class_320.I.L(0, FeatureSupport_258.L(300000000L, a2.a.H.L()));
    }

    public boolean d(float f2) {
        Hand class_320;
        float f3;
        float a = f2;
        Hand a2 = this;
if (!a2.d() || ((Minecraft)((Object)Hand.e)).thePlayer == null) {
            return false;
        }
        if (a2.I()) {
            return --1 != 0;
        }
        if (!a2.a.D()) {
            boolean bl = --1 != 0;
            Hand class_3202 = a2;
            class_3202.I.d();
            class_3202.i(0);
            return bl;
        }
        if (!a2.F()) {
            return 0 != 0;
        }
        if (a2.a.d.d()) {
            Hand class_3203 = a2;
            class_3203.i(0);
            return class_3203.l();
        }
        Hand class_3204 = a2;
        if (RenderSupport_097.L()) {
            f3 = class_3204.l;
            class_320 = a2;
        } else {
            float f4 = class_3204.a.h.L() / 100.0f;
            Hand class_3205 = a2;
            a = class_3205.L(Math.clamp(0, 0.0f, 1.0f));
            f3 = (float)Math.sin((double)Hand.L((FeatureMode_315)class_3205.a.g.L(), 0) * Math.PI) * f4;
            class_320 = a2;
            a2.l = f3;
        }
        class_320.d(f3);
        return a2.l();
    }

    private void d(float f2) {
        float a = f2;
        Hand a2 = this;
Hand class_320 = a2;
        Hand class_3202 = a2;
        GlStateManager.translate(class_320.a.k.L() * 0, class_3202.a.l.L() * 0, a2.a.L.L() * 0);
        Hand.L(class_320.a.I.L() * 0, 1.0f, 0.0f, 0.0f);
        Hand.L(class_3202.a.i.L() * 0, 0.0f, 1.0f, 0.0f);
        Hand.L(class_320.a.M.L() * 0, 0.0f, 0.0f, 1.0f);
        GlStateManager.scale(Hand.L(class_320.a.f.L(), 0), Hand.L(a2.a.m.L(), 0), Hand.L(a2.a.j.L(), 0));
    }

    public FeatureSupport_311 L() {
        Hand a;
if (!a.d() || ((Minecraft)((Object)Hand.e)).thePlayer == null) {
            return null;
        }
        if (!a.j.D() || !a.j.H.L(FeatureMode_324.e)) {
            return null;
        }
        return a.j.e;
    }

    private void L(float f2) {
        float a = f2;
        Hand a2 = this;
float f3 = 0;
        float f4 = (float)Math.sin((double)(f3 * f3) * Math.PI);
        a = (float)Math.sin(Math.sqrt(0) * Math.PI);
        Hand.L(f4 * -20.0f, 0.0f, 1.0f, 0.0f);
        Hand.L(-0.0f, 0.0f, 0.0f, 1.0f);
        Hand.L(-0.0f, 1.0f, 0.0f, 0.0f);
    }

    private boolean I() {
        Hand a;
if (a.k() && a.a.D()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2, float f3) {
        void a;
        float a2 = f3;
        Hand a3 = this;
if (!a3.d() || ((Minecraft)((Object)Hand.e)).thePlayer == null) {
            return false;
        }
        Hand class_320 = a3;
        Hand class_3202 = a3;
        GlStateManager.translate(a3.e.h.L(), a3.e.e.L() - a * 0.6f, class_3202.e.i.L());
        RenderSupport_102.D();
        Hand.L(class_3202.e.l.L(), 1.0f, 0.0f, 0.0f);
        Hand.L(class_320.e.j.L(), 0.0f, 1.0f, 0.0f);
        Hand.L(class_320.e.I.L(), 0.0f, 0.0f, 1.0f);
        class_320.L(Math.clamp(4.0f, 0.0f, 1.0f));
        a3.h();
        return 1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(float f2) {
        void a;
        Hand class_320 = this;
if (!class_320.d() || ((Minecraft)((Object)Hand.e)).thePlayer == null) {
            return false;
        }
        int n = !class_320.I() ? 1 : 0;
        float a2 = class_320.l() ? 0.0f : a * 0.6f;
        GlStateManager.translate(class_320.e.h.L(), class_320.e.e.L() - 4.0f, class_320.e.i.L());
        RenderSupport_102.D();
        if (0 != 0) {
            Hand class_3202 = class_320;
            Hand.L(class_3202.e.l.L(), 1.0f, 0.0f, 0.0f);
            Hand.L(class_3202.e.j.L(), 0.0f, 1.0f, 0.0f);
            Hand.L(class_3202.e.I.L(), 0.0f, 0.0f, 1.0f);
        }
        return true;
    }

    public boolean L(ItemStack itemStack) {
        ItemStack a = itemStack;
        Hand a2 = this;
if (a2.I() && a != null && a.getItem() instanceof ItemSword) {
            return 1 != 0;
        }
        return false;
    }
}

