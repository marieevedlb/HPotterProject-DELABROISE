package attribute;

import organisation.Wizard;
import attribute.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SortingHatTest {

    private SortingHat sortingHat;
    private List<House> houses;
    private Wizard wizard;

    @BeforeEach
    void setUp() {
        sortingHat = new SortingHat();

        houses = new ArrayList<>();
        houses.add(new House("Gryffondor"));
        houses.add(new House("Hufflepuff"));
        houses.add(new House("Ravenclaw"));
        houses.add(new House("Slytherin"));

        String name = "Harry Potter";
        Pet pet = Pet.OWL;
        int size = 12; // Exemple de taille pour la baguette
        Core core = Core.PHOENIX_FEATHER; // Exemple de matériau du noyau pour la baguette

        wizard = new Wizard(name, pet, new Wand(size, core), null,
                new ArrayList<>(), 100, 100, 0.2, 1);
    }


}
