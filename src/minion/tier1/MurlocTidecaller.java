package minion.tier1;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MurlocTidecaller extends BaseMinion {
    public static int id = 1006;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 1;
    public static String Name = "Murloc Tidecaller";

    public MurlocTidecaller() {
        this.attack = 1;
        this.health = 2;
    }
}
