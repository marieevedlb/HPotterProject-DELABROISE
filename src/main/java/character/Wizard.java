package character;
import lombok.*;
import attribute.House;
import attribute.Pet;
import attribute.Wand;

@Setter @Getter
public class Wizard {
    private String name;
    private Pet pet;
    private Wand wand;
    private House house;

    public Wizard(String name, Pet pet, Wand wand, House house) {
        this.name = name;
        this.pet = pet;
        this.wand = wand;
        this.house = house;
    }


}


//ajouter potions et spells
//ajouter système de défense ?