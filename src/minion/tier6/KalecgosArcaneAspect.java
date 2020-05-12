package minion.tier6;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class KalecgosArcaneAspect extends BaseMinion {
    public static int id = 6005;    // Internal database ID
    public static Tribe tribe = DRAGON;
    public static int tier = 6;
    public static String Name = "Kalecgos, Arcane Aspect";

    public KalecgosArcaneAspect() {
        this.attack = 4;
        this.health = 12;
    }
}
