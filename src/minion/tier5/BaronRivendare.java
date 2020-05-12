package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class BaronRivendare extends BaseMinion {
    public static int id = 5001;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 5;
    public static String Name = "Baron Rivendare";

    public BaronRivendare() {
        this.attack = 1;
        this.health = 7;
    }
}
