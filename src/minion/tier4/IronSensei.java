package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class IronSensei extends BaseMinion {
    public static int id = 4008;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 4;
    public static String Name = "Iron Sensei";

    public IronSensei() {
        this.attack = 2;
        this.health = 2;
    }
}
