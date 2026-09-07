/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import lombok.Generated;
import net.minecraft.client.gui.GuiScreen;
import openonyx.events.ChatTransformer;
import openonyx.input.InputSupport_002;
import openonyx.input.InputSupport_005;
import openonyx.movement.MovementSupport_088;
import openonyx.ui.UiSupport_551;
import openonyx.ui.internal.UiSupport_592;
import openonyx.ui.internal.UiMode_569;
import openonyx.ui.internal.UiListener_573;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TextEditor {
    private int c;
    private final static char a = '\u2022';
    private Consumer<String> k;
    private String g;
    private int M;
    private UiMode_569 L;
    private final Deque<UiSupport_592> j;
    private Runnable m;
    private final static int h = 128;
    final public static float l = 1000.0f;
    private final Deque<UiSupport_592> I;
    private Runnable d;
    private boolean i;
    private float f;
    private float H;
    private final static float e = 550.0f;

    @Generated
    public void L(Consumer<String> consumer) {
        Consumer<String> a = consumer;
        TextEditor a2 = this;
a2.k = a;
    }

    private UiSupport_592 L() {
        TextEditor a;
TextEditor class_574 = a;
        return new UiSupport_592(class_574.g, class_574.M, a.c);
    }

    public boolean F() {
        TextEditor a;
if (a.I.isEmpty()) {
            return 3 >> 2;
        }
        TextEditor class_574 = a;
        TextEditor class_5742 = a;
        class_574.j.push(class_5742.L());
        class_574.L(class_5742.I.pop());
        return 5 >> 2;
    }

    private int d(int n) {
        int a = -35;
        TextEditor a2 = this;
int n2 = a = Math.clamp(0L, 0, a2.g.length());
        while (n2 < a2.g.length() && !Character.isLetterOrDigit(a2.g.charAt(0))) {
            n2 = ++a;
        }
        int n3 = 0;
        while (n3 < a2.g.length() && Character.isLetterOrDigit(a2.g.charAt(0))) {
            n3 = ++a;
        }
        return 0;
    }

    public void D() {
a.H = 0.0f;
    }

    public void d() {
        TextEditor a;
TextEditor class_574 = a;
        class_574.c = 0;
        class_574.M = class_574.g.length();
        class_574.D();
    }

    public boolean l() {
        TextEditor a;
if (a.H < 500.0f) {
            return 1 != 0;
        }
        return false;
    }

    @Generated
    public int D() {
        TextEditor a;
return a.M;
    }

    public boolean h() {
        TextEditor a;
if (a.j.isEmpty()) {
            return 0 != 0;
        }
        TextEditor class_574 = a;
        TextEditor class_5742 = a;
        class_574.I.push(class_5742.L());
        class_574.L(class_5742.j.pop());
        return 1 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public float L(int n, UiListener_573 interface_573) {
        void a;
        void a2;
        TextEditor class_574 = this;
String a3 = class_574.D();
        int n2 = 0;
        return a2.L(a3.substring(n2, Math.clamp((long)a, n2, a3.length())));
    }

    @Generated
    public void L(boolean bl) {
        boolean a = bl;
        TextEditor a2 = this;
a2.i = a;
    }

    public void L(int n) {
        int a = -35;
        TextEditor a2 = this;
TextEditor class_574 = a2;
        TextEditor class_5742 = a2;
        class_5742.c = a2.L(Math.clamp(0L, 0, a2.g.length()));
        class_5742.M = class_574.d(Math.clamp(0L, 0, a2.g.length()));
        class_574.D();
    }

    public String D() {
        TextEditor a;
if (a.i) {
            return String.valueOf((char)8226).repeat(a.g.length());
        }
        return a.g;
    }

    /*
     * WARNING - void declaration
     */
    public void L(int n, boolean bl) {
        void a;
        boolean a2 = bl;
        TextEditor a3 = this;
a3.M = Math.clamp(0L, 0, a3.g.length());
        if (!a2) {
            a3.c = a3.M;
        }
        a3.D();
    }

    private int L(int n) {
        int a = -35;
        TextEditor a2 = this;
int n2 = a = Math.clamp(0L, 0, a2.g.length());
        while (n2 > 0 && !Character.isLetterOrDigit(a2.g.charAt(-1))) {
            n2 = --a;
        }
        int n3 = 0;
        while (n3 > 0 && Character.isLetterOrDigit(a2.g.charAt(-1))) {
            n3 = --a;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private void L(UiMode_569 enum_569) {
        void a;
        int a2;
        TextEditor class_574 = this;
int n = a2 = a == class_574.L && class_574.f < 550.0f && !class_574.j.isEmpty() ? 1 : 0;
        if (0 == 0) {
            TextEditor class_5742 = class_574;
            TextEditor class_5743 = class_5742;
            class_574.j.push(class_5742.L());
            while (class_5743.j.size() > 128) {
                TextEditor class_5744 = class_574;
                class_5743 = class_5744;
                class_5744.j.removeLast();
            }
        }
        class_574.I.clear();
        class_574.L = a;
        class_574.f = 0.0f;
    }

    public void D(String string) {
        String a = string;
        TextEditor a2 = this;
a2.d(a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean L(InputSupport_002 class_002) {
        InputSupport_002 a = class_002;
        TextEditor a2 = this;
if (UiSupport_551.d(a, 30)) {
            boolean bl = --1 != 0;
            a2.d();
            return bl;
        }
        if (UiSupport_551.d(a, 46)) {
            a2.I();
            return 1 != 0;
        }
        if (UiSupport_551.d(a, 45)) {
            if (!a2.I()) return true;
            a2.L("", UiMode_569.f);
            return true;
        }
        if (UiSupport_551.d(a, 47)) {
            String string = GuiScreen.getClipboardString();
            a2.d(string == null ? "" : string.replaceAll("[\\r\\n]", " "));
            return --1 != 0;
        }
        if (UiSupport_551.D(a)) {
            return a2.h();
        }
        if (UiSupport_551.L(a)) {
            return a2.F();
        }
        Object object = a;
        boolean bl = ((InputSupport_002)object).d();
        switch (((InputSupport_002)object).D()) {
            case 14: {
                TextEditor class_574 = a2;
                if (a2.D()) {
                    class_574.L("", UiMode_569.f);
                    return true;
                }
                if (class_574.M <= 0) return true;
                TextEditor class_5742 = a2;
                class_5742.c = UiSupport_551.h(a) ? class_5742.L(a2.M) : class_5742.M - 1;
                a2.L("", UiMode_569.f);
                return true;
            }
            case 211: {
                TextEditor class_574 = a2;
                if (a2.D()) {
                    class_574.L("", UiMode_569.f);
                    return true;
                }
                if (class_574.M >= a2.g.length()) return true;
                TextEditor class_5743 = a2;
                class_5743.c = UiSupport_551.h(a) ? class_5743.d(a2.M) : class_5743.M + 1;
                a2.L("", UiMode_569.f);
                return true;
            }
            case 203: {
                boolean bl2;
                int n;
                TextEditor class_574 = a2;
                if (UiSupport_551.h(a)) {
                    n = class_574.L(a2.M);
                    bl2 = bl;
                } else {
                    n = class_574.M - 1;
                    bl2 = bl;
                }
                a2.L(n, bl2);
                return 3 >> 1;
            }
            case 205: {
                boolean bl3;
                int n;
                TextEditor class_574 = a2;
                if (UiSupport_551.h(a)) {
                    n = class_574.d(a2.M);
                    bl3 = bl;
                } else {
                    n = class_574.M + 1;
                    bl3 = bl;
                }
                a2.L(n, bl3);
                return 1 != 0;
            }
            case 199: {
                a2.L(0, bl);
                return 1 != 0;
            }
            case 207: {
                TextEditor class_574 = a2;
                class_574.L(class_574.g.length(), bl);
                return 1 != 0;
            }
            case 1: {
                if (a2.m == null) return true;
                a2.m.run();
                return true;
            }
            case 28: 
            case 156: {
                if (a2.d == null) return true;
                a2.d.run();
                return true;
            }
        }
        return false;
    }

    private boolean I() {
        Object a;
        TextEditor class_574 = this;
TextEditor class_5742 = class_574;
        Object object = a = class_574.D() ? class_5742.d() : class_5742.g;
        if (class_574.i || ((String)a).isEmpty()) {
            return false;
        }
        GuiScreen.setClipboardString((String)a);
        return --1 != 0;
    }

    private void d(String string) {
        String a = string;
        TextEditor a2 = this;
if (a.isEmpty()) {
            return;
        }
        a2.L(a, UiMode_569.i);
    }

    public void L(String string) {
        String a = string;
        TextEditor a2 = this;
a2.g = a == null ? "" : a;
        a2.c = a2.M = a2.g.length();
        a2.H = 0.0f;
        a2.j.clear();
        a2.I.clear();
        a2.L = UiMode_569.e;
    }

    public TextEditor() {
        TextEditor a;
        TextEditor class_574 = a;
        TextEditor class_5742 = a;
        a.j = new ArrayDeque<UiSupport_592>();
        class_5742.I = new ArrayDeque<UiSupport_592>();
        class_574.g = "";
        class_574.f = Float.MAX_VALUE;
        class_574.L = UiMode_569.e;
    }

    public String d() {
        TextEditor a;
if (a.D()) {
            return a.g.substring(a.L(), a.d());
        }
        return "";
    }

    /*
     * WARNING - void declaration
     */
    private void L(String string, UiMode_569 enum_569) {
        void a;
        void a2;
        TextEditor class_574 = this;
TextEditor class_5742 = class_574;
        int a3 = class_5742.L();
        int n = class_5742.d();
        if (a3 == 0 && a2.isEmpty()) {
            return;
        }
        class_574.L((UiMode_569)a);
        TextEditor class_5743 = class_574;
        class_574.g = class_574.g.substring(0, a3) + (String)a2 + class_574.g.substring(0);
        class_574.c = class_574.M = a3 + a2.length();
        class_574.H = 0.0f;
        if (class_574.k != null) {
            TextEditor class_5744 = class_574;
            class_5744.k.accept(class_5744.g);
        }
    }

    @Generated
    public void d(Runnable runnable) {
        Runnable a = runnable;
        TextEditor a2 = this;
a2.d = a;
    }

    private void L(UiSupport_592 class_592) {
        UiSupport_592 a = class_592;
        TextEditor a2 = this;
TextEditor class_574 = a2;
        Object object = a;
        a2.g = a.L();
        a2.M = Math.clamp((long)((UiSupport_592)object).L(), 0, a2.g.length());
        class_574.c = Math.clamp((long)((UiSupport_592)object).d(), 0, a2.g.length());
        class_574.H = 0.0f;
        a2.L = UiMode_569.e;
        a2.f = Float.MAX_VALUE;
        if (a2.k != null) {
            TextEditor class_5742 = a2;
            class_5742.k.accept(class_5742.g);
        }
    }

    public static String L(String string) {
        String string2 = string;
        int n = 3;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = 117;
        int cfr_ignored_0 = n << n ^ 7;
        int n4 = 0;
        int n5 = 49;
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

    @Generated
    public void L(Runnable runnable) {
        Runnable a = runnable;
        TextEditor a2 = this;
a2.m = a;
    }

    @Generated
    public String L() {
        TextEditor a;
return a.g;
    }

    @Generated
    public boolean i() {
        TextEditor a;
return a.i;
    }

    public boolean D() {
        TextEditor a;
TextEditor class_574 = a;
        if (class_574.M != class_574.c) {
            return 1 != 0;
        }
        return false;
    }

    public void L() {
        TextEditor a;
TextEditor class_574 = a;
        class_574.c = class_574.M;
        class_574.D();
    }

    public boolean d() {
        TextEditor a;
if (a.g.isEmpty()) {
            return 3 >> 2;
        }
        a.d();
        a.L("", UiMode_569.f);
        return 1 != 0;
    }

    public int d() {
        TextEditor a;
TextEditor class_574 = a;
        return Math.max(class_574.M, class_574.c);
    }

    public boolean L(InputSupport_005 class_005) {
        InputSupport_005 a = class_005;
        TextEditor a2 = this;
if (!UiSupport_551.L(a)) {
            return 0 != 0;
        }
        a2.d(Character.toString(a.L()));
        return 5 >> 2;
    }

    /*
     * WARNING - void declaration
     */
    public int L(float f2, UiListener_573 interface_573) {
        int a;
        void a2;
        TextEditor class_574 = this;
String string = class_574.D();
        int n = 0;
        float f3 = Math.abs((float)a2);
        int n2 = 1;
        while (n2 <= string.length()) {
            float f4;
            void a3;
            float f5 = Math.abs(a3.L(string.substring(0, 1)) - a2);
            if (f4 <= f3) {
                f3 = f5;
                n = 1;
            }
            n2 = ++a;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public float L(UiListener_573 interface_573) {
        void a;
        Object a2;
        TextEditor class_574 = this;
Object object = a2 = class_574.D();
        return a.L(((String)object).substring(0, Math.min(class_574.M, ((String)object).length())));
    }

    public boolean L() {
        TextEditor a;
return a.g.isEmpty();
    }

    public int L() {
        TextEditor a;
TextEditor class_574 = a;
        return Math.min(class_574.M, class_574.c);
    }

    public void L(float f2) {
        float a = f2;
        TextEditor a2 = this;
TextEditor class_574 = a2;
        class_574.H = (class_574.H + 1) % 1000.0f;
        if (class_574.f < Float.MAX_VALUE) {
            a2.f += 1;
        }
    }
}

