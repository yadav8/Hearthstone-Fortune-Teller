package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class OldMurkEye extends BaseMinion {
    public static int id = 2008;    // Internal database ID
    public static Tribe tribe = MURLOC;
    public static int tier = 2;
    public static String Name = "Old Murk-Eye";

    public OldMurkEye() {
        this.attack = 2;
        this.health = 4;
    }
}
