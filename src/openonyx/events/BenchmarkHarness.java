/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ScreenShotHelper;
import openonyx.core.OnyxClient;
import openonyx.events.BenchmarkSample;
import openonyx.events.BenchmarkScenario;
import openonyx.events.BenchmarkPhase;
import openonyx.features.Module;
import openonyx.render.RenderSupport_099;
import openonyx.skins.SkinSupport_073;

public final class BenchmarkHarness {
    private static boolean A;
    private final static List<BenchmarkScenario> K;
    private static float B;
    private final static String C;
    private final static boolean J;
    private static double D;
    private final static double c = 4.0;
    private final static boolean a;
    private final static long k;
    private static boolean g;
    private static BenchmarkPhase M;
    private final static long L = 700000000L;
    private static long j;
    private final static double m = 0.18;
    private final static long h;
    private final static List<Long> l;
    private static long I;
    private static int d;
    private static double i;
    private final static List<BenchmarkSample> f;
    private static double H;
    private static float e;

    private BenchmarkHarness() {
        BenchmarkHarness a;
    }

    private static void i(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
if (!A || minecraft2.thePlayer == null) {
            return;
        }
        Minecraft a = d < K.size() ? K.get(d) : null;
        float f2 = a != null && ((BenchmarkScenario)((Object)a)).L() != null ? ((BenchmarkScenario)((Object)a)).L().floatValue() : e;
        float f3 = a != null && ((BenchmarkScenario)((Object)a)).d() != null ? ((BenchmarkScenario)((Object)a)).d().floatValue() : B;
        BenchmarkHarness.L(minecraft2);
        if (J) {
            double d;
            Minecraft minecraft3 = minecraft2;
            minecraft3.gameSettings.thirdPersonView = 1;
            minecraft3.thePlayer.rotationYaw = f2;
            minecraft3.thePlayer.rotationPitch = f3;
            double d2 = minecraft3.thePlayer.posX - i;
            double d3 = minecraft3.thePlayer.posZ - H;
            double d4 = d2;
            double d5 = d3;
            double d6 = Math.sqrt(d4 * d4 + d5 * d5);
            if (d > 4.0) {
                Minecraft minecraft4 = minecraft2;
                minecraft4.thePlayer.motionX = -d2 / d6 * 0.18;
                minecraft4.thePlayer.motionZ = -d3 / d6 * 0.18;
                return;
            }
            d2 = (double)(System.nanoTime() % 4000000000L) / 4.0E9 * 2.0 * Math.PI;
            Minecraft minecraft5 = minecraft2;
            minecraft5.thePlayer.motionX = Math.cos(d2) * 0.18;
            minecraft5.thePlayer.motionZ = Math.sin(d2) * 0.18;
            return;
        }
        minecraft2.thePlayer.setPositionAndRotation(i, D, H, f2, f3);
        minecraft2.thePlayer.motionX = 0.0;
        minecraft2.thePlayer.motionY = 0.0;
        minecraft2.thePlayer.motionZ = 0.0;
        minecraft2.thePlayer.onGround = 1;
    }

    private static void D(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
Iterator<String> a = K.get(d).L().iterator();
        while (a.hasNext()) {
            Module class_227 = BenchmarkHarness.L((String)a.next());
            if (class_227 == null) continue;
            class_227.L(1 != 0);
        }
    }

