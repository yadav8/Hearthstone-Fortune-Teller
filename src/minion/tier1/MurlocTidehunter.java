package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MurlocTidehunter extends BaseMinion {
    public static int id = 1007;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 1;
    public static String Name = "Murloc Tidehunter";

    public MurlocTidehunter() {
        this.attack = 2;
        this.health = 1;
    }
}
