package organisation;
import character.*;
import spell.*;
public class Level4 extends Level{
    public Level4 (Wizard wizard) {
        super("Goblet of Fire", 4,
                new Boss("Peter pettigrew", "The traitor", 200, 25), wizard);
    }
}