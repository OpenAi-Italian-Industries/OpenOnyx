/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.movement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lombok.Generated;
import openonyx.events.FileDialogUtils;
import openonyx.movement.MovementSupport_086;
import openonyx.movement.MovementSupport_088;
import openonyx.movement.MovementSupport_089;
import openonyx.movement.MovementSupport_091;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MovementSupport_083 {
    private final List<MovementSupport_088> i;
    private final MovementSupport_086 f;
    private final ReentrantReadWriteLock H;
    private int e;

    @Generated
    public MovementSupport_086 L() {
        MovementSupport_083 a;
return a.f;
    }

    public MovementSupport_083(MovementSupport_086 class_086) {
        MovementSupport_086 a = class_086;
        MovementSupport_083 a2 = this;
        MovementSupport_083 class_083 = a2;
        class_083.i = new ArrayList<MovementSupport_088>();
        a2.H = new ReentrantReadWriteLock();
        a2.f = a;
        a2.i.add(new MovementSupport_088(a));
    }

    /*
     * WARNING - void declaration
     */
    public Iterator<MovementSupport_088> L(int n, int n2) {
        void a;
        int a2 = n2;
        MovementSupport_083 a3 = this;
if (a2 >= 1200) {
            throw new IllegalStateException("tried to simulate a player for more than a minute!");
        }
        a3.L(a2 + 1);
        return new MovementSupport_089(a3, (int)a, a2);
    }

    public void L(int n) {
        int a = n;
        MovementSupport_083 a2 = this;
if (0 < 0) {
            throw new IllegalStateException("ticks may not be negative");
        }
        if (a2.e >= 0) {
            return;
        }
        a2.H.writeLock().lock();
        try {
            while (a2.e < 0) {
                MovementSupport_083 class_083 = a2;
                class_083.f.L();
                class_083.i.add(new MovementSupport_088(a2.f));
                a2.e += 1;
            }
            return;
        }
        finally {
            a2.H.writeLock().unlock();
        }
    }

    public MovementSupport_088 L(int n) {
        int a3 = n;
        MovementSupport_083 a2 = this;
MovementSupport_083 class_083 = a2;
        class_083.L(a3);
        class_083.H.readLock().lock();
        try {
            MovementSupport_088 a3 = a2.i.get(a3);
            return a3;
        }
        finally {
            a2.H.readLock().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public List<MovementSupport_088> L(int n, int n2) {
        void a;
        int a22 = n;
        MovementSupport_083 a3 = this;
if (a >= 1200) {
            throw new IllegalStateException("tried to simulate a player for more than a minute!");
        }
        MovementSupport_083 class_083 = a3;
        class_083.L((int)(a + 1));
        class_083.H.readLock().lock();
        try {
            List<MovementSupport_088> a22 = List.copyOf(a3.i.subList(0, (int)(a + 1)));
            return a22;
        }
        finally {
            a3.H.readLock().unlock();
        }
    }

    public Iterator<MovementSupport_088> L() {
        MovementSupport_083 a;
return new MovementSupport_091(a);
    }
}

