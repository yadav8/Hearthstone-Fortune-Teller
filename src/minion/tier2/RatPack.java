package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class RatPack extends BaseMinion {
    public static int id = 2010;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 2;
    public static String Name = "Rat Pack";

    public RatPack() {
        this.attack = 2;
        this.health = 2;
    }
}
