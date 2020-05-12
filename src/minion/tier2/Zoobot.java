package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Zoobot extends BaseMinion {
    public static int id = 2016;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 2;
    public static String Name = "Zoobot";

    public Zoobot() {
        this.attack = 3;
        this.health = 3;
    }
}
