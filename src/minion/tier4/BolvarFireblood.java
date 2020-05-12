package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class BolvarFireblood extends BaseMinion {
    public static int id = 4001;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 4;
    public static String Name = "Bolvar, Fireblood";

    public BolvarFireblood() {
        this.attack = 1;
        this.health = 7;
    }
}
