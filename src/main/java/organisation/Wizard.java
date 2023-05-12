package organisation;

import lombok.*;
import attribute.*;
import spell.*;
import character.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Setter
@Getter
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

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public void learnSpell(Spell spell) {
        knownSpells.add(spell);
    }

    // Générer un index aléatoire pour choisir un sort de la liste
    public Spell chooseSpell() {
        List<Spell> availableSpells = Spell.getSpells();
        Random random = new Random();
        int index = random.nextInt(availableSpells.size());
        return availableSpells.get(index);
    }

    @Override
    public void attack(Character target) {
        Spell spell = chooseSpell();
        if (spell != null) {
            System.out.println("You cast " + spell.getName());
            if (rollAccuracy(spell.getAccuracy())) {
                int damage = spell.getDamage();
                if (this.getHouse().getName().equals("Slytherin")) {
                    damage += 5;
                }
                target.takeDamage(damage);
                System.out.println("You did " + damage + " damage to the enemy! It has ");
            } else {
                System.out.println("Your spell missed the enemy!");
            }
        } else {
            System.out.println("You don't have any available spells to cast!");
        }
    }
    private boolean rollAccuracy(double accuracy) {
        Random random = new Random();
        double roll = random.nextDouble();
        return roll <= accuracy;
    }

    @Override
    public void defend(Character attacker) {
    }
}
