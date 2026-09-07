/*
 * Decompiled with CFR.
 */
package openonyx.music;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import openonyx.core.OnyxClient;
import openonyx.core.OnyxListener_001;
import openonyx.music.MusicSupport_075;
import openonyx.music.MusicSupport_076;
import openonyx.music.MusicSupport_078;
import openonyx.music.MusicSupport_079;
import openonyx.music.MusicSupport_082;
import openonyx.music.MusicListener_077;
import openonyx.render.RenderMode_138;
import openonyx.render.internal.RenderSupport_174;
import openonyx.ui.UiSupport_546;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MusicSupport_081
implements OnyxListener_001 {
    private final AtomicReference<MusicSupport_075> L;
    private Thread j;
    private int m;
    private boolean h;
    private boolean l;
    private final static HttpClient I = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(8L)).build();
    private final MusicListener_077 d = MusicSupport_081.L();
    private final AtomicReference<MusicSupport_076> i;
    private final AtomicBoolean f;
    private String H;
    private final static long e = 800L;

    public MusicSupport_081() {
        MusicSupport_081 a;
        MusicSupport_081 class_081 = a;
        class_081.L = new AtomicReference();
        a.i = new AtomicReference();
        a.f = new AtomicBoolean(0 != 0);
    }

    private static String L(MusicSupport_078 a) {
if (a.D() != null && !a.D().isEmpty()) {
            return a.D();
        }
        if (a.L() == null || a.L().length == 0) {
            return null;
        }
        return new StringBuilder().insert(0, "track:").append(a.d()).append(" - ").append(a.L()).toString();
    }

    private BufferedImage L(String string) {
        BufferedImage bufferedImage;
        HttpRequest a3;
        MusicSupport_081 class_081 = this;
a3 = HttpRequest.newBuilder(URI.create((String)((Object)a3))).timeout(Duration.ofSeconds(8L)).GET().build();
        Object a22 = I.send(a3, HttpResponse.BodyHandlers.ofByteArray());
        if (a22.statusCode() != 200) {
            return null;
        }
        a22 = new ByteArrayInputStream((byte[])a22.body());
        try {
            bufferedImage = ImageIO.read((InputStream)a22);
        }
        catch (Throwable throwable) {
            try {
                Throwable throwable2;
                try {
                    ((ByteArrayInputStream)a22).close();
                    throwable2 = throwable;
                }
                catch (Throwable a22) {
                    Throwable throwable3 = throwable;
                    throwable2 = throwable3;
                    throwable3.addSuppressed(a22);
                }
                throw throwable2;
            }
            catch (IOException | InterruptedException a3) {
                return null;
            }
        }
        ((ByteArrayInputStream)a22).close();
        return bufferedImage;
    }

    private static BufferedImage L(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = bufferedImage;
int a = Math.min(bufferedImage2.getWidth(), bufferedImage2.getHeight());
        if (0 == bufferedImage2.getWidth() && 0 == bufferedImage2.getHeight()) {
            return bufferedImage2;
        }
        BufferedImage bufferedImage3 = bufferedImage2;
        int n = 0;
        return bufferedImage3.getSubimage((bufferedImage3.getWidth() - 0) / 2, (bufferedImage2.getHeight() - 0) / 2, n, n);
    }

    private void i() {
        ResourceLocation resourceLocation;
        String string;
        MusicSupport_081 class_081 = this;
MusicSupport_078 a = class_081.d.L();
        if (a == null || a.d() == null || a.d().isBlank()) {
            class_081.L.set(null);
            return;
        }
        if (!class_081.h) {
            class_081.h = 1;
            Object[] objectArray = new Object[2];
            objectArray[0] = a.d();
            objectArray[1] = a.L();
            OnyxClient.H.info("Now-playing: detected \"{}\" by \"{}\"", objectArray);
        }
        String string2 = a.d();
        MusicSupport_081 class_0812 = class_081;
        ResourceLocation resourceLocation2 = class_0812.L(MusicSupport_081.L(a), a.D(), a.L(), string2);
        AtomicReference<MusicSupport_075> atomicReference = class_0812.L;
        if (a.L() == null) {
            string = "";
            resourceLocation = resourceLocation2;
        } else {
            string = a.L();
            resourceLocation = resourceLocation2;
        }
        atomicReference.set(new MusicSupport_075(string2, string, resourceLocation, a.L(), a.L(), a.d(), System.nanoTime()));
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation L(String string, String string2, byte[] byArray, String string3) {
        void a;
        ResourceLocation a2;
        BufferedImage a3;
        void a4;
        MusicSupport_081 class_081 = this;
if (a4 == null || a4.isEmpty()) {
            return null;
        }
        Object a5 = class_081.i.get();
        if (a5 != null && a4.equals(((MusicSupport_076)a5).L())) {
            return ((MusicSupport_076)a5).L();
        }
        if (a4.equals(class_081.H)) {
            return null;
        }
        class_081.H = a4;
        Object object = a5 = a3 == null || ((String)((Object)a3)).isEmpty() ? class_081.L((byte[])a2) : class_081.L((String)((Object)a3));
        if (a5 == null) {
            class_081.H = null;
            return null;
        }
        if (!class_081.l) {
            class_081.l = 1;
            Object[] objectArray = new Object[2];
            objectArray[0] = ((BufferedImage)a5).getWidth();
            objectArray[1] = ((BufferedImage)a5).getHeight();
            OnyxClient.H.info("Now-playing: cover art source is {}x{} pixels", objectArray);
        }
        a3 = MusicSupport_081.L((BufferedImage)a5);
        a2 = new ResourceLocation("onyx", new StringBuilder().insert(0, "nowplaying/art-").append(class_081.m += 1).toString());
        a5 = class_081.i.get();
        e.addScheduledTask(() -> class_081.L(a2, a3, (String)a4, (MusicSupport_076)a5, (String)a));
        return null;
    }

    private BufferedImage L(byte[] byArray) {
        BufferedImage a3;
        MusicSupport_081 class_081 = this;
ByteArrayInputStream a22 = new ByteArrayInputStream((byte[])a3);
        try {
            BufferedImage bufferedImage = ImageIO.read(a22);
            if (bufferedImage == null) {
                Object[] objectArray = new Object[1];
                objectArray[0] = ((BufferedImage)a3).length;
                OnyxClient.H.warn("Now-playing: cover art ({} bytes) is in no format ImageIO reads", objectArray);
            }
            a3 = bufferedImage;
        }
        catch (Throwable throwable) {
            try {
                Throwable throwable2;
                try {
                    a22.close();
                    throwable2 = throwable;
                }
                catch (Throwable a3) {
                    Throwable throwable3 = throwable;
                    throwable2 = throwable3;
                    throwable3.addSuppressed(a3);
                }
                throw throwable2;
            }
            catch (IOException a22) {
                OnyxClient.H.warn("Now-playing: failed to decode cover art", (Throwable)a22);
                return null;
            }
        }
        a22.close();
        return a3;
    }

    public MusicSupport_075 L() {
        MusicSupport_081 a;
return a.L.get();
    }

    /*
     * WARNING - void declaration
     */
    private void L(ResourceLocation resourceLocation, BufferedImage bufferedImage, String string, MusicSupport_076 class_076, String string2) {
        void a;
        void a2;
        void a3;
        void a4;
        Object a5 = bufferedImage;
        MusicSupport_081 a6 = this;
e.getTextureManager().loadTexture((ResourceLocation)a4, new DynamicTexture((BufferedImage)a5));
        a6.i.set(new MusicSupport_076((String)a3, (ResourceLocation)a4));
        if (a2 != null) {
            a5 = e.getTextureManager().getTexture(a2.L());
            if (a5 != null) {
                RenderMode_138.d(a5.getGlTextureId());
            }
            e.getTextureManager().deleteTexture(a2.L());
        }
        if ((a5 = a6.L.get()) != null && ((MusicSupport_075)a5).L() == null && a.equals(((MusicSupport_075)a5).d())) {
            a6.L.set(new MusicSupport_075(((MusicSupport_075)a5).d(), ((MusicSupport_075)a5).L(), (ResourceLocation)a4, ((MusicSupport_075)a5).L(), ((MusicSupport_075)a5).d(), ((MusicSupport_075)a5).L(), ((MusicSupport_075)a5).L()));
        }
    }

    public boolean L() {
        MusicSupport_081 a;
if (a.d != null) {
            return 1 != 0;
        }
        return false;
    }

    public synchronized void D() {
        MusicSupport_081 a;
MusicSupport_081 class_081 = a;
        class_081.f.set(0 != 0);
        if (class_081.j != null) {
            a.j.interrupt();
        }
        a.j = null;
        a.L.set(null);
    }

    public synchronized void d() {
        MusicSupport_081 a;
if (a.d == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = Util.getOSType();
            OnyxClient.H.warn("Now-playing: no media source for OS type {}, feature disabled", objectArray);
            return;
        }
        if (a.f.getAndSet(1 != 0)) {
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = a.d.getClass().getSimpleName();
        OnyxClient.H.info("Now-playing: starting {} polling", objectArray);
        MusicSupport_081 class_081 = a;
        a.j = new Thread(() -> {
            MusicSupport_081 class_081 = this;
MusicSupport_081 class_0812 = class_081;
            while (class_0812.f.get()) {
                try {
                    class_081.i();
                }
                catch (RuntimeException a) {
                    OnyxClient.H.warn("Now-playing poll failed", (Throwable)a);
                }
                try {
                    Thread.sleep(800L);
                    class_0812 = class_081;
                }
                catch (InterruptedException a) {
                    return;
                }
            }
        }, "onyx-nowplaying");
        MusicSupport_081 class_0812 = a;
        class_0812.j.setDaemon(1 != 0);
        class_0812.j.start();
    }

    private static MusicListener_077 L() {
switch (Util.getOSType()) {
            case WINDOWS: {
                return new MusicSupport_079();
            }
            case OSX: {
                return new MusicSupport_082();
            }
        }
        return null;
    }
}