    private static void D() {
        Object object;
StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray = new Object[5];
        objectArray[0] = "phase";
        objectArray[1] = "fps";
        objectArray[2] = "median ms";
        objectArray[3] = "p95 ms";
        objectArray[4] = "vs base";
        stringBuilder.append(String.format(Locale.ROOT, "%-28s %8s %10s %10s %10s%n", objectArray));
        double d = f.isEmpty() ? 0.0 : f.get(0).L();
        Object object2 = object = f.iterator();
        while (object2.hasNext()) {
            BenchmarkSample class_531 = object.next();
            Object[] objectArray2 = new Object[5];
            objectArray2[0] = class_531.L();
            objectArray2[1] = class_531.L();
            objectArray2[2] = class_531.D();
            objectArray2[3] = class_531.d();
            objectArray2[4] = class_531.L() - d;
            stringBuilder.append(String.format(Locale.ROOT, "%-28s %8.1f %10.2f %10.2f %+10.1f%n", objectArray2));
            object2 = object;
        }
        System.out.println(new StringBuilder().insert(0, "[onyx-bench] results\n").append((Object)stringBuilder).toString());
        object = System.getProperty("onyx.bench.out", "");
        if (((String)object).isEmpty()) {
            return;
        }
        try {
            Files.writeString(Path.of((String)object, new String[0]), (CharSequence)stringBuilder.toString(), StandardCharsets.UTF_8, new OpenOption[0]);
            return;
        }
        catch (IOException iOException) {
            BenchmarkHarness.d(new StringBuilder().insert(0, "could not write report: ").append(iOException).toString());
            return;
        }
    }

