package character;
import lombok.*;

@Getter
@Setter

public abstract class Character {
    protected String name;
    protected int maxhealth;
    protected int currenthealth;
    protected double resistance;

    public Character(String name, int maxhealth, int currenthealth, double resistance) {
        this.name = name;
        this.maxhealth = maxhealth;
        this.currenthealth = currenthealth;
        this.resistance = resistance;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currenthealth = currentHealth;
    }

    public void takeDamage(int damage) {
        int healthAfterDamage = this.currenthealth - damage;
        this.currenthealth = Math.max(healthAfterDamage, 0);
    }

    public abstract void attack(Character target);

    public abstract void defend(Character attacker);

}
