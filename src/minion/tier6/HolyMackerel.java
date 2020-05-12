package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class HolyMackerel extends BaseMinion {
    public static int id = 6003;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 6;
    public static String Name = "Holy Mackerel";

    public HolyMackerel() {
        this.attack = 8;
        this.health = 4;
    }
}