    private static boolean L(List list, String string) {
        String a = string;
        List a2 = list;
return a2.stream().anyMatch(string2 -> {
            String a = string2;
            String a2 = a;
return a.equalsIgnoreCase(a2);
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d() {
if (!a || M == BenchmarkPhase.H) {
            return;
        }
        Minecraft minecraft = Minecraft.getMinecraft();
        long l = System.nanoTime();
        switch (M.ordinal()) {
            case 0: {
                if (!(minecraft.currentScreen instanceof GuiMainMenu)) break;
                Minecraft minecraft2 = minecraft;
                g = minecraft2.gameSettings.pauseOnLostFocus;
                minecraft2.gameSettings.pauseOnLostFocus = 0;
                BenchmarkHarness.d(new StringBuilder().insert(0, "joining world '").append(C).append("'").toString());
                minecraft2.launchIntegratedServer(C, C, null);
                BenchmarkHarness.L(BenchmarkPhase.i, l);
                return;
            }
            case 1: {
                if (minecraft.thePlayer == null || minecraft.theWorld == null) break;
                Minecraft minecraft3 = minecraft;
                minecraft3.displayGuiScreen(null);
                BenchmarkHarness.d(minecraft3);
                BenchmarkHarness.L();
                BenchmarkHarness.d("world up, warming up");
                BenchmarkHarness.L(BenchmarkPhase.f, l);
                return;
            }
            case 2: {
                BenchmarkHarness.i(minecraft);
                if (l - j < k) break;
                BenchmarkHarness.L(minecraft, l);
                return;
            }
            case 3: {
                BenchmarkHarness.i(minecraft);
                if (l - j < 700000000L) break;
                BenchmarkHarness.l.clear();
                I = l;
                BenchmarkHarness.L(BenchmarkPhase.l, l);
                return;
            }
            case 4: {
                BenchmarkHarness.i(minecraft);
                BenchmarkHarness.l.add(l - I);
                I = l;
                if (l - j < h) break;
                BenchmarkHarness.L(minecraft, K.get(d).L());
                BenchmarkHarness.L(K.get(d).L());
                BenchmarkHarness.D(minecraft);
                if ((d += 1) >= K.size()) {
                    BenchmarkHarness.D();
                    M = BenchmarkPhase.H;
                    minecraft.gameSettings.pauseOnLostFocus = g;
                    minecraft.shutdown();
                    return;
                }
                BenchmarkHarness.L(minecraft, l);
                return;
            }
        }
    }

    private static Module L(String string) {
        String string2 = string;
if (OnyxClient.l == null) {
            return null;
        }
        for (Module class_227 : OnyxClient.l.L()) {
            if (!class_227.d().equalsIgnoreCase(string2)) continue;
            return class_227;
        }
        BenchmarkHarness.d(new StringBuilder().insert(0, "unknown module '").append(string2).append("'").toString());
        return null;
    }

    private static void L() {
String string = System.getProperty("onyx.bench.modules", "");
        K.add(new BenchmarkScenario("baseline", List.of(), null, null));
        if (!string.isEmpty() && !string.equals("-")) {
            int n;
            String[] stringArray = string.split(",");
            int n2 = stringArray.length;
            int n3 = 0;
            while (n3 < n2) {
                String string2 = stringArray[0].trim();
                if (!string2.isEmpty()) {
                    if (string2.equalsIgnoreCase("ALL")) {
                        K.add(new BenchmarkScenario("all render off", BenchmarkHarness.L(), null, null));
                    } else if (string2.equalsIgnoreCase("gui")) {
                        K.add(new BenchmarkScenario("gui", List.of(), null, null));
                    } else {
                        String string3 = string2;
                        if (string2.toLowerCase(Locale.ROOT).startsWith("only:")) {
                            var5_5 = List.of(string3.substring(5).split("\\+", -1)).stream().map(String::trim).toList();
                            ArrayList<String> arrayList = new ArrayList<String>(BenchmarkHarness.L());
                            arrayList.removeIf(arg_0 -> BenchmarkHarness.L((List)var5_5, arg_0));
                            K.add(new BenchmarkScenario(string2, arrayList, null, null));
                        } else if (string3.toLowerCase(Locale.ROOT).startsWith("look:")) {
                            var5_5 = string2.substring(5).split("/");
                            K.add(new BenchmarkScenario(string2, List.of(), Float.valueOf(Float.parseFloat(var5_5[0].trim())), Float.valueOf(Float.parseFloat(var5_5[1].trim()))));
                        } else {
                            K.add(new BenchmarkScenario(new StringBuilder().insert(0, "-").append(string2).toString(), List.of(string2.split("\\+", -1)).stream().map(String::trim).toList(), null, null));
                        }
                    }
                }
                n3 = ++n;
            }
        }
        K.add(new BenchmarkScenario("baseline (repeat)", List.of(), null, null));
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Minecraft minecraft, String string) {
        Minecraft minecraft2 = minecraft;
Object a22 = System.getProperty("onyx.bench.shots", "");
        if (((String)a22).isEmpty()) {
            return;
        }
        try {
            void a;
            a22 = new File((String)a22);
            ((File)a22).mkdirs();
            Minecraft minecraft3 = minecraft2;
            ScreenShotHelper.saveScreenshot((File)a22, a.replaceAll("[^A-Za-z0-9-]", "_") + ".png", minecraft3.displayWidth, minecraft3.displayHeight, minecraft2.getFramebuffer());
            return;
        }
        catch (Throwable a22) {
            BenchmarkHarness.d(new StringBuilder().insert(0, "screenshot failed: ").append(a22).toString());
            return;
        }
    }

    private static void L(BenchmarkPhase a, long a2) {
M = a;
        j = a2;
    }

    private static void d(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
String[] a = System.getProperty("onyx.bench.pose", "");
        if (!a.isEmpty() && (a = a.split(",")).length == 5) {
            i = Double.parseDouble(a[0].trim());
            D = Double.parseDouble(a[1].trim());
            H = Double.parseDouble(a[2].trim());
            e = Float.parseFloat(a[3].trim());
            B = Float.parseFloat(a[4].trim());
            A = 1;
            return;
        }
        Minecraft minecraft3 = minecraft2;
        i = minecraft3.thePlayer.posX;
        D = minecraft3.thePlayer.posY;
        H = minecraft3.thePlayer.posZ;
        e = 0.0f;
        B = 0.0f;
        A = 1;
        Object[] objectArray = new Object[5];
        objectArray[0] = i;
        objectArray[1] = D;
        objectArray[2] = H;
        objectArray[3] = minecraft2.displayWidth;
        objectArray[4] = minecraft2.displayHeight;
        BenchmarkHarness.d(String.format(Locale.ROOT, "pose %.2f,%.2f,%.2f  display %dx%d", objectArray));
    }

    private static void L(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
Object a = System.getProperty("onyx.bench.hold", "");
        if (((String)a).isEmpty()) {
            return;
        }
        if ((a = Item.getByNameOrId((String)a)) == null) {
            return;
        }
        ItemStack itemStack = minecraft2.thePlayer.getHeldItem();
        if (itemStack != null && itemStack.getItem() == a) {
            return;
        }
        minecraft2.thePlayer.inventory.mainInventory[minecraft2.thePlayer.inventory.currentItem] = new ItemStack((Item)a);
    }

    private static void d(String a) {
System.out.println(new StringBuilder().insert(0, "[onyx-bench] ").append(a).toString());
    }

    private static void L(String string) {
        int n;
        String string2 = string;
if (l.size() < 4) {
            f.add(new BenchmarkSample(string2, 0.0, 0.0, 0.0));
            return;
        }
        Object a = new long[l.size()];
        long l = 0L;
        int n2 = 0;
        while (n2 < BenchmarkHarness.l.size()) {
            int n3 = 0;
            a[n3] = BenchmarkHarness.l.get(n3);
            l += a[n++];
            n2 = 0;
        }
        Object object = a;
        Arrays.sort((long[])object);
        double d = (double)BenchmarkHarness.l.size() / ((double)l / 1.0E9);
        double d2 = (double)object[((Object)object).length / 2] / 1000000.0;
        Object object2 = a;
        double d3 = (double)object2[(int)((double)((Object)object2).length * 0.95)] / 1000000.0;
        f.add(new BenchmarkSample(string2, d, d2, d3));
        Object[] objectArray = new Object[4];
        objectArray[0] = string2;
        objectArray[1] = d;
        objectArray[2] = d2;
        objectArray[3] = d3;
        BenchmarkHarness.d(String.format(Locale.ROOT, "  %-28s %6.1f fps  median %5.2f ms  p95 %5.2f ms", objectArray));
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Minecraft minecraft, long l) {
        void a;
        BenchmarkScenario class_533;
        Minecraft minecraft2 = minecraft;
BenchmarkScenario a2 = K.get(d);
        if (a2.L().equalsIgnoreCase("gui")) {
            OnyxClient.l.k.L(3 >> 1);
            class_533 = a2;
        } else {
            if (minecraft2.currentScreen != null) {
                minecraft2.displayGuiScreen(null);
            }
            class_533 = a2;
        }
        Iterator<String> iterator = class_533.L().iterator();
        while (iterator.hasNext()) {
            Module class_227 = BenchmarkHarness.L(iterator.next());
            if (class_227 == null) continue;
            class_227.L(0 != 0);
        }
        BenchmarkHarness.d(new StringBuilder().insert(0, "phase ").append(d + 1).append("/").append(K.size()).append(": ").append(a2.L()).toString());
        BenchmarkHarness.L(BenchmarkPhase.e, (long)a);
    }

    static {
        C = System.getProperty("onyx.bench");
        a = C != null && !C.isEmpty() ? 1 : 0;
        k = Long.getLong("onyx.bench.warmup", 12000L) * 1000000L;
        h = Long.getLong("onyx.bench.measure", 4000L) * 1000000L;
        K = new ArrayList<BenchmarkScenario>();
        f = new ArrayList<BenchmarkSample>();
        l = new ArrayList<Long>();
        M = BenchmarkPhase.I;
        g = 1;
        J = System.getProperty("onyx.bench.walk") != null ? 1 : 0;
    }

    private static List<String> L() {
ArrayList<String> arrayList = new ArrayList<String>();
        if (OnyxClient.l == null) {
            return arrayList;
        }
        for (Module class_227 : OnyxClient.l.L()) {
            if (!class_227.d()) continue;
            arrayList.add(class_227.d());
        }
        return arrayList;
    }
}

