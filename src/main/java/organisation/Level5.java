package organisation;
import character.*;
import spell.*;
public class Level5 extends Level {
    public Level5(Wizard wizard) {
        super("Order of the Phoenix", 5,
                new Boss("Dolores Umbridge", "The Ministry of Magic", 250, 40), wizard);
    }
}