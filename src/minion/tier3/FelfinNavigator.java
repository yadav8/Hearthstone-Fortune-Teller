package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class FelfinNavigator extends BaseMinion {
    public static int id = 3005;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 3;
    public static String Name = "Felfin Navigator";

    public FelfinNavigator() {
        this.attack = 4;
        this.health = 4;
    }
}
