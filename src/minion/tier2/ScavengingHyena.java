package minion.tier2;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class ScavengingHyena extends BaseMinion {
    public static int id = 2011;    // Internal database ID
    public static Tribe tribe = BEAST;
    public static int tier = 2;
    public static String Name = "Scavenging Hyena";

    public ScavengingHyena() {
        this.attack = 2;
        this.health = 2;
    }
}
