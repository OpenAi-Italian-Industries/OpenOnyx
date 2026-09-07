/*
 * Decompiled with CFR.
 */
package openonyx.features.render;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import openonyx.core.OnyxClient;
import openonyx.events.NotificationDispatcher;
import openonyx.events.FileDialogUtils;
import openonyx.features.Module;
import openonyx.features.ModuleCategory;
import openonyx.features.render.FeatureMode_281;
import openonyx.features.render.FeatureMode_285;
import openonyx.features.hud.group_d.FeatureMode_354;
import openonyx.history.internal.ActionSetting;
import openonyx.history.internal.TextSetting;
import openonyx.history.internal.EnumSetting;
import openonyx.render.RenderSupport_120;
import openonyx.render.group_i.RenderSupport_145;
import openonyx.skins.SkinSupport_072;
import openonyx.skins.SkinSupport_073;
import openonyx.skins.SkinSupport_074;

public final class SkinChanger
extends Module {
    private final static ExecutorService h;
    public EnumSetting<FeatureMode_281> l;
    public ActionSetting I;
    public ActionSetting d;
    public EnumSetting<FeatureMode_285> i;
    public TextSetting f;
    private final static ResourceLocation H;
    public TextSetting e;

    static {
        H = new ResourceLocation("onyx", "skins/local");
        h = Executors.newSingleThreadExecutor(a -> {
Thread thread = new Thread(a, "onyx-skin-loader");
            thread.setDaemon(1 != 0);
            return thread;
        });
    }

    @Override
    protected void L() {
        SkinChanger a;
a.l();
    }

    /*
     * WARNING - void declaration
     */
    private void L(String string, SkinSupport_074 class_074) {
        void a;
        SkinSupport_074 a2 = class_074;
        SkinChanger a3 = this;
a3.L(a2.L(), a2.L(), new StringBuilder().insert(0, "Wearing ").append((String)a).append("'s skin").toString());
    }

    private static void L(String string, FeatureMode_354 enum_354) {
        FeatureMode_354 a = enum_354;
        String a2 = string;
NotificationDispatcher.d("SkinChanger", a2, a);
    }

    /*
     * WARNING - void declaration
     */
    private void d(BufferedImage bufferedImage, String string, String string2) {
        void a;
        void a2;
        String a3 = string2;
        SkinChanger a4 = this;
((Minecraft)((Object)e)).getTextureManager().deleteTexture(H);
        ((Minecraft)((Object)e)).getTextureManager().loadTexture(H, new DynamicTexture((BufferedImage)a2));
        if (!a4.d()) {
            return;
        }
        SkinSupport_073.L(H, (String)a);
        SkinChanger.L(a3, FeatureMode_354.I);
    }

    /*
     * WARNING - void declaration
     */
    private void L(BufferedImage bufferedImage, String string, String string2) {
        void a;
        void a2;
        Object a3 = bufferedImage;
        SkinChanger a4 = this;
a3 = new ImageBufferDownload().parseUserSkin((BufferedImage)a3);
        if (a3 == null) {
            SkinChanger.L("Not a valid skin image", FeatureMode_354.i);
            return;
        }
        ((Minecraft)((Object)e)).addScheduledTask(() -> a4.d((BufferedImage)a3, (String)a2, (String)a));
    }

    private void d(String string) {
        String a = string;
        SkinChanger a2 = this;
h.submit(() -> {
            BufferedImage a;
            void a2;
            SkinChanger class_238 = this;
try {
                a = ImageIO.read(new File((String)a2));
            }
            catch (IOException iOException) {
                Object[] objectArray = new Object[2];
                objectArray[0] = a2;
                objectArray[1] = iOException;
                OnyxClient.H.warn("SkinChanger: failed to read '{}'", objectArray);
                SkinChanger.L("Can't read that file", FeatureMode_354.i);
                return;
            }
            if (a == null) {
                SkinChanger.L("Not a readable PNG", FeatureMode_354.i);
                return;
            }
            if (a.getWidth() != 64 || a.getHeight() != 64 && a.getHeight() != 32) {
                SkinChanger.L(new StringBuilder().insert(0, "Skin must be 64x64 or 64x32, not ").append(a.getWidth()).append("x").append(a.getHeight()).toString(), FeatureMode_354.i);
                return;
            }
            class_238.L(a, class_238.i.L(FeatureMode_285.e) ? "slim" : "default", "Skin applied");
        });
    }

    private void L(String string) {
        String a2 = string;
        SkinChanger a3 = this;
Object object = a2;
        SkinSupport_072.L((String)object, arg_0 -> a3.L((String)object, arg_0), a -> {
Object[] objectArray = new Object[1];
            objectArray[0] = a;
            OnyxClient.H.warn("SkinChanger: {}", objectArray);
            SkinChanger.L(a, FeatureMode_354.i);
        });
    }

    @Override
    protected void D() {
SkinSupport_073.L();
    }

    public SkinChanger() {
        super("SkinChanger", "Overrides your own skin texture locally", ModuleCategory.f);
        SkinChanger a2;
        SkinChanger class_238 = a2;
        a2.l = new EnumSetting<FeatureMode_281>("Source", FeatureMode_281.f);
        class_238.f = ((TextSetting)new TextSetting("Skin file", "").L("Full path to a 64x64 or 64x32 skin PNG")).L(a2.l, (T a) -> {
if (a == FeatureMode_281.f) {
                return 1 != 0;
            }
            return false;
        });
        a2.I = new ActionSetting("Browse", () -> {
            SkinChanger a;
FileDialogUtils.d("Select a skin PNG", (String)a.f.L(), a.f::i);
        }).d("BrowseÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã¢â‚¬Â¦Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¦").L("Or paste the path into the field above").L(() -> {
            SkinChanger a;
return a.l.L(FeatureMode_281.f);
        });
        a2.e = new TextSetting("Player name", "").L(a2.l, (T a) -> {
if (a == FeatureMode_281.H) {
                return 5 >> 2;
            }
            return false;
        });
        a2.i = ((EnumSetting)new EnumSetting<FeatureMode_285>("Arm width", FeatureMode_285.H).L("Slim (Alex) vs default (Steve) - can't be detected from a bare local PNG")).L(a2.l, (T a) -> {
if (a == FeatureMode_281.f) {
                return --1 != 0;
            }
            return false;
        });
        a2.d = new ActionSetting("Apply", () -> {
            SkinChanger a;
if (a.l.L(FeatureMode_281.f)) {
                if (((String)a.f.L()).isEmpty()) {
                    SkinChanger.L("Pick a skin PNG first", FeatureMode_354.e);
                    return;
                }
                SkinChanger class_238 = a;
                class_238.d((String)class_238.f.L());
                return;
            }
            if (((String)a.e.L()).isEmpty()) {
                SkinChanger.L("Type a player name first", FeatureMode_354.e);
                return;
            }
            SkinChanger class_238 = a;
            class_238.L((String)class_238.e.L());
        }).d("Apply skin");
        a2.i.L(enum_285 -> {
            Object a = enum_285;
            SkinChanger a2 = this;
if (a2.d() && a2.l.L(FeatureMode_281.f) && SkinSupport_073.L()) {
                SkinSupport_073.L(SkinSupport_073.L(), a == FeatureMode_285.e ? "slim" : "default");
            }
        });
    }
}

