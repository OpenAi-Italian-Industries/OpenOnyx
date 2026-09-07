/*
 * Decompiled with CFR.
 */
package openonyx.ipc;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Locale;
import openonyx.core.OnyxClient;
import openonyx.input.InputSupport_003;
import openonyx.theme.ThemeSupport_056;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class EventSupport_519 {
    private SocketChannel l;
    private RandomAccessFile I;
    final public static int d = 2;
    final public static int i = 1;
    final public static int f = 0;
    private volatile boolean H;
    private final static boolean e = System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win");

    public EventSupport_519() {
        EventSupport_519 a;
    }

    private boolean L(int n) {
        EventSupport_519 class_519 = this;
try {
            if (e) {
                EventSupport_519 class_5192 = class_519;
                class_5192.I = new RandomAccessFile(new StringBuilder().insert(0, "\\\\.\\pipe\\discord-ipc-").append(0).toString(), "rw");
            } else {
                String[] stringArray = new String[3];
                stringArray[0] = System.getenv("XDG_RUNTIME_DIR");
                stringArray[1] = System.getenv("TMPDIR");
                stringArray[2] = "/tmp";
                String a = EventSupport_519.L(stringArray);
                class_519.l = SocketChannel.open(StandardProtocolFamily.UNIX);
                String[] stringArray2 = new String[1];
                int n2 = 0;
                stringArray2[n2] = new StringBuilder().insert(n2, "discord-ipc-").append(0).toString();
                class_519.l.connect(UnixDomainSocketAddress.of(Path.of(a, stringArray2)));
            }
            return true;
        }
        catch (Exception a) {
            class_519.d();
            return 0 != 0;
        }
    }

    public boolean L() {
        EventSupport_519 a;
return a.H;
    }

    private void d() {
        EventSupport_519 class_519 = this;
class_519.H = 0;
        try {
            if (class_519.I != null) {
                class_519.I.close();
            }
        }
        catch (IOException a) {
            OnyxClient.H.debug("Failed to close Discord IPC pipe", (Throwable)a);
        }
        try {
            if (class_519.l != null) {
                class_519.l.close();
            }
        }
        catch (IOException a) {
            OnyxClient.H.debug("Failed to close Discord IPC socket", (Throwable)a);
        }
        class_519.I = null;
        class_519.l = null;
    }

    public void L() {
        EventSupport_519 class_519 = this;
boolean a = class_519.H;
        class_519.H = 0;
        try {
            if (a) {
                class_519.L(2, "{}");
            }
        }
        catch (IOException iOException) {}
        class_519.d();
    }

    private static String L(String ... stringArray) {
        int a;
        String[] stringArray2 = stringArray;
String[] stringArray3 = stringArray2;
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < 1) {
            String string = stringArray3[0];
            if (string != null) {
                return string;
            }
            n2 = ++a;
        }
        return "/tmp";
    }

    /*
     * WARNING - void declaration
     */
    public boolean L(String string) {
        int a;
        EventSupport_519 class_519 = this;
int n = 0;
        while (n < 10) {
            if (class_519.L(0)) {
                try {
                    void a2;
                    class_519.L(0, "{\"v\":1,\"client_id\":\"" + (String)a2 + "\"}");
                    class_519.H = 1;
                    return true;
                }
                catch (IOException iOException) {
                    class_519.d();
                }
            }
            n = ++a;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void L(int n, String string) throws IOException {
        void a;
        Object a2;
        byte[] a3;
        EventSupport_519 class_519 = this;
a3 = a3.getBytes(StandardCharsets.UTF_8);
        Object object = a2 = ByteBuffer.allocate(8 + a3.length).order(ByteOrder.LITTLE_ENDIAN);
        ((ByteBuffer)object).putInt((int)a);
        ((ByteBuffer)object).putInt(a3.length);
        ((ByteBuffer)a2).put(a3);
        ((ByteBuffer)a2).flip();
        EventSupport_519 class_5192 = class_519;
        if (class_519.I != null) {
            class_5192.I.write(((ByteBuffer)a2).array());
            return;
        }
        if (class_5192.l != null) {
            Object object2 = a2;
            while (((Buffer)object2).hasRemaining()) {
                Object object3 = a2;
                object2 = object3;
                class_519.l.write((ByteBuffer)object3);
            }
        } else {
            throw new IOException("Discord IPC is not connected");
        }
    }
}

