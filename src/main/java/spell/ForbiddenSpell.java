package spell;
import lombok.*;
@Getter @Setter

public class ForbiddenSpell extends AbstractSpell {
    public ForbiddenSpell(String name, String description, int damage, double accuracy) {
        super(name, description, damage, accuracy);
    }
}

