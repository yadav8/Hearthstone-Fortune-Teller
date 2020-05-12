package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class HarvestGolem extends BaseMinion {
    public static int id = 2001;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 2;
    public static String Name = "Harvest Golem";

    public HarvestGolem() {
        this.attack = 2;
        this.health = 3;
    }
}
