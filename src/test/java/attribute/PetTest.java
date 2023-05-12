package attribute;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void testName() {
        Pet owl = Pet.OWL;
        Pet rat = Pet.RAT;
        Pet cat = Pet.CAT;
        Pet toad = Pet.TOAD;

        assertEquals("Owl", owl.getName());
        assertEquals("Rat", rat.getName());
        assertEquals("Cat", cat.getName());
        assertEquals("Toad", toad.getName());
    }
}
