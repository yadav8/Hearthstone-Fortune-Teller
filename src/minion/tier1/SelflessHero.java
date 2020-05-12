package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class SelflessHero extends BaseMinion {
    public static int id = 1011;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 1;
    public static String Name = "Selfless Hero";

    public SelflessHero() {
        this.attack = 2;
        this.health = 1;
    }
}
