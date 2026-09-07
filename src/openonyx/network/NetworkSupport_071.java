/*
 * Decompiled with CFR.
 */
package openonyx.network;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.LambdaMetafactory;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import openonyx.connection.NetworkMode_456;
import openonyx.network.NetworkSupport_067;
import openonyx.network.NetworkSupport_070;
import openonyx.theme.internal.ThemeSupport_061;
import openonyx.utilities.UtilitySupport_486;

public final class NetworkSupport_071
implements Closeable {
    private volatile NetworkSupport_067 h;
    private final ExecutorService l;
    private volatile boolean I;
    private final Set<Socket> d;
    private final static int i = 32768;
    private final Consumer<String> f;
    private final ServerSocket H;
    private final static int e = 10000;

    private static void L(Socket socket, Exception exception) {
        Object a = exception;
        Socket a2 = socket;
try {
            OutputStream outputStream;
            a = NetworkSupport_071.L((Exception)a).getBytes(StandardCharsets.UTF_8);
            String string = new StringBuilder().insert(0, "HTTP/1.1 502 Bad Gateway\r\nContent-Type: text/plain; charset=utf-8\r\nContent-Length: ").append(((Object)a).length).append("\r\nConnection: close\r\n\r\n").toString();
            OutputStream outputStream2 = outputStream = a2.getOutputStream();
            outputStream2.write(string.getBytes(StandardCharsets.US_ASCII));
            outputStream2.write((byte[])a);
            outputStream2.flush();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void L(Socket socket, Socket socket2, boolean bl) {
        Socket a = socket2;
        Socket a2 = socket;
try {
            void a3;
            a2.getInputStream().transferTo(a.getOutputStream());
            a.getOutputStream().flush();
            if (a3 != false && !a.isOutputShutdown()) {
                a.shutdownOutput();
                return;
            }
        }
        catch (IOException iOException) {}
    }

    private static NetworkSupport_070 L(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
String[] a = NetworkSupport_071.L(inputStream2);
        int n = a.indexOf("\r\n");
        a = ((String)(n < 0 ? a : a.substring(0, n))).split("\\s+", 3);
        if (a.length < 3 || !a[0].equalsIgnoreCase("CONNECT")) {
            throw new IOException("Proxy bridge only supports HTTPS CONNECT requests");
        }
        return NetworkSupport_070.L(a[1]);
    }

    private static void L(OutputStream outputStream, int n) throws IOException {
        int a = n;
        OutputStream a2 = outputStream;
OutputStream outputStream2 = a2;
        outputStream2.write(0);
        outputStream2.write(0);
    }

    /*
     * WARNING - void declaration
     */
    public NetworkSupport_071(NetworkMode_456 enum_456, InetSocketAddress inetSocketAddress, String string, String string2, Consumer<String> consumer) throws IOException {
        void a;
        void a2;
        void a3;
        void a4;
        Consumer<String> a5;
        NetworkSupport_071 class_071 = consumer2;
        Consumer<String> consumer2 = consumer;
        NetworkSupport_071 a6 = class_071;
        a6.l = Executors.newVirtualThreadPerTaskExecutor();
        a6.d = ConcurrentHashMap.newKeySet();
        a6.f = a5;
        a6.L((NetworkMode_456)a4, (InetSocketAddress)a3, (String)a2, (String)a);
        a6.H = new ServerSocket();
        a6.H.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 0), 32);
        a6.l.execute(a6::L);
    }

    private static void L(Socket socket, Socket socket2) {
        Socket a = socket2;
        Socket a2 = socket;
NetworkSupport_071.L(a2, a, 1 != 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String L(InputStream inputStream) throws IOException {
        int n;
        InputStream inputStream2 = inputStream;
ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = 0;
        do {
            if (byteArrayOutputStream.size() >= 32768) {
                throw new IOException("Proxy request headers are too large");
            }
            int a = inputStream2.read();
            if (0 < 0) {
                throw new IOException("Proxy connection closed while reading headers");
            }
            byteArrayOutputStream.write(0);
            switch (n2) {
                case 0: {
                    if (0 == 13) {
                        n = 1;
                        break;
                    }
                    n = 0;
                    break;
                }
                case 1: {
                    if (0 == 10) {
                        n = 2;
                        break;
                    }
                    if (0 == 13) {
                        n = 1;
                        break;
                    }
                    n = 0;
                    break;
                }
                case 2: {
                    if (0 == 13) {
                        n = 3;
                        break;
                    }
                    n = 0;
                    break;
                }
                case 3: {
                    if (0 == 10) {
                        n = 4;
                        break;
                    }
                    n = 0;
                    break;
                }
                default: {
                    n = n2;
                }
            }
        } while ((n2 = n) != 4);
        return byteArrayOutputStream.toString(StandardCharsets.US_ASCII);
    }

    @Override
    public void close() {
        Object a;
        NetworkSupport_071 class_071 = this;
NetworkSupport_071 class_0712 = class_071;
        class_0712.I = 1;
        NetworkSupport_071.L(class_0712.H);
        Object object = a = class_0712.d.iterator();
        while (object.hasNext()) {
            NetworkSupport_071.L((Socket)a.next());
            object = a;
        }
        NetworkSupport_071 class_0713 = class_071;
        class_0713.d.clear();
        class_0713.l.shutdownNow();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String L(int a) {
switch (a) {
            case 1: {
                return "general failure";
            }
            case 2: {
                return "connection not allowed by ruleset";
            }
            case 3: {
                return "network unreachable";
            }
            case 4: {
                return "host unreachable";
            }
            case 5: {
                return "connection refused";
            }
            case 6: {
                return "TTL expired";
            }
            case 7: {
                return "command not supported";
            }
            case 8: {
                return "address type not supported";
            }
        }
        return new StringBuilder().insert(0, "status ").append(a).toString();
    }

    /*
     * WARNING - void declaration
     */
    private Socket L(NetworkSupport_070 class_070) throws IOException {
        NetworkSupport_071 class_071 = this;
NetworkSupport_071 class_0712 = class_071;
        NetworkSupport_067 class_067 = class_0712.h;
        Closeable a = new Socket();
        class_0712.d.add((Socket)a);
        try {
            void a2;
            Closeable closeable = a;
            ((Socket)closeable).setTcpNoDelay(1 != 0);
            ((Socket)closeable).connect(class_067.L(), 10000);
            ((Socket)a).setSoTimeout(10000);
            if (class_067.L() == NetworkMode_456.e) {
                Closeable closeable2 = a;
                class_071.L((Socket)closeable2, (NetworkSupport_070)a2, class_067);
                return closeable2;
            }
            NetworkSupport_071.d((Socket)a, (NetworkSupport_070)a2, class_067);
            return a;
        }
        catch (IOException | RuntimeException a2) {
            class_071.d.remove(a);
            NetworkSupport_071.L(a);
            throw a2;
        }
    }

    private static void L(Closeable a) {
if (a == null) {
            return;
        }
        try {
            a.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(NetworkMode_456 enum_456, InetSocketAddress inetSocketAddress, String string, String string2) {
        void a;
        void a2;
        String string3;
        String a3;
        String string4;
        void a4;
        NetworkSupport_071 class_071 = string5;
        String string5 = string2;
        NetworkSupport_071 a5 = class_071;
NetworkSupport_071 class_0712 = a5;
        if (a4 == null) {
            string4 = "";
            string3 = a3;
        } else {
            string4 = a4;
            string3 = a3;
        }
        class_0712.h = new NetworkSupport_067((NetworkMode_456)a2, (InetSocketAddress)a, string4, (String)(string3 == null ? "" : a3));
    }

    private static int L(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
int a = inputStream2.read();
        if (0 < 0) {
            throw new IOException("Proxy connection closed unexpectedly");
        }
        return 0;
    }

    private void d(Socket socket) {
        Closeable a = socket;
        NetworkSupport_071 a2 = this;
a2.L((Socket)a);
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] L(InputStream inputStream, int n) throws IOException {
        void a;
        InputStream inputStream2 = inputStream;
byte[] byArray = inputStream2.readNBytes((int)a);
        Object a2 = byArray;
        if (byArray.length != a) {
            throw new IOException("Proxy connection closed unexpectedly");
        }
        return a2;
    }

    private static void L(InputStream inputStream, int n) throws IOException {
        int n2;
        int a = n;
        InputStream a2 = inputStream;
switch (0) {
            case 1: {
                n2 = 4;
                while (false) {
                }
                break;
            }
            case 3: {
                n2 = NetworkSupport_071.L(a2);
                break;
            }
            case 4: {
                n2 = 16;
                break;
            }
            default: {
                throw new IOException("SOCKS5 proxy returned an invalid address type");
            }
        }
        a = n2;
        NetworkSupport_071.L(a2, 0);
    }

    /*
     * WARNING - void declaration
     */
    private static void L(InputStream inputStream, OutputStream outputStream, NetworkSupport_067 class_067) throws IOException {
        void a;
        Object a2 = class_067;
        InputStream a3 = inputStream;
Object object = a2;
        a2 = ((NetworkSupport_067)object).d().getBytes(StandardCharsets.UTF_8);
        byte[] byArray = ((NetworkSupport_067)object).L().getBytes(StandardCharsets.UTF_8);
        if (((Object)a2).length == 0 || ((Object)a2).length > 255 || byArray.length > 255) {
            throw new IOException("SOCKS5 credentials must be between 1 and 255 bytes");
        }
        a.write(1);
        a.write(((Object)a2).length);
        void v1 = a;
        v1.write((byte[])a2);
        v1.write(byArray.length);
        void v2 = a;
        v2.write(byArray);
        v2.flush();
        if (NetworkSupport_071.L(a3) != 1 || NetworkSupport_071.L(a3) != 0) {
            throw new IOException("SOCKS5 proxy rejected the username or password");
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void d(Socket socket, NetworkSupport_070 class_070, NetworkSupport_067 class_067) throws IOException {
        int a3;
        Object object;
        void a22;
        String[] a3 = class_070;
        Socket a4 = socket;
a3 = a3.d();
        a3 = new StringBuilder().insert(0, "CONNECT ").append((String)a3).append(" HTTP/1.1\r\n").append("Host: ").append((String)a3).append("\r\n").append("Proxy-Connection: keep-alive\r\n");
        if (!a22.d().isBlank()) {
            object = new StringBuilder().insert(0, a22.d()).append(":").append(a22.L()).toString();
            a3.append("Proxy-Authorization: Basic ").append(Base64.getEncoder().encodeToString(((String)object).getBytes(StandardCharsets.UTF_8))).append("\r\n");
        }
        a3.append("\r\n");
        Socket socket2 = a4;
        object = socket2.getOutputStream();
        ((OutputStream)object).write(a3.toString().getBytes(StandardCharsets.US_ASCII));
        ((OutputStream)object).flush();
        a3 = NetworkSupport_071.L(socket2.getInputStream());
        a3 = a3.substring(0, a3.indexOf("\r\n")).split("\\s+", 3);
        if (a3.length < 2) {
            throw new IOException("HTTP proxy returned an invalid response");
        }
        try {
            a3 = Integer.parseInt(a3[1]);
        }
        catch (NumberFormatException a22) {
            throw new IOException("HTTP proxy returned an invalid status", a22);
        }
        if (a3 < 200 || a3 >= 300) {
            throw new IOException(new StringBuilder().insert(0, "HTTP proxy CONNECT failed: ").append(a3).toString());
        }
    }

    private static String L(Exception a) {
if (a.getMessage() == null) {
            return "Proxy connection failed";
        }
        return a.getMessage();
    }

    /*
     * WARNING - void declaration
     */
    private void L(Socket socket, NetworkSupport_070 class_070, NetworkSupport_067 class_067) throws IOException {
        void v4;
        void a22;
        InputStream a;
        Object a32 = class_067;
        NetworkSupport_071 a4 = this;
void v0 = a;
        a = v0.getInputStream();
        OutputStream outputStream = v0.getOutputStream();
        int n = !((NetworkSupport_067)a32).d().isBlank() ? 1 : 0;
        byte[] byArray = new byte[3];
        byArray[0] = 5;
        int n2 = 1;
        byArray[n2] = n2;
        byArray[2] = (byte)(n != 0 ? 2 : 0);
        outputStream.write(byArray);
        InputStream inputStream = a;
        outputStream.flush();
        int n3 = NetworkSupport_071.L(inputStream);
        int n4 = NetworkSupport_071.L(inputStream);
        if (n3 != 5 || n4 == 255) {
            throw new IOException("SOCKS5 proxy rejected authentication methods");
        }
        if (n4 == 2) {
            v4 = a22;
            NetworkSupport_071.L(a, outputStream, (NetworkSupport_067)a32);
        } else {
            if (n4 != 0 || n != 0) {
                throw new IOException("SOCKS5 proxy did not accept username/password authentication");
            }
            v4 = a22;
        }
        byte[] byArray2 = v4.L().getBytes(StandardCharsets.UTF_8);
        a32 = byArray2;
        if (byArray2.length == 0 || ((Object)a32).length > 255) {
            throw new IOException("SOCKS5 target host is invalid");
        }
        OutputStream outputStream2 = outputStream;
        OutputStream outputStream3 = outputStream;
        outputStream3.write(5);
        outputStream3.write(1);
        outputStream2.write(0);
        outputStream2.write(3);
        outputStream.write(((Object)a32).length);
        OutputStream outputStream4 = outputStream;
        outputStream4.write((byte[])a32);
        NetworkSupport_071.L(outputStream4, a22.L());
        outputStream4.flush();
        InputStream inputStream2 = a;
        int a22 = NetworkSupport_071.L(inputStream2);
        int a32 = NetworkSupport_071.L(a);
        NetworkSupport_071.L(inputStream2);
        InputStream inputStream3 = a;
        NetworkSupport_071.L(inputStream3, NetworkSupport_071.L(inputStream3));
        NetworkSupport_071.L(inputStream3, 2);
        if (a22 != 5 || a32 != 0) {
            throw new IOException(new StringBuilder().insert(0, "SOCKS5 CONNECT failed: ").append(NetworkSupport_071.L(a32)).toString());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void L() {
        var1_3 = this /* !! */ ;
block3: while (true) lbl-1000:
        // 3 sources

        {
            v0 = var1_3;
            while (!v0.I) {
                try {
                    v1 = var1_3;
                    a /* !! */  = v1.H.accept();
                    v1.d.add((Socket)a /* !! */ );
                    v1.l.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, d(java.net.Socket ), ()V)((NetworkSupport_071)var1_3, (Socket)a /* !! */ ));
                    v0 = var1_3;
                }
                catch (SocketException a) {
                    if (var1_3.I) ** GOTO lbl-1000
                    throw new IllegalStateException("Proxy bridge stopped unexpectedly", a);
                }
                catch (IOException a) {
                    if (var1_3.I) continue block3;
                    throw new IllegalStateException("Proxy bridge failed to accept a connection", a);
                }
            }
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void L(Socket socket) {
        Closeable a = socket;
        NetworkSupport_071 a2 = this;
Socket socket2 = null;
        try {
            Closeable closeable;
            Closeable closeable2 = a;
            Closeable closeable3 = a;
            ((Socket)closeable3).setTcpNoDelay(5 >> 2);
            ((Socket)closeable2).setSoTimeout(10000);
            NetworkSupport_070 class_070 = NetworkSupport_071.L(((Socket)closeable3).getInputStream());
            socket2 = a2.L(class_070);
            OutputStream outputStream = closeable = ((Socket)closeable2).getOutputStream();
            outputStream.write("HTTP/1.1 200 Connection Established\r\n\r\n".getBytes(StandardCharsets.US_ASCII));
            outputStream.flush();
            ((Socket)closeable2).setSoTimeout(0);
            Socket socket3 = socket2;
            socket3.setSoTimeout(0);
            closeable = socket3;
            Future<?> future = a2.l.submit(() -> NetworkSupport_071.L((Socket)a, (Socket)closeable));
            NetworkSupport_071.L((Socket)closeable, (Socket)a, 0 != 0);
            future.cancel(1 != 0);
            a2.d.remove(socket2);
            a2.d.remove(a);
        }
        catch (Exception exception) {
            try {
                if (a2.f != null) {
                    a2.f.accept(NetworkSupport_071.L(exception));
                }
                NetworkSupport_071.L((Socket)a, exception);
                a2.d.remove(socket2);
                a2.d.remove(a);
            }
            catch (Throwable throwable) {
                a2.d.remove(socket2);
                a2.d.remove(a);
                NetworkSupport_071.L(socket2);
                NetworkSupport_071.L(a);
                throw throwable;
            }
            NetworkSupport_071.L(socket2);
            NetworkSupport_071.L(a);
            return;
        }
        NetworkSupport_071.L(socket2);
        NetworkSupport_071.L(a);
        return;
    }

    public InetSocketAddress L() {
        NetworkSupport_071 a;
return (InetSocketAddress)a.H.getLocalSocketAddress();
    }
}

