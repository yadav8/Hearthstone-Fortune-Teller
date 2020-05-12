package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class Maexxna extends BaseMinion {
    public static int id = 6007;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 6;
    public static String Name = "Maexxna";

    public Maexxna() {
        this.attack = 2;
        this.health = 8;
    }
}
