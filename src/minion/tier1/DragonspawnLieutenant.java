package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class DragonspawnLieutenant extends BaseMinion {
    public static int id = 1002;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 1;
    public static String Name = "Dragonspawn Lieutenant";

    public DragonspawnLieutenant() {
        this.attack = 2;
        this.health = 3;
    }
}
