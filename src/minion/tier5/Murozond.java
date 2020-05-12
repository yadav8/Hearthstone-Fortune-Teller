package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Murozond extends BaseMinion {
    public static int id = 5009;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 5;
    public static String Name = "Murozond";

    public Murozond() {
        this.attack = 5;
        this.health = 5;
    }
}
