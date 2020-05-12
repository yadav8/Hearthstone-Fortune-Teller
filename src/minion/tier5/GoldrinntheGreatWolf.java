package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class GoldrinntheGreatWolf extends BaseMinion {
    public static int id = 5003;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 5;
    public static String Name = "Goldrinn, the Great Wolf";

    public GoldrinntheGreatWolf() {
        this.attack = 4;
        this.health = 4;
    }
}
