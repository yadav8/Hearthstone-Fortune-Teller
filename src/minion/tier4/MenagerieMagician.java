package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MenagerieMagician extends BaseMinion {
    public static int id = 4010;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 4;
    public static String Name = "Menagerie Magician";

    public MenagerieMagician() {
        this.attack = 4;
        this.health = 4;
    }
}
