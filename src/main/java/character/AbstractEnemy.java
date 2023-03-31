package character;
import organisation.*;
import spell.*;
import attribute.*;
import lombok.*;
@Getter @Setter

public class AbstractEnemy {/*
    public AbstractEnemy(String name, int numEnemy, int maxHealth, int currentHealth, int damage, double accuracy) {
        this.name = name;
        this.numEnemy = numEnemy;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public boolean isDefeated() {
        return currentHealth <= 0;
    }

    public void takeDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public int attack() {
        double roll = Math.random();
        if (roll < accuracy) {
            return damage;
        } else {
            return 0;
        }
    }
*/
}

