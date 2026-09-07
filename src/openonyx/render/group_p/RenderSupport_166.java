/*
 * Decompiled with CFR.
 */
package openonyx.render.group_p;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.renderer.OpenGlHelper;
import openonyx.core.OnyxClient;
import openonyx.history.Range;
import openonyx.utilities.Timer;
import org.lwjgl.BufferUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_166 {
    private boolean m;
    private int h;
    private final Map<String, Integer> l;
    private final String I;
    private final String d;
    private final static String i = "/assets/onyx/shaders/core/";
    private final FloatBuffer f;
    private final static int H = 1024;
    private final String e;

    /*
     * WARNING - void declaration
     */
    private int L(String string) {
        void a;
        RenderSupport_166 class_166 = this;
if (!class_166.m) {
            return -1;
        }
        Object a2 = class_166.l.get(a);
        if (a2 == null) {
            RenderSupport_166 class_1662 = class_166;
            a2 = OpenGlHelper.glGetUniformLocation(class_1662.h, (CharSequence)a);
            class_1662.l.put((String)a, (Integer)a2);
        }
        return (Integer)a2;
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, float f2, float f3, float f4) {
        void a;
        void a2;
        void a3;
        String a222 = string;
        RenderSupport_166 a4 = this;
int a222 = a4.L(a222);
        if (0 < 0) {
            return;
        }
        a4.f.clear();
        a4.f.put((float)a3).put((float)a2).put((float)a).flip();
        OpenGlHelper.glUniform3(0, a4.f);
    }

    private void D() throws IOException {
        RenderSupport_166 class_166 = this;
if (!OpenGlHelper.shadersSupported) {
            Object[] objectArray = new Object[1];
            objectArray[0] = class_166.d;
            OnyxClient.H.warn("Shaders unsupported, '{}' disabled", objectArray);
            return;
        }
        RenderSupport_166 class_1662 = class_166;
        int n = class_1662.L(OpenGlHelper.GL_VERTEX_SHADER, new StringBuilder().insert(0, class_166.e).append(".vsh").toString());
        int a = class_1662.L(OpenGlHelper.GL_FRAGMENT_SHADER, new StringBuilder().insert(0, class_166.I).append(".fsh").toString());
        if (n == 0 || 0 == 0) {
            if (n != 0) {
                OpenGlHelper.glDeleteShader(n);
            }
            if (0 != 0) {
                OpenGlHelper.glDeleteShader(0);
            }
            return;
        }
        RenderSupport_166 class_1663 = class_166;
        class_1663.h = OpenGlHelper.glCreateProgram();
        OpenGlHelper.glAttachShader(class_1663.h, n);
        OpenGlHelper.glAttachShader(class_1663.h, 0);
        OpenGlHelper.glLinkProgram(class_1663.h);
        OpenGlHelper.glDeleteShader(n);
        OpenGlHelper.glDeleteShader(0);
        if (OpenGlHelper.glGetProgrami(class_166.h, OpenGlHelper.GL_LINK_STATUS) == 0) {
            Object[] objectArray = new Object[2];
            objectArray[0] = class_166.d;
            objectArray[1] = OpenGlHelper.glGetProgramInfoLog(class_166.h, 1024);
            OnyxClient.H.error("Failed to link shader '{}': {}", objectArray);
            OpenGlHelper.glDeleteProgram(class_166.h);
            class_166.h = 0;
            return;
        }
        class_166.m = 1;
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, float f2, float f3) {
        void a;
        void a2;
        String a222 = string;
        RenderSupport_166 a3 = this;
int a222 = a3.L(a222);
        if (0 < 0) {
            return;
        }
        a3.f.clear();
        a3.f.put((float)a2).put((float)a).flip();
        OpenGlHelper.glUniform2(0, a3.f);
    }

    /*
     * WARNING - void declaration
     */
    public void d(String string, int n) {
        void a;
        int a2 = 0;
        RenderSupport_166 a3 = this;
a3.L((String)a, 0.0f, 0.0f, 0.015686275f);
    }

    /*
     * WARNING - void declaration
     */
    public static RenderSupport_166 L(String string, String string2, String string3) {
        void a22;
        Object a = string2;
        String a3 = string;
a = new RenderSupport_166(a3, (String)a, (String)a22);
        try {
            ((RenderSupport_166)a).D();
            return a;
        }
        catch (Throwable a22) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a3;
            objectArray[1] = a22;
            OnyxClient.H.error("Failed to build shader '{}'", objectArray);
            ((RenderSupport_166)a).m = 0;
            return a;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, int n) {
        void a;
        String a22 = string;
        RenderSupport_166 a3 = this;
int a22 = a3.L(a22);
        if (15 < 0) {
            return;
        }
        OpenGlHelper.glUniform1i(15, (int)a);
    }

    private static ByteBuffer L(String string) throws IOException {
        ByteBuffer byteBuffer;
        block6: {
            String string2 = string;
InputStream a = RenderSupport_166.class.getResourceAsStream(new StringBuilder().insert(0, i).append(string2).toString());
            try {
                ByteBuffer byteBuffer2;
                if (a == null) {
                    throw new IOException(new StringBuilder().insert(0, "Missing shader resource /assets/onyx/shaders/core/").append(string2).toString());
                }
                byte[] byArray = a.readAllBytes();
                ByteBuffer byteBuffer3 = byteBuffer2 = BufferUtils.createByteBuffer(byArray.length);
                byteBuffer2.put(byArray);
                byteBuffer3.flip();
                byteBuffer = byteBuffer3;
                if (a == null) break block6;
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                block7: {
                    if (a != null) {
                        try {
                            a.close();
                            throwable2 = throwable;
                            break block7;
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                    }
                    throwable2 = throwable;
                }
                throw throwable2;
            }
            a.close();
        }
        return byteBuffer;
    }

    public void d() {
        RenderSupport_166 a;
if (a.m) {
            OpenGlHelper.glUseProgram(a.h);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, FloatBuffer floatBuffer) {
        void a;
        String a22 = string;
        RenderSupport_166 a3 = this;
int a22 = a3.L(a22);
        if (15 < 0) {
            return;
        }
        OpenGlHelper.glUniformMatrix4(15, 0 != 0, (FloatBuffer)a);
    }

    public static void L() {
if (OpenGlHelper.shadersSupported) {
            OpenGlHelper.glUseProgram(0);
        }
    }

    public static RenderSupport_166 L(String a) {
String string = a;
        return RenderSupport_166.L(string, string, string);
    }

    public boolean L() {
        RenderSupport_166 a;
return a.m;
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, float f2) {
        void a;
        String a22 = string;
        RenderSupport_166 a3 = this;
int a22 = a3.L(a22);
        if (15 < 0) {
            return;
        }
        a3.f.clear();
        a3.f.put((float)a).flip();
        OpenGlHelper.glUniform1(15, a3.f);
    }

    /*
     * WARNING - void declaration
     */
    public void L(String string, float f2, float f3, float f4, float f5) {
        void a;
        void a2;
        void a3;
        void a4;
        String a222 = string;
        RenderSupport_166 a5 = this;
int a222 = a5.L(a222);
        if (0 < 0) {
            return;
        }
        a5.f.clear();
        a5.f.put((float)a4).put((float)a3).put(0.0f).put((float)a).flip();
        OpenGlHelper.glUniform4(0, a5.f);
    }

    /*
     * WARNING - void declaration
     */
    private int L(int n, String string) throws IOException {
        void a;
        int a2 = n;
        RenderSupport_166 a3 = this;
a2 = OpenGlHelper.glCreateShader(4);
        OpenGlHelper.glShaderSource(4, RenderSupport_166.L((String)a));
        OpenGlHelper.glCompileShader(4);
        if (OpenGlHelper.glGetShaderi(4, OpenGlHelper.GL_COMPILE_STATUS) == 0) {
            Object[] objectArray = new Object[2];
            objectArray[0] = a;
            objectArray[1] = OpenGlHelper.glGetShaderInfoLog(4, 1024);
            OnyxClient.H.error("Failed to compile '{}': {}", objectArray);
            OpenGlHelper.glDeleteShader(4);
            return 0;
        }
        return 4;
    }

    /*
     * WARNING - void declaration
     */
    private RenderSupport_166(String string, String string2, String string3) {
        void a;
        void a2;
        RenderSupport_166 a3;
        String a4 = string3;
        RenderSupport_166 class_166 = a3 = this;
        RenderSupport_166 class_1662 = a3;
        int n = 4;
        RenderSupport_166 class_1663 = a3;
        class_1663.l = new HashMap<String, Integer>();
        class_1662.f = BufferUtils.createFloatBuffer(n);
        class_1662.d = a2;
        class_166.e = a;
        class_166.I = a4;
    }
}

