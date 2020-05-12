package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class CaveHydra extends BaseMinion {
    public static int id = 4002;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 4;
    public static String Name = "Cave Hydra";

    public CaveHydra() {
        this.attack = 2;
        this.health = 4;
    }
}
