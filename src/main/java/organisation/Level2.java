package organisation;

import organisation.Wizard;
import character.Boss;
import spell.Spell;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Level2 extends Level {
    public Level2(Wizard wizard) {
        super(2, "The Chamber of Secrets","Chamber of Secrets",
                List.of(new Boss("Basilisk", 60, 60, 6, 0.9, 1, 1)),
                "Sword of Gryffindor for the Gryffindors;\n" +
                        "Basilisk's Fang with Accio for the others.");
    }
}
