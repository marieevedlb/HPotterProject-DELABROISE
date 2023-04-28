package spell;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Spell extends AbstractSpell {
    public Spell(String name, int maxDamage, int successRate) {
        super(name, maxDamage, successRate);
    }
}

