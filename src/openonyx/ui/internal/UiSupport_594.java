/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package openonyx.ui.internal;

import java.util.ArrayList;
import lombok.Generated;
import openonyx.core.OnyxListener_001;
import openonyx.events.HypixelUtils;
import openonyx.features.Module;
import openonyx.history.Setting;
import openonyx.theme.ThemeSupport_057;
import openonyx.ui.UiSupport_548;
import openonyx.ui.UiSupport_553;
import openonyx.ui.internal.UiSupport_593;

public class UiSupport_594
extends UiSupport_553 {
    private final static float l = 460.0f;
    private final UiSupport_593 H;
    private Module e;

    @Override
    public void L(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_594 a2 = this;
if (a2.e == null) {
            return;
        }
        if (a2.H.L()) {
            UiSupport_594 class_594 = a2;
            UiSupport_594 class_5942 = a2;
            a.e.L(ThemeSupport_057.I, "This module has no settings", class_594.f + class_594.e / 2.0f, class_5942.d + class_5942.i / 2.0f, a.L().F());
            return;
        }
        super.L(a);
    }

    @Generated
    public Module L() {
        UiSupport_594 a;
return a.e;
    }

    private float l() {
        UiSupport_594 a;
return Math.min((float)(a.e - 12.0f), 460.0f);
    }

    public void L(Module class_227) {
        OnyxListener_001 a = class_227;
        UiSupport_594 a2 = this;
if (a2.e == a) {
            return;
        }
        UiSupport_594 class_594 = a2;
        a2.e = a;
        class_594.l.clear();
        class_594.H.L();
        class_594.m = 0.0f;
        a2.h.L(0.0f);
        if (a == null) {
            return;
        }
        ArrayList<Setting> arrayList = new ArrayList<Setting>();
        arrayList.add(((Module)a).L());
        arrayList.addAll(((Module)a).L());
        UiSupport_594 class_5942 = a2;
        class_5942.H.L(arrayList);
        class_5942.l.addAll(a2.H.L());
    }

    @Override
    protected void D(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_594 a2 = this;
a2.H.L(a.e, a2.h(), a2.l(), a.L().P(), 1.0f);
    }

    private float h() {
        UiSupport_594 a;
UiSupport_594 class_594 = a;
        return class_594.f + (class_594.e - a.l()) / 2.0f;
    }

    @Override
    protected void i(UiSupport_548 class_548) {
        UiSupport_548 a = class_548;
        UiSupport_594 a2 = this;
a2.I = a2.H.L(a2.h(), a2.d - a2.h.L(), a2.l());
    }

    public UiSupport_594() {
        UiSupport_594 a;
        UiSupport_594 class_594 = a;
        class_594.H = new UiSupport_593();
    }
}

