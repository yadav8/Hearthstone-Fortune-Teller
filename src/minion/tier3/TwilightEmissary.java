package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class TwilightEmissary extends BaseMinion {
    public static int id = 3018;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 3;
    public static String Name = "Twilight Emissary";

    public TwilightEmissary() {
        this.attack = 4;
        this.health = 4;
    }
}
