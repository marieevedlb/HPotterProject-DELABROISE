package organisation;
import character.*;
import spell.*;

import java.util.List;

public class Level7 extends Level{
    public Level7(Wizard wizard) {
        super(7, "Deathly Hallows", "Hogwarts",
                List.of(new Boss("Bellatrix Lestrange", 50, 50, 0, 1, 12, 1)),
                "You must incapacitate Voldemort and Bellatrix Lestrange.\n" +
                        "Beware of Avada Kedavra. When in doubt, use Expelliarmus! Be cautious, if Voldemort's wand and your wand share the same core, unpredictable things may happen!");
    }
}