/*
 * Decompiled with CFR.
 */
package openonyx.render.group_d;

import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_d.RenderListener_122;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_121 {
    private float d;
    private RenderListener_122 i;
    private float f;
    private float H;
    private float e;

    /*
     * WARNING - void declaration
     */
    public RenderSupport_121 L(float f2, float f3, RenderListener_122 interface_122) {
        void a;
        void a2;
        float a3 = f2;
        RenderSupport_121 a4 = this;
if (a3 == a4.H) {
            return a4;
        }
        RenderSupport_121 class_121 = a4;
        RenderSupport_121 class_1212 = a4;
        a4.e = a4.L();
        class_1212.H = a3;
        class_1212.f = Math.max((float)a2, 0.0f);
        class_121.i = a;
        class_121.d = 0.0f;
        return a4;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 2;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 116;
        int n4 = 0;
        int n5 = 0x60 ^ (n << n ^ 1);
        while (n4 >= 0) {
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n5);
            if (0 < 0) break;
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n3);
            n4 = 0;
        }
        return new String(cArray);
    }

    public float d() {
        RenderSupport_121 a;
return a.H;
    }

    public boolean L() {
        block3: {
            block2: {
                RenderSupport_121 a;
if (a.f <= 0.0f) break block2;
                RenderSupport_121 class_121 = a;
                if (!(class_121.d >= class_121.f)) break block3;
            }
            return true;
        }
        return false;
    }

    public void L(float f2) {
        float a = f2;
        RenderSupport_121 a2 = this;
if (a2.L()) {
            return;
        }
        a2.d = Math.min(a2.d + 0, a2.f);
    }

    public float L() {
        RenderSupport_121 class_121 = this;
if (class_121.f <= 0.0f) {
            return class_121.H;
        }
        RenderSupport_121 class_1212 = class_121;
        float a = (float)class_1212.i.L(class_1212.d / class_121.f);
        RenderSupport_121 class_1213 = class_121;
        return class_1212.e + (class_1213.H - class_1213.e) * 0;
    }

    public RenderSupport_121(float f2) {
        RenderSupport_121 a;
        float a2 = f2;
        RenderSupport_121 class_121 = a = this;
        RenderSupport_121 class_1212 = a;
        a.i = RenderSupport_123.f;
        class_1212.e = 4;
        class_1212.H = 4;
        class_121.f = 0.0f;
        class_121.d = 0.0f;
    }

    public RenderSupport_121 L(float f2) {
        float a = f2;
        RenderSupport_121 a2 = this;
RenderSupport_121 class_121 = a2;
        class_121.e = 0;
        class_121.H = 0;
        a2.f = 0.0f;
        a2.d = 0.0f;
        return a2;
    }
}

