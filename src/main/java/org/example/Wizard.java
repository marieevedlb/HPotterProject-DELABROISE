package org.example;

import java.util.List;

public class Wizard {
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(Pet pet, Wand wand) {
        this.pet = pet;
        this.wand = wand;
        this.house = null;
        this.knownSpells = new ArrayList<>();
        this.potions = new ArrayList<>();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public House getHouse() {
        return this.house;
    }

    public void learnSpell(Spell spell) {
        this.knownSpells.add(spell);
    }

    public List<Spell> getKnownSpells() {
        return this.knownSpells;
    }

    public void addPotion(Potion potion) {
        this.potions.add(potion);
    }

    public List<Potion> getPotions() {
        return this.potions;
    }

    public void defend(Enemy enemy) {
       /*   // TODO: Implement the defend() method
        // Example code below:
        System.out.println("You are fighting " + enemy.getName() + "!");
        int successChance = this.wand.getSuccessChance(); // Chance of spell success depends on wand
        boolean spellSuccessful = (Math.random() * 100) < successChance; // Random chance of success
        if (spellSuccessful) {
            Spell randomSpell = this.knownSpells.get((int) (Math.random() * this.knownSpells.size())); // Pick random spell from known spells
            int damage = randomSpell.getDamage(); // Spell damage
            enemy.takeDamage(damage); // Apply damage to enemy
            System.out.println("You cast " + randomSpell.getName() + " and dealt " + damage + " damage to " + enemy.getName() + "!");
        } else {
            System.out.println("Your spell failed and " + enemy.getName() + " attacked you instead!");
            this.takeDamage(enemy.getDamage()); // Apply enemy's damage to wizard
        }
    }

    private void takeDamage(int damage) {
        // TODO: Implement the takeDamage() method
        // Example code below:
        System.out.println("You took " + damage + " damage!");
    }

        */
    }
}