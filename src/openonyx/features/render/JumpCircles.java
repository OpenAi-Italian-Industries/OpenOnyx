/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features.render;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.events.ChatTransformer;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureSupport_256;
import openonyx.features.render.FeatureMode_305;
import openonyx.history.internal.TextSetting;
import openonyx.history.internal.ColorSetting;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.group_z.RenderSupport_203;
import openonyx.render.group_z.RenderSupport_205;
import openonyx.render.group_z.RenderSupport_206;
import openonyx.utilities.UtilitySupport_486;

public final class JumpCircles
extends Module {
    private final List<RenderSupport_206> a;
    final public ColorSetting k;
    final public NumberSetting g;
    final public EnumSetting<FeatureMode_305> M;
    final public BooleanSetting L;
    final public NumberSetting j;
    final public NumberSetting m;
    final public BooleanSetting h;
    private final static double l = 0.01;
    private final RenderSupport_203 I;
    private final Map<Integer, Vec3> d;
    final public TextSetting i;
    final public NumberSetting f;
    final public NumberSetting H;
    final public FeatureSupport_256 e;

    @Override
    protected void L() {
        JumpCircles a;
JumpCircles class_317 = a;
        class_317.a.clear();
        class_317.d.clear();
    }

    @EventHandler
    private void L(TickEndEvent class_626) {
        JumpCircles class_317 = this;
if (((Minecraft)((Object)JumpCircles.e)).thePlayer == null || ((Minecraft)((Object)JumpCircles.e)).theWorld == null) {
            return;
        }
        class_317.h();
        HashSet<Integer> a = new HashSet<Integer>();
        Iterator iterator = ((Minecraft)((Object)JumpCircles.e)).theWorld.playerEntities.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                EntityPlayer a2 = (EntityPlayer)iterator.next();
                if (a2 == null) continue block0;
                if (!a2.isEntityAlive()) {
                    iterator2 = iterator;
                    continue;
                }
                if (a2 != ((Minecraft)((Object)JumpCircles.e)).thePlayer && !class_317.L.d()) {
                    iterator2 = iterator;
                    continue;
                }
                a.add(a2.getEntityId());
                Vec3 vec3 = new Vec3(a2.posX, a2.posY, a2.posZ);
                if (a2.onGround) {
                    iterator2 = iterator;
                    class_317.d.put(a2.getEntityId(), vec3);
                    continue;
                }
                vec3 = class_317.d.remove(a2.getEntityId());
                if (vec3 == null || !JumpCircles.L(a2, vec3)) continue block0;
                class_317.a.add(new RenderSupport_206(vec3, System.currentTimeMillis()));
                continue block0;
            }
            break;
        }
        class_317.d.keySet().retainAll(a);
    }

    private void h() {
        JumpCircles a;
long l = System.currentTimeMillis() - a.L();
        a.a.removeIf(a2 -> {
if (a2.L() < 0) {
                return --1 != 0;
            }
            return false;
        });
    }

    @Override
    protected void D() {
        JumpCircles a;
JumpCircles class_317 = a;
        class_317.a.clear();
        class_317.d.clear();
        class_317.I.L();
    }

    private RenderSupport_205 L() {
        JumpCircles a;
return new RenderSupport_205((FeatureMode_305)a.M.L(), a.k.h(), a.m.L() / 100.0f, a.g.L(), a.L(), a.f.L(), (String)a.i.L(), a.H.L(), a.h.d(), a.e.D(), a.e.H.L() / 100.0f, a.e.e.L() / 100.0f);
    }

    public JumpCircles() {
        super("JumpCircles", "Draws a circle where a jump started", ModuleCategory.f);
        JumpCircles a2;
        JumpCircles class_317 = a2;
        a2.M = new EnumSetting<FeatureMode_305>("Mode", FeatureMode_305.H);
        class_317.i = ((TextSetting)new TextSetting("Text", "ONYX").L("Written around the ring, repeated all the way round")).L(a2.M, a -> {
if (a == FeatureMode_305.f) {
                return --1 != 0;
            }
            return false;
        });
        a2.H = ((NumberSetting)new NumberSetting("Text size", 0.22, 0.05, 0.6, 0.01).L("How tall the letters stand, in blocks")).L(a2.M, a -> {
if (a == FeatureMode_305.f) {
                return 3 >> 1;
            }
            return false;
        });
        a2.f = ((NumberSetting)new NumberSetting("Spin speed", 40.0, -360.0, 360.0, 5.0).d("ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¾ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â°/s").L("How fast the text travels around the ring")).L(a2.M, a -> {
if (a == FeatureMode_305.f) {
                return 1 != 0;
            }
            return false;
        });
        JumpCircles class_3172 = a2;
        class_3172.k = new ColorSetting("Color", -10178561).D();
        class_3172.g = new NumberSetting("Radius", 1.5, 0.3, 6.0, 0.1).L("How wide the circle opens out to");
        class_3172.m = new NumberSetting("Opacity", 70.0, 5.0, 100.0, 1.0).d("%").L("Overall opacity of the circles");
        class_3172.j = new NumberSetting("Duration", 2.0, 0.25, 8.0, 0.25).d(" s").L("How long a circle lasts before it is gone");
        class_3172.L = new BooleanSetting("Other players", 3 >> 2).L("Leave circles under everyone else's jumps too");
        class_3172.h = new BooleanSetting("Through walls", 5 >> 3);
        class_3172.e = new FeatureSupport_256(a2);
        class_3172.I = new RenderSupport_203();
        class_3172.a = new ArrayList<RenderSupport_206>();
        class_3172.d = new HashMap<Integer, Vec3>();
    }

    @EventHandler
    private void L(WorldChangeEvent class_614) {
        WorldChangeEvent a = class_614;
        JumpCircles a2 = this;
JumpCircles class_317 = a2;
        class_317.a.clear();
        class_317.d.clear();
    }

    public void L(float f2) {
        float a = f2;
        JumpCircles a2 = this;
if (!a2.d() || ((Minecraft)((Object)JumpCircles.e)).theWorld == null || ((Minecraft)((Object)JumpCircles.e)).thePlayer == null) {
            return;
        }
        JumpCircles class_317 = a2;
        class_317.h();
        class_317.I.L(0, a2.a, a2.L());
    }

    private long L() {
        JumpCircles a;
return (long)((Double)a.j.L() * 1000.0);
    }

    private static boolean L(EntityPlayer entityPlayer, Vec3 vec3) {
        Vec3 a = vec3;
        EntityPlayer a2 = entityPlayer;
return a2.motionY > 0.0 || a2.posY > a.yCoord + 0.01;
    }
}

