package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class KaboomBot extends BaseMinion {
    public static int id = 2003;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 2;
    public static String Name = "Kaboom Bot";

    public KaboomBot() {
        this.attack = 2;
        this.health = 2;
    }
}
