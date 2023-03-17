package attribute;
import lombok.*;

public class Core {
    public static final String PHOENIX_FEATHER = "Phoenix Feather";
    public static final String DRAGON_HEARTSTRING = "Dragon Heartstring";

    private String core;

    public Core(String core) {
        this.core = core;
    }

    public String getCore() {
        return core;
    }
}
