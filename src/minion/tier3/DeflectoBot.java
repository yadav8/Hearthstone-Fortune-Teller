package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class DeflectoBot extends BaseMinion {
    public static int id = 3004;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 3;
    public static String Name = "Deflect-o-Bot";

    public DeflectoBot() {
        this.attack = 3;
        this.health = 2;
    }
}
