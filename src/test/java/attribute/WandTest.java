package attribute;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WandTest {

    @Test
    void testWandCreation() {
        int size = 10;
        Core core = Core.PHOENIX_FEATHER;

        Wand wand = new Wand(size, core);

        assertEquals(size, wand.getSize());
        assertEquals(core, wand.getCore());
    }
}
