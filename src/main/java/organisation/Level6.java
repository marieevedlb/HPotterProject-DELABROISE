package organisation;
import character.*;
import spell.*;
public class Level6 extends Level{
    public Level6(Wizard wizard) {
        super("Half Blood Prince", 6,
                new Boss("Death Eater", "The dark Wizard", 300, 30), wizard);
    }
}