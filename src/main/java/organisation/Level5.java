package organisation;
import character.*;
import spell.*;

import java.util.List;

public class Level5 extends Level {
    public Level5(Wizard wizard) {
        super( 5, "Order of the Phoenix","Exam room of POudlard",
                List.of(new Boss("Dolores Jane Umbridge", 50, 50, 0, 1, 10, 1)), "You must fight her until you obtain fireworks in your inventory; at that moment, let the party begin!");
    }
}