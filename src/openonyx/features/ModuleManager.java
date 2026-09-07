/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.orbit.EventHandler
 */
package openonyx.features;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.Minecraft;
import openonyx.configuration.internal.EventSupport_619;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.ModuleState;
import openonyx.features.render.TNTTimer;
import openonyx.features.render.ClickGUI;
import openonyx.features.render.SkeletonESP;
import openonyx.features.render.Boxes;
import openonyx.features.render.SeeInvisibles;
import openonyx.features.render.Particles;
import openonyx.features.render.SkinChanger;
import openonyx.features.render.Camera;
import openonyx.features.render.CapeChanger;
import openonyx.features.render.Zoom;
import openonyx.features.render.ESP;
import openonyx.features.render.ParticleLimiter;
import openonyx.features.render.Fullbright;
import openonyx.features.render.NoRender;
import openonyx.features.render.Hurtcam;
import openonyx.features.render.BedESP;
import openonyx.features.render.Freelook;
import openonyx.features.render.Chams;
import openonyx.features.render.ContainerESP;
import openonyx.features.render.Wings;
import openonyx.features.render.Trails;
import openonyx.features.render.Skybox;
import openonyx.features.render.ChinaHat;
import openonyx.features.render.TargetESP;
import openonyx.features.render.Trajectories;
import openonyx.features.render.Crosshair;
import openonyx.features.render.FogRemove;
import openonyx.features.render.GlowESP;
import openonyx.features.render.Arrows;
import openonyx.features.render.BlockOverlay;
import openonyx.features.render.ItemPhysics;
import openonyx.features.render.Animations;
import openonyx.features.render.JumpCircles;
import openonyx.features.render.FogBlur;
import openonyx.features.render.Hand;
import openonyx.features.render.Ambience;
import openonyx.features.hud.Notifications;
import openonyx.features.hud.DiscordRPC;
import openonyx.features.hud.Watermark;
import openonyx.features.hud.CustomGui;
import openonyx.features.hud.Keybinds;
import openonyx.features.hud.PotionHUD;
import openonyx.features.hud.TargetHUD;
import openonyx.features.hud.ArrayListModule;
import openonyx.features.movement.AutoSprint;
import openonyx.features.movement.SafeWalk;
import openonyx.features.movement.NoSlow;
import openonyx.features.combat.BedBreaker;
import openonyx.features.combat.JumpReset;
import openonyx.features.combat.Velocity;
import openonyx.features.combat.BedDefender;
import openonyx.features.combat.KillAura;
import openonyx.features.combat.AntiBot;
import openonyx.features.player.FastPlace;
import openonyx.features.player.ChestStealer;
import openonyx.features.player.Scaffold;
import openonyx.features.player.NameChanger;
import openonyx.features.player.Deposit;
import openonyx.features.player.InventoryManager;

