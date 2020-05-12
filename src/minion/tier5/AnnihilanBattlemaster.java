package minion.tier5;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class AnnihilanBattlemaster extends BaseMinion {
    public static int id = 5000;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 5;
    public static String Name = "Annihilan Battlemaster";

    public AnnihilanBattlemaster() {
        this.attack = 3;
        this.health = 1;
    }
}
