package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class PackLeader extends BaseMinion {
    public static int id = 3011;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Pack Leader";

    public PackLeader() {
        this.attack = 3;
        this.health = 3;
    }
}
