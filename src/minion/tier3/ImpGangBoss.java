package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ImpGangBoss extends BaseMinion {
    public static int id = 3008;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 3;
    public static String Name = "Imp Gang Boss";

    public ImpGangBoss() {
        this.attack = 2;
        this.health = 4;
    }
}
