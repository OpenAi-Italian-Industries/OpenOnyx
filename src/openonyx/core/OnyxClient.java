/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.orbit.EventBus
 *  meteordevelopment.orbit.IEventBus
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package openonyx.core;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import lombok.Generated;
import meteordevelopment.orbit.EventBus;
import meteordevelopment.orbit.IEventBus;
import openonyx.commands.CommandSupport_094;
import openonyx.connection.NetworkSupport_465;
import openonyx.events.PerformanceDiagnostics;
import openonyx.features.ModuleManager;
import openonyx.features.combat.BedTracker;
import openonyx.misc.MiscSupport_628;
import openonyx.movement.MovementSupport_092;
import openonyx.protocol.ProtocolSupport_207;
import openonyx.render.RenderSupport_099;
import openonyx.utilities.UtilitySupport_476;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_494;
import openonyx.utilities.UtilitySupport_497;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class OnyxClient {
    public static ModuleManager l;
    public static CommandSupport_094 I;
    final public static IEventBus d;
    private final static OnyxClient i;
    public static NetworkSupport_465 f;
    final public static Logger H;
    public static MiscSupport_628 e;

    public OnyxClient() {
        OnyxClient a;
    }

    public static String L() {
String string = System.getProperty("onyx.user");
        if (string == null || string.isEmpty()) {
            return "dev";
        }
        return string;
    }

    static {
        i = new OnyxClient();
        H = LogManager.getLogger((String)"onyx");
        d = new EventBus();
    }

    public void d() {
d.registerLambdaFactory("openonyx", (method, clazz) -> {
            GenericDeclaration a = clazz;
            Method a2 = method;
Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = MethodHandles.lookup();
            return (MethodHandles.Lookup)a2.invoke(null, objectArray);
        });
        l = new ModuleManager();
        d.subscribe((Object)l);
        d.subscribe((Object)UtilitySupport_477.i);
        d.subscribe((Object)UtilitySupport_497.e);
        d.subscribe((Object)BedTracker.l);
        d.subscribe((Object)UtilitySupport_494.e);
        d.subscribe((Object)ProtocolSupport_207.I);
        d.subscribe((Object)MovementSupport_092.H);
        f = new NetworkSupport_465();
        f.d();
        I = new CommandSupport_094();
        e = new MiscSupport_628();
        e.i();
        PerformanceDiagnostics.d();
        H.info("onyx client initialised");
    }

    @Generated
    public static OnyxClient L() {
return i;
    }

    public void L() {
if (f != null) {
            f.L();
        }
        if (e != null) {
            e.L();
        }
    }
}

