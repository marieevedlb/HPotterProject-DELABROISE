package organisation;
import character.*;
import spell.*;
public class Level3 extends Level {
    public Level3 (Wizard wizard) {
        super("Prisoner of Azkaban", 3,
                new Boss("Dementor", "The dark creature", 150, 20), wizard);
    }
}
