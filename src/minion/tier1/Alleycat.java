package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Alleycat extends BaseMinion {
    public static int id = 1000;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 1;
    public static String Name = "Alleycat";

    public Alleycat() {
        this.attack = 1;
        this.health = 1;
    }
}
