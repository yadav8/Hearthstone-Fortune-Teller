package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class PilotedShredder extends BaseMinion {
    public static int id = 3012;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 3;
    public static String Name = "Piloted Shredder";

    public PilotedShredder() {
        this.attack = 4;
        this.health = 3;
    }
}
