package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Junkbot extends BaseMinion {
    public static int id = 5005;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 5;
    public static String Name = "Junkbot";

    public Junkbot() {
        this.attack = 1;
        this.health = 5;
    }
}
