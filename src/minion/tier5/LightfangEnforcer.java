package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class LightfangEnforcer extends BaseMinion {
    public static int id = 5007;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 5;
    public static String Name = "Lightfang Enforcer";

    public LightfangEnforcer() {
        this.attack = 2;
        this.health = 2;
    }
}
