/*
 * Decompiled with CFR.
 */
package openonyx.events;

import java.util.regex.Pattern;
import openonyx.events.EntityRelationUtils;
import openonyx.render.group_i.RenderSupport_145;

public final class ChatFormattingUtils {
    private final static Pattern e = Pattern.compile("(?i)ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â§[0-9A-FK-OR]");

    public static String L(String a) {
if (a == null || a.indexOf(167) < 0) {
            if (a == null) {
                return "";
            }
            return a;
        }
        return e.matcher(a).replaceAll("").replace("ÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â§", "");
    }

    private ChatFormattingUtils() {
        ChatFormattingUtils a;
    }
}

