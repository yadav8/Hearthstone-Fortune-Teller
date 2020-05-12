package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Toxfin extends BaseMinion {
    public static int id = 4014;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 4;
    public static String Name = "Toxfin";

    public Toxfin() {
        this.attack = 1;
        this.health = 2;
    }
}
