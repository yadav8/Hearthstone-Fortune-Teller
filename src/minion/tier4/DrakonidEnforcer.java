package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class DrakonidEnforcer extends BaseMinion {
    public static int id = 4005;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 4;
    public static String Name = "Drakonid Enforcer";

    public DrakonidEnforcer() {
        this.attack = 3;
        this.health = 6;
    }
}
