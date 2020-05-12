package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class CobaltScalebane extends BaseMinion {
    public static int id = 4003;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 4;
    public static String Name = "Cobalt Scalebane";

    public CobaltScalebane() {
        this.attack = 5;
        this.health = 5;
    }
}
