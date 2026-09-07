/*
 * Decompiled with CFR.
 */
package openonyx.render.group_w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import openonyx.connection.NetworkSupport_453;
import openonyx.core.OnyxListener_001;
import openonyx.features.hud.CustomGui;
import openonyx.features.hud.internal.FeatureSupport_377;
import openonyx.render.RenderSupport_103;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_d.RenderSupport_121;
import openonyx.render.group_d.RenderSupport_123;
import openonyx.render.group_e.RenderSupport_128;
import openonyx.render.group_w.RenderSupport_187;
import openonyx.render.group_w.RenderSupport_188;
import openonyx.render.group_w.RenderSupport_191;
import openonyx.render.group_w.RenderSupport_198;
import openonyx.theme.ThemeSupport_055;
import openonyx.theme.ThemeSupport_057;
import openonyx.theme.ThemeSupport_059;
import openonyx.theme.ThemeSupport_060;

public final class RenderSupport_192
extends RenderSupport_191 {
    private final static float a = 7.0f;
    private final static float k = 5.0f;
    private final List<RenderSupport_187> g;
    private final static float M = 60.0f;
    private final static int L = 3;
    private final RenderSupport_121 j;
    private final CustomGui m;
    private final static float h = 11.0f;
    private final static int l = 15;
    private final static RenderSupport_128 I = ThemeSupport_057.m;
    private final static float d = 1.0f;
    private final static float i = 6.0f;
    private final static RenderSupport_128 f = ThemeSupport_057.m;
    private String H;
    private final RenderSupport_121 e;

    private void d() {
        int n;
        Score score;
        RenderSupport_192 class_192 = this;
class_192.g.clear();
        class_192.H = "";
        Object a = Minecraft.getMinecraft();
        if (((Minecraft)a).theWorld == null || ((Minecraft)a).thePlayer == null) {
            return;
        }
        if ((a = RenderSupport_192.L((Minecraft)a)) == null) {
            return;
        }
        Scoreboard scoreboard = ((ScoreObjective)a).getScoreboard();
        List list = new ArrayList<Score>();
        Iterator<Score> iterator = scoreboard.getSortedScores((ScoreObjective)a).iterator();
        block0: while (true) {
            Iterator<Score> iterator2 = iterator;
            while (iterator2.hasNext()) {
                score = iterator.next();
                if (score.getPlayerName() == null) continue block0;
                if (score.getPlayerName().startsWith("#")) {
                    iterator2 = iterator;
                    continue;
                }
                list.add(score);
                iterator2 = iterator;
            }
            break;
        }
        if (list.size() > 15) {
            ArrayList<Score> arrayList = list;
            list = arrayList.subList(list.size() - 15, arrayList.size());
        }
        class_192.H = ((ScoreObjective)a).getDisplayName();
        int n2 = n = list.size() - 1;
        while (n2 >= 0) {
            score = (Score)list.get(n);
            a = scoreboard.getPlayersTeam(score.getPlayerName());
            class_192.g.add(new RenderSupport_187(ScorePlayerTeam.formatPlayerName((Team)a, score.getPlayerName())));
            n2 = --n;
        }
    }

    @Override
    protected float L(RenderSupport_103 class_103) {
        OnyxListener_001 a22 = class_103;
        RenderSupport_192 a = this;
float a22 = 29.0f + (float)a.g.size() * 11.0f;
        RenderSupport_192 class_192 = a;
        a.j.L(15, 200.0f, RenderSupport_123.l);
        class_192.j.L(RenderSupport_198.D());
        return class_192.j.L();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected float d(RenderSupport_103 class_103) {
        Object a22;
        void a;
        RenderSupport_192 class_192 = this;
RenderSupport_192 class_1922 = class_192;
        float f2 = RenderSupport_188.L((RenderSupport_103)a, f, class_1922.H);
        Object object = a22 = class_1922.g.iterator();
        while (object.hasNext()) {
            RenderSupport_187 class_187 = (RenderSupport_187)a22.next();
            f2 = Math.max(f2, RenderSupport_188.L((RenderSupport_103)a, I, class_187.L()));
            object = a22;
        }
        RenderSupport_192 class_1923 = class_192;
        float a22 = class_1923.m.m.d.L();
        class_1923.e.L(Math.max(15, f2 + 14.0f), 200.0f, RenderSupport_123.l);
        class_192.e.L(RenderSupport_198.D());
        return class_1923.e.L();
    }

    public RenderSupport_192(CustomGui class_344) {
        RenderSupport_192 a;
        OnyxListener_001 a2 = class_344;
        RenderSupport_192 class_192 = a = this;
        super("mcgui:scoreboard", ((CustomGui)a2).m.H, ((CustomGui)a2).m.f, ((CustomGui)a2).m.e);
        RenderSupport_192 class_1922 = a;
        a.e = new RenderSupport_121(60.0f);
        class_1922.j = new RenderSupport_121(22.0f);
        a.g = new ArrayList<RenderSupport_187>();
        class_192.H = "";
        class_192.m = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void L(RenderSupport_103 class_103, float f2, float f3, float f4) {
        float a;
        void a2;
        float a222 = f3;
        RenderSupport_192 a3 = this;
ThemeSupport_055 a4 = ThemeSupport_059.L();
        int n = ThemeSupport_059.L(ThemeSupport_060.L(3, a4), a3.m.m.i.L() / 100.0f);
        RenderSupport_120.L(a3.m.m.I.d());
        void v0 = a2;
        a2.d(0.0f, 0.0f, a, 0, 12.0f, 3);
        RenderSupport_120.L((RenderSupport_103)v0, 0.0f, 0.0f, a, 0, 12.0f, n, a3.m.m.I.d());
        v0.d(0.0f, 0.0f, a, 0);
        a222 = 6.0f;
        RenderSupport_188.i((RenderSupport_103)v0, f, a3.H, (float)(a / 2.0f), a2.d(f, 5.5f), a4.d());
        float f5 = 13.5f;
        a2.D(7.0f, f5, (float)(a - 14.0f), 1.0f, Float.MAX_VALUE, a4.P());
        a = 17.0f;
        Iterator<RenderSupport_187> a222 = a3.g.iterator();
        Iterator<RenderSupport_187> iterator = a222;
        while (iterator.hasNext()) {
            RenderSupport_187 class_187 = a222.next();
            float f6 = a + 5.5f;
            iterator = a222;
            RenderSupport_188.l((RenderSupport_103)a2, I, class_187.L(), 7.0f, a2.d(I, f6), a4.F());
            a += 11.0f;
        }
        a2.L();
    }

    private static ScoreObjective L(Minecraft minecraft) {
        Minecraft minecraft2 = minecraft;
Scoreboard scoreboard = minecraft2.theWorld.getScoreboard();
        ScorePlayerTeam a = scoreboard.getPlayersTeam(minecraft2.thePlayer.getName());
        if (a != null && (a = a.getChatFormat().getColorIndex()) >= 0 && (a = scoreboard.getObjectiveInDisplaySlot(3)) != null) {
            return a;
        }
        return scoreboard.getObjectiveInDisplaySlot(1);
    }

    @Override
    protected boolean L(boolean bl) {
        boolean a = bl;
        RenderSupport_192 a2 = this;
RenderSupport_192 class_192 = a2;
        class_192.d();
        if (!class_192.g.isEmpty()) {
            return 1 != 0;
        }
        return false;
    }
}

