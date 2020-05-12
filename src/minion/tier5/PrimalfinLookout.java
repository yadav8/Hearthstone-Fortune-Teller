package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class PrimalfinLookout extends BaseMinion {
    public static int id = 5010;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 5;
    public static String Name = "Primalfin Lookout";

    public PrimalfinLookout() {
        this.attack = 3;
        this.health = 2;
    }
}
