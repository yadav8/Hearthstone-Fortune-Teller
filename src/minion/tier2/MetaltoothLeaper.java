package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MetaltoothLeaper extends BaseMinion {
    public static int id = 2005;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 2;
    public static String Name = "Metaltooth Leaper";

    public MetaltoothLeaper() {
        this.attack = 3;
        this.health = 3;
    }
}
