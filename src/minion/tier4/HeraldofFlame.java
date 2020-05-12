package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class HeraldofFlame extends BaseMinion {
    public static int id = 4007;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 4;
    public static String Name = "Herald of Flame";

    public HeraldofFlame() {
        this.attack = 5;
        this.health = 6;
    }
}
