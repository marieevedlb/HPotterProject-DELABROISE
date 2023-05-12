package attribute;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Potion {
    private String name;
    private int strength;

    private static List<Potion> potions;

    public Potion(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    static {
        potions = new ArrayList<>();
        potions.add(new Potion("Precisium", 15));
    }

    public static List<Potion> getPotions() {
        return potions;
    }
}
