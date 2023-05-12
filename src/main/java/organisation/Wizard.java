package organisation;
import lombok.*;
import attribute.*;
import spell.*;
import character.Character;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
@Setter @Getter

public class Wizard extends Character {
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;
    private Pet pet;
    private int year;

    public Wizard(String name, Pet pet, Wand wand, House house, List<Spell> knownSpells,
                  int maxhealth, int currenthealth,
                  double resistance, int year) {
        super(name, maxhealth, currenthealth, resistance);
        this.knownSpells = new ArrayList<>();
        this.potions = new ArrayList<>();
        this.wand = wand;
        this.house = house;
        this.year = year;

        Potion potion = new Potion("Precisium", 15);
        List<Potion> availablePotions = Potion.getPotions();
        this.potions.addAll(availablePotions);
    }

    @Override
    public void attack(Character target) {
        // Implementation for attacking
    }

    @Override
    public void defend(Character attacker) {
        // Implementation for defending
    }

    public void learnSpell(Spell spell) {
        knownSpells.add(spell);
    }



}

