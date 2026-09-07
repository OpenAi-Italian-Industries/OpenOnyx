/*
 * Decompiled with CFR.
 */
package openonyx.music;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MusicSupport_075
extends Record {
    private final String l;
    private final String I;
    private final long d;
    private final int i;
    private final ResourceLocation f;
    private final int H;
    private final boolean e;

    public boolean L() {
        MusicSupport_075 a;
return a.e;
    }

    public int d() {
        MusicSupport_075 a;
return a.H;
    }

    public long L() {
        MusicSupport_075 a;
return a.d;
    }

    @Override
    public final int hashCode() {
        MusicSupport_075 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MusicSupport_075.class, "title;artist;art;playing;progressMs;durationMs;capturedAtNanos", "I", "l", "f", "e", "H", "i", "d"}, a);
    }

    public String d() {
        MusicSupport_075 a;
return a.I;
    }

    public float L() {
        MusicSupport_075 a;
if (a.i <= 0) {
            return 0.0f;
        }
        long l = a.e ? (System.nanoTime() - a.d) / 1000000L : 0L;
        return Math.clamp((float)Math.min((long)a.i, (long)a.H + l) / (float)a.i, 0.0f, 1.0f);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        MusicSupport_075 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MusicSupport_075.class, "title;artist;art;playing;progressMs;durationMs;capturedAtNanos", "I", "l", "f", "e", "H", "i", "d"}, a2, a);
    }

    @Override
    public final String toString() {
        MusicSupport_075 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{MusicSupport_075.class, "title;artist;art;playing;progressMs;durationMs;capturedAtNanos", "I", "l", "f", "e", "H", "i", "d"}, a);
    }

    public int L() {
        MusicSupport_075 a;
return a.i;
    }

    public ResourceLocation L() {
        MusicSupport_075 a;
return a.f;
    }

    public String L() {
        MusicSupport_075 a;
return a.l;
    }

    /*
     * WARNING - void declaration
     */
    public MusicSupport_075(String string, String string2, ResourceLocation resourceLocation, boolean bl, int n, int n2, long l) {
        void a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        MusicSupport_075 a8;
        int n3 = n2;
        MusicSupport_075 class_075 = a8 = this;
        MusicSupport_075 class_0752 = a8;
        MusicSupport_075 class_0753 = a8;
        a8.I = a7;
        class_0753.l = a6;
        class_0753.f = a5;
        class_0752.e = a4;
        class_0752.H = a3;
        class_075.i = a2;
        class_075.d = a;
    }
}

