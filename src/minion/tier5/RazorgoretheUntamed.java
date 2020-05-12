package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class RazorgoretheUntamed extends BaseMinion {
    public static int id = 5011;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 5;
    public static String Name = "Razorgore, the Untamed";

    public RazorgoretheUntamed() {
        this.attack = 2;
        this.health = 4;
    }
}
