package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class StrongshellScavenger extends BaseMinion {
    public static int id = 5013;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 5;
    public static String Name = "Strongshell Scavenger";

    public StrongshellScavenger() {
        this.attack = 2;
        this.health = 3;
    }
}
