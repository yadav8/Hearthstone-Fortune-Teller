package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Ghastcoiler extends BaseMinion {
    public static int id = 6002;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 6;
    public static String Name = "Ghastcoiler";

    public Ghastcoiler() {
        this.attack = 7;
        this.health = 7;
    }
}
