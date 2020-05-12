package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class BrannBronzebeard extends BaseMinion {
    public static int id = 5002;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 5;
    public static String Name = "Brann Bronzebeard";

    public BrannBronzebeard() {
        this.attack = 2;
        this.health = 4;
    }
}
