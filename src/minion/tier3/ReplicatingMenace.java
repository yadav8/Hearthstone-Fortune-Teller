package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ReplicatingMenace extends BaseMinion {
    public static int id = 3013;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 3;
    public static String Name = "Replicating Menace";

    public ReplicatingMenace() {
        this.attack = 3;
        this.health = 1;
    }
}
