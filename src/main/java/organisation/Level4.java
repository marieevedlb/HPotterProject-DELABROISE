package organisation;
import character.*;
import spell.*;

import java.util.List;

public class Level4 extends Level{
    public Level4 (Wizard wizard) {
        super(4, "Goblet of Fire", "Graveyard of Little Hangleton",
                List.of(new Boss("Petter Pettigrew", 100, 100, 1, 1, 15, 1)), "You need to approach the Portkey, attract it to you (Accio), and flee.");
    }
}