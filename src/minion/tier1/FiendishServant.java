package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class FiendishServant extends BaseMinion {
    public static int id = 1003;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 1;
    public static String Name = "Fiendish Servant";

    public FiendishServant() {
        this.attack = 2;
        this.health = 1;
    }
}
