/*
 * Decompiled with CFR.
 */
package openonyx.input;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.client.gui.GuiScreen;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class InputSupport_002
extends Record {
    private final int i;
    private final int f;
    private final char H;
    private final int e;

    public boolean i() {
        InputSupport_002 a;
return a.D();
    }

    public boolean D() {
        InputSupport_002 a;
if (GuiScreen.isCtrlKeyDown() && GuiScreen.isCtrlCharTyped(a.H)) {
            return 1 != 0;
        }
        return false;
    }

    public boolean d() {
return GuiScreen.isShiftKeyDown();
    }

    public boolean L() {
return GuiScreen.isAltKeyDown();
    }

    public char L() {
        InputSupport_002 a;
return a.H;
    }

    public int D() {
        InputSupport_002 a;
return a.i;
    }

    public int d() {
        InputSupport_002 a;
return a.e;
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = 2;
        int n3 = string2.length();
        int a = n3 - 1;
        char[] cArray = new char[n3];
        int n4 = 41;
        int n5 = a;
        int n6 = n << n ^ (n2 << n2 ^ 1);
        while (n5 >= 0) {
            int n7 = a--;
            cArray[n7] = (char)(string2.charAt(n7) ^ n6);
            if (a < 0) break;
            int n8 = a--;
            cArray[n8] = (char)(string2.charAt(n8) ^ n4);
            n5 = a;
        }
        return new String(cArray);
    }

    @Override
    public final boolean equals(Object object) {
        Object a = object;
        InputSupport_002 a2 = this;
return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{InputSupport_002.class, "key;scancode;modifiers;typedChar", "i", "f", "e", "H"}, a2, a);
    }

    public InputSupport_002(int n) {
        int a = n;
        InputSupport_002 a2 = this;
        char c = 0;
        a2(a, c, c, c);
    }

    public int L() {
        InputSupport_002 a;
return a.f;
    }

    @Override
    public final int hashCode() {
        InputSupport_002 a;
return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{InputSupport_002.class, "key;scancode;modifiers;typedChar", "i", "f", "e", "H"}, a);
    }

    /*
     * WARNING - void declaration
     */
    public InputSupport_002(int n, int n2, int n3) {
        void a;
        void a2;
        int a3 = n3;
        InputSupport_002 a4 = this;
        a4((int)a2, (int)a, a3, 5 >> 3);
    }

    /*
     * WARNING - void declaration
     */
    public InputSupport_002(int n, int n2, int n3, char c) {
        void a;
        void a2;
        void a3;
        void a4;
        InputSupport_002 a5;
        char c2 = c;
        InputSupport_002 class_002 = a5 = this;
        InputSupport_002 class_0022 = a5;
        class_0022.i = a4;
        class_0022.f = a3;
        class_002.e = a2;
        class_002.H = a;
    }

    @Override
    public final String toString() {
        InputSupport_002 a;
return ObjectMethods.bootstrap("toString", new MethodHandle[]{InputSupport_002.class, "key;scancode;modifiers;typedChar", "i", "f", "e", "H"}, a);
    }
}

