package attribute;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoreTest {

    @Test
    void testName() {
        Core phoenixFeather = Core.PHOENIX_FEATHER;
        Core dragonHeartstring = Core.DRAGON_HEARTSTRING;
        Core unicornHair = Core.UNICORN_HAIR;

        assertEquals("Phoenix Feather", phoenixFeather.getName());
        assertEquals("Dragon Heartstring", dragonHeartstring.getName());
        assertEquals("Unicorn Hair", unicornHair.getName());
    }
}
