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
    public abstract void attack(Character target);

    public abstract void defend(Character attacker);

}
