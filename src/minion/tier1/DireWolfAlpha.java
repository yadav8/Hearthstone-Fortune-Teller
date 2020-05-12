package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class DireWolfAlpha extends BaseMinion {
    public static int id = 1001;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 1;
    public static String Name = "Dire Wolf Alpha";

    public DireWolfAlpha() {
        this.attack = 2;
        this.health = 2;
    }
}
