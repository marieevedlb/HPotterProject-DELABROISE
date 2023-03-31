package character;
import organisation.*;
import spell.*;
import attribute.*;
import lombok.*;

import java.util.ArrayList;

@Getter @Setter

public class Enemy extends AbstractEnemy {
    public Enemy(String name, int numEnemy, int maxHealth, int currentHealth, int damage, double accuracy) {
    super(name, numEnemy, maxHealth, currentHealth, damage, accuracy);
}

}