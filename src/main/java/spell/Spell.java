package spell;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Spell extends AbstractSpell {
    public Spell(String name, String description, int damage, double accuracy) {
        super(name, description, damage, accuracy);
    }

    private static List<Spell> spells = new ArrayList<>();

    static {
        spells.add(new Spell("Wingardium Leviosa", "lovitation of an object or a person.", 10, 0.7));
        spells.add(new Spell("Accio", "summon broomstick and summon various other objects", 10, 0.9));
        spells.add(new Spell("Expecto Patronum", " the spell takes the form of an animal that is unique to each wizard, reflecting their personality and innermost thoughts", 40, 0.7));
        spells.add(new Spell("GetFireworks", "create light by explosion", 90, 1));
        spells.add(new Spell("Sectumsempra", "cause of  physical harm on the target", 35, 0.7));
        spells.add(new Spell("expelliarmus", "make the wand of the opponent flying", 30, 0.8));
    }

    public static List<Spell> getSpells() {
        return spells;
    }
}
