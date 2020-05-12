package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ZappSlywick extends BaseMinion {
    public static int id = 6010;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 6;
    public static String Name = "Zapp Slywick";

    public ZappSlywick() {
        this.attack = 7;
        this.health = 10;
    }
}
