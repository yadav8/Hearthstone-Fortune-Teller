package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Imprisoner extends BaseMinion {
    public static int id = 2002;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 2;
    public static String Name = "Imprisoner";

    public Imprisoner() {
        this.attack = 3;
        this.health = 3;
    }
}
