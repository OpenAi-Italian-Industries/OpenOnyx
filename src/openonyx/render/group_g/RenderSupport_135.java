/*
 * Decompiled with CFR.
 */
package openonyx.render.group_g;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import net.minecraft.util.ResourceLocation;
import openonyx.core.OnyxListener_001;
import openonyx.events.HypixelUtils;
import openonyx.render.RenderSupport_111;

public final class RenderSupport_135
implements OnyxListener_001 {
    private final static int D = 8;
    private final static int c = 128;
    private final static int a = 12;
    private final static float k = 0.7f;
    private final static ResourceLocation g = new ResourceLocation("onyx", "textures/gui/logo.png");
    private final static int M = 176;
    private final static int L = 8;
    private final static Color j;
    private final static int m = 96;
    private final static Color h;
    private final static int l = 136;
    private final static int I = 80;
    private final static Color d;
    private final static int i = 256;
    private final static Color f;
    private final static int H = 8;
    private final static int e = 512;

    static {
        f = new Color(-14474196, --1 != 0);
        j = new Color(-15987695, 1 != 0);
        d = new Color(-16119282, 3 >> 1);
        h = new Color(0x22FFFFFF, 1 != 0);
    }

    private RenderSupport_135() {
        RenderSupport_135 a;
    }

    public static BufferedImage L() throws IOException {
        Graphics2D graphics2D;
        BufferedImage bufferedImage;
        BufferedImage bufferedImage2;
        Object object;
        block8: {
            block6: {
object = e.getResourceManager().getResource(g).getInputStream();
                try {
                    bufferedImage2 = ImageIO.read((InputStream)object);
                    if (object == null) break block6;
                    bufferedImage = bufferedImage2;
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    block7: {
                        if (object != null) {
                            try {
                                ((InputStream)object).close();
                                throwable2 = throwable;
                                break block7;
                            }
                            catch (Throwable throwable3) {
                                throwable.addSuppressed(throwable3);
                            }
                        }
                        throwable2 = throwable;
                    }
                    throw throwable2;
                }
                ((InputStream)object).close();
                break block8;
            }
            bufferedImage = bufferedImage2;
        }
        if (bufferedImage == null) {
            throw new IOException("logo.png is not a readable PNG");
        }
        object = new BufferedImage(512, 256, 2);
        Graphics2D graphics2D2 = graphics2D = ((BufferedImage)object).createGraphics();
        Graphics2D graphics2D3 = graphics2D;
        Graphics2D graphics2D4 = graphics2D;
        Graphics2D graphics2D5 = graphics2D;
        Graphics2D graphics2D6 = graphics2D;
        graphics2D6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D5.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Graphics2D graphics2D7 = graphics2D;
        graphics2D5.setPaint(new GradientPaint(0.0f, 0.0f, f, 0.0f, 136.0f, j));
        graphics2D5.fillRect(0, 0, 176, 136);
        graphics2D4.setPaint(d);
        graphics2D3.fillRect(96, 8, 80, 128);
        graphics2D4.setPaint(h);
        graphics2D3.setStroke(new BasicStroke(8.0f));
        graphics2D2.drawRect(20, 20, 56, 104);
        int n = Math.round(56.0f);
        int n2 = Math.round((float)n * (float)bufferedImage2.getHeight() / (float)bufferedImage2.getWidth());
        graphics2D2.drawImage(bufferedImage2, 8 + (80 - n) / 2, 8 + (128 - n2) / 2, n, n2, null);
        graphics2D.dispose();
        return object;
    }
}

