package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class UnstableGhoul extends BaseMinion {
    public static int id = 2014;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 2;
    public static String Name = "Unstable Ghoul";

    public UnstableGhoul() {
        this.attack = 1;
        this.health = 3;
    }
}
