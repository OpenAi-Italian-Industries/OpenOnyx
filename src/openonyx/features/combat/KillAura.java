/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.orbit.EventHandler
 *  openonyx.configuration.internal.PacketDirection
 *  openonyx.configuration.internal.PacketEvent
 *  openonyx.configuration.internal.TickEndEvent
 *  openonyx.configuration.internal.TickEvent
 *  openonyx.configuration.internal.WorldChangeEvent
 *  openonyx.core.OnyxClient
 *  openonyx.events.AimController
 *  openonyx.events.EntityRelationUtils
 *  openonyx.events.GeometryUtils
 *  openonyx.events.Rotation
 *  openonyx.events.RotationManager
 *  openonyx.events.RotationSettings
 *  openonyx.features.Module
 *  openonyx.features.ModuleCategory
 *  openonyx.features.combat.AntiBot
 *  openonyx.features.combat.AutoBlockMode
 *  openonyx.features.combat.AutoBlockTrigger
 *  openonyx.features.combat.BedBreaker
 *  openonyx.features.combat.CombatController
 *  openonyx.features.combat.HitCheck
 *  openonyx.features.combat.TargetFilter
 *  openonyx.features.player.Scaffold
 *  openonyx.history.internal.BooleanSetting
 *  openonyx.history.internal.EnumSetting
 *  openonyx.history.internal.KeybindSetting
 *  openonyx.history.internal.MultiSelectSetting
 *  openonyx.history.internal.NumberSetting
 *  openonyx.ui.internal.TextEditor
 *  openonyx.utilities.Timer
 */
package openonyx.features.combat;

