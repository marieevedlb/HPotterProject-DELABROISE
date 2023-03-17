package attribute;
import attribute.Core;
public class Wand {
    private int length;
    private Core core;

    public Wand(int length, Core core) {
        this.length = length;
        this.core = core;
    }

    public int getLength() {
        return length;
    }

    public Core getCore() {
        return core;
    }

    public String getDescription() {
        return String.format("This wand is %d inches long, with a %s core",
                length, core.getCore());
    }
}
