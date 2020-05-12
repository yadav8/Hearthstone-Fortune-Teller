package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class WrathWeaver extends BaseMinion {
    public static int id = 1013;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 1;
    public static String Name = "Wrath Weaver";

    public WrathWeaver() {
        this.attack = 1;
        this.health = 1;
    }
}
