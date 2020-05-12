package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class GlyphGuardian extends BaseMinion {
    public static int id = 2000;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 2;
    public static String Name = "Glyph Guardian";

    public GlyphGuardian() {
        this.attack = 2;
        this.health = 4;
    }
}