import java.util.Iterator;
import java.util.Random;
import lombok.Generated;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import openonyx.configuration.internal.PacketDirection;
import openonyx.configuration.internal.PacketEvent;
import openonyx.configuration.internal.TickEndEvent;
import openonyx.configuration.internal.TickEvent;
import openonyx.configuration.internal.WorldChangeEvent;
import openonyx.core.OnyxClient;
import openonyx.events.AimController;
import openonyx.events.EntityRelationUtils;
import openonyx.events.GeometryUtils;
import openonyx.events.Rotation;
import openonyx.events.RotationManager;
import openonyx.events.RotationSettings;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.combat.AntiBot;
import openonyx.features.combat.AutoBlockMode;
import openonyx.features.combat.AutoBlockTrigger;
import openonyx.features.combat.BedBreaker;
import openonyx.features.combat.CombatController;
import openonyx.features.combat.HitCheck;
import openonyx.features.combat.TargetFilter;
import openonyx.features.player.Scaffold;
import openonyx.history.internal.BooleanSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.history.internal.KeybindSetting;
import openonyx.history.internal.MultiSelectSetting;
import openonyx.history.internal.NumberSetting;
import openonyx.ui.internal.TextEditor;
import openonyx.utilities.Timer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KillAura
extends Module {
    private final static long MIN_ATTACK_INTERVAL_MS = 25L;
    private EntityLivingBase previousTarget;
    public BooleanSetting onlySword;
    private final Random random;
    public NumberSetting minCps;
    private EntityLivingBase target;
    public RotationSettings rotationSettings;
    private long lastAttackAt;
    private final CombatController combatController;
    private final AimController aimController;
    public EnumSetting<AutoBlockMode> autoBlockMode;
    public NumberSetting maxCps;
    public EnumSetting<HitCheck> hitCheck;
    private final Timer attackTimer;
    private boolean toggleAutoBlock;
    private int targetTicks;
    public NumberSetting targetDistance;
    private boolean autoBlockKeyDown;
    public KeybindSetting autoBlockKey;
    public EnumSetting<AutoBlockTrigger> autoBlockTrigger;
    public NumberSetting hitAngle;
    public NumberSetting switchDelay;
    public BooleanSetting throughWalls;
    public MultiSelectSetting<TargetFilter> targetFilters;

    private double distanceToEntity(Entity entity) {
        Object a = entity;
        KillAura a2 = this;
return GeometryUtils.L((Entity)a);
    }

    @EventHandler
    public void onPacket(PacketEvent packetEvent) {
        Object a = packetEvent;
        KillAura a2 = this;
if (a.L() == PacketDirection.e) {
            a2.combatController.L((PacketEvent)a);
            return;
        }
        if (!a2.shouldBlock()) {
            return;
        }
        Packet packet = a.L();
        if (!(packet instanceof S19PacketEntityStatus)) {
            return;
        }
        a = (S19PacketEntityStatus)packet;
        if (((S19PacketEntityStatus)a).getOpCode() != 2) {
            return;
        }
        if (KillAura.e.thePlayer == null || ((S19PacketEntityStatus)a).getEntityId() != KillAura.e.thePlayer.getEntityId()) {
            return;
        }
        a2.combatController.F();
    }

    private boolean shouldAttack() {
        KillAura a;
if (a.onlySword.d() && !CombatController.I()) {
            return 3 >> 2;
        }
        KillAura killAura = a;
        if (killAura.targetTicks < killAura.switchDelay.d()) {
            return 5 >> 3;
        }
        KillAura killAura2 = a;
        if (!killAura2.canSeeEntity((Entity)killAura2.target)) {
            return 0 != 0;
        }
        return a.passesHitCheck(RotationManager.L());
    }

    public static boolean isAttackReady() {
        KillAura killAura;
KillAura killAura2 = killAura = OnyxClient.l == null ? null : OnyxClient.l.u;
        return killAura == null || killAura.combatController.L();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean passesHitCheck(Rotation rotation) {
        KillAura a = rotation;
        KillAura a2 = this;
switch (((HitCheck)a2.hitCheck.L()).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                return true;
            }
            case 1: {
                if (a2.aimController.L((Rotation)a) <= a2.hitAngle.L()) {
                    return 1 != 0;
                }
                return false;
            }
            case 2: 
        }
        KillAura killAura = a2;
        return killAura.aimController.L((Entity)killAura.target, (Rotation)a, ((Double)a2.targetDistance.L()).doubleValue());
    }

    private boolean shouldBlock() {
        KillAura a;
if (!a.autoBlockMode.L((Enum)AutoBlockMode.f)) {
            return 0 != 0;
        }
        switch (((AutoBlockTrigger)a.autoBlockTrigger.L()).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return true;
            }
            case 1: {
                if (a.autoBlockKey.D() && a.autoBlockKeyDown) {
                    return 1 != 0;
                }
                return false;
            }
            case 2: 
        }
        return !a.autoBlockKey.D() || a.toggleAutoBlock;
    }

    protected void onDisable() {
        KillAura a;
KillAura killAura = a;
        KillAura killAura2 = a;
        killAura2.target = null;
        killAura2.previousTarget = null;
        killAura.targetTicks = 0;
        killAura.lastAttackAt = 0L;
        a.toggleAutoBlock = 0;
        a.autoBlockKeyDown = 0;
        a.combatController.L(5 >> 2);
        a.aimController.L();
    }

    public static boolean isActive() {
        KillAura killAura;
KillAura killAura2 = killAura = OnyxClient.l == null ? null : OnyxClient.l.u;
        if (killAura != null && killAura.d() && killAura.combatController.d()) {
            return 1 != 0;
        }
        return false;
    }

    private boolean isValidTarget(EntityLivingBase entityLivingBase) {
        EntityLivingBase a = entityLivingBase;
        KillAura a2 = this;
if (a instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)a;
            if (AntiBot.L((EntityPlayer)entityPlayer)) {
                return 0 != 0;
            }
            int n = a.getTotalArmorValue() == 0 ? 1 : 0;
            boolean bl = a.isInvisible();
            int n2 = a2.targetFilters.L((Enum)TargetFilter.i);
            if (n != 0 && a2.targetFilters.L((Enum)TargetFilter.H)) {
                n2 = 1;
            }
            if (bl && a2.targetFilters.L((Enum)TargetFilter.l)) {
                n2 = 1;
            }
            if (n != 0 && bl && a2.targetFilters.L((Enum)TargetFilter.f)) {
                n2 = 1;
            }
            return KillAura.targetSelectionAllowed(EntityRelationUtils.L((EntityPlayer)KillAura.e.thePlayer, (EntityPlayer)entityPlayer), a2.targetFilters.L((Enum)TargetFilter.I), n2 != 0);
        }
        if (a instanceof EntityAnimal) {
            return a2.targetFilters.L((Enum)TargetFilter.d);
        }
        if (a instanceof EntityLiving) {
            return a2.targetFilters.L((Enum)TargetFilter.h);
        }
        return false;
    }

    private void attackIfReady() {
        KillAura a;
if (a.lastAttackAt != 0L) {
            KillAura killAura = a;
            if (!killAura.attackTimer.d(killAura.lastAttackAt - MIN_ATTACK_INTERVAL_MS)) {
                return;
            }
        }
        if (!a.shouldAttack()) {
            return;
        }
        KillAura killAura = a;
        killAura.shouldBlock();
        killAura.lastAttackAt = killAura.nextAttackDelayMillis();
        killAura.attackTimer.L();
    }

    private void resetCombatState() {
        KillAura a;
a.target = null;
        a.previousTarget = null;
        a.targetTicks = 0;
        a.toggleAutoBlock = a.targetTicks;
        a.autoBlockKeyDown = 0;
        a.combatController.L(1 != 0);
        a.aimController.L();
    }

    @Generated
    public EntityLivingBase getTarget() {
        KillAura a;
return a.target;
    }

    private boolean canSeeEntity(Entity entity) {
        Object a = entity;
        KillAura a2 = this;
return a2.throughWalls.d() || KillAura.e.thePlayer.canEntityBeSeen((Entity)a);
    }

    @EventHandler
    public void onTickEnd(TickEndEvent tickEndEvent) {
        KillAura a = tickEndEvent;
        KillAura a2 = this;
a2.combatController.e();
    }

    private EntityLivingBase findTarget() {
        KillAura killAura = this;
Entity entity = null;
        double d = (Double)killAura.targetDistance.L() * (Double)killAura.targetDistance.L();
        Iterator a = KillAura.e.theWorld.loadedEntityList.iterator();
        block0: while (true) {
            Iterator iterator = a;
            while (iterator.hasNext()) {
                double d2;
                EntityPlayer entityPlayer;
                Entity entity2 = (Entity)a.next();
                if (!(entity2 instanceof EntityLivingBase)) continue block0;
                if ((entity2 = (EntityLivingBase)entity2) == KillAura.e.thePlayer) {
                    iterator = a;
                    continue;
                }
                if (!((EntityLivingBase)entity2).isEntityAlive()) {
                    iterator = a;
                    continue;
                }
                if (entity2 instanceof EntityArmorStand) {
                    iterator = a;
                    continue;
                }
                if (entity2 instanceof EntityPlayer && (entityPlayer = (EntityPlayer)entity2).isSpectator()) {
                    iterator = a;
                    continue;
                }
                if (!killAura.L((EntityLivingBase)entity2)) {
                    iterator = a;
                    continue;
                }
                if (!killAura.canSeeEntity(entity2)) {
                    iterator = a;
                    continue;
                }
                double d3 = killAura.distanceToEntity(entity2);
                if (d2 > d) {
                    iterator = a;
                    continue;
                }
                entity = entity2;
                d = d3;
                iterator = a;
            }
            break;
        }
        return entity;
    }

    public KillAura() {
        super(Rotation.L((String)"I|nyC`pt"), TextEditor.L((String)"4D\u0001^\u0018P\u0001X\u0016P\u0019]\f\u0011\u0014X\u0018BUP\u001bUUZ\u001c]\u0019BUT\u001bT\u0018X\u0010B"), ModuleCategory.d);
        KillAura a2;
        KillAura killAura = a2;
        a2.targetDistance = new NumberSetting(Rotation.L((String)"F|qac{ap"), 3.0, 3.0, 6.0, 0.05);
        TargetFilter[] targetFilterArray = new TargetFilter[4];
        targetFilterArray[0] = TargetFilter.i;
        targetFilterArray[1] = TargetFilter.H;
        targetFilterArray[2] = TargetFilter.f;
        targetFilterArray[3] = TargetFilter.l;
        killAura.targetFilters = new MultiSelectSetting(TextEditor.L((String)"e\u0014C\u0012T\u0001B"), TargetFilter.class, (Enum[])targetFilterArray).L(Rotation.L((String)"Agtoxcagf\"tpp\"pzvn`fpf5w{npqf\"pzen|a|vy{5qpnpaagq"));
        KillAura killAura2 = a2;
        killAura2.throughWalls = new BooleanSetting(TextEditor.L((String)"e\u001dC\u001aD\u0012YUF\u0014]\u0019B"), 5 >> 3).L(Rotation.L((String)"Tnymbq5vtprgak{e5c{f5cavta~k{e5g{v|v|gf\"wg}k{f5`ymvif"));
        killAura2.hitCheck = new EnumSetting(TextEditor.L((String)"y\u001cEUR\u001dT\u0016Z"), (Enum)HitCheck.i).L(Rotation.L((String)"]myff\"ajp\"tvacvi5w{v|n5v}g5qpla\"gmacakzl5cvv`cynl\"vmcggq5v}g5vtprga"));
        a2.hitAngle = new NumberSetting(TextEditor.L((String)"y\u001cEUP\u001bV\u0019T"), 8.0, 1.0, 45.0, 1.0).d(Rotation.L((String)"\u00a5")).L(() -> {
            KillAura a;
return a.hitCheck.L((Enum)HitCheck.e);
        });
        KillAura killAura3 = a2;
        killAura3.switchDelay = new NumberSetting(TextEditor.L((String)"&F\u001cE\u0016YUU\u0010]\u0014H"), 0.0, 0.0, 20.0, 1.0).d(Rotation.L((String)"a")).L(TextEditor.L((String)"t\rE\u0007PUE\u001cR\u001eBUE\u001a\u0011\u001d^\u0019UUE\u001dTUP\u0001E\u0014R\u001e\u0011\u0014W\u0001T\u0007\u0011\u0001Y\u0010\u0011\u0001P\u0007V\u0010EUR\u001dP\u001bV\u0010B"));
        killAura3.minCps = new NumberSetting(Rotation.L((String)"VRF\"xk{"), 7.0, 1.0, 20.0, 1.0);
        killAura3.maxCps = new NumberSetting(TextEditor.L((String)"r%bU\\\u0014I"), 10.0, 1.0, 20.0, 1.0);
        killAura3.onlySword = new BooleanSetting(Rotation.L((String)"M{nl\"fuzpq"), 0 != 0).L(TextEditor.L((String)":_\u0019HUP\u0001E\u0014R\u001eBUF\u001dX\u0019TUPUB\u0002^\u0007UUX\u0006\u0011\u001dT\u0019UUX\u001b\u0011\u001dP\u001bU"));
        killAura3.autoBlockMode = new EnumSetting(Rotation.L((String)"Twamwnza~"), (Enum)AutoBlockMode.e).L(TextEditor.L((String)"4D\u0001^\u0018P\u0001X\u0016P\u0019]\f\u0011\u0017]\u001aR\u001eBUB\u0002^\u0007U"));
        killAura3.autoBlockTrigger = new EnumSetting(Rotation.L((String)"Twamwnza~\"ap|ergg"), (Enum)AutoBlockTrigger.f).L(TextEditor.L((String)"\"Y\u0010E\u001dT\u0007\u0011\u0001Y\u0010\u0011\u0014D\u0001^\u0017]\u001aR\u001e\u0011\u0007D\u001bBU^\u001b\u0011\u001cE\u0006\u0011\u001aF\u001b\u001dU^\u001b]\f\u0011\u0002Y\u001c]\u0010\u0011\u0014\u0011\u001eT\f\u0011\u001cBUY\u0010]\u0011\u001dU^\u0007\u0011\u001a_UPUZ\u0010HUE\u001dP\u0001\u0011\u0001^\u0012V\u0019T\u0006\u0011\u001cE" )).L(a2.autoBlockMode, a -> {
if (a != AutoBlockMode.e) {
                return 1 != 0;
            }
            return false;
        });
        a2.autoBlockKey = new KeybindSetting(Rotation.L((String)"Twamwnza~\"~gl")).L(TextEditor.L((String)"!Y\u0010\u0011\u001eT\f\u0011\u0001Y\u0010\u0011\u001d^\u0019UUP\u001bUUE\u001aV\u0012]\u0010\u0011\u0001C\u001cV\u0012T\u0007BUF\u0014E\u0016Y")).L(() -> {
            KillAura a;
if (!a.autoBlockMode.L((Enum)AutoBlockMode.e) && !a.autoBlockTrigger.L((Enum)AutoBlockTrigger.f)) {
                return --1 != 0;
            }
            return false;
        });
        KillAura killAura4 = a2;
        killAura4.rotationSettings = new RotationSettings();
        a2.aimController = new AimController(a2.rotationSettings);
        killAura4.random = new Random();
        killAura4.combatController = new CombatController();
        killAura4.attackTimer = new Timer();
    }

    private long nextAttackDelayMillis() {
        KillAura killAura = this;
KillAura killAura2 = killAura;
        float f = Math.min(killAura.minCps.L(), killAura2.maxCps.L());
        float a = Math.max(killAura2.minCps.L(), killAura.maxCps.L());
        float f2 = f;
        return (long)(1000.0 / (double)(f2 + killAura.random.nextFloat() * (a - f2)));
    }

    private void updateAutoBlockKey() {
        int a;
        KillAura killAura = this;
int n = a = KillAura.e.currentScreen == null && killAura.autoBlockKey.D() && killAura.autoBlockKey.l() ? 1 : 0;
        if (a != 0 && !killAura.autoBlockKeyDown && killAura.autoBlockTrigger.L((Enum)AutoBlockTrigger.i)) {
            killAura.toggleAutoBlock = !killAura.toggleAutoBlock ? 1 : 0;
        }
        killAura.autoBlockKeyDown = a;
    }

    @EventHandler
    public void onTick(TickEvent tickEvent) {
        int n;
        Object a22 = tickEvent;
        KillAura a = this;
if (KillAura.e.thePlayer == null || KillAura.e.theWorld == null) {
            return;
        }
        KillAura killAura = a;
        killAura.updateAutoBlockKey();
        killAura.combatController.i();
        if (!KillAura.e.thePlayer.isEntityAlive()) {
            a.resetCombatState();
            return;
        }
        if (Scaffold.E.d()) {
            a.resetCombatState();
            return;
        }
        a22 = OnyxClient.l.H;
        if (a22.d() && !((BedBreaker)a22).k.d() && a22.D() != null) {
            a.resetCombatState();
            return;
        }
        KillAura killAura2 = a;
        a22 = killAura2.target;
        killAura2.target = killAura2.previousTarget = killAura2.findTarget();
        if (killAura2.target == null || a.onlySword.d() && !CombatController.I()) {
            a.target = null;
            a.targetTicks = 0;
            a.combatController.L(--1 != 0);
            a.aimController.L();
            return;
        }
        a.targetTicks = a.target == a22 ? a.targetTicks + 1 : 0;
        int a22 = 0;
        if (a.shouldBlock() && CombatController.I()) {
            KillAura killAura3 = a;
            n = a22 = (int)(killAura3.combatController.L(killAura3.target, () -> {
                KillAura a;
KillAura.e.thePlayer.swingItem();
                KillAura.e.playerController.attackEntity(KillAura.e.thePlayer, a.target);
            }) ? 1 : 0);
        } else {
            a.combatController.L(1 != 0);
            n = a22;
        }
        if (n == 0) {
            a.attackIfReady();
        }
        KillAura killAura4 = a;
        killAura4.aimController.L((Entity)killAura4.target, ((Double)a.targetDistance.L()).doubleValue());
    }

    /*
     * WARNING - void declaration
     */
    static boolean targetSelectionAllowed(boolean bl, boolean bl2, boolean bl3) {
        boolean a = bl3;
        boolean a2 = bl;
if (a2) {
            void a3;
            return (boolean)a3;
        }
        return a;
    }

    @EventHandler
    public void onWorldChange(WorldChangeEvent worldChangeEvent) {
        KillAura a = worldChangeEvent;
        KillAura a2 = this;
KillAura killAura = a2;
        killAura.combatController.l();
        killAura.resetCombatState();
    }

    public static boolean h() {
        KillAura killAura;
KillAura killAura2 = killAura = OnyxClient.l == null ? null : OnyxClient.l.u;
        if (killAura != null && killAura.d() && killAura.combatController.i()) {
            return 1 != 0;
        }
        return false;
    }

    @Generated
    public EntityLivingBase getPreviousTarget() {
        KillAura a;
return a.previousTarget;
    }
}
