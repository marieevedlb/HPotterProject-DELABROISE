package spell;
import java.util.Random;
import character.Character;
import organisation.*;
import spell.*;
import lombok.*;
@Getter
@Setter
public abstract class AbstractSpell {
    private String name;
    private String description;
    private int damage;
    private double accuracy;

    public AbstractSpell(String name, String description, int damage, double accuracy) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.accuracy = accuracy;
    }

}

