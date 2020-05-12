package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MicroMachine extends BaseMinion {
    public static int id = 1005;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 1;
    public static String Name = "Micro Machine";

    public MicroMachine() {
        this.attack = 1;
        this.health = 2;
    }
}
