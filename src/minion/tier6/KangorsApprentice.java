package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class KangorsApprentice extends BaseMinion {
    public static int id = 6006;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 6;
    public static String Name = "Kangor's Apprentice";

    public KangorsApprentice() {
        this.attack = 3;
        this.health = 6;
    }
}
