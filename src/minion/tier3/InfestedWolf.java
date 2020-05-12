package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class InfestedWolf extends BaseMinion {
    public static int id = 3009;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 3;
    public static String Name = "Infested Wolf";

    public InfestedWolf() {
        this.attack = 3;
        this.health = 3;
    }
}
