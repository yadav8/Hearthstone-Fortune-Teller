package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Crystalweaver extends BaseMinion {
    public static int id = 3003;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Crystalweaver";

    public Crystalweaver() {
        this.attack = 5;
        this.health = 4;
    }
}
