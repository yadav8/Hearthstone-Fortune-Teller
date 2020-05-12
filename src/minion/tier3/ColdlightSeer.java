package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ColdlightSeer extends BaseMinion {
    public static int id = 3001;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 3;
    public static String Name = "Coldlight Seer";

    public ColdlightSeer() {
        this.attack = 2;
        this.health = 3;
    }
}
