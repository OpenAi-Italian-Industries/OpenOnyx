/*
 * Decompiled with CFR.
 */
package openonyx.network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import openonyx.core.OnyxClient;
import openonyx.events.ChatTransformer;
import openonyx.render.group_d.RenderSupport_124;

public final class NetworkSupport_066
extends ChannelDuplexHandler {
    private final InetSocketAddress j;
    private InetSocketAddress m;
    private final String h;
    private final static byte[] l;
    private final String I;
    private final String d;
    private final int i;
    private ByteBuf f;
    private ScheduledFuture<?> H;
    private ChannelPromise e;

    @Override
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext a = channelHandlerContext;
        NetworkSupport_066 a2 = this;
if (a2.f != null) {
            a2.f.release();
            a2.f = null;
        }
        a2.L();
    }

    private void L() {
        NetworkSupport_066 a;
if (a.H != null) {
            a.H.cancel(5 >> 3);
            a.H = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public NetworkSupport_066(InetSocketAddress inetSocketAddress, String string, int n, String string2, String string3) {
        String a;
        void a2;
        void a3;
        void a4;
        void a5;
        NetworkSupport_066 a6;
        NetworkSupport_066 class_066 = string4;
        String string4 = string3;
        NetworkSupport_066 class_0662 = a6 = class_066;
        class_0662.j = a5;
        class_0662.I = a4 == null ? "" : a4;
        NetworkSupport_066 class_0663 = a6;
        class_0663.i = a3;
        class_0663.h = a2 == null ? "" : a2;
        a6.d = a == null ? "" : a;
    }

    static {
        byte[] byArray = new byte[4];
        byArray[0] = 13;
        byArray[1] = 10;
        byArray[2] = 13;
        byArray[3] = 10;
        l = byArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        ByteBuf byteBuf;
        void a;
        Object a322 = object;
        NetworkSupport_066 a2 = this;
if (!(a322 instanceof ByteBuf)) {
            a.fireChannelRead(a322);
            return;
        }
        ByteBuf byteBuf2 = (ByteBuf)a322;
        try {
            if (a2.f == null) {
                a2.f = a.alloc().buffer(byteBuf2.readableBytes());
            }
            a2.f.writeBytes(byteBuf2);
        }
        finally {
            byteBuf2.release();
        }
        int a322 = NetworkSupport_066.L(a2.f);
        if (a322 < 0) {
            return;
        }
        NetworkSupport_066 class_066 = a2;
        int n = NetworkSupport_066.L(class_066.f.toString(class_066.f.readerIndex(), a322 - a2.f.readerIndex(), StandardCharsets.US_ASCII));
        if (n < 200 || n >= 300) {
            a2.L((ChannelHandlerContext)a, new IllegalStateException(new StringBuilder().insert(0, "HTTP proxy CONNECT failed (").append(n).append(")").toString()));
            return;
        }
        a2.f.skipBytes(a322 - a2.f.readerIndex() + l.length);
        if (a2.f.isReadable()) {
            NetworkSupport_066 class_0662 = a2;
            byteBuf = class_0662.f.readSlice(class_0662.f.readableBytes()).retain();
        } else {
            byteBuf = null;
        }
        ByteBuf a322 = byteBuf;
        a2.L();
        Object[] objectArray = new Object[2];
        objectArray[0] = a2.I;
        objectArray[1] = a2.i;
        OnyxClient.H.info("HTTP proxy tunnel established to {}:{}", objectArray);
        a.fireChannelActive();
        a2.e.trySuccess();
        if (a322 != null) {
            a.fireChannelRead(a322);
        }
        a.pipeline().remove(a2);
    }

    /*
     * WARNING - void declaration
     */
    private void L(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        NetworkSupport_066 a3 = this;
a3.L();
        Object[] objectArray = new Object[3];
        objectArray[0] = a3.I;
        objectArray[1] = a3.i;
        objectArray[2] = a2.getMessage();
        OnyxClient.H.warn("HTTP proxy tunnel to {}:{} failed: {}", objectArray);
        if (a3.e != null) {
            a3.e.tryFailure(a2);
        }
        a.close();
    }

    private static int L(String string) {
        String string2 = string;
String[] a = string2.split("\\s+", 3);
        if (a.length < 2) {
            return 0;
        }
        try {
            return Integer.parseInt(a[1]);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext a = channelHandlerContext;
        NetworkSupport_066 a2 = this;
a2.L(a);
    }

    private static int L(ByteBuf byteBuf) {
        int n;
        ByteBuf byteBuf2 = byteBuf;
int n2 = n = byteBuf2.readerIndex();
        while (n2 <= byteBuf2.writerIndex() - l.length) {
            int n3;
            block4: {
                int n4 = 1;
                int n5 = 0;
                while (n5 < l.length) {
                    int a;
                    if (byteBuf2.getByte(n + 0) != l[0]) {
                        n3 = 0;
                        break block4;
                    }
                    n5 = ++a;
                }
                n3 = 0;
            }
            if (n3 != 0) {
                return n;
            }
            n2 = ++n;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void connect(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, SocketAddress socketAddress2, ChannelPromise channelPromise) {
        void a;
        void a2;
        void a3;
        ChannelHandlerContext a4 = channelHandlerContext;
        NetworkSupport_066 a5 = this;
if (!(a3 instanceof InetSocketAddress)) {
            a2.tryFailure(new IllegalArgumentException("HTTP proxy requires an internet address"));
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress)a3;
        a5.m = inetSocketAddress;
        a5.e = a2;
        a5.H = a4.executor().schedule(() -> {
            ChannelHandlerContext a = a4;
            NetworkSupport_066 a2 = this;
a2.L(a, new IllegalStateException("HTTP proxy connection timed out"));
        }, 10L, TimeUnit.SECONDS);
        Object object = a4;
        object.connect(a5.j, (SocketAddress)a, object.newPromise()).addListener((GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener<Future>)future -> {
            Future a = future;
            NetworkSupport_066 a2 = this;
if (!a.isSuccess()) {
                void a3;
                a2.L((ChannelHandlerContext)a3, a.cause());
            }
        }));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        NetworkSupport_066 a3 = this;
a3.L((ChannelHandlerContext)a, a2);
    }

    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext a = channelHandlerContext;
        NetworkSupport_066 a2 = this;
Object object = a;
        Object object2 = a;
        a2.L((ChannelHandlerContext)object, new IllegalStateException("HTTP proxy closed the connection"));
        object.fireChannelInactive();
    }

    /*
     * WARNING - void declaration
     */
    private void L(ChannelHandlerContext channelHandlerContext) {
        void a;
        Object a2;
        NetworkSupport_066 class_066 = this;
NetworkSupport_066 class_0662 = class_066;
        Object object = a2 = class_066.I.isBlank() ? class_0662.m.getAddress().getHostAddress() : class_0662.I;
        if (((String)a2).indexOf(58) >= 0) {
            a2 = new StringBuilder().insert(0, "[").append((String)a2).append("]").toString();
        }
        a2 = new StringBuilder().insert(0, (String)a2).append(":").append(class_066.i).toString();
        a2 = new StringBuilder().insert(0, "CONNECT ").append((String)a2).append(" HTTP/1.1\r\nHost: ").append((String)a2).append("\r\n").toString();
        if (!class_066.h.isBlank()) {
            String string = new StringBuilder().insert(0, class_066.h).append(":").append(class_066.d).toString();
            a2 = new StringBuilder().insert(0, (String)a2).append("Proxy-Authorization: Basic ").append(Base64.getEncoder().encodeToString(string.getBytes(StandardCharsets.UTF_8))).append("\r\n").toString();
        }
        a.writeAndFlush(Unpooled.copiedBuffer(new StringBuilder().insert(0, (String)a2).append("\r\n").toString(), StandardCharsets.US_ASCII));
    }
}

