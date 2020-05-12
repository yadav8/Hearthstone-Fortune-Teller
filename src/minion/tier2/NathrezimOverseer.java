package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class NathrezimOverseer extends BaseMinion {
    public static int id = 2007;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 2;
    public static String Name = "Nathrezim Overseer";

    public NathrezimOverseer() {
        this.attack = 2;
        this.health = 3;
    }
}
