package attribute;
import attribute.Core;
import lombok.*;
@Getter
public class Wand {
    private int size;
    private Core core;

    public Wand(int length, Core core) {
        this.size = length;
        this.core = core;
    }

}