/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.util.function.Consumer;
import openonyx.core.OnyxClient;
import openonyx.input.InputSupport_003;

public final class FileDialogUtils {
    private FileDialogUtils() {
        FileDialogUtils a;
    }

    public static String L(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 116;
        int n3 = 1;
        int n4 = 122;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (1 < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = 1;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public static void d(String string, String string2, Consumer<String> consumer) {
        void a;
        Consumer<String> a2 = consumer;
        String a3 = string;
Thread thread = new Thread(() -> FileDialogUtils.L(a3, (String)a, a2), "onyx-file-dialog");
        thread.setDaemon(3 >> 1);
        thread.start();
    }

    /*
     * WARNING - void declaration
     */
    private static void L(String string, String string2, Consumer consumer) {
        String string3 = string;
try {
            Object object;
            String a;
            FileDialog a2 = new FileDialog((Frame)null, string3, 0);
            a2.setFile("*.png");
            if (!a.isEmpty() && ((File)(object = new File(a))).getParentFile() != null) {
                a2.setDirectory(((File)object).getParent());
            }
            Object object2 = a2;
            ((Dialog)object2).setVisible(1 != 0);
            object = ((FileDialog)object2).getDirectory();
            a = ((FileDialog)object2).getFile();
            if (object != null && a != null) {
                void a3;
                a3.accept(new File((String)object, a).getAbsolutePath());
                return;
            }
        }
        catch (Throwable a2) {
            OnyxClient.H.warn("File dialog failed - type the path in by hand instead", a2);
        }
    }
}

