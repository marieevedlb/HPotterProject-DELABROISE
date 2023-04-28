package organisation;
import character.*;
import organisation.*;
import spell.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;
@Getter @Setter


class Level1 extends Level {
    public Level1() {
        super(1, "The Philosopher’s Stone", "Toilets of the dungeon",
                List.of(new Enemy().getEnemies().get(0)),
                "You have to face the evil Troll who is in the toilet next to the Dungeon. To defeat him\n"
                        + "defeat him, you must lift objects and release them when they are above his head.");
    }
}

