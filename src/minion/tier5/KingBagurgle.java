package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class KingBagurgle extends BaseMinion {
    public static int id = 5006;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 5;
    public static String Name = "King Bagurgle";

    public KingBagurgle() {
        this.attack = 6;
        this.health = 3;
    }
}
