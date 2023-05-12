package organisation;
import character.Character;
import character.AbstractEnemy;
import character.Enemy;
import character.Boss;
import spell.*;

import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Level {
    private int id;
    private String name;
    private String place;
    private List<AbstractEnemy> enemies;
    private String description;

    public Level(int id, String name, String place, List<AbstractEnemy> enemies, String description) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.enemies = enemies;
        this.description = description;
    }

    public int getNumberOfEnemies() {
        return enemies.size();
    }

    public void run(Wizard wizard) {
        System.out.println("This is level number: " + id);
        System.out.println("It is " + name + ", " + description);
        System.out.println("and it takes place in: " + place);

        int numberOfEnemies = getNumberOfEnemies();
        if (numberOfEnemies == 1) {
            System.out.println("There is " + numberOfEnemies + " enemy");
        } else {
            System.out.println("There are " + numberOfEnemies + " enemies");
        }


        wizard.setYear(wizard.getYear() + 1);
    }
}
