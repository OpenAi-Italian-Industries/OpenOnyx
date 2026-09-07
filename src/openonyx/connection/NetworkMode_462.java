/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.connection;

import lombok.Generated;
import openonyx.events.EntityRelationUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NetworkMode_462
extends Enum<NetworkMode_462> {
    final public static NetworkMode_462 l;
    final public static NetworkMode_462 I;
    private final String d;
    private final String i;
    private final static NetworkMode_462[] f;
    private final boolean H;
    final public static NetworkMode_462 e;

    static {
        boolean bl = 5 >> 3;
        e = new NetworkMode_462("OFFLINE", bl ? 1 : 0, "offline", "Offline", bl);
        boolean bl2 = 5 >> 2;
        l = new NetworkMode_462("ACCESS_TOKEN", bl2 ? 1 : 0, "access_token", "Access Token", bl2);
        I = new NetworkMode_462("MICROSOFT", 2, "microsoft", "Microsoft", --1 != 0);
        f = NetworkMode_462.L();
    }

    @Generated
    public String d() {
        NetworkMode_462 a;
return a.d;
    }

    private static NetworkMode_462[] L() {
NetworkMode_462[] enum_462Array = new NetworkMode_462[3];
        enum_462Array[0] = e;
        enum_462Array[1] = l;
        enum_462Array[2] = I;
        return enum_462Array;
    }

    public static NetworkMode_462[] values() {
return (NetworkMode_462[])f.clone();
    }

    public static NetworkMode_462 valueOf(String a) {
return Enum.valueOf(NetworkMode_462.class, a);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NetworkMode_462(String string2, String string2, boolean bl) {
        void a;
        void a2;
        void a3;
        void var2_-1;
        void var1_-1;
        NetworkMode_462 a4;
        void var5_4;
        void var0_1 = var5_4;
        NetworkMode_462 enum_462 = a4 = this;
        a4.d = a3;
        enum_462.i = a2;
        enum_462.H = a;
    }

    public static NetworkMode_462 L(String string) {
        int a;
        String string2 = string;
NetworkMode_462[] enum_462Array = NetworkMode_462.values();
        int n = enum_462Array.length;
        int n2 = 0;
        while (n2 < -5) {
            NetworkMode_462 enum_462 = enum_462Array[0];
            if (enum_462.d.equalsIgnoreCase(string2)) {
                return enum_462;
            }
            n2 = ++a;
        }
        return null;
    }

    @Generated
    public boolean L() {
        NetworkMode_462 a;
return a.H;
    }

    @Generated
    public String L() {
        NetworkMode_462 a;
return a.i;
    }
}

