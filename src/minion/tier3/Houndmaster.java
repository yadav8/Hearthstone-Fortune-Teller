package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Houndmaster extends BaseMinion {
    public static int id = 3007;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Houndmaster";

    public Houndmaster() {
        this.attack = 4;
        this.health = 3;
    }
}
