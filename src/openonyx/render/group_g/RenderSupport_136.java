/*
 * Decompiled with CFR.
 */
package openonyx.render.group_g;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.interaction.internal.PlacementResult;
import openonyx.render.group_g.RenderSupport_135;
import openonyx.render.group_g.RenderSupport_137;
import openonyx.render.group_g.RenderMode_134;

public final class RenderSupport_136
implements OnyxListener_001 {
    private final static ResourceLocation f;
    private final static ExecutorService H;
    private final static ResourceLocation e;

    private static void L(Consumer consumer, BufferedImage bufferedImage) {
        BufferedImage a = bufferedImage;
        Consumer a2 = consumer;
a2.accept(a);
    }

    public static void d(BufferedImage bufferedImage, Consumer<ResourceLocation> consumer) {
        Consumer<ResourceLocation> a = consumer;
        BufferedImage a2 = bufferedImage;
((Minecraft)((Object)e)).addScheduledTask(() -> {
            Consumer a = a;
            BufferedImage a2 = a2;
((Minecraft)((Object)e)).getTextureManager().deleteTexture(e);
            ((Minecraft)((Object)e)).getTextureManager().loadTexture(e, new DynamicTexture(a2));
            a.accept(e);
        });
    }

    static {
        e = new ResourceLocation("onyx", "capes/local");
        f = new ResourceLocation("onyx", "capes/source");
        H = Executors.newSingleThreadExecutor(a -> {
Thread thread = new Thread(a, "onyx-cape-loader");
            thread.setDaemon(1 != 0);
            return thread;
        });
    }

    private RenderSupport_136() {
        RenderSupport_136 a;
    }

    public static ResourceLocation L(BufferedImage a) {
((Minecraft)((Object)e)).getTextureManager().deleteTexture(f);
        ((Minecraft)((Object)e)).getTextureManager().loadTexture(f, new DynamicTexture(a));
        return f;
    }

    /*
     * WARNING - void declaration
     */
    public static void L(Consumer<ResourceLocation> consumer, Consumer<String> consumer2) {
        BufferedImage a;
        Consumer<ResourceLocation> consumer3 = consumer;
try {
            a = RenderSupport_135.L();
        }
        catch (IOException iOException) {
            void a2;
            OnyxClient.H.warn("CapeChanger: failed to draw the default cape", (Throwable)iOException);
            a2.accept("Can't draw the default cape");
            return;
        }
        RenderSupport_136.d(a, consumer3);
    }

    /*
     * WARNING - void declaration
     */
    public static void d(String string, Consumer<BufferedImage> consumer, Consumer<String> consumer2) {
        void a;
        Consumer<String> a2 = consumer2;
        String a3 = string;
if (a3.isEmpty()) {
            return;
        }
        H.submit(() -> RenderSupport_136.L(a3, a2, (Consumer)a));
    }

    /*
     * WARNING - void declaration
     */
    private static void L(String string, Consumer consumer, Consumer consumer2) {
        void a;
        void a2;
        BufferedImage bufferedImage;
        String string2 = string;
try {
            bufferedImage = ImageIO.read(new File(string2));
        }
        catch (IOException a3) {
            Object[] objectArray = new Object[2];
            objectArray[0] = string2;
            objectArray[1] = a3;
            OnyxClient.H.warn("CapeChanger: failed to read '{}'", objectArray);
            a2.accept("Can't read that file");
            return;
        }
        if (bufferedImage == null) {
            a2.accept("Not a readable PNG");
            return;
        }
        BufferedImage a3 = bufferedImage;
        ((Minecraft)((Object)e)).addScheduledTask(() -> RenderSupport_136.L((Consumer)a, a3));
    }

    /*
     * WARNING - void declaration
     */
    private static void d(BufferedImage bufferedImage, RenderMode_134 enum_134, int n, double d, double d2, double d3, Consumer consumer) {
        RenderMode_134 a22 = enum_134;
        BufferedImage a = bufferedImage;
try {
            void a3;
            void a4;
            void a5;
            void a6;
            void a7;
            RenderSupport_136.d(RenderSupport_137.L(a, a22, (int)a7, (double)a6, (double)a5, (double)a4), (Consumer<ResourceLocation>)a3);
            return;
        }
        catch (RuntimeException a22) {
            OnyxClient.H.warn("CapeChanger: failed to compose the cape", (Throwable)a22);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void L(BufferedImage object, RenderMode_134 enum_134, int n, double d, double d2, double d3, Consumer<ResourceLocation> consumer) {
        BufferedImage a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        BufferedImage bufferedImage = object;
        object = consumer;
        BufferedImage a7 = bufferedImage;
H.submit(() -> RenderSupport_136.d(a7, (RenderMode_134)a6, (int)a5, (double)a4, (double)a3, (double)a2, (Consumer)((Object)a)));
    }
}