public class ModuleManager
implements OnyxListener_001 {
    public Wings Ka;
    public BedDefender ha;
    public BlockOverlay Ha;
    public ParticleLimiter ia;
    public FogBlur Da;
    public InventoryManager la;
    public BedESP Ga;
    public FastPlace ga;
    public SeeInvisibles ca;
    public Arrows Q;
    public ItemPhysics T;
    public ChinaHat S;
    public JumpReset o;
    public Camera U;
    public Freelook X;
    public AutoSprint w;
    public TargetESP z;
    public ESP v;
    public Crosshair s;
    public Hurtcam Z;
    public CustomGui O;
    public TNTTimer N;
    public Watermark q;
    public DiscordRPC x;
    public KillAura u;
    public Fullbright y;
    public Scaffold n;
    public TargetHUD Y;
    public Skybox r;
    public Zoom W;
    public JumpCircles P;
    public SkeletonESP V;
    public SafeWalk R;
    public Velocity p;
    public Animations t;
    public ChestStealer b;
    public AntiBot E;
    public GlowESP F;
    public ContainerESP G;
    public Trails A;
    public NoSlow K;
    public NameChanger B;
    public ArrayListModule C;
    public Ambience J;
    public CapeChanger D;
    public Keybinds c;
    public FogRemove a;
    public ClickGUI k;
    public SkinChanger g;
    public Trajectories M;
    public Boxes L;
    public Deposit j;
    public NoRender m;
    public Particles h;
    public Notifications l;
    public PotionHUD I;
    public Hand d;
    private final ArrayList<Module> i;
    public Chams f;
    public BedBreaker H;
    private final Set<Module> e;

    public ModuleManager() {
        int n;
        ModuleManager class_228;
        ModuleManager class_2282 = class_228 = this;
        ModuleManager class_2283 = class_228;
        class_2282.k = new ClickGUI();
        class_2283.O = new CustomGui();
        class_2282.t = new Animations();
        class_2282.v = new ESP();
        class_2282.F = new GlowESP();
        class_2282.z = new TargetESP();
        class_2282.h = new Particles();
        class_2282.y = new Fullbright();
        class_2282.s = new Crosshair();
        class_2282.G = new ContainerESP();
        class_2282.N = new TNTTimer();
        class_2282.m = new NoRender();
        class_2282.ia = new ParticleLimiter();
        class_2282.a = new FogRemove();
        class_2282.T = new ItemPhysics();
        class_2282.U = new Camera();
        class_2282.W = new Zoom();
        class_2282.J = new Ambience();
        class_2282.r = new Skybox();
        class_2282.Da = new FogBlur();
        class_2282.f = new Chams();
        class_2282.L = new Boxes();
        class_2282.Ha = new BlockOverlay();
        class_2282.Ka = new Wings();
        class_2282.S = new ChinaHat();
        class_2282.A = new Trails();
        class_2282.P = new JumpCircles();
        class_2282.d = new Hand();
        class_2282.w = new AutoSprint();
        class_2282.R = new SafeWalk();
        class_2282.K = new NoSlow();
        class_2282.u = new KillAura();
        class_2282.E = new AntiBot();
        class_2282.H = new BedBreaker();
        class_2282.ha = new BedDefender();
        class_2282.p = new Velocity();
        class_2282.o = new JumpReset();
        class_2282.n = Scaffold.E;
        class_2282.B = new NameChanger();
        class_2282.g = new SkinChanger();
        class_2282.D = new CapeChanger();
        class_2282.ga = new FastPlace();
        class_2282.j = Deposit.I;
        class_2282.la = new InventoryManager();
        class_2282.b = new ChestStealer();
        class_2282.Y = new TargetHUD();
        class_2282.c = new Keybinds();
        class_2282.C = new ArrayListModule();
        class_2282.q = new Watermark();
        class_2282.l = new Notifications();
        class_2282.I = new PotionHUD();
        class_2282.Q = new Arrows();
        class_2282.Ga = new BedESP();
        class_2282.V = new SkeletonESP();
        class_2282.M = new Trajectories();
        class_2282.ca = new SeeInvisibles();
        class_2282.X = new Freelook();
        class_2282.Z = new Hurtcam();
        class_2282.x = new DiscordRPC();
        class_2282.i = new ArrayList();
        class_2282.e = new HashSet<Module>();
        Field[] fieldArray = class_2282.getClass().getDeclaredFields();
        int n2 = fieldArray.length;
        int n3 = 0;
        while (n3 < 0) {
            Object a2 = fieldArray[0];
            if (Module.class.isAssignableFrom(((Field)a2).getType())) {
                try {
                    a2 = (Module)((Field)a2).get(class_228);
                    ((Module)a2).d();
                    class_228.i.add((Module)a2);
                }
                catch (IllegalAccessException a2) {
                    a2.printStackTrace();
                }
            }
            n3 = ++n;
        }
        class_228.i.sort(Comparator.comparing(Module::d, String.CASE_INSENSITIVE_ORDER).thenComparing(Module::d));
    }

    /*
     * WARNING - void declaration
     */
    public ArrayList<Module> L(ModuleCategory enum_226) {
        ModuleManager class_228 = this;
ArrayList<Module> arrayList = new ArrayList<Module>();
        for (Module class_227 : class_228.i) {
            void a;
            if (class_227.L() != a) continue;
            arrayList.add(class_227);
        }
        return arrayList;
    }

    @EventHandler
    public void L(EventSupport_619 class_619) {
        ModuleManager class_228 = this;
int a = ((Minecraft)((Object)ModuleManager.e)).currentScreen != null ? 1 : 0;
        Iterator<Module> iterator = class_228.i.iterator();
        block0: while (true) {
            Iterator<Module> iterator2 = iterator;
            while (iterator2.hasNext()) {
                int n;
                OnyxListener_001 a2 = iterator.next();
                int n2 = ((Module)a2).L().L(ModuleState.f) && ((Module)a2).i() ? 1 : 0;
                int n3 = n = a == 0 && ((Module)a2).L().D() && ((Module)a2).L().l() ? 1 : 0;
                if (n2 != 0) {
                    if (-1 != 0) {
                        iterator2 = iterator;
                        class_228.e.add((Module)a2);
                        ((Module)a2).L(3 >> 1);
                        continue;
                    }
                    if (!class_228.e.remove(a2)) continue block0;
                    iterator2 = iterator;
                    ((Module)a2).L(0 != 0);
                    continue;
                }
                if (a != 0) continue block0;
                if (!((Module)a2).L().D()) {
                    iterator2 = iterator;
                    continue;
                }
                if (-1 != 0 && class_228.e.add((Module)a2)) {
                    ((Module)a2).I();
                    continue block0;
                }
                if (-1 != 0) continue block0;
                class_228.e.remove(a2);
                continue block0;
            }
            break;
        }
    }

    @Generated
    public ArrayList<Module> L() {
        ModuleManager a;
return a.i;
    }
}

