package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class GentleMegasaur extends BaseMinion {
    public static int id = 6001;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 6;
    public static String Name = "Gentle Megasaur";

    public GentleMegasaur() {
        this.attack = 5;
        this.health = 4;
    }
}
