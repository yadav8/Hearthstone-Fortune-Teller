package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MurlocWarleader extends BaseMinion {
    public static int id = 2006;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 2;
    public static String Name = "Murloc Warleader";

    public MurlocWarleader() {
        this.attack = 3;
        this.health = 3;
    }
}
