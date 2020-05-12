package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ShifterZerus extends BaseMinion {
    public static int id = 3015;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Shifter Zerus";

    public ShifterZerus() {
        this.attack = 1;
        this.health = 1;
    }
}
