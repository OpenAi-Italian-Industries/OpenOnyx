/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.connection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import openonyx.connection.NetworkSupport_453;
import openonyx.connection.NetworkSupport_455;
import openonyx.connection.NetworkSupport_458;
import openonyx.connection.internal.NetworkSupport_474;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.theme.ThemeSupport_056;
import openonyx.utilities.UtilitySupport_492;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkSupport_465
implements OnyxListener_001 {
    private final static String m = "accounts.json";
    private final NetworkSupport_453 h;
    private final static int l = 1;
    private final static String I;
    private final List<NetworkSupport_458> d;
    private Session i;
    private final static Gson f;
    private final static String H = "accounts.json.tmp";
    private NetworkSupport_458 e;

    public Proxy d() {
        NetworkSupport_465 a;
return a.h.d();
    }

    public void d() {
        Object object;
        Object a2;
        NetworkSupport_465 class_465 = this;
if (!Files.isRegularFile(class_465.L(), new LinkOption[0])) {
            return;
        }
        try {
            a2 = new String(Files.readAllBytes(class_465.L()), StandardCharsets.UTF_8);
            object = new JsonParser().parse((String)a2).getAsJsonObject();
        }
        catch (IOException | RuntimeException a2) {
            OnyxClient.H.error("Failed to read accounts", (Throwable)a2);
            return;
        }
        a2 = ((JsonObject)object).get("proxy");
        if (a2 != null && ((JsonElement)a2).isJsonObject()) {
            class_465.h.L(((JsonElement)a2).getAsJsonObject());
        }
        if ((object = ((JsonObject)object).get("accounts")) == null || !((JsonElement)object).isJsonArray()) {
            return;
        }
        class_465.d.clear();
        object = ((JsonElement)object).getAsJsonArray().iterator();
        block4: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                a2 = (JsonElement)object.next();
                if (!((JsonElement)a2).isJsonObject()) {
                    object2 = object;
                    continue;
                }
                try {
                    if ((a2 = NetworkSupport_458.L(((JsonElement)a2).getAsJsonObject())) == null) continue block4;
                    class_465.d.add((NetworkSupport_458)a2);
                }
                catch (RuntimeException a2) {
                    OnyxClient.H.warn("Skipping malformed account entry", (Throwable)a2);
                }
                continue block4;
            }
            break;
        }
    }

    @Generated
    public NetworkSupport_458 L() {
        NetworkSupport_465 a;
return a.e;
    }

    private void L(Session session) {
        Session a = session;
        NetworkSupport_465 a2 = this;
if (a2.i == null) {
            a2.i = ((Minecraft)((Object)e)).getSession();
        }
        ((Minecraft)((Object)e)).setSession(a);
    }

    public void i(NetworkSupport_458 class_458) {
        NetworkSupport_458 a = class_458;
        NetworkSupport_465 a2 = this;
a2.d.add(a);
        a2.L();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean L() {
        Object a;
        NetworkSupport_465 class_465 = this;
JsonArray jsonArray = new JsonArray();
        Object object = class_465.d;
        synchronized (object) {
            Object object2 = a = class_465.d.iterator();
            while (object2.hasNext()) {
                NetworkSupport_458 class_458 = (NetworkSupport_458)a.next();
                object2 = a;
                jsonArray.add(class_458.L());
            }
        }
        Object object3 = object = new JsonObject();
        ((JsonObject)object3).addProperty("version", 1);
        ((JsonObject)object3).add("accounts", jsonArray);
        NetworkSupport_465 class_4652 = class_465;
        ((JsonObject)object3).add("proxy", class_4652.h.L());
        a = class_4652.d().resolve(H);
        try {
            Files.createDirectories(class_465.d(), new FileAttribute[0]);
            Files.write((Path)a, f.toJson((JsonElement)object).getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            try {
                CopyOption[] copyOptionArray = new CopyOption[2];
                copyOptionArray[0] = StandardCopyOption.ATOMIC_MOVE;
                copyOptionArray[1] = StandardCopyOption.REPLACE_EXISTING;
                Files.move((Path)a, class_465.L(), copyOptionArray);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                Files.move((Path)a, class_465.L(), copyOptionArray);
            }
            return true;
        }
        catch (IOException iOException) {
            OnyxClient.H.error("Failed to save accounts", (Throwable)iOException);
            return 3 >> 2;
        }
    }

    static {
        f = new GsonBuilder().setPrettyPrinting().create();
        I = UUID.randomUUID().toString();
    }

    public Path d() {
return new File(((Minecraft)((Object)NetworkSupport_465.e)).mcDataDir, "onyx").toPath();
    }

    public NetworkSupport_465() {
        NetworkSupport_465 a;
        NetworkSupport_465 class_465 = a;
        a.d = new ArrayList<NetworkSupport_458>();
        class_465.h = new NetworkSupport_453();
    }

    public Path L() {
        NetworkSupport_465 a;
return a.d().resolve(m);
    }

    public NetworkSupport_453 L() {
        NetworkSupport_465 a;
return a.h;
    }

    public Proxy L() {
        NetworkSupport_465 a;
return a.h.D();
    }

    public List<NetworkSupport_458> L() {
        NetworkSupport_465 a;
return List.copyOf(a.d);
    }

    public static String L() {
return I;
    }

    public CompletableFuture<Void> L() {
        NetworkSupport_465 class_465 = this;
NetworkSupport_458 a = class_465.e;
        if (a == null) {
            return CompletableFuture.completedFuture(null);
        }
        return class_465.d(a);
    }

    public CompletableFuture<Void> d(NetworkSupport_458 class_458) {
        NetworkSupport_458 a = class_458;
        NetworkSupport_465 a2 = this;
return CompletableFuture.runAsync(() -> {
            Session session;
            void a;
            NetworkSupport_465 class_465 = this;
try {
                session = a.L();
            }
            catch (NetworkSupport_474 a2) {
                throw new NetworkSupport_455(a2.getMessage());
            }
            catch (RuntimeException a2) {
                Object[] objectArray = new Object[2];
                objectArray[0] = a.D();
                objectArray[1] = a2;
                OnyxClient.H.error("Unexpected error logging into '{}'", objectArray);
                throw new NetworkSupport_455(new StringBuilder().insert(0, "Unexpected error: ").append(a2).toString());
            }
            class_465.L();
            ((Minecraft)((Object)e)).addScheduledTask(() -> class_465.L(session, (NetworkSupport_458)a));
        }, UtilitySupport_492.L());
    }

    public CompletableFuture<Void> L(NetworkSupport_458 class_458) {
        NetworkSupport_458 a = class_458;
        NetworkSupport_465 a2 = this;
return CompletableFuture.runAsync(() -> {
            NetworkSupport_458 a22 = a;
            NetworkSupport_465 a = this;
try {
                a22.L();
            }
            catch (NetworkSupport_474 a22) {
                throw new NetworkSupport_455(a22.getMessage());
            }
            a.L();
        }, UtilitySupport_492.L());
    }

    /*
     * WARNING - void declaration
     */
    private void L(Session session, NetworkSupport_458 class_458) {
        void a;
        NetworkSupport_458 a2 = class_458;
        NetworkSupport_465 a3 = this;
a3.L((Session)a);
        a3.e = a2;
    }

    public void L(NetworkSupport_458 class_458) {
        NetworkSupport_458 a = class_458;
        NetworkSupport_465 a2 = this;
if (!a2.d.remove(a)) {
            return;
        }
        if (a2.e == a) {
            a2.e = null;
        }
        a2.L();
    }

    public void L() {
        NetworkSupport_465 a;
if (a.i == null) {
            return;
        }
        ((Minecraft)((Object)e)).setSession(a.i);
        a.e = null;
    }
}

