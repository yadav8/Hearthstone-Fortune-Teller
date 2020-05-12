package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class NadinatheRed extends BaseMinion {
    public static int id = 6009;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 6;
    public static String Name = "Nadina the Red";

    public NadinatheRed() {
        this.attack = 7;
        this.health = 4;
    }
}
