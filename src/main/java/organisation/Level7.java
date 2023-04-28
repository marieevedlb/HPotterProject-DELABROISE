package organisation;
import character.*;
import spell.*;
public class Level7 extends Level{
    public Level7(Wizard wizard) {
        super("Deathly Hallows", 7,
                new Boss("Voldemort", "The Dark Lord", 500, 50), wizard);
    }
}