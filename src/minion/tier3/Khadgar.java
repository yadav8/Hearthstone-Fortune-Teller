package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Khadgar extends BaseMinion {
    public static int id = 3010;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Khadgar";

    public Khadgar() {
        this.attack = 2;
        this.health = 2;
    }
}
