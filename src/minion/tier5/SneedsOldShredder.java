package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class SneedsOldShredder extends BaseMinion {
    public static int id = 5012;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 5;
    public static String Name = "Sneed's Old Shredder";

    public SneedsOldShredder() {
        this.attack = 5;
        this.health = 7;
    }
}
