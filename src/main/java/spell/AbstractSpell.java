package spell;
import java.util.Random;
import character.Character;
import organisation.*;
import spell.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractSpell {
    private final String name;
    private final int maxDamage;
    // pourcentage que le sort va être jété avec succès
    private final int successRate;

    public void cast(Wizard caster, Character target) {
        if (canCast()) {
            System.out.println("Casting spell " + this.getName() + " on " + target.getName());
            target.takeDamage((int) (getDamage() * caster.getPrecision()));
        }
        else
            System.out.println("Spell " + this.getName() + " failed");
    }

    public int getDamage() {
        Random random = new Random();
        return random.nextInt(this.maxDamage+ 1);
    }

    public boolean canCast() {
        int random = new Random().nextInt(100);
        return random <= this.successRate;
    }
    @Override
    public String toString() {
        return name;
    }

}
