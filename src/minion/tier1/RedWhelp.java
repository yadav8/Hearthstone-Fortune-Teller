package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class RedWhelp extends BaseMinion {
    public static int id = 1008;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 1;
    public static String Name = "Red Whelp";

    public RedWhelp() {
        this.attack = 1;
        this.health = 2;
    }
}
