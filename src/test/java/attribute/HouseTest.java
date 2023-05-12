package attribute;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void testName() {
        String houseName = "Gryffindor";
        House house = new House(houseName);

        assertEquals(houseName, house.getName());
    }
}
