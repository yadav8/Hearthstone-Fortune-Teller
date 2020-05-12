package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ScrewjankClunker extends BaseMinion {
    public static int id = 3014;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 3;
    public static String Name = "Screwjank Clunker";

    public ScrewjankClunker() {
        this.attack = 2;
        this.health = 5;
    }
}
