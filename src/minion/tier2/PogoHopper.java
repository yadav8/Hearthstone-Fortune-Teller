package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class PogoHopper extends BaseMinion {
    public static int id = 2009;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 2;
    public static String Name = "Pogo-Hopper";

    public PogoHopper() {
        this.attack = 1;
        this.health = 1;
    }
}
