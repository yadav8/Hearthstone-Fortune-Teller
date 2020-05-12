package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class MechanoEgg extends BaseMinion {
    public static int id = 4009;    // Internal database ID
    public static Tribe tribe = MECH;
    public static int tier = 4;
    public static String Name = "Mechano-Egg";

    public MechanoEgg() {
        this.attack = 0;
        this.health = 5;
    }
}
