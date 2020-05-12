package minion.tier4;

import minion.BaseMinion;
import minion.identifiers.Tribe;
import static minion.identifiers.Tribe.*;

public class FloatingWatcher extends BaseMinion {
    public static int id = 4006;    // Internal database ID
    public static Tribe tribe = DEMON;
    public static int tier = 4;
    public static String Name = "Floating Watcher";

    public FloatingWatcher() {
        this.attack = 4;
        this.health = 4;
    }
}
