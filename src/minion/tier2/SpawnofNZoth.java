package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class SpawnofNZoth extends BaseMinion {
    public static int id = 2012;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 2;
    public static String Name = "Spawn of N'Zoth";

    public SpawnofNZoth() {
        this.attack = 2;
        this.health = 2;
    }
}
