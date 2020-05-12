package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class TheBeast extends BaseMinion {
    public static int id = 3017;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 3;
    public static String Name = "The Beast";

    public TheBeast() {
        this.attack = 9;
        this.health = 7;
    }
}
