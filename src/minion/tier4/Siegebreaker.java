package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Siegebreaker extends BaseMinion {
    public static int id = 4013;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 4;
    public static String Name = "Siegebreaker";

    public Siegebreaker() {
        this.attack = 5;
        this.health = 8;
    }
}
