package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class AnnoyoModule extends BaseMinion {
    public static int id = 4000;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 4;
    public static String Name = "Annoy-o-Module";

    public AnnoyoModule() {
        this.attack = 2;
        this.health = 4;
    }
}
