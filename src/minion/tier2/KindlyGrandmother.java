package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class KindlyGrandmother extends BaseMinion {
    public static int id = 2004;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 2;
    public static String Name = "Kindly Grandmother";

    public KindlyGrandmother() {
        this.attack = 1;
        this.health = 1;
    }
}
