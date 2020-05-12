package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class DefenderofArgus extends BaseMinion {
    public static int id = 4004;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 4;
    public static String Name = "Defender of Argus";

    public DefenderofArgus() {
        this.attack = 2;
        this.health = 3;
    }
}
