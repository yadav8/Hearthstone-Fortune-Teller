package minion.tier3;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class SoulJuggler extends BaseMinion {
    public static int id = 3016;    // Internal database ID
    public static Tribe tribe = NEUTRAL;
    public static int tier = 3;
    public static String Name = "Soul Juggler";

    public SoulJuggler() {
        this.attack = 3;
        this.health = 3;
    }
}
