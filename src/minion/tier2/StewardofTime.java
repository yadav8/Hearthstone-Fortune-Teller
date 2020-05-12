package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class StewardofTime extends BaseMinion {
    public static int id = 2013;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 2;
    public static String Name = "Steward of Time";

    public StewardofTime() {
        this.attack = 3;
        this.health = 4;
    }
}
