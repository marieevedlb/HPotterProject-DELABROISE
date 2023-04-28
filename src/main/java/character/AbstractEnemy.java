package character;
import lombok.*;

@Getter @Setter
public abstract class AbstractEnemy extends Character {
    private int damage;
    private double accuracy;
    private int number_of_enemies;

    public AbstractEnemy(String name, int maxhealth, int currenthealth, double resistance, int damage, double accuracy, int number_of_enemies) {
        super(name, maxhealth, currenthealth, resistance);
        this.damage = damage;
        this.accuracy = accuracy;
        this.number_of_enemies = number_of_enemies;
    }

    public abstract void attack(Character target);

    public abstract void defend(Character attacker);

    @Override
    public String toString() {
        return "You will have to fight against " + name + " which has a health of " + maxhealth;
    }
}
