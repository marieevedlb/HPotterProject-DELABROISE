package organisation;
import character.*;
import spell.*;

import java.util.List;

public class Level6 extends Level{
    public Level6(Wizard wizard) {
        super(6, "Half Blood Prince", "Astronmy Tower",
                List.of(new Enemy("Death Eaters", 20, 20, 3, 0.8, 1, 10)), "You must eliminate the Death Eaters who have attempted to invade Hogwarts.\n" +
                        "Sectumsempra! If you are a member of Slytherin, you can choose to ally yourself with the Death Eaters.");
    }
}