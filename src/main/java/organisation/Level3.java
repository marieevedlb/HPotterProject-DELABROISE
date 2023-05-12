package organisation;
import character.*;
import spell.*;

import java.util.List;

public class Level3 extends Level {
    public Level3 (Wizard wizard) {
        super(3, "Prisoner of Azkaban", "Lake in the Forbidden Forest",
                List.of(new Boss("Dementor", 30, 30, 3, 0.6, 1, 5)), "Use your Patronus in order to mke the Dementors away");
    }
}
