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
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import openonyx.core.OnyxClient;
import openonyx.network.NetworkMode_068;
import openonyx.render.internal.RenderSupport_175;
import openonyx.utilities.FileUtils;

public final class NetworkSupport_069
extends ChannelDuplexHandler {
    private final String J;
    private final static int D = 3;
    private final static int c = 2;
    private final InetSocketAddress a;
    private final static int k = 0;
    private final int g;
    private final String M;
    private InetSocketAddress L;
    private final String j;
    private ByteBuf m;
    private final static int h = 5;
    private NetworkMode_068 l;
    private ScheduledFuture<?> I;
    private final static int d = 1;
    private final static int i = 1;
    private ChannelPromise f;
    private final static int H = 4;
    private final static int e = 1;

    @Override
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext a = channelHandlerContext;
        NetworkSupport_069 a2 = this;
if (a2.m != null) {
            a2.m.release();
            a2.m = null;
        }
        a2.L();
    }

    /*
     * WARNING - void declaration
     */
    private void i(ChannelHandlerContext channelHandlerContext) {
        void a;
        Object a2;
        NetworkSupport_069 class_069 = this;
byte[] byArray = class_069.J.getBytes(StandardCharsets.UTF_8);
        if (byArray.length > 0 && byArray.length <= 255) {
            Object object = a2 = Unpooled.buffer(7 + byArray.length);
            ((ByteBuf)a2).writeByte(5);
            ((ByteBuf)object).writeByte(1);
            ((ByteBuf)a2).writeByte(0);
            ((ByteBuf)a2).writeByte(3);
            ((ByteBuf)object).writeByte(byArray.length);
            ((ByteBuf)a2).writeBytes(byArray);
            ((ByteBuf)a2).writeShort(class_069.g);
            a.writeAndFlush(a2);
            return;
        }
        byte[] byArray2 = class_069.L.getAddress().getAddress();
        a2 = byArray2;
        int n = byArray2.length == 4 ? 1 : 4;
        ByteBuf byteBuf = Unpooled.buffer(6 + ((Object)a2).length);
        byteBuf.writeByte(5);
        byteBuf.writeByte(1);
        byteBuf.writeByte(0);
        byteBuf.writeByte(0);
        byteBuf.writeBytes((byte[])a2);
        byteBuf.writeShort(class_069.g);
        a.writeAndFlush(byteBuf);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private boolean i(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        ByteBuf a = byteBuf;
        NetworkSupport_069 a2 = this;
switch (a2.l.ordinal()) {
            case 1: {
                void a3;
                return a2.d((ChannelHandlerContext)a3, a);
            }
            case 2: {
                void a3;
                return a2.L((ChannelHandlerContext)a3, a);
            }
            case 3: {
                void a3;
                return a2.D((ChannelHandlerContext)a3, a);
            }
        }
        return false;
    }

    private void L() {
        NetworkSupport_069 a;
if (a.I != null) {
            a.I.cancel(0 != 0);
            a.I = null;
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext a = channelHandlerContext;
        NetworkSupport_069 a2 = this;
if (a2.l != NetworkMode_068.d) {
            a2.L(a, new IllegalStateException("SOCKS5 proxy closed the connection"));
        }
        a.fireChannelInactive();
    }

    /*
     * WARNING - void declaration
     */
    private boolean D(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        ByteBuf byteBuf2;
        void a;
        int n;
        ByteBuf a2 = byteBuf;
        NetworkSupport_069 a3 = this;
if (a2.readableBytes() < 4) {
            return 0 != 0;
        }
        Object object = a2;
        ((ByteBuf)object).markReaderIndex();
        Object object2 = a2;
        short s = ((ByteBuf)object2).readUnsignedByte();
        short s2 = ((ByteBuf)object2).readUnsignedByte();
        ((ByteBuf)object2).skipBytes(1);
        switch (((ByteBuf)object).readUnsignedByte()) {
            case 1: {
                int n2 = 4;
                while (false) {
                }
                break;
            }
            case 4: {
                int n2 = 16;
                break;
            }
            case 3: {
                int n2;
                if (a2.isReadable()) {
                    n2 = a2.readUnsignedByte();
                    break;
                }
                n2 = -1;
                break;
            }
            default: {
                int n2 = -1;
            }
        }
        if (-1 < 0) {
            a3.L((ChannelHandlerContext)a, new IllegalStateException("SOCKS5 proxy returned an invalid address"));
            return 1 != 0;
        }
        if (a2.readableBytes() < 1) {
            a2.resetReaderIndex();
            return 5 >> 3;
        }
        a2.skipBytes(1);
        if (s != 5 || s2 != 0) {
            a3.L((ChannelHandlerContext)a, new IllegalStateException(new StringBuilder().insert(0, FileUtils.L("\f\u0003\u001c\u0007\fy\u007f\u000f\u0010\u0002\u0011\t\u001c\u0018\u007f*>%3);v\u007f")).append(NetworkSupport_069.L(s2)).toString()));
            return 3 >> 1;
        }
        a3.l = NetworkMode_068.d;
        if (a2.isReadable()) {
            Object object3 = a2;
            byteBuf2 = ((ByteBuf)object3).readSlice(((ByteBuf)object3).readableBytes()).retain();
        } else {
            byteBuf2 = null;
        }
        ByteBuf byteBuf3 = byteBuf2;
        a3.L();
        Object[] objectArray = new Object[2];
        objectArray[0] = a3.J;
        objectArray[1] = a3.g;
        OnyxClient.H.info("SOCKS5 tunnel established to {}:{}", objectArray);
        a.fireChannelActive();
        a3.f.trySuccess();
        if (byteBuf3 != null) {
            a.fireChannelRead(byteBuf3);
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private void D(ChannelHandlerContext channelHandlerContext) {
        void a;
        Object a2;
        NetworkSupport_069 class_069 = this;
int n = !class_069.M.isBlank() ? 1 : 0;
        Object object = a2 = Unpooled.buffer(3);
        ((ByteBuf)a2).writeByte(5);
        ((ByteBuf)object).writeByte(1);
        ((ByteBuf)object).writeByte(0 != 0 ? 2 : 0);
        a.writeAndFlush(a2);
    }

    /*
     * WARNING - void declaration
     */
    private void L(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        NetworkSupport_069 a3 = this;
if (a3.l == NetworkMode_068.H || a3.l == NetworkMode_068.d) {
            return;
        }
        a3.l = NetworkMode_068.H;
        a3.L();
        Object[] objectArray = new Object[3];
        objectArray[0] = a3.J;
        objectArray[1] = a3.g;
        objectArray[2] = a2.getMessage();
        OnyxClient.H.warn("SOCKS5 tunnel to {}:{} failed: {}", objectArray);
        if (a3.f != null) {
            a3.f.tryFailure(a2);
        }
        a.close();
    }

    /*
     * WARNING - void declaration
     */
    private void d(ChannelHandlerContext channelHandlerContext) {
        Object a;
        void a2;
        NetworkSupport_069 class_069 = this;
NetworkSupport_069 class_0692 = class_069;
        byte[] byArray = class_0692.M.getBytes(StandardCharsets.UTF_8);
        byte[] byArray2 = class_0692.j.getBytes(StandardCharsets.UTF_8);
        if (byArray.length == 0 || byArray.length > 255 || byArray2.length > 255) {
            class_069.L((ChannelHandlerContext)a2, new IllegalArgumentException(FileUtils.L("\u001f\u0010\u000f\u0014\u001fjl<>:(:\"+%> ,l29,8\u007f.:l>8\u007f!0?+lmyjl=5+),")));
            return;
        }
        Object object = a = Unpooled.buffer(3 + byArray.length + byArray2.length);
        ((ByteBuf)object).writeByte(1);
        ((ByteBuf)object).writeByte(byArray.length);
        ((ByteBuf)a).writeBytes(byArray);
        ((ByteBuf)a).writeByte(byArray2.length);
        ((ByteBuf)a).writeBytes(byArray2);
        a2.writeAndFlush(a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        void a;
        Throwable a2 = throwable;
        NetworkSupport_069 a3 = this;
a3.L((ChannelHandlerContext)a, a2);
    }

    private boolean d(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        ByteBuf a22 = byteBuf;
        NetworkSupport_069 a = this;
if (a22.readableBytes() < 2) {
            return 5 >> 3;
        }
        Object object = a22;
        short a22 = ((ByteBuf)object).readUnsignedByte();
        short s = ((ByteBuf)object).readUnsignedByte();
        if (0 != 5) {
            a.L((ChannelHandlerContext)a, new IllegalStateException(FileUtils.L("\f\u0003\u001c\u0007\fy\u007f<-#'5\u007f>:8*>1);l>\"\u007f%1:> 6(\u007f+-):86\"8")));
        } else if (s == 0) {
            a.l = NetworkMode_068.I;
            a.i((ChannelHandlerContext)a);
        } else if (s == 2 && !a.M.isBlank()) {
            a.l = NetworkMode_068.e;
            a.d((ChannelHandlerContext)a);
        } else {
            a.L((ChannelHandlerContext)a, new IllegalStateException("SOCKS5 proxy rejected the configured authentication"));
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public NetworkSupport_069(InetSocketAddress inetSocketAddress, String string, int n, String string2, String string3) {
        String a;
        void a2;
        void a3;
        void a4;
        void a5;
        NetworkSupport_069 a6;
        NetworkSupport_069 class_069 = string4;
        String string4 = string3;
        NetworkSupport_069 class_0692 = a6 = class_069;
        a6.l = NetworkMode_068.f;
        class_0692.a = a5;
        class_0692.J = a4 == null ? "" : a4;
        NetworkSupport_069 class_0693 = a6;
        class_0693.g = a3;
        class_0693.M = a2 == null ? "" : a2;
        a6.j = a == null ? "" : a;
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
        NetworkSupport_069 a5 = this;
if (!(a3 instanceof InetSocketAddress)) {
            a2.tryFailure(new IllegalArgumentException(FileUtils.L("\f\u0003\u001c\u0007\fy\u007f>:=*%-),l>\"\u007f%18:>1)+l>(;>:?,")));
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress)a3;
        a5.L = inetSocketAddress;
        a5.f = a2;
        a5.I = a4.executor().schedule(() -> {
            ChannelHandlerContext a = a4;
            NetworkSupport_069 a2 = this;
a2.L(a, new IllegalStateException("SOCKS5 proxy connection timed out"));
        }, 10L, TimeUnit.SECONDS);
        Object object = a4;
        object.connect(a5.a, (SocketAddress)a, object.newPromise()).addListener((GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener<Future>)future -> {
            Future a = future;
            NetworkSupport_069 a2 = this;
if (!a.isSuccess()) {
                void a3;
                a2.L((ChannelHandlerContext)a3, a.cause());
            }
        }));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String L(int a) {
switch (a) {
            case 1: {
                return FileUtils.L("8)1)--3l9-6 *>:");
            }
            case 2: {
                return "connection not allowed by ruleset";
            }
            case 3: {
                return FileUtils.L("1)+;0>4l*\"-)>/7-= :");
            }
            case 4: {
                return "host unreachable";
            }
            case 5: {
                return FileUtils.L("/0\"1)<86#1l-)99,);");
            }
            case 6: {
                return "TTL expired";
            }
            case 7: {
                return FileUtils.L("<#2!>\";l1#+l,9/<0>+);");
            }
            case 8: {
                return "address type not supported";
            }
        }
        return new StringBuilder().insert(0, FileUtils.L(",8>8*?\u007f")).append(a).toString();
    }

    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext a = channelHandlerContext;
        NetworkSupport_069 a2 = this;
if (a2.l == NetworkMode_068.f) {
            a2.l = NetworkMode_068.l;
            a2.D(a);
        }
    }

    private boolean L(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        ByteBuf a22 = byteBuf;
        NetworkSupport_069 a = this;
if (a22.readableBytes() < 2) {
            return 0 != 0;
        }
        Object object = a22;
        short a22 = ((ByteBuf)object).readUnsignedByte();
        short s = ((ByteBuf)object).readUnsignedByte();
        if (0 != 1 || s != 0) {
            a.L((ChannelHandlerContext)a, new IllegalStateException(FileUtils.L("\u001f\u0010\u000f\u0014\u001fjl/>04&l-)5)<8:(\u007f87)\u007f9,)-\">!:l0>\u007f<>?,;0>;")));
        } else {
            a.l = NetworkMode_068.I;
            a.i((ChannelHandlerContext)a);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        void a;
        void a2;
        NetworkSupport_069 class_069 = this;
if (!(a2 instanceof ByteBuf)) {
            a.fireChannelRead(a2);
            return;
        }
        ByteBuf a3 = (ByteBuf)a2;
        try {
            if (class_069.m == null) {
                class_069.m = a.alloc().buffer(a3.readableBytes());
            }
            class_069.m.writeBytes(a3);
            while (class_069.l != NetworkMode_068.d && class_069.l != NetworkMode_068.H && class_069.m != null && class_069.m.isReadable()) {
                NetworkSupport_069 class_0692 = class_069;
                if (class_0692.i((ChannelHandlerContext)a, class_0692.m)) continue;
                break;
            }
        }
        finally {
            a3.release();
        }
        if (class_069.l == NetworkMode_068.d) {
            a.pipeline().remove(class_069);
            return;
        }
        if (class_069.l != NetworkMode_068.d && class_069.m != null) {
            class_069.m.discardReadBytes();
        }
    }
}

