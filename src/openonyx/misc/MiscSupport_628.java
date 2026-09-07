/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.misc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.history.Setting;
import openonyx.history.SettingSupport_036;
import openonyx.history.SettingValue;
import openonyx.history.UndoManager;
import openonyx.misc.MiscSupport_630;
import openonyx.misc.MiscListener_629;
import openonyx.render.RenderSupport_111;
import openonyx.render.RenderSupport_120;
import openonyx.utilities.FileUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MiscSupport_628
implements OnyxListener_001 {
    private final static String I = ".json";
    private final static Gson d;
    final public static String i = "default";
    private String f;
    private final static int H = 1;
    private final static Pattern e;

    /*
     * WARNING - void declaration
     */
    public MiscSupport_630 L(String string, List<String> list) {
        void a;
        ArrayList a2 = list;
        MiscSupport_628 a3 = this;
Object object = a2 == null ? Set.of() : new LinkedHashSet(a2);
        a2 = new ArrayList();
        JsonObject jsonObject = MiscSupport_628.L(a3.L((String)a));
        if (jsonObject == null) {
            a2.addAll(object);
            return new MiscSupport_630(0, List.copyOf(a2));
        }
        int n = 0;
        object = object.iterator();
        block0: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                String string2 = (String)object.next();
                if (a.equals(string2) || !a3.i(string2)) {
                    a2.add(string2);
                    object2 = object;
                    continue;
                }
                JsonObject jsonObject2 = a3.L(string2);
                JsonObject jsonObject3 = MiscSupport_628.L(jsonObject2);
                if (jsonObject3 == null) {
                    object2 = object;
                    a2.add(string2);
                    continue;
                }
                MiscSupport_628.L(jsonObject, jsonObject3);
                if (a3.L(string2, jsonObject2)) {
                    ++n;
                    continue block0;
                }
                a2.add(string2);
                continue block0;
            }
            break;
        }
        return new MiscSupport_630(0, List.copyOf(a2));
    }

    /*
     * WARNING - void declaration
     */
    public String D(String string) {
        int n;
        void a;
        MiscSupport_628 class_628 = this;
if (!class_628.i((String)a)) {
            return a;
        }
        int n2 = 2;
        while (n2 < 10000) {
            Object a2 = new StringBuilder().insert(0, "_").append(2).toString();
            int n3 = Math.min(a.length(), 64 - ((String)a2).length());
            int n4 = 0;
            a2 = new StringBuilder().insert(n4, a.substring(n4, n3)).append((String)a2).toString();
            if (!class_628.i((String)a2)) {
                return a2;
            }
            n2 = ++n;
        }
        return null;
    }

    public MiscSupport_628() {
        MiscSupport_628 a;
    }

    /*
     * WARNING - void declaration
     */
    public String d(String string) {
        int n;
        void a;
        MiscSupport_628 class_628 = this;
if (!class_628.i((String)a)) {
            return null;
        }
        int n2 = 1;
        while (n2 < 10000) {
            Object a2 = 1 == 1 ? "_copy" : new StringBuilder().insert(0, "_copy_").append(1).toString();
            int n3 = Math.min(a.length(), 64 - ((String)a2).length());
            int n4 = 0;
            a2 = new StringBuilder().insert(n4, a.substring(n4, n3)).append((String)a2).toString();
            if (!class_628.i((String)a2)) {
                try {
                    Files.copy(class_628.L((String)a), class_628.L((String)a2), new CopyOption[0]);
                    return a2;
                }
                catch (IOException iOException) {
                    Object[] objectArray = new Object[3];
                    objectArray[0] = a;
                    objectArray[1] = a2;
                    objectArray[2] = iOException;
                    OnyxClient.H.error("Failed to duplicate config '{}' as '{}'", objectArray);
                    return null;
                }
            }
            n2 = ++n;
        }
        return null;
    }

    private Path D() {
        MiscSupport_628 a;
return a.d().resolve("last-config.txt");
    }

    /*
     * WARNING - void declaration
     */
    private boolean L(String string, JsonObject jsonObject) {
        void a;
        JsonObject a22 = jsonObject;
        MiscSupport_628 a3 = this;
try {
            Files.createDirectories(a3.L(), new FileAttribute[0]);
            Files.write(a3.L((String)a), d.toJson(a22).getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            return true;
        }
        catch (IOException a22) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = a22;
            OnyxClient.H.error("Failed to write config '{}'", objectArray);
            return 0 != 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void L(SettingValue<?> class_038, JsonElement jsonElement) {
        void a;
        JsonElement a22 = jsonElement;
        MiscSupport_628 a3 = this;
if (a22 == null || a22.isJsonNull()) {
            return;
        }
        try {
            a.L(a22);
            return;
        }
        catch (RuntimeException a22) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a.L();
            objectArray[1] = a22;
            OnyxClient.H.warn("Failed to load setting '{}'", objectArray);
            return;
        }
    }

    @Generated
    public String D() {
        MiscSupport_628 a;
return a.f;
    }

    /*
     * WARNING - void declaration
     */
    public boolean F(String string) {
        Object a3;
        void a2;
        MiscSupport_628 class_628 = this;
if (!class_628.h((String)a2)) {
            return 0 != 0;
        }
        Object object = a3 = new JsonObject();
        ((JsonObject)object).addProperty("version", 1);
        MiscSupport_628 class_6282 = class_628;
        ((JsonObject)object).add("modules", class_6282.L());
        Path path = class_6282.L().resolve(new StringBuilder().insert(0, (String)a2).append(I).append(".tmp").toString());
        try {
            Files.createDirectories(class_628.L(), new FileAttribute[0]);
            Files.write(path, d.toJson((JsonElement)a3).getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            try {
                CopyOption[] copyOptionArray = new CopyOption[2];
                copyOptionArray[0] = StandardCopyOption.ATOMIC_MOVE;
                copyOptionArray[1] = StandardCopyOption.REPLACE_EXISTING;
                Files.move(path, class_628.L((String)a2), copyOptionArray);
            }
            catch (AtomicMoveNotSupportedException a3) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                Files.move(path, class_628.L((String)a2), copyOptionArray);
            }
            return true;
        }
        catch (IOException a3) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a2;
            objectArray[1] = a3;
            OnyxClient.H.error("Failed to save config '{}'", objectArray);
            return 5 >> 3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private JsonObject L(String string) {
        void a;
        MiscSupport_628 class_628 = this;
if (!class_628.i((String)a)) {
            return null;
        }
        try {
            String a2 = new String(Files.readAllBytes(class_628.L((String)a)), StandardCharsets.UTF_8);
            JsonElement jsonElement = new JsonParser().parse(a2);
            if (jsonElement.isJsonObject()) {
                return jsonElement.getAsJsonObject();
            }
            return null;
        }
        catch (IOException | RuntimeException a2) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = a2;
            OnyxClient.H.error("Failed to read config '{}'", objectArray);
            return null;
        }
    }

    private static void L(Setting class_031) {
        Object a;
        Setting class_0312 = class_031;
if (class_0312 instanceof SettingValue) {
            a = (SettingValue)class_0312;
            ((SettingValue)a).d();
            return;
        }
        if (class_0312 instanceof SettingSupport_036) {
            a = (SettingSupport_036)class_0312;
            if (((SettingSupport_036)a).L() != null) {
                ((SettingSupport_036)a).L().d();
            }
            Object object = a = ((SettingSupport_036)a).L().iterator();
            while (object.hasNext()) {
                MiscSupport_628.L((Setting)a.next());
                object = a;
            }
        }
    }

    public void i() {
        MiscSupport_628 class_628 = this;
String a = class_628.L();
        if (a != null && class_628.D(a)) {
            return;
        }
        class_628.D(i);
    }

    /*
     * WARNING - void declaration
     */
    private void d(String string) {
        void a;
        MiscSupport_628 class_628 = this;
try {
            Files.createDirectories(class_628.d(), new FileAttribute[0]);
            Files.write(class_628.D(), a.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
            return;
        }
        catch (IOException a2) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = a2;
            OnyxClient.H.error("Failed to remember config '{}'", objectArray);
            return;
        }
    }

    public boolean l(String string) {
        String a = string;
        MiscSupport_628 a2 = this;
if (!a2.h(a) || a2.i(a)) {
            return false;
        }
        a2.D();
        return a2.F(a);
    }

    public String d() {
        MiscSupport_628 a;
if (a.f == null) {
            return i;
        }
        return a.f;
    }

    /*
     * WARNING - void declaration
     */
    private static void L(JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = jsonObject;
Iterator<Module> a = OnyxClient.l.L().iterator();
        block0: while (true) {
            Iterator<Module> iterator = a;
            while (iterator.hasNext()) {
                void a2;
                Module class_227 = (Module)a.next();
                if (class_227.L() != ModuleCategory.f && class_227.L() != ModuleCategory.l) {
                    iterator = a;
                    continue;
                }
                JsonElement jsonElement = jsonObject3.get(class_227.d());
                if (jsonElement == null) continue block0;
                if (!jsonElement.isJsonObject()) {
                    iterator = a;
                    continue;
                }
                jsonElement = jsonElement.getAsJsonObject();
                JsonElement jsonElement2 = a2.get(class_227.d());
                JsonObject jsonObject4 = jsonElement2 != null && jsonElement2.isJsonObject() ? jsonElement2.getAsJsonObject() : new JsonObject();
                iterator = a;
                JsonElement jsonElement3 = jsonElement;
                MiscSupport_628.L((JsonObject)jsonElement3, jsonObject4, "enabled");
                MiscSupport_628.L((JsonObject)jsonElement3, jsonObject4, "settings");
                a2.add(class_227.d(), jsonObject4);
            }
            break;
        }
    }

    public boolean h(String string) {
        String a = string;
        MiscSupport_628 a2 = this;
if (a != null && e.matcher(a).matches()) {
            return 1 != 0;
        }
        return false;
    }

    public Path d() {
return new File(((Minecraft)((Object)MiscSupport_628.e)).mcDataDir, "onyx").toPath();
    }

    private void L(String string) {
        String a = string;
        MiscSupport_628 a2 = this;
a2.f = a;
        a2.d(a);
    }

    /*
     * WARNING - void declaration
     */
    private void d(JsonObject jsonObject, int n) {
        void a;
        int a2 = 0;
        MiscSupport_628 a3 = this;
a3.L((JsonObject)a, 0);
    }

    public Path L(String string) {
        String a = string;
        MiscSupport_628 a2 = this;
return a2.L().resolve(new StringBuilder().insert(0, a).append(I).toString());
    }

    /*
     * WARNING - void declaration
     */
    private void L(JsonObject jsonObject, int n) {
        MiscSupport_628 class_628 = this;
Iterator<Module> a = OnyxClient.l.L().iterator();
        block0: while (true) {
            Iterator<Module> iterator = a;
            while (iterator.hasNext()) {
                Object object;
                void a2;
                OnyxListener_001 a3 = a.next();
                JsonElement jsonElement = a2.get(((Module)a3).d());
                if (jsonElement == null) continue block0;
                if (!jsonElement.isJsonObject()) {
                    iterator = a;
                    continue;
                }
                jsonElement = jsonElement.getAsJsonObject();
                MiscSupport_628 class_6282 = class_628;
                class_6282.L(((Module)a3).L(), ((JsonObject)jsonElement).get("bind"));
                class_6282.L(((Module)a3).L(), ((JsonObject)jsonElement).get("bindMode"));
                Object object2 = ((JsonObject)jsonElement).get("settings");
                if (object2 != null && ((JsonElement)object2).isJsonObject()) {
                    object = ((JsonElement)object2).getAsJsonObject();
                    Object object3 = object2 = ((Module)a3).L().iterator();
                    while (object3.hasNext()) {
                        SettingSupport_036.L((Setting)object2.next(), (JsonObject)object);
                        object3 = object2;
                    }
                }
                if (a3 instanceof MiscListener_629) {
                    object = (MiscListener_629)((Object)a3);
                    object.L();
                }
                if (!((Module)a3).D()) {
                    iterator = a;
                    continue;
                }
                object = ((JsonObject)jsonElement).get("enabled");
                if (object == null || !((JsonElement)object).isJsonPrimitive() || !((JsonElement)object).getAsJsonPrimitive().isBoolean()) continue block0;
                ((Module)a3).L(((JsonElement)object).getAsBoolean());
                continue block0;
            }
            break;
        }
    }

    private static JsonObject L(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
if (jsonObject2 == null) {
            return null;
        }
        JsonElement a = jsonObject2.get("modules");
        if (a != null && a.isJsonObject()) {
            return a.getAsJsonObject();
        }
        return null;
    }

    public boolean L() {
        MiscSupport_628 a;
MiscSupport_628 class_628 = a;
        return class_628.F(class_628.d());
    }

    public boolean I(String string) {
        String a = string;
        MiscSupport_628 a2 = this;
if (a != null && a.equals(a2.f)) {
            return --1 != 0;
        }
        return false;
    }

    private void D() {
UndoManager.L(() -> {
            Iterator<Module> iterator;
Iterator<Module> iterator2 = iterator = OnyxClient.l.L().iterator();
            while (iterator2.hasNext()) {
                MiscListener_629 interface_629;
                Module class_227 = iterator.next();
                if (class_227.D()) {
                    class_227.L(5 >> 3);
                }
                Iterator<Setting> iterator3 = class_227.L().iterator();
                while (iterator3.hasNext()) {
                    MiscSupport_628.L(interface_629.next());
                    iterator3 = interface_629;
                }
                if (class_227 instanceof MiscListener_629) {
                    interface_629 = (MiscListener_629)((Object)class_227);
                    interface_629.L();
                }
                class_227.i();
                iterator2 = iterator;
            }
        });
    }

    public boolean i(String string) {
        String a = string;
        MiscSupport_628 a2 = this;
if (a2.h(a)) {
            if (Files.isRegularFile(a2.L(a), new LinkOption[0])) {
                return 1 != 0;
            }
        }
        return false;
    }

    private String L() {
        MiscSupport_628 class_628 = this;
Object a22 = class_628.D();
        if (!Files.isRegularFile((Path)a22, new LinkOption[0])) {
            return null;
        }
        try {
            a22 = new String(Files.readAllBytes((Path)a22), StandardCharsets.UTF_8).trim();
            if (class_628.i((String)a22)) {
                return a22;
            }
            return null;
        }
        catch (IOException a22) {
            OnyxClient.H.error("Failed to read the last config", (Throwable)a22);
            return null;
        }
    }

    private static JsonElement L(JsonElement a) {
return new JsonParser().parse(a.toString());
    }

    public void d() {
        MiscSupport_628 class_628 = this;
try {
            Files.createDirectories(class_628.L(), new FileAttribute[0]);
        }
        catch (IOException a) {
            OnyxClient.H.error("Failed to create config folder", (Throwable)a);
            return;
        }
        FileUtils.L(class_628.L());
    }

    /*
     * WARNING - void declaration
     */
    public boolean D(String string) {
        JsonElement jsonElement;
        void a;
        MiscSupport_628 class_628 = this;
if (!class_628.i((String)a)) {
            return 0 != 0;
        }
        try {
            String a2 = new String(Files.readAllBytes(class_628.L((String)a)), StandardCharsets.UTF_8);
            jsonElement = new JsonParser().parse(a2).getAsJsonObject();
        }
        catch (IOException | RuntimeException a2) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = a2;
            OnyxClient.H.error("Failed to read config '{}'", objectArray);
            return 5 >> 3;
        }
        int a2 = 1;
        JsonElement jsonElement2 = ((JsonObject)jsonElement).get("version");
        if (jsonElement2 != null && jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isNumber()) {
            a2 = jsonElement2.getAsInt();
        }
        if ((jsonElement = ((JsonObject)jsonElement).get("modules")) == null || !jsonElement.isJsonObject()) {
            return false;
        }
        jsonElement = jsonElement.getAsJsonObject();
        int n = a2;
        UndoManager.L(() -> class_628.d((JsonObject)jsonElement, 0));
        if (a2 < 1) {
            class_628.F((String)a);
        }
        class_628.L((String)a);
        return --1 != 0;
    }

    private JsonObject L() {
        Iterator<Module> iterator;
        MiscSupport_628 class_628 = this;
JsonObject jsonObject = new JsonObject();
        Iterator<Module> iterator2 = iterator = OnyxClient.l.L().iterator();
        while (iterator2.hasNext()) {
            OnyxListener_001 a = iterator.next();
            JsonObject jsonObject2 = new JsonObject();
            if (((Module)a).D()) {
                jsonObject2.addProperty("enabled", ((Module)a).d());
            }
            jsonObject2.add("bind", ((Module)a).L().L());
            jsonObject2.add("bindMode", ((Module)a).L().L());
            JsonObject jsonObject3 = new JsonObject();
            Iterator<Setting> iterator3 = ((Module)a).L().iterator();
            while (iterator3.hasNext()) {
                Iterator<Setting> iterator4;
                Setting class_031 = iterator4.next();
                if (!class_031.I()) {
                    iterator3 = iterator4;
                    continue;
                }
                jsonObject3.add(class_031.L(), class_031.L());
                iterator3 = iterator4;
            }
            jsonObject2.add("settings", jsonObject3);
            iterator2 = iterator;
            jsonObject.add(((Module)a).d(), jsonObject2);
        }
        return jsonObject;
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(String string) {
        void a;
        MiscSupport_628 class_628 = this;
if (!class_628.h((String)a)) {
            return 5 >> 3;
        }
        try {
            boolean a2 = Files.deleteIfExists(class_628.L((String)a));
            if (a2 && class_628.I((String)a)) {
                class_628.f = null;
                class_628.L();
            }
            return a2;
        }
        catch (IOException a2) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = a2;
            OnyxClient.H.error("Failed to delete config '{}'", objectArray);
            return 3 >> 2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void L(JsonObject jsonObject, JsonObject jsonObject2, String string) {
        void a;
        String a2 = string;
        JsonObject a3 = jsonObject;
JsonElement jsonElement = a3.get(a2);
        void v0 = a;
        if (jsonElement == null) {
            v0.remove(a2);
            return;
        }
        v0.add(a2, MiscSupport_628.L(jsonElement));
    }

    public Path L() {
        MiscSupport_628 a;
return a.d().resolve("configs");
    }

    public List<String> L() {
        List<String> list;
        block9: {
            MiscSupport_628 class_628 = this;
if (!Files.isDirectory(class_628.L(), new LinkOption[0])) {
                return List.of();
            }
            Stream<Path> a22 = Files.list(class_628.L());
            try {
                list = a22.filter(a -> {
return Files.isRegularFile(a, new LinkOption[0]);
                }).map(a -> {
return a.getFileName().toString();
                }).filter(a -> {
return a.endsWith(I);
                }).map(a -> {
String string = a;
                    return string.substring(0, string.length() - I.length());
                }).filter(class_628::h).sorted().toList();
                if (a22 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    Throwable throwable2;
                    block10: {
                        if (a22 != null) {
                            try {
                                a22.close();
                                throwable2 = throwable;
                                break block10;
                            }
                            catch (Throwable throwable3) {
                                throwable.addSuppressed(throwable3);
                            }
                        }
                        throwable2 = throwable;
                    }
                    throw throwable2;
                }
                catch (IOException a22) {
                    OnyxClient.H.error("Failed to list configs", (Throwable)a22);
                    return List.of();
                }
            }
            a22.close();
        }
        return list;
    }

    static {
        e = Pattern.compile("[a-zA-Z0-9_-]{1,64}");
        d = new GsonBuilder().setPrettyPrinting().create();
    }

    private void L() {
        MiscSupport_628 class_628 = this;
try {
            Files.deleteIfExists(class_628.D());
            return;
        }
        catch (IOException a) {
            OnyxClient.H.error("Failed to forget the last config", (Throwable)a);
            return;
        }
    }
}

