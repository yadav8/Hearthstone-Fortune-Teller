package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class IronhideDirehorn extends BaseMinion {
    public static int id = 5004;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 5;
    public static String Name = "Ironhide Direhorn";

    public IronhideDirehorn() {
        this.attack = 7;
        this.health = 7;
    }
}
