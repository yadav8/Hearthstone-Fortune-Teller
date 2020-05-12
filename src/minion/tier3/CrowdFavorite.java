package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class CrowdFavorite extends BaseMinion {
    public static int id = 3002;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Crowd Favorite";

    public CrowdFavorite() {
        this.attack = 4;
        this.health = 4;
    }
}
