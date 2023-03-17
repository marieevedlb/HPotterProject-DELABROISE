package org.example;
import lombok.*;
import attribute.House;
import attribute.Pet;
import attribute.Wand;
import attribute.Potion;
import lombok.Getter;

public class Wizard {
    private Pet pet;
    private Wand wand;
    private House house;

    public Wizard(Pet pet, Wand wand, House house) {
        this.pet = pet;
        this.wand = wand;
        this.house = house;
    }

    public Pet getPet() {
        return pet;
    }

    public Wand getWand() {
        return wand;
    }

    public House getHouse() {
        return house;
    }
}


//ajouter potions et spells
//ajouter système de défense ?