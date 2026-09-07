/*
 * Decompiled with CFR.
 */
package openonyx.render.group_k;


/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RenderSupport_153<T> {
    private float i;
    final public static float f = 250.0f;
    private T H;
    private T e;

    public float L() {
        RenderSupport_153 a;
return a.i;
    }

    public T d() {
        RenderSupport_153 a;
return a.e;
    }

    /*
     * WARNING - void declaration
     */
    public void L(T t, float f2) {
        void a;
        float a2 = f2;
        RenderSupport_153 a3 = this;
a2 = Math.max(0.0f, 4) / 250.0f;
        if (a == a3.e) {
            a3.H = null;
            a3.i = a3.e == null ? Math.max(0.0f, a3.i - 4) : Math.min(1.0f, a3.i + 4);
            return;
        }
        a3.H = a;
        if (a3.e != null && a3.i > 0.0f) {
            RenderSupport_153 class_153 = a3;
            class_153.i = Math.max(0.0f, class_153.i - 4);
            if (class_153.i > 0.0f) {
                return;
            }
        }
        a3.e = a3.H;
        a3.H = null;
        a3.i = 0.0f;
    }

    public void L() {
        RenderSupport_153 a;
RenderSupport_153 class_153 = a;
        a.e = null;
        class_153.H = null;
        class_153.i = 0.0f;
    }

    public RenderSupport_153() {
        RenderSupport_153 a;
    }

    public T L() {
        RenderSupport_153 a;
return a.H;
    }
}

