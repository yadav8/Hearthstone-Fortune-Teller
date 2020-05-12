package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class VirmenSensei extends BaseMinion {
    public static int id = 4015;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 4;
    public static String Name = "Virmen Sensei";

    public VirmenSensei() {
        this.attack = 4;
        this.health = 5;
    }
}
