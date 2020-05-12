package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class FoeReaper extends BaseMinion {
    public static int id = 6000;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 6;
    public static String Name = "Foe Reaper 4000";

    public FoeReaper() {
        this.attack = 6;
        this.health = 9;
    }
}
