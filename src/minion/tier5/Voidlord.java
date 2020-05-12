package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Voidlord extends BaseMinion {
    public static int id = 5014;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 5;
    public static String Name = "Voidlord";

    public Voidlord() {
        this.attack = 3;
        this.health = 9;
    }
}
