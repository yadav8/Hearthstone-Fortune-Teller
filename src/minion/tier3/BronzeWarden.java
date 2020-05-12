package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class BronzeWarden extends BaseMinion {
    public static int id = 3000;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 3;
    public static String Name = "Bronze Warden";

    public BronzeWarden() {
        this.attack = 2;
        this.health = 1;
    }
}
