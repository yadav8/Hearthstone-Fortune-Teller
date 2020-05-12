package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Mecharoo extends BaseMinion {
    public static int id = 1004;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 1;
    public static String Name = "Mecharoo";

    public Mecharoo() {
        this.attack = 1;
        this.health = 1;
    }
}
