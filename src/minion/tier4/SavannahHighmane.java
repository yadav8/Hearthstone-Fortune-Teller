package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class SavannahHighmane extends BaseMinion {
    public static int id = 4011;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 4;
    public static String Name = "Savannah Highmane";

    public SavannahHighmane() {
        this.attack = 6;
        this.health = 5;
    }
}
