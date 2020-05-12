package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class SecurityRover extends BaseMinion {
    public static int id = 4012;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 4;
    public static String Name = "Security Rover";

    public SecurityRover() {
        this.attack = 2;
        this.health = 6;
    }
}
