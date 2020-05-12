package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MalGanis extends BaseMinion {
    public static int id = 5008;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 5;
    public static String Name = "Mal'Ganis";

    public MalGanis() {
        this.attack = 9;
        this.health = 7;
    }
}
