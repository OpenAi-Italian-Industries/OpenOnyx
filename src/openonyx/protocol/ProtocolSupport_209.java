/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.protocol;

import java.util.Iterator;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import openonyx.core.OnyxListener_001;
import openonyx.protocol.group_m.ProtocolSupport_212;
import openonyx.protocol.internal.ProtocolMode_213;
import openonyx.protocol.internal.internal.ProtocolListener_214;
import openonyx.utilities.UtilitySupport_477;
import openonyx.utilities.UtilitySupport_500;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ProtocolSupport_209
implements OnyxListener_001 {
    private final ProtocolSupport_212 h;
    private final int l;
    private final float I;
    private final List<ProtocolListener_214> d;
    private Entity i;
    private final boolean f;
    private final ProtocolMode_213 H;
    private final UtilitySupport_500 e;

    /*
     * WARNING - void declaration
     */
    private ProtocolSupport_212 L(ProtocolSupport_212 class_212, ProtocolSupport_212 class_2122) {
        Iterator<ProtocolListener_214> iterator;
        Object a = class_2122;
        ProtocolSupport_209 a2 = this;
if (a2.d.isEmpty()) {
            return a;
        }
        Iterator<ProtocolListener_214> iterator2 = iterator = a2.d.iterator();
        while (iterator2.hasNext()) {
            void a3;
            a = iterator.next().L(a2, (ProtocolSupport_212)a3, (ProtocolSupport_212)a);
            iterator2 = iterator;
        }
        return a;
    }

    @Generated
    public ProtocolSupport_212 L() {
        ProtocolSupport_209 a;
return a.h;
    }

    @Generated
    public void L(Entity entity) {
        Entity a = entity;
        ProtocolSupport_209 a2 = this;
a2.i = a;
    }

    @Generated
    public UtilitySupport_500 L() {
        ProtocolSupport_209 a;
return a.e;
    }

    @Generated
    public Entity L() {
        ProtocolSupport_209 a;
return a.i;
    }

    @Generated
    public int L() {
        ProtocolSupport_209 a;
return a.l;
    }

    @Generated
    public ProtocolMode_213 L() {
        ProtocolSupport_209 a;
return a.H;
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_209(ProtocolSupport_212 class_212, Entity entity, List<ProtocolListener_214> list, int n, float f2, boolean bl, ProtocolMode_213 enum_213, UtilitySupport_500 class_500) {
        UtilitySupport_500 a;
        void a2;
        void a3;
        void a4;
        void a5;
        void a6;
        void a7;
        void a8;
        ProtocolSupport_209 a9;
        ProtocolSupport_209 class_209 = class_5002;
        UtilitySupport_500 class_5002 = class_500;
        ProtocolSupport_209 class_2092 = a9 = class_209;
        ProtocolSupport_209 class_2093 = a9;
        ProtocolSupport_209 class_2094 = a9;
        ProtocolSupport_209 class_2095 = a9;
        class_2095.h = a8;
        class_2095.i = a7;
        class_2094.d = a6;
        class_2094.l = a5;
        class_2093.I = a4;
        class_2093.f = a3;
        class_2092.H = a2;
        class_2092.e = a;
    }

    @Generated
    public List<ProtocolListener_214> L() {
        ProtocolSupport_209 a;
return a.d;
    }

    /*
     * WARNING - void declaration
     */
    public ProtocolSupport_212 L(ProtocolSupport_212 class_212, boolean bl) {
        void a;
        ProtocolSupport_212 a2 = class_212;
        ProtocolSupport_209 a3 = this;
if (a != false) {
            a3.i = null;
            return a3.L(a2, UtilitySupport_477.L((Entity)((Minecraft)((Object)ProtocolSupport_209.e)).thePlayer));
        }
        return a3.L(a2, a3.h);
    }

    @Generated
    public boolean L() {
        ProtocolSupport_209 a;
return a.f;
    }

    @Generated
    public float L() {
        ProtocolSupport_209 a;
return a.I;
    }
}

