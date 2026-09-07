/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.nio.file.Path;
import openonyx.core.OnyxClient;
import openonyx.input.InputSupport_003;
import openonyx.utilities.UtilitySupport_489;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FileUtils {
    public static void L(Path path) {
        Path path2 = path;
try {
            Class<?> a = Class.forName("java.awt.Desktop");
            Object object = a.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            Class[] classArray = new Class[1];
            classArray[0] = File.class;
            Object[] objectArray = new Object[1];
            objectArray[0] = path2.toFile();
            a.getMethod("open", classArray).invoke(object, objectArray);
            return;
        }
        catch (Throwable a) {
            FileUtils.L(path2.toUri());
            return;
        }
    }

    public static void L(URI uRI) {
        URI uRI2 = uRI;
try {
            Serializable a = Class.forName("java.awt.Desktop");
            Object object = ((Class)a).getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            Class[] classArray = new Class[1];
            classArray[0] = URI.class;
            Object[] objectArray = new Object[1];
            objectArray[0] = uRI2;
            ((Class)a).getMethod("browse", classArray).invoke(object, objectArray);
            return;
        }
        catch (Throwable a) {
            Object[] objectArray = new Object[2];
            objectArray[0] = uRI2;
            objectArray[1] = a;
            OnyxClient.H.error("Could not open {}", objectArray);
            return;
        }
    }

    public static String L(String string) {
        String string2 = string;
        int n = 4;
        int n2 = string2.length();
        int a = n2 - 1;
        char[] cArray = new char[n2];
        int n3 = n << n ^ 0xC;
        int n4 = 0;
        int n5 = 95;
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

    public static void L(String a) {
FileUtils.L(URI.create(a));
    }

    private FileUtils() {
        FileUtils a;
    }
}

