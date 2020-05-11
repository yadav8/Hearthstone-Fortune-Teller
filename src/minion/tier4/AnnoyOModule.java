package minion;

import minion.identifiers.Tribe;
import minion.identifiers.Tier;
import static minion.identifiers.Tier.*;
import static minion.identifiers.Tribe.*;

public class AnnoyOModule extends BaseMinionClass {
    public static Tribe tribe = MECH;
    public static Tier tier = FOUR;
    public static String Name = "Annoy-o-Module";

    public AnnoyOModule() {
        this.attack = 2;
        this.defence = 4;
    }
}
