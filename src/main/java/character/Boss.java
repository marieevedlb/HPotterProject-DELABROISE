package character;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Boss extends AbstractEnemy {
    private List<AbstractEnemy> boss;

    public Boss() {
        super("Voldemort", 100, 100, 15, 100, 1, 1);
        boss = new ArrayList<>();
        boss.add(new Boss("Petter Pettigrew", 100, 100, 1, 1, 15, 1));
        boss.add(new Boss("Lord Voldemort", 100, 100, 1, 1, 15, 1));
        boss.add(new Boss("Dolores Jane Umbridge", 50, 50, 0, 1, 10, 1));
        boss.add(new Boss("Bellatrix Lestrange", 50, 50, 0, 1, 12, 1));
    }

    public Boss(String name, int maxHealth, int currentHealth, int damage, double accuracy, int resistance, int numberOfEnemies) {
        super(name, maxHealth, currentHealth, resistance, damage, accuracy, numberOfEnemies);
    }

    @Override
    public void attack(Character target) {

    }

    @Override
    public void defend(Character attacker) {

    }
}
