package spell;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Spell extends AbstractSpell {

    public Spell(String name, String description, int damage, double accuracy) {
        super(name, description, damage, accuracy);
    }

    public static List<AbstractSpell> createSpellList() {
        List<AbstractSpell> spells = new ArrayList<>();
        spells.add(new Spell("Expelliarmus", "disarms your opponent.", 5, 0.9));
        spells.add(new Spell("Stupefy", "knocks out your opponent.", 10, 0.5));
        // Add more spells as desired
        return spells;

    }
}
