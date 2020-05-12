package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ImpMama extends BaseMinion {
    public static int id = 6004;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 6;
    public static String Name = "Imp Mama";

    public ImpMama() {
        this.attack = 6;
        this.health = 10;
    }
}
