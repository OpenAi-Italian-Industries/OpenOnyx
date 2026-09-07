/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.EventSupport_617;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_279;
import openonyx.history.SettingValue;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.render.group_d.RenderSupport_124;
import openonyx.render.group_j.RenderSupport_147;
import openonyx.render.group_j.RenderSupport_148;
import openonyx.render.group_j.RenderMode_149;
import openonyx.render.internal.RenderSupport_176;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.internal.ThemeSupport_064;
import org.lwjgl.opengl.GL11;

public final class Particles
extends Module {
    private final List<RenderSupport_147> g;
    final public BooleanSetting M;
    private final static ResourceLocation L = new ResourceLocation("onyx", "textures/particle/firefly.png");
    final public NumberSetting j;
    final public NumberSetting m;
    final public MultiSelectSetting<FeatureMode_279> h;
    final public NumberSetting l;
    final public BooleanSetting I;
    private int d;
    final public NumberSetting i;
    final public NumberSetting f;
    private final Random H;
    private int e;

    private void l() {
        Particles a2;
a2.g.removeIf(a -> {
if (!a.L()) {
                return 1 != 0;
            }
            return false;
        });
    }

    private void h() {
        Object a;
        Particles class_236 = this;
Object object = a = class_236.g.iterator();
        while (object.hasNext()) {
            ((RenderSupport_147)a.next()).L();
            object = a;
        }
        class_236.g.clear();
        class_236.e = class_236.d = 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(Vec3 vec3, Vec3 vec32, RenderMode_149 enum_149, int n) {
        void a;
        void a2;
        void a3;
        void a4;
        int n2 = 0;
        Particles a5 = this;
if (Particles.e.theWorld == null) {
            return;
        }
        a5.g.add(new RenderSupport_147(a5, Particles.e.theWorld, (RenderMode_149)a4, (int)a3, a5.L(), (Vec3)a2, (Vec3)a));
    }

    @EventHandler
    private void L(EventSupport_617 class_617) {
        int n;
        Object a = class_617;
        Particles a2 = this;
if (!a2.h.L(FeatureMode_279.i) || ((EventSupport_617)a).L() != Particles.e.thePlayer) {
            return;
        }
        if ((a = ((EventSupport_617)a).L()) == null) {
            return;
        }
        int n2 = 0;
        while (n2 < a2.l.d()) {
            Vec3 vec3 = new Vec3(((Entity)a).posX, ((Entity)a).posY + a2.H.nextDouble() * (double)((Entity)a).height, ((Entity)a).posZ);
            Vec3 vec32 = new Vec3(a2.L(-2.0, 2.0), 0.0, a2.L(-2.0, 2.0));
            int n3 = a2.d;
            a2.d = n3 + 1;
            a2.L(vec3, vec32, RenderMode_149.e, n3);
            n2 = ++n;
        }
    }

    public Particles() {
        super("Particles", "Glowing fireflies on attacks and while walking", ModuleCategory.f);
        Particles a2;
        Particles class_236 = a2;
        Enum[] enumArray = new FeatureMode_279[2];
        enumArray[0] = FeatureMode_279.i;
        enumArray[1] = FeatureMode_279.f;
        class_236.h = new MultiSelectSetting("Spawn at", FeatureMode_279.class, enumArray);
        a2.l = new NumberSetting("Particles on hit", 3.0, 1.0, 25.0, 1.0).L(a2.h, a -> {
return a.contains(FeatureMode_279.i);
        });
        a2.m = new NumberSetting("Particles while walking", 2.0, 1.0, 15.0, 1.0).L(a2.h, a -> {
return a.contains(FeatureMode_279.f);
        });
        Particles class_2362 = a2;
        class_2362.M = new BooleanSetting("Random color", 0 != 0);
        class_2362.j = new NumberSetting("Size", 1.0, 0.5, 2.5, 0.05).d("x");
        class_2362.f = new NumberSetting("Duration", 1.0, 0.25, 3.0, 0.05).d("x");
        class_2362.I = new BooleanSetting("Physics", 1 != 0);
        class_2362.i = new NumberSetting("Physics speed", 1.0, 0.25, 3.0, 0.05).d("x").L((SettingValue)a2.I);
        class_2362.g = new ArrayList<RenderSupport_147>();
        class_2362.H = new Random();
    }

    /*
     * WARNING - void declaration
     */
    public int L(int n, int n2) {
        void a;
        int a2 = n2;
        Particles a3 = this;
if (a3.M.d()) {
            return 4.0f;
        }
        return RenderSupport_148.L(ThemeSupport_059.L().E(), ThemeSupport_059.L().B(), 0, System.currentTimeMillis());
    }

    @Override
    protected void L() {
        Particles a;
a.h();
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        Particles a2 = this;
a2.h();
    }

    @Override
    protected void D() {
        Particles a;
a.h();
    }

    private double L(double a, double a2) {
        Particles a3;
return a + a3.H.nextDouble() * (a2 - a);
    }

    private int L() {
        Particles a;
return ThemeSupport_064.L(a.H.nextFloat() * 360.0f, 0.75f + a.H.nextFloat() * 0.25f, 0.75f + a.H.nextFloat() * 0.25f, 255);
    }

    public void L(float f2) {
        Iterator<RenderSupport_147> iterator;
        float a;
        Object object;
        Object a22;
        Particles class_236 = this;
if (!class_236.d()) {
            return;
        }
        Particles class_2362 = class_236;
        class_2362.l();
        Object object2 = a22 = class_2362.g.iterator();
        while (object2.hasNext()) {
            object = (RenderSupport_147)a22.next();
            object2 = a22;
            ((RenderSupport_147)object).d();
        }
        Particles class_2363 = class_236;
        class_2363.l();
        if (class_2363.g.isEmpty()) {
            return;
        }
        a22 = e.getRenderViewEntity();
        if (a22 == null) {
            return;
        }
        object = new Vec3(((Entity)a22).prevPosX + (((Entity)a22).posX - ((Entity)a22).prevPosX) * 0.0, ((Entity)a22).prevPosY + (((Entity)a22).posY - ((Entity)a22).prevPosY) * 0.0, ((Entity)a22).prevPosZ + (((Entity)a22).posZ - ((Entity)a22).prevPosZ) * 0.0);
        a = ActiveRenderInfo.getRotationX();
        float a22 = ActiveRenderInfo.getRotationXZ();
        float f3 = ActiveRenderInfo.getRotationZ();
        float f4 = ActiveRenderInfo.getRotationYZ();
        float f5 = ActiveRenderInfo.getRotationXY();
        GlStateManager.pushMatrix();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 1);
        GlStateManager.depthMask(0 != 0);
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        e.getTextureManager().bindTexture(L);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        Iterator<RenderSupport_147> iterator2 = iterator = class_236.g.iterator();
        while (iterator2.hasNext()) {
            iterator.next().L(worldRenderer, (Vec3)object, 0, 0, f3, f4, f5);
            iterator2 = iterator;
        }
        tessellator.draw();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.enableAlpha();
        GlStateManager.enableCull();
        GlStateManager.depthMask(1 != 0);
        GlStateManager.disableBlend();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    @EventHandler
    private void L(TickEndEvent class_626) {
        int a;
        Particles class_236 = this;
Particles class_2362 = class_236;
        class_2362.l();
        if (!class_2362.h.L(FeatureMode_279.f) || Particles.e.thePlayer == null || Particles.e.theWorld == null) {
            return;
        }
        if (Particles.e.gameSettings.thirdPersonView == 0) {
            return;
        }
        if (Particles.e.thePlayer.prevPosX == Particles.e.thePlayer.posX && Particles.e.thePlayer.prevPosY == Particles.e.thePlayer.posY && Particles.e.thePlayer.prevPosZ == Particles.e.thePlayer.posZ) {
            return;
        }
        int n = 0;
        while (n < class_236.m.d()) {
            Vec3 a2 = new Vec3(Particles.e.thePlayer.posX + class_236.L(-0.5, 0.5), Particles.e.thePlayer.posY + class_236.H.nextDouble() * (double)Particles.e.thePlayer.height, Particles.e.thePlayer.posZ + class_236.L(-0.5, 0.5));
            double d = 2.0 * (1.0 + class_236.H.nextDouble());
            Vec3 vec3 = new Vec3(Particles.e.thePlayer.motionX + class_236.L(-0.1, 0.1), 0.0, Particles.e.thePlayer.motionZ + class_236.L(-0.1, 0.1)).scale(d);
            int n2 = class_236.e;
            class_236.e = n2 + 1;
            class_236.L(a2, vec3, RenderMode_149.i, n2);
            n = ++a;
        }
    }
}

